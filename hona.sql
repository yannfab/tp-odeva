insert into candidatbis values(1, tvoeux(1,2,3), tnotes(tnote(1,10.5),tnote(2,8.9)));
select * from candidatbis ;
delete from candidatbis ;*/
select priorite from voeux v where idc = 1000;
select note from note where IDCAND=1000;

declare
cursor c is select idcand from candidats;
cursor n is select note from note;
cursor v is select priorite from voeux;

vx tvoeux;
begin
 for a in c
  for b in n
   for d in v
 insert into candidatbis

 
vx:= tvoeux();

end;

