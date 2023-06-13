package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.OperatorNotification;
import co.bird.android.model.persistence.Notification;
import co.bird.android.model.persistence.NotificationGroup;
import co.bird.android.model.persistence.OperatorNotificationCategory;
import co.bird.android.model.wire.WireNotification;
import co.bird.android.model.wire.WireNotificationGroup;
import co.bird.android.model.wire.WireOperatorNotificationCategory;
import co.bird.api.request.NotificationCenterRequest;
import co.bird.api.response.NotificationCategoriesResponse;
import co.bird.api.response.NotificationCenterResponse;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.PaymentMethodOptionsParams;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23480c;
import io.reactivex.functions.InterfaceC23492o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
import p000.InterfaceC40433eb3;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060\nH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00060\nH\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00060\n2\u0006\u0010\u0012\u001a\u00020\u0007H\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, m28432d2 = {"Lmb3;", "Leb3;", "Lio/reactivex/c;", "b", "", "fetchLatest", "", "", "categories", "P", "Lio/reactivex/Observable;", "Lco/bird/android/model/persistence/OperatorNotificationCategory;", "g0", "Lco/bird/android/model/OperatorNotification;", "w", "id", "Lco/bird/android/model/persistence/Notification;", "l", "groupId", "Lco/bird/android/model/OperatorNotification$Notification;", "j0", "clear", "Loa3;", C17296a.f69688o, "Loa3;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "Lro3;", "Lro3;", "categoryDao", "LBc3;", "c", "LBc3;", "notificationDao", "LPc3;", DateTokenConverter.CONVERTER_KEY, "LPc3;", "notificationGroupDao", "<init>", "(Loa3;Lro3;LBc3;LPc3;)V", "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: mb3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C45177mb3 implements InterfaceC40433eb3 {

    /* renamed from: a */
    public final InterfaceC46353oa3 f98385a;

    /* renamed from: b */
    public final AbstractC48272ro3 f98386b;

    /* renamed from: c */
    public final AbstractC31868Bc3 f98387c;

    /* renamed from: d */
    public final AbstractC35144Pc3 f98388d;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/NotificationCategoriesResponse;", "wireCategories", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/NotificationCategoriesResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNotificationCenterRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCenterRepositoryImpl.kt\nco/bird/android/repository/notificationcenter/NotificationCenterRepositoryImpl$fetchCategories$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,102:1\n1549#2:103\n1620#2,3:104\n37#3,2:107\n*S KotlinDebug\n*F\n+ 1 NotificationCenterRepositoryImpl.kt\nco/bird/android/repository/notificationcenter/NotificationCenterRepositoryImpl$fetchCategories$1\n*L\n28#1:103\n28#1:104,3\n29#1:107,2\n*E\n"})
    /* renamed from: mb3$a */
    /* loaded from: classes4.dex */
    public static final class C26130a extends Lambda implements Function1<NotificationCategoriesResponse, InterfaceC23496h> {
        public C26130a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(NotificationCategoriesResponse wireCategories) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(wireCategories, "wireCategories");
            List<WireOperatorNotificationCategory> categories = wireCategories.getCategories();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(categories, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireOperatorNotificationCategory wireOperatorNotificationCategory : categories) {
                arrayList.add(C48132ra3.m15746e(wireOperatorNotificationCategory));
            }
            AbstractC48272ro3 abstractC48272ro3 = C45177mb3.this.f98386b;
            OperatorNotificationCategory[] operatorNotificationCategoryArr = (OperatorNotificationCategory[]) arrayList.toArray(new OperatorNotificationCategory[0]);
            return abstractC48272ro3.mo13624a((OperatorNotificationCategory[]) Arrays.copyOf(operatorNotificationCategoryArr, operatorNotificationCategoryArr.length));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lorg/joda/time/DateTime;", "date", "Lio/reactivex/u;", "Lco/bird/api/response/NotificationCenterResponse;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lorg/joda/time/DateTime;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mb3$b */
    /* loaded from: classes4.dex */
    public static final class C26131b extends Lambda implements Function1<DateTime, InterfaceC24574u<? extends NotificationCenterResponse>> {

        /* renamed from: h */
        public final /* synthetic */ List<String> f98391h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C26131b(List<String> list) {
            super(1);
            this.f98391h = list;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC24574u<? extends NotificationCenterResponse> invoke(DateTime date) {
            Intrinsics.checkNotNullParameter(date, "date");
            return C45177mb3.this.f98385a.m20827b(new NotificationCenterRequest(this.f98391h, date, null, 4, null)).m33125j0();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/api/response/NotificationCenterResponse;", "response", "Lio/reactivex/h;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/api/response/NotificationCenterResponse;)Lio/reactivex/h;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNotificationCenterRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCenterRepositoryImpl.kt\nco/bird/android/repository/notificationcenter/NotificationCenterRepositoryImpl$fetchOperatorNotifications$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,102:1\n1549#2:103\n1620#2,3:104\n1549#2:107\n1620#2,3:108\n37#3,2:111\n37#3,2:113\n*S KotlinDebug\n*F\n+ 1 NotificationCenterRepositoryImpl.kt\nco/bird/android/repository/notificationcenter/NotificationCenterRepositoryImpl$fetchOperatorNotifications$2\n*L\n52#1:103\n52#1:104,3\n53#1:107\n53#1:108,3\n56#1:111,2\n57#1:113,2\n*E\n"})
    /* renamed from: mb3$c */
    /* loaded from: classes4.dex */
    public static final class C26132c extends Lambda implements Function1<NotificationCenterResponse, InterfaceC23496h> {
        public C26132c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23496h invoke(NotificationCenterResponse response) {
            int collectionSizeOrDefault;
            int collectionSizeOrDefault2;
            List listOf;
            Intrinsics.checkNotNullParameter(response, "response");
            List<WireNotificationGroup> groups = response.getGroups();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(groups, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (WireNotificationGroup wireNotificationGroup : groups) {
                arrayList.add(C48132ra3.m15747d(wireNotificationGroup));
            }
            List<WireNotification> notifications = response.getNotifications();
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(notifications, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
            for (WireNotification wireNotification : notifications) {
                arrayList2.add(C48132ra3.m15748c(wireNotification));
            }
            C45177mb3 c45177mb3 = C45177mb3.this;
            AbstractC35144Pc3 abstractC35144Pc3 = c45177mb3.f98388d;
            NotificationGroup[] notificationGroupArr = (NotificationGroup[]) arrayList.toArray(new NotificationGroup[0]);
            AbstractC31868Bc3 abstractC31868Bc3 = C45177mb3.this.f98387c;
            Notification[] notificationArr = (Notification[]) arrayList2.toArray(new Notification[0]);
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{abstractC35144Pc3.mo88340b((NotificationGroup[]) Arrays.copyOf(notificationGroupArr, notificationGroupArr.length)), abstractC31868Bc3.mo112049c((Notification[]) Arrays.copyOf(notificationArr, notificationArr.length))});
            AbstractC23461c m33037r = AbstractC23461c.m33037r(listOf);
            Intrinsics.checkNotNullExpressionValue(m33037r, "concat(listOf(\n         …oTypedArray())\n        ))");
            return c45177mb3.m25363Q1(m33037r);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/NotificationGroup;", "groups", "Lco/bird/android/model/OperatorNotification$NotificationGroup;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNotificationCenterRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCenterRepositoryImpl.kt\nco/bird/android/repository/notificationcenter/NotificationCenterRepositoryImpl$streamOperatorNotifications$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n1549#2:103\n1620#2,3:104\n*S KotlinDebug\n*F\n+ 1 NotificationCenterRepositoryImpl.kt\nco/bird/android/repository/notificationcenter/NotificationCenterRepositoryImpl$streamOperatorNotifications$1\n*L\n71#1:103\n71#1:104,3\n*E\n"})
    /* renamed from: mb3$d */
    /* loaded from: classes4.dex */
    public static final class C26133d extends Lambda implements Function1<List<? extends NotificationGroup>, List<? extends OperatorNotification.NotificationGroup>> {

        /* renamed from: g */
        public static final C26133d f98393g = new C26133d();

        public C26133d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<OperatorNotification.NotificationGroup> invoke(List<NotificationGroup> groups) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(groups, "groups");
            List<NotificationGroup> list = groups;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (NotificationGroup notificationGroup : list) {
                arrayList.add(C48132ra3.m15749b(notificationGroup));
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/Notification;", "notifications", "Lco/bird/android/model/OperatorNotification$Notification;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNotificationCenterRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCenterRepositoryImpl.kt\nco/bird/android/repository/notificationcenter/NotificationCenterRepositoryImpl$streamOperatorNotifications$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n1549#2:103\n1620#2,3:104\n*S KotlinDebug\n*F\n+ 1 NotificationCenterRepositoryImpl.kt\nco/bird/android/repository/notificationcenter/NotificationCenterRepositoryImpl$streamOperatorNotifications$2\n*L\n75#1:103\n75#1:104,3\n*E\n"})
    /* renamed from: mb3$e */
    /* loaded from: classes4.dex */
    public static final class C26134e extends Lambda implements Function1<List<? extends Notification>, List<? extends OperatorNotification.Notification>> {

        /* renamed from: g */
        public static final C26134e f98394g = new C26134e();

        public C26134e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<OperatorNotification.Notification> invoke(List<Notification> notifications) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(notifications, "notifications");
            List<Notification> list = notifications;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Notification notification : list) {
                arrayList.add(C48132ra3.m15750a(notification));
            }
            return arrayList;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Lco/bird/android/model/OperatorNotification$NotificationGroup;", "notificationGroups", "Lco/bird/android/model/OperatorNotification$Notification;", "notifications", "Lco/bird/android/model/OperatorNotification;", C17296a.f69688o, "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNotificationCenterRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCenterRepositoryImpl.kt\nco/bird/android/repository/notificationcenter/NotificationCenterRepositoryImpl$streamOperatorNotifications$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n1054#2:103\n*S KotlinDebug\n*F\n+ 1 NotificationCenterRepositoryImpl.kt\nco/bird/android/repository/notificationcenter/NotificationCenterRepositoryImpl$streamOperatorNotifications$3\n*L\n80#1:103\n*E\n"})
    /* renamed from: mb3$f */
    /* loaded from: classes4.dex */
    public static final class C26135f extends Lambda implements Function2<List<? extends OperatorNotification.NotificationGroup>, List<? extends OperatorNotification.Notification>, List<? extends OperatorNotification>> {

        /* renamed from: g */
        public static final C26135f f98395g = new C26135f();

        @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 NotificationCenterRepositoryImpl.kt\nco/bird/android/repository/notificationcenter/NotificationCenterRepositoryImpl$streamOperatorNotifications$3\n*L\n1#1,328:1\n80#2:329\n*E\n"})
        /* renamed from: mb3$f$a */
        /* loaded from: classes4.dex */
        public static final class C26136a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int compareValues;
                compareValues = ComparisonsKt__ComparisonsKt.compareValues(((OperatorNotification) t2).getDate(), ((OperatorNotification) t).getDate());
                return compareValues;
            }
        }

        public C26135f() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final List<OperatorNotification> invoke(List<OperatorNotification.NotificationGroup> notificationGroups, List<OperatorNotification.Notification> notifications) {
            List plus;
            List<OperatorNotification> sortedWith;
            Intrinsics.checkNotNullParameter(notificationGroups, "notificationGroups");
            Intrinsics.checkNotNullParameter(notifications, "notifications");
            plus = CollectionsKt___CollectionsKt.plus((Collection) notificationGroups, (Iterable) notifications);
            sortedWith = CollectionsKt___CollectionsKt.sortedWith(plus, new C26136a());
            return sortedWith;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00000\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "Lco/bird/android/model/persistence/Notification;", "notifications", "Lco/bird/android/model/OperatorNotification$Notification;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Ljava/util/List;)Ljava/util/List;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nNotificationCenterRepositoryImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCenterRepositoryImpl.kt\nco/bird/android/repository/notificationcenter/NotificationCenterRepositoryImpl$streamOperatorNotificationsByGroupId$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n1549#2:103\n1620#2,3:104\n*S KotlinDebug\n*F\n+ 1 NotificationCenterRepositoryImpl.kt\nco/bird/android/repository/notificationcenter/NotificationCenterRepositoryImpl$streamOperatorNotificationsByGroupId$1\n*L\n91#1:103\n91#1:104,3\n*E\n"})
    /* renamed from: mb3$g */
    /* loaded from: classes4.dex */
    public static final class C26137g extends Lambda implements Function1<List<? extends Notification>, List<? extends OperatorNotification.Notification>> {

        /* renamed from: g */
        public static final C26137g f98396g = new C26137g();

        public C26137g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<OperatorNotification.Notification> invoke(List<Notification> notifications) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(notifications, "notifications");
            List<Notification> list = notifications;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (Notification notification : list) {
                arrayList.add(C48132ra3.m15750a(notification));
            }
            return arrayList;
        }
    }

    public C45177mb3(InterfaceC46353oa3 client, AbstractC48272ro3 categoryDao, AbstractC31868Bc3 notificationDao, AbstractC35144Pc3 notificationGroupDao) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(categoryDao, "categoryDao");
        Intrinsics.checkNotNullParameter(notificationDao, "notificationDao");
        Intrinsics.checkNotNullParameter(notificationGroupDao, "notificationGroupDao");
        this.f98385a = client;
        this.f98386b = categoryDao;
        this.f98387c = notificationDao;
        this.f98388d = notificationGroupDao;
    }

    /* renamed from: R1 */
    public static final InterfaceC23496h m25362R1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: S1 */
    public static final InterfaceC24574u m25361S1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: T1 */
    public static final InterfaceC23496h m25360T1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23496h) tmp0.invoke(obj);
    }

    /* renamed from: U1 */
    public static final List m25359U1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: V1 */
    public static final List m25358V1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    /* renamed from: W1 */
    public static final List m25357W1(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj, obj2);
    }

    /* renamed from: X1 */
    public static final List m25356X1(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (List) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC40433eb3
    /* renamed from: P */
    public AbstractC23461c mo25365P(boolean z, List<String> list) {
        AbstractC23442F<NotificationCenterResponse> m32053W;
        if (z) {
            m32053W = this.f98385a.m20827b(new NotificationCenterRequest(list, null, null, 6, null));
        } else {
            AbstractC24507p<DateTime> mo112050b = this.f98387c.mo112050b();
            final C26131b c26131b = new C26131b(list);
            m32053W = mo112050b.m32021x(new InterfaceC23492o() { // from class: fb3
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m25361S1;
                    m25361S1 = C45177mb3.m25361S1(Function1.this, obj);
                    return m25361S1;
                }
            }).m32053W(this.f98385a.m20827b(new NotificationCenterRequest(null, null, null, 7, null)));
        }
        final C26132c c26132c = new C26132c();
        AbstractC23461c m33164B = m32053W.m33164B(new InterfaceC23492o() { // from class: gb3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m25360T1;
                m25360T1 = C45177mb3.m25360T1(Function1.this, obj);
                return m25360T1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchOperat…learOnError()\n      }\n  }");
        return m33164B;
    }

    /* renamed from: Q1 */
    public AbstractC23461c m25363Q1(AbstractC23461c abstractC23461c) {
        return InterfaceC40433eb3.C20077a.m42729a(this, abstractC23461c);
    }

    @Override // p000.InterfaceC40433eb3
    /* renamed from: b */
    public AbstractC23461c mo25355b() {
        AbstractC23442F<NotificationCategoriesResponse> m20828a = this.f98385a.m20828a();
        final C26130a c26130a = new C26130a();
        AbstractC23461c m33164B = m20828a.m33164B(new InterfaceC23492o() { // from class: hb3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m25362R1;
                m25362R1 = C45177mb3.m25362R1(Function1.this, obj);
                return m25362R1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33164B, "override fun fetchCatego…TypedArray())\n      }\n  }");
        return m33164B;
    }

    @Override // p000.InterfaceC38466bI4
    public AbstractC23461c clear() {
        List listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new AbstractC23461c[]{this.f98388d.mo88341a(), this.f98387c.mo112051a()});
        AbstractC23461c m33037r = AbstractC23461c.m33037r(listOf);
        Intrinsics.checkNotNullExpressionValue(m33037r, "concat(listOf(\n      not…icationDao.clear()\n    ))");
        return m33037r;
    }

    @Override // p000.InterfaceC40433eb3
    /* renamed from: g0 */
    public Observable<List<OperatorNotificationCategory>> mo25354g0() {
        return this.f98386b.mo13623b();
    }

    @Override // p000.InterfaceC40433eb3
    /* renamed from: j0 */
    public Observable<List<OperatorNotification.Notification>> mo25353j0(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Observable<List<Notification>> mo112047e = this.f98387c.mo112047e(groupId);
        final C26137g c26137g = C26137g.f98396g;
        Observable map = mo112047e.map(new InterfaceC23492o() { // from class: ib3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m25356X1;
                m25356X1 = C45177mb3.m25356X1(Function1.this, obj);
                return m25356X1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "notificationDao.streamNo…rNotification() }\n      }");
        return map;
    }

    @Override // p000.InterfaceC40433eb3
    /* renamed from: l */
    public Observable<Notification> mo25352l(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return this.f98387c.mo112048d(id);
    }

    @Override // p000.InterfaceC40433eb3
    /* renamed from: w */
    public Observable<List<OperatorNotification>> mo25351w() {
        Observable<List<NotificationGroup>> mo88339c = this.f98388d.mo88339c();
        final C26133d c26133d = C26133d.f98393g;
        InterfaceC23434B map = mo88339c.map(new InterfaceC23492o() { // from class: jb3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m25359U1;
                m25359U1 = C45177mb3.m25359U1(Function1.this, obj);
                return m25359U1;
            }
        });
        Observable<List<Notification>> mo112046f = this.f98387c.mo112046f();
        final C26134e c26134e = C26134e.f98394g;
        InterfaceC23434B map2 = mo112046f.map(new InterfaceC23492o() { // from class: kb3
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                List m25358V1;
                m25358V1 = C45177mb3.m25358V1(Function1.this, obj);
                return m25358V1;
            }
        });
        final C26135f c26135f = C26135f.f98395g;
        Observable<List<OperatorNotification>> combineLatest = Observable.combineLatest(map, map2, new InterfaceC23480c() { // from class: lb3
            @Override // io.reactivex.functions.InterfaceC23480c
            public final Object apply(Object obj, Object obj2) {
                List m25357W1;
                m25357W1 = C45177mb3.m25357W1(Function2.this, obj, obj2);
                return m25357W1;
            }
        });
        Intrinsics.checkNotNullExpressionValue(combineLatest, "combineLatest(\n      not…notification.date }\n    }");
        return combineLatest;
    }
}
