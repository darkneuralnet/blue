package p000;

import android.annotation.SuppressLint;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.model.User;
import co.bird.android.model.analytics.MarketingEmailsOptedIn;
import co.bird.android.model.analytics.MarketingEmailsOptedOut;
import co.bird.api.request.CommunicationOptInRequestBody;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C37791a94;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\bH\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0002R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006 "}, m28432d2 = {"LIp0;", "LEp0;", "Lio/reactivex/F;", "", "b", "optedIn", "", "optedInString", "", C17296a.f69688o, "fromSignUp", "Lio/reactivex/c;", "c", "i", "h", "j", "LDp0;", "LDp0;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "LEa;", "LEa;", "analyticsManager", "La94;", "Lco/bird/android/buava/Optional;", "La94;", "mutableOptedInStatus", DateTokenConverter.CONVERTER_KEY, "mutableOptedInString", "LRh6;", "userStream", "<init>", "(LDp0;LEa;LRh6;)V", "communication-opt-in_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SuppressLint({"CheckResult"})
/* renamed from: Ip0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33620Ip0 implements InterfaceC32684Ep0 {

    /* renamed from: a */
    public final InterfaceC32450Dp0 f16249a;

    /* renamed from: b */
    public final InterfaceC1880Ea f16250b;

    /* renamed from: c */
    public final C37791a94<Optional<Boolean>> f16251c;

    /* renamed from: d */
    public final C37791a94<Optional<String>> f16252d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/User;", "kotlin.jvm.PlatformType", "it", "", C17296a.f69688o, "(Lco/bird/android/model/User;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Ip0$a */
    /* loaded from: classes4.dex */
    public static final class C3768a extends Lambda implements Function1<User, Unit> {
        public C3768a() {
            super(1);
        }

        /* renamed from: a */
        public final void m101660a(User user) {
            C33620Ip0.this.m101665h();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(User user) {
            m101660a(user);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: Ip0$b */
    /* loaded from: classes4.dex */
    public static final class C3769b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g */
        public static final C3769b f16254g = new C3769b();

        public C3769b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            C41318g46.m40159e(new Exception("CommunicationOptInManager: opt-in status update failed", th));
        }
    }

    public C33620Ip0(InterfaceC32450Dp0 client, InterfaceC1880Ea analyticsManager, InterfaceC35660Rh6 userStream) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(userStream, "userStream");
        this.f16249a = client;
        this.f16250b = analyticsManager;
        Observable<User> mo76576i = userStream.mo76576i();
        final C3768a c3768a = new C3768a();
        mo76576i.subscribe(new InterfaceC23484g() { // from class: Fp0
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C33620Ip0.m101666g(Function1.this, obj);
            }
        });
        C37791a94.C10586a c10586a = C37791a94.f49908h;
        Optional.C14443a c14443a = Optional.f63040c;
        this.f16251c = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
        this.f16252d = C37791a94.C10586a.create$default(c10586a, c14443a.m59034a(), null, 2, null);
    }

    /* renamed from: g */
    public static final void m101666g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: k */
    public static final void m101662k(C33620Ip0 this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m101664i(z);
    }

    /* renamed from: l */
    public static final void m101661l(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC32684Ep0
    /* renamed from: a */
    public void mo101672a(boolean z, String optedInString) {
        Intrinsics.checkNotNullParameter(optedInString, "optedInString");
        C37791a94<Optional<Boolean>> c37791a94 = this.f16251c;
        Optional.C14443a c14443a = Optional.f63040c;
        c37791a94.accept(c14443a.m59032c(Boolean.valueOf(z)));
        this.f16252d.accept(c14443a.m59032c(optedInString));
    }

    @Override // p000.InterfaceC32684Ep0
    /* renamed from: b */
    public AbstractC23442F<Boolean> mo101671b() {
        return this.f16249a.m109896a();
    }

    @Override // p000.InterfaceC32684Ep0
    /* renamed from: c */
    public AbstractC23461c mo101670c(final boolean z) {
        if (m101663j()) {
            AbstractC23461c m33029z = this.f16249a.m109895b(new CommunicationOptInRequestBody(this.f16251c.getValue().m59038b().booleanValue(), this.f16252d.getValue().m59038b())).m33029z(new InterfaceC23478a() { // from class: Gp0
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C33620Ip0.m101662k(C33620Ip0.this, z);
                }
            });
            final C3769b c3769b = C3769b.f16254g;
            AbstractC23461c m33069Q = m33029z.m33084B(new InterfaceC23484g() { // from class: Hp0
                @Override // io.reactivex.functions.InterfaceC23484g
                public final void accept(Object obj) {
                    C33620Ip0.m101661l(Function1.this, obj);
                }
            }).m33069Q();
            Intrinsics.checkNotNullExpressionValue(m33069Q, "{\n      client.updateOpt… .onErrorComplete()\n    }");
            return m33069Q;
        }
        AbstractC23461c m33039p = AbstractC23461c.m33039p();
        Intrinsics.checkNotNullExpressionValue(m33039p, "{\n      Completable.complete()\n    }");
        return m33039p;
    }

    /* renamed from: h */
    public final void m101665h() {
        this.f16251c.m71836j();
        this.f16252d.m71836j();
    }

    /* renamed from: i */
    public final void m101664i(boolean z) {
        MarketingEmailsOptedOut.Source source;
        MarketingEmailsOptedIn.Source source2;
        if (this.f16251c.getValue().m59038b().booleanValue()) {
            InterfaceC1880Ea interfaceC1880Ea = this.f16250b;
            String m59038b = this.f16252d.getValue().m59038b();
            if (z) {
                source2 = MarketingEmailsOptedIn.Source.EMAIL_SIGNUP;
            } else {
                source2 = MarketingEmailsOptedIn.Source.SETTINGS;
            }
            interfaceC1880Ea.mo55956N(new MarketingEmailsOptedIn(m59038b, source2));
            return;
        }
        InterfaceC1880Ea interfaceC1880Ea2 = this.f16250b;
        String m59038b2 = this.f16252d.getValue().m59038b();
        if (z) {
            source = MarketingEmailsOptedOut.Source.EMAIL_SIGNUP;
        } else {
            source = MarketingEmailsOptedOut.Source.SETTINGS;
        }
        interfaceC1880Ea2.mo55956N(new MarketingEmailsOptedOut(m59038b2, source));
    }

    /* renamed from: j */
    public final boolean m101663j() {
        return this.f16251c.getValue().m59037c() && this.f16252d.getValue().m59037c();
    }
}
