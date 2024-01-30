<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 30-01-2024
  Time: 06:54 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    </table>
</body>
</html>
