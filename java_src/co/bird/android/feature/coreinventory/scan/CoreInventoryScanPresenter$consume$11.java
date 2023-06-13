package co.bird.android.feature.coreinventory.scan;

import co.bird.android.model.wire.WireVehicleInventoryScan;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.Iterator;
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
@Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004 \u0007*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "scans", "", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireVehicleInventoryScan;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCoreInventoryScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$11\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,261:1\n1747#2,3:262\n*S KotlinDebug\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$11\n*L\n145#1:262,3\n*E\n"})
/* loaded from: classes3.dex */
public final class CoreInventoryScanPresenter$consume$11 extends Lambda implements Function1<List<? extends Pair<? extends WireVehicleInventoryScan, ? extends Boolean>>, Unit> {

    /* renamed from: g */
    public final /* synthetic */ CoreInventoryScanPresenter f63842g;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;)Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoreInventoryScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$11$1\n+ 2 CoreInventoryScanState.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanStateKt\n*L\n1#1,261:1\n111#2,20:262\n*S KotlinDebug\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$11$1\n*L\n143#1:262,20\n*E\n"})
    /* renamed from: co.bird.android.feature.coreinventory.scan.CoreInventoryScanPresenter$consume$11$1 */
    /* loaded from: classes3.dex */
    public static final class C147591 extends Lambda implements Function1<CoreInventoryScanState, CoreInventoryScanState> {

        /* renamed from: g */
        public static final C147591 f63843g = new C147591();

        public C147591() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CoreInventoryScanState invoke(CoreInventoryScanState state) {
            CoreInventoryScanState coreInventoryScanState;
            Intrinsics.checkNotNullParameter(state, "state");
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AlertDisabledEmpty.class);
            if (!(state instanceof AlertDisabledEmpty)) {
                KFunction primaryConstructor = KClasses.getPrimaryConstructor(orCreateKotlinClass);
                if (primaryConstructor != null) {
                    coreInventoryScanState = (CoreInventoryScanState) primaryConstructor.call(state.mo40320c(), state.mo40317g(), state.mo40314j(), state.mo40316h(), state.mo40318e(), state.mo40313k(), state.mo40315i(), state.mo40319d(), state.getAction(), state.mo58259l(), Boolean.valueOf(state.mo58260f()), state.mo58262a(), Integer.valueOf(state.mo58258m()), Integer.valueOf(state.mo58261b()), state.getError());
                } else {
                    coreInventoryScanState = null;
                }
                if (coreInventoryScanState != null) {
                    return (AlertDisabledEmpty) coreInventoryScanState;
                }
                throw new NullPointerException("null cannot be cast to non-null type co.bird.android.feature.coreinventory.scan.AlertDisabledEmpty");
            }
            return state;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;)Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoreInventoryScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$11$3\n+ 2 CoreInventoryScanState.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanStateKt\n*L\n1#1,261:1\n111#2,20:262\n*S KotlinDebug\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$11$3\n*L\n146#1:262,20\n*E\n"})
    /* renamed from: co.bird.android.feature.coreinventory.scan.CoreInventoryScanPresenter$consume$11$3 */
    /* loaded from: classes3.dex */
    public static final class C147603 extends Lambda implements Function1<CoreInventoryScanState, CoreInventoryScanState> {

        /* renamed from: g */
        public static final C147603 f63844g = new C147603();

        public C147603() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CoreInventoryScanState invoke(CoreInventoryScanState state) {
            CoreInventoryScanState coreInventoryScanState;
            Intrinsics.checkNotNullParameter(state, "state");
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AlertDisabledError.class);
            if (!(state instanceof AlertDisabledError)) {
                KFunction primaryConstructor = KClasses.getPrimaryConstructor(orCreateKotlinClass);
                if (primaryConstructor != null) {
                    coreInventoryScanState = (CoreInventoryScanState) primaryConstructor.call(state.mo40320c(), state.mo40317g(), state.mo40314j(), state.mo40316h(), state.mo40318e(), state.mo40313k(), state.mo40315i(), state.mo40319d(), state.getAction(), state.mo58259l(), Boolean.valueOf(state.mo58260f()), state.mo58262a(), Integer.valueOf(state.mo58258m()), Integer.valueOf(state.mo58261b()), state.getError());
                } else {
                    coreInventoryScanState = null;
                }
                if (coreInventoryScanState != null) {
                    return (AlertDisabledError) coreInventoryScanState;
                }
                throw new NullPointerException("null cannot be cast to non-null type co.bird.android.feature.coreinventory.scan.AlertDisabledError");
            }
            return state;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreInventoryScanPresenter$consume$11(CoreInventoryScanPresenter coreInventoryScanPresenter) {
        super(1);
        this.f63842g = coreInventoryScanPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends Pair<? extends WireVehicleInventoryScan, ? extends Boolean>> list) {
        invoke2((List<Pair<WireVehicleInventoryScan, Boolean>>) list);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<Pair<WireVehicleInventoryScan, Boolean>> scans) {
        if (scans.isEmpty()) {
            this.f63842g.m42279i(C147591.f63843g);
            return;
        }
        Intrinsics.checkNotNullExpressionValue(scans, "scans");
        List<Pair<WireVehicleInventoryScan, Boolean>> list = scans;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (Intrinsics.areEqual((Boolean) ((Pair) it.next()).component2(), Boolean.FALSE)) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            this.f63842g.m42279i(C147603.f63844g);
        }
    }
}
