package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0005\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m28432d2 = {"LA22;", "LQR;", "", "LH6;", "ratingSections", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/List;", "b", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "co.bird.android.feature.bird-rating-history"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: A22 */
/* loaded from: classes3.dex */
public final class A22 implements InterfaceC6777QR {

    /* renamed from: a */
    public final List<C3023H6> f48a;

    public A22(List<C3023H6> ratingSections) {
        Intrinsics.checkNotNullParameter(ratingSections, "ratingSections");
        this.f48a = ratingSections;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ A22 copy$default(A22 a22, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = a22.f48a;
        }
        return a22.m116176a(list);
    }

    /* renamed from: a */
    public final A22 m116176a(List<C3023H6> ratingSections) {
        Intrinsics.checkNotNullParameter(ratingSections, "ratingSections");
        return new A22(ratingSections);
    }

    /* renamed from: b */
    public final List<C3023H6> m116175b() {
        return this.f48a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof A22) && Intrinsics.areEqual(this.f48a, ((A22) obj).f48a);
    }

    public int hashCode() {
        return this.f48a.hashCode();
    }

    public String toString() {
        List<C3023H6> list = this.f48a;
        return "Initialize(ratingSections=" + list + ")";
    }
}
