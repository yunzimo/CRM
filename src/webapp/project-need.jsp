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
<title>需求分析管理</title>
<link rel="stylesheet" type="text/css" href="${path}/skin/css/base.css">
    <script type="text/javascript" src="${path}/js/jquery-2.1.1.min.js"></script>
</head>
<body leftmargin="8" topmargin="8" background='${path}/skin/images/allbg.gif'>

<!--  快速转换位置按钮  -->
<table width="98%" border="0" cellpadding="0" cellspacing="1" bgcolor="#D1DDAA" align="center">
<tr>
 <td height="26" background="${path}/skin/images/newlinebg3.gif">
  <table width="58%" border="0" cellspacing="0" cellpadding="0">
  <tr>
  <td >
    当前位置:项目管理>>需求分析管理
 </td>
  <td>
    <input type='button' class="coolbg np" onClick="location='project-need-add.jsp';" value='添加新项目需求' />
 </td>
 </tr>
</table>
</td>
</tr>
</table>

<!--  搜索表单  -->
<form name='form3' id="form3" action='${path}/ana/showAllInfo' method='post'>
<input type='hidden' name='dopost' value='' />
<table width='98%'  border='0' cellpadding='1' cellspacing='1' bgcolor='#CBD8AC' align="center" style="margin-top:8px">
  <tr bgcolor='#EEF4EA'>
    <td background='${path}/skin/images/wbg.gif' align='center'>
      <table border='0' cellpadding='0' cellspacing='0'>
        <tr>
          <td width='90' align='center'>搜索条件：</td>
          <td width='160'>
          <select name='cid' style='width:150'>
          <option value='0'>选择类型...</option>
          	<option value='1' <c:if test="${key.cid==1}">selected="selected"</c:if> >项目名称</option>
          	<option value='2' <c:if test="${key.cid==2}">selected="selected"</c:if>>标题</option>
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
            <option value=''>排序...</option>
            <option value='addtime' <c:if test="${key.orderby=='addtime'}">selected="selected"</c:if> >添加时间</option>
            <option value='updatetime' <c:if test="${key.orderby=='updatetime'}">selected="selected"</c:if> >修改时间</option>
      	</select>
        </td>
        <td>
<%--          &nbsp;&nbsp;&nbsp;<input name="imageField" type="image" src="${path}/skin/images/frame/search.gif" width="45" height="20" border="0" class="np" />--%>
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
	<td height="24" colspan="12" background="${path}/skin/images/tbg.gif">&nbsp;需求列表&nbsp;</td>
</tr>
<tr align="center" bgcolor="#FAFAF1" height="22">
	<td width="4%">选择</td>
	<td width="6%">序号</td>
	<td width="10%">标题</td>
	<td width="10%">项目名称</td>
	<td width="8%">添加时间</td>
	<td width="8%">修改时间</td>
	<td width="10%">操作</td>
</tr>
    <c:forEach items="${pageInfo.list}" var="an">
        <tr align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22" >
            <td><input name="id" type="checkbox" id="id" value="101" class="np"></td>
            <td>${an.id}</td>
            <td>${an.title}</td>
            <td align="center"><a href=''><u>${an.project.pname}</u></a></td>
            <td><fmt:formatDate value="${an.addtime}" pattern="yyyy-MM-dd"/> </td>
            <td><fmt:formatDate value="${an.updatetime}" pattern="yyyy-MM-dd"/></td>
            <td><a href='${path}/ana/analysisEdit?id=${an.id}'>编辑</a> | <a href="project-need-look.jsp">查看详情</a></td>
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
        <!--翻页代码 -->
        <span>共有${pageInfo.pages}页&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;当前是第${pageInfo.pageNum}页</span>
        <a href='${path}/ana/showAllInfo?cid=${key.cid}&keyword=${key.keyword}&orderby=${key.orderby}&pageNum=1'>首页</a>
        <a href='${path}/ana/showAllInfo?cid=${key.cid}&keyword=${key.keyword}&orderby=${key.orderby}&pageNum=${pageInfo.prePage}'>上一页</a>
        <a href='${path}/ana/showAllInfo?cid=${key.cid}&keyword=${key.keyword}&orderby=${key.orderby}&pageNum=${pageInfo.nextPage}'>下一页</a>
        <a href='${path}/ana/showAllInfo?cid=${key.cid}&keyword=${key.keyword}&orderby=${key.orderby}&pageNum=${pageInfo.pages}'>尾页</a>

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
    })
</script>