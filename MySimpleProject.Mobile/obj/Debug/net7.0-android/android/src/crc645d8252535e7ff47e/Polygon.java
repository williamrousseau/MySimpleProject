package crc645d8252535e7ff47e;


public class Polygon
	extends crc645d8252535e7ff47e.Shape
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Microsoft.UI.Xaml.Shapes.Polygon, Uno.UI", Polygon.class, __md_methods);
	}


	public Polygon (android.content.Context p0)
	{
		super (p0);
		if (getClass () == Polygon.class) {
			mono.android.TypeManager.Activate ("Microsoft.UI.Xaml.Shapes.Polygon, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
