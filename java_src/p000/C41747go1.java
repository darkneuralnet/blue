package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, m28432d2 = {"Lgo1;", "LBA0;", "LxB5;", "srcSize", "dstSize", "LZi5;", C17296a.f69688o, "(JJ)J", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "b", "F", "getValue", "()F", "value", "<init>", "(F)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: go1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41747go1 implements BA0 {

    /* renamed from: b */
    public final float f84285b;

    public C41747go1(float f) {
        this.f84285b = f;
    }

    @Override // p000.BA0
    /* renamed from: a */
    public long mo37464a(long j, long j2) {
        float f = this.f84285b;
        return C38126aj5.m70823a(f, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C41747go1) && Float.compare(this.f84285b, ((C41747go1) obj).f84285b) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f84285b);
    }

    public String toString() {
        return "FixedScale(value=" + this.f84285b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
