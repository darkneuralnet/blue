package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bB\u0019\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, m28432d2 = {"Lop0;", "LN91;", "LS91;", "buffer", "", C17296a.f69688o, "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "LDf;", "LDf;", "getAnnotatedString", "()LDf;", "annotatedString", "b", "I", "()I", "newCursorPosition", "c", "()Ljava/lang/String;", Entry.TYPE_TEXT, "<init>", "(LDf;I)V", "(Ljava/lang/String;I)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: op0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46500op0 implements N91 {

    /* renamed from: a */
    public final C1577Df f102529a;

    /* renamed from: b */
    public final int f102530b;

    public C46500op0(C1577Df annotatedString, int i) {
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        this.f102529a = annotatedString;
        this.f102530b = i;
    }

    @Override // p000.N91
    /* renamed from: a */
    public void mo18721a(S91 buffer) {
        int length;
        int coerceIn;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (buffer.m85886l()) {
            buffer.m85885m(buffer.m85892f(), buffer.m85893e(), m20471c());
        } else {
            buffer.m85885m(buffer.m85887k(), buffer.m85888j(), m20471c());
        }
        int m85891g = buffer.m85891g();
        int i = this.f102530b;
        if (i > 0) {
            length = (m85891g + i) - 1;
        } else {
            length = (m85891g + i) - m20471c().length();
        }
        coerceIn = RangesKt___RangesKt.coerceIn(length, 0, buffer.m85890h());
        buffer.m85883o(coerceIn);
    }

    /* renamed from: b */
    public final int m20472b() {
        return this.f102530b;
    }

    /* renamed from: c */
    public final String m20471c() {
        return this.f102529a.m110052j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46500op0)) {
            return false;
        }
        C46500op0 c46500op0 = (C46500op0) obj;
        if (Intrinsics.areEqual(m20471c(), c46500op0.m20471c()) && this.f102530b == c46500op0.f102530b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (m20471c().hashCode() * 31) + this.f102530b;
    }

    public String toString() {
        return "CommitTextCommand(text='" + m20471c() + "', newCursorPosition=" + this.f102530b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C46500op0(String text, int i) {
        this(new C1577Df(text, null, null, 6, null), i);
        Intrinsics.checkNotNullParameter(text, "text");
    }
}
