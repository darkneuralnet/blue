package p000;

import android.bluetooth.BluetoothGatt;
import ch.qos.logback.core.CoreConstants;
import com.polidea.rxandroidble2.exceptions.BleGattCallbackTimeoutException;
import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* renamed from: Yt5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37405Yt5 extends AbstractC45537nB5<C49952ue5> {

    /* renamed from: f */
    public final BluetoothGatt f47596f;

    /* renamed from: g */
    public final C35332Px2 f47597g;

    public C37405Yt5(C50544ve5 c50544ve5, BluetoothGatt bluetoothGatt, C35332Px2 c35332Px2, L46 l46) {
        super(bluetoothGatt, c50544ve5, C29202uU.f112438c, l46);
        this.f47596f = bluetoothGatt;
        this.f47597g = c35332Px2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m74032k(C49952ue5 c49952ue5) throws Exception {
        this.f47597g.m89244m(c49952ue5, this.f47596f.getDevice());
    }

    /* renamed from: l */
    public static /* synthetic */ C49952ue5 m74031l(BluetoothGatt bluetoothGatt) throws Exception {
        return new C49952ue5(bluetoothGatt.getServices());
    }

    /* renamed from: m */
    public static /* synthetic */ AbstractC23442F m74030m(final BluetoothGatt bluetoothGatt, Long l) throws Exception {
        return AbstractC23442F.m33161E(new Callable() { // from class: Xt5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C49952ue5 m74031l;
                m74031l = C37405Yt5.m74031l(bluetoothGatt);
                return m74031l;
            }
        });
    }

    /* renamed from: n */
    public static /* synthetic */ InterfaceC23447K m74029n(final BluetoothGatt bluetoothGatt, AbstractC23437E abstractC23437E) throws Exception {
        if (bluetoothGatt.getServices().size() == 0) {
            return AbstractC23442F.m33100x(new BleGattCallbackTimeoutException(bluetoothGatt, C29202uU.f112438c));
        }
        return AbstractC23442F.m33131g0(5L, TimeUnit.SECONDS, abstractC23437E).m33165A(new InterfaceC23492o() { // from class: Wt5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                AbstractC23442F m74030m;
                m74030m = C37405Yt5.m74030m(bluetoothGatt, (Long) obj);
                return m74030m;
            }
        });
    }

    @Override // p000.AbstractC45537nB5
    /* renamed from: d */
    public AbstractC23442F<C49952ue5> mo2114d(C50544ve5 c50544ve5) {
        return c50544ve5.m8314h().firstOrError().m33101w(new InterfaceC23484g() { // from class: Ut5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37405Yt5.this.m74032k((C49952ue5) obj);
            }
        });
    }

    @Override // p000.AbstractC45537nB5
    /* renamed from: e */
    public boolean mo2113e(BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.discoverServices();
    }

    @Override // p000.AbstractC45537nB5
    /* renamed from: f */
    public AbstractC23442F<C49952ue5> mo24209f(final BluetoothGatt bluetoothGatt, C50544ve5 c50544ve5, final AbstractC23437E abstractC23437E) {
        return AbstractC23442F.m33124k(new Callable() { // from class: Vt5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23447K m74029n;
                m74029n = C37405Yt5.m74029n(bluetoothGatt, abstractC23437E);
                return m74029n;
            }
        });
    }

    @Override // p000.AbstractC45537nB5
    public String toString() {
        return "ServiceDiscoveryOperation{" + super.toString() + CoreConstants.CURLY_RIGHT;
    }
}
