package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import ch.qos.logback.core.CoreConstants;
import io.reactivex.InterfaceC24578y;
/* renamed from: qk5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C47641qk5 extends AbstractC47048pk5<C51730xe5, BluetoothAdapter.LeScanCallback> {

    /* renamed from: c */
    public final C49635u62 f105702c;

    /* renamed from: d */
    public final C36996Xa1 f105703d;

    /* renamed from: qk5$a */
    /* loaded from: classes6.dex */
    public class C27663a implements BluetoothAdapter.LeScanCallback {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC24578y f105704a;

        public C27663a(InterfaceC24578y interfaceC24578y) {
            this.f105704a = interfaceC24578y;
        }

        @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
        public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            if (!C47641qk5.this.f105703d.m76849a() && C52323ye5.m3117l(3) && C52323ye5.m3120i()) {
                C52323ye5.m3127b("%s, name=%s, rssi=%d, data=%s", C35098Ox2.m91172d(bluetoothDevice.getAddress()), bluetoothDevice.getName(), Integer.valueOf(i), C35098Ox2.m91175a(bArr));
            }
            C51730xe5 m10861b = C47641qk5.this.f105702c.m10861b(bluetoothDevice, i, bArr);
            if (C47641qk5.this.f105703d.m76848b(m10861b)) {
                this.f105704a.onNext(m10861b);
            }
        }
    }

    public C47641qk5(C46978pd5 c46978pd5, C49635u62 c49635u62, C36996Xa1 c36996Xa1) {
        super(c46978pd5);
        this.f105702c = c49635u62;
        this.f105703d = c36996Xa1;
    }

    @Override // p000.AbstractC47048pk5
    /* renamed from: g */
    public BluetoothAdapter.LeScanCallback mo15482d(InterfaceC24578y<C51730xe5> interfaceC24578y) {
        return new C27663a(interfaceC24578y);
    }

    @Override // p000.AbstractC47048pk5
    /* renamed from: h */
    public boolean mo15481e(C46978pd5 c46978pd5, BluetoothAdapter.LeScanCallback leScanCallback) {
        if (this.f105703d.m76849a()) {
            C52323ye5.m3127b("No library side filtering —> debug logs of scanned devices disabled", new Object[0]);
        }
        return c46978pd5.m19046e(leScanCallback);
    }

    @Override // p000.AbstractC47048pk5
    /* renamed from: i */
    public void mo15480f(C46978pd5 c46978pd5, BluetoothAdapter.LeScanCallback leScanCallback) {
        c46978pd5.m19044g(leScanCallback);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ScanOperationApi18{");
        if (this.f105703d.m76849a()) {
            str = "";
        } else {
            str = "ANY_MUST_MATCH -> " + this.f105703d;
        }
        sb.append(str);
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }
}
