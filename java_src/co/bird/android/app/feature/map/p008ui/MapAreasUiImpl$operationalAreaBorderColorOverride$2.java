package co.bird.android.app.feature.map.p008ui;

import co.bird.android.core.mvp.BaseActivity;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: co.bird.android.app.feature.map.ui.MapAreasUiImpl$operationalAreaBorderColorOverride$2 */
/* loaded from: classes2.dex */
public final class MapAreasUiImpl$operationalAreaBorderColorOverride$2 extends Lambda implements Function0<Integer> {
    final /* synthetic */ BaseActivity $activity;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapAreasUiImpl$operationalAreaBorderColorOverride$2(BaseActivity baseActivity) {
        super(0);
        this.$activity = baseActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(NA0.m94301c(this.$activity, C32364Df4.brandAccent));
    }
}
