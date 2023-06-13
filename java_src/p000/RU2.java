package p000;

import android.text.TextUtils;
import android.util.FloatProperty;
import android.util.IntProperty;
import android.util.Property;
/* renamed from: RU2 */
/* loaded from: classes6.dex */
public class RU2 {

    /* renamed from: h */
    public static final FloatProperty<RU2> f32091h = new C7179a("timePosition");

    /* renamed from: i */
    public static final Property<RU2, Integer> f32092i = new C7180b("framePosition");

    /* renamed from: j */
    public static final Property<RU2, Float> f32093j = new C7181c("fractionPosition");

    /* renamed from: a */
    public InterfaceC29273ue f32094a;

    /* renamed from: b */
    public int f32095b;

    /* renamed from: c */
    public String f32096c;

    /* renamed from: d */
    public float f32097d;

    /* renamed from: e */
    public int f32098e;

    /* renamed from: f */
    public float f32099f = 0.0f;

    /* renamed from: g */
    public boolean f32100g = false;

    /* renamed from: RU2$a */
    /* loaded from: classes6.dex */
    public class C7179a extends FloatProperty<RU2> {
        public C7179a(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(RU2 ru2) {
            return Float.valueOf(ru2.m86715k());
        }

        @Override // android.util.FloatProperty
        /* renamed from: b */
        public void setValue(RU2 ru2, float f) {
            ru2.m86710p(f);
        }
    }

    /* renamed from: RU2$b */
    /* loaded from: classes6.dex */
    public class C7180b extends IntProperty<RU2> {
        public C7180b(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Integer get(RU2 ru2) {
            return Integer.valueOf(ru2.m86719g());
        }

        @Override // android.util.IntProperty
        /* renamed from: b */
        public void setValue(RU2 ru2, int i) {
            ru2.m86711o(i);
        }
    }

    /* renamed from: RU2$c */
    /* loaded from: classes6.dex */
    public class C7181c extends FloatProperty<RU2> {
        public C7181c(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(RU2 ru2) {
            return Float.valueOf(ru2.m86721e());
        }

        @Override // android.util.FloatProperty
        /* renamed from: b */
        public void setValue(RU2 ru2, float f) {
            ru2.m86712n(f);
        }
    }

    public RU2(InterfaceC29273ue interfaceC29273ue, String str, int i, float f, int i2) {
        this.f32094a = interfaceC29273ue;
        this.f32095b = i;
        this.f32096c = str;
        if (TextUtils.isEmpty(str)) {
            this.f32096c = String.valueOf(i);
        }
        this.f32098e = i2;
        this.f32097d = f;
    }

    /* renamed from: a */
    public static float m86725a(float f, float f2) {
        return f * f2;
    }

    /* renamed from: b */
    public static float m86724b(int i, int i2) {
        return i / i2;
    }

    /* renamed from: q */
    public static float m86709q(float f, float f2) {
        return f / f2;
    }

    /* renamed from: r */
    public static int m86708r(float f, int i) {
        return (int) (f * i);
    }

    /* renamed from: c */
    public float m86723c() {
        return this.f32097d;
    }

    /* renamed from: d */
    public float m86722d(float f) {
        return m86709q(f, m86723c());
    }

    /* renamed from: e */
    public float m86721e() {
        return m86722d(m86715k());
    }

    /* renamed from: f */
    public int m86720f(float f) {
        return m86708r(f, m86718h());
    }

    /* renamed from: g */
    public int m86719g() {
        return m86720f(m86715k());
    }

    /* renamed from: h */
    public int m86718h() {
        return this.f32098e;
    }

    /* renamed from: i */
    public float m86717i(float f) {
        return m86725a(f, m86723c());
    }

    /* renamed from: j */
    public float m86716j(int i) {
        return m86724b(i, m86718h());
    }

    /* renamed from: k */
    public float m86715k() {
        return this.f32099f;
    }

    /* renamed from: l */
    public boolean m86714l() {
        return this.f32100g;
    }

    /* renamed from: m */
    public void m86713m(boolean z) {
        this.f32100g = z;
        if (z) {
            this.f32094a.m9931a(this);
        }
    }

    /* renamed from: n */
    public void m86712n(float f) {
        m86710p(m86717i(f));
    }

    /* renamed from: o */
    public void m86711o(int i) {
        m86710p(m86716j(i));
    }

    /* renamed from: p */
    public void m86710p(float f) {
        this.f32099f = f;
        m86713m(true);
    }
}
