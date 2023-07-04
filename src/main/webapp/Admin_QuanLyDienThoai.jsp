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

	<!-- category page -->
	<div class="container">
		<div class="row">
			<!-- Danh sach loai sach -->

			<!-- Form Đăng nhập -->
			<div class="col-sm-12">
				<h1>Danh sách sản phẩm</h1>
				<form action="Controller_AddUpdate" id="AddUpdate" method="POST"
					enctype="multipart/form-data">
					<div class="row mb-5">
						<div class="col-sm-12">
							<label for="floatingInput">Mã sản phẩm</label> <input name="madt"
								type="text" class="form-control" id="floatingPassword"
								placeholder="Mã sản phẩm">
						</div>
						<div class="col-sm-12">
							<label for="floatingInput">Tên sản phẩm</label> <input
								name="tendt" type="text" class="form-control"
								id="floatingPassword" placeholder="Tên sản phẩm">
						</div>
						<div class="col-sm-12">
							<label for="floatingInput">Số lượng</label> <input name="soluong"
								type="text" class="form-control" id="floatingPassword"
								placeholder="Số lượng">
						</div>
						<div class="col-sm-12">
							<label for="floatingInput">Giá</label> <input name="gia"
								type="text" class="form-control" id="floatingPassword"
								placeholder="Giá">
						</div>
						<div class="col-sm-12">
							<label for="floatingInput">Ảnh</label> <input name="anh"
								type="file" class="form-control" id="floatingPassword">
						</div>
						<div class="col-sm-12">
							<label for="floatingInput">Ngày nhập</label> <input
								name="ngaynhap" type="date" class="form-control"
								id="floatingPassword">
						</div>
						<div class="col-sm-12">
							<label for="floatingInput">Dung Lượng</label> <input
								name="dungluong" type="text" class="form-control"
								id="floatingPassword" placeholder="Dung lượng">
						</div>
						<div class="col-sm-12">
							<label for="floatingInput">Màu sản phẩm</label> <input
								name="color" type="text" class="form-control"
								id="floatingPassword" placeholder="Color">
						</div>
						<div class="col-sm-12 mt-3">
							<label for="floatingInput">Mã loại</label> <select name="maloai"
								id="maloai" style="margin-top: 17px;">
								<c:forEach var="loai" items="${dsLoai }">
									<option value="${loai.getMaloai() }">${loai.getTenloai() }</option>
								</c:forEach>
							</select>
							<!-- <input name="maloai" type="" class="form-control" id="floatingPassword" placeholder="Mã loại sản phẩm"> -->
						</div>
						<div class="col-sm-2 mt-3">
							<input type="submit" class="btn btn-primary" form="AddUpdate"
								value="Thêm sản phẩm" name="Add" style="margin-top: 17px;">
						</div>
					</div>
				</form>
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Mã sản phẩm</th>
							<th scope="col">Tên sản phẩm</th>
							<th scope="col">Số lượng</th>
							<th scope="col">Giá</th>
							<th scope="col">Mã loại</th>
							<th scope="col">Ảnh</th>
							<th scope="col">Ngày nhập</th>
							<th scope="col">Dung Lượng</th>
							<th scope="col">Màu sản phẩm</th>
							<th scope="col"></th>
							<th scope="col"></th>

						</tr>
					</thead>
					<tbody>
						<c:forEach var="sp" items="${dsSanPham }">
							<tr>
								<td>${sp.getMadt() }</td>
								<td>${sp.getTendt() }</td>
								<td>${sp.getSoluong() }</td>
								<td>${sp.getGia() }</td>
								<td>${sp.getMaloai() }</td>
								<td>${sp.getAnh() }</td>
								<td>${sp.getNgaynhap() }</td>
								<td>${sp.getDungluong() }</td>
								<td>${sp.getColor() }</td>

								<td><a class="btn btn-primary"S
									href="Controller_ChonSP?madt=${sp.getMadt() }&tendt=${sp.getTendt() }&soluong=${sp.getSoluong() }&gia=${sp.getGia() }&maloai=${sp.getMaloai() }&anh=${sp.getAnh() }&ngaynhap=${sp.getNgaynhap() }&dungluong=${sp.getDungluong() }&color=${sp.getColor() }">Chọn</a>
								</td>
								<td><a class="btn btn-danger"
									href="Controller_XoaSanPham?madt=${sp.getMadt() }">Xóa</a></td>

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