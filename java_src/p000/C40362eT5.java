package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0014"}, m28432d2 = {"LeT5;", "", "", Entry.TYPE_TEXT, "", "enabled", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Z", "()Z", "<init>", "(Ljava/lang/String;Z)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: eT5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40362eT5 {

    /* renamed from: a */
    public final String f78419a;

    /* renamed from: b */
    public final boolean f78420b;

    public C40362eT5(String str, boolean z) {
        this.f78419a = str;
        this.f78420b = z;
    }

    public static /* synthetic */ C40362eT5 copy$default(C40362eT5 c40362eT5, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c40362eT5.f78419a;
        }
        if ((i & 2) != 0) {
            z = c40362eT5.f78420b;
        }
        return c40362eT5.m42857a(str, z);
    }

    /* renamed from: a */
    public final C40362eT5 m42857a(String str, boolean z) {
        return new C40362eT5(str, z);
    }

    /* renamed from: b */
    public final boolean m42856b() {
        return this.f78420b;
    }

    /* renamed from: c */
    public final String m42855c() {
        return this.f78419a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C40362eT5) {
            C40362eT5 c40362eT5 = (C40362eT5) obj;
            return Intrinsics.areEqual(this.f78419a, c40362eT5.f78419a) && this.f78420b == c40362eT5.f78420b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.f78419a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.f78420b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f78419a;
        boolean z = this.f78420b;
        return "SubmitButtonViewModel(text=" + str + ", enabled=" + z + ")";
    }
}
