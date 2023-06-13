package p000;

import android.bluetooth.BluetoothDevice;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p000.C41318g46;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \f*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u000bB\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016J\u0015\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R#\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u00178\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001c¨\u0006 "}, m28432d2 = {"Lpy0;", "T", "Loy0;", "Landroid/bluetooth/BluetoothDevice;", "device", "", "c", "b", "", "reason", "f", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "e", "value", "h", "(Ljava/lang/Object;)V", "g", "()Ljava/lang/Object;", "LGX2;", "", "LGX2;", "_status", "LtP5;", "LtP5;", "getStatus", "()LtP5;", "status", "Ljava/lang/Object;", "lastValue", "<init>", "()V", "interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: py0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C47183py0<T> implements InterfaceC46590oy0 {

    /* renamed from: d */
    public static final C27425a f104406d = new C27425a(null);

    /* renamed from: a */
    public final GX2<Object> f104407a;

    /* renamed from: b */
    public final InterfaceC49220tP5<Object> f104408b;

    /* renamed from: c */
    public T f104409c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lpy0$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: py0$a */
    /* loaded from: classes2.dex */
    public static final class C27425a {
        public /* synthetic */ C27425a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C27425a() {
        }
    }

    public C47183py0() {
        GX2<Object> m8742a = C50405vP5.m8742a(new C46315oW1());
        this.f104407a = m8742a;
        this.f104408b = C36708Vu1.m79269b(m8742a);
    }

    @Override // p000.InterfaceC46590oy0
    /* renamed from: a */
    public void mo18378a(BluetoothDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        C41318g46.m40153k("BLE-CONNECTION").mo7228a("onDeviceReady()", new Object[0]);
        GX2<Object> gx2 = this.f104407a;
        T t = this.f104409c;
        Intrinsics.checkNotNull(t);
        gx2.setValue(new C52813zT5(device, t));
    }

    @Override // p000.InterfaceC46590oy0
    /* renamed from: b */
    public void mo18377b(BluetoothDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        C41318g46.m40153k("BLE-CONNECTION").mo7228a("onDeviceConnected()", new Object[0]);
        this.f104407a.setValue(new C40067dy0(device));
    }

    @Override // p000.InterfaceC46590oy0
    /* renamed from: c */
    public void mo18376c(BluetoothDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        C41318g46.m40153k("BLE-CONNECTION").mo7228a("onDeviceConnecting()", new Object[0]);
        this.f104407a.setValue(new C40660ey0(device));
    }

    @Override // p000.InterfaceC46590oy0
    /* renamed from: d */
    public void mo18375d(BluetoothDevice device) {
        Intrinsics.checkNotNullParameter(device, "device");
        C41318g46.m40153k("BLE-CONNECTION").mo7228a("onDeviceDisconnecting()", new Object[0]);
    }

    @Override // p000.InterfaceC46590oy0
    /* renamed from: e */
    public void mo18374e(BluetoothDevice device, int i) {
        Object c49614u41;
        Intrinsics.checkNotNullParameter(device, "device");
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("BLE-CONNECTION");
        m40153k.mo7228a("onDeviceDisconnected(), reason: " + i, new Object[0]);
        GX2<Object> gx2 = this.f104407a;
        if (i != 0) {
            if (i != 3) {
                if (i != 4) {
                    c49614u41 = new C44024ke6(device);
                } else {
                    c49614u41 = new C49855uU2(device);
                }
            } else {
                c49614u41 = new C34810Nr2(device, m18372g());
            }
        } else {
            c49614u41 = new C49614u41(device);
        }
        gx2.setValue(c49614u41);
    }

    @Override // p000.InterfaceC46590oy0
    /* renamed from: f */
    public void mo18373f(BluetoothDevice device, int i) {
        Intrinsics.checkNotNullParameter(device, "device");
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("BLE-CONNECTION");
        m40153k.mo7228a("onDeviceFailedToConnect(), reason: " + i, new Object[0]);
        this.f104407a.setValue(new C49855uU2(device));
    }

    /* renamed from: g */
    public final T m18372g() {
        Object value = this.f104407a.getValue();
        C52813zT5 c52813zT5 = value instanceof C52813zT5 ? (C52813zT5) value : null;
        if (c52813zT5 != null) {
            return (T) c52813zT5.m1332b();
        }
        return null;
    }

    /* renamed from: h */
    public final void m18371h(T t) {
        C52813zT5 c52813zT5;
        this.f104409c = t;
        Object value = this.f104407a.getValue();
        if (value instanceof C52813zT5) {
            c52813zT5 = (C52813zT5) value;
        } else {
            c52813zT5 = null;
        }
        if (c52813zT5 != null) {
            this.f104407a.setValue(new C52813zT5(c52813zT5.m105941a(), t));
        }
    }
}
