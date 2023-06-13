package p000;

import android.text.Layout;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007J\u0010\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0002R\u0017\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001bR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010#R\u0017\u0010(\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010'¨\u0006+"}, m28432d2 = {"Lqm2;", "", "", "paragraphIndex", "Ljava/text/Bidi;", C17296a.f69688o, "offset", "", "upstream", DateTokenConverter.CONVERTER_KEY, "e", "g", "usePrimaryDirection", "", "c", "", "f", "primary", "b", "lineEnd", "h", "Landroid/text/Layout;", "Landroid/text/Layout;", "getLayout", "()Landroid/text/Layout;", "layout", "", "Ljava/util/List;", "paragraphEnds", "", "paragraphBidi", "", "[Z", "bidiProcessedParagraphs", "", "[C", "tmpBuffer", "I", "getParagraphCount", "()I", "paragraphCount", "<init>", "(Landroid/text/Layout;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLayoutHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutHelper.kt\nandroidx/compose/ui/text/android/LayoutHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,377:1\n1#2:378\n1627#3,6:379\n1627#3,6:385\n*S KotlinDebug\n*F\n+ 1 LayoutHelper.kt\nandroidx/compose/ui/text/android/LayoutHelper\n*L\n283#1:379,6\n322#1:385,6\n*E\n"})
/* renamed from: qm2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47658qm2 {

    /* renamed from: a */
    public final Layout f105770a;

    /* renamed from: b */
    public final List<Integer> f105771b;

    /* renamed from: c */
    public final List<Bidi> f105772c;

    /* renamed from: d */
    public final boolean[] f105773d;

    /* renamed from: e */
    public char[] f105774e;

    /* renamed from: f */
    public final int f105775f;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"Lqm2$a;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "I", "b", "()I", "start", "end", "c", "Z", "()Z", "isRtl", "<init>", "(IIZ)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: qm2$a */
    /* loaded from: classes.dex */
    public static final class C27682a {

        /* renamed from: a */
        public final int f105776a;

        /* renamed from: b */
        public final int f105777b;

        /* renamed from: c */
        public final boolean f105778c;

        public C27682a(int i, int i2, boolean z) {
            this.f105776a = i;
            this.f105777b = i2;
            this.f105778c = z;
        }

        /* renamed from: a */
        public final int m17100a() {
            return this.f105777b;
        }

        /* renamed from: b */
        public final int m17099b() {
            return this.f105776a;
        }

        /* renamed from: c */
        public final boolean m17098c() {
            return this.f105778c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C27682a) {
                C27682a c27682a = (C27682a) obj;
                return this.f105776a == c27682a.f105776a && this.f105777b == c27682a.f105777b && this.f105778c == c27682a.f105778c;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.f105776a) * 31) + Integer.hashCode(this.f105777b)) * 31;
            boolean z = this.f105778c;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            return "BidiRun(start=" + this.f105776a + ", end=" + this.f105777b + ", isRtl=" + this.f105778c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public C47658qm2(Layout layout) {
        int indexOf$default;
        int i;
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f105770a = layout;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        do {
            CharSequence text = this.f105770a.getText();
            Intrinsics.checkNotNullExpressionValue(text, "layout.text");
            indexOf$default = StringsKt__StringsKt.indexOf$default(text, '\n', i2, false, 4, (Object) null);
            if (indexOf$default < 0) {
                i = this.f105770a.getText().length();
            } else {
                i = indexOf$default + 1;
            }
            i2 = i;
            arrayList.add(Integer.valueOf(i2));
        } while (i2 < this.f105770a.getText().length());
        this.f105771b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(null);
        }
        this.f105772c = arrayList2;
        this.f105773d = new boolean[this.f105771b.size()];
        this.f105775f = this.f105771b.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
        if (r0.getRunCount() == 1) goto L25;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bidi m17108a(int i) {
        int intValue;
        Bidi bidi;
        if (this.f105773d[i]) {
            return this.f105772c.get(i);
        }
        if (i == 0) {
            intValue = 0;
        } else {
            intValue = this.f105771b.get(i - 1).intValue();
        }
        int intValue2 = this.f105771b.get(i).intValue();
        int i2 = intValue2 - intValue;
        char[] cArr = this.f105774e;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(this.f105770a.getText(), intValue, intValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, m17102g(i) ? 1 : 0);
        }
        bidi = null;
        this.f105772c.set(i, bidi);
        this.f105773d[i] = true;
        if (bidi != null) {
            char[] cArr3 = this.f105774e;
            if (cArr2 == cArr3) {
                cArr2 = null;
            } else {
                cArr2 = cArr3;
            }
        }
        this.f105774e = cArr2;
        return bidi;
    }

    /* renamed from: b */
    public final float m17107b(int i, boolean z) {
        if (z) {
            return this.f105770a.getPrimaryHorizontal(i);
        }
        return this.f105770a.getSecondaryHorizontal(i);
    }

    /* renamed from: c */
    public final float m17106c(int i, boolean z, boolean z2) {
        Bidi bidi;
        int lastIndex;
        boolean z3;
        int lastIndex2;
        boolean z4;
        boolean z5;
        int i2 = i;
        if (!z2) {
            return m17107b(i, z);
        }
        int m25032a = C45286mm2.m25032a(this.f105770a, i2, z2);
        int lineStart = this.f105770a.getLineStart(m25032a);
        int lineEnd = this.f105770a.getLineEnd(m25032a);
        if (i2 != lineStart && i2 != lineEnd) {
            return m17107b(i, z);
        }
        if (i2 != 0 && i2 != this.f105770a.getText().length()) {
            int m17105d = m17105d(i2, z2);
            boolean m17102g = m17102g(m17105d);
            int m17101h = m17101h(lineEnd);
            int m17104e = m17104e(m17105d);
            int i3 = lineStart - m17104e;
            int i4 = m17101h - m17104e;
            Bidi m17108a = m17108a(m17105d);
            if (m17108a != null) {
                bidi = m17108a.createLineBidi(i3, i4);
            } else {
                bidi = null;
            }
            boolean z6 = false;
            if (bidi != null && bidi.getRunCount() != 1) {
                int runCount = bidi.getRunCount();
                C27682a[] c27682aArr = new C27682a[runCount];
                for (int i5 = 0; i5 < runCount; i5++) {
                    int runStart = bidi.getRunStart(i5) + lineStart;
                    int runLimit = bidi.getRunLimit(i5) + lineStart;
                    if (bidi.getRunLevel(i5) % 2 == 1) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    c27682aArr[i5] = new C27682a(runStart, runLimit, z5);
                }
                int runCount2 = bidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i6 = 0; i6 < runCount2; i6++) {
                    bArr[i6] = (byte) bidi.getRunLevel(i6);
                }
                Bidi.reorderVisually(bArr, 0, c27682aArr, 0, runCount);
                int i7 = -1;
                if (i2 == lineStart) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= runCount) {
                            break;
                        }
                        if (c27682aArr[i8].m17099b() == i2) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            i7 = i8;
                            break;
                        }
                        i8++;
                    }
                    C27682a c27682a = c27682aArr[i7];
                    if (z || m17102g == c27682a.m17098c()) {
                        if (!m17102g) {
                            m17102g = true;
                        } else {
                            m17102g = false;
                        }
                    }
                    if (i7 != 0 || !m17102g) {
                        lastIndex2 = ArraysKt___ArraysKt.getLastIndex(c27682aArr);
                        if (i7 == lastIndex2 && !m17102g) {
                            return this.f105770a.getLineRight(m25032a);
                        }
                        if (m17102g) {
                            return this.f105770a.getPrimaryHorizontal(c27682aArr[i7 - 1].m17099b());
                        }
                        return this.f105770a.getPrimaryHorizontal(c27682aArr[i7 + 1].m17099b());
                    }
                    return this.f105770a.getLineLeft(m25032a);
                }
                if (i2 > m17101h) {
                    i2 = m17101h(i);
                }
                int i9 = 0;
                while (true) {
                    if (i9 >= runCount) {
                        break;
                    }
                    if (c27682aArr[i9].m17100a() == i2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        i7 = i9;
                        break;
                    }
                    i9++;
                }
                C27682a c27682a2 = c27682aArr[i7];
                if (!z && m17102g != c27682a2.m17098c()) {
                    m17102g = !m17102g;
                }
                if (i7 != 0 || !m17102g) {
                    lastIndex = ArraysKt___ArraysKt.getLastIndex(c27682aArr);
                    if (i7 == lastIndex && !m17102g) {
                        return this.f105770a.getLineRight(m25032a);
                    }
                    if (m17102g) {
                        return this.f105770a.getPrimaryHorizontal(c27682aArr[i7 - 1].m17100a());
                    }
                    return this.f105770a.getPrimaryHorizontal(c27682aArr[i7 + 1].m17100a());
                }
                return this.f105770a.getLineLeft(m25032a);
            }
            boolean isRtlCharAt = this.f105770a.isRtlCharAt(lineStart);
            if (z || m17102g == isRtlCharAt) {
                if (!m17102g) {
                    m17102g = true;
                } else {
                    m17102g = false;
                }
            }
            if (i2 == lineStart) {
                z6 = m17102g;
            } else if (!m17102g) {
                z6 = true;
            }
            Layout layout = this.f105770a;
            if (z6) {
                return layout.getLineLeft(m25032a);
            }
            return layout.getLineRight(m25032a);
        }
        return m17107b(i, z);
    }

    /* renamed from: d */
    public final int m17105d(int i, boolean z) {
        int binarySearch$default;
        int i2;
        binarySearch$default = CollectionsKt__CollectionsKt.binarySearch$default(this.f105771b, Integer.valueOf(i), 0, 0, 6, (Object) null);
        if (binarySearch$default < 0) {
            i2 = -(binarySearch$default + 1);
        } else {
            i2 = binarySearch$default + 1;
        }
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == this.f105771b.get(i3).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    /* renamed from: e */
    public final int m17104e(int i) {
        if (i == 0) {
            return 0;
        }
        return this.f105771b.get(i - 1).intValue();
    }

    /* renamed from: f */
    public final boolean m17103f(char c) {
        if (c == ' ' || c == '\n' || c == 5760) {
            return true;
        }
        return ((8192 <= c && c < 8203) && c != 8199) || c == 8287 || c == 12288;
    }

    /* renamed from: g */
    public final boolean m17102g(int i) {
        if (this.f105770a.getParagraphDirection(this.f105770a.getLineForOffset(m17104e(i))) == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final int m17101h(int i) {
        while (i > 0 && m17103f(this.f105770a.getText().charAt(i - 1))) {
            i--;
        }
        return i;
    }
}
