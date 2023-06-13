package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
/* renamed from: Lw1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C34386Lw1 {

    /* renamed from: Lw1$a */
    /* loaded from: classes.dex */
    public static class C5131a {

        /* renamed from: a */
        public final int f22303a;

        /* renamed from: b */
        public final C5132b[] f22304b;

        @Deprecated
        public C5131a(int i, C5132b[] c5132bArr) {
            this.f22303a = i;
            this.f22304b = c5132bArr;
        }

        /* renamed from: a */
        public static C5131a m96114a(int i, C5132b[] c5132bArr) {
            return new C5131a(i, c5132bArr);
        }

        /* renamed from: b */
        public C5132b[] m96113b() {
            return this.f22304b;
        }

        /* renamed from: c */
        public int m96112c() {
            return this.f22303a;
        }
    }

    /* renamed from: Lw1$b */
    /* loaded from: classes.dex */
    public static class C5132b {

        /* renamed from: a */
        public final Uri f22305a;

        /* renamed from: b */
        public final int f22306b;

        /* renamed from: c */
        public final int f22307c;

        /* renamed from: d */
        public final boolean f22308d;

        /* renamed from: e */
        public final int f22309e;

        @Deprecated
        public C5132b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f22305a = (Uri) HZ3.m103731g(uri);
            this.f22306b = i;
            this.f22307c = i2;
            this.f22308d = z;
            this.f22309e = i3;
        }

        /* renamed from: a */
        public static C5132b m96111a(Uri uri, int i, int i2, boolean z, int i3) {
            return new C5132b(uri, i, i2, z, i3);
        }

        /* renamed from: b */
        public int m96110b() {
            return this.f22309e;
        }

        /* renamed from: c */
        public int m96109c() {
            return this.f22306b;
        }

        /* renamed from: d */
        public Uri m96108d() {
            return this.f22305a;
        }

        /* renamed from: e */
        public int m96107e() {
            return this.f22307c;
        }

        /* renamed from: f */
        public boolean m96106f() {
            return this.f22308d;
        }
    }

    /* renamed from: Lw1$c */
    /* loaded from: classes.dex */
    public static class C5133c {
        /* renamed from: a */
        public void mo96105a(int i) {
        }

        /* renamed from: b */
        public void mo96104b(Typeface typeface) {
        }
    }

    private C34386Lw1() {
    }

    /* renamed from: a */
    public static Typeface m96117a(Context context, CancellationSignal cancellationSignal, C5132b[] c5132bArr) {
        return C33734Jb6.m100128b(context, cancellationSignal, c5132bArr, 0);
    }

    /* renamed from: b */
    public static C5131a m96116b(Context context, CancellationSignal cancellationSignal, C53092zw1 c53092zw1) throws PackageManager.NameNotFoundException {
        return C52499yw1.m2243e(context, c53092zw1, cancellationSignal);
    }

    /* renamed from: c */
    public static Typeface m96115c(Context context, C53092zw1 c53092zw1, int i, boolean z, int i2, Handler handler, C5133c c5133c) {
        P80 p80 = new P80(c5133c, handler);
        if (z) {
            return C32280Cw1.m111271e(context, c53092zw1, p80, i, i2);
        }
        return C32280Cw1.m111272d(context, c53092zw1, i, null, p80);
    }
}
