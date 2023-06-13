package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.IssueType;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J1\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u0018\u0010\u001bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0010\u0010\u001b¨\u0006!"}, m28432d2 = {"LFa2;", "Lqi0;", "Lco/bird/android/model/IssueType;", "issueType", "", "hideIssueDetails", "enabled", "checked", "e", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "b", "Lco/bird/android/model/IssueType;", "f", "()Lco/bird/android/model/IssueType;", "c", "Z", "getHideIssueDetails", "()Z", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "Ljava/lang/String;", "()Ljava/lang/String;", "title", "g", "details", "<init>", "(Lco/bird/android/model/IssueType;ZZZ)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Fa2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32785Fa2 extends AbstractC47616qi0 {

    /* renamed from: b */
    public final IssueType f9713b;

    /* renamed from: c */
    public final boolean f9714c;

    /* renamed from: d */
    public final boolean f9715d;

    /* renamed from: e */
    public final boolean f9716e;

    /* renamed from: f */
    public final String f9717f;

    /* renamed from: g */
    public final String f9718g;

    public C32785Fa2(IssueType issueType, boolean z, boolean z2, boolean z3) {
        String str;
        Intrinsics.checkNotNullParameter(issueType, "issueType");
        this.f9713b = issueType;
        this.f9714c = z;
        this.f9715d = z2;
        this.f9716e = z3;
        this.f9717f = issueType.getDisplay();
        if (!z) {
            str = issueType.getDescription();
        } else {
            str = "";
        }
        this.f9718g = str;
    }

    public static /* synthetic */ C32785Fa2 copy$default(C32785Fa2 c32785Fa2, IssueType issueType, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            issueType = c32785Fa2.f9713b;
        }
        if ((i & 2) != 0) {
            z = c32785Fa2.f9714c;
        }
        if ((i & 4) != 0) {
            z2 = c32785Fa2.f9715d;
        }
        if ((i & 8) != 0) {
            z3 = c32785Fa2.f9716e;
        }
        return c32785Fa2.m106937e(issueType, z, z2, z3);
    }

    @Override // p000.AbstractC47616qi0
    /* renamed from: a */
    public boolean mo3250a() {
        return this.f9716e;
    }

    @Override // p000.AbstractC47616qi0
    /* renamed from: b */
    public String mo3249b() {
        return this.f9718g;
    }

    @Override // p000.AbstractC47616qi0
    /* renamed from: c */
    public boolean mo3248c() {
        return this.f9715d;
    }

    @Override // p000.AbstractC47616qi0
    /* renamed from: d */
    public String mo3247d() {
        return this.f9717f;
    }

    /* renamed from: e */
    public final C32785Fa2 m106937e(IssueType issueType, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(issueType, "issueType");
        return new C32785Fa2(issueType, z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C32785Fa2) {
            C32785Fa2 c32785Fa2 = (C32785Fa2) obj;
            return Intrinsics.areEqual(this.f9713b, c32785Fa2.f9713b) && this.f9714c == c32785Fa2.f9714c && this.f9715d == c32785Fa2.f9715d && this.f9716e == c32785Fa2.f9716e;
        }
        return false;
    }

    /* renamed from: f */
    public final IssueType m106936f() {
        return this.f9713b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f9713b.hashCode() * 31;
        boolean z = this.f9714c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.f9715d;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.f9716e;
        return i4 + (z3 ? 1 : z3 ? 1 : 0);
    }

    public String toString() {
        IssueType issueType = this.f9713b;
        boolean z = this.f9714c;
        boolean z2 = this.f9715d;
        boolean z3 = this.f9716e;
        return "IssueTypeViewModel(issueType=" + issueType + ", hideIssueDetails=" + z + ", enabled=" + z2 + ", checked=" + z3 + ")";
    }
}
