package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bB\u0019\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\f\u0012\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, m28432d2 = {"LPv5;", "LN91;", "LS91;", "buffer", "", C17296a.f69688o, "", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "LDf;", "LDf;", "getAnnotatedString", "()LDf;", "annotatedString", "b", "I", "()I", "newCursorPosition", "c", "()Ljava/lang/String;", Entry.TYPE_TEXT, "<init>", "(LDf;I)V", "(Ljava/lang/String;I)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Pv5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35317Pv5 implements N91 {

    /* renamed from: a */
    public final C1577Df f29391a;

    /* renamed from: b */
    public final int f29392b;

    public C35317Pv5(C1577Df annotatedString, int i) {
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        this.f29391a = annotatedString;
        this.f29392b = i;
    }

    @Override // p000.N91
    /* renamed from: a */
    public void mo18721a(S91 buffer) {
        boolean z;
        int length;
        int coerceIn;
        boolean z2;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (buffer.m85886l()) {
            int m85892f = buffer.m85892f();
            buffer.m85885m(buffer.m85892f(), buffer.m85893e(), m89422c());
            if (m89422c().length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                buffer.m85884n(m85892f, m89422c().length() + m85892f);
            }
        } else {
            int m85887k = buffer.m85887k();
            buffer.m85885m(buffer.m85887k(), buffer.m85888j(), m89422c());
            if (m89422c().length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                buffer.m85884n(m85887k, m89422c().length() + m85887k);
            }
        }
        int m85891g = buffer.m85891g();
        int i = this.f29392b;
        if (i > 0) {
            length = (m85891g + i) - 1;
        } else {
            length = (m85891g + i) - m89422c().length();
        }
        coerceIn = RangesKt___RangesKt.coerceIn(length, 0, buffer.m85890h());
        buffer.m85883o(coerceIn);
    }

    /* renamed from: b */
    public final int m89423b() {
        return this.f29392b;
    }

    /* renamed from: c */
    public final String m89422c() {
        return this.f29391a.m110052j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35317Pv5)) {
            return false;
        }
        C35317Pv5 c35317Pv5 = (C35317Pv5) obj;
        if (Intrinsics.areEqual(m89422c(), c35317Pv5.m89422c()) && this.f29392b == c35317Pv5.f29392b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (m89422c().hashCode() * 31) + this.f29392b;
    }

    public String toString() {
        return "SetComposingTextCommand(text='" + m89422c() + "', newCursorPosition=" + this.f29392b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C35317Pv5(String text, int i) {
        this(new C1577Df(text, null, null, 6, null), i);
        Intrinsics.checkNotNullParameter(text, "text");
    }
}
