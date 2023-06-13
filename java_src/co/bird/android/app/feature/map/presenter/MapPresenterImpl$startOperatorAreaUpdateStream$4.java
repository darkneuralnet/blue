package co.bird.android.app.feature.map.presenter;

import android.location.Location;
import co.bird.android.model.persistence.nestedstructures.Geolocation;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.functions.InterfaceC23484g;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00062\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Landroid/location/Location;", "", "", "Lco/bird/android/model/persistence/nestedstructures/Geolocation;", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Triple;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class MapPresenterImpl$startOperatorAreaUpdateStream$4 extends Lambda implements Function1<Triple<? extends Location, ? extends Double, ? extends List<? extends Geolocation>>, InterfaceC23496h> {
    final /* synthetic */ MapPresenterImpl this$0;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.app.feature.map.presenter.MapPresenterImpl$startOperatorAreaUpdateStream$4$1 */
    /* loaded from: classes2.dex */
    public static final class C138141 extends Lambda implements Function1<Throwable, Unit> {
        public static final C138141 INSTANCE = new C138141();

        public C138141() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40161c(th, "Error while loading operator areas", new Object[0]);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapPresenterImpl$startOperatorAreaUpdateStream$4(MapPresenterImpl mapPresenterImpl) {
        super(1);
        this.this$0 = mapPresenterImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final InterfaceC23496h invoke2(Triple<? extends Location, Double, ? extends List<Geolocation>> triple) {
        Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
        AbstractC23461c loadBlacklist = this.this$0.loadBlacklist(triple.component1(), triple.component2().doubleValue(), triple.component3());
        final C138141 c138141 = C138141.INSTANCE;
        return loadBlacklist.m33084B(new InterfaceC23484g() { // from class: co.bird.android.app.feature.map.presenter.d
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                MapPresenterImpl$startOperatorAreaUpdateStream$4.invoke$lambda$0(Function1.this, obj);
            }
        }).m33069Q();
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Triple<? extends Location, ? extends Double, ? extends List<? extends Geolocation>> triple) {
        return invoke2((Triple<? extends Location, Double, ? extends List<Geolocation>>) triple);
    }
}
