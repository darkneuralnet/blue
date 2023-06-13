package co.bird.android.app.feature.map.presenter;

import android.location.Location;
import co.bird.android.app.feature.map.p008ui.MapUi;
import com.google.android.gms.maps.model.LatLng;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\u0010\t\u001ab\u0012*\b\u0001\u0012&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00000\u0000 \u0006*0\u0012*\b\u0001\u0012&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "Landroid/location/Location;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class MapPresenterImpl$startOperatorAreaUpdateStream$2 extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, InterfaceC23434B<? extends Pair<? extends Location, ? extends Double>>> {
    final /* synthetic */ MapPresenterImpl this$0;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\u0010\b\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004 \u0005*\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LNn;", "it", "Lkotlin/Pair;", "Landroid/location/Location;", "", "kotlin.jvm.PlatformType", "invoke", "(LNn;)Lkotlin/Pair;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.map.presenter.MapPresenterImpl$startOperatorAreaUpdateStream$2$1 */
    /* loaded from: classes2.dex */
    public static final class C138131 extends Lambda implements Function1<C5691Nn, Pair> {
        final /* synthetic */ MapPresenterImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138131(MapPresenterImpl mapPresenterImpl) {
            super(1);
            this.this$0 = mapPresenterImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Pair invoke(C5691Nn it) {
            MapUi mapUi;
            Intrinsics.checkNotNullParameter(it, "it");
            Location location = new Location("");
            mapUi = this.this$0.f61617ui;
            LatLng centerLocation = mapUi.getCenterLocation();
            location.setLatitude(centerLocation.f71430b);
            location.setLongitude(centerLocation.f71431c);
            return TuplesKt.m28425to(location, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapPresenterImpl$startOperatorAreaUpdateStream$2(MapPresenterImpl mapPresenterImpl) {
        super(1);
        this.this$0 = mapPresenterImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final InterfaceC23434B<? extends Pair<Location, Double>> invoke2(Pair<Boolean, Boolean> pair) {
        Observable legacyAreaRefreshObservable;
        InterfaceC12495bn interfaceC12495bn;
        Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
        boolean booleanValue = pair.component1().booleanValue();
        if (pair.component2().booleanValue()) {
            return Observable.empty();
        }
        if (booleanValue) {
            interfaceC12495bn = this.this$0.areaManager;
            Observable<C5691Nn> mo64014I = interfaceC12495bn.mo64014I();
            final C138131 c138131 = new C138131(this.this$0);
            return mo64014I.map(new InterfaceC23492o() { // from class: co.bird.android.app.feature.map.presenter.c
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = MapPresenterImpl$startOperatorAreaUpdateStream$2.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
        legacyAreaRefreshObservable = this.this$0.legacyAreaRefreshObservable();
        return legacyAreaRefreshObservable;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ InterfaceC23434B<? extends Pair<? extends Location, ? extends Double>> invoke(Pair<? extends Boolean, ? extends Boolean> pair) {
        return invoke2((Pair<Boolean, Boolean>) pair);
    }
}
