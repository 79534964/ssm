<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>movies</title>
	<link rel="stylesheet"
		href="https://cdn.bootcss.com/bootstrap/4.0.0-beta/css/bootstrap.min.css"
		integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M"
		crossorigin="anonymous">
</head>
<body>
	<table class="table">
		<thead>
			<tr>
				<th>id</th>
				<th>电影名</th>
				<th>电影链接</th>
				<th>电影类型</th>
				<th>电影评分</th>
				<th>电影来源</th>
				<th>票房</th>
			</tr>
		</thead>
		<tbody id="tbodyId">
		</tbody>
	</table>
	<script src="https://code.jquery.com/jquery-3.2.1.min.js"
		integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.bootcss.com/popper.js/1.12.3/umd/popper.min.js"
		integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.bootcss.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"
		integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1"
		crossorigin="anonymous"></script>
	<script type="text/javascript">
		$(document).ready(
				function() {
					$.ajax({
						url : 'http://localhost:8080/comment/api/movies',
						type : 'GET', //GET
						async : true, //或false,是否异步
						timeout : 5000, //超时时间
						dataType : 'json', //返回的数据格式：json/xml/html/script/jsonp/text
						beforeSend : function(xhr) {
							console.log(xhr);
							console.log('发送前');
						},
						success : function(data, textStatus, jqXHR) {
							console.log(data);
							console.log(textStatus);
							console.log(jqXHR);
							var html = '';
							for (var i = 0; i < data.length; i++) {
								html += "<tr>" + "<th scope='row'>"
										+ data[i].id + "</th>" + "<td>"
										+ data[i].movieName + "</td>" + "<td>"
										+ data[i].movieHref + "</td>" + "<td>"
										+ data[i].movieType + "</td>" + "<td>"
										+ data[i].movieScore + "</td>" + "<td>"
										+ data[i].movieFrom + "</td>" + "<td>"
										+ data[i].moviesPeople.audience + "</td>"
										+ +"</tr>";
							}
							$('#tbodyId').html(html);
						},
						error : function(xhr, textStatus) {
							console.log('错误');
							console.log(xhr);
							console.log(textStatus);
						},
						complete : function() {
							console.log('结束');
						}
					})
				})
	</script>
</body>
</html>