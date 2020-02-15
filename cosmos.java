class cosmos
{
	public static void main(String args[])
	{
		String a;
		int count,i=0;
		count=args.length;
		System.out.println("Number of arguments ="+count);
		while(i<+count){
			a=args[i];
			i=i+1;
			System.out.println(i+": Java is "+a+"!");
			}
	}
}