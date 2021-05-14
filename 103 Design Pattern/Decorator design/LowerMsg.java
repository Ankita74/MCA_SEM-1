import java.io.*;
public class LowerMsg extends MsgDecorator
{
	public LowerMsg(Interface msgDec)
	{
		super(msgDec);
	}
	public String message()
	{
		return msgDec.message().toLowerCase();
	}
}