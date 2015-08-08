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

<title>商品详情</title>
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
			<li>商品详情</li>
		</ul>
	</div>

	<div class="formbody">

		<div class="formtitle">
			<span>商品详情</span>
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
		<ul class="forminfo">
			<li><label>商品编号</label><label>${goods.goodsId }</label></li>
			<li><label>商品名称</label><label>${goods.goodsName }</label></li>
			<li><label>商品条码</label><label>${goods.goodsCode}</label></li>
			<li><label>商品类别</label><label>${goods.goodsType}</label></li>
			<li><label>商品进价</label><label>${goods.purchasePrice}</label></li>
			<li><label>商品售价</label><label>${goods.sellPrice}</label></li>
			<li><label>商品等级</label><label>${goods.goodsLevel}</label></li>
			<li><label>会员价格</label><label>${goods.vipPrice}</label></li>
			<li><label>采购数量</label><label>${goods.purchaseAmount}</label></li>
			<li><label>告警数量</label><label>${goods.alarmAmount}</label></li>
			<li><label>生产厂商</label><label>${goods.manufacturer}</label></li>
			<li><label>供应商号</label><label>${goods.supplierId}</label></li>
			<!-- 
			<li><label>是否审核</label><cite><input name="" type="radio"
					value="" checked="checked" />是&nbsp;&nbsp;&nbsp;&nbsp;<input
					name="" type="radio" value="" />否</cite></li>
			<li><label>引用地址</label><input name="" type="text"
				class="dfinput" value="http://www.mycodes.net" /></li>
			 -->
			<li><label>商品备注</label><label>
			${goods.remarks }</label></li>
		</ul>
		<input type="button" class="btn" value="返回" onclick="history.go(-1)">
	</div>
</body>
</html>
