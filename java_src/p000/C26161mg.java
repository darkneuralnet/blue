package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.AnnouncementContext;
import co.bird.android.model.constant.AnnouncementDisplayType;
import co.bird.android.model.persistence.Announcement;
import co.bird.android.model.wire.WireAnnouncement;
import co.bird.api.request.AnnouncementsSeenBody;
import co.bird.api.response.AnnouncementsResponse;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23496h;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.InterfaceC24980jg;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"Lmg;", "Ljg;", "Lio/reactivex/c;", "p", "Lco/bird/android/model/constant/AnnouncementContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/Announcement;", "b0", "F", "", "announcementId", "q", "e1", "clear", "Lpg;", C17296a.f69688o, "Lpg;", "announcementClient", "Leg;", "b", "Leg;", "announcementDao", "<init>", "(Lpg;Leg;)V", "co.bird.android.repository.announcement"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: mg */
/* loaded from: classes4.dex */
public final class C26161mg implements InterfaceC24980jg {

    /* renamed from: a */
    public final InterfaceC27326pg f98537a;

    /* renamed from: b */
    public final AbstractC20087eg f98538b;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/AnnouncementsResponse;", "response", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/AnnouncementsResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAnnouncementRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnouncementRepositoryImpl.kt\nco/bird/android/repository/announcement/AnnouncementRepositoryImpl$fetchAnnouncements$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,62:1\n1549#2:63\n1620#2,3:64\n1549#2:67\n1620#2,3:68\n37#3,2:71\n*S KotlinDebug\n*F\n+ 1 AnnouncementRepositoryImpl.kt\nco/bird/android/repository/announcement/AnnouncementRepositoryImpl$fetchAnnouncements$1\n*L\n24#1:63\n24#1:64,3\n28#1:67\n28#1:68,3\n28#1:71,2\n*E\n"})
    /* renamed from: mg$a */
    /* loaded from: classes4.dex */
    public static final class C26162a extends Lambda implements Function1<AnnouncementsResponse, InterfaceC23496h> {
        public C26162a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(AnnouncementsResponse response) {
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            List listOf;
            Intrinsics.checkNotNullParameter(response, "response");
            List<WireAnnouncement> announcements = response.getAnnouncements();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(announcements, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireAnnouncement wireAnnouncement : announcements) {
                arrayList.add(wireAnnouncement.getId());
            }
            AbstractC23461c[] abstractC23461cArr = new AbstractC23461c[2];
            abstractC23461cArr[0] = C26161mg.this.f98538b.mo41056e(arrayList);
            AbstractC20087eg abstractC20087eg = C26161mg.this.f98538b;
            List<WireAnnouncement> announcements2 = response.getAnnouncements();
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(announcements2, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            for (WireAnnouncement wireAnnouncement2 : announcements2) {
                arrayList2.add(C10806ag.m70903a(wireAnnouncement2));
            }
            Announcement[] announcementArr = (Announcement[]) arrayList2.toArray(new Announcement[0]);
            abstractC23461cArr[1] = abstractC20087eg.mo41057d((Announcement[]) Arrays.copyOf(announcementArr, announcementArr.length));
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) abstractC23461cArr);
            return AbstractC23461c.m33037r(listOf);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0003*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "Lco/bird/android/model/persistence/Announcement;", "announcements", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAnnouncementRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnouncementRepositoryImpl.kt\nco/bird/android/repository/announcement/AnnouncementRepositoryImpl$streamGenericBannerAnnouncements$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n766#2:63\n857#2,2:64\n*S KotlinDebug\n*F\n+ 1 AnnouncementRepositoryImpl.kt\nco/bird/android/repository/announcement/AnnouncementRepositoryImpl$streamGenericBannerAnnouncements$1\n*L\n43#1:63\n43#1:64,2\n*E\n"})
    /* renamed from: mg$b */
    /* loaded from: classes4.dex */
    public static final class C26163b extends Lambda implements Function1<List<? extends Announcement>, List<? extends Announcement>> {

        /* renamed from: g */
        public static final C26163b f98540g = new C26163b();

        public C26163b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<Announcement> invoke(List<Announcement> announcements) {
            Intrinsics.checkNotNullParameter(announcements, "announcements");
            ArrayList arrayList = new ArrayList();
            for (Object obj : announcements) {
                if (((Announcement) obj).isGenericBanner()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    public C26161mg(InterfaceC27326pg announcementClient, AbstractC20087eg announcementDao) {
        Intrinsics.checkNotNullParameter(announcementClient, "announcementClient");
        Intrinsics.checkNotNullParameter(announcementDao, "announcementDao");
        this.f98537a = announcementClient;
        this.f98538b = announcementDao;
    }

    /* renamed from: M1 */
    public static final InterfaceC23496h m25195M1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: N1 */
    public static final List m25194N1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC24980jg
    /* renamed from: F */
    public Observable<List<Announcement>> mo25199F() {
        Observable<List<Announcement>> mo41059b = this.f98538b.mo41059b(AnnouncementDisplayType.BANNER);
        final C26163b c26163b = C26163b.f98540g;
        Observable map = mo41059b.map(new InterfaceC23492o() { // from class: lg
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m25194N1;
                m25194N1 = C26161mg.m25194N1(Function1.this, obj);
                return m25194N1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "announcementDao.announce…ement.isGenericBanner } }");
        return map;
    }

    /* renamed from: L1 */
    public <T> Observable<T> m25196L1(Observable<T> observable) {
        return InterfaceC24980jg.C24981a.m30126a(this, observable);
    }

    @Override // p000.InterfaceC24980jg
    /* renamed from: b0 */
    public Observable<List<Announcement>> mo25193b0(AnnouncementContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return m25196L1(this.f98538b.mo41060a(context));
    }

    @Override // p000.InterfaceC38466bI4
    public AbstractC23461c clear() {
        return mo25192e1();
    }

    @Override // p000.InterfaceC24980jg
    /* renamed from: e1 */
    public AbstractC23461c mo25192e1() {
        return this.f98538b.mo41058c();
    }

    @Override // p000.InterfaceC24980jg
    /* renamed from: p */
    public AbstractC23461c mo25191p() {
        AbstractC23442F<AnnouncementsResponse> m19002b = this.f98537a.m19002b();
        final C26162a c26162a = new C26162a();
        AbstractC23461c m33164B = m19002b.m33164B(new InterfaceC23492o() { // from class: kg
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m25195M1;
                m25195M1 = C26161mg.m25195M1(Function1.this, obj);
                return m25195M1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchAnnoun… )\n        ))\n      }\n  }");
        return m33164B;
    }

    @Override // p000.InterfaceC24980jg
    /* renamed from: q */
    public AbstractC23461c mo25190q(String announcementId) {
        Intrinsics.checkNotNullParameter(announcementId, "announcementId");
        AbstractC23461c m33049i = this.f98537a.m19003a(new AnnouncementsSeenBody(announcementId)).m33049i(mo25191p());
        Intrinsics.checkNotNullExpressionValue(m33049i, "announcementClient.annou…hen(fetchAnnouncements())");
        return m33049i;
    }
}
