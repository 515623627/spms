<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>商品概览</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link href="${pageContext.request.contextPath }/css/style.css"
	rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery.js"></script>
</head>

<body>
	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#">首页</a></li>
			<li>新增商品</li>
		</ul>
	</div>

	<div class="formbody">

		<div class="formtitle">
			<span>添加商品</span>
		</div>

		<!-- 
		<table>
			<tr>
				<td><label>商品编号</label><input name="" type="text"
				class="dfinput" /></td>
				<td><label>商品名称</label><input name="" type="text" class="dfinput" /></td>
			</tr>
			<tr>
				<td><label>商品编号</label><input name="" type="text"
				class="dfinput" /></td>
				<td><label>商品名称</label><input name="" type="text" class="dfinput" /></td>
			</tr>
		</table>
		 -->
		<form action="${pageContext.request.contextPath }/pages/backend/goods/save.do" method="post">
		<ul class="forminfo">
			<li><label>商品编号</label><input name="goodsId" type="text"
				class="dfinput" value="A00001"/><i>编号不能超过100个字符</i></li>
			<li><label>商品名称</label><input name="goodsName" type="text" class="dfinput" value="冰红茶"/><i></i></li>
			<li><label>商品条码</label><input name="goodsCode" type="text" class="dfinput" value="2asdfsaf324"/><i>多个关键字用,隔开</i></li>
			<li><label>商品类别</label><input name="goodsType" type="text" class="dfinput" value="饮料"/><i>多个关键字用,隔开</i></li>
			<li><label>商品进价</label><input name="purchasePrice" type="text" class="dfinput" value="3"/><i>多个关键字用,隔开</i></li>
			<li><label>商品售价</label><input name="sellPrice" type="text" class="dfinput" value="4"/><i>多个关键字用,隔开</i></li>
			<li><label>商品等级</label><input name="goodsLevel" type="text" class="dfinput" value="2"/><i>多个关键字用,隔开</i></li>
			<li><label>会员价格</label><input name="vipPrice" type="text" class="dfinput" value="3"/><i>多个关键字用,隔开</i></li>
			<li><label>采购数量</label><input name="purchaseAmount" type="text" class="dfinput" value="100"/><i>多个关键字用,隔开</i></li>
			<li><label>告警数量</label><input name="alarmAmount" type="text" class="dfinput" value="10"/><i>多个关键字用,隔开</i></li>
			<li><label>生产厂商</label><input name="manufacture" type="text" class="dfinput" value=""/><i>多个关键字用,隔开</i></li>
			<li><label>供应商号</label><input name="supplierId" type="text" class="dfinput" value="供应商001"/><i>多个关键字用,隔开</i></li>
			<!-- 
			<li><label>是否审核</label><cite><input name="" type="radio"
					value="" checked="checked" />是&nbsp;&nbsp;&nbsp;&nbsp;<input
					name="" type="radio" value="" />否</cite></li>
			<li><label>引用地址</label><input name="" type="text"
				class="dfinput" value="http://www.mycodes.net" /></li>
			 -->
			<li><label>商品备注</label>
			<textarea name="remarks" cols="" rows="" class="textinput"></textarea></li>
			<li>
				<label>&nbsp;</label>
			</li>
		</ul>
		<input type="submit" class="btn" value="确认保存">
		</form>
	</div>
</body>
</html>
