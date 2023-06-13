package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.VehicleScrapRequest;
import co.bird.android.model.constant.Permission;
import co.bird.android.model.constant.ScrapRequestReviewStatus;
import co.bird.android.model.constant.ServiceCenterRoute;
import co.bird.android.model.constant.ServiceCenterStatus;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireServiceCenterStatus;
import co.bird.api.exception.HttpException;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import p000.C37585Zn5;
import p000.InterfaceC33193Gt5;
import p000.InterfaceC40099e13;
import p000.InterfaceC40565eo5;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002BA\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!¢\u0006\u0004\b%\u0010&J\u0015\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0001J\t\u0010\u0007\u001a\u00020\u0005H\u0096\u0001J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, m28432d2 = {"LZn5;", "LQn5;", "LSx6;", "LRx6;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", DateTokenConverter.CONVERTER_KEY, "onResume", "Lco/bird/android/model/wire/WireBird;", "bird", "c", "LGt5;", C17296a.f69688o, "LGt5;", "serviceCenterManager", "Leo5;", "b", "Leo5;", "scrapManager", "LDQ3;", "LDQ3;", "permissionManager", "Lco5;", "Lco5;", "ui", "Lcom/uber/autodispose/ScopeProvider;", "e", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Le13;", "f", "Le13;", "navigator", "Liy6;", "g", "Liy6;", "warehouseChecker", "<init>", "(LGt5;Leo5;LDQ3;Lco5;Lcom/uber/autodispose/ScopeProvider;Le13;Liy6;)V", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScrapLandingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapLandingPresenter.kt\nco/bird/android/feature/scrap/landing/ScrapLandingPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,111:1\n180#2:112\n180#2:113\n218#2:114\n*S KotlinDebug\n*F\n+ 1 ScrapLandingPresenter.kt\nco/bird/android/feature/scrap/landing/ScrapLandingPresenterImpl\n*L\n47#1:112\n51#1:113\n88#1:114\n*E\n"})
/* renamed from: Zn5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37585Zn5 implements InterfaceC35479Qn5, InterfaceC36038Sx6 {

    /* renamed from: a */
    public final InterfaceC33193Gt5 f49244a;

    /* renamed from: b */
    public final InterfaceC40565eo5 f49245b;

    /* renamed from: c */
    public final DQ3 f49246c;

    /* renamed from: d */
    public final InterfaceC39362co5 f49247d;

    /* renamed from: e */
    public final ScopeProvider f49248e;

    /* renamed from: f */
    public final InterfaceC40099e13 f49249f;

    /* renamed from: g */
    public final C43038iy6 f49250g;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LFQ3;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Zn5$a */
    /* loaded from: classes3.dex */
    public static final class C10379a extends Lambda implements Function1<Unit, InterfaceC23447K<? extends FQ3>> {
        public C10379a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends FQ3> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C37585Zn5.this.f49246c.m110485l(Permission.CAMERA);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LFQ3;", "response", "", C17296a.f69688o, "(LFQ3;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Zn5$b */
    /* loaded from: classes3.dex */
    public static final class C10380b extends Lambda implements Function1<FQ3, Boolean> {

        /* renamed from: g */
        public static final C10380b f49252g = new C10380b();

        public C10380b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(FQ3 response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return Boolean.valueOf(response.m107154a());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LFQ3;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LFQ3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Zn5$c */
    /* loaded from: classes3.dex */
    public static final class C10381c extends Lambda implements Function1<FQ3, Unit> {
        public C10381c() {
            super(1);
        }

        /* renamed from: a */
        public final void m72495a(FQ3 fq3) {
            InterfaceC40099e13.C19924a.goToScanCode$default(C37585Zn5.this.f49249f, null, null, null, null, false, false, false, null, KotlinVersion.MAX_COMPONENT_VALUE, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FQ3 fq3) {
            m72495a(fq3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Zn5$d */
    /* loaded from: classes3.dex */
    public static final class C10382d extends Lambda implements Function1<Unit, Unit> {
        public C10382d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.goToEnterCode$default(C37585Zn5.this.f49249f, null, null, 3, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireServiceCenterStatus;", "wireStatus", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/wire/WireServiceCenterStatus;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Zn5$e */
    /* loaded from: classes3.dex */
    public static final class C10383e extends Lambda implements Function1<WireServiceCenterStatus, InterfaceC24574u<? extends Unit>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f49256h;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", "b", "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Zn5$e$a */
        /* loaded from: classes3.dex */
        public static final class C10384a extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends Unit>> {

            /* renamed from: g */
            public final /* synthetic */ C37585Zn5 f49257g;

            /* renamed from: h */
            public final /* synthetic */ WireBird f49258h;

            @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: Zn5$e$a$a */
            /* loaded from: classes3.dex */
            public static final class C10385a extends Lambda implements Function1<Unit, InterfaceC24574u<? extends Unit>> {

                /* renamed from: g */
                public static final C10385a f49259g = new C10385a();

                public C10385a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final InterfaceC24574u<? extends Unit> invoke(Unit it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return AbstractC24507p.m32068G(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10384a(C37585Zn5 c37585Zn5, WireBird wireBird) {
                super(1);
                this.f49257g = c37585Zn5;
                this.f49258h = wireBird;
            }

            /* renamed from: c */
            public static final InterfaceC24574u m72489c(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (InterfaceC24574u) tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final InterfaceC24574u<? extends Unit> invoke(DialogResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                if (response == DialogResponse.OK) {
                    AbstractC23442F m70883l = C38096ag5.m70883l(InterfaceC33193Gt5.C2969a.addEvent$default(this.f49257g.f49244a, ServiceCenterStatus.AWAITING_SCRAP_INSPECTION, this.f49258h, (String) null, (String) null, EnumC12346bH.SINGLE, (Integer) null, 44, (Object) null));
                    final C10385a c10385a = C10385a.f49259g;
                    return m70883l.m33163C(new InterfaceC23492o() { // from class: bo5
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC24574u m72489c;
                            m72489c = C37585Zn5.C10383e.C10384a.m72489c(Function1.this, obj);
                            return m72489c;
                        }
                    });
                }
                return AbstractC24507p.m32024u();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10383e(WireBird wireBird) {
            super(1);
            this.f49256h = wireBird;
        }

        /* renamed from: c */
        public static final InterfaceC24574u m72492c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends Unit> invoke(WireServiceCenterStatus wireStatus) {
            Intrinsics.checkNotNullParameter(wireStatus, "wireStatus");
            if (!ServiceCenterRoute.Companion.getSCRAP_ROUTE_STATUSES().contains(wireStatus.getStatus())) {
                AbstractC24507p<DialogResponse> firstElement = C37585Zn5.this.f49247d.mo43689lc(this.f49256h).firstElement();
                final C10384a c10384a = new C10384a(C37585Zn5.this, this.f49256h);
                return firstElement.m32021x(new InterfaceC23492o() { // from class: ao5
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC24574u m72492c;
                        m72492c = C37585Zn5.C10383e.m72492c(Function1.this, obj);
                        return m72492c;
                    }
                });
            }
            return AbstractC24507p.m32068G(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "", "Lco/bird/android/model/VehicleScrapRequest;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Zn5$f */
    /* loaded from: classes3.dex */
    public static final class C10386f extends Lambda implements Function1<Unit, InterfaceC24574u<? extends List<? extends VehicleScrapRequest>>> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f49261h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10386f(WireBird wireBird) {
            super(1);
            this.f49261h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends List<VehicleScrapRequest>> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C38096ag5.m70883l(InterfaceC40565eo5.C20105a.getScrapRequestsForBird$default(C37585Zn5.this.f49245b, this.f49261h.getId(), null, 2, null)).m33125j0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "scrapRequests", "", "Lco/bird/android/model/VehicleScrapRequest;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nScrapLandingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapLandingPresenter.kt\nco/bird/android/feature/scrap/landing/ScrapLandingPresenterImpl$onBirdIdentified$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n2333#2,14:112\n*S KotlinDebug\n*F\n+ 1 ScrapLandingPresenter.kt\nco/bird/android/feature/scrap/landing/ScrapLandingPresenterImpl$onBirdIdentified$3\n*L\n90#1:112,14\n*E\n"})
    /* renamed from: Zn5$g */
    /* loaded from: classes3.dex */
    public static final class C10387g extends Lambda implements Function1<List<? extends VehicleScrapRequest>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ WireBird f49263h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10387g(WireBird wireBird) {
            super(1);
            this.f49263h = wireBird;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends VehicleScrapRequest> list) {
            invoke2((List<VehicleScrapRequest>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<VehicleScrapRequest> scrapRequests) {
            Object obj;
            Intrinsics.checkNotNullExpressionValue(scrapRequests, "scrapRequests");
            Iterator<T> it = scrapRequests.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    DateTime updatedAt = ((VehicleScrapRequest) next).getUpdatedAt();
                    do {
                        Object next2 = it.next();
                        DateTime updatedAt2 = ((VehicleScrapRequest) next2).getUpdatedAt();
                        if (updatedAt.compareTo(updatedAt2) > 0) {
                            next = next2;
                            updatedAt = updatedAt2;
                        }
                    } while (it.hasNext());
                    obj = next;
                } else {
                    obj = next;
                }
            } else {
                obj = null;
            }
            VehicleScrapRequest vehicleScrapRequest = (VehicleScrapRequest) obj;
            if (vehicleScrapRequest != null && vehicleScrapRequest.getReviewStatus() != ScrapRequestReviewStatus.REJECTED) {
                if (vehicleScrapRequest.getReviewStatus() == ScrapRequestReviewStatus.PENDING) {
                    C37585Zn5.this.f49247d.mo43691Nb(this.f49263h);
                    return;
                } else if (vehicleScrapRequest.getReviewStatus() == ScrapRequestReviewStatus.APPROVED) {
                    C37585Zn5.this.f49247d.mo43687wk(this.f49263h);
                    return;
                } else {
                    return;
                }
            }
            C37585Zn5.this.f49249f.mo37164G3(this.f49263h, vehicleScrapRequest);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nScrapLandingPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapLandingPresenter.kt\nco/bird/android/feature/scrap/landing/ScrapLandingPresenterImpl$onBirdIdentified$4\n+ 2 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n9#2,4:112\n1#3:116\n*S KotlinDebug\n*F\n+ 1 ScrapLandingPresenter.kt\nco/bird/android/feature/scrap/landing/ScrapLandingPresenterImpl$onBirdIdentified$4\n*L\n107#1:112,4\n*E\n"})
    /* renamed from: Zn5$h */
    /* loaded from: classes3.dex */
    public static final class C10388h extends Lambda implements Function1<Throwable, Unit> {
        public C10388h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
            Unit unit = null;
            if (!(th instanceof HttpException)) {
                th = null;
            }
            HttpException httpException = (HttpException) th;
            if (httpException != null) {
                C37585Zn5.this.f49247d.error(httpException);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                C37585Zn5.this.f49247d.errorGeneric();
            }
        }
    }

    public C37585Zn5(InterfaceC33193Gt5 serviceCenterManager, InterfaceC40565eo5 scrapManager, DQ3 permissionManager, InterfaceC39362co5 ui, ScopeProvider scopeProvider, InterfaceC40099e13 navigator, C43038iy6 warehouseChecker) {
        Intrinsics.checkNotNullParameter(serviceCenterManager, "serviceCenterManager");
        Intrinsics.checkNotNullParameter(scrapManager, "scrapManager");
        Intrinsics.checkNotNullParameter(permissionManager, "permissionManager");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(warehouseChecker, "warehouseChecker");
        this.f49244a = serviceCenterManager;
        this.f49245b = scrapManager;
        this.f49246c = permissionManager;
        this.f49247d = ui;
        this.f49248e = scopeProvider;
        this.f49249f = navigator;
        this.f49250g = warehouseChecker;
        warehouseChecker.m31479B(ui);
        Observable<Unit> mo43690h = ui.mo43690h();
        final C10379a c10379a = new C10379a();
        Observable<R> flatMapSingle = mo43690h.flatMapSingle(new InterfaceC23492o() { // from class: Rn5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m72504m;
                m72504m = C37585Zn5.m72504m(Function1.this, obj);
                return m72504m;
            }
        });
        final C10380b c10380b = C10380b.f49252g;
        Observable filter = flatMapSingle.filter(new InterfaceC23494q() { // from class: Sn5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m72503n;
                m72503n = C37585Zn5.m72503n(Function1.this, obj);
                return m72503n;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "ui.scanClicks()\n      .f…nse -> response.granted }");
        Object m33094as = filter.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10381c c10381c = new C10381c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Tn5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37585Zn5.m72502o(Function1.this, obj);
            }
        });
        Object m33094as2 = ui.mo43688v0().m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10382d c10382d = new C10382d();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Un5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37585Zn5.m72501p(Function1.this, obj);
            }
        });
    }

    /* renamed from: m */
    public static final InterfaceC23447K m72504m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final boolean m72503n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: o */
    public static final void m72502o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m72501p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final InterfaceC24574u m72500q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final InterfaceC24574u m72499r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m72498s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m72497t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC35479Qn5
    /* renamed from: c */
    public void mo72513c(WireBird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        AbstractC23442F m70883l = C38096ag5.m70883l(C28237sD.progress$default(this.f49244a.mo94632b(bird.getId()), this.f49247d, 0, 2, (Object) null));
        final C10383e c10383e = new C10383e(bird);
        AbstractC24507p m33163C = m70883l.m33163C(new InterfaceC23492o() { // from class: Vn5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m72500q;
                m72500q = C37585Zn5.m72500q(Function1.this, obj);
                return m72500q;
            }
        });
        final C10386f c10386f = new C10386f(bird);
        AbstractC24507p m32066I = m33163C.m32021x(new InterfaceC23492o() { // from class: Wn5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m72499r;
                m72499r = C37585Zn5.m72499r(Function1.this, obj);
                return m72499r;
            }
        }).m32066I(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m32066I, "override fun onBirdIdent…rorGeneric()\n      })\n  }");
        Object m32048b = m32066I.m32048b(AutoDispose.m45239a(this.f49248e));
        Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C10387g c10387g = new C10387g(bird);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: Xn5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37585Zn5.m72498s(Function1.this, obj);
            }
        };
        final C10388h c10388h = new C10388h();
        ((MaybeSubscribeProxy) m32048b).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: Yn5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37585Zn5.m72497t(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC36038Sx6
    /* renamed from: d */
    public void mo28195d(InterfaceC35804Rx6 interfaceC35804Rx6) {
        this.f49250g.mo28195d(interfaceC35804Rx6);
    }

    @Override // p000.InterfaceC36038Sx6
    public void onResume() {
        this.f49250g.onResume();
    }
}
