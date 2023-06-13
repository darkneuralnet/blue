package p000;

import co.bird.android.model.persistence.WarehouseMarker;
import co.bird.android.model.wire.WireWarehouseMarker;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, m28432d2 = {"Lco/bird/android/model/wire/WireWarehouseMarker;", "Lco/bird/android/model/persistence/WarehouseMarker;", C17296a.f69688o, "warehouse-marker_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Vy6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36749Vy6 {
    /* renamed from: a */
    public static final WarehouseMarker m79025a(WireWarehouseMarker wireWarehouseMarker) {
        Intrinsics.checkNotNullParameter(wireWarehouseMarker, "<this>");
        return new WarehouseMarker(wireWarehouseMarker.getId(), wireWarehouseMarker.getLocation());
    }
}
