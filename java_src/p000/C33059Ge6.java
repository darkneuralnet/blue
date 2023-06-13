package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0005\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m28432d2 = {"LGe6;", "Les0;", "", "LH6;", "sections", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/List;", "b", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ge6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33059Ge6 implements InterfaceC40600es0 {

    /* renamed from: a */
    public final List<C3023H6> f12207a;

    public C33059Ge6(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f12207a = sections;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C33059Ge6 copy$default(C33059Ge6 c33059Ge6, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = c33059Ge6.f12207a;
        }
        return c33059Ge6.m104934a(list);
    }

    /* renamed from: a */
    public final C33059Ge6 m104934a(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        return new C33059Ge6(sections);
    }

    /* renamed from: b */
    public final List<C3023H6> m104933b() {
        return this.f12207a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33059Ge6) && Intrinsics.areEqual(this.f12207a, ((C33059Ge6) obj).f12207a);
    }

    public int hashCode() {
        return this.f12207a.hashCode();
    }

    public String toString() {
        List<C3023H6> list = this.f12207a;
        return "UpdateFormContent(sections=" + list + ")";
    }
}
