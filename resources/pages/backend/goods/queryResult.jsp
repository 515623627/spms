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

<title>商品概览</title>
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
		
		var queryForm = $("#queryForm");
		var currentPage = $("#currentPage").attr("value");
		//alert(currentPage);
		
	});
</script>



<script type="text/javascript">
/**
	KE.show({
		id : 'content7',
		cssPath : './index.css'
	});
**/

	function add() {
		window.location.href = "${pageContext.request.contextPath }/pages/backend/goods/addInput.jsp";
	}
	function query() {
		window.location.href = "${pageContext.request.contextPath }/pages/backend/goods/queryInput.jsp";
	}
	
	function submitQuery(){
		$("#currentPage").attr("value",1);
		queryForm.submit();
	}
	function nextPage(){
		currentPage = $("#currentPage").attr("value");
		//alert(currentPage);
		if(currentPage == null || currentPage == ""){
			currentPage = 1;
		}else{
			currentPage ++;
		}
		//alert(currentPage);
		$("#currentPage").attr("value",currentPage);
		queryForm.submit();
	}
	function prePage(){
		currentPage = $("#currentPage").attr("value");
		//alert(currentPage);
		if(currentPage == null || currentPage == ""){
			currentPage = 1;
		}else{
			currentPage --;
		}
		//alert(currentPage);
		$("#currentPage").attr("value",currentPage);
		queryForm.submit();
	}
	function firstPage(){
		$("#currentPage").attr("value",1);
		queryForm.submit();
	}
	function lastPage(currentPage){
		//alert(currentPage);
		$("#currentPage").attr("value",currentPage);
		queryForm.submit();
	}

</script>
</head>

<body>
	<div class="place">
		<span>位置：</span>
		<ul class="placeul">
			<li><a href="#">首页</a></li>
			<li>商品概览</li>
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
			<form id="queryForm" name="queryForm" action="${pageContext.request.contextPath }/pages/backend/goods/getAllgoodsByPageWithCriteria.do"
				method="post">

				<!-- 
				<ul class="forminfo">
					<li><label>商品编号</label><input name="goodsId" type="text"
						class="dfinput" value="A00001"/></li>
					<li><label>商品名称</label><input name="goodsName" type="text" class="dfinput" value=""/></li>
					<li><label>商品条码</label><input name="goodsCode" type="text" class="dfinput" value=""/></li>
					<li><label>商品类别</label><input name="goodsType" type="text" class="dfinput" value=""/></li>
					<li><label>告警数量</label><input name="alarmAmount" type="text" class="dfinput" value=""/></li>
					<li><label>供应商号</label><input name="supplierId" type="text" class="dfinput" value=""/></li>
				</ul>
				
				<input type="submit" class="btn" value="查询">
				 -->
				<div id="tab2" class="tabson">
					<ul class="seachform">
						<li><label>商品编号</label><input name="goodsId" type="text"
							class="scinput" value="${goods.goodsId}"/>
						</li>
						<li><label>商品名称</label><input name="goodsName" type="text"
							class="scinput" value="${goods.goodsName}"/>
						</li>
						<!-- 
						<li><label>商品条码</label><input name="goodsCode" type="text"
							class="scinput" />
						</li>
						 -->
						<li><label>商品类别</label>
							<div class="vocation">
								<input name="goodsType" type="text"
								class="scinput" value="${goods.goodsType}"/>
							</div>
						</li>
						<li><label>供应商</label>
							<div class="vocation">
								<select class="select3" name="supplierId">
									<option value="">----请选择----</option>
									<c:forEach items="${suppliersList}" var="suppliers">
										<c:choose>
											<c:when test="${suppliers.suppliersId eq goods.supplierId}">
												<option value="${suppliers.suppliersId }" selected="selected">${suppliers.suppliersName }</option>
											</c:when>
											<c:otherwise>
												<option value="${suppliers.suppliersId }">${suppliers.suppliersName }</option>
											</c:otherwise>
										</c:choose>
									</c:forEach>
									
								</select>
							</div>
						</li>
						<li>
							<div class="vocation">
								<input id="currentPage" name="currentPage" type="hidden" value="${pageBean.currentPage}"/>
							</div>
						</li>
						<li><label>&nbsp;</label><input name="" type="submit"
							class="scbtn" value="查询" onclick="submitQuery()"/></li>

					</ul>
				</div>
			</form>
		</div>
		<table class="tablelist">
			<thead>
				<tr>
					<th class="checkbox_format"><input name="" type="checkbox" value="" /></th>
					<th class="string_format">商品编号<i class="sort"><img src="images/px.gif" /></i></th>
					<th class="string_format">商品名称</th>
					<th class="int_format">售价</th>
					<th class="int_format">商品等级</th>
					<th class="int_format">库存数量</th>
					<th class="int_format">是否告警</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${goodsList}" var="goods">
					<tr>
						<td><input name="" type="checkbox" value="" /></td>
						<td>${goods.goodsId}</td>
						<td>${goods.goodsName}</td>
						<td>${goods.sellPrice}</td>
						<td>${goods.goodsLevel}</td>
						<td>${goods.stockAmount}</td>
						<td>是</td>
						<td><a
							href="${pageContext.request.contextPath }/pages/backend/goods/findById.do?rowId=${goods.rowId}"
							class="tablelink">查看</a> <a
							href="${pageContext.request.contextPath }/pages/backend/goods/deleteById.do?rowId=${goods.rowId}"
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
							class="blue">${pageBean.currentPage }&nbsp;</i>页(共 ${pageBean.totalPage} 页)
						<div style="float: right;">
							<c:choose>
								<c:when test="${pageBean.isFirstPage eq true}">
								【首  页】
							</c:when>
								<c:otherwise>
									<i><a class="blue"
										 onclick="firstPage()" style="cursor: pointer;">【首
											页】</a></i>
								</c:otherwise>
							</c:choose>

							<c:choose>
								<c:when test="${pageBean.hasPreviousPage eq true}">
									<i><a class="blue"
										 onclick="prePage()" style="cursor: pointer;">【上一页】</a></i>
								</c:when>
								<c:otherwise>
								【上一页】
							</c:otherwise>
							</c:choose>

							<c:choose>
								<c:when test="${pageBean.hasNextPage eq true}">
									<i><a class="blue" onclick="nextPage()" style="cursor: pointer;"
										>【下一页】</a></i>
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
										 onclick="lastPage('${pageBean.totalPage}')" style="cursor: pointer;">【尾
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
