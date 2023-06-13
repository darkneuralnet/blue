package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.BirdPayment;
import co.bird.android.model.Deal;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.User;
import co.bird.android.model.analytics.BonusDealPurchased;
import co.bird.android.model.analytics.BonusDealScreenClaimed;
import co.bird.android.model.analytics.BonusDealScreenClaimedWithDefaultCard;
import co.bird.android.model.analytics.BonusDealScreenClaimedWithGooglePay;
import co.bird.android.model.analytics.BonusDealScreenRejected;
import co.bird.android.model.analytics.BonusDealScreenShown;
import co.bird.api.request.DealAcknowledgmentState;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Card;
import com.stripe.android.model.Token;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.MaybeSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import io.reactivex.subjects.C24552a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37791a94;
import p000.C51631xU0;
import p000.InterfaceC40099e13;
import p000.InterfaceC42586iD1;
import p000.JT0;
@Metadata(m28433d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001Bq\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010%\u001a\u00020\"\u0012\b\b\u0001\u0010)\u001a\u00020&\u0012\u000e\b\u0001\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*\u0012\b\b\u0001\u00102\u001a\u00020/\u0012\b\b\u0001\u00106\u001a\u000203\u0012\b\b\u0001\u0010:\u001a\u000207¢\u0006\u0004\bM\u0010NJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0006\u0010\r\u001a\u00020\u0004R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\"\u0010@\u001a\u0010\u0012\f\u0012\n =*\u0004\u0018\u00010<0<0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R \u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020B0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DRR\u0010L\u001a@\u0012<\u0012:\u0012\u0004\u0012\u00020H\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0B\u0012\u0004\u0012\u00020< =*\u001c\u0012\u0004\u0012\u00020H\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0B\u0012\u0004\u0012\u00020<\u0018\u00010G0G0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006O"}, m28432d2 = {"LxU0;", "LST0;", "Lco/bird/android/model/Deal;", "deal", "", "J", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "onBackPressed", "D", "LiD1;", C17296a.f69688o, "LiD1;", "googlePayManager", "LzN3;", "b", "LzN3;", "paymentMethodManager", "Llh6;", "c", "Llh6;", "userManager", "LJT0;", DateTokenConverter.CONVERTER_KEY, "LJT0;", "dealManager", "LTq4;", "e", "LTq4;", "reactiveConfig", "LEa;", "f", "LEa;", "analyticsManager", "Lco/bird/android/core/mvp/BaseActivity;", "g", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "LRE;", "h", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "scopeProvider", "LCU0;", "i", "LCU0;", "ui", "Le13;", "j", "Le13;", "navigator", "Lgl;", "k", "Lgl;", "preferences", "LAG;", "", "kotlin.jvm.PlatformType", "l", "LAG;", "googlePayReady", "La94;", "Lco/bird/android/buava/Optional;", "m", "La94;", "dealRelay", "Lio/reactivex/subjects/a;", "Lkotlin/Triple;", "Lco/bird/android/model/User;", "Lcom/stripe/android/model/Card;", "n", "Lio/reactivex/subjects/a;", "paymentSubject", "<init>", "(LiD1;LzN3;Llh6;LJT0;LTq4;LEa;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LCU0;Le13;Lgl;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDealPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DealPresenter.kt\nco/bird/android/app/feature/deals/DealPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,251:1\n180#2:252\n218#2:253\n237#2:254\n180#2:255\n180#2:256\n180#2:257\n218#2:258\n*S KotlinDebug\n*F\n+ 1 DealPresenter.kt\nco/bird/android/app/feature/deals/DealPresenterImpl\n*L\n98#1:252\n109#1:253\n113#1:254\n153#1:255\n169#1:256\n202#1:257\n225#1:258\n*E\n"})
/* renamed from: xU0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C51631xU0 implements ST0 {

    /* renamed from: a */
    public final InterfaceC42586iD1 f117655a;

    /* renamed from: b */
    public final InterfaceC52757zN3 f117656b;

    /* renamed from: c */
    public final InterfaceC44647lh6 f117657c;

    /* renamed from: d */
    public final JT0 f117658d;

    /* renamed from: e */
    public final C36207Tq4 f117659e;

    /* renamed from: f */
    public final InterfaceC1880Ea f117660f;

    /* renamed from: g */
    public final BaseActivity f117661g;

    /* renamed from: h */
    public final LifecycleScopeProvider<EnumC7097RE> f117662h;

    /* renamed from: i */
    public final CU0 f117663i;

    /* renamed from: j */
    public final InterfaceC40099e13 f117664j;

    /* renamed from: k */
    public final C22454gl f117665k;

    /* renamed from: l */
    public final C0058AG<Boolean> f117666l;

    /* renamed from: m */
    public final C37791a94<Optional<Deal>> f117667m;

    /* renamed from: n */
    public final C24552a<Triple<User, Optional<Card>, Boolean>> f117668n;

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001ar\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \t*\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00070\u0007 \t*8\u00122\b\u0001\u0012.\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002 \t*\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/User;", "Lco/bird/android/buava/Optional;", "Lcom/stripe/android/model/Card;", "", "<name for destructuring parameter 0>", "Lio/reactivex/K;", "Lkotlin/Pair;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Triple;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xU0$A */
    /* loaded from: classes2.dex */
    public static final class C30182A extends Lambda implements Function1<Triple<? extends User, ? extends Optional<Card>, ? extends Boolean>, InterfaceC23447K<? extends Pair<? extends DialogResponse, ? extends Optional<Card>>>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a.\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003 \u0005*\u0016\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lkotlin/Pair;", "Lco/bird/android/buava/Optional;", "Lcom/stripe/android/model/Card;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lkotlin/Pair;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: xU0$A$a */
        /* loaded from: classes2.dex */
        public static final class C30183a extends Lambda implements Function1<DialogResponse, Pair<? extends DialogResponse, ? extends Optional<Card>>> {

            /* renamed from: g */
            public final /* synthetic */ Optional<Card> f117670g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C30183a(Optional<Card> optional) {
                super(1);
                this.f117670g = optional;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Pair<DialogResponse, Optional<Card>> invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return TuplesKt.m28425to(it, this.f117670g);
            }
        }

        public C30182A() {
            super(1);
        }

        public static final Pair invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Pair) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23447K<? extends Pair<DialogResponse, Optional<Card>>> invoke(Triple<User, Optional<Card>, Boolean> triple) {
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            Optional<Card> component2 = triple.component2();
            CU0 cu0 = C51631xU0.this.f117663i;
            String last4 = component2.m59038b().getLast4();
            Intrinsics.checkNotNull(last4);
            AbstractC23442F<DialogResponse> mo110375b6 = cu0.mo110375b6(last4);
            final C30183a c30183a = new C30183a(component2);
            return mo110375b6.m33157I(new InterfaceC23492o() { // from class: yU0
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Pair invoke$lambda$0;
                    invoke$lambda$0 = C51631xU0.C30182A.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/DialogResponse;", "Lco/bird/android/buava/Optional;", "Lcom/stripe/android/model/Card;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xU0$B */
    /* loaded from: classes2.dex */
    public static final class C30184B extends Lambda implements Function1<Pair<? extends DialogResponse, ? extends Optional<Card>>, Boolean> {

        /* renamed from: g */
        public static final C30184B f117671g = new C30184B();

        public C30184B() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(Pair<? extends DialogResponse, Optional<Card>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            return Boolean.valueOf(pair.component1() == DialogResponse.OK);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Pair<? extends DialogResponse, ? extends Optional<Card>> pair) {
            return invoke2((Pair<? extends DialogResponse, Optional<Card>>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lcom/stripe/android/model/Token;", "token", "Lio/reactivex/u;", "LHM4;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lcom/stripe/android/model/Token;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xU0$a */
    /* loaded from: classes2.dex */
    public static final class C30185a extends Lambda implements Function1<Token, InterfaceC24574u<? extends HM4<Unit>>> {
        public C30185a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends HM4<Unit>> invoke(Token token) {
            Intrinsics.checkNotNullParameter(token, "token");
            return C51631xU0.this.f117658d.mo92273c((Deal) ((Optional) C51631xU0.this.f117667m.getValue()).m59038b(), token.getId()).m33125j0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LHM4;", "", "kotlin.jvm.PlatformType", "it", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xU0$b */
    /* loaded from: classes2.dex */
    public static final class C30186b extends Lambda implements Function1<HM4<Unit>, Unit> {
        public C30186b() {
            super(1);
        }

        /* renamed from: a */
        public final void m5150a(HM4<Unit> hm4) {
            InterfaceC1880Ea interfaceC1880Ea = C51631xU0.this.f117660f;
            Deal deal = (Deal) ((Optional) C51631xU0.this.f117667m.getValue()).m59035e();
            User m37750B0 = C51631xU0.this.f117665k.m37750B0();
            interfaceC1880Ea.mo55956N(new BonusDealPurchased(deal, m37750B0 != null ? m37750B0.getId() : null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<Unit> hm4) {
            m5150a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LHM4;", "", "kotlin.jvm.PlatformType", "response", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xU0$c */
    /* loaded from: classes2.dex */
    public static final class C30187c extends Lambda implements Function1<HM4<Unit>, Unit> {
        public C30187c() {
            super(1);
        }

        /* renamed from: a */
        public final void m5149a(HM4<Unit> response) {
            String str;
            if (response.m103939f()) {
                C51631xU0.this.m5211D();
                return;
            }
            CU0 cu0 = C51631xU0.this.f117663i;
            Intrinsics.checkNotNullExpressionValue(response, "response");
            C49375tg1 m94017d = NM4.m94017d(response);
            if (m94017d != null) {
                str = m94017d.m11932c();
            } else {
                str = null;
            }
            cu0.error(str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<Unit> hm4) {
            m5149a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xU0$d */
    /* loaded from: classes2.dex */
    public static final class C30188d extends Lambda implements Function1<Throwable, Unit> {
        public C30188d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C51631xU0.this.f117663i.error(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "enabled", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xU0$e */
    /* loaded from: classes2.dex */
    public static final class C30189e extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: h */
        public final /* synthetic */ Deal f117677h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30189e(Deal deal) {
            super(1);
            this.f117677h = deal;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean enabled) {
            Intrinsics.checkNotNullExpressionValue(enabled, "enabled");
            if (enabled.booleanValue()) {
                C51631xU0.this.f117663i.mo110380Dk(this.f117677h);
                C51631xU0.this.f117667m.accept(Optional.f63040c.m59032c(this.f117677h));
                C51631xU0.this.f117658d.mo92269g(this.f117677h);
                InterfaceC1880Ea interfaceC1880Ea = C51631xU0.this.f117660f;
                Deal deal = this.f117677h;
                User m37750B0 = C51631xU0.this.f117665k.m37750B0();
                interfaceC1880Ea.mo55956N(new BonusDealScreenShown(deal, m37750B0 != null ? m37750B0.getId() : null, this.f117677h.getDuration()));
                return;
            }
            C51631xU0.this.f117664j.close();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "enabled", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xU0$f */
    /* loaded from: classes2.dex */
    public static final class C30190f extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C30190f f117678g = new C30190f();

        public C30190f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean enabled) {
            Intrinsics.checkNotNullParameter(enabled, "enabled");
            return enabled;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LHM4;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Boolean;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xU0$g */
    /* loaded from: classes2.dex */
    public static final class C30191g extends Lambda implements Function1<Boolean, InterfaceC23447K<? extends HM4<Unit>>> {

        /* renamed from: h */
        public final /* synthetic */ Deal f117680h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30191g(Deal deal) {
            super(1);
            this.f117680h = deal;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends HM4<Unit>> invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C51631xU0.this.f117658d.mo92272d(this.f117680h, DealAcknowledgmentState.ACKNOWLEDGED);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LHM4;", "", "kotlin.jvm.PlatformType", "response", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xU0$h */
    /* loaded from: classes2.dex */
    public static final class C30192h extends Lambda implements Function1<HM4<Unit>, Unit> {
        public C30192h() {
            super(1);
        }

        /* renamed from: a */
        public final void m5147a(HM4<Unit> hm4) {
            if (!hm4.m103939f()) {
                C51631xU0.this.f117663i.error(C45871nl4.error_generic_body);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<Unit> hm4) {
            m5147a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u000122\u0010\u0002\u001a.\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005 \u0007*\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "Lco/bird/android/model/DialogResponse;", "Lco/bird/android/buava/Optional;", "Lcom/stripe/android/model/Card;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xU0$i */
    /* loaded from: classes2.dex */
    public static final class C30193i extends Lambda implements Function1<Pair<? extends DialogResponse, ? extends Optional<Card>>, Unit> {
        public C30193i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends DialogResponse, ? extends Optional<Card>> pair) {
            invoke2((Pair<? extends DialogResponse, Optional<Card>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<? extends DialogResponse, Optional<Card>> pair) {
            InterfaceC1880Ea interfaceC1880Ea = C51631xU0.this.f117660f;
            Deal deal = (Deal) ((Optional) C51631xU0.this.f117667m.getValue()).m59035e();
            User m37750B0 = C51631xU0.this.f117665k.m37750B0();
            interfaceC1880Ea.mo55956N(new BonusDealScreenClaimedWithDefaultCard(deal, m37750B0 != null ? m37750B0.getId() : null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006 \b* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/DialogResponse;", "Lco/bird/android/buava/Optional;", "Lcom/stripe/android/model/Card;", "it", "Lio/reactivex/K;", "LHM4;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Pair;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xU0$j */
    /* loaded from: classes2.dex */
    public static final class C30194j extends Lambda implements Function1<Pair<? extends DialogResponse, ? extends Optional<Card>>, InterfaceC23447K<? extends HM4<Unit>>> {
        public C30194j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends HM4<Unit>> invoke(Pair<? extends DialogResponse, Optional<Card>> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C28237sD.progress$default(JT0.C4089a.acceptDeal$default(C51631xU0.this.f117658d, (Deal) ((Optional) C51631xU0.this.f117667m.getValue()).m59038b(), null, 2, null), C51631xU0.this.f117663i, 0, 2, (Object) null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LHM4;", "", "kotlin.jvm.PlatformType", "it", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xU0$k */
    /* loaded from: classes2.dex */
    public static final class C30195k extends Lambda implements Function1<HM4<Unit>, Unit> {
        public C30195k() {
            super(1);
        }

        /* renamed from: a */
        public final void m5145a(HM4<Unit> hm4) {
            InterfaceC1880Ea interfaceC1880Ea = C51631xU0.this.f117660f;
            Deal deal = (Deal) ((Optional) C51631xU0.this.f117667m.getValue()).m59035e();
            User m37750B0 = C51631xU0.this.f117665k.m37750B0();
            interfaceC1880Ea.mo55956N(new BonusDealPurchased(deal, m37750B0 != null ? m37750B0.getId() : null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<Unit> hm4) {
            m5145a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LHM4;", "", "kotlin.jvm.PlatformType", "response", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xU0$l */
    /* loaded from: classes2.dex */
    public static final class C30196l extends Lambda implements Function1<HM4<Unit>, Unit> {
        public C30196l() {
            super(1);
        }

        /* renamed from: a */
        public final void m5144a(HM4<Unit> response) {
            String str;
            if (response.m103939f()) {
                C51631xU0.this.m5211D();
                return;
            }
            CU0 cu0 = C51631xU0.this.f117663i;
            Intrinsics.checkNotNullExpressionValue(response, "response");
            C49375tg1 m94017d = NM4.m94017d(response);
            if (m94017d != null) {
                str = m94017d.m11932c();
            } else {
                str = null;
            }
            cu0.error(str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<Unit> hm4) {
            m5144a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xU0$m */
    /* loaded from: classes2.dex */
    public static final class C30197m extends Lambda implements Function1<Throwable, Unit> {
        public C30197m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C51631xU0.this.f117663i.error(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00042\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/User;", "Lco/bird/android/buava/Optional;", "Lcom/stripe/android/model/Card;", "", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Triple;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xU0$n */
    /* loaded from: classes2.dex */
    public static final class C30198n extends Lambda implements Function1<Triple<? extends User, ? extends Optional<Card>, ? extends Boolean>, Boolean> {

        /* renamed from: g */
        public static final C30198n f117687g = new C30198n();

        public C30198n() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Triple<User, Optional<Card>, Boolean> triple) {
            boolean z;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            Optional<Card> component2 = triple.component2();
            if (component2.m59037c() && !ES5.m108973b(component2.m59038b())) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072>\u0010\u0006\u001a:\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004 \u0005*\u001c\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/User;", "Lco/bird/android/buava/Optional;", "Lcom/stripe/android/model/Card;", "", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xU0$o */
    /* loaded from: classes2.dex */
    public static final class C30199o extends Lambda implements Function1<Triple<? extends User, ? extends Optional<Card>, ? extends Boolean>, Unit> {
        public C30199o() {
            super(1);
        }

        /* renamed from: a */
        public final void m5142a(Triple<User, Optional<Card>, Boolean> triple) {
            InterfaceC1880Ea interfaceC1880Ea = C51631xU0.this.f117660f;
            Deal deal = (Deal) ((Optional) C51631xU0.this.f117667m.getValue()).m59035e();
            User m37750B0 = C51631xU0.this.f117665k.m37750B0();
            interfaceC1880Ea.mo55956N(new BonusDealScreenClaimedWithGooglePay(deal, m37750B0 != null ? m37750B0.getId() : null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends User, ? extends Optional<Card>, ? extends Boolean> triple) {
            m5142a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072>\u0010\u0006\u001a:\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004 \u0005*\u001c\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/User;", "Lco/bird/android/buava/Optional;", "Lcom/stripe/android/model/Card;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xU0$p */
    /* loaded from: classes2.dex */
    public static final class C30200p extends Lambda implements Function1<Triple<? extends User, ? extends Optional<Card>, ? extends Boolean>, Unit> {
        public C30200p() {
            super(1);
        }

        /* renamed from: a */
        public final void m5141a(Triple<User, Optional<Card>, Boolean> triple) {
            User component1 = triple.component1();
            if (triple.component3().booleanValue()) {
                C51631xU0.this.f117655a.mo16236h(component1, C51631xU0.this.f117661g, EnumC51527xI4.GOOGLE_PAY.ordinal(), C45097mS5.m25591o(((Deal) ((Optional) C51631xU0.this.f117667m.getValue()).m59038b()).getCurrency()), Long.valueOf(((Deal) ((Optional) C51631xU0.this.f117667m.getValue()).m59038b()).getAddAmount()));
            } else {
                InterfaceC40099e13.C19924a.goToEnterCard$default(C51631xU0.this.f117664j, EnumC51527xI4.ENTER_CARD.ordinal(), false, null, 6, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends User, ? extends Optional<Card>, ? extends Boolean> triple) {
            m5141a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xU0$q */
    /* loaded from: classes2.dex */
    public static final class C30201q extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Integer>> {
        public C30201q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Integer> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C51631xU0.this.f117663i.mo110379Ee().firstOrError().m33148R(-1);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "remainingSeconds", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xU0$r */
    /* loaded from: classes2.dex */
    public static final class C30202r extends Lambda implements Function1<Integer, Unit> {
        public C30202r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer remainingSeconds) {
            InterfaceC1880Ea interfaceC1880Ea = C51631xU0.this.f117660f;
            Deal deal = (Deal) ((Optional) C51631xU0.this.f117667m.getValue()).m59035e();
            User m37750B0 = C51631xU0.this.f117665k.m37750B0();
            String id = m37750B0 != null ? m37750B0.getId() : null;
            Intrinsics.checkNotNullExpressionValue(remainingSeconds, "remainingSeconds");
            interfaceC1880Ea.mo55956N(new BonusDealScreenRejected(deal, id, remainingSeconds.intValue()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "LHM4;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Integer;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xU0$s */
    /* loaded from: classes2.dex */
    public static final class C30203s extends Lambda implements Function1<Integer, InterfaceC23447K<? extends HM4<Unit>>> {
        public C30203s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends HM4<Unit>> invoke(Integer it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C51631xU0.this.f117658d.mo92272d((Deal) ((Optional) C51631xU0.this.f117667m.getValue()).m59038b(), DealAcknowledgmentState.REFUSED);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LHM4;", "", "kotlin.jvm.PlatformType", "response", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xU0$t */
    /* loaded from: classes2.dex */
    public static final class C30204t extends Lambda implements Function1<HM4<Unit>, Unit> {
        public C30204t() {
            super(1);
        }

        /* renamed from: a */
        public final void m5139a(HM4<Unit> hm4) {
            if (hm4.m103939f()) {
                C51631xU0.this.m5211D();
            } else {
                C51631xU0.this.f117663i.error(C45871nl4.error_generic_body);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<Unit> hm4) {
            m5139a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xU0$u */
    /* loaded from: classes2.dex */
    public static final class C30205u extends Lambda implements Function1<Throwable, Unit> {
        public C30205u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C51631xU0.this.f117663i.error(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0007\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)Lio/reactivex/K;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xU0$v */
    /* loaded from: classes2.dex */
    public static final class C30206v extends Lambda implements Function1<Unit, InterfaceC23447K<? extends Integer>> {
        public C30206v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23447K<? extends Integer> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C51631xU0.this.f117663i.mo110379Ee().firstOrError().m33148R(-1);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "remainingSeconds", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: xU0$w */
    /* loaded from: classes2.dex */
    public static final class C30207w extends Lambda implements Function1<Integer, Unit> {
        public C30207w() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke2(num);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Integer remainingSeconds) {
            InterfaceC1880Ea interfaceC1880Ea = C51631xU0.this.f117660f;
            Deal deal = (Deal) ((Optional) C51631xU0.this.f117667m.getValue()).m59035e();
            User m37750B0 = C51631xU0.this.f117665k.m37750B0();
            String id = m37750B0 != null ? m37750B0.getId() : null;
            Intrinsics.checkNotNullExpressionValue(remainingSeconds, "remainingSeconds");
            interfaceC1880Ea.mo55956N(new BonusDealScreenClaimed(deal, id, remainingSeconds.intValue()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/K;", "Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/lang/Integer;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xU0$x */
    /* loaded from: classes2.dex */
    public static final class C30208x extends Lambda implements Function1<Integer, InterfaceC23447K<? extends User>> {
        public C30208x() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends User> invoke(Integer it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C51631xU0.this.f117657c.getUser();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/BirdPayment;", "it", "Lcom/stripe/android/model/Card;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xU0$y */
    /* loaded from: classes2.dex */
    public static final class C30209y extends Lambda implements Function1<Optional<BirdPayment>, Optional<Card>> {

        /* renamed from: g */
        public static final C30209y f117698g = new C30209y();

        public C30209y() {
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

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00042\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/User;", "Lco/bird/android/buava/Optional;", "Lcom/stripe/android/model/Card;", "", "<name for destructuring parameter 0>", C17296a.f69688o, "(Lkotlin/Triple;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: xU0$z */
    /* loaded from: classes2.dex */
    public static final class C30210z extends Lambda implements Function1<Triple<? extends User, ? extends Optional<Card>, ? extends Boolean>, Boolean> {

        /* renamed from: g */
        public static final C30210z f117699g = new C30210z();

        public C30210z() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Triple<User, Optional<Card>, Boolean> triple) {
            boolean z;
            Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
            Optional<Card> component2 = triple.component2();
            if (component2.m59037c() && !ES5.m108973b(component2.m59038b()) && component2.m59038b().getLast4() != null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    public C51631xU0(InterfaceC42586iD1 googlePayManager, InterfaceC52757zN3 paymentMethodManager, InterfaceC44647lh6 userManager, JT0 dealManager, C36207Tq4 reactiveConfig, InterfaceC1880Ea analyticsManager, BaseActivity activity, LifecycleScopeProvider<EnumC7097RE> scopeProvider, CU0 ui, InterfaceC40099e13 navigator, C22454gl preferences) {
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(paymentMethodManager, "paymentMethodManager");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(dealManager, "dealManager");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.f117655a = googlePayManager;
        this.f117656b = paymentMethodManager;
        this.f117657c = userManager;
        this.f117658d = dealManager;
        this.f117659e = reactiveConfig;
        this.f117660f = analyticsManager;
        this.f117661g = activity;
        this.f117662h = scopeProvider;
        this.f117663i = ui;
        this.f117664j = navigator;
        this.f117665k = preferences;
        C0058AG<Boolean> m115950h = C0058AG.m115950h(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(m115950h, "createDefault(false)");
        this.f117666l = m115950h;
        this.f117667m = C37791a94.C10586a.create$default(C37791a94.f49908h, Optional.f63040c.m59034a(), null, 2, null);
        C24552a<Triple<User, Optional<Card>, Boolean>> m31922e = C24552a.m31922e();
        Intrinsics.checkNotNullExpressionValue(m31922e, "create<Triple<User, Optional<Card>, Boolean>>()");
        this.f117668n = m31922e;
    }

    /* renamed from: E */
    public static final InterfaceC24574u m5210E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m5209F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m5208G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final void m5207H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final void m5206I() {
    }

    /* renamed from: K */
    public static final InterfaceC23447K m5204K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final boolean m5203L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: M */
    public static final void m5202M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final InterfaceC23447K m5201N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final void m5200O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m5199P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m5198Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final boolean m5197R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: S */
    public static final void m5196S(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final void m5195T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final InterfaceC23447K m5194U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m5193V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final InterfaceC23447K m5192W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m5191X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final void m5190Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m5189Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final boolean m5187a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: b0 */
    public static final InterfaceC23447K m5185b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final void m5183c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final InterfaceC23447K m5181d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: e0 */
    public static final void m5179e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final InterfaceC23447K m5177f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final Optional m5175g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Optional) tmp0.invoke(obj);
    }

    /* renamed from: h0 */
    public static final boolean m5173h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: D */
    public final void m5211D() {
        this.f117663i.mo110374lj();
        this.f117664j.mo37030e3();
    }

    /* renamed from: J */
    public void m5205J(Deal deal) {
        if (deal == null) {
            deal = this.f117658d.mo92271e().getValue().m59038b();
        }
        if (deal != null) {
            Observable<Boolean> observeOn = this.f117659e.m82413z3().observeOn(C23454a.m33087a());
            final C30189e c30189e = new C30189e(deal);
            Observable<Boolean> doOnNext = observeOn.doOnNext(new InterfaceC23484g() { // from class: sU0
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C51631xU0.m5189Z(Function1.this, obj);
                }
            });
            final C30190f c30190f = C30190f.f117678g;
            Observable<Boolean> filter = doOnNext.filter(new InterfaceC23494q() { // from class: aU0
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean m5187a0;
                    m5187a0 = C51631xU0.m5187a0(Function1.this, obj);
                    return m5187a0;
                }
            });
            final C30191g c30191g = new C30191g(deal);
            Observable observeOn2 = filter.flatMapSingle(new InterfaceC23492o() { // from class: hU0
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23447K m5185b0;
                    m5185b0 = C51631xU0.m5185b0(Function1.this, obj);
                    return m5185b0;
                }
            }).observeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(observeOn2, "override fun onCreate(de…eneric_body)\n      })\n  }");
            Object m33094as = observeOn2.m33094as(AutoDispose.m45239a(this.f117662h));
            Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C30192h c30192h = new C30192h();
            ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: iU0
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C51631xU0.m5183c0(Function1.this, obj);
                }
            });
        }
        AbstractC24507p<Boolean> m32065J = this.f117655a.mo16237g().m33125j0().m32065J();
        Intrinsics.checkNotNullExpressionValue(m32065J, "googlePayManager.googleP…\n      .onErrorComplete()");
        Object m32048b = m32065J.m32048b(AutoDispose.m45239a(this.f117662h));
        Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((MaybeSubscribeProxy) m32048b).subscribe(this.f117666l);
        Object m33041n = this.f117663i.mo110377I4().m33041n(AutoDispose.m45239a(this.f117662h));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).mo45218b(new InterfaceC23478a() { // from class: jU0
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C51631xU0.this.m5211D();
            }
        });
        Observable<Unit> mo110378Fc = this.f117663i.mo110378Fc();
        final C30206v c30206v = new C30206v();
        Observable<R> flatMapSingle = mo110378Fc.flatMapSingle(new InterfaceC23492o() { // from class: kU0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m5181d0;
                m5181d0 = C51631xU0.m5181d0(Function1.this, obj);
                return m5181d0;
            }
        });
        final C30207w c30207w = new C30207w();
        Observable doOnNext2 = flatMapSingle.doOnNext(new InterfaceC23484g() { // from class: lU0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51631xU0.m5179e0(Function1.this, obj);
            }
        });
        final C30208x c30208x = new C30208x();
        Observable flatMapSingle2 = doOnNext2.flatMapSingle(new InterfaceC23492o() { // from class: mU0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m5177f0;
                m5177f0 = C51631xU0.m5177f0(Function1.this, obj);
                return m5177f0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapSingle2, "override fun onCreate(de…eneric_body)\n      })\n  }");
        Z84<Optional<BirdPayment>> mo1484a = this.f117656b.mo1484a();
        final C30209y c30209y = C30209y.f117698g;
        InterfaceC23434B map = mo1484a.map(new InterfaceC23492o() { // from class: nU0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Optional m5175g0;
                m5175g0 = C51631xU0.m5175g0(Function1.this, obj);
                return m5175g0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "paymentMethodManager.def…t.orNull()?.stripeCard) }");
        C24527f.m31949b(flatMapSingle2, map, this.f117666l).subscribe(this.f117668n);
        C24552a<Triple<User, Optional<Card>, Boolean>> c24552a = this.f117668n;
        final C30210z c30210z = C30210z.f117699g;
        Observable<Triple<User, Optional<Card>, Boolean>> filter2 = c24552a.filter(new InterfaceC23494q() { // from class: oU0
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m5173h0;
                m5173h0 = C51631xU0.m5173h0(Function1.this, obj);
                return m5173h0;
            }
        });
        final C30182A c30182a = new C30182A();
        Observable<R> flatMapSingle3 = filter2.flatMapSingle(new InterfaceC23492o() { // from class: tU0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m5204K;
                m5204K = C51631xU0.m5204K(Function1.this, obj);
                return m5204K;
            }
        });
        final C30184B c30184b = C30184B.f117671g;
        Observable filter3 = flatMapSingle3.filter(new InterfaceC23494q() { // from class: uU0
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m5203L;
                m5203L = C51631xU0.m5203L(Function1.this, obj);
                return m5203L;
            }
        });
        final C30193i c30193i = new C30193i();
        Observable doOnNext3 = filter3.doOnNext(new InterfaceC23484g() { // from class: vU0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51631xU0.m5202M(Function1.this, obj);
            }
        });
        final C30194j c30194j = new C30194j();
        Observable flatMapSingle4 = doOnNext3.flatMapSingle(new InterfaceC23492o() { // from class: wU0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m5201N;
                m5201N = C51631xU0.m5201N(Function1.this, obj);
                return m5201N;
            }
        });
        final C30195k c30195k = new C30195k();
        Observable doOnNext4 = flatMapSingle4.doOnNext(new InterfaceC23484g() { // from class: UT0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51631xU0.m5200O(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext4, "override fun onCreate(de…eneric_body)\n      })\n  }");
        Object m33094as2 = doOnNext4.m33094as(AutoDispose.m45239a(this.f117662h));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30196l c30196l = new C30196l();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: VT0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51631xU0.m5199P(Function1.this, obj);
            }
        };
        final C30197m c30197m = new C30197m();
        ((ObservableSubscribeProxy) m33094as2).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: WT0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51631xU0.m5198Q(Function1.this, obj);
            }
        });
        C24552a<Triple<User, Optional<Card>, Boolean>> c24552a2 = this.f117668n;
        final C30198n c30198n = C30198n.f117687g;
        Observable<Triple<User, Optional<Card>, Boolean>> filter4 = c24552a2.filter(new InterfaceC23494q() { // from class: XT0
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m5197R;
                m5197R = C51631xU0.m5197R(Function1.this, obj);
                return m5197R;
            }
        });
        final C30199o c30199o = new C30199o();
        Observable<Triple<User, Optional<Card>, Boolean>> doOnNext5 = filter4.doOnNext(new InterfaceC23484g() { // from class: YT0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51631xU0.m5196S(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext5, "override fun onCreate(de…eneric_body)\n      })\n  }");
        Object m33094as3 = doOnNext5.m33094as(AutoDispose.m45239a(this.f117662h));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30200p c30200p = new C30200p();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: ZT0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51631xU0.m5195T(Function1.this, obj);
            }
        });
        Observable<Unit> mo110376Ke = this.f117663i.mo110376Ke();
        final C30201q c30201q = new C30201q();
        Observable<R> flatMapSingle5 = mo110376Ke.flatMapSingle(new InterfaceC23492o() { // from class: bU0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m5194U;
                m5194U = C51631xU0.m5194U(Function1.this, obj);
                return m5194U;
            }
        });
        final C30202r c30202r = new C30202r();
        Observable doOnNext6 = flatMapSingle5.doOnNext(new InterfaceC23484g() { // from class: cU0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51631xU0.m5193V(Function1.this, obj);
            }
        });
        final C30203s c30203s = new C30203s();
        Observable retry = doOnNext6.flatMapSingle(new InterfaceC23492o() { // from class: dU0
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m5192W;
                m5192W = C51631xU0.m5192W(Function1.this, obj);
                return m5192W;
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "override fun onCreate(de…eneric_body)\n      })\n  }");
        Object m33094as4 = retry.m33094as(AutoDispose.m45239a(this.f117662h));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C30204t c30204t = new C30204t();
        InterfaceC23484g interfaceC23484g2 = new InterfaceC23484g() { // from class: fU0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51631xU0.m5191X(Function1.this, obj);
            }
        };
        final C30205u c30205u = new C30205u();
        ((ObservableSubscribeProxy) m33094as4).subscribe(interfaceC23484g2, new InterfaceC23484g() { // from class: gU0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C51631xU0.m5190Y(Function1.this, obj);
            }
        });
    }

    @Override // p000.ST0
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == EnumC51527xI4.GOOGLE_PAY.ordinal()) {
            AbstractC24507p handleGooglePayActivityResult$default = InterfaceC42586iD1.C23161a.handleGooglePayActivityResult$default(this.f117655a, i2, intent, false, null, 8, null);
            final C30185a c30185a = new C30185a();
            AbstractC24507p m32021x = handleGooglePayActivityResult$default.m32021x(new InterfaceC23492o() { // from class: TT0
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m5210E;
                    m5210E = C51631xU0.m5210E(Function1.this, obj);
                    return m5210E;
                }
            });
            final C30186b c30186b = new C30186b();
            AbstractC24507p m32026s = m32021x.m32026s(new InterfaceC23484g() { // from class: eU0
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C51631xU0.m5209F(Function1.this, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m32026s, "override fun onActivityR…     })\n      }\n    }\n  }");
            Object m32048b = C28237sD.progress$default(m32026s, this.f117663i, 0, 2, (Object) null).m32048b(AutoDispose.m45239a(this.f117662h));
            Intrinsics.checkExpressionValueIsNotNull(m32048b, "this.`as`(AutoDispose.autoDisposable(provider))");
            final C30187c c30187c = new C30187c();
            InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: pU0
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C51631xU0.m5208G(Function1.this, obj);
                }
            };
            final C30188d c30188d = new C30188d();
            ((MaybeSubscribeProxy) m32048b).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: qU0
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C51631xU0.m5207H(Function1.this, obj);
                }
            }, new InterfaceC23478a() { // from class: rU0
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C51631xU0.m5206I();
                }
            });
        }
    }

    @Override // p000.ST0
    public void onBackPressed() {
        this.f117663i.mo110374lj();
    }
}
