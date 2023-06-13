package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\tH\u0016J \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\tH\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000fH\u0002J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001c¨\u0006 "}, m28432d2 = {"Lnj2;", "LDj2;", "", "value", "", C17296a.f69688o, "", "char", "b", "", Entry.TYPE_TEXT, DateTokenConverter.CONVERTER_KEY, "c", "h", "toString", "", "firstEscapedChar", "currentSize", "string", "e", "expected", "f", "oldSize", "additional", "g", "", "[C", "array", "I", "size", "<init>", "()V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: nj2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45849nj2 implements InterfaceC32398Dj2 {

    /* renamed from: a */
    public char[] f100430a = C36356Uh0.f37749c.m81180d();

    /* renamed from: b */
    public int f100431b;

    @Override // p000.InterfaceC32398Dj2
    /* renamed from: a */
    public void mo23262a(long j) {
        mo23259d(String.valueOf(j));
    }

    @Override // p000.InterfaceC32398Dj2
    /* renamed from: b */
    public void mo23261b(char c) {
        m23257f(1);
        char[] cArr = this.f100430a;
        int i = this.f100431b;
        this.f100431b = i + 1;
        cArr[i] = c;
    }

    @Override // p000.InterfaceC32398Dj2
    /* renamed from: c */
    public void mo23260c(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        m23257f(text.length() + 2);
        char[] cArr = this.f100430a;
        int i = this.f100431b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = text.length();
        text.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        for (int i4 = i2; i4 < i3; i4++) {
            char c = cArr[i4];
            if (c < C37964aS5.m71352a().length && C37964aS5.m71352a()[c] != 0) {
                m23258e(i4 - i2, i4, text);
                return;
            }
        }
        cArr[i3] = '\"';
        this.f100431b = i3 + 1;
    }

    @Override // p000.InterfaceC32398Dj2
    /* renamed from: d */
    public void mo23259d(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        m23257f(length);
        text.getChars(0, text.length(), this.f100430a, this.f100431b);
        this.f100431b += length;
    }

    /* renamed from: e */
    public final void m23258e(int i, int i2, String str) {
        int i3;
        int length = str.length();
        while (i < length) {
            int m23256g = m23256g(i2, 2);
            char charAt = str.charAt(i);
            if (charAt < C37964aS5.m71352a().length) {
                byte b = C37964aS5.m71352a()[charAt];
                if (b == 0) {
                    i3 = m23256g + 1;
                    this.f100430a[m23256g] = charAt;
                } else {
                    if (b == 1) {
                        String str2 = C37964aS5.m71351b()[charAt];
                        Intrinsics.checkNotNull(str2);
                        int m23256g2 = m23256g(m23256g, str2.length());
                        str2.getChars(0, str2.length(), this.f100430a, m23256g2);
                        i2 = m23256g2 + str2.length();
                        this.f100431b = i2;
                    } else {
                        char[] cArr = this.f100430a;
                        cArr[m23256g] = CoreConstants.ESCAPE_CHAR;
                        cArr[m23256g + 1] = (char) b;
                        i2 = m23256g + 2;
                        this.f100431b = i2;
                    }
                    i++;
                }
            } else {
                i3 = m23256g + 1;
                this.f100430a[m23256g] = charAt;
            }
            i2 = i3;
            i++;
        }
        int m23256g3 = m23256g(i2, 1);
        this.f100430a[m23256g3] = '\"';
        this.f100431b = m23256g3 + 1;
    }

    /* renamed from: f */
    public final void m23257f(int i) {
        m23256g(this.f100431b, i);
    }

    /* renamed from: g */
    public final int m23256g(int i, int i2) {
        int coerceAtLeast;
        int i3 = i2 + i;
        char[] cArr = this.f100430a;
        if (cArr.length <= i3) {
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i3, i * 2);
            char[] copyOf = Arrays.copyOf(cArr, coerceAtLeast);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f100430a = copyOf;
        }
        return i;
    }

    /* renamed from: h */
    public void m23255h() {
        C36356Uh0.f37749c.m81181c(this.f100430a);
    }

    public String toString() {
        return new String(this.f100430a, 0, this.f100431b);
    }
}
