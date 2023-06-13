package co.bird.android.app.feature.map.renderer;

import android.content.Context;
import co.bird.android.app.feature.map.renderer.IconLoader;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "", "Lco/bird/android/app/feature/map/renderer/IconLoader$MarkerPinWrapper;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes2.dex */
public final class IconLoader$markerPinViews$2 extends Lambda implements Function0<Map<Integer, ? extends IconLoader.MarkerPinWrapper>> {
    final /* synthetic */ IconLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconLoader$markerPinViews$2(IconLoader iconLoader) {
        super(0);
        this.this$0 = iconLoader;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<Integer, ? extends IconLoader.MarkerPinWrapper> invoke() {
        Context context;
        Context context2;
        Context context3;
        Map<Integer, ? extends IconLoader.MarkerPinWrapper> mapOf;
        int i = C45258mj4.marker_bird_riding;
        Integer valueOf = Integer.valueOf(i);
        context = this.this$0.context;
        int i2 = C45258mj4.marker_bird_selected;
        Integer valueOf2 = Integer.valueOf(i2);
        context2 = this.this$0.context;
        int i3 = C45258mj4.marker_bird_unselected;
        Integer valueOf3 = Integer.valueOf(i3);
        context3 = this.this$0.context;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(valueOf, new IconLoader.MarkerPinWrapper(context, i)), TuplesKt.m28425to(valueOf2, new IconLoader.MarkerPinWrapper(context2, i2)), TuplesKt.m28425to(valueOf3, new IconLoader.MarkerPinWrapper(context3, i3)));
        return mapOf;
    }
}
