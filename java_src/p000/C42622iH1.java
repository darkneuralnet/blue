package p000;

import android.content.Intent;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.constant.InventoryScanningError;
import co.bird.android.model.constant.InventoryScanningErrorKt;
import co.bird.api.response.HardCountScanResponse;
import com.amazonaws.services.p026s3.internal.Constants;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24490k;
import io.reactivex.EnumC23460b;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import p000.C42622iH1;
@Metadata(m28433d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001BQ\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010\r\u001a\u00020\u00072\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\n0\tH\u0002J\u001e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R$\u0010!\u001a\u0004\u0018\u00010\u00058\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u00062"}, m28432d2 = {"LiH1;", "LKj5;", "", "enablePeripheralScanner", "manualInput", "", "previousScanIdentifier", "", "c", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Ls32;", "scanObservable", "p0", "rawScan", "LHM4;", "Lco/bird/api/response/HardCountScanResponse;", "response", "o0", "LXF1;", "k", "LXF1;", "hardCountManager", "LN92;", "l", "LN92;", "inventoryScanningUiDelegate", "m", "Ljava/lang/String;", "n0", "()Ljava/lang/String;", "t0", "(Ljava/lang/String;)V", "prevScanIdentifier", "Lom3;", "operatorManager", "LSM;", "birdPartManager", "LNQ5;", "stickerManager", "LQj5;", "scanCodeUi", "LTq4;", "reactiveConfig", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "navigator", "<init>", "(LXF1;LN92;Lom3;LSM;LNQ5;LQj5;LTq4;Lcom/uber/autodispose/ScopeProvider;Le13;)V", "vehiclescanner_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHardCountScanCodePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountScanCodePresenter.kt\nco/bird/android/vehiclescanner/servicecenter/scan/HardCountScanCodePresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,108:1\n161#2:109\n*S KotlinDebug\n*F\n+ 1 HardCountScanCodePresenter.kt\nco/bird/android/vehiclescanner/servicecenter/scan/HardCountScanCodePresenter\n*L\n70#1:109\n*E\n"})
/* renamed from: iH1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C42622iH1 extends C34039Kj5 {

    /* renamed from: k */
    public final XF1 f87057k;

    /* renamed from: l */
    public final N92 f87058l;

    /* renamed from: m */
    public String f87059m;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001ar\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00000\u0000 \u0007*8\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00000\u0000\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "Ls32;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "LHM4;", "Lco/bird/api/response/HardCountScanResponse;", "kotlin.jvm.PlatformType", "c", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iH1$a */
    /* loaded from: classes4.dex */
    public static final class C23180a extends Lambda implements Function1<Pair<? extends String, ? extends EnumC48419s32>, InterfaceC23447K<? extends Pair<? extends String, ? extends HM4<HardCountScanResponse>>>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000 \u0005*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/HardCountScanResponse;", "it", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: iH1$a$a */
        /* loaded from: classes4.dex */
        public static final class C23181a extends Lambda implements Function1<HM4<HardCountScanResponse>, Pair<? extends String, ? extends HM4<HardCountScanResponse>>> {

            /* renamed from: g */
            public final /* synthetic */ String f87061g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23181a(String str) {
                super(1);
                this.f87061g = str;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<String, HM4<HardCountScanResponse>> invoke(HM4<HardCountScanResponse> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(this.f87061g, it);
            }
        }

        public C23180a() {
            super(1);
        }

        /* renamed from: d */
        public static final HM4 m34251d(C42622iH1 this$0, Throwable it) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(it, "it");
            this$0.m34255t0(null);
            ResponseBody.Companion companion = ResponseBody.Companion;
            String message = it.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            return HM4.m103942c(Constants.NO_SUCH_BUCKET_STATUS_CODE, companion.create((MediaType) null, message));
        }

        /* renamed from: e */
        public static final Pair m34250e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23447K<? extends Pair<String, HM4<HardCountScanResponse>>> invoke(Pair<String, ? extends EnumC48419s32> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            String component1 = pair.component1();
            AbstractC23442F<HM4<HardCountScanResponse>> mo21450m = C42622iH1.this.f87057k.mo21450m(component1, C42622iH1.this.m34261n0());
            final C42622iH1 c42622iH1 = C42622iH1.this;
            AbstractC23442F<HM4<HardCountScanResponse>> m33149Q = mo21450m.m33149Q(new InterfaceC23492o() { // from class: gH1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    HM4 m34251d;
                    m34251d = C42622iH1.C23180a.m34251d(C42622iH1.this, (Throwable) obj);
                    return m34251d;
                }
            });
            final C23181a c23181a = new C23181a(component1);
            return m33149Q.m33157I(new InterfaceC23492o() { // from class: hH1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair m34250e;
                    m34250e = C42622iH1.C23180a.m34250e(Function1.this, obj);
                    return m34250e;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001ar\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0006*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00000\u0000 \u0006*8\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0006*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00000\u0000\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "LHM4;", "Lco/bird/api/response/HardCountScanResponse;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iH1$b */
    /* loaded from: classes4.dex */
    public static final class C23182b extends Lambda implements Function1<Pair<? extends String, ? extends HM4<HardCountScanResponse>>, InterfaceC23447K<? extends Pair<? extends String, ? extends HM4<HardCountScanResponse>>>> {

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a.\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lkotlin/Pair;", "", "LHM4;", "Lco/bird/api/response/HardCountScanResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: iH1$b$a */
        /* loaded from: classes4.dex */
        public static final class C23183a extends Lambda implements Function1<DialogResponse, Pair<? extends String, ? extends HM4<HardCountScanResponse>>> {

            /* renamed from: g */
            public final /* synthetic */ String f87063g;

            /* renamed from: h */
            public final /* synthetic */ HM4<HardCountScanResponse> f87064h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23183a(String str, HM4<HardCountScanResponse> hm4) {
                super(1);
                this.f87063g = str;
                this.f87064h = hm4;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<String, HM4<HardCountScanResponse>> invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(this.f87063g, this.f87064h);
            }
        }

        public C23182b() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<String, HM4<HardCountScanResponse>>> invoke(Pair<String, HM4<HardCountScanResponse>> pair) {
            String str;
            InventoryScanningError errorCode;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            String component1 = pair.component1();
            HM4<HardCountScanResponse> hardCountResponse = pair.component2();
            C42622iH1 c42622iH1 = C42622iH1.this;
            XF1 xf1 = c42622iH1.f87057k;
            Intrinsics.checkNotNullExpressionValue(hardCountResponse, "hardCountResponse");
            c42622iH1.m34255t0(xf1.mo21463e(component1, hardCountResponse));
            N92 n92 = C42622iH1.this.f87058l;
            HardCountScanResponse m103944a = hardCountResponse.m103944a();
            if (m103944a != null && (errorCode = m103944a.getErrorCode()) != null) {
                str = errorCode.name();
            } else {
                str = null;
            }
            AbstractC23442F<DialogResponse> m94307Rl = n92.m94307Rl(component1, str);
            final C23183a c23183a = new C23183a(component1, hardCountResponse);
            return m94307Rl.m33157I(new InterfaceC23492o() { // from class: jH1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C42622iH1.C23182b.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "LHM4;", "Lco/bird/api/response/HardCountScanResponse;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iH1$c */
    /* loaded from: classes4.dex */
    public static final class C23184c extends Lambda implements Function1<Pair<? extends String, ? extends HM4<HardCountScanResponse>>, Unit> {
        public C23184c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends String, ? extends HM4<HardCountScanResponse>> pair) {
            invoke2((Pair<String, HM4<HardCountScanResponse>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<String, HM4<HardCountScanResponse>> pair) {
            HM4<HardCountScanResponse> hardCountResponse = pair.component2();
            C42622iH1 c42622iH1 = C42622iH1.this;
            Intrinsics.checkNotNullExpressionValue(hardCountResponse, "hardCountResponse");
            c42622iH1.m34260o0(pair.component1(), hardCountResponse);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42622iH1(XF1 hardCountManager, N92 inventoryScanningUiDelegate, InterfaceC46473om3 operatorManager, InterfaceC7381SM birdPartManager, NQ5 stickerManager, InterfaceC35443Qj5 scanCodeUi, C36207Tq4 reactiveConfig, ScopeProvider scopeProvider, InterfaceC40099e13 navigator) {
        super(operatorManager, birdPartManager, stickerManager, reactiveConfig, scopeProvider, scanCodeUi, navigator);
        Intrinsics.checkNotNullParameter(hardCountManager, "hardCountManager");
        Intrinsics.checkNotNullParameter(inventoryScanningUiDelegate, "inventoryScanningUiDelegate");
        Intrinsics.checkNotNullParameter(operatorManager, "operatorManager");
        Intrinsics.checkNotNullParameter(birdPartManager, "birdPartManager");
        Intrinsics.checkNotNullParameter(stickerManager, "stickerManager");
        Intrinsics.checkNotNullParameter(scanCodeUi, "scanCodeUi");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f87057k = hardCountManager;
        this.f87058l = inventoryScanningUiDelegate;
    }

    /* renamed from: q0 */
    public static final InterfaceC23447K m34258q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: r0 */
    public static final InterfaceC23447K m34257r0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: s0 */
    public static final void m34256s0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.C34039Kj5, p000.InterfaceC45852nj5
    /* renamed from: c */
    public void mo23252c(boolean z, boolean z2, String str) {
        m98403R();
        m98411J().mo84836d1(null);
        this.f87059m = str;
        if (z2) {
            m98411J().mo84833ud();
        }
        boolean z3 = true;
        m98411J().mo84839R3(true);
        m98411J().mo84834tf((z && m98414G().m82623f8().getValue().getOperatorConfig().getEnablePeripheralKeyboardSupport()) ? false : false);
        Observable<Pair<String, EnumC48419s32>> scanObservable = m98413H();
        Intrinsics.checkNotNullExpressionValue(scanObservable, "scanObservable");
        m34259p0(scanObservable);
    }

    /* renamed from: n0 */
    public final String m34261n0() {
        return this.f87059m;
    }

    /* renamed from: o0 */
    public final void m34260o0(String str, HM4<HardCountScanResponse> hm4) {
        InventoryScanningError inventoryScanningError;
        Intent intent = new Intent();
        HardCountScanResponse m103944a = hm4.m103944a();
        if (m103944a != null) {
            inventoryScanningError = m103944a.getErrorCode();
        } else {
            inventoryScanningError = null;
        }
        if (this.f87057k.mo21452k(hm4)) {
            m98411J().vibrate(250L);
            intent.putExtra("vehicle_serial", str);
            m98420A().mo37190C1(-1, intent);
        } else if (InventoryScanningErrorKt.isValidSerialNotInDB(inventoryScanningError)) {
            intent.putExtra("vehicle_serial", str);
            m98420A().mo37190C1(-1, intent);
        } else if (hm4.m103943b() == 404) {
            m98411J().vibrate(250L);
            intent.putExtra("raw_scan_result", str);
            m98420A().mo37190C1(-1, intent);
        } else {
            m98411J().onResume();
            m98411J().mo84842O3(true);
        }
    }

    /* renamed from: p0 */
    public final void m34259p0(Observable<Pair<String, EnumC48419s32>> observable) {
        AbstractC24490k<Pair<String, EnumC48419s32>> flowable = observable.toFlowable(EnumC23460b.DROP);
        final C23180a c23180a = new C23180a();
        AbstractC24490k<R> m32149f0 = flowable.m32149f0(new InterfaceC23492o() { // from class: dH1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m34258q0;
                m34258q0 = C42622iH1.m34258q0(Function1.this, obj);
                return m34258q0;
            }
        });
        final C23182b c23182b = new C23182b();
        AbstractC24490k m32111s0 = m32149f0.m32149f0(new InterfaceC23492o() { // from class: eH1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m34257r0;
                m34257r0 = C42622iH1.m34257r0(Function1.this, obj);
                return m34257r0;
            }
        }).m32111s0(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m32111s0, "private fun scanForHardC…ountResponse)\n      }\n  }");
        Object m32150f = m32111s0.m32150f(AutoDispose.m45239a(m98412I()));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C23184c c23184c = new C23184c();
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: fH1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C42622iH1.m34256s0(Function1.this, obj);
            }
        });
    }

    /* renamed from: t0 */
    public final void m34255t0(String str) {
        this.f87059m = str;
    }
}
