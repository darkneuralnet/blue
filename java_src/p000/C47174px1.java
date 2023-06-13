package p000;

import android.app.Application;
import co.bird.android.foregroundservice.ForegroundServiceLifecycleObserver;
import dagger.Lazy;
/* renamed from: px1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47174px1 implements InterfaceC48812sj1<ForegroundServiceLifecycleObserver> {

    /* renamed from: a */
    public final Y94<Application> f104372a;

    /* renamed from: b */
    public final Y94<InterfaceC41244fx1> f104373b;

    /* renamed from: c */
    public final Y94<LifecycleOwner> f104374c;

    public C47174px1(Y94<Application> y94, Y94<InterfaceC41244fx1> y942, Y94<LifecycleOwner> y943) {
        this.f104372a = y94;
        this.f104373b = y942;
        this.f104374c = y943;
    }

    /* renamed from: a */
    public static C47174px1 m18409a(Y94<Application> y94, Y94<InterfaceC41244fx1> y942, Y94<LifecycleOwner> y943) {
        return new C47174px1(y94, y942, y943);
    }

    /* renamed from: c */
    public static ForegroundServiceLifecycleObserver m18407c(Application application, Lazy<InterfaceC41244fx1> lazy, LifecycleOwner lifecycleOwner) {
        return new ForegroundServiceLifecycleObserver(application, lazy, lifecycleOwner);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public ForegroundServiceLifecycleObserver get() {
        return m18407c(this.f104372a.get(), V51.m80430a(this.f104373b), this.f104374c.get());
    }
}
