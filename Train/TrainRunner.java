class TrainRunner{
	
	public static void main(String[] donkey)
	{
		Train train=new Train();
		train.transport();
		train.start();
		System.out.println();
		Train.start();
		train =new Train();
	}
}