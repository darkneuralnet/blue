package p000;

import co.bird.android.buava.Optional;
import co.bird.android.model.RideState;
import co.bird.android.model.RideStateKt;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000*\"\u0010\u0007\"\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¨\u0006\b"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RideState;", "", C17296a.f69688o, "Lkotlin/Pair;", "", "Lco/bird/android/model/RideState$Status;", "RideActionRequest", "core-interface_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: hU4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C42149hU4 {
    /* renamed from: a */
    public static final boolean m36358a(Optional<RideState> optional) {
        Intrinsics.checkNotNullParameter(optional, "<this>");
        RideState m59035e = optional.m59035e();
        if (m59035e == null || !RideStateKt.isInRide(m59035e)) {
            return false;
        }
        return true;
    }
}
