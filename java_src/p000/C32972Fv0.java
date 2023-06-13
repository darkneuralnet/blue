package p000;

import co.bird.android.model.wire.WireRidePrice;
import co.bird.android.model.wire.configs.Config;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, m28432d2 = {"Lco/bird/android/model/wire/configs/Config;", "Lco/bird/android/model/wire/WireRidePrice;", C17296a.f69688o, "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Fv0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32972Fv0 {
    /* renamed from: a */
    public static final WireRidePrice m106251a(Config config) {
        Intrinsics.checkNotNullParameter(config, "<this>");
        return new WireRidePrice(config.getRideConfig().getCurrency(), config.getRideConfig().getBasePrice(), config.getRideConfig().getMinutePrice(), config.getRideConfig().getAdditionalFees().getApplyTax(), config.getRideConfig().getMinimumRidePrice(), config.getRideConfig().getIncludedMinutes(), config.getRideConfig().getLocalizedDynamicPriceString());
    }
}
