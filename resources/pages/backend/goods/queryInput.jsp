<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	
	<script type="text/javascript">
		function add(){
			window.location.href="${pageContext.request.contextPath }/pages/backend/goods/add.jsp";
		}
	
	</script>
</head>

<body>
	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#">首页</a></li>
			<li>查询商品</li>
		</ul>
	</div>

	<div class="formbody">

		<div class="formtitle">
			<span>查询商品</span>
		</div>

		<form action="${pageContext.request.contextPath }/pages/backend/goods/getAllgoodsByPageWithCriteria.do?currentPage=1" method="post">
		<ul class="forminfo">
			<li><label>商品编号</label><input name="goodsId" type="text"
				class="dfinput" value="A00001"/></li>
			<li><label>商品名称</label><input name="goodsName" type="text" class="dfinput" value=""/></li>
			<li><label>商品条码</label><input name="goodsCode" type="text" class="dfinput" value=""/></li>
			<li><label>商品类别</label><input name="goodsType" type="text" class="dfinput" value=""/></li>
			<li><label>商品进价</label><input name="purchasePrice" type="text" class="dfinput" value=""/></li>
			<li><label>商品售价</label><input name="sellPrice" type="text" class="dfinput" value=""/></li>
			<li><label>商品等级</label><input name="goodsLevel" type="text" class="dfinput" value=""/></li>
			<li><label>会员价格</label><input name="vipPrice" type="text" class="dfinput" value=""/></li>
			<li><label>采购数量</label><input name="purchaseAmount" type="text" class="dfinput" value=""/></li>
			<li><label>告警数量</label><input name="alarmAmount" type="text" class="dfinput" value=""/></li>
			<li><label>生产厂商</label><input name="manufacture" type="text" class="dfinput" value=""/></li>
			<li><label>供应商号</label><input name="supplierId" type="text" class="dfinput" value=""/></li>
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
		<input type="submit" class="btn" value="查询">
		</form>
	</div>

</body>
</html>
