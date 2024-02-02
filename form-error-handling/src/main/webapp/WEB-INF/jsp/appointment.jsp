<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 01-02-2024
  Time: 04:44 pm
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
            <td>
                <form:errors path="patientName" style="color:red"/> <br/>
                <form:input type="text" path="patientName"/></td>
        </tr>
        <tr>
            <td>Contact No.:</td>
            <td>
                <form:errors path="patientContact" style="color:red"/> <br/>
                <form:input type="text" path="patientContact" /></td>
        </tr>

        <tr>
            <td>Gender:</td>
            <td>
                <form:errors path="patientGender" style="color:red"/> <br/>
                <form:radiobutton path="patientGender" value="Male" label="Male"/>
                <form:radiobutton path="patientGender" value="Female" label="Female"/>
            </td>
        </tr>
        <tr>
            <td>Date of Birth:</td>
            <td>
                <form:errors path="patientDOB" style="color:red"/> <br/>
                <form:input path="patientDOB" type="date" />
                    <%--            Cricket:<form:checkbox path="hobbies" value="Cricket"/>--%>
                    <%--            Music:<form:checkbox path="hobbies" value="Music"/>--%>
                    <%--            Smartphone:<form:checkbox path="hobbies" value="Smartphone"/>--%>
            </td>
        </tr>

        <tr>
            <td>Allergies:</td>
            <td>
                <form:checkboxes path="patientAllergies" items="${allergyList}" />
                    <%--                Ellyse Perry:<form:checkbox path="crush" value="Ellyse Perry" />--%>
            </td>
        </tr>
        <tr>
            <td colspan="2">Address Details:</td>
        </tr>
        <tr>
            <td>Street:</td>
            <td>
                <form:errors path="patientAddress.street" style="color:red"/> <br/>
                <form:input path="patientAddress.street" type="text" />
            </td>
        </tr>
        <tr>
            <td>City:</td>
            <td>
                <form:errors path="patientAddress.City" style="color:red"/><br/>
                <form:input path="patientAddress.City" type="text" />
            </td>
        </tr>
        <tr>
            <td>State:</td>
            <td>
                <form:errors path="patientAddress.State" style="color:red"/><br/>
                <form:input path="patientAddress.State" type="text" />
            </td>
        </tr>
        <tr>
            <td>Country:</td>
            <td>
                <form:errors path="patientAddress.Country" style="color:red"/><br/>
                <form:select path="patientAddress.Country">
                    <form:options items="${countryList}"/>
                </form:select>
            </td>
        </tr>
        <tr>
            <td>Pincode:</td>
            <td>
                <form:errors path="patientAddress.Pincode" style="color:red"/><br/>
                <form:input path="patientAddress.Pincode" type="number" />
            </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Add Appointment" /></td>
        </tr>
    </table>
</form:form>
</body>
</html>