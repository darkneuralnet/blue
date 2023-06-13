package p000;

import co.bird.android.model.Vehicle;
import co.bird.android.model.constant.EnergyMode;
import co.bird.android.model.persistence.VehicleVersion;
import co.bird.android.model.wire.WireBirdKt;
import com.facebook.share.internal.C17296a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/Vehicle;", "", "scanRecord", "", C17296a.f69688o, "bluetooth_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: TK */
/* loaded from: classes4.dex */
public final class C7798TK {
    /* renamed from: a */
    public static final synchronized boolean m83811a(Vehicle vehicle, byte[] bArr) {
        synchronized (C7798TK.class) {
            Intrinsics.checkNotNullParameter(vehicle, "<this>");
            if (WireBirdKt.isBdCompatible(vehicle.getBird())) {
                vehicle.setBattery(0);
                vehicle.setDistance(0);
                vehicle.setEnergyMode(EnergyMode.NORMAL);
                return true;
            }
            List<C20674g> m42297d = C20165f.m42298c().m42297d(bArr);
            if (m42297d == null) {
                return false;
            }
            for (C20674g c20674g : m42297d) {
                if (c20674g instanceof C19649d) {
                    ByteBuffer order = ByteBuffer.wrap(((C19649d) c20674g).m40379a()).order(ByteOrder.LITTLE_ENDIAN);
                    short s = order.getShort();
                    byte b = order.get();
                    EnergyMode m113749b = C31875Bd1.m113749b(vehicle.getBird(), order.get());
                    int m103787c = C3157HY.m103787c(order.getInt());
                    vehicle.setVehicleVersion(VehicleVersion.copy$default(vehicle.getVehicleVersion(), null, null, null, s, null, null, 55, null));
                    vehicle.setBattery(b);
                    vehicle.setDistance(m103787c);
                    vehicle.setEnergyMode(m113749b);
                    C41318g46.m40151m("parse: version=" + ((int) s) + ", battery=" + ((int) b) + ", distance=" + m103787c, new Object[0]);
                }
            }
            return true;
        }
    }
}
