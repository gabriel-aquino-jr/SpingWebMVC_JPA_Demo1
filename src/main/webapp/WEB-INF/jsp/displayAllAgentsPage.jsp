<%--
  Created by IntelliJ IDEA.
  User: galze
  Date: 2023-02-09
  Time: 3:10 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>ALL AGENTS LIST</title>
</head>
<body>
  <h1>SECRET AGENTS:</h1>
  <c:choose>
    <c:when test="${aListFull}"> <%-- boolean to be set before page loads --%>
      <table>
        <tr>
          <th>ID: </th>
          <th>CODENAME: </th>
          <th>SPECIALTY: </th>
        </tr>
        <c:forEach items="${aList}" var="agent">
        <tr>
          <td>${agent.id}</td>
          <td>${agent.codename}</td>
          <td>${agent.specialty}</td>
        </tr>
        </c:forEach>
      </table>
    </c:when>

    <c:otherwise>
      <h3>THERE ARE NO AGENTS TO DISPLAY</h3>
    </c:otherwise>
  </c:choose>
</body>
</html>
