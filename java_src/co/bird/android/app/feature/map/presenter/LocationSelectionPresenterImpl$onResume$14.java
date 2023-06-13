package co.bird.android.app.feature.map.presenter;

import co.bird.android.app.feature.map.p008ui.LocationSelectionUi;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class LocationSelectionPresenterImpl$onResume$14 extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, Unit> {
    final /* synthetic */ LocationSelectionPresenterImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationSelectionPresenterImpl$onResume$14(LocationSelectionPresenterImpl locationSelectionPresenterImpl) {
        super(1);
        this.this$0 = locationSelectionPresenterImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends Boolean> pair) {
        invoke2((Pair<Boolean, Boolean>) pair);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Pair<Boolean, Boolean> pair) {
        LocationSelectionUi locationSelectionUi;
        boolean z;
        Boolean enablable = pair.component1();
        Boolean enabled = pair.component2();
        locationSelectionUi = this.this$0.f61616ui;
        Intrinsics.checkNotNullExpressionValue(enablable, "enablable");
        if (enablable.booleanValue()) {
            Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
            if (enabled.booleanValue()) {
                z = true;
                locationSelectionUi.enableDoneButton(z);
            }
        }
        z = false;
        locationSelectionUi.enableDoneButton(z);
    }
}
