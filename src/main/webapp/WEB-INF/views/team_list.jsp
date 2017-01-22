<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Team List</title>

    <link href="<c:url value="/static/vendors/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">

</head>
<body>
<h1>RGB Team list!</h1>
<div>
    <h2>Team list</h2>
    <table class="table">
        <thead>
            <tr>
                <th>No</th>
                <th>Name</th>
                <th>Rating</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>1</td>
                <td>Static RED team</td>
                <td>111</td>
            </tr>
            <tr>
                <td>2</td>
                <td>Static BLUE team</td>
                <td>123</td>
            </tr>
            <tr>
                <td>3</td>
                <td>Static Green team</td>
                <td>321</td>
            </tr>
        </tbody>
    </table>
</div>
<div>
    <a href="/team/new" class="btn btn-primary">New</a>
</div>
</body>
</html>
