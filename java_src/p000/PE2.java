package p000;

import android.os.Parcel;
import android.os.Parcelable;
import p000.C35621Rd3;
/* renamed from: PE2 */
/* loaded from: classes5.dex */
public class PE2 extends C35621Rd3.AbstractC7219a {

    /* renamed from: e */
    public static C35621Rd3<PE2> f28144e;

    /* renamed from: f */
    public static final Parcelable.Creator<PE2> f28145f;

    /* renamed from: c */
    public float f28146c;

    /* renamed from: d */
    public float f28147d;

    /* renamed from: PE2$a */
    /* loaded from: classes5.dex */
    public static class C6300a implements Parcelable.Creator<PE2> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PE2 createFromParcel(Parcel parcel) {
            PE2 pe2 = new PE2(0.0f, 0.0f);
            pe2.m90556e(parcel);
            return pe2;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PE2[] newArray(int i) {
            return new PE2[i];
        }
    }

    static {
        C35621Rd3<PE2> m86536a = C35621Rd3.m86536a(32, new PE2(0.0f, 0.0f));
        f28144e = m86536a;
        m86536a.m86530g(0.5f);
        f28145f = new C6300a();
    }

    public PE2() {
    }

    /* renamed from: b */
    public static PE2 m90559b() {
        return f28144e.m86535b();
    }

    /* renamed from: c */
    public static PE2 m90558c(float f, float f2) {
        PE2 m86535b = f28144e.m86535b();
        m86535b.f28146c = f;
        m86535b.f28147d = f2;
        return m86535b;
    }

    /* renamed from: d */
    public static PE2 m90557d(PE2 pe2) {
        PE2 m86535b = f28144e.m86535b();
        m86535b.f28146c = pe2.f28146c;
        m86535b.f28147d = pe2.f28147d;
        return m86535b;
    }

    /* renamed from: f */
    public static void m90555f(PE2 pe2) {
        f28144e.m86534c(pe2);
    }

    @Override // p000.C35621Rd3.AbstractC7219a
    /* renamed from: a */
    public C35621Rd3.AbstractC7219a mo72662a() {
        return new PE2(0.0f, 0.0f);
    }

    /* renamed from: e */
    public void m90556e(Parcel parcel) {
        this.f28146c = parcel.readFloat();
        this.f28147d = parcel.readFloat();
    }

    public PE2(float f, float f2) {
        this.f28146c = f;
        this.f28147d = f2;
    }
}
