package p000;

import android.bluetooth.BluetoothDevice;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J)\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, m28432d2 = {"Lk66;", "", "Lco/bird/android/model/wire/WireBird;", C17296a.f69688o, "Landroid/bluetooth/BluetoothDevice;", "b", "bird", "bluetoothDevice", "", "forRide", "c", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Lco/bird/android/model/wire/WireBird;", DateTokenConverter.CONVERTER_KEY, "()Lco/bird/android/model/wire/WireBird;", "Landroid/bluetooth/BluetoothDevice;", "e", "()Landroid/bluetooth/BluetoothDevice;", "Z", "f", "()Z", "<init>", "(Lco/bird/android/model/wire/WireBird;Landroid/bluetooth/BluetoothDevice;Z)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: k66  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C43710k66 {

    /* renamed from: a */
    public final WireBird f93929a;

    /* renamed from: b */
    public final BluetoothDevice f93930b;

    /* renamed from: c */
    public final boolean f93931c;

    public C43710k66(WireBird bird, BluetoothDevice bluetoothDevice, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        this.f93929a = bird;
        this.f93930b = bluetoothDevice;
        this.f93931c = z;
    }

    public static /* synthetic */ C43710k66 copy$default(C43710k66 c43710k66, WireBird wireBird, BluetoothDevice bluetoothDevice, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            wireBird = c43710k66.f93929a;
        }
        if ((i & 2) != 0) {
            bluetoothDevice = c43710k66.f93930b;
        }
        if ((i & 4) != 0) {
            z = c43710k66.f93931c;
        }
        return c43710k66.m29285c(wireBird, bluetoothDevice, z);
    }

    /* renamed from: a */
    public final WireBird m29287a() {
        return this.f93929a;
    }

    /* renamed from: b */
    public final BluetoothDevice m29286b() {
        return this.f93930b;
    }

    /* renamed from: c */
    public final C43710k66 m29285c(WireBird bird, BluetoothDevice bluetoothDevice, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        return new C43710k66(bird, bluetoothDevice, z);
    }

    /* renamed from: d */
    public final WireBird m29284d() {
        return this.f93929a;
    }

    /* renamed from: e */
    public final BluetoothDevice m29283e() {
        return this.f93930b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C43710k66) {
            C43710k66 c43710k66 = (C43710k66) obj;
            return Intrinsics.areEqual(this.f93929a, c43710k66.f93929a) && Intrinsics.areEqual(this.f93930b, c43710k66.f93930b) && this.f93931c == c43710k66.f93931c;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m29282f() {
        return this.f93931c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f93929a.hashCode() * 31;
        BluetoothDevice bluetoothDevice = this.f93930b;
        int hashCode2 = (hashCode + (bluetoothDevice == null ? 0 : bluetoothDevice.hashCode())) * 31;
        boolean z = this.f93931c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode2 + i;
    }

    public String toString() {
        WireBird wireBird = this.f93929a;
        BluetoothDevice bluetoothDevice = this.f93930b;
        boolean z = this.f93931c;
        return "TrackedBird(bird=" + wireBird + ", bluetoothDevice=" + bluetoothDevice + ", forRide=" + z + ")";
    }
}
