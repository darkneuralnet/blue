package co.bird.android.app.feature.map.presenter;

import co.bird.android.model.wire.WireLocation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "Lco/bird/android/model/wire/WireLocation;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class LocationSelectionPresenterImpl$onResume$1 extends Lambda implements Function1<WireLocation, Unit> {
    public static final LocationSelectionPresenterImpl$onResume$1 INSTANCE = new LocationSelectionPresenterImpl$onResume$1();

    public LocationSelectionPresenterImpl$onResume$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(WireLocation it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WireLocation wireLocation) {
        invoke2(wireLocation);
        return Unit.INSTANCE;
    }
}
