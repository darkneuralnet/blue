package p000;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
/* renamed from: Bx */
/* loaded from: classes6.dex */
public class C0774Bx {

    /* renamed from: a */
    public final InterfaceC30355xy f3073a;

    /* renamed from: b */
    public final Rect f3074b;

    /* renamed from: c */
    public final Point[] f3075c;

    /* renamed from: Bx$a */
    /* loaded from: classes6.dex */
    public static class C0775a {

        /* renamed from: a */
        public final String f3076a;

        /* renamed from: b */
        public final String f3077b;

        /* renamed from: c */
        public final String f3078c;

        /* renamed from: d */
        public final String f3079d;

        /* renamed from: e */
        public final String f3080e;

        /* renamed from: f */
        public final String f3081f;

        /* renamed from: g */
        public final String f3082g;

        /* renamed from: h */
        public final String f3083h;

        /* renamed from: i */
        public final String f3084i;

        /* renamed from: j */
        public final String f3085j;

        /* renamed from: k */
        public final String f3086k;

        /* renamed from: l */
        public final String f3087l;

        /* renamed from: m */
        public final String f3088m;

        /* renamed from: n */
        public final String f3089n;

        @KeepForSdk
        public C0775a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            this.f3076a = str;
            this.f3077b = str2;
            this.f3078c = str3;
            this.f3079d = str4;
            this.f3080e = str5;
            this.f3081f = str6;
            this.f3082g = str7;
            this.f3083h = str8;
            this.f3084i = str9;
            this.f3085j = str10;
            this.f3086k = str11;
            this.f3087l = str12;
            this.f3088m = str13;
            this.f3089n = str14;
        }

        /* renamed from: a */
        public String m113294a() {
            return this.f3082g;
        }

        /* renamed from: b */
        public String m113293b() {
            return this.f3083h;
        }

        /* renamed from: c */
        public String m113292c() {
            return this.f3081f;
        }

        /* renamed from: d */
        public String m113291d() {
            return this.f3084i;
        }

        /* renamed from: e */
        public String m113290e() {
            return this.f3088m;
        }

        /* renamed from: f */
        public String m113289f() {
            return this.f3076a;
        }

        /* renamed from: g */
        public String m113288g() {
            return this.f3087l;
        }

        /* renamed from: h */
        public String m113287h() {
            return this.f3077b;
        }

        /* renamed from: i */
        public String m113286i() {
            return this.f3080e;
        }

        /* renamed from: j */
        public String m113285j() {
            return this.f3086k;
        }

        /* renamed from: k */
        public String m113284k() {
            return this.f3089n;
        }

        /* renamed from: l */
        public String m113283l() {
            return this.f3079d;
        }

        /* renamed from: m */
        public String m113282m() {
            return this.f3085j;
        }

        /* renamed from: n */
        public String m113281n() {
            return this.f3078c;
        }
    }

    @KeepForSdk
    public C0774Bx(InterfaceC30355xy interfaceC30355xy, Matrix matrix) {
        this.f3073a = (InterfaceC30355xy) Preconditions.checkNotNull(interfaceC30355xy);
        Rect mo4376d = interfaceC30355xy.mo4376d();
        if (mo4376d != null && matrix != null) {
            C48871sp0.m13602e(mo4376d, matrix);
        }
        this.f3074b = mo4376d;
        Point[] mo4374f = interfaceC30355xy.mo4374f();
        if (mo4374f != null && matrix != null) {
            C48871sp0.m13605b(mo4374f, matrix);
        }
        this.f3075c = mo4374f;
    }

    /* renamed from: a */
    public Rect m113300a() {
        return this.f3074b;
    }

    /* renamed from: b */
    public String m113299b() {
        return this.f3073a.mo4379a();
    }

    /* renamed from: c */
    public C0775a m113298c() {
        return this.f3073a.mo4377c();
    }

    /* renamed from: d */
    public int m113297d() {
        int format = this.f3073a.getFormat();
        if (format > 4096 || format == 0) {
            return -1;
        }
        return format;
    }

    /* renamed from: e */
    public String m113296e() {
        return this.f3073a.mo4375e();
    }

    /* renamed from: f */
    public int m113295f() {
        return this.f3073a.mo4378b();
    }
}
