`timescale 1ns/1ns
`include "q2.v"

module q2_tb();
parameter n=4;
reg [n-1:0]g;
wire [n-1:0]b;

q2 q2(g, b);
initial
begin
	$dumpfile("q2_tb.vcd");
	$dumpvars(0, q2_tb);

	g=4'b0001;
	#10;
	g=4'b1100;
	#10

	$display("Test complete");
end
endmodule