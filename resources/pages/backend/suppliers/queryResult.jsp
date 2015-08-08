<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

<title>供应商概览</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link href="${pageContext.request.contextPath }/css/style.css"
	rel="stylesheet" type="text/css" />

<link href="${pageContext.request.contextPath }/css/select.css"
	rel="stylesheet" type="text/css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery.js"></script>

<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/select-ui.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/editor/kindeditor.js"></script>

<script type="text/javascript">
	function add() {
		window.location.href = "${pageContext.request.contextPath }/pages/backend/suppliers/addInput.jsp";
	}
	function query() {
		window.location.href = "${pageContext.request.contextPath }/pages/backend/suppliers/queryInput.jsp";
	}
</script>

<script type="text/javascript">
	KE.show({
		id : 'content7',
		cssPath : './index.css'
	});
</script>

<script type="text/javascript">
	$(document).ready(function(e) {
		$(".select1").uedSelect({
			width : 345
		});
		$(".select2").uedSelect({
			width : 167
		});
		$(".select3").uedSelect({
			width : 100
		});
	});
</script>
</head>

<body>
	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#">首页</a></li>
			<li>供应商概览</li>
		</ul>
	</div>

	<div class="rightinfo">

		<div class="tools">

			<ul class="toolbar">
				<li class="click" onclick="add()"><span><img
						src="images/t01.png" /></span>添加</li>
				<li class="click" onclick="query()"><span><img
						src="images/t02.png" /></span>查询</li>
				<li><span><img src="images/t03.png" /></span>删除</li>
				<li><span><img src="images/t04.png" /></span>统计</li>
			</ul>


			<ul class="toolbar1">
				<li><span><img src="images/t05.png" /></span>设置</li>
			</ul>

		</div>

		<div>
			<form
				action="${pageContext.request.contextPath }/pages/backend/suppliers/getAllsuppliersByPageWithCriteria.do?currentPage=1"
				method="post">

				<div id="tab2" class="tabson">
					<ul class="seachform">
						<li><label>供应商代码</label><input name="suppliersCode" type="text"
							class="scinput" />
						</li>
						<li><label>供应商名称</label><input name="suppliersName" type="text"
							class="scinput" />
						</li>
						<li><label>商品类别</label>
							<div class="vocation">
								<select class="select3" name="suppliersType">
									<option>全部</option>
									<option>其他</option>
								</select>
							</div>
						</li>
						<li><label>供应商</label>
							<div class="vocation">
								<select class="select3" name="supplierId">
									<option>全部</option>
									<option>其他</option>
								</select>
							</div>
						</li>
						<li><label>&nbsp;</label><input name="" type="button"
							class="scbtn" value="查询" /></li>

					</ul>
				</div>
			</form>
		</div>
		<table class="tablelist">
			<thead>
				<tr>
					<th><input name="" type="checkbox" value="" /></th>
					<th>供应商代码<i class="sort"><img src="images/px.gif" /></i></th>
					<th>供应商名称</th>
					<th>供应商地址</th>
					<th>合作方式</th>
					<th>结款方式</th>
					<th>联系人</th> 
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${suppliersList}" var="suppliers">
					<tr>
						<td><input name="" type="checkbox" value="" /></td>
						<td>${suppliers.suppliersId}</td>
						<td>${suppliers.suppliersName}</td>
						<td>${suppliers.suppliersAddress}</td>
						<td>${suppliers.coperateMode}</td>
						<td>${suppliers.payMode}</td>
						<td>${suppliers.contactPerson}</td>
						<td><a
							href="${pageContext.request.contextPath }/pages/backend/suppliers/findById.do?rowId=${suppliers.rowId}"
							class="tablelink">查看</a> <a
							href="${pageContext.request.contextPath }/pages/backend/suppliers/deleteById.do?rowId=${suppliers.rowId}"
							class="tablelink"> 删除</a></td>
					</tr>
				</c:forEach>


			</tbody>
		</table>
		<!-- 
		hasPreviousPage:${pageBean.hasPreviousPage}<br/>
		hasNextPage:${pageBean.hasNextPage}<br/>
		isFirstPage:${pageBean.isFirstPage}<br/>
		isLastPage:${pageBean.isLastPage}<br/>
		-->
		<!-- Page start -->
		<div class="pagin">
			<div class="message">

				<c:choose>
					<c:when test="${pageBean.totalRecord ne 0}">
						共<i class="blue">${pageBean.totalRecord }</i>条记录，当前显示第&nbsp;<i
							class="blue">${pageBean.currentPage }&nbsp;</i>页
						<div style="float: right;">
							<c:choose>
								<c:when test="${pageBean.isFirstPage eq true}">
								【首  页】
							</c:when>
								<c:otherwise>
									<i><a class="blue"
										href="${pageContext.request.contextPath }/pages/backend/suppliers/getAllSuppliersByPage.do?currentPage=1">【首
											页】</a></i>
								</c:otherwise>
							</c:choose>

							<c:choose>
								<c:when test="${pageBean.hasPreviousPage eq true}">
									<i><a class="blue"
										href="${pageContext.request.contextPath }/pages/backend/suppliers/getAllSuppliersByPage.do?currentPage=${pageBean.currentPage - 1}">【上一页】</a></i>
								</c:when>
								<c:otherwise>
								【上一页】
							</c:otherwise>
							</c:choose>

							<c:choose>
								<c:when test="${pageBean.hasNextPage eq true}">
									<i><a class="blue"
										href="${pageContext.request.contextPath }/pages/backend/suppliers/getAllSuppliersByPage.do?currentPage=${pageBean.currentPage + 1}">【下一页】</a></i>
								</c:when>
								<c:otherwise>
								【下一页】
							</c:otherwise>
							</c:choose>

							<c:choose>
								<c:when test="${pageBean.isLastPage eq true}">
								【尾  页】						
							</c:when>
								<c:otherwise>
									<i><a class="blue"
										href="${pageContext.request.contextPath }/pages/backend/suppliers/getAllSuppliersByPage.do?currentPage=${pageBean.totalPage}">【尾
											页】</a></i>
								</c:otherwise>
							</c:choose>
						</div>
					</c:when>
					<c:otherwise>
						<div class="noresult">没有符合条件的记录！</div>
					</c:otherwise>
				</c:choose>

			</div>
		</div>
		<!-- Page end -->

		<div class="tip">
			<div class="tiptop">
				<span>提示信息</span><a></a>
			</div>

			<div class="tipinfo">
				<span><img src="images/ticon.png" /></span>
				<div class="tipright">
					<p>是否确认对信息的修改 ？</p>
					<cite>如果是请点击确定按钮 ，否则请点取消。</cite>
				</div>
			</div>

			<div class="tipbtn">
				<input name="" type="button" class="sure" value="确定" />&nbsp; <input
					name="" type="button" class="cancel" value="取消" />
			</div>

		</div>




	</div>

	<script type="text/javascript">
		$('.tablelist tbody tr:odd').addClass('odd');
	</script>

</body>
</html>
