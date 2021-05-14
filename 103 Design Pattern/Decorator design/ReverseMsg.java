
public class ReverseMsg extends MsgDecorator
{
	public ReverseMsg(Interface msgDec)
	{
		super(msgDec);
	}
	public String message()
	{
		StringBuilder input1 = new StringBuilder();
		input1.append(msgDec.message());
		input1=input1.reverse();
		System.out.println(input1);
		return msgDec.message();
	}
}