package co.bird.android.feature.coreinventory.scan;

import co.bird.android.buava.Optional;
import co.bird.android.model.User;
import co.bird.android.model.Warehouse;
import co.bird.android.model.constant.VehicleInventoryAction;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001aJ\u0012\u001e\b\u0001\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007 \u0003*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u0006 \u0003*$\u0012\u001e\b\u0001\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0007 \u0003*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/constant/VehicleInventoryAction;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Warehouse;", "c", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class CoreInventoryScanPresenter$consume$7 extends Lambda implements Function1<Pair<? extends Unit, ? extends VehicleInventoryAction>, InterfaceC23447K<? extends Optional<Warehouse>>> {

    /* renamed from: g */
    public final /* synthetic */ CoreInventoryScanPresenter f63863g;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/User;", "user", "Lio/reactivex/K;", "LHM4;", "Lco/bird/android/model/Warehouse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/User;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.coreinventory.scan.CoreInventoryScanPresenter$consume$7$1 */
    /* loaded from: classes3.dex */
    public static final class C147661 extends Lambda implements Function1<User, InterfaceC23447K<? extends HM4<Warehouse>>> {

        /* renamed from: g */
        public final /* synthetic */ CoreInventoryScanPresenter f63864g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C147661(CoreInventoryScanPresenter coreInventoryScanPresenter) {
            super(1);
            this.f63864g = coreInventoryScanPresenter;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends HM4<Warehouse>> invoke(User user) {
            InterfaceC36047Sy6 interfaceC36047Sy6;
            Intrinsics.checkNotNullParameter(user, "user");
            String warehouseId = user.getWarehouseId();
            if (warehouseId != null) {
                CoreInventoryScanPresenter coreInventoryScanPresenter = this.f63864g;
                interfaceC36047Sy6 = coreInventoryScanPresenter.f63833g;
                return CoreInventoryScanPresenter.m58316e0(coreInventoryScanPresenter, interfaceC36047Sy6.mo82208a(warehouseId), null, 1, null);
            }
            throw new UnsupportedOperationException("User not associated with warehouse");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0001 \u0004*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/Warehouse;", "response", "Lco/bird/android/buava/Optional;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.coreinventory.scan.CoreInventoryScanPresenter$consume$7$2 */
    /* loaded from: classes3.dex */
    public static final class C147672 extends Lambda implements Function1<HM4<Warehouse>, Optional<Warehouse>> {

        /* renamed from: g */
        public static final C147672 f63865g = new C147672();

        public C147672() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<Warehouse> invoke(HM4<Warehouse> response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return Optional.f63040c.m59032c(response.m103944a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreInventoryScanPresenter$consume$7(CoreInventoryScanPresenter coreInventoryScanPresenter) {
        super(1);
        this.f63863g = coreInventoryScanPresenter;
    }

    /* renamed from: d */
    public static final Optional m58280d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: c */
    public final InterfaceC23447K<? extends Optional<Warehouse>> invoke(Pair<Unit, ? extends VehicleInventoryAction> pair) {
        InterfaceC44647lh6 interfaceC44647lh6;
        Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
        if (pair.component2() == VehicleInventoryAction.CHECK_IN) {
            interfaceC44647lh6 = this.f63863g.f63832f;
            AbstractC23442F<User> user = interfaceC44647lh6.getUser();
            final C147661 c147661 = new C147661(this.f63863g);
            AbstractC23442F<R> m33165A = user.m33165A(new InterfaceC23492o() { // from class: co.bird.android.feature.coreinventory.scan.c
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K invoke$lambda$0;
                    invoke$lambda$0 = CoreInventoryScanPresenter$consume$7.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
            final C147672 c147672 = C147672.f63865g;
            return m33165A.m33157I(new InterfaceC23492o() { // from class: co.bird.android.feature.coreinventory.scan.d
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m58280d;
                    m58280d = CoreInventoryScanPresenter$consume$7.m58280d(Function1.this, obj);
                    return m58280d;
                }
            });
        }
        return AbstractC23442F.m33158H(Optional.f63040c.m59034a());
    }
}
