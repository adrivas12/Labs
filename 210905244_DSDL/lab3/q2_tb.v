`timescale 1ns/1ns
`include "q2.v"

module q2_tb();
reg a,b,c,d;
wire f;

q2 q2(a,b,c,d,f);
initial begin

	$dumpfile("q2_tb.vcd");
	$dumpvars(0,q2_tb);
	
	a=0;b=0;c=0;d=0;
	#10;
	
	a=0;b=0;c=0;d=1;
	#10;
	
	a=0;b=0;c=1;d=0;
	#10;
	
	a=0;b=0;c=1;d=1;
	#10;
	
	a=0;b=1;c=0;d=0;
	#10;
	
	a=0;b=1;c=0;d=1;
	#10;
	
	a=0;b=1;c=1;d=0;
	#10;
	
	a=0;b=1;c=1;d=1;
	#10;
	
	a=1;b=0;c=0;d=0;
	#10;
	
	a=1;b=0;c=0;d=1;
	#10;
	
	a=1;b=0;c=1;d=0;
	#10;
	
	a=1;b=0;c=1;d=1;
	#10;
	
	a=1;b=1;c=0;d=0;
	#10;
	
	a=1;b=1;c=0;d=1;
	#10;
	
	a=1;b=1;c=1;d=0;
	#10;
	
	a=1;b=1;c=1;d=1;
	#10;
	
	$display("Test complete");
	
end

endmodule
