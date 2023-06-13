package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, m28432d2 = {"Ld01;", "", "", "that", "", "b", "", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "I", "()I", "c", "(I)V", "count", "<init>", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: d01  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39495d01 {

    /* renamed from: a */
    public int f75951a;

    public C39495d01() {
        this(0, 1, null);
    }

    /* renamed from: a */
    public final int m44746a() {
        return this.f75951a;
    }

    /* renamed from: b */
    public final void m44745b(int i) {
        this.f75951a += i;
    }

    /* renamed from: c */
    public final void m44744c(int i) {
        this.f75951a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39495d01) && this.f75951a == ((C39495d01) obj).f75951a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f75951a);
    }

    public String toString() {
        return "DeltaCounter(count=" + this.f75951a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public C39495d01(int i) {
        this.f75951a = i;
    }

    public /* synthetic */ C39495d01(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
