package p000;

import co.bird.android.model.TransactionSummary;
import co.bird.api.response.CollectionResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.functions.InterfaceC23492o;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p000.AbstractC32569Ec2;
import p000.AbstractC38520bO4;
import p000.AbstractC39113cO4;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J.\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00120\u00112\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000f0\u000eH\u0016J.\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00150\u00112\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000f0\u0014H\u0016J.\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00150\u00112\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000f0\u0014H\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"LW66;", "LsO4;", "", "Lco/bird/android/model/TransactionSummary;", "LrO4;", "create", "", "position", "item", "g", "item1", "item2", "", "f", "LEc2$c;", "LTD3;", "params", "Lio/reactivex/F;", "LbO4;", "c", "LEc2$d;", "LcO4;", "b", C17296a.f69688o, "LTg6;", "LTg6;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "<init>", "(LTg6;)V", "user_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: W66 */
/* loaded from: classes4.dex */
public final class W66 implements InterfaceC48617sO4<Unit, TransactionSummary>, InterfaceC48025rO4<Unit, TransactionSummary> {

    /* renamed from: a */
    public final InterfaceC36119Tg6 f40422a;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0005*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/CollectionResponse;", "Lco/bird/android/model/TransactionSummary;", "response", "LcO4;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)LcO4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: W66$a */
    /* loaded from: classes4.dex */
    public static final class C8936a extends Lambda implements Function1<HM4<CollectionResponse<TransactionSummary>>, AbstractC39113cO4<TransactionSummary>> {

        /* renamed from: g */
        public static final C8936a f40423g = new C8936a();

        public C8936a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC39113cO4<TransactionSummary> invoke(HM4<CollectionResponse<TransactionSummary>> response) {
            List<TransactionSummary> items;
            Intrinsics.checkNotNullParameter(response, "response");
            CollectionResponse<TransactionSummary> m103944a = response.m103944a();
            if (m103944a != null && (items = m103944a.getItems()) != null) {
                return new AbstractC39113cO4.C13535a(items);
            }
            return new AbstractC39113cO4.C13536b(null, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0005*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/CollectionResponse;", "Lco/bird/android/model/TransactionSummary;", "response", "LbO4;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)LbO4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: W66$b */
    /* loaded from: classes4.dex */
    public static final class C8937b extends Lambda implements Function1<HM4<CollectionResponse<TransactionSummary>>, AbstractC38520bO4<TransactionSummary>> {

        /* renamed from: g */
        public static final C8937b f40424g = new C8937b();

        public C8937b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC38520bO4<TransactionSummary> invoke(HM4<CollectionResponse<TransactionSummary>> response) {
            List<TransactionSummary> items;
            Intrinsics.checkNotNullParameter(response, "response");
            CollectionResponse<TransactionSummary> m103944a = response.m103944a();
            if (m103944a != null && (items = m103944a.getItems()) != null) {
                return new AbstractC38520bO4.C12378a(items);
            }
            return new AbstractC38520bO4.C12380c(null, 1, null);
        }
    }

    public W66(InterfaceC36119Tg6 client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f40422a = client;
    }

    /* renamed from: h */
    public static final AbstractC39113cO4 m78821h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (AbstractC39113cO4) tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final AbstractC38520bO4 m78820i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (AbstractC38520bO4) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC48025rO4
    /* renamed from: a */
    public AbstractC23442F<AbstractC39113cO4<TransactionSummary>> mo16007a(AbstractC32569Ec2.C1915d<TD3<Unit, TransactionSummary>> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        AbstractC23442F<HM4<CollectionResponse<TransactionSummary>>> m83173u = this.f40422a.m83173u(((int) params.f7850a.m84186c()) + 1, params.f7851b);
        final C8936a c8936a = C8936a.f40423g;
        AbstractC23442F<AbstractC39113cO4<TransactionSummary>> m33148R = m83173u.m33157I(new InterfaceC23492o() { // from class: U66
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                AbstractC39113cO4 m78821h;
                m78821h = W66.m78821h(Function1.this, obj);
                return m78821h;
            }
        }).m33148R(new AbstractC39113cO4.C13536b(null, 1, null));
        Intrinsics.checkNotNullExpressionValue(m33148R, "client.getTransactionHis…ryableLoadResult.Error())");
        return m33148R;
    }

    @Override // p000.InterfaceC48025rO4
    /* renamed from: b */
    public AbstractC23442F<AbstractC39113cO4<TransactionSummary>> mo16006b(AbstractC32569Ec2.C1915d<TD3<Unit, TransactionSummary>> params) {
        List emptyList;
        Intrinsics.checkNotNullParameter(params, "params");
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        AbstractC23442F<AbstractC39113cO4<TransactionSummary>> m33158H = AbstractC23442F.m33158H(new AbstractC39113cO4.C13535a(emptyList));
        Intrinsics.checkNotNullExpressionValue(m33158H, "just(RetryableLoadResult.Content(listOf()))");
        return m33158H;
    }

    @Override // p000.InterfaceC48025rO4
    /* renamed from: c */
    public AbstractC23442F<AbstractC38520bO4<TransactionSummary>> mo16005c(AbstractC32569Ec2.C1914c<TD3<Unit, TransactionSummary>> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        AbstractC23442F<HM4<CollectionResponse<TransactionSummary>>> m83173u = this.f40422a.m83173u(0, params.f7848b);
        final C8937b c8937b = C8937b.f40424g;
        AbstractC23442F<AbstractC38520bO4<TransactionSummary>> m33148R = m83173u.m33157I(new InterfaceC23492o() { // from class: V66
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                AbstractC38520bO4 m78820i;
                m78820i = W66.m78820i(Function1.this, obj);
                return m78820i;
            }
        }).m33148R(new AbstractC38520bO4.C12380c(null, 1, null));
        Intrinsics.checkNotNullExpressionValue(m33148R, "client.getTransactionHis…oadInitialResult.Error())");
        return m33148R;
    }

    @Override // p000.InterfaceC48617sO4
    public InterfaceC48025rO4<Unit, TransactionSummary> create() {
        return this;
    }

    @Override // p000.InterfaceC48025rO4
    /* renamed from: f */
    public boolean areItemsTheSame(TransactionSummary item1, TransactionSummary item2) {
        Intrinsics.checkNotNullParameter(item1, "item1");
        Intrinsics.checkNotNullParameter(item2, "item2");
        return Intrinsics.areEqual(item1.primaryKey(), item2.primaryKey());
    }

    /* renamed from: g */
    public void m78822g(long j, TransactionSummary item) {
        Intrinsics.checkNotNullParameter(item, "item");
    }

    @Override // p000.InterfaceC48025rO4
    public /* bridge */ /* synthetic */ Unit getKey(long j, TransactionSummary transactionSummary) {
        m78822g(j, transactionSummary);
        return Unit.INSTANCE;
    }
}
