package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import ch.qos.logback.core.CoreConstants;
import p000.C32514Dw1;
import p000.C34386Lw1;
import p000.C49785uM4;
/* renamed from: Jb6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C33734Jb6 {

    /* renamed from: a */
    public static final C49933uc6 f17892a;

    /* renamed from: b */
    public static final C50303vE2<String, Typeface> f17893b;

    /* renamed from: Jb6$a */
    /* loaded from: classes.dex */
    public static class C4165a extends C34386Lw1.C5133c {

        /* renamed from: a */
        public C49785uM4.AbstractC29183e f17894a;

        public C4165a(C49785uM4.AbstractC29183e abstractC29183e) {
            this.f17894a = abstractC29183e;
        }

        @Override // p000.C34386Lw1.C5133c
        /* renamed from: a */
        public void mo96105a(int i) {
            C49785uM4.AbstractC29183e abstractC29183e = this.f17894a;
            if (abstractC29183e != null) {
                abstractC29183e.m10378f(i);
            }
        }

        @Override // p000.C34386Lw1.C5133c
        /* renamed from: b */
        public void mo96104b(Typeface typeface) {
            C49785uM4.AbstractC29183e abstractC29183e = this.f17894a;
            if (abstractC29183e != null) {
                abstractC29183e.m10377g(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f17892a = new C49340tc6();
        } else if (i >= 28) {
            f17892a = new C36542Vb6();
        } else if (i >= 26) {
            f17892a = new C36308Ub6();
        } else if (C34202Lb6.m96599m()) {
            f17892a = new C34202Lb6();
        } else {
            f17892a = new C33968Kb6();
        }
        f17893b = new C50303vE2<>(16);
    }

    private C33734Jb6() {
    }

    /* renamed from: a */
    public static Typeface m100129a(Context context, Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* renamed from: b */
    public static Typeface m100128b(Context context, CancellationSignal cancellationSignal, C34386Lw1.C5132b[] c5132bArr, int i) {
        return f17892a.mo9960c(context, cancellationSignal, c5132bArr, i);
    }

    /* renamed from: c */
    public static Typeface m100127c(Context context, C32514Dw1.InterfaceC1670b interfaceC1670b, Resources resources, int i, String str, int i2, int i3, C49785uM4.AbstractC29183e abstractC29183e, Handler handler, boolean z) {
        Typeface mo9961b;
        boolean z2;
        int i4;
        if (interfaceC1670b instanceof C32514Dw1.C1673e) {
            C32514Dw1.C1673e c1673e = (C32514Dw1.C1673e) interfaceC1670b;
            Typeface m100123g = m100123g(c1673e.m109601c());
            if (m100123g != null) {
                if (abstractC29183e != null) {
                    abstractC29183e.m10380d(m100123g, handler);
                }
                return m100123g;
            }
            if (!z ? abstractC29183e == null : c1673e.m109603a() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                i4 = c1673e.m109600d();
            } else {
                i4 = -1;
            }
            mo9961b = C34386Lw1.m96115c(context, c1673e.m109602b(), i3, z2, i4, C49785uM4.AbstractC29183e.m10379e(handler), new C4165a(abstractC29183e));
        } else {
            mo9961b = f17892a.mo9961b(context, (C32514Dw1.C1671c) interfaceC1670b, resources, i3);
            if (abstractC29183e != null) {
                if (mo9961b != null) {
                    abstractC29183e.m10380d(mo9961b, handler);
                } else {
                    abstractC29183e.m10381c(-3, handler);
                }
            }
        }
        if (mo9961b != null) {
            f17893b.m8992e(m100125e(resources, i, str, i2, i3), mo9961b);
        }
        return mo9961b;
    }

    /* renamed from: d */
    public static Typeface m100126d(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface mo9958e = f17892a.mo9958e(context, resources, i, str, i3);
        if (mo9958e != null) {
            f17893b.m8992e(m100125e(resources, i, str, i2, i3), mo9958e);
        }
        return mo9958e;
    }

    /* renamed from: e */
    public static String m100125e(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + CoreConstants.DASH_CHAR + str + CoreConstants.DASH_CHAR + i2 + CoreConstants.DASH_CHAR + i + CoreConstants.DASH_CHAR + i3;
    }

    /* renamed from: f */
    public static Typeface m100124f(Resources resources, int i, String str, int i2, int i3) {
        return f17893b.m8993d(m100125e(resources, i, str, i2, i3));
    }

    /* renamed from: g */
    public static Typeface m100123g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
