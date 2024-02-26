package com.obj.run;

import com.obj.model.vo.People;

public class PopleMain {

	public static void main(String[] args) {
		People ple1=new People();
		ple1.setPeopleName("유병승");
		ple1.setPeopleAge(19);
		ple1.setPeopleGender('남');
		ple1.setPeopleHeight(180.5);
		//System.out.println(ple1.getPeopleName()+" "+ple1.getPeopleGender()+" "+ple1.getPeopleGender()+" "+ple1.getPeopleHeight());
		System.out.println(ple1.infoPeople());
	}

}
