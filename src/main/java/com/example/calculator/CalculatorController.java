package com.example.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalculatorController {

	/* http://localhost:8080 */
	/* root url */
	@GetMapping("/")
	@ResponseBody	
	public String home() {
		return "<h1> Welcome to Spring boot path variable and  Request Parameter</h1>";
	}	
	
	/* http://localhost:8080/add/10/20 */
	@GetMapping("/add/{a}/{b}")
	@ResponseBody
	public int add(@PathVariable("a") int a, @PathVariable("b") int b) {
		return a+b;
	}
	
	/* http://localhost:8080/addition?a=10&b=20 */
	@GetMapping("/addition")
	@ResponseBody
	public int addition(@RequestParam("a") int a, @RequestParam(value="b", defaultValue = "20") int b) {
		return a+b;
	}
	/* http://localhost:8080/subtraction?a=200&b=100 */
	@GetMapping("/subtraction")
	@ResponseBody
	public int subtraction(@RequestParam("a") int a, @RequestParam(value="b", defaultValue = "0") int b) {
		return a-b;
	}
	/* http://localhost:8080/multiplication?a=200&b=100 */
	@GetMapping("/multiplication")
	@ResponseBody
	public int multiplication(@RequestParam("a") int a, @RequestParam(value="b", defaultValue = "1") int b) {
		return a*b;
	}
	/* http://localhost:8080/division?a=200&b=100 */
	@GetMapping("/division")
	@ResponseBody
	public int division(@RequestParam("a") int a, @RequestParam(value="b", defaultValue = "1") int b) {
		return a/b;
	}
	
	/* http://localhost:8080/babaji */
	@GetMapping("/babaji")
	@ResponseBody
	public String babaji() {
		return "Welcome to Spring Web App";
	}
		
	
}
