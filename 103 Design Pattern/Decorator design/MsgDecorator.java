public abstract class MsgDecorator implements Interface
{
	protected Interface msgDec;
	public MsgDecorator(Interface msgDec)
	{
			this.msgDec=msgDec; 
	}
}