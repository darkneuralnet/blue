package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.Notification;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferService;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0004\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR$\u0010\u0015\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"LOc3;", "", "Lco/bird/android/model/persistence/Notification;", TransferService.INTENT_KEY_NOTIFICATION, C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/persistence/Notification;", "b", "()Lco/bird/android/model/persistence/Notification;", "", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "c", "(Ljava/lang/Throwable;)V", "error", "<init>", "(Lco/bird/android/model/persistence/Notification;)V", "notification-center_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Oc3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34910Oc3 {

    /* renamed from: a */
    public final Notification f26901a;

    /* renamed from: b */
    public Throwable f26902b;

    public C34910Oc3() {
        this(null, 1, null);
    }

    public static /* synthetic */ C34910Oc3 copy$default(C34910Oc3 c34910Oc3, Notification notification, int i, Object obj) {
        if ((i & 1) != 0) {
            notification = c34910Oc3.f26901a;
        }
        return c34910Oc3.m91849a(notification);
    }

    /* renamed from: a */
    public final C34910Oc3 m91849a(Notification notification) {
        return new C34910Oc3(notification);
    }

    /* renamed from: b */
    public final Notification m91848b() {
        return this.f26901a;
    }

    /* renamed from: c */
    public final void m91847c(Throwable th) {
        this.f26902b = th;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C34910Oc3) && Intrinsics.areEqual(this.f26901a, ((C34910Oc3) obj).f26901a);
    }

    public int hashCode() {
        Notification notification = this.f26901a;
        if (notification == null) {
            return 0;
        }
        return notification.hashCode();
    }

    public String toString() {
        Notification notification = this.f26901a;
        return "NotificationDetailsState(notification=" + notification + ")";
    }

    public C34910Oc3(Notification notification) {
        this.f26901a = notification;
    }

    public /* synthetic */ C34910Oc3(Notification notification, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : notification);
    }
}
