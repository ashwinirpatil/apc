import java.io.*;
class Testcode_implementation implements Testcode_interface
{

 public int additiontest(String s, String ff)
  {
   boolean success = false;
    
    String check="";
    int program=0;
   int count2=0;
   
   try
   {
	 			
				//String s1="/home/ttt/moodle-test/userid";
				File f=new File(s);
				
				String compile1= "gcc "+ff+" -o addd";
	 				
			Process p1 = Runtime.getRuntime().exec(compile1,null,f);
		try
		{
		p1.waitFor();
		}catch(Exception eee){}
		
		
        BufferedReader stdError1 = new BufferedReader(new InputStreamReader(p1.getErrorStream()));
			if((stdError1.readLine())== null)
			{
			  System.out.println("1- right");
			  success=true;
			
			}
			else
			{
			  System.out.println("1-wrong");
			  success= false;
			}

			if(success)	
	 		{
	 			//String compile2 = "gcc "+fil+"2.c -o putt";
	 			String run2 = "./addd";
				String input12[] = new String[3]; String input22[] = new String[3];
				String output2[] = new String[3];
				input12[0]= "1";
				input12[1]= "1";
				input12[2]="0";
				input22[0]= "2";
				input22[1]= "9";
				input22[2]="1";
				output2[0]= "3";
				output2[1]= "10";
				output2[2]="1";
				
			//Process pp2 = Runtime.getRuntime().exec(compile2,null,f);
       		//System.out.println("tttttttttttttttttttt "+pp2.waitFor());
				for(int i=0;i<3;i++)
				{
	
		System.out.println(input12[i]+input22[i]+output2[i]);
        //Process pp2 = Runtime.getRuntime().exec(compile2,null,f);
        Process p2 = Runtime.getRuntime().exec(run2,null,f);
				
				 BufferedReader br2 = new BufferedReader(new InputStreamReader(p2.getInputStream()));
        //System.out.println(br2.readLine());
        //br2.close();
        BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(p2.getOutputStream()));
        String in1 =(input12[i]).toString();
        bw2.write(in1+"\n");
		String in2 =(input22[i]).toString();
        bw2.write(in2+"\n");
        bw2.close();
        System.out.println("input submitted: "+in1 +in2);
        //BufferedReader br3 = new BufferedReader(new InputStreamReader(p2.getInputStream()));
        String outt=null; String readconsole=null;
		while((readconsole=br2.readLine())!=null)
		 {outt =outt +" "+readconsole+" " ;} 
        
        br2.close();
	System.out.println("output from other processs: "+outt);
	if(outt.matches(".*"+output2[i]+".*"))
	{
	  System.out.println("right");
	  count2++;
	}
	}
	if(count2==3)
	{
	System.out.println("Program correct");
	program++;
	check = ""+check;
	}
	else
	{
		System.out.println("Program just wrong");
	}
		System.out.println(program+check);
	}
	else
	{
	 System.out.println("Program wrong");
	}
	
    }catch(Exception e2){System.out.println("run time error2, so wrong"+e2);}
    	
    	
  return count2;

  }


  
  public int sumchecktest(String s,String ff)
 { 
        boolean success = false;
    
    String check="";
    int program=0;
    int count2=0;
			try
	 		{
	 		File f=new File(s);
				
				String compile1= "gcc "+ff+" -o sum";
	 				
			Process p1 = Runtime.getRuntime().exec(compile1,null,f);
		try
		{
		p1.waitFor();
		}catch(Exception eee){}
		
		
        BufferedReader stdError1 = new BufferedReader(new InputStreamReader(p1.getErrorStream()));
			if((stdError1.readLine())== null)
			{
			  System.out.println("1- right");
			  success=true;
			
			}
			else
			{
			  System.out.println("1-wrong");
			  success= false;
			}

			if(success)	
	 		{
	 			//String compile2 = "gcc "+fil+"2.c -o putt";
	 			String run2 = "./sum";
				String input12[] = new String[3]; String input22[] = new String[3];
				String output2[] = new String[3];String output22[] = new String[3];
				input12[0]= "1";
				input12[1]= "100";
				input12[2]="0";
				input22[0]= "2";
				input22[1]= "9";
				input22[2]="1";
				output2[0]= "3";
				output2[1]= "109";
				output2[2]="1";
				output22[0]= "less";
				output22[1]= "greater";
				output22[2]="less";
				
			//Process pp2 = Runtime.getRuntime().exec(compile2,null,f);
       		//System.out.println("tttttttttttttttttttt "+pp2.waitFor());
				for(int i=0;i<3;i++)
		{
	
		System.out.println(input12[i]+input22[i]+output2[i]);
        //Process pp2 = Runtime.getRuntime().exec(compile2,null,f);
        Process p2 = Runtime.getRuntime().exec(run2,null,f);
				
				 BufferedReader br2 = new BufferedReader(new InputStreamReader(p2.getInputStream()));
        //System.out.println(br2.readLine());
        //br2.close();
        BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(p2.getOutputStream()));
        String in1 =(input12[i]).toString();
        bw2.write(in1+"\n");
		String in2 =(input22[i]).toString();
        bw2.write(in2+"\n");
        bw2.close();
        System.out.println("input submitted: "+in1 +in2);
        //BufferedReader br3 = new BufferedReader(new InputStreamReader(p2.getInputStream()));
        String outt=null; String readconsole=null;
		while((readconsole=br2.readLine())!=null)
		 {outt =outt +" "+readconsole+" " ;} 
        
        br2.close();
	System.out.println("output from other processs: "+outt);
	if(outt.matches(".*"+output2[i]+".*") && outt.matches(".*"+output22[i]+".*"))
	{
	  System.out.println("right");
	  count2++;
	}
	}
	if(count2==3)
	{
	System.out.println("Program correct");
	program++;
	check = ""+check;
	}
	else
	{
		System.out.println("Program just wrong");
	}
		System.out.println(program+check);
	}
	else
	{
	 System.out.println("Program wrong");
	}
	
    }catch(Exception e2){System.out.println("run time error2, so wrong"+e2);}
    	
	 
return count2;
}
 
 
  public int perimetertest(String s,String ff)
 {
    boolean success = false;
    
    String check="";
    int program=0;
    int count2=0;
			try
	 		{
	 		File f=new File(s);
				
				String compile1= "gcc "+ff+" -o peri";
	 				
			Process p1 = Runtime.getRuntime().exec(compile1,null,f);
		try
		{
		p1.waitFor();
		}catch(Exception eee){}
		
		
        BufferedReader stdError1 = new BufferedReader(new InputStreamReader(p1.getErrorStream()));
			if((stdError1.readLine())== null)
			{
			  System.out.println("1- right");
			  success=true;
			
			}
			else
			{
			  System.out.println("1-wrong");
			  success= false;
			}

			if(success)	
	 		{
	 		//String compile2 = "gcc "+fil+"2.c -o putt";
	 			String run2 = "./peri";
				String input12[] = new String[3]; //String input22[] = new String[3];
				String output2[] = new String[3];
				input12[0]= "11";
				input12[1]= "123";
				input12[2]="987";
				
				output2[0]= "44";
				output2[1]= "492";
				output2[2]="3948";
				
			//Process pp2 = Runtime.getRuntime().exec(compile2,null,f);
       		//System.out.println("tttttttttttttttttttt "+pp2.waitFor());
				for(int i=0;i<3;i++)
				{
	
		System.out.println(input12[i]+output2[i]);
        //Process pp2 = Runtime.getRuntime().exec(compile2,null,f);
        Process p2 = Runtime.getRuntime().exec(run2,null,f);
				
				 BufferedReader br2 = new BufferedReader(new InputStreamReader(p2.getInputStream()));
        //System.out.println(br2.readLine());
        //br2.close();
        BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(p2.getOutputStream()));
        String in1 =(input12[i]).toString();
        bw2.write(in1+"\n");
		//String in2 =(input22[i]).toString();
        //bw2.write(in2+"\n");
        bw2.close();
        System.out.println("input submitted: "+in1);
        //BufferedReader br3 = new BufferedReader(new InputStreamReader(p2.getInputStream()));
        String outt=null; String readconsole=null;
		while((readconsole=br2.readLine())!=null)
		 {outt =outt +" "+readconsole+" " ;} 
        
        br2.close();
	System.out.println("output from other processs: "+outt);
	if(outt.matches(".*"+output2[i]+".*"))
	{
	  System.out.println("right");
	  count2++;
	}
	}
	if(count2==3)
	{
	System.out.println("Program correct");
	program++;
	check = ""+check;
	}
	else
	{
		System.out.println("Program just wrong");
	}
		System.out.println(program+check);
	}
	else
	{
	 System.out.println("Program wrong");
	}
    }catch(Exception e2){System.out.println("run time error2, so wrong"+e2);}
 return count2;   	
 }
 
 
  public int averagetest(String s, String ff)
  {
   boolean success = false;
    
    String check="";
    int program=0;
   int count2=0;
   
   try
   {
	 			
				//String s1="/home/ttt/moodle-test/userid";
				File f=new File(s);
				
				String compile1= "gcc "+ff+" -o avg";
	 				
			Process p1 = Runtime.getRuntime().exec(compile1,null,f);
		try
		{
		p1.waitFor();
		}catch(Exception eee){}
		
		
        BufferedReader stdError1 = new BufferedReader(new InputStreamReader(p1.getErrorStream()));
			if((stdError1.readLine())== null)
			{
			  System.out.println("1- right");
			  success=true;
			
			}
			else
			{
			  System.out.println("1-wrong");
			  success= false;
			}

			if(success)	
	 		{
	 			//String compile2 = "gcc "+fil+"2.c -o putt";
	 			String run2 = "./avg";
				String input12[] = new String[3]; String input22[] = new String[3];String input32[] = new String[3];
				String output2[] = new String[3];
				input12[0]= "50";
				input12[1]= "30";
				input12[2]="65";
				
				input22[0]= "72";
				input22[1]= "65";
				input22[2]="58";
				
				input32[0]= "35";
				input32[1]= "46";
				input32[2]="88";
			
				output2[0]= "52.33";
				output2[1]= "47.00";
				output2[2]="70.33";
				
			//Process pp2 = Runtime.getRuntime().exec(compile2,null,f);
       		//System.out.println("tttttttttttttttttttt "+pp2.waitFor());
				for(int i=0;i<3;i++)
				{
	
		System.out.println(input12[i]+input22[i]+input32[i]+output2[i]);
        //Process pp2 = Runtime.getRuntime().exec(compile2,null,f);
        Process p2 = Runtime.getRuntime().exec(run2,null,f);
				
				 BufferedReader br2 = new BufferedReader(new InputStreamReader(p2.getInputStream()));
        //System.out.println(br2.readLine());
        //br2.close();
        BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(p2.getOutputStream()));
        String in1 =(input12[i]).toString();
        bw2.write(in1+"\n");
		String in2 =(input22[i]).toString();
        bw2.write(in2+"\n");
        String in3 =(input32[i]).toString();
        bw2.write(in3+"\n");
        bw2.close();
        System.out.println("input submitted: "+in1 +in2+in3);
        //BufferedReader br3 = new BufferedReader(new InputStreamReader(p2.getInputStream()));
        String outt=null; String readconsole=null;
		while((readconsole=br2.readLine())!=null)
		 {outt =outt +" "+readconsole+" " ;} 
        
        br2.close();
	System.out.println("output from other processs: "+outt);
	if(outt.matches(".*"+output2[i]+".*"))
	{
	  System.out.println("right");
	  count2++;
	}
	}
	if(count2==3)
	{
	System.out.println("Program correct");
	program++;
	check = ""+check;
	}
	else
	{
		System.out.println("Program just wrong");
	}
		System.out.println(program+check);
	}
	else
	{
	 System.out.println("Program wrong");
	}
	
    }catch(Exception e2){System.out.println("run time error2, so wrong"+e2);}
    	
    	
  return count2;

  }

 
 
 
 public int interesttest(String s, String ff)
 {
  boolean success = false;
    
    String check="";
    int program=0;
    int count2=0;
			try
	 		{
	 		File f=new File(s);
				
				String compile1= "gcc "+ff+" -o interest";
	 				
			Process p1 = Runtime.getRuntime().exec(compile1,null,f);
		try
		{
		p1.waitFor();
		}catch(Exception eee){}
		
		
        BufferedReader stdError1 = new BufferedReader(new InputStreamReader(p1.getErrorStream()));
			if((stdError1.readLine())== null)
			{
			  System.out.println("1- right");
			  success=true;
			
			}
			else
			{
			  System.out.println("1-wrong");
			  success= false;
			}

			if(success)	
	 		{
	 			String run2 = "./interest";
				String input12[] = new String[3]; String input22[] = new String[3];String input32[] = new String[3];
				String output2[] = new String[3];
				input12[0]= "100";  
				input12[1]= "990";
				input12[2]="54";
				
				
				input22[0]= "10";
				input22[1]= "3";
				input22[2]= "50";
				
				
				input32[0]= "1";
				input32[1]= "10";
				input32[2]="20";
				
				output2[0]= "10";
				output2[1]= "297";
				output2[2]="540";
				
			//Process pp2 = Runtime.getRuntime().exec(compile2,null,f);
       		//System.out.println("tttttttttttttttttttt "+pp2.waitFor());
				for(int i=0;i<3;i++)
				{
	
		System.out.println(input12[i]+input22[i]+output2[i]);
        //Process pp2 = Runtime.getRuntime().exec(compile2,null,f);
        Process p2 = Runtime.getRuntime().exec(run2,null,f);
				
				 BufferedReader br2 = new BufferedReader(new InputStreamReader(p2.getInputStream()));
        //System.out.println(br2.readLine());
        //br2.close();
        BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(p2.getOutputStream()));
        String in1 =(input12[i]).toString();
        bw2.write(in1+"\n");
	String in2 =(input22[i]).toString();
        bw2.write(in2+"\n");
        String in3 =(input32[i]).toString();
        bw2.write(in3+"\n");
        
        bw2.close();
        System.out.println("input submitted: "+in1+in2+in3);
        //BufferedReader br3 = new BufferedReader(new InputStreamReader(p2.getInputStream()));
        String outt=null; String readconsole=null;
		while((readconsole=br2.readLine())!=null)
		 {outt =outt +" "+readconsole+" " ;} 
        
        br2.close();
	System.out.println("output from other processs: "+outt);
	if(outt.matches(".*"+output2[i]+".*"))
	{
	  System.out.println("right");
	  count2++;
	}
	}
	if(count2==3)
	{
	System.out.println("Program correct");
	program++;
	check = ""+check;
	}
	else
	{
		System.out.println("Program just wrong");
	}
		System.out.println(program+check);
	}
	else
	{
	 System.out.println("Program wrong");
	}
    }catch(Exception e2){System.out.println("run time error2, so wrong"+e2);}
 return count2;   	
 }
 
 
}
