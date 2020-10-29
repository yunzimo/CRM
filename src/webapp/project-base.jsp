<%@ page language="java"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
    String path=request.getScheme()+"://"+request.getServerName()+":"+
            request.getServerPort()+request.getContextPath()+"/";
    pageContext.setAttribute("path", path);
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>项目信息管理</title>
<link rel="stylesheet" type="text/css" href="${path}/skin/css/base.css">
    <script type="text/javascript" src="${path}/js/jquery-2.1.1.min.js">

    </script>
</head>
<body leftmargin="8" topmargin="8" background='${path}/skin/images/allbg.gif'>

<!--  快速转换位置按钮  -->
<table width="98%" border="0" cellpadding="0" cellspacing="1" bgcolor="#D1DDAA" align="center">
<tr>
 <td height="26" background="${path}/skin/images/newlinebg3.gif">
  <table width="58%" border="0" cellspacing="0" cellpadding="0">
  <tr>
  <td >
    当前位置:项目管理>>基本信息管理
 </td>
  <td>
    <input type='button' class="coolbg np" onClick="location='${path}/project-base-add.jsp';" value='添加新项目' />
 </td>
 </tr>
</table>
</td>
</tr>
</table>

<!--  搜索表单  -->
<form name='form3' id="form3" action="${path}/pro/showAllInfo" method='post'>
<input type='hidden' name='dopost' value='' />
<table width='98%'  border='0' cellpadding='1' cellspacing='1' bgcolor='#CBD8AC' align="center" style="margin-top:8px">
  <tr bgcolor='#EEF4EA'>
    <td background='skin/images/wbg.gif' align='center'>
      <table border='0' cellpadding='0' cellspacing='0'>
        <tr>
          <td width='90' align='center'>搜索条件：</td>
          <td width='160'>
          <select name='cid' style='width:150'>
          <option value='0'>选择类型...</option>
          	<option value='1' <c:if test="${key.cid==1}">selected="selected"</c:if>>项目名称</option>
          	<option value='2' <c:if test="${key.cid==2}">selected="selected"</c:if>>项目经理</option>
          </select>
        </td>
        <td width='70'>
          关键字：
        </td>
        <td width='160'>
          	<input type='text' name='keyword' id="keyword" value='${key.keyword}' style='width:120px' />
        </td>
        <td width='110'>
    		<select name='orderby' style='width:120px'>
            <option value='id'>排序...</option>
                <option value='starttime' <c:if test="${key.orderby=='starttime'}">selected="selected"</c:if>>立项时间</option>
            <option value='endtime' <c:if test="${key.orderby=='endtime'}">selected="selected"</c:if>>计划完成时间</option>
      	</select>
        </td>
        <td>
<%--          &nbsp;&nbsp;&nbsp;<input name="imageField" type="image" src="skin/images/frame/search.gif" width="45" height="20" border="0" class="np" />--%>
            <button type="button" value="search" id="sub">search</button>
            <button type="button" id="reset">clear</button>
        </td>
       </tr>
      </table>
    </td>
  </tr>
</table>
</form>
<!--  内容列表   -->
<form name="form2">

<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
<tr bgcolor="#E7E7E7">
	<td height="24" colspan="12" background="skin/images/tbg.gif">&nbsp;项目信息列表&nbsp;</td>
</tr>
<tr align="center" bgcolor="#FAFAF1" height="22">
	<td width="4%">选择</td>
	<td width="6%">序号</td>
	<td width="10%">项目名称</td>
	<td width="10%">客户公司名称</td>
	<td width="10%">客户方负责人</td>
	<td width="5%">项目经理</td>
	<td width="8%">开发人员数</td>
	<td width="6%">立项时间</td>
	<td width="8%">最近更新时间</td>
	<td width="8%">计划完成时间</td>
	<td width="8%">状态</td>
	<td width="10%">操作</td>
</tr>


    <c:forEach items="${pageInfo.list}" var="pro">
        <tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22" >
            <td><input name="id" type="checkbox" id="id" value="101" class="np"></td>
            <td>${pro.pid}</td>
            <td align="left"><a href=''><u>${pro.pname}</u></a></td>
            <td>${pro.customer.comname}</td>
            <td>${pro.customer.companyperson}</td>
            <td>${pro.employee.ename}</td>
            <td>${pro.empcount}</td>
            <td><fmt:formatDate value="${pro.starttime}" pattern="yyyy-MM-dd"/></td>
            <td><fmt:formatDate value="${pro.buildtime}" pattern="yyyy-MM-dd"/></td>
            <td><fmt:formatDate value="${pro.endtime}" pattern="yyyy-MM-dd"/></td>
            <td>
                <c:if test="${pro.level==1}">紧急</c:if>
                <c:if test="${pro.level==2}">一般</c:if>
                <c:if test="${pro.level==3}">暂缓</c:if>
            </td>
            <td><a href='${path}/pro/proEdit?pid=${pro.pid}'>编辑</a> | <a href='${path}/pro/QueryById?pid=${pro.pid}'>查看详情</a></td>
        </tr>
    </c:forEach>





<tr bgcolor="#FAFAF1">
<td height="28" colspan="12">
	&nbsp;
	<a href="" class="coolbg">全选</a>
	<a href="" class="coolbg">反选</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="" class="coolbg">&nbsp;删除&nbsp;</a>
	<a href="" class="coolbg">&nbsp;导出Excel&nbsp;</a>
</td>
</tr>
<tr align="right" bgcolor="#EEF4EA">
	<td height="36" colspan="12" align="center">

        <span>共有${pageInfo.pages}页&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;当前是第${pageInfo.pageNum}页</span>
        <a href='${path}/pro/showAllInfo?cid=${key.cid}&keyword=${key.keyword}&orderby=${key.orderby}&pageNum=1'>首页</a>
        <a href='${path}/pro/showAllInfo?cid=${key.cid}&keyword=${key.keyword}&orderby=${key.orderby}&pageNum=${pageInfo.prePage}'>上一页</a>
        <a href='${path}/pro/showAllInfo?cid=${key.cid}&keyword=${key.keyword}&orderby=${key.orderby}&pageNum=${pageInfo.nextPage}'>下一页</a>
        <a href='${path}/pro/showAllInfo?cid=${key.cid}&keyword=${key.keyword}&orderby=${key.orderby}&pageNum=${pageInfo.pages}'>尾页</a>

    </td>
</tr>
</table>

</form>
  

</body>
</html>

<script type="text/javascript">
    $(function () {
        $("#sub").click(function () {
            $("#form3").submit();
        });

        $("#reset").click(function () {
            $("option").removeAttr('selected');
            $("#keyword").val("");
        })

        //alert(${key.cid});
        var orderby="${key.orderby}";
        //alert(orderby);
    })
</script>