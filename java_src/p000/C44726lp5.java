package p000;

import co.bird.android.model.persistence.ScrapOrderView;
import co.bird.android.model.wire.WireScrapOrderView;
import co.bird.api.response.ScrapOrderViewResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC43540jp5;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"Llp5;", "Ljp5;", "", "warehouseId", "Lio/reactivex/c;", "C1", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/ScrapOrderView;", "q1", "clear", "Lhp5;", C17296a.f69688o, "Lhp5;", "scrapOrderViewDao", "Lh86;", "b", "Lh86;", "transferOrderClient", "<init>", "(Lhp5;Lh86;)V", "co.bird.android.repository.scrap-order-view"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: lp5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44726lp5 implements InterfaceC43540jp5 {

    /* renamed from: a */
    public final AbstractC42354hp5 f96776a;

    /* renamed from: b */
    public final InterfaceC41951h86 f96777b;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/ScrapOrderViewResponse;", "response", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/ScrapOrderViewResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nScrapOrderViewRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScrapOrderViewRepositoryImpl.kt\nco/bird/android/repository/scraporderview/ScrapOrderViewRepositoryImpl$fetchScrapOrders$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1549#2:42\n1620#2,3:43\n1549#2:46\n1620#2,3:47\n*S KotlinDebug\n*F\n+ 1 ScrapOrderViewRepositoryImpl.kt\nco/bird/android/repository/scraporderview/ScrapOrderViewRepositoryImpl$fetchScrapOrders$1\n*L\n21#1:42\n21#1:43,3\n24#1:46\n24#1:47,3\n*E\n"})
    /* renamed from: lp5$a */
    /* loaded from: classes4.dex */
    public static final class C25799a extends Lambda implements Function1<ScrapOrderViewResponse, InterfaceC23496h> {
        public C25799a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(ScrapOrderViewResponse response) {
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            List listOf;
            Intrinsics.checkNotNullParameter(response, "response");
            List<WireScrapOrderView> orders = response.getOrders();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(orders, 10);
            ArrayList<ScrapOrderView> arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireScrapOrderView wireScrapOrderView : orders) {
                arrayList.add(C41168fp5.m40788a(wireScrapOrderView));
            }
            AbstractC23461c[] abstractC23461cArr = new AbstractC23461c[2];
            AbstractC42354hp5 abstractC42354hp5 = C44726lp5.this.f96776a;
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            for (ScrapOrderView scrapOrderView : arrayList) {
                arrayList2.add(scrapOrderView.getOrderId());
            }
            abstractC23461cArr[0] = abstractC42354hp5.mo31775d(arrayList2);
            abstractC23461cArr[1] = C44726lp5.this.f96776a.mo31777b(arrayList);
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) abstractC23461cArr);
            return AbstractC23461c.m33037r(listOf).m33063X(C24542a.m31932c());
        }
    }

    public C44726lp5(AbstractC42354hp5 scrapOrderViewDao, InterfaceC41951h86 transferOrderClient) {
        Intrinsics.checkNotNullParameter(scrapOrderViewDao, "scrapOrderViewDao");
        Intrinsics.checkNotNullParameter(transferOrderClient, "transferOrderClient");
        this.f96776a = scrapOrderViewDao;
        this.f96777b = transferOrderClient;
    }

    /* renamed from: M1 */
    public static final InterfaceC23496h m26756M1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC43540jp5
    /* renamed from: C1 */
    public AbstractC23461c mo26760C1(String warehouseId) {
        Intrinsics.checkNotNullParameter(warehouseId, "warehouseId");
        AbstractC23442F<ScrapOrderViewResponse> m36819h = this.f96777b.m36819h(warehouseId);
        final C25799a c25799a = new C25799a();
        AbstractC23461c m33164B = m36819h.m33164B(new InterfaceC23492o() { // from class: kp5
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m26756M1;
                m26756M1 = C44726lp5.m26756M1(Function1.this, obj);
                return m26756M1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchScrapO…      .clearOnError()\n  }");
        return m26758K1(m33164B);
    }

    /* renamed from: K1 */
    public AbstractC23461c m26758K1(AbstractC23461c abstractC23461c) {
        return InterfaceC43540jp5.C25028a.m29876a(this, abstractC23461c);
    }

    /* renamed from: L1 */
    public <T> Observable<T> m26757L1(Observable<T> observable) {
        return InterfaceC43540jp5.C25028a.m29875b(this, observable);
    }

    @Override // p000.InterfaceC38466bI4
    public AbstractC23461c clear() {
        return this.f96776a.mo31778a();
    }

    @Override // p000.InterfaceC43540jp5
    /* renamed from: q1 */
    public Observable<List<ScrapOrderView>> mo26755q1() {
        return m26757L1(this.f96776a.mo31776c());
    }
}
