package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000b¨\u0006\u0011"}, m28432d2 = {"LDN1;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/String;", "()Ljava/lang/String;", "name", "b", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: DN1 */
/* loaded from: classes5.dex */
public final class DN1 {
    @InterfaceC41208ft5("name")

    /* renamed from: a */
    public final String f5563a;
    @InterfaceC41208ft5("value")

    /* renamed from: b */
    public final String f5564b;

    public DN1(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f5563a = name;
        this.f5564b = value;
    }

    /* renamed from: a */
    public final String m110556a() {
        return this.f5563a;
    }

    /* renamed from: b */
    public final String m110555b() {
        return this.f5564b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DN1) {
            DN1 dn1 = (DN1) obj;
            return Intrinsics.areEqual(this.f5563a, dn1.f5563a) && Intrinsics.areEqual(this.f5564b, dn1.f5564b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f5563a.hashCode() * 31) + this.f5564b.hashCode();
    }

    public String toString() {
        String str = this.f5563a;
        String str2 = this.f5564b;
        return "HttpHeader(name=" + str + ", value=" + str2 + ")";
    }
}
