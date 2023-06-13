package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0017"}, m28432d2 = {"LYZ0;", "LN91;", "LS91;", "buffer", "", C17296a.f69688o, "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "I", "getLengthBeforeCursor", "()I", "lengthBeforeCursor", "b", "getLengthAfterCursor", "lengthAfterCursor", "<init>", "(II)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: YZ0 */
/* loaded from: classes.dex */
public final class YZ0 implements N91 {

    /* renamed from: a */
    public final int f46018a;

    /* renamed from: b */
    public final int f46019b;

    public YZ0(int i, int i2) {
        boolean z;
        this.f46018a = i;
        this.f46019b = i2;
        if (i >= 0 && i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.").toString());
    }

    @Override // p000.N91
    /* renamed from: a */
    public void mo18721a(S91 buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.m85896b(buffer.m85888j(), Math.min(buffer.m85888j() + this.f46019b, buffer.m85890h()));
        buffer.m85896b(Math.max(0, buffer.m85887k() - this.f46018a), buffer.m85887k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof YZ0)) {
            return false;
        }
        YZ0 yz0 = (YZ0) obj;
        if (this.f46018a == yz0.f46018a && this.f46019b == yz0.f46019b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f46018a * 31) + this.f46019b;
    }

    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.f46018a + ", lengthAfterCursor=" + this.f46019b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
