<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ECE Exam Details</title>
<style>
	.branch{
		width:300px;
	}
	.session{
		width:135px;
	}
</style>
</head>
<body>
<%
	String branch = request.getParameter("ECE");
%>
	<form action="AddExamDetails">
		<input class="branch" type="text" name="branch" readonly="readonly" value="<% out.println(branch); %>">
		<table>
		<tr>
			<td colspan="7"><p>ECE Sem 1</p></td>
			</tr>
			<tr>
				<td>17MAT11</td>
				<td>17PHY12</td>
				<td>17CIV13</td>
				<td>17EME14</td>
				<td>17ELE15</td>
				<td>Session</td>
			</tr>
			<tr>
				<td><input type="date" name="17mat11"></td>
				<td><input type="date" name="17phy12"></td>
				<td><input type="date" name="17civ13"></td>
				<td><input type="date" name="17eme14"></td>
				<td><input type="date" name="17ele15"></td>
				<td><input class="session" type="text" name="session1"></td>
				
			</tr>
			<tr>
			<td colspan="7"><p>ECE Sem 2</p></td>
			</tr>
			<tr>
				<td>17MAT21</td>
				<td>17CHE22</td>
				<td>17PCD23</td>
				<td>17ELN25</td>
				<td>17CIV28</td>
				<td>Session</td>
			</tr>
			<tr>
				<td><input type="date" name="17MAT21"></td>
				<td><input type="date" name="17CHE22"></td>
				<td><input type="date" name="17PCD23"></td>
				<td><input type="date" name="17ELN25"></td>
				<td><input type="date" name="17CIV28"></td>
				<td><input class="session" type="text" name="session2"></td>
				
			</tr>
			<tr>
				<td colspan="7"><p>ECE Sem 3</p></td>
			</tr>
			<tr>
				<td>17MAT31</td>
				<td>17EC32</td>
				<td>17EC33</td>
				<td>17EC34</td>
				<td>17EC35</td>
				<td>17EC36</td>
				<td>Session</td>
			</tr>
			<tr>
				<td><input type="date" name="17MAT31"></td>
				<td><input type="date" name="17CS32"></td>
				<td><input type="date" name="17CS33"></td>
				<td><input type="date" name="17CS34"></td>
				<td><input type="date" name="17CS35"></td>
				<td><input type="date" name="17CS36"></td>
				<td><input class="session" type="text" name="session3"></td>
				
			</tr>
			<tr>
				<td colspan="7"><p>ECE Sem 4</p></td>
			</tr>
			<tr>
				<td>17MAT41</td>
				<td>17EC42</td>
				<td>17EC43</td>
				<td>17EC44</td>
				<td>17EC45</td>
				<td>17EC46</td>
				<td>Session</td>
			</tr>
			<tr>
				<td><input type="date" name="17MAT41"></td>
				<td><input type="date" name="17CS42"></td>
				<td><input type="date" name="17CS43"></td>
				<td><input type="date" name="17CS44"></td>
				<td><input type="date" name="17CS45"></td>
				<td><input type="date" name="17CS46"></td>
				<td><input class="session" type="text" name="session4"></td>
				
			</tr>
			<tr>
				<td colspan="7"><p>ECE Sem 5</p></td>
			</tr>
			<tr>
				<td>17EC51</td>
				<td>17EC52</td>
				<td>17EC53</td>
				<td>17EC54</td>
				<td>17EC55*</td>
				<td>17EC56*</td>
				<td>Session</td>
			</tr>
			<tr>
				<td><input type="date" name="17CS51"></td>
				<td><input type="date" name="17CS52"></td>
				<td><input type="date" name="17CS53"></td>
				<td><input type="date" name="17CS54"></td>
				<td><input type="date" name="17CS55*"></td>
				<td><input type="date" name="17CS56*"></td>
				<td><input class="session" type="text" name="session5"></td>
				
			</tr>
			<tr>
				<td colspan="7"><p>ECE Sem 6</p></td>
			</tr>
			<tr>
				<td>17EC61</td>
				<td>17EC62</td>
				<td>17EC63</td>
				<td>17EC64</td>
				<td>17EC65*</td>
				<td>17EC66*</td>
				<td>Session</td>
			</tr>
			<tr>
				<td><input type="date" name="17CS61"></td>
				<td><input type="date" name="17CS62"></td>
				<td><input type="date" name="17CS63"></td>
				<td><input type="date" name="17CS64"></td>
				<td><input type="date" name="17CS65*"></td>
				<td><input type="date" name="17CS66*"></td>
				<td><input class="session" type="text" name="session6"></td>
				
			</tr>
			<tr>
				<td colspan="7"><p>ECE Sem 7</p></td>
			</tr>
			<tr>
				<td>17EC71</td>
				<td>17EC72</td>
				<td>17EC73</td>
				<td>17EC74*</td>
				<td>17EC75*</td>
				<td>Session</td>
			</tr>
			<tr>
				<td><input type="date" name="17CS71"></td>
				<td><input type="date" name="17CS72"></td>
				<td><input type="date" name="17CS73"></td>
				<td><input type="date" name="17CS74*"></td>
				<td><input type="date" name="17CS75*"></td>
				<td><input class="session" type="text" name="session7"></td>
				
			</tr>
			<tr>
				<td colspan="7"><p>ECE Sem 8</p></td>
			</tr>
			<tr>
				<td>17EC81</td>
				<td>17EC82</td>
				<td>17EC83*</td>
				<td>Session</td>
			</tr>
			<tr>
				<td><input type="date" name="17CS81"></td>
				<td><input type="date" name="17CS82"></td>
				<td><input type="date" name="17CS83*"></td>
				<td><input class="session" type="text" name="session8"></td>
				
			</tr>
			<tr>
				<td colspan="7"><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form>
	
</body>
</html>