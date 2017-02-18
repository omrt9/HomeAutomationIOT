<?php
if(isset($_GET['door_open']))
{
if($_GET['door_open']==1)
{
exec("gpio write 5 1 ");

}
else
{
   exec("gpio write 5 0");
}
}


if(isset($_GET['door_close']))
{
if($_GET['door_close']==1)
{
exec("gpio write 6 0 ");

}
else
{
   exec("gpio write 6 0");
}
}



?>