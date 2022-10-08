<%-- 
    Document   : Home
    Created on : Oct 2, 2022, 2:57:26 PM
    Author     : minhi
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="CSS/style.css">
    </head>
    <body>
      
    <div id="wrapper">
        <div id="header">
            <a href="" class="logo">
                <img style="width: 90%;height: 90%" src="assets/logo.png" alt="">
            </a>
            <div id="menu">
                <div class="item">
                    <a href="home">Home page</a>
                </div>
                <div class="item">
                    <a href="">Product</a>
                </div>
                <c:forEach items="${listCC}" var="o">
                     <div class="item">
                    <a href="Category?cid=${o.cid}">${o.cname}</a>
                </div>
                    
                </c:forEach>
                 
             
                <div class="item">
                    <a href="https://www.facebook.com/profile.php?id=100084342767074">Contact</a>
                </div>
            </div>
            <form action="search" class="inner-form" >
                <div class="input-field">
                    <input id="search" name="txt" type="text" placeholder="search"  />
                    <button class="btn-search" type="submit">
                      <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24">
                        <path d="M15.5 14h-.79l-.28-.27C15.41 12.59 16 11.11 16 9.5 16 5.91 13.09 3 9.5 3S3 5.91 3 9.5 5.91 16 9.5 16c1.61 0 3.09-.59 4.23-1.57l.27.28v.79l5 4.99L20.49 19l-4.99-5zm-6 0C7.01 14 5 11.99 5 9.5S7.01 5 9.5 5 14 7.01 14 9.5 11.99 14 9.5 14z"></path>
                      </svg>
                    </button>
                </div>
            </form>
            <div id="actions">
                <c:if test="${sessionScope.acc != null}">
                    <div class="item">
                        <a href="#" style="color: black">Hello, ${sessionScope.acc.user}</a>
                </div>
                        <div class="item">
                    <a href="logout" style="color: black"><img src="assets/user.png" alt=""> Logout</a>
                </div>
                </c:if>
                <c:if test="${sessionScope.acc == null}">
                    <div class="item">
                        <a href="Login.jsp" style="color: black"><img src="assets/user.png" alt=""> Login</a>
                    </div>
                </c:if>
                <div class="item">
                    <a href="Cart.jsp"><img src="assets/cart.png" alt=""></a>
                </div>
               <c:if test="${sessionScope.acc.isAdmin == 1}">
                    <div class="item">
                        <a href="#" style="color: black">Manager Account</a>
                </div>
                </c:if>
                 
                <c:if test="${sessionScope.acc.isSell == 1}">
                    <div class="item">
                        <a href="manager" style="color: black">Manager Product</a>
                </div>
                </c:if>
            </div>
        </div>
        <div id="banner">
            <div class="box-left">
                <h2>
                    <span>Quality  and  </span>
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
                    <img src="assets/to_bottom.png" alt="">
                </a>
            </div>
        </div>
        <div id="wp-products">
            <h2>My Product</h2>
            <ul id="list-products">
                <c:forEach items="${listP}" var="o"> 
                    <div class="item">
                   
                        <img style="width: 256px;height: 174px" src="${o.image}" alt="">
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
                    <div class="name"> <a href="Detail?pid=${o.id}" title="View Product">${o.name}</a> </div>
                    <div class="desc">${o.description}</div>
                    <div class="price">${o.price} $</div>
                   
                    
                    </div>
                
                </c:forEach>

                
            </ul>
            <div class="list-page">
                <div class="item">
                    <a href="">1</a>
                </div>
                <div class="item">
                    <a href="">2</a>
                </div>
                <div class="item">
                    <a href="">3</a>
                </div>
                <div class="item">
                    <a href="">4</a>
                </div>
            </div>
        </div>

        <div id="saleoff">
            <div class="box-left">
                <h1>
                    <span>SALE</span>
                    <span>45%</span>
                </h1>
            </div>
            <div class="box-right"></div>
        </div>

        <div id="comment">
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
                    <button>Get news</button>
                </form>
            </div>
        </div>
    </div>
        <script src="JS/script.js"></script>
    </body>
</html>
