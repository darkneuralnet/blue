package p000;

import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.RentalPlan;
import co.bird.android.model.RentalPlansResponse;
import co.bird.android.model.analytics.RentalSignupScreenShown;
import co.bird.android.model.constant.RentalKind;
import co.bird.android.model.wire.configs.RentalContentConfig;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC44782lv1;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u001b\u0012\b\b\u0001\u0010\"\u001a\u00020\u001f\u0012\b\b\u0001\u0010&\u001a\u00020#\u0012\b\b\u0001\u0010*\u001a\u00020'¢\u0006\u0004\b+\u0010,J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0016R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-"}, m28432d2 = {"LbA2;", "Llv1;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lio/reactivex/Observable;", "", "Bk", "", "g7", "LEi0;", "m7", "LGi0;", "rc", "LEa;", "b", "LEa;", "analyticsManager", "Ldr4;", "c", "Ldr4;", "locationManager", "LCx4;", DateTokenConverter.CONVERTER_KEY, "LCx4;", "rentalManager", "LQA2;", "e", "LQA2;", RequestHeadersFactory.MODEL, "Lcom/uber/autodispose/ScopeProvider;", "f", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LfA2;", "g", "LfA2;", "ui", "Le13;", "h", "Le13;", "navigator", "<init>", "(LEa;Ldr4;LCx4;LQA2;Lcom/uber/autodispose/ScopeProvider;LfA2;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLongTermRentalSetupIntroPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongTermRentalSetupIntroPresenter.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupIntroPresenter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,97:1\n1855#2,2:98\n199#3:100\n180#3:101\n*S KotlinDebug\n*F\n+ 1 LongTermRentalSetupIntroPresenter.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupIntroPresenter\n*L\n59#1:98,2\n74#1:100\n83#1:101\n*E\n"})
/* renamed from: bA2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38392bA2 implements InterfaceC44782lv1 {

    /* renamed from: b */
    public final InterfaceC1880Ea f57000b;

    /* renamed from: c */
    public final InterfaceC40001dr4 f57001c;

    /* renamed from: d */
    public final InterfaceC32292Cx4 f57002d;

    /* renamed from: e */
    public final QA2 f57003e;

    /* renamed from: f */
    public final ScopeProvider f57004f;

    /* renamed from: g */
    public final C40781fA2 f57005g;

    /* renamed from: h */
    public final InterfaceC40099e13 f57006h;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bA2$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C12306a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RentalKind.values().length];
            try {
                iArr[RentalKind.PICK_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/android/model/RentalPlansResponse;", "response", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: bA2$b */
    /* loaded from: classes2.dex */
    public static final class C12307b extends Lambda implements Function1<HM4<RentalPlansResponse>, InterfaceC23447K<? extends RentalPlansResponse>> {

        /* renamed from: g */
        public static final C12307b f57007g = new C12307b();

        public C12307b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends RentalPlansResponse> invoke(HM4<RentalPlansResponse> response) {
            AbstractC23442F m33158H;
            Intrinsics.checkNotNullParameter(response, "response");
            RentalPlansResponse m103944a = response.m103944a();
            if (m103944a == null || (m33158H = AbstractC23442F.m33158H(m103944a)) == null) {
                return AbstractC23442F.m33100x(C38816bt2.f59712b);
            }
            return m33158H;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/RentalPlansResponse;", "response", "", "Lco/bird/android/model/RentalPlan;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/RentalPlansResponse;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nLongTermRentalSetupIntroPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongTermRentalSetupIntroPresenter.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupIntroPresenter$onCreate$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,97:1\n766#2:98\n857#2,2:99\n*S KotlinDebug\n*F\n+ 1 LongTermRentalSetupIntroPresenter.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupIntroPresenter$onCreate$3\n*L\n72#1:98\n72#1:99,2\n*E\n"})
    /* renamed from: bA2$c */
    /* loaded from: classes2.dex */
    public static final class C12308c extends Lambda implements Function1<RentalPlansResponse, List<? extends RentalPlan>> {

        /* renamed from: g */
        public static final C12308c f57008g = new C12308c();

        public C12308c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<RentalPlan> invoke(RentalPlansResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            ArrayList arrayList = new ArrayList();
            for (Object obj : response.getPlans()) {
                if (!((RentalPlan) obj).getDeliveryWindows().isEmpty()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "validPlans", "", "Lco/bird/android/model/RentalPlan;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bA2$d */
    /* loaded from: classes2.dex */
    public static final class C12309d extends Lambda implements Function1<List<? extends RentalPlan>, Unit> {
        public C12309d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends RentalPlan> list) {
            invoke2((List<RentalPlan>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<RentalPlan> validPlans) {
            C37791a94<List<RentalPlan>> m88831h = C38392bA2.this.f57003e.m88831h();
            Intrinsics.checkNotNullExpressionValue(validPlans, "validPlans");
            m88831h.accept(validPlans);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: bA2$e */
    /* loaded from: classes2.dex */
    public static final class C12310e extends Lambda implements Function1<Unit, String> {
        public C12310e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C38392bA2.this.f57003e.m88829j().getSupport().getSupportArticleId();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "supportArticleId", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bA2$f */
    /* loaded from: classes2.dex */
    public static final class C12311f extends Lambda implements Function1<String, Unit> {
        public C12311f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String supportArticleId) {
            InterfaceC40099e13 interfaceC40099e13 = C38392bA2.this.f57006h;
            Intrinsics.checkNotNullExpressionValue(supportArticleId, "supportArticleId");
            interfaceC40099e13.mo36922w3(Long.parseLong(supportArticleId));
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bA2$g */
    /* loaded from: classes2.dex */
    public static final class C12312g extends Lambda implements Function1<Unit, Unit> {
        public C12312g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C38392bA2.this.f57000b.mo55905y(new C32067By4(null, null, null, C38392bA2.this.f57003e.m88823p().toString(), 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: bA2$h */
    /* loaded from: classes2.dex */
    public static final class C12313h extends Lambda implements Function1<Unit, Object> {

        /* renamed from: g */
        public static final C12313h f57013g = new C12313h();

        public C12313h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Object invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    public C38392bA2(InterfaceC1880Ea analyticsManager, InterfaceC40001dr4 locationManager, InterfaceC32292Cx4 rentalManager, QA2 model, ScopeProvider scopeProvider, C40781fA2 ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(rentalManager, "rentalManager");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f57000b = analyticsManager;
        this.f57001c = locationManager;
        this.f57002d = rentalManager;
        this.f57003e = model;
        this.f57004f = scopeProvider;
        this.f57005g = ui;
        this.f57006h = navigator;
    }

    /* renamed from: h */
    public static final InterfaceC23447K m64902h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final List m64901i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final void m64900j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final String m64899k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m64898l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m64897m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final Object m64896n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: Bk */
    public Observable<Object> mo22Bk() {
        Observable<Unit> m41786Ql = this.f57005g.m41786Ql();
        final C12312g c12312g = new C12312g();
        Observable<Unit> doOnNext = m41786Ql.doOnNext(new InterfaceC23484g() { // from class: Uz2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38392bA2.m64897m(Function1.this, obj);
            }
        });
        final C12313h c12313h = C12313h.f57013g;
        Observable<R> map = doOnNext.map(new InterfaceC23492o() { // from class: Vz2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Object m64896n;
                m64896n = C38392bA2.m64896n(Function1.this, obj);
                return m64896n;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun proceedImme…g())) }\n    .map { true }");
        return map;
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: g7 */
    public Observable<Boolean> mo14g7() {
        Observable<Boolean> just = Observable.just(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(just, "just(false)");
        return just;
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: m7 */
    public Observable<EnumC32621Ei0> mo12m7() {
        Observable<EnumC32621Ei0> just = Observable.just(EnumC32621Ei0.NONE);
        Intrinsics.checkNotNullExpressionValue(just, "just(CheckoutProceedType.NONE)");
        return just;
    }

    @Override // p000.InterfaceC44782lv1
    public void onActivityResult(int i, int i2, Intent intent) {
        InterfaceC44782lv1.C25814a.m26681b(this, i, i2, intent);
    }

    @Override // p000.UX0
    public void onCreate(Bundle bundle) {
        int i;
        InterfaceC44782lv1.C25814a.m26680c(this, bundle);
        this.f57000b.mo55956N(new RentalSignupScreenShown());
        C40781fA2 c40781fA2 = this.f57005g;
        if (C12306a.$EnumSwitchMapping$0[this.f57003e.m88823p().ordinal()] == 1) {
            i = C52342yg4.rental_pickup_intro;
        } else {
            i = C52342yg4.long_term_rental_intro;
        }
        c40781fA2.m41784Sl(i);
        RentalContentConfig content = this.f57003e.m88829j().getContent();
        this.f57005g.m41785Rl(content.getIntroHeader());
        for (String str : content.getIntroItemList()) {
            this.f57005g.m41787Pl(str);
        }
        if (this.f57003e.m88823p() == RentalKind.PICK_UP) {
            AbstractC23442F<HM4<RentalPlansResponse>> mo87532g = this.f57002d.mo87532g(this.f57001c.mo43616p().m73665a());
            final C12307b c12307b = C12307b.f57007g;
            AbstractC23442F<R> m33165A = mo87532g.m33165A(new InterfaceC23492o() { // from class: Wz2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m64902h;
                    m64902h = C38392bA2.m64902h(Function1.this, obj);
                    return m64902h;
                }
            });
            final C12308c c12308c = C12308c.f57008g;
            AbstractC23442F m33157I = m33165A.m33157I(new InterfaceC23492o() { // from class: Xz2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    List m64901i;
                    m64901i = C38392bA2.m64901i(Function1.this, obj);
                    return m64901i;
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33157I, "rentalManager.getRentalP….isNotEmpty() }\n        }");
            Object m33135e = m33157I.m33135e(AutoDispose.m45239a(this.f57004f));
            Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C12309d c12309d = new C12309d();
            ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: Yz2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C38392bA2.m64900j(Function1.this, obj);
                }
            });
        }
        Observable<Unit> m41788J8 = this.f57005g.m41788J8();
        final C12310e c12310e = new C12310e();
        Observable observeOn = m41788J8.map(new InterfaceC23492o() { // from class: Zz2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m64899k;
                m64899k = C38392bA2.m64899k(Function1.this, obj);
                return m64899k;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "override fun onCreate(sa…ArticleId.toLong()) }\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f57004f));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C12311f c12311f = new C12311f();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: aA2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38392bA2.m64898l(Function1.this, obj);
            }
        });
    }

    @Override // p000.UX0
    public void onDestroy() {
        InterfaceC44782lv1.C25814a.m26679d(this);
    }

    @Override // p000.UX0
    public void onLowMemory() {
        InterfaceC44782lv1.C25814a.m26678e(this);
    }

    @Override // p000.UX0
    public void onPause() {
        InterfaceC44782lv1.C25814a.m26677f(this);
    }

    @Override // p000.UX0
    public void onResume() {
        InterfaceC44782lv1.C25814a.m26676g(this);
    }

    @Override // p000.UX0
    public void onSaveInstanceState(Bundle bundle) {
        InterfaceC44782lv1.C25814a.m26675h(this, bundle);
    }

    @Override // p000.UX0
    public void onStart() {
        InterfaceC44782lv1.C25814a.m26674i(this);
    }

    @Override // p000.UX0
    public void onStop() {
        InterfaceC44782lv1.C25814a.m26673j(this);
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: rc */
    public Observable<EnumC33089Gi0> mo11rc() {
        Observable<EnumC33089Gi0> just = Observable.just(EnumC33089Gi0.CLOSE);
        Intrinsics.checkNotNullExpressionValue(just, "just(CheckoutReverseType.CLOSE)");
        return just;
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: z5 */
    public Observable<Unit> mo10z5() {
        return InterfaceC44782lv1.C25814a.m26682a(this);
    }
}
