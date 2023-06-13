package p000;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LYm5;", "LgT1;", "", "score", "b", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "D", "c", "()D", "<init>", "(D)V", "co.bird.android.feature.identification"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ym5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C37342Ym5 extends AbstractC41544gT1 {

    /* renamed from: b */
    public final double f46596b;

    public C37342Ym5(double d) {
        super(String.valueOf(d), null);
        this.f46596b = d;
    }

    public static /* synthetic */ C37342Ym5 copy$default(C37342Ym5 c37342Ym5, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            d = c37342Ym5.f46596b;
        }
        return c37342Ym5.m74276b(d);
    }

    /* renamed from: b */
    public final C37342Ym5 m74276b(double d) {
        return new C37342Ym5(d);
    }

    /* renamed from: c */
    public final double m74275c() {
        return this.f46596b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37342Ym5) && Double.compare(this.f46596b, ((C37342Ym5) obj).f46596b) == 0;
    }

    public int hashCode() {
        return Double.hashCode(this.f46596b);
    }

    public String toString() {
        double d = this.f46596b;
        return "ScoreEntry(score=" + d + ")";
    }
}
