package p000;
/* renamed from: tH6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C49149tH6 extends AbstractC9544Xu {

    /* renamed from: J */
    public int f110252J = 1;

    /* renamed from: K */
    public int f110253K = 1;

    /* renamed from: L */
    public int f110254L = 1;

    /* renamed from: M */
    public int f110255M = 1;

    /* renamed from: N */
    public float f110256N = 0.0f;

    /* renamed from: O */
    public boolean f110257O = false;

    /* renamed from: P */
    public EnumC28671a f110258P = EnumC28671a.TOP;

    /* renamed from: tH6$a */
    /* loaded from: classes5.dex */
    public enum EnumC28671a {
        TOP,
        BOTTOM,
        BOTH_SIDED,
        TOP_INSIDE,
        BOTTOM_INSIDE
    }

    public C49149tH6() {
        this.f25312c = AbstractC34967Oi6.m91656e(4.0f);
    }

    /* renamed from: P */
    public float m12531P() {
        return this.f110256N;
    }

    /* renamed from: Q */
    public EnumC28671a m12530Q() {
        return this.f110258P;
    }

    /* renamed from: R */
    public boolean m12529R() {
        return this.f110257O;
    }

    /* renamed from: S */
    public void m12528S(EnumC28671a enumC28671a) {
        this.f110258P = enumC28671a;
    }
}
