package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.ZoneAssignmentGroup;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0005\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m28432d2 = {"Ly22;", "LEu4;", "", "Lco/bird/android/model/persistence/ZoneAssignmentGroup;", "groups", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/List;", "b", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "release-assignment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: y22  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51966y22 implements InterfaceC32733Eu4 {

    /* renamed from: a */
    public final List<ZoneAssignmentGroup> f118639a;

    public C51966y22(List<ZoneAssignmentGroup> groups) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.f118639a = groups;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C51966y22 copy$default(C51966y22 c51966y22, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = c51966y22.f118639a;
        }
        return c51966y22.m4231a(list);
    }

    /* renamed from: a */
    public final C51966y22 m4231a(List<ZoneAssignmentGroup> groups) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        return new C51966y22(groups);
    }

    /* renamed from: b */
    public final List<ZoneAssignmentGroup> m4230b() {
        return this.f118639a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C51966y22) && Intrinsics.areEqual(this.f118639a, ((C51966y22) obj).f118639a);
    }

    public int hashCode() {
        return this.f118639a.hashCode();
    }

    public String toString() {
        List<ZoneAssignmentGroup> list = this.f118639a;
        return "Initialize(groups=" + list + ")";
    }
}
