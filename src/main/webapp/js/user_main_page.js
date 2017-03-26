function newFolder(folderId)	//这个方法是给userMainPage.jsp添加一个新文件夹时使用的
{
    var folderName=prompt("请输入文件夹的名字","");//将输入的内容赋给变量 name ，
    //这里需要注意的是，prompt有两个参数，前面是提示的话，后面是当对话框出来后，在对话框里的默认值
    if(folderName)//如果返回的有内容
    {
    	folderName = encodeURI(folderName);
    	folderName = encodeURI(folderName);
    	location.href="../folder/newFolder?folderId="+folderId+"&&folderName="+folderName;
    }
}

function deleteFolder(folderId)
{
    if(confirm("确认删除该文件夹？"))
    { 
        location.href="../folder/deleteFolder?folderId="+folderId;
    } 
}