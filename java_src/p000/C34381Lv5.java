package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0007\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010\b\u001a\u00020\u0005HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"LLv5;", "LyW4;", "", "LH6;", "ridePassAdapterSections", "", "linkCode", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "ride-pass_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Lv5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34381Lv5 extends AbstractC52246yW4 {

    /* renamed from: a */
    public final List<C3023H6> f22277a;

    /* renamed from: b */
    public final String f22278b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34381Lv5(List<C3023H6> ridePassAdapterSections, String str) {
        super(null);
        Intrinsics.checkNotNullParameter(ridePassAdapterSections, "ridePassAdapterSections");
        this.f22277a = ridePassAdapterSections;
        this.f22278b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C34381Lv5 copy$default(C34381Lv5 c34381Lv5, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = c34381Lv5.f22277a;
        }
        if ((i & 2) != 0) {
            str = c34381Lv5.f22278b;
        }
        return c34381Lv5.m96148a(list, str);
    }

    /* renamed from: a */
    public final C34381Lv5 m96148a(List<C3023H6> ridePassAdapterSections, String str) {
        Intrinsics.checkNotNullParameter(ridePassAdapterSections, "ridePassAdapterSections");
        return new C34381Lv5(ridePassAdapterSections, str);
    }

    /* renamed from: b */
    public final String m96147b() {
        return this.f22278b;
    }

    /* renamed from: c */
    public final List<C3023H6> m96146c() {
        return this.f22277a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C34381Lv5) {
            C34381Lv5 c34381Lv5 = (C34381Lv5) obj;
            return Intrinsics.areEqual(this.f22277a, c34381Lv5.f22277a) && Intrinsics.areEqual(this.f22278b, c34381Lv5.f22278b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f22277a.hashCode() * 31;
        String str = this.f22278b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        List<C3023H6> list = this.f22277a;
        String str = this.f22278b;
        return "SetAvailableRidePasses(ridePassAdapterSections=" + list + ", linkCode=" + str + ")";
    }
}
