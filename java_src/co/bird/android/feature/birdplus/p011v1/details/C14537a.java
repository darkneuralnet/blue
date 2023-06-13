package co.bird.android.feature.birdplus.p011v1.details;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.feature.birdplus.p011v1.details.BirdPlusDetailsActivity;
import co.bird.android.feature.birdplus.p011v1.details.C14537a;
import co.bird.android.model.BirdPayment;
import co.bird.android.model.PaymentAddSource;
import co.bird.android.model.constant.BirdPlusSubscriptionViewStatus;
import co.bird.android.model.constant.PurchasePaymentReason;
import co.bird.android.model.persistence.BirdPlusDisplayView;
import co.bird.android.model.persistence.BirdPlusSubcriptionPlanTrialView;
import co.bird.android.model.persistence.BirdPlusSubscriptionPlanView;
import co.bird.android.model.persistence.BirdPlusUserSubscriptionView;
import co.bird.android.model.persistence.BirdPlusView;
import co.bird.android.model.wire.configs.BirdPlusConfig;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.location.places.Place;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.rxkotlin.C24523e;
import io.reactivex.rxkotlin.C24527f;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B9\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#¢\u0006\u0004\b0\u00101J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\f*\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, m28432d2 = {"Lco/bird/android/feature/birdplus/v1/details/a;", "Lf1;", "Lco/bird/android/feature/birdplus/v1/details/b;", "LtQ;", "Lco/bird/android/model/persistence/BirdPlusView;", "birdPlusView", "Lio/reactivex/c;", "T", "renderer", "", "D", "Lco/bird/android/buava/Optional;", "", "activeSubscriptionPlanId", "R", "LJQ;", "e", "LJQ;", "birdPlusManager", "LAM3;", "f", "LAM3;", "paymentManager", "LiD1;", "g", "LiD1;", "googlePayManager", "LEa;", "h", "LEa;", "analyticsManager", "Le13;", "i", "Le13;", "navigator", "LTq4;", "j", "LTq4;", "reactiveConfig", "k", "Lkotlin/Lazy;", "S", "()Ljava/lang/String;", "sessionId", "", "l", "Z", "hasEmittedDisplayEvent", "<init>", "(LJQ;LAM3;LiD1;LEa;Le13;LTq4;)V", "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdPlusDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusDetailsPresenter.kt\nco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsPresenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,381:1\n237#2:382\n180#2:383\n237#2:384\n237#2:385\n237#2:386\n180#2:387\n180#2:388\n180#2:389\n237#2:390\n*S KotlinDebug\n*F\n+ 1 BirdPlusDetailsPresenter.kt\nco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsPresenter\n*L\n90#1:382\n94#1:383\n186#1:384\n230#1:385\n276#1:386\n286#1:387\n294#1:388\n301#1:389\n331#1:390\n*E\n"})
/* renamed from: co.bird.android.feature.birdplus.v1.details.a */
/* loaded from: classes3.dex */
public final class C14537a extends AbstractC20169f1<InterfaceC14581b, C28698tQ> {

    /* renamed from: e */
    public final InterfaceC4077JQ f63301e;

    /* renamed from: f */
    public final AM3 f63302f;

    /* renamed from: g */
    public final InterfaceC42586iD1 f63303g;

    /* renamed from: h */
    public final InterfaceC1880Ea f63304h;

    /* renamed from: i */
    public final InterfaceC40099e13 f63305i;

    /* renamed from: j */
    public final C36207Tq4 f63306j;

    /* renamed from: k */
    public final Lazy f63307k;

    /* renamed from: l */
    public boolean f63308l;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.birdplus.v1.details.a$a */
    /* loaded from: classes3.dex */
    public static final class C14538a extends Lambda implements Function1<InterfaceC23465c, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LtQ;", "prev", C17296a.f69688o, "(LtQ;)LtQ;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.birdplus.v1.details.a$a$a */
        /* loaded from: classes3.dex */
        public static final class C14539a extends Lambda implements Function1<C28698tQ, C28698tQ> {

            /* renamed from: g */
            public static final C14539a f63310g = new C14539a();

            public C14539a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C28698tQ invoke(C28698tQ prev) {
                C28698tQ m12411a;
                Intrinsics.checkNotNullParameter(prev, "prev");
                m12411a = prev.m12411a((r22 & 1) != 0 ? prev.f110440a : null, (r22 & 2) != 0 ? prev.f110441b : false, (r22 & 4) != 0 ? prev.f110442c : false, (r22 & 8) != 0 ? prev.f110443d : false, (r22 & 16) != 0 ? prev.f110444e : false, (r22 & 32) != 0 ? prev.f110445f : false, (r22 & 64) != 0 ? prev.f110446g : false, (r22 & 128) != 0 ? prev.f110447h : true, (r22 & 256) != 0 ? prev.f110448i : false, (r22 & 512) != 0 ? prev.f110449j : null);
                return m12411a;
            }
        }

        public C14538a() {
            super(1);
        }

        /* renamed from: a */
        public final void m58747a(InterfaceC23465c interfaceC23465c) {
            C14537a.this.m42279i(C14539a.f63310g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m58747a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "zendeskArticleId", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.birdplus.v1.details.a$b */
    /* loaded from: classes3.dex */
    public static final class C14540b extends Lambda implements Function1<String, Unit> {
        public C14540b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            BirdPlusConfig birdPlus;
            C14537a.this.f63305i.mo36922w3((str == null && ((birdPlus = C14537a.this.f63306j.m82623f8().m73665a().getBirdPlus()) == null || (str = birdPlus.getZendeskArticleId()) == null)) ? 0L : Long.parseLong(str));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "userSubscriptionId", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.birdplus.v1.details.a$c */
    /* loaded from: classes3.dex */
    public static final class C14541c extends Lambda implements Function1<String, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LtQ;", "prev", C17296a.f69688o, "(LtQ;)LtQ;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.birdplus.v1.details.a$c$a */
        /* loaded from: classes3.dex */
        public static final class C14542a extends Lambda implements Function1<C28698tQ, C28698tQ> {

            /* renamed from: g */
            public static final C14542a f63313g = new C14542a();

            public C14542a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C28698tQ invoke(C28698tQ prev) {
                C28698tQ m12411a;
                Intrinsics.checkNotNullParameter(prev, "prev");
                m12411a = prev.m12411a((r22 & 1) != 0 ? prev.f110440a : null, (r22 & 2) != 0 ? prev.f110441b : false, (r22 & 4) != 0 ? prev.f110442c : false, (r22 & 8) != 0 ? prev.f110443d : false, (r22 & 16) != 0 ? prev.f110444e : false, (r22 & 32) != 0 ? prev.f110445f : false, (r22 & 64) != 0 ? prev.f110446g : false, (r22 & 128) != 0 ? prev.f110447h : false, (r22 & 256) != 0 ? prev.f110448i : false, (r22 & 512) != 0 ? prev.f110449j : null);
                return m12411a;
            }
        }

        public C14541c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
            if ((!r0) == true) goto L11;
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void invoke2(String userSubscriptionId) {
            boolean z;
            BirdPlusSubscriptionPlanView subscriptionPlan;
            BirdPlusDisplayView display;
            String purchasedMessage;
            boolean isBlank;
            C14537a.this.m42279i(C14542a.f63313g);
            BirdPlusView m12410b = C14537a.this.m42277k().m12410b();
            if (m12410b != null && (subscriptionPlan = m12410b.getSubscriptionPlan()) != null && (display = subscriptionPlan.getDisplay()) != null && (purchasedMessage = display.getPurchasedMessage()) != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(purchasedMessage);
                z = true;
            }
            z = false;
            if (z) {
                C41318g46.m40163a("going to purchased screen now with user subscription id " + userSubscriptionId, new Object[0]);
                InterfaceC40099e13 interfaceC40099e13 = C14537a.this.f63305i;
                Intrinsics.checkNotNullExpressionValue(userSubscriptionId, "userSubscriptionId");
                interfaceC40099e13.mo37075W2(userSubscriptionId);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\b\u001aª\u0001\u0012N\b\u0001\u0012J\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0007*$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003 \u0007*T\u0012N\b\u0001\u0012J\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0007*$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/BirdPlusView;", "Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.birdplus.v1.details.a$d */
    /* loaded from: classes3.dex */
    public static final class C14543d extends Lambda implements Function1<Unit, InterfaceC24574u<? extends Pair<? extends BirdPlusView, ? extends Optional<String>>>> {

        /* renamed from: g */
        public final /* synthetic */ Observable<Pair<BirdPlusView, Optional<String>>> f63314g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14543d(Observable<Pair<BirdPlusView, Optional<String>>> observable) {
            super(1);
            this.f63314g = observable;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends Pair<BirdPlusView, Optional<String>>> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f63314g.firstElement();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.birdplus.v1.details.a$f */
    /* loaded from: classes3.dex */
    public static final class C14547f extends Lambda implements Function1<Throwable, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LtQ;", "prev", C17296a.f69688o, "(LtQ;)LtQ;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.birdplus.v1.details.a$f$a */
        /* loaded from: classes3.dex */
        public static final class C14548a extends Lambda implements Function1<C28698tQ, C28698tQ> {

            /* renamed from: g */
            public final /* synthetic */ Throwable f63320g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14548a(Throwable th) {
                super(1);
                this.f63320g = th;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C28698tQ invoke(C28698tQ prev) {
                C28698tQ m12411a;
                Intrinsics.checkNotNullParameter(prev, "prev");
                m12411a = prev.m12411a((r22 & 1) != 0 ? prev.f110440a : null, (r22 & 2) != 0 ? prev.f110441b : false, (r22 & 4) != 0 ? prev.f110442c : false, (r22 & 8) != 0 ? prev.f110443d : false, (r22 & 16) != 0 ? prev.f110444e : false, (r22 & 32) != 0 ? prev.f110445f : false, (r22 & 64) != 0 ? prev.f110446g : false, (r22 & 128) != 0 ? prev.f110447h : false, (r22 & 256) != 0 ? prev.f110448i : false, (r22 & 512) != 0 ? prev.f110449j : this.f63320g);
                return m12411a;
            }
        }

        public C14547f() {
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
            C14537a.this.m42279i(new C14548a(th));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0007*$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/BirdPlusView;", "Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.birdplus.v1.details.a$g */
    /* loaded from: classes3.dex */
    public static final class C14549g extends Lambda implements Function1<Pair<? extends BirdPlusView, ? extends Optional<String>>, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LtQ;", "prev", C17296a.f69688o, "(LtQ;)LtQ;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.birdplus.v1.details.a$g$a */
        /* loaded from: classes3.dex */
        public static final class C14550a extends Lambda implements Function1<C28698tQ, C28698tQ> {

            /* renamed from: g */
            public final /* synthetic */ Optional<String> f63322g;

            /* renamed from: h */
            public final /* synthetic */ BirdPlusView f63323h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14550a(Optional<String> optional, BirdPlusView birdPlusView) {
                super(1);
                this.f63322g = optional;
                this.f63323h = birdPlusView;
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final C28698tQ invoke(C28698tQ prev) {
                boolean z;
                boolean z2;
                boolean z3;
                BirdPlusUserSubscriptionView userSubscription;
                DateTime dateTime;
                boolean z4;
                BirdPlusSubscriptionPlanView subscriptionPlan;
                BirdPlusSubcriptionPlanTrialView birdPlusSubcriptionPlanTrialView;
                boolean z5;
                C28698tQ m12411a;
                DateTime dateTime2;
                Intrinsics.checkNotNullParameter(prev, "prev");
                String m59035e = this.f63322g.m59035e();
                if (m59035e != null && !m59035e.equals(this.f63323h.getSubscriptionPlanId())) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z6 = !z;
                if (this.f63323h.getStatus() == BirdPlusSubscriptionViewStatus.AVAILABLE) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                BirdPlusSubcriptionPlanTrialView birdPlusSubcriptionPlanTrialView2 = null;
                if (this.f63323h.getUserSubscription() != null) {
                    BirdPlusUserSubscriptionView userSubscription2 = this.f63323h.getUserSubscription();
                    if (userSubscription2 != null) {
                        dateTime2 = userSubscription2.getRecurringCanceledAt();
                    } else {
                        dateTime2 = null;
                    }
                    if (dateTime2 == null) {
                        z3 = true;
                        userSubscription = this.f63323h.getUserSubscription();
                        if (userSubscription == null) {
                            dateTime = userSubscription.getRecurringCanceledAt();
                        } else {
                            dateTime = null;
                        }
                        if (dateTime == null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        subscriptionPlan = this.f63323h.getSubscriptionPlan();
                        if (subscriptionPlan == null) {
                            birdPlusSubcriptionPlanTrialView = subscriptionPlan.getTrial();
                        } else {
                            birdPlusSubcriptionPlanTrialView = null;
                        }
                        if (birdPlusSubcriptionPlanTrialView != null) {
                            BirdPlusUserSubscriptionView userSubscription3 = this.f63323h.getUserSubscription();
                            if (userSubscription3 != null) {
                                birdPlusSubcriptionPlanTrialView2 = userSubscription3.getTrial();
                            }
                            if (birdPlusSubcriptionPlanTrialView2 == null) {
                                z5 = true;
                                m12411a = prev.m12411a((r22 & 1) != 0 ? prev.f110440a : this.f63323h, (r22 & 2) != 0 ? prev.f110441b : z6, (r22 & 4) != 0 ? prev.f110442c : z2, (r22 & 8) != 0 ? prev.f110443d : z3, (r22 & 16) != 0 ? prev.f110444e : this.f63323h.getNeedsDeviceTransfer(), (r22 & 32) != 0 ? prev.f110445f : z4, (r22 & 64) != 0 ? prev.f110446g : z5, (r22 & 128) != 0 ? prev.f110447h : false, (r22 & 256) != 0 ? prev.f110448i : false, (r22 & 512) != 0 ? prev.f110449j : null);
                                return m12411a;
                            }
                        }
                        z5 = false;
                        m12411a = prev.m12411a((r22 & 1) != 0 ? prev.f110440a : this.f63323h, (r22 & 2) != 0 ? prev.f110441b : z6, (r22 & 4) != 0 ? prev.f110442c : z2, (r22 & 8) != 0 ? prev.f110443d : z3, (r22 & 16) != 0 ? prev.f110444e : this.f63323h.getNeedsDeviceTransfer(), (r22 & 32) != 0 ? prev.f110445f : z4, (r22 & 64) != 0 ? prev.f110446g : z5, (r22 & 128) != 0 ? prev.f110447h : false, (r22 & 256) != 0 ? prev.f110448i : false, (r22 & 512) != 0 ? prev.f110449j : null);
                        return m12411a;
                    }
                }
                z3 = false;
                userSubscription = this.f63323h.getUserSubscription();
                if (userSubscription == null) {
                }
                if (dateTime == null) {
                }
                subscriptionPlan = this.f63323h.getSubscriptionPlan();
                if (subscriptionPlan == null) {
                }
                if (birdPlusSubcriptionPlanTrialView != null) {
                }
                z5 = false;
                m12411a = prev.m12411a((r22 & 1) != 0 ? prev.f110440a : this.f63323h, (r22 & 2) != 0 ? prev.f110441b : z6, (r22 & 4) != 0 ? prev.f110442c : z2, (r22 & 8) != 0 ? prev.f110443d : z3, (r22 & 16) != 0 ? prev.f110444e : this.f63323h.getNeedsDeviceTransfer(), (r22 & 32) != 0 ? prev.f110445f : z4, (r22 & 64) != 0 ? prev.f110446g : z5, (r22 & 128) != 0 ? prev.f110447h : false, (r22 & 256) != 0 ? prev.f110448i : false, (r22 & 512) != 0 ? prev.f110449j : null);
                return m12411a;
            }
        }

        public C14549g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends BirdPlusView, ? extends Optional<String>> pair) {
            invoke2((Pair<BirdPlusView, Optional<String>>) pair);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Pair<BirdPlusView, Optional<String>> pair) {
            BirdPlusView component1 = pair.component1();
            Optional<String> component2 = pair.component2();
            String subscriptionPlanId = component1.getSubscriptionPlanId();
            C41318g46.m40163a("emitting new state for id: " + subscriptionPlanId + " + active id: " + component2, new Object[0]);
            C14537a.this.m42279i(new C14550a(component2, component1));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "zendeskArticleId", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.birdplus.v1.details.a$l */
    /* loaded from: classes3.dex */
    public static final class C14572l extends Lambda implements Function1<String, Unit> {
        public C14572l() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            BirdPlusConfig birdPlus;
            C14537a.this.f63305i.mo36922w3((str == null && ((birdPlus = C14537a.this.f63306j.m82623f8().m73665a().getBirdPlus()) == null || (str = birdPlus.getZendeskArticleId()) == null)) ? 0L : Long.parseLong(str));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/persistence/BirdPlusView;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/BirdPlusView;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.birdplus.v1.details.a$m */
    /* loaded from: classes3.dex */
    public static final class C14573m extends Lambda implements Function1<BirdPlusView, String> {

        /* renamed from: g */
        public static final C14573m f63356g = new C14573m();

        public C14573m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(BirdPlusView it) {
            String zendeskArticleId;
            Intrinsics.checkNotNullParameter(it, "it");
            BirdPlusSubscriptionPlanView subscriptionPlan = it.getSubscriptionPlan();
            if (subscriptionPlan == null || (zendeskArticleId = subscriptionPlan.getZendeskArticleId()) == null) {
                return it.getZendeskArticleId();
            }
            return zendeskArticleId;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\b\u001aª\u0001\u0012N\b\u0001\u0012J\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0007*$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003 \u0007*T\u0012N\b\u0001\u0012J\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0007*$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;", "identifier", "Lio/reactivex/B;", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/BirdPlusView;", "Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;)Lio/reactivex/B;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.birdplus.v1.details.a$n */
    /* loaded from: classes3.dex */
    public static final class C14574n extends Lambda implements Function1<BirdPlusDetailsActivity.InterfaceC14524a, InterfaceC23434B<? extends Pair<? extends BirdPlusView, ? extends Optional<String>>>> {

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/persistence/BirdPlusView;", "birdPlusViews", "Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lco/bird/android/buava/Optional;"}, m28431k = 3, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nBirdPlusDetailsPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusDetailsPresenter.kt\nco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsPresenter$consume$sharedObservable$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,381:1\n288#2,2:382\n*S KotlinDebug\n*F\n+ 1 BirdPlusDetailsPresenter.kt\nco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsPresenter$consume$sharedObservable$1$1\n*L\n60#1:382,2\n*E\n"})
        /* renamed from: co.bird.android.feature.birdplus.v1.details.a$n$a */
        /* loaded from: classes3.dex */
        public static final class C14575a extends Lambda implements Function1<List<? extends BirdPlusView>, Optional<String>> {

            /* renamed from: g */
            public static final C14575a f63358g = new C14575a();

            public C14575a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Optional<String> invoke(List<BirdPlusView> birdPlusViews) {
                String str;
                Object obj;
                Intrinsics.checkNotNullParameter(birdPlusViews, "birdPlusViews");
                Optional.C14443a c14443a = Optional.f63040c;
                Iterator<T> it = birdPlusViews.iterator();
                while (true) {
                    str = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((BirdPlusView) obj).isActive()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                BirdPlusView birdPlusView = (BirdPlusView) obj;
                if (birdPlusView != null) {
                    str = birdPlusView.getSubscriptionPlanId();
                }
                return c14443a.m59033b(str);
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.birdplus.v1.details.a$n$b */
        /* loaded from: classes3.dex */
        public static final class C14576b extends Lambda implements Function1<Optional<String>, Unit> {

            /* renamed from: g */
            public static final C14576b f63359g = new C14576b();

            public C14576b() {
                super(1);
            }

            /* renamed from: a */
            public final void m58695a(Optional<String> optional) {
                C41318g46.m40163a("has any active bird plus views: " + optional, new Object[0]);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Optional<String> optional) {
                m58695a(optional);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012N\u0010\u0002\u001aJ\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005 \u0007*$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u0005\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\b"}, m28432d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lco/bird/android/model/persistence/BirdPlusView;", "Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.feature.birdplus.v1.details.a$n$c */
        /* loaded from: classes3.dex */
        public static final class C14577c extends Lambda implements Function1<Pair<? extends BirdPlusView, ? extends Optional<String>>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C14537a f63360g;

            /* renamed from: h */
            public final /* synthetic */ BirdPlusDetailsActivity.InterfaceC14524a f63361h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14577c(C14537a c14537a, BirdPlusDetailsActivity.InterfaceC14524a interfaceC14524a) {
                super(1);
                this.f63360g = c14537a;
                this.f63361h = interfaceC14524a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends BirdPlusView, ? extends Optional<String>> pair) {
                invoke2((Pair<BirdPlusView, Optional<String>>) pair);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Pair<BirdPlusView, Optional<String>> pair) {
                BirdPlusView component1 = pair.component1();
                Optional<String> activeSubscriptionId = pair.component2();
                String subscriptionPlanId = component1.getSubscriptionPlanId();
                C41318g46.m40163a("streamed bird plus view " + subscriptionPlanId, new Object[0]);
                if (this.f63360g.f63308l) {
                    return;
                }
                InterfaceC1880Ea interfaceC1880Ea = this.f63360g.f63304h;
                String sessionId = this.f63360g.m58767S();
                Intrinsics.checkNotNullExpressionValue(sessionId, "sessionId");
                BirdPlusDetailsActivity.InterfaceC14524a interfaceC14524a = this.f63361h;
                String m116240unboximpl = interfaceC14524a instanceof BirdPlusDetailsActivity.C14525b ? ((BirdPlusDetailsActivity.C14525b) interfaceC14524a).m116240unboximpl() : null;
                String str = m116240unboximpl == null ? null : m116240unboximpl;
                BirdPlusDetailsActivity.InterfaceC14524a interfaceC14524a2 = this.f63361h;
                String m116242unboximpl = interfaceC14524a2 instanceof BirdPlusDetailsActivity.C14527d ? ((BirdPlusDetailsActivity.C14527d) interfaceC14524a2).m116242unboximpl() : null;
                String str2 = m116242unboximpl == null ? null : m116242unboximpl;
                BirdPlusDetailsActivity.InterfaceC14524a interfaceC14524a3 = this.f63361h;
                String m116244unboximpl = interfaceC14524a3 instanceof BirdPlusDetailsActivity.C14528e ? ((BirdPlusDetailsActivity.C14528e) interfaceC14524a3).m116244unboximpl() : null;
                String str3 = m116244unboximpl == null ? null : m116244unboximpl;
                C14537a c14537a = this.f63360g;
                Intrinsics.checkNotNullExpressionValue(activeSubscriptionId, "activeSubscriptionId");
                interfaceC1880Ea.mo55905y(new C30165xP(null, null, null, sessionId, str, str2, str3, c14537a.m58768R(component1, activeSubscriptionId), 7, null));
                this.f63360g.f63308l = true;
            }
        }

        public C14574n() {
            super(1);
        }

        /* renamed from: e */
        public static final Optional m58699e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (Optional) tmp0.invoke(obj);
        }

        /* renamed from: f */
        public static final void m58698f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: g */
        public static final void m58697g(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC23434B<? extends Pair<BirdPlusView, Optional<String>>> invoke(BirdPlusDetailsActivity.InterfaceC14524a identifier) {
            Observable<BirdPlusView> mo90337c0;
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            C24523e c24523e = C24523e.f91168a;
            if (identifier instanceof BirdPlusDetailsActivity.C14527d) {
                mo90337c0 = C14537a.this.f63301e.mo90335d0(identifier.getValue());
            } else if (identifier instanceof BirdPlusDetailsActivity.C14528e) {
                mo90337c0 = C14537a.this.f63301e.mo90333e0(identifier.getValue());
            } else if (identifier instanceof BirdPlusDetailsActivity.C14525b) {
                mo90337c0 = C14537a.this.f63301e.mo90337c0(identifier.getValue());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            Z84<List<BirdPlusView>> mo90339b0 = C14537a.this.f63301e.mo90339b0();
            final C14575a c14575a = C14575a.f63358g;
            Observable<R> map = mo90339b0.map(new InterfaceC23492o() { // from class: qQ
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Optional m58699e;
                    m58699e = C14537a.C14574n.m58699e(Function1.this, obj);
                    return m58699e;
                }
            });
            final C14576b c14576b = C14576b.f63359g;
            Observable distinctUntilChanged = map.doOnNext(new InterfaceC23484g() { // from class: rQ
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C14537a.C14574n.m58698f(Function1.this, obj);
                }
            }).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "birdPlusManager.birdPlus…  .distinctUntilChanged()");
            Observable m31956a = c24523e.m31956a(mo90337c0, distinctUntilChanged);
            final C14577c c14577c = new C14577c(C14537a.this, identifier);
            return m31956a.doOnNext(new InterfaceC23484g() { // from class: sQ
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C14537a.C14574n.m58697g(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.birdplus.v1.details.a$o */
    /* loaded from: classes3.dex */
    public static final class C14578o extends Lambda implements Function1<InterfaceC23465c, Unit> {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LtQ;", "prev", C17296a.f69688o, "(LtQ;)LtQ;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.birdplus.v1.details.a$o$a */
        /* loaded from: classes3.dex */
        public static final class C14579a extends Lambda implements Function1<C28698tQ, C28698tQ> {

            /* renamed from: g */
            public static final C14579a f63363g = new C14579a();

            public C14579a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final C28698tQ invoke(C28698tQ prev) {
                C28698tQ m12411a;
                Intrinsics.checkNotNullParameter(prev, "prev");
                m12411a = prev.m12411a((r22 & 1) != 0 ? prev.f110440a : null, (r22 & 2) != 0 ? prev.f110441b : false, (r22 & 4) != 0 ? prev.f110442c : false, (r22 & 8) != 0 ? prev.f110443d : false, (r22 & 16) != 0 ? prev.f110444e : false, (r22 & 32) != 0 ? prev.f110445f : false, (r22 & 64) != 0 ? prev.f110446g : false, (r22 & 128) != 0 ? prev.f110447h : true, (r22 & 256) != 0 ? prev.f110448i : true, (r22 & 512) != 0 ? prev.f110449j : null);
                return m12411a;
            }
        }

        public C14578o() {
            super(1);
        }

        /* renamed from: a */
        public final void m58694a(InterfaceC23465c interfaceC23465c) {
            C14537a.this.m42279i(C14579a.f63363g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m58694a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.feature.birdplus.v1.details.a$p */
    /* loaded from: classes3.dex */
    public static final class C14580p extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C14580p f63364g = new C14580p();

        public C14580p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return UUID.randomUUID().toString();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14537a(InterfaceC4077JQ birdPlusManager, AM3 paymentManager, InterfaceC42586iD1 googlePayManager, InterfaceC1880Ea analyticsManager, InterfaceC40099e13 navigator, C36207Tq4 reactiveConfig) {
        super(new C28698tQ(null, false, false, false, false, false, false, false, false, null, Place.TYPE_SUBLOCALITY_LEVEL_1, null));
        Lazy lazy;
        Intrinsics.checkNotNullParameter(birdPlusManager, "birdPlusManager");
        Intrinsics.checkNotNullParameter(paymentManager, "paymentManager");
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(reactiveConfig, "reactiveConfig");
        this.f63301e = birdPlusManager;
        this.f63302f = paymentManager;
        this.f63303g = googlePayManager;
        this.f63304h = analyticsManager;
        this.f63305i = navigator;
        this.f63306j = reactiveConfig;
        lazy = LazyKt__LazyJVMKt.lazy(C14580p.f63364g);
        this.f63307k = lazy;
    }

    /* renamed from: E */
    public static final InterfaceC23434B m58781E(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: F */
    public static final void m58780F(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: G */
    public static final void m58779G(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: H */
    public static final InterfaceC24574u m58778H(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: I */
    public static final InterfaceC23496h m58777I(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: J */
    public static final void m58776J(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: K */
    public static final void m58775K(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: L */
    public static final InterfaceC23496h m58774L(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: M */
    public static final InterfaceC23496h m58773M(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: N */
    public static final InterfaceC23496h m58772N(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: O */
    public static final InterfaceC23434B m58771O(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23434B) tmp0.invoke(obj);
    }

    /* renamed from: P */
    public static final void m58770P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final String m58769Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke(obj);
    }

    /* renamed from: U */
    public static final void m58765U(C14537a this$0) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        InterfaceC1880Ea interfaceC1880Ea = this$0.f63304h;
        String sessionId = this$0.m58767S();
        Intrinsics.checkNotNullExpressionValue(sessionId, "sessionId");
        BirdPlusView m12410b = this$0.m42277k().m12410b();
        if (m12410b != null) {
            str = m12410b.getCodename();
        } else {
            str = null;
        }
        BirdPlusView m12410b2 = this$0.m42277k().m12410b();
        if (m12410b2 != null) {
            str2 = m12410b2.getSubscriptionPlanId();
        } else {
            str2 = null;
        }
        BirdPlusView m12410b3 = this$0.m42277k().m12410b();
        if (m12410b3 != null) {
            str3 = m12410b3.getUserSubscriptionId();
        } else {
            str3 = null;
        }
        interfaceC1880Ea.mo55905y(new C7425SQ(null, null, null, sessionId, str, str2, str3, 7, null));
    }

    /* renamed from: V */
    public static final InterfaceC23496h m58764V(C14537a this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.f63301e.refresh();
    }

    /* renamed from: W */
    public static final void m58763W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m58762g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: D */
    public void consume(InterfaceC14581b renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        C41318g46.m40163a("consume called for bird plus details presenter", new Object[0]);
        Observable<BirdPlusDetailsActivity.InterfaceC14524a> mo58686z3 = renderer.mo58686z3();
        final C14574n c14574n = new C14574n();
        Observable m32084i = mo58686z3.switchMap(new InterfaceC23492o() { // from class: TP
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m58781E;
                m58781E = C14537a.m58781E(Function1.this, obj);
                return m58781E;
            }
        }).replay(1).m32084i();
        Intrinsics.checkNotNullExpressionValue(m32084i, "override fun consume(ren…e)\n      .subscribe()\n  }");
        AbstractC23461c refresh = this.f63301e.refresh();
        final C14538a c14538a = new C14538a();
        AbstractC23461c m33081E = refresh.m33081E(new InterfaceC23484g() { // from class: YP
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C14537a.m58762g(Function1.this, obj);
            }
        });
        final C14547f c14547f = new C14547f();
        AbstractC23461c m33084B = m33081E.m33084B(new InterfaceC23484g() { // from class: ZP
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C14537a.m58776J(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33084B, "override fun consume(ren…e)\n      .subscribe()\n  }");
        Object m33041n = m33084B.m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
        Object m33094as = m32084i.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14549g c14549g = new C14549g();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: KP
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C14537a.m58775K(Function1.this, obj);
            }
        });
        final C14551h c14551h = new C14551h(renderer, this);
        AbstractC23461c switchMapCompletable = m32084i.switchMapCompletable(new InterfaceC23492o() { // from class: LP
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m58774L;
                m58774L = C14537a.m58774L(Function1.this, obj);
                return m58774L;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapCompletable, "override fun consume(ren…e)\n      .subscribe()\n  }");
        Object m33041n2 = switchMapCompletable.m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n2).subscribe();
        final C14556i c14556i = new C14556i(renderer, this);
        AbstractC23461c switchMapCompletable2 = m32084i.switchMapCompletable(new InterfaceC23492o() { // from class: MP
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m58773M;
                m58773M = C14537a.m58773M(Function1.this, obj);
                return m58773M;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapCompletable2, "override fun consume(ren…e)\n      .subscribe()\n  }");
        Object m33041n3 = switchMapCompletable2.m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n3, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n3).subscribe();
        final C14563j c14563j = new C14563j(renderer, this);
        AbstractC23461c switchMapCompletable3 = m32084i.switchMapCompletable(new InterfaceC23492o() { // from class: NP
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m58772N;
                m58772N = C14537a.m58772N(Function1.this, obj);
                return m58772N;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMapCompletable3, "override fun consume(ren…e)\n      .subscribe()\n  }");
        Object m33041n4 = switchMapCompletable3.m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n4, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n4).subscribe();
        final C14570k c14570k = new C14570k(renderer);
        Observable switchMap = m32084i.switchMap(new InterfaceC23492o() { // from class: OP
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23434B m58771O;
                m58771O = C14537a.m58771O(Function1.this, obj);
                return m58771O;
            }
        });
        Intrinsics.checkNotNullExpressionValue(switchMap, "renderer: BirdPlusDetail…endeskArticleId }\n      }");
        Object m33094as2 = switchMap.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14572l c14572l = new C14572l();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: PP
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C14537a.m58770P(Function1.this, obj);
            }
        });
        Observable<BirdPlusView> mo58685z7 = renderer.mo58685z7();
        final C14573m c14573m = C14573m.f63356g;
        Observable<R> map = mo58685z7.map(new InterfaceC23492o() { // from class: QP
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                String m58769Q;
                m58769Q = C14537a.m58769Q(Function1.this, obj);
                return m58769Q;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "renderer.footerClicks()\n… ?: it.zendeskArticleId }");
        Object m33094as3 = map.m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14540b c14540b = new C14540b();
        ((ObservableSubscribeProxy) m33094as3).subscribe(new InterfaceC23484g() { // from class: UP
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C14537a.m58780F(Function1.this, obj);
            }
        });
        Object m33094as4 = renderer.mo58687s9().m33094as(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C14541c c14541c = new C14541c();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: VP
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C14537a.m58779G(Function1.this, obj);
            }
        });
        Observable<Unit> mo58692b1 = renderer.mo58692b1();
        final C14543d c14543d = new C14543d(m32084i);
        Observable<R> flatMapMaybe = mo58692b1.flatMapMaybe(new InterfaceC23492o() { // from class: WP
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m58778H;
                m58778H = C14537a.m58778H(Function1.this, obj);
                return m58778H;
            }
        });
        final C14544e c14544e = new C14544e();
        AbstractC23461c flatMapCompletable = flatMapMaybe.flatMapCompletable(new InterfaceC23492o() { // from class: XP
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m58777I;
                m58777I = C14537a.m58777I(Function1.this, obj);
                return m58777I;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "override fun consume(ren…e)\n      .subscribe()\n  }");
        Object m33041n5 = flatMapCompletable.m33041n(AutoDispose.m45239a(m42278j()));
        Intrinsics.checkExpressionValueIsNotNull(m33041n5, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n5).subscribe();
    }

    /* renamed from: R */
    public final String m58768R(BirdPlusView birdPlusView, Optional<String> activeSubscriptionPlanId) {
        BirdPlusSubcriptionPlanTrialView birdPlusSubcriptionPlanTrialView;
        BirdPlusSubcriptionPlanTrialView birdPlusSubcriptionPlanTrialView2;
        DateTime dateTime;
        DateTime dateTime2;
        Intrinsics.checkNotNullParameter(birdPlusView, "<this>");
        Intrinsics.checkNotNullParameter(activeSubscriptionPlanId, "activeSubscriptionPlanId");
        String m59035e = activeSubscriptionPlanId.m59035e();
        boolean z = false;
        if (m59035e != null && !m59035e.equals(birdPlusView.getSubscriptionPlanId())) {
            z = true;
        }
        boolean z2 = !z;
        if (birdPlusView.getUserSubscription() != null) {
            BirdPlusUserSubscriptionView userSubscription = birdPlusView.getUserSubscription();
            if (userSubscription != null) {
                dateTime2 = userSubscription.getRecurringCanceledAt();
            } else {
                dateTime2 = null;
            }
            if (dateTime2 == null) {
                return "cancel";
            }
        }
        if (z2) {
            BirdPlusUserSubscriptionView userSubscription2 = birdPlusView.getUserSubscription();
            if (userSubscription2 != null) {
                dateTime = userSubscription2.getRecurringCanceledAt();
            } else {
                dateTime = null;
            }
            if (dateTime != null) {
                return "renew_membership";
            }
        }
        if (z2) {
            BirdPlusSubscriptionPlanView subscriptionPlan = birdPlusView.getSubscriptionPlan();
            if (subscriptionPlan != null) {
                birdPlusSubcriptionPlanTrialView = subscriptionPlan.getTrial();
            } else {
                birdPlusSubcriptionPlanTrialView = null;
            }
            if (birdPlusSubcriptionPlanTrialView != null) {
                BirdPlusUserSubscriptionView userSubscription3 = birdPlusView.getUserSubscription();
                if (userSubscription3 != null) {
                    birdPlusSubcriptionPlanTrialView2 = userSubscription3.getTrial();
                } else {
                    birdPlusSubcriptionPlanTrialView2 = null;
                }
                if (birdPlusSubcriptionPlanTrialView2 == null) {
                    return "start_trial";
                }
            }
        }
        if (birdPlusView.getNeedsDeviceTransfer()) {
            return "transfer";
        }
        if (!z2 || birdPlusView.getStatus() != BirdPlusSubscriptionViewStatus.AVAILABLE) {
            return null;
        }
        return "subscribe";
    }

    /* renamed from: S */
    public final String m58767S() {
        return (String) this.f63307k.getValue();
    }

    /* renamed from: T */
    public final AbstractC23461c m58766T(BirdPlusView birdPlusView) {
        AbstractC23461c mo90326m;
        if (m42277k().m12409c()) {
            mo90326m = this.f63301e.mo90341a0(birdPlusView.getUserSubscriptionId());
        } else {
            mo90326m = this.f63301e.mo90326m(birdPlusView.getSubscriptionPlanId(), m42277k().m12408d());
        }
        AbstractC23461c m33049i = mo90326m.m33029z(new InterfaceC23478a() { // from class: JP
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C14537a.m58765U(C14537a.this);
            }
        }).m33049i(AbstractC23461c.m33035t(new Callable() { // from class: RP
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23496h m58764V;
                m58764V = C14537a.m58764V(C14537a.this);
                return m58764V;
            }
        }));
        final C14578o c14578o = new C14578o();
        AbstractC23461c m33081E = m33049i.m33081E(new InterfaceC23484g() { // from class: SP
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C14537a.m58763W(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33081E, "private fun purchaseBird…  )\n        }\n      }\n  }");
        return m33081E;
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/BirdPlusView;", "Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.birdplus.v1.details.a$e */
    /* loaded from: classes3.dex */
    public static final class C14544e extends Lambda implements Function1<Pair<? extends BirdPlusView, ? extends Optional<String>>, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.feature.birdplus.v1.details.a$e$a */
        /* loaded from: classes3.dex */
        public static final class C14545a extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C14537a f63316g;

            /* renamed from: h */
            public final /* synthetic */ BirdPlusView f63317h;

            @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LtQ;", "prev", C17296a.f69688o, "(LtQ;)LtQ;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: co.bird.android.feature.birdplus.v1.details.a$e$a$a */
            /* loaded from: classes3.dex */
            public static final class C14546a extends Lambda implements Function1<C28698tQ, C28698tQ> {

                /* renamed from: g */
                public final /* synthetic */ Throwable f63318g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C14546a(Throwable th) {
                    super(1);
                    this.f63318g = th;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final C28698tQ invoke(C28698tQ prev) {
                    C28698tQ m12411a;
                    Intrinsics.checkNotNullParameter(prev, "prev");
                    m12411a = prev.m12411a((r22 & 1) != 0 ? prev.f110440a : null, (r22 & 2) != 0 ? prev.f110441b : false, (r22 & 4) != 0 ? prev.f110442c : false, (r22 & 8) != 0 ? prev.f110443d : false, (r22 & 16) != 0 ? prev.f110444e : false, (r22 & 32) != 0 ? prev.f110445f : false, (r22 & 64) != 0 ? prev.f110446g : false, (r22 & 128) != 0 ? prev.f110447h : false, (r22 & 256) != 0 ? prev.f110448i : false, (r22 & 512) != 0 ? prev.f110449j : this.f63318g);
                    return m12411a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14545a(C14537a c14537a, BirdPlusView birdPlusView) {
                super(1);
                this.f63316g = c14537a;
                this.f63317h = birdPlusView;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                InterfaceC1880Ea interfaceC1880Ea = this.f63316g.f63304h;
                String sessionId = this.f63316g.m58767S();
                Intrinsics.checkNotNullExpressionValue(sessionId, "sessionId");
                interfaceC1880Ea.mo55905y(new C22643hR(null, null, null, sessionId, this.f63317h.getCodename(), this.f63317h.getSubscriptionPlanId(), this.f63317h.getUserSubscriptionId(), null, null, 0L, 391, null));
                C41318g46.m40159e(th);
                this.f63316g.m42279i(new C14546a(th));
            }
        }

        public C14544e() {
            super(1);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<BirdPlusView, Optional<String>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            BirdPlusView component1 = pair.component1();
            AbstractC23461c m58766T = C14537a.this.m58766T(component1);
            final C14545a c14545a = new C14545a(C14537a.this, component1);
            return m58766T.m33084B(new InterfaceC23484g() { // from class: aQ
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C14537a.C14544e.invoke$lambda$0(Function1.this, obj);
                }
            }).m33069Q();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends BirdPlusView, ? extends Optional<String>> pair) {
            return invoke2((Pair<BirdPlusView, Optional<String>>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u001e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003 \u0004*\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00060\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/BirdPlusView;", "Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/B;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/B;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.birdplus.v1.details.a$k */
    /* loaded from: classes3.dex */
    public static final class C14570k extends Lambda implements Function1<Pair<? extends BirdPlusView, ? extends Optional<String>>, InterfaceC23434B<? extends String>> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC14581b f63353g;

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.birdplus.v1.details.a$k$a */
        /* loaded from: classes3.dex */
        public static final class C14571a extends Lambda implements Function1<Unit, String> {

            /* renamed from: g */
            public final /* synthetic */ BirdPlusView f63354g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14571a(BirdPlusView birdPlusView) {
                super(1);
                this.f63354g = birdPlusView;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final String invoke(Unit it) {
                String zendeskArticleId;
                Intrinsics.checkNotNullParameter(it, "it");
                BirdPlusSubscriptionPlanView subscriptionPlan = this.f63354g.getSubscriptionPlan();
                if (subscriptionPlan == null || (zendeskArticleId = subscriptionPlan.getZendeskArticleId()) == null) {
                    return this.f63354g.getZendeskArticleId();
                }
                return zendeskArticleId;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14570k(InterfaceC14581b interfaceC14581b) {
            super(1);
            this.f63353g = interfaceC14581b;
        }

        /* renamed from: b */
        public static final String m58706b(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (String) tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23434B<? extends String> invoke2(Pair<BirdPlusView, Optional<String>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Observable<Unit> subscribeOn = this.f63353g.mo58688g0().subscribeOn(C23454a.m33087a());
            final C14571a c14571a = new C14571a(pair.component1());
            return subscribeOn.map(new InterfaceC23492o() { // from class: pQ
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    String m58706b;
                    m58706b = C14537a.C14570k.m58706b(Function1.this, obj);
                    return m58706b;
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23434B<? extends String> invoke(Pair<? extends BirdPlusView, ? extends Optional<String>> pair) {
            return invoke2((Pair<BirdPlusView, Optional<String>>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/BirdPlusView;", "Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.birdplus.v1.details.a$i */
    /* loaded from: classes3.dex */
    public static final class C14556i extends Lambda implements Function1<Pair<? extends BirdPlusView, ? extends Optional<String>>, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC14581b f63331g;

        /* renamed from: h */
        public final /* synthetic */ C14537a f63332h;

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.feature.birdplus.v1.details.a$i$a */
        /* loaded from: classes3.dex */
        public static final class C14557a extends Lambda implements Function1<Unit, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C14537a f63333g;

            /* renamed from: h */
            public final /* synthetic */ BirdPlusView f63334h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14557a(C14537a c14537a, BirdPlusView birdPlusView) {
                super(1);
                this.f63333g = c14537a;
                this.f63334h = birdPlusView;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
                invoke2(unit);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Unit unit) {
                InterfaceC1880Ea interfaceC1880Ea = this.f63333g.f63304h;
                String sessionId = this.f63333g.m58767S();
                Intrinsics.checkNotNullExpressionValue(sessionId, "sessionId");
                interfaceC1880Ea.mo55905y(new C27286pP(null, null, null, sessionId, this.f63334h.getCodename(), this.f63334h.getSubscriptionPlanId(), this.f63334h.getUserSubscriptionId(), 7, null));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Lkotlin/Unit;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.birdplus.v1.details.a$i$b */
        /* loaded from: classes3.dex */
        public static final class C14558b extends Lambda implements Function1<Unit, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ BirdPlusView f63335g;

            /* renamed from: h */
            public final /* synthetic */ C14537a f63336h;

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: co.bird.android.feature.birdplus.v1.details.a$i$b$a */
            /* loaded from: classes3.dex */
            public static final class C14559a extends Lambda implements Function1<InterfaceC23465c, Unit> {

                /* renamed from: g */
                public final /* synthetic */ C14537a f63337g;

                @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LtQ;", "prev", C17296a.f69688o, "(LtQ;)LtQ;"}, m28431k = 3, m28430mv = {1, 8, 0})
                /* renamed from: co.bird.android.feature.birdplus.v1.details.a$i$b$a$a */
                /* loaded from: classes3.dex */
                public static final class C14560a extends Lambda implements Function1<C28698tQ, C28698tQ> {

                    /* renamed from: g */
                    public static final C14560a f63338g = new C14560a();

                    public C14560a() {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: a */
                    public final C28698tQ invoke(C28698tQ prev) {
                        C28698tQ m12411a;
                        Intrinsics.checkNotNullParameter(prev, "prev");
                        m12411a = prev.m12411a((r22 & 1) != 0 ? prev.f110440a : null, (r22 & 2) != 0 ? prev.f110441b : false, (r22 & 4) != 0 ? prev.f110442c : false, (r22 & 8) != 0 ? prev.f110443d : false, (r22 & 16) != 0 ? prev.f110444e : false, (r22 & 32) != 0 ? prev.f110445f : false, (r22 & 64) != 0 ? prev.f110446g : false, (r22 & 128) != 0 ? prev.f110447h : true, (r22 & 256) != 0 ? prev.f110448i : false, (r22 & 512) != 0 ? prev.f110449j : null);
                        return m12411a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C14559a(C14537a c14537a) {
                    super(1);
                    this.f63337g = c14537a;
                }

                /* renamed from: a */
                public final void m58722a(InterfaceC23465c interfaceC23465c) {
                    this.f63337g.m42279i(C14560a.f63338g);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                    m58722a(interfaceC23465c);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14558b(BirdPlusView birdPlusView, C14537a c14537a) {
                super(1);
                this.f63335g = birdPlusView;
                this.f63336h = c14537a;
            }

            /* renamed from: e */
            public static final void m58725e(C14537a this$0, BirdPlusView birdPlusView) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(birdPlusView, "$birdPlusView");
                InterfaceC1880Ea interfaceC1880Ea = this$0.f63304h;
                String sessionId = this$0.m58767S();
                Intrinsics.checkNotNullExpressionValue(sessionId, "sessionId");
                interfaceC1880Ea.mo55905y(new C26084mP(null, null, null, sessionId, birdPlusView.getCodename(), birdPlusView.getSubscriptionPlanId(), birdPlusView.getUserSubscriptionId(), 7, null));
            }

            /* renamed from: f */
            public static final InterfaceC23496h m58724f(C14537a this$0) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                return this$0.f63301e.refresh();
            }

            /* renamed from: g */
            public static final void m58723g(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: d */
            public final InterfaceC23496h invoke(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String userSubscriptionId = this.f63335g.getUserSubscriptionId();
                if (userSubscriptionId == null) {
                    return AbstractC23461c.m33039p();
                }
                AbstractC23461c mo90343Q = this.f63336h.f63301e.mo90343Q(userSubscriptionId);
                final C14537a c14537a = this.f63336h;
                final BirdPlusView birdPlusView = this.f63335g;
                AbstractC23461c m33029z = mo90343Q.m33029z(new InterfaceC23478a() { // from class: hQ
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        C14537a.C14556i.C14558b.m58725e(C14537a.this, birdPlusView);
                    }
                });
                final C14537a c14537a2 = this.f63336h;
                AbstractC23461c m33049i = m33029z.m33049i(AbstractC23461c.m33035t(new Callable() { // from class: iQ
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        InterfaceC23496h m58724f;
                        m58724f = C14537a.C14556i.C14558b.m58724f(C14537a.this);
                        return m58724f;
                    }
                }));
                final C14559a c14559a = new C14559a(this.f63336h);
                return m33049i.m33081E(new InterfaceC23484g() { // from class: jQ
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C14537a.C14556i.C14558b.m58723g(Function1.this, obj);
                    }
                });
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.feature.birdplus.v1.details.a$i$c */
        /* loaded from: classes3.dex */
        public static final class C14561c extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C14537a f63339g;

            /* renamed from: h */
            public final /* synthetic */ BirdPlusView f63340h;

            @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LtQ;", "prev", C17296a.f69688o, "(LtQ;)LtQ;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: co.bird.android.feature.birdplus.v1.details.a$i$c$a */
            /* loaded from: classes3.dex */
            public static final class C14562a extends Lambda implements Function1<C28698tQ, C28698tQ> {

                /* renamed from: g */
                public final /* synthetic */ Throwable f63341g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C14562a(Throwable th) {
                    super(1);
                    this.f63341g = th;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final C28698tQ invoke(C28698tQ prev) {
                    C28698tQ m12411a;
                    Intrinsics.checkNotNullParameter(prev, "prev");
                    m12411a = prev.m12411a((r22 & 1) != 0 ? prev.f110440a : null, (r22 & 2) != 0 ? prev.f110441b : false, (r22 & 4) != 0 ? prev.f110442c : false, (r22 & 8) != 0 ? prev.f110443d : false, (r22 & 16) != 0 ? prev.f110444e : false, (r22 & 32) != 0 ? prev.f110445f : false, (r22 & 64) != 0 ? prev.f110446g : false, (r22 & 128) != 0 ? prev.f110447h : false, (r22 & 256) != 0 ? prev.f110448i : false, (r22 & 512) != 0 ? prev.f110449j : this.f63341g);
                    return m12411a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14561c(C14537a c14537a, BirdPlusView birdPlusView) {
                super(1);
                this.f63339g = c14537a;
                this.f63340h = birdPlusView;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                InterfaceC1880Ea interfaceC1880Ea = this.f63339g.f63304h;
                String sessionId = this.f63339g.m58767S();
                Intrinsics.checkNotNullExpressionValue(sessionId, "sessionId");
                interfaceC1880Ea.mo55905y(new C26930oP(null, null, null, sessionId, this.f63340h.getCodename(), this.f63340h.getSubscriptionPlanId(), this.f63340h.getUserSubscriptionId(), null, null, 391, null));
                C41318g46.m40159e(th);
                this.f63339g.m42279i(new C14562a(th));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14556i(InterfaceC14581b interfaceC14581b, C14537a c14537a) {
            super(1);
            this.f63331g = interfaceC14581b;
            this.f63332h = c14537a;
        }

        /* renamed from: d */
        public static final void m58730d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final InterfaceC23496h invoke$lambda$1(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<BirdPlusView, Optional<String>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            BirdPlusView component1 = pair.component1();
            Observable<Unit> mo58690d = this.f63331g.mo58690d();
            final C14557a c14557a = new C14557a(this.f63332h, component1);
            Observable<Unit> subscribeOn = mo58690d.doOnNext(new InterfaceC23484g() { // from class: eQ
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C14537a.C14556i.invoke$lambda$0(Function1.this, obj);
                }
            }).subscribeOn(C23454a.m33087a());
            final C14558b c14558b = new C14558b(component1, this.f63332h);
            AbstractC23461c flatMapCompletable = subscribeOn.flatMapCompletable(new InterfaceC23492o() { // from class: fQ
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h invoke$lambda$1;
                    invoke$lambda$1 = C14537a.C14556i.invoke$lambda$1(Function1.this, obj);
                    return invoke$lambda$1;
                }
            });
            final C14561c c14561c = new C14561c(this.f63332h, component1);
            return flatMapCompletable.m33084B(new InterfaceC23484g() { // from class: gQ
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C14537a.C14556i.m58730d(Function1.this, obj);
                }
            }).m33066T();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends BirdPlusView, ? extends Optional<String>> pair) {
            return invoke2((Pair<BirdPlusView, Optional<String>>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/BirdPlusView;", "Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.birdplus.v1.details.a$j */
    /* loaded from: classes3.dex */
    public static final class C14563j extends Lambda implements Function1<Pair<? extends BirdPlusView, ? extends Optional<String>>, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC14581b f63342g;

        /* renamed from: h */
        public final /* synthetic */ C14537a f63343h;

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.feature.birdplus.v1.details.a$j$a */
        /* loaded from: classes3.dex */
        public static final class C14564a extends Lambda implements Function1<Unit, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C14537a f63344g;

            /* renamed from: h */
            public final /* synthetic */ BirdPlusView f63345h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14564a(C14537a c14537a, BirdPlusView birdPlusView) {
                super(1);
                this.f63344g = c14537a;
                this.f63345h = birdPlusView;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
                invoke2(unit);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Unit unit) {
                InterfaceC1880Ea interfaceC1880Ea = this.f63344g.f63304h;
                String sessionId = this.f63344g.m58767S();
                Intrinsics.checkNotNullExpressionValue(sessionId, "sessionId");
                interfaceC1880Ea.mo55905y(new C23254iR(null, null, null, sessionId, this.f63345h.getCodename(), this.f63345h.getSubscriptionPlanId(), this.f63345h.getUserSubscriptionId(), 0L, 7, null));
            }
        }

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(Lkotlin/Unit;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.birdplus.v1.details.a$j$b */
        /* loaded from: classes3.dex */
        public static final class C14565b extends Lambda implements Function1<Unit, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ C14537a f63346g;

            /* renamed from: h */
            public final /* synthetic */ BirdPlusView f63347h;

            @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: co.bird.android.feature.birdplus.v1.details.a$j$b$a */
            /* loaded from: classes3.dex */
            public static final class C14566a extends Lambda implements Function1<InterfaceC23465c, Unit> {

                /* renamed from: g */
                public final /* synthetic */ C14537a f63348g;

                @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LtQ;", "prev", C17296a.f69688o, "(LtQ;)LtQ;"}, m28431k = 3, m28430mv = {1, 8, 0})
                /* renamed from: co.bird.android.feature.birdplus.v1.details.a$j$b$a$a */
                /* loaded from: classes3.dex */
                public static final class C14567a extends Lambda implements Function1<C28698tQ, C28698tQ> {

                    /* renamed from: g */
                    public static final C14567a f63349g = new C14567a();

                    public C14567a() {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: a */
                    public final C28698tQ invoke(C28698tQ prev) {
                        C28698tQ m12411a;
                        Intrinsics.checkNotNullParameter(prev, "prev");
                        m12411a = prev.m12411a((r22 & 1) != 0 ? prev.f110440a : null, (r22 & 2) != 0 ? prev.f110441b : false, (r22 & 4) != 0 ? prev.f110442c : false, (r22 & 8) != 0 ? prev.f110443d : false, (r22 & 16) != 0 ? prev.f110444e : false, (r22 & 32) != 0 ? prev.f110445f : false, (r22 & 64) != 0 ? prev.f110446g : false, (r22 & 128) != 0 ? prev.f110447h : true, (r22 & 256) != 0 ? prev.f110448i : false, (r22 & 512) != 0 ? prev.f110449j : null);
                        return m12411a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C14566a(C14537a c14537a) {
                    super(1);
                    this.f63348g = c14537a;
                }

                /* renamed from: a */
                public final void m58710a(InterfaceC23465c interfaceC23465c) {
                    this.f63348g.m42279i(C14567a.f63349g);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                    m58710a(interfaceC23465c);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14565b(C14537a c14537a, BirdPlusView birdPlusView) {
                super(1);
                this.f63346g = c14537a;
                this.f63347h = birdPlusView;
            }

            /* renamed from: d */
            public static final void m58712d(C14537a this$0, BirdPlusView birdPlusView) {
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(birdPlusView, "$birdPlusView");
                InterfaceC1880Ea interfaceC1880Ea = this$0.f63304h;
                String sessionId = this$0.m58767S();
                Intrinsics.checkNotNullExpressionValue(sessionId, "sessionId");
                interfaceC1880Ea.mo55905y(new C20847gR(null, null, null, sessionId, birdPlusView.getCodename(), birdPlusView.getSubscriptionPlanId(), birdPlusView.getUserSubscriptionId(), 0L, 7, null));
            }

            /* renamed from: e */
            public static final void m58711e(Function1 tmp0, Object obj) {
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: c */
            public final InterfaceC23496h invoke(Unit it) {
                Intrinsics.checkNotNullParameter(it, "it");
                AbstractC23461c mo90344K = this.f63346g.f63301e.mo90344K(this.f63347h);
                final C14537a c14537a = this.f63346g;
                final BirdPlusView birdPlusView = this.f63347h;
                AbstractC23461c m33049i = mo90344K.m33029z(new InterfaceC23478a() { // from class: nQ
                    @Override // io.reactivex.functions.InterfaceC23478a
                    public final void run() {
                        C14537a.C14563j.C14565b.m58712d(C14537a.this, birdPlusView);
                    }
                }).m33049i(this.f63346g.f63301e.refresh());
                final C14566a c14566a = new C14566a(this.f63346g);
                return m33049i.m33081E(new InterfaceC23484g() { // from class: oQ
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C14537a.C14563j.C14565b.m58711e(Function1.this, obj);
                    }
                });
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.feature.birdplus.v1.details.a$j$c */
        /* loaded from: classes3.dex */
        public static final class C14568c extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C14537a f63350g;

            /* renamed from: h */
            public final /* synthetic */ BirdPlusView f63351h;

            @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LtQ;", "prev", C17296a.f69688o, "(LtQ;)LtQ;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: co.bird.android.feature.birdplus.v1.details.a$j$c$a */
            /* loaded from: classes3.dex */
            public static final class C14569a extends Lambda implements Function1<C28698tQ, C28698tQ> {

                /* renamed from: g */
                public final /* synthetic */ Throwable f63352g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C14569a(Throwable th) {
                    super(1);
                    this.f63352g = th;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final C28698tQ invoke(C28698tQ prev) {
                    C28698tQ m12411a;
                    Intrinsics.checkNotNullParameter(prev, "prev");
                    m12411a = prev.m12411a((r22 & 1) != 0 ? prev.f110440a : null, (r22 & 2) != 0 ? prev.f110441b : false, (r22 & 4) != 0 ? prev.f110442c : false, (r22 & 8) != 0 ? prev.f110443d : false, (r22 & 16) != 0 ? prev.f110444e : false, (r22 & 32) != 0 ? prev.f110445f : false, (r22 & 64) != 0 ? prev.f110446g : false, (r22 & 128) != 0 ? prev.f110447h : false, (r22 & 256) != 0 ? prev.f110448i : false, (r22 & 512) != 0 ? prev.f110449j : this.f63352g);
                    return m12411a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14568c(C14537a c14537a, BirdPlusView birdPlusView) {
                super(1);
                this.f63350g = c14537a;
                this.f63351h = birdPlusView;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                InterfaceC1880Ea interfaceC1880Ea = this.f63350g.f63304h;
                String sessionId = this.f63350g.m58767S();
                Intrinsics.checkNotNullExpressionValue(sessionId, "sessionId");
                interfaceC1880Ea.mo55905y(new C22643hR(null, null, null, sessionId, this.f63351h.getCodename(), this.f63351h.getSubscriptionPlanId(), this.f63351h.getUserSubscriptionId(), null, null, 0L, 391, null));
                C41318g46.m40159e(th);
                this.f63350g.m42279i(new C14569a(th));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14563j(InterfaceC14581b interfaceC14581b, C14537a c14537a) {
            super(1);
            this.f63342g = interfaceC14581b;
            this.f63343h = c14537a;
        }

        /* renamed from: d */
        public static final void m58716d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final InterfaceC23496h invoke$lambda$1(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<BirdPlusView, Optional<String>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            BirdPlusView component1 = pair.component1();
            Observable<Unit> mo58691c0 = this.f63342g.mo58691c0();
            final C14564a c14564a = new C14564a(this.f63343h, component1);
            Observable<Unit> subscribeOn = mo58691c0.doOnNext(new InterfaceC23484g() { // from class: kQ
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C14537a.C14563j.invoke$lambda$0(Function1.this, obj);
                }
            }).subscribeOn(C23454a.m33087a());
            final C14565b c14565b = new C14565b(this.f63343h, component1);
            AbstractC23461c flatMapCompletable = subscribeOn.flatMapCompletable(new InterfaceC23492o() { // from class: lQ
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h invoke$lambda$1;
                    invoke$lambda$1 = C14537a.C14563j.invoke$lambda$1(Function1.this, obj);
                    return invoke$lambda$1;
                }
            });
            final C14568c c14568c = new C14568c(this.f63343h, component1);
            return flatMapCompletable.m33084B(new InterfaceC23484g() { // from class: mQ
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C14537a.C14563j.m58716d(Function1.this, obj);
                }
            }).m33066T();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends BirdPlusView, ? extends Optional<String>> pair) {
            return invoke2((Pair<BirdPlusView, Optional<String>>) pair);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Pair;", "Lco/bird/android/model/persistence/BirdPlusView;", "Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Pair;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.birdplus.v1.details.a$h */
    /* loaded from: classes3.dex */
    public static final class C14551h extends Lambda implements Function1<Pair<? extends BirdPlusView, ? extends Optional<String>>, InterfaceC23496h> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC14581b f63324g;

        /* renamed from: h */
        public final /* synthetic */ C14537a f63325h;

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00012z\u0010\u0006\u001av\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005 \u0002*:\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, m28432d2 = {"Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/BirdPayment;", "", "it", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.birdplus.v1.details.a$h$a */
        /* loaded from: classes3.dex */
        public static final class C14552a extends Lambda implements Function1<Triple<? extends Unit, ? extends Optional<BirdPayment>, ? extends Boolean>, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C14537a f63326g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14552a(C14537a c14537a) {
                super(1);
                this.f63326g = c14537a;
            }

            /* renamed from: a */
            public final void m58735a(Triple<Unit, Optional<BirdPayment>, Boolean> triple) {
                String str;
                String str2;
                String str3;
                boolean z;
                InterfaceC1880Ea interfaceC1880Ea = this.f63326g.f63304h;
                String sessionId = this.f63326g.m58767S();
                Intrinsics.checkNotNullExpressionValue(sessionId, "sessionId");
                BirdPlusView m12410b = this.f63326g.m42277k().m12410b();
                if (m12410b != null) {
                    str = m12410b.getCodename();
                } else {
                    str = null;
                }
                BirdPlusView m12410b2 = this.f63326g.m42277k().m12410b();
                if (m12410b2 != null) {
                    str2 = m12410b2.getSubscriptionPlanId();
                } else {
                    str2 = null;
                }
                BirdPlusView m12410b3 = this.f63326g.m42277k().m12410b();
                if (m12410b3 != null) {
                    str3 = m12410b3.getUserSubscriptionId();
                } else {
                    str3 = null;
                }
                if (!this.f63326g.m42277k().m12409c() && this.f63326g.m42277k().m12408d()) {
                    z = true;
                } else {
                    z = false;
                }
                interfaceC1880Ea.mo55905y(new C8649VQ(null, null, null, sessionId, str, str2, str3, z, this.f63326g.m42277k().m12409c(), 7, null));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends Unit, ? extends Optional<BirdPayment>, ? extends Boolean> triple) {
                m58735a(triple);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: co.bird.android.feature.birdplus.v1.details.a$h$c */
        /* loaded from: classes3.dex */
        public static final class C14554c extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C14537a f63329g;

            @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LtQ;", "prev", C17296a.f69688o, "(LtQ;)LtQ;"}, m28431k = 3, m28430mv = {1, 8, 0})
            /* renamed from: co.bird.android.feature.birdplus.v1.details.a$h$c$a */
            /* loaded from: classes3.dex */
            public static final class C14555a extends Lambda implements Function1<C28698tQ, C28698tQ> {

                /* renamed from: g */
                public final /* synthetic */ Throwable f63330g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C14555a(Throwable th) {
                    super(1);
                    this.f63330g = th;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final C28698tQ invoke(C28698tQ prev) {
                    C28698tQ m12411a;
                    Intrinsics.checkNotNullParameter(prev, "prev");
                    m12411a = prev.m12411a((r22 & 1) != 0 ? prev.f110440a : null, (r22 & 2) != 0 ? prev.f110441b : true, (r22 & 4) != 0 ? prev.f110442c : false, (r22 & 8) != 0 ? prev.f110443d : false, (r22 & 16) != 0 ? prev.f110444e : false, (r22 & 32) != 0 ? prev.f110445f : false, (r22 & 64) != 0 ? prev.f110446g : false, (r22 & 128) != 0 ? prev.f110447h : false, (r22 & 256) != 0 ? prev.f110448i : false, (r22 & 512) != 0 ? prev.f110449j : this.f63330g);
                    return m12411a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14554c(C14537a c14537a) {
                super(1);
                this.f63329g = c14537a;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                InterfaceC1880Ea interfaceC1880Ea = this.f63329g.f63304h;
                String sessionId = this.f63329g.m58767S();
                Intrinsics.checkNotNullExpressionValue(sessionId, "sessionId");
                BirdPlusView m12410b = this.f63329g.m42277k().m12410b();
                String codename = m12410b != null ? m12410b.getCodename() : null;
                BirdPlusView m12410b2 = this.f63329g.m42277k().m12410b();
                String subscriptionPlanId = m12410b2 != null ? m12410b2.getSubscriptionPlanId() : null;
                BirdPlusView m12410b3 = this.f63329g.m42277k().m12410b();
                interfaceC1880Ea.mo55905y(new C8279UQ(null, null, null, sessionId, codename, subscriptionPlanId, m12410b3 != null ? m12410b3.getUserSubscriptionId() : null, null, null, 391, null));
                C41318g46.m40159e(th);
                this.f63329g.m42279i(new C14555a(th));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14551h(InterfaceC14581b interfaceC14581b, C14537a c14537a) {
            super(1);
            this.f63324g = interfaceC14581b;
            this.f63325h = c14537a;
        }

        /* renamed from: d */
        public static final void m58736d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final InterfaceC23496h invoke$lambda$1(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final InterfaceC23496h invoke2(Pair<BirdPlusView, Optional<String>> pair) {
            Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
            Observable<Unit> subscribeOn = this.f63324g.mo58689e0().subscribeOn(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(subscribeOn, "renderer.subscribeClicks…dSchedulers.mainThread())");
            Z84<Optional<BirdPayment>> mo85677e = this.f63325h.f63302f.mo85677e();
            Observable<Boolean> m33123k0 = this.f63325h.f63303g.mo16237g().m33123k0();
            Intrinsics.checkNotNullExpressionValue(m33123k0, "googlePayManager.googlePayReady().toObservable()");
            Observable m31949b = C24527f.m31949b(subscribeOn, mo85677e, m33123k0);
            final C14552a c14552a = new C14552a(this.f63325h);
            Observable doOnNext = m31949b.doOnNext(new InterfaceC23484g() { // from class: bQ
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C14537a.C14551h.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C14553b c14553b = new C14553b(this.f63325h, pair.component1());
            AbstractC23461c flatMapCompletable = doOnNext.flatMapCompletable(new InterfaceC23492o() { // from class: cQ
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC23496h invoke$lambda$1;
                    invoke$lambda$1 = C14537a.C14551h.invoke$lambda$1(Function1.this, obj);
                    return invoke$lambda$1;
                }
            });
            final C14554c c14554c = new C14554c(this.f63325h);
            return flatMapCompletable.m33084B(new InterfaceC23484g() { // from class: dQ
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C14537a.C14551h.m58736d(Function1.this, obj);
                }
            }).m33066T();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Pair<? extends BirdPlusView, ? extends Optional<String>> pair) {
            return invoke2((Pair<BirdPlusView, Optional<String>>) pair);
        }

        @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\n \u0002*\u0004\u0018\u00010\u00070\u00072<\u0010\u0006\u001a8\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u00050\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/BirdPayment;", "", "<name for destructuring parameter 0>", "Lio/reactivex/h;", "invoke", "(Lkotlin/Triple;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.birdplus.v1.details.a$h$b */
        /* loaded from: classes3.dex */
        public static final class C14553b extends Lambda implements Function1<Triple<? extends Unit, ? extends Optional<BirdPayment>, ? extends Boolean>, InterfaceC23496h> {

            /* renamed from: g */
            public final /* synthetic */ C14537a f63327g;

            /* renamed from: h */
            public final /* synthetic */ BirdPlusView f63328h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C14553b(C14537a c14537a, BirdPlusView birdPlusView) {
                super(1);
                this.f63327g = c14537a;
                this.f63328h = birdPlusView;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final InterfaceC23496h invoke2(Triple<Unit, Optional<BirdPayment>, Boolean> triple) {
                Integer priceAmountTax;
                Integer priceAmount;
                String currency;
                String currency2;
                Integer priceAmountTax2;
                Integer priceAmount2;
                Intrinsics.checkNotNullParameter(triple, "<name for destructuring parameter 0>");
                Optional<BirdPayment> component2 = triple.component2();
                Boolean googlePayReady = triple.component3();
                String str = "";
                int i = 0;
                if (!component2.m59037c()) {
                    InterfaceC40099e13 interfaceC40099e13 = this.f63327g.f63305i;
                    PurchasePaymentReason purchasePaymentReason = PurchasePaymentReason.BIRD_PLUS;
                    BirdPlusSubscriptionPlanView subscriptionPlan = this.f63328h.getSubscriptionPlan();
                    int intValue = (subscriptionPlan == null || (priceAmount2 = subscriptionPlan.getPriceAmount()) == null) ? 0 : priceAmount2.intValue();
                    BirdPlusSubscriptionPlanView subscriptionPlan2 = this.f63328h.getSubscriptionPlan();
                    if (subscriptionPlan2 != null && (priceAmountTax2 = subscriptionPlan2.getPriceAmountTax()) != null) {
                        i = priceAmountTax2.intValue();
                    }
                    long j = intValue + i;
                    BirdPlusSubscriptionPlanView subscriptionPlan3 = this.f63328h.getSubscriptionPlan();
                    interfaceC40099e13.mo37201A2(purchasePaymentReason, 10046, j, (subscriptionPlan3 == null || (currency2 = subscriptionPlan3.getCurrency()) == null) ? "" : currency2, PaymentAddSource.BIRD_PLUS_PURCHASE);
                    return AbstractC23461c.m33039p();
                }
                if (component2.m59038b().isGooglePay()) {
                    Intrinsics.checkNotNullExpressionValue(googlePayReady, "googlePayReady");
                    if (googlePayReady.booleanValue()) {
                        InterfaceC42586iD1 interfaceC42586iD1 = this.f63327g.f63303g;
                        BirdPlusSubscriptionPlanView subscriptionPlan4 = this.f63328h.getSubscriptionPlan();
                        if (subscriptionPlan4 != null && (currency = subscriptionPlan4.getCurrency()) != null) {
                            str = currency;
                        }
                        Currency m25591o = C45097mS5.m25591o(str);
                        BirdPlusSubscriptionPlanView subscriptionPlan5 = this.f63328h.getSubscriptionPlan();
                        Long valueOf = Long.valueOf((subscriptionPlan5 == null || (priceAmount = subscriptionPlan5.getPriceAmount()) == null) ? 0 : priceAmount.intValue());
                        BirdPlusSubscriptionPlanView subscriptionPlan6 = this.f63328h.getSubscriptionPlan();
                        if (subscriptionPlan6 != null && (priceAmountTax = subscriptionPlan6.getPriceAmountTax()) != null) {
                            i = priceAmountTax.intValue();
                        }
                        interfaceC42586iD1.mo16239e(m25591o, valueOf, Long.valueOf(i), true);
                        return AbstractC23461c.m33039p();
                    }
                }
                return this.f63327g.m58766T(this.f63328h);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ InterfaceC23496h invoke(Triple<? extends Unit, ? extends Optional<BirdPayment>, ? extends Boolean> triple) {
                return invoke2((Triple<Unit, Optional<BirdPayment>, Boolean>) triple);
            }
        }
    }
}
