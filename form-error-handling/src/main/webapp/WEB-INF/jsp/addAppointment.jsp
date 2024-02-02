<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 01-02-2024
  Time: 04:45 pm
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
        <td>Patient Gender:</td>
        <td>${patient.patientGender}</td>
    </tr>
    <tr>
        <td>Patient DOB:</td>
        <td>${patient.patientDOB}</td>
    </tr>
    <tr>
        <td>Patient Allergies:</td>
        <td>
            <c:forEach var="allergy" items="${patient.patientAllergies}">
                ${allergy}<br/>
            </c:forEach>
        </td>
    </tr>
    <tr>
        <td colspan="2">Address Details:</td>
    </tr>
    <tr>
        <td>Patient Street:</td>
        <td>${patient.patientAddress.Street}</td>
        <%--        <td>${patient.receiveNewsletter}</td>--%>
    </tr>
    <tr>
        <td>Patient City:</td>
        <td>${patient.patientAddress.City}</td>
    </tr>
    <tr>
        <td>Patient State:</td>
        <td>${patient.patientAddress.State}</td>
    </tr>
    <tr>
        <td>Patient Country:</td>
        <td>${patient.patientAddress.Country}</td>
    </tr>
    <tr>
        <td>Patient Pincode:</td>
        <td>${patient.patientAddress.Pincode}</td>
    </tr>
    <%--    <tr>--%>
    <%--        <td>Hobbies:</td>--%>
    <%--        <td>--%>
    <%--            <c:forEach var="hobby" items="${patient.hobbies}">--%>
    <%--                ${hobby}<br/>--%>
    <%--            </c:forEach>--%>
    <%--        </td>--%>
    <%--    </tr>--%>
    <%--    <tr>--%>
    <%--        <td>Crush:</td>--%>
    <%--        <td>--%>
    <%--&lt;%&ndash;            ${patient.crush}&ndash;%&gt;--%>
    <%--        </td>--%>
    <%--    </tr>--%>
</table>
</body>
</html>