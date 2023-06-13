package co.bird.android.app.feature.map.presenter;

import android.location.Location;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u0010\u0000\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003 \u0004*\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "Lkotlin/Pair;", "Landroid/location/Location;", "", "kotlin.jvm.PlatformType", "location", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class MapPresenterImpl$legacyAreaRefreshObservable$1 extends Lambda implements Function1<Location, Pair> {
    public static final MapPresenterImpl$legacyAreaRefreshObservable$1 INSTANCE = new MapPresenterImpl$legacyAreaRefreshObservable$1();

    public MapPresenterImpl$legacyAreaRefreshObservable$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Pair invoke(Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        return TuplesKt.m28425to(location, null);
    }
}
