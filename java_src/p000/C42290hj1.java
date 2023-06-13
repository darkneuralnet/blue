package p000;

import com.google.android.gms.common.internal.Objects;
import java.util.concurrent.Executor;
/* renamed from: hj1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C42290hj1 {

    /* renamed from: a */
    public final int f85786a;

    /* renamed from: b */
    public final int f85787b;

    /* renamed from: c */
    public final int f85788c;

    /* renamed from: d */
    public final int f85789d;

    /* renamed from: e */
    public final boolean f85790e;

    /* renamed from: f */
    public final float f85791f;

    /* renamed from: g */
    public final Executor f85792g;

    /* renamed from: hj1$a */
    /* loaded from: classes6.dex */
    public static class C22712a {

        /* renamed from: a */
        public int f85793a = 1;

        /* renamed from: b */
        public int f85794b = 1;

        /* renamed from: c */
        public int f85795c = 1;

        /* renamed from: d */
        public int f85796d = 1;

        /* renamed from: e */
        public boolean f85797e = false;

        /* renamed from: f */
        public float f85798f = 0.1f;

        /* renamed from: g */
        public Executor f85799g;

        /* renamed from: a */
        public C42290hj1 m35947a() {
            return new C42290hj1(this.f85793a, this.f85794b, this.f85795c, this.f85796d, this.f85797e, this.f85798f, this.f85799g, null);
        }

        /* renamed from: b */
        public C22712a m35946b(int i) {
            this.f85795c = i;
            return this;
        }

        /* renamed from: c */
        public C22712a m35945c(int i) {
            this.f85794b = i;
            return this;
        }

        /* renamed from: d */
        public C22712a m35944d(int i) {
            this.f85793a = i;
            return this;
        }

        /* renamed from: e */
        public C22712a m35943e(int i) {
            this.f85796d = i;
            return this;
        }
    }

    public /* synthetic */ C42290hj1(int i, int i2, int i3, int i4, boolean z, float f, Executor executor, C42256hf7 c42256hf7) {
        this.f85786a = i;
        this.f85787b = i2;
        this.f85788c = i3;
        this.f85789d = i4;
        this.f85790e = z;
        this.f85791f = f;
        this.f85792g = executor;
    }

    /* renamed from: a */
    public final float m35954a() {
        return this.f85791f;
    }

    /* renamed from: b */
    public final int m35953b() {
        return this.f85788c;
    }

    /* renamed from: c */
    public final int m35952c() {
        return this.f85787b;
    }

    /* renamed from: d */
    public final int m35951d() {
        return this.f85786a;
    }

    /* renamed from: e */
    public final int m35950e() {
        return this.f85789d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C42290hj1)) {
            return false;
        }
        C42290hj1 c42290hj1 = (C42290hj1) obj;
        if (Float.floatToIntBits(this.f85791f) == Float.floatToIntBits(c42290hj1.f85791f) && Objects.equal(Integer.valueOf(this.f85786a), Integer.valueOf(c42290hj1.f85786a)) && Objects.equal(Integer.valueOf(this.f85787b), Integer.valueOf(c42290hj1.f85787b)) && Objects.equal(Integer.valueOf(this.f85789d), Integer.valueOf(c42290hj1.f85789d)) && Objects.equal(Boolean.valueOf(this.f85790e), Boolean.valueOf(c42290hj1.f85790e)) && Objects.equal(Integer.valueOf(this.f85788c), Integer.valueOf(c42290hj1.f85788c)) && Objects.equal(this.f85792g, c42290hj1.f85792g)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final Executor m35949f() {
        return this.f85792g;
    }

    /* renamed from: g */
    public final boolean m35948g() {
        return this.f85790e;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Float.floatToIntBits(this.f85791f)), Integer.valueOf(this.f85786a), Integer.valueOf(this.f85787b), Integer.valueOf(this.f85789d), Boolean.valueOf(this.f85790e), Integer.valueOf(this.f85788c), this.f85792g);
    }

    public String toString() {
        Ht9 m43498a = C40046dv9.m43498a("FaceDetectorOptions");
        m43498a.m103238b("landmarkMode", this.f85786a);
        m43498a.m103238b("contourMode", this.f85787b);
        m43498a.m103238b("classificationMode", this.f85788c);
        m43498a.m103238b("performanceMode", this.f85789d);
        m43498a.m103236d("trackingEnabled", this.f85790e);
        m43498a.m103239a("minFaceSize", this.f85791f);
        return m43498a.toString();
    }
}
