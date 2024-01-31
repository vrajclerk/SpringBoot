<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 31-01-2024
  Time: 06:09 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Patient Appointment Registration Status</title>
</head>
<body>
<h1>${mainHeader}</h1>
<h1>Patient Appointment Registration Status</h1>
<p>${message}</p>

<table>
    <tr>
        <td>Patient Name:</td>
        <td>${patient.patientName}</td>
    </tr>
    <tr>
        <td>Patient Contact:</td>
        <td>${patient.patientContact}</td>
    </tr>

    <tr>
        <td>Newsletter Subscription:</td>
        <td>${patient.receiveNewsletter}</td>
    </tr>
    <tr>
        <td>Hobbies:</td>
        <td>
            <c:forEach var="hobby" items="${patient.hobbies}">
                ${hobby}<br/>
            </c:forEach>
        </td>
    </tr>
    <tr>
        <td>Crush:</td>
        <td>
            ${patient.crush}
        </td>
    </tr>
</table>
</body>
</html>