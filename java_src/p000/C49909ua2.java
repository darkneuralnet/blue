package p000;

import android.graphics.drawable.Drawable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.constant.IssueStatusReason;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J3\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\t\u0010\u000f\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, m28432d2 = {"Lua2;", "", "Lco/bird/android/model/IssueStatus;", C17296a.f69688o, "Lco/bird/android/model/constant/IssueStatusReason;", "b", "", "c", "Landroid/graphics/drawable/Drawable;", DateTokenConverter.CONVERTER_KEY, "status", "reason", "description", "icon", "e", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/IssueStatus;", "getStatus", "()Lco/bird/android/model/IssueStatus;", "Lco/bird/android/model/constant/IssueStatusReason;", "getReason", "()Lco/bird/android/model/constant/IssueStatusReason;", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "Landroid/graphics/drawable/Drawable;", "getIcon", "()Landroid/graphics/drawable/Drawable;", "<init>", "(Lco/bird/android/model/IssueStatus;Lco/bird/android/model/constant/IssueStatusReason;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ua2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49909ua2 {

    /* renamed from: a */
    public final IssueStatus f112633a;

    /* renamed from: b */
    public final IssueStatusReason f112634b;

    /* renamed from: c */
    public final String f112635c;

    /* renamed from: d */
    public final Drawable f112636d;

    public C49909ua2(IssueStatus status, IssueStatusReason issueStatusReason, String description, Drawable icon) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f112633a = status;
        this.f112634b = issueStatusReason;
        this.f112635c = description;
        this.f112636d = icon;
    }

    public static /* synthetic */ C49909ua2 copy$default(C49909ua2 c49909ua2, IssueStatus issueStatus, IssueStatusReason issueStatusReason, String str, Drawable drawable, int i, Object obj) {
        if ((i & 1) != 0) {
            issueStatus = c49909ua2.f112633a;
        }
        if ((i & 2) != 0) {
            issueStatusReason = c49909ua2.f112634b;
        }
        if ((i & 4) != 0) {
            str = c49909ua2.f112635c;
        }
        if ((i & 8) != 0) {
            drawable = c49909ua2.f112636d;
        }
        return c49909ua2.m10047e(issueStatus, issueStatusReason, str, drawable);
    }

    /* renamed from: a */
    public final IssueStatus m10051a() {
        return this.f112633a;
    }

    /* renamed from: b */
    public final IssueStatusReason m10050b() {
        return this.f112634b;
    }

    /* renamed from: c */
    public final String m10049c() {
        return this.f112635c;
    }

    /* renamed from: d */
    public final Drawable m10048d() {
        return this.f112636d;
    }

    /* renamed from: e */
    public final C49909ua2 m10047e(IssueStatus status, IssueStatusReason issueStatusReason, String description, Drawable icon) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new C49909ua2(status, issueStatusReason, description, icon);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C49909ua2) {
            C49909ua2 c49909ua2 = (C49909ua2) obj;
            return this.f112633a == c49909ua2.f112633a && this.f112634b == c49909ua2.f112634b && Intrinsics.areEqual(this.f112635c, c49909ua2.f112635c) && Intrinsics.areEqual(this.f112636d, c49909ua2.f112636d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f112633a.hashCode() * 31;
        IssueStatusReason issueStatusReason = this.f112634b;
        return ((((hashCode + (issueStatusReason == null ? 0 : issueStatusReason.hashCode())) * 31) + this.f112635c.hashCode()) * 31) + this.f112636d.hashCode();
    }

    public String toString() {
        IssueStatus issueStatus = this.f112633a;
        IssueStatusReason issueStatusReason = this.f112634b;
        String str = this.f112635c;
        Drawable drawable = this.f112636d;
        return "IssueStatusReasonViewModel(status=" + issueStatus + ", reason=" + issueStatusReason + ", description=" + str + ", icon=" + drawable + ")";
    }
}
