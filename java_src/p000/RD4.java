package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, m28432d2 = {"LRD4;", "", "", C17296a.f69688o, "", "b", "", "LH6;", "c", "title", "complete", "subsections", DateTokenConverter.CONVERTER_KEY, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Z", "getComplete", "()Z", "Ljava/util/List;", "getSubsections", "()Ljava/util/List;", "<init>", "(Ljava/lang/String;ZLjava/util/List;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: RD4 */
/* loaded from: classes3.dex */
public final class RD4 {

    /* renamed from: a */
    public final String f31744a;

    /* renamed from: b */
    public final boolean f31745b;

    /* renamed from: c */
    public final List<C3023H6> f31746c;

    public RD4(String title, boolean z, List<C3023H6> subsections) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subsections, "subsections");
        this.f31744a = title;
        this.f31745b = z;
        this.f31746c = subsections;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RD4 copy$default(RD4 rd4, String str, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rd4.f31744a;
        }
        if ((i & 2) != 0) {
            z = rd4.f31745b;
        }
        if ((i & 4) != 0) {
            list = rd4.f31746c;
        }
        return rd4.m87026d(str, z, list);
    }

    /* renamed from: a */
    public final String m87029a() {
        return this.f31744a;
    }

    /* renamed from: b */
    public final boolean m87028b() {
        return this.f31745b;
    }

    /* renamed from: c */
    public final List<C3023H6> m87027c() {
        return this.f31746c;
    }

    /* renamed from: d */
    public final RD4 m87026d(String title, boolean z, List<C3023H6> subsections) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subsections, "subsections");
        return new RD4(title, z, subsections);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RD4) {
            RD4 rd4 = (RD4) obj;
            return Intrinsics.areEqual(this.f31744a, rd4.f31744a) && this.f31745b == rd4.f31745b && Intrinsics.areEqual(this.f31746c, rd4.f31746c);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f31744a.hashCode() * 31;
        boolean z = this.f31745b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + this.f31746c.hashCode();
    }

    public String toString() {
        String str = this.f31744a;
        boolean z = this.f31745b;
        List<C3023H6> list = this.f31746c;
        return "RepairSummaryViewModel(title=" + str + ", complete=" + z + ", subsections=" + list + ")";
    }
}
