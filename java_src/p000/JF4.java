package p000;

import co.bird.android.model.LegacyRepair;
import co.bird.android.model.RepairType;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.location.places.Place;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, m28432d2 = {"Lco/bird/android/model/LegacyRepair;", "Lco/bird/android/model/RepairType;", C17296a.f69688o, "repair_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: JF4 */
/* loaded from: classes3.dex */
public final class JF4 {
    /* renamed from: a */
    public static final RepairType m100776a(LegacyRepair legacyRepair) {
        Intrinsics.checkNotNullParameter(legacyRepair, "<this>");
        return new RepairType(legacyRepair.getRepairTypeId(), legacyRepair.getIssueTypeId(), legacyRepair.getDisplay(), legacyRepair.getDescription(), false, null, null, null, null, null, Place.TYPE_INTERSECTION, null);
    }
}
