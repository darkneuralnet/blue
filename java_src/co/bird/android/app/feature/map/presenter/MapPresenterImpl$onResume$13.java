package co.bird.android.app.feature.map.presenter;

import co.bird.android.model.wire.WireLocation;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "Lco/bird/android/model/wire/WireLocation;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class MapPresenterImpl$onResume$13 extends Lambda implements Function1<Pair<? extends WireLocation, ? extends Boolean>, WireLocation> {
    public static final MapPresenterImpl$onResume$13 INSTANCE = new MapPresenterImpl$onResume$13();

    public MapPresenterImpl$onResume$13() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final WireLocation invoke2(Pair<WireLocation, Boolean> pair) {
        Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
        return pair.component1();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ WireLocation invoke(Pair<? extends WireLocation, ? extends Boolean> pair) {
        return invoke2((Pair<WireLocation, Boolean>) pair);
    }
}
