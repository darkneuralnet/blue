package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f¨\u0006\u0016"}, m28432d2 = {"LGE0;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "b", "getVersion", "version", "c", "getComment", "comment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: GE0 */
/* loaded from: classes5.dex */
public final class GE0 {
    @InterfaceC41208ft5("name")

    /* renamed from: a */
    public final String f11177a;
    @InterfaceC41208ft5("version")

    /* renamed from: b */
    public final String f11178b;
    @InterfaceC41208ft5("comment")

    /* renamed from: c */
    public final String f11179c;

    public GE0(String name, String version, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        this.f11177a = name;
        this.f11178b = version;
        this.f11179c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GE0) {
            GE0 ge0 = (GE0) obj;
            return Intrinsics.areEqual(this.f11177a, ge0.f11177a) && Intrinsics.areEqual(this.f11178b, ge0.f11178b) && Intrinsics.areEqual(this.f11179c, ge0.f11179c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.f11177a.hashCode() * 31) + this.f11178b.hashCode()) * 31;
        String str = this.f11179c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f11177a;
        String str2 = this.f11178b;
        String str3 = this.f11179c;
        return "Creator(name=" + str + ", version=" + str2 + ", comment=" + str3 + ")";
    }

    public /* synthetic */ GE0(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
