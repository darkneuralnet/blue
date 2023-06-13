package p000;

import co.bird.android.runtime.logging.CrashlyticsTree;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
/* renamed from: gE0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41408gE0 implements InterfaceC48812sj1<CrashlyticsTree> {

    /* renamed from: a */
    public final Y94<FirebaseCrashlytics> f81786a;

    /* renamed from: b */
    public final Y94<InterfaceC40001dr4> f81787b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f81788c;

    /* renamed from: d */
    public final Y94<InterfaceC0650Bc> f81789d;

    /* renamed from: e */
    public final Y94<InterfaceC35660Rh6> f81790e;

    public C41408gE0(Y94<FirebaseCrashlytics> y94, Y94<InterfaceC40001dr4> y942, Y94<C36207Tq4> y943, Y94<InterfaceC0650Bc> y944, Y94<InterfaceC35660Rh6> y945) {
        this.f81786a = y94;
        this.f81787b = y942;
        this.f81788c = y943;
        this.f81789d = y944;
        this.f81790e = y945;
    }

    /* renamed from: a */
    public static C41408gE0 m39846a(Y94<FirebaseCrashlytics> y94, Y94<InterfaceC40001dr4> y942, Y94<C36207Tq4> y943, Y94<InterfaceC0650Bc> y944, Y94<InterfaceC35660Rh6> y945) {
        return new C41408gE0(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static CrashlyticsTree m39844c(FirebaseCrashlytics firebaseCrashlytics, InterfaceC40001dr4 interfaceC40001dr4, C36207Tq4 c36207Tq4, InterfaceC0650Bc interfaceC0650Bc, InterfaceC35660Rh6 interfaceC35660Rh6) {
        return new CrashlyticsTree(firebaseCrashlytics, interfaceC40001dr4, c36207Tq4, interfaceC0650Bc, interfaceC35660Rh6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public CrashlyticsTree get() {
        return m39844c(this.f81786a.get(), this.f81787b.get(), this.f81788c.get(), this.f81789d.get(), this.f81790e.get());
    }
}
