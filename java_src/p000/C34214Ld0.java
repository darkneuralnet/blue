package p000;

import co.bird.api.response.CannotAccessReportResponse;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\t"}, m28432d2 = {"LLd0;", "", "", "Lco/bird/api/response/CannotAccessReportResponse;", "reports", "LH6;", C17296a.f69688o, "<init>", "()V", "co.bird.android.feature.cannotaccess"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCannotAccessReportsConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CannotAccessReportsConverter.kt\nco/bird/android/feature/cannotaccess/reports/adapters/CannotAccessReportsConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,49:1\n1549#2:50\n1620#2,2:51\n1622#2:54\n1#3:53\n*S KotlinDebug\n*F\n+ 1 CannotAccessReportsConverter.kt\nco/bird/android/feature/cannotaccess/reports/adapters/CannotAccessReportsConverter\n*L\n17#1:50\n17#1:51,2\n17#1:54\n*E\n"})
/* renamed from: Ld0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34214Ld0 {

    /* renamed from: a */
    public static final C5046a f21813a = new C5046a(null);

    /* renamed from: b */
    public static final DateTimeFormatter f21814b = DateTimeFormat.shortTime();

    /* renamed from: c */
    public static final DateTimeFormatter f21815c = DateTimeFormat.forPattern("YYYY-MM-dd");

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005¨\u0006\t"}, m28432d2 = {"LLd0$a;", "", "Lorg/joda/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "DATE_FORMATTER", "Lorg/joda/time/format/DateTimeFormatter;", "TIME_FORMATTER", "<init>", "()V", "co.bird.android.feature.cannotaccess"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Ld0$a */
    /* loaded from: classes3.dex */
    public static final class C5046a {
        public /* synthetic */ C5046a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C5046a() {
        }
    }

    /* renamed from: a */
    public final List<C3023H6> m96539a(List<CannotAccessReportResponse> reports) {
        int collectionSizeOrDefault;
        C2637G6 c2637g6;
        C2637G6 c2637g62;
        C2637G6 c2637g63;
        List<String> list;
        List listOfNotNull;
        List mutableList;
        Intrinsics.checkNotNullParameter(reports, "reports");
        List<CannotAccessReportResponse> list2 = reports;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (CannotAccessReportResponse cannotAccessReportResponse : list2) {
            C2637G6[] c2637g6Arr = new C2637G6[4];
            DateTime reportDate = cannotAccessReportResponse.getReportDate();
            if (reportDate != null) {
                c2637g6 = new C2637G6(f21814b.print(reportDate) + " " + f21815c.print(reportDate), C36135Ti4.item_cannot_access_report_date, false, 4, null);
            } else {
                c2637g6 = null;
            }
            boolean z = false;
            c2637g6Arr[0] = c2637g6;
            String reasonTitle = cannotAccessReportResponse.getReasonTitle();
            if (reasonTitle != null) {
                c2637g62 = new C2637G6(reasonTitle, C36135Ti4.item_cannot_access_report_detail, false, 4, null);
            } else {
                c2637g62 = null;
            }
            c2637g6Arr[1] = c2637g62;
            String notes = cannotAccessReportResponse.getNotes();
            if (notes != null) {
                c2637g63 = new C2637G6(notes, C36135Ti4.item_cannot_access_report_detail, false, 4, null);
            } else {
                c2637g63 = null;
            }
            c2637g6Arr[2] = c2637g63;
            List<String> photoUrls = cannotAccessReportResponse.getPhotoUrls();
            List<String> list3 = photoUrls;
            if (!((list3 == null || list3.isEmpty()) ? true : true)) {
                list = photoUrls;
            } else {
                list = null;
            }
            c2637g6Arr[3] = new C2637G6(list, C36135Ti4.item_cannot_access_report_image_carousel, false, 4, null);
            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) c2637g6Arr);
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) listOfNotNull);
            arrayList.add(new C3023H6(mutableList, null, null, 6, null));
        }
        return arrayList;
    }
}
