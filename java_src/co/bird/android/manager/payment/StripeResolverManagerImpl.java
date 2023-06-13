package co.bird.android.manager.payment;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.manager.payment.StripeResolverManagerImpl;
import com.facebook.share.internal.C17296a;
import com.stripe.android.Stripe;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37791a94;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002BC\b\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\b\b\u0001\u0010!\u001a\u00020\u0003¢\u0006\u0004\b1\u00102J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R&\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001b0'0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R,\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001b0'0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00063"}, m28432d2 = {"Lco/bird/android/manager/payment/StripeResolverManagerImpl;", "LBS5;", "LVX0;", "LLifecycleOwner;", "owner", "", "onStart", "Landroid/content/Context;", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LTq4;", "c", "LTq4;", "reactiveConfig", "LOh;", DateTokenConverter.CONVERTER_KEY, "LOh;", "appBuildConfig", "LRh6;", "e", "LRh6;", "userStream", "Lgl;", "f", "Lgl;", "appPreference", "Lcom/stripe/android/Stripe;", "g", "Lcom/stripe/android/Stripe;", "stripe", "h", "LLifecycleOwner;", "processLifecycleOwner", "", "i", "Ljava/lang/String;", "appPreferenceStripeKey", "La94;", "Lkotlin/Pair;", "j", "La94;", "currentUserStripeRelay", "LZ84;", "k", "LZ84;", C17296a.f69688o, "()LZ84;", "currentUserStripe", "<init>", "(Landroid/content/Context;LTq4;LOh;LRh6;Lgl;Lcom/stripe/android/Stripe;LLifecycleOwner;)V", "payment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStripeResolverManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeResolverManagerImpl.kt\nco/bird/android/manager/payment/StripeResolverManagerImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,53:1\n44#2:54\n180#3:55\n*S KotlinDebug\n*F\n+ 1 StripeResolverManagerImpl.kt\nco/bird/android/manager/payment/StripeResolverManagerImpl\n*L\n49#1:54\n49#1:55\n*E\n"})
/* loaded from: classes4.dex */
public final class StripeResolverManagerImpl implements BS5, VX0 {

    /* renamed from: b */
    public final Context f66464b;

    /* renamed from: c */
    public final C36207Tq4 f66465c;

    /* renamed from: d */
    public final InterfaceC6097Oh f66466d;

    /* renamed from: e */
    public final InterfaceC35660Rh6 f66467e;

    /* renamed from: f */
    public final C22454gl f66468f;

    /* renamed from: g */
    public final Stripe f66469g;

    /* renamed from: h */
    public final LifecycleOwner f66470h;

    /* renamed from: i */
    public final String f66471i;

    /* renamed from: j */
    public final C37791a94<Pair<String, Stripe>> f66472j;

    /* renamed from: k */
    public final Z84<Pair<String, Stripe>> f66473k;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "key", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.manager.payment.StripeResolverManagerImpl$a */
    /* loaded from: classes4.dex */
    public static final class C16192a extends Lambda implements Function1<String, Unit> {
        public C16192a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String key) {
            if (Intrinsics.areEqual(key, ((Pair) StripeResolverManagerImpl.this.f66472j.getValue()).getFirst())) {
                return;
            }
            Context applicationContext = StripeResolverManagerImpl.this.f66464b.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            Intrinsics.checkNotNullExpressionValue(key, "key");
            StripeResolverManagerImpl.this.f66472j.accept(TuplesKt.m28425to(key, new Stripe(applicationContext, key, StripeResolverManagerImpl.this.f66465c.m82623f8().getValue().getPaymentConfig().getConnectedAccountId(), StripeResolverManagerImpl.this.f66466d.mo89921k(), (Set) null, 16, (DefaultConstructorMarker) null)));
        }
    }

    public StripeResolverManagerImpl(Context context, C36207Tq4 reactiveConfig, InterfaceC6097Oh appBuildConfig, InterfaceC35660Rh6 userStream, C22454gl appPreference, Stripe stripe, LifecycleOwner processLifecycleOwner) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(appBuildConfig, "appBuildConfig");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(appPreference, "appPreference");
        Intrinsics.checkNotNullParameter(stripe, "stripe");
        Intrinsics.checkNotNullParameter(processLifecycleOwner, "processLifecycleOwner");
        this.f66464b = context;
        this.f66465c = reactiveConfig;
        this.f66466d = appBuildConfig;
        this.f66467e = userStream;
        this.f66468f = appPreference;
        this.f66469g = stripe;
        this.f66470h = processLifecycleOwner;
        String string = context.getString(appPreference.m37699O().m9900h());
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(appPre….getEnvironment().stripe)");
        this.f66471i = string;
        C37791a94<Pair<String, Stripe>> create$default = C37791a94.C10586a.create$default(C37791a94.f49908h, TuplesKt.m28425to(string, stripe), null, 2, null);
        this.f66472j = create$default;
        this.f66473k = Z84.f47888d.m73663b(create$default);
        processLifecycleOwner.getLifecycle().mo67008a(this);
    }

    /* renamed from: d */
    public static final void m55583d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.BS5
    /* renamed from: a */
    public Z84<Pair<String, Stripe>> mo55585a() {
        return this.f66473k;
    }

    @Override // p000.VX0
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        Observable m74576S = C37279Yf5.m74576S(this.f66467e.mo76575j());
        final C16192a c16192a = new C16192a();
        Observable doOnNext = m74576S.doOnNext(new InterfaceC23484g() { // from class: CS5
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                StripeResolverManagerImpl.m55583d(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext, "override fun onStart(own…))\n      .subscribe()\n  }");
        AndroidLifecycleScopeProvider m45197b = AndroidLifecycleScopeProvider.m45197b(owner);
        Intrinsics.checkExpressionValueIsNotNull(m45197b, "AndroidLifecycleScopeProvider.from(this)");
        Object m33094as = doOnNext.m33094as(AutoDispose.m45239a(m45197b));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as).subscribe();
    }
}
