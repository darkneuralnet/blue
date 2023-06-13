package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.wire.WireMerchantSite;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethod;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
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
import p000.C41318g46;
import p000.TR2;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00060\u00060\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\"\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u001f0\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010$\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00040\u00040\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010!R\"\u0010&\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00040\u00040\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010!R\u0014\u0010*\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, m28432d2 = {"LTR2;", "LyR2;", "", C17296a.f69688o, "", "enabled", "Lco/bird/android/model/wire/WireMerchantSite;", "site", "Lio/reactivex/c;", "O", "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LXR2;", "b", "LXR2;", "ui", "LaS2;", "c", "LaS2;", "manager", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "LAG;", "kotlin.jvm.PlatformType", "e", "LAG;", "merchantSiteRelay", "Lcom/uber/autodispose/ObservableSubscribeProxy;", "", "f", "Lcom/uber/autodispose/ObservableSubscribeProxy;", PaymentMethod.BillingDetails.PARAM_ADDRESS, "g", "merchantSiteOpen", "h", "autoLocationUpdateEnabled", "Lg46$b;", "x", "()Lg46$b;", "logger", "<init>", "(Lcom/uber/autodispose/ScopeProvider;LXR2;LaS2;Le13;)V", "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMerchantLocationPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MerchantLocationPresenter.kt\nco/bird/android/feature/merchant/presenter/MerchantLocationPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,117:1\n180#2:118\n180#2:119\n180#2:120\n180#2:121\n237#2:122\n180#2:123\n180#2:124\n*S KotlinDebug\n*F\n+ 1 MerchantLocationPresenter.kt\nco/bird/android/feature/merchant/presenter/MerchantLocationPresenterImpl\n*L\n42#1:118\n47#1:119\n53#1:120\n60#1:121\n72#1:122\n86#1:123\n93#1:124\n*E\n"})
/* renamed from: TR2 */
/* loaded from: classes3.dex */
public final class TR2 implements InterfaceC52199yR2 {

    /* renamed from: a */
    public final ScopeProvider f35444a;

    /* renamed from: b */
    public final XR2 f35445b;

    /* renamed from: c */
    public final InterfaceC37961aS2 f35446c;

    /* renamed from: d */
    public final InterfaceC40099e13 f35447d;

    /* renamed from: e */
    public final C0058AG<WireMerchantSite> f35448e;

    /* renamed from: f */
    public final ObservableSubscribeProxy<String> f35449f;

    /* renamed from: g */
    public final ObservableSubscribeProxy<Boolean> f35450g;

    /* renamed from: h */
    public final ObservableSubscribeProxy<Boolean> f35451h;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite;", "merchantSite", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantSite;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TR2$a */
    /* loaded from: classes3.dex */
    public static final class C7829a extends Lambda implements Function1<WireMerchantSite, String> {

        /* renamed from: g */
        public static final C7829a f35452g = new C7829a();

        public C7829a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(WireMerchantSite merchantSite) {
            Intrinsics.checkNotNullParameter(merchantSite, "merchantSite");
            return C51916xx1.f118396a.m4410b(merchantSite.getAddress(), merchantSite.getCity(), merchantSite.getState(), merchantSite.getCountry(), merchantSite.getZip());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite;", "site", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantSite;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TR2$b */
    /* loaded from: classes3.dex */
    public static final class C7830b extends Lambda implements Function1<WireMerchantSite, Boolean> {

        /* renamed from: g */
        public static final C7830b f35453g = new C7830b();

        public C7830b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(WireMerchantSite site) {
            Intrinsics.checkNotNullParameter(site, "site");
            return Boolean.valueOf(site.getAutoLocationUpdatesEnabled());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite;", "site", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantSite;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TR2$c */
    /* loaded from: classes3.dex */
    public static final class C7831c extends Lambda implements Function1<WireMerchantSite, Boolean> {

        /* renamed from: g */
        public static final C7831c f35454g = new C7831c();

        public C7831c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(WireMerchantSite site) {
            Intrinsics.checkNotNullParameter(site, "site");
            return Boolean.valueOf(site.getOpen());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "checked", "Lio/reactivex/B;", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TR2$d */
    /* loaded from: classes3.dex */
    public static final class C7832d extends Lambda implements Function1<Boolean, InterfaceC23434B<? extends Pair<? extends Boolean, ? extends WireMerchantSite>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000 \u0004*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite;", "it", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantSite;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: TR2$d$a */
        /* loaded from: classes3.dex */
        public static final class C7833a extends Lambda implements Function1<WireMerchantSite, Pair<? extends Boolean, ? extends WireMerchantSite>> {

            /* renamed from: g */
            public final /* synthetic */ Boolean f35456g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7833a(Boolean bool) {
                super(1);
                this.f35456g = bool;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<Boolean, WireMerchantSite> invoke(WireMerchantSite it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new Pair<>(this.f35456g, it);
            }
        }

        public C7832d() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Pair<Boolean, WireMerchantSite>> invoke(Boolean checked) {
            Intrinsics.checkNotNullParameter(checked, "checked");
            C0058AG c0058ag = TR2.this.f35448e;
            final C7833a c7833a = new C7833a(checked);
            return c0058ag.map(new InterfaceC23492o() { // from class: UR2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = TR2.C7832d.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\b\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0007* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireMerchantSite;", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "LHM4;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TR2$e */
    /* loaded from: classes3.dex */
    public static final class C7834e extends Lambda implements Function1<Pair<? extends Boolean, ? extends WireMerchantSite>, InterfaceC23447K<? extends HM4<Object>>> {
        public C7834e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends HM4<Object>> invoke(Pair<Boolean, WireMerchantSite> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Boolean checked = pair.component1();
            WireMerchantSite component2 = pair.component2();
            InterfaceC37961aS2 interfaceC37961aS2 = TR2.this.f35446c;
            String id = component2.getId();
            String id2 = component2.getMerchant().getId();
            Intrinsics.checkNotNullExpressionValue(checked, "checked");
            return interfaceC37961aS2.mo12342e(id, id2, checked.booleanValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TR2$f */
    /* loaded from: classes3.dex */
    public static final class C7835f extends Lambda implements Function1<HM4<Object>, Unit> {

        /* renamed from: g */
        public static final C7835f f35458g = new C7835f();

        public C7835f() {
            super(1);
        }

        /* renamed from: a */
        public final void m83613a(HM4<Object> hm4) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<Object> hm4) {
            m83613a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TR2$g */
    /* loaded from: classes3.dex */
    public static final class C7836g extends Lambda implements Function1<Throwable, Unit> {
        public C7836g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable error) {
            XR2 xr2 = TR2.this.f35445b;
            Intrinsics.checkNotNullExpressionValue(error, "error");
            xr2.error(error);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/B;", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TR2$h */
    /* loaded from: classes3.dex */
    public static final class C7837h extends Lambda implements Function1<Unit, InterfaceC23434B<? extends WireMerchantSite>> {
        public C7837h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends WireMerchantSite> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return TR2.this.f35448e;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "merchantSite", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantSite;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TR2$i */
    /* loaded from: classes3.dex */
    public static final class C7838i extends Lambda implements Function1<WireMerchantSite, Unit> {
        public C7838i() {
            super(1);
        }

        /* renamed from: a */
        public final void m83612a(WireMerchantSite wireMerchantSite) {
            TR2.this.f35447d.mo37091T1(wireMerchantSite.getId(), wireMerchantSite.getMerchant().getId(), wireMerchantSite.getLocation());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireMerchantSite wireMerchantSite) {
            m83612a(wireMerchantSite);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireMerchantSite;", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TR2$j */
    /* loaded from: classes3.dex */
    public static final class C7839j extends Lambda implements Function1<Optional<WireMerchantSite>, Boolean> {

        /* renamed from: g */
        public static final C7839j f35462g = new C7839j();

        public C7839j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<WireMerchantSite> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/wire/WireMerchantSite;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/model/wire/WireMerchantSite;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TR2$k */
    /* loaded from: classes3.dex */
    public static final class C7840k extends Lambda implements Function1<Optional<WireMerchantSite>, WireMerchantSite> {

        /* renamed from: g */
        public static final C7840k f35463g = new C7840k();

        public C7840k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WireMerchantSite invoke(Optional<WireMerchantSite> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m59038b();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TR2$l */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C7841l extends FunctionReferenceImpl implements Function1<WireMerchantSite, Unit> {
        public C7841l(Object obj) {
            super(1, obj, C0058AG.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        /* renamed from: a */
        public final void m83609a(WireMerchantSite p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C0058AG) this.receiver).accept(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireMerchantSite wireMerchantSite) {
            m83609a(wireMerchantSite);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TR2$m */
    /* loaded from: classes3.dex */
    public static final class C7842m extends Lambda implements Function1<Throwable, Unit> {
        public C7842m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            TR2.this.f35447d.close();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TR2$n */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C7843n extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C7843n(Object obj) {
            super(1, obj, XR2.class, "setMerchantSiteOpen", "setMerchantSiteOpen(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((XR2) this.receiver).mo75071h9(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TR2$o */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C7844o extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        public C7844o(Object obj) {
            super(1, obj, XR2.class, "setAutoLocationUpdateChecked", "setAutoLocationUpdateChecked(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((XR2) this.receiver).mo75073Fj(z);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TR2$p */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C7845p extends FunctionReferenceImpl implements Function1<String, Unit> {
        public C7845p(Object obj) {
            super(1, obj, XR2.class, "setMerchantAddress", "setMerchantAddress(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((XR2) this.receiver).mo75072Yf(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "enabled", "Lio/reactivex/B;", "Lkotlin/Pair;", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TR2$q */
    /* loaded from: classes3.dex */
    public static final class C7846q extends Lambda implements Function1<Boolean, InterfaceC23434B<? extends Pair<? extends Boolean, ? extends WireMerchantSite>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000 \u0004*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite;", "it", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantSite;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: TR2$q$a */
        /* loaded from: classes3.dex */
        public static final class C7847a extends Lambda implements Function1<WireMerchantSite, Pair<? extends Boolean, ? extends WireMerchantSite>> {

            /* renamed from: g */
            public final /* synthetic */ Boolean f35466g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7847a(Boolean bool) {
                super(1);
                this.f35466g = bool;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<Boolean, WireMerchantSite> invoke(WireMerchantSite it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(this.f35466g, it);
            }
        }

        public C7846q() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23434B<? extends Pair<Boolean, WireMerchantSite>> invoke(Boolean enabled) {
            Intrinsics.checkNotNullParameter(enabled, "enabled");
            C0058AG c0058ag = TR2.this.f35448e;
            final C7847a c7847a = new C7847a(enabled);
            return c0058ag.map(new InterfaceC23492o() { // from class: VR2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = TR2.C7846q.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/model/wire/WireMerchantSite;", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: TR2$r */
    /* loaded from: classes3.dex */
    public static final class C7848r extends Lambda implements Function1<Pair<? extends Boolean, ? extends WireMerchantSite>, InterfaceC23496h> {
        public C7848r() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<Boolean, WireMerchantSite> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Boolean enabled = pair.component1();
            WireMerchantSite site = pair.component2();
            TR2 tr2 = TR2.this;
            Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
            boolean booleanValue = enabled.booleanValue();
            Intrinsics.checkNotNullExpressionValue(site, "site");
            return tr2.m83647O(booleanValue, site);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends Boolean, ? extends WireMerchantSite> pair) {
            return invoke2((Pair<Boolean, WireMerchantSite>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "throwable", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: TR2$s */
    /* loaded from: classes3.dex */
    public static final class C7849s extends Lambda implements Function1<Throwable, Unit> {
        public C7849s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable throwable) {
            XR2 xr2 = TR2.this.f35445b;
            Intrinsics.checkNotNullExpressionValue(throwable, "throwable");
            xr2.error(throwable);
            TR2.this.m83622x().mo7221o("Failed to update the merchant-site location-enabled field", new Object[0]);
        }
    }

    public TR2(ScopeProvider scopeProvider, XR2 ui, InterfaceC37961aS2 manager, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f35444a = scopeProvider;
        this.f35445b = ui;
        this.f35446c = manager;
        this.f35447d = navigator;
        C0058AG<WireMerchantSite> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<WireMerchantSite>()");
        this.f35448e = m115951g;
        final C7829a c7829a = C7829a.f35452g;
        Observable observeOn = m115951g.map(new InterfaceC23492o() { // from class: FR2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m83624v;
                m83624v = TR2.m83624v(Function1.this, obj);
                return m83624v;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "merchantSiteRelay.map { …dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        this.f35449f = (ObservableSubscribeProxy) m33094as;
        final C7831c c7831c = C7831c.f35454g;
        Observable observeOn2 = m115951g.map(new InterfaceC23492o() { // from class: GR2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m83621y;
                m83621y = TR2.m83621y(Function1.this, obj);
                return m83621y;
            }
        }).distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "merchantSiteRelay.map { …dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        this.f35450g = (ObservableSubscribeProxy) m33094as2;
        final C7830b c7830b = C7830b.f35453g;
        Observable observeOn3 = m115951g.map(new InterfaceC23492o() { // from class: HR2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m83623w;
                m83623w = TR2.m83623w(Function1.this, obj);
                return m83623w;
            }
        }).distinctUntilChanged().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "merchantSiteRelay\n    .m…dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(scopeProvider));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        this.f35451h = (ObservableSubscribeProxy) m33094as3;
    }

    /* renamed from: A */
    public static final InterfaceC23496h m83661A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final InterfaceC23434B m83660B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final InterfaceC23447K m83659C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final void m83658D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E */
    public static final void m83657E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final InterfaceC23434B m83656F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m83655G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final boolean m83654H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: I */
    public static final WireMerchantSite m83653I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireMerchantSite) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m83652J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m83651K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final void m83650L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final void m83649M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final void m83648N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m83646P(TR2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m83622x().mo7221o("Successfully updated the merchant-site autoLocationEnabled field", new Object[0]);
    }

    /* renamed from: Q */
    public static final void m83645Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final String m83624v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final Boolean m83623w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final Boolean m83621y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final InterfaceC23434B m83620z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: O */
    public final AbstractC23461c m83647O(boolean z, WireMerchantSite wireMerchantSite) {
        AbstractC23461c m33029z = this.f35446c.mo12340g(wireMerchantSite.getId(), wireMerchantSite.getMerchant().getId(), z).m33070P(C23454a.m33087a()).m33029z(new InterfaceC23478a() { // from class: IR2
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                TR2.m83646P(TR2.this);
            }
        });
        final C7849s c7849s = new C7849s();
        AbstractC23461c m33069Q = m33029z.m33084B(new InterfaceC23484g() { // from class: JR2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TR2.m83645Q(Function1.this, obj);
            }
        }).m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "private fun sendAutoLoca…\n      .onErrorComplete()");
        return m33069Q;
    }

    @Override // p000.InterfaceC52199yR2
    /* renamed from: a */
    public void mo3500a() {
        Observable<Optional<WireMerchantSite>> distinctUntilChanged = this.f35446c.mo12344c().distinctUntilChanged();
        final C7839j c7839j = C7839j.f35462g;
        Observable<Optional<WireMerchantSite>> filter = distinctUntilChanged.filter(new InterfaceC23494q() { // from class: zR2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m83654H;
                m83654H = TR2.m83654H(Function1.this, obj);
                return m83654H;
            }
        });
        final C7840k c7840k = C7840k.f35463g;
        Observable<R> map = filter.map(new InterfaceC23492o() { // from class: PR2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireMerchantSite m83653I;
                m83653I = TR2.m83653I(Function1.this, obj);
                return m83653I;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "manager.currentStore\n   …}\n      .map { it.get() }");
        Object m33094as = map.m33094as(AutoDispose.m45239a(this.f35444a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7841l c7841l = new C7841l(this.f35448e);
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: QR2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TR2.m83652J(Function1.this, obj);
            }
        };
        final C7842m c7842m = new C7842m();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: RR2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TR2.m83651K(Function1.this, obj);
            }
        });
        ObservableSubscribeProxy<Boolean> observableSubscribeProxy = this.f35450g;
        final C7843n c7843n = new C7843n(this.f35445b);
        observableSubscribeProxy.subscribe(new InterfaceC23484g() { // from class: SR2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TR2.m83650L(Function1.this, obj);
            }
        });
        ObservableSubscribeProxy<Boolean> observableSubscribeProxy2 = this.f35451h;
        final C7844o c7844o = new C7844o(this.f35445b);
        observableSubscribeProxy2.subscribe(new InterfaceC23484g() { // from class: AR2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TR2.m83649M(Function1.this, obj);
            }
        });
        ObservableSubscribeProxy<String> observableSubscribeProxy3 = this.f35449f;
        final C7845p c7845p = new C7845p(this.f35445b);
        observableSubscribeProxy3.subscribe(new InterfaceC23484g() { // from class: BR2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TR2.m83648N(Function1.this, obj);
            }
        });
        Observable<Boolean> mo75069r5 = this.f35445b.mo75069r5();
        final C7846q c7846q = new C7846q();
        Observable<R> flatMap = mo75069r5.flatMap(new InterfaceC23492o() { // from class: CR2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m83620z;
                m83620z = TR2.m83620z(Function1.this, obj);
                return m83620z;
            }
        });
        final C7848r c7848r = new C7848r();
        AbstractC23461c switchMapCompletable = flatMap.switchMapCompletable(new InterfaceC23492o() { // from class: DR2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m83661A;
                m83661A = TR2.m83661A(Function1.this, obj);
                return m83661A;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapCompletable, "override fun onCreate() …ion\n        )\n      }\n  }");
        Object m33041n = switchMapCompletable.m33041n(AutoDispose.m45239a(this.f35444a));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Observable<Boolean> mo75074Bf = this.f35445b.mo75074Bf();
        final C7832d c7832d = new C7832d();
        Observable<R> flatMap2 = mo75074Bf.flatMap(new InterfaceC23492o() { // from class: ER2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m83660B;
                m83660B = TR2.m83660B(Function1.this, obj);
                return m83660B;
            }
        });
        final C7834e c7834e = new C7834e();
        Observable flatMapSingle = flatMap2.flatMapSingle(new InterfaceC23492o() { // from class: KR2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m83659C;
                m83659C = TR2.m83659C(Function1.this, obj);
                return m83659C;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "override fun onCreate() …ion\n        )\n      }\n  }");
        Object m33094as2 = flatMapSingle.m33094as(AutoDispose.m45239a(this.f35444a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7835f c7835f = C7835f.f35458g;
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: LR2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TR2.m83658D(Function1.this, obj);
            }
        };
        final C7836g c7836g = new C7836g();
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: MR2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TR2.m83657E(Function1.this, obj);
            }
        });
        Observable<Unit> mo75070j8 = this.f35445b.mo75070j8();
        final C7837h c7837h = new C7837h();
        Observable<R> flatMap3 = mo75070j8.flatMap(new InterfaceC23492o() { // from class: NR2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m83656F;
                m83656F = TR2.m83656F(Function1.this, obj);
                return m83656F;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMap3, "override fun onCreate() …ion\n        )\n      }\n  }");
        Object m33094as3 = flatMap3.m33094as(AutoDispose.m45239a(this.f35444a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7838i c7838i = new C7838i();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: OR2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                TR2.m83655G(Function1.this, obj);
            }
        });
    }

    /* renamed from: x */
    public final C41318g46.AbstractC20723b m83622x() {
        C41318g46.AbstractC20723b m40153k = C41318g46.m40153k("merchant-location-presenter");
        Intrinsics.checkNotNullExpressionValue(m40153k, "tag(\"merchant-location-presenter\")");
        return m40153k;
    }
}
