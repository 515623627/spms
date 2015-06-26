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

<title>left</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="${pageContext.request.contextPath }/js/jquery.js"></script>

<script type="text/javascript">
	$(function() {
		//导航切换
		$(".menuson li").click(function() {
			$(".menuson li.active").removeClass("active")
			$(this).addClass("active");
		});

		$('.title').click(function() {
			$('dd').find('ul').slideUp();
			var $ul = $(this).next('ul');
			if ($ul.is(':visible')) {
				$(this).next('ul').slideUp();
			} else {
				$(this).next('ul').slideDown();
			}
		});
		
		/*
		$('.subson').click(function() {
			$('li').find('ul').slideUp();
			var $ul = $(this).find('ul');
			if ($ul.is(':visible')) {
				$ul.slideUp();
			} else {
				$ul.slideDown();
			}
		});
		*/
	})
</script>
</head>

<body style="background:#f0f9fd;">

	<div class="lefttop">
		<span></span>通讯录
	</div>

	<dl class="leftmenu">
		
		<!-- 
		<dd>
			<div class="title">
				<span><img src="images/leftico01.png" /></span>档案管理
			</div>
			<ul class="menuson">
				<li class = "subson"><cite></cite>商品管理<i></i>
					<ul>
						<li><cite></cite><a href="#">添加商品</a><i></i></li>
						<li><cite></cite><a href="#">查询商品</a><i></i></li>
					</ul>
				</li>
				<li><cite></cite><a href="error.html" target="rightFrame">供应商管理</a><i></i></li>
			</ul>
		</dd>
		 -->
		<dd>
			<div class="title">
				<span><img src="images/leftico02.png" /></span>商品管理
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="${pageContext.request.contextPath }/pages/backend/goods/getAllgoods.do" target="rightFrame">查询商品</a><i></i></li>
				<li><cite></cite><a href="${pageContext.request.contextPath }/pages/backend/goods/add.jsp" target="rightFrame">新增商品</a><i></i></li>
			</ul>
		</dd>
		<dd>
			<div class="title">
				<span><img src="images/leftico02.png" /></span>零售管理
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="#">前台销售监控</a><i></i></li>
				<li><cite></cite><a href="#">进货调价</a><i></i></li>
				<li><cite></cite><a href="#">零售调价</a><i></i></li>
				<li><cite></cite><a href="#">促销管理</a><i></i></li>
			</ul>
		</dd>
		<dd>
			<div class="title">
				<span><img src="images/leftico03.png" /></span>仓库管理
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="#">采购</a><i></i></li>
				<li><cite></cite><a href="#">验收</a><i></i></li>
				<li><cite></cite><a href="#">调拨</a><i></i></li>
				<li><cite></cite><a href="#">盘点</a><i></i></li>
				<li><cite></cite><a href="#">报表</a><i></i></li>
				<li><cite></cite><a href="#">结算</a><i></i></li>
			</ul>
		</dd>
		<dd>
			<div class="title">
				<span><img src="images/leftico04.png" /></span>人事管理
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="#">会员管理</a><i></i></li>
				<li><cite></cite><a href="#">卡管理</a><i></i></li>
				<li><cite></cite><a href="#">员工管理</a><i></i></li>
				<li><cite></cite><a href="#">员工销售统计</a><i></i></li>
			</ul>
		</dd>
		<dd>
			<div class="title">
				<span><img src="images/leftico04.png" /></span>决策管理
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="#">商品分析</a><i></i></li>
				<li><cite></cite><a href="#">业务分析</a><i></i></li>
				<li><cite></cite><a href="#">信息列表</a><i></i></li>
				<li><cite></cite><a href="#">其他</a><i></i></li>
			</ul>
		</dd>
		<dd>
			<div class="title">
				<span><img src="images/leftico04.png" /></span>系统管理
			</div>
			<ul class="menuson">
				<li><cite></cite><a href="#">数据管理</a><i></i></li>
				<li><cite></cite><a href="#">工具</a><i></i></li>
				<li><cite></cite><a href="#">设置</a><i></i></li>
				<li><cite></cite><a href="#">其他</a><i></i></li>
			</ul>
		</dd>
	</dl>
</body>
</html>
