package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.OperatorNotification;
import com.facebook.share.internal.C17296a;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.LocalDate;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f2\u00020\u0001:\u0001\u0006B\u0011\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\r"}, m28432d2 = {"Lsa3;", "", "", "Lco/bird/android/model/OperatorNotification;", "notifications", "LH6;", C17296a.f69688o, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "b", "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNotificationCenterConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCenterConverter.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/NotificationCenterConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,63:1\n1477#2:64\n1502#2,3:65\n1505#2,3:75\n1054#2:81\n1549#2:82\n1620#2,3:83\n361#3,7:68\n125#4:78\n152#4,2:79\n154#4:86\n*S KotlinDebug\n*F\n+ 1 NotificationCenterConverter.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/NotificationCenterConverter\n*L\n31#1:64\n31#1:65,3\n31#1:75,3\n35#1:81\n36#1:82\n36#1:83,3\n31#1:68,7\n32#1:78\n32#1:79,2\n32#1:86\n*E\n"})
/* renamed from: sa3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48724sa3 {

    /* renamed from: b */
    public static final C28355a f109006b = new C28355a(null);

    /* renamed from: c */
    public static final SimpleDateFormat f109007c = new SimpleDateFormat("EEE, MMMM dd", Locale.getDefault());

    /* renamed from: d */
    public static final DateFormat f109008d = DateFormat.getTimeInstance(3);

    /* renamed from: a */
    public final Context f109009a;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m28432d2 = {"Lsa3$a;", "", "Ljava/text/SimpleDateFormat;", "DATE_FORMATTER", "Ljava/text/SimpleDateFormat;", "Ljava/text/DateFormat;", "kotlin.jvm.PlatformType", "TIME_FORMATTER", "Ljava/text/DateFormat;", "<init>", "()V", "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: sa3$a */
    /* loaded from: classes3.dex */
    public static final class C28355a {
        public /* synthetic */ C28355a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C28355a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 NotificationCenterConverter.kt\nco/bird/android/feature/notificationcenter/fragment/adapters/NotificationCenterConverter\n*L\n1#1,328:1\n35#2:329\n*E\n"})
    /* renamed from: sa3$b */
    /* loaded from: classes3.dex */
    public static final class C28356b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(((OperatorNotification) t2).getDate(), ((OperatorNotification) t).getDate());
            return compareValues;
        }
    }

    public C48724sa3(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f109009a = context;
    }

    /* renamed from: a */
    public final List<C3023H6> m13978a(List<? extends OperatorNotification> notifications) {
        Object first;
        List sortedWith;
        int collectionSizeOrDefault;
        List mutableList;
        String string;
        String format;
        Intrinsics.checkNotNullParameter(notifications, "notifications");
        LocalDate localDate = DateTime.now().toLocalDate();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : notifications) {
            Integer valueOf = Integer.valueOf(Days.daysBetween(localDate, ((OperatorNotification) obj).getDate().toLocalDate()).getDays());
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            List list = (List) entry.getValue();
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) list);
            DateTime date = ((OperatorNotification) first).getDate();
            sortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new C28356b());
            List<OperatorNotification> list2 = sortedWith;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (OperatorNotification operatorNotification : list2) {
                if (intValue == 0) {
                    format = C46880pT0.getElapsedTime$default(operatorNotification.getDate(), this.f109009a, false, 2, null);
                } else {
                    format = f109008d.format(operatorNotification.getDate().toDate());
                }
                arrayList2.add(new C2637G6(TuplesKt.m28425to(operatorNotification, format), C48815sj4.item_notification, false, 4, null));
            }
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
            int abs = Math.abs(intValue);
            if (abs != 0) {
                if (abs != 1) {
                    string = f109007c.format(date.toDate());
                } else {
                    string = this.f109009a.getString(C45871nl4.yesterday);
                }
            } else {
                string = this.f109009a.getString(C45871nl4.today);
            }
            arrayList.add(new C3023H6(mutableList, new C2637G6(string, C48815sj4.item_date_header, false, 4, null), null, 4, null));
        }
        return arrayList;
    }
}
