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
<title>客户信息管理</title>
<link rel="stylesheet" type="text/css" href="skin/css/base.css">
    <script type="text/javascript" src="js/jquery-2.1.1.min.js">

    </script>
</head>
<body leftmargin="8" topmargin="8" background='skin/images/allbg.gif'>

<!--  快速转换位置按钮  -->
<table width="98%" border="0" cellpadding="0" cellspacing="1" bgcolor="#D1DDAA" align="center">
<tr>
 <td height="26" background="skin/images/newlinebg3.gif">
  <table width="58%" border="0" cellspacing="0" cellpadding="0">
  <tr>
  <td >
    当前位置:客户信息管理>>客户信息
 </td>
  <td>
    <input type='button' class="coolbg np" onClick="location='customer-add.jsp';" value='添加客户信息' />
 </td>
 </tr>
</table>
</td>
</tr>
</table>

<!--  搜索表单  -->
<form name='form3' id="form3" action='QueryByKey' method='get'>
<input type='hidden' name='dopost' value='' />
<table width='98%'  border='0' cellpadding='1' cellspacing='1' bgcolor='#CBD8AC' align="center" style="margin-top:8px">
  <tr bgcolor='#EEF4EA'>
    <td background='skin/images/wbg.gif' align='center'>
      <table border='0' cellpadding='0' cellspacing='0'>
        <tr>
          <td width='90' align='center'>搜索条件：</td>
          <td width='160'>
          <select name='cid' id="cid" style='width:150'>
              <c:set var="cid" value="${key.cid}"/>
          <option value='0' >选择类型...</option>
              <option value='comname' <c:if test="${cid=='comname'}">selected="selected" </c:if> >客户所在公司名称</option>
          	<option value='companyperson' <c:if test="${cid=='companyperson'}">selected="selected" </c:if>>联系人姓名</option>
          </select>
        </td>
        <td width='70'>
          关键字：
        </td>
        <td width='160'>
          	<input type='text' id="keyword" name='keyword' value='${key.keyword}' style='width:120px' />
        </td>
        <td width='110'>
    		<select name='orderby' id="orderby" style='width:120px'>
                <c:set var="orderby" value="${key.orderby}"/>
            <option value='0'>排序...</option>
                <option value='id'<c:if test="${orderby=='id'}">selected="selected"</c:if> >编号</option>
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
	<td height="24" colspan="12" background="skin/images/tbg.gif">&nbsp;需求列表&nbsp;</td>
</tr>
<tr align="center" bgcolor="#FAFAF1" height="22" id="tablehead">
	<td width="4%">选择</td>
	<td width="6%">序号</td>
	<td width="10%">联系人</td>
	<td width="10%">公司名称</td>
	<td width="8%">添加时间</td>
	<td width="8%">联系电话</td>
	<td width="10%">操作</td>
</tr>


<c:forEach items="${pageInfo.list}" var="item">
    <tr  align='center' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22" >
        <td><input name="id" type="checkbox" id="id" value="101" class="np"></td>
        <td>${item.id}</td>
        <td>${item.companyperson}</td>
        <td align="center">${item.comname}</td>
        <td><fmt:formatDate value="${item.addtime}"/></td>
        <td>${item.comphone}</td>
        <td><a href='customerEdit?id=${item.id}'>编辑</a> | <a href='customerLook?id=${item.id}'>查看详情</a></td>
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
        <a href='${path}/QueryByKey?cid=${key.cid}&keyword=${key.keyword}&orderby=${key.orderby}&pageNum=1'>首页</a>
        <a href='${path}/QueryByKey?cid=${key.cid}&keyword=${key.keyword}&orderby=${key.orderby}&pageNum=${pageInfo.prePage}'>上一页</a>
        <a href='${path}/QueryByKey?cid=${key.cid}&keyword=${key.keyword}&orderby=${key.orderby}&pageNum=${pageInfo.nextPage}'>下一页</a>
        <a href='${path}/QueryByKey?cid=${key.cid}&keyword=${key.keyword}&orderby=${key.orderby}&pageNum=${pageInfo.pages}'>尾页</a>
    </td>
</tr>
</table>

</form>
  

</body>

</html>

<script type="text/javascript">

    $("#sub").click(function () {
        $("#form3").submit();
    });

    $("#reset").click(function () {
        $("option").removeAttr('selected');
       $("#keyword").val("");
    })
    // $(function () {
    //     Date.prototype.format = function(fmt) {
    //         var o = {
    //             "M+" : this.getMonth() + 1, //月份
    //             "d+" : this.getDate(), //日
    //             "h+" : this.getHours(), //小时
    //             "m+" : this.getMinutes(), //分
    //             "s+" : this.getSeconds(), //秒
    //             "q+" : Math.floor((this.getMonth() + 3) / 3), //季度
    //             "S" : this.getMilliseconds()
    //             //毫秒
    //         };
    //         if (/(y+)/.test(fmt))
    //             fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "")
    //                 .substr(4 - RegExp.$1.length));
    //         for ( var k in o)
    //             if (new RegExp("(" + k + ")").test(fmt))
    //                 fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k])
    //                     : (("00" + o[k]).substr(("" + o[k]).length)));
    //         return fmt;
    //     };
    //
    //     $.ajax({
    //         url:'showAllCustomers',
    //         method:'post',
    //         dataType:"json",
    //         success:function (rs) {
    //             $(rs).each(function (index,item) {
    //                 var addtime=new Date(item.addtime).format("yyyy-MM-dd");
    //                 var tr="<tr align='center' bgcolor=\"#FFFFFF\" onMouseMove=\"javascript:this.bgColor='#FCFDEE';\" onMouseOut=\"javascript:this.bgColor='#FFFFFF';\" height=\"22\" >\n" +
    //                     "\t<td><input name=\"id\" type=\"checkbox\" id=\"id\" value=\"101\" class=\"np\"></td>\n" +
    //                     "\t<td>"+item.id+"</td>\n" +
    //                     "\t<td>"+item.companyperson+"</td>\n" +
    //                     "\t<td align=\"center\">"+item.comname+"</td>\n" +
    //                     "\t<td>"+addtime+"</td>\n" +
    //                     "\t<td>"+item.comphone+"</td>\n" +
    //                     "\t<td><a href=\"customerEdit?id="+item.id+"\">编辑</a> | <a href=\"customerLook?id="+item.id+"\">查看详情</a></td>\n" +
    //                     "</tr>";
    //
    //                 $("#tablehead").after(tr);
    //             })
    //         }
    //     })
    // })
</script>