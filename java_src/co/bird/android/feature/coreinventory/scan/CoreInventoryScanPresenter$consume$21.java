package co.bird.android.feature.coreinventory.scan;

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
@Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "unprocessedCount", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes3.dex */
public final class CoreInventoryScanPresenter$consume$21 extends Lambda implements Function1<Integer, Unit> {

    /* renamed from: g */
    public final /* synthetic */ CoreInventoryScanPresenter f63856g;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;)Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoreInventoryScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$21$1\n+ 2 CoreInventoryScanState.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanStateKt\n*L\n1#1,261:1\n111#2,20:262\n*S KotlinDebug\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$21$1\n*L\n227#1:262,20\n*E\n"})
    /* renamed from: co.bird.android.feature.coreinventory.scan.CoreInventoryScanPresenter$consume$21$1 */
    /* loaded from: classes3.dex */
    public static final class C147641 extends Lambda implements Function1<CoreInventoryScanState, CoreInventoryScanState> {

        /* renamed from: g */
        public final /* synthetic */ Integer f63857g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C147641(Integer num) {
            super(1);
            this.f63857g = num;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CoreInventoryScanState invoke(CoreInventoryScanState coreInventoryScanState) {
            ConfirmExit m58384n;
            CoreInventoryScanState coreInventoryScanState2;
            CoreInventoryScanState state = coreInventoryScanState;
            Intrinsics.checkNotNullParameter(state, "state");
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConfirmExit.class);
            if (!(state instanceof ConfirmExit)) {
                KFunction primaryConstructor = KClasses.getPrimaryConstructor(orCreateKotlinClass);
                if (primaryConstructor != null) {
                    coreInventoryScanState2 = (CoreInventoryScanState) primaryConstructor.call(coreInventoryScanState.mo40320c(), coreInventoryScanState.mo40317g(), coreInventoryScanState.mo40314j(), coreInventoryScanState.mo40316h(), coreInventoryScanState.mo40318e(), coreInventoryScanState.mo40313k(), coreInventoryScanState.mo40315i(), coreInventoryScanState.mo40319d(), coreInventoryScanState.getAction(), coreInventoryScanState.mo58259l(), Boolean.valueOf(coreInventoryScanState.mo58260f()), coreInventoryScanState.mo58262a(), Integer.valueOf(coreInventoryScanState.mo58258m()), Integer.valueOf(coreInventoryScanState.mo58261b()), coreInventoryScanState.getError());
                } else {
                    coreInventoryScanState2 = null;
                }
                if (coreInventoryScanState2 != null) {
                    state = (ConfirmExit) coreInventoryScanState2;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type co.bird.android.feature.coreinventory.scan.ConfirmExit");
                }
            }
            Integer unprocessedCount = this.f63857g;
            Intrinsics.checkNotNullExpressionValue(unprocessedCount, "unprocessedCount");
            m58384n = r1.m58384n((r32 & 1) != 0 ? r1.f63775a : null, (r32 & 2) != 0 ? r1.f63776b : null, (r32 & 4) != 0 ? r1.f63777c : null, (r32 & 8) != 0 ? r1.f63778d : null, (r32 & 16) != 0 ? r1.f63779e : null, (r32 & 32) != 0 ? r1.f63780f : null, (r32 & 64) != 0 ? r1.f63781g : null, (r32 & 128) != 0 ? r1.f63782h : null, (r32 & 256) != 0 ? r1.f63783i : null, (r32 & 512) != 0 ? r1.f63784j : null, (r32 & 1024) != 0 ? r1.f63785k : false, (r32 & 2048) != 0 ? r1.f63786l : null, (r32 & 4096) != 0 ? r1.f63787m : 0, (r32 & 8192) != 0 ? r1.f63788n : unprocessedCount.intValue(), (r32 & 16384) != 0 ? ((ConfirmExit) state).f63789o : null);
            return m58384n;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreInventoryScanPresenter$consume$21(CoreInventoryScanPresenter coreInventoryScanPresenter) {
        super(1);
        this.f63856g = coreInventoryScanPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke2(num);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Integer unprocessedCount) {
        InterfaceC40099e13 interfaceC40099e13;
        Intrinsics.checkNotNullExpressionValue(unprocessedCount, "unprocessedCount");
        if (unprocessedCount.intValue() > 0) {
            this.f63856g.m42279i(new C147641(unprocessedCount));
            return;
        }
        interfaceC40099e13 = this.f63856g.f63835i;
        interfaceC40099e13.close();
    }
}
