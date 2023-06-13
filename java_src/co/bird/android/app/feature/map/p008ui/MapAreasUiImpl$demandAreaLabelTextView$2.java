package co.bird.android.app.feature.map.p008ui;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import co.bird.android.core.mvp.BaseActivity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Landroidx/appcompat/widget/AppCompatTextView;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.MapAreasUiImpl$demandAreaLabelTextView$2 */
/* loaded from: classes2.dex */
public final class MapAreasUiImpl$demandAreaLabelTextView$2 extends Lambda implements Function0<AppCompatTextView> {
    final /* synthetic */ BaseActivity $activity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapAreasUiImpl$demandAreaLabelTextView$2(BaseActivity baseActivity) {
        super(0);
        this.$activity = baseActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AppCompatTextView invoke() {
        View m41762t = C40788fB0.m41762t(this.$activity, C45258mj4.view_in_demand_label, null);
        Intrinsics.checkNotNull(m41762t, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
        return (AppCompatTextView) m41762t;
    }
}
