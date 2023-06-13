package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.C11515b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: JP5 */
/* loaded from: classes.dex */
public class JP5 {

    /* renamed from: a */
    public int f17511a = -1;

    /* renamed from: b */
    public int f17512b = -1;

    /* renamed from: c */
    public int f17513c = -1;

    /* renamed from: d */
    public SparseArray<C4075a> f17514d = new SparseArray<>();

    /* renamed from: e */
    public SparseArray<C11515b> f17515e = new SparseArray<>();

    /* renamed from: f */
    public AbstractC45414mz0 f17516f = null;

    /* renamed from: JP5$a */
    /* loaded from: classes.dex */
    public static class C4075a {

        /* renamed from: a */
        public int f17517a;

        /* renamed from: b */
        public ArrayList<C4076b> f17518b = new ArrayList<>();

        /* renamed from: c */
        public int f17519c;

        /* renamed from: d */
        public boolean f17520d;

        public C4075a(Context context, XmlPullParser xmlPullParser) {
            this.f17519c = -1;
            this.f17520d = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C39341cm4.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C39341cm4.State_android_id) {
                    this.f17517a = obtainStyledAttributes.getResourceId(index, this.f17517a);
                } else if (index == C39341cm4.State_constraints) {
                    this.f17519c = obtainStyledAttributes.getResourceId(index, this.f17519c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f17519c);
                    context.getResources().getResourceName(this.f17519c);
                    if ("layout".equals(resourceTypeName)) {
                        this.f17520d = true;
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void m100505a(C4076b c4076b) {
            this.f17518b.add(c4076b);
        }

        /* renamed from: b */
        public int m100504b(float f, float f2) {
            for (int i = 0; i < this.f17518b.size(); i++) {
                if (this.f17518b.get(i).m100503a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: JP5$b */
    /* loaded from: classes.dex */
    public static class C4076b {

        /* renamed from: a */
        public float f17521a;

        /* renamed from: b */
        public float f17522b;

        /* renamed from: c */
        public float f17523c;

        /* renamed from: d */
        public float f17524d;

        /* renamed from: e */
        public int f17525e;

        /* renamed from: f */
        public boolean f17526f;

        public C4076b(Context context, XmlPullParser xmlPullParser) {
            this.f17521a = Float.NaN;
            this.f17522b = Float.NaN;
            this.f17523c = Float.NaN;
            this.f17524d = Float.NaN;
            this.f17525e = -1;
            this.f17526f = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C39341cm4.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C39341cm4.Variant_constraints) {
                    this.f17525e = obtainStyledAttributes.getResourceId(index, this.f17525e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f17525e);
                    context.getResources().getResourceName(this.f17525e);
                    if ("layout".equals(resourceTypeName)) {
                        this.f17526f = true;
                    }
                } else if (index == C39341cm4.Variant_region_heightLessThan) {
                    this.f17524d = obtainStyledAttributes.getDimension(index, this.f17524d);
                } else if (index == C39341cm4.Variant_region_heightMoreThan) {
                    this.f17522b = obtainStyledAttributes.getDimension(index, this.f17522b);
                } else if (index == C39341cm4.Variant_region_widthLessThan) {
                    this.f17523c = obtainStyledAttributes.getDimension(index, this.f17523c);
                } else if (index == C39341cm4.Variant_region_widthMoreThan) {
                    this.f17521a = obtainStyledAttributes.getDimension(index, this.f17521a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public boolean m100503a(float f, float f2) {
            if (!Float.isNaN(this.f17521a) && f < this.f17521a) {
                return false;
            }
            if (!Float.isNaN(this.f17522b) && f2 < this.f17522b) {
                return false;
            }
            if (!Float.isNaN(this.f17523c) && f > this.f17523c) {
                return false;
            }
            if (!Float.isNaN(this.f17524d) && f2 > this.f17524d) {
                return false;
            }
            return true;
        }
    }

    public JP5(Context context, XmlPullParser xmlPullParser) {
        m100508b(context, xmlPullParser);
    }

    /* renamed from: a */
    public int m100509a(int i, int i2, float f, float f2) {
        C4075a c4075a = this.f17514d.get(i2);
        if (c4075a == null) {
            return i2;
        }
        if (f != -1.0f && f2 != -1.0f) {
            Iterator<C4076b> it = c4075a.f17518b.iterator();
            C4076b c4076b = null;
            while (it.hasNext()) {
                C4076b next = it.next();
                if (next.m100503a(f, f2)) {
                    if (i == next.f17525e) {
                        return i;
                    }
                    c4076b = next;
                }
            }
            if (c4076b != null) {
                return c4076b.f17525e;
            }
            return c4075a.f17519c;
        } else if (c4075a.f17519c == i) {
            return i;
        } else {
            Iterator<C4076b> it2 = c4075a.f17518b.iterator();
            while (it2.hasNext()) {
                if (i == it2.next().f17525e) {
                    return i;
                }
            }
            return c4075a.f17519c;
        }
    }

    /* renamed from: b */
    public final void m100508b(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C39341cm4.StateSet);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C39341cm4.StateSet_defaultState) {
                this.f17511a = obtainStyledAttributes.getResourceId(index, this.f17511a);
            }
        }
        obtainStyledAttributes.recycle();
        try {
            int eventType = xmlPullParser.getEventType();
            C4075a c4075a = null;
            while (true) {
                char c = 1;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType != 2) {
                            if (eventType != 3) {
                                continue;
                            } else if ("StateSet".equals(xmlPullParser.getName())) {
                                return;
                            }
                        } else {
                            String name = xmlPullParser.getName();
                            switch (name.hashCode()) {
                                case 80204913:
                                    if (name.equals("State")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1301459538:
                                    if (name.equals("LayoutDescription")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1382829617:
                                    if (name.equals("StateSet")) {
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1901439077:
                                    if (name.equals("Variant")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            if (c != 2) {
                                if (c == 3) {
                                    C4076b c4076b = new C4076b(context, xmlPullParser);
                                    if (c4075a != null) {
                                        c4075a.m100505a(c4076b);
                                    }
                                }
                            } else {
                                c4075a = new C4075a(context, xmlPullParser);
                                this.f17514d.put(c4075a.f17517a, c4075a);
                            }
                        }
                    } else {
                        xmlPullParser.getName();
                    }
                    eventType = xmlPullParser.next();
                } else {
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: c */
    public int m100507c(int i, int i2, int i3) {
        return m100506d(-1, i, i2, i3);
    }

    /* renamed from: d */
    public int m100506d(int i, int i2, float f, float f2) {
        C4075a c4075a;
        if (i == i2) {
            if (i2 == -1) {
                c4075a = this.f17514d.valueAt(0);
            } else {
                c4075a = this.f17514d.get(this.f17512b);
            }
            if (c4075a == null) {
                return -1;
            }
            if (this.f17513c != -1 && c4075a.f17518b.get(i).m100503a(f, f2)) {
                return i;
            }
            int m100504b = c4075a.m100504b(f, f2);
            if (i == m100504b) {
                return i;
            }
            if (m100504b == -1) {
                return c4075a.f17519c;
            }
            return c4075a.f17518b.get(m100504b).f17525e;
        }
        C4075a c4075a2 = this.f17514d.get(i2);
        if (c4075a2 == null) {
            return -1;
        }
        int m100504b2 = c4075a2.m100504b(f, f2);
        if (m100504b2 == -1) {
            return c4075a2.f17519c;
        }
        return c4075a2.f17518b.get(m100504b2).f17525e;
    }
}
