package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\t\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\r¨\u0006\u0014"}, m28432d2 = {"LWX5;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/String;", "workSpecId", "b", "I", "()I", "generation", "c", "systemId", "<init>", "(Ljava/lang/String;II)V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: WX5 */
/* loaded from: classes.dex */
public final class WX5 {
    @JvmField

    /* renamed from: a */
    public final String f41252a;

    /* renamed from: b */
    public final int f41253b;
    @JvmField

    /* renamed from: c */
    public final int f41254c;

    public WX5(String workSpecId, int i, int i2) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f41252a = workSpecId;
        this.f41253b = i;
        this.f41254c = i2;
    }

    /* renamed from: a */
    public final int m78245a() {
        return this.f41253b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WX5) {
            WX5 wx5 = (WX5) obj;
            return Intrinsics.areEqual(this.f41252a, wx5.f41252a) && this.f41253b == wx5.f41253b && this.f41254c == wx5.f41254c;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f41252a.hashCode() * 31) + Integer.hashCode(this.f41253b)) * 31) + Integer.hashCode(this.f41254c);
    }

    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.f41252a + ", generation=" + this.f41253b + ", systemId=" + this.f41254c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
