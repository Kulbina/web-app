<%@ page import="com.example.webapplication.entity.Person" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

....
<html>
<head>
    <title>Page</title>
</head>
<body>
<div class="form-inline">
    <input class="form-control" [(ngModel)]="text" placeholder = "Name" />
    <button class="btn btn-default" (click)="addItem(text, price)">Add</button>
</div>
<table width="90%" cellpadding="5" cellspacing="0">
    <tr>
        <th>Name</th>
        <th>Date</th>
        <th></th>
    </tr>
    <tbody>
    <tr *ngFor="let item of items">
        <td></td>
        <td></td>
        <td><button class="btn btn-default" (click)="addItem(text, price)">Delete</button></td>
    </tr>
    </tbody>
</table>
</body>
</html>
