class Starter{
	
	public static void main(String[] args)
	{
		System.out.println(args);
		System.out.println(args.length);
		System.out.println(args[0]);
		System.out.println(args[1]);
		String movieName=args[0];
		//String movieName="KGF";
		String[] acts=Movie.getActorByMovieName(movieName);
		System.out.println(acts);
		System.out.println(acts[0]);
	}
}