package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0007\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"LhT1;", "", "", "titleRes", "endIcon", "LgT1;", "value", C17296a.f69688o, "", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "I", "c", "()I", "b", "LgT1;", DateTokenConverter.CONVERTER_KEY, "()LgT1;", "<init>", "(IILgT1;)V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: hT1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42137hT1 {

    /* renamed from: a */
    public final int f85273a;

    /* renamed from: b */
    public final int f85274b;

    /* renamed from: c */
    public final AbstractC41544gT1 f85275c;

    public C42137hT1(int i, int i2, AbstractC41544gT1 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f85273a = i;
        this.f85274b = i2;
        this.f85275c = value;
    }

    public static /* synthetic */ C42137hT1 copy$default(C42137hT1 c42137hT1, int i, int i2, AbstractC41544gT1 abstractC41544gT1, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = c42137hT1.f85273a;
        }
        if ((i3 & 2) != 0) {
            i2 = c42137hT1.f85274b;
        }
        if ((i3 & 4) != 0) {
            abstractC41544gT1 = c42137hT1.f85275c;
        }
        return c42137hT1.m36364a(i, i2, abstractC41544gT1);
    }

    /* renamed from: a */
    public final C42137hT1 m36364a(int i, int i2, AbstractC41544gT1 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new C42137hT1(i, i2, value);
    }

    /* renamed from: b */
    public final int m36363b() {
        return this.f85274b;
    }

    /* renamed from: c */
    public final int m36362c() {
        return this.f85273a;
    }

    /* renamed from: d */
    public final AbstractC41544gT1 m36361d() {
        return this.f85275c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C42137hT1) {
            C42137hT1 c42137hT1 = (C42137hT1) obj;
            return this.f85273a == c42137hT1.f85273a && this.f85274b == c42137hT1.f85274b && Intrinsics.areEqual(this.f85275c, c42137hT1.f85275c);
        }
        return false;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f85273a) * 31) + Integer.hashCode(this.f85274b)) * 31) + this.f85275c.hashCode();
    }

    public String toString() {
        int i = this.f85273a;
        int i2 = this.f85274b;
        AbstractC41544gT1 abstractC41544gT1 = this.f85275c;
        return "IdentificationDebugViewModel(titleRes=" + i + ", endIcon=" + i2 + ", value=" + abstractC41544gT1 + ")";
    }
}
