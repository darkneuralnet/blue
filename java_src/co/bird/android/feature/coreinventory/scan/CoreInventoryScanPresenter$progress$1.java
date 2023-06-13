package co.bird.android.feature.coreinventory.scan;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import io.reactivex.disposables.InterfaceC23465c;
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
@Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class CoreInventoryScanPresenter$progress$1 extends Lambda implements Function1<InterfaceC23465c, Unit> {

    /* renamed from: g */
    public final /* synthetic */ CoreInventoryScanPresenter f63870g;

    /* renamed from: h */
    public final /* synthetic */ Boolean f63871h;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;)Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanState;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCoreInventoryScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$progress$1$1\n+ 2 CoreInventoryScanState.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanStateKt\n*L\n1#1,261:1\n111#2,20:262\n*S KotlinDebug\n*F\n+ 1 CoreInventoryScanPresenter.kt\nco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$progress$1$1\n*L\n245#1:262,20\n*E\n"})
    /* renamed from: co.bird.android.feature.coreinventory.scan.CoreInventoryScanPresenter$progress$1$1 */
    /* loaded from: classes3.dex */
    public static final class C147701 extends Lambda implements Function1<CoreInventoryScanState, CoreInventoryScanState> {

        /* renamed from: g */
        public final /* synthetic */ Boolean f63872g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C147701(Boolean bool) {
            super(1);
            this.f63872g = bool;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CoreInventoryScanState invoke(CoreInventoryScanState state) {
            CoreInventoryScanState coreInventoryScanState;
            boolean mo58260f;
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
            UpdateUi updateUi = (UpdateUi) coreInventoryScanState;
            int mo58258m = state.mo58258m() + 1;
            Boolean bool = this.f63872g;
            if (bool != null) {
                mo58260f = bool.booleanValue();
            } else {
                mo58260f = state.mo58260f();
            }
            m58257n = updateUi.m58257n((r32 & 1) != 0 ? updateUi.f63875a : null, (r32 & 2) != 0 ? updateUi.f63876b : null, (r32 & 4) != 0 ? updateUi.f63877c : null, (r32 & 8) != 0 ? updateUi.f63878d : null, (r32 & 16) != 0 ? updateUi.f63879e : null, (r32 & 32) != 0 ? updateUi.f63880f : null, (r32 & 64) != 0 ? updateUi.f63881g : null, (r32 & 128) != 0 ? updateUi.f63882h : null, (r32 & 256) != 0 ? updateUi.f63883i : null, (r32 & 512) != 0 ? updateUi.f63884j : null, (r32 & 1024) != 0 ? updateUi.f63885k : mo58260f, (r32 & 2048) != 0 ? updateUi.f63886l : null, (r32 & 4096) != 0 ? updateUi.f63887m : mo58258m, (r32 & 8192) != 0 ? updateUi.f63888n : 0, (r32 & 16384) != 0 ? updateUi.f63889o : null);
            return m58257n;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreInventoryScanPresenter$progress$1(CoreInventoryScanPresenter coreInventoryScanPresenter, Boolean bool) {
        super(1);
        this.f63870g = coreInventoryScanPresenter;
        this.f63871h = bool;
    }

    /* renamed from: a */
    public final void m58274a(InterfaceC23465c interfaceC23465c) {
        this.f63870g.m42279i(new C147701(this.f63871h));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
        m58274a(interfaceC23465c);
        return Unit.INSTANCE;
    }
}
