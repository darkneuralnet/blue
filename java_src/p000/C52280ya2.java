package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.Issue;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.IssueStatusReason;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b,\u0010-J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003JI\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001J\t\u0010\u0012\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b\u001c\u0010&R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b \u0010(R\u001a\u0010*\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b)\u0010&R\u001c\u0010+\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010'\u001a\u0004\b\u0018\u0010(¨\u0006."}, m28432d2 = {"Lya2;", "Lqi0;", "Lco/bird/android/model/Issue;", "e", "Lco/bird/android/model/IssueStatus;", "f", "g", "Lco/bird/android/model/constant/IssueStatusReason;", "h", "issue", "status", "uncheckStatus", "uncheckStatusReason", "", "enabled", "", "title", "i", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "b", "Lco/bird/android/model/Issue;", "getIssue", "()Lco/bird/android/model/Issue;", "c", "Lco/bird/android/model/IssueStatus;", "getStatus", "()Lco/bird/android/model/IssueStatus;", DateTokenConverter.CONVERTER_KEY, "getUncheckStatus", "Lco/bird/android/model/constant/IssueStatusReason;", "getUncheckStatusReason", "()Lco/bird/android/model/constant/IssueStatusReason;", "Z", "()Z", "Ljava/lang/String;", "()Ljava/lang/String;", C17296a.f69688o, "checked", "details", "<init>", "(Lco/bird/android/model/Issue;Lco/bird/android/model/IssueStatus;Lco/bird/android/model/IssueStatus;Lco/bird/android/model/constant/IssueStatusReason;ZLjava/lang/String;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ya2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52280ya2 extends AbstractC47616qi0 {

    /* renamed from: b */
    public final Issue f119750b;

    /* renamed from: c */
    public final IssueStatus f119751c;

    /* renamed from: d */
    public final IssueStatus f119752d;

    /* renamed from: e */
    public final IssueStatusReason f119753e;

    /* renamed from: f */
    public final boolean f119754f;

    /* renamed from: g */
    public final String f119755g;

    /* renamed from: h */
    public final boolean f119756h;

    /* renamed from: i */
    public final String f119757i;

    public /* synthetic */ C52280ya2(Issue issue, IssueStatus issueStatus, IssueStatus issueStatus2, IssueStatusReason issueStatusReason, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(issue, issueStatus, issueStatus2, issueStatusReason, (i & 16) != 0 ? true : z, str);
    }

    public static /* synthetic */ C52280ya2 copy$default(C52280ya2 c52280ya2, Issue issue, IssueStatus issueStatus, IssueStatus issueStatus2, IssueStatusReason issueStatusReason, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            issue = c52280ya2.f119750b;
        }
        if ((i & 2) != 0) {
            issueStatus = c52280ya2.f119751c;
        }
        IssueStatus issueStatus3 = issueStatus;
        if ((i & 4) != 0) {
            issueStatus2 = c52280ya2.f119752d;
        }
        IssueStatus issueStatus4 = issueStatus2;
        if ((i & 8) != 0) {
            issueStatusReason = c52280ya2.f119753e;
        }
        IssueStatusReason issueStatusReason2 = issueStatusReason;
        if ((i & 16) != 0) {
            z = c52280ya2.f119754f;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str = c52280ya2.f119755g;
        }
        return c52280ya2.m3242i(issue, issueStatus3, issueStatus4, issueStatusReason2, z2, str);
    }

    @Override // p000.AbstractC47616qi0
    /* renamed from: a */
    public boolean mo3250a() {
        return this.f119756h;
    }

    @Override // p000.AbstractC47616qi0
    /* renamed from: b */
    public String mo3249b() {
        return this.f119757i;
    }

    @Override // p000.AbstractC47616qi0
    /* renamed from: c */
    public boolean mo3248c() {
        return this.f119754f;
    }

    @Override // p000.AbstractC47616qi0
    /* renamed from: d */
    public String mo3247d() {
        return this.f119755g;
    }

    /* renamed from: e */
    public final Issue m3246e() {
        return this.f119750b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C52280ya2) {
            C52280ya2 c52280ya2 = (C52280ya2) obj;
            return Intrinsics.areEqual(this.f119750b, c52280ya2.f119750b) && this.f119751c == c52280ya2.f119751c && this.f119752d == c52280ya2.f119752d && this.f119753e == c52280ya2.f119753e && this.f119754f == c52280ya2.f119754f && Intrinsics.areEqual(this.f119755g, c52280ya2.f119755g);
        }
        return false;
    }

    /* renamed from: f */
    public final IssueStatus m3245f() {
        return this.f119751c;
    }

    /* renamed from: g */
    public final IssueStatus m3244g() {
        return this.f119752d;
    }

    /* renamed from: h */
    public final IssueStatusReason m3243h() {
        return this.f119753e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f119750b.hashCode() * 31) + this.f119751c.hashCode()) * 31;
        IssueStatus issueStatus = this.f119752d;
        int hashCode2 = (hashCode + (issueStatus == null ? 0 : issueStatus.hashCode())) * 31;
        IssueStatusReason issueStatusReason = this.f119753e;
        int hashCode3 = (hashCode2 + (issueStatusReason != null ? issueStatusReason.hashCode() : 0)) * 31;
        boolean z = this.f119754f;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode3 + i) * 31) + this.f119755g.hashCode();
    }

    /* renamed from: i */
    public final C52280ya2 m3242i(Issue issue, IssueStatus status, IssueStatus issueStatus, IssueStatusReason issueStatusReason, boolean z, String title) {
        Intrinsics.checkNotNullParameter(issue, "issue");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(title, "title");
        return new C52280ya2(issue, status, issueStatus, issueStatusReason, z, title);
    }

    public String toString() {
        Issue issue = this.f119750b;
        IssueStatus issueStatus = this.f119751c;
        IssueStatus issueStatus2 = this.f119752d;
        IssueStatusReason issueStatusReason = this.f119753e;
        boolean z = this.f119754f;
        String str = this.f119755g;
        return "IssueStatusViewModel(issue=" + issue + ", status=" + issueStatus + ", uncheckStatus=" + issueStatus2 + ", uncheckStatusReason=" + issueStatusReason + ", enabled=" + z + ", title=" + str + ")";
    }

    public C52280ya2(Issue issue, IssueStatus status, IssueStatus issueStatus, IssueStatusReason issueStatusReason, boolean z, String title) {
        Intrinsics.checkNotNullParameter(issue, "issue");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f119750b = issue;
        this.f119751c = status;
        this.f119752d = issueStatus;
        this.f119753e = issueStatusReason;
        this.f119754f = z;
        this.f119755g = title;
        this.f119756h = issue.getStatus() == status;
    }
}
