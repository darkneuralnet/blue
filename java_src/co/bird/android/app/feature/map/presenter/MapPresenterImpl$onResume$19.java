package co.bird.android.app.feature.map.presenter;

import android.location.Location;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.functions.InterfaceC23492o;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class MapPresenterImpl$onResume$19 extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Location>> {
    final /* synthetic */ MapPresenterImpl this$0;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "throwable", "Lio/reactivex/K;", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Throwable;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.app.feature.map.presenter.MapPresenterImpl$onResume$19$1 */
    /* loaded from: classes2.dex */
    public static final class C138111 extends Lambda implements Function1<Throwable, InterfaceC23447K<? extends Location>> {
        final /* synthetic */ MapPresenterImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C138111(MapPresenterImpl mapPresenterImpl) {
            super(1);
            this.this$0 = mapPresenterImpl;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Location> invoke(Throwable throwable) {
            InterfaceC40001dr4 interfaceC40001dr4;
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            if (throwable instanceof TimeoutException) {
                interfaceC40001dr4 = this.this$0.locationManager;
                return AbstractC23442F.m33158H(interfaceC40001dr4.mo43616p().getValue());
            }
            return AbstractC23442F.m33100x(throwable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapPresenterImpl$onResume$19(MapPresenterImpl mapPresenterImpl) {
        super(1);
        this.this$0 = mapPresenterImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public final InterfaceC23447K<? extends Location> invoke(Unit it) {
        InterfaceC40001dr4 interfaceC40001dr4;
        Intrinsics.checkNotNullParameter(it, "it");
        interfaceC40001dr4 = this.this$0.locationManager;
        AbstractC23442F<Location> m33140a0 = interfaceC40001dr4.mo43627e(false).m33140a0(1L, TimeUnit.SECONDS);
        final C138111 c138111 = new C138111(this.this$0);
        return m33140a0.m33150P(new InterfaceC23492o() { // from class: co.bird.android.app.feature.map.presenter.a
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K invoke$lambda$0;
                invoke$lambda$0 = MapPresenterImpl$onResume$19.invoke$lambda$0(Function1.this, obj);
                return invoke$lambda$0;
            }
        });
    }
}
