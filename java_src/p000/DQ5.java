package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0004HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, m28432d2 = {"LDQ5;", "", "", "icon", "", "status", C17296a.f69688o, "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "I", "b", "()I", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "<init>", "(ILjava/lang/String;)V", "status-dialog_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: DQ5 */
/* loaded from: classes4.dex */
public final class DQ5 {

    /* renamed from: a */
    public final int f5688a;

    /* renamed from: b */
    public final String f5689b;

    public DQ5(int i, String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f5688a = i;
        this.f5689b = status;
    }

    public static /* synthetic */ DQ5 copy$default(DQ5 dq5, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dq5.f5688a;
        }
        if ((i2 & 2) != 0) {
            str = dq5.f5689b;
        }
        return dq5.m110475a(i, str);
    }

    /* renamed from: a */
    public final DQ5 m110475a(int i, String status) {
        Intrinsics.checkNotNullParameter(status, "status");
        return new DQ5(i, status);
    }

    /* renamed from: b */
    public final int m110474b() {
        return this.f5688a;
    }

    /* renamed from: c */
    public final String m110473c() {
        return this.f5689b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DQ5) {
            DQ5 dq5 = (DQ5) obj;
            return this.f5688a == dq5.f5688a && Intrinsics.areEqual(this.f5689b, dq5.f5689b);
        }
        return false;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f5688a) * 31) + this.f5689b.hashCode();
    }

    public String toString() {
        int i = this.f5688a;
        String str = this.f5689b;
        return "StatusHeaderViewModel(icon=" + i + ", status=" + str + ")";
    }
}
