package p000;

import co.bird.android.model.wire.WireMerchantTransaction;
import co.bird.api.response.CollectionResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC32569Ec2;
import p000.AbstractC38520bO4;
import p000.AbstractC39113cO4;
@Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004B\u001f\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010#\u001a\u00020!¢\u0006\u0004\b$\u0010%J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016J.\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00120\u00112\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000f0\u000eH\u0016J.\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00150\u00112\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000f0\u0014H\u0016J.\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00150\u00112\u0018\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000f0\u0014H\u0016J$\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001b2\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00190\u0018H\u0002R\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"¨\u0006&"}, m28432d2 = {"LiT2;", "LsO4;", "", "Lco/bird/android/model/wire/WireMerchantTransaction;", "LrO4;", "create", "", "position", "item", "h", "item1", "item2", "", "f", "LEc2$c;", "LTD3;", "params", "Lio/reactivex/F;", "LbO4;", "c", "LEc2$d;", "LcO4;", "b", C17296a.f69688o, "LHM4;", "Lco/bird/api/response/CollectionResponse;", "response", "", "g", "", "Ljava/lang/String;", "merchantId", "storeId", "LBQ2;", "LBQ2;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "<init>", "(Ljava/lang/String;Ljava/lang/String;LBQ2;)V", "merchant_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMerchantTransactionDataSourceDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MerchantTransactionDataSourceDelegate.kt\nco/bird/android/manager/merchant/MerchantTransactionDataSourceDelegate\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n766#2:67\n857#2,2:68\n*S KotlinDebug\n*F\n+ 1 MerchantTransactionDataSourceDelegate.kt\nco/bird/android/manager/merchant/MerchantTransactionDataSourceDelegate\n*L\n36#1:67\n36#1:68,2\n*E\n"})
/* renamed from: iT2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42731iT2 implements InterfaceC48617sO4<Unit, WireMerchantTransaction>, InterfaceC48025rO4<Unit, WireMerchantTransaction> {

    /* renamed from: a */
    public final String f87351a;

    /* renamed from: b */
    public final String f87352b;

    /* renamed from: c */
    public final BQ2 f87353c;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0005*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/CollectionResponse;", "Lco/bird/android/model/wire/WireMerchantTransaction;", "response", "LcO4;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)LcO4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nMerchantTransactionDataSourceDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MerchantTransactionDataSourceDelegate.kt\nco/bird/android/manager/merchant/MerchantTransactionDataSourceDelegate$loadAfter$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
    /* renamed from: iT2$a */
    /* loaded from: classes4.dex */
    public static final class C23259a extends Lambda implements Function1<HM4<CollectionResponse<WireMerchantTransaction>>, AbstractC39113cO4<WireMerchantTransaction>> {
        public C23259a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC39113cO4<WireMerchantTransaction> invoke(HM4<CollectionResponse<WireMerchantTransaction>> response) {
            Intrinsics.checkNotNullParameter(response, "response");
            List m33894g = C42731iT2.this.m33894g(response);
            if (m33894g != null) {
                return new AbstractC39113cO4.C13535a(m33894g);
            }
            return new AbstractC39113cO4.C13536b(null, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0005*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"LHM4;", "Lco/bird/api/response/CollectionResponse;", "Lco/bird/android/model/wire/WireMerchantTransaction;", "response", "LbO4;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(LHM4;)LbO4;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nMerchantTransactionDataSourceDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MerchantTransactionDataSourceDelegate.kt\nco/bird/android/manager/merchant/MerchantTransactionDataSourceDelegate$loadInitial$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1#2:67\n*E\n"})
    /* renamed from: iT2$b */
    /* loaded from: classes4.dex */
    public static final class C23260b extends Lambda implements Function1<HM4<CollectionResponse<WireMerchantTransaction>>, AbstractC38520bO4<WireMerchantTransaction>> {
        public C23260b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC38520bO4<WireMerchantTransaction> invoke(HM4<CollectionResponse<WireMerchantTransaction>> response) {
            Intrinsics.checkNotNullParameter(response, "response");
            List m33894g = C42731iT2.this.m33894g(response);
            if (m33894g != null) {
                return new AbstractC38520bO4.C12378a(m33894g);
            }
            return new AbstractC38520bO4.C12380c(null, 1, null);
        }
    }

    public C42731iT2(String merchantId, String storeId, BQ2 client) {
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(storeId, "storeId");
        Intrinsics.checkNotNullParameter(client, "client");
        this.f87351a = merchantId;
        this.f87352b = storeId;
        this.f87353c = client;
    }

    /* renamed from: i */
    public static final AbstractC39113cO4 m33892i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (AbstractC39113cO4) tmp0.invoke(obj);
    }

    /* renamed from: j */
    public static final AbstractC38520bO4 m33891j(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (AbstractC38520bO4) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC48025rO4
    /* renamed from: a */
    public AbstractC23442F<AbstractC39113cO4<WireMerchantTransaction>> mo16007a(AbstractC32569Ec2.C1915d<TD3<Unit, WireMerchantTransaction>> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        AbstractC23442F<HM4<CollectionResponse<WireMerchantTransaction>>> m114050a = this.f87353c.m114050a(this.f87351a, ((int) params.f7850a.m84186c()) + 1, params.f7851b);
        final C23259a c23259a = new C23259a();
        AbstractC23442F<AbstractC39113cO4<WireMerchantTransaction>> m33148R = m114050a.m33157I(new InterfaceC23492o() { // from class: hT2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                AbstractC39113cO4 m33892i;
                m33892i = C42731iT2.m33892i(Function1.this, obj);
                return m33892i;
            }
        }).m33148R(new AbstractC39113cO4.C13536b(null, 1, null));
        Intrinsics.checkNotNullExpressionValue(m33148R, "override fun loadAfter(\n…ryableLoadResult.Error())");
        return m33148R;
    }

    @Override // p000.InterfaceC48025rO4
    /* renamed from: b */
    public AbstractC23442F<AbstractC39113cO4<WireMerchantTransaction>> mo16006b(AbstractC32569Ec2.C1915d<TD3<Unit, WireMerchantTransaction>> params) {
        List emptyList;
        Intrinsics.checkNotNullParameter(params, "params");
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        AbstractC23442F<AbstractC39113cO4<WireMerchantTransaction>> m33158H = AbstractC23442F.m33158H(new AbstractC39113cO4.C13535a(emptyList));
        Intrinsics.checkNotNullExpressionValue(m33158H, "just(RetryableLoadResult.Content(listOf()))");
        return m33158H;
    }

    @Override // p000.InterfaceC48025rO4
    /* renamed from: c */
    public AbstractC23442F<AbstractC38520bO4<WireMerchantTransaction>> mo16005c(AbstractC32569Ec2.C1914c<TD3<Unit, WireMerchantTransaction>> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        AbstractC23442F<HM4<CollectionResponse<WireMerchantTransaction>>> m114050a = this.f87353c.m114050a(this.f87351a, 0, params.f7848b);
        final C23260b c23260b = new C23260b();
        AbstractC23442F<AbstractC38520bO4<WireMerchantTransaction>> m33148R = m114050a.m33157I(new InterfaceC23492o() { // from class: gT2
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                AbstractC38520bO4 m33891j;
                m33891j = C42731iT2.m33891j(Function1.this, obj);
                return m33891j;
            }
        }).m33148R(new AbstractC38520bO4.C12380c(null, 1, null));
        Intrinsics.checkNotNullExpressionValue(m33148R, "override fun loadInitial…oadInitialResult.Error())");
        return m33148R;
    }

    @Override // p000.InterfaceC48617sO4
    public InterfaceC48025rO4<Unit, WireMerchantTransaction> create() {
        return this;
    }

    @Override // p000.InterfaceC48025rO4
    /* renamed from: f */
    public boolean areItemsTheSame(WireMerchantTransaction item1, WireMerchantTransaction item2) {
        Intrinsics.checkNotNullParameter(item1, "item1");
        Intrinsics.checkNotNullParameter(item2, "item2");
        return Intrinsics.areEqual(item1.getTransaction().getId(), item2.getTransaction().getId());
    }

    /* renamed from: g */
    public final List<WireMerchantTransaction> m33894g(HM4<CollectionResponse<WireMerchantTransaction>> hm4) {
        List<WireMerchantTransaction> items;
        CollectionResponse<WireMerchantTransaction> m103944a = hm4.m103944a();
        if (m103944a != null && (items = m103944a.getItems()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : items) {
                if (Intrinsics.areEqual(((WireMerchantTransaction) obj).getTransaction().getMerchantSiteId(), this.f87352b)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return null;
    }

    @Override // p000.InterfaceC48025rO4
    public /* bridge */ /* synthetic */ Unit getKey(long j, WireMerchantTransaction wireMerchantTransaction) {
        m33893h(j, wireMerchantTransaction);
        return Unit.INSTANCE;
    }

    /* renamed from: h */
    public void m33893h(long j, WireMerchantTransaction item) {
        Intrinsics.checkNotNullParameter(item, "item");
    }
}
