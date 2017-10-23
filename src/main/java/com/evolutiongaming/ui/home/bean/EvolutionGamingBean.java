package com.evolutiongaming.ui.home.bean;

import java.util.ArrayList;
import java.util.List;

public class EvolutionGamingBean {

    private static List<String> checkBoxData=new ArrayList<String>();
    
	public static void setcheckBoxData(List<String> data)
	{
		checkBoxData = data;
	}
	
	public static List<String> getcheckBoxData()
	{
		return checkBoxData;
	}
}
