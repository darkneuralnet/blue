package p000;

import android.app.Activity;
import android.content.Context;
/* renamed from: wZ1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C51084wZ1 {

    /* renamed from: u */
    public static final String f116156u = C43664k20.m29433n(C51084wZ1.class);

    /* renamed from: a */
    public boolean f116157a = false;

    /* renamed from: b */
    public boolean f116158b = true;

    /* renamed from: c */
    public Activity f116159c;

    /* renamed from: d */
    public Context f116160d;

    /* renamed from: e */
    public final JO1 f116161e;

    /* renamed from: f */
    public final InterfaceC50392vO1 f116162f;

    /* renamed from: g */
    public final FO1 f116163g;

    /* renamed from: h */
    public final FO1 f116164h;

    /* renamed from: i */
    public final FO1 f116165i;

    /* renamed from: j */
    public final FO1 f116166j;

    /* renamed from: k */
    public final FO1 f116167k;

    /* renamed from: l */
    public final InterfaceC51578xO1 f116168l;

    /* renamed from: m */
    public final CO1 f116169m;

    /* renamed from: n */
    public final IO1 f116170n;

    /* renamed from: o */
    public FO1 f116171o;

    /* renamed from: p */
    public InterfaceC51578xO1 f116172p;

    /* renamed from: q */
    public CO1 f116173q;

    /* renamed from: r */
    public IO1 f116174r;

    /* renamed from: s */
    public InterfaceC50392vO1 f116175s;

    /* renamed from: t */
    public CO1 f116176t;

    /* renamed from: wZ1$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C29914a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f116177a;

        static {
            int[] iArr = new int[EnumC52810zT2.values().length];
            f116177a = iArr;
            try {
                iArr[EnumC52810zT2.SLIDEUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116177a[EnumC52810zT2.MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116177a[EnumC52810zT2.FULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116177a[EnumC52810zT2.HTML_FULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f116177a[EnumC52810zT2.HTML.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C51084wZ1() {
        OX0 ox0 = new OX0();
        this.f116161e = ox0;
        this.f116162f = new C50472vX0();
        this.f116163g = new FX0();
        this.f116164h = new EX0();
        this.f116165i = new C52844zX0();
        this.f116166j = new AX0(ox0);
        this.f116167k = new BX0(ox0);
        this.f116168l = new C51658xX0();
        this.f116169m = new CX0();
        this.f116170n = new NX0();
    }

    /* renamed from: a */
    public Activity m6659a() {
        return this.f116159c;
    }

    /* renamed from: b */
    public Context m6658b() {
        return this.f116160d;
    }

    /* renamed from: c */
    public CO1 m6657c() {
        CO1 co1 = this.f116176t;
        return co1 != null ? co1 : this.f116169m;
    }

    /* renamed from: d */
    public FO1 m6656d(InterfaceC50985wO1 interfaceC50985wO1) {
        int i = C29914a.f116177a[interfaceC50985wO1.mo5008h0().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            String str = f116156u;
                            C43664k20.m29421z(str, "Failed to find view factory for in-app message with type: " + interfaceC50985wO1.mo5008h0());
                            return null;
                        }
                        return this.f116167k;
                    }
                    return this.f116166j;
                }
                return this.f116165i;
            }
            return this.f116164h;
        }
        return this.f116163g;
    }

    /* renamed from: e */
    public boolean m6655e() {
        return this.f116158b;
    }

    /* renamed from: f */
    public boolean m6654f() {
        return this.f116157a;
    }

    /* renamed from: g */
    public InterfaceC50392vO1 m6653g() {
        InterfaceC50392vO1 interfaceC50392vO1 = this.f116175s;
        return interfaceC50392vO1 != null ? interfaceC50392vO1 : this.f116162f;
    }

    /* renamed from: h */
    public InterfaceC51578xO1 m6652h() {
        InterfaceC51578xO1 interfaceC51578xO1 = this.f116172p;
        return interfaceC51578xO1 != null ? interfaceC51578xO1 : this.f116168l;
    }

    /* renamed from: i */
    public CO1 m6651i() {
        CO1 co1 = this.f116173q;
        return co1 != null ? co1 : this.f116169m;
    }

    /* renamed from: j */
    public FO1 m6650j(InterfaceC50985wO1 interfaceC50985wO1) {
        FO1 fo1 = this.f116171o;
        if (fo1 != null) {
            return fo1;
        }
        return m6656d(interfaceC50985wO1);
    }

    /* renamed from: k */
    public IO1 m6649k() {
        IO1 io1 = this.f116174r;
        return io1 != null ? io1 : this.f116170n;
    }
}
