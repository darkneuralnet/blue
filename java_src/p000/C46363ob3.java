package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.OperatorNotification;
import co.bird.android.model.persistence.OperatorNotificationCategory;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0003\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b&\u0010'JI\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR$\u0010%\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010!\u001a\u0004\b\u001c\u0010\"\"\u0004\b#\u0010$¨\u0006("}, m28432d2 = {"Lob3;", "", "", "enableFilters", "", "Lco/bird/android/model/OperatorNotification;", "notifications", "Lco/bird/android/model/persistence/OperatorNotificationCategory;", "selectedCategory", "categories", "", "loading", C17296a.f69688o, "", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Z", "c", "()Z", "b", "Ljava/util/List;", "f", "()Ljava/util/List;", "Lco/bird/android/model/persistence/OperatorNotificationCategory;", "g", "()Lco/bird/android/model/persistence/OperatorNotificationCategory;", DateTokenConverter.CONVERTER_KEY, "e", "I", "()I", "", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "h", "(Ljava/lang/Throwable;)V", "error", "<init>", "(ZLjava/util/List;Lco/bird/android/model/persistence/OperatorNotificationCategory;Ljava/util/List;I)V", "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ob3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46363ob3 {

    /* renamed from: a */
    public final boolean f102168a;

    /* renamed from: b */
    public final List<OperatorNotification> f102169b;

    /* renamed from: c */
    public final OperatorNotificationCategory f102170c;

    /* renamed from: d */
    public final List<OperatorNotificationCategory> f102171d;

    /* renamed from: e */
    public final int f102172e;

    /* renamed from: f */
    public Throwable f102173f;

    public C46363ob3() {
        this(false, null, null, null, 0, 31, null);
    }

    public static /* synthetic */ C46363ob3 copy$default(C46363ob3 c46363ob3, boolean z, List list, OperatorNotificationCategory operatorNotificationCategory, List list2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = c46363ob3.f102168a;
        }
        List<OperatorNotification> list3 = list;
        if ((i2 & 2) != 0) {
            list3 = c46363ob3.f102169b;
        }
        List list4 = list3;
        if ((i2 & 4) != 0) {
            operatorNotificationCategory = c46363ob3.f102170c;
        }
        OperatorNotificationCategory operatorNotificationCategory2 = operatorNotificationCategory;
        List<OperatorNotificationCategory> list5 = list2;
        if ((i2 & 8) != 0) {
            list5 = c46363ob3.f102171d;
        }
        List list6 = list5;
        if ((i2 & 16) != 0) {
            i = c46363ob3.f102172e;
        }
        return c46363ob3.m20812a(z, list4, operatorNotificationCategory2, list6, i);
    }

    /* renamed from: a */
    public final C46363ob3 m20812a(boolean z, List<? extends OperatorNotification> notifications, OperatorNotificationCategory operatorNotificationCategory, List<OperatorNotificationCategory> categories, int i) {
        Intrinsics.checkNotNullParameter(notifications, "notifications");
        Intrinsics.checkNotNullParameter(categories, "categories");
        return new C46363ob3(z, notifications, operatorNotificationCategory, categories, i);
    }

    /* renamed from: b */
    public final List<OperatorNotificationCategory> m20811b() {
        return this.f102171d;
    }

    /* renamed from: c */
    public final boolean m20810c() {
        return this.f102168a;
    }

    /* renamed from: d */
    public final Throwable m20809d() {
        return this.f102173f;
    }

    /* renamed from: e */
    public final int m20808e() {
        return this.f102172e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C46363ob3) {
            C46363ob3 c46363ob3 = (C46363ob3) obj;
            return this.f102168a == c46363ob3.f102168a && Intrinsics.areEqual(this.f102169b, c46363ob3.f102169b) && Intrinsics.areEqual(this.f102170c, c46363ob3.f102170c) && Intrinsics.areEqual(this.f102171d, c46363ob3.f102171d) && this.f102172e == c46363ob3.f102172e;
        }
        return false;
    }

    /* renamed from: f */
    public final List<OperatorNotification> m20807f() {
        return this.f102169b;
    }

    /* renamed from: g */
    public final OperatorNotificationCategory m20806g() {
        return this.f102170c;
    }

    /* renamed from: h */
    public final void m20805h(Throwable th) {
        this.f102173f = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    public int hashCode() {
        boolean z = this.f102168a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = ((r0 * 31) + this.f102169b.hashCode()) * 31;
        OperatorNotificationCategory operatorNotificationCategory = this.f102170c;
        return ((((hashCode + (operatorNotificationCategory == null ? 0 : operatorNotificationCategory.hashCode())) * 31) + this.f102171d.hashCode()) * 31) + Integer.hashCode(this.f102172e);
    }

    public String toString() {
        boolean z = this.f102168a;
        List<OperatorNotification> list = this.f102169b;
        OperatorNotificationCategory operatorNotificationCategory = this.f102170c;
        List<OperatorNotificationCategory> list2 = this.f102171d;
        int i = this.f102172e;
        return "NotificationCenterState(enableFilters=" + z + ", notifications=" + list + ", selectedCategory=" + operatorNotificationCategory + ", categories=" + list2 + ", loading=" + i + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C46363ob3(boolean z, List<? extends OperatorNotification> notifications, OperatorNotificationCategory operatorNotificationCategory, List<OperatorNotificationCategory> categories, int i) {
        Intrinsics.checkNotNullParameter(notifications, "notifications");
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.f102168a = z;
        this.f102169b = notifications;
        this.f102170c = operatorNotificationCategory;
        this.f102171d = categories;
        this.f102172e = i;
    }

    public /* synthetic */ C46363ob3(boolean z, List list, OperatorNotificationCategory operatorNotificationCategory, List list2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? null : operatorNotificationCategory, (i2 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i2 & 16) != 0 ? 0 : i);
    }
}
