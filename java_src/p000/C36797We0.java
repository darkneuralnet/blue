package p000;

import co.bird.android.model.wire.WireCaptureValidation;
import co.bird.api.response.BulkCaptureResponse;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.location.places.Place;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23479b;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import p000.InterfaceC40099e13;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J*\u0010\u000f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u000e0\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n*\b\u0012\u0004\u0012\u00020\u00050\nH\u0002J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0002R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R.\u0010(\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r %*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000e0\u000e0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010*\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00010\u00050\u00050$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'¨\u0006-"}, m28432d2 = {"LWe0;", "LhE;", "LXe0;", "LYe0;", "renderer", "", "F", "", "e", "K", "Lio/reactivex/Observable;", "", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireCaptureValidation;", "", "O", "Lco/bird/api/response/BulkCaptureResponse;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "T", "Lio/reactivex/F;", "L", "Lom3;", "f", "Lom3;", "operatorManager", "LTq4;", "g", "LTq4;", "reactiveConfig", "Le13;", "h", "Le13;", "navigator", "i", "Ljava/lang/String;", "sessionId", "Lma4;", "kotlin.jvm.PlatformType", "j", "Lma4;", "scans", "k", "capture", "<init>", "(Lom3;LTq4;Le13;)V", "bulk-scanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCaptureBulkScannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureBulkScannerPresenter.kt\nco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt\n*L\n1#1,163:1\n180#2:164\n180#2:165\n180#2:166\n180#2:167\n180#2:168\n180#2:169\n233#3:170\n*S KotlinDebug\n*F\n+ 1 CaptureBulkScannerPresenter.kt\nco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerPresenter\n*L\n41#1:164\n54#1:165\n62#1:166\n76#1:167\n93#1:168\n104#1:169\n145#1:170\n*E\n"})
/* renamed from: We0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36797We0 extends C22600hE<InterfaceC37031Xe0, C37265Ye0> {

    /* renamed from: f */
    public final InterfaceC46473om3 f41427f;

    /* renamed from: g */
    public final C36207Tq4 f41428g;

    /* renamed from: h */
    public final InterfaceC40099e13 f41429h;

    /* renamed from: i */
    public final String f41430i;

    /* renamed from: j */
    public final C45168ma4<List<WireCaptureValidation>> f41431j;

    /* renamed from: k */
    public final C45168ma4<Unit> f41432k;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "T", "U", "R", "t", "u", "apply", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$1\n+ 2 CaptureBulkScannerPresenter.kt\nco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerPresenter\n*L\n1#1,304:1\n145#2:305\n*E\n"})
    /* renamed from: We0$a */
    /* loaded from: classes3.dex */
    public static final class C9113a<T1, T2, R> implements InterfaceC23480c<Unit, List<? extends WireCaptureValidation>, R> {
        @Override // io.reactivex.functions.InterfaceC23480c
        public final R apply(Unit unit, List<? extends WireCaptureValidation> list) {
            return (R) list;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireCaptureValidation;", "scans", "Lio/reactivex/K;", "Lco/bird/api/response/BulkCaptureResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCaptureBulkScannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureBulkScannerPresenter.kt\nco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerPresenter$bulkCapture$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1603#2,9:164\n1855#2:173\n1856#2:175\n1612#2:176\n1#3:174\n*S KotlinDebug\n*F\n+ 1 CaptureBulkScannerPresenter.kt\nco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerPresenter$bulkCapture$2\n*L\n147#1:164,9\n147#1:173\n147#1:175\n147#1:176\n147#1:174\n*E\n"})
    /* renamed from: We0$b */
    /* loaded from: classes3.dex */
    public static final class C9114b extends Lambda implements Function1<List<? extends WireCaptureValidation>, InterfaceC23447K<? extends BulkCaptureResponse>> {
        public C9114b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends BulkCaptureResponse> invoke(List<WireCaptureValidation> scans) {
            Intrinsics.checkNotNullParameter(scans, "scans");
            C36797We0 c36797We0 = C36797We0.this;
            InterfaceC46473om3 interfaceC46473om3 = c36797We0.f41427f;
            String str = C36797We0.this.f41430i;
            ArrayList arrayList = new ArrayList();
            for (WireCaptureValidation wireCaptureValidation : scans) {
                String birdId = wireCaptureValidation.getBirdId();
                if (birdId != null) {
                    arrayList.add(birdId);
                }
            }
            return c36797We0.m78095L(interfaceC46473om3.mo8097j1(str, arrayList));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: We0$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9115c extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C9115c(Object obj) {
            super(1, obj, C36797We0.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C36797We0) this.receiver).m78096K(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u000422\u0010\u0003\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001 \u0002*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: We0$d */
    /* loaded from: classes3.dex */
    public static final class C9116d extends Lambda implements Function1<Triple<? extends Boolean, ? extends Boolean, ? extends Boolean>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LYe0;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LYe0;)LYe0;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: We0$d$a */
        /* loaded from: classes3.dex */
        public static final class C9117a extends Lambda implements Function1<C37265Ye0, C37265Ye0> {

            /* renamed from: g */
            public final /* synthetic */ boolean f41435g;

            /* renamed from: h */
            public final /* synthetic */ boolean f41436h;

            /* renamed from: i */
            public final /* synthetic */ boolean f41437i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9117a(boolean z, boolean z2, boolean z3) {
                super(1);
                this.f41435g = z;
                this.f41436h = z2;
                this.f41437i = z3;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C37265Ye0 invoke(C37265Ye0 state) {
                C37265Ye0 m74663n;
                Intrinsics.checkNotNullParameter(state, "state");
                m74663n = state.m74663n((r22 & 1) != 0 ? state.f46159a : null, (r22 & 2) != 0 ? state.f46160b : 0, (r22 & 4) != 0 ? state.f46161c : null, (r22 & 8) != 0 ? state.f46162d : Boolean.valueOf(this.f41435g), (r22 & 16) != 0 ? state.f46163e : Boolean.valueOf(this.f41436h), (r22 & 32) != 0 ? state.f46164f : Boolean.valueOf(!this.f41437i), (r22 & 64) != 0 ? state.f46165g : null, (r22 & 128) != 0 ? state.f46166h : null, (r22 & 256) != 0 ? state.f46167i : null, (r22 & 512) != 0 ? state.f46168j : null);
                return m74663n;
            }
        }

        public C9116d() {
            super(1);
        }

        /* renamed from: a */
        public final void m78072a(Triple<Boolean, Boolean, Boolean> triple) {
            C36797We0.this.m42279i(new C9117a(triple.component1().booleanValue(), triple.component2().booleanValue(), triple.component3().booleanValue()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Boolean, ? extends Boolean, ? extends Boolean> triple) {
            m78072a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "scans", "", "Lco/bird/android/model/wire/WireCaptureValidation;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: We0$e */
    /* loaded from: classes3.dex */
    public static final class C9118e extends Lambda implements Function1<List<? extends WireCaptureValidation>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LYe0;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LYe0;)LYe0;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: We0$e$a */
        /* loaded from: classes3.dex */
        public static final class C9119a extends Lambda implements Function1<C37265Ye0, C37265Ye0> {

            /* renamed from: g */
            public final /* synthetic */ List<WireCaptureValidation> f41439g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9119a(List<WireCaptureValidation> list) {
                super(1);
                this.f41439g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C37265Ye0 invoke(C37265Ye0 state) {
                C37265Ye0 m74663n;
                Intrinsics.checkNotNullParameter(state, "state");
                List<WireCaptureValidation> scans = this.f41439g;
                Intrinsics.checkNotNullExpressionValue(scans, "scans");
                m74663n = state.m74663n((r22 & 1) != 0 ? state.f46159a : scans, (r22 & 2) != 0 ? state.f46160b : 0, (r22 & 4) != 0 ? state.f46161c : null, (r22 & 8) != 0 ? state.f46162d : null, (r22 & 16) != 0 ? state.f46163e : null, (r22 & 32) != 0 ? state.f46164f : null, (r22 & 64) != 0 ? state.f46165g : null, (r22 & 128) != 0 ? state.f46166h : null, (r22 & 256) != 0 ? state.f46167i : null, (r22 & 512) != 0 ? state.f46168j : null);
                return m74663n;
            }
        }

        public C9118e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends WireCaptureValidation> list) {
            invoke2((List<WireCaptureValidation>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<WireCaptureValidation> list) {
            C36797We0.this.m42279i(new C9119a(list));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0005 \u0006*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireCaptureValidation;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nCaptureBulkScannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureBulkScannerPresenter.kt\nco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerPresenter$consume$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,163:1\n1549#2:164\n1620#2,3:165\n1054#2:170\n37#3,2:168\n*S KotlinDebug\n*F\n+ 1 CaptureBulkScannerPresenter.kt\nco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerPresenter$consume$3\n*L\n64#1:164\n64#1:165,3\n69#1:170\n66#1:168,2\n*E\n"})
    /* renamed from: We0$f */
    /* loaded from: classes3.dex */
    public static final class C9120f extends Lambda implements Function1<Pair<? extends WireCaptureValidation, ? extends List<? extends WireCaptureValidation>>, Unit> {

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 CaptureBulkScannerPresenter.kt\nco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerPresenter$consume$3\n*L\n1#1,328:1\n69#2:329\n*E\n"})
        /* renamed from: We0$f$a */
        /* loaded from: classes3.dex */
        public static final class C9121a<T> implements Comparator {

            /* renamed from: b */
            public final /* synthetic */ WireCaptureValidation f41441b;

            public C9121a(WireCaptureValidation wireCaptureValidation) {
                this.f41441b = wireCaptureValidation;
            }

            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compareValues;
                compareValues = ComparisonsKt__ComparisonsKt.compareValues(Boolean.valueOf(Intrinsics.areEqual(((WireCaptureValidation) t2).getBirdId(), this.f41441b.getBirdId())), Boolean.valueOf(Intrinsics.areEqual(((WireCaptureValidation) t).getBirdId(), this.f41441b.getBirdId())));
                return compareValues;
            }
        }

        public C9120f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireCaptureValidation, ? extends List<? extends WireCaptureValidation>> pair) {
            invoke2((Pair<WireCaptureValidation, ? extends List<WireCaptureValidation>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WireCaptureValidation, ? extends List<WireCaptureValidation>> pair) {
            int collectionSizeOrDefault;
            List sortedWith;
            List listOf;
            WireCaptureValidation component1 = pair.component1();
            List<WireCaptureValidation> component2 = pair.component2();
            List<WireCaptureValidation> list = component2;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireCaptureValidation wireCaptureValidation : list) {
                arrayList.add(wireCaptureValidation.getBirdId());
            }
            if (!arrayList.contains(component1.getBirdId())) {
                C45168ma4 c45168ma4 = C36797We0.this.f41431j;
                SpreadBuilder spreadBuilder = new SpreadBuilder(2);
                spreadBuilder.add(component1);
                spreadBuilder.addSpread(component2.toArray(new WireCaptureValidation[0]));
                listOf = CollectionsKt__CollectionsKt.listOf(spreadBuilder.toArray(new WireCaptureValidation[spreadBuilder.size()]));
                c45168ma4.accept(listOf);
                return;
            }
            C45168ma4 c45168ma42 = C36797We0.this.f41431j;
            sortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new C9121a(component1));
            c45168ma42.accept(sortedWith);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000126\u0010\u0002\u001a2\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: We0$g */
    /* loaded from: classes3.dex */
    public static final class C9122g extends Lambda implements Function1<Pair<? extends Unit, ? extends Boolean>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LYe0;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LYe0;)LYe0;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nCaptureBulkScannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureBulkScannerPresenter.kt\nco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerPresenter$consume$4$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1#2:164\n*E\n"})
        /* renamed from: We0$g$a */
        /* loaded from: classes3.dex */
        public static final class C9123a extends Lambda implements Function1<C37265Ye0, C37265Ye0> {

            /* renamed from: g */
            public static final C9123a f41443g = new C9123a();

            public C9123a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C37265Ye0 invoke(C37265Ye0 state) {
                C37265Ye0 m74663n;
                Intrinsics.checkNotNullParameter(state, "state");
                m74663n = state.m74663n((r22 & 1) != 0 ? state.f46159a : null, (r22 & 2) != 0 ? state.f46160b : 0, (r22 & 4) != 0 ? state.f46161c : null, (r22 & 8) != 0 ? state.f46162d : null, (r22 & 16) != 0 ? state.f46163e : null, (r22 & 32) != 0 ? state.f46164f : null, (r22 & 64) != 0 ? state.f46165g : null, (r22 & 128) != 0 ? state.f46166h : null, (r22 & 256) != 0 ? state.f46167i : null, (r22 & 512) != 0 ? state.f46168j : null);
                m74663n.m74658s(true);
                return m74663n;
            }
        }

        public C9122g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends Boolean> pair) {
            invoke2((Pair<Unit, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, Boolean> pair) {
            Boolean requireCaptureConfirmation = pair.component2();
            Intrinsics.checkNotNullExpressionValue(requireCaptureConfirmation, "requireCaptureConfirmation");
            if (requireCaptureConfirmation.booleanValue()) {
                C36797We0.this.m42279i(C9123a.f41443g);
            } else {
                C36797We0.this.f41432k.accept(Unit.INSTANCE);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/BulkCaptureResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/api/response/BulkCaptureResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: We0$h */
    /* loaded from: classes3.dex */
    public static final class C9124h extends Lambda implements Function1<BulkCaptureResponse, Unit> {
        public C9124h() {
            super(1);
        }

        /* renamed from: a */
        public final void m78068a(BulkCaptureResponse bulkCaptureResponse) {
            C36797We0.this.f41429h.mo37077W0(InterfaceC40099e13.EnumC19925b.RESULT_OK, TuplesKt.m28425to("capture_count", Integer.valueOf(bulkCaptureResponse.getCaptures().size())));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BulkCaptureResponse bulkCaptureResponse) {
            m78068a(bulkCaptureResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0006*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00050\u0005 \u0006*$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0006*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireCaptureValidation;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: We0$i */
    /* loaded from: classes3.dex */
    public static final class C9125i extends Lambda implements Function1<Pair<? extends WireCaptureValidation, ? extends List<? extends WireCaptureValidation>>, Unit> {
        public C9125i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends WireCaptureValidation, ? extends List<? extends WireCaptureValidation>> pair) {
            invoke2((Pair<WireCaptureValidation, ? extends List<WireCaptureValidation>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<WireCaptureValidation, ? extends List<WireCaptureValidation>> pair) {
            List minus;
            List<WireCaptureValidation> captureValidations = pair.component2();
            C45168ma4 c45168ma4 = C36797We0.this.f41431j;
            Intrinsics.checkNotNullExpressionValue(captureValidations, "captureValidations");
            minus = CollectionsKt___CollectionsKt.minus(captureValidations, pair.component1());
            c45168ma4.accept(minus);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LYe0;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LYe0;)LYe0;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCaptureBulkScannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureBulkScannerPresenter.kt\nco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerPresenter$onError$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1#2:164\n*E\n"})
    /* renamed from: We0$j */
    /* loaded from: classes3.dex */
    public static final class C9126j extends Lambda implements Function1<C37265Ye0, C37265Ye0> {

        /* renamed from: g */
        public final /* synthetic */ Throwable f41446g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9126j(Throwable th) {
            super(1);
            this.f41446g = th;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C37265Ye0 invoke(C37265Ye0 state) {
            C37265Ye0 m74663n;
            Intrinsics.checkNotNullParameter(state, "state");
            m74663n = state.m74663n((r22 & 1) != 0 ? state.f46159a : null, (r22 & 2) != 0 ? state.f46160b : 0, (r22 & 4) != 0 ? state.f46161c : null, (r22 & 8) != 0 ? state.f46162d : null, (r22 & 16) != 0 ? state.f46163e : null, (r22 & 32) != 0 ? state.f46164f : null, (r22 & 64) != 0 ? state.f46165g : null, (r22 & 128) != 0 ? state.f46166h : null, (r22 & 256) != 0 ? state.f46167i : null, (r22 & 512) != 0 ? state.f46168j : null);
            m74663n.m74657t(this.f41446g);
            return m74663n;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T", "Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: We0$k */
    /* loaded from: classes3.dex */
    public static final class C9127k extends Lambda implements Function1<InterfaceC23465c, Unit> {

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "LYe0;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LYe0;)LYe0;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: We0$k$a */
        /* loaded from: classes3.dex */
        public static final class C9128a extends Lambda implements Function1<C37265Ye0, C37265Ye0> {

            /* renamed from: g */
            public static final C9128a f41448g = new C9128a();

            public C9128a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C37265Ye0 invoke(C37265Ye0 state) {
                C37265Ye0 m74663n;
                Intrinsics.checkNotNullParameter(state, "state");
                m74663n = state.m74663n((r22 & 1) != 0 ? state.f46159a : null, (r22 & 2) != 0 ? state.f46160b : state.m74660q() + 1, (r22 & 4) != 0 ? state.f46161c : null, (r22 & 8) != 0 ? state.f46162d : null, (r22 & 16) != 0 ? state.f46163e : null, (r22 & 32) != 0 ? state.f46164f : null, (r22 & 64) != 0 ? state.f46165g : null, (r22 & 128) != 0 ? state.f46166h : null, (r22 & 256) != 0 ? state.f46167i : null, (r22 & 512) != 0 ? state.f46168j : null);
                return m74663n;
            }
        }

        public C9127k() {
            super(1);
        }

        /* renamed from: a */
        public final void m78066a(InterfaceC23465c interfaceC23465c) {
            C36797We0.this.m42279i(C9128a.f41448g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m78066a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"T", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Throwable;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: We0$l */
    /* loaded from: classes3.dex */
    public static final class C9129l extends Lambda implements Function2<T, Throwable, Unit> {

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "LYe0;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LYe0;)LYe0;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: We0$l$a */
        /* loaded from: classes3.dex */
        public static final class C9130a extends Lambda implements Function1<C37265Ye0, C37265Ye0> {

            /* renamed from: g */
            public static final C9130a f41450g = new C9130a();

            public C9130a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C37265Ye0 invoke(C37265Ye0 state) {
                C37265Ye0 m74663n;
                Intrinsics.checkNotNullParameter(state, "state");
                m74663n = state.m74663n((r22 & 1) != 0 ? state.f46159a : null, (r22 & 2) != 0 ? state.f46160b : state.m74660q() - 1, (r22 & 4) != 0 ? state.f46161c : null, (r22 & 8) != 0 ? state.f46162d : null, (r22 & 16) != 0 ? state.f46163e : null, (r22 & 32) != 0 ? state.f46164f : null, (r22 & 64) != 0 ? state.f46165g : null, (r22 & 128) != 0 ? state.f46166h : null, (r22 & 256) != 0 ? state.f46167i : null, (r22 & 512) != 0 ? state.f46168j : null);
                return m74663n;
            }
        }

        public C9129l() {
            super(2);
        }

        /* renamed from: a */
        public final void m78064a(T t, Throwable th) {
            C36797We0.this.m42279i(C9130a.f41450g);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Throwable th) {
            m78064a(obj, th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "raw", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: We0$m */
    /* loaded from: classes3.dex */
    public static final class C9131m extends Lambda implements Function1<String, String> {

        /* renamed from: g */
        public static final C9131m f41451g = new C9131m();

        public C9131m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String raw) {
            Intrinsics.checkNotNullParameter(raw, "raw");
            String m99597e = C33894Jt4.f18402a.m99597e(raw);
            return m99597e == null ? raw : m99597e;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004 \u0002*\u0014\u0012\u000e\b\u0001\u0012\n \u0002*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u00062.\u0010\u0005\u001a*\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "", "Lco/bird/android/model/wire/WireCaptureValidation;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nCaptureBulkScannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureBulkScannerPresenter.kt\nco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerPresenter$validate$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1603#2,9:164\n1855#2:173\n1856#2:175\n1612#2:176\n1#3:174\n*S KotlinDebug\n*F\n+ 1 CaptureBulkScannerPresenter.kt\nco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerPresenter$validate$2\n*L\n124#1:164,9\n124#1:173\n124#1:175\n124#1:176\n124#1:174\n*E\n"})
    /* renamed from: We0$n */
    /* loaded from: classes3.dex */
    public static final class C9132n extends Lambda implements Function1<Pair<? extends String, ? extends List<? extends WireCaptureValidation>>, InterfaceC23447K<? extends WireCaptureValidation>> {
        public C9132n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends WireCaptureValidation> invoke(Pair<String, ? extends List<WireCaptureValidation>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            String scan = pair.component1();
            List<WireCaptureValidation> scans = pair.component2();
            C36797We0 c36797We0 = C36797We0.this;
            InterfaceC46473om3 interfaceC46473om3 = c36797We0.f41427f;
            String str = C36797We0.this.f41430i;
            Intrinsics.checkNotNullExpressionValue(scan, "scan");
            Intrinsics.checkNotNullExpressionValue(scans, "scans");
            ArrayList arrayList = new ArrayList();
            for (WireCaptureValidation wireCaptureValidation : scans) {
                String birdId = wireCaptureValidation.getBirdId();
                if (birdId != null) {
                    arrayList.add(birdId);
                }
            }
            return c36797We0.m78095L(interfaceC46473om3.mo8110d1(str, scan, arrayList));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireCaptureValidation;", "captureValidation", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireCaptureValidation;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: We0$o */
    /* loaded from: classes3.dex */
    public static final class C9133o extends Lambda implements Function1<WireCaptureValidation, InterfaceC24574u<? extends WireCaptureValidation>> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LYe0;", TransferTable.COLUMN_STATE, C17296a.f69688o, "(LYe0;)LYe0;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nCaptureBulkScannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureBulkScannerPresenter.kt\nco/bird/android/feature/bulkscanner/scan/capture/CaptureBulkScannerPresenter$validate$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1#2:164\n*E\n"})
        /* renamed from: We0$o$a */
        /* loaded from: classes3.dex */
        public static final class C9134a extends Lambda implements Function1<C37265Ye0, C37265Ye0> {

            /* renamed from: g */
            public final /* synthetic */ WireCaptureValidation f41454g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9134a(WireCaptureValidation wireCaptureValidation) {
                super(1);
                this.f41454g = wireCaptureValidation;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C37265Ye0 invoke(C37265Ye0 state) {
                C37265Ye0 m74663n;
                Intrinsics.checkNotNullParameter(state, "state");
                m74663n = state.m74663n((r22 & 1) != 0 ? state.f46159a : null, (r22 & 2) != 0 ? state.f46160b : 0, (r22 & 4) != 0 ? state.f46161c : null, (r22 & 8) != 0 ? state.f46162d : null, (r22 & 16) != 0 ? state.f46163e : null, (r22 & 32) != 0 ? state.f46164f : null, (r22 & 64) != 0 ? state.f46165g : null, (r22 & 128) != 0 ? state.f46166h : null, (r22 & 256) != 0 ? state.f46167i : null, (r22 & 512) != 0 ? state.f46168j : null);
                m74663n.m74656u(this.f41454g.getFailureReason());
                return m74663n;
            }
        }

        public C9133o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends WireCaptureValidation> invoke(WireCaptureValidation captureValidation) {
            Intrinsics.checkNotNullParameter(captureValidation, "captureValidation");
            if (captureValidation.getFailureReason() != null) {
                C36797We0.this.m42279i(new C9134a(captureValidation));
                return AbstractC24507p.m32024u();
            }
            return AbstractC24507p.m32068G(captureValidation);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: We0$p */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C9135p extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C9135p(Object obj) {
            super(1, obj, C36797We0.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C36797We0) this.receiver).m78096K(p0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36797We0(InterfaceC46473om3 operatorManager, C36207Tq4 reactiveConfig, InterfaceC40099e13 navigator) {
        super(new C37265Ye0(null, 0, null, null, null, null, null, null, null, null, Place.TYPE_SUBLOCALITY_LEVEL_1, null), null, 2, null);
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f41427f = operatorManager;
        this.f41428g = reactiveConfig;
        this.f41429h = navigator;
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.f41430i = uuid;
        C45168ma4<List<WireCaptureValidation>> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<List<WireCaptureValidation>>()");
        this.f41431j = m25409g;
        C45168ma4<Unit> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Unit>()");
        this.f41432k = m25409g2;
    }

    /* renamed from: D */
    public static final InterfaceC23447K m78103D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m78102E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m78100G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m78099H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m78098I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m78097J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m78094M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m78093N(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj, obj2);
    }

    /* renamed from: P */
    public static final String m78091P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final InterfaceC23447K m78090Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final InterfaceC24574u m78089R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: S */
    public static final void m78088S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m78087f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m78086g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public final Observable<BulkCaptureResponse> m78104C(Observable<Unit> observable) {
        Observable<R> withLatestFrom = observable.withLatestFrom(this.f41431j, new C9113a());
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        final C9114b c9114b = new C9114b();
        Observable flatMapSingle = withLatestFrom.flatMapSingle(new InterfaceC23492o() { // from class: Le0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m78103D;
                m78103D = C36797We0.m78103D(Function1.this, obj);
                return m78103D;
            }
        });
        final C9115c c9115c = new C9115c(this);
        Observable<BulkCaptureResponse> retry = flatMapSingle.doOnError(new InterfaceC23484g() { // from class: Me0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36797We0.m78102E(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "private fun Observable<U…Error)\n      .retry()\n  }");
        return retry;
    }

    @Override // p000.C22600hE, p000.AbstractC20169f1
    /* renamed from: F */
    public void consume(InterfaceC37031Xe0 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume((C36797We0) renderer);
        Object m33094as = C24523e.f91168a.m31955b(this.f41428g.m82627f4(), this.f41428g.m82691Z5(), this.f41428g.m82650d3()).m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9116d c9116d = new C9116d();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Ie0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36797We0.m78087f(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f41431j.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9118e c9118e = new C9118e();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Ne0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36797We0.m78086g(Function1.this, obj);
            }
        });
        Object m33094as3 = m78092O(renderer.mo54815T()).m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9120f c9120f = new C9120f();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: Oe0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36797We0.m78100G(Function1.this, obj);
            }
        });
        Object m33094as4 = C24527f.m31950a(renderer.mo58610U2(), this.f41428g.m82878G8()).m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9122g c9122g = new C9122g();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: Pe0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36797We0.m78099H(Function1.this, obj);
            }
        });
        Observable<Unit> merge = Observable.merge(renderer.mo58611M8(), this.f41432k);
        Intrinsics.checkNotNullExpressionValue(merge, "merge(\n      renderer.ca…ms(),\n      capture\n    )");
        Object m33094as5 = m78104C(merge).m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9124h c9124h = new C9124h();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: Qe0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36797We0.m78098I(Function1.this, obj);
            }
        });
        Object m33094as6 = C24527f.m31950a(renderer.mo58612H1(), this.f41431j).m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C9125i c9125i = new C9125i();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: Re0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36797We0.m78097J(Function1.this, obj);
            }
        });
    }

    /* renamed from: K */
    public final void m78096K(Throwable th) {
        C41318g46.m40159e(th);
        m42279i(new C9126j(th));
    }

    /* renamed from: L */
    public final <T> AbstractC23442F<T> m78095L(AbstractC23442F<T> abstractC23442F) {
        final C9127k c9127k = new C9127k();
        AbstractC23442F<T> m33102v = abstractC23442F.m33102v(new InterfaceC23484g() { // from class: Se0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36797We0.m78094M(Function1.this, obj);
            }
        });
        final C9129l c9129l = new C9129l();
        AbstractC23442F<T> m33104u = m33102v.m33104u(new InterfaceC23479b() { // from class: Te0
            @Override // io.reactivex.functions.InterfaceC23479b
            public final void accept(Object obj, Object obj2) {
                C36797We0.m78093N(Function2.this, obj, obj2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33104u, "private fun <T>Single<T>…oading - 1) }\n      }\n  }");
        return m33104u;
    }

    /* renamed from: O */
    public final Observable<Pair<WireCaptureValidation, List<WireCaptureValidation>>> m78092O(Observable<String> observable) {
        List<WireCaptureValidation> emptyList;
        List<WireCaptureValidation> emptyList2;
        final C9131m c9131m = C9131m.f41451g;
        Observable<R> map = observable.map(new InterfaceC23492o() { // from class: Ue0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m78091P;
                m78091P = C36797We0.m78091P(Function1.this, obj);
                return m78091P;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map { raw -> Regex.getSc…mRegexMatch(raw) ?: raw }");
        C45168ma4<List<WireCaptureValidation>> c45168ma4 = this.f41431j;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        Observable<List<WireCaptureValidation>> startWith = c45168ma4.startWith((C45168ma4<List<WireCaptureValidation>>) emptyList);
        Intrinsics.checkNotNullExpressionValue(startWith, "scans.startWith(emptyLis…WireCaptureValidation>())");
        Observable m31950a = C24527f.m31950a(map, startWith);
        final C9132n c9132n = new C9132n();
        Observable flatMapSingle = m31950a.flatMapSingle(new InterfaceC23492o() { // from class: Ve0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m78090Q;
                m78090Q = C36797We0.m78090Q(Function1.this, obj);
                return m78090Q;
            }
        });
        final C9133o c9133o = new C9133o();
        Observable flatMapMaybe = flatMapSingle.flatMapMaybe(new InterfaceC23492o() { // from class: Je0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m78089R;
                m78089R = C36797We0.m78089R(Function1.this, obj);
                return m78089R;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "private fun Observable<S…Error)\n      .retry()\n  }");
        C45168ma4<List<WireCaptureValidation>> c45168ma42 = this.f41431j;
        emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        Observable<List<WireCaptureValidation>> startWith2 = c45168ma42.startWith((C45168ma4<List<WireCaptureValidation>>) emptyList2);
        Intrinsics.checkNotNullExpressionValue(startWith2, "scans.startWith(emptyLis…WireCaptureValidation>())");
        Observable m31950a2 = C24527f.m31950a(flatMapMaybe, startWith2);
        final C9135p c9135p = new C9135p(this);
        Observable<Pair<WireCaptureValidation, List<WireCaptureValidation>>> retry = m31950a2.doOnError(new InterfaceC23484g() { // from class: Ke0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C36797We0.m78088S(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "private fun Observable<S…Error)\n      .retry()\n  }");
        return retry;
    }
}
