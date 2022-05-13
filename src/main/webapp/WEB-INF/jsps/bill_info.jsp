<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill memo...</title>
</head>
<body>
<h2>Bill Memo..</h2>
 Id : ${bill.id}<br/>
 First Name : ${bill.firstName}<br/>
 last Name : ${bill.lastName}<br/>
 email : ${bill.email}<br/>
 Mobile : ${bill.mobile}<br/>
  Product Name : ${bill.productName}<br/>
  Amount : ${bill.amount}<br/>
 
 <form action="listallbills" method ="post">
  <input type ="submit" value ="List all Bill"/>
</form>

</body>
</html>