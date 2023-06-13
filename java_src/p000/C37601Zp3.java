package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.OperatorOrderViewType;
import co.bird.android.model.persistence.OperatorOrderView;
import co.bird.android.model.persistence.OperatorOrderViewSection;
import co.bird.android.model.wire.WireOperatorOrderView;
import co.bird.android.model.wire.WireOperatorOrderViewSection;
import co.bird.api.response.OperatorOrderMetadataResponse;
import co.bird.api.response.OperatorOrderViewsResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC36665Vp3;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0016J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010$\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010\u00110\u00110 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, m28432d2 = {"LZp3;", "LVp3;", "Lio/reactivex/c;", "g1", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/OperatorOrderViewSection;", "d0", "", "section", "Lco/bird/android/model/persistence/OperatorOrderView;", "p0", "orderId", "Lco/bird/android/model/constant/OperatorOrderViewType;", "type", "W", "m0", "", "M", "clear", "Lh86;", C17296a.f69688o, "Lh86;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "Lbq3;", "b", "Lbq3;", "sectionDao", "LSp3;", "c", "LSp3;", "orderDao", "LAG;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "LAG;", "operatorOrderCountRelay", "<init>", "(Lh86;Lbq3;LSp3;)V", "co.bird.android.repository.operator-order-view"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Zp3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C37601Zp3 implements InterfaceC36665Vp3 {

    /* renamed from: a */
    public final InterfaceC41951h86 f49312a;

    /* renamed from: b */
    public final AbstractC38787bq3 f49313b;

    /* renamed from: c */
    public final AbstractC35963Sp3 f49314c;

    /* renamed from: d */
    public final C0058AG<Integer> f49315d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/OperatorOrderMetadataResponse;", "kotlin.jvm.PlatformType", "metadata", "", C17296a.f69688o, "(Lco/bird/api/response/OperatorOrderMetadataResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Zp3$a */
    /* loaded from: classes4.dex */
    public static final class C10398a extends Lambda implements Function1<OperatorOrderMetadataResponse, Unit> {
        public C10398a() {
            super(1);
        }

        /* renamed from: a */
        public final void m72432a(OperatorOrderMetadataResponse operatorOrderMetadataResponse) {
            C37601Zp3.this.f49315d.accept(Integer.valueOf(operatorOrderMetadataResponse.getCount()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OperatorOrderMetadataResponse operatorOrderMetadataResponse) {
            m72432a(operatorOrderMetadataResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/OperatorOrderViewsResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/api/response/OperatorOrderViewsResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorOrderViewRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderViewRepositoryImpl.kt\nco/bird/android/repository/operatororderview/OperatorOrderViewRepositoryImpl$fetchOperatorOrderViews$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,84:1\n1#2:85\n*E\n"})
    /* renamed from: Zp3$b */
    /* loaded from: classes4.dex */
    public static final class C10399b extends Lambda implements Function1<OperatorOrderViewsResponse, Unit> {
        public C10399b() {
            super(1);
        }

        /* renamed from: a */
        public final void m72431a(OperatorOrderViewsResponse operatorOrderViewsResponse) {
            C0058AG c0058ag = C37601Zp3.this.f49315d;
            int i = 0;
            for (WireOperatorOrderViewSection wireOperatorOrderViewSection : operatorOrderViewsResponse.getSections()) {
                i += wireOperatorOrderViewSection.getItems().size();
            }
            c0058ag.accept(Integer.valueOf(i));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OperatorOrderViewsResponse operatorOrderViewsResponse) {
            m72431a(operatorOrderViewsResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/OperatorOrderViewsResponse;", "response", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/OperatorOrderViewsResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOperatorOrderViewRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderViewRepositoryImpl.kt\nco/bird/android/repository/operatororderview/OperatorOrderViewRepositoryImpl$fetchOperatorOrderViews$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,84:1\n1360#2:85\n1446#2,2:86\n1549#2:88\n1620#2,3:89\n1448#2,3:92\n1549#2:95\n1620#2,3:96\n1549#2:99\n1620#2,3:100\n1549#2:103\n1620#2,3:104\n*S KotlinDebug\n*F\n+ 1 OperatorOrderViewRepositoryImpl.kt\nco/bird/android/repository/operatororderview/OperatorOrderViewRepositoryImpl$fetchOperatorOrderViews$2\n*L\n34#1:85\n34#1:86,2\n35#1:88\n35#1:89,3\n34#1:92,3\n37#1:95\n37#1:96,3\n38#1:99\n38#1:100,3\n44#1:103\n44#1:104,3\n*E\n"})
    /* renamed from: Zp3$c */
    /* loaded from: classes4.dex */
    public static final class C10400c extends Lambda implements Function1<OperatorOrderViewsResponse, InterfaceC23496h> {
        public C10400c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(OperatorOrderViewsResponse response) {
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            int collectionSizeOrDefault3;
            List listOf;
            int collectionSizeOrDefault4;
            Intrinsics.checkNotNullParameter(response, "response");
            ArrayList<OperatorOrderView> arrayList = new ArrayList();
            for (WireOperatorOrderViewSection wireOperatorOrderViewSection : response.getSections()) {
                List<WireOperatorOrderView> items = wireOperatorOrderViewSection.getItems();
                collectionSizeOrDefault4 = CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10);
                ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault4);
                for (WireOperatorOrderView wireOperatorOrderView : items) {
                    arrayList2.add(C35495Qp3.m87901a(wireOperatorOrderView, wireOperatorOrderViewSection.getTitle()));
                }
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, arrayList2);
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault);
            for (OperatorOrderView operatorOrderView : arrayList) {
                arrayList3.add(operatorOrderView.getOrderId());
            }
            List<WireOperatorOrderViewSection> sections = response.getSections();
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(sections, 10);
            ArrayList arrayList4 = new ArrayList(collectionSizeOrDefault2);
            for (WireOperatorOrderViewSection wireOperatorOrderViewSection2 : sections) {
                arrayList4.add(wireOperatorOrderViewSection2.getTitle());
            }
            AbstractC23461c[] abstractC23461cArr = new AbstractC23461c[4];
            abstractC23461cArr[0] = C37601Zp3.this.f49314c.mo82964e(arrayList3);
            abstractC23461cArr[1] = C37601Zp3.this.f49314c.mo82967b(arrayList);
            abstractC23461cArr[2] = C37601Zp3.this.f49313b.mo44987d(arrayList4);
            AbstractC38787bq3 abstractC38787bq3 = C37601Zp3.this.f49313b;
            List<WireOperatorOrderViewSection> sections2 = response.getSections();
            collectionSizeOrDefault3 = CollectionsKt__IterablesKt.collectionSizeOrDefault(sections2, 10);
            ArrayList arrayList5 = new ArrayList(collectionSizeOrDefault3);
            for (WireOperatorOrderViewSection wireOperatorOrderViewSection3 : sections2) {
                arrayList5.add(C35495Qp3.m87900b(wireOperatorOrderViewSection3));
            }
            abstractC23461cArr[3] = abstractC38787bq3.mo44989b(arrayList5);
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) abstractC23461cArr);
            return AbstractC23461c.m33037r(listOf);
        }
    }

    public C37601Zp3(InterfaceC41951h86 client, AbstractC38787bq3 sectionDao, AbstractC35963Sp3 orderDao) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(sectionDao, "sectionDao");
        Intrinsics.checkNotNullParameter(orderDao, "orderDao");
        this.f49312a = client;
        this.f49313b = sectionDao;
        this.f49314c = orderDao;
        C0058AG<Integer> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<Int>()");
        this.f49315d = m115951g;
    }

    /* renamed from: N1 */
    public static final void m72440N1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: O1 */
    public static final void m72439O1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: P1 */
    public static final InterfaceC23496h m72438P1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC36665Vp3
    /* renamed from: M */
    public Observable<Integer> mo72442M() {
        Observable<Integer> hide = this.f49315d.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "operatorOrderCountRelay.hide()");
        return hide;
    }

    /* renamed from: M1 */
    public <T> Observable<T> m72441M1(Observable<T> observable) {
        return InterfaceC36665Vp3.C8799a.m79393a(this, observable);
    }

    @Override // p000.InterfaceC36665Vp3
    /* renamed from: W */
    public Observable<OperatorOrderView> mo72437W(String orderId, OperatorOrderViewType type) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(type, "type");
        return m72441M1(this.f49314c.mo82966c(orderId, type));
    }

    @Override // p000.InterfaceC38466bI4
    public AbstractC23461c clear() {
        List listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{this.f49313b.mo44990a(), this.f49314c.mo82968a()});
        AbstractC23461c m33037r = AbstractC23461c.m33037r(listOf);
        Intrinsics.checkNotNullExpressionValue(m33037r, "concat(listOf(\n      sec… orderDao.clear(),\n    ))");
        return m33037r;
    }

    @Override // p000.InterfaceC36665Vp3
    /* renamed from: d0 */
    public Observable<List<OperatorOrderViewSection>> mo72436d0() {
        return m72441M1(this.f49313b.mo44988c());
    }

    @Override // p000.InterfaceC36665Vp3
    /* renamed from: g1 */
    public AbstractC23461c mo72435g1() {
        AbstractC23442F<OperatorOrderViewsResponse> m33142Y = this.f49312a.m36822e().m33142Y(C24542a.m31932c());
        final C10399b c10399b = new C10399b();
        AbstractC23442F<OperatorOrderViewsResponse> m33101w = m33142Y.m33101w(new InterfaceC23484g() { // from class: Xp3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37601Zp3.m72439O1(Function1.this, obj);
            }
        });
        final C10400c c10400c = new C10400c();
        AbstractC23461c m33164B = m33101w.m33164B(new InterfaceC23492o() { // from class: Yp3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m72438P1;
                m72438P1 = C37601Zp3.m72438P1(Function1.this, obj);
                return m72438P1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchOperat…),\n        ))\n      }\n  }");
        return m33164B;
    }

    @Override // p000.InterfaceC36665Vp3
    /* renamed from: m0 */
    public AbstractC23461c mo72434m0() {
        AbstractC23442F<OperatorOrderMetadataResponse> m36813n = this.f49312a.m36813n();
        final C10398a c10398a = new C10398a();
        AbstractC23461c m33159G = m36813n.m33101w(new InterfaceC23484g() { // from class: Wp3
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                C37601Zp3.m72440N1(Function1.this, obj);
            }
        }).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "override fun fetchOperat…     .ignoreElement()\n  }");
        return m33159G;
    }

    @Override // p000.InterfaceC36665Vp3
    /* renamed from: p0 */
    public Observable<List<OperatorOrderView>> mo72433p0(String section) {
        Intrinsics.checkNotNullParameter(section, "section");
        return m72441M1(this.f49314c.mo82965d(section));
    }
}
