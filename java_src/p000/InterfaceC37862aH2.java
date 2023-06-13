package p000;

import android.os.Looper;
/* renamed from: aH2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC37862aH2 {

    /* renamed from: aH2$a */
    /* loaded from: classes8.dex */
    public static class C10611a implements InterfaceC37862aH2 {

        /* renamed from: a */
        public final Looper f50218a;

        public C10611a(Looper looper) {
            this.f50218a = looper;
        }

        @Override // p000.InterfaceC37862aH2
        /* renamed from: a */
        public boolean mo71710a() {
            return this.f50218a == Looper.myLooper();
        }

        @Override // p000.InterfaceC37862aH2
        /* renamed from: b */
        public JY3 mo71709b(C31902Bg1 c31902Bg1) {
            return new UE1(c31902Bg1, this.f50218a, 10);
        }
    }

    /* renamed from: a */
    boolean mo71710a();

    /* renamed from: b */
    JY3 mo71709b(C31902Bg1 c31902Bg1);
}
