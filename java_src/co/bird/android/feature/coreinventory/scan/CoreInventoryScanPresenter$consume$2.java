package co.bird.android.feature.coreinventory.scan;

import co.bird.android.model.constant.VehicleInventoryAction;
import co.bird.android.model.wire.WireVehicleInventoryScan;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.full.KClasses;
@Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0087\u0001\u0010\u0002\u001a\u0082\u0001\u00124\u00122\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003 \u0007*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\b \u0007*@\u00124\u00122\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003 \u0007*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\t"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireVehicleInventoryScan;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/constant/VehicleInventoryAction;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes3.dex */
public final class CoreInventoryScanPresenter$consume$2 extends Lambda implements Function1<Pair<? extends List<? extends Pair<? extends WireVehicleInventoryScan, ? extends Boolean>>, ? extends VehicleInventoryAction>, Unit> {

    /* renamed from: g */
    public final /* synthetic */ CoreInventoryScanPresenter f63852g;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;)Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoreInventoryScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$2$1\n+ 2 CoreInventoryScanState.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanStateKt\n*L\n1#1,261:1\n111#2,20:262\n*S KotlinDebug\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$2$1\n*L\n56#1:262,20\n*E\n"})
    /* renamed from: co.bird.android.feature.coreinventory.scan.CoreInventoryScanPresenter$consume$2$1 */
    /* loaded from: classes3.dex */
    public static final class C147631 extends Lambda implements Function1<CoreInventoryScanState, CoreInventoryScanState> {

        /* renamed from: g */
        public final /* synthetic */ VehicleInventoryAction f63853g;

        /* renamed from: h */
        public final /* synthetic */ List<Pair<WireVehicleInventoryScan, Boolean>> f63854h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C147631(VehicleInventoryAction vehicleInventoryAction, List<Pair<WireVehicleInventoryScan, Boolean>> list) {
            super(1);
            this.f63853g = vehicleInventoryAction;
            this.f63854h = list;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CoreInventoryScanState invoke(CoreInventoryScanState coreInventoryScanState) {
            UpdateUi m58257n;
            CoreInventoryScanState coreInventoryScanState2;
            CoreInventoryScanState state = coreInventoryScanState;
            Intrinsics.checkNotNullParameter(state, "state");
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UpdateUi.class);
            if (!(state instanceof UpdateUi)) {
                KFunction primaryConstructor = KClasses.getPrimaryConstructor(orCreateKotlinClass);
                if (primaryConstructor != null) {
                    coreInventoryScanState2 = (CoreInventoryScanState) primaryConstructor.call(coreInventoryScanState.mo40320c(), coreInventoryScanState.mo40317g(), coreInventoryScanState.mo40314j(), coreInventoryScanState.mo40316h(), coreInventoryScanState.mo40318e(), coreInventoryScanState.mo40313k(), coreInventoryScanState.mo40315i(), coreInventoryScanState.mo40319d(), coreInventoryScanState.getAction(), coreInventoryScanState.mo58259l(), Boolean.valueOf(coreInventoryScanState.mo58260f()), coreInventoryScanState.mo58262a(), Integer.valueOf(coreInventoryScanState.mo58258m()), Integer.valueOf(coreInventoryScanState.mo58261b()), coreInventoryScanState.getError());
                } else {
                    coreInventoryScanState2 = null;
                }
                if (coreInventoryScanState2 != null) {
                    state = (UpdateUi) coreInventoryScanState2;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type co.bird.android.feature.coreinventory.scan.UpdateUi");
                }
            }
            VehicleInventoryAction vehicleInventoryAction = this.f63853g;
            List<Pair<WireVehicleInventoryScan, Boolean>> scans = this.f63854h;
            Intrinsics.checkNotNullExpressionValue(scans, "scans");
            m58257n = r2.m58257n((r32 & 1) != 0 ? r2.f63875a : null, (r32 & 2) != 0 ? r2.f63876b : null, (r32 & 4) != 0 ? r2.f63877c : null, (r32 & 8) != 0 ? r2.f63878d : null, (r32 & 16) != 0 ? r2.f63879e : null, (r32 & 32) != 0 ? r2.f63880f : null, (r32 & 64) != 0 ? r2.f63881g : null, (r32 & 128) != 0 ? r2.f63882h : null, (r32 & 256) != 0 ? r2.f63883i : vehicleInventoryAction, (r32 & 512) != 0 ? r2.f63884j : scans, (r32 & 1024) != 0 ? r2.f63885k : false, (r32 & 2048) != 0 ? r2.f63886l : null, (r32 & 4096) != 0 ? r2.f63887m : 0, (r32 & 8192) != 0 ? r2.f63888n : 0, (r32 & 16384) != 0 ? ((UpdateUi) state).f63889o : null);
            return m58257n;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreInventoryScanPresenter$consume$2(CoreInventoryScanPresenter coreInventoryScanPresenter) {
        super(1);
        this.f63852g = coreInventoryScanPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends List<? extends Pair<? extends WireVehicleInventoryScan, ? extends Boolean>>, ? extends VehicleInventoryAction> pair) {
        invoke2((Pair<? extends List<Pair<WireVehicleInventoryScan, Boolean>>, ? extends VehicleInventoryAction>) pair);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Pair<? extends List<Pair<WireVehicleInventoryScan, Boolean>>, ? extends VehicleInventoryAction> pair) {
        this.f63852g.m42279i(new C147631(pair.component2(), pair.component1()));
    }
}
