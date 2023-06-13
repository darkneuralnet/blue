package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.HardCountStatus;
import co.bird.android.model.constant.InventoryScanningError;
import co.bird.android.model.constant.InventoryScanningIdentifierCategory;
import co.bird.android.model.constant.ScannerMode;
import co.bird.android.model.persistence.HardCountScan;
import co.bird.api.error.RetrofitException;
import co.bird.api.request.HardCountCreateRequest;
import co.bird.api.response.HardCountScanResponse;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.FlowableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23486i;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.subjects.C24552a;
import io.reactivex.subjects.C24558d;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC40099e13;
import p000.XF1;
import p000.ZG1;
import retrofit2.HttpException;
@Metadata(m28433d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010'\u001a\u00020%\u0012\u0006\u0010+\u001a\u00020(¢\u0006\u0004\bI\u0010JJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R.\u00102\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020. /*\n\u0012\u0004\u0012\u00020.\u0018\u00010-0-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u00104\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010\u000e0\u000e0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00101R\"\u00108\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010\u00060\u0006058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R.\u0010:\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e /*\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010-0-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00101R.\u0010<\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e /*\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010-0-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00101R\"\u0010>\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010\u00150\u00150,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00101R\"\u0010@\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010\u000e0\u000e058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00107R.\u0010C\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020. /*\n\u0012\u0004\u0012\u00020.\u0018\u00010A0A0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00101R\u0018\u0010F\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\"\u0010H\u001a\u0010\u0012\f\u0012\n /*\u0004\u0018\u00010\u00150\u00150,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u00101¨\u0006K"}, m28432d2 = {"LZG1;", "LrG1;", "", "K", "P", "Lio/reactivex/Observable;", "Lco/bird/api/request/HardCountCreateRequest;", "s0", "", "e", "S", "l0", "", "expectedScans", "", "hardCountSessionId", C17296a.f69688o, "onPause", "onResume", "identifier", "b", "", "connected", "c", "LXF1;", "LXF1;", "hardCountManager", "LoH1;", "LoH1;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "LeF1;", "LeF1;", "converter", "LN92;", "f", "LN92;", "inventoryScanningUiDelegate", "Lio/reactivex/subjects/a;", "", "Lco/bird/android/model/persistence/HardCountScan;", "kotlin.jvm.PlatformType", "g", "Lio/reactivex/subjects/a;", "completedBirdsSubject", "h", "hardCountIdSubject", "Lio/reactivex/subjects/d;", "i", "Lio/reactivex/subjects/d;", "hardCountRequestSubject", "j", "failedScanIdentifierSubject", "k", "pendingScanIdentifierSubject", "l", "networkConnectionSubject", "m", "scanSubject", "Lco/bird/android/buava/Optional;", "n", "lastSuccessScanBirdSubject", "o", "Ljava/lang/String;", "previousScanIdentifier", "p", "retryPendingScansSubject", "<init>", "(LXF1;LoH1;Lcom/uber/autodispose/ScopeProvider;Le13;LeF1;LN92;)V", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHardCountPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountPresenter.kt\nco/bird/android/feature/hardcount/HardCountPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nco/bird/android/library/rx/Observables\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,283:1\n180#2:284\n180#2:285\n180#2:288\n180#2:291\n237#2:292\n180#2:293\n180#2:294\n180#2:295\n180#2:296\n180#2:297\n161#2:298\n180#2:299\n180#2:300\n180#2:301\n180#2:302\n180#2:303\n71#3,2:286\n52#3,2:289\n9#4,4:304\n1#5:308\n*S KotlinDebug\n*F\n+ 1 HardCountPresenter.kt\nco/bird/android/feature/hardcount/HardCountPresenterImpl\n*L\n74#1:284\n98#1:285\n108#1:288\n114#1:291\n141#1:292\n146#1:293\n151#1:294\n155#1:295\n159#1:296\n182#1:297\n186#1:298\n192#1:299\n199#1:300\n204#1:301\n224#1:302\n240#1:303\n103#1:286,2\n112#1:289,2\n279#1:304,4\n*E\n"})
/* renamed from: ZG1 */
/* loaded from: classes3.dex */
public final class ZG1 implements InterfaceC47950rG1 {

    /* renamed from: a */
    public final XF1 f48092a;

    /* renamed from: b */
    public final InterfaceC46180oH1 f48093b;

    /* renamed from: c */
    public final ScopeProvider f48094c;

    /* renamed from: d */
    public final InterfaceC40099e13 f48095d;

    /* renamed from: e */
    public final InterfaceC40232eF1 f48096e;

    /* renamed from: f */
    public final N92 f48097f;

    /* renamed from: g */
    public final C24552a<Set<HardCountScan>> f48098g;

    /* renamed from: h */
    public final C24552a<String> f48099h;

    /* renamed from: i */
    public final C24558d<HardCountCreateRequest> f48100i;

    /* renamed from: j */
    public final C24552a<Set<String>> f48101j;

    /* renamed from: k */
    public final C24552a<Set<String>> f48102k;

    /* renamed from: l */
    public final C24552a<Boolean> f48103l;

    /* renamed from: m */
    public final C24558d<String> f48104m;

    /* renamed from: n */
    public final C24552a<Optional<HardCountScan>> f48105n;

    /* renamed from: o */
    public String f48106o;

    /* renamed from: p */
    public final C24552a<Boolean> f48107p;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "successfulScans", "", "Lco/bird/android/model/persistence/HardCountScan;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZG1$A */
    /* loaded from: classes3.dex */
    public static final class C10182A extends Lambda implements Function1<List<? extends HardCountScan>, Unit> {
        public C10182A() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends HardCountScan> list) {
            invoke2((List<HardCountScan>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<HardCountScan> successfulScans) {
            Set mutableSet;
            C24552a c24552a = ZG1.this.f48098g;
            Intrinsics.checkNotNullExpressionValue(successfulScans, "successfulScans");
            mutableSet = CollectionsKt___CollectionsKt.toMutableSet(successfulScans);
            c24552a.onNext(mutableSet);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/HardCountScan;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/HardCountScan;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZG1$B */
    /* loaded from: classes3.dex */
    public static final class C10183B extends Lambda implements Function1<HardCountScan, Unit> {
        public C10183B() {
            super(1);
        }

        /* renamed from: a */
        public final void m73400a(HardCountScan hardCountScan) {
            ZG1.this.f48105n.onNext(Optional.f63040c.m59033b(hardCountScan));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HardCountScan hardCountScan) {
            m73400a(hardCountScan);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZG1$C */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10184C extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        public C10184C(Object obj) {
            super(1, obj, InterfaceC46180oH1.class, "showLapScanCount", "showLapScanCount(I)V", 0);
        }

        /* renamed from: a */
        public final void m73399a(int i) {
            ((InterfaceC46180oH1) this.receiver).mo19585S2(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            m73399a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZG1$D */
    /* loaded from: classes3.dex */
    public static final class C10185D extends Lambda implements Function1<Unit, InterfaceC23447K<? extends DialogResponse>> {
        public C10185D() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends DialogResponse> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return ZG1.this.f48093b.mo19579f9();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZG1$E */
    /* loaded from: classes3.dex */
    public static final class C10186E extends Lambda implements Function1<DialogResponse, Unit> {
        public C10186E() {
            super(1);
        }

        /* renamed from: a */
        public final void m73398a(DialogResponse dialogResponse) {
            if (dialogResponse == DialogResponse.OK) {
                ZG1.this.f48092a.mo21455i();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m73398a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "hardCountId", "Lio/reactivex/K;", "", "Lco/bird/api/request/HardCountCreateRequest;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZG1$F */
    /* loaded from: classes3.dex */
    public static final class C10187F extends Lambda implements Function1<String, InterfaceC23447K<? extends List<? extends HardCountCreateRequest>>> {
        public C10187F() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends List<HardCountCreateRequest>> invoke(String hardCountId) {
            Intrinsics.checkNotNullParameter(hardCountId, "hardCountId");
            return ZG1.this.f48092a.mo21461f(InventoryScanningIdentifierCategory.PENDING, hardCountId);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/api/request/HardCountCreateRequest;", "cachedRequests", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZG1$G */
    /* loaded from: classes3.dex */
    public static final class C10188G extends Lambda implements Function1<List<? extends HardCountCreateRequest>, InterfaceC23434B<? extends HardCountCreateRequest>> {

        /* renamed from: g */
        public static final C10188G f48113g = new C10188G();

        public C10188G() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends HardCountCreateRequest> invoke(List<HardCountCreateRequest> cachedRequests) {
            Intrinsics.checkNotNullParameter(cachedRequests, "cachedRequests");
            return Observable.fromIterable(cachedRequests);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZG1$H */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10189H extends FunctionReferenceImpl implements Function1<HardCountCreateRequest, Unit> {
        public C10189H(Object obj) {
            super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m73396a(HardCountCreateRequest p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24558d) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HardCountCreateRequest hardCountCreateRequest) {
            m73396a(hardCountCreateRequest);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "hardCountId", "Lio/reactivex/B;", "", "Lco/bird/api/request/HardCountCreateRequest;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZG1$a */
    /* loaded from: classes3.dex */
    public static final class C10190a extends Lambda implements Function1<String, InterfaceC23434B<? extends List<? extends HardCountCreateRequest>>> {
        public C10190a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends List<HardCountCreateRequest>> invoke(String hardCountId) {
            Intrinsics.checkNotNullParameter(hardCountId, "hardCountId");
            return ZG1.this.f48092a.mo21459g(InventoryScanningIdentifierCategory.PENDING, hardCountId);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/api/request/HardCountCreateRequest;", "vehicles", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHardCountPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountPresenter.kt\nco/bird/android/feature/hardcount/HardCountPresenterImpl$loadPendingScans$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,283:1\n1549#2:284\n1620#2,3:285\n37#3,2:288\n*S KotlinDebug\n*F\n+ 1 HardCountPresenter.kt\nco/bird/android/feature/hardcount/HardCountPresenterImpl$loadPendingScans$2\n*L\n221#1:284\n221#1:285,3\n221#1:288,2\n*E\n"})
    /* renamed from: ZG1$b */
    /* loaded from: classes3.dex */
    public static final class C10191b extends Lambda implements Function1<List<? extends HardCountCreateRequest>, InterfaceC23434B<? extends HardCountCreateRequest>> {
        public C10191b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23434B<? extends HardCountCreateRequest> invoke(List<HardCountCreateRequest> vehicles) {
            int collectionSizeOrDefault;
            Set of;
            Intrinsics.checkNotNullParameter(vehicles, "vehicles");
            C24552a c24552a = ZG1.this.f48102k;
            List<HardCountCreateRequest> list = vehicles;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (HardCountCreateRequest hardCountCreateRequest : list) {
                arrayList.add(hardCountCreateRequest.getScanIdentifier());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            of = SetsKt__SetsKt.setOf(Arrays.copyOf(strArr, strArr.length));
            c24552a.onNext(of);
            return Observable.fromIterable(list);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZG1$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10192c extends FunctionReferenceImpl implements Function1<HardCountCreateRequest, Unit> {
        public C10192c(Object obj) {
            super(1, obj, C24558d.class, "onNext", "onNext(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m73393a(HardCountCreateRequest p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C24558d) this.receiver).onNext(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HardCountCreateRequest hardCountCreateRequest) {
            m73393a(hardCountCreateRequest);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZG1$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10193d extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C10193d f48116b = new C10193d();

        public C10193d() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "hardCountId", "Lio/reactivex/B;", "", "Lco/bird/api/request/HardCountCreateRequest;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZG1$e */
    /* loaded from: classes3.dex */
    public static final class C10194e extends Lambda implements Function1<String, InterfaceC23434B<? extends List<? extends HardCountCreateRequest>>> {
        public C10194e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23434B<? extends List<HardCountCreateRequest>> invoke(String hardCountId) {
            Intrinsics.checkNotNullParameter(hardCountId, "hardCountId");
            return ZG1.this.f48092a.mo21459g(InventoryScanningIdentifierCategory.UNIDENTIFIABLE, hardCountId);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "vehicles", "", "Lco/bird/api/request/HardCountCreateRequest;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nHardCountPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountPresenter.kt\nco/bird/android/feature/hardcount/HardCountPresenterImpl$loadUnidentifiableVehicles$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,283:1\n1549#2:284\n1620#2,3:285\n37#3,2:288\n*S KotlinDebug\n*F\n+ 1 HardCountPresenter.kt\nco/bird/android/feature/hardcount/HardCountPresenterImpl$loadUnidentifiableVehicles$2\n*L\n242#1:284\n242#1:285,3\n242#1:288,2\n*E\n"})
    /* renamed from: ZG1$f */
    /* loaded from: classes3.dex */
    public static final class C10195f extends Lambda implements Function1<List<? extends HardCountCreateRequest>, Unit> {
        public C10195f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends HardCountCreateRequest> list) {
            invoke2((List<HardCountCreateRequest>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<HardCountCreateRequest> vehicles) {
            int collectionSizeOrDefault;
            Set of;
            C24552a c24552a = ZG1.this.f48101j;
            Intrinsics.checkNotNullExpressionValue(vehicles, "vehicles");
            List<HardCountCreateRequest> list = vehicles;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (HardCountCreateRequest hardCountCreateRequest : list) {
                arrayList.add(hardCountCreateRequest.getScanIdentifier());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            of = SetsKt__SetsKt.setOf(Arrays.copyOf(strArr, strArr.length));
            c24552a.onNext(of);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00022\u0006\u0010\u0007\u001a\u00028\u0003H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"T1", "T2", "T3", "T4", "t1", "t2", "t3", "t4", "Lwb4;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lwb4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$3\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: ZG1$g */
    /* loaded from: classes3.dex */
    public static final class C10196g<T1, T2, T3, T4, R> implements InterfaceC23486i {

        /* renamed from: a */
        public static final C10196g<T1, T2, T3, T4, R> f48119a = new C10196g<>();

        @Override // io.reactivex.functions.InterfaceC23486i
        /* renamed from: a */
        public final C51106wb4<T1, T2, T3, T4> apply(T1 t1, T2 t2, T3 t3, T4 t4) {
            return new C51106wb4<>(t1, t2, t3, t4);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: ZG1$h */
    /* loaded from: classes3.dex */
    public static final class C10197h<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C10197h<T1, T2, R> f48120a = new C10197h<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZG1$i */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10198i extends FunctionReferenceImpl implements Function1<List<? extends C3023H6>, Unit> {
        public C10198i(Object obj) {
            super(1, obj, InterfaceC46180oH1.class, "populateAdapter", "populateAdapter(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC46180oH1) this.receiver).mo19580b(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0007 \u0006*$\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/HardCountStatus;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZG1$j */
    /* loaded from: classes3.dex */
    public static final class C10199j extends Lambda implements Function1<Pair<? extends Set<? extends String>, ? extends HardCountStatus>, Unit> {
        public C10199j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Set<? extends String>, ? extends HardCountStatus> pair) {
            invoke2((Pair<? extends Set<String>, HardCountStatus>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends Set<String>, HardCountStatus> pair) {
            HardCountStatus component2 = pair.component2();
            ZG1.this.f48093b.mo19581a4(pair.component1().size() + component2.getUserSuccessScans(), component2.getUserSuccessScans());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZG1$l */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10201l extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C10201l(Object obj) {
            super(1, obj, ZG1.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ZG1) this.receiver).m73425l0(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZG1$m */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10202m extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C10202m(Object obj) {
            super(1, obj, ZG1.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ZG1) this.receiver).m73425l0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZG1$n */
    /* loaded from: classes3.dex */
    public static final class C10203n extends Lambda implements Function1<Unit, Unit> {
        public C10203n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToScanCode$default(ZG1.this.f48095d, ScannerMode.HARD_COUNT, null, null, null, false, true, false, null, 222, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZG1$o */
    /* loaded from: classes3.dex */
    public static final class C10204o extends Lambda implements Function1<Unit, Unit> {
        public C10204o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToScanCode$default(ZG1.this.f48095d, ScannerMode.HARD_COUNT, null, null, null, false, true, true, null, 158, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/HardCountScan;", "kotlin.jvm.PlatformType", "birds", "", C17296a.f69688o, "(Ljava/util/Collection;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZG1$p */
    /* loaded from: classes3.dex */
    public static final class C10205p extends Lambda implements Function1<Collection<? extends HardCountScan>, Unit> {
        public C10205p() {
            super(1);
        }

        /* renamed from: a */
        public final void m73389a(Collection<HardCountScan> birds) {
            List list;
            InterfaceC40099e13 interfaceC40099e13 = ZG1.this.f48095d;
            Intrinsics.checkNotNullExpressionValue(birds, "birds");
            list = CollectionsKt___CollectionsKt.toList(birds);
            InterfaceC40099e13.C19924a.goToHardCountDetails$default(interfaceC40099e13, list, null, null, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Collection<? extends HardCountScan> collection) {
            m73389a(collection);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006 \u0007*\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZG1$q */
    /* loaded from: classes3.dex */
    public static final class C10206q extends Lambda implements Function1<Pair<? extends Collection<? extends String>, ? extends InventoryScanningIdentifierCategory>, Unit> {
        public C10206q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Collection<? extends String>, ? extends InventoryScanningIdentifierCategory> pair) {
            invoke2((Pair<? extends Collection<String>, ? extends InventoryScanningIdentifierCategory>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends Collection<String>, ? extends InventoryScanningIdentifierCategory> pair) {
            List<String> list;
            InterfaceC40099e13 interfaceC40099e13 = ZG1.this.f48095d;
            list = CollectionsKt___CollectionsKt.toList(pair.component1());
            interfaceC40099e13.mo37128M3(null, list, pair.component2());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "connected", "Lio/reactivex/B;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZG1$r */
    /* loaded from: classes3.dex */
    public static final class C10207r extends Lambda implements Function1<Boolean, InterfaceC23434B<? extends Boolean>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/request/HardCountCreateRequest;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/request/HardCountCreateRequest;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ZG1$r$a */
        /* loaded from: classes3.dex */
        public static final class C10208a extends Lambda implements Function1<HardCountCreateRequest, Boolean> {

            /* renamed from: g */
            public final /* synthetic */ Boolean f48128g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10208a(Boolean bool) {
                super(1);
                this.f48128g = bool;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(HardCountCreateRequest it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return this.f48128g;
            }
        }

        public C10207r() {
            super(1);
        }

        /* renamed from: b */
        public static final Boolean m73387b(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Boolean) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Boolean> invoke(Boolean connected) {
            Intrinsics.checkNotNullParameter(connected, "connected");
            Observable m73411s0 = ZG1.this.m73411s0();
            final C10208a c10208a = new C10208a(connected);
            return m73411s0.map(new InterfaceC23492o() { // from class: aH1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Boolean m73387b;
                    m73387b = ZG1.C10207r.m73387b(Function1.this, obj);
                    return m73387b;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "connected", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZG1$s */
    /* loaded from: classes3.dex */
    public static final class C10209s extends Lambda implements Function1<Boolean, Unit> {
        public C10209s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            ZG1.this.f48093b.mo19587Lk(!bool.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001ar\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0016\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003 \u0006*8\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0016\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/api/request/HardCountCreateRequest;", "hardCountRequest", "Lio/reactivex/K;", "Lkotlin/Pair;", "LHM4;", "Lco/bird/api/response/HardCountScanResponse;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/api/request/HardCountCreateRequest;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZG1$t */
    /* loaded from: classes3.dex */
    public static final class C10210t extends Lambda implements Function1<HardCountCreateRequest, InterfaceC23447K<? extends Pair<? extends HardCountCreateRequest, ? extends HM4<HardCountScanResponse>>>> {

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001ar\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000 \u0006*\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00040\u0004 \u0006*8\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000 \u0006*\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/HardCountScanResponse;", "response", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/api/request/HardCountCreateRequest;", "kotlin.jvm.PlatformType", "b", "(LHM4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: ZG1$t$a */
        /* loaded from: classes3.dex */
        public static final class C10211a extends Lambda implements Function1<HM4<HardCountScanResponse>, InterfaceC23447K<? extends Pair<? extends HardCountCreateRequest, ? extends HM4<HardCountScanResponse>>>> {

            /* renamed from: g */
            public final /* synthetic */ ZG1 f48131g;

            /* renamed from: h */
            public final /* synthetic */ HardCountCreateRequest f48132h;

            @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a.\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004 \u0006*\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lkotlin/Pair;", "Lco/bird/api/request/HardCountCreateRequest;", "LHM4;", "Lco/bird/api/response/HardCountScanResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: ZG1$t$a$a */
            /* loaded from: classes3.dex */
            public static final class C10212a extends Lambda implements Function1<DialogResponse, Pair<? extends HardCountCreateRequest, ? extends HM4<HardCountScanResponse>>> {

                /* renamed from: g */
                public final /* synthetic */ HardCountCreateRequest f48133g;

                /* renamed from: h */
                public final /* synthetic */ HM4<HardCountScanResponse> f48134h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10212a(HardCountCreateRequest hardCountCreateRequest, HM4<HardCountScanResponse> hm4) {
                    super(1);
                    this.f48133g = hardCountCreateRequest;
                    this.f48134h = hm4;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final Pair<HardCountCreateRequest, HM4<HardCountScanResponse>> invoke(DialogResponse it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return TuplesKt.m28425to(this.f48133g, this.f48134h);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10211a(ZG1 zg1, HardCountCreateRequest hardCountCreateRequest) {
                super(1);
                this.f48131g = zg1;
                this.f48132h = hardCountCreateRequest;
            }

            public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (Pair) tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final InterfaceC23447K<? extends Pair<HardCountCreateRequest, HM4<HardCountScanResponse>>> invoke(HM4<HardCountScanResponse> response) {
                String str;
                InventoryScanningError errorCode;
                Intrinsics.checkNotNullParameter(response, "response");
                N92 n92 = this.f48131g.f48097f;
                String scanIdentifier = this.f48132h.getScanIdentifier();
                HardCountScanResponse m103944a = response.m103944a();
                if (m103944a != null && (errorCode = m103944a.getErrorCode()) != null) {
                    str = errorCode.name();
                } else {
                    str = null;
                }
                AbstractC23442F<DialogResponse> m33152N = n92.m94307Rl(scanIdentifier, str).m33152N(C23454a.m33087a());
                final C10212a c10212a = new C10212a(this.f48132h, response);
                return m33152N.m33157I(new InterfaceC23492o() { // from class: cH1
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair invoke$lambda$0;
                        invoke$lambda$0 = ZG1.C10210t.C10211a.invoke$lambda$0(Function1.this, obj);
                        return invoke$lambda$0;
                    }
                });
            }
        }

        public C10210t() {
            super(1);
        }

        public static final InterfaceC23447K invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23447K) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<HardCountCreateRequest, HM4<HardCountScanResponse>>> invoke(HardCountCreateRequest hardCountRequest) {
            Intrinsics.checkNotNullParameter(hardCountRequest, "hardCountRequest");
            AbstractC23442F m33152N = XF1.C9394a.hardCountScanBird$default(ZG1.this.f48092a, hardCountRequest.getHardCountId(), hardCountRequest.getScanIdentifier(), false, hardCountRequest.getPrevScanIdentifier(), 4, null).m33152N(C23454a.m33087a());
            final C10211a c10211a = new C10211a(ZG1.this, hardCountRequest);
            return m33152N.m33165A(new InterfaceC23492o() { // from class: bH1
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K invoke$lambda$0;
                    invoke$lambda$0 = ZG1.C10210t.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/api/request/HardCountCreateRequest;", "LHM4;", "Lco/bird/api/response/HardCountScanResponse;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZG1$u */
    /* loaded from: classes3.dex */
    public static final class C10213u extends Lambda implements Function1<Pair<? extends HardCountCreateRequest, ? extends HM4<HardCountScanResponse>>, Unit> {
        public C10213u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends HardCountCreateRequest, ? extends HM4<HardCountScanResponse>> pair) {
            invoke2((Pair<HardCountCreateRequest, HM4<HardCountScanResponse>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<HardCountCreateRequest, HM4<HardCountScanResponse>> pair) {
            HM4<HardCountScanResponse> response = pair.component2();
            ZG1 zg1 = ZG1.this;
            XF1 xf1 = zg1.f48092a;
            String scanIdentifier = pair.component1().getScanIdentifier();
            Intrinsics.checkNotNullExpressionValue(response, "response");
            zg1.f48106o = xf1.mo21463e(scanIdentifier, response);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZG1$v */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10214v extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C10214v(Object obj) {
            super(1, obj, ZG1.class, "maybeRestartNetworkRequest", "maybeRestartNetworkRequest(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ZG1) this.receiver).m73453S(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/api/request/HardCountCreateRequest;", "LHM4;", "Lco/bird/api/response/HardCountScanResponse;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZG1$w */
    /* loaded from: classes3.dex */
    public static final class C10215w extends Lambda implements Function1<Pair<? extends HardCountCreateRequest, ? extends HM4<HardCountScanResponse>>, Unit> {
        public C10215w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends HardCountCreateRequest, ? extends HM4<HardCountScanResponse>> pair) {
            invoke2((Pair<HardCountCreateRequest, HM4<HardCountScanResponse>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<HardCountCreateRequest, HM4<HardCountScanResponse>> pair) {
            ZG1.this.f48093b.mo19576v5();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZG1$x */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10216x extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C10216x(Object obj) {
            super(1, obj, ZG1.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ZG1) this.receiver).m73425l0(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\t \u0003*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\b \u0003* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\t \u0003*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\b\u0018\u00010\u00070\u00072n\u0010\u0006\u001aj\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0003*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0003*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00050\u00050\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lwb4;", "", "Lco/bird/android/model/persistence/HardCountScan;", "kotlin.jvm.PlatformType", "", "Lco/bird/android/buava/Optional;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "", "LH6;", C17296a.f69688o, "(Lwb4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZG1$y */
    /* loaded from: classes3.dex */
    public static final class C10217y extends Lambda implements Function1<C51106wb4<? extends Set<? extends HardCountScan>, ? extends Set<? extends String>, ? extends Set<? extends String>, ? extends Optional<HardCountScan>>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C10217y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(C51106wb4<? extends Set<HardCountScan>, ? extends Set<String>, ? extends Set<String>, Optional<HardCountScan>> c51106wb4) {
            Intrinsics.checkNotNullParameter(c51106wb4, "<name for destructuring parameter 0>");
            Set<HardCountScan> completedBirds = c51106wb4.m6614a();
            Set<String> failedScanIdentifiers = c51106wb4.m6613b();
            Set<String> pendingScanIdentifiers = c51106wb4.m6612c();
            InterfaceC40232eF1 interfaceC40232eF1 = ZG1.this.f48096e;
            Intrinsics.checkNotNullExpressionValue(completedBirds, "completedBirds");
            Intrinsics.checkNotNullExpressionValue(failedScanIdentifiers, "failedScanIdentifiers");
            Intrinsics.checkNotNullExpressionValue(pendingScanIdentifiers, "pendingScanIdentifiers");
            return interfaceC40232eF1.mo39797a(completedBirds, failedScanIdentifiers, pendingScanIdentifiers, c51106wb4.m6611d().m59035e());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: ZG1$z */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C10218z extends FunctionReferenceImpl implements Function1<HardCountStatus, Unit> {
        public C10218z(Object obj) {
            super(1, obj, InterfaceC46180oH1.class, "showHardCountStatus", "showHardCountStatus(Lco/bird/android/model/HardCountStatus;)V", 0);
        }

        /* renamed from: a */
        public final void m73379a(HardCountStatus p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC46180oH1) this.receiver).mo19583Za(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HardCountStatus hardCountStatus) {
            m73379a(hardCountStatus);
            return Unit.INSTANCE;
        }
    }

    public ZG1(XF1 hardCountManager, InterfaceC46180oH1 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, InterfaceC40232eF1 converter, N92 inventoryScanningUiDelegate) {
        Set emptySet;
        Set emptySet2;
        Set emptySet3;
        Intrinsics.checkNotNullParameter(hardCountManager, "hardCountManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(inventoryScanningUiDelegate, "inventoryScanningUiDelegate");
        this.f48092a = hardCountManager;
        this.f48093b = ui;
        this.f48094c = scopeProvider;
        this.f48095d = navigator;
        this.f48096e = converter;
        this.f48097f = inventoryScanningUiDelegate;
        emptySet = SetsKt__SetsKt.emptySet();
        C24552a<Set<HardCountScan>> m31921g = C24552a.m31921g(emptySet);
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault<Set<HardCountScan>>(emptySet())");
        this.f48098g = m31921g;
        C24552a<String> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<String>()");
        this.f48099h = m31922e;
        C24558d<HardCountCreateRequest> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<HardCountCreateRequest>()");
        this.f48100i = m31902e;
        emptySet2 = SetsKt__SetsKt.emptySet();
        C24552a<Set<String>> m31921g2 = C24552a.m31921g(emptySet2);
        Intrinsics.checkNotNullExpressionValue(m31921g2, "createDefault<Set<String>>(emptySet())");
        this.f48101j = m31921g2;
        emptySet3 = SetsKt__SetsKt.emptySet();
        C24552a<Set<String>> m31921g3 = C24552a.m31921g(emptySet3);
        Intrinsics.checkNotNullExpressionValue(m31921g3, "createDefault<Set<String>>(emptySet())");
        this.f48102k = m31921g3;
        C24552a<Boolean> m31921g4 = C24552a.m31921g(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(m31921g4, "createDefault(true)");
        this.f48103l = m31921g4;
        C24558d<String> m31902e2 = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e2, "create<String>()");
        this.f48104m = m31902e2;
        C24552a<Optional<HardCountScan>> m31921g5 = C24552a.m31921g(Optional.f63040c.m59034a());
        Intrinsics.checkNotNullExpressionValue(m31921g5, "createDefault<Optional<H…Scan>>(Optional.absent())");
        this.f48105n = m31921g5;
        C24552a<Boolean> m31921g6 = C24552a.m31921g(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(m31921g6, "createDefault(false)");
        this.f48107p = m31921g6;
    }

    /* renamed from: L */
    public static final InterfaceC23434B m73460L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final InterfaceC23434B m73459M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m73458N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m73457O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final InterfaceC23434B m73455Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final void m73454R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final InterfaceC23434B m73452T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final void m73451U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final InterfaceC23496h m73450V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m73449W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m73448X() {
    }

    /* renamed from: Y */
    public static final void m73447Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m73446Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m73445a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final void m73444b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final void m73443c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final void m73441d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final InterfaceC23447K m73439e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final void m73437f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final void m73435g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final void m73433h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final void m73431i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final InterfaceC23447K m73429j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final void m73427k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final void m73423m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final void m73421n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final void m73419o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p0 */
    public static final void m73417p0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q0 */
    public static final InterfaceC23447K m73415q0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: r0 */
    public static final void m73413r0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static final InterfaceC23447K m73409t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: u0 */
    public static final InterfaceC23434B m73407u0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: v0 */
    public static final void m73405v0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public final void m73461K() {
        C24552a<String> c24552a = this.f48099h;
        final C10190a c10190a = new C10190a();
        Observable<R> switchMap = c24552a.switchMap(new InterfaceC23492o() { // from class: LG1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m73460L;
                m73460L = ZG1.m73460L(Function1.this, obj);
                return m73460L;
            }
        });
        final C10191b c10191b = new C10191b();
        Observable flatMap = switchMap.flatMap(new InterfaceC23492o() { // from class: MG1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m73459M;
                m73459M = ZG1.m73459M(Function1.this, obj);
                return m73459M;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap, "private fun loadPendingS…t::onNext, Timber::e)\n  }");
        Object m33094as = flatMap.m33094as(AutoDispose.m45239a(this.f48094c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10192c c10192c = new C10192c(this.f48100i);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: NG1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZG1.m73458N(Function1.this, obj);
            }
        };
        final C10193d c10193d = C10193d.f48116b;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: PG1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZG1.m73457O(Function1.this, obj);
            }
        });
    }

    /* renamed from: P */
    public final void m73456P() {
        C24552a<String> c24552a = this.f48099h;
        final C10194e c10194e = new C10194e();
        Observable<R> switchMap = c24552a.switchMap(new InterfaceC23492o() { // from class: QG1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m73455Q;
                m73455Q = ZG1.m73455Q(Function1.this, obj);
                return m73455Q;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMap, "private fun loadUnidenti…ypedArray()))\n      }\n  }");
        Object m33094as = switchMap.m33094as(AutoDispose.m45239a(this.f48094c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10195f c10195f = new C10195f();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: RG1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZG1.m73454R(Function1.this, obj);
            }
        });
    }

    /* renamed from: S */
    public final void m73453S(Throwable th) {
        this.f48107p.onNext(Boolean.TRUE);
        if (!(th instanceof IOException) && !(th instanceof RetrofitException) && !(th instanceof UnknownHostException)) {
            m73425l0(th);
            return;
        }
        C41318g46.m40159e(th);
        this.f48093b.mo19588Il();
    }

    @Override // p000.InterfaceC47950rG1
    /* renamed from: a */
    public void mo16141a(int i, String str) {
        if (str != null) {
            this.f48099h.onNext(str);
            this.f48092a.mo21469b(str);
        }
        if (i > 0) {
            this.f48093b.mo19586R1(i);
        }
        Observable<Boolean> distinctUntilChanged = this.f48103l.distinctUntilChanged();
        final C10207r c10207r = new C10207r();
        Observable observeOn = distinctUntilChanged.flatMap(new InterfaceC23492o() { // from class: SG1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m73452T;
                m73452T = ZG1.m73452T(Function1.this, obj);
                return m73452T;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "override fun onCreate(ex…   loadPendingScans()\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f48094c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10209s c10209s = new C10209s();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: vG1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZG1.m73441d0(Function1.this, obj);
            }
        });
        C24558d<HardCountCreateRequest> c24558d = this.f48100i;
        final C10210t c10210t = new C10210t();
        Observable<R> flatMapSingle = c24558d.flatMapSingle(new InterfaceC23492o() { // from class: wG1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m73439e0;
                m73439e0 = ZG1.m73439e0(Function1.this, obj);
                return m73439e0;
            }
        });
        final C10213u c10213u = new C10213u();
        Observable doOnNext = flatMapSingle.doOnNext(new InterfaceC23484g() { // from class: xG1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZG1.m73437f0(Function1.this, obj);
            }
        });
        final C10214v c10214v = new C10214v(this);
        Observable observeOn2 = doOnNext.doOnError(new InterfaceC23484g() { // from class: yG1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZG1.m73435g0(Function1.this, obj);
            }
        }).retry().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "override fun onCreate(ex…   loadPendingScans()\n  }");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f48094c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10215w c10215w = new C10215w();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: zG1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZG1.m73433h0(Function1.this, obj);
            }
        };
        final C10216x c10216x = new C10216x(this);
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: AG1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZG1.m73431i0(Function1.this, obj);
            }
        });
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(this.f48098g, this.f48101j, this.f48102k, this.f48105n, C10196g.f48119a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…> Quad(t1, t2, t3, t4) })");
        final C10217y c10217y = new C10217y();
        Observable observeOn3 = combineLatest.flatMapSingle(new InterfaceC23492o() { // from class: BG1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m73429j0;
                m73429j0 = ZG1.m73429j0(Function1.this, obj);
                return m73429j0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "override fun onCreate(ex…   loadPendingScans()\n  }");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(this.f48094c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10198i c10198i = new C10198i(this.f48093b);
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: CG1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZG1.m73427k0(Function1.this, obj);
            }
        });
        Observable combineLatest2 = Observable.combineLatest(this.f48102k, this.f48092a.mo21449n(), C10197h.f48120a);
        Intrinsics.checkNotNullExpressionValue(combineLatest2, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        Observable observeOn4 = combineLatest2.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as4 = observeOn4.m33094as(AutoDispose.m45239a(this.f48094c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10199j c10199j = new C10199j();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: EG1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZG1.m73451U(Function1.this, obj);
            }
        });
        Observable merge = Observable.merge(this.f48093b.mo19584T(), this.f48104m);
        Intrinsics.checkNotNullExpressionValue(merge, "merge(\n      ui.scans(),\n      scanSubject\n    )");
        Observable m31950a = C24527f.m31950a(merge, this.f48099h);
        final C10200k c10200k = new C10200k();
        AbstractC23461c flatMapCompletable = m31950a.flatMapCompletable(new InterfaceC23492o() { // from class: TG1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m73450V;
                m73450V = ZG1.m73450V(Function1.this, obj);
                return m73450V;
            }
        });
        final C10201l c10201l = new C10201l(this);
        AbstractC23461c m33070P = flatMapCompletable.m33084B(new InterfaceC23484g() { // from class: UG1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZG1.m73449W(Function1.this, obj);
            }
        }).m33066T().m33070P(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33070P, "override fun onCreate(ex…   loadPendingScans()\n  }");
        Object m33041n = m33070P.m33041n(AutoDispose.m45239a(this.f48094c));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: VG1
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                ZG1.m73448X();
            }
        };
        final C10202m c10202m = new C10202m(this);
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: WG1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZG1.m73447Y(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn5 = this.f48093b.mo19591B2().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn5, "ui.cameraClicks()\n      …dSchedulers.mainThread())");
        Object m33094as5 = observeOn5.m33094as(AutoDispose.m45239a(this.f48094c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10203n c10203n = new C10203n();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: XG1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZG1.m73446Z(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn6 = this.f48093b.mo19577n().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn6, "ui.enterCodeClicks()\n   …dSchedulers.mainThread())");
        Object m33094as6 = observeOn6.m33094as(AutoDispose.m45239a(this.f48094c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10204o c10204o = new C10204o();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: YG1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZG1.m73445a0(Function1.this, obj);
            }
        });
        Object m33094as7 = this.f48093b.mo19578l8().m33094as(AutoDispose.m45239a(this.f48094c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10205p c10205p = new C10205p();
        ((ObservableSubscribeProxy) m33094as7).subscribe(new InterfaceC23484g() { // from class: tG1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZG1.m73444b0(Function1.this, obj);
            }
        });
        Object m33094as8 = this.f48093b.mo19590D6().m33094as(AutoDispose.m45239a(this.f48094c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as8, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10206q c10206q = new C10206q();
        ((ObservableSubscribeProxy) m33094as8).subscribe(new InterfaceC23484g() { // from class: uG1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZG1.m73443c0(Function1.this, obj);
            }
        });
        m73461K();
    }

    @Override // p000.InterfaceC47950rG1
    /* renamed from: b */
    public void mo16140b(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.f48104m.onNext(identifier);
    }

    @Override // p000.InterfaceC47950rG1
    /* renamed from: c */
    public void mo16139c(boolean z) {
        this.f48103l.onNext(Boolean.valueOf(z));
    }

    /* renamed from: l0 */
    public final void m73425l0(Throwable th) {
        C41318g46.m40159e(th);
        Unit unit = null;
        if (!(th instanceof HttpException)) {
            th = null;
        }
        HttpException httpException = (HttpException) th;
        if (httpException != null) {
            this.f48093b.error(httpException);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f48093b.error(C45871nl4.error_generic_body);
        }
        this.f48093b.mo19582Zj();
    }

    @Override // p000.InterfaceC47950rG1
    public void onPause() {
        this.f48093b.onPause();
    }

    @Override // p000.InterfaceC47950rG1
    public void onResume() {
        this.f48106o = null;
        this.f48093b.onResume();
        m73456P();
        Observable<HardCountStatus> observeOn = this.f48092a.mo21449n().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "hardCountManager.totalHa…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f48094c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10218z c10218z = new C10218z(this.f48093b);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: FG1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZG1.m73423m0(Function1.this, obj);
            }
        });
        Object m32150f = XF1.C9394a.cachedHardCountSuccessfulScans$default(this.f48092a, null, 1, null).m32150f(AutoDispose.m45239a(this.f48094c));
        Intrinsics.checkExpressionValueIsNotNull(m32150f, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10182A c10182a = new C10182A();
        ((FlowableSubscribeProxy) m32150f).subscribe(new InterfaceC23484g() { // from class: GG1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZG1.m73421n0(Function1.this, obj);
            }
        });
        Object m33094as2 = this.f48092a.mo21467c().m33094as(AutoDispose.m45239a(this.f48094c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10183B c10183b = new C10183B();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: HG1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZG1.m73419o0(Function1.this, obj);
            }
        });
        Observable<Integer> observeOn2 = this.f48092a.mo21451l().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "hardCountManager.current…dSchedulers.mainThread())");
        Object m33094as3 = observeOn2.m33094as(AutoDispose.m45239a(this.f48094c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10184C c10184c = new C10184C(this.f48093b);
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: IG1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZG1.m73417p0(Function1.this, obj);
            }
        });
        Observable<Unit> mo19589Ek = this.f48093b.mo19589Ek();
        final C10185D c10185d = new C10185D();
        Observable<R> flatMapSingle = mo19589Ek.flatMapSingle(new InterfaceC23492o() { // from class: JG1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m73415q0;
                m73415q0 = ZG1.m73415q0(Function1.this, obj);
                return m73415q0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun onResume() …p()\n        }\n      }\n  }");
        Object m33094as4 = flatMapSingle.m33094as(AutoDispose.m45239a(this.f48094c));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10186E c10186e = new C10186E();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: KG1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZG1.m73413r0(Function1.this, obj);
            }
        });
    }

    /* renamed from: s0 */
    public final Observable<HardCountCreateRequest> m73411s0() {
        AbstractC23442F<String> firstOrError = this.f48099h.firstOrError();
        final C10187F c10187f = new C10187F();
        AbstractC23442F<R> m33165A = firstOrError.m33165A(new InterfaceC23492o() { // from class: sG1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m73409t0;
                m73409t0 = ZG1.m73409t0(Function1.this, obj);
                return m73409t0;
            }
        });
        final C10188G c10188g = C10188G.f48113g;
        Observable m33162D = m33165A.m33162D(new InterfaceC23492o() { // from class: DG1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m73407u0;
                m73407u0 = ZG1.m73407u0(Function1.this, obj);
                return m73407u0;
            }
        });
        final C10189H c10189h = new C10189H(this.f48100i);
        Observable<HardCountCreateRequest> doOnNext = m33162D.doOnNext(new InterfaceC23484g() { // from class: OG1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                ZG1.m73405v0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "private fun recountPendi…questSubject::onNext)\n  }");
        return doOnNext;
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n \u0002*\u0004\u0018\u00010\u00040\u00042\"\u0010\u0003\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: ZG1$k */
    /* loaded from: classes3.dex */
    public static final class C10200k extends Lambda implements Function1<Pair<? extends String, ? extends String>, InterfaceC23496h> {
        public C10200k() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<String, String> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            String peripheralCode = pair.component1();
            String hardCountId = pair.component2();
            Intrinsics.checkNotNullExpressionValue(hardCountId, "hardCountId");
            Intrinsics.checkNotNullExpressionValue(peripheralCode, "peripheralCode");
            HardCountCreateRequest hardCountCreateRequest = new HardCountCreateRequest(hardCountId, peripheralCode, ZG1.this.f48106o);
            ZG1.this.f48106o = null;
            return XF1.C9394a.cacheHardCountRequests$default(ZG1.this.f48092a, hardCountCreateRequest, InventoryScanningIdentifierCategory.PENDING, null, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends String, ? extends String> pair) {
            return invoke2((Pair<String, String>) pair);
        }
    }
}
