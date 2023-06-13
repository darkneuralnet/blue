package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, m28432d2 = {"LZ70;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/String;", "getComment", "()Ljava/lang/String;", "comment", "LJq5;", "afterRequest", "beforeRequest", "<init>", "(LJq5;LJq5;Ljava/lang/String;)V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Z70 */
/* loaded from: classes5.dex */
public final class Z70 {
    @InterfaceC41208ft5("comment")

    /* renamed from: a */
    public final String f47852a;

    public Z70() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Z70) {
            Z70 z70 = (Z70) obj;
            z70.getClass();
            return Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f47852a, z70.f47852a);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f47852a;
        return 0 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f47852a;
        return "Cache(afterRequest=" + ((Object) null) + ", beforeRequest=" + ((Object) null) + ", comment=" + str + ")";
    }

    public Z70(C33868Jq5 c33868Jq5, C33868Jq5 c33868Jq52, String str) {
        this.f47852a = str;
    }

    public /* synthetic */ Z70(C33868Jq5 c33868Jq5, C33868Jq5 c33868Jq52, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c33868Jq5, (i & 2) != 0 ? null : c33868Jq52, (i & 4) != 0 ? null : str);
    }
}
