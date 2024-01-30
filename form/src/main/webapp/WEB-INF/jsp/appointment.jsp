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
    <title>Patient Appointment Registration</title>
</head>
<body>
    <h1>Patient Appointment Registration</h1>
    <form method="post" action="addAppointment">
        <p>
            Name:<input type="text" name="patientName"/>
        </p>
        <p>
            Contact No.:<input type="text" name="patientContact" />
        </p>
        <input type="submit" value="Add Appointment" />
    </form>
</body>
</html>
