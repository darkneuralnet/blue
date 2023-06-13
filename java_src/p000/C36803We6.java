package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0007\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010\b\u001a\u00020\u0003HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0016"}, m28432d2 = {"LWe6;", "Ll7;", "", "", "photoUrls", "", "enableSubmit", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "equals", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Z", "()Z", "<init>", "(Ljava/util/List;Z)V", "co.bird.android.feature.transfer-order"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: We6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36803We6 extends AbstractC25599l7 {

    /* renamed from: a */
    public final List<String> f41461a;

    /* renamed from: b */
    public final boolean f41462b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36803We6(List<String> photoUrls, boolean z) {
        super(null);
        Intrinsics.checkNotNullParameter(photoUrls, "photoUrls");
        this.f41461a = photoUrls;
        this.f41462b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C36803We6 copy$default(C36803We6 c36803We6, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = c36803We6.f41461a;
        }
        if ((i & 2) != 0) {
            z = c36803We6.f41462b;
        }
        return c36803We6.m78050a(list, z);
    }

    /* renamed from: a */
    public final C36803We6 m78050a(List<String> photoUrls, boolean z) {
        Intrinsics.checkNotNullParameter(photoUrls, "photoUrls");
        return new C36803We6(photoUrls, z);
    }

    /* renamed from: b */
    public final boolean m78049b() {
        return this.f41462b;
    }

    /* renamed from: c */
    public final List<String> m78048c() {
        return this.f41461a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C36803We6) {
            C36803We6 c36803We6 = (C36803We6) obj;
            return Intrinsics.areEqual(this.f41461a, c36803We6.f41461a) && this.f41462b == c36803We6.f41462b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f41461a.hashCode() * 31;
        boolean z = this.f41462b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public String toString() {
        List<String> list = this.f41461a;
        boolean z = this.f41462b;
        return "UpdateUi(photoUrls=" + list + ", enableSubmit=" + z + ")";
    }
}
