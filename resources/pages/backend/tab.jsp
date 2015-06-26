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

<title>系统设置</title>

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
	src="${pageContext.request.contextPath }/js/jquery.idTabs.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/select-ui.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/editor/kindeditor.js"></script>

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
			<li><a href="#">系统设置</a></li>
		</ul>
	</div>
	<div class="formbody">
		<div id="usual1" class="usual">
			<div class="itab">
				<ul>
					<li><a href="#tab1" class="selected">发布通知</a></li>
					<li><a href="#tab2">自定义</a></li>
				</ul>
			</div>
			<div id="tab1" class="tabson">
				<div class="formtext">
					Hi，<b>admin</b>，欢迎您试用信息发布功能！
				</div>
				<ul class="forminfo">
					<li><label>招聘企业<b>*</b></label><input name="" type="text"
						class="dfinput" value="请填写单位名称" style="width:518px;" /></li>
					<li><label>职位名称<b>*</b></label>
						<div class="vocation">
							<select class="select1">
								<option>UI设计师</option>
								<option>交互设计师</option>
								<option>前端设计师</option>
								<option>网页设计师</option>
								<option>Flash动画</option>
								<option>视觉设计师</option>
								<option>插画设计师</option>
								<option>美工</option>
								<option>其他</option>
							</select>
						</div></li>
					<li><label>薪资待遇<b>*</b></label>
						<div class="vocation">
							<select class="select1">
								<option>3000-5000</option>
								<option>5000-8000</option>
								<option>8000-10000</option>
								<option>10000-15000</option>
							</select>
						</div></li>
					<li><label>工作地点<b>*</b></label>
						<div class="usercity">
							<div class="cityleft">
								<select class="select2">
									<option>江苏</option>
									<option>湖南</option>
									<option>广东</option>
									<option>北京</option>
									<option>湖北</option>
								</select>
							</div>
							<div class="cityright">
								<select class="select2">
									<option>南京</option>
									<option>无锡</option>
									<option>盐城</option>
									<option>徐州</option>
									<option>连云港</option>
								</select>
							</div>
						</div></li>
					<li><label>通知内容<b>*</b></label> <textarea id="content7"
							name="content"
							style="width:700px;height:250px;visibility:hidden;"></textarea></li>
					<li><label>&nbsp;</label><input name="" type="button"
						class="btn" value="马上发布" /></li>
				</ul>

			</div>
			<div id="tab2" class="tabson">
				<ul class="seachform">
					<li><label>综合查询</label><input name="" type="text"
						class="scinput" /></li>
					<li><label>指派</label>
						<div class="vocation">
							<select class="select3">
								<option>全部</option>
								<option>其他</option>
							</select>
						</div></li>

					<li><label>重点客户</label>
						<div class="vocation">
							<select class="select3">
								<option>全部</option>
								<option>其他</option>
							</select>
						</div></li>
					<li><label>客户状态</label>
						<div class="vocation">
							<select class="select3">
								<option>全部</option>
								<option>其他</option>
							</select>
						</div></li>

					<li><label>&nbsp;</label><input name="" type="button"
						class="scbtn" value="查询" /></li>

				</ul>
				<table class="tablelist">
					<thead>
						<tr>
							<th><input name="" type="checkbox" value=""
								checked="checked" /></th>
							<th>编号<i class="sort"><img src="images/px.gif" /></i></th>
							<th>标题</th>
							<th>用户</th>
							<th>籍贯</th>
							<th>发布时间</th>
							<th>是否审核</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><input name="" type="checkbox" value="" /></td>
							<td>20130908</td>
							<td>王金平幕僚：马英九声明字字见血 人活着没意思</td>
							<td>admin</td>
							<td>江苏南京</td>
							<td>2013-09-09 15:05</td>
							<td>已审核</td>
							<td><a href="#" class="tablelink">查看</a> <a href="#"
								class="tablelink"> 删除</a></td>
						</tr>
						<tr>
							<td><input name="" type="checkbox" value="" /></td>
							<td>20130907</td>
							<td>温州19名小学生中毒流鼻血续：周边部分企业关停</td>
							<td>uimaker</td>
							<td>山东济南</td>
							<td>2013-09-08 14:02</td>
							<td>未审核</td>
							<td><a href="#" class="tablelink">查看</a> <a href="#"
								class="tablelink">删除</a></td>
						</tr>
						<tr>
							<td><input name="" type="checkbox" value="" /></td>
							<td>20130906</td>
							<td>社科院:电子商务促进了农村经济结构和社会转型</td>
							<td>user</td>
							<td>江苏无锡</td>
							<td>2013-09-07 13:16</td>
							<td>未审核</td>
							<td><a href="#" class="tablelink">查看</a> <a href="#"
								class="tablelink">删除</a></td>
						</tr>
						<tr>
							<td><input name="" type="checkbox" value="" /></td>
							<td>20130905</td>
							<td>江西&quot;局长违规建豪宅&quot;：局长检讨</td>
							<td>admin</td>
							<td>北京市</td>
							<td>2013-09-06 10:36</td>
							<td>已审核</td>
							<td><a href="#" class="tablelink">查看</a> <a href="#"
								class="tablelink">删除</a></td>
						</tr>
						<tr>
							<td><input name="" type="checkbox" value="" /></td>
							<td>20130907</td>
							<td>温州19名小学生中毒流鼻血续：周边部分企业关停</td>
							<td>uimaker</td>
							<td>山东济南</td>
							<td>2013-09-08 14:02</td>
							<td>未审核</td>
							<td><a href="#" class="tablelink">查看</a> <a href="#"
								class="tablelink">删除</a></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		
		<script type="text/javascript">
			$("#usual1 ul").idTabs();
		</script>

		<script type="text/javascript">
			$('.tablelist tbody tr:odd').addClass('odd');
		</script>

	</div>

</body>
</html>
