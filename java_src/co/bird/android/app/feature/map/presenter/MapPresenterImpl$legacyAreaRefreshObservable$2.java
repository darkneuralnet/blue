package co.bird.android.app.feature.map.presenter;

import android.location.Location;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LNn;", "areaRefreshRequest", "Lkotlin/Pair;", "Landroid/location/Location;", "", "kotlin.jvm.PlatformType", "invoke", "(LNn;)Lkotlin/Pair;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class MapPresenterImpl$legacyAreaRefreshObservable$2 extends Lambda implements Function1<C5691Nn, Pair<? extends Location, ? extends Double>> {
    final /* synthetic */ MapPresenterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapPresenterImpl$legacyAreaRefreshObservable$2(MapPresenterImpl mapPresenterImpl) {
        super(1);
        this.this$0 = mapPresenterImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Pair<Location, Double> invoke(C5691Nn areaRefreshRequest) {
        InterfaceC40001dr4 interfaceC40001dr4;
        Intrinsics.checkNotNullParameter(areaRefreshRequest, "areaRefreshRequest");
        Location m93436b = areaRefreshRequest.m93436b();
        if (m93436b == null) {
            interfaceC40001dr4 = this.this$0.locationManager;
            m93436b = interfaceC40001dr4.mo43616p().m73665a();
        }
        return TuplesKt.m28425to(m93436b, areaRefreshRequest.m93435c());
    }
}
