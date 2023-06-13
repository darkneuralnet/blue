package p000;

import co.bird.android.model.VehicleDescriptor;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\f\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0000¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireBird;", "Lco/bird/android/model/VehicleDescriptor;", "b", "", C17296a.f69688o, "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: uC6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49697uC6 {
    /* renamed from: a */
    public static final String m10641a(WireBird wireBird) {
        String m25596j;
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        String fleetId = wireBird.getFleetId();
        if (fleetId != null && (m25596j = C45097mS5.m25596j(fleetId)) != null) {
            String upperCase = m25596j.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return upperCase;
        }
        return null;
    }

    /* renamed from: b */
    public static final VehicleDescriptor m10640b(WireBird wireBird) {
        Intrinsics.checkNotNullParameter(wireBird, "<this>");
        return new VehicleDescriptor(wireBird.getId(), wireBird.getImei(), wireBird.getSerialNumber(), null, wireBird.getModel(), null, 32, null);
    }
}
