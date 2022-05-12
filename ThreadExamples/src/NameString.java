
	class InvalidException extends Exception
	{
		public InvalidException(int age, String name)
		{
		super(name);
		}
	}
	public class NameString {
		static void validate(int age,String name) throws InvalidException
		{
			if(name=="maitrai" && age==23)
			{
				System.out.println("My name is maitrai");
				System.out.println("My age is 23");
			}
			else
			{
				System.out.println("Error");
				throw new InvalidException(0, "Name is Wrongly Typed");
			}
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try
			{
				validate(23, "maitrai");
			}
			catch(InvalidException e)
			{
				System.out.println("Exception Occured");
				System.out.println(e);
			}
		}
	}


