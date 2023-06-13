package p000;

import co.bird.android.model.persistence.BirdPlusView;
import co.bird.api.request.BirdPlusCancelSubscriptionRequestBody;
import co.bird.api.request.BirdPlusPurchaseSubscriptionRequestBody;
import co.bird.api.request.BirdPlusReactivateSubscriptionRequestBody;
import co.bird.api.response.BirdPlusViewResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.C29193uR;
import p000.InterfaceC26980oR;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00100\u000fH\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u0014\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0002H\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, m28432d2 = {"LuR;", "LoR;", "Lio/reactivex/c;", "v1", "", "subscriptionPlanId", "", "trial", "m", "Lco/bird/android/model/persistence/BirdPlusView;", "birdPlusView", "K", "userSubscriptionId", "Q", "a0", "Lio/reactivex/Observable;", "", "F1", "Z0", "K0", "codename", "s1", "u1", "clear", "LrP;", C17296a.f69688o, "LrP;", "birdPlusClient", "LlR;", "b", "LlR;", "birdPlusViewDao", "<init>", "(LrP;LlR;)V", "co.bird.android.repository.birdplus"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: uR */
/* loaded from: classes4.dex */
public final class C29193uR implements InterfaceC26980oR {

    /* renamed from: a */
    public final InterfaceC27906rP f112350a;

    /* renamed from: b */
    public final AbstractC25698lR f112351b;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/BirdPlusViewResponse;", "response", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", "b", "(Lco/bird/api/response/BirdPlusViewResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: uR$a */
    /* loaded from: classes4.dex */
    public static final class C29194a extends Lambda implements Function1<BirdPlusViewResponse, InterfaceC23496h> {
        public C29194a() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC23496h m10281c(C29193uR this$0, BirdPlusViewResponse response) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(response, "$response");
            return this$0.f112351b.mo25644d(C24840jR.m30624j(response));
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC23496h invoke(final BirdPlusViewResponse response) {
            Intrinsics.checkNotNullParameter(response, "response");
            AbstractC23461c mo25646b = C29193uR.this.f112351b.mo25646b();
            final C29193uR c29193uR = C29193uR.this;
            return mo25646b.m33049i(AbstractC23461c.m33035t(new Callable() { // from class: tR
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    InterfaceC23496h m10281c;
                    m10281c = C29193uR.C29194a.m10281c(C29193uR.this, response);
                    return m10281c;
                }
            }));
        }
    }

    public C29193uR(InterfaceC27906rP birdPlusClient, AbstractC25698lR birdPlusViewDao) {
        Intrinsics.checkNotNullParameter(birdPlusClient, "birdPlusClient");
        Intrinsics.checkNotNullParameter(birdPlusViewDao, "birdPlusViewDao");
        this.f112350a = birdPlusClient;
        this.f112351b = birdPlusViewDao;
    }

    /* renamed from: N1 */
    public static final InterfaceC23496h m10295N1(C29193uR this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.mo10284v1();
    }

    /* renamed from: O1 */
    public static final InterfaceC23496h m10294O1(C29193uR this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.mo10284v1();
    }

    /* renamed from: Q1 */
    public static final InterfaceC23496h m10291Q1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: R1 */
    public static final InterfaceC23496h m10290R1(C29193uR this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.mo10284v1();
    }

    @Override // p000.InterfaceC26980oR
    /* renamed from: F1 */
    public Observable<List<BirdPlusView>> mo10302F1() {
        return m10293P1(this.f112351b.mo25645c());
    }

    @Override // p000.InterfaceC26980oR
    /* renamed from: K */
    public AbstractC23461c mo10300K(BirdPlusView birdPlusView) {
        Intrinsics.checkNotNullParameter(birdPlusView, "birdPlusView");
        AbstractC23461c m33039p = AbstractC23461c.m33039p();
        Intrinsics.checkNotNullExpressionValue(m33039p, "complete()");
        return m33039p;
    }

    @Override // p000.InterfaceC26980oR
    /* renamed from: K0 */
    public Observable<BirdPlusView> mo10299K0(String subscriptionPlanId) {
        Intrinsics.checkNotNullParameter(subscriptionPlanId, "subscriptionPlanId");
        return m10293P1(this.f112351b.mo25642f(subscriptionPlanId));
    }

    /* renamed from: P1 */
    public <T> Observable<T> m10293P1(Observable<T> observable) {
        return InterfaceC26980oR.C26981a.m21084a(this, observable);
    }

    @Override // p000.InterfaceC26980oR
    /* renamed from: Q */
    public AbstractC23461c mo10292Q(String userSubscriptionId) {
        Intrinsics.checkNotNullParameter(userSubscriptionId, "userSubscriptionId");
        AbstractC23461c m33049i = this.f112350a.m15998c(new BirdPlusCancelSubscriptionRequestBody(userSubscriptionId)).m33159G().m33049i(AbstractC23461c.m33035t(new Callable() { // from class: sR
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23496h m10294O1;
                m10294O1 = C29193uR.m10294O1(C29193uR.this);
                return m10294O1;
            }
        }));
        Intrinsics.checkNotNullExpressionValue(m33049i, "birdPlusClient.cancelSub…{ fetchBirdPassViews() })");
        return m33049i;
    }

    @Override // p000.InterfaceC26980oR
    /* renamed from: Z0 */
    public Observable<BirdPlusView> mo10289Z0(String userSubscriptionId) {
        Intrinsics.checkNotNullParameter(userSubscriptionId, "userSubscriptionId");
        return m10293P1(this.f112351b.mo25641g(userSubscriptionId));
    }

    @Override // p000.InterfaceC26980oR
    /* renamed from: a0 */
    public AbstractC23461c mo10288a0(String userSubscriptionId) {
        Intrinsics.checkNotNullParameter(userSubscriptionId, "userSubscriptionId");
        AbstractC23461c m33049i = this.f112350a.m15999b(new BirdPlusReactivateSubscriptionRequestBody(userSubscriptionId)).m33159G().m33049i(AbstractC23461c.m33035t(new Callable() { // from class: qR
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23496h m10290R1;
                m10290R1 = C29193uR.m10290R1(C29193uR.this);
                return m10290R1;
            }
        }));
        Intrinsics.checkNotNullExpressionValue(m33049i, "birdPlusClient.reactivat…{ fetchBirdPassViews() })");
        return m33049i;
    }

    @Override // p000.InterfaceC38466bI4
    public AbstractC23461c clear() {
        return this.f112351b.mo25647a();
    }

    @Override // p000.InterfaceC26980oR
    /* renamed from: m */
    public AbstractC23461c mo10287m(String subscriptionPlanId, boolean z) {
        Intrinsics.checkNotNullParameter(subscriptionPlanId, "subscriptionPlanId");
        AbstractC23461c m33049i = this.f112350a.m15997d(new BirdPlusPurchaseSubscriptionRequestBody(subscriptionPlanId, z)).m33159G().m33049i(AbstractC23461c.m33035t(new Callable() { // from class: pR
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23496h m10295N1;
                m10295N1 = C29193uR.m10295N1(C29193uR.this);
                return m10295N1;
            }
        }));
        Intrinsics.checkNotNullExpressionValue(m33049i, "birdPlusClient.purchaseS…{ fetchBirdPassViews() })");
        return m33049i;
    }

    @Override // p000.InterfaceC26980oR
    /* renamed from: s1 */
    public Observable<BirdPlusView> mo10286s1(String codename) {
        Intrinsics.checkNotNullParameter(codename, "codename");
        return m10293P1(this.f112351b.mo25643e(codename));
    }

    @Override // p000.InterfaceC26980oR
    /* renamed from: u1 */
    public AbstractC23461c mo10285u1() {
        return this.f112351b.mo25646b();
    }

    @Override // p000.InterfaceC26980oR
    /* renamed from: v1 */
    public AbstractC23461c mo10284v1() {
        AbstractC23442F<BirdPlusViewResponse> m16000a = this.f112350a.m16000a();
        final C29194a c29194a = new C29194a();
        AbstractC23461c m33164B = m16000a.m33164B(new InterfaceC23492o() { // from class: rR
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m10291Q1;
                m10291Q1 = C29193uR.m10291Q1(Function1.this, obj);
                return m10291Q1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchBirdPa…istence()) })\n      }\n  }");
        return m33164B;
    }
}
