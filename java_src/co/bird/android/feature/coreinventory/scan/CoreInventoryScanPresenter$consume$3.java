package co.bird.android.feature.coreinventory.scan;

import co.bird.android.model.constant.VehicleInventoryAction;
import co.bird.api.response.VehicleInventoryScanResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.InterfaceC23447K;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/constant/VehicleInventoryAction;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/api/response/VehicleInventoryScanResponse;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class CoreInventoryScanPresenter$consume$3 extends Lambda implements Function1<Pair<? extends String, ? extends VehicleInventoryAction>, InterfaceC23447K<? extends VehicleInventoryScanResponse>> {

    /* renamed from: g */
    public final /* synthetic */ CoreInventoryScanPresenter f63859g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreInventoryScanPresenter$consume$3(CoreInventoryScanPresenter coreInventoryScanPresenter) {
        super(1);
        this.f63859g = coreInventoryScanPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: a */
    public final InterfaceC23447K<? extends VehicleInventoryScanResponse> invoke(Pair<String, ? extends VehicleInventoryAction> pair) {
        TB0 tb0;
        List<String> listOf;
        Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
        VehicleInventoryAction action = pair.component2();
        CoreInventoryScanPresenter coreInventoryScanPresenter = this.f63859g;
        tb0 = coreInventoryScanPresenter.f63831e;
        listOf = CollectionsKt__CollectionsJVMKt.listOf(pair.component1());
        Intrinsics.checkNotNullExpressionValue(action, "action");
        return CoreInventoryScanPresenter.m58316e0(coreInventoryScanPresenter, tb0.mo81892t0(listOf, action, true), null, 1, null);
    }
}
