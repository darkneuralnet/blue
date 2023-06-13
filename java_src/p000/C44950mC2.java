package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.BirdPayment;
import co.bird.android.model.CurrentRental;
import co.bird.android.model.DeliveryWindow;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.RentalPlan;
import co.bird.android.model.User;
import co.bird.android.model.analytics.PaymentMethodAdded;
import co.bird.android.model.analytics.RentalCancelled;
import co.bird.android.model.analytics.RentalEnded;
import co.bird.android.model.analytics.RentalSignedUp;
import co.bird.android.model.analytics.RentalSummaryShown;
import co.bird.android.model.constant.RentalKind;
import co.bird.android.model.constant.RentalStatus;
import co.bird.android.navigator.LongTermRentalSignUpResult;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.model.Card;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.Token;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23485h;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import java.util.Currency;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p000.C44950mC2;
import p000.H31;
import p000.InterfaceC40099e13;
import p000.InterfaceC41921h56;
import p000.InterfaceC42586iD1;
import p000.InterfaceC44782lv1;
@Metadata(m28433d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 w2\u00020\u0001:\u0001xBs\b\u0007\u0012\u0006\u0010?\u001a\u00020<\u0012\u0006\u0010C\u001a\u00020@\u0012\u0006\u0010G\u001a\u00020D\u0012\u0006\u0010K\u001a\u00020H\u0012\u0006\u0010O\u001a\u00020L\u0012\u0006\u0010S\u001a\u00020P\u0012\u0006\u0010W\u001a\u00020T\u0012\b\b\u0001\u0010[\u001a\u00020X\u0012\b\b\u0001\u0010_\u001a\u00020\\\u0012\b\b\u0001\u0010c\u001a\u00020`\u0012\b\b\u0001\u0010g\u001a\u00020d\u0012\b\b\u0001\u0010k\u001a\u00020h¢\u0006\u0004\bu\u0010vJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J)\u0010\u000b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0006H\u0002J3\u0010\u0018\u001a\u00020\u00022\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001d\u001a\u00020\u00022\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\b2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\bH\u0002J3\u0010!\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b!\u0010\"J#\u0010#\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b#\u0010$J\b\u0010%\u001a\u00020\u0002H\u0002J\u0010\u0010(\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0002J\b\u0010)\u001a\u00020\u0006H\u0002J\u0012\u0010,\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010*H\u0016J\b\u0010-\u001a\u00020\u0002H\u0016J\"\u00103\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.2\b\u00102\u001a\u0004\u0018\u000101H\u0016J\u000e\u00106\u001a\b\u0012\u0004\u0012\u00020504H\u0016J\u000e\u00107\u001a\b\u0012\u0004\u0012\u00020\u000604H\u0016J\u000e\u00109\u001a\b\u0012\u0004\u0012\u00020804H\u0016J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020:04H\u0016R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR.\u0010p\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t m*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\b0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\"\u0010r\u001a\u0010\u0012\f\u0012\n m*\u0004\u0018\u00010\u00060\u00060l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010oR\"\u0010t\u001a\u0010\u0012\f\u0012\n m*\u0004\u0018\u00010\u00020\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010o¨\u0006y"}, m28432d2 = {"LmC2;", "Llv1;", "", "X0", "d0", "T", "", "googlePay", "Lco/bird/android/buava/Optional;", "Lcom/stripe/android/core/model/StripeModel;", "existingCard", "W0", "(Ljava/lang/Boolean;Lco/bird/android/buava/Optional;)V", "U0", "Lio/reactivex/c;", "R0", "Y0", "isCancelable", "Lio/reactivex/F;", "Lco/bird/android/model/DialogResponse;", "o0", "Lco/bird/android/model/constant/RentalStatus;", "statusOptional", "isEnded", "Q0", "(Lco/bird/android/buava/Optional;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "rentalId", "status", "q0", "Lco/bird/android/model/RentalPlan;", "plan", "includeBirdCare", "P0", "(Lco/bird/android/model/RentalPlan;Lco/bird/android/buava/Optional;Ljava/lang/Boolean;)V", "O0", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "M0", "Lco/bird/android/navigator/LongTermRentalSignUpResult$b;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "T0", "p0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onResume", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Lio/reactivex/Observable;", "", "Bk", "g7", "LEi0;", "m7", "LGi0;", "rc", "LEa;", "b", "LEa;", "analyticsManager", "Llh6;", "c", "Llh6;", "userManager", "LiD1;", DateTokenConverter.CONVERTER_KEY, "LiD1;", "googlePayManager", "LCx4;", "e", "LCx4;", "manager", "Landroid/content/Context;", "f", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "LAM3;", "g", "LAM3;", "paymentManagerV2", "LpM3;", "h", "LpM3;", "paymentIntentManager", "LQA2;", "i", "LQA2;", RequestHeadersFactory.MODEL, "Lcom/uber/autodispose/ScopeProvider;", "j", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LxC2;", "k", "LxC2;", "ui", "Landroid/app/Activity;", "l", "Landroid/app/Activity;", "activity", "Le13;", "m", "Le13;", "navigator", "LAG;", "kotlin.jvm.PlatformType", "n", "LAG;", "defaultCreditCard", "o", "googlePayAvailable", "p", "proceedImmediately", "<init>", "(LEa;Llh6;LiD1;LCx4;Landroid/content/Context;LAM3;LpM3;LQA2;Lcom/uber/autodispose/ScopeProvider;LxC2;Landroid/app/Activity;Le13;)V", "q", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLongTermRentalSetupSummaryPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongTermRentalSetupSummaryPresenter.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupSummaryPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 Observables.kt\nio/reactivex/rxkotlin/Observables\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,550:1\n180#2:551\n180#2:552\n180#2:553\n180#2:554\n180#2:555\n180#2:556\n180#2:557\n180#2:560\n180#2:562\n199#2:563\n218#2:564\n199#2:565\n180#2:566\n180#2:567\n180#2:568\n180#2:569\n199#2:570\n237#2:571\n180#2:572\n180#2:573\n237#2:574\n41#3,2:558\n1#4:561\n*S KotlinDebug\n*F\n+ 1 LongTermRentalSetupSummaryPresenter.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupSummaryPresenter\n*L\n107#1:551\n123#1:552\n130#1:553\n138#1:554\n145#1:555\n155#1:556\n167#1:557\n200#1:560\n224#1:562\n237#1:563\n250#1:564\n268#1:565\n283#1:566\n307#1:567\n316#1:568\n326#1:569\n342#1:570\n397#1:571\n404#1:572\n438#1:573\n452#1:574\n194#1:558,2\n*E\n"})
/* renamed from: mC2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C44950mC2 implements InterfaceC44782lv1 {

    /* renamed from: q */
    public static final C25957a f97543q = new C25957a(null);

    /* renamed from: r */
    public static final int f97544r = 8;

    /* renamed from: s */
    public static final DateTimeFormatter f97545s = DateTimeFormat.forStyle("L-");

    /* renamed from: b */
    public final InterfaceC1880Ea f97546b;

    /* renamed from: c */
    public final InterfaceC44647lh6 f97547c;

    /* renamed from: d */
    public final InterfaceC42586iD1 f97548d;

    /* renamed from: e */
    public final InterfaceC32292Cx4 f97549e;

    /* renamed from: f */
    public final Context f97550f;

    /* renamed from: g */
    public final AM3 f97551g;

    /* renamed from: h */
    public final InterfaceC46820pM3 f97552h;

    /* renamed from: i */
    public final QA2 f97553i;

    /* renamed from: j */
    public final ScopeProvider f97554j;

    /* renamed from: k */
    public final C51471xC2 f97555k;

    /* renamed from: l */
    public final Activity f97556l;

    /* renamed from: m */
    public final InterfaceC40099e13 f97557m;

    /* renamed from: n */
    public final C0058AG<Optional<StripeModel>> f97558n;

    /* renamed from: o */
    public final C0058AG<Boolean> f97559o;

    /* renamed from: p */
    public final C0058AG<Unit> f97560p;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mC2$A */
    /* loaded from: classes2.dex */
    public static final class C25937A extends Lambda implements Function1<Throwable, Unit> {
        public C25937A() {
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
            C44950mC2.this.f97555k.error(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\n\u0010\n\u001a\u00028\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00028\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "T1", "T2", "T3", "R", "t1", "t2", "t3", "apply", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nObservables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Observables.kt\nio/reactivex/rxkotlin/Observables$combineLatest$3\n+ 2 LongTermRentalSetupSummaryPresenter.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupSummaryPresenter\n*L\n1#1,304:1\n198#2:305\n*E\n"})
    /* renamed from: mC2$B */
    /* loaded from: classes2.dex */
    public static final class C25938B<T1, T2, T3, R> implements InterfaceC23485h<T1, T2, T3, R> {
        @Override // io.reactivex.functions.InterfaceC23485h
        public final R apply(T1 t1, T2 t2, T3 t3) {
            Optional optional = (Optional) t2;
            return (R) new Triple(((Optional) t1).m59035e(), optional, (Boolean) t3);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lorg/joda/time/DateTime;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lorg/joda/time/DateTime;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mC2$C */
    /* loaded from: classes2.dex */
    public static final class C25939C extends Lambda implements Function1<Optional<DateTime>, DateTime> {

        /* renamed from: g */
        public static final C25939C f97562g = new C25939C();

        public C25939C() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DateTime invoke(Optional<DateTime> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m59038b();
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072z\u0010\u0006\u001av\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005 \u0002*:\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lorg/joda/time/DateTime;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/constant/RentalStatus;", "", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mC2$D */
    /* loaded from: classes2.dex */
    public static final class C25940D extends Lambda implements Function1<Triple<? extends DateTime, ? extends Optional<RentalStatus>, ? extends Boolean>, Unit> {
        public C25940D() {
            super(1);
        }

        /* renamed from: a */
        public final void m26058a(Triple<DateTime, Optional<RentalStatus>, Boolean> triple) {
            int i;
            String date;
            int i2;
            DateTime component1 = triple.component1();
            Optional<RentalStatus> component2 = triple.component2();
            Boolean component3 = triple.component3();
            if (component2.m59035e() != RentalStatus.SCHEDULED && component3.booleanValue()) {
                i = C45871nl4.long_term_rental_return_date_label;
            } else {
                i = C45871nl4.long_term_rental_return_or_auto_renew_date_label;
            }
            LocalDate localDate = component1.toLocalDate();
            LocalDate now = LocalDate.now();
            RentalStatus m59035e = component2.m59035e();
            RentalStatus rentalStatus = RentalStatus.PICKUP;
            if (m59035e != rentalStatus) {
                date = C44950mC2.f97545s.print(component1);
            } else if (localDate.compareTo((ReadablePartial) now) > 0) {
                date = C44950mC2.this.f97550f.getString(C45871nl4.long_term_rental_return_due_date, C44950mC2.f97545s.print(component1));
            } else if (Intrinsics.areEqual(localDate, now)) {
                date = C44950mC2.this.f97550f.getString(C45871nl4.long_term_rental_return_due_today_date, C44950mC2.f97545s.print(component1));
            } else {
                date = C44950mC2.this.f97550f.getString(C45871nl4.long_term_rental_return_overdue);
            }
            if (component2.m59035e() != rentalStatus) {
                i2 = C32364Df4.colorPrimaryDarkAlt;
            } else if (localDate.compareTo((ReadablePartial) now) >= 0) {
                i2 = C32364Df4.green;
            } else {
                i2 = C32364Df4.red;
            }
            C51471xC2 c51471xC2 = C44950mC2.this.f97555k;
            Intrinsics.checkNotNullExpressionValue(date, "date");
            c51471xC2.m5692gm(i, date, i2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends DateTime, ? extends Optional<RentalStatus>, ? extends Boolean> triple) {
            m26058a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062n\u0010\u0005\u001aj\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*4\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/RentalPlan;", "Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mC2$E */
    /* loaded from: classes2.dex */
    public static final class C25941E extends Lambda implements Function1<Triple<? extends RentalPlan, ? extends Optional<Boolean>, ? extends Boolean>, Unit> {
        public C25941E() {
            super(1);
        }

        /* renamed from: a */
        public final void m26057a(Triple<RentalPlan, Optional<Boolean>, Boolean> triple) {
            C44950mC2.this.m26133P0(triple.component1(), triple.component2(), triple.component3());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends RentalPlan, ? extends Optional<Boolean>, ? extends Boolean> triple) {
            m26057a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062z\u0010\u0005\u001av\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004 \u0003*:\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/constant/RentalStatus;", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mC2$F */
    /* loaded from: classes2.dex */
    public static final class C25942F extends Lambda implements Function1<Triple<? extends Optional<RentalStatus>, ? extends Boolean, ? extends Boolean>, Unit> {
        public C25942F() {
            super(1);
        }

        /* renamed from: a */
        public final void m26056a(Triple<Optional<RentalStatus>, Boolean, Boolean> triple) {
            C44950mC2.this.m26131Q0(triple.component1(), triple.component2(), triple.component3());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Optional<RentalStatus>, ? extends Boolean, ? extends Boolean> triple) {
            m26056a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012v\u0010\u0002\u001ar\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0006*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00040\u0004 \u0006*8\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0006*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/model/constant/RentalStatus;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mC2$G */
    /* loaded from: classes2.dex */
    public static final class C25943G extends Lambda implements Function1<Pair<? extends Optional<String>, ? extends Optional<RentalStatus>>, Unit> {
        public C25943G() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Optional<String>, ? extends Optional<RentalStatus>> pair) {
            invoke2((Pair<Optional<String>, Optional<RentalStatus>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Optional<String>, Optional<RentalStatus>> pair) {
            C44950mC2.this.m26078q0(pair.component1(), pair.component2());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mC2$H */
    /* loaded from: classes2.dex */
    public static final class C25944H extends Lambda implements Function1<Optional<String>, Unit> {
        public C25944H() {
            super(1);
        }

        /* renamed from: a */
        public final void m26055a(Optional<String> optional) {
            C51471xC2 c51471xC2 = C44950mC2.this.f97555k;
            String m59035e = optional.m59035e();
            if (m59035e == null) {
                m59035e = "";
            }
            c51471xC2.m5699Zl(m59035e);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<String> optional) {
            m26055a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RentalPlan;", "kotlin.jvm.PlatformType", "planOption", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mC2$I */
    /* loaded from: classes2.dex */
    public static final class C25945I extends Lambda implements Function1<Optional<RentalPlan>, Unit> {
        public C25945I() {
            super(1);
        }

        /* renamed from: a */
        public final void m26054a(Optional<RentalPlan> optional) {
            C51471xC2 c51471xC2 = C44950mC2.this.f97555k;
            RentalPlan m59035e = optional.m59035e();
            c51471xC2.m5694em(m59035e != null ? m59035e.getNotes() : null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<RentalPlan> optional) {
            m26054a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "notes", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nLongTermRentalSetupSummaryPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongTermRentalSetupSummaryPresenter.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupSummaryPresenter$onCreate$5\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,550:1\n1#2:551\n*E\n"})
    /* renamed from: mC2$J */
    /* loaded from: classes2.dex */
    public static final class C25946J extends Lambda implements Function1<String, Unit> {
        public C25946J() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String it) {
            boolean isBlank;
            C51471xC2 c51471xC2 = C44950mC2.this.f97555k;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            isBlank = StringsKt__StringsJVMKt.isBlank(it);
            if (!(!isBlank)) {
                it = null;
            }
            if (it == null) {
                it = C44950mC2.this.f97550f.getString(C45871nl4.none);
                Intrinsics.checkNotNullExpressionValue(it, "context.getString(L.string.none)");
            }
            c51471xC2.m5698am(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/DeliveryWindow;", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mC2$K */
    /* loaded from: classes2.dex */
    public static final class C25947K extends Lambda implements Function1<Optional<DeliveryWindow>, Boolean> {

        /* renamed from: g */
        public static final C25947K f97570g = new C25947K();

        public C25947K() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<DeliveryWindow> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/DeliveryWindow;", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/model/DeliveryWindow;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mC2$L */
    /* loaded from: classes2.dex */
    public static final class C25948L extends Lambda implements Function1<Optional<DeliveryWindow>, DeliveryWindow> {

        /* renamed from: g */
        public static final C25948L f97571g = new C25948L();

        public C25948L() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final DeliveryWindow invoke(Optional<DeliveryWindow> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m59038b();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DeliveryWindow;", "kotlin.jvm.PlatformType", "window", "", C17296a.f69688o, "(Lco/bird/android/model/DeliveryWindow;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mC2$M */
    /* loaded from: classes2.dex */
    public static final class C25949M extends Lambda implements Function1<DeliveryWindow, Unit> {
        public C25949M() {
            super(1);
        }

        /* renamed from: a */
        public final void m26051a(DeliveryWindow window) {
            C51471xC2 c51471xC2 = C44950mC2.this.f97555k;
            Intrinsics.checkNotNullExpressionValue(window, "window");
            c51471xC2.m5696cm(window);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DeliveryWindow deliveryWindow) {
            m26051a(deliveryWindow);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lorg/joda/time/DateTime;", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mC2$N */
    /* loaded from: classes2.dex */
    public static final class C25950N extends Lambda implements Function1<Optional<DateTime>, Boolean> {

        /* renamed from: g */
        public static final C25950N f97573g = new C25950N();

        public C25950N() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<DateTime> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mC2$O */
    /* loaded from: classes2.dex */
    public static final class C25951O extends Lambda implements Function1<Unit, String> {
        public C25951O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C44950mC2.this.f97553i.m88829j().getSupport().getSupportArticleId();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "articleId", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mC2$P */
    /* loaded from: classes2.dex */
    public static final class C25952P extends Lambda implements Function1<String, Unit> {
        public C25952P() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String articleId) {
            InterfaceC40099e13 interfaceC40099e13 = C44950mC2.this.f97557m;
            Intrinsics.checkNotNullExpressionValue(articleId, "articleId");
            interfaceC40099e13.mo36922w3(Long.parseLong(articleId));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mC2$Q */
    /* loaded from: classes2.dex */
    public static final class C25953Q extends Lambda implements Function1<Unit, Object> {

        /* renamed from: g */
        public static final C25953Q f97576g = new C25953Q();

        public C25953Q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Object invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Ltg1;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ltg1;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mC2$R */
    /* loaded from: classes2.dex */
    public static final class C25954R extends Lambda implements Function1<C49375tg1, InterfaceC23496h> {

        /* renamed from: g */
        public static final C25954R f97577g = new C25954R();

        public C25954R() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(C49375tg1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractC23461c.m33080F(new C50032um5(it.m11932c()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mC2$S */
    /* loaded from: classes2.dex */
    public static final class C25955S extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, Unit> {
        public C25955S() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends Boolean> pair) {
            invoke2((Pair<Boolean, Boolean>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, Boolean> pair) {
            C44950mC2.this.m26135O0(pair.component1(), pair.component2());
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mC2$T */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C25956T extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C25956T f97579b = new C25956T();

        public C25956T() {
            super(1, C41318g46.class, DateTokenConverter.CONVERTER_KEY, "d(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40162b(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"LmC2$a;", "", "Lorg/joda/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "DATE_FORMATTER", "Lorg/joda/time/format/DateTimeFormatter;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: mC2$a */
    /* loaded from: classes2.dex */
    public static final class C25957a {
        public /* synthetic */ C25957a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C25957a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Ltg1;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ltg1;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mC2$b */
    /* loaded from: classes2.dex */
    public static final class C25958b extends Lambda implements Function1<C49375tg1, InterfaceC23496h> {

        /* renamed from: g */
        public static final C25958b f97580g = new C25958b();

        public C25958b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(C49375tg1 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return AbstractC23461c.m33080F(C49508tt4.f111325b);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "Lco/bird/android/model/CurrentRental;", "kotlin.jvm.PlatformType", "rentals", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mC2$c */
    /* loaded from: classes2.dex */
    public static final class C25959c extends Lambda implements Function1<Optional<List<? extends CurrentRental>>, Unit> {
        public C25959c() {
            super(1);
        }

        /* renamed from: a */
        public final void m26045a(Optional<List<CurrentRental>> optional) {
            CurrentRental currentRental;
            Object firstOrNull;
            List<CurrentRental> m59035e = optional.m59035e();
            if (m59035e != null) {
                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) m59035e);
                currentRental = (CurrentRental) firstOrNull;
            } else {
                currentRental = null;
            }
            if (currentRental == null) {
                C44950mC2.this.f97557m.close();
            } else {
                C44950mC2.this.f97553i.m88846A(currentRental);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<List<? extends CurrentRental>> optional) {
            m26045a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mC2$d */
    /* loaded from: classes2.dex */
    public static final class C25960d extends Lambda implements Function1<Optional<String>, Boolean> {

        /* renamed from: g */
        public static final C25960d f97582g = new C25960d();

        public C25960d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Optional<String> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "it", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mC2$e */
    /* loaded from: classes2.dex */
    public static final class C25961e extends Lambda implements Function1<Optional<String>, String> {

        /* renamed from: g */
        public static final C25961e f97583g = new C25961e();

        public C25961e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Optional<String> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m59038b();
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a²\u0001\u0012R\b\u0001\u0012N\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004 \u0003*&\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000 \u0003*X\u0012R\b\u0001\u0012N\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004 \u0003*&\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00060\u00062(\u0010\u0005\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "", "", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lco/bird/android/model/DialogResponse;", "b", "(Lkotlin/Triple;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mC2$f */
    /* loaded from: classes2.dex */
    public static final class C25962f extends Lambda implements Function1<Triple<? extends Unit, ? extends Boolean, ? extends String>, InterfaceC23447K<? extends Triple<? extends DialogResponse, ? extends Boolean, ? extends String>>> {

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0006\u001aN\u0012\u0004\u0012\u00020\u0000\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005 \u0004*&\u0012\u0004\u0012\u00020\u0000\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lkotlin/Triple;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: mC2$f$a */
        /* loaded from: classes2.dex */
        public static final class C25963a extends Lambda implements Function1<DialogResponse, Triple<? extends DialogResponse, ? extends Boolean, ? extends String>> {

            /* renamed from: g */
            public final /* synthetic */ Boolean f97585g;

            /* renamed from: h */
            public final /* synthetic */ String f97586h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C25963a(Boolean bool, String str) {
                super(1);
                this.f97585g = bool;
                this.f97586h = str;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Triple<DialogResponse, Boolean, String> invoke(DialogResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return new Triple<>(response, this.f97585g, this.f97586h);
            }
        }

        public C25962f() {
            super(1);
        }

        /* renamed from: c */
        public static final Triple m26040c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Triple) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Triple<DialogResponse, Boolean, String>> invoke(Triple<Unit, Boolean, String> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            Boolean isCancelable = triple.component2();
            C44950mC2 c44950mC2 = C44950mC2.this;
            Intrinsics.checkNotNullExpressionValue(isCancelable, "isCancelable");
            AbstractC23442F m26082o0 = c44950mC2.m26082o0(isCancelable.booleanValue());
            final C25963a c25963a = new C25963a(isCancelable, triple.component3());
            return m26082o0.m33157I(new InterfaceC23492o() { // from class: nC2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Triple m26040c;
                    m26040c = C44950mC2.C25962f.m26040c(Function1.this, obj);
                    return m26040c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00022(\u0010\u0005\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/DialogResponse;", "", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Triple;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mC2$g */
    /* loaded from: classes2.dex */
    public static final class C25964g extends Lambda implements Function1<Triple<? extends DialogResponse, ? extends Boolean, ? extends String>, Boolean> {

        /* renamed from: g */
        public static final C25964g f97587g = new C25964g();

        public C25964g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Triple<? extends DialogResponse, Boolean, String> triple) {
            boolean z;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            if (triple.component1() == DialogResponse.OK) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mC2$i */
    /* loaded from: classes2.dex */
    public static final class C25968i extends Lambda implements Function1<Throwable, Unit> {
        public C25968i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            C51471xC2 c51471xC2 = C44950mC2.this.f97555k;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c51471xC2.error(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004 \u0006*$\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0007"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nLongTermRentalSetupSummaryPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongTermRentalSetupSummaryPresenter.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupSummaryPresenter$configureExistingRentalButtons$9\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,550:1\n1#2:551\n*E\n"})
    /* renamed from: mC2$j */
    /* loaded from: classes2.dex */
    public static final class C25969j extends Lambda implements Function1<Pair<? extends Unit, ? extends Optional<String>>, Unit> {
        public C25969j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Unit, ? extends Optional<String>> pair) {
            invoke2((Pair<Unit, Optional<String>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Unit, Optional<String>> pair) {
            String str;
            List<String> listOfNotNull;
            InterfaceC40099e13 interfaceC40099e13 = C44950mC2.this.f97557m;
            String[] strArr = new String[2];
            strArr[0] = "source:long-term-rental";
            String m59035e = pair.component2().m59035e();
            if (m59035e != null) {
                str = "rental_id:" + m59035e;
            } else {
                str = null;
            }
            strArr[1] = str;
            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) strArr);
            interfaceC40099e13.mo37074W3(listOfNotNull);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mC2$k */
    /* loaded from: classes2.dex */
    public static final class C25970k extends Lambda implements Function1<Unit, Unit> {
        public C25970k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C44950mC2.this.f97552h.mo8808i();
            InterfaceC40099e13.C19924a.goToEnterCard$default(C44950mC2.this.f97557m, EnumC50341vI4.ADD_CARD.ordinal(), false, null, 6, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012^\u0010\u0002\u001aZ\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \u0005*,\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0005*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lcom/stripe/android/core/model/StripeModel;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mC2$l */
    /* loaded from: classes2.dex */
    public static final class C25971l extends Lambda implements Function1<Pair<? extends Boolean, ? extends Optional<StripeModel>>, Unit> {
        public C25971l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Boolean, ? extends Optional<StripeModel>> pair) {
            invoke2((Pair<Boolean, Optional<StripeModel>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<Boolean, Optional<StripeModel>> pair) {
            C44950mC2.this.m26119W0(pair.component1(), pair.component2());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mC2$m */
    /* loaded from: classes2.dex */
    public static final class C25972m extends Lambda implements Function1<Unit, InterfaceC23447K<? extends User>> {
        public C25972m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends User> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C44950mC2.this.f97547c.getUser();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00052H\u0010\u0006\u001aD\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RentalPlan;", "", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Triple;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mC2$n */
    /* loaded from: classes2.dex */
    public static final class C25973n extends Lambda implements Function1<Triple<? extends User, ? extends Optional<RentalPlan>, ? extends Optional<Boolean>>, Boolean> {

        /* renamed from: g */
        public static final C25973n f97596g = new C25973n();

        public C25973n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Triple<User, Optional<RentalPlan>, Optional<Boolean>> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            return Boolean.valueOf(triple.component2().m59037c());
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0093\u0001\u0010\u0006\u001a\u008e\u0001\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0002*F\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0002*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/RentalPlan;", "", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mC2$o */
    /* loaded from: classes2.dex */
    public static final class C25974o extends Lambda implements Function1<Triple<? extends User, ? extends Optional<RentalPlan>, ? extends Optional<Boolean>>, Unit> {
        public C25974o() {
            super(1);
        }

        /* renamed from: a */
        public final void m26026a(Triple<User, Optional<RentalPlan>, Optional<Boolean>> triple) {
            User user = triple.component1();
            Optional<RentalPlan> component2 = triple.component2();
            InterfaceC42586iD1 interfaceC42586iD1 = C44950mC2.this.f97548d;
            Intrinsics.checkNotNullExpressionValue(user, "user");
            Activity activity = C44950mC2.this.f97556l;
            int ordinal = EnumC50341vI4.GOOGLE_PAY.ordinal();
            Currency m25591o = C45097mS5.m25591o(component2.m59038b().getCurrency());
            RentalPlan m59038b = component2.m59038b();
            boolean z = true;
            if (!triple.component3().m59036d(Boolean.FALSE).booleanValue()) {
                z = false;
            }
            interfaceC42586iD1.mo16236h(user, activity, ordinal, m25591o, Long.valueOf(m59038b.totalCost(z)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends User, ? extends Optional<RentalPlan>, ? extends Optional<Boolean>> triple) {
            m26026a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mC2$p */
    /* loaded from: classes2.dex */
    public static final class C25975p extends Lambda implements Function1<Throwable, Unit> {
        public C25975p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C44950mC2.this.f97555k.error(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mC2$q */
    /* loaded from: classes2.dex */
    public static final class C25976q extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Unit>> {
        public C25976q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Unit> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C44950mC2.this.m26129R0().m33046j0(Unit.INSTANCE);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mC2$r */
    /* loaded from: classes2.dex */
    public static final class C25977r extends Lambda implements Function1<Throwable, Unit> {
        public C25977r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            C51471xC2 c51471xC2 = C44950mC2.this.f97555k;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c51471xC2.error(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mC2$s */
    /* loaded from: classes2.dex */
    public static final class C25978s extends Lambda implements Function1<Unit, Unit> {
        public C25978s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C44950mC2.this.m26139M0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mC2$t */
    /* loaded from: classes2.dex */
    public static final class C25979t extends Lambda implements Function1<Throwable, Unit> {
        public C25979t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C44950mC2.this.f97555k.error(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m28432d2 = {"<anonymous>", "", "Landroid/view/View;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mC2$u */
    /* loaded from: classes2.dex */
    public static final class C25980u extends Lambda implements Function1<View, Unit> {

        /* renamed from: g */
        public final /* synthetic */ int f97603g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25980u(int i) {
            super(1);
            this.f97603g = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(View dialog) {
            Intrinsics.checkNotNullParameter(dialog, "$this$dialog");
            C50789w31 m7525a = C50789w31.m7525a(dialog);
            Intrinsics.checkNotNullExpressionValue(m7525a, "bind(this)");
            m7525a.f115215e.setText(dialog.getContext().getString(this.f97603g));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/BirdPayment;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mC2$v */
    /* loaded from: classes2.dex */
    public static final class C25981v extends Lambda implements Function1<Optional<BirdPayment>, Unit> {
        public C25981v() {
            super(1);
        }

        /* renamed from: a */
        public final void m26025a(Optional<BirdPayment> optional) {
            C0058AG c0058ag = C44950mC2.this.f97558n;
            Optional.C14443a c14443a = Optional.f63040c;
            BirdPayment m59035e = optional.m59035e();
            c0058ag.accept(c14443a.m59033b(m59035e != null ? m59035e.getStripeCard() : null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<BirdPayment> optional) {
            m26025a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mC2$w */
    /* loaded from: classes2.dex */
    public static final class C25982w extends Lambda implements Function1<Throwable, Unit> {
        public C25982w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable it) {
            C51471xC2 c51471xC2 = C44950mC2.this.f97555k;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c51471xC2.error(it);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lcom/stripe/android/model/Token;", "it", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lcom/stripe/android/model/Token;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mC2$x */
    /* loaded from: classes2.dex */
    public static final class C25983x extends Lambda implements Function1<Token, InterfaceC24574u<? extends Boolean>> {
        public C25983x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Boolean> invoke(Token it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C44950mC2.this.m26129R0().m33046j0(Boolean.TRUE).m33125j0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/stripe/android/model/Token;", "card", "", "<anonymous parameter 1>", C17296a.f69688o, "(Lcom/stripe/android/model/Token;Ljava/lang/Boolean;)Lcom/stripe/android/model/Token;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mC2$y */
    /* loaded from: classes2.dex */
    public static final class C25984y extends Lambda implements Function2<Token, Boolean, Token> {

        /* renamed from: g */
        public static final C25984y f97607g = new C25984y();

        public C25984y() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Token invoke(Token card, Boolean bool) {
            Intrinsics.checkNotNullParameter(card, "card");
            Intrinsics.checkNotNullParameter(bool, "<anonymous parameter 1>");
            return card;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lcom/stripe/android/model/Token;", "kotlin.jvm.PlatformType", "token", "", C17296a.f69688o, "(Lcom/stripe/android/model/Token;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mC2$z */
    /* loaded from: classes2.dex */
    public static final class C25985z extends Lambda implements Function1<Token, Unit> {
        public C25985z() {
            super(1);
        }

        /* renamed from: a */
        public final void m26022a(Token token) {
            String str;
            C41318g46.m40163a("onSuccess called", new Object[0]);
            InterfaceC1880Ea interfaceC1880Ea = C44950mC2.this.f97546b;
            Card card = token.getCard();
            if (card != null) {
                str = ES5.m108971d(card);
            } else {
                str = null;
            }
            interfaceC1880Ea.mo55956N(new PaymentMethodAdded(str));
            C44950mC2.this.m26139M0();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Token token) {
            m26022a(token);
            return Unit.INSTANCE;
        }
    }

    public C44950mC2(InterfaceC1880Ea analyticsManager, InterfaceC44647lh6 userManager, InterfaceC42586iD1 googlePayManager, InterfaceC32292Cx4 manager, Context context, AM3 paymentManagerV2, InterfaceC46820pM3 paymentIntentManager, QA2 model, ScopeProvider scopeProvider, C51471xC2 ui, Activity activity, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(paymentManagerV2, "paymentManagerV2");
        Intrinsics.checkNotNullParameter(paymentIntentManager, "paymentIntentManager");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f97546b = analyticsManager;
        this.f97547c = userManager;
        this.f97548d = googlePayManager;
        this.f97549e = manager;
        this.f97550f = context;
        this.f97551g = paymentManagerV2;
        this.f97552h = paymentIntentManager;
        this.f97553i = model;
        this.f97554j = scopeProvider;
        this.f97555k = ui;
        this.f97556l = activity;
        this.f97557m = navigator;
        C0058AG<Optional<StripeModel>> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<Optional<StripeModel>>()");
        this.f97558n = m115951g;
        C0058AG<Boolean> m115950h = C0058AG.m115950h(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault(false)");
        this.f97559o = m115950h;
        C0058AG<Unit> m115951g2 = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g2, "create<Unit>()");
        this.f97560p = m115951g2;
    }

    /* renamed from: A0 */
    public static final void m26163A0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: B0 */
    public static final void m26161B0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C0 */
    public static final void m26159C0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: D0 */
    public static final void m26157D0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: E0 */
    public static final void m26155E0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: F0 */
    public static final boolean m26153F0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: G0 */
    public static final DeliveryWindow m26151G0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (DeliveryWindow) tmp0.invoke(obj);
    }

    /* renamed from: H0 */
    public static final void m26149H0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I0 */
    public static final boolean m26147I0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: J0 */
    public static final DateTime m26145J0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (DateTime) tmp0.invoke(obj);
    }

    /* renamed from: K0 */
    public static final String m26143K0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: L0 */
    public static final void m26141L0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N0 */
    public static final Object m26137N0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return tmp0.invoke(obj);
    }

    /* renamed from: S0 */
    public static final InterfaceC23496h m26127S0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final InterfaceC23496h m26124U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m26122V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V0 */
    public static final void m26121V0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final boolean m26120W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: X */
    public static final String m26118X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final InterfaceC23447K m26116Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final boolean m26114Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: Z0 */
    public static final void m26113Z0(C44950mC2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BirdPayment m59035e = this$0.f97551g.mo85677e().m73665a().m59035e();
        Parcelable parcelable = null;
        if (m59035e != null) {
            Card stripeCard = m59035e.getStripeCard();
            if (stripeCard != null) {
                if (!(!ES5.m108973b(stripeCard))) {
                    stripeCard = null;
                }
                if (stripeCard != null) {
                    parcelable = stripeCard;
                }
            }
            PaymentMethod stripePaymentMethod = m59035e.getStripePaymentMethod();
            if (stripePaymentMethod != null) {
                parcelable = stripePaymentMethod.card;
            }
        }
        this$0.f97558n.accept(Optional.f63040c.m59033b(parcelable));
    }

    /* renamed from: a0 */
    public static final InterfaceC23496h m26111a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: a1 */
    public static final void m26110a1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final void m26108b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final void m26106c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final void m26102e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final InterfaceC23447K m26100f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final boolean m26098g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: h0 */
    public static final void m26096h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final void m26094i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final InterfaceC23447K m26092j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final void m26090k0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: l0 */
    public static final void m26088l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final void m26086m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final void m26084n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: r0 */
    public static final void m26076r0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s0 */
    public static final void m26074s0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: t0 */
    public static final InterfaceC24574u m26072t0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: u0 */
    public static final Token m26070u0(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Token) tmp0.invoke(obj, obj2);
    }

    /* renamed from: v0 */
    public static final void m26068v0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w0 */
    public static final void m26066w0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x0 */
    public static final void m26064x0() {
        C41318g46.m40163a("cancelled google pay", new Object[0]);
    }

    /* renamed from: y0 */
    public static final void m26062y0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: z0 */
    public static final void m26060z0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: Bk */
    public Observable<Object> mo22Bk() {
        C0058AG<Unit> c0058ag = this.f97560p;
        final C25953Q c25953q = C25953Q.f97576g;
        Observable<R> map = c0058ag.map(new InterfaceC23492o() { // from class: jC2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Object m26137N0;
                m26137N0 = C44950mC2.m26137N0(Function1.this, obj);
                return m26137N0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "proceedImmediately.map { true }");
        return map;
    }

    /* renamed from: M0 */
    public final void m26139M0() {
        String str;
        m26125T0(LongTermRentalSignUpResult.EnumC16264b.SIGNED_UP);
        InterfaceC1880Ea interfaceC1880Ea = this.f97546b;
        RentalPlan m88821r = this.f97553i.m88821r();
        String str2 = null;
        if (m88821r != null) {
            str = m88821r.getId();
        } else {
            str = null;
        }
        Optional<String> value = this.f97553i.m88827l().getValue();
        if (value != null) {
            str2 = value.m59035e();
        }
        interfaceC1880Ea.mo55956N(new RentalSignedUp(str, str2));
        this.f97546b.mo55905y(new C36270Tx4(null, null, null, this.f97553i.m88823p().toString(), 7, null));
        this.f97560p.accept(Unit.INSTANCE);
    }

    /* renamed from: O0 */
    public final void m26135O0(Boolean bool, Boolean bool2) {
        int i;
        C51471xC2 c51471xC2 = this.f97555k;
        Boolean bool3 = Boolean.TRUE;
        c51471xC2.m5690im(!Intrinsics.areEqual(bool, bool3));
        if (Intrinsics.areEqual(bool2, bool3)) {
            i = C45871nl4.long_term_rental_cancel;
        } else {
            i = C45871nl4.long_term_rental_cancel_auto_renew;
        }
        this.f97555k.m5693fm(i);
        this.f97555k.m5682qm(!Intrinsics.areEqual(bool, bool3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000a, code lost:
        r0 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(r0, "\n", null, null, 0, null, null, 62, null);
     */
    /* renamed from: P0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m26133P0(RentalPlan rentalPlan, Optional<Boolean> optional, Boolean bool) {
        boolean z;
        List<String> includedItems;
        C51471xC2 c51471xC2 = this.f97555k;
        String str = (rentalPlan == null || (r0 = rentalPlan.getIncludedItems()) == null || str == null) ? "" : "";
        c51471xC2.m5695dm(str);
        C51471xC2 c51471xC22 = this.f97555k;
        boolean z2 = true;
        if (rentalPlan != null && (includedItems = rentalPlan.getIncludedItems()) != null) {
            z = !includedItems.isEmpty();
        } else {
            z = false;
        }
        c51471xC22.m5685nm(z);
        if (rentalPlan != null) {
            C51471xC2 c51471xC23 = this.f97555k;
            long baseCost = rentalPlan.getBaseCost();
            long baseTaxCost = rentalPlan.getBaseTaxCost();
            if (optional == null || !optional.m59036d(Boolean.FALSE).booleanValue()) {
                z2 = false;
            }
            c51471xC23.m5702Wl(baseCost, baseTaxCost, rentalPlan.totalCost(z2), C45097mS5.m25591o(rentalPlan.getCurrency()));
        }
    }

    /* renamed from: Q0 */
    public final void m26131Q0(Optional<RentalStatus> optional, Boolean bool, Boolean bool2) {
        RentalStatus rentalStatus;
        boolean z;
        Integer num = null;
        if (optional != null) {
            rentalStatus = optional.m59035e();
        } else {
            rentalStatus = null;
        }
        RentalStatus rentalStatus2 = RentalStatus.SCHEDULED;
        if (rentalStatus == rentalStatus2 && Intrinsics.areEqual(bool, Boolean.TRUE)) {
            num = Integer.valueOf(C45871nl4.long_term_rental_status_order_confirmed);
        } else if (rentalStatus == rentalStatus2 && !Intrinsics.areEqual(bool, Boolean.TRUE)) {
            num = Integer.valueOf(C45871nl4.long_term_rental_status_delivery);
        } else if (rentalStatus == RentalStatus.STARTED && Intrinsics.areEqual(bool2, Boolean.TRUE)) {
            num = Integer.valueOf(C45871nl4.long_term_rental_status_canceled_auto_renew);
        } else if (rentalStatus == RentalStatus.PICKUP) {
            num = Integer.valueOf(C45871nl4.long_term_rental_status_ready_for_pickup);
        }
        C51471xC2 c51471xC2 = this.f97555k;
        if (num != null) {
            z = true;
        } else {
            z = false;
        }
        c51471xC2.m5688km(z);
        if (num != null) {
            this.f97555k.m5700Yl(num.intValue());
        }
    }

    /* renamed from: R0 */
    public final AbstractC23461c m26129R0() {
        AbstractC24507p<C49375tg1> mo87538a = this.f97549e.mo87538a(this.f97553i.m88839H());
        final C25954R c25954r = C25954R.f97577g;
        AbstractC23461c m32074A = mo87538a.m32074A(new InterfaceC23492o() { // from class: HB2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m26127S0;
                m26127S0 = C44950mC2.m26127S0(Function1.this, obj);
                return m26127S0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m32074A, "manager.scheduleRental(m…entalError(it.message)) }");
        return C28237sD.progress$default(m32074A, this.f97555k, 0, 2, (Object) null);
    }

    /* renamed from: T */
    public final void m26126T() {
        m26123U0();
        AbstractC24507p<C49375tg1> mo87530i = this.f97549e.mo87530i();
        final C25958b c25958b = C25958b.f97580g;
        AbstractC23442F m33042m = mo87530i.m32074A(new InterfaceC23492o() { // from class: IB2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m26124U;
                m26124U = C44950mC2.m26124U(Function1.this, obj);
                return m26124U;
            }
        }).m33069Q().m33042m(this.f97549e.mo87531h().firstOrError());
        Intrinsics.checkNotNullExpressionValue(m33042m, "manager.refreshRentals()…ntRentals.firstOrError())");
        Object m33135e = C28237sD.progress$default(m33042m, this.f97555k, 0, 2, (Object) null).m33135e(AutoDispose.m45239a(this.f97554j));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25959c c25959c = new C25959c();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: JB2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44950mC2.m26122V(Function1.this, obj);
            }
        });
        Observable<Unit> m5705Tl = this.f97555k.m5705Tl();
        C0058AG<Boolean> m88815x = this.f97553i.m88815x();
        C0058AG<Optional<String>> m88824o = this.f97553i.m88824o();
        final C25960d c25960d = C25960d.f97582g;
        Observable<Optional<String>> filter = m88824o.filter(new InterfaceC23494q() { // from class: KB2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m26120W;
                m26120W = C44950mC2.m26120W(Function1.this, obj);
                return m26120W;
            }
        });
        final C25961e c25961e = C25961e.f97583g;
        InterfaceC23434B map = filter.map(new InterfaceC23492o() { // from class: LB2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m26118X;
                m26118X = C44950mC2.m26118X(Function1.this, obj);
                return m26118X;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "model.rentalId.filter { …resent }.map { it.get() }");
        Observable m31949b = C24527f.m31949b(m5705Tl, m88815x, map);
        final C25962f c25962f = new C25962f();
        Observable flatMapSingle = m31949b.flatMapSingle(new InterfaceC23492o() { // from class: MB2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m26116Y;
                m26116Y = C44950mC2.m26116Y(Function1.this, obj);
                return m26116Y;
            }
        });
        final C25964g c25964g = C25964g.f97587g;
        Observable filter2 = flatMapSingle.filter(new InterfaceC23494q() { // from class: NB2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m26114Z;
                m26114Z = C44950mC2.m26114Z(Function1.this, obj);
                return m26114Z;
            }
        });
        final C25965h c25965h = new C25965h();
        AbstractC23461c m33070P = filter2.flatMapCompletable(new InterfaceC23492o() { // from class: OB2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m26111a0;
                m26111a0 = C44950mC2.m26111a0(Function1.this, obj);
                return m26111a0;
            }
        }).m33070P(C23454a.m33087a());
        final C25968i c25968i = new C25968i();
        AbstractC23461c m33066T = m33070P.m33084B(new InterfaceC23484g() { // from class: QB2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44950mC2.m26108b0(Function1.this, obj);
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "private fun configureExi… }\n        ))\n      }\n  }");
        Object m33041n = m33066T.m33041n(AutoDispose.m45239a(this.f97554j));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Observable observeOn = C24527f.m31950a(this.f97555k.m5704Ul(), this.f97553i.m88824o()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "ui.secondaryHollowButton…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f97554j));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25969j c25969j = new C25969j();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: RB2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44950mC2.m26106c0(Function1.this, obj);
            }
        });
    }

    /* renamed from: T0 */
    public final void m26125T0(LongTermRentalSignUpResult.EnumC16264b enumC16264b) {
        this.f97556l.setResult(-1, X52.m77424a(new LongTermRentalSignUpResult(enumC16264b)));
    }

    /* renamed from: U0 */
    public final void m26123U0() {
        this.f97555k.m5686mm(false);
        this.f97555k.m5689jm(false);
        this.f97555k.m5681rm(true);
        this.f97555k.m5691hm(C45871nl4.long_term_rental_contact_us);
        m26135O0(this.f97553i.m88814y().getValue(), this.f97553i.m88815x().getValue());
        Observable observeOn = C24523e.f91168a.m31956a(this.f97553i.m88814y(), this.f97553i.m88815x()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f97554j));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25955S c25955s = new C25955S();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: fC2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44950mC2.m26121V0(Function1.this, obj);
            }
        });
    }

    /* renamed from: W0 */
    public final void m26119W0(Boolean bool, Optional<StripeModel> optional) {
        StripeModel stripeModel;
        boolean z;
        boolean z2;
        boolean z3;
        if (optional != null) {
            stripeModel = optional.m59035e();
        } else {
            stripeModel = null;
        }
        boolean z4 = true;
        this.f97555k.m5690im(true);
        this.f97555k.m5682qm(false);
        C51471xC2 c51471xC2 = this.f97555k;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        c51471xC2.m5686mm(z);
        C51471xC2 c51471xC22 = this.f97555k;
        if (stripeModel != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        c51471xC22.m5689jm(z2);
        if (stripeModel != null) {
            this.f97555k.m5701Xl(stripeModel);
        }
        this.f97555k.m5691hm(C45871nl4.credit_card_add_button);
        C51471xC2 c51471xC23 = this.f97555k;
        if (bool != null) {
            z3 = bool.booleanValue();
        } else {
            z3 = false;
        }
        if (z3 && stripeModel != null) {
            z4 = false;
        }
        c51471xC23.m5681rm(z4);
    }

    /* renamed from: X0 */
    public final void m26117X0() {
        Object m33135e = C28237sD.progress$default(this.f97548d.mo16237g(), this.f97555k, 0, 2, (Object) null).m33135e(AutoDispose.m45239a(this.f97554j));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((SingleSubscribeProxy) m33135e).subscribe(this.f97559o);
    }

    /* renamed from: Y0 */
    public final void m26115Y0() {
        Object m33041n = this.f97551g.mo85670h().m33041n(AutoDispose.m45239a(this.f97554j));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: dC2
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C44950mC2.m26113Z0(C44950mC2.this);
            }
        };
        final C25956T c25956t = C25956T.f97579b;
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: eC2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44950mC2.m26110a1(Function1.this, obj);
            }
        });
    }

    /* renamed from: d0 */
    public final void m26104d0() {
        m26115Y0();
        m26117X0();
        m26119W0(this.f97559o.getValue(), this.f97558n.getValue());
        Observable observeOn = C24523e.f91168a.m31956a(this.f97559o, this.f97558n).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f97554j));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25971l c25971l = new C25971l();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: SB2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44950mC2.m26102e0(Function1.this, obj);
            }
        });
        Observable<Unit> m5707Rl = this.f97555k.m5707Rl();
        final C25972m c25972m = new C25972m();
        Observable<R> flatMapSingle = m5707Rl.flatMapSingle(new InterfaceC23492o() { // from class: TB2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m26100f0;
                m26100f0 = C44950mC2.m26100f0(Function1.this, obj);
                return m26100f0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "private fun configurePay…CARD.ordinal)\n      }\n  }");
        Observable m31949b = C24527f.m31949b(flatMapSingle, this.f97553i.m88843D(), this.f97553i.m88830i());
        final C25973n c25973n = C25973n.f97596g;
        Observable observeOn2 = m31949b.filter(new InterfaceC23494q() { // from class: UB2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m26098g0;
                m26098g0 = C44950mC2.m26098g0(Function1.this, obj);
                return m26098g0;
            }
        }).observeOn(C23454a.m33087a());
        final C25974o c25974o = new C25974o();
        Observable doOnNext = observeOn2.doOnNext(new InterfaceC23484g() { // from class: VB2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44950mC2.m26096h0(Function1.this, obj);
            }
        });
        final C25975p c25975p = new C25975p();
        Observable retry = doOnNext.doOnError(new InterfaceC23484g() { // from class: WB2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44950mC2.m26094i0(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "private fun configurePay…CARD.ordinal)\n      }\n  }");
        Object m33094as2 = retry.m33094as(AutoDispose.m45239a(this.f97554j));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as2).subscribe();
        Observable<Unit> m5708Ql = this.f97555k.m5708Ql();
        final C25976q c25976q = new C25976q();
        Observable<R> flatMapSingle2 = m5708Ql.flatMapSingle(new InterfaceC23492o() { // from class: XB2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m26092j0;
                m26092j0 = C44950mC2.m26092j0(Function1.this, obj);
                return m26092j0;
            }
        });
        final C25977r c25977r = new C25977r();
        Observable observeOn3 = flatMapSingle2.doOnError(new InterfaceC23484g() { // from class: YB2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44950mC2.m26090k0(Function1.this, obj);
            }
        }).retry().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "private fun configurePay…CARD.ordinal)\n      }\n  }");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(this.f97554j));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25978s c25978s = new C25978s();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: ZB2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44950mC2.m26088l0(Function1.this, obj);
            }
        };
        final C25979t c25979t = new C25979t();
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: bC2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44950mC2.m26086m0(Function1.this, obj);
            }
        });
        Observable<Unit> observeOn4 = this.f97555k.m5704Ul().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn4, "ui.secondaryHollowButton…dSchedulers.mainThread())");
        Object m33094as4 = observeOn4.m33094as(AutoDispose.m45239a(this.f97554j));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25970k c25970k = new C25970k();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: cC2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44950mC2.m26084n0(Function1.this, obj);
            }
        });
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: g7 */
    public Observable<Boolean> mo14g7() {
        Observable<Boolean> just = Observable.just(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(just, "just(true)");
        return just;
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: m7 */
    public Observable<EnumC32621Ei0> mo12m7() {
        Observable<EnumC32621Ei0> just = Observable.just(EnumC32621Ei0.NONE);
        Intrinsics.checkNotNullExpressionValue(just, "just(CheckoutProceedType.NONE)");
        return just;
    }

    /* renamed from: o0 */
    public final AbstractC23442F<DialogResponse> m26082o0(boolean z) {
        int i;
        if (z) {
            i = C45871nl4.long_term_rental_cancel_rental_dialog_message;
        } else {
            i = C45871nl4.long_term_rental_cancel_auto_renew_dialog_message;
        }
        return H31.C3014a.dialog$default(this.f97555k, C39311cj4.dialog_long_term_rental_cancel, Integer.valueOf(C36585Vg4.confirmButton), Integer.valueOf(C36585Vg4.cancelButton), null, null, null, null, null, null, null, null, false, false, false, new C25980u(i), 16376, null);
    }

    @Override // p000.InterfaceC44782lv1
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == EnumC50341vI4.ADD_CARD.ordinal()) {
            if (i2 == -1) {
                AbstractC23442F firstOrError = this.f97551g.mo85670h().m33043l(this.f97551g.mo85677e()).firstOrError();
                Intrinsics.checkNotNullExpressionValue(firstOrError, "paymentManagerV2.refresh…rdPayment).firstOrError()");
                AbstractC23442F m33152N = C28237sD.progress$default(firstOrError, this.f97555k, 0, 2, (Object) null).m33152N(C23454a.m33087a());
                Intrinsics.checkNotNullExpressionValue(m33152N, "paymentManagerV2.refresh…dSchedulers.mainThread())");
                Object m33135e = m33152N.m33135e(AutoDispose.m45239a(this.f97554j));
                Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
                final C25981v c25981v = new C25981v();
                InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: tB2
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C44950mC2.m26076r0(Function1.this, obj);
                    }
                };
                final C25982w c25982w = new C25982w();
                ((SingleSubscribeProxy) m33135e).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: EB2
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C44950mC2.m26074s0(Function1.this, obj);
                    }
                });
                return;
            }
            this.f97555k.error(C45871nl4.payment_error_title);
        } else if (i == EnumC50341vI4.GOOGLE_PAY.ordinal()) {
            AbstractC24507p handleGooglePayActivityResult$default = InterfaceC42586iD1.C23161a.handleGooglePayActivityResult$default(this.f97548d, i2, intent, true, null, 8, null);
            final C25983x c25983x = new C25983x();
            InterfaceC23492o interfaceC23492o = new InterfaceC23492o() { // from class: PB2
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m26072t0;
                    m26072t0 = C44950mC2.m26072t0(Function1.this, obj);
                    return m26072t0;
                }
            };
            final C25984y c25984y = C25984y.f97607g;
            AbstractC24507p m32066I = handleGooglePayActivityResult$default.m32020y(interfaceC23492o, new InterfaceC23480c() { // from class: aC2
                @Override // io.reactivex.functions.InterfaceC23480c
                public final Object apply(Object obj, Object obj2) {
                    Token m26070u0;
                    m26070u0 = C44950mC2.m26070u0(Function2.this, obj, obj2);
                    return m26070u0;
                }
            }).m32066I(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m32066I, "override fun onActivityR…     })\n      }\n    }\n  }");
            Object m32048b = C28237sD.progress$default(m32066I, this.f97555k, 0, 2, (Object) null).m32048b(AutoDispose.m45239a(this.f97554j));
            Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C25985z c25985z = new C25985z();
            InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: gC2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C44950mC2.m26068v0(Function1.this, obj);
                }
            };
            final C25937A c25937a = new C25937A();
            ((MaybeSubscribeProxy) m32048b).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: hC2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C44950mC2.m26066w0(Function1.this, obj);
                }
            }, new InterfaceC23478a() { // from class: iC2
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C44950mC2.m26064x0();
                }
            });
        }
    }

    @Override // p000.UX0
    public void onCreate(Bundle bundle) {
        boolean isBlank;
        InterfaceC44782lv1.C25814a.m26680c(this, bundle);
        this.f97546b.mo55956N(new RentalSummaryShown(m26080p0()));
        m26131Q0(this.f97553i.m88820s().getValue(), this.f97553i.m88815x().getValue(), this.f97553i.m88814y().getValue());
        C24523e c24523e = C24523e.f91168a;
        Observable observeOn = c24523e.m31955b(this.f97553i.m88820s(), this.f97553i.m88815x(), this.f97553i.m88814y()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f97554j));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25942F c25942f = new C25942F();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: kC2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44950mC2.m26062y0(Function1.this, obj);
            }
        });
        this.f97555k.m5697bm(this.f97553i.m88823p());
        m26078q0(this.f97553i.m88824o().getValue(), this.f97553i.m88820s().getValue());
        Observable observeOn2 = c24523e.m31956a(this.f97553i.m88824o(), this.f97553i.m88820s()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f97554j));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25943G c25943g = new C25943G();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: vB2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44950mC2.m26060z0(Function1.this, obj);
            }
        });
        Observable<Optional<String>> observeOn3 = this.f97553i.m88832g().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn3, "model.address\n      .obs…dSchedulers.mainThread())");
        Object m33094as3 = observeOn3.m33094as(AutoDispose.m45239a(this.f97554j));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25944H c25944h = new C25944H();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: wB2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44950mC2.m26159C0(Function1.this, obj);
            }
        });
        if (this.f97553i.m88823p() == RentalKind.PICK_UP) {
            Observable<Optional<RentalPlan>> observeOn4 = this.f97553i.m88843D().observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn4, "model.selectedPlan()\n   …dSchedulers.mainThread())");
            Object m33094as4 = observeOn4.m33094as(AutoDispose.m45239a(this.f97554j));
            Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C25945I c25945i = new C25945I();
            ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: xB2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C44950mC2.m26157D0(Function1.this, obj);
                }
            });
        } else {
            Observable<String> observeOn5 = this.f97553i.m88825n().observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn5, "model.notes\n        .obs…dSchedulers.mainThread())");
            Object m33094as5 = observeOn5.m33094as(AutoDispose.m45239a(this.f97554j));
            Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C25946J c25946j = new C25946J();
            ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: yB2
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C44950mC2.m26155E0(Function1.this, obj);
                }
            });
        }
        Observable<Optional<DeliveryWindow>> m88841F = this.f97553i.m88841F();
        final C25947K c25947k = C25947K.f97570g;
        Observable<Optional<DeliveryWindow>> filter = m88841F.filter(new InterfaceC23494q() { // from class: zB2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m26153F0;
                m26153F0 = C44950mC2.m26153F0(Function1.this, obj);
                return m26153F0;
            }
        });
        final C25948L c25948l = C25948L.f97571g;
        Observable observeOn6 = filter.map(new InterfaceC23492o() { // from class: AB2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                DeliveryWindow m26151G0;
                m26151G0 = C44950mC2.m26151G0(Function1.this, obj);
                return m26151G0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn6, "model.selectedWindow()\n …dSchedulers.mainThread())");
        Object m33094as6 = observeOn6.m33094as(AutoDispose.m45239a(this.f97554j));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25949M c25949m = new C25949M();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: BB2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44950mC2.m26149H0(Function1.this, obj);
            }
        });
        Observable<Optional<DateTime>> m88845B = this.f97553i.m88845B();
        final C25950N c25950n = C25950N.f97573g;
        Observable<Optional<DateTime>> filter2 = m88845B.filter(new InterfaceC23494q() { // from class: CB2
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m26147I0;
                m26147I0 = C44950mC2.m26147I0(Function1.this, obj);
                return m26147I0;
            }
        });
        final C25939C c25939c = C25939C.f97562g;
        Object map = filter2.map(new InterfaceC23492o() { // from class: DB2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                DateTime m26145J0;
                m26145J0 = C44950mC2.m26145J0(Function1.this, obj);
                return m26145J0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "model.returnByDate().fil…resent }.map { it.get() }");
        Observable observeOn7 = c24523e.m31955b(map, this.f97553i.m88820s(), this.f97553i.m88814y()).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn7, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as7 = observeOn7.m33094as(AutoDispose.m45239a(this.f97554j));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25940D c25940d = new C25940D();
        ((ObservableSubscribeProxy) m33094as7).subscribe(new InterfaceC23484g() { // from class: lC2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44950mC2.m26163A0(Function1.this, obj);
            }
        });
        m26133P0(this.f97553i.m88821r(), this.f97553i.m88830i().getValue(), this.f97553i.m88814y().getValue());
        Observable combineLatest = Observable.combineLatest(this.f97553i.m88843D(), this.f97553i.m88830i(), this.f97553i.m88814y(), new C25938B());
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…neFunction(t1, t2, t3) })");
        Observable observeOn8 = combineLatest.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn8, "Observables.combineLates…dSchedulers.mainThread())");
        Object m33094as8 = observeOn8.m33094as(AutoDispose.m45239a(this.f97554j));
        Intrinsics.checkExpressionValueIsNotNull(m33094as8, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25941E c25941e = new C25941E();
        ((ObservableSubscribeProxy) m33094as8).subscribe(new InterfaceC23484g() { // from class: uB2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44950mC2.m26161B0(Function1.this, obj);
            }
        });
        C51471xC2 c51471xC2 = this.f97555k;
        String paymentFinePrint = this.f97553i.m88829j().getContent().getPaymentFinePrint();
        isBlank = StringsKt__StringsJVMKt.isBlank(paymentFinePrint);
        if (!(!isBlank)) {
            paymentFinePrint = null;
        }
        if (paymentFinePrint == null) {
            paymentFinePrint = this.f97550f.getString(C45871nl4.long_term_rental_disclaimer);
            Intrinsics.checkNotNullExpressionValue(paymentFinePrint, "context.getString(L.stri…g_term_rental_disclaimer)");
        }
        c51471xC2.m5703Vl(paymentFinePrint);
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
        if (m26080p0()) {
            m26126T();
        } else {
            m26104d0();
        }
        this.f97555k.m5684om();
        Observable<Unit> m5706Sl = this.f97555k.m5706Sl();
        final C25951O c25951o = new C25951O();
        Observable observeOn = m5706Sl.map(new InterfaceC23492o() { // from class: FB2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m26143K0;
                m26143K0 = C44950mC2.m26143K0(Function1.this, obj);
                return m26143K0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "override fun onResume() …eId.toLong())\n      }\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(this.f97554j));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25952P c25952p = new C25952P();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: GB2
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44950mC2.m26141L0(Function1.this, obj);
            }
        });
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

    /* renamed from: p0 */
    public final boolean m26080p0() {
        Optional<String> value = this.f97553i.m88824o().getValue();
        return (value != null ? value.m59035e() : null) != null;
    }

    /* renamed from: q0 */
    public final void m26078q0(Optional<String> optional, Optional<RentalStatus> optional2) {
        boolean z;
        C51471xC2 c51471xC2 = this.f97555k;
        if ((optional != null ? optional.m59035e() : null) != null) {
            if ((optional2 != null ? optional2.m59035e() : null) != RentalStatus.SCHEDULED) {
                z = false;
                c51471xC2.m5687lm(z);
            }
        }
        z = true;
        c51471xC2.m5687lm(z);
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: rc */
    public Observable<EnumC33089Gi0> mo11rc() {
        if (m26080p0()) {
            Observable<EnumC33089Gi0> just = Observable.just(EnumC33089Gi0.CLOSE);
            Intrinsics.checkNotNullExpressionValue(just, "{\n      Observable.just(…tReverseType.CLOSE)\n    }");
            return just;
        }
        Observable<EnumC33089Gi0> just2 = Observable.just(EnumC33089Gi0.BACK);
        Intrinsics.checkNotNullExpressionValue(just2, "{\n      Observable.just(…utReverseType.BACK)\n    }");
        return just2;
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: z5 */
    public Observable<Unit> mo10z5() {
        return InterfaceC44782lv1.C25814a.m26682a(this);
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\n \u0003*\u0004\u0018\u00010\u00060\u00062(\u0010\u0005\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00040\u00040\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/DialogResponse;", "", "kotlin.jvm.PlatformType", "", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Triple;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mC2$h */
    /* loaded from: classes2.dex */
    public static final class C25965h extends Lambda implements Function1<Triple<? extends DialogResponse, ? extends Boolean, ? extends String>, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Ltg1;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ltg1;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: mC2$h$a */
        /* loaded from: classes2.dex */
        public static final class C25966a extends Lambda implements Function1<C49375tg1, InterfaceC23496h> {

            /* renamed from: g */
            public static final C25966a f97589g = new C25966a();

            public C25966a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23496h invoke(C49375tg1 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AbstractC23461c.m33080F(new C35141Pc0(it.m11932c()));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Ltg1;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ltg1;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: mC2$h$b */
        /* loaded from: classes2.dex */
        public static final class C25967b extends Lambda implements Function1<C49375tg1, InterfaceC23496h> {

            /* renamed from: g */
            public static final C25967b f97590g = new C25967b();

            public C25967b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23496h invoke(C49375tg1 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AbstractC23461c.m33080F(new C35141Pc0(it.m11932c()));
            }
        }

        public C25965h() {
            super(1);
        }

        /* renamed from: f */
        public static final void m26032f(C44950mC2 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f97546b.mo55956N(new RentalEnded());
            this$0.f97557m.mo37055a2();
            this$0.f97546b.mo55956N(new RentalEnded());
        }

        /* renamed from: g */
        public static final void m26031g(C44950mC2 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.m26125T0(LongTermRentalSignUpResult.EnumC16264b.CANCELED);
            this$0.f97546b.mo55956N(new RentalCancelled());
            this$0.f97557m.close();
        }

        /* renamed from: h */
        public static final void m26030h(C44950mC2 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            InterfaceC41921h56.C22549a.topToast$default(this$0.f97555k, C45871nl4.long_term_rental_canceled_auto_renew_toast, (EnumC40735f56) null, 2, (Object) null);
            this$0.f97546b.mo55956N(new RentalEnded());
        }

        public static final InterfaceC23496h invoke$lambda$1(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        public static final InterfaceC23496h invoke$lambda$3(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Triple<? extends DialogResponse, Boolean, String> triple) {
            AbstractC23461c m33029z;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            Boolean isCancelable = triple.component2();
            String rentalId = triple.component3();
            Intrinsics.checkNotNullExpressionValue(isCancelable, "isCancelable");
            if (isCancelable.booleanValue()) {
                if (Intrinsics.areEqual(C44950mC2.this.f97553i.m88813z().getValue(), Boolean.TRUE)) {
                    final C44950mC2 c44950mC2 = C44950mC2.this;
                    m33029z = AbstractC23461c.m33079G(new InterfaceC23478a() { // from class: oC2
                        @Override // io.reactivex.functions.InterfaceC23478a
                        public final void run() {
                            C44950mC2.C25965h.m26032f(C44950mC2.this);
                        }
                    });
                } else {
                    InterfaceC32292Cx4 interfaceC32292Cx4 = C44950mC2.this.f97549e;
                    Intrinsics.checkNotNullExpressionValue(rentalId, "rentalId");
                    AbstractC24507p<C49375tg1> mo87534e = interfaceC32292Cx4.mo87534e(rentalId);
                    final C25966a c25966a = C25966a.f97589g;
                    AbstractC23461c m32074A = mo87534e.m32074A(new InterfaceC23492o() { // from class: pC2
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC23496h invoke$lambda$1;
                            invoke$lambda$1 = C44950mC2.C25965h.invoke$lambda$1(Function1.this, obj);
                            return invoke$lambda$1;
                        }
                    });
                    final C44950mC2 c44950mC22 = C44950mC2.this;
                    m33029z = m32074A.m33029z(new InterfaceC23478a() { // from class: qC2
                        @Override // io.reactivex.functions.InterfaceC23478a
                        public final void run() {
                            C44950mC2.C25965h.m26031g(C44950mC2.this);
                        }
                    });
                }
            } else {
                InterfaceC32292Cx4 interfaceC32292Cx42 = C44950mC2.this.f97549e;
                Intrinsics.checkNotNullExpressionValue(rentalId, "rentalId");
                AbstractC24507p<C49375tg1> mo87535d = interfaceC32292Cx42.mo87535d(rentalId);
                final C25967b c25967b = C25967b.f97590g;
                AbstractC23461c m32074A2 = mo87535d.m32074A(new InterfaceC23492o() { // from class: rC2
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23496h invoke$lambda$3;
                        invoke$lambda$3 = C44950mC2.C25965h.invoke$lambda$3(Function1.this, obj);
                        return invoke$lambda$3;
                    }
                });
                final C44950mC2 c44950mC23 = C44950mC2.this;
                m33029z = m32074A2.m33029z(new InterfaceC23478a() { // from class: sC2
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        C44950mC2.C25965h.m26030h(C44950mC2.this);
                    }
                });
            }
            Intrinsics.checkNotNullExpressionValue(m33029z, "if (isCancelable) {\n    …)\n            }\n        }");
            return C28237sD.progress$default(m33029z, C44950mC2.this.f97555k, 0, 2, (Object) null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Triple<? extends DialogResponse, ? extends Boolean, ? extends String> triple) {
            return invoke2((Triple<? extends DialogResponse, Boolean, String>) triple);
        }
    }
}
