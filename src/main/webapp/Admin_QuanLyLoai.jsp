<%@page import="bean.Admin_DangNhapBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">


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
	</div>
	<!-- category page -->
	<div class="container">
		<div class="row">
			<!-- Danh sach loai sach -->

			<!-- Form Đăng nhập -->
			<div class="col-sm-12">
				<h1>Danh sách loại sản phẩm</h1>
				<form action="Controller_ThemLoaiSP" method="get">
					<div class="row mb-5">
						<div class="col-sm-4">
							<label for="floatingInput">Mã loại sản phẩm</label> <input
								name="maloai" type="text" class="form-control"
								id="floatingPassword" placeholder="Mã loại sản phẩm">
						</div>
						<div class="col-sm-4">
							<label for="floatingInput">Tên loại sản phẩm</label> <input
								name="tenloai" type="text" class="form-control"
								id="floatingPassword" placeholder="Tên loại sản phẩm">
						</div>
						<div class="col-sm-4" style="margin-top: 26px;">
							<button class="btn btn-primary btn-login text-uppercase fw-bold"
								type="submit">Thêm loại sản phẩm</button>
						</div>
					</div>
				</form>
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Mã loại</th>
							<th scope="col">Tên loại</th>

						</tr>
					</thead>
					<tbody>
						<c:forEach var="loai" items="${dsLoai }">
							<tr>
								<td>${loai.getMaloai() }</td>
								<td>${loai.getTenloai() }</td>
								<td><a class="btn btn-danger"
									href="Controller_XoaLoaiSP?maloai=${loai.getMaloai() }">Xóa</a>
								</td>

							</tr>
						</c:forEach>
					</tbody>
				</table>

			</div>
		</div>
	</div>




	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>