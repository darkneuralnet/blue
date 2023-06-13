package p000;

import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.AgreementKey;
import co.bird.android.model.AgreementRole;
import co.bird.android.model.analytics.RentalAgreementShown;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.AC2;
import p000.InterfaceC44782lv1;
@Metadata(m28433d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u001b\u0012\b\b\u0001\u0010\"\u001a\u00020\u001f\u0012\b\b\u0001\u0010&\u001a\u00020#\u0012\b\b\u0001\u0010*\u001a\u00020'¢\u0006\u0004\b0\u00101J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006H\u0016R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\"\u0010/\u001a\u0010\u0012\f\u0012\n ,*\u0004\u0018\u00010\u00040\u00040+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, m28432d2 = {"LAC2;", "Llv1;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Lio/reactivex/Observable;", "", "Bk", "", "g7", "LEi0;", "m7", "LGi0;", "rc", "Llg6;", "b", "Llg6;", "userAgreementManager", "LEa;", "c", "LEa;", "analyticsManager", "LOg6;", DateTokenConverter.CONVERTER_KEY, "LOg6;", "agreementPresenterFactory", "LQA2;", "e", "LQA2;", RequestHeadersFactory.MODEL, "Lcom/uber/autodispose/ScopeProvider;", "f", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LRg6;", "g", "LRg6;", "ui", "Le13;", "h", "Le13;", "navigator", "Lma4;", "kotlin.jvm.PlatformType", "i", "Lma4;", "proceed", "<init>", "(Llg6;LEa;LOg6;LQA2;Lcom/uber/autodispose/ScopeProvider;LRg6;Le13;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: AC2 */
/* loaded from: classes2.dex */
public final class AC2 implements InterfaceC44782lv1 {

    /* renamed from: b */
    public final InterfaceC44637lg6 f272b;

    /* renamed from: c */
    public final InterfaceC1880Ea f273c;

    /* renamed from: d */
    public final InterfaceC34949Og6 f274d;

    /* renamed from: e */
    public final QA2 f275e;

    /* renamed from: f */
    public final ScopeProvider f276f;

    /* renamed from: g */
    public final InterfaceC35651Rg6 f277g;

    /* renamed from: h */
    public final InterfaceC40099e13 f278h;

    /* renamed from: i */
    public final C45168ma4<Unit> f279i;

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m28432d2 = {"AC2$a", "Lg9;", "Lio/reactivex/c;", C17296a.f69688o, "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: AC2$a */
    /* loaded from: classes2.dex */
    public static final class C0051a extends AbstractC20762g9 {
        public C0051a(AgreementRole[] agreementRoleArr, boolean z) {
            super(agreementRoleArr, z, null, null, false, 24, null);
        }

        /* renamed from: h */
        public static final void m116008h(AC2 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.f279i.accept(Unit.INSTANCE);
        }

        @Override // p000.AbstractC20762g9
        /* renamed from: a */
        public AbstractC23461c mo39976a() {
            final AC2 ac2 = AC2.this;
            AbstractC23461c m33076J = AbstractC23461c.m33076J(new Runnable() { // from class: zC2
                @Override // java.lang.Runnable
                public final void run() {
                    AC2.C0051a.m116008h(AC2.this);
                }
            });
            Intrinsics.checkNotNullExpressionValue(m33076J, "fromRunnable {\n         …ed.accept(Unit)\n        }");
            return m33076J;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lkotlin/Unit;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: AC2$b */
    /* loaded from: classes2.dex */
    public static final class C0052b extends Lambda implements Function1<Unit, Object> {

        /* renamed from: g */
        public static final C0052b f281g = new C0052b();

        public C0052b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Object invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    public AC2(InterfaceC44637lg6 userAgreementManager, InterfaceC1880Ea analyticsManager, InterfaceC34949Og6 agreementPresenterFactory, QA2 model, ScopeProvider scopeProvider, InterfaceC35651Rg6 ui, InterfaceC40099e13 navigator) {
        Intrinsics.checkNotNullParameter(userAgreementManager, "userAgreementManager");
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        Intrinsics.checkNotNullParameter(agreementPresenterFactory, "agreementPresenterFactory");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        Intrinsics.checkNotNullParameter(ui, "ui");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f272b = userAgreementManager;
        this.f273c = analyticsManager;
        this.f274d = agreementPresenterFactory;
        this.f275e = model;
        this.f276f = scopeProvider;
        this.f277g = ui;
        this.f278h = navigator;
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f279i = m25409g;
    }

    /* renamed from: b */
    public static final Object m116010b(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: Bk */
    public Observable<Object> mo22Bk() {
        C45168ma4<Unit> c45168ma4 = this.f279i;
        final C0052b c0052b = C0052b.f281g;
        Observable<R> map = c45168ma4.map(new InterfaceC23492o() { // from class: yC2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Object m116010b;
                m116010b = AC2.m116010b(Function1.this, obj);
                return m116010b;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "proceed.map { true }");
        return map;
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

    @Override // p000.InterfaceC44782lv1
    public void onActivityResult(int i, int i2, Intent intent) {
        InterfaceC44782lv1.C25814a.m26681b(this, i, i2, intent);
    }

    @Override // p000.UX0
    public void onCreate(Bundle bundle) {
        InterfaceC44782lv1.C25814a.m26680c(this, bundle);
        this.f273c.mo55956N(new RentalAgreementShown());
        AgreementRole agreementRole = AgreementRole.RIDER;
        this.f274d.mo89934a(this.f276f, this.f277g, new C0051a(new AgreementRole[]{agreementRole}, true ^ this.f272b.mo2957d().getValue().containsKey(new AgreementKey(agreementRole, null, null, 4, null))), this.f278h, Integer.valueOf(C45871nl4.rental_agreement_activity_title)).m98547q();
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
        InterfaceC44782lv1.C25814a.m26676g(this);
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

    @Override // p000.InterfaceC44782lv1
    /* renamed from: rc */
    public Observable<EnumC33089Gi0> mo11rc() {
        Observable<EnumC33089Gi0> just = Observable.just(EnumC33089Gi0.BACK);
        Intrinsics.checkNotNullExpressionValue(just, "just(CheckoutReverseType.BACK)");
        return just;
    }

    @Override // p000.InterfaceC44782lv1
    /* renamed from: z5 */
    public Observable<Unit> mo10z5() {
        return InterfaceC44782lv1.C25814a.m26682a(this);
    }
}
