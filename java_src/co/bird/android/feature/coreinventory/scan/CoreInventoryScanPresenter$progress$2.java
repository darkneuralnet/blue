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
@Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "T", "it", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes3.dex */
public final class CoreInventoryScanPresenter$progress$2 extends Lambda implements Function1<T, Unit> {

    /* renamed from: g */
    public final /* synthetic */ CoreInventoryScanPresenter f63873g;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;)Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoreInventoryScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$progress$2$1\n+ 2 CoreInventoryScanState.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanStateKt\n*L\n1#1,261:1\n111#2,20:262\n*S KotlinDebug\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$progress$2$1\n*L\n253#1:262,20\n*E\n"})
    /* renamed from: co.bird.android.feature.coreinventory.scan.CoreInventoryScanPresenter$progress$2$1 */
    /* loaded from: classes3.dex */
    public static final class C147711 extends Lambda implements Function1<CoreInventoryScanState, CoreInventoryScanState> {

        /* renamed from: g */
        public static final C147711 f63874g = new C147711();

        public C147711() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CoreInventoryScanState invoke(CoreInventoryScanState state) {
            CoreInventoryScanState coreInventoryScanState;
            UpdateUi m58257n;
            CoreInventoryScanState coreInventoryScanState2;
            Intrinsics.checkNotNullParameter(state, "state");
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UpdateUi.class);
            if (!(state instanceof UpdateUi)) {
                KFunction primaryConstructor = KClasses.getPrimaryConstructor(orCreateKotlinClass);
                if (primaryConstructor != null) {
                    coreInventoryScanState2 = (CoreInventoryScanState) primaryConstructor.call(state.mo40320c(), state.mo40317g(), state.mo40314j(), state.mo40316h(), state.mo40318e(), state.mo40313k(), state.mo40315i(), state.mo40319d(), state.getAction(), state.mo58259l(), Boolean.valueOf(state.mo58260f()), state.mo58262a(), Integer.valueOf(state.mo58258m()), Integer.valueOf(state.mo58261b()), state.getError());
                } else {
                    coreInventoryScanState2 = null;
                }
                if (coreInventoryScanState2 != null) {
                    coreInventoryScanState = (UpdateUi) coreInventoryScanState2;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type co.bird.android.feature.coreinventory.scan.UpdateUi");
                }
            } else {
                coreInventoryScanState = state;
            }
            m58257n = r4.m58257n((r32 & 1) != 0 ? r4.f63875a : null, (r32 & 2) != 0 ? r4.f63876b : null, (r32 & 4) != 0 ? r4.f63877c : null, (r32 & 8) != 0 ? r4.f63878d : null, (r32 & 16) != 0 ? r4.f63879e : null, (r32 & 32) != 0 ? r4.f63880f : null, (r32 & 64) != 0 ? r4.f63881g : null, (r32 & 128) != 0 ? r4.f63882h : null, (r32 & 256) != 0 ? r4.f63883i : null, (r32 & 512) != 0 ? r4.f63884j : null, (r32 & 1024) != 0 ? r4.f63885k : true, (r32 & 2048) != 0 ? r4.f63886l : null, (r32 & 4096) != 0 ? r4.f63887m : state.mo58258m() - 1, (r32 & 8192) != 0 ? r4.f63888n : 0, (r32 & 16384) != 0 ? ((UpdateUi) coreInventoryScanState).f63889o : null);
            return m58257n;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreInventoryScanPresenter$progress$2(CoreInventoryScanPresenter coreInventoryScanPresenter) {
        super(1);
        this.f63873g = coreInventoryScanPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2((CoreInventoryScanPresenter$progress$2) obj);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(T t) {
        this.f63873g.m42279i(C147711.f63874g);
    }
}
