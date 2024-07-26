<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <jsp:include page="/WEB-INF/jsp/inc/header_link.jsp"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/common/index.css">
</head>
<body>


Hello ttosjwi


<div class="background-wrapper">

    <main>
        <jsp:include page="/WEB-INF/jsp/common/header.jsp"/>
        <c:forEach begin="0" end="10" var="i">
            <section>
                아 홍보글이에요
            </section>
        </c:forEach>
        <a href="/WEB-INF/jsp/member/my_page.jsp">마이페이지</a>

        <jsp:include page="/WEB-INF/jsp/common/footer.jsp"/>
        <jsp:include page="/WEB-INF/jsp/common/bottom_menu.jsp"/>
    </main>
</div>

</body>
</html>
