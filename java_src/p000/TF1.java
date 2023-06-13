package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.HardCountStatus;
import co.bird.android.model.constant.Permission;
import co.bird.api.response.HardCountResponse;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.HttpException;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B9\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010#J\u0015\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0001J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, m28432d2 = {"LTF1;", "LGF1;", "LSx6;", "LRx6;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", DateTokenConverter.CONVERTER_KEY, "onResume", "D", "", "e", "y", "LUF1;", C17296a.f69688o, "LUF1;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LDQ3;", "c", "LDQ3;", "permissionManager", "Le13;", "Le13;", "navigator", "Liy6;", "Liy6;", "warehouseChecker", "LXF1;", "f", "LXF1;", "hardCountManager", "<init>", "(LUF1;Lcom/uber/autodispose/ScopeProvider;LDQ3;Le13;Liy6;LXF1;)V", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHardCountLandingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountLandingPresenter.kt\nco/bird/android/feature/hardcount/landing/HardCountLandingPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n180#2:99\n199#2:100\n180#2:101\n9#3,4:102\n9#3,4:107\n1#4:106\n*S KotlinDebug\n*F\n+ 1 HardCountLandingPresenter.kt\nco/bird/android/feature/hardcount/landing/HardCountLandingPresenterImpl\n*L\n62#1:99\n75#1:100\n82#1:101\n92#1:102,4\n93#1:107,4\n*E\n"})
/* renamed from: TF1 */
/* loaded from: classes3.dex */
public final class TF1 implements GF1, InterfaceC36038Sx6 {

    /* renamed from: a */
    public final UF1 f35041a;

    /* renamed from: b */
    public final ScopeProvider f35042b;

    /* renamed from: c */
    public final DQ3 f35043c;

    /* renamed from: d */
    public final InterfaceC40099e13 f35044d;

    /* renamed from: e */
    public final C43038iy6 f35045e;

    /* renamed from: f */
    public final XF1 f35046f;

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TF1$a */
    /* loaded from: classes3.dex */
    public static final class C7695a extends Lambda implements Function1<Unit, Unit> {
        public C7695a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            TF1.this.f35041a.mo80165o8(false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LFQ3;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TF1$b */
    /* loaded from: classes3.dex */
    public static final class C7696b extends Lambda implements Function1<Unit, InterfaceC23447K<? extends FQ3>> {
        public C7696b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends FQ3> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return TF1.this.f35043c.m110485l(Permission.CAMERA);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TF1$c */
    /* loaded from: classes3.dex */
    public static final class C7697c extends Lambda implements Function1<FQ3, Unit> {
        public C7697c() {
            super(1);
        }

        /* renamed from: a */
        public final void m84134a(FQ3 fq3) {
            if (fq3.m107154a()) {
                return;
            }
            TF1.this.f35041a.mo80165o8(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m84134a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LFQ3;", "response", "", C17296a.f69688o, "(LFQ3;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TF1$d */
    /* loaded from: classes3.dex */
    public static final class C7698d extends Lambda implements Function1<FQ3, Boolean> {

        /* renamed from: g */
        public static final C7698d f35050g = new C7698d();

        public C7698d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(FQ3 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return Boolean.valueOf(response.m107154a());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LFQ3;", "it", "Lio/reactivex/K;", "LHM4;", "Lco/bird/api/response/HardCountResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LFQ3;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TF1$e */
    /* loaded from: classes3.dex */
    public static final class C7699e extends Lambda implements Function1<FQ3, InterfaceC23447K<? extends HM4<HardCountResponse>>> {
        public C7699e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends HM4<HardCountResponse>> invoke(FQ3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return TF1.this.f35046f.mo21465d();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\b\u001ab\u0012*\b\u0001\u0012&\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006 \u0007*\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0004 \u0007*0\u0012*\b\u0001\u0012&\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006 \u0007*\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/api/response/HardCountResponse;", "hardCountSessionOptional", "Lio/reactivex/u;", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TF1$f */
    /* loaded from: classes3.dex */
    public static final class C7700f extends Lambda implements Function1<Optional<HardCountResponse>, InterfaceC24574u<? extends Pair<? extends Integer, ? extends String>>> {
        public C7700f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Pair<Integer, String>> invoke(Optional<HardCountResponse> hardCountSessionOptional) {
            Intrinsics.checkNotNullParameter(hardCountSessionOptional, "hardCountSessionOptional");
            if (!hardCountSessionOptional.m59037c()) {
                TF1.this.m84157D();
                TF1.this.f35041a.mo80165o8(true);
                return AbstractC24507p.m32024u();
            }
            Integer expectedQuantity = hardCountSessionOptional.m59038b().getExpectedQuantity();
            String id = hardCountSessionOptional.m59038b().getId();
            TF1.this.f35046f.mo21469b(id);
            return TF1.this.f35046f.mo21471a(id).m33045k(AbstractC24507p.m32068G(TuplesKt.m28425to(expectedQuantity, id)));
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TF1$g */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C7701g extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C7701g(Object obj) {
            super(1, obj, TF1.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((TF1) this.receiver).m84136y(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TF1$h */
    /* loaded from: classes3.dex */
    public static final class C7702h extends Lambda implements Function1<Pair<? extends Integer, ? extends String>, Unit> {
        public C7702h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Integer, ? extends String> pair) {
            invoke2((Pair<Integer, String>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Integer, String> pair) {
            String component2 = pair.component2();
            TF1.this.f35041a.mo80165o8(true);
            TF1.this.f35044d.mo36937u0(component2, pair.component1());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/HardCountResponse;", "kotlin.jvm.PlatformType", "hardCountResponse", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHardCountLandingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountLandingPresenter.kt\nco/bird/android/feature/hardcount/landing/HardCountLandingPresenterImpl$onResume$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,98:1\n1#2:99\n*E\n"})
    /* renamed from: TF1$i */
    /* loaded from: classes3.dex */
    public static final class C7703i extends Lambda implements Function1<HM4<HardCountResponse>, Unit> {
        public C7703i() {
            super(1);
        }

        /* renamed from: a */
        public final void m84130a(HM4<HardCountResponse> hm4) {
            Integer expectedQuantity;
            HardCountResponse m103944a = hm4.m103944a();
            if (m103944a == null || (expectedQuantity = m103944a.getExpectedQuantity()) == null) {
                return;
            }
            TF1.this.f35041a.mo80168F4(expectedQuantity.intValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<HardCountResponse> hm4) {
            m84130a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TF1$j */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C7704j extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        public C7704j(Object obj) {
            super(1, obj, TF1.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((TF1) this.receiver).m84136y(p0);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TF1$k */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C7705k extends FunctionReferenceImpl implements Function1<HardCountStatus, Unit> {
        public C7705k(Object obj) {
            super(1, obj, UF1.class, "setHardCountStatus", "setHardCountStatus(Lco/bird/android/model/HardCountStatus;)V", 0);
        }

        /* renamed from: a */
        public final void m84129a(HardCountStatus p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((UF1) this.receiver).mo80167if(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HardCountStatus hardCountStatus) {
            m84129a(hardCountStatus);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TF1$l */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C7706l extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C7706l f35055b = new C7706l();

        public C7706l() {
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

    public TF1(UF1 ui, ScopeProvider scopeProvider, DQ3 permissionManager, InterfaceC40099e13 navigator, C43038iy6 warehouseChecker, XF1 hardCountManager) {
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(warehouseChecker, "warehouseChecker");
        Intrinsics.checkNotNullParameter(hardCountManager, "hardCountManager");
        this.f35041a = ui;
        this.f35042b = scopeProvider;
        this.f35043c = permissionManager;
        this.f35044d = navigator;
        this.f35045e = warehouseChecker;
        this.f35046f = hardCountManager;
        warehouseChecker.m31479B(ui);
        Observable<Unit> observeOn = ui.mo80164p8().observeOn(C23454a.m33087a());
        final C7695a c7695a = new C7695a();
        Observable<Unit> doOnNext = observeOn.doOnNext(new InterfaceC23484g() { // from class: NF1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TF1.m84144q(Function1.this, obj);
            }
        });
        final C7696b c7696b = new C7696b();
        Observable<R> flatMapSingle = doOnNext.flatMapSingle(new InterfaceC23492o() { // from class: OF1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m84143r;
                m84143r = TF1.m84143r(Function1.this, obj);
                return m84143r;
            }
        });
        final C7697c c7697c = new C7697c();
        Observable doOnNext2 = flatMapSingle.doOnNext(new InterfaceC23484g() { // from class: PF1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TF1.m84142s(Function1.this, obj);
            }
        });
        final C7698d c7698d = C7698d.f35050g;
        Observable filter = doOnNext2.filter(new InterfaceC23494q() { // from class: QF1
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m84141t;
                m84141t = TF1.m84141t(Function1.this, obj);
                return m84141t;
            }
        });
        final C7699e c7699e = new C7699e();
        Observable observeOn2 = filter.flatMapSingle(new InterfaceC23492o() { // from class: RF1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m84140u;
                m84140u = TF1.m84140u(Function1.this, obj);
                return m84140u;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "ui.enterButtonClicks()\n …dSchedulers.mainThread())");
        Observable m70888g = C38096ag5.m70888g(observeOn2);
        final C7700f c7700f = new C7700f();
        Observable flatMapMaybe = m70888g.flatMapMaybe(new InterfaceC23492o() { // from class: SF1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m84139v;
                m84139v = TF1.m84139v(Function1.this, obj);
                return m84139v;
            }
        });
        final C7701g c7701g = new C7701g(this);
        Observable observeOn3 = flatMapMaybe.doOnError(new InterfaceC23484g() { // from class: IF1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TF1.m84138w(Function1.this, obj);
            }
        }).retry().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "ui.enterButtonClicks()\n …dSchedulers.mainThread())");
        Object m33094as = observeOn3.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7702h c7702h = new C7702h();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: JF1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TF1.m84137x(Function1.this, obj);
            }
        });
    }

    /* renamed from: A */
    public static final void m84160A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m84159B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m84158C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m84144q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final InterfaceC23447K m84143r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m84142s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final boolean m84141t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: u */
    public static final InterfaceC23447K m84140u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final InterfaceC24574u m84139v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m84138w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m84137x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final void m84135z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D */
    public final void m84157D() {
        this.f35041a.mo80166ne();
    }

    @Override // p000.InterfaceC36038Sx6
    /* renamed from: d */
    public void mo28195d(InterfaceC35804Rx6 interfaceC35804Rx6) {
        this.f35045e.mo28195d(interfaceC35804Rx6);
    }

    @Override // p000.InterfaceC36038Sx6
    public void onResume() {
        this.f35045e.onResume();
        this.f35046f.mo21457h();
        AbstractC23442F<HM4<HardCountResponse>> m33152N = this.f35046f.mo21465d().m33146T(1L).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "hardCountManager.getHard…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f35042b));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7703i c7703i = new C7703i();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: HF1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TF1.m84159B(Function1.this, obj);
            }
        };
        final C7704j c7704j = new C7704j(this);
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: KF1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TF1.m84158C(Function1.this, obj);
            }
        });
        Observable<HardCountStatus> observeOn = this.f35046f.mo21449n().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "hardCountManager.totalHa…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f35042b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7705k c7705k = new C7705k(this.f35041a);
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: LF1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TF1.m84135z(Function1.this, obj);
            }
        };
        final C7706l c7706l = C7706l.f35055b;
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: MF1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TF1.m84160A(Function1.this, obj);
            }
        });
    }

    /* renamed from: y */
    public final void m84136y(Throwable th) {
        IllegalStateException illegalStateException;
        C41318g46.m40159e(th);
        Unit unit = null;
        if (th instanceof IllegalStateException) {
            illegalStateException = th;
        } else {
            illegalStateException = null;
        }
        IllegalStateException illegalStateException2 = illegalStateException;
        if (illegalStateException2 != null) {
            this.f35041a.error(illegalStateException2);
            unit = Unit.INSTANCE;
        } else {
            if (!(th instanceof HttpException)) {
                th = null;
            }
            HttpException httpException = (HttpException) th;
            if (httpException != null) {
                this.f35041a.error(httpException);
                unit = Unit.INSTANCE;
            }
        }
        if (unit == null) {
            this.f35041a.error(C45871nl4.error_generic_body);
        }
        this.f35041a.mo80165o8(true);
    }
}
