<%@page import="model.Article"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Catalogue</title>
		<style type="text/css">
		
		body{
			background-color:#e5e8ff;
		}
		
		header{
		width:100%;
		display:flex;
		align-items:center;
		justify-content:center;
		text-align: center;
		color:#5a2fb7;
		}
		
		select{
			padding:5px;
		}
		
		h3{
		display:inline;
		margin:10px 150px ;
		}
		
		td{
		padding:10px;
		border: 1px solid #5a2fb7;
		}
		
		table{
		width:80%;
		border-collapse: collapse;
		margin-left:100px;
		margin-top:30px;
		
		
		}
		
		hr.solid {
		  border-top: 2px solid #bbb;
		  margin: 20px;
		}
		
		th{
		background-color:#eee;
		border-collapse: collapse;
		border: 2px solid #5a2fb7;
		}
		
		img{
				height: 70px;
				width:70px;
			}
		
		
		</style>
	</head>
	<body>
		
		<header>
		<div>
			<h1>Catalogue</h1>
		</div>
	</header>
	
	<h3>Choisissez le genre : </h3>
	
	<select name="genre" id="genre">
	 	<option value="jazz">Jazz</option>
	    <option value="pop">Pop</option>
		<option value="rap">Rap</option>
	</select>	

	<hr class="solid">
	
	<table role="grid">
		<thead>
			<tr classe="row">
				<th scope="col">Reference</th>
				<th scope="col">titre</th>
				<th scope="col">auteur</th>
				<th scope="col">photo</th>
				<th scope="col">prix</th>
				<th scope="col"></th>
			</tr>
		</thead>
		<tbody>
		
		<%
			java.util.List<Article> articles = (java.util.List<Article>) request.getAttribute("articles");
		
			
				for(int i=0; i< articles.size();i++){
					System.out.println(articles.get(i).getImage());
					%>
					<tr>
            			<th scope="row"> <a href=<%= "ArticleDetails?Reference=" +articles.get(i).getCodeArticle()%> >  <%= articles.get(i).getCodeArticle() %></a></th>
            			<td><%= articles.get(i).getDestination() %></td>
            			<td><%= articles.get(i).getAuteur() %></td>
            			
            			<td><img src='<%= articles.get(i).getImage()%>'></td>
            			
            			<td><%= articles.get(i).getPrix() %></td>
            			<td><a >Ajouter au panier</a></td>
					</tr>
					
			<%	}
				%>
			
			
			
			
        </tbody>
      </table>				  
						 						 
						 
		
	</body>
</html>