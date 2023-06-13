package co.bird.android.app.feature.map.p008ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LcD1;", "kotlin.jvm.PlatformType", "map", "", "invoke", "(LcD1;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.app.feature.map.ui.LocationSelectionUiImpl$withMap$1 */
/* loaded from: classes2.dex */
public final class LocationSelectionUiImpl$withMap$1 extends Lambda implements Function1<C39011cD1, Unit> {
    final /* synthetic */ Function1<C39011cD1, Unit> $perform;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LocationSelectionUiImpl$withMap$1(Function1<? super C39011cD1, Unit> function1) {
        super(1);
        this.$perform = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C39011cD1 c39011cD1) {
        invoke2(c39011cD1);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(C39011cD1 map) {
        Function1<C39011cD1, Unit> function1 = this.$perform;
        Intrinsics.checkNotNullExpressionValue(map, "map");
        function1.invoke(map);
    }
}
