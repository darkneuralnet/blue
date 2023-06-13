package p000;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.util.Log;
import no.nordicsemi.android.ble.data.Data;
/* renamed from: Ej6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C32636Ej6 {

    /* renamed from: e */
    public static final String f7984e = "Ej6";

    /* renamed from: a */
    public QS0 f7985a;

    /* renamed from: b */
    public C38561bT0 f7986b;

    /* renamed from: c */
    public L80 f7987c;

    /* renamed from: d */
    public int f7988d = 0;

    /* renamed from: Ej6$a */
    /* loaded from: classes8.dex */
    public class C1937a implements L80 {

        /* renamed from: a */
        public final /* synthetic */ Handler f7989a;

        public C1937a(Handler handler) {
            this.f7989a = handler;
        }

        @Override // p000.L80
        /* renamed from: a */
        public void mo22493a(Runnable runnable) {
        }

        @Override // p000.L80
        /* renamed from: b */
        public void mo22492b(Runnable runnable) {
            Handler handler = this.f7989a;
            if (handler != null) {
                handler.post(runnable);
            } else {
                runnable.run();
            }
        }

        @Override // p000.L80
        /* renamed from: c */
        public void mo22491c(Runnable runnable, long j) {
        }
    }

    public C32636Ej6(L80 l80) {
        this.f7987c = l80;
    }

    /* renamed from: c */
    public static /* synthetic */ void m108556c(QS0 qs0, BluetoothDevice bluetoothDevice, Data data) {
        try {
            qs0.mo3746b(bluetoothDevice, data);
        } catch (Throwable th) {
            Log.e(f7984e, "Exception in Value callback", th);
        }
    }

    /* renamed from: b */
    public final void m108557b() {
        this.f7985a = null;
        this.f7986b = null;
        this.f7988d = 0;
    }

    /* renamed from: d */
    public boolean m108555d(byte[] bArr) {
        return true;
    }

    /* renamed from: e */
    public void m108554e() {
        m108557b();
    }

    /* renamed from: f */
    public void m108553f(final BluetoothDevice bluetoothDevice, byte[] bArr) {
        final QS0 qs0 = this.f7985a;
        if (qs0 == null) {
            return;
        }
        final Data data = new Data(bArr);
        this.f7987c.mo22492b(new Runnable() { // from class: Dj6
            @Override // java.lang.Runnable
            public final void run() {
                C32636Ej6.m108556c(QS0.this, bluetoothDevice, data);
            }
        });
    }

    /* renamed from: g */
    public C32636Ej6 m108552g(Handler handler) {
        this.f7987c = new C1937a(handler);
        return this;
    }

    /* renamed from: h */
    public C32636Ej6 m108551h(QS0 qs0) {
        this.f7985a = qs0;
        return this;
    }
}
