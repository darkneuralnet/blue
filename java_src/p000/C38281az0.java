package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.C11515b;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: az0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C38281az0 {

    /* renamed from: a */
    public final ConstraintLayout f56709a;

    /* renamed from: b */
    public C11515b f56710b;

    /* renamed from: c */
    public int f56711c = -1;

    /* renamed from: d */
    public int f56712d = -1;

    /* renamed from: e */
    public SparseArray<C12256a> f56713e = new SparseArray<>();

    /* renamed from: f */
    public SparseArray<C11515b> f56714f = new SparseArray<>();

    /* renamed from: g */
    public AbstractC45414mz0 f56715g = null;

    /* renamed from: az0$a */
    /* loaded from: classes.dex */
    public static class C12256a {

        /* renamed from: a */
        public int f56716a;

        /* renamed from: b */
        public ArrayList<C12257b> f56717b = new ArrayList<>();

        /* renamed from: c */
        public int f56718c;

        /* renamed from: d */
        public C11515b f56719d;

        public C12256a(Context context, XmlPullParser xmlPullParser) {
            this.f56718c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C39341cm4.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C39341cm4.State_android_id) {
                    this.f56716a = obtainStyledAttributes.getResourceId(index, this.f56716a);
                } else if (index == C39341cm4.State_constraints) {
                    this.f56718c = obtainStyledAttributes.getResourceId(index, this.f56718c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f56718c);
                    context.getResources().getResourceName(this.f56718c);
                    if ("layout".equals(resourceTypeName)) {
                        C11515b c11515b = new C11515b();
                        this.f56719d = c11515b;
                        c11515b.m67813o(context, this.f56718c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public void m65181a(C12257b c12257b) {
            this.f56717b.add(c12257b);
        }

        /* renamed from: b */
        public int m65180b(float f, float f2) {
            for (int i = 0; i < this.f56717b.size(); i++) {
                if (this.f56717b.get(i).m65179a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: az0$b */
    /* loaded from: classes.dex */
    public static class C12257b {

        /* renamed from: a */
        public float f56720a;

        /* renamed from: b */
        public float f56721b;

        /* renamed from: c */
        public float f56722c;

        /* renamed from: d */
        public float f56723d;

        /* renamed from: e */
        public int f56724e;

        /* renamed from: f */
        public C11515b f56725f;

        public C12257b(Context context, XmlPullParser xmlPullParser) {
            this.f56720a = Float.NaN;
            this.f56721b = Float.NaN;
            this.f56722c = Float.NaN;
            this.f56723d = Float.NaN;
            this.f56724e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C39341cm4.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C39341cm4.Variant_constraints) {
                    this.f56724e = obtainStyledAttributes.getResourceId(index, this.f56724e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f56724e);
                    context.getResources().getResourceName(this.f56724e);
                    if ("layout".equals(resourceTypeName)) {
                        C11515b c11515b = new C11515b();
                        this.f56725f = c11515b;
                        c11515b.m67813o(context, this.f56724e);
                    }
                } else if (index == C39341cm4.Variant_region_heightLessThan) {
                    this.f56723d = obtainStyledAttributes.getDimension(index, this.f56723d);
                } else if (index == C39341cm4.Variant_region_heightMoreThan) {
                    this.f56721b = obtainStyledAttributes.getDimension(index, this.f56721b);
                } else if (index == C39341cm4.Variant_region_widthLessThan) {
                    this.f56722c = obtainStyledAttributes.getDimension(index, this.f56722c);
                } else if (index == C39341cm4.Variant_region_widthMoreThan) {
                    this.f56720a = obtainStyledAttributes.getDimension(index, this.f56720a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        public boolean m65179a(float f, float f2) {
            if (!Float.isNaN(this.f56720a) && f < this.f56720a) {
                return false;
            }
            if (!Float.isNaN(this.f56721b) && f2 < this.f56721b) {
                return false;
            }
            if (!Float.isNaN(this.f56722c) && f > this.f56722c) {
                return false;
            }
            if (!Float.isNaN(this.f56723d) && f2 > this.f56723d) {
                return false;
            }
            return true;
        }
    }

    public C38281az0(Context context, ConstraintLayout constraintLayout, int i) {
        this.f56709a = constraintLayout;
        m65185a(context, i);
    }

    /* renamed from: a */
    public final void m65185a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            C12256a c12256a = null;
            while (true) {
                char c = 1;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType != 2) {
                            continue;
                        } else {
                            String name = xml.getName();
                            switch (name.hashCode()) {
                                case -1349929691:
                                    if (name.equals("ConstraintSet")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 80204913:
                                    if (name.equals("State")) {
                                        c = 2;
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
                                case 1657696882:
                                    if (name.equals("layoutDescription")) {
                                        c = 0;
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
                                if (c != 3) {
                                    if (c != 4) {
                                        continue;
                                    } else {
                                        m65184b(context, xml);
                                        continue;
                                    }
                                } else {
                                    C12257b c12257b = new C12257b(context, xml);
                                    if (c12256a != null) {
                                        c12256a.m65181a(c12257b);
                                        continue;
                                    } else {
                                        continue;
                                    }
                                }
                            } else {
                                c12256a = new C12256a(context, xml);
                                this.f56713e.put(c12256a.f56716a, c12256a);
                                continue;
                            }
                        }
                    } else {
                        xml.getName();
                        continue;
                    }
                    eventType = xml.next();
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

    /* renamed from: b */
    public final void m65184b(Context context, XmlPullParser xmlPullParser) {
        int i;
        C11515b c11515b = new C11515b();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String attributeName = xmlPullParser.getAttributeName(i2);
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                if (attributeValue.contains("/")) {
                    i = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i = -1;
                }
                if (i == -1) {
                    if (attributeValue.length() > 1) {
                        i = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                c11515b.m67844F(context, xmlPullParser);
                this.f56714f.put(i, c11515b);
                return;
            }
        }
    }

    /* renamed from: c */
    public void m65183c(AbstractC45414mz0 abstractC45414mz0) {
        this.f56715g = abstractC45414mz0;
    }

    /* renamed from: d */
    public void m65182d(int i, float f, float f2) {
        C11515b c11515b;
        int i2;
        C12256a c12256a;
        int m65180b;
        C11515b c11515b2;
        int i3;
        int i4 = this.f56711c;
        if (i4 == i) {
            if (i == -1) {
                c12256a = this.f56713e.valueAt(0);
            } else {
                c12256a = this.f56713e.get(i4);
            }
            int i5 = this.f56712d;
            if ((i5 != -1 && c12256a.f56717b.get(i5).m65179a(f, f2)) || this.f56712d == (m65180b = c12256a.m65180b(f, f2))) {
                return;
            }
            if (m65180b == -1) {
                c11515b2 = this.f56710b;
            } else {
                c11515b2 = c12256a.f56717b.get(m65180b).f56725f;
            }
            if (m65180b == -1) {
                i3 = c12256a.f56718c;
            } else {
                i3 = c12256a.f56717b.get(m65180b).f56724e;
            }
            if (c11515b2 == null) {
                return;
            }
            this.f56712d = m65180b;
            AbstractC45414mz0 abstractC45414mz0 = this.f56715g;
            if (abstractC45414mz0 != null) {
                abstractC45414mz0.m24598b(-1, i3);
            }
            c11515b2.m67819i(this.f56709a);
            AbstractC45414mz0 abstractC45414mz02 = this.f56715g;
            if (abstractC45414mz02 != null) {
                abstractC45414mz02.m24599a(-1, i3);
                return;
            }
            return;
        }
        this.f56711c = i;
        C12256a c12256a2 = this.f56713e.get(i);
        int m65180b2 = c12256a2.m65180b(f, f2);
        if (m65180b2 == -1) {
            c11515b = c12256a2.f56719d;
        } else {
            c11515b = c12256a2.f56717b.get(m65180b2).f56725f;
        }
        if (m65180b2 == -1) {
            i2 = c12256a2.f56718c;
        } else {
            i2 = c12256a2.f56717b.get(m65180b2).f56724e;
        }
        if (c11515b == null) {
            Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =" + f + ", " + f2);
            return;
        }
        this.f56712d = m65180b2;
        AbstractC45414mz0 abstractC45414mz03 = this.f56715g;
        if (abstractC45414mz03 != null) {
            abstractC45414mz03.m24598b(i, i2);
        }
        c11515b.m67819i(this.f56709a);
        AbstractC45414mz0 abstractC45414mz04 = this.f56715g;
        if (abstractC45414mz04 != null) {
            abstractC45414mz04.m24599a(i, i2);
        }
    }
}
