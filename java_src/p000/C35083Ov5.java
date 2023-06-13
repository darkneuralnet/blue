package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0017"}, m28432d2 = {"LOv5;", "LN91;", "LS91;", "buffer", "", C17296a.f69688o, "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "I", "getStart", "()I", "start", "b", "getEnd", "end", "<init>", "(II)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Ov5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35083Ov5 implements N91 {

    /* renamed from: a */
    public final int f27580a;

    /* renamed from: b */
    public final int f27581b;

    public C35083Ov5(int i, int i2) {
        this.f27580a = i;
        this.f27581b = i2;
    }

    @Override // p000.N91
    /* renamed from: a */
    public void mo18721a(S91 buffer) {
        int coerceIn;
        int coerceIn2;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (buffer.m85886l()) {
            buffer.m85897a();
        }
        coerceIn = RangesKt___RangesKt.coerceIn(this.f27580a, 0, buffer.m85890h());
        coerceIn2 = RangesKt___RangesKt.coerceIn(this.f27581b, 0, buffer.m85890h());
        if (coerceIn != coerceIn2) {
            if (coerceIn < coerceIn2) {
                buffer.m85884n(coerceIn, coerceIn2);
            } else {
                buffer.m85884n(coerceIn2, coerceIn);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35083Ov5)) {
            return false;
        }
        C35083Ov5 c35083Ov5 = (C35083Ov5) obj;
        if (this.f27580a == c35083Ov5.f27580a && this.f27581b == c35083Ov5.f27581b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f27580a * 31) + this.f27581b;
    }

    public String toString() {
        return "SetComposingRegionCommand(start=" + this.f27580a + ", end=" + this.f27581b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
