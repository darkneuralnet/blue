package p000;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.Balance;
import co.bird.android.model.constant.PaymentInfoBank;
import co.bird.android.model.constant.PaymentInfoParams;
import co.bird.android.model.constant.PaymentMethod;
import co.bird.android.model.wire.configs.BankRedirectConfig;
import co.bird.api.request.BankRedirectOneTimeRefillResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C7647T6;
import p000.InterfaceC40099e13;
import p000.InterfaceC44647lh6;
@Metadata(m28433d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BO\b\u0007\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&¢\u0006\u0004\b7\u00108J\u0006\u0010\u0003\u001a\u00020\u0002J \u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u00106\u001a\u0010\u0012\f\u0012\n 4*\u0004\u0018\u00010\u00020\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00105¨\u00069"}, m28432d2 = {"LT6;", "", "", "l", "", "requestCode", "resultCode", "Landroid/content/Intent;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "k", "Le13;", C17296a.f69688o, "Le13;", "navigator", "LVM3;", "b", "LVM3;", "paymentManagerV3", "Lco/bird/android/model/constant/PaymentMethod;", "c", "Lco/bird/android/model/constant/PaymentMethod;", "paymentMethod", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LTq4;", "e", "LTq4;", "reactiveConfig", "LX6;", "f", "LX6;", "ui", "Llh6;", "g", "Llh6;", "userManager", "Lco/bird/android/buava/Optional;", "Lc04;", "h", "Lco/bird/android/buava/Optional;", "preselectedPreloadAmount", "", "i", "Z", "justCreated", "Lh04;", "j", "Lh04;", "converter", "Lma4;", "kotlin.jvm.PlatformType", "Lma4;", "addBalanceClickTrigger", "<init>", "(Le13;LVM3;Lco/bird/android/model/constant/PaymentMethod;Lcom/uber/autodispose/ScopeProvider;LTq4;LX6;Llh6;Lco/bird/android/buava/Optional;)V", "co.bird.android.feature.payment"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAddBalancePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddBalancePresenter.kt\nco/bird/android/feature/payment/bankredirect/AddBalancePresenter\n+ 2 Observables.kt\nco/bird/android/library/rx/Observables\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,170:1\n52#2,2:171\n180#3:173\n199#3:174\n180#3:175\n180#3:176\n*S KotlinDebug\n*F\n+ 1 AddBalancePresenter.kt\nco/bird/android/feature/payment/bankredirect/AddBalancePresenter\n*L\n48#1:171,2\n53#1:173\n77#1:174\n133#1:175\n145#1:176\n*E\n"})
/* renamed from: T6 */
/* loaded from: classes3.dex */
public final class C7647T6 {

    /* renamed from: a */
    public final InterfaceC40099e13 f34764a;

    /* renamed from: b */
    public final VM3 f34765b;

    /* renamed from: c */
    public final PaymentMethod f34766c;

    /* renamed from: d */
    public final ScopeProvider f34767d;

    /* renamed from: e */
    public final C36207Tq4 f34768e;

    /* renamed from: f */
    public final InterfaceC9297X6 f34769f;

    /* renamed from: g */
    public final InterfaceC44647lh6 f34770g;

    /* renamed from: h */
    public final Optional<C38887c04> f34771h;

    /* renamed from: i */
    public boolean f34772i;

    /* renamed from: j */
    public final C41869h04 f34773j;

    /* renamed from: k */
    public final C45168ma4<Unit> f34774k;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"T1", "T2", "t1", "t2", "Lkotlin/Pair;", C17296a.f69688o, "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nco/bird/android/library/rx/Observables$combineLatest$1\n*L\n1#1,134:1\n*E\n"})
    /* renamed from: T6$a */
    /* loaded from: classes3.dex */
    public static final class C7648a<T1, T2, R> implements InterfaceC23480c {

        /* renamed from: a */
        public static final C7648a<T1, T2, R> f34775a = new C7648a<>();

        @Override // io.reactivex.functions.InterfaceC23480c
        /* renamed from: a */
        public final Pair<T1, T2> apply(T1 t1, T2 t2) {
            return TuplesKt.m28425to(t1, t2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/wire/configs/BankRedirectConfig;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: T6$b */
    /* loaded from: classes3.dex */
    public static final class C7649b extends Lambda implements Function1<Pair<? extends BankRedirectConfig, ? extends String>, Unit> {
        public C7649b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends BankRedirectConfig, ? extends String> pair) {
            invoke2((Pair<BankRedirectConfig, String>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<BankRedirectConfig, String> pair) {
            String str;
            List<C3023H6> m37233a;
            BankRedirectConfig component1 = pair.component1();
            String component2 = pair.component2();
            Long minBalanceToRide = component1.getMinBalanceToRide();
            if (minBalanceToRide != null) {
                str = C51916xx1.f118396a.m4408d(minBalanceToRide.longValue(), C45097mS5.m25591o(component2), EnumC36501Ux1.SHOW_IF_NON_ZERO);
            } else {
                str = null;
            }
            if (str != null) {
                C7647T6.this.f34769f.mo75745e3(str);
            } else {
                C7647T6.this.f34769f.mo75746ah();
            }
            if (C7647T6.this.f34771h.m59037c()) {
                m37233a = C7647T6.this.f34773j.m37232b((C38887c04) C7647T6.this.f34771h.m59038b());
            } else {
                m37233a = C7647T6.this.f34773j.m37233a(component1.getReloadOptions(), component2);
            }
            C7647T6.this.f34769f.mo75751Aj(m37233a);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/Balance;", "kotlin.jvm.PlatformType", "balance", "", C17296a.f69688o, "(Lco/bird/android/model/Balance;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: T6$c */
    /* loaded from: classes3.dex */
    public static final class C7650c extends Lambda implements Function1<Balance, Unit> {
        public C7650c() {
            super(1);
        }

        /* renamed from: a */
        public final void m84328a(Balance balance) {
            C7647T6.this.f34769f.mo75743pk(C51916xx1.currency$default(C51916xx1.f118396a, balance.getBalance(), C45097mS5.m25591o(balance.getCurrency()), null, 4, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Balance balance) {
            m84328a(balance);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "error", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: T6$d */
    /* loaded from: classes3.dex */
    public static final class C7651d extends Lambda implements Function1<Throwable, Unit> {
        public C7651d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C7647T6.this.f34769f.errorGeneric();
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: T6$e */
    /* loaded from: classes3.dex */
    public static final class C7652e extends Lambda implements Function1<Unit, Unit> {
        public C7652e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C7647T6.this.f34769f.mo75744jd(false);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0007\u001ab\u0012*\b\u0001\u0012&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00030\u0003 \u0006*0\u0012*\b\u0001\u0012&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "", "Lco/bird/android/model/constant/PaymentInfoParams;", "", "kotlin.jvm.PlatformType", "c", "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAddBalancePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddBalancePresenter.kt\nco/bird/android/feature/payment/bankredirect/AddBalancePresenter$onResume$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n1549#2:171\n1620#2,3:172\n*S KotlinDebug\n*F\n+ 1 AddBalancePresenter.kt\nco/bird/android/feature/payment/bankredirect/AddBalancePresenter$onResume$5\n*L\n100#1:171\n100#1:172,3\n*E\n"})
    /* renamed from: T6$f */
    /* loaded from: classes3.dex */
    public static final class C7653f extends Lambda implements Function1<Unit, InterfaceC24574u<? extends Map<PaymentInfoParams, ? extends String>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0000 \u0004*\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "bankName", "", "Lco/bird/android/model/constant/PaymentInfoParams;", "kotlin.jvm.PlatformType", "b", "(Ljava/lang/String;)Ljava/util/Map;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nAddBalancePresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddBalancePresenter.kt\nco/bird/android/feature/payment/bankredirect/AddBalancePresenter$onResume$5$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n288#2,2:171\n*S KotlinDebug\n*F\n+ 1 AddBalancePresenter.kt\nco/bird/android/feature/payment/bankredirect/AddBalancePresenter$onResume$5$3\n*L\n108#1:171,2\n*E\n"})
        /* renamed from: T6$f$a */
        /* loaded from: classes3.dex */
        public static final class C7654a extends Lambda implements Function1<String, Map<PaymentInfoParams, ? extends String>> {

            /* renamed from: g */
            public final /* synthetic */ List<PaymentInfoBank> f34781g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C7654a(List<? extends PaymentInfoBank> list) {
                super(1);
                this.f34781g = list;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final Map<PaymentInfoParams, String> invoke(String bankName) {
                String str;
                Object obj;
                Map<PaymentInfoParams, String> mapOf;
                Intrinsics.checkNotNullParameter(bankName, "bankName");
                Iterator<T> it = this.f34781g.iterator();
                while (true) {
                    str = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.areEqual(((PaymentInfoBank) obj).getDisplayName(), bankName)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                PaymentInfoBank paymentInfoBank = (PaymentInfoBank) obj;
                if (paymentInfoBank != null) {
                    str = paymentInfoBank.getStripeBankCode();
                }
                mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PaymentInfoParams.BANK_NAME, str));
                return mapOf;
            }
        }

        public C7653f() {
            super(1);
        }

        /* renamed from: d */
        public static final void m84324d(C7647T6 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f34769f.mo75744jd(true);
        }

        /* renamed from: e */
        public static final Map m84323e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Map) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC24574u<? extends Map<PaymentInfoParams, String>> invoke(Unit it) {
            Map emptyMap;
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(it, "it");
            if (C7647T6.this.f34765b.mo25747d(C7647T6.this.f34766c).contains(PaymentInfoParams.BANK_NAME)) {
                List<PaymentInfoBank> mo25727n = C7647T6.this.f34765b.mo25727n(C7647T6.this.f34766c);
                InterfaceC9297X6 interfaceC9297X6 = C7647T6.this.f34769f;
                List<PaymentInfoBank> list = mo25727n;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (PaymentInfoBank paymentInfoBank : list) {
                    arrayList.add(paymentInfoBank.getDisplayName());
                }
                AbstractC24507p<String> m32066I = interfaceC9297X6.mo75741v4(arrayList).m32066I(C23454a.m33087a());
                final C7647T6 c7647t6 = C7647T6.this;
                AbstractC24507p<String> m32031n = m32066I.m32031n(new InterfaceC23478a() { // from class: U6
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        C7647T6.C7653f.m84324d(C7647T6.this);
                    }
                });
                final C7654a c7654a = new C7654a(mo25727n);
                return m32031n.m32067H(new InterfaceC23492o() { // from class: V6
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Map m84323e;
                        m84323e = C7647T6.C7653f.m84323e(Function1.this, obj);
                        return m84323e;
                    }
                });
            }
            emptyMap = MapsKt__MapsKt.emptyMap();
            return AbstractC24507p.m32068G(emptyMap);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0092\u0001\u0012B\b\u0001\u0012>\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000 \u0007*\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000\u0018\u00010\u00050\u0005 \u0007*H\u0012B\b\u0001\u0012>\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000 \u0007*\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "Lco/bird/android/model/constant/PaymentInfoParams;", "", "paymentInfoMap", "Lio/reactivex/u;", "Lkotlin/Pair;", "Lco/bird/api/request/BankRedirectOneTimeRefillResponse;", "kotlin.jvm.PlatformType", "b", "(Ljava/util/Map;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: T6$g */
    /* loaded from: classes3.dex */
    public static final class C7655g extends Lambda implements Function1<Map<PaymentInfoParams, ? extends String>, InterfaceC24574u<? extends Pair<? extends BankRedirectOneTimeRefillResponse, ? extends Map<PaymentInfoParams, ? extends String>>>> {

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0007\u001a>\u0012\u0004\u0012\u00020\u0000\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003 \u0006*\u001e\u0012\u0004\u0012\u00020\u0000\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lco/bird/api/request/BankRedirectOneTimeRefillResponse;", "response", "Lkotlin/Pair;", "", "Lco/bird/android/model/constant/PaymentInfoParams;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/request/BankRedirectOneTimeRefillResponse;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: T6$g$a */
        /* loaded from: classes3.dex */
        public static final class C7656a extends Lambda implements Function1<BankRedirectOneTimeRefillResponse, Pair<? extends BankRedirectOneTimeRefillResponse, ? extends Map<PaymentInfoParams, ? extends String>>> {

            /* renamed from: g */
            public final /* synthetic */ Map<PaymentInfoParams, String> f34783g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7656a(Map<PaymentInfoParams, String> map) {
                super(1);
                this.f34783g = map;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<BankRedirectOneTimeRefillResponse, Map<PaymentInfoParams, String>> invoke(BankRedirectOneTimeRefillResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return TuplesKt.m28425to(response, this.f34783g);
            }
        }

        public C7655g() {
            super(1);
        }

        /* renamed from: c */
        public static final Pair m84319c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends Pair<BankRedirectOneTimeRefillResponse, Map<PaymentInfoParams, String>>> invoke(Map<PaymentInfoParams, String> paymentInfoMap) {
            Intrinsics.checkNotNullParameter(paymentInfoMap, "paymentInfoMap");
            C38887c04 mo75748Qe = C7647T6.this.f34769f.mo75748Qe();
            if (mo75748Qe != null) {
                C7647T6 c7647t6 = C7647T6.this;
                AbstractC24507p<BankRedirectOneTimeRefillResponse> m33125j0 = c7647t6.f34765b.mo25717s(mo75748Qe.m62037b(), c7647t6.f34766c).m33125j0();
                final C7656a c7656a = new C7656a(paymentInfoMap);
                InterfaceC24574u m32067H = m33125j0.m32067H(new InterfaceC23492o() { // from class: W6
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        Pair m84319c;
                        m84319c = C7647T6.C7655g.m84319c(Function1.this, obj);
                        return m84319c;
                    }
                });
                if (m32067H != null) {
                    return m32067H;
                }
            }
            return AbstractC24507p.m32024u();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: T6$h */
    /* loaded from: classes3.dex */
    public static final class C7657h extends Lambda implements Function1<Throwable, Unit> {
        public C7657h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            C41318g46.m40159e(it);
            InterfaceC9297X6 interfaceC9297X6 = C7647T6.this.f34769f;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            interfaceC9297X6.error(it);
            C7647T6.this.f34769f.mo75744jd(true);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012B\u0010\u0002\u001a>\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005 \b*\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\t"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/api/request/BankRedirectOneTimeRefillResponse;", "", "Lco/bird/android/model/constant/PaymentInfoParams;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: T6$i */
    /* loaded from: classes3.dex */
    public static final class C7658i extends Lambda implements Function1<Pair<? extends BankRedirectOneTimeRefillResponse, ? extends Map<PaymentInfoParams, ? extends String>>, Unit> {
        public C7658i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends BankRedirectOneTimeRefillResponse, ? extends Map<PaymentInfoParams, ? extends String>> pair) {
            invoke2((Pair<BankRedirectOneTimeRefillResponse, ? extends Map<PaymentInfoParams, String>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<BankRedirectOneTimeRefillResponse, ? extends Map<PaymentInfoParams, String>> pair) {
            BankRedirectOneTimeRefillResponse component1 = pair.component1();
            InterfaceC40099e13 interfaceC40099e13 = C7647T6.this.f34764a;
            PaymentMethod paymentMethod = C7647T6.this.f34766c;
            String clientSecret = component1.getClientSecret();
            Intrinsics.checkNotNull(clientSecret);
            String publishableKey = component1.getPublishableKey();
            Intrinsics.checkNotNull(publishableKey);
            InterfaceC40099e13.C19924a.goToBankRedirectLaunch$default(interfaceC40099e13, paymentMethod, clientSecret, publishableKey, pair.component2().get(PaymentInfoParams.BANK_NAME), 0, 16, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: T6$j */
    /* loaded from: classes3.dex */
    public static final class C7659j extends Lambda implements Function1<Unit, Unit> {
        public C7659j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            InterfaceC40099e13.C19924a.closeDownWithResult$default(C7647T6.this.f34764a, -1, null, 2, null);
        }
    }

    public C7647T6(InterfaceC40099e13 navigator, VM3 paymentManagerV3, PaymentMethod paymentMethod, ScopeProvider scopeProvider, C36207Tq4 reactiveConfig, InterfaceC9297X6 ui, InterfaceC44647lh6 userManager, Optional<C38887c04> preselectedPreloadAmount) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(paymentManagerV3, "paymentManagerV3");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(preselectedPreloadAmount, "preselectedPreloadAmount");
        this.f34764a = navigator;
        this.f34765b = paymentManagerV3;
        this.f34766c = paymentMethod;
        this.f34767d = scopeProvider;
        this.f34768e = reactiveConfig;
        this.f34769f = ui;
        this.f34770g = userManager;
        this.f34771h = preselectedPreloadAmount;
        this.f34772i = true;
        this.f34773j = new C41869h04();
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f34774k = m25409g;
    }

    /* renamed from: m */
    public static final void m84339m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final void m84338n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o */
    public static final void m84337o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m84336p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final InterfaceC24574u m84335q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: r */
    public static final InterfaceC24574u m84334r(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m84333s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m84332t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m84331u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m84330v(C7647T6 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f34774k.accept(Unit.INSTANCE);
    }

    /* renamed from: k */
    public final void m84341k(int i, int i2, Intent intent) {
        if (i2 == -1) {
            this.f34769f.mo75744jd(false);
            this.f34769f.mo75749Ih();
            return;
        }
        this.f34769f.mo75744jd(true);
    }

    /* renamed from: l */
    public final void m84340l() {
        this.f34769f.mo75742sb(this.f34766c);
        C40463ee3 c40463ee3 = C40463ee3.f78649a;
        Observable combineLatest = Observable.combineLatest(this.f34768e.m82894F2(), this.f34768e.m82698Y8(), C7648a.f34775a);
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(source1, s…, t2: T2 -> (t1 to t2) })");
        Observable observeOn = combineLatest.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f34767d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7649b c7649b = new C7649b();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: J6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7647T6.m84339m(Function1.this, obj);
            }
        });
        AbstractC23442F m33152N = InterfaceC44647lh6.C25764a.fetchBalance$default(this.f34770g, null, 1, null).m33146T(2L).m33152N(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(m33152N, "userManager.fetchBalance…dSchedulers.mainThread())");
        Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f34767d));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7650c c7650c = new C7650c();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: K6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7647T6.m84338n(Function1.this, obj);
            }
        };
        final C7651d c7651d = new C7651d();
        ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: L6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7647T6.m84337o(Function1.this, obj);
            }
        });
        Observable observeOn2 = Observable.merge(this.f34769f.mo75747Ye(), this.f34774k).observeOn(C23454a.m33087a());
        final C7652e c7652e = new C7652e();
        Observable doOnNext = observeOn2.doOnNext(new InterfaceC23484g() { // from class: M6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7647T6.m84336p(Function1.this, obj);
            }
        });
        final C7653f c7653f = new C7653f();
        Observable flatMapMaybe = doOnNext.flatMapMaybe(new InterfaceC23492o() { // from class: N6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m84335q;
                m84335q = C7647T6.m84335q(Function1.this, obj);
                return m84335q;
            }
        });
        final C7655g c7655g = new C7655g();
        Observable flatMapMaybe2 = flatMapMaybe.flatMapMaybe(new InterfaceC23492o() { // from class: O6
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m84334r;
                m84334r = C7647T6.m84334r(Function1.this, obj);
                return m84334r;
            }
        });
        final C7657h c7657h = new C7657h();
        Observable retry = flatMapMaybe2.doOnError(new InterfaceC23484g() { // from class: P6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7647T6.m84333s(Function1.this, obj);
            }
        }).observeOn(C23454a.m33087a()).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "fun onResume() {\n    ui.…  justCreated = false\n  }");
        Object m33094as2 = retry.m33094as(AutoDispose.m45239a(this.f34767d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7658i c7658i = new C7658i();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Q6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7647T6.m84332t(Function1.this, obj);
            }
        });
        Object m33094as3 = this.f34769f.mo75750Al().m33094as(AutoDispose.m45239a(this.f34767d));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C7659j c7659j = new C7659j();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: R6
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C7647T6.m84331u(Function1.this, obj);
            }
        });
        if (this.f34772i && this.f34771h.m59037c()) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: S6
                @Override // java.lang.Runnable
                public final void run() {
                    C7647T6.m84330v(C7647T6.this);
                }
            }, 250L);
        }
        this.f34772i = false;
    }
}
