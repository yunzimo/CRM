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
<title>编辑功能信息</title>
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
    当前位置:项目管理>>编辑功能信息
 </td>
 </tr>
</table>
</td>
</tr>
</table>

<form name="form2" id="form2" action="${path}/fun/editFunction">

<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
<tr bgcolor="#E7E7E7">
	<td height="24" colspan="2" background="${path}/skin/images/tbg.gif">&nbsp;编辑功能&nbsp;</td>
</tr>
	<tr >
		<td align="right" bgcolor="#FAFAF1" height="22">选择项目：</td>
		<td  align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
			<select id="project" onchange="change()">

			</select>
			<input type="hidden" id="id" name="id">
		</td>
	</tr>
	<tr >
		<td align="right" bgcolor="#FAFAF1" height="22">选择需求：</td>
		<td  align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
			<%--		<select id="">--%>
			<%--			<option value=1>帐户管理需求分析</option>--%>
			<%--		</select>--%>
			<input type="text" readonly="readonly" id="analysis">
		</td>
	</tr>
	<tr >
		<td align="right" bgcolor="#FAFAF1" height="22">选择模块：</td>
		<td  align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
			<select name="modeleFk" id="module">

			</select>
		</td>
	</tr>
	<tr >
		<td align="right" bgcolor="#FAFAF1" height="22">功能名称：</td>
		<td  align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
			<input name="functionname" id="functionname"/></td>
	</tr>
	<tr >
		<td align="right" bgcolor="#FAFAF1" height="22">优先级：</td>
		<td  align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
			<select name="level" id="level">
				<option value="高">高</option>
				<option value="中">中</option>
				<option value="低">低</option>
				<option value="暂缓">暂缓</option>
			</select>
		</td>
	</tr>
	<tr >
		<td align="right" bgcolor="#FAFAF1" height="22">简单描述：</td>
		<td align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
			<textarea name="simpledis" id="simpledis" rows=10 cols=130></textarea></td>
	</tr>
	<tr >
		<td align="right" bgcolor="#FAFAF1" height="22">详细描述：</td>
		<td align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
			<textarea name="detaileddis" id="detaileddis"  rows=15 cols=130></textarea></td>
	</tr>

	<tr >
		<td align="right" bgcolor="#FAFAF1" >备注：</td>
		<td colspan=3 align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" >
			<textarea name="remark" id="remark" rows=10 cols=130></textarea>
		</td>
	</tr>


<tr bgcolor="#FAFAF1">
<td height="28" colspan=4 align=center>
	&nbsp;
	<a href="javascript:checkName()" class="coolbg">保存</a>
	<a href="project-function.jsp" class="coolbg">返回</a>
</td>
</tr>
</table>

</form>
  

</body>
</html>

<script type="text/javascript">
	$(function () {
		$.ajax({
			url:'${path}/fun/QueryById',
			data:{'id':${param.id}},
			dataType:'json',
			type:'post',
			success:function (rs) {
				var pro_option="<option value=\""+rs.module.analysis.project.pid+"\" selected=\"selected\" >"+rs.module.analysis.project.pname+"</option>";
				$("#analysis").val(rs.module.analysis.title);
				var mod_option="<option value=\" "+rs.module.id+" \" selected=\"selected\" >"+rs.module.modname+"</option>";
				//alert(${param.id});
				console.log("pid===="+rs.module.analysis.project.pid);
				$("#id").val(${param.id});
				$("#project").append(pro_option);
				$("#module").append(mod_option);
				$("#functionname").val(rs.functionname);
				$("#simpledis").val(rs.simpledis);
				$("#detaileddis").val(rs.detaileddis);
				$("#remark").val(rs.remark);
				var level_opt="<option value=\""+rs.level+"\" selected=\"selected\" >"+rs.level+"</option>";
				$("#level").append(level_opt);

			}
		})

	})

	var modularr=[];
	var arr=[];
	$(function () {
		$.ajax({
			url:'${path}/pro/showProWithModule',
			type:'post',
			dataType:'json',
			success:function (rs) {
				$(rs).each(function (index,item) {
					arr[item.pid]=item.analysis.title;
					modularr[item.pid]=item.modules;
					var pro_option="<option value="+item.pid+">"+item.pname+"</option>";
					$("#project").append(pro_option);
				})
			}
		})

	})
	function change() {

		var pid=$("#project").val();
		console.log("获得的pid"+pid);
		$("#analysis").val(arr[pid]);

		$("#module").html("");
		$(modularr[pid]).each(function (index,item) {
			var option="<option value="+item.id+">"+item.modname+"</option>";
			$("#module").append(option);
		})
	}

	function checkName() {
		$.ajax({
			url:'${path}/fun/checkName',
			type:'post',
			data:{"functionname":$("#functionname").val(),"modeleFk":$("#module").val()},
			dataType:'text',
			success:function (flag) {
				//alert(flag);
				if(flag==true){
					alert("功能名称重复");
				}else{
					$("#form2").submit();
					//alert("功能名可添加");
				}
			}
		})
	}


</script>