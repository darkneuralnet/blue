package p000;

import co.bird.android.app.feature.operator.activity.BluetoothEnableChangeReceiver;
import io.reactivex.Observable;
/* renamed from: Dq3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C32462Dq3 implements InterfaceC48812sj1<Observable<Boolean>> {

    /* renamed from: a */
    public final Y94<BluetoothEnableChangeReceiver> f6419a;

    public C32462Dq3(Y94<BluetoothEnableChangeReceiver> y94) {
        this.f6419a = y94;
    }

    /* renamed from: a */
    public static Observable<Boolean> m109857a(BluetoothEnableChangeReceiver bluetoothEnableChangeReceiver) {
        return (Observable) C51679xZ3.m5002e(AbstractC32228Cq3.m111421a(bluetoothEnableChangeReceiver));
    }

    /* renamed from: b */
    public static C32462Dq3 m109856b(Y94<BluetoothEnableChangeReceiver> y94) {
        return new C32462Dq3(y94);
    }

    @Override // p000.Y94
    /* renamed from: c */
    public Observable<Boolean> get() {
        return m109857a(this.f6419a.get());
    }
}
