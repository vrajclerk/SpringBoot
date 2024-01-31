<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 31-01-2024
  Time: 06:09 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>

    <title>Patient Appointment Registration</title>
</head>
<body>
<h1>${mainHeader}</h1>
<h1>Patient Appointment Registration</h1>
<%--@elvariable id="patient" type="com"--%>
<form:form method="post" action="addAppointment" modelAttribute="patient">
    <table>
        <tr>
            <td>Name:</td>
            <td> <form:input type="text" path="patientName"/></td>
        </tr>
        <tr>
            <td>Contact No.:</td>
            <td><form:input type="text" path="patientContact" /></td>
        </tr>

        <tr>
            <td>Subscribe to Newsletter?</td>
            <td>
                <form:checkbox path="receiveNewsletter" />
            </td>
        </tr>
        <tr>
        <td>Hobbies:</td>
        <td>
            Cricket:<form:checkbox path="hobbies" value="Cricket"/>
            Music:<form:checkbox path="hobbies" value="Music"/>
            Smartphone:<form:checkbox path="hobbies" value="Smartphone"/>
        </td>
        </tr>

        <tr>
            <td>Crush:</td>
            <td>
                Ellyse Perry:<form:checkbox path="crush" value="Ellyse Perry" />
            </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Add Appointment" /></td>
        </tr>
    </table>
</form:form>
</body>
</html>

