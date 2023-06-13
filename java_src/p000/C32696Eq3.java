package p000;

import co.bird.android.app.feature.operator.activity.LocationEnableChangeReceiver;
import io.reactivex.Observable;
/* renamed from: Eq3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C32696Eq3 implements InterfaceC48812sj1<Observable<Boolean>> {

    /* renamed from: a */
    public final Y94<LocationEnableChangeReceiver> f8182a;

    public C32696Eq3(Y94<LocationEnableChangeReceiver> y94) {
        this.f8182a = y94;
    }

    /* renamed from: a */
    public static C32696Eq3 m108332a(Y94<LocationEnableChangeReceiver> y94) {
        return new C32696Eq3(y94);
    }

    /* renamed from: c */
    public static Observable<Boolean> m108330c(LocationEnableChangeReceiver locationEnableChangeReceiver) {
        return (Observable) C51679xZ3.m5002e(AbstractC32228Cq3.m111420b(locationEnableChangeReceiver));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public Observable<Boolean> get() {
        return m108330c(this.f8182a.get());
    }
}
