package p000;

import co.bird.android.model.wire.WirePhysicalLock;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, m28432d2 = {"Lco/bird/android/model/wire/WirePhysicalLock;", "", C17296a.f69688o, "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: AJ5 */
/* loaded from: classes2.dex */
public final class AJ5 {
    /* renamed from: a */
    public static final boolean m115918a(WirePhysicalLock wirePhysicalLock) {
        Intrinsics.checkNotNullParameter(wirePhysicalLock, "<this>");
        String kind = wirePhysicalLock.getKind();
        if (Intrinsics.areEqual(kind, "smartlock_cable_nokelock_birdv1")) {
            return true;
        }
        return Intrinsics.areEqual(kind, "smartlock_cable_oklock_helmet");
    }
}
