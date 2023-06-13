package p000;

import android.hardware.camera2.CaptureResult;
import p000.C36825Wh1;
/* renamed from: xa0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC51685xa0 {

    /* renamed from: xa0$a */
    /* loaded from: classes.dex */
    public static final class C30236a implements InterfaceC51685xa0 {
        /* renamed from: h */
        public static InterfaceC51685xa0 m4998h() {
            return new C30236a();
        }

        @Override // p000.InterfaceC51685xa0
        /* renamed from: b */
        public C51672xY5 mo2304b() {
            return C51672xY5.m5018a();
        }

        @Override // p000.InterfaceC51685xa0
        /* renamed from: c */
        public EnumC49907ua0 mo2303c() {
            return EnumC49907ua0.UNKNOWN;
        }

        @Override // p000.InterfaceC51685xa0
        /* renamed from: d */
        public EnumC50499va0 mo2302d() {
            return EnumC50499va0.UNKNOWN;
        }

        @Override // p000.InterfaceC51685xa0
        /* renamed from: e */
        public EnumC48721sa0 mo2301e() {
            return EnumC48721sa0.UNKNOWN;
        }

        @Override // p000.InterfaceC51685xa0
        /* renamed from: f */
        public EnumC51092wa0 mo2300f() {
            return EnumC51092wa0.UNKNOWN;
        }

        @Override // p000.InterfaceC51685xa0
        public long getTimestamp() {
            return -1L;
        }
    }

    /* renamed from: a */
    default void mo5000a(C36825Wh1.C9150b c9150b) {
        c9150b.m77993g(mo2300f());
    }

    /* renamed from: b */
    C51672xY5 mo2304b();

    /* renamed from: c */
    EnumC49907ua0 mo2303c();

    /* renamed from: d */
    EnumC50499va0 mo2302d();

    /* renamed from: e */
    EnumC48721sa0 mo2301e();

    /* renamed from: f */
    EnumC51092wa0 mo2300f();

    /* renamed from: g */
    default CaptureResult mo4999g() {
        return C30236a.m4998h().mo4999g();
    }

    long getTimestamp();
}
