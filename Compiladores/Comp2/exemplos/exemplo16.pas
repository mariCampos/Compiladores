program pzim;
var num1:integer;
var num2:integer;
var num3:integer;
var num4:integer;

begin
if(num1>num2) then
	num3 := num1;
else
	if(num2>num3) then
		num4 := num2;
	else
		num4:=num3;
	endif;
endif;

end