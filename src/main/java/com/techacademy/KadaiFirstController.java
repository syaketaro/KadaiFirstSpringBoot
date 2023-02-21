package com.techacademy;



//import java.time.DayOfWeek;
import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class KadaiFirstController {
	
	@GetMapping("/dayofweek/{yyyymmdd}")
	public LocalDate dispDayOfWeek(@PathVariable String yyyymmdd) {
		LocalDate youbi = LocalDate.parse(yyyymmdd, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		return youbi;
	}
	
	
	
	/*@GetMapping("/dayofweek/{yyyy}/{mm}/{dd}")
	public DayOfWeek dispDayOfWeek(@PathVariable int yyyy,@PathVariable int mm, @PathVariable int dd) {
		LocalDate week = LocalDate.of(yyyy, mm, dd);
		return week.getDayOfWeek();
	}
	*/
	
	/*@GetMapping("now")
	public String dispTime() {
		String now = LocalDateTime.now().format( DateTimeFormatter.ofPattern("HH:mm:ss") );
		
		return "現在時刻:" + now;
	}
	*/
	@GetMapping("/plus/{val1}/{val2}")
	public int calcPlus(@PathVariable int val1, @PathVariable int val2) {
		int res = 0;
		res = val1 + val2;
		return res;
	}
	
	@GetMapping("/minus/{val1}/{val2}")
	public int calcMinus(@PathVariable int val1, @PathVariable int val2) {
		int res = 0;
		res = val1 - val2;
		return res;
	}
	
	@GetMapping("/times/{val1}/{val2}")
	public int calcTimes(@PathVariable int val1, @PathVariable int val2) {
		int res = 0;
		res = val1 * val2;
		return res;
	}
	
	@GetMapping("/divide/{val1}/{val2}")
	public int calcDivide(@PathVariable int val1, @PathVariable int val2) {
		int res = 0;
		res = val1 / val2;
		return res;
	}
	
	
}
