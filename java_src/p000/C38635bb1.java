package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0005\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0003HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"Lbb1;", "LKa4;", "", "", "methods", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "<init>", "(Ljava/util/Map;)V", "purchase-payment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: bb1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38635bb1 extends AbstractC33957Ka4 {

    /* renamed from: a */
    public final Map<String, String> f57742a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38635bb1(Map<String, String> methods) {
        super(null);
        Intrinsics.checkNotNullParameter(methods, "methods");
        this.f57742a = methods;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C38635bb1 copy$default(C38635bb1 c38635bb1, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = c38635bb1.f57742a;
        }
        return c38635bb1.m64297a(map);
    }

    /* renamed from: a */
    public final C38635bb1 m64297a(Map<String, String> methods) {
        Intrinsics.checkNotNullParameter(methods, "methods");
        return new C38635bb1(methods);
    }

    /* renamed from: b */
    public final Map<String, String> m64296b() {
        return this.f57742a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38635bb1) && Intrinsics.areEqual(this.f57742a, ((C38635bb1) obj).f57742a);
    }

    public int hashCode() {
        return this.f57742a.hashCode();
    }

    public String toString() {
        Map<String, String> map = this.f57742a;
        return "EnableTestMethods(methods=" + map + ")";
    }
}
