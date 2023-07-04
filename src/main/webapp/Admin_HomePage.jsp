<%@page import="bean.Admin_DangNhapBean"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Admin Shopee</title>
</head>
<body style="background-color: bisque;">
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">

			<ul class="nav navbar-nav">
				<li class="active"><a href="Controller_HomePageAdmin">Trang
						chủ</a></li>
				<li><a href="Controller_QuanLyDienThoai">Quản lý sản phẩm</a></li>
				<li><a href="Controller_QuanLyLoai">Quản lý loại</a></li>
				<li><a href="Controller_XacNhanAdmin">Xác nhận</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<c:if test="${admin == null }">
					<li><a href="#"><span class="glyphicon glyphicon-user"></span>
							Sign Up</a></li>
					<li><a href="Controller_DangNhapAdmin"><span
							class="glyphicons glyphicon-log-in"></span> Login</a></li>
				</c:if>
				<c:if test="${admin != null }">
					<li><a href="#"><span class="glyphicon glyphicon-user"></span>
							Xin Chào:<%
					Admin_DangNhapBean admin = (Admin_DangNhapBean) session.getAttribute("admin");
					out.print(" " + admin.getTenDangNhap());
					%></a></li>
					<li><a href="Controller_DangXuatAdmin"><span
							class="glyphicon glyphicon-log-in"></span> Logout</a></li>
				</c:if>
			</ul>
		</div>
	</nav>
</body>
</html>