package p000;

import android.app.Activity;
import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.BirdPayment;
import co.bird.android.model.User;
import co.bird.android.navigator.CardEntered;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.Card;
import com.stripe.android.model.Token;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23447K;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C33481Hz5;
import p000.C50996wP3;
import p000.InterfaceC40099e13;
import p000.InterfaceC42586iD1;
@Metadata(m28433d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001Bq\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\b\b\u0001\u00102\u001a\u00020/\u0012\b\b\u0001\u00106\u001a\u000203\u0012\b\b\u0001\u0010:\u001a\u000207\u0012\b\b\u0001\u0010>\u001a\u00020;¢\u0006\u0004\bG\u0010HJ\u0006\u0010\u0003\u001a\u00020\u0002J \u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0014\u0010\u000e\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\"\u0010F\u001a\u0010\u0012\f\u0012\n D*\u0004\u0018\u00010C0C0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010E¨\u0006I"}, m28432d2 = {"LHz5;", "", "", "r", "", "requestCode", "resultCode", "Landroid/content/Intent;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "o", "D", "", "LN80;", "params", "n", "Lgl;", C17296a.f69688o, "Lgl;", "preference", "Lhq;", "b", "Lhq;", "authTokenManager", "LzN3;", "c", "LzN3;", "paymentMethodManager", "LiD1;", DateTokenConverter.CONVERTER_KEY, "LiD1;", "googlePayManager", "Llh6;", "e", "Llh6;", "userManager", "LBc;", "f", "LBc;", "deviceManager", "LTq4;", "g", "LTq4;", "reactiveConfig", "LEa;", "h", "LEa;", "analyticsManager", "Lcom/uber/autodispose/ScopeProvider;", "i", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "Landroid/app/Activity;", "j", "Landroid/app/Activity;", "activity", "LNz5;", "k", "LNz5;", "ui", "Le13;", "l", "Le13;", "navigator", "m", "Ljava/lang/String;", "paymentCallback", "LAG;", "", "kotlin.jvm.PlatformType", "LAG;", "googlePayReady", "<init>", "(Lgl;Lhq;LzN3;LiD1;Llh6;LBc;LTq4;LEa;Lcom/uber/autodispose/ScopeProvider;Landroid/app/Activity;LNz5;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nShopPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShopPresenter.kt\nco/bird/android/app/feature/shop/ShopPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,244:1\n180#2:245\n180#2:246\n180#2:248\n180#2:249\n218#2:250\n218#2:251\n218#2:252\n252#3:247\n1789#4,3:253\n1789#4,3:256\n*S KotlinDebug\n*F\n+ 1 ShopPresenter.kt\nco/bird/android/app/feature/shop/ShopPresenter\n*L\n75#1:245\n81#1:246\n104#1:248\n130#1:249\n151#1:250\n157#1:251\n177#1:252\n95#1:247\n189#1:253,3\n200#1:256,3\n*E\n"})
/* renamed from: Hz5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33481Hz5 {

    /* renamed from: a */
    public final C22454gl f14275a;

    /* renamed from: b */
    public final InterfaceC22767hq f14276b;

    /* renamed from: c */
    public final InterfaceC52757zN3 f14277c;

    /* renamed from: d */
    public final InterfaceC42586iD1 f14278d;

    /* renamed from: e */
    public final InterfaceC44647lh6 f14279e;

    /* renamed from: f */
    public final InterfaceC0650Bc f14280f;

    /* renamed from: g */
    public final C36207Tq4 f14281g;

    /* renamed from: h */
    public final InterfaceC1880Ea f14282h;

    /* renamed from: i */
    public final ScopeProvider f14283i;

    /* renamed from: j */
    public final Activity f14284j;

    /* renamed from: k */
    public final C34885Nz5 f14285k;

    /* renamed from: l */
    public final InterfaceC40099e13 f14286l;

    /* renamed from: m */
    public String f14287m;

    /* renamed from: n */
    public final C0058AG<Boolean> f14288n;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/stripe/android/model/Token;", "kotlin.jvm.PlatformType", "token", "", C17296a.f69688o, "(Lcom/stripe/android/model/Token;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Hz5$a */
    /* loaded from: classes2.dex */
    public static final class C3294a extends Lambda implements Function1<Token, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f14290h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3294a(String str) {
            super(1);
            this.f14290h = str;
        }

        /* renamed from: a */
        public final void m103105a(Token token) {
            C33481Hz5.this.m103118n(this.f14290h, new C45634nM3(token.getId()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Token token) {
            m103105a(token);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Hz5$b */
    /* loaded from: classes2.dex */
    public static final class C3295b extends Lambda implements Function1<Throwable, Unit> {
        public C3295b() {
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
            C33481Hz5.this.f14285k.error(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\n\u0010\n\u001a\u00028\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "T", "T1", "T2", "R", "t", "t1", "t2", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/ObservablesKt$withLatestFrom$3\n+ 2 ShopPresenter.kt\nco/bird/android/app/feature/shop/ShopPresenter\n*L\n1#1,304:1\n98#2:305\n*E\n"})
    /* renamed from: Hz5$c */
    /* loaded from: classes2.dex */
    public static final class C3296c<T1, T2, T3, R> implements InterfaceC23485h<Pair<? extends C37882aJ4, ? extends User>, T1, T2, R> {

        /* renamed from: a */
        public final /* synthetic */ C50996wP3.C29873a f14292a;

        public C3296c(C50996wP3.C29873a c29873a) {
            this.f14292a = c29873a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.InterfaceC23485h
        public final R apply(Pair<? extends C37882aJ4, ? extends User> pair, T1 t1, T2 t2) {
            boolean booleanValue = ((Boolean) t2).booleanValue();
            Pair<? extends C37882aJ4, ? extends User> pair2 = pair;
            return (R) this.f14292a.m6873a(pair2, (Optional) t1, booleanValue);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LwP3;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(LwP3;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Hz5$d */
    /* loaded from: classes2.dex */
    public static final class C3297d extends Lambda implements Function1<C50996wP3, Unit> {
        public C3297d() {
            super(1);
        }

        /* renamed from: a */
        public final void m103104a(C50996wP3 c50996wP3) {
            Unit unit;
            C37882aJ4 m6877a = c50996wP3.m6877a();
            User m6876b = c50996wP3.m6876b();
            Card m6875c = c50996wP3.m6875c();
            boolean m6874d = c50996wP3.m6874d();
            if (m6877a.m71661b() && m6875c != null && !ES5.m108973b(m6875c)) {
                String id = m6875c.getId();
                if (id != null) {
                    C33481Hz5.this.m103118n(m6877a.m71660c(), new C45041mM3(id));
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    C33481Hz5.this.f14285k.error(C45871nl4.payment_error_title);
                }
            } else if (m6874d) {
                C33481Hz5.this.f14278d.mo16236h(m6876b, C33481Hz5.this.f14284j, EnumC51527xI4.GOOGLE_PAY.ordinal(), C45097mS5.m25591o(m6877a.m71659d()), Long.valueOf(m6877a.m71658e()));
            } else {
                InterfaceC40099e13.C19924a.goToEnterCard$default(C33481Hz5.this.f14286l, EnumC51527xI4.ENTER_CARD.ordinal(), false, null, 6, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C50996wP3 c50996wP3) {
            m103104a(c50996wP3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lqz5;", "it", "", C17296a.f69688o, "(Lqz5;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Hz5$e */
    /* loaded from: classes2.dex */
    public static final class C3298e extends Lambda implements Function1<InterfaceC47791qz5, Boolean> {

        /* renamed from: g */
        public static final C3298e f14294g = new C3298e();

        public C3298e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(InterfaceC47791qz5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!(it instanceof C37882aJ4));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lqz5;", "kotlin.jvm.PlatformType", "event", "", C17296a.f69688o, "(Lqz5;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Hz5$f */
    /* loaded from: classes2.dex */
    public static final class C3299f extends Lambda implements Function1<InterfaceC47791qz5, Unit> {
        public C3299f() {
            super(1);
        }

        /* renamed from: a */
        public final void m103102a(InterfaceC47791qz5 interfaceC47791qz5) {
            String str;
            if (interfaceC47791qz5 instanceof DI4) {
                C33481Hz5 c33481Hz5 = C33481Hz5.this;
                String m110598b = ((DI4) interfaceC47791qz5).m110598b();
                String deviceId = C33481Hz5.this.f14280f.getDeviceId();
                User m37750B0 = C33481Hz5.this.f14275a.m37750B0();
                if (m37750B0 != null) {
                    str = m37750B0.getId();
                } else {
                    str = null;
                }
                c33481Hz5.m103118n(m110598b, new C47198pz5(deviceId, str, C33481Hz5.this.f14276b.mo15266a().m73665a().m59035e(), C33481Hz5.this.f14276b.mo15264c()));
            } else if (interfaceC47791qz5 instanceof C52981zl0) {
                C33481Hz5.this.f14286l.close();
            } else {
                C41318g46.m40160d("Unknown or null javascript command", new Object[0]);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC47791qz5 interfaceC47791qz5) {
            m103102a(interfaceC47791qz5);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Hz5$g */
    /* loaded from: classes2.dex */
    public static final class C3300g extends Lambda implements Function1<String, Unit> {
        public C3300g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            C34885Nz5 c34885Nz5 = C33481Hz5.this.f14285k;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c34885Nz5.m93021t(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "url", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Hz5$h */
    /* loaded from: classes2.dex */
    public static final class C3301h extends Lambda implements Function1<Optional<String>, Unit> {
        public C3301h() {
            super(1);
        }

        /* renamed from: a */
        public final void m103101a(Optional<String> optional) {
            String m59035e = optional.m59035e();
            Unit unit = null;
            if (m59035e != null) {
                C34885Nz5.loadUrl$default(C33481Hz5.this.f14285k, m59035e, null, 2, null);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                C33481Hz5.this.f14286l.close();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<String> optional) {
            m103101a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lqz5;", "it", "", C17296a.f69688o, "(Lqz5;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Hz5$i */
    /* loaded from: classes2.dex */
    public static final class C3302i extends Lambda implements Function1<InterfaceC47791qz5, Boolean> {

        /* renamed from: g */
        public static final C3302i f14298g = new C3302i();

        public C3302i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(InterfaceC47791qz5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it instanceof C37882aJ4);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lqz5;", "it", "LaJ4;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lqz5;)LaJ4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Hz5$j */
    /* loaded from: classes2.dex */
    public static final class C3303j extends Lambda implements Function1<InterfaceC47791qz5, C37882aJ4> {

        /* renamed from: g */
        public static final C3303j f14299g = new C3303j();

        public C3303j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C37882aJ4 invoke(InterfaceC47791qz5 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return (C37882aJ4) it;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LaJ4;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(LaJ4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Hz5$k */
    /* loaded from: classes2.dex */
    public static final class C3304k extends Lambda implements Function1<C37882aJ4, Unit> {
        public C3304k() {
            super(1);
        }

        /* renamed from: a */
        public final void m103098a(C37882aJ4 c37882aJ4) {
            C33481Hz5.this.f14287m = c37882aJ4.m71660c();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C37882aJ4 c37882aJ4) {
            m103098a(c37882aJ4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aZ\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005*,\u0012&\b\u0001\u0012\"\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LaJ4;", "event", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "b", "(LaJ4;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Hz5$l */
    /* loaded from: classes2.dex */
    public static final class C3305l extends Lambda implements Function1<C37882aJ4, InterfaceC23447K<? extends Pair<? extends C37882aJ4, ? extends User>>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000 \u0004*\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/User;", "it", "Lkotlin/Pair;", "LaJ4;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/User;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: Hz5$l$a */
        /* loaded from: classes2.dex */
        public static final class C3306a extends Lambda implements Function1<User, Pair<? extends C37882aJ4, ? extends User>> {

            /* renamed from: g */
            public final /* synthetic */ C37882aJ4 f14302g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3306a(C37882aJ4 c37882aJ4) {
                super(1);
                this.f14302g = c37882aJ4;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<C37882aJ4, User> invoke(User it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(this.f14302g, it);
            }
        }

        public C3305l() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<C37882aJ4, User>> invoke(C37882aJ4 event) {
            Intrinsics.checkNotNullParameter(event, "event");
            AbstractC23442F<User> user = C33481Hz5.this.f14279e.getUser();
            final C3306a c3306a = new C3306a(event);
            return user.m33157I(new InterfaceC23492o() { // from class: Iz5
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C33481Hz5.C3305l.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/BirdPayment;", "it", "Lcom/stripe/android/model/Card;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Hz5$m */
    /* loaded from: classes2.dex */
    public static final class C3307m extends Lambda implements Function1<Optional<BirdPayment>, Optional<Card>> {

        /* renamed from: g */
        public static final C3307m f14303g = new C3307m();

        public C3307m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Optional<Card> invoke(Optional<BirdPayment> it) {
            Card card;
            Intrinsics.checkNotNullParameter(it, "it");
            Optional.C14443a c14443a = Optional.f63040c;
            BirdPayment m59035e = it.m59035e();
            if (m59035e != null) {
                card = m59035e.getStripeCard();
            } else {
                card = null;
            }
            return c14443a.m59033b(card);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Hz5$n */
    /* loaded from: classes2.dex */
    public static final class C3308n extends Lambda implements Function1<Throwable, Unit> {
        public C3308n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C33481Hz5.this.f14285k.error(C45871nl4.error_generic_body);
        }
    }

    public C33481Hz5(C22454gl preference, InterfaceC22767hq authTokenManager, InterfaceC52757zN3 paymentMethodManager, InterfaceC42586iD1 googlePayManager, InterfaceC44647lh6 userManager, InterfaceC0650Bc deviceManager, C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, ScopeProvider scopeProvider, Activity activity, C34885Nz5 ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(authTokenManager, "authTokenManager");
        Intrinsics.checkNotNullParameter(paymentMethodManager, "paymentMethodManager");
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f14275a = preference;
        this.f14276b = authTokenManager;
        this.f14277c = paymentMethodManager;
        this.f14278d = googlePayManager;
        this.f14279e = userManager;
        this.f14280f = deviceManager;
        this.f14281g = reactiveConfig;
        this.f14282h = analyticsManager;
        this.f14283i = scopeProvider;
        this.f14284j = activity;
        this.f14285k = ui;
        this.f14286l = navigator;
        C0058AG<Boolean> m115950h = C0058AG.m115950h(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault(false)");
        this.f14288n = m115950h;
    }

    /* renamed from: A */
    public static final void m103135A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B */
    public static final void m103134B(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final boolean m103133C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: p */
    public static final void m103116p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m103115q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final void m103113s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m103112t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m103111u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final boolean m103110v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: w */
    public static final C37882aJ4 m103109w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (C37882aJ4) tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final void m103108x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: y */
    public static final InterfaceC23447K m103107y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: z */
    public static final Optional m103106z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: D */
    public final void m103132D() {
        AbstractC24507p<User> m32065J = this.f14279e.getUser().m33125j0().m32065J();
        Intrinsics.checkNotNullExpressionValue(m32065J, "userManager.getUser()\n  …\n      .onErrorComplete()");
        Object m32048b = m32065J.m32048b(AutoDispose.m45239a(this.f14283i));
        Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((MaybeSubscribeProxy) m32048b).subscribe();
        AbstractC24507p<Boolean> m32065J2 = this.f14278d.mo16237g().m33125j0().m32065J();
        Intrinsics.checkNotNullExpressionValue(m32065J2, "googlePayManager.googleP…\n      .onErrorComplete()");
        Object m32048b2 = m32065J2.m32048b(AutoDispose.m45239a(this.f14283i));
        Intrinsics.checkExpressionValueIsNotNull(m32048b2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((MaybeSubscribeProxy) m32048b2).subscribe(this.f14288n);
    }

    /* renamed from: n */
    public final void m103118n(String str, N80 n80) {
        Map.Entry entry;
        Iterator<T> it = n80.mo18351a().entrySet().iterator();
        while (it.hasNext()) {
            String str2 = (String) ((Map.Entry) it.next()).getValue();
            String str3 = "{{" + ((String) entry.getKey()) + "}}";
            if (str2 == null) {
                str2 = "null";
            }
            str = StringsKt__StringsJVMKt.replace(str, str3, str2, true);
        }
        this.f14285k.m93025Ql(str);
    }

    /* renamed from: o */
    public final void m103117o(int i, int i2, Intent intent) {
        Unit unit;
        String str = this.f14287m;
        if (str == null) {
            return;
        }
        if (i == EnumC51527xI4.ENTER_CARD.ordinal()) {
            CardEntered cardEntered = (CardEntered) X52.m77423b(intent);
            if (i2 == -1 && cardEntered != null) {
                String m55404b = cardEntered.m55404b();
                if (m55404b != null) {
                    m103118n(str, new C45634nM3(m55404b));
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    this.f14285k.error(C45871nl4.payment_error_title);
                }
            }
        } else if (i == EnumC51527xI4.GOOGLE_PAY.ordinal()) {
            AbstractC24507p m32066I = InterfaceC42586iD1.C23161a.handleGooglePayActivityResult$default(this.f14278d, i2, intent, false, null, 8, null).m32066I(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m32066I, "googlePayManager.handleG…dSchedulers.mainThread())");
            Object m32048b = m32066I.m32048b(AutoDispose.m45239a(this.f14283i));
            Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C3294a c3294a = new C3294a(str);
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: uz5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C33481Hz5.m103116p(Function1.this, obj);
                }
            };
            final C3295b c3295b = new C3295b();
            ((MaybeSubscribeProxy) m32048b).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: yz5
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C33481Hz5.m103115q(Function1.this, obj);
                }
            });
        }
    }

    /* renamed from: r */
    public final void m103114r() {
        Observable<String> observeOn = this.f14281g.m82834L2().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "reactiveConfig.byobMenuN…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f14283i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3300g c3300g = new C3300g();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: zz5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33481Hz5.m103113s(Function1.this, obj);
            }
        });
        Observable<Optional<String>> observeOn2 = this.f14281g.m82814N2().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "reactiveConfig.byobShopU…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f14283i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3301h c3301h = new C3301h();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: Bz5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33481Hz5.m103112t(Function1.this, obj);
            }
        });
        m103132D();
        Observable<InterfaceC47791qz5> m93023Sl = this.f14285k.m93023Sl();
        final C3302i c3302i = C3302i.f14298g;
        Observable<InterfaceC47791qz5> filter = m93023Sl.filter(new InterfaceC23494q() { // from class: Cz5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m103110v;
                m103110v = C33481Hz5.m103110v(Function1.this, obj);
                return m103110v;
            }
        });
        final C3303j c3303j = C3303j.f14299g;
        Observable<R> map = filter.map(new InterfaceC23492o() { // from class: Dz5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                C37882aJ4 m103109w;
                m103109w = C33481Hz5.m103109w(Function1.this, obj);
                return m103109w;
            }
        });
        final C3304k c3304k = new C3304k();
        Observable doOnNext = map.doOnNext(new InterfaceC23484g() { // from class: Ez5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33481Hz5.m103108x(Function1.this, obj);
            }
        });
        final C3305l c3305l = new C3305l();
        Observable flatMapSingle = doOnNext.flatMapSingle(new InterfaceC23492o() { // from class: Fz5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m103107y;
                m103107y = C33481Hz5.m103107y(Function1.this, obj);
                return m103107y;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "fun onCreate() {\n    rea…d\")\n        }\n      }\n  }");
        Z84<Optional<BirdPayment>> mo1484a = this.f14277c.mo1484a();
        final C3307m c3307m = C3307m.f14303g;
        Object map2 = mo1484a.map(new InterfaceC23492o() { // from class: Gz5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m103106z;
                m103106z = C33481Hz5.m103106z(Function1.this, obj);
                return m103106z;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "paymentMethodManager.def…t.orNull()?.stripeCard) }");
        Observable withLatestFrom = flatMapSingle.withLatestFrom(map2, this.f14288n, new C3296c(C50996wP3.f115916e));
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(o1, o2, F…iner.invoke(t, t1, t2) })");
        Observable observeOn3 = withLatestFrom.observeOn(C23454a.m33087a());
        final C3308n c3308n = new C3308n();
        Observable retry = observeOn3.doOnError(new InterfaceC23484g() { // from class: vz5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33481Hz5.m103135A(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "fun onCreate() {\n    rea…d\")\n        }\n      }\n  }");
        Object m33094as3 = retry.m33094as(AutoDispose.m45239a(this.f14283i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3297d c3297d = new C3297d();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: wz5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33481Hz5.m103134B(Function1.this, obj);
            }
        });
        Observable<InterfaceC47791qz5> m93023Sl2 = this.f14285k.m93023Sl();
        final C3298e c3298e = C3298e.f14294g;
        Observable<InterfaceC47791qz5> observeOn4 = m93023Sl2.filter(new InterfaceC23494q() { // from class: xz5
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m103133C;
                m103133C = C33481Hz5.m103133C(Function1.this, obj);
                return m103133C;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "ui.events()\n      .filte…dSchedulers.mainThread())");
        Object m33094as4 = observeOn4.m33094as(AutoDispose.m45239a(this.f14283i));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C3299f c3299f = new C3299f();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: Az5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33481Hz5.m103111u(Function1.this, obj);
            }
        });
    }
}
