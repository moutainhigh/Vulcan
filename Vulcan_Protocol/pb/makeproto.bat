FOR %%p in (.\*.proto) do protoc.exe -I=.\ --java_out=..\src\main\java\ %%p