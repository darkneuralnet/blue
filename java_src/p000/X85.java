package p000;

import co.bird.android.model.wire.WireRidePrice;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a\u0012\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\b"}, m28432d2 = {"LTq4;", "Lco/bird/android/model/wire/WireRidePrice;", "previous", "", C17296a.f69688o, "Lgl;", "preference", "b", "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: X85 */
/* loaded from: classes2.dex */
public final class X85 {
    /* renamed from: a */
    public static final boolean m77292a(C36207Tq4 c36207Tq4, WireRidePrice wireRidePrice) {
        Intrinsics.checkNotNullParameter(c36207Tq4, "<this>");
        WireRidePrice m106251a = C32972Fv0.m106251a(c36207Tq4.m82623f8().getValue());
        if (wireRidePrice != null && !m106251a.equals(wireRidePrice, true)) {
            return true;
        }
        if (wireRidePrice == null && c36207Tq4.m82623f8().getValue().getRideConfig().getShowPriceChangeModalWithoutHistory()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m77291b(C36207Tq4 c36207Tq4, C22454gl preference) {
        Intrinsics.checkNotNullParameter(c36207Tq4, "<this>");
        Intrinsics.checkNotNullParameter(preference, "preference");
        return !C32972Fv0.m106251a(c36207Tq4.m82623f8().getValue()).equals(preference.m37622g1(), true);
    }
}
