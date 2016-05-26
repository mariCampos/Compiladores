program NandoReis;
function musica(var acustico:integer) : integer;
var andar:integer;
var all:integer;
var star:integer;
var azul:integer;
begin 
	all:=1;
	star:=2;
	azul:=3;
	andar:=acustico;
end;
begin
	musica(12);
	if(andar = 12) then
		writeln(certo);
end