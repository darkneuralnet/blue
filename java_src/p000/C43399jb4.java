package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.QCStatus;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"Ljb4;", "", "", "issueName", "repairName", "Lco/bird/android/model/constant/QCStatus;", "status", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Lco/bird/android/model/constant/QCStatus;", DateTokenConverter.CONVERTER_KEY, "()Lco/bird/android/model/constant/QCStatus;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/constant/QCStatus;)V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jb4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43399jb4 {

    /* renamed from: a */
    public final String f92998a;

    /* renamed from: b */
    public final String f92999b;

    /* renamed from: c */
    public final QCStatus f93000c;

    public C43399jb4(String issueName, String repairName, QCStatus status) {
        Intrinsics.checkNotNullParameter(issueName, "issueName");
        Intrinsics.checkNotNullParameter(repairName, "repairName");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f92998a = issueName;
        this.f92999b = repairName;
        this.f93000c = status;
    }

    public static /* synthetic */ C43399jb4 copy$default(C43399jb4 c43399jb4, String str, String str2, QCStatus qCStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c43399jb4.f92998a;
        }
        if ((i & 2) != 0) {
            str2 = c43399jb4.f92999b;
        }
        if ((i & 4) != 0) {
            qCStatus = c43399jb4.f93000c;
        }
        return c43399jb4.m30217a(str, str2, qCStatus);
    }

    /* renamed from: a */
    public final C43399jb4 m30217a(String issueName, String repairName, QCStatus status) {
        Intrinsics.checkNotNullParameter(issueName, "issueName");
        Intrinsics.checkNotNullParameter(repairName, "repairName");
        Intrinsics.checkNotNullParameter(status, "status");
        return new C43399jb4(issueName, repairName, status);
    }

    /* renamed from: b */
    public final String m30216b() {
        return this.f92998a;
    }

    /* renamed from: c */
    public final String m30215c() {
        return this.f92999b;
    }

    /* renamed from: d */
    public final QCStatus m30214d() {
        return this.f93000c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C43399jb4) {
            C43399jb4 c43399jb4 = (C43399jb4) obj;
            return Intrinsics.areEqual(this.f92998a, c43399jb4.f92998a) && Intrinsics.areEqual(this.f92999b, c43399jb4.f92999b) && this.f93000c == c43399jb4.f93000c;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f92998a.hashCode() * 31) + this.f92999b.hashCode()) * 31) + this.f93000c.hashCode();
    }

    public String toString() {
        String str = this.f92998a;
        String str2 = this.f92999b;
        QCStatus qCStatus = this.f93000c;
        return "QCFailedInspectionIssue(issueName=" + str + ", repairName=" + str2 + ", status=" + qCStatus + ")";
    }

    public /* synthetic */ C43399jb4(String str, String str2, QCStatus qCStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? QCStatus.FAILED : qCStatus);
    }
}
