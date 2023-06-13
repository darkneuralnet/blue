package p000;

import android.bluetooth.BluetoothDevice;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\b\u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001f"}, m28432d2 = {"Lcy0;", "T", "", "Landroid/bluetooth/BluetoothDevice;", "device", "LVy;", "manager", "", "isConnected", "", "connectionError", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Landroid/bluetooth/BluetoothDevice;", "c", "()Landroid/bluetooth/BluetoothDevice;", "b", "LVy;", DateTokenConverter.CONVERTER_KEY, "()LVy;", "Z", "()Z", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "<init>", "(Landroid/bluetooth/BluetoothDevice;LVy;ZLjava/lang/Throwable;)V", "interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cy0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C39475cy0<T> {

    /* renamed from: a */
    public final BluetoothDevice f75902a;

    /* renamed from: b */
    public final AbstractC8883Vy<T> f75903b;

    /* renamed from: c */
    public final boolean f75904c;

    /* renamed from: d */
    public final Throwable f75905d;

    public C39475cy0(BluetoothDevice device, AbstractC8883Vy<T> manager, boolean z, Throwable th) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(manager, "manager");
        this.f75902a = device;
        this.f75903b = manager;
        this.f75904c = z;
        this.f75905d = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C39475cy0 copy$default(C39475cy0 c39475cy0, BluetoothDevice bluetoothDevice, AbstractC8883Vy abstractC8883Vy, boolean z, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            bluetoothDevice = c39475cy0.f75902a;
        }
        if ((i & 2) != 0) {
            abstractC8883Vy = c39475cy0.f75903b;
        }
        if ((i & 4) != 0) {
            z = c39475cy0.f75904c;
        }
        if ((i & 8) != 0) {
            th = c39475cy0.f75905d;
        }
        return c39475cy0.m44794a(bluetoothDevice, abstractC8883Vy, z, th);
    }

    /* renamed from: a */
    public final C39475cy0<T> m44794a(BluetoothDevice device, AbstractC8883Vy<T> manager, boolean z, Throwable th) {
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(manager, "manager");
        return new C39475cy0<>(device, manager, z, th);
    }

    /* renamed from: b */
    public final Throwable m44793b() {
        return this.f75905d;
    }

    /* renamed from: c */
    public final BluetoothDevice m44792c() {
        return this.f75902a;
    }

    /* renamed from: d */
    public final AbstractC8883Vy<T> m44791d() {
        return this.f75903b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C39475cy0) {
            C39475cy0 c39475cy0 = (C39475cy0) obj;
            return Intrinsics.areEqual(this.f75902a, c39475cy0.f75902a) && Intrinsics.areEqual(this.f75903b, c39475cy0.f75903b) && this.f75904c == c39475cy0.f75904c && Intrinsics.areEqual(this.f75905d, c39475cy0.f75905d);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f75902a.hashCode() * 31) + this.f75903b.hashCode()) * 31;
        boolean z = this.f75904c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        Throwable th = this.f75905d;
        return i2 + (th == null ? 0 : th.hashCode());
    }

    public String toString() {
        BluetoothDevice bluetoothDevice = this.f75902a;
        AbstractC8883Vy<T> abstractC8883Vy = this.f75903b;
        boolean z = this.f75904c;
        Throwable th = this.f75905d;
        return "ConnectableDevice(device=" + bluetoothDevice + ", manager=" + abstractC8883Vy + ", isConnected=" + z + ", connectionError=" + th + ")";
    }

    public /* synthetic */ C39475cy0(BluetoothDevice bluetoothDevice, AbstractC8883Vy abstractC8883Vy, boolean z, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bluetoothDevice, abstractC8883Vy, z, (i & 8) != 0 ? null : th);
    }
}
