package co.bird.android.feature.coreinventory.scan;

import android.view.View;
import co.bird.android.model.wire.WireVehicleInventoryScan;
import com.google.android.material.snackbar.Snackbar;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "scan", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireVehicleInventoryScan;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes3.dex */
public final class CoreInventoryScanActivity$itemSwiped$3 extends Lambda implements Function1<Pair<? extends WireVehicleInventoryScan, ? extends Boolean>, Unit> {

    /* renamed from: g */
    public final /* synthetic */ CoreInventoryScanActivity f63819g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreInventoryScanActivity$itemSwiped$3(CoreInventoryScanActivity coreInventoryScanActivity) {
        super(1);
        this.f63819g = coreInventoryScanActivity;
    }

    /* renamed from: b */
    public static final void m58356b(CoreInventoryScanActivity this$0, Pair pair, View view) {
        C45168ma4 c45168ma4;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        c45168ma4 = this$0.f63814r;
        c45168ma4.accept(pair);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireVehicleInventoryScan, ? extends Boolean> pair) {
        invoke2((Pair<WireVehicleInventoryScan, Boolean>) pair);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(final Pair<WireVehicleInventoryScan, Boolean> pair) {
        C40679f00 c40679f00;
        c40679f00 = this.f63819g.f63811o;
        if (c40679f00 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c40679f00 = null;
        }
        Snackbar m48855o0 = Snackbar.m48855o0(c40679f00.getRoot(), this.f63819g.getString(C45871nl4.transfer_order_snack_vehicle_deleted), -1);
        final CoreInventoryScanActivity coreInventoryScanActivity = this.f63819g;
        m48855o0.m48933I().setElevation(1000.0f);
        m48855o0.m48852r0(coreInventoryScanActivity.getString(C45871nl4.transfer_order_snack_vehicle_deleted_undo), new View.OnClickListener() { // from class: co.bird.android.feature.coreinventory.scan.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreInventoryScanActivity$itemSwiped$3.m58356b(CoreInventoryScanActivity.this, pair, view);
            }
        });
        m48855o0.m48851s0(-1);
        m48855o0.mo48864Y();
    }
}
