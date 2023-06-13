package co.bird.android.feature.coreinventory.scan;

import co.bird.android.model.constant.VehicleInventoryAction;
import co.bird.android.model.wire.WireVehicleInventoryScan;
import co.bird.api.response.VehicleInventoryScanResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u009f\u0002\u0012\u0087\u0001\b\u0001\u0012\u0082\u0001\u0012\u0004\u0012\u00020\n\u00124\u00122\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003 \u0006*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0018\u00010\u00020\u0002 \u0006*@\u0012\u0004\u0012\u00020\n\u00124\u00122\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003 \u0006*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00030\u0003 \u0006*\u008e\u0001\u0012\u0087\u0001\b\u0001\u0012\u0082\u0001\u0012\u0004\u0012\u00020\n\u00124\u00122\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003 \u0006*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0018\u00010\u00020\u0002 \u0006*@\u0012\u0004\u0012\u00020\n\u00124\u00122\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003 \u0006*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00030\u0003\u0018\u00010\t0\t2P\u0010\b\u001aL\u0012\u0004\u0012\u00020\u0001\u00124\u00122\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003 \u0006*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00070\u00070\u0000H\n¢\u0006\u0004\b\u000b\u0010\f"}, m28432d2 = {"Lkotlin/Triple;", "", "", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireVehicleInventoryScan;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/constant/VehicleInventoryAction;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/api/response/VehicleInventoryScanResponse;", "b", "(Lkotlin/Triple;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCoreInventoryScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$12\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,261:1\n1603#2,9:262\n1855#2:271\n1856#2:274\n1612#2:275\n1#3:272\n1#3:273\n*S KotlinDebug\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$12\n*L\n160#1:262,9\n160#1:271\n160#1:274\n160#1:275\n160#1:273\n*E\n"})
/* loaded from: classes3.dex */
public final class CoreInventoryScanPresenter$consume$12 extends Lambda implements Function1<Triple<? extends Unit, ? extends List<? extends Pair<? extends WireVehicleInventoryScan, ? extends Boolean>>, ? extends VehicleInventoryAction>, InterfaceC23447K<? extends Pair<? extends VehicleInventoryScanResponse, ? extends List<? extends Pair<? extends WireVehicleInventoryScan, ? extends Boolean>>>>> {

    /* renamed from: g */
    public final /* synthetic */ CoreInventoryScanPresenter f63845g;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u0082\u0001\u0012\u0004\u0012\u00020\u0000\u00124\u00122\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002 \u0006*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0018\u00010\u00030\u0003 \u0006*@\u0012\u0004\u0012\u00020\u0000\u00124\u00122\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002 \u0006*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/api/response/VehicleInventoryScanResponse;", "response", "Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireVehicleInventoryScan;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/VehicleInventoryScanResponse;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.coreinventory.scan.CoreInventoryScanPresenter$consume$12$2 */
    /* loaded from: classes3.dex */
    public static final class C147612 extends Lambda implements Function1<VehicleInventoryScanResponse, Pair<? extends VehicleInventoryScanResponse, ? extends List<? extends Pair<? extends WireVehicleInventoryScan, ? extends Boolean>>>> {

        /* renamed from: g */
        public final /* synthetic */ List<Pair<WireVehicleInventoryScan, Boolean>> f63846g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C147612(List<Pair<WireVehicleInventoryScan, Boolean>> list) {
            super(1);
            this.f63846g = list;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Pair<VehicleInventoryScanResponse, List<Pair<WireVehicleInventoryScan, Boolean>>> invoke(VehicleInventoryScanResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return TuplesKt.m28425to(response, this.f63846g);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreInventoryScanPresenter$consume$12(CoreInventoryScanPresenter coreInventoryScanPresenter) {
        super(1);
        this.f63845g = coreInventoryScanPresenter;
    }

    public static final Pair invoke$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: b */
    public final InterfaceC23447K<? extends Pair<VehicleInventoryScanResponse, List<Pair<WireVehicleInventoryScan, Boolean>>>> invoke(Triple<Unit, ? extends List<Pair<WireVehicleInventoryScan, Boolean>>, ? extends VehicleInventoryAction> triple) {
        TB0 tb0;
        AbstractC23442F m58317d0;
        Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
        List<Pair<WireVehicleInventoryScan, Boolean>> scans = triple.component2();
        VehicleInventoryAction action = triple.component3();
        CoreInventoryScanPresenter coreInventoryScanPresenter = this.f63845g;
        tb0 = coreInventoryScanPresenter.f63831e;
        Intrinsics.checkNotNullExpressionValue(scans, "scans");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = scans.iterator();
        while (true) {
            boolean z = false;
            if (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Boolean bool = (Boolean) pair.component2();
                String scanIdentifier = ((WireVehicleInventoryScan) pair.component1()).getScanIdentifier();
                if (bool == null) {
                    z = true;
                }
                if (!z) {
                    scanIdentifier = null;
                }
                if (scanIdentifier != null) {
                    arrayList.add(scanIdentifier);
                }
            } else {
                Intrinsics.checkNotNullExpressionValue(action, "action");
                m58317d0 = coreInventoryScanPresenter.m58317d0(tb0.mo81892t0(arrayList, action, false), Boolean.FALSE);
                final C147612 c147612 = new C147612(scans);
                return m58317d0.m33157I(new InterfaceC23492o() { // from class: co.bird.android.feature.coreinventory.scan.b
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair invoke$lambda$2;
                        invoke$lambda$2 = CoreInventoryScanPresenter$consume$12.invoke$lambda$2(Function1.this, obj);
                        return invoke$lambda$2;
                    }
                });
            }
        }
    }
}
