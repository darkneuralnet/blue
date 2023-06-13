package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.BirdPayment;
import co.bird.android.model.BirdPaymentKt;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.analytics.PaymentMethodAdded;
import co.bird.android.model.constant.PaymentMethodDetails;
import co.bird.android.model.constant.PaymentProvider;
import co.bird.api.error.RetrofitException;
import co.bird.api.response.SavedPaymentMethodResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Card;
import com.stripe.android.model.PaymentMethod;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import com.uber.autodispose.ObservableSubscribeProxy;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23476f;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C37791a94;
import p000.C39112cO3;
import p000.H31;
import p000.S74;
@Metadata(m28433d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\u0006\u0010 \u001a\u00020\u001b\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201¢\u0006\u0004\b>\u0010?J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0014\u0010\f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0016R\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R,\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000206058\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u0010<\u001a\u0004\b9\u0010:¨\u0006@"}, m28432d2 = {"LcO3;", "LQN3;", "Lco/bird/android/model/BirdPayment;", "paypal", "Lio/reactivex/c;", "B", "card", "y", "paymentToRemove", "D", "z", "removedPayment", "E", "", "o", C17296a.f69688o, "Lcom/uber/autodispose/ScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "getScopeProvider", "()Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LlO3;", "b", "LlO3;", "r", "()LlO3;", "ui", "Le13;", "c", "Le13;", "m", "()Le13;", "navigator", "LAM3;", DateTokenConverter.CONVERTER_KEY, "LAM3;", "paymentManagerV2", "LVM3;", "e", "LVM3;", "paymentManagerV3", "LzN3;", "f", "LzN3;", "paymentMethodManager", "LYR4;", "g", "LYR4;", "rideManager", "LEa;", "h", "LEa;", "analyticsManager", "La94;", "", "i", "La94;", "n", "()La94;", "getPaymentMethods$app_birdRelease$annotations", "()V", "paymentMethods", "<init>", "(Lcom/uber/autodispose/ScopeProvider;LlO3;Le13;LAM3;LVM3;LzN3;LYR4;LEa;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPaymentMethodPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodPresenter.kt\nco/bird/android/app/feature/prepay/PaymentMethodPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,207:1\n180#2:208\n180#2:209\n237#2:210\n180#2:211\n180#2:212\n819#3:213\n847#3,2:214\n*S KotlinDebug\n*F\n+ 1 PaymentMethodPresenter.kt\nco/bird/android/app/feature/prepay/PaymentMethodPresenterImpl\n*L\n99#1:208\n110#1:209\n142#1:210\n196#1:211\n201#1:212\n186#1:213\n186#1:214,2\n*E\n"})
/* renamed from: cO3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C39112cO3 implements QN3 {

    /* renamed from: a */
    public final ScopeProvider f60491a;

    /* renamed from: b */
    public final InterfaceC44466lO3 f60492b;

    /* renamed from: c */
    public final InterfaceC40099e13 f60493c;

    /* renamed from: d */
    public final AM3 f60494d;

    /* renamed from: e */
    public final VM3 f60495e;

    /* renamed from: f */
    public final InterfaceC52757zN3 f60496f;

    /* renamed from: g */
    public final YR4 f60497g;

    /* renamed from: h */
    public final InterfaceC1880Ea f60498h;

    /* renamed from: i */
    public final C37791a94<List<BirdPayment>> f60499i;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cO3$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C13520a extends FunctionReferenceImpl implements Function1<List<? extends BirdPayment>, Unit> {
        public C13520a(Object obj) {
            super(1, obj, C37791a94.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends BirdPayment> list) {
            invoke2((List<BirdPayment>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<BirdPayment> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C37791a94) this.receiver).accept(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "Lco/bird/android/model/BirdPayment;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cO3$b */
    /* loaded from: classes2.dex */
    public static final class C13521b extends Lambda implements Function1<Optional<BirdPayment>, Unit> {
        public C13521b() {
            super(1);
        }

        /* renamed from: a */
        public final void m61477a(Optional<BirdPayment> optional) {
            C39112cO3.this.m61486r().mo23900ke(optional.m59035e());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Optional<BirdPayment> optional) {
            m61477a(optional);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/BirdPayment;", "birdPayment", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", "e", "(Lco/bird/android/model/BirdPayment;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cO3$c */
    /* loaded from: classes2.dex */
    public static final class C13522c extends Lambda implements Function1<BirdPayment, InterfaceC24574u<? extends Unit>> {

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: cO3$c$a */
        /* loaded from: classes2.dex */
        public static final class C13523a extends Lambda implements Function1<Unit, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C39112cO3 f60502g;

            /* renamed from: h */
            public final /* synthetic */ BirdPayment f60503h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13523a(C39112cO3 c39112cO3, BirdPayment birdPayment) {
                super(1);
                this.f60502g = c39112cO3;
                this.f60503h = birdPayment;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
                invoke2(unit);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Unit unit) {
                InterfaceC40099e13 m61491m = this.f60502g.m61491m();
                String paypalEmail = this.f60503h.getPaypalEmail();
                Intrinsics.checkNotNull(paypalEmail);
                m61491m.mo36976n3(paypalEmail, this.f60503h.getId());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: cO3$c$b */
        /* loaded from: classes2.dex */
        public static final class C13524b extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends Unit>> {

            /* renamed from: g */
            public static final C13524b f60504g = new C13524b();

            public C13524b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC24574u<? extends Unit> invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AbstractC24507p.m32024u();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: cO3$c$c */
        /* loaded from: classes2.dex */
        public static final class C13525c extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends Unit>> {

            /* renamed from: g */
            public static final C13525c f60505g = new C13525c();

            public C13525c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC24574u<? extends Unit> invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AbstractC24507p.m32024u();
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/api/response/SavedPaymentMethodResponse;", "it", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/SavedPaymentMethodResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: cO3$c$d */
        /* loaded from: classes2.dex */
        public static final class C13526d extends Lambda implements Function1<SavedPaymentMethodResponse, InterfaceC24574u<? extends Unit>> {

            /* renamed from: g */
            public static final C13526d f60506g = new C13526d();

            public C13526d() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC24574u<? extends Unit> invoke(SavedPaymentMethodResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AbstractC24507p.m32068G(Unit.INSTANCE);
            }
        }

        public C13522c() {
            super(1);
        }

        /* renamed from: f */
        public static final InterfaceC24574u m61471f(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        /* renamed from: g */
        public static final InterfaceC24574u m61470g(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        public static final void invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public static final InterfaceC24574u invoke$lambda$1(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: e */
        public final InterfaceC24574u<? extends Unit> invoke(BirdPayment birdPayment) {
            String str;
            AbstractC23461c mo85667i;
            Intrinsics.checkNotNullParameter(birdPayment, "birdPayment");
            InterfaceC1880Ea interfaceC1880Ea = C39112cO3.this.f60498h;
            Card stripeCard = birdPayment.getStripeCard();
            if (stripeCard != null) {
                str = ES5.m108971d(stripeCard);
            } else {
                str = null;
            }
            interfaceC1880Ea.mo55956N(new PaymentMethodAdded(str));
            if (birdPayment.isPaypal()) {
                AbstractC24507p m32068G = AbstractC24507p.m32068G(Unit.INSTANCE);
                final C13523a c13523a = new C13523a(C39112cO3.this, birdPayment);
                return m32068G.m32026s(new InterfaceC23484g() { // from class: dO3
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C39112cO3.C13522c.invoke$lambda$0(Function1.this, obj);
                    }
                });
            } else if (!birdPayment.isStripeCard() && !birdPayment.isStripePaymentMethod()) {
                if (birdPayment.isAdyen()) {
                    if (C39112cO3.this.f60497g.mo75061N()) {
                        AbstractC23442F dialog$default = H31.C3014a.dialog$default(C39112cO3.this.m61486r(), KL3.f19452d, false, false, 6, null);
                        final C13525c c13525c = C13525c.f60505g;
                        return dialog$default.m33163C(new InterfaceC23492o() { // from class: fO3
                            @Override // io.reactivex.functions.InterfaceC23492o
                            public final Object apply(Object obj) {
                                InterfaceC24574u m61471f;
                                m61471f = C39112cO3.C13522c.m61471f(Function1.this, obj);
                                return m61471f;
                            }
                        });
                    }
                    AbstractC23442F progress$default = C28237sD.progress$default(C39112cO3.this.f60495e.mo25725o(birdPayment.getId()), C39112cO3.this.m61486r(), 0, 2, (Object) null);
                    final C13526d c13526d = C13526d.f60506g;
                    return progress$default.m33163C(new InterfaceC23492o() { // from class: gO3
                        @Override // io.reactivex.functions.InterfaceC23492o
                        public final Object apply(Object obj) {
                            InterfaceC24574u m61470g;
                            m61470g = C39112cO3.C13522c.m61470g(Function1.this, obj);
                            return m61470g;
                        }
                    });
                }
                return AbstractC24507p.m32023v(new IllegalArgumentException("Selected bird payment not recognized: " + birdPayment.getId()));
            } else if (C39112cO3.this.f60497g.mo75061N()) {
                AbstractC23442F dialog$default2 = H31.C3014a.dialog$default(C39112cO3.this.m61486r(), KL3.f19452d, false, false, 6, null);
                final C13524b c13524b = C13524b.f60504g;
                return dialog$default2.m33163C(new InterfaceC23492o() { // from class: eO3
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC24574u invoke$lambda$1;
                        invoke$lambda$1 = C39112cO3.C13522c.invoke$lambda$1(Function1.this, obj);
                        return invoke$lambda$1;
                    }
                });
            } else {
                Integer paymentMethodVersion = birdPayment.getPaymentMethodVersion();
                if (paymentMethodVersion != null && paymentMethodVersion.intValue() == 3) {
                    mo85667i = C39112cO3.this.f60495e.mo25725o(birdPayment.getId()).m33159G();
                } else {
                    AM3 am3 = C39112cO3.this.f60494d;
                    PaymentMethod stripePaymentMethod = birdPayment.getStripePaymentMethod();
                    Intrinsics.checkNotNull(stripePaymentMethod);
                    String str2 = stripePaymentMethod.f75358id;
                    Intrinsics.checkNotNull(str2);
                    mo85667i = am3.mo85667i(str2);
                }
                Intrinsics.checkNotNullExpressionValue(mo85667i, "when (birdPayment.paymen…d!!.id!!)\n              }");
                return C28237sD.progress$default(mo85667i, C39112cO3.this.m61486r(), 0, 2, (Object) null).m33045k(AbstractC24507p.m32068G(Unit.INSTANCE));
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "e", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cO3$d */
    /* loaded from: classes2.dex */
    public static final class C13527d extends Lambda implements Function1<Throwable, Unit> {
        public C13527d() {
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
            C39112cO3.this.m61486r().errorGeneric();
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cO3$e */
    /* loaded from: classes2.dex */
    public static final class C13528e extends Lambda implements Function1<Unit, Unit> {
        public C13528e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            invoke2(unit);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Unit unit) {
            C39112cO3.this.m61491m().close();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cO3$f */
    /* loaded from: classes2.dex */
    public static final class C13529f extends Lambda implements Function1<Throwable, Unit> {
        public C13529f() {
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
            C39112cO3.this.m61486r().error(C45871nl4.error_generic_body);
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: cO3$g */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C13530g extends FunctionReferenceImpl implements Function1<List<? extends BirdPayment>, Unit> {
        public C13530g(Object obj) {
            super(1, obj, InterfaceC44466lO3.class, "setPaymentMethods", "setPaymentMethods(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends BirdPayment> list) {
            invoke2((List<BirdPayment>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(List<BirdPayment> p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InterfaceC44466lO3) this.receiver).mo23902U8(p0);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/BirdPayment;", "paymentToRemove", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "c", "(Lco/bird/android/model/BirdPayment;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: cO3$h */
    /* loaded from: classes2.dex */
    public static final class C13531h extends Lambda implements Function1<BirdPayment, InterfaceC23496h> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: cO3$h$a */
        /* loaded from: classes2.dex */
        public static final class C13532a extends Lambda implements Function1<DialogResponse, InterfaceC23496h> {

            /* renamed from: g */
            public static final C13532a f60511g = new C13532a();

            public C13532a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC23496h invoke(DialogResponse it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return AbstractC23461c.m33080F(new IllegalStateException());
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: cO3$h$b */
        /* loaded from: classes2.dex */
        public static final class C13533b extends Lambda implements Function1<Throwable, Unit> {

            /* renamed from: g */
            public final /* synthetic */ C39112cO3 f60512g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13533b(C39112cO3 c39112cO3) {
                super(1);
                this.f60512g = c39112cO3;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable it) {
                C49375tg1 c49375tg1;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                Throwable m87362c = R36.m87362c(it);
                RetrofitException retrofitException = m87362c instanceof RetrofitException ? (RetrofitException) m87362c : null;
                boolean z = false;
                if (retrofitException != null && (c49375tg1 = (C49375tg1) retrofitException.m53929a(C49375tg1.class)) != null && c49375tg1.m11933b() == 400) {
                    z = true;
                }
                boolean z2 = it instanceof IllegalStateException;
                if (z) {
                    H31.C3014a.showDialog$default(this.f60512g.m61486r(), C50403vP3.f114012d, false, false, null, null, null, null, 126, null);
                } else if (!z2) {
                    this.f60512g.m61486r().error(it);
                }
                this.f60512g.m61490n().accept(this.f60512g.m61490n().getValue());
            }
        }

        public C13531h() {
            super(1);
        }

        /* renamed from: d */
        public static final InterfaceC23496h m61463d(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC23496h) tmp0.invoke(obj);
        }

        /* renamed from: e */
        public static final void m61462e(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: c */
        public final InterfaceC23496h invoke(BirdPayment paymentToRemove) {
            AbstractC23461c m61479y;
            Intrinsics.checkNotNullParameter(paymentToRemove, "paymentToRemove");
            if (C39112cO3.this.f60497g.mo75061N()) {
                AbstractC23442F dialog$default = H31.C3014a.dialog$default(C39112cO3.this.m61486r(), C49811uP3.f112312d, false, false, 6, null);
                final C13532a c13532a = C13532a.f60511g;
                m61479y = dialog$default.m33164B(new InterfaceC23492o() { // from class: hO3
                    @Override // io.reactivex.functions.InterfaceC23492o
                    public final Object apply(Object obj) {
                        InterfaceC23496h m61463d;
                        m61463d = C39112cO3.C13531h.m61463d(Function1.this, obj);
                        return m61463d;
                    }
                });
            } else if (paymentToRemove.isPaypal()) {
                m61479y = C39112cO3.this.m61508B(paymentToRemove);
            } else {
                m61479y = C39112cO3.this.m61479y(paymentToRemove);
            }
            AbstractC23461c m33070P = m61479y.m33070P(C23454a.m33087a());
            Intrinsics.checkNotNullExpressionValue(m33070P, "when {\n          rideMan…dSchedulers.mainThread())");
            AbstractC23461c progress$default = C28237sD.progress$default(m33070P, C39112cO3.this.m61486r(), 0, 2, (Object) null);
            final C13533b c13533b = new C13533b(C39112cO3.this);
            return progress$default.m33084B(new InterfaceC23484g() { // from class: iO3
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C39112cO3.C13531h.m61462e(Function1.this, obj);
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/SavedPaymentMethodResponse;", "kotlin.jvm.PlatformType", "updatedPaymentMethods", "", C17296a.f69688o, "(Lco/bird/api/response/SavedPaymentMethodResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPaymentMethodPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodPresenter.kt\nco/bird/android/app/feature/prepay/PaymentMethodPresenterImpl$removePaymentV3$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,207:1\n1549#2:208\n1620#2,3:209\n*S KotlinDebug\n*F\n+ 1 PaymentMethodPresenter.kt\nco/bird/android/app/feature/prepay/PaymentMethodPresenterImpl$removePaymentV3$1\n*L\n177#1:208\n177#1:209,3\n*E\n"})
    /* renamed from: cO3$i */
    /* loaded from: classes2.dex */
    public static final class C13534i extends Lambda implements Function1<SavedPaymentMethodResponse, Unit> {
        public C13534i() {
            super(1);
        }

        /* renamed from: a */
        public final void m61460a(SavedPaymentMethodResponse savedPaymentMethodResponse) {
            int collectionSizeOrDefault;
            S74.C7343a.stopProgress$default(C39112cO3.this.m61486r(), 0, 1, null);
            C37791a94<List<BirdPayment>> m61490n = C39112cO3.this.m61490n();
            List<PaymentMethodDetails> paymentMethods = savedPaymentMethodResponse.getPaymentMethods();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(paymentMethods, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (PaymentMethodDetails paymentMethodDetails : paymentMethods) {
                arrayList.add(BirdPaymentKt.toBirdPayment(paymentMethodDetails));
            }
            m61490n.accept(arrayList);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SavedPaymentMethodResponse savedPaymentMethodResponse) {
            m61460a(savedPaymentMethodResponse);
            return Unit.INSTANCE;
        }
    }

    public C39112cO3(ScopeProvider scopeProvider, InterfaceC44466lO3 ui, InterfaceC40099e13 navigator, AM3 paymentManagerV2, VM3 paymentManagerV3, InterfaceC52757zN3 paymentMethodManager, YR4 rideManager, InterfaceC1880Ea analyticsManager) {
        List emptyList;
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(paymentManagerV2, "paymentManagerV2");
        Intrinsics.checkNotNullParameter(paymentManagerV3, "paymentManagerV3");
        Intrinsics.checkNotNullParameter(paymentMethodManager, "paymentMethodManager");
        Intrinsics.checkNotNullParameter(rideManager, "rideManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        this.f60491a = scopeProvider;
        this.f60492b = ui;
        this.f60493c = navigator;
        this.f60494d = paymentManagerV2;
        this.f60495e = paymentManagerV3;
        this.f60496f = paymentMethodManager;
        this.f60497g = rideManager;
        this.f60498h = analyticsManager;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f60499i = C37791a94.C10586a.create$default(c10586a, emptyList, null, 2, null);
    }

    /* renamed from: A */
    public static final void m61509A(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: C */
    public static final void m61507C(C39112cO3 this$0, InterfaceC23476f it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.f60498h.mo55905y(new TP3(null, null, null, 7, null));
    }

    /* renamed from: F */
    public static final void m61504F(C39112cO3 this$0, BirdPayment removedPayment) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(removedPayment, "$removedPayment");
        S74.C7343a.stopProgress$default(this$0.f60492b, 0, 1, null);
        C37791a94<List<BirdPayment>> c37791a94 = this$0.f60499i;
        ArrayList arrayList = new ArrayList();
        for (Object obj : c37791a94.getValue()) {
            if (!Intrinsics.areEqual(((BirdPayment) obj).getId(), removedPayment.getId())) {
                arrayList.add(obj);
            }
        }
        c37791a94.accept(arrayList);
    }

    public static /* synthetic */ void getPaymentMethods$app_birdRelease$annotations() {
    }

    /* renamed from: p */
    public static final void m61488p(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: q */
    public static final void m61487q(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: s */
    public static final InterfaceC24574u m61485s(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: t */
    public static final void m61484t(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: u */
    public static final void m61483u(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: v */
    public static final void m61482v(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: w */
    public static final void m61481w(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: x */
    public static final InterfaceC23496h m61480x(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: B */
    public final AbstractC23461c m61508B(BirdPayment birdPayment) {
        AbstractC23461c m33049i;
        Integer paymentMethodVersion = birdPayment.getPaymentMethodVersion();
        if (paymentMethodVersion != null && paymentMethodVersion.intValue() == 3) {
            m33049i = m61478z(birdPayment);
        } else {
            m33049i = m61505E(this.f60494d.mo85675f(PaymentProvider.BRAINTREE), birdPayment).m33049i(this.f60494d.mo85670h());
        }
        AbstractC23461c m33049i2 = m33049i.m33049i(new InterfaceC23496h() { // from class: YN3
            @Override // io.reactivex.InterfaceC23496h
            /* renamed from: g */
            public final void mo33003g(InterfaceC23476f interfaceC23476f) {
                C39112cO3.m61507C(C39112cO3.this, interfaceC23476f);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33049i2, "when (paypal.paymentMeth…(PaypalSignout())\n      }");
        return m33049i2;
    }

    /* renamed from: D */
    public final AbstractC23461c m61506D(BirdPayment birdPayment) {
        return m61505E(this.f60494d.mo85673g(birdPayment), birdPayment);
    }

    /* renamed from: E */
    public final AbstractC23461c m61505E(AbstractC23461c abstractC23461c, final BirdPayment birdPayment) {
        AbstractC23461c m33029z = abstractC23461c.m33029z(new InterfaceC23478a() { // from class: ZN3
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C39112cO3.m61504F(C39112cO3.this, birdPayment);
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33029z, "this.doOnComplete {\n    …d\n        }\n      )\n    }");
        return m33029z;
    }

    @Override // p000.QN3
    /* renamed from: a */
    public void mo61503a() {
        m61489o();
        Observable<BirdPayment> mo23905Oh = this.f60492b.mo23905Oh();
        final C13522c c13522c = new C13522c();
        Observable observeOn = mo23905Oh.flatMapMaybe(new InterfaceC23492o() { // from class: RN3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m61485s;
                m61485s = C39112cO3.m61485s(Function1.this, obj);
                return m61485s;
            }
        }).observeOn(C23454a.m33087a());
        final C13527d c13527d = new C13527d();
        Observable retry = observeOn.doOnError(new InterfaceC23484g() { // from class: TN3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39112cO3.m61484t(Function1.this, obj);
            }
        }).retry();
        Intrinsics.checkNotNullExpressionValue(retry, "override fun onCreate() …r)\n      .subscribe()\n  }");
        Object m33094as = retry.m33094as(AutoDispose.m45239a(this.f60491a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C13528e c13528e = new C13528e();
        InterfaceC23484g interfaceC23484g = new InterfaceC23484g() { // from class: UN3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39112cO3.m61483u(Function1.this, obj);
            }
        };
        final C13529f c13529f = new C13529f();
        ((ObservableSubscribeProxy) m33094as).subscribe(interfaceC23484g, new InterfaceC23484g() { // from class: VN3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39112cO3.m61482v(Function1.this, obj);
            }
        });
        Observable<List<BirdPayment>> observeOn2 = this.f60499i.observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn2, "paymentMethods\n      .ob…dSchedulers.mainThread())");
        Object m33094as2 = observeOn2.m33094as(AutoDispose.m45239a(this.f60491a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C13530g c13530g = new C13530g(this.f60492b);
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: WN3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39112cO3.m61481w(Function1.this, obj);
            }
        });
        Observable<BirdPayment> mo23901Z4 = this.f60492b.mo23901Z4();
        final C13531h c13531h = new C13531h();
        AbstractC23461c m33065U = mo23901Z4.flatMapCompletable(new InterfaceC23492o() { // from class: XN3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m61480x;
                m61480x = C39112cO3.m61480x(Function1.this, obj);
                return m61480x;
            }
        }).m33065U(3L);
        Intrinsics.checkNotNullExpressionValue(m33065U, "override fun onCreate() …r)\n      .subscribe()\n  }");
        Object m33041n = m33065U.m33041n(AutoDispose.m45239a(this.f60491a));
        Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
        ((CompletableSubscribeProxy) m33041n).subscribe();
    }

    /* renamed from: m */
    public final InterfaceC40099e13 m61491m() {
        return this.f60493c;
    }

    /* renamed from: n */
    public final C37791a94<List<BirdPayment>> m61490n() {
        return this.f60499i;
    }

    /* renamed from: o */
    public final void m61489o() {
        Observable<List<BirdPayment>> retry = this.f60496f.mo1483b().retry(3L);
        Intrinsics.checkNotNullExpressionValue(retry, "paymentMethodManager.sav…Methods()\n      .retry(3)");
        Object m33094as = retry.m33094as(AutoDispose.m45239a(this.f60491a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C13520a c13520a = new C13520a(this.f60499i);
        ((ObservableSubscribeProxy) m33094as).subscribe(new InterfaceC23484g() { // from class: bO3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39112cO3.m61488p(Function1.this, obj);
            }
        });
        Observable<Optional<BirdPayment>> observeOn = this.f60496f.mo1484a().observeOn(C23454a.m33087a());
        Intrinsics.checkNotNullExpressionValue(observeOn, "paymentMethodManager.def…dSchedulers.mainThread())");
        Object m33094as2 = observeOn.m33094as(AutoDispose.m45239a(this.f60491a));
        Intrinsics.checkExpressionValueIsNotNull(m33094as2, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C13521b c13521b = new C13521b();
        ((ObservableSubscribeProxy) m33094as2).subscribe(new InterfaceC23484g() { // from class: SN3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39112cO3.m61487q(Function1.this, obj);
            }
        });
    }

    /* renamed from: r */
    public final InterfaceC44466lO3 m61486r() {
        return this.f60492b;
    }

    /* renamed from: y */
    public final AbstractC23461c m61479y(BirdPayment birdPayment) {
        Integer paymentMethodVersion = birdPayment.getPaymentMethodVersion();
        if (paymentMethodVersion != null && paymentMethodVersion.intValue() == 3) {
            return m61478z(birdPayment);
        }
        AbstractC23461c m33049i = m61506D(birdPayment).m33049i(this.f60494d.mo85670h());
        Intrinsics.checkNotNullExpressionValue(m33049i, "removeStripeCardV2(card)….refreshDefaultPayment())");
        return m33049i;
    }

    /* renamed from: z */
    public final AbstractC23461c m61478z(BirdPayment birdPayment) {
        AbstractC23442F<SavedPaymentMethodResponse> mo25713u = this.f60495e.mo25713u(birdPayment.getId());
        final C13534i c13534i = new C13534i();
        AbstractC23461c m33159G = mo25713u.m33101w(new InterfaceC23484g() { // from class: aO3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C39112cO3.m61509A(Function1.this, obj);
            }
        }).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "private fun removePaymen…     .ignoreElement()\n  }");
        return m33159G;
    }
}
