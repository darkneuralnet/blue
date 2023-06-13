package p000;

import android.app.Activity;
import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.BirdPayment;
import co.bird.android.model.PaymentAddSource;
import co.bird.android.model.User;
import co.bird.android.model.persistence.RidePassView;
import co.bird.android.navigator.PurchasePaymentActivityResult;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23447K;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.rxkotlin.C24527f;
import java.util.Collection;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C49282tW4;
@Metadata(m28433d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BS\b\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\b\u0010$\u001a\u0004\u0018\u00010!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)¢\u0006\u0004\b7\u00108J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u0004\u0018\u00010!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R(\u00106\u001a\u00020-8\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0004\b.\u0010/\u0012\u0004\b4\u00105\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00069"}, m28432d2 = {"LtW4;", "Lf1;", "LxW4;", "LyW4;", "Lio/reactivex/c;", "N", "renderer", "", "S", "LWU4;", "e", "LWU4;", "ridePassManager", "LAM3;", "f", "LAM3;", "paymentManagerV2", "LiD1;", "g", "LiD1;", "googlePayManager", "LEa;", "h", "LEa;", "analyticsManager", "LRh6;", "i", "LRh6;", "userStream", "LRV4;", "j", "LRV4;", "converter", "", "k", "Ljava/lang/String;", "linkCode", "Le13;", "l", "Le13;", "navigator", "", "m", "I", "titleResId", "Lco/bird/android/model/persistence/RidePassView;", "n", "Lco/bird/android/model/persistence/RidePassView;", "p0", "()Lco/bird/android/model/persistence/RidePassView;", "q0", "(Lco/bird/android/model/persistence/RidePassView;)V", "getRidePass$ride_pass_release$annotations", "()V", "ridePass", "<init>", "(LWU4;LAM3;LiD1;LEa;LRh6;LRV4;Ljava/lang/String;Le13;I)V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRidePassV2Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV2Presenter.kt\nco/bird/android/feature/ridepass/v2/list/RidePassV2Presenter\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,244:1\n180#2:245\n237#2:246\n180#2:247\n180#2:248\n180#2:249\n180#2:250\n237#2:251\n237#2:252\n180#2:253\n180#2:254\n*S KotlinDebug\n*F\n+ 1 RidePassV2Presenter.kt\nco/bird/android/feature/ridepass/v2/list/RidePassV2Presenter\n*L\n76#1:245\n87#1:246\n99#1:247\n130#1:248\n142#1:249\n153#1:250\n193#1:251\n207#1:252\n212#1:253\n219#1:254\n*E\n"})
/* renamed from: tW4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49282tW4 extends AbstractC20169f1<InterfaceC51653xW4, AbstractC52246yW4> {

    /* renamed from: e */
    public final WU4 f110578e;

    /* renamed from: f */
    public final AM3 f110579f;

    /* renamed from: g */
    public final InterfaceC42586iD1 f110580g;

    /* renamed from: h */
    public final InterfaceC1880Ea f110581h;

    /* renamed from: i */
    public final InterfaceC35660Rh6 f110582i;

    /* renamed from: j */
    public final RV4 f110583j;

    /* renamed from: k */
    public final String f110584k;

    /* renamed from: l */
    public final InterfaceC40099e13 f110585l;

    /* renamed from: m */
    public final int f110586m;

    /* renamed from: n */
    public RidePassView f110587n;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tW4$a */
    /* loaded from: classes3.dex */
    public static final class C28734a extends Lambda implements Function1<InterfaceC23465c, Unit> {
        public C28734a() {
            super(1);
        }

        /* renamed from: a */
        public final void m12182a(InterfaceC23465c interfaceC23465c) {
            C49282tW4.this.m42280h(new C33892Jt2(true));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
            m12182a(interfaceC23465c);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tW4$b */
    /* loaded from: classes3.dex */
    public static final class C28735b extends Lambda implements Function1<Throwable, Unit> {
        public C28735b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C49282tW4.this.m42280h(new C33892Jt2(false));
            String message = th.getMessage();
            if (message == null) {
                message = "something went wrong";
            }
            C49282tW4.this.f110581h.mo55905y(new DV4(null, null, null, C49282tW4.this.m12194p0().getLinkCode(), -1, message, 7, null));
            C49282tW4.this.m42280h(new C42669iM3(null, 1, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/RidePassView;", "kotlin.jvm.PlatformType", "purchasedRidePass", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/RidePassView;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tW4$c */
    /* loaded from: classes3.dex */
    public static final class C28736c extends Lambda implements Function1<RidePassView, Unit> {
        public C28736c() {
            super(1);
        }

        /* renamed from: a */
        public final void m12181a(RidePassView ridePassView) {
            List<RidePassView> listOf;
            C49282tW4.this.m42280h(new C33892Jt2(false));
            C49282tW4.this.f110581h.mo55905y(new EV4(null, null, null, C49282tW4.this.m12194p0().getLinkCode(), 7, null));
            C49282tW4 c49282tW4 = C49282tW4.this;
            RidePassView m12194p0 = c49282tW4.m12194p0();
            RV4 rv4 = C49282tW4.this.f110583j;
            listOf = CollectionsKt__CollectionsJVMKt.listOf(ridePassView);
            c49282tW4.m42280h(new KE1(m12194p0, rv4.m86682d(listOf)));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RidePassView ridePassView) {
            m12181a(ridePassView);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072z\u0010\u0006\u001av\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005 \u0002*:\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/persistence/RidePassView;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/BirdPayment;", "", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tW4$d */
    /* loaded from: classes3.dex */
    public static final class C28737d extends Lambda implements Function1<Triple<? extends RidePassView, ? extends Optional<BirdPayment>, ? extends Boolean>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC51653xW4 f110592h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28737d(InterfaceC51653xW4 interfaceC51653xW4) {
            super(1);
            this.f110592h = interfaceC51653xW4;
        }

        /* renamed from: a */
        public final void m12180a(Triple<RidePassView, Optional<BirdPayment>, Boolean> triple) {
            long j;
            Optional<BirdPayment> component2 = triple.component2();
            Boolean googlePayReady = triple.component3();
            if (component2.m59037c() && !component2.m59038b().isGooglePay()) {
                C49282tW4.this.m42280h(C38395bA5.f57022a);
                return;
            }
            if (component2.m59037c() && component2.m59038b().isGooglePay()) {
                Intrinsics.checkNotNullExpressionValue(googlePayReady, "googlePayReady");
                if (googlePayReady.booleanValue()) {
                    InterfaceC42586iD1 interfaceC42586iD1 = C49282tW4.this.f110580g;
                    User mo76584a = C49282tW4.this.f110582i.mo76584a();
                    Intrinsics.checkNotNull(mo76584a);
                    InterfaceC51653xW4 interfaceC51653xW4 = this.f110592h;
                    Intrinsics.checkNotNull(interfaceC51653xW4, "null cannot be cast to non-null type android.app.Activity");
                    Activity activity = (Activity) interfaceC51653xW4;
                    Currency m25591o = C45097mS5.m25591o(C49282tW4.this.m12194p0().getCurrency());
                    long price = C49282tW4.this.m12194p0().getPrice();
                    Long priceTax = C49282tW4.this.m12194p0().getPriceTax();
                    if (priceTax != null) {
                        j = priceTax.longValue();
                    } else {
                        j = 0;
                    }
                    interfaceC42586iD1.mo16236h(mo76584a, activity, 10030, m25591o, Long.valueOf(price + j));
                    return;
                }
            }
            C49282tW4.this.f110585l.mo37140K3(C49282tW4.this.f110586m, 10046, C49282tW4.this.m12194p0().getPrice(), C49282tW4.this.m12194p0().getCurrency(), PaymentAddSource.RIDE_PASS_PURCHASE);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends RidePassView, ? extends Optional<BirdPayment>, ? extends Boolean> triple) {
            m12180a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072z\u0010\u0006\u001av\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005 \u0002*:\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, m28432d2 = {"Lkotlin/Triple;", "Lco/bird/android/model/persistence/RidePassView;", "kotlin.jvm.PlatformType", "Lco/bird/android/buava/Optional;", "Lco/bird/android/model/BirdPayment;", "", "it", "", C17296a.f69688o, "(Lkotlin/Triple;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tW4$e */
    /* loaded from: classes3.dex */
    public static final class C28738e extends Lambda implements Function1<Triple<? extends RidePassView, ? extends Optional<BirdPayment>, ? extends Boolean>, Unit> {

        /* renamed from: g */
        public static final C28738e f110593g = new C28738e();

        public C28738e() {
            super(1);
        }

        /* renamed from: a */
        public final void m12179a(Triple<RidePassView, Optional<BirdPayment>, Boolean> triple) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Triple<? extends RidePassView, ? extends Optional<BirdPayment>, ? extends Boolean> triple) {
            m12179a(triple);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tW4$f */
    /* loaded from: classes3.dex */
    public static final class C28739f extends Lambda implements Function1<Throwable, Unit> {
        public C28739f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C49282tW4.this.m42280h(new C42669iM3(null, 1, null));
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tW4$g */
    /* loaded from: classes3.dex */
    public static final class C28740g extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C28740g f110595g = new C28740g();

        public C28740g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error while handling transfer pass click", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/RidePassView;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/RidePassView;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tW4$h */
    /* loaded from: classes3.dex */
    public static final class C28741h extends Lambda implements Function1<RidePassView, Unit> {
        public C28741h() {
            super(1);
        }

        /* renamed from: a */
        public final void m12178a(RidePassView it) {
            C49282tW4 c49282tW4 = C49282tW4.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c49282tW4.m42280h(new C38988cA5(it));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RidePassView ridePassView) {
            m12178a(ridePassView);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tW4$i */
    /* loaded from: classes3.dex */
    public static final class C28742i extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C28742i f110597g = new C28742i();

        public C28742i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40158f(th, "Error while handling cancel pass click", new Object[0]);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/RidePassView;", "kotlin.jvm.PlatformType", "pass", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/RidePassView;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tW4$j */
    /* loaded from: classes3.dex */
    public static final class C28743j extends Lambda implements Function1<RidePassView, Unit> {
        public C28743j() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
            r1 = kotlin.text.StringsKt__StringNumberConversionsKt.toLongOrNull(r1);
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m12177a(RidePassView ridePassView) {
            long j;
            Long longOrNull;
            InterfaceC40099e13 interfaceC40099e13 = C49282tW4.this.f110585l;
            String cancelArticleId = ridePassView.getCancelArticleId();
            if (cancelArticleId != null && longOrNull != null) {
                j = longOrNull.longValue();
            } else {
                j = 0;
            }
            String userRidePassId = ridePassView.getUserRidePassId();
            Intrinsics.checkNotNull(userRidePassId);
            interfaceC40099e13.mo37037d2(j, userRidePassId);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RidePassView ridePassView) {
            m12177a(ridePassView);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/RidePassView;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/RidePassView;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tW4$k */
    /* loaded from: classes3.dex */
    public static final class C28744k extends Lambda implements Function1<RidePassView, Unit> {
        public C28744k() {
            super(1);
        }

        /* renamed from: a */
        public final void m12176a(RidePassView ridePassView) {
            long j;
            InterfaceC1880Ea interfaceC1880Ea = C49282tW4.this.f110581h;
            String userRidePassId = ridePassView.getUserRidePassId();
            if (userRidePassId == null) {
                userRidePassId = "";
            }
            String str = userRidePassId;
            String linkCode = ridePassView.getLinkCode();
            Integer remainingDeviceTransferCount = ridePassView.getRemainingDeviceTransferCount();
            if (remainingDeviceTransferCount != null) {
                j = remainingDeviceTransferCount.intValue();
            } else {
                j = 0;
            }
            interfaceC1880Ea.mo55905y(new IV4(null, null, null, str, linkCode, j, 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RidePassView ridePassView) {
            m12176a(ridePassView);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/RidePassView;", "pass", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "(Lco/bird/android/model/persistence/RidePassView;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tW4$l */
    /* loaded from: classes3.dex */
    public static final class C28745l extends Lambda implements Function1<RidePassView, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lio/reactivex/disposables/c;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lio/reactivex/disposables/c;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: tW4$l$a */
        /* loaded from: classes3.dex */
        public static final class C28746a extends Lambda implements Function1<InterfaceC23465c, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C49282tW4 f110601g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28746a(C49282tW4 c49282tW4) {
                super(1);
                this.f110601g = c49282tW4;
            }

            /* renamed from: a */
            public final void m12169a(InterfaceC23465c interfaceC23465c) {
                this.f110601g.m42280h(new C33892Jt2(true));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23465c interfaceC23465c) {
                m12169a(interfaceC23465c);
                return Unit.INSTANCE;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: tW4$l$b */
        /* loaded from: classes3.dex */
        public static final class C28747b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C49282tW4 f110602g;

            /* renamed from: h */
            public final /* synthetic */ RidePassView f110603h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C28747b(C49282tW4 c49282tW4, RidePassView ridePassView) {
                super(1);
                this.f110602g = c49282tW4;
                this.f110603h = ridePassView;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable it) {
                InterfaceC1880Ea interfaceC1880Ea = this.f110602g.f110581h;
                String userRidePassId = this.f110603h.getUserRidePassId();
                if (userRidePassId == null) {
                    userRidePassId = "";
                }
                String str = userRidePassId;
                String linkCode = this.f110603h.getLinkCode();
                Integer remainingDeviceTransferCount = this.f110603h.getRemainingDeviceTransferCount();
                interfaceC1880Ea.mo55905y(new HV4(null, null, null, str, linkCode, remainingDeviceTransferCount != null ? remainingDeviceTransferCount.intValue() : 0L, 7, null));
                this.f110602g.m42280h(new C33892Jt2(false));
                C49282tW4 c49282tW4 = this.f110602g;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                RidePassView pass = this.f110603h;
                Intrinsics.checkNotNullExpressionValue(pass, "pass");
                c49282tW4.m42280h(new C40172e86(it, pass));
            }
        }

        public C28745l() {
            super(1);
        }

        /* renamed from: e */
        public static final void m12171e(C49282tW4 this$0, RidePassView pass) {
            long j;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(pass, "$pass");
            InterfaceC1880Ea interfaceC1880Ea = this$0.f110581h;
            String userRidePassId = pass.getUserRidePassId();
            if (userRidePassId == null) {
                userRidePassId = "";
            }
            String str = userRidePassId;
            String linkCode = pass.getLinkCode();
            Integer remainingDeviceTransferCount = pass.getRemainingDeviceTransferCount();
            if (remainingDeviceTransferCount != null) {
                j = remainingDeviceTransferCount.intValue();
            } else {
                j = 0;
            }
            interfaceC1880Ea.mo55905y(new FV4(null, null, null, str, linkCode, j, 7, null));
            this$0.m42280h(new C33892Jt2(false));
            this$0.m42280h(new C43740k96(pass));
        }

        /* renamed from: f */
        public static final void m12170f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d */
        public final InterfaceC23496h invoke(final RidePassView pass) {
            Intrinsics.checkNotNullParameter(pass, "pass");
            AbstractC23461c mo55497d = C49282tW4.this.f110578e.mo55497d(pass);
            final C28746a c28746a = new C28746a(C49282tW4.this);
            AbstractC23461c m33081E = mo55497d.m33081E(new InterfaceC23484g() { // from class: uW4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C49282tW4.C28745l.invoke$lambda$0(Function1.this, obj);
                }
            });
            final C49282tW4 c49282tW4 = C49282tW4.this;
            AbstractC23461c m33029z = m33081E.m33029z(new InterfaceC23478a() { // from class: vW4
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C49282tW4.C28745l.m12171e(C49282tW4.this, pass);
                }
            });
            final C28747b c28747b = new C28747b(C49282tW4.this, pass);
            return m33029z.m33084B(new InterfaceC23484g() { // from class: wW4
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C49282tW4.C28745l.m12170f(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "resultOk", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tW4$m */
    /* loaded from: classes3.dex */
    public static final class C28748m extends Lambda implements Function1<Boolean, Unit> {
        public C28748m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke2(bool);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Boolean bool) {
            if (bool.booleanValue()) {
                return;
            }
            C49282tW4.this.m42280h(new C42669iM3(null, 1, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "it", "", "Lco/bird/android/model/persistence/RidePassView;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tW4$n */
    /* loaded from: classes3.dex */
    public static final class C28749n extends Lambda implements Function1<List<? extends RidePassView>, Boolean> {

        /* renamed from: g */
        public static final C28749n f110605g = new C28749n();

        public C28749n() {
            super(1);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Boolean invoke2(List<RidePassView> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(!it.isEmpty());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(List<? extends RidePassView> list) {
            return invoke2((List<RidePassView>) list);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"<anonymous>", "", "it", "invoke", "(Ljava/lang/Boolean;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tW4$o */
    /* loaded from: classes3.dex */
    public static final class C28750o extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: g */
        public static final C28750o f110606g = new C28750o();

        public C28750o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)Lio/reactivex/h;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tW4$p */
    /* loaded from: classes3.dex */
    public static final class C28751p extends Lambda implements Function1<Boolean, InterfaceC23496h> {
        public C28751p() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InterfaceC23496h invoke(Boolean it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C49282tW4.this.m12227N();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tW4$q */
    /* loaded from: classes3.dex */
    public static final class C28752q extends Lambda implements Function1<String, Unit> {
        public C28752q() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C49282tW4.this.m42280h(C48842sm1.f109229a);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tW4$r */
    /* loaded from: classes3.dex */
    public static final class C28753r extends Lambda implements Function1<Unit, Unit> {
        public C28753r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C49282tW4.this.f110585l.mo36922w3(Long.parseLong(C49282tW4.this.m12194p0().getZendeskArticleId()));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m28432d2 = {"<anonymous>", "", "ridePassViewList", "", "Lco/bird/android/model/persistence/RidePassView;", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRidePassV2Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV2Presenter.kt\nco/bird/android/feature/ridepass/v2/list/RidePassV2Presenter$consume$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,244:1\n1747#2,3:245\n1855#2,2:248\n1774#2,4:250\n1774#2,4:254\n*S KotlinDebug\n*F\n+ 1 RidePassV2Presenter.kt\nco/bird/android/feature/ridepass/v2/list/RidePassV2Presenter$consume$2\n*L\n61#1:245,3\n62#1:248,2\n66#1:250,4\n67#1:254,4\n*E\n"})
    /* renamed from: tW4$s */
    /* loaded from: classes3.dex */
    public static final class C28754s extends Lambda implements Function1<List<? extends RidePassView>, Unit> {
        public C28754s() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends RidePassView> list) {
            invoke2((List<RidePassView>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<RidePassView> ridePassViewList) {
            boolean z;
            int i;
            int i2;
            C49282tW4.this.m12192q0(ridePassViewList.get(0));
            C49282tW4 c49282tW4 = C49282tW4.this;
            Intrinsics.checkNotNullExpressionValue(ridePassViewList, "ridePassViewList");
            List<RidePassView> list = ridePassViewList;
            boolean z2 = list instanceof Collection;
            if (!z2 || !list.isEmpty()) {
                for (RidePassView ridePassView : list) {
                    if (ridePassView.isActive()) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            c49282tW4.m42280h(new C46121oA5(z));
            C49282tW4 c49282tW42 = C49282tW4.this;
            for (RidePassView ridePassView2 : list) {
                c49282tW42.f110581h.mo55905y(new BV4(null, null, null, ridePassView2.getLinkCode(), null, null, null, 119, null));
            }
            InterfaceC1880Ea interfaceC1880Ea = C49282tW4.this.f110581h;
            if (z2 && list.isEmpty()) {
                i = 0;
            } else {
                i = 0;
                for (RidePassView ridePassView3 : list) {
                    if (ridePassView3.isActive() && (i = i + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
            }
            long j = i;
            if (z2 && list.isEmpty()) {
                i2 = 0;
            } else {
                i2 = 0;
                for (RidePassView ridePassView4 : list) {
                    if (ridePassView4.isIneligible() && (i2 = i2 + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
            }
            interfaceC1880Ea.mo55905y(new C40379eV4(null, null, null, j, i2, 7, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/persistence/RidePassView;", "ridePassViewList", "Lio/reactivex/K;", "LH6;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRidePassV2Presenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV2Presenter.kt\nco/bird/android/feature/ridepass/v2/list/RidePassV2Presenter$consume$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,244:1\n288#2,2:245\n*S KotlinDebug\n*F\n+ 1 RidePassV2Presenter.kt\nco/bird/android/feature/ridepass/v2/list/RidePassV2Presenter$consume$3\n*L\n72#1:245,2\n*E\n"})
    /* renamed from: tW4$t */
    /* loaded from: classes3.dex */
    public static final class C28755t extends Lambda implements Function1<List<? extends RidePassView>, InterfaceC23447K<? extends List<? extends C3023H6>>> {
        public C28755t() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<C3023H6>> invoke(List<RidePassView> ridePassViewList) {
            Object obj;
            Intrinsics.checkNotNullParameter(ridePassViewList, "ridePassViewList");
            RV4 rv4 = C49282tW4.this.f110583j;
            Iterator<T> it = ridePassViewList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((RidePassView) obj).isPurchased()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return rv4.m86684b(new BH1((RidePassView) obj), ridePassViewList);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "LH6;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tW4$u */
    /* loaded from: classes3.dex */
    public static final class C28756u extends Lambda implements Function1<List<? extends C3023H6>, Unit> {
        public C28756u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends C3023H6> list) {
            invoke2((List<C3023H6>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<C3023H6> it) {
            C49282tW4 c49282tW4 = C49282tW4.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c49282tW4.m42280h(new C34381Lv5(it, C49282tW4.this.f110584k));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tW4$v */
    /* loaded from: classes3.dex */
    public static final class C28757v extends Lambda implements Function1<Unit, InterfaceC23496h> {
        public C28757v() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C49282tW4.this.m12227N();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: tW4$w */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C28758w extends FunctionReferenceImpl implements Function1<Throwable, Unit> {

        /* renamed from: b */
        public static final C28758w f110614b = new C28758w();

        public C28758w() {
            super(1, C41318g46.class, "e", "e(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(th);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LJa4;", "kotlin.jvm.PlatformType", "<name for destructuring parameter 0>", "", C17296a.f69688o, "(LJa4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tW4$x */
    /* loaded from: classes3.dex */
    public static final class C28759x extends Lambda implements Function1<C33723Ja4, Unit> {
        public C28759x() {
            super(1);
        }

        /* renamed from: a */
        public final void m12166a(C33723Ja4 c33723Ja4) {
            String str;
            boolean m100182a = c33723Ja4.m100182a();
            Intent m100181b = c33723Ja4.m100181b();
            if (m100182a) {
                C49282tW4.this.m42280h(C38395bA5.f57022a);
                return;
            }
            C49282tW4 c49282tW4 = C49282tW4.this;
            PurchasePaymentActivityResult purchasePaymentActivityResult = (PurchasePaymentActivityResult) X52.m77423b(m100181b);
            if (purchasePaymentActivityResult != null) {
                str = purchasePaymentActivityResult.m55385b();
            } else {
                str = null;
            }
            c49282tW4.m42280h(new C42669iM3(str));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C33723Ja4 c33723Ja4) {
            m12166a(c33723Ja4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/persistence/RidePassView;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/persistence/RidePassView;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tW4$y */
    /* loaded from: classes3.dex */
    public static final class C28760y extends Lambda implements Function1<RidePassView, Unit> {
        public C28760y() {
            super(1);
        }

        /* renamed from: a */
        public final void m12165a(RidePassView it) {
            C49282tW4 c49282tW4 = C49282tW4.this;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            c49282tW4.m12192q0(it);
            C49282tW4.this.f110581h.mo55905y(new AV4(null, null, null, it.getLinkCode(), 7, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(RidePassView ridePassView) {
            m12165a(ridePassView);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49282tW4(WU4 ridePassManager, AM3 paymentManagerV2, InterfaceC42586iD1 googlePayManager, InterfaceC1880Ea analyticsManager, InterfaceC35660Rh6 userStream, RV4 converter, String str, InterfaceC40099e13 navigator, int i) {
        super(BO5.f2256a);
        Intrinsics.checkNotNullParameter(ridePassManager, "ridePassManager");
        Intrinsics.checkNotNullParameter(paymentManagerV2, "paymentManagerV2");
        Intrinsics.checkNotNullParameter(googlePayManager, "googlePayManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        Intrinsics.checkNotNullParameter(converter, "converter");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f110578e = ridePassManager;
        this.f110579f = paymentManagerV2;
        this.f110580g = googlePayManager;
        this.f110581h = analyticsManager;
        this.f110582i = userStream;
        this.f110583j = converter;
        this.f110584k = str;
        this.f110585l = navigator;
        this.f110586m = i;
    }

    /* renamed from: O */
    public static final InterfaceC23447K m12226O(C49282tW4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.f110578e.mo55501G0(this$0.m12194p0().getLinkCode());
    }

    /* renamed from: P */
    public static final void m12225P(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Q */
    public static final void m12224Q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: R */
    public static final void m12223R(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: T */
    public static final boolean m12221T(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: U */
    public static final void m12220U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: V */
    public static final void m12219V(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: W */
    public static final void m12218W(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: X */
    public static final void m12217X(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Y */
    public static final void m12216Y(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final void m12215Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: a0 */
    public static final void m12214a0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final InterfaceC23496h m12213b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: c0 */
    public static final void m12212c0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final boolean m12211d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: e0 */
    public static final InterfaceC23447K m12210e0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: f0 */
    public static final InterfaceC23496h m12209f0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m12208g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g0 */
    public static final void m12207g0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static /* synthetic */ void getRidePass$ride_pass_release$annotations() {
    }

    /* renamed from: h0 */
    public static final void m12206h0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: i0 */
    public static final void m12205i0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j0 */
    public static final InterfaceC23496h m12204j0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: k0 */
    public static final void m12203k0() {
    }

    /* renamed from: l0 */
    public static final void m12202l0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m0 */
    public static final void m12200m0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n0 */
    public static final void m12198n0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: o0 */
    public static final void m12196o0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: N */
    public final AbstractC23461c m12227N() {
        AbstractC23442F m33042m = this.f110578e.mo55485y0(m12194p0().getLinkCode()).m33042m(AbstractC23442F.m33124k(new Callable() { // from class: SV4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23447K m12226O;
                m12226O = C49282tW4.m12226O(C49282tW4.this);
                return m12226O;
            }
        }));
        final C28734a c28734a = new C28734a();
        AbstractC23442F m33152N = m33042m.m33102v(new InterfaceC23484g() { // from class: dW4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49282tW4.m12225P(Function1.this, obj);
            }
        }).m33152N(C23454a.m33087a());
        final C28735b c28735b = new C28735b();
        AbstractC23442F m33106t = m33152N.m33106t(new InterfaceC23484g() { // from class: lW4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49282tW4.m12224Q(Function1.this, obj);
            }
        });
        final C28736c c28736c = new C28736c();
        AbstractC23461c m33159G = m33106t.m33101w(new InterfaceC23484g() { // from class: mW4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49282tW4.m12223R(Function1.this, obj);
            }
        }).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "private fun buyRidePass(…     .ignoreElement()\n  }");
        return m33159G;
    }

    @Override // p000.AbstractC20169f1
    /* renamed from: S */
    public void consume(InterfaceC51653xW4 renderer) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        super.consume(renderer);
        Z84<List<RidePassView>> mo55503E0 = this.f110578e.mo55503E0();
        final C28749n c28749n = C28749n.f110605g;
        Observable<List<RidePassView>> filter = mo55503E0.filter(new InterfaceC23494q() { // from class: nW4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m12221T;
                m12221T = C49282tW4.m12221T(Function1.this, obj);
                return m12221T;
            }
        });
        final C28754s c28754s = new C28754s();
        Observable<List<RidePassView>> doOnNext = filter.doOnNext(new InterfaceC23484g() { // from class: YV4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49282tW4.m12208g(Function1.this, obj);
            }
        });
        final C28755t c28755t = new C28755t();
        Observable observeOn = doOnNext.flatMapSingle(new InterfaceC23492o() { // from class: cW4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m12210e0;
                m12210e0 = C49282tW4.m12210e0(Function1.this, obj);
                return m12210e0;
            }
        }).observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "override fun consume(ren…eId.toLong())\n      }\n  }");
        Object m33094as = observeOn.m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28756u c28756u = new C28756u();
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: eW4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49282tW4.m12205i0(Function1.this, obj);
            }
        });
        Observable<Unit> mo5080s3 = renderer.mo5080s3();
        final C28757v c28757v = new C28757v();
        AbstractC23461c m33066T = mo5080s3.flatMapCompletable(new InterfaceC23492o() { // from class: fW4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m12204j0;
                m12204j0 = C49282tW4.m12204j0(Function1.this, obj);
                return m12204j0;
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T, "override fun consume(ren…eId.toLong())\n      }\n  }");
        Object m33041n = m33066T.m33041n(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        InterfaceC23478a interfaceC23478a = new InterfaceC23478a() { // from class: gW4
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C49282tW4.m12203k0();
            }
        };
        final C28758w c28758w = C28758w.f110614b;
        ((CompletableSubscribeProxy) m33041n).mo45217e(interfaceC23478a, new InterfaceC23484g() { // from class: hW4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49282tW4.m12202l0(Function1.this, obj);
            }
        });
        Observable<C33723Ja4> mo5085W1 = renderer.mo5085W1();
        final C28759x c28759x = new C28759x();
        Observable<C33723Ja4> doOnNext2 = mo5085W1.doOnNext(new InterfaceC23484g() { // from class: iW4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49282tW4.m12200m0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext2, "override fun consume(ren…eId.toLong())\n      }\n  }");
        Object m33094as2 = doOnNext2.m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        ((ObservableSubscribeProxy) m33094as2).subscribe();
        Observable<RidePassView> mo5081r7 = renderer.mo5081r7();
        final C28760y c28760y = new C28760y();
        Observable<RidePassView> doOnNext3 = mo5081r7.doOnNext(new InterfaceC23484g() { // from class: jW4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49282tW4.m12198n0(Function1.this, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnNext3, "override fun consume(ren…eId.toLong())\n      }\n  }");
        Z84<Optional<BirdPayment>> mo85677e = this.f110579f.mo85677e();
        Observable<Boolean> m33123k0 = this.f110580g.mo16237g().m33123k0();
        Intrinsics.checkNotNullExpressionValue(m33123k0, "googlePayManager.googlePayReady().toObservable()");
        Observable m31949b = C24527f.m31949b(doOnNext3, mo85677e, m33123k0);
        final C28737d c28737d = new C28737d(renderer);
        Observable retry = m31949b.doOnNext(new InterfaceC23484g() { // from class: kW4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49282tW4.m12196o0(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "override fun consume(ren…eId.toLong())\n      }\n  }");
        Object m33094as3 = retry.m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as3, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28738e c28738e = C28738e.f110593g;
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: oW4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49282tW4.m12220U(Function1.this, obj);
            }
        };
        final C28739f c28739f = new C28739f();
        ((ObservableSubscribeProxy) m33094as3).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: pW4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49282tW4.m12219V(Function1.this, obj);
            }
        });
        Observable<RidePassView> mo5083h3 = renderer.mo5083h3();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Observable<RidePassView> observeOn2 = mo5083h3.throttleFirst(500L, timeUnit).observeOn(C23454a.m33087a());
        final C28740g c28740g = C28740g.f110595g;
        Observable<RidePassView> retry2 = observeOn2.doOnError(new InterfaceC23484g() { // from class: qW4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49282tW4.m12218W(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry2, "renderer.transferPassCli… click\") }\n      .retry()");
        Object m33094as4 = retry2.m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as4, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28741h c28741h = new C28741h();
        ((ObservableSubscribeProxy) m33094as4).subscribe(new InterfaceC23484g() { // from class: rW4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49282tW4.m12217X(Function1.this, obj);
            }
        });
        Observable<RidePassView> observeOn3 = renderer.mo5084W8().throttleFirst(500L, timeUnit).observeOn(C23454a.m33087a());
        final C28742i c28742i = C28742i.f110597g;
        Observable<RidePassView> retry3 = observeOn3.doOnError(new InterfaceC23484g() { // from class: sW4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49282tW4.m12216Y(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry3, "renderer.cancelPassClick… click\") }\n      .retry()");
        Object m33094as5 = retry3.m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as5, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28743j c28743j = new C28743j();
        ((ObservableSubscribeProxy) m33094as5).subscribe(new InterfaceC23484g() { // from class: TV4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49282tW4.m12215Z(Function1.this, obj);
            }
        });
        Observable<RidePassView> mo5082o8 = renderer.mo5082o8();
        final C28744k c28744k = new C28744k();
        Observable<RidePassView> doOnNext4 = mo5082o8.doOnNext(new InterfaceC23484g() { // from class: UV4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49282tW4.m12214a0(Function1.this, obj);
            }
        });
        final C28745l c28745l = new C28745l();
        AbstractC23461c m33066T2 = doOnNext4.flatMapCompletable(new InterfaceC23492o() { // from class: VV4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m12213b0;
                m12213b0 = C49282tW4.m12213b0(Function1.this, obj);
                return m12213b0;
            }
        }).m33066T();
        Intrinsics.checkNotNullExpressionValue(m33066T2, "override fun consume(ren…eId.toLong())\n      }\n  }");
        Object m33041n2 = m33066T2.m33041n(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33041n2, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n2).subscribe();
        Observable<Boolean> mo5087P0 = renderer.mo5087P0();
        final C28748m c28748m = new C28748m();
        Observable<Boolean> doOnNext5 = mo5087P0.doOnNext(new InterfaceC23484g() { // from class: WV4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49282tW4.m12212c0(Function1.this, obj);
            }
        });
        final C28750o c28750o = C28750o.f110606g;
        Observable<Boolean> filter2 = doOnNext5.filter(new InterfaceC23494q() { // from class: XV4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m12211d0;
                m12211d0 = C49282tW4.m12211d0(Function1.this, obj);
                return m12211d0;
            }
        });
        final C28751p c28751p = new C28751p();
        AbstractC23461c flatMapCompletable = filter2.flatMapCompletable(new InterfaceC23492o() { // from class: ZV4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m12209f0;
                m12209f0 = C49282tW4.m12209f0(Function1.this, obj);
                return m12209f0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapCompletable, "override fun consume(ren…eId.toLong())\n      }\n  }");
        Object m33041n3 = flatMapCompletable.m33041n(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33041n3, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n3).subscribe();
        Object m33094as6 = renderer.mo5086T7().m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as6, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28752q c28752q = new C28752q();
        ((ObservableSubscribeProxy) m33094as6).subscribe(new InterfaceC23484g() { // from class: aW4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49282tW4.m12207g0(Function1.this, obj);
            }
        });
        Object m33094as7 = renderer.mo5079u7().m33094as(AutoDispose.m45239a(renderer));
        Intrinsics.checkExpressionValueIsNotNull(m33094as7, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C28753r c28753r = new C28753r();
        ((ObservableSubscribeProxy) m33094as7).subscribe(new InterfaceC23484g() { // from class: bW4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C49282tW4.m12206h0(Function1.this, obj);
            }
        });
    }

    /* renamed from: p0 */
    public final RidePassView m12194p0() {
        RidePassView ridePassView = this.f110587n;
        if (ridePassView != null) {
            return ridePassView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ridePass");
        return null;
    }

    /* renamed from: q0 */
    public final void m12192q0(RidePassView ridePassView) {
        Intrinsics.checkNotNullParameter(ridePassView, "<set-?>");
        this.f110587n = ridePassView;
    }
}
