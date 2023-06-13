package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WireMerchantSite;
import co.bird.android.model.wire.WireMerchantSiteKt;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J8\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010#\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u001f0\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, m28432d2 = {"LJ66;", "LB66;", "Landroid/content/Intent;", "intent", "", "b", "", "transactionId", "merchantSiteId", "merchantName", "", "amount", "currency", "", "i", "LaS2;", C17296a.f69688o, "LaS2;", "merchantManager", "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LL66;", "c", "LL66;", "detailsUi", "Le13;", DateTokenConverter.CONVERTER_KEY, "Le13;", "navigator", "LAG;", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "e", "LAG;", "merchantRelay", "<init>", "(LaS2;Lcom/uber/autodispose/ScopeProvider;LL66;Le13;)V", "co.bird.android.feature.merchant"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransactionDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionDetailsPresenter.kt\nco/bird/android/feature/merchant/presenter/TransactionDetailsPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,99:1\n180#2:100\n180#2:101\n180#2:102\n*S KotlinDebug\n*F\n+ 1 TransactionDetailsPresenter.kt\nco/bird/android/feature/merchant/presenter/TransactionDetailsPresenterImpl\n*L\n46#1:100\n53#1:101\n75#1:102\n*E\n"})
/* renamed from: J66 */
/* loaded from: classes3.dex */
public final class J66 implements B66 {

    /* renamed from: a */
    public final InterfaceC37961aS2 f16849a;

    /* renamed from: b */
    public final ScopeProvider f16850b;

    /* renamed from: c */
    public final L66 f16851c;

    /* renamed from: d */
    public final InterfaceC40099e13 f16852d;

    /* renamed from: e */
    public final C0058AG<WireMerchantSite> f16853e;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lco/bird/android/model/wire/WireMerchantSite;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lco/bird/android/model/wire/WireMerchantSite;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTransactionDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionDetailsPresenter.kt\nco/bird/android/feature/merchant/presenter/TransactionDetailsPresenterImpl$onCreate$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,99:1\n223#2,2:100\n*S KotlinDebug\n*F\n+ 1 TransactionDetailsPresenter.kt\nco/bird/android/feature/merchant/presenter/TransactionDetailsPresenterImpl$onCreate$2\n*L\n44#1:100,2\n*E\n"})
    /* renamed from: J66$b */
    /* loaded from: classes3.dex */
    public static final class C3888b extends Lambda implements Function1<List<? extends WireMerchantSite>, WireMerchantSite> {

        /* renamed from: g */
        public final /* synthetic */ String f16855g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3888b(String str) {
            super(1);
            this.f16855g = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final WireMerchantSite invoke(List<WireMerchantSite> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String str = this.f16855g;
            for (WireMerchantSite wireMerchantSite : it) {
                if (Intrinsics.areEqual(wireMerchantSite.getId(), str)) {
                    return wireMerchantSite;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "merchantSite", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantSite;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: J66$c */
    /* loaded from: classes3.dex */
    public static final class C3889c extends Lambda implements Function1<WireMerchantSite, Unit> {
        public C3889c() {
            super(1);
        }

        /* renamed from: a */
        public final void m101126a(WireMerchantSite wireMerchantSite) {
            J66.this.f16853e.accept(wireMerchantSite);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireMerchantSite wireMerchantSite) {
            m101126a(wireMerchantSite);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "merchantSite", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireMerchantSite;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: J66$d */
    /* loaded from: classes3.dex */
    public static final class C3890d extends Lambda implements Function1<WireMerchantSite, Unit> {
        public C3890d() {
            super(1);
        }

        /* renamed from: a */
        public final void m101125a(WireMerchantSite merchantSite) {
            String m4410b = C51916xx1.f118396a.m4410b(merchantSite.getAddress(), merchantSite.getCity(), merchantSite.getState(), merchantSite.getCountry(), merchantSite.getZip());
            L66 l66 = J66.this.f16851c;
            String name = merchantSite.getMerchant().getName();
            Intrinsics.checkNotNullExpressionValue(merchantSite, "merchantSite");
            l66.mo95813c(name, m4410b, WireMerchantSiteKt.photoUrl(merchantSite));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WireMerchantSite wireMerchantSite) {
            m101125a(wireMerchantSite);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: J66$e */
    /* loaded from: classes3.dex */
    public static final class C3891e extends Lambda implements Function1<Unit, Boolean> {
        public C3891e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(J66.this.f16853e.m115949i());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "LAG;", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)LAG;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: J66$f */
    /* loaded from: classes3.dex */
    public static final class C3892f extends Lambda implements Function1<Unit, C0058AG<WireMerchantSite>> {
        public C3892f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C0058AG<WireMerchantSite> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return J66.this.f16853e;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LAG;", "Lco/bird/android/model/wire/WireMerchantSite;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LAG;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: J66$g */
    /* loaded from: classes3.dex */
    public static final class C3893g extends Lambda implements Function1<C0058AG<WireMerchantSite>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f16861h;

        /* renamed from: i */
        public final /* synthetic */ long f16862i;

        /* renamed from: j */
        public final /* synthetic */ String f16863j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3893g(String str, long j, String str2) {
            super(1);
            this.f16861h = str;
            this.f16862i = j;
            this.f16863j = str2;
        }

        /* renamed from: a */
        public final void m101122a(C0058AG<WireMerchantSite> c0058ag) {
            WireMerchantSite value = c0058ag.getValue();
            Intrinsics.checkNotNull(value);
            WireMerchantSite wireMerchantSite = value;
            J66.this.f16852d.mo37074W3(J66.this.m101135i(this.f16861h, wireMerchantSite.getId(), wireMerchantSite.getMerchant().getName(), this.f16862i, this.f16863j));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C0058AG<WireMerchantSite> c0058ag) {
            m101122a(c0058ag);
            return Unit.INSTANCE;
        }
    }

    public J66(InterfaceC37961aS2 merchantManager, ScopeProvider scopeProvider, L66 detailsUi, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(merchantManager, "merchantManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(detailsUi, "detailsUi");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f16849a = merchantManager;
        this.f16850b = scopeProvider;
        this.f16851c = detailsUi;
        this.f16852d = navigator;
        C0058AG<WireMerchantSite> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<WireMerchantSite>()");
        this.f16853e = m115951g;
    }

    /* renamed from: j */
    public static final boolean m101134j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: k */
    public static final WireMerchantSite m101133k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (WireMerchantSite) tmp0.invoke(obj);
    }

    /* renamed from: l */
    public static final void m101132l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m101131m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final boolean m101130n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: o */
    public static final C0058AG m101129o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C0058AG) tmp0.invoke(obj);
    }

    /* renamed from: p */
    public static final void m101128p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.B66
    /* renamed from: b */
    public void mo101142b(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        String stringExtra = intent.getStringExtra("transaction_id");
        Intrinsics.checkNotNull(stringExtra);
        long longExtra = intent.getLongExtra("transaction_amount", 0L);
        String stringExtra2 = intent.getStringExtra("transaction_currency");
        Intrinsics.checkNotNull(stringExtra2);
        Serializable serializableExtra = intent.getSerializableExtra("transaction_date_time");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type org.joda.time.DateTime");
        DateTime dateTime = (DateTime) serializableExtra;
        C51916xx1 c51916xx1 = C51916xx1.f118396a;
        String currency$default = C51916xx1.currency$default(c51916xx1, longExtra, C45097mS5.m25591o(stringExtra2), null, 4, null);
        String m4400l = c51916xx1.m4400l(dateTime);
        String m4399m = c51916xx1.m4399m(dateTime);
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String lowerCase = m4399m.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        String str = m4400l + " " + lowerCase;
        String stringExtra3 = intent.getStringExtra("merchant_site_id");
        Observable<List<WireMerchantSite>> mo12336k = this.f16849a.mo12336k();
        final C3887a c3887a = new C3887a(stringExtra3);
        Observable<List<WireMerchantSite>> filter = mo12336k.filter(new InterfaceC23494q() { // from class: C66
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m101134j;
                m101134j = J66.m101134j(Function1.this, obj);
                return m101134j;
            }
        });
        final C3888b c3888b = new C3888b(stringExtra3);
        Observable observeOn = filter.map(new InterfaceC23492o() { // from class: D66
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                WireMerchantSite m101133k;
                m101133k = J66.m101133k(Function1.this, obj);
                return m101133k;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "merchantSiteId = intent.…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f16850b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3889c c3889c = new C3889c();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: E66
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                J66.m101132l(Function1.this, obj);
            }
        });
        Observable<WireMerchantSite> observeOn2 = this.f16853e.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "merchantRelay\n      .obs…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f16850b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3890d c3890d = new C3890d();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: F66
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                J66.m101131m(Function1.this, obj);
            }
        });
        this.f16851c.mo95815a(currency$default, str);
        Observable<Unit> mo95814b = this.f16851c.mo95814b();
        final C3891e c3891e = new C3891e();
        Observable<Unit> filter2 = mo95814b.filter(new InterfaceC23494q() { // from class: G66
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m101130n;
                m101130n = J66.m101130n(Function1.this, obj);
                return m101130n;
            }
        });
        final C3892f c3892f = new C3892f();
        Observable observeOn3 = filter2.map(new InterfaceC23492o() { // from class: H66
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C0058AG m101129o;
                m101129o = J66.m101129o(Function1.this, obj);
                return m101129o;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "override fun onCreate(in…Support(tags)\n      }\n  }");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(this.f16850b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3893g c3893g = new C3893g(stringExtra, longExtra, stringExtra2);
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: I66
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                J66.m101128p(Function1.this, obj);
            }
        });
    }

    /* renamed from: i */
    public final List<String> m101135i(String str, String str2, String str3, long j, String str4) {
        String str5;
        List<String> listOf;
        String[] strArr = new String[6];
        strArr[0] = "source:merchant_history";
        strArr[1] = "transaction_id:" + str;
        strArr[2] = "merchant_site_id:" + str2;
        if (str3 != null) {
            str5 = StringsKt__StringsJVMKt.replace$default(str3, " ", "_", false, 4, (Object) null);
        } else {
            str5 = null;
        }
        strArr[3] = "merchant_name:" + str5;
        strArr[4] = "amount:" + j;
        strArr[5] = "currency:" + str4;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) strArr);
        return listOf;
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/wire/WireMerchantSite;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nTransactionDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionDetailsPresenter.kt\nco/bird/android/feature/merchant/presenter/TransactionDetailsPresenterImpl$onCreate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,99:1\n1747#2,3:100\n*S KotlinDebug\n*F\n+ 1 TransactionDetailsPresenter.kt\nco/bird/android/feature/merchant/presenter/TransactionDetailsPresenterImpl$onCreate$1\n*L\n43#1:100,3\n*E\n"})
    /* renamed from: J66$a */
    /* loaded from: classes3.dex */
    public static final class C3887a extends Lambda implements Function1<List<? extends WireMerchantSite>, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ String f16854g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3887a(String str) {
            super(1);
            this.f16854g = str;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(List<WireMerchantSite> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            List<WireMerchantSite> list = it;
            String str = this.f16854g;
            boolean z = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (Intrinsics.areEqual(((WireMerchantSite) it2.next()).getId(), str)) {
                        z = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(List<? extends WireMerchantSite> list) {
            return invoke2((List<WireMerchantSite>) list);
        }
    }
}
