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
				<h1>Xác nhận thanh toán</h1>
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">STT</th>
							<th scope="col">Họ tên</th>
							<th scope="col">Tên sách</th>
							<th scope="col">Ngày mua</th>
							<th scope="col">Số lượng mua</th>
							<th scope="col">Giá</th>
							<th scope="col">Thành tiền</th>
							<th scope="col">Đã mua</th>
							<th scope="col">Xác nhận</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="XacNhan" items="${dsXacNhan }">
							<tr>
								<th scope="row"><c:set var="i" scope="request"
										value="${i+1}"></c:set> ${i}</th>
								<td>${XacNhan.getHoTen() }</td>
								<td>${XacNhan.getTenDT() }</td>
								<td>${XacNhan.getNgayMua() }</td>
								<td>${XacNhan.getSoLuongMua() }</td>
								<td>${XacNhan.getGia() }</td>
								<td>${XacNhan.getThanhTien() }</td>
								<td>${XacNhan.isDaMua() }</td>

								<c:choose>
									<c:when test="${XacNhan.isDaMua()}">
										<td>Đã mua hàng</td>
									</c:when>
									<c:otherwise>
										<td><a
											href="Controller_XacNhanAdmin?machitiet=${XacNhan.getMaChiTiet() }">Xác
												nhận mua hàng</a></td>
									</c:otherwise>
								</c:choose>

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