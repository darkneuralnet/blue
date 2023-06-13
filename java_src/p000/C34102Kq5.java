package p000;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m28432d2 = {"LKq5;", "LgT1;", "", "seconds", "b", "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "I", "c", "()I", "<init>", "(I)V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Kq5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34102Kq5 extends AbstractC41544gT1 {

    /* renamed from: b */
    public final int f20274b;

    public C34102Kq5(int i) {
        super(String.valueOf(i), null);
        this.f20274b = i;
    }

    public static /* synthetic */ C34102Kq5 copy$default(C34102Kq5 c34102Kq5, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c34102Kq5.f20274b;
        }
        return c34102Kq5.m98238b(i);
    }

    /* renamed from: b */
    public final C34102Kq5 m98238b(int i) {
        return new C34102Kq5(i);
    }

    /* renamed from: c */
    public final int m98237c() {
        return this.f20274b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C34102Kq5) && this.f20274b == ((C34102Kq5) obj).f20274b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f20274b);
    }

    public String toString() {
        int i = this.f20274b;
        return "SecondsToResultEntry(seconds=" + i + ")";
    }
}
