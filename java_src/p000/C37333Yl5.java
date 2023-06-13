package p000;

import co.bird.android.bluetooth.model.ScannedDevice;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0005\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LYl5;", "", "", "Lco/bird/android/bluetooth/model/ScannedDevice;", "discoveredDevices", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/List;", "b", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Yl5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37333Yl5 {

    /* renamed from: a */
    public final List<ScannedDevice> f46541a;

    public C37333Yl5(List<ScannedDevice> discoveredDevices) {
        Intrinsics.checkNotNullParameter(discoveredDevices, "discoveredDevices");
        this.f46541a = discoveredDevices;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C37333Yl5 copy$default(C37333Yl5 c37333Yl5, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = c37333Yl5.f46541a;
        }
        return c37333Yl5.m74315a(list);
    }

    /* renamed from: a */
    public final C37333Yl5 m74315a(List<ScannedDevice> discoveredDevices) {
        Intrinsics.checkNotNullParameter(discoveredDevices, "discoveredDevices");
        return new C37333Yl5(discoveredDevices);
    }

    /* renamed from: b */
    public final List<ScannedDevice> m74314b() {
        return this.f46541a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37333Yl5) && Intrinsics.areEqual(this.f46541a, ((C37333Yl5) obj).f46541a);
    }

    public int hashCode() {
        return this.f46541a.hashCode();
    }

    public String toString() {
        List<ScannedDevice> list = this.f46541a;
        return "ScannedDevices(discoveredDevices=" + list + ")";
    }
}
