package p000;

import android.graphics.Paint;
import java.util.List;
/* renamed from: yy5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C52523yy5 implements InterfaceC52637zA0 {

    /* renamed from: a */
    public final String f120466a;

    /* renamed from: b */
    public final C27640qe f120467b;

    /* renamed from: c */
    public final List<C27640qe> f120468c;

    /* renamed from: d */
    public final C27323pe f120469d;

    /* renamed from: e */
    public final C28363se f120470e;

    /* renamed from: f */
    public final C27640qe f120471f;

    /* renamed from: g */
    public final EnumC30791b f120472g;

    /* renamed from: h */
    public final EnumC30792c f120473h;

    /* renamed from: i */
    public final float f120474i;

    /* renamed from: j */
    public final boolean f120475j;

    /* renamed from: yy5$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C30790a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f120476a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f120477b;

        static {
            int[] iArr = new int[EnumC30792c.values().length];
            f120477b = iArr;
            try {
                iArr[EnumC30792c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f120477b[EnumC30792c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f120477b[EnumC30792c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[EnumC30791b.values().length];
            f120476a = iArr2;
            try {
                iArr2[EnumC30791b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f120476a[EnumC30791b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f120476a[EnumC30791b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: yy5$b */
    /* loaded from: classes2.dex */
    public enum EnumC30791b {
        BUTT,
        ROUND,
        UNKNOWN;

        /* renamed from: b */
        public Paint.Cap m2185b() {
            int i = C30790a.f120476a[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    /* renamed from: yy5$c */
    /* loaded from: classes2.dex */
    public enum EnumC30792c {
        MITER,
        ROUND,
        BEVEL;

        /* renamed from: b */
        public Paint.Join m2183b() {
            int i = C30790a.f120477b[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return Paint.Join.ROUND;
                }
                return Paint.Join.MITER;
            }
            return Paint.Join.BEVEL;
        }
    }

    public C52523yy5(String str, C27640qe c27640qe, List<C27640qe> list, C27323pe c27323pe, C28363se c28363se, C27640qe c27640qe2, EnumC30791b enumC30791b, EnumC30792c enumC30792c, float f, boolean z) {
        this.f120466a = str;
        this.f120467b = c27640qe;
        this.f120468c = list;
        this.f120469d = c27323pe;
        this.f120470e = c28363se;
        this.f120471f = c27640qe2;
        this.f120472g = enumC30791b;
        this.f120473h = enumC30792c;
        this.f120474i = f;
        this.f120475j = z;
    }

    @Override // p000.InterfaceC52637zA0
    /* renamed from: a */
    public InterfaceC36752Vz0 mo483a(RD2 rd2, C47924rD2 c47924rD2, AbstractC27525qB abstractC27525qB) {
        return new MS5(rd2, abstractC27525qB, this);
    }

    /* renamed from: b */
    public EnumC30791b m2196b() {
        return this.f120472g;
    }

    /* renamed from: c */
    public C27323pe m2195c() {
        return this.f120469d;
    }

    /* renamed from: d */
    public C27640qe m2194d() {
        return this.f120467b;
    }

    /* renamed from: e */
    public EnumC30792c m2193e() {
        return this.f120473h;
    }

    /* renamed from: f */
    public List<C27640qe> m2192f() {
        return this.f120468c;
    }

    /* renamed from: g */
    public float m2191g() {
        return this.f120474i;
    }

    /* renamed from: h */
    public String m2190h() {
        return this.f120466a;
    }

    /* renamed from: i */
    public C28363se m2189i() {
        return this.f120470e;
    }

    /* renamed from: j */
    public C27640qe m2188j() {
        return this.f120471f;
    }

    /* renamed from: k */
    public boolean m2187k() {
        return this.f120475j;
    }
}
