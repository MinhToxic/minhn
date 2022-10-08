<%-- 
    Document   : Detail
    Created on : Oct 3, 2022, 11:35:37 PM
    Author     : minhi
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="CSS/detail.css">
    </head>
    <body>
        
    <div id="wrapper">
        <div id="header">
            <a href="" class="logo">
                <img src="assets/logo.png" alt="">
            </a>
            <div id="menu">
                <div class="item">
                    <a href="home">Home page</a>
                </div>
                <div class="item">
                    <a href="">Product</a>
                     <c:forEach items="${listCC}" var="o">
                     <div class="item">
                    <a href="Category?cid=${o.cid}">${o.cname}</a>
                </div>
                    
                </c:forEach>
                </div>
             
                <div class="item">
                    <a href="">Contact</a>
                </div>
            </div>
            <div id="actions">
                <div class="item">
                    <img src="assets/user.png" alt="">
                </div>
                <div class="item">
                    <img src="assets/cart.png" alt="">
                </div>
            </div>
        </div>
        <div id="banner">
            <div class="box-left">
                <h2>
                    <span>Quality and</span>
                    <br>
                    <span>Reputation</span>
                </h2>
                <p>Supplying All Beautiful, Quality Fashion Items From Major Fashion Brands</p>
                <button>Buy Now</button>
            </div>
            <div class="box-right">
                <img src="assets/img_1.png" alt="">
                <img src="assets/img_2.png" alt="">
                <img src="assets/img_3.png" alt="">
            </div>
            <div class="to-bottom">
                <a href="">
                    <img src="assets/to_bottom.png" class="imgtest" alt="">
                </a>
            </div>
        </div>
       
            <div id="product">
            <div id="product-left">
                <img src="${detailP.image}" style="width: 256px;height: 174px"  alt="" srcset="">
                <div></div>
            </div>
            <div id="product-right">
                <div class="name1" > ${detailP.name}</div>
                <div class="desc1">${detailP.description}</div>
                <div class="price1">${detailP.price}</div>
            </div>
        </div>
      
    </div>

    <div id="card" >
        <button class="btn-add-card">Add To card</button>
    </div>
            <div id="comment" style="margin-top: 500px ">
        <h2>Customer's feedback</h2>
        <div id="comment-body">
            <div class="prev">
                <a href="#">
                    <img src="assets/prev.png" alt="">
                </a>
            </div>
            <ul id="list-comment">
                <li class="item">
                    <div class="avatar">
                        <img src="assets/avatar_1.png" alt="">

                    </div>
                    <div class="stars">
                        <span>
                            <img src="assets/star.png" alt="">
                        </span>
                        <span>
                            <img src="assets/star.png" alt="">
                        </span>
                        <span>
                            <img src="assets/star.png" alt="">
                        </span>
                        <span>
                            <img src="assets/star.png" alt="">
                        </span>
                        <span>
                            <img src="assets/star.png" alt="">
                        </span>
                    </div>
                    <div class="name">Nguyễn Đình Vũ</div>

                    <div class="text">
                        <p>Lorem Ipsum is simply dummy text of the printing and
                            typesetting industry. Lorem Ipsum has been the industry's
                            standard dummy text ever since the 1500s, when an unknown
                            printer took a galley of type and scrambled it to make a type
                            specimen book.</p>
                    </div>
                </li>
                <li class="item">
                    <div class="avatar">
                        <img src="assets/avatar_1.png" alt="">

                    </div>
                    <div class="stars">
                        <span>
                            <img src="assets/star.png" alt="">
                        </span>
                        <span>
                            <img src="assets/star.png" alt="">
                        </span>
                        <span>
                            <img src="assets/star.png" alt="">
                        </span>
                        <span>
                            <img src="assets/star.png" alt="">
                        </span>
                        <span>
                            <img src="assets/star.png" alt="">
                        </span>
                    </div>
                    <div class="name">Trần Ngọc Sơn</div>

                    <div class="text">
                        <p>Lorem Ipsum is simply dummy text of the printing and
                            typesetting industry. Lorem Ipsum has been the industry's
                            standard dummy text ever since the 1500s, when an unknown
                            printer took a galley of type and scrambled it to make a type
                            specimen book.</p>
                    </div>
                </li>
                <li class="item">
                    <div class="avatar">
                        <img src="assets/avatar_1.png" alt="">

                    </div>
                    <div class="stars">
                        <span>
                            <img src="assets/star.png" alt="">
                        </span>
                        <span>
                            <img src="assets/star.png" alt="">
                        </span>
                        <span>
                            <img src="assets/star.png" alt="">
                        </span>
                        <span>
                            <img src="assets/star.png" alt="">
                        </span>
                        <span>
                            <img src="assets/star.png" alt="">
                        </span>
                    </div>
                    <div class="name">Nguyễn Trần Vi</div>

                    <div class="text">
                        <p>Lorem Ipsum is simply dummy text of the printing and
                            typesetting industry. Lorem Ipsum has been the industry's
                            standard dummy text ever since the 1500s, when an unknown
                            printer took a galley of type and scrambled it to make a type
                            specimen book.</p>
                    </div>
                </li>
            </ul>
            <div class="next">
                <a href="#">
                    <img src="assets/next.png" alt="">
                </a>
            </div>
        </div>
    </div>
    <div id="footer">
        <div class="box">
            <div class="logo">
                <img src="assets/logo.png" style="width: 50%;height: 50%" alt="">
            </div>
            <p>Provide safe quality products for customers</p>
        </div>
        <div class="box">
            <h3>CONTENT</h3>
            <ul class="quick-menu">
                <div class="item">
                    <a href="">Home page</a>
                </div>
                <div class="item">
                    <a href="">Product</a>
                </div>
               
                <div class="item">
                    <a href="">Contact</a>
                    
                </div>
            </ul>
        </div>
        <div class="box">
            <h3>CONTACT</h3>
            <form action="">
                <input type="text" placeholder="Email address">
                <button>Get News</button>
            </form>
        </div>
    </div>
    </div>
    <script src="JS/script.js"></script>
    </body>
</html>
