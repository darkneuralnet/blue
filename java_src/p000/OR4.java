package p000;

import android.util.LruCache;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.OperatorRideHistoryItem;
import co.bird.api.response.PagedCollection;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\n\u001a\u00020\u0002H\u0016J5\u0010\u0010\u001a\u00020\u000f*\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f2\u0006\u0010\r\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0082\u0002JE\u0010\u0014\u001a\u00020\u000f**\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00120\u0011j\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0012`\u00132\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\bH\u0082\u0002R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R&\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR<\u0010\u001e\u001a*\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00120\u0011j\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0012`\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dRH\u0010!\u001a6\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u001f0\u0011j\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u001f`\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001dR<\u0010\"\u001a*\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001f0\u0011j\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001f`\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001d¨\u0006%"}, m28432d2 = {"LOR4;", "LKR4;", "", "birdId", "Lio/reactivex/c;", "W", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/OperatorRideHistoryItem;", "U", "rideId", "V", "Landroid/util/LruCache;", "key", "value", "", "e", "Ljava/util/HashMap;", "Ljava/lang/ref/WeakReference;", "Lkotlin/collections/HashMap;", "f", "LTk3;", C17296a.f69688o, "LTk3;", "operatorClient", "b", "Landroid/util/LruCache;", "rideHistoryCache", "c", "Ljava/util/HashMap;", "rideHistoryItemCache", "LAG;", DateTokenConverter.CONVERTER_KEY, "rideHistoryRelays", "rideHistoryItemRelays", "<init>", "(LTk3;)V", "co.bird.android.repository.ride-history"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRideHistoryRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideHistoryRepositoryImpl.kt\nco/bird/android/repository/ridehistory/RideHistoryRepositoryImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n361#2,7:83\n361#2,3:90\n364#2,4:94\n1#3:93\n*S KotlinDebug\n*F\n+ 1 RideHistoryRepositoryImpl.kt\nco/bird/android/repository/ridehistory/RideHistoryRepositoryImpl\n*L\n44#1:83,7\n51#1:90,3\n51#1:94,4\n*E\n"})
/* renamed from: OR4 */
/* loaded from: classes4.dex */
public final class OR4 implements KR4 {

    /* renamed from: a */
    public final InterfaceC36152Tk3 f26576a;

    /* renamed from: b */
    public final LruCache<String, List<OperatorRideHistoryItem>> f26577b;

    /* renamed from: c */
    public final HashMap<String, WeakReference<OperatorRideHistoryItem>> f26578c;

    /* renamed from: d */
    public final HashMap<String, C0058AG<List<OperatorRideHistoryItem>>> f26579d;

    /* renamed from: e */
    public final HashMap<String, C0058AG<OperatorRideHistoryItem>> f26580e;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052$\u0010\u0004\u001a \u0012\u0004\u0012\u00020\u0001 \u0003*\u0010\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000j\u0004\u0018\u0001`\u00020\u0000j\u0002`\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/api/response/PagedCollection;", "Lco/bird/android/model/OperatorRideHistoryItem;", "Lco/bird/api/response/OperatorRideHistoryResponse;", "kotlin.jvm.PlatformType", "response", "", C17296a.f69688o, "(Lco/bird/api/response/PagedCollection;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRideHistoryRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RideHistoryRepositoryImpl.kt\nco/bird/android/repository/ridehistory/RideHistoryRepositoryImpl$fetchRideHistory$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n1549#2:83\n1620#2,3:84\n1855#2:87\n1856#2:89\n1#3:88\n*S KotlinDebug\n*F\n+ 1 RideHistoryRepositoryImpl.kt\nco/bird/android/repository/ridehistory/RideHistoryRepositoryImpl$fetchRideHistory$1\n*L\n27#1:83\n27#1:84,3\n36#1:87\n36#1:89\n*E\n"})
    /* renamed from: OR4$a */
    /* loaded from: classes4.dex */
    public static final class C5998a extends Lambda implements Function1<PagedCollection<OperatorRideHistoryItem>, Unit> {

        /* renamed from: h */
        public final /* synthetic */ String f26582h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5998a(String str) {
            super(1);
            this.f26582h = str;
        }

        /* renamed from: a */
        public final void m92284a(PagedCollection<OperatorRideHistoryItem> pagedCollection) {
            int collectionSizeOrDefault;
            List<OperatorRideHistoryItem> items = pagedCollection.getItems();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10);
            ArrayList<OperatorRideHistoryItem> arrayList = new ArrayList(collectionSizeOrDefault);
            for (OperatorRideHistoryItem operatorRideHistoryItem : items) {
                if (operatorRideHistoryItem.getRideId() == null) {
                    operatorRideHistoryItem = operatorRideHistoryItem.copy((r20 & 1) != 0 ? operatorRideHistoryItem.rideId : UUID.randomUUID().toString(), (r20 & 2) != 0 ? operatorRideHistoryItem.rating : null, (r20 & 4) != 0 ? operatorRideHistoryItem.distance : null, (r20 & 8) != 0 ? operatorRideHistoryItem.duration : null, (r20 & 16) != 0 ? operatorRideHistoryItem.endPhotoUrl : null, (r20 & 32) != 0 ? operatorRideHistoryItem.startedAt : null, (r20 & 64) != 0 ? operatorRideHistoryItem.completedAt : null, (r20 & 128) != 0 ? operatorRideHistoryItem.canceledAt : null, (r20 & 256) != 0 ? operatorRideHistoryItem.tracks : null);
                }
                arrayList.add(operatorRideHistoryItem);
            }
            OR4 or4 = OR4.this;
            or4.m92288e(or4.f26577b, this.f26582h, arrayList);
            OR4 or42 = OR4.this;
            for (OperatorRideHistoryItem operatorRideHistoryItem2 : arrayList) {
                String rideId = operatorRideHistoryItem2.getRideId();
                if (rideId != null) {
                    or42.m92287f(or42.f26578c, rideId, operatorRideHistoryItem2);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PagedCollection<OperatorRideHistoryItem> pagedCollection) {
            m92284a(pagedCollection);
            return Unit.INSTANCE;
        }
    }

    public OR4(InterfaceC36152Tk3 operatorClient) {
        Intrinsics.checkNotNullParameter(operatorClient, "operatorClient");
        this.f26576a = operatorClient;
        this.f26577b = new LruCache<>(10);
        this.f26578c = new HashMap<>();
        this.f26579d = new HashMap<>();
        this.f26580e = new HashMap<>();
    }

    /* renamed from: d */
    public static final void m92289d(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    /* renamed from: g */
    public static final void m92286g(OR4 this$0, String birdId) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(birdId, "$birdId");
        this$0.f26579d.remove(birdId);
    }

    /* renamed from: h */
    public static final void m92285h(OR4 this$0, String rideId) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rideId, "$rideId");
        this$0.f26580e.remove(rideId);
    }

    @Override // p000.KR4
    /* renamed from: U */
    public Observable<List<OperatorRideHistoryItem>> mo92295U(final String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        HashMap<String, C0058AG<List<OperatorRideHistoryItem>>> hashMap = this.f26579d;
        C0058AG<List<OperatorRideHistoryItem>> c0058ag = hashMap.get(birdId);
        if (c0058ag == null) {
            List<OperatorRideHistoryItem> list = this.f26577b.get(birdId);
            if (list == null) {
                list = CollectionsKt__CollectionsKt.emptyList();
            }
            c0058ag = C0058AG.m115950h(list);
            Intrinsics.checkNotNullExpressionValue(c0058ag, "createDefault(rideHistor…e[birdId] ?: emptyList())");
            hashMap.put(birdId, c0058ag);
        }
        Observable<List<OperatorRideHistoryItem>> doOnDispose = c0058ag.doOnDispose(new InterfaceC23478a() { // from class: MR4
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                OR4.m92286g(OR4.this, birdId);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnDispose, "rideHistoryRelays.getOrP…ryRelays.remove(birdId) }");
        return doOnDispose;
    }

    @Override // p000.KR4
    /* renamed from: V */
    public Observable<OperatorRideHistoryItem> mo92294V(final String rideId) {
        OperatorRideHistoryItem operatorRideHistoryItem;
        Intrinsics.checkNotNullParameter(rideId, "rideId");
        HashMap<String, C0058AG<OperatorRideHistoryItem>> hashMap = this.f26580e;
        C0058AG<OperatorRideHistoryItem> c0058ag = hashMap.get(rideId);
        if (c0058ag == null) {
            c0058ag = C0058AG.m115951g();
            Intrinsics.checkNotNullExpressionValue(c0058ag, "create<OperatorRideHistoryItem>()");
            WeakReference<OperatorRideHistoryItem> weakReference = this.f26578c.get(rideId);
            if (weakReference != null && (operatorRideHistoryItem = weakReference.get()) != null) {
                c0058ag.accept(operatorRideHistoryItem);
            }
            hashMap.put(rideId, c0058ag);
        }
        Observable<OperatorRideHistoryItem> doOnDispose = c0058ag.doOnDispose(new InterfaceC23478a() { // from class: LR4
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                OR4.m92285h(OR4.this, rideId);
            }
        });
        Intrinsics.checkNotNullExpressionValue(doOnDispose, "rideHistoryItemRelays.ge…emRelays.remove(rideId) }");
        return doOnDispose;
    }

    @Override // p000.KR4
    /* renamed from: W */
    public AbstractC23461c mo92293W(String birdId) {
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<PagedCollection<OperatorRideHistoryItem>> m83030m = this.f26576a.m83030m(birdId);
        final C5998a c5998a = new C5998a(birdId);
        AbstractC23461c m33159G = m83030m.m33101w(new InterfaceC23484g() { // from class: NR4
            @Override // io.reactivex.functions.InterfaceC23484g
            public final void accept(Object obj) {
                OR4.m92289d(Function1.this, obj);
            }
        }).m33159G();
        Intrinsics.checkNotNullExpressionValue(m33159G, "override fun fetchRideHi…     .ignoreElement()\n  }");
        return m33159G;
    }

    /* renamed from: e */
    public final void m92288e(LruCache<String, List<OperatorRideHistoryItem>> lruCache, String str, List<OperatorRideHistoryItem> list) {
        Intrinsics.checkNotNullParameter(lruCache, "<this>");
        lruCache.put(str, list);
        C0058AG<List<OperatorRideHistoryItem>> c0058ag = this.f26579d.get(str);
        if (c0058ag != null) {
            c0058ag.accept(list);
        }
    }

    /* renamed from: f */
    public final void m92287f(HashMap<String, WeakReference<OperatorRideHistoryItem>> hashMap, String str, OperatorRideHistoryItem operatorRideHistoryItem) {
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        hashMap.put(str, new WeakReference<>(operatorRideHistoryItem));
        C0058AG<OperatorRideHistoryItem> c0058ag = this.f26580e.get(str);
        if (c0058ag != null) {
            c0058ag.accept(operatorRideHistoryItem);
        }
    }
}
