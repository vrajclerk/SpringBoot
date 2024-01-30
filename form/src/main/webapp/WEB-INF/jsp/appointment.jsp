<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 30-01-2024
  Time: 06:54 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <h1>${mainHeader}</h1>
    <title>Patient Appointment Registration</title>
</head>
<body>
    <h1>Patient Appointment Registration</h1>
    <form:form method="post" action="addAppointment">
        <p>
            Name:<form:input type="text" path="patientName"/>
        </p>
        <p>
            Contact No.:<form:input type="text" path="patientContact"/>
        </p>
        <input type="submit" value="Add Appointment" />
    </form:form>
</body>
</html>
