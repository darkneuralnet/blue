package p000;

import co.bird.android.model.persistence.ZoneAssignmentGroup;
import co.bird.android.model.wire.WireReleaseAssignmentMapBanner;
import co.bird.android.model.wire.WireZoneAssignmentGroup;
import co.bird.api.request.CappedZoneReservationCancelRequest;
import co.bird.api.response.ZoneAssignmentsResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC31797Au4;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"LCu4;", "LAu4;", "Lio/reactivex/c;", "o0", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/ZoneAssignmentGroup;", "z0", "", "id", "Q0", "clear", "LFu4;", C17296a.f69688o, "LFu4;", "releaseClient", "LxI6;", "b", "LxI6;", "zoneAssignmentDao", "Lgl;", "c", "Lgl;", "preferences", "<init>", "(LFu4;LxI6;Lgl;)V", "co.bird.android.repository.release-assignment"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Cu4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32265Cu4 implements InterfaceC31797Au4 {

    /* renamed from: a */
    public final InterfaceC32967Fu4 f4875a;

    /* renamed from: b */
    public final AbstractC51529xI6 f4876b;

    /* renamed from: c */
    public final C22454gl f4877c;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/ZoneAssignmentsResponse;", "response", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/ZoneAssignmentsResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nReleaseAssignmentRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseAssignmentRepositoryImpl.kt\nco/bird/android/repository/releaseassignment/ReleaseAssignmentRepositoryImpl$fetchZoneAssignments$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n1#2:55\n1549#3:56\n1620#3,3:57\n1549#3:60\n1620#3,3:61\n*S KotlinDebug\n*F\n+ 1 ReleaseAssignmentRepositoryImpl.kt\nco/bird/android/repository/releaseassignment/ReleaseAssignmentRepositoryImpl$fetchZoneAssignments$1\n*L\n28#1:56\n28#1:57,3\n31#1:60\n31#1:61,3\n*E\n"})
    /* renamed from: Cu4$a */
    /* loaded from: classes4.dex */
    public static final class C1227a extends Lambda implements Function1<ZoneAssignmentsResponse, InterfaceC23496h> {
        public C1227a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(ZoneAssignmentsResponse response) {
            Unit unit;
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            List listOf;
            Intrinsics.checkNotNullParameter(response, "response");
            WireReleaseAssignmentMapBanner mapBanner = response.getMapBanner();
            if (mapBanner != null) {
                C32265Cu4.this.f4877c.m37740D2(mapBanner);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C32265Cu4.this.f4877c.m37588p();
            }
            List<WireZoneAssignmentGroup> groups = response.getGroups();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(groups, 10);
            ArrayList<ZoneAssignmentGroup> arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireZoneAssignmentGroup wireZoneAssignmentGroup : groups) {
                arrayList.add(C52715zI6.m1550a(wireZoneAssignmentGroup));
            }
            C32265Cu4 c32265Cu4 = C32265Cu4.this;
            AbstractC23461c[] abstractC23461cArr = new AbstractC23461c[2];
            AbstractC51529xI6 abstractC51529xI6 = c32265Cu4.f4876b;
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            for (ZoneAssignmentGroup zoneAssignmentGroup : arrayList) {
                arrayList2.add(zoneAssignmentGroup.getTitle());
            }
            abstractC23461cArr[0] = abstractC51529xI6.mo3706d(arrayList2);
            abstractC23461cArr[1] = C32265Cu4.this.f4876b.mo3708b(arrayList);
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) abstractC23461cArr);
            AbstractC23461c m33074L = AbstractC23461c.m33074L(listOf);
            Intrinsics.checkNotNullExpressionValue(m33074L, "merge(listOf(\n          …ignmentGroups)\n        ))");
            return c32265Cu4.m111371K1(m33074L);
        }
    }

    public C32265Cu4(InterfaceC32967Fu4 releaseClient, AbstractC51529xI6 zoneAssignmentDao, C22454gl preferences) {
        Intrinsics.checkNotNullParameter(releaseClient, "releaseClient");
        Intrinsics.checkNotNullParameter(zoneAssignmentDao, "zoneAssignmentDao");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.f4875a = releaseClient;
        this.f4876b = zoneAssignmentDao;
        this.f4877c = preferences;
    }

    /* renamed from: L1 */
    public static final InterfaceC23496h m111370L1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: K1 */
    public AbstractC23461c m111371K1(AbstractC23461c abstractC23461c) {
        return InterfaceC31797Au4.C0301a.m114962a(this, abstractC23461c);
    }

    @Override // p000.InterfaceC31797Au4
    /* renamed from: Q0 */
    public AbstractC23461c mo111369Q0(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.f4875a.m106253b(new CappedZoneReservationCancelRequest(id));
    }

    @Override // p000.InterfaceC38466bI4
    public AbstractC23461c clear() {
        List listOf;
        listOf = CollectionsKt__CollectionsJVMKt.listOf(this.f4876b.mo3709a());
        AbstractC23461c m33074L = AbstractC23461c.m33074L(listOf);
        Intrinsics.checkNotNullExpressionValue(m33074L, "merge(listOf(\n      zone…gnmentDao.clear(),\n    ))");
        return m33074L;
    }

    @Override // p000.InterfaceC31797Au4
    /* renamed from: o0 */
    public AbstractC23461c mo111368o0() {
        AbstractC23442F<ZoneAssignmentsResponse> m106254a = this.f4875a.m106254a();
        final C1227a c1227a = new C1227a();
        AbstractC23461c m33164B = m106254a.m33164B(new InterfaceC23492o() { // from class: Bu4
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m111370L1;
                m111370L1 = C32265Cu4.m111370L1(Function1.this, obj);
                return m111370L1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchZoneAs…learOnError()\n      }\n  }");
        return m33164B;
    }

    @Override // p000.InterfaceC31797Au4
    /* renamed from: z0 */
    public Observable<List<ZoneAssignmentGroup>> mo111367z0() {
        return this.f4876b.mo3707c();
    }
}
