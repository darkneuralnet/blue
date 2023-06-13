package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Balance;
import co.bird.android.model.PaymentAddSource;
import co.bird.android.model.User;
import co.bird.android.model.UserKt;
import co.bird.android.model.analytics.GooglePayAuthSheetCanceled;
import co.bird.android.model.analytics.GooglePayAuthSheetError;
import co.bird.android.model.analytics.GooglePayAuthSheetSuccess;
import co.bird.android.model.analytics.GooglePayEligible;
import co.bird.android.model.wire.configs.AutoPayPlanConfig;
import com.adyen.checkout.components.model.payments.response.Action;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.stripe.android.GooglePayConfig;
import com.stripe.android.model.Card;
import com.stripe.android.model.GooglePayResult;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Token;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC23444H;
import io.reactivex.InterfaceC23448L;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC23497i;
import io.reactivex.InterfaceC24575v;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24530g;
import io.reactivex.subjects.C24552a;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.C35336Px6;
import p000.C47923rD1;
import p000.InterfaceC38798br4;
@Metadata(m28433d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BY\b\u0007\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00102\u001a\u000200\u0012\u0006\u00105\u001a\u000203\u0012\u0006\u00108\u001a\u000206\u0012\u0006\u0010;\u001a\u000209\u0012\u0006\u0010>\u001a\u00020<\u0012\u0006\u0010A\u001a\u00020?\u0012\u0006\u0010E\u001a\u00020B\u0012\u0006\u0010I\u001a\u00020F\u0012\u0006\u0010M\u001a\u00020J¢\u0006\u0004\bV\u0010WJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J9\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u001d\u001a\u00020\u001cH\u0017J2\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$2\u0006\u0010\u001e\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016J,\u0010(\u001a\u00020'2\u0006\u0010\u001e\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020\r0)H\u0016J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0)H\u0017R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00101R\u0014\u00105\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00104R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00107R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010:R\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010=R\u0014\u0010A\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010P\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\"\u0010U\u001a\u0010\u0012\f\u0012\n R*\u0004\u0018\u00010\r0\r0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006X"}, m28432d2 = {"LrD1;", "LiD1;", "Lbr4;", "", "V", "Ljava/util/Currency;", "currency", "", "price", "totalPriceLabel", "Lcom/google/android/gms/wallet/PaymentDataRequest;", "D", "Lio/reactivex/Observable;", "", "f", "Lco/bird/android/model/User;", "user", "Landroid/app/Activity;", "activity", "", "requestCode", "", "h", "(Lco/bird/android/model/User;Landroid/app/Activity;ILjava/util/Currency;Ljava/lang/Long;)V", "priceTax", "showPlusTaxDisclaimer", "e", "(Ljava/util/Currency;Ljava/lang/Long;Ljava/lang/Long;Z)V", "LEP3;", "G", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "attachAndSetDefault", "Lco/bird/android/model/PaymentAddSource;", Stripe3ds2AuthParams.FIELD_SOURCE, "Lio/reactivex/p;", "Lcom/stripe/android/model/Token;", "c", "Lio/reactivex/c;", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/F;", "g", "N", "Landroid/content/Context;", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lgl;", "Lgl;", "preference", "LAM3;", "LAM3;", "paymentManager", "Lpx5;", "Lpx5;", "setupIntentManager", "LTq4;", "LTq4;", "reactiveConfig", "LEa;", "LEa;", "analyticsManager", "Llh6;", "Llh6;", "userManager", "LRh6;", "i", "LRh6;", "userStream", "Le13;", "j", "Le13;", "navigator", "LfL;", "k", "LfL;", "birdDeviceCheckManager", "l", "LEP3;", "paymentsClient", "Lio/reactivex/subjects/a;", "kotlin.jvm.PlatformType", "m", "Lio/reactivex/subjects/a;", "googlePayAttachedSubject", "<init>", "(Landroid/content/Context;Lgl;LAM3;Lpx5;LTq4;LEa;Llh6;LRh6;Le13;LfL;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nGooglePayManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GooglePayManagerImpl.kt\nco/bird/android/app/manager/GooglePayManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n1#2:311\n*E\n"})
/* renamed from: rD1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C47923rD1 implements InterfaceC42586iD1, InterfaceC38798br4 {

    /* renamed from: b */
    public final Context f106694b;

    /* renamed from: c */
    public final C22454gl f106695c;

    /* renamed from: d */
    public final AM3 f106696d;

    /* renamed from: e */
    public final InterfaceC47178px5 f106697e;

    /* renamed from: f */
    public final C36207Tq4 f106698f;

    /* renamed from: g */
    public final InterfaceC1880Ea f106699g;

    /* renamed from: h */
    public final InterfaceC44647lh6 f106700h;

    /* renamed from: i */
    public final InterfaceC35660Rh6 f106701i;

    /* renamed from: j */
    public final InterfaceC40099e13 f106702j;

    /* renamed from: k */
    public final InterfaceC20357fL f106703k;

    /* renamed from: l */
    public EP3 f106704l;

    /* renamed from: m */
    public final C24552a<Boolean> f106705m;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rD1$a */
    /* loaded from: classes2.dex */
    public static final class C27877a extends Lambda implements Function1<User, Unit> {
        public C27877a() {
            super(1);
        }

        /* renamed from: a */
        public final void m16227a(User user) {
            C47923rD1.this.m16243V();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m16227a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "googlePayReady", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rD1$c */
    /* loaded from: classes2.dex */
    public static final class C27879c extends Lambda implements Function1<Boolean, Unit> {
        public C27879c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean googlePayReady) {
            C22454gl c22454gl = C47923rD1.this.f106695c;
            Intrinsics.checkNotNullExpressionValue(googlePayReady, "googlePayReady");
            c22454gl.m37693P1(googlePayReady.booleanValue());
            C47923rD1.this.f106699g.mo55907x(new GooglePayEligible(googlePayReady));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/H;", "", "emitter", "", "invoke", "(Lio/reactivex/H;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rD1$d */
    /* loaded from: classes2.dex */
    public static final class C27880d extends Lambda implements Function1<InterfaceC23444H<Boolean>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ IsReadyToPayRequest f106710h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27880d(IsReadyToPayRequest isReadyToPayRequest) {
            super(1);
            this.f106710h = isReadyToPayRequest;
        }

        /* renamed from: b */
        public static final void m16225b(InterfaceC23444H emitter, Task task) {
            Intrinsics.checkNotNullParameter(emitter, "$emitter");
            Intrinsics.checkNotNullParameter(task, "task");
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.areEqual((Boolean) task.getResult(ApiException.class), bool)) {
                emitter.onSuccess(bool);
            } else {
                emitter.onSuccess(Boolean.FALSE);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23444H<Boolean> interfaceC23444H) {
            invoke2(interfaceC23444H);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(final InterfaceC23444H<Boolean> emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            Task<Boolean> m109035i = C47923rD1.this.m16252G().m109035i(this.f106710h);
            Intrinsics.checkNotNullExpressionValue(m109035i, "getGooglePaymentsClient().isReadyToPay(request)");
            m109035i.addOnCompleteListener(new OnCompleteListener() { // from class: sD1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    C47923rD1.C27880d.m16225b(InterfaceC23444H.this, task);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/stripe/android/model/Token;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lcom/stripe/android/model/Token;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: rD1$e */
    /* loaded from: classes2.dex */
    public static final class C27881e extends Lambda implements Function1<Token, Unit> {
        public C27881e() {
            super(1);
        }

        /* renamed from: a */
        public final void m16224a(Token token) {
            C47923rD1.this.f106705m.onNext(Boolean.TRUE);
            C47923rD1.this.f106699g.mo55956N(new GooglePayAuthSheetSuccess());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Token token) {
            m16224a(token);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rD1$f */
    /* loaded from: classes2.dex */
    public static final class C27882f extends Lambda implements Function1<Throwable, Unit> {
        public C27882f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C47923rD1.this.f106705m.onNext(Boolean.FALSE);
            C47923rD1.this.f106699g.mo55956N(new GooglePayAuthSheetError());
        }
    }

    public C47923rD1(Context context, C22454gl preference, AM3 paymentManager, InterfaceC47178px5 setupIntentManager, C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, InterfaceC44647lh6 userManager, InterfaceC35660Rh6 userStream, InterfaceC40099e13 navigator, InterfaceC20357fL birdDeviceCheckManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(paymentManager, "paymentManager");
        Intrinsics.checkNotNullParameter(setupIntentManager, "setupIntentManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(birdDeviceCheckManager, "birdDeviceCheckManager");
        this.f106694b = context;
        this.f106695c = preference;
        this.f106696d = paymentManager;
        this.f106697e = setupIntentManager;
        this.f106698f = reactiveConfig;
        this.f106699g = analyticsManager;
        this.f106700h = userManager;
        this.f106701i = userStream;
        this.f106702j = navigator;
        this.f106703k = birdDeviceCheckManager;
        C24552a<Boolean> m31921g = C24552a.m31921g(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(m31921g, "createDefault(false)");
        this.f106705m = m31921g;
        Observable<User> mo76576i = userStream.mo76576i();
        final C27877a c27877a = new C27877a();
        mo76576i.subscribe(new InterfaceC23484g() { // from class: jD1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C47923rD1.m16255C(Function1.this, obj);
            }
        });
    }

    /* renamed from: C */
    public static final void m16255C(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static /* synthetic */ PaymentDataRequest m16253F(C47923rD1 c47923rD1, Currency currency, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return c47923rD1.m16254D(currency, str, str2);
    }

    /* renamed from: I */
    public static final Boolean m16251I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Boolean) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m16250J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m16248O(C47923rD1 this$0, PaymentAddSource paymentAddSource) {
        String str;
        Boolean bool;
        String str2;
        Long l;
        String str3;
        Boolean bool2;
        Long l2;
        Integer autoPayIncentiveAmount;
        Integer autoPayRefillAmount;
        Object obj;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Balance m59035e = this$0.f106700h.mo26977K().getValue().m59035e();
        InterfaceC1880Ea interfaceC1880Ea = this$0.f106699g;
        Boolean valueOf = Boolean.valueOf(UserKt.isInRegistration(this$0.f106695c.m37750B0()));
        if (paymentAddSource != null) {
            str = paymentAddSource.name();
        } else {
            str = null;
        }
        if (m59035e != null) {
            bool = m59035e.getAutoPayActive();
        } else {
            bool = null;
        }
        List<AutoPayPlanConfig> autoPayPlans = this$0.f106698f.m82623f8().m73665a().getRideConfig().getAutoPayPlans();
        if (autoPayPlans != null) {
            Iterator<T> it = autoPayPlans.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    AutoPayPlanConfig autoPayPlanConfig = (AutoPayPlanConfig) obj;
                    boolean z = false;
                    if (m59035e != null) {
                        int refillAmount = autoPayPlanConfig.getRefillAmount();
                        Integer autoPayRefillAmount2 = m59035e.getAutoPayRefillAmount();
                        if (autoPayRefillAmount2 != null && refillAmount == autoPayRefillAmount2.intValue()) {
                            z = true;
                            continue;
                        }
                    }
                    if (z) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            AutoPayPlanConfig autoPayPlanConfig2 = (AutoPayPlanConfig) obj;
            if (autoPayPlanConfig2 != null) {
                str2 = autoPayPlanConfig2.getId();
                if (m59035e == null && (autoPayRefillAmount = m59035e.getAutoPayRefillAmount()) != null) {
                    l = Long.valueOf(autoPayRefillAmount.intValue());
                } else {
                    l = null;
                }
                if (m59035e == null) {
                    str3 = m59035e.getCurrency();
                } else {
                    str3 = null;
                }
                if (m59035e == null && (autoPayIncentiveAmount = m59035e.getAutoPayIncentiveAmount()) != null) {
                    bool2 = valueOf;
                    l2 = Long.valueOf(autoPayIncentiveAmount.intValue());
                } else {
                    bool2 = valueOf;
                    l2 = null;
                }
                interfaceC1880Ea.mo55905y(new C49200tN3(null, null, null, bool2, str, "stripe", "google_pay", bool, str2, l, str3, l2, String.valueOf(this$0.f106698f.m82623f8().m73665a().getPaymentConfig().getDeviceVerificationMethod()), this$0.f106703k.mo21336c(), 7, null));
            }
        }
        str2 = null;
        if (m59035e == null) {
        }
        l = null;
        if (m59035e == null) {
        }
        if (m59035e == null) {
        }
        bool2 = valueOf;
        l2 = null;
        interfaceC1880Ea.mo55905y(new C49200tN3(null, null, null, bool2, str, "stripe", "google_pay", bool, str2, l, str3, l2, String.valueOf(this$0.f106698f.m82623f8().m73665a().getPaymentConfig().getDeviceVerificationMethod()), this$0.f106703k.mo21336c(), 7, null));
    }

    /* renamed from: P */
    public static final InterfaceC23496h m16247P(C47923rD1 this$0, String id) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(id, "$id");
        return this$0.f106696d.mo85646w(id);
    }

    /* renamed from: Q */
    public static final void m16246Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final void m16245R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final void m16244T(C47923rD1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f106705m.onNext(Boolean.FALSE);
        this$0.f106699g.mo55956N(new GooglePayAuthSheetCanceled());
    }

    /* renamed from: D */
    public final PaymentDataRequest m16254D(Currency currency, String str, String str2) {
        String jSONObject = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0).put("allowedPaymentMethods", new JSONArray().put(new JSONObject().put("type", "CARD").put("parameters", new JSONObject().put("allowedAuthMethods", new JSONArray().put("PAN_ONLY").put("CRYPTOGRAM_3DS")).put("allowedCardNetworks", new JSONArray().put("AMEX").put("DISCOVER").put("JCB").put("MASTERCARD").put("VISA"))).put("tokenizationSpecification", new GooglePayConfig(this.f106701i.mo76575j().getValue().m59038b(), null, 2, null).getTokenizationSpecification()))).put("transactionInfo", new JSONObject().put("totalPrice", str).putOpt("totalPriceLabel", str2).put("totalPriceStatus", "FINAL").put("currencyCode", currency.getCurrencyCode())).toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "JSONObject()\n      .put(…      )\n      .toString()");
        C41318g46.m40163a("making payment data request for google pay: " + jSONObject, new Object[0]);
        PaymentDataRequest m50523s = PaymentDataRequest.m50523s(jSONObject);
        Intrinsics.checkNotNullExpressionValue(m50523s, "fromJson(paymentDataRequest)");
        return m50523s;
    }

    /* renamed from: G */
    public EP3 m16252G() {
        EP3 ep3 = this.f106704l;
        if (ep3 == null) {
            EP3 m89236b = C35336Px6.m89236b(this.f106694b, new C35336Px6.C6596a.C6597a().m89234b(this.f106695c.m37699O().m9903e()).m89235a());
            Intrinsics.checkNotNullExpressionValue(m89236b, "getPaymentsClient(contex…llet)\n          .build())");
            this.f106704l = m89236b;
            return m89236b;
        }
        return ep3;
    }

    /* renamed from: N */
    public AbstractC23442F<Boolean> m16249N() {
        IsReadyToPayRequest m50528b = IsReadyToPayRequest.m50530u().m50529a(1).m50529a(2).m50528b();
        Intrinsics.checkNotNullExpressionValue(m50528b, "newBuilder()\n      .addA…IZED_CARD)\n      .build()");
        return C45832nh5.m23305k(new C27880d(m50528b));
    }

    /* renamed from: V */
    public final void m16243V() {
        this.f106704l = null;
    }

    /* renamed from: Z */
    public <T> AbstractC23442F<T> m16242Z(AbstractC23442F<T> abstractC23442F) {
        return InterfaceC38798br4.C13315a.m62279p(this, abstractC23442F);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: c */
    public InterfaceC23497i mo212c() {
        return InterfaceC38798br4.C13315a.m62290e(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
        if (r4 == null) goto L30;
     */
    @Override // p000.InterfaceC42586iD1
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC23461c mo16240d(int i, Intent intent, boolean z, PaymentAddSource paymentAddSource) {
        AbstractC23461c m33080F;
        String str;
        if (i != -1) {
            if (i != 0) {
                String str2 = "Unknown Google Pay Error";
                if (i != 1) {
                    AbstractC23461c m33080F2 = AbstractC23461c.m33080F(new Exception("Unknown Google Pay Error"));
                    Intrinsics.checkNotNullExpressionValue(m33080F2, "error(Exception(\"Unknown Google Pay Error\"))");
                    return m33080F2;
                }
                if (intent != null) {
                    Status m65337a = C12186at.m65337a(intent);
                    if (m65337a != null) {
                        str = m65337a.getStatusMessage();
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        str2 = str;
                    }
                }
                C41318g46.m40159e(new Exception(str2));
                AbstractC23461c m33080F3 = AbstractC23461c.m33080F(new Exception(str2));
                Intrinsics.checkNotNullExpressionValue(m33080F3, "{\n        val message: S…ception(message))\n      }");
                return m33080F3;
            }
            AbstractC23461c m33039p = AbstractC23461c.m33039p();
            Intrinsics.checkNotNullExpressionValue(m33039p, "{\n        Completable.complete()\n      }");
            return m33039p;
        }
        if (intent != null) {
            PaymentData m50525s = PaymentData.m50525s(intent);
            if (m50525s == null || (m33080F = this.f106697e.mo18387b(m50525s, z, paymentAddSource)) == null) {
                m33080F = AbstractC23461c.m33080F(new Exception("No data returned by Google Pay"));
                Intrinsics.checkNotNullExpressionValue(m33080F, "error(Exception(\"No data returned by Google Pay\"))");
            }
        }
        C41318g46.m40159e(new NullPointerException("No data returned from Google Pay (data was null)."));
        m33080F = AbstractC23461c.m33080F(new Exception("No data returned by Google Pay"));
        Intrinsics.checkNotNullExpressionValue(m33080F, "error(Exception(\"No data returned by Google Pay\"))");
        return m33080F;
    }

    @Override // p000.InterfaceC42586iD1
    /* renamed from: e */
    public void mo16239e(Currency currency, Long l, Long l2, boolean z) {
        String str;
        long j;
        Intrinsics.checkNotNullParameter(currency, "currency");
        String str2 = null;
        if (l != null) {
            l.longValue();
            C51916xx1 c51916xx1 = C51916xx1.f118396a;
            long longValue = l.longValue();
            if (l2 != null) {
                j = l2.longValue();
            } else {
                j = 0;
            }
            str = c51916xx1.m4398n(longValue + j, currency);
        } else {
            str = null;
        }
        if (z && l2 == null) {
            str2 = this.f106694b.getString(C45871nl4.bird_detail_price) + " (" + this.f106694b.getString(C45871nl4.plus_tax) + ")";
        } else if (z && l2 != null) {
            str2 = this.f106694b.getString(C45871nl4.bird_detail_price) + " (" + this.f106694b.getString(C45871nl4.including_tax) + ")";
        }
        Activity mo36934u3 = this.f106702j.mo36934u3();
        if (mo36934u3 != null) {
            C12186at.m65335c(m16252G().m109034j(m16254D(currency, str, str2)), mo36934u3, 10030);
            return;
        }
        throw new RuntimeException("Active Activity not set in Navigator!");
    }

    @Override // p000.InterfaceC42586iD1
    /* renamed from: f */
    public Observable<Boolean> mo16238f() {
        Observable<Boolean> hide = this.f106705m.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "googlePayAttachedSubject.hide()");
        return hide;
    }

    @Override // p000.InterfaceC42586iD1
    /* renamed from: g */
    public AbstractC23442F<Boolean> mo16237g() {
        C24530g c24530g = C24530g.f91174a;
        AbstractC23442F<Boolean> firstOrError = this.f106698f.m82590i8().firstOrError();
        Boolean bool = Boolean.FALSE;
        AbstractC23442F<Boolean> m33148R = firstOrError.m33148R(bool);
        Intrinsics.checkNotNullExpressionValue(m33148R, "reactiveConfig.googlePay….onErrorReturnItem(false)");
        AbstractC23442F m31946a = c24530g.m31946a(m33148R, m16249N());
        final C27878b c27878b = C27878b.f106707g;
        AbstractC23442F m33148R2 = m31946a.m33157I(new InterfaceC23492o() { // from class: pD1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Boolean m16251I;
                m16251I = C47923rD1.m16251I(Function1.this, obj);
                return m16251I;
            }
        }).m33148R(bool);
        final C27879c c27879c = new C27879c();
        AbstractC23442F m33101w = m33148R2.m33101w(new InterfaceC23484g() { // from class: qD1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C47923rD1.m16250J(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33101w, "override fun googlePayRe…}\n      .schedulers()\n  }");
        AbstractC23442F<Boolean> m16242Z = m16242Z(m33101w);
        Intrinsics.checkNotNullExpressionValue(m16242Z, "override fun googlePayRe…}\n      .schedulers()\n  }");
        return m16242Z;
    }

    @Override // p000.InterfaceC42586iD1
    /* renamed from: h */
    public void mo16236h(User user, Activity activity, int i, Currency currency, Long l) {
        String str;
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(currency, "currency");
        if (l != null) {
            l.longValue();
            str = C51916xx1.f118396a.m4398n(l.longValue(), currency);
        } else {
            str = null;
        }
        C12186at.m65335c(m16252G().m109034j(m16253F(this, currency, str, null, 4, null)), activity, i);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: o */
    public <T> InterfaceC23435C<T, T> mo208o() {
        return InterfaceC38798br4.C13315a.m62286i(this);
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: s */
    public <T> InterfaceC23448L<T, T> mo207s() {
        return InterfaceC38798br4.C13315a.m62284k(this);
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\"\u0010\u0003\u001a\u001e\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: rD1$b */
    /* loaded from: classes2.dex */
    public static final class C27878b extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, Boolean> {

        /* renamed from: g */
        public static final C27878b f106707g = new C27878b();

        public C27878b() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<Boolean, Boolean> pair) {
            boolean z;
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Boolean googlePayAvailableInConfig = pair.component1();
            Boolean googlePayAvailableOnDevice = pair.component2();
            Intrinsics.checkNotNullExpressionValue(googlePayAvailableInConfig, "googlePayAvailableInConfig");
            if (googlePayAvailableInConfig.booleanValue()) {
                Intrinsics.checkNotNullExpressionValue(googlePayAvailableOnDevice, "googlePayAvailableOnDevice");
                if (googlePayAvailableOnDevice.booleanValue()) {
                    z = true;
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends Boolean, ? extends Boolean> pair) {
            return invoke2((Pair<Boolean, Boolean>) pair);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3  */
    @Override // p000.InterfaceC42586iD1
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC24507p<Token> mo16241c(int i, Intent intent, boolean z, final PaymentAddSource paymentAddSource) {
        AbstractC24507p m32023v;
        String str;
        AbstractC24507p m32023v2;
        Token token;
        final String id;
        AbstractC24507p abstractC24507p = null;
        abstractC24507p = null;
        if (i == -1) {
            if (intent != null) {
                PaymentData m50525s = PaymentData.m50525s(intent);
                String m50524u = m50525s != null ? m50525s.m50524u() : null;
                GooglePayResult fromJson = m50524u != null ? GooglePayResult.Companion.fromJson(new JSONObject(m50524u)) : null;
                if (fromJson != null && (token = fromJson.getToken()) != null) {
                    if (z) {
                        Card card = token.getCard();
                        if (card != null && (id = card.getId()) != null) {
                            abstractC24507p = this.f106696d.mo85649v(token).m33029z(new InterfaceC23478a() { // from class: kD1
                                @Override // io.reactivex.functions.InterfaceC23478a
                                public final void run() {
                                    C47923rD1.m16248O(C47923rD1.this, paymentAddSource);
                                }
                            }).m33049i(AbstractC23461c.m33035t(new Callable() { // from class: lD1
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    InterfaceC23496h m16247P;
                                    m16247P = C47923rD1.m16247P(C47923rD1.this, id);
                                    return m16247P;
                                }
                            })).m33046j0(token).m33125j0();
                        }
                        if (abstractC24507p == null) {
                            abstractC24507p = AbstractC24507p.m32068G(token);
                            Intrinsics.checkNotNullExpressionValue(abstractC24507p, "run { Maybe.just(token) }");
                        }
                    } else {
                        abstractC24507p = AbstractC24507p.m32068G(token);
                        Intrinsics.checkNotNullExpressionValue(abstractC24507p, "{\n              Maybe.just(token)\n            }");
                    }
                    if (abstractC24507p != null) {
                        m32023v2 = abstractC24507p;
                        if (m32023v2 != null) {
                            m32023v = m32023v2;
                        }
                    }
                }
                if (m50525s == null) {
                    str = Action.PAYMENT_DATA;
                } else if (m50524u == null) {
                    str = "paymentInfoJson";
                } else if (fromJson == null) {
                    str = "googlePayResult";
                } else {
                    str = fromJson.getToken() == null ? "token" : "no field";
                }
                C41318g46.m40159e(new NullPointerException("No token parsed from google pay response intent data. " + str + " was null"));
                m32023v2 = AbstractC24507p.m32023v(new Exception("No data returned by Google Pay"));
                Intrinsics.checkNotNullExpressionValue(m32023v2, "error<Token>(Exception(\"…returned by Google Pay\"))");
                if (m32023v2 != null) {
                }
            }
            C41318g46.m40159e(new NullPointerException("No data returned from Google Pay (data was null)."));
            m32023v = AbstractC24507p.m32023v(new Exception("No data returned by Google Pay"));
        } else if (i != 0) {
            String str2 = "Unknown Google Pay Error";
            if (i != 1) {
                m32023v = AbstractC24507p.m32023v(new Exception("Unknown Google Pay Error"));
            } else {
                if (intent != null) {
                    Status m65337a = C12186at.m65337a(intent);
                    String statusMessage = m65337a != null ? m65337a.getStatusMessage() : null;
                    if (statusMessage != null) {
                        str2 = statusMessage;
                    }
                }
                m32023v = AbstractC24507p.m32023v(new Exception(str2));
            }
        } else {
            m32023v = AbstractC24507p.m32024u();
        }
        final C27881e c27881e = new C27881e();
        AbstractC24507p m32026s = m32023v.m32026s(new InterfaceC23484g() { // from class: mD1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C47923rD1.m16246Q(Function1.this, obj);
            }
        });
        final C27882f c27882f = new C27882f();
        AbstractC24507p<Token> m32031n = m32026s.m32029p(new InterfaceC23484g() { // from class: nD1
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C47923rD1.m16245R(Function1.this, obj);
            }
        }).m32031n(new InterfaceC23478a() { // from class: oD1
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C47923rD1.m16244T(C47923rD1.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32031n, "override fun handleGoogl…etCanceled())\n      }\n  }");
        return m32031n;
    }

    @Override // p000.InterfaceC38798br4
    /* renamed from: m */
    public <T> InterfaceC24575v<T, T> mo209m() {
        return InterfaceC38798br4.C13315a.m62288g(this);
    }
}
