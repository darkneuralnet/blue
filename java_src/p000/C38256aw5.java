package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0017"}, m28432d2 = {"Law5;", "LN91;", "LS91;", "buffer", "", C17296a.f69688o, "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "I", "getStart", "()I", "start", "b", "getEnd", "end", "<init>", "(II)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: aw5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38256aw5 implements N91 {

    /* renamed from: a */
    public final int f56631a;

    /* renamed from: b */
    public final int f56632b;

    public C38256aw5(int i, int i2) {
        this.f56631a = i;
        this.f56632b = i2;
    }

    @Override // p000.N91
    /* renamed from: a */
    public void mo18721a(S91 buffer) {
        int coerceIn;
        int coerceIn2;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        coerceIn = RangesKt___RangesKt.coerceIn(this.f56631a, 0, buffer.m85890h());
        coerceIn2 = RangesKt___RangesKt.coerceIn(this.f56632b, 0, buffer.m85890h());
        if (coerceIn < coerceIn2) {
            buffer.m85882p(coerceIn, coerceIn2);
        } else {
            buffer.m85882p(coerceIn2, coerceIn);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38256aw5)) {
            return false;
        }
        C38256aw5 c38256aw5 = (C38256aw5) obj;
        if (this.f56631a == c38256aw5.f56631a && this.f56632b == c38256aw5.f56632b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f56631a * 31) + this.f56632b;
    }

    public String toString() {
        return "SetSelectionCommand(start=" + this.f56631a + ", end=" + this.f56632b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
