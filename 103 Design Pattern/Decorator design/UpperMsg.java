import java.io.*;
public class UpperMsg extends MsgDecorator
{
	public UpperMsg(Interface msgDec)
	{
		super(msgDec);
	}
	public String message()
	{
		return msgDec.message().toUpperCase();
	}
}