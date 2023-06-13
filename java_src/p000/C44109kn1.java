package p000;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
/* renamed from: kn1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44109kn1 implements InterfaceC48812sj1<FirebaseCrashlytics> {

    /* renamed from: a */
    public final C43516jn1 f94939a;

    public C44109kn1(C43516jn1 c43516jn1) {
        this.f94939a = c43516jn1;
    }

    /* renamed from: a */
    public static C44109kn1 m28446a(C43516jn1 c43516jn1) {
        return new C44109kn1(c43516jn1);
    }

    /* renamed from: b */
    public static FirebaseCrashlytics m28445b(C43516jn1 c43516jn1) {
        return (FirebaseCrashlytics) C51679xZ3.m5002e(c43516jn1.m29934a());
    }

    @Override // p000.Y94
    /* renamed from: c */
    public FirebaseCrashlytics get() {
        return m28445b(this.f94939a);
    }
}
