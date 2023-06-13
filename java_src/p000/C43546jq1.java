package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.FleetReportPage;
import co.bird.android.model.persistence.FleetReport;
import co.bird.android.model.persistence.FleetReportPeriod;
import co.bird.android.model.wire.WireFleetReport;
import co.bird.android.model.wire.WireFleetReportPeriod;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J$\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\r0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, m28432d2 = {"Ljq1;", "Lhq1;", "", "fleetId", "Lco/bird/android/model/persistence/FleetReportPeriod;", "period", "Lco/bird/android/model/constant/FleetReportPage;", "page", "Lio/reactivex/c;", "u", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/FleetReport;", "k0", "", "x1", "clear", "Lvp1;", C17296a.f69688o, "Lvp1;", "fleetReportClient", "Lzp1;", "b", "Lzp1;", "fleetReportDao", "LNp1;", "c", "LNp1;", "fleetReportPeriodDao", "<init>", "(Lvp1;Lzp1;LNp1;)V", DateTokenConverter.CONVERTER_KEY, "co.bird.android.repository.fleet-report"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFleetReportRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetReportRepositoryImpl.kt\nco/bird/android/repository/fleetreport/FleetReportRepositoryImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1#2:71\n*E\n"})
/* renamed from: jq1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43546jq1 implements InterfaceC42360hq1 {

    /* renamed from: d */
    public static final C25030a f93421d = new C25030a(null);

    /* renamed from: e */
    public static final DateTimeFormatter f93422e = ISODateTimeFormat.dateTime();

    /* renamed from: a */
    public final InterfaceC50650vp1 f93423a;

    /* renamed from: b */
    public final AbstractC53022zp1 f93424b;

    /* renamed from: c */
    public final AbstractC34791Np1 f93425c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"Ljq1$a;", "", "Lorg/joda/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "isoDateFormatter", "Lorg/joda/time/format/DateTimeFormatter;", "<init>", "()V", "co.bird.android.repository.fleet-report"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: jq1$a */
    /* loaded from: classes4.dex */
    public static final class C25030a {
        public /* synthetic */ C25030a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C25030a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/model/wire/WireFleetReport;", "report", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/wire/WireFleetReport;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nFleetReportRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetReportRepositoryImpl.kt\nco/bird/android/repository/fleetreport/FleetReportRepositoryImpl$fetchFleetReport$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,70:1\n1549#2:71\n1620#2,3:72\n37#3,2:75\n*S KotlinDebug\n*F\n+ 1 FleetReportRepositoryImpl.kt\nco/bird/android/repository/fleetreport/FleetReportRepositoryImpl$fetchFleetReport$3\n*L\n42#1:71\n42#1:72,3\n42#1:75,2\n*E\n"})
    /* renamed from: jq1$b */
    /* loaded from: classes4.dex */
    public static final class C25031b extends Lambda implements Function1<WireFleetReport, InterfaceC23496h> {

        /* renamed from: h */
        public final /* synthetic */ String f93427h;

        /* renamed from: i */
        public final /* synthetic */ FleetReportPage f93428i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25031b(String str, FleetReportPage fleetReportPage) {
            super(1);
            this.f93427h = str;
            this.f93428i = fleetReportPage;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(WireFleetReport report) {
            int collectionSizeOrDefault;
            List listOf;
            Intrinsics.checkNotNullParameter(report, "report");
            AbstractC23461c[] abstractC23461cArr = new AbstractC23461c[2];
            abstractC23461cArr[0] = C43546jq1.this.f93424b.mo400c(C51243wp1.m6300a(report, this.f93427h, this.f93428i));
            AbstractC34791Np1 abstractC34791Np1 = C43546jq1.this.f93425c;
            List<WireFleetReportPeriod> periodOptions = report.getPeriodOptions();
            String str = this.f93427h;
            FleetReportPage fleetReportPage = this.f93428i;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(periodOptions, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireFleetReportPeriod wireFleetReportPeriod : periodOptions) {
                arrayList.add(C51243wp1.m6299b(wireFleetReportPeriod, str, fleetReportPage));
            }
            FleetReportPeriod[] fleetReportPeriodArr = (FleetReportPeriod[]) arrayList.toArray(new FleetReportPeriod[0]);
            abstractC23461cArr[1] = abstractC34791Np1.mo91322b((FleetReportPeriod[]) Arrays.copyOf(fleetReportPeriodArr, fleetReportPeriodArr.length));
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) abstractC23461cArr);
            return AbstractC23461c.m33074L(listOf);
        }
    }

    public C43546jq1(InterfaceC50650vp1 fleetReportClient, AbstractC53022zp1 fleetReportDao, AbstractC34791Np1 fleetReportPeriodDao) {
        Intrinsics.checkNotNullParameter(fleetReportClient, "fleetReportClient");
        Intrinsics.checkNotNullParameter(fleetReportDao, "fleetReportDao");
        Intrinsics.checkNotNullParameter(fleetReportPeriodDao, "fleetReportPeriodDao");
        this.f93423a = fleetReportClient;
        this.f93424b = fleetReportDao;
        this.f93425c = fleetReportPeriodDao;
    }

    /* renamed from: K1 */
    public static final InterfaceC23496h m29851K1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC38466bI4
    public AbstractC23461c clear() {
        List listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{this.f93424b.mo402a(), this.f93425c.mo91323a()});
        AbstractC23461c m33074L = AbstractC23461c.m33074L(listOf);
        Intrinsics.checkNotNullExpressionValue(m33074L, "merge(listOf(\n      flee…PeriodDao.clear(),\n    ))");
        return m33074L;
    }

    @Override // p000.InterfaceC42360hq1
    /* renamed from: k0 */
    public Observable<FleetReport> mo29850k0(String fleetId, FleetReportPeriod period, FleetReportPage fleetReportPage) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(period, "period");
        return this.f93424b.mo401b(fleetId, period, fleetReportPage);
    }

    @Override // p000.InterfaceC42360hq1
    /* renamed from: u */
    public AbstractC23461c mo29849u(String fleetId, FleetReportPeriod fleetReportPeriod, FleetReportPage page) {
        String str;
        String str2;
        String str3;
        DateTime endDate;
        DateTime withZone;
        DateTime startDate;
        DateTime withZone2;
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(page, "page");
        InterfaceC50650vp1 interfaceC50650vp1 = this.f93423a;
        if (fleetReportPeriod != null && (startDate = fleetReportPeriod.getStartDate()) != null && (withZone2 = startDate.withZone(DateTimeZone.UTC)) != null) {
            DateTimeFormatter isoDateFormatter = f93422e;
            Intrinsics.checkNotNullExpressionValue(isoDateFormatter, "isoDateFormatter");
            str = isoDateFormatter.print(withZone2);
        } else {
            str = null;
        }
        if (fleetReportPeriod != null && (endDate = fleetReportPeriod.getEndDate()) != null && (withZone = endDate.withZone(DateTimeZone.UTC)) != null) {
            DateTimeFormatter isoDateFormatter2 = f93422e;
            Intrinsics.checkNotNullExpressionValue(isoDateFormatter2, "isoDateFormatter");
            str2 = isoDateFormatter2.print(withZone);
        } else {
            str2 = null;
        }
        if (fleetReportPeriod != null) {
            str3 = fleetReportPeriod.getGranularity();
        } else {
            str3 = null;
        }
        AbstractC23442F<WireFleetReport> m7973a = interfaceC50650vp1.m7973a(fleetId, str, str2, str3, page);
        final C25031b c25031b = new C25031b(fleetId, page);
        AbstractC23461c m33164B = m7973a.m33164B(new InterfaceC23492o() { // from class: iq1
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m29851K1;
                m29851K1 = C43546jq1.m29851K1(Function1.this, obj);
                return m29851K1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchFleetR…))\n        ))\n      }\n  }");
        return m33164B;
    }

    @Override // p000.InterfaceC42360hq1
    /* renamed from: x1 */
    public Observable<List<FleetReportPeriod>> mo29848x1(String fleetId, FleetReportPage page) {
        Intrinsics.checkNotNullParameter(fleetId, "fleetId");
        Intrinsics.checkNotNullParameter(page, "page");
        return this.f93425c.mo91321c(fleetId, page);
    }
}
