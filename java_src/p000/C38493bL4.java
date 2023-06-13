package p000;

import androidx.appcompat.app.AppCompatActivity;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.app.feature.ride.presenter.PaymentIntentException;
import co.bird.android.buava.Optional;
import co.bird.android.model.COMPLETE;
import co.bird.android.model.PaymentIntentStatus;
import co.bird.android.model.PaymentIntentStatusKt;
import co.bird.android.model.REQUIRES_AUTHENTICATION;
import co.bird.android.model.REQUIRES_CONFIRMATION;
import co.bird.android.model.REQUIRES_PAYMENT_METHOD;
import co.bird.android.model.Reservation;
import co.bird.android.model.UNEXPECTED;
import co.bird.api.request.CreateReservationWithIntentBody;
import co.bird.api.request.StartRideChargeType;
import co.bird.api.response.CreateReservationWithIntentResponse;
import co.bird.api.response.ReservationPaymentResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.schedulers.C24542a;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C37791a94;
import p000.InterfaceC46820pM3;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b-\u0010.J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010$R5\u0010,\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020  '*\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001c0\u001c0&8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006/"}, m28432d2 = {"LbL4;", "LUK4;", "Lco/bird/api/request/CreateReservationWithIntentBody;", "body", "Lio/reactivex/c;", C17296a.f69688o, "l", "h", "LxK4;", "LxK4;", "reservationClient", "LpM3;", "b", "LpM3;", "manager", "LEa;", "c", "LEa;", "analyticsManager", "Landroidx/appcompat/app/AppCompatActivity;", DateTokenConverter.CONVERTER_KEY, "Landroidx/appcompat/app/AppCompatActivity;", "activity", "LGL4;", "e", "LGL4;", "ui", "La94;", "Lco/bird/android/buava/Optional;", "f", "La94;", "createReservationBody", "Ltg1;", "g", "mutableErrorResponse", "Lco/bird/api/request/StartRideChargeType;", "Lco/bird/api/request/StartRideChargeType;", "chargeType", "LZ84;", "kotlin.jvm.PlatformType", "i", "Lkotlin/Lazy;", "getErrorResponse", "()LZ84;", "errorResponse", "<init>", "(LxK4;LpM3;LEa;Landroidx/appcompat/app/AppCompatActivity;LGL4;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: bL4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C38493bL4 implements UK4 {

    /* renamed from: a */
    public final InterfaceC51545xK4 f57298a;

    /* renamed from: b */
    public final InterfaceC46820pM3 f57299b;

    /* renamed from: c */
    public final InterfaceC1880Ea f57300c;

    /* renamed from: d */
    public final AppCompatActivity f57301d;

    /* renamed from: e */
    public final GL4 f57302e;

    /* renamed from: f */
    public final C37791a94<Optional<CreateReservationWithIntentBody>> f57303f;

    /* renamed from: g */
    public final C37791a94<Optional<C49375tg1>> f57304g;

    /* renamed from: h */
    public StartRideChargeType f57305h;

    /* renamed from: i */
    public final Lazy f57306i;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"LZ84;", "Lco/bird/android/buava/Optional;", "Ltg1;", "kotlin.jvm.PlatformType", "invoke", "()LZ84;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: bL4$a */
    /* loaded from: classes2.dex */
    public static final class C12360a extends Lambda implements Function0<Z84<Optional<C49375tg1>>> {
        public C12360a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Z84<Optional<C49375tg1>> invoke() {
            return Z84.f47888d.m73663b(C38493bL4.this.f57304g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/CreateReservationWithIntentResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(LHM4;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: bL4$b */
    /* loaded from: classes2.dex */
    public static final class C12361b extends Lambda implements Function1<HM4<CreateReservationWithIntentResponse>, Unit> {
        public C12361b() {
            super(1);
        }

        /* renamed from: a */
        public final void m64663a(HM4<CreateReservationWithIntentResponse> hm4) {
            CreateReservationWithIntentResponse m103944a;
            String intentId;
            if (hm4.m103939f() && (m103944a = hm4.m103944a()) != null) {
                C38493bL4 c38493bL4 = C38493bL4.this;
                ReservationPaymentResponse payment = m103944a.getPayment();
                if (payment != null && (intentId = payment.getIntentId()) != null) {
                    InterfaceC46820pM3 interfaceC46820pM3 = c38493bL4.f57299b;
                    ReservationPaymentResponse payment2 = m103944a.getPayment();
                    Intrinsics.checkNotNull(payment2);
                    String clientSecret = payment2.getClientSecret();
                    Intrinsics.checkNotNull(clientSecret);
                    interfaceC46820pM3.mo8809h(intentId, clientSecret);
                    ReservationPaymentResponse payment3 = m103944a.getPayment();
                    Intrinsics.checkNotNull(payment3);
                    StartRideChargeType chargeType = payment3.getChargeType();
                    Intrinsics.checkNotNull(chargeType);
                    c38493bL4.f57305h = chargeType;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HM4<CreateReservationWithIntentResponse> hm4) {
            m64663a(hm4);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/CreateReservationWithIntentResponse;", "response", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: bL4$c */
    /* loaded from: classes2.dex */
    public static final class C12362c extends Lambda implements Function1<HM4<CreateReservationWithIntentResponse>, InterfaceC23496h> {
        public C12362c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(HM4<CreateReservationWithIntentResponse> response) {
            Unit unit;
            AbstractC23461c m33039p;
            Intrinsics.checkNotNullParameter(response, "response");
            if (response.m103939f() && response.m103944a() != null) {
                CreateReservationWithIntentResponse m103944a = response.m103944a();
                Intrinsics.checkNotNull(m103944a);
                ReservationPaymentResponse payment = m103944a.getPayment();
                if (payment != null) {
                    C38493bL4 c38493bL4 = C38493bL4.this;
                    if (payment.getIntentId() != null) {
                        m33039p = c38493bL4.f57299b.mo8798s();
                    } else {
                        InterfaceC46820pM3 interfaceC46820pM3 = c38493bL4.f57299b;
                        String string = c38493bL4.f57301d.getString(C45871nl4.payment_error_retry_description);
                        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.str…_error_retry_description)");
                        interfaceC46820pM3.mo8810g(new UNEXPECTED(new PaymentIntentException(string)));
                        m33039p = AbstractC23461c.m33039p();
                        Intrinsics.checkNotNullExpressionValue(m33039p, "{\n              manager.….complete()\n            }");
                    }
                    if (m33039p != null) {
                        return m33039p;
                    }
                }
                C38493bL4 c38493bL42 = C38493bL4.this;
                CreateReservationWithIntentResponse m103944a2 = response.m103944a();
                Intrinsics.checkNotNull(m103944a2);
                Reservation reservation = m103944a2.getReservation();
                if (reservation != null) {
                    c38493bL42.f57299b.mo8797t(reservation);
                    c38493bL42.f57299b.mo8810g(COMPLETE.INSTANCE);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    InterfaceC46820pM3 interfaceC46820pM32 = c38493bL42.f57299b;
                    String string2 = c38493bL42.f57301d.getString(C45871nl4.reservation_free_expired);
                    Intrinsics.checkNotNullExpressionValue(string2, "activity.getString(L.str…reservation_free_expired)");
                    interfaceC46820pM32.mo8810g(new UNEXPECTED(new PaymentIntentException(string2)));
                }
                AbstractC23461c m33039p2 = AbstractC23461c.m33039p();
                Intrinsics.checkNotNullExpressionValue(m33039p2, "complete()");
                return m33039p2;
            }
            InterfaceC46820pM3 interfaceC46820pM33 = C38493bL4.this.f57299b;
            String string3 = C38493bL4.this.f57301d.getString(C45871nl4.payment_error_generic);
            Intrinsics.checkNotNullExpressionValue(string3, "activity.getString(L.string.payment_error_generic)");
            interfaceC46820pM33.mo8810g(new UNEXPECTED(new PaymentIntentException(string3)));
            C38493bL4.this.f57304g.accept(Optional.f63040c.m59033b(NM4.m94017d(response)));
            return AbstractC23461c.m33039p();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: bL4$d */
    /* loaded from: classes2.dex */
    public static final class C12363d extends Lambda implements Function1<Throwable, Unit> {
        public C12363d() {
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
            C38493bL4.this.f57299b.mo8810g(new UNEXPECTED(th));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/PaymentIntentStatus;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/PaymentIntentStatus;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: bL4$e */
    /* loaded from: classes2.dex */
    public static final class C12364e extends Lambda implements Function1<PaymentIntentStatus, Unit> {
        public C12364e() {
            super(1);
        }

        /* renamed from: a */
        public final void m64661a(PaymentIntentStatus paymentIntentStatus) {
            if (Intrinsics.areEqual(paymentIntentStatus, REQUIRES_AUTHENTICATION.INSTANCE)) {
                C38493bL4.this.f57299b.mo8804m(C38493bL4.this.f57301d);
            } else if ((paymentIntentStatus instanceof UNEXPECTED) || Intrinsics.areEqual(paymentIntentStatus, REQUIRES_PAYMENT_METHOD.INSTANCE)) {
                C38493bL4.this.f57302e.mo103972k(false);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PaymentIntentStatus paymentIntentStatus) {
            m64661a(paymentIntentStatus);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/PaymentIntentStatus;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/PaymentIntentStatus;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: bL4$f */
    /* loaded from: classes2.dex */
    public static final class C12365f extends Lambda implements Function1<PaymentIntentStatus, Boolean> {

        /* renamed from: g */
        public static final C12365f f57312g = new C12365f();

        public C12365f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(PaymentIntentStatus it) {
            boolean z;
            Intrinsics.checkNotNullParameter(it, "it");
            if (!Intrinsics.areEqual(it, REQUIRES_CONFIRMATION.INSTANCE) && !Intrinsics.areEqual(it, REQUIRES_PAYMENT_METHOD.INSTANCE) && !PaymentIntentStatusKt.isEnded(it)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/PaymentIntentStatus;", "it", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/PaymentIntentStatus;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: bL4$g */
    /* loaded from: classes2.dex */
    public static final class C12366g extends Lambda implements Function1<PaymentIntentStatus, InterfaceC23496h> {
        public C12366g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(PaymentIntentStatus it) {
            boolean areEqual;
            String string;
            Intrinsics.checkNotNullParameter(it, "it");
            if (Intrinsics.areEqual(it, REQUIRES_CONFIRMATION.INSTANCE)) {
                C38493bL4 c38493bL4 = C38493bL4.this;
                return c38493bL4.m64671h((CreateReservationWithIntentBody) ((Optional) c38493bL4.f57303f.getValue()).m59035e());
            }
            if (it instanceof UNEXPECTED) {
                areEqual = true;
            } else {
                areEqual = Intrinsics.areEqual(it, REQUIRES_PAYMENT_METHOD.INSTANCE);
            }
            if (areEqual) {
                C49375tg1 c49375tg1 = (C49375tg1) ((Optional) C38493bL4.this.f57304g.getValue()).m59035e();
                if (c49375tg1 == null || (string = c49375tg1.m11932c()) == null) {
                    string = C38493bL4.this.f57301d.getResources().getString(C45871nl4.payment_error_description);
                    Intrinsics.checkNotNullExpressionValue(string, "activity.resources.getSt…ayment_error_description)");
                }
                return AbstractC23461c.m33080F(new PaymentIntentException(string));
            }
            return AbstractC23461c.m33039p();
        }
    }

    public C38493bL4(InterfaceC51545xK4 reservationClient, InterfaceC46820pM3 manager, InterfaceC1880Ea analyticsManager, AppCompatActivity activity, GL4 ui) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(reservationClient, "reservationClient");
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(ui, "ui");
        this.f57298a = reservationClient;
        this.f57299b = manager;
        this.f57300c = analyticsManager;
        this.f57301d = activity;
        this.f57302e = ui;
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        Optional.C14443a c14443a = Optional.f63040c;
        this.f57303f = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f57304g = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        lazy = LazyKt__LazyJVMKt.lazy(new C12360a());
        this.f57306i = lazy;
    }

    /* renamed from: i */
    public static final void m64670i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final InterfaceC23496h m64669j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m64668k(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: m */
    public static final void m64666m(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: n */
    public static final boolean m64665n(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* renamed from: o */
    public static final InterfaceC23496h m64664o(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // p000.UK4
    /* renamed from: a */
    public AbstractC23461c mo64678a(CreateReservationWithIntentBody createReservationWithIntentBody) {
        this.f57299b.mo8808i();
        AbstractC23461c m33072N = m64667l().m33072N(m64671h(createReservationWithIntentBody));
        Intrinsics.checkNotNullExpressionValue(m33072N, "observePaymentStatus().m…ationPaymentIntent(body))");
        return m33072N;
    }

    /* renamed from: h */
    public final AbstractC23461c m64671h(CreateReservationWithIntentBody createReservationWithIntentBody) {
        AbstractC23442F<HM4<CreateReservationWithIntentResponse>> m5439g;
        if (this.f57299b.mo8800q() == null) {
            if (createReservationWithIntentBody != null) {
                this.f57303f.accept(Optional.f63040c.m59032c(createReservationWithIntentBody));
                AbstractC23442F<HM4<CreateReservationWithIntentResponse>> m5439g2 = this.f57298a.m5439g(createReservationWithIntentBody);
                final C12361b c12361b = new C12361b();
                m5439g = m5439g2.m33101w(new InterfaceC23484g() { // from class: VK4
                    @Override // io.reactivex.functions.InterfaceC23484g
                    public final void accept(Object obj) {
                        C38493bL4.m64670i(Function1.this, obj);
                    }
                });
            } else {
                m5439g = null;
            }
        } else {
            m5439g = this.f57298a.m5439g(CreateReservationWithIntentBody.copy$default(this.f57303f.getValue().m59038b(), null, this.f57299b.mo8800q(), this.f57305h, 1, null));
        }
        Intrinsics.checkNotNull(m5439g);
        AbstractC23442F<HM4<CreateReservationWithIntentResponse>> m33152N = m5439g.m33152N(C24542a.m31932c());
        final C12362c c12362c = new C12362c();
        AbstractC23461c m33164B = m33152N.m33164B(new InterfaceC23492o() { // from class: WK4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m64669j;
                m64669j = C38493bL4.m64669j(Function1.this, obj);
                return m64669j;
            }
        });
        final C12363d c12363d = new C12363d();
        AbstractC23461c m33069Q = m33164B.m33084B(new InterfaceC23484g() { // from class: XK4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38493bL4.m64668k(Function1.this, obj);
            }
        }).m33069Q();
        Intrinsics.checkNotNullExpressionValue(m33069Q, "private fun handleReserv…   .onErrorComplete()\n  }");
        return m33069Q;
    }

    /* renamed from: l */
    public final AbstractC23461c m64667l() {
        Observable observeOn = C37279Yf5.m74576S(InterfaceC46820pM3.C27275a.observePaymentStatus$default(this.f57299b, false, 1, null)).observeOn(C23454a.m33087a());
        final C12364e c12364e = new C12364e();
        Observable observeOn2 = observeOn.doOnNext(new InterfaceC23484g() { // from class: YK4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C38493bL4.m64666m(Function1.this, obj);
            }
        }).observeOn(C24542a.m31932c());
        final C12365f c12365f = C12365f.f57312g;
        AbstractC23442F firstOrError = observeOn2.filter(new InterfaceC23494q() { // from class: ZK4
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean m64665n;
                m64665n = C38493bL4.m64665n(Function1.this, obj);
                return m64665n;
            }
        }).firstOrError();
        final C12366g c12366g = new C12366g();
        AbstractC23461c m33164B = firstOrError.m33164B(new InterfaceC23492o() { // from class: aL4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m64664o;
                m64664o = C38493bL4.m64664o(Function1.this, obj);
                return m64664o;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "private fun observePayme…e()\n        }\n      }\n  }");
        return m33164B;
    }
}
