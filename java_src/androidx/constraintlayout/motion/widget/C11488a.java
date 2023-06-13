package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C11515b;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: androidx.constraintlayout.motion.widget.a */
/* loaded from: classes.dex */
public class C11488a {

    /* renamed from: a */
    public final MotionLayout f53688a;

    /* renamed from: n */
    public MotionEvent f53701n;

    /* renamed from: q */
    public MotionLayout.InterfaceC11483h f53704q;

    /* renamed from: r */
    public boolean f53705r;

    /* renamed from: s */
    public final C11498d f53706s;

    /* renamed from: t */
    public float f53707t;

    /* renamed from: u */
    public float f53708u;

    /* renamed from: b */
    public JP5 f53689b = null;

    /* renamed from: c */
    public C11490b f53690c = null;

    /* renamed from: d */
    public boolean f53691d = false;

    /* renamed from: e */
    public ArrayList<C11490b> f53692e = new ArrayList<>();

    /* renamed from: f */
    public C11490b f53693f = null;

    /* renamed from: g */
    public ArrayList<C11490b> f53694g = new ArrayList<>();

    /* renamed from: h */
    public SparseArray<C11515b> f53695h = new SparseArray<>();

    /* renamed from: i */
    public HashMap<String, Integer> f53696i = new HashMap<>();

    /* renamed from: j */
    public SparseIntArray f53697j = new SparseIntArray();

    /* renamed from: k */
    public boolean f53698k = false;

    /* renamed from: l */
    public int f53699l = 400;

    /* renamed from: m */
    public int f53700m = 0;

    /* renamed from: o */
    public boolean f53702o = false;

    /* renamed from: p */
    public boolean f53703p = false;

    /* renamed from: androidx.constraintlayout.motion.widget.a$a  reason: invalid class name */
    /* loaded from: classes.dex */
    public class animationInterpolatorC11489a implements Interpolator {

        /* renamed from: a */
        public final /* synthetic */ C41363g91 f53709a;

        public animationInterpolatorC11489a(C11488a c11488a, C41363g91 c41363g91) {
            this.f53709a = c41363g91;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) this.f53709a.mo39969a(f);
        }
    }

    public C11488a(Context context, MotionLayout motionLayout, int i) {
        this.f53688a = motionLayout;
        this.f53706s = new C11498d(motionLayout);
        m68078K(context, i);
        SparseArray<C11515b> sparseArray = this.f53695h;
        int i2 = C52945zh4.motion_base;
        sparseArray.put(i2, new C11515b());
        this.f53696i.put("motion_base", Integer.valueOf(i2));
    }

    /* renamed from: a0 */
    public static String m68061a0(String str) {
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf(47);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(indexOf + 1);
    }

    /* renamed from: A */
    public float m68088A() {
        C11490b c11490b = this.f53690c;
        if (c11490b != null && c11490b.f53721l != null) {
            return this.f53690c.f53721l.m67984l();
        }
        return 0.0f;
    }

    /* renamed from: B */
    public float m68087B() {
        C11490b c11490b = this.f53690c;
        if (c11490b != null && c11490b.f53721l != null) {
            return this.f53690c.f53721l.m67983m();
        }
        return 0.0f;
    }

    /* renamed from: C */
    public float m68086C() {
        C11490b c11490b = this.f53690c;
        if (c11490b != null && c11490b.f53721l != null) {
            return this.f53690c.f53721l.m67982n();
        }
        return 0.0f;
    }

    /* renamed from: D */
    public float m68085D() {
        C11490b c11490b = this.f53690c;
        if (c11490b != null && c11490b.f53721l != null) {
            return this.f53690c.f53721l.m67981o();
        }
        return 0.0f;
    }

    /* renamed from: E */
    public float m68084E() {
        C11490b c11490b = this.f53690c;
        if (c11490b != null) {
            return c11490b.f53718i;
        }
        return 0.0f;
    }

    /* renamed from: F */
    public int m68083F() {
        C11490b c11490b = this.f53690c;
        if (c11490b == null) {
            return -1;
        }
        return c11490b.f53713d;
    }

    /* renamed from: G */
    public C11490b m68082G(int i) {
        Iterator<C11490b> it = this.f53692e.iterator();
        while (it.hasNext()) {
            C11490b next = it.next();
            if (next.f53710a == i) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: H */
    public List<C11490b> m68081H(int i) {
        int m68035y = m68035y(i);
        ArrayList arrayList = new ArrayList();
        Iterator<C11490b> it = this.f53692e.iterator();
        while (it.hasNext()) {
            C11490b next = it.next();
            if (next.f53713d == m68035y || next.f53712c == m68035y) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: I */
    public final boolean m68080I(int i) {
        int i2 = this.f53697j.get(i);
        int size = this.f53697j.size();
        while (i2 > 0) {
            if (i2 == i) {
                return true;
            }
            int i3 = size - 1;
            if (size < 0) {
                return true;
            }
            i2 = this.f53697j.get(i2);
            size = i3;
        }
        return false;
    }

    /* renamed from: J */
    public final boolean m68079J() {
        return this.f53704q != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: K */
    public final void m68078K(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            C11490b c11490b = null;
            while (true) {
                char c = 1;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType != 2) {
                            continue;
                        } else {
                            String name = xml.getName();
                            if (this.f53698k) {
                                System.out.println("parsing = " + name);
                            }
                            switch (name.hashCode()) {
                                case -1349929691:
                                    if (name.equals("ConstraintSet")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1239391468:
                                    if (name.equals("KeyFrameSet")) {
                                        c = '\b';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -687739768:
                                    if (name.equals("Include")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 61998586:
                                    if (name.equals("ViewTransition")) {
                                        c = '\t';
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 269306229:
                                    if (name.equals("Transition")) {
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 312750793:
                                    if (name.equals("OnClick")) {
                                        c = 3;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 327855227:
                                    if (name.equals("OnSwipe")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 793277014:
                                    if (name.equals("MotionScene")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1382829617:
                                    if (name.equals("StateSet")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1942574248:
                                    if (name.equals("include")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    m68074O(context, xml);
                                    continue;
                                case 1:
                                    ArrayList<C11490b> arrayList = this.f53692e;
                                    c11490b = new C11490b(this, context, xml);
                                    arrayList.add(c11490b);
                                    if (this.f53690c == null && !c11490b.f53711b) {
                                        this.f53690c = c11490b;
                                        if (c11490b.f53721l != null) {
                                            this.f53690c.f53721l.m67972x(this.f53705r);
                                        }
                                    }
                                    if (c11490b.f53711b) {
                                        if (c11490b.f53712c == -1) {
                                            this.f53693f = c11490b;
                                        } else {
                                            this.f53694g.add(c11490b);
                                        }
                                        this.f53692e.remove(c11490b);
                                        continue;
                                    } else {
                                        continue;
                                    }
                                case 2:
                                    if (c11490b == null) {
                                        Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i) + ".xml:" + xml.getLineNumber() + ")");
                                    }
                                    if (c11490b != null) {
                                        c11490b.f53721l = new C11492b(context, this.f53688a, xml);
                                        continue;
                                    } else {
                                        continue;
                                    }
                                case 3:
                                    if (c11490b != null) {
                                        c11490b.m68005u(context, xml);
                                        continue;
                                    } else {
                                        continue;
                                    }
                                case 4:
                                    this.f53689b = new JP5(context, xml);
                                    continue;
                                case 5:
                                    m68077L(context, xml);
                                    continue;
                                case 6:
                                case 7:
                                    m68075N(context, xml);
                                    continue;
                                case '\b':
                                    C45859nk2 c45859nk2 = new C45859nk2(context, xml);
                                    if (c11490b != null) {
                                        c11490b.f53720k.add(c45859nk2);
                                        continue;
                                    } else {
                                        continue;
                                    }
                                case '\t':
                                    this.f53706s.m67950a(new C11495c(context, xml));
                                    continue;
                                default:
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: L */
    public final int m68077L(Context context, XmlPullParser xmlPullParser) {
        boolean z;
        boolean z2;
        C11515b c11515b = new C11515b();
        c11515b.m67831S(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeName = xmlPullParser.getAttributeName(i3);
            String attributeValue = xmlPullParser.getAttributeValue(i3);
            if (this.f53698k) {
                System.out.println("id string = " + attributeValue);
            }
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -1496482599:
                    if (attributeName.equals("deriveConstraintsFrom")) {
                        z = false;
                        break;
                    }
                    z = true;
                    break;
                case -1153153640:
                    if (attributeName.equals("constraintRotate")) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                default:
                    z = true;
                    break;
            }
            switch (z) {
                case false:
                    i2 = m68042r(context, attributeValue);
                    break;
                case true:
                    try {
                        c11515b.f54078d = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.hashCode();
                        switch (attributeValue.hashCode()) {
                            case -768416914:
                                if (attributeValue.equals("x_left")) {
                                    z2 = false;
                                    break;
                                }
                                z2 = true;
                                break;
                            case 3317767:
                                if (attributeValue.equals("left")) {
                                    z2 = true;
                                    break;
                                }
                                z2 = true;
                                break;
                            case 3387192:
                                if (attributeValue.equals("none")) {
                                    z2 = true;
                                    break;
                                }
                                z2 = true;
                                break;
                            case 108511772:
                                if (attributeValue.equals("right")) {
                                    z2 = true;
                                    break;
                                }
                                z2 = true;
                                break;
                            case 1954540437:
                                if (attributeValue.equals("x_right")) {
                                    z2 = true;
                                    break;
                                }
                                z2 = true;
                                break;
                            default:
                                z2 = true;
                                break;
                        }
                        switch (z2) {
                            case false:
                                c11515b.f54078d = 4;
                                continue;
                            case true:
                                c11515b.f54078d = 2;
                                continue;
                            case true:
                                c11515b.f54078d = 0;
                                continue;
                            case true:
                                c11515b.f54078d = 1;
                                continue;
                            case true:
                                c11515b.f54078d = 3;
                                continue;
                        }
                    }
                    break;
                case true:
                    i = m68042r(context, attributeValue);
                    this.f53696i.put(m68061a0(attributeValue), Integer.valueOf(i));
                    c11515b.f54076b = FU0.m107118c(context, i);
                    break;
            }
        }
        if (i != -1) {
            if (this.f53688a.f53632y != 0) {
                c11515b.m67830T(true);
            }
            c11515b.m67844F(context, xmlPullParser);
            if (i2 != -1) {
                this.f53697j.put(i, i2);
            }
            this.f53695h.put(i, c11515b);
        }
        return i;
    }

    /* renamed from: M */
    public final int m68076M(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return m68077L(context, xml);
                }
            }
            return -1;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    /* renamed from: N */
    public final void m68075N(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C39341cm4.include);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C39341cm4.include_constraintSet) {
                m68076M(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: O */
    public final void m68074O(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C39341cm4.MotionScene);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C39341cm4.MotionScene_defaultDuration) {
                int i2 = obtainStyledAttributes.getInt(index, this.f53699l);
                this.f53699l = i2;
                if (i2 < 8) {
                    this.f53699l = 8;
                }
            } else if (index == C39341cm4.MotionScene_layoutDuringTransition) {
                this.f53700m = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: P */
    public void m68073P(float f, float f2) {
        C11490b c11490b = this.f53690c;
        if (c11490b != null && c11490b.f53721l != null) {
            this.f53690c.f53721l.m67975u(f, f2);
        }
    }

    /* renamed from: Q */
    public void m68072Q(float f, float f2) {
        C11490b c11490b = this.f53690c;
        if (c11490b != null && c11490b.f53721l != null) {
            this.f53690c.f53721l.m67974v(f, f2);
        }
    }

    /* renamed from: R */
    public void m68071R(MotionEvent motionEvent, int i, MotionLayout motionLayout) {
        MotionLayout.InterfaceC11483h interfaceC11483h;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.f53704q == null) {
            this.f53704q = this.f53688a.m68168e0();
        }
        this.f53704q.mo68105a(motionEvent);
        if (i != -1) {
            int action = motionEvent.getAction();
            boolean z = false;
            if (action != 0) {
                if (action == 2 && !this.f53702o) {
                    float rawY = motionEvent.getRawY() - this.f53708u;
                    float rawX = motionEvent.getRawX() - this.f53707t;
                    if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.f53701n) == null) {
                        return;
                    }
                    C11490b m68051i = m68051i(i, rawX, rawY, motionEvent2);
                    if (m68051i != null) {
                        motionLayout.m68158j0(m68051i);
                        RectF m67980p = this.f53690c.f53721l.m67980p(this.f53688a, rectF);
                        if (m67980p != null && !m67980p.contains(this.f53701n.getX(), this.f53701n.getY())) {
                            z = true;
                        }
                        this.f53703p = z;
                        this.f53690c.f53721l.m67970z(this.f53707t, this.f53708u);
                    }
                }
            } else {
                this.f53707t = motionEvent.getRawX();
                this.f53708u = motionEvent.getRawY();
                this.f53701n = motionEvent;
                this.f53702o = false;
                if (this.f53690c.f53721l != null) {
                    RectF m67990f = this.f53690c.f53721l.m67990f(this.f53688a, rectF);
                    if (m67990f != null && !m67990f.contains(this.f53701n.getX(), this.f53701n.getY())) {
                        this.f53701n = null;
                        this.f53702o = true;
                        return;
                    }
                    RectF m67980p2 = this.f53690c.f53721l.m67980p(this.f53688a, rectF);
                    if (m67980p2 != null && !m67980p2.contains(this.f53701n.getX(), this.f53701n.getY())) {
                        this.f53703p = true;
                    } else {
                        this.f53703p = false;
                    }
                    this.f53690c.f53721l.m67973w(this.f53707t, this.f53708u);
                    return;
                }
                return;
            }
        }
        if (this.f53702o) {
            return;
        }
        C11490b c11490b = this.f53690c;
        if (c11490b != null && c11490b.f53721l != null && !this.f53703p) {
            this.f53690c.f53721l.m67977s(motionEvent, this.f53704q, i, this);
        }
        this.f53707t = motionEvent.getRawX();
        this.f53708u = motionEvent.getRawY();
        if (motionEvent.getAction() == 1 && (interfaceC11483h = this.f53704q) != null) {
            interfaceC11483h.mo68104b();
            this.f53704q = null;
            int i2 = motionLayout.f53605g;
            if (i2 != -1) {
                m68052h(motionLayout, i2);
            }
        }
    }

    /* renamed from: S */
    public final void m68070S(int i, MotionLayout motionLayout) {
        C11515b c11515b = this.f53695h.get(i);
        c11515b.f54077c = c11515b.f54076b;
        int i2 = this.f53697j.get(i);
        if (i2 > 0) {
            m68070S(i2, motionLayout);
            C11515b c11515b2 = this.f53695h.get(i2);
            if (c11515b2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + FU0.m107118c(this.f53688a.getContext(), i2));
                return;
            }
            c11515b.f54077c += "/" + c11515b2.f54077c;
            c11515b.m67836N(c11515b2);
        } else {
            c11515b.f54077c += "  layout";
            c11515b.m67837M(motionLayout);
        }
        c11515b.m67820h(c11515b);
    }

    /* renamed from: T */
    public void m68069T(MotionLayout motionLayout) {
        for (int i = 0; i < this.f53695h.size(); i++) {
            int keyAt = this.f53695h.keyAt(i);
            if (m68080I(keyAt)) {
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            }
            m68070S(keyAt, motionLayout);
        }
    }

    /* renamed from: U */
    public void m68068U(int i, C11515b c11515b) {
        this.f53695h.put(i, c11515b);
    }

    /* renamed from: V */
    public void m68067V(int i) {
        C11490b c11490b = this.f53690c;
        if (c11490b != null) {
            c11490b.m68029E(i);
        } else {
            this.f53699l = i;
        }
    }

    /* renamed from: W */
    public void m68066W(boolean z) {
        this.f53705r = z;
        C11490b c11490b = this.f53690c;
        if (c11490b != null && c11490b.f53721l != null) {
            this.f53690c.f53721l.m67972x(this.f53705r);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r2 != (-1)) goto L9;
     */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m68065X(int i, int i2) {
        int i3;
        int i4;
        JP5 jp5 = this.f53689b;
        if (jp5 != null) {
            i3 = jp5.m100507c(i, -1, -1);
            if (i3 == -1) {
                i3 = i;
            }
            i4 = this.f53689b.m100507c(i2, -1, -1);
        } else {
            i3 = i;
        }
        i4 = i2;
        C11490b c11490b = this.f53690c;
        if (c11490b != null && c11490b.f53712c == i2 && this.f53690c.f53713d == i) {
            return;
        }
        Iterator<C11490b> it = this.f53692e.iterator();
        while (it.hasNext()) {
            C11490b next = it.next();
            if ((next.f53712c == i4 && next.f53713d == i3) || (next.f53712c == i2 && next.f53713d == i)) {
                this.f53690c = next;
                if (next != null && next.f53721l != null) {
                    this.f53690c.f53721l.m67972x(this.f53705r);
                    return;
                }
                return;
            }
        }
        C11490b c11490b2 = this.f53693f;
        Iterator<C11490b> it2 = this.f53694g.iterator();
        while (it2.hasNext()) {
            C11490b next2 = it2.next();
            if (next2.f53712c == i2) {
                c11490b2 = next2;
            }
        }
        C11490b c11490b3 = new C11490b(this, c11490b2);
        c11490b3.f53713d = i3;
        c11490b3.f53712c = i4;
        if (i3 != -1) {
            this.f53692e.add(c11490b3);
        }
        this.f53690c = c11490b3;
    }

    /* renamed from: Y */
    public void m68064Y(C11490b c11490b) {
        this.f53690c = c11490b;
        if (c11490b != null && c11490b.f53721l != null) {
            this.f53690c.f53721l.m67972x(this.f53705r);
        }
    }

    /* renamed from: Z */
    public void m68063Z() {
        C11490b c11490b = this.f53690c;
        if (c11490b != null && c11490b.f53721l != null) {
            this.f53690c.f53721l.m67996A();
        }
    }

    /* renamed from: b0 */
    public boolean m68059b0() {
        Iterator<C11490b> it = this.f53692e.iterator();
        while (it.hasNext()) {
            if (it.next().f53721l != null) {
                return true;
            }
        }
        C11490b c11490b = this.f53690c;
        if (c11490b != null && c11490b.f53721l != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c0 */
    public void m68057c0(int i, View... viewArr) {
        this.f53706s.m67942i(i, viewArr);
    }

    /* renamed from: f */
    public void m68054f(MotionLayout motionLayout, int i) {
        Iterator<C11490b> it = this.f53692e.iterator();
        while (it.hasNext()) {
            C11490b next = it.next();
            if (next.f53722m.size() > 0) {
                Iterator it2 = next.f53722m.iterator();
                while (it2.hasNext()) {
                    ((C11490b.View$OnClickListenerC11491a) it2.next()).m67997c(motionLayout);
                }
            }
        }
        Iterator<C11490b> it3 = this.f53694g.iterator();
        while (it3.hasNext()) {
            C11490b next2 = it3.next();
            if (next2.f53722m.size() > 0) {
                Iterator it4 = next2.f53722m.iterator();
                while (it4.hasNext()) {
                    ((C11490b.View$OnClickListenerC11491a) it4.next()).m67997c(motionLayout);
                }
            }
        }
        Iterator<C11490b> it5 = this.f53692e.iterator();
        while (it5.hasNext()) {
            C11490b next3 = it5.next();
            if (next3.f53722m.size() > 0) {
                Iterator it6 = next3.f53722m.iterator();
                while (it6.hasNext()) {
                    ((C11490b.View$OnClickListenerC11491a) it6.next()).m67999a(motionLayout, i, next3);
                }
            }
        }
        Iterator<C11490b> it7 = this.f53694g.iterator();
        while (it7.hasNext()) {
            C11490b next4 = it7.next();
            if (next4.f53722m.size() > 0) {
                Iterator it8 = next4.f53722m.iterator();
                while (it8.hasNext()) {
                    ((C11490b.View$OnClickListenerC11491a) it8.next()).m67999a(motionLayout, i, next4);
                }
            }
        }
    }

    /* renamed from: g */
    public boolean m68053g(int i, OV2 ov2) {
        return this.f53706s.m67947d(i, ov2);
    }

    /* renamed from: h */
    public boolean m68052h(MotionLayout motionLayout, int i) {
        C11490b c11490b;
        if (m68079J() || this.f53691d) {
            return false;
        }
        Iterator<C11490b> it = this.f53692e.iterator();
        while (it.hasNext()) {
            C11490b next = it.next();
            if (next.f53723n != 0 && ((c11490b = this.f53690c) != next || !c11490b.m68030D(2))) {
                if (i == next.f53713d && (next.f53723n == 4 || next.f53723n == 2)) {
                    MotionLayout.EnumC11487l enumC11487l = MotionLayout.EnumC11487l.FINISHED;
                    motionLayout.m68160i0(enumC11487l);
                    motionLayout.m68158j0(next);
                    if (next.f53723n == 4) {
                        motionLayout.m68150n0();
                        motionLayout.m68160i0(MotionLayout.EnumC11487l.SETUP);
                        motionLayout.m68160i0(MotionLayout.EnumC11487l.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.m68188K(true);
                        motionLayout.m68160i0(MotionLayout.EnumC11487l.SETUP);
                        motionLayout.m68160i0(MotionLayout.EnumC11487l.MOVING);
                        motionLayout.m68160i0(enumC11487l);
                        motionLayout.m68166f0();
                    }
                    return true;
                } else if (i == next.f53712c && (next.f53723n == 3 || next.f53723n == 1)) {
                    MotionLayout.EnumC11487l enumC11487l2 = MotionLayout.EnumC11487l.FINISHED;
                    motionLayout.m68160i0(enumC11487l2);
                    motionLayout.m68158j0(next);
                    if (next.f53723n == 3) {
                        motionLayout.m68146p0();
                        motionLayout.m68160i0(MotionLayout.EnumC11487l.SETUP);
                        motionLayout.m68160i0(MotionLayout.EnumC11487l.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.m68188K(true);
                        motionLayout.m68160i0(MotionLayout.EnumC11487l.SETUP);
                        motionLayout.m68160i0(MotionLayout.EnumC11487l.MOVING);
                        motionLayout.m68160i0(enumC11487l2);
                        motionLayout.m68166f0();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: i */
    public C11490b m68051i(int i, float f, float f2, MotionEvent motionEvent) {
        float f3;
        if (i != -1) {
            List<C11490b> m68081H = m68081H(i);
            RectF rectF = new RectF();
            float f4 = 0.0f;
            C11490b c11490b = null;
            for (C11490b c11490b2 : m68081H) {
                if (!c11490b2.f53724o && c11490b2.f53721l != null) {
                    c11490b2.f53721l.m67972x(this.f53705r);
                    RectF m67980p = c11490b2.f53721l.m67980p(this.f53688a, rectF);
                    if (m67980p == null || motionEvent == null || m67980p.contains(motionEvent.getX(), motionEvent.getY())) {
                        RectF m67990f = c11490b2.f53721l.m67990f(this.f53688a, rectF);
                        if (m67990f == null || motionEvent == null || m67990f.contains(motionEvent.getX(), motionEvent.getY())) {
                            float m67995a = c11490b2.f53721l.m67995a(f, f2);
                            if (c11490b2.f53721l.f53750l && motionEvent != null) {
                                float x = motionEvent.getX() - c11490b2.f53721l.f53747i;
                                float y = motionEvent.getY() - c11490b2.f53721l.f53748j;
                                m67995a = ((float) (Math.atan2(f2 + y, f + x) - Math.atan2(x, y))) * 10.0f;
                            }
                            if (c11490b2.f53712c == i) {
                                f3 = -1.0f;
                            } else {
                                f3 = 1.1f;
                            }
                            float f5 = m67995a * f3;
                            if (f5 > f4) {
                                c11490b = c11490b2;
                                f4 = f5;
                            }
                        }
                    }
                }
            }
            return c11490b;
        }
        return this.f53690c;
    }

    /* renamed from: j */
    public int m68050j() {
        C11490b c11490b = this.f53690c;
        if (c11490b != null) {
            return c11490b.f53725p;
        }
        return -1;
    }

    /* renamed from: k */
    public int m68049k() {
        C11490b c11490b = this.f53690c;
        if (c11490b != null && c11490b.f53721l != null) {
            return this.f53690c.f53721l.m67992d();
        }
        return 0;
    }

    /* renamed from: l */
    public C11515b m68048l(int i) {
        return m68047m(i, -1, -1);
    }

    /* renamed from: m */
    public C11515b m68047m(int i, int i2, int i3) {
        int m100507c;
        if (this.f53698k) {
            PrintStream printStream = System.out;
            printStream.println("id " + i);
            PrintStream printStream2 = System.out;
            printStream2.println("size " + this.f53695h.size());
        }
        JP5 jp5 = this.f53689b;
        if (jp5 != null && (m100507c = jp5.m100507c(i, i2, i3)) != -1) {
            i = m100507c;
        }
        if (this.f53695h.get(i) == null) {
            Log.e("MotionScene", "Warning could not find ConstraintSet id/" + FU0.m107118c(this.f53688a.getContext(), i) + " In MotionScene");
            SparseArray<C11515b> sparseArray = this.f53695h;
            return sparseArray.get(sparseArray.keyAt(0));
        }
        return this.f53695h.get(i);
    }

    /* renamed from: n */
    public int[] m68046n() {
        int size = this.f53695h.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = this.f53695h.keyAt(i);
        }
        return iArr;
    }

    /* renamed from: o */
    public ArrayList<C11490b> m68045o() {
        return this.f53692e;
    }

    /* renamed from: p */
    public int m68044p() {
        C11490b c11490b = this.f53690c;
        if (c11490b != null) {
            return c11490b.f53717h;
        }
        return this.f53699l;
    }

    /* renamed from: q */
    public int m68043q() {
        C11490b c11490b = this.f53690c;
        if (c11490b == null) {
            return -1;
        }
        return c11490b.f53712c;
    }

    /* renamed from: r */
    public final int m68042r(Context context, String str) {
        int i;
        if (str.contains("/")) {
            i = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
            if (this.f53698k) {
                System.out.println("id getMap res = " + i);
            }
        } else {
            i = -1;
        }
        if (i == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
            return i;
        }
        return i;
    }

    /* renamed from: s */
    public Interpolator m68041s() {
        int i = this.f53690c.f53714e;
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 4) {
                                if (i != 5) {
                                    if (i != 6) {
                                        return null;
                                    }
                                    return new AnticipateInterpolator();
                                }
                                return new OvershootInterpolator();
                            }
                            return new BounceInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            return new animationInterpolatorC11489a(this, C41363g91.m39970c(this.f53690c.f53715f));
        }
        return AnimationUtils.loadInterpolator(this.f53688a.getContext(), this.f53690c.f53716g);
    }

    /* renamed from: t */
    public void m68040t(OV2 ov2) {
        C11490b c11490b = this.f53690c;
        if (c11490b == null) {
            C11490b c11490b2 = this.f53693f;
            if (c11490b2 != null) {
                Iterator it = c11490b2.f53720k.iterator();
                while (it.hasNext()) {
                    ((C45859nk2) it.next()).m23243b(ov2);
                }
                return;
            }
            return;
        }
        Iterator it2 = c11490b.f53720k.iterator();
        while (it2.hasNext()) {
            ((C45859nk2) it2.next()).m23243b(ov2);
        }
    }

    /* renamed from: u */
    public float m68039u() {
        C11490b c11490b = this.f53690c;
        if (c11490b != null && c11490b.f53721l != null) {
            return this.f53690c.f53721l.m67989g();
        }
        return 0.0f;
    }

    /* renamed from: v */
    public float m68038v() {
        C11490b c11490b = this.f53690c;
        if (c11490b != null && c11490b.f53721l != null) {
            return this.f53690c.f53721l.m67988h();
        }
        return 0.0f;
    }

    /* renamed from: w */
    public boolean m68037w() {
        C11490b c11490b = this.f53690c;
        if (c11490b != null && c11490b.f53721l != null) {
            return this.f53690c.f53721l.m67987i();
        }
        return false;
    }

    /* renamed from: x */
    public float m68036x(float f, float f2) {
        C11490b c11490b = this.f53690c;
        if (c11490b != null && c11490b.f53721l != null) {
            return this.f53690c.f53721l.m67986j(f, f2);
        }
        return 0.0f;
    }

    /* renamed from: y */
    public final int m68035y(int i) {
        int m100507c;
        JP5 jp5 = this.f53689b;
        if (jp5 != null && (m100507c = jp5.m100507c(i, -1, -1)) != -1) {
            return m100507c;
        }
        return i;
    }

    /* renamed from: z */
    public int m68034z() {
        C11490b c11490b = this.f53690c;
        if (c11490b != null && c11490b.f53721l != null) {
            return this.f53690c.f53721l.m67985k();
        }
        return 0;
    }

    /* renamed from: androidx.constraintlayout.motion.widget.a$b */
    /* loaded from: classes.dex */
    public static class C11490b {

        /* renamed from: a */
        public int f53710a;

        /* renamed from: b */
        public boolean f53711b;

        /* renamed from: c */
        public int f53712c;

        /* renamed from: d */
        public int f53713d;

        /* renamed from: e */
        public int f53714e;

        /* renamed from: f */
        public String f53715f;

        /* renamed from: g */
        public int f53716g;

        /* renamed from: h */
        public int f53717h;

        /* renamed from: i */
        public float f53718i;

        /* renamed from: j */
        public final C11488a f53719j;

        /* renamed from: k */
        public ArrayList<C45859nk2> f53720k;

        /* renamed from: l */
        public C11492b f53721l;

        /* renamed from: m */
        public ArrayList<View$OnClickListenerC11491a> f53722m;

        /* renamed from: n */
        public int f53723n;

        /* renamed from: o */
        public boolean f53724o;

        /* renamed from: p */
        public int f53725p;

        /* renamed from: q */
        public int f53726q;

        /* renamed from: r */
        public int f53727r;

        /* renamed from: androidx.constraintlayout.motion.widget.a$b$a */
        /* loaded from: classes.dex */
        public static class View$OnClickListenerC11491a implements View.OnClickListener {

            /* renamed from: b */
            public final C11490b f53728b;

            /* renamed from: c */
            public int f53729c;

            /* renamed from: d */
            public int f53730d;

            public View$OnClickListenerC11491a(Context context, C11490b c11490b, XmlPullParser xmlPullParser) {
                this.f53729c = -1;
                this.f53730d = 17;
                this.f53728b = c11490b;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C39341cm4.OnClick);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == C39341cm4.OnClick_targetId) {
                        this.f53729c = obtainStyledAttributes.getResourceId(index, this.f53729c);
                    } else if (index == C39341cm4.OnClick_clickAction) {
                        this.f53730d = obtainStyledAttributes.getInt(index, this.f53730d);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v4, types: [android.view.View] */
            /* renamed from: a */
            public void m67999a(MotionLayout motionLayout, int i, C11490b c11490b) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                int i2 = this.f53729c;
                MotionLayout motionLayout2 = motionLayout;
                if (i2 != -1) {
                    motionLayout2 = motionLayout.findViewById(i2);
                }
                if (motionLayout2 == null) {
                    Log.e("MotionScene", "OnClick could not find id " + this.f53729c);
                    return;
                }
                int i3 = c11490b.f53713d;
                int i4 = c11490b.f53712c;
                if (i3 == -1) {
                    motionLayout2.setOnClickListener(this);
                    return;
                }
                int i5 = this.f53730d;
                boolean z5 = false;
                if ((i5 & 1) != 0 && i == i3) {
                    z = true;
                } else {
                    z = false;
                }
                if ((i5 & 256) != 0 && i == i3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z6 = z | z2;
                if ((i5 & 1) != 0 && i == i3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z7 = z3 | z6;
                if ((i5 & 16) != 0 && i == i4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z8 = z7 | z4;
                if ((i5 & 4096) != 0 && i == i4) {
                    z5 = true;
                }
                if (z8 | z5) {
                    motionLayout2.setOnClickListener(this);
                }
            }

            /* renamed from: b */
            public boolean m67998b(C11490b c11490b, MotionLayout motionLayout) {
                C11490b c11490b2 = this.f53728b;
                if (c11490b2 == c11490b) {
                    return true;
                }
                int i = c11490b2.f53712c;
                int i2 = this.f53728b.f53713d;
                if (i2 == -1) {
                    if (motionLayout.f53605g != i) {
                        return true;
                    }
                    return false;
                }
                int i3 = motionLayout.f53605g;
                if (i3 == i2 || i3 == i) {
                    return true;
                }
                return false;
            }

            /* renamed from: c */
            public void m67997c(MotionLayout motionLayout) {
                int i = this.f53729c;
                if (i == -1) {
                    return;
                }
                View findViewById = motionLayout.findViewById(i);
                if (findViewById == null) {
                    Log.e("MotionScene", " (*)  could not find id " + this.f53729c);
                    return;
                }
                findViewById.setOnClickListener(null);
            }

            /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
            /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onClick(View view) {
                boolean z;
                boolean z2;
                boolean z3;
                MotionLayout motionLayout = this.f53728b.f53719j.f53688a;
                if (!motionLayout.m68170d0()) {
                    return;
                }
                if (this.f53728b.f53713d == -1) {
                    int m68180S = motionLayout.m68180S();
                    if (m68180S == -1) {
                        motionLayout.m68145q0(this.f53728b.f53712c);
                        return;
                    }
                    C11490b c11490b = new C11490b(this.f53728b.f53719j, this.f53728b);
                    c11490b.f53713d = m68180S;
                    c11490b.f53712c = this.f53728b.f53712c;
                    motionLayout.m68158j0(c11490b);
                    motionLayout.m68150n0();
                    return;
                }
                C11490b c11490b2 = this.f53728b.f53719j.f53690c;
                int i = this.f53730d;
                boolean z4 = false;
                if ((i & 1) == 0 && (i & 256) == 0) {
                    z = false;
                } else {
                    z = true;
                }
                if ((i & 16) == 0 && (i & 4096) == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z && z2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    C11490b c11490b3 = this.f53728b.f53719j.f53690c;
                    C11490b c11490b4 = this.f53728b;
                    if (c11490b3 != c11490b4) {
                        motionLayout.m68158j0(c11490b4);
                    }
                    if (motionLayout.m68180S() != motionLayout.m68179U() && motionLayout.m68176X() <= 0.5f) {
                        z2 = false;
                    }
                    if (!m67998b(c11490b2, motionLayout)) {
                        if (z4 && (this.f53730d & 1) != 0) {
                            motionLayout.m68158j0(this.f53728b);
                            motionLayout.m68150n0();
                            return;
                        } else if (z2 && (this.f53730d & 16) != 0) {
                            motionLayout.m68158j0(this.f53728b);
                            motionLayout.m68146p0();
                            return;
                        } else if (z4 && (this.f53730d & 256) != 0) {
                            motionLayout.m68158j0(this.f53728b);
                            motionLayout.setProgress(1.0f);
                            return;
                        } else if (z2 && (this.f53730d & 4096) != 0) {
                            motionLayout.m68158j0(this.f53728b);
                            motionLayout.setProgress(0.0f);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                z4 = z;
                if (!m67998b(c11490b2, motionLayout)) {
                }
            }
        }

        public C11490b(C11488a c11488a, C11490b c11490b) {
            this.f53710a = -1;
            this.f53711b = false;
            this.f53712c = -1;
            this.f53713d = -1;
            this.f53714e = 0;
            this.f53715f = null;
            this.f53716g = -1;
            this.f53717h = 400;
            this.f53718i = 0.0f;
            this.f53720k = new ArrayList<>();
            this.f53721l = null;
            this.f53722m = new ArrayList<>();
            this.f53723n = 0;
            this.f53724o = false;
            this.f53725p = -1;
            this.f53726q = 0;
            this.f53727r = 0;
            this.f53719j = c11488a;
            this.f53717h = c11488a.f53699l;
            if (c11490b != null) {
                this.f53725p = c11490b.f53725p;
                this.f53714e = c11490b.f53714e;
                this.f53715f = c11490b.f53715f;
                this.f53716g = c11490b.f53716g;
                this.f53717h = c11490b.f53717h;
                this.f53720k = c11490b.f53720k;
                this.f53718i = c11490b.f53718i;
                this.f53726q = c11490b.f53726q;
            }
        }

        /* renamed from: A */
        public int m68033A() {
            return this.f53713d;
        }

        /* renamed from: B */
        public C11492b m68032B() {
            return this.f53721l;
        }

        /* renamed from: C */
        public boolean m68031C() {
            return !this.f53724o;
        }

        /* renamed from: D */
        public boolean m68030D(int i) {
            return (i & this.f53727r) != 0;
        }

        /* renamed from: E */
        public void m68029E(int i) {
            this.f53717h = Math.max(i, 8);
        }

        /* renamed from: F */
        public void m68028F(int i, String str, int i2) {
            this.f53714e = i;
            this.f53715f = str;
            this.f53716g = i2;
        }

        /* renamed from: G */
        public void m68027G(int i) {
            C11492b m68032B = m68032B();
            if (m68032B != null) {
                m68032B.m67971y(i);
            }
        }

        /* renamed from: H */
        public void m68026H(int i) {
            this.f53725p = i;
        }

        /* renamed from: t */
        public void m68006t(C45859nk2 c45859nk2) {
            this.f53720k.add(c45859nk2);
        }

        /* renamed from: u */
        public void m68005u(Context context, XmlPullParser xmlPullParser) {
            this.f53722m.add(new View$OnClickListenerC11491a(context, this, xmlPullParser));
        }

        /* renamed from: v */
        public final void m68004v(C11488a c11488a, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                if (index == C39341cm4.Transition_constraintSetEnd) {
                    this.f53712c = typedArray.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f53712c);
                    if ("layout".equals(resourceTypeName)) {
                        C11515b c11515b = new C11515b();
                        c11515b.m67845E(context, this.f53712c);
                        c11488a.f53695h.append(this.f53712c, c11515b);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f53712c = c11488a.m68076M(context, this.f53712c);
                    }
                } else if (index == C39341cm4.Transition_constraintSetStart) {
                    this.f53713d = typedArray.getResourceId(index, this.f53713d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f53713d);
                    if ("layout".equals(resourceTypeName2)) {
                        C11515b c11515b2 = new C11515b();
                        c11515b2.m67845E(context, this.f53713d);
                        c11488a.f53695h.append(this.f53713d, c11515b2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f53713d = c11488a.m68076M(context, this.f53713d);
                    }
                } else if (index == C39341cm4.Transition_motionInterpolator) {
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.f53716g = resourceId;
                        if (resourceId != -1) {
                            this.f53714e = -2;
                        }
                    } else if (i2 == 3) {
                        String string = typedArray.getString(index);
                        this.f53715f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f53716g = typedArray.getResourceId(index, -1);
                                this.f53714e = -2;
                            } else {
                                this.f53714e = -1;
                            }
                        }
                    } else {
                        this.f53714e = typedArray.getInteger(index, this.f53714e);
                    }
                } else if (index == C39341cm4.Transition_duration) {
                    int i3 = typedArray.getInt(index, this.f53717h);
                    this.f53717h = i3;
                    if (i3 < 8) {
                        this.f53717h = 8;
                    }
                } else if (index == C39341cm4.Transition_staggered) {
                    this.f53718i = typedArray.getFloat(index, this.f53718i);
                } else if (index == C39341cm4.Transition_autoTransition) {
                    this.f53723n = typedArray.getInteger(index, this.f53723n);
                } else if (index == C39341cm4.Transition_android_id) {
                    this.f53710a = typedArray.getResourceId(index, this.f53710a);
                } else if (index == C39341cm4.Transition_transitionDisable) {
                    this.f53724o = typedArray.getBoolean(index, this.f53724o);
                } else if (index == C39341cm4.Transition_pathMotionArc) {
                    this.f53725p = typedArray.getInteger(index, -1);
                } else if (index == C39341cm4.Transition_layoutDuringTransition) {
                    this.f53726q = typedArray.getInteger(index, 0);
                } else if (index == C39341cm4.Transition_transitionFlags) {
                    this.f53727r = typedArray.getInteger(index, 0);
                }
            }
            if (this.f53713d == -1) {
                this.f53711b = true;
            }
        }

        /* renamed from: w */
        public final void m68003w(C11488a c11488a, Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C39341cm4.Transition);
            m68004v(c11488a, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: x */
        public int m68002x() {
            return this.f53723n;
        }

        /* renamed from: y */
        public int m68001y() {
            return this.f53712c;
        }

        /* renamed from: z */
        public int m68000z() {
            return this.f53726q;
        }

        public C11490b(int i, C11488a c11488a, int i2, int i3) {
            this.f53710a = -1;
            this.f53711b = false;
            this.f53712c = -1;
            this.f53713d = -1;
            this.f53714e = 0;
            this.f53715f = null;
            this.f53716g = -1;
            this.f53717h = 400;
            this.f53718i = 0.0f;
            this.f53720k = new ArrayList<>();
            this.f53721l = null;
            this.f53722m = new ArrayList<>();
            this.f53723n = 0;
            this.f53724o = false;
            this.f53725p = -1;
            this.f53726q = 0;
            this.f53727r = 0;
            this.f53710a = i;
            this.f53719j = c11488a;
            this.f53713d = i2;
            this.f53712c = i3;
            this.f53717h = c11488a.f53699l;
            this.f53726q = c11488a.f53700m;
        }

        public C11490b(C11488a c11488a, Context context, XmlPullParser xmlPullParser) {
            this.f53710a = -1;
            this.f53711b = false;
            this.f53712c = -1;
            this.f53713d = -1;
            this.f53714e = 0;
            this.f53715f = null;
            this.f53716g = -1;
            this.f53717h = 400;
            this.f53718i = 0.0f;
            this.f53720k = new ArrayList<>();
            this.f53721l = null;
            this.f53722m = new ArrayList<>();
            this.f53723n = 0;
            this.f53724o = false;
            this.f53725p = -1;
            this.f53726q = 0;
            this.f53727r = 0;
            this.f53717h = c11488a.f53699l;
            this.f53726q = c11488a.f53700m;
            this.f53719j = c11488a;
            m68003w(c11488a, context, Xml.asAttributeSet(xmlPullParser));
        }
    }
}
