package co.bird.android.feature.coreinventory.scan;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes3.dex */
public final class CoreInventoryScanPresenter$consume$22 extends Lambda implements Function1<Unit, Unit> {

    /* renamed from: g */
    public final /* synthetic */ CoreInventoryScanPresenter f63858g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreInventoryScanPresenter$consume$22(CoreInventoryScanPresenter coreInventoryScanPresenter) {
        super(1);
        this.f63858g = coreInventoryScanPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
        invoke2(unit);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Unit unit) {
        InterfaceC40099e13 interfaceC40099e13;
        interfaceC40099e13 = this.f63858g.f63835i;
        interfaceC40099e13.close();
    }
}
