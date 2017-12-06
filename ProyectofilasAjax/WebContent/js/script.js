/**
 * 
 */
//alert("estoy corriendo");
var xhr = new XMLHttpRequest();
var num= 1;
document.getElementById('AgregarRegistro').onclick = function (evnt) 
{
	xhr.open("get","index.jsp",true);
	xhr.onreadystatechange = function()
		{
			if(xhr.readyState == 4 && xhr.status==200)
				{
					document.getElementById('tcuerpo').innerHTML+= "<tr><td>"+num+"</td><td>"+num+"</td><td>"+num+"</td></tr>";
					num++;
					
				}
		}
	xhr.send();
}
