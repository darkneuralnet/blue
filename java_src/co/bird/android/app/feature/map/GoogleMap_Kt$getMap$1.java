package co.bird.android.app.feature.map;

import com.google.android.gms.maps.MapView;
import io.reactivex.InterfaceC23444H;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "LcD1;", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class GoogleMap_Kt$getMap$1 extends Lambda implements Function1<InterfaceC23444H<C39011cD1>, Unit> {
    final /* synthetic */ MapView $this_getMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoogleMap_Kt$getMap$1(MapView mapView) {
        super(1);
        this.$this_getMap = mapView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(InterfaceC23444H emitter, C39011cD1 map) {
        Intrinsics.checkNotNullParameter(emitter, "$emitter");
        Intrinsics.checkNotNullParameter(map, "map");
        emitter.onSuccess(map);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<C39011cD1> interfaceC23444H) {
        invoke2(interfaceC23444H);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(final InterfaceC23444H<C39011cD1> emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        this.$this_getMap.m50726a(new InterfaceC36350Ug3() { // from class: co.bird.android.app.feature.map.a
            @Override // p000.InterfaceC36350Ug3
            public final void onMapReady(C39011cD1 c39011cD1) {
                GoogleMap_Kt$getMap$1.invoke$lambda$0(InterfaceC23444H.this, c39011cD1);
            }
        });
    }
}
