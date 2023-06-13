package p000;

import co.bird.android.buava.Optional;
import co.bird.android.model.Balance;
import co.bird.api.response.AutoReloadConfig;
import co.bird.api.response.ReloadConfigResponse;
import co.bird.api.response.ReloadOption;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C8473Us;
import p000.InterfaceC40099e13;
import p000.InterfaceC44647lh6;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB)\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, m28432d2 = {"LUs;", "Lf1;", "LYs;", "LXs;", "renderer", "", "y", "Le13;", "e", "Le13;", "navigator", "LVM3;", "f", "LVM3;", "paymentManagerV3", "LTq4;", "g", "LTq4;", "reactiveConfig", "Llh6;", "h", "Llh6;", "userManager", "", "i", "Ljava/lang/String;", "optionIdSelected", "<init>", "(Le13;LVM3;LTq4;Llh6;)V", "j", C17296a.f69688o, "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAutoReloadV2OptionsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoReloadV2OptionsPresenter.kt\nco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2OptionsPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,201:1\n180#2:202\n180#2:203\n237#2:204\n180#2:205\n180#2:206\n*S KotlinDebug\n*F\n+ 1 AutoReloadV2OptionsPresenter.kt\nco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2OptionsPresenter\n*L\n37#1:202\n62#1:203\n174#1:204\n178#1:205\n185#1:206\n*E\n"})
/* renamed from: Us */
/* loaded from: classes3.dex */
public final class C8473Us extends AbstractC20169f1<InterfaceC10042Ys, InterfaceC9534Xs> {

    /* renamed from: j */
    public static final C8474a f38151j = new C8474a(null);

    /* renamed from: e */
    public final InterfaceC40099e13 f38152e;

    /* renamed from: f */
    public final VM3 f38153f;

    /* renamed from: g */
    public final C36207Tq4 f38154g;

    /* renamed from: h */
    public final InterfaceC44647lh6 f38155h;

    /* renamed from: i */
    public String f38156i;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, m28432d2 = {"LUs$a;", "", "", "AUTO_PAY_PLAN_WITHOUT_OPTION_ID", "Ljava/lang/String;", "PAYMENT_TERMS_URL_FALLBACK", "PREFIX_AUTO_RELOAD_OPTION", "<init>", "()V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Us$a */
    /* loaded from: classes3.dex */
    public static final class C8474a {
        public /* synthetic */ C8474a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C8474a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Us$c */
    /* loaded from: classes3.dex */
    public static final class C8477c extends Lambda implements Function1<Unit, Unit> {
        public C8477c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C8473Us.this.m42280h(W41.f40370a);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*$\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lco/bird/api/response/ReloadConfigResponse;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Us$d */
    /* loaded from: classes3.dex */
    public static final class C8478d extends Lambda implements Function1<Pair<? extends Unit, ? extends Optional<ReloadConfigResponse>>, Unit> {
        public C8478d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends Optional<ReloadConfigResponse>> pair) {
            invoke2((Pair<Unit, Optional<ReloadConfigResponse>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, Optional<ReloadConfigResponse>> pair) {
            ReloadConfigResponse m59035e = pair.component2().m59035e();
            String str = (m59035e == null || (r8 = m59035e.getReloadTermsArticle()) == null) ? "https://www.bird.co/terms/" : "https://www.bird.co/terms/";
            try {
                C8473Us.this.f38152e.mo36922w3(Long.parseLong(str));
            } catch (NumberFormatException e) {
                C41318g46.m40159e(e);
                InterfaceC40099e13.C19924a.goToWebView$default(C8473Us.this.f38152e, str, null, null, false, 14, null);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/api/response/ReloadOption;", "kotlin.jvm.PlatformType", "autoReloadPlanOptional", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Us$e */
    /* loaded from: classes3.dex */
    public static final class C8479e extends Lambda implements Function1<Optional<ReloadOption>, Unit> {
        public C8479e() {
            super(1);
        }

        /* renamed from: a */
        public final void m80708a(Optional<ReloadOption> optional) {
            C8473Us c8473Us = C8473Us.this;
            ReloadOption m59035e = optional.m59035e();
            c8473Us.f38156i = m59035e != null ? m59035e.getId() : null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<ReloadOption> optional) {
            m80708a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/api/response/ReloadConfigResponse;", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Us$f */
    /* loaded from: classes3.dex */
    public static final class C8480f extends Lambda implements Function1<Optional<ReloadConfigResponse>, Boolean> {

        /* renamed from: g */
        public static final C8480f f38162g = new C8480f();

        public C8480f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<ReloadConfigResponse> it) {
            String str;
            boolean z;
            AutoReloadConfig autoReload;
            ReloadOption currentOption;
            Intrinsics.checkNotNullParameter(it, "it");
            ReloadConfigResponse m59035e = it.m59035e();
            if (m59035e != null && (autoReload = m59035e.getAutoReload()) != null && (currentOption = autoReload.getCurrentOption()) != null) {
                str = currentOption.getId();
            } else {
                str = null;
            }
            if (str != null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/Balance;", "userBalance", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Us$g */
    /* loaded from: classes3.dex */
    public static final class C8481g extends Lambda implements Function1<Optional<Balance>, Boolean> {

        /* renamed from: g */
        public static final C8481g f38163g = new C8481g();

        public C8481g() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
            if (r4 > 0) goto L15;
         */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean invoke(Optional<Balance> userBalance) {
            boolean z;
            int i;
            Integer autoPayRefillAmount;
            Intrinsics.checkNotNullParameter(userBalance, "userBalance");
            Balance m59035e = userBalance.m59035e();
            boolean z2 = false;
            if (m59035e != null) {
                z = Intrinsics.areEqual(m59035e.getAutoPayActive(), Boolean.TRUE);
            } else {
                z = false;
            }
            if (!z) {
                Balance m59035e2 = userBalance.m59035e();
                if (m59035e2 != null && (autoPayRefillAmount = m59035e2.getAutoPayRefillAmount()) != null) {
                    i = autoPayRefillAmount.intValue();
                } else {
                    i = 0;
                }
            }
            z2 = true;
            return Boolean.valueOf(z2);
        }
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\f\u001a\u00020\t2\u009b\u0001\u0010\b\u001a\u0096\u0001\u0012*\u0012(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00020\u0002 \u0005*J\u0012*\u0012(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00020\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lkotlin/Pair;", "Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "Lco/bird/api/response/ReloadConfigResponse;", "", "kotlin.jvm.PlatformType", "LDs;", "Lco/bird/android/model/Balance;", "<name for destructuring parameter 0>", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAutoReloadV2OptionsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoReloadV2OptionsPresenter.kt\nco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2OptionsPresenter$consume$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n1559#2:202\n1590#2,4:203\n1#3:207\n*S KotlinDebug\n*F\n+ 1 AutoReloadV2OptionsPresenter.kt\nco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2OptionsPresenter$consume$5\n*L\n70#1:202\n70#1:203,4\n*E\n"})
    /* renamed from: Us$i */
    /* loaded from: classes3.dex */
    public static final class C8483i extends Lambda implements Function1<Pair<? extends Triple<? extends Optional<ReloadConfigResponse>, ? extends Boolean, ? extends Optional<C1630Ds>>, ? extends Optional<Balance>>, Unit> {
        public C8483i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Triple<? extends Optional<ReloadConfigResponse>, ? extends Boolean, ? extends Optional<C1630Ds>>, ? extends Optional<Balance>> pair) {
            invoke2((Pair<Triple<Optional<ReloadConfigResponse>, Boolean, Optional<C1630Ds>>, Optional<Balance>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Triple<Optional<ReloadConfigResponse>, Boolean, Optional<C1630Ds>>, Optional<Balance>> pair) {
            String currency;
            List<ReloadOption> emptyList;
            int collectionSizeOrDefault;
            String str;
            Integer autoPayRefillAmount;
            List list;
            AutoReloadConfig autoReload;
            AutoReloadConfig autoReload2;
            Triple<Optional<ReloadConfigResponse>, Boolean, Optional<C1630Ds>> component1 = pair.component1();
            Optional<Balance> component2 = pair.component2();
            Optional<ReloadConfigResponse> component12 = component1.component1();
            Boolean includeAutoReloadOptions = component1.component2();
            Optional<C1630Ds> component3 = component1.component3();
            ReloadConfigResponse m59035e = component12.m59035e();
            if (m59035e == null || (currency = m59035e.getCurrency()) == null) {
                currency = C8473Us.this.f38154g.m82623f8().m73665a().getRideConfig().getCurrency();
            }
            ReloadConfigResponse m59035e2 = component12.m59035e();
            ReloadOption currentOption = (m59035e2 == null || (autoReload2 = m59035e2.getAutoReload()) == null) ? null : autoReload2.getCurrentOption();
            C1630Ds m59035e3 = component3.m59035e();
            String m109840e = m59035e3 != null ? m59035e3.m109840e() : null;
            ReloadConfigResponse m59035e4 = component12.m59035e();
            if (m59035e4 == null || (autoReload = m59035e4.getAutoReload()) == null || (emptyList = autoReload.getOptions()) == null) {
                emptyList = CollectionsKt__CollectionsKt.emptyList();
            }
            List<ReloadOption> list2 = emptyList;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            int i = 0;
            for (Object obj : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                ReloadOption reloadOption = (ReloadOption) obj;
                if (reloadOption.getId() == null) {
                    reloadOption = ReloadOption.copy$default(reloadOption, "_autoreload_option_id_client_provided_" + i, 0L, null, null, null, null, 62, null);
                }
                arrayList.add(reloadOption);
                i = i2;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(arrayList);
            if ((currentOption != null ? currentOption.getId() : null) != null) {
                if (currentOption != null) {
                    linkedHashSet.add(currentOption);
                }
                str = currentOption.getId();
            } else if ((currentOption != null ? Long.valueOf(currentOption.getAmount()) : null) != null && currentOption.getAmount() > 0) {
                ReloadOption copy$default = ReloadOption.copy$default(currentOption, "[auto_pay_plan_in_auto_reload_v2]", 0L, null, null, null, null, 62, null);
                linkedHashSet.add(copy$default);
                C8473Us.this.f38156i = copy$default.getId();
                str = copy$default.getId();
            } else {
                Balance m59035e5 = component2.m59035e();
                if (m59035e5 != null && (autoPayRefillAmount = m59035e5.getAutoPayRefillAmount()) != null) {
                    if (!(autoPayRefillAmount.intValue() > 0)) {
                        autoPayRefillAmount = null;
                    }
                    if (autoPayRefillAmount != null) {
                        C8473Us c8473Us = C8473Us.this;
                        linkedHashSet.add(new ReloadOption("[auto_pay_plan_in_auto_reload_v2]", autoPayRefillAmount.intValue(), null, null, null, null));
                        str = "[auto_pay_plan_in_auto_reload_v2]";
                        c8473Us.f38156i = "[auto_pay_plan_in_auto_reload_v2]";
                    }
                }
                str = null;
            }
            list = CollectionsKt___CollectionsKt.toList(linkedHashSet);
            int size = list.size() / 2;
            if (m109840e == null) {
                m109840e = currentOption != null ? currentOption.getId() : null;
                if (m109840e == null) {
                    if (str == null) {
                        ReloadOption reloadOption2 = (ReloadOption) list.get(size);
                        String id = reloadOption2 != null ? reloadOption2.getId() : null;
                        m109840e = id == null ? "" : id;
                    } else {
                        m109840e = str;
                    }
                }
            }
            C8473Us c8473Us2 = C8473Us.this;
            Intrinsics.checkNotNullExpressionValue(includeAutoReloadOptions, "includeAutoReloadOptions");
            c8473Us2.m42280h(new C31578zs(includeAutoReloadOptions.booleanValue(), currency, list, m109840e));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "LDs;", "optional", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Us$j */
    /* loaded from: classes3.dex */
    public static final class C8484j extends Lambda implements Function1<Optional<C1630Ds>, Boolean> {

        /* renamed from: g */
        public static final C8484j f38166g = new C8484j();

        public C8484j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<C1630Ds> optional) {
            Intrinsics.checkNotNullParameter(optional, "optional");
            return Boolean.valueOf(optional.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "autoReloadEnabled", "Lco/bird/android/buava/Optional;", "LDs;", "modelSelectedOptional", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Boolean;Lco/bird/android/buava/Optional;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Us$k */
    /* loaded from: classes3.dex */
    public static final class C8485k extends Lambda implements Function2<Boolean, Optional<C1630Ds>, Pair<? extends Boolean, ? extends Optional<C1630Ds>>> {

        /* renamed from: g */
        public static final C8485k f38167g = new C8485k();

        public C8485k() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Pair<Boolean, Optional<C1630Ds>> invoke(Boolean autoReloadEnabled, Optional<C1630Ds> modelSelectedOptional) {
            Intrinsics.checkNotNullParameter(autoReloadEnabled, "autoReloadEnabled");
            Intrinsics.checkNotNullParameter(modelSelectedOptional, "modelSelectedOptional");
            return TuplesKt.m28425to(autoReloadEnabled, modelSelectedOptional);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \u0004*\u0016\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/buava/Optional;", "LDs;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lkotlin/Pair;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Us$m */
    /* loaded from: classes3.dex */
    public static final class C8487m extends Lambda implements Function1<Pair<? extends Boolean, ? extends Optional<C1630Ds>>, Unit> {
        public C8487m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends Optional<C1630Ds>> pair) {
            invoke2((Pair<Boolean, Optional<C1630Ds>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, Optional<C1630Ds>> pair) {
            C8473Us.this.m42280h(new C33190Gt2(true));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8473Us(InterfaceC40099e13 navigator, VM3 paymentManagerV3, C36207Tq4 reactiveConfig, InterfaceC44647lh6 userManager) {
        super(C43073j22.f92032a);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(paymentManagerV3, "paymentManagerV3");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        this.f38152e = navigator;
        this.f38153f = paymentManagerV3;
        this.f38154g = reactiveConfig;
        this.f38155h = userManager;
    }

    /* renamed from: A */
    public static final void m80737A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m80736B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final Boolean m80735C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public static final boolean m80734D(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: E */
    public static final void m80733E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final boolean m80732F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: G */
    public static final Pair m80731G(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Pair) tmp0.invoke(obj, obj2);
    }

    /* renamed from: H */
    public static final boolean m80730H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: I */
    public static final void m80729I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final InterfaceC23496h m80728J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: f */
    public static final void m80727f(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final Boolean m80713z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: y */
    public void consume(InterfaceC10042Ys renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Object m33094as = this.f38153f.mo25715t().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8479e c8479e = new C8479e();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: Is
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C8473Us.m80727f(Function1.this, obj);
            }
        });
        C24523e c24523e = C24523e.f91168a;
        Z84<Optional<ReloadConfigResponse>> mo25737i = this.f38153f.mo25737i();
        Observable<Boolean> mo57763Y2 = renderer.mo57763Y2();
        Z84<Optional<ReloadConfigResponse>> mo25737i2 = this.f38153f.mo25737i();
        final C8480f c8480f = C8480f.f38162g;
        InterfaceC23434B map = mo25737i2.map(new InterfaceC23492o() { // from class: Ns
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m80713z;
                m80713z = C8473Us.m80713z(Function1.this, obj);
                return m80713z;
            }
        });
        Z84<Optional<Balance>> mo26977K = this.f38155h.mo26977K();
        final C8481g c8481g = C8481g.f38163g;
        Observable distinctUntilChanged = Observable.merge(mo57763Y2, map, mo26977K.map(new InterfaceC23492o() { // from class: Os
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m80735C;
                m80735C = C8473Us.m80735C(Function1.this, obj);
                return m80735C;
            }
        })).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "merge(\n        renderer.… ).distinctUntilChanged()");
        Observable m31950a = C24527f.m31950a(c24523e.m31955b(mo25737i, distinctUntilChanged, renderer.mo57773E1()), this.f38155h.mo26977K());
        final C8482h c8482h = C8482h.f38164g;
        Observable filter = m31950a.filter(new InterfaceC23494q() { // from class: Ps
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m80734D;
                m80734D = C8473Us.m80734D(Function1.this, obj);
                return m80734D;
            }
        });
        Intrinsics.checkNotNullExpressionValue(filter, "Observables.combineLates…PayActive == true\n      }");
        Object m33094as2 = filter.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8483i c8483i = new C8483i();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Qs
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C8473Us.m80733E(Function1.this, obj);
            }
        });
        Observable<Boolean> mo57763Y22 = renderer.mo57763Y2();
        Observable<Optional<C1630Ds>> mo57773E1 = renderer.mo57773E1();
        final C8484j c8484j = C8484j.f38166g;
        Observable<Optional<C1630Ds>> filter2 = mo57773E1.filter(new InterfaceC23494q() { // from class: Rs
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m80732F;
                m80732F = C8473Us.m80732F(Function1.this, obj);
                return m80732F;
            }
        });
        final C8485k c8485k = C8485k.f38167g;
        Observable distinctUntilChanged2 = Observable.combineLatest(mo57763Y22, filter2, new InterfaceC23480c() { // from class: Ss
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                Pair m80731G;
                m80731G = C8473Us.m80731G(Function2.this, obj, obj2);
                return m80731G;
            }
        }).distinctUntilChanged();
        final C8486l c8486l = new C8486l();
        Observable filter3 = distinctUntilChanged2.filter(new InterfaceC23494q() { // from class: Ts
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m80730H;
                m80730H = C8473Us.m80730H(Function1.this, obj);
                return m80730H;
            }
        });
        final C8487m c8487m = new C8487m();
        Observable doOnNext = filter3.doOnNext(new InterfaceC23484g() { // from class: Js
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C8473Us.m80729I(Function1.this, obj);
            }
        });
        final C8475b c8475b = new C8475b();
        AbstractC23461c flatMapCompletable = doOnNext.flatMapCompletable(new InterfaceC23492o() { // from class: Ks
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m80728J;
                m80728J = C8473Us.m80728J(Function1.this, obj);
                return m80728J;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "override fun consume(ren…rl)\n        }\n      }\n  }");
        Object m33041n = flatMapCompletable.m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Object m33094as3 = renderer.mo57772J0().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8477c c8477c = new C8477c();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: Ls
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C8473Us.m80737A(Function1.this, obj);
            }
        });
        Object m33094as4 = C24527f.m31950a(renderer.mo57771O0(), this.f38153f.mo25737i()).m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C8478d c8478d = new C8478d();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: Ms
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C8473Us.m80736B(Function1.this, obj);
            }
        });
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/buava/Optional;", "LDs;", "<name for destructuring parameter 0>", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAutoReloadV2OptionsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoReloadV2OptionsPresenter.kt\nco/bird/android/feature/payment/preload/v2/autoreload/AutoReloadV2OptionsPresenter$consume$8\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,201:1\n1#2:202\n*E\n"})
    /* renamed from: Us$l */
    /* loaded from: classes3.dex */
    public static final class C8486l extends Lambda implements Function1<Pair<? extends Boolean, ? extends Optional<C1630Ds>>, Boolean> {
        public C8486l() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Boolean, Optional<C1630Ds>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Boolean valueOf = Boolean.valueOf((pair.component1().booleanValue() && Intrinsics.areEqual(C8473Us.this.f38156i, pair.component2().m59038b().m109840e())) ? false : true);
            C8473Us c8473Us = C8473Us.this;
            valueOf.booleanValue();
            c8473Us.f38156i = null;
            return valueOf;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Boolean, ? extends Optional<C1630Ds>> pair) {
            return invoke2((Pair<Boolean, Optional<C1630Ds>>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u00020\u00042L\u0010\b\u001aH\u0012*\u0012(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Pair;", "Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "Lco/bird/api/response/ReloadConfigResponse;", "", "kotlin.jvm.PlatformType", "LDs;", "Lco/bird/android/model/Balance;", "<name for destructuring parameter 0>", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Us$h */
    /* loaded from: classes3.dex */
    public static final class C8482h extends Lambda implements Function1<Pair<? extends Triple<? extends Optional<ReloadConfigResponse>, ? extends Boolean, ? extends Optional<C1630Ds>>, ? extends Optional<Balance>>, Boolean> {

        /* renamed from: g */
        public static final C8482h f38164g = new C8482h();

        public C8482h() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Triple<Optional<ReloadConfigResponse>, Boolean, Optional<C1630Ds>>, Optional<Balance>> pair) {
            AutoReloadConfig autoReload;
            List<ReloadOption> options;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Optional<Balance> component2 = pair.component2();
            ReloadConfigResponse m59035e = pair.component1().component1().m59035e();
            boolean z = true;
            if (!((m59035e == null || (autoReload = m59035e.getAutoReload()) == null || (options = autoReload.getOptions()) == null || !(options.isEmpty() ^ true)) ? false : true)) {
                Balance m59035e2 = component2.m59035e();
                if (!(m59035e2 != null ? Intrinsics.areEqual(m59035e2.getAutoPayActive(), Boolean.TRUE) : false)) {
                    z = false;
                }
            }
            return Boolean.valueOf(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Triple<? extends Optional<ReloadConfigResponse>, ? extends Boolean, ? extends Optional<C1630Ds>>, ? extends Optional<Balance>> pair) {
            return invoke2((Pair<Triple<Optional<ReloadConfigResponse>, Boolean, Optional<C1630Ds>>, Optional<Balance>>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "", "Lco/bird/android/buava/Optional;", "LDs;", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Us$b */
    /* loaded from: classes3.dex */
    public static final class C8475b extends Lambda implements Function1<Pair<? extends Boolean, ? extends Optional<C1630Ds>>, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: Us$b$a */
        /* loaded from: classes3.dex */
        public static final class C8476a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C8473Us f38158g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8476a(C8473Us c8473Us) {
                super(1);
                this.f38158g = c8473Us;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable it) {
                C41318g46.m40159e(it);
                this.f38158g.m42280h(new C33190Gt2(false));
                C8473Us c8473Us = this.f38158g;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                c8473Us.m42280h(new C43446jg1(it));
            }
        }

        public C8475b() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC23496h m80710c(C8473Us this$0) {
            List listOf;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{this$0.f38153f.mo25779A(), InterfaceC44647lh6.C25764a.fetchBalance$default(this$0.f38155h, null, 1, null).m33159G()});
            return AbstractC23461c.m33037r(listOf);
        }

        /* renamed from: d */
        public static final void m80709d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<Boolean, Optional<C1630Ds>> pair) {
            C1630Ds m59035e;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Boolean autoReloadToggled = pair.component1();
            Optional<C1630Ds> component2 = pair.component2();
            C1630Ds m59035e2 = component2.m59035e();
            String str = null;
            String m109840e = m59035e2 != null ? m59035e2.m109840e() : null;
            if (autoReloadToggled.booleanValue() && !Intrinsics.areEqual(m109840e, "[auto_pay_plan_in_auto_reload_v2]") && (m59035e = component2.m59035e()) != null) {
                str = m59035e.m109840e();
            }
            VM3 vm3 = C8473Us.this.f38153f;
            Intrinsics.checkNotNullExpressionValue(autoReloadToggled, "autoReloadToggled");
            AbstractC23461c mo25719r = vm3.mo25719r(str, autoReloadToggled.booleanValue());
            final C8473Us c8473Us = C8473Us.this;
            AbstractC23461c m33070P = mo25719r.m33049i(AbstractC23461c.m33035t(new Callable() { // from class: Vs
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23496h m80710c;
                    m80710c = C8473Us.C8475b.m80710c(C8473Us.this);
                    return m80710c;
                }
            })).m33070P(C23454a.m33087a());
            final C8476a c8476a = new C8476a(C8473Us.this);
            return m33070P.m33084B(new InterfaceC23484g() { // from class: Ws
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C8473Us.C8475b.m80709d(Function1.this, obj);
                }
            }).m33069Q();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends Boolean, ? extends Optional<C1630Ds>> pair) {
            return invoke2((Pair<Boolean, Optional<C1630Ds>>) pair);
        }
    }
}
