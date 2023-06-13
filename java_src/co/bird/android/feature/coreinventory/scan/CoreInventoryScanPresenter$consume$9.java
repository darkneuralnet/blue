package co.bird.android.feature.coreinventory.scan;

import co.bird.android.buava.Optional;
import co.bird.android.model.Warehouse;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.full.KClasses;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001e\u0010\u0003\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0001 \u0002*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Warehouse;", "kotlin.jvm.PlatformType", "warehouseOptional", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class CoreInventoryScanPresenter$consume$9 extends Lambda implements Function1<Optional<Warehouse>, Unit> {

    /* renamed from: g */
    public final /* synthetic */ CoreInventoryScanPresenter f63868g;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;)Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoreInventoryScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$9$1\n+ 2 CoreInventoryScanState.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanStateKt\n*L\n1#1,261:1\n111#2,20:262\n*S KotlinDebug\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$9$1\n*L\n128#1:262,20\n*E\n"})
    /* renamed from: co.bird.android.feature.coreinventory.scan.CoreInventoryScanPresenter$consume$9$1 */
    /* loaded from: classes3.dex */
    public static final class C147691 extends Lambda implements Function1<CoreInventoryScanState, CoreInventoryScanState> {

        /* renamed from: g */
        public final /* synthetic */ Optional<Warehouse> f63869g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C147691(Optional<Warehouse> optional) {
            super(1);
            this.f63869g = optional;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CoreInventoryScanState invoke(CoreInventoryScanState coreInventoryScanState) {
            ConfirmProcessing m58383n;
            CoreInventoryScanState coreInventoryScanState2;
            CoreInventoryScanState state = coreInventoryScanState;
            Intrinsics.checkNotNullParameter(state, "state");
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConfirmProcessing.class);
            String str = null;
            if (!(state instanceof ConfirmProcessing)) {
                KFunction primaryConstructor = KClasses.getPrimaryConstructor(orCreateKotlinClass);
                if (primaryConstructor != null) {
                    coreInventoryScanState2 = (CoreInventoryScanState) primaryConstructor.call(coreInventoryScanState.mo40320c(), coreInventoryScanState.mo40317g(), coreInventoryScanState.mo40314j(), coreInventoryScanState.mo40316h(), coreInventoryScanState.mo40318e(), coreInventoryScanState.mo40313k(), coreInventoryScanState.mo40315i(), coreInventoryScanState.mo40319d(), coreInventoryScanState.getAction(), coreInventoryScanState.mo58259l(), Boolean.valueOf(coreInventoryScanState.mo58260f()), coreInventoryScanState.mo58262a(), Integer.valueOf(coreInventoryScanState.mo58258m()), Integer.valueOf(coreInventoryScanState.mo58261b()), coreInventoryScanState.getError());
                } else {
                    coreInventoryScanState2 = null;
                }
                if (coreInventoryScanState2 != null) {
                    state = (ConfirmProcessing) coreInventoryScanState2;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type co.bird.android.feature.coreinventory.scan.ConfirmProcessing");
                }
            }
            ConfirmProcessing confirmProcessing = (ConfirmProcessing) state;
            Warehouse m59035e = this.f63869g.m59035e();
            if (m59035e != null) {
                str = m59035e.getName();
            }
            m58383n = confirmProcessing.m58383n((r32 & 1) != 0 ? confirmProcessing.f63790a : null, (r32 & 2) != 0 ? confirmProcessing.f63791b : null, (r32 & 4) != 0 ? confirmProcessing.f63792c : null, (r32 & 8) != 0 ? confirmProcessing.f63793d : null, (r32 & 16) != 0 ? confirmProcessing.f63794e : null, (r32 & 32) != 0 ? confirmProcessing.f63795f : null, (r32 & 64) != 0 ? confirmProcessing.f63796g : null, (r32 & 128) != 0 ? confirmProcessing.f63797h : null, (r32 & 256) != 0 ? confirmProcessing.f63798i : null, (r32 & 512) != 0 ? confirmProcessing.f63799j : null, (r32 & 1024) != 0 ? confirmProcessing.f63800k : false, (r32 & 2048) != 0 ? confirmProcessing.f63801l : str, (r32 & 4096) != 0 ? confirmProcessing.f63802m : 0, (r32 & 8192) != 0 ? confirmProcessing.f63803n : 0, (r32 & 16384) != 0 ? confirmProcessing.f63804o : null);
            return m58383n;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreInventoryScanPresenter$consume$9(CoreInventoryScanPresenter coreInventoryScanPresenter) {
        super(1);
        this.f63868g = coreInventoryScanPresenter;
    }

    /* renamed from: a */
    public final void m58276a(Optional<Warehouse> optional) {
        this.f63868g.m42279i(new C147691(optional));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Optional<Warehouse> optional) {
        m58276a(optional);
        return Unit.INSTANCE;
    }
}
