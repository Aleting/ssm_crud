<%--
  Created by IntelliJ IDEA.
  User: 10910
  Date: 2019/6/18
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    pageContext.setAttribute("APP_PATH",request.getContextPath());
%>
<html>
<head>
    <title>学生列表</title>
    <link href="${APP_PATH}/static/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script src="${APP_PATH}/static/bootstrap/js/bootstrap.min.js"></script>
    <script src="${APP_PATH}/static/jquary/jquery-3.4.1.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <h1>SSM-CRUD</h1>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4 col-md-offset-8">
            <button class="btn btn-primary">新增</button>
            <button class="btn btn-danger">删除</button>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <table class="table table-hover">
                <tr>
                    <th>id</th>
                    <th>name</th>
                    <th>sex</th>
                    <th>email</th>
                    <th>操作</th>
                </tr>
                <c:forEach items="${pageInfo.list}" var="stu">
                    <tr>
                        <th>${stu.stId}</th>
                        <th>${stu.stName}</th>
                        <th>${stu.stSex=="M"?"男":"女"}</th>
                        <th>${stu.stEmail}</th>
                        <th>${stu.teacher.teName}</th>
                        <th>
                            <button class="btn btn-primary btn-sm">
                                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> 编辑
                            </button>
                            <button class="btn btn-danger  btn-sm">
                                <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>删除
                            </button>
                        </th>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
    <!--分页信息-->
    <div class="row">
        <!--文字信息-->
        <div class="col-md-6">
            当前${pageInfo.pageNum}页,总共${pageInfo.pages}页,总${pageInfo.total}条记录
        </div>
        <!--分页条信息-->
        <div class="col-md-6">
            <nav aria-label="Page navigation">
                <ul class="pagination">
                    <li><a href="${APP_PATH}/stu?pn=1">首页</a></li>
                    <c:if test="${pageInfo.hasPreviousPage}">
                        <li>
                            <a href="${APP_PATH}/stu?pn=${pageInfo.pageNum-1}" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                    </c:if>
                    <c:forEach items="${pageInfo.navigatepageNums}" var="page_num">
                        <c:if test="${page_num == pageInfo.pageNum}">
                            <li class="active"><a href="#">${page_num}</a></li>
                        </c:if>
                        <c:if test="${page_num != pageInfo.pageNum}">
                            <li><a href="${APP_PATH}/stu?pn=${page_num}">${page_num}</a></li>
                        </c:if>
                    </c:forEach>
                    <c:if test="${pageInfo.hasNextPage}">
                        <li>
                            <a href="${APP_PATH}/stu?pn=${pageInfo.pageNum+1}" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>
                    </c:if>
                    <li><a href="${APP_PATH}/stu?pn=${pageInfo.pages}">末页</a></li>
                </ul>
            </nav>
        </div>
    </div>
    <div class="row"></div>
</div>
</body>
</html>
