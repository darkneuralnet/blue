package androidx.camera.core;

import android.util.Size;
/* renamed from: androidx.camera.core.m */
/* loaded from: classes.dex */
public class C11240m {

    /* renamed from: a */
    public final Size f52739a;

    /* renamed from: b */
    public final AB5 f52740b;

    /* renamed from: c */
    public final int f52741c;

    /* renamed from: d */
    public final Size f52742d;

    /* renamed from: e */
    public final boolean f52743e;

    public C11240m(int i, Size size, AB5 ab5, Size size2, boolean z) {
        this.f52741c = i;
        this.f52739a = size;
        this.f52740b = ab5;
        this.f52742d = size2;
        this.f52743e = z;
    }

    /* renamed from: a */
    public Size m69146a() {
        return this.f52742d;
    }

    /* renamed from: b */
    public int m69145b() {
        return this.f52741c;
    }

    /* renamed from: c */
    public Size m69144c() {
        return this.f52739a;
    }

    /* renamed from: d */
    public AB5 m69143d() {
        return this.f52740b;
    }

    /* renamed from: e */
    public boolean m69142e() {
        return this.f52743e;
    }

    /* renamed from: androidx.camera.core.m$a */
    /* loaded from: classes.dex */
    public static final class C11241a {

        /* renamed from: a */
        public int f52744a;

        /* renamed from: b */
        public Size f52745b;

        /* renamed from: c */
        public AB5 f52746c;

        /* renamed from: d */
        public Size f52747d;

        /* renamed from: e */
        public boolean f52748e;

        public C11241a() {
            this.f52744a = 0;
            this.f52745b = null;
            this.f52746c = AB5.CAMERA_SENSOR;
            this.f52747d = null;
            this.f52748e = false;
        }

        /* renamed from: b */
        public static C11241a m69140b(C11240m c11240m) {
            return new C11241a(c11240m);
        }

        /* renamed from: a */
        public C11240m m69141a() {
            return new C11240m(this.f52744a, this.f52745b, this.f52746c, this.f52747d, this.f52748e);
        }

        /* renamed from: c */
        public C11241a m69139c(Size size) {
            this.f52747d = size;
            return this;
        }

        /* renamed from: d */
        public C11241a m69138d(Size size) {
            this.f52745b = size;
            this.f52746c = AB5.CAMERA_SENSOR;
            return this;
        }

        public C11241a(C11240m c11240m) {
            this.f52744a = 0;
            this.f52745b = null;
            this.f52746c = AB5.CAMERA_SENSOR;
            this.f52747d = null;
            this.f52748e = false;
            this.f52744a = c11240m.m69145b();
            this.f52745b = c11240m.m69144c();
            this.f52746c = c11240m.m69143d();
            this.f52747d = c11240m.m69146a();
            this.f52748e = c11240m.m69142e();
        }
    }
}
