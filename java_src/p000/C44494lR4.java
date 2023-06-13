package p000;

import android.content.Intent;
import android.os.Handler;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.MapMode;
import co.bird.android.model.wire.WireRide;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.SingleSubscribeProxy;
import io.reactivex.functions.InterfaceC23484g;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.S74;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010'\u001a\u00020%¢\u0006\u0004\b3\u00104J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010/R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, m28432d2 = {"LlR4;", "LiR4;", "", "rating", "", "feedback", "", C17296a.f69688o, "f", "()V", "i", "Landroid/content/Intent;", "intent", "b", "c", "", "requestCode", "resultCode", MessageExtension.FIELD_DATA, "onActivityResult", "Lgl;", "Lgl;", "preference", "LFk1;", "LFk1;", "feedbackManager", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Lcom/uber/autodispose/ScopeProvider;", DateTokenConverter.CONVERTER_KEY, "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LnR4;", "e", "LnR4;", "ui", "Le13;", "Le13;", "navigator", "Lco/bird/android/model/wire/WireRide;", "g", "Lco/bird/android/model/wire/WireRide;", "ride", "h", "I", "", "Z", "submitting", "j", "F", "<init>", "(Lgl;LFk1;Landroid/os/Handler;Lcom/uber/autodispose/ScopeProvider;LnR4;Le13;)V", "ride-end-summary_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideFeedbackPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideFeedbackPresenter.kt\nco/bird/android/feature/rideendsummary/RideFeedbackPresenterImpl\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,108:1\n199#2:109\n*S KotlinDebug\n*F\n+ 1 RideFeedbackPresenter.kt\nco/bird/android/feature/rideendsummary/RideFeedbackPresenterImpl\n*L\n82#1:109\n*E\n"})
/* renamed from: lR4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44494lR4 implements InterfaceC42715iR4 {

    /* renamed from: a */
    public final C22454gl f96192a;

    /* renamed from: b */
    public final InterfaceC32874Fk1 f96193b;

    /* renamed from: c */
    public final Handler f96194c;

    /* renamed from: d */
    public final ScopeProvider f96195d;

    /* renamed from: e */
    public final InterfaceC45680nR4 f96196e;

    /* renamed from: f */
    public final InterfaceC40099e13 f96197f;

    /* renamed from: g */
    public WireRide f96198g;

    /* renamed from: h */
    public final int f96199h;

    /* renamed from: i */
    public boolean f96200i;

    /* renamed from: j */
    public float f96201j;

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: lR4$a */
    /* loaded from: classes3.dex */
    public static final class C25702a extends Lambda implements Function0<Unit> {
        public C25702a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C44494lR4.this.f96197f.mo37183D2(C44494lR4.this.f96199h);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: lR4$b */
    /* loaded from: classes3.dex */
    public static final class C25703b extends Lambda implements Function0<Unit> {
        public C25703b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C44494lR4.this.m27283i();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042&\u0010\u0003\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001 \u0002*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "", "kotlin.jvm.PlatformType", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", C17296a.f69688o, "(Ljava/util/Map;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: lR4$c */
    /* loaded from: classes3.dex */
    public static final class C25704c extends Lambda implements Function1<Map<String, ? extends String>, Unit> {
        public C25704c() {
            super(1);
        }

        /* renamed from: a */
        public final void m27282a(Map<String, String> result) {
            InterfaceC45680nR4 interfaceC45680nR4 = C44494lR4.this.f96196e;
            Intrinsics.checkNotNullExpressionValue(result, "result");
            interfaceC45680nR4.mo15957k0(result);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends String> map) {
            m27282a(map);
            return Unit.INSTANCE;
        }
    }

    public C44494lR4(C22454gl preference, InterfaceC32874Fk1 feedbackManager, Handler handler, ScopeProvider scopeProvider, InterfaceC45680nR4 ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(preference, "preference");
        Intrinsics.checkNotNullParameter(feedbackManager, "feedbackManager");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f96192a = preference;
        this.f96193b = feedbackManager;
        this.f96194c = handler;
        this.f96195d = scopeProvider;
        this.f96196e = ui;
        this.f96197f = navigator;
        this.f96199h = 7;
    }

    /* renamed from: g */
    public static final void m27285g(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: h */
    public static final void m27284h(C44494lR4 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f96196e.success(C45871nl4.feedback_thank_you);
        S74.C7343a.showProgress$default(this$0.f96196e, false, 0, 2, null);
        this$0.f96197f.close();
    }

    @Override // p000.InterfaceC42715iR4
    /* renamed from: a */
    public void mo27291a(float f, String feedback) {
        Intrinsics.checkNotNullParameter(feedback, "feedback");
        if (!this.f96200i) {
            this.f96196e.hideKeyboard();
            this.f96200i = true;
            WireRide wireRide = null;
            S74.C7343a.showProgress$default(this.f96196e, true, 0, 2, null);
            InterfaceC32874Fk1 interfaceC32874Fk1 = this.f96193b;
            WireRide wireRide2 = this.f96198g;
            if (wireRide2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("ride");
            } else {
                wireRide = wireRide2;
            }
            interfaceC32874Fk1.mo99883g(wireRide, f, feedback, this.f96196e.mo15954y0());
            m27286f();
            this.f96200i = false;
        }
    }

    @Override // p000.InterfaceC42715iR4
    /* renamed from: b */
    public void mo27290b(Intent intent) {
        boolean z;
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f96196e.mo15956pd(this);
        Parcelable parcelableExtra = intent.getParcelableExtra("ride");
        Intrinsics.checkNotNull(parcelableExtra);
        this.f96198g = (WireRide) parcelableExtra;
        float floatExtra = intent.getFloatExtra("rating", 5.0f);
        this.f96201j = floatExtra;
        this.f96196e.mo15960X(floatExtra);
        InterfaceC45680nR4 interfaceC45680nR4 = this.f96196e;
        boolean z2 = true;
        if (this.f96201j < 5.0d) {
            z = true;
        } else {
            z = false;
        }
        interfaceC45680nR4.mo15955r1(z);
        InterfaceC32874Fk1 interfaceC32874Fk1 = this.f96193b;
        WireRide wireRide = this.f96198g;
        if (wireRide == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ride");
            wireRide = null;
        }
        Object m33135e = interfaceC32874Fk1.mo99884f(wireRide.getBirdId(), MapMode.RIDER).m33135e(AutoDispose.m45239a(this.f96195d));
        Intrinsics.checkExpressionValueIsNotNull(m33135e, "this.`as`(AutoDispose.autoDisposable(provider))");
        final C25704c c25704c = new C25704c();
        ((SingleSubscribeProxy) m33135e).subscribe(new InterfaceC23484g() { // from class: kR4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C44494lR4.m27285g(Function1.this, obj);
            }
        });
        this.f96196e.mo15968D();
        if (this.f96201j != 5.0f) {
            z2 = false;
        }
        if (z2) {
            this.f96196e.mo15958f1();
        }
    }

    @Override // p000.InterfaceC42715iR4
    /* renamed from: c */
    public void mo27289c(float f) {
        boolean z;
        this.f96201j = f;
        InterfaceC45680nR4 interfaceC45680nR4 = this.f96196e;
        if (f < 5.0d) {
            z = true;
        } else {
            z = false;
        }
        interfaceC45680nR4.mo15955r1(z);
    }

    /* renamed from: f */
    public final void m27286f() {
        boolean z = false;
        S74.C7343a.showProgress$default(this.f96196e, false, 0, 2, null);
        if (this.f96201j == 5.0f) {
            z = true;
        }
        if (z && !this.f96192a.m37639c1() && !this.f96196e.mo15959Y0()) {
            this.f96192a.m37672U2();
            this.f96196e.mo15953y1(new C25702a(), new C25703b());
            return;
        }
        m27283i();
    }

    /* renamed from: i */
    public final void m27283i() {
        this.f96194c.post(new Runnable() { // from class: jR4
            @Override // java.lang.Runnable
            public final void run() {
                C44494lR4.m27284h(C44494lR4.this);
            }
        });
    }

    @Override // p000.InterfaceC42715iR4
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == this.f96199h) {
            m27283i();
        }
    }
}
