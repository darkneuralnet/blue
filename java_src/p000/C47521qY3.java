package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0005\u001a\u00020\u00002\u0012\b\u0002\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R!\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m28432d2 = {"LqY3;", "Lxt3;", "", "LRa6;", "tweaks", C17296a.f69688o, "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/List;", "b", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: qY3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C47521qY3 extends AbstractC51878xt3 {

    /* renamed from: a */
    public final List<C35597Ra6<?>> f105391a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C47521qY3(List<? extends C35597Ra6<?>> tweaks) {
        super(null);
        Intrinsics.checkNotNullParameter(tweaks, "tweaks");
        this.f105391a = tweaks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C47521qY3 copy$default(C47521qY3 c47521qY3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = c47521qY3.f105391a;
        }
        return c47521qY3.m17463a(list);
    }

    /* renamed from: a */
    public final C47521qY3 m17463a(List<? extends C35597Ra6<?>> tweaks) {
        Intrinsics.checkNotNullParameter(tweaks, "tweaks");
        return new C47521qY3(tweaks);
    }

    /* renamed from: b */
    public final List<C35597Ra6<?>> m17462b() {
        return this.f105391a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C47521qY3) && Intrinsics.areEqual(this.f105391a, ((C47521qY3) obj).f105391a);
    }

    public int hashCode() {
        return this.f105391a.hashCode();
    }

    public String toString() {
        List<C35597Ra6<?>> list = this.f105391a;
        return "PopulateAdapter(tweaks=" + list + ")";
    }
}
