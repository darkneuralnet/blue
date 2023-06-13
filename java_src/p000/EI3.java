package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u0011J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0011\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0086\u0002J\b\u0010\f\u001a\u00020\u0005H\u0016R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0011\u0010\u001b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"LEI3;", "", "", "start", "end", "", Entry.TYPE_TEXT, "", "c", "index", "", C17296a.f69688o, "toString", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "LSA1;", "b", "LSA1;", "buffer", "I", "bufStart", DateTokenConverter.CONVERTER_KEY, "bufEnd", "()I", "length", "<init>", "e", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: EI3 */
/* loaded from: classes.dex */
public final class EI3 {

    /* renamed from: e */
    public static final C1776a f7206e = new C1776a(null);

    /* renamed from: f */
    public static final int f7207f = 8;

    /* renamed from: a */
    public String f7208a;

    /* renamed from: b */
    public SA1 f7209b;

    /* renamed from: c */
    public int f7210c;

    /* renamed from: d */
    public int f7211d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, m28432d2 = {"LEI3$a;", "", "", "BUF_SIZE", "I", "NOWHERE", "SURROUNDING_SIZE", "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: EI3$a */
    /* loaded from: classes.dex */
    public static final class C1776a {
        public /* synthetic */ C1776a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1776a() {
        }
    }

    public EI3(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f7208a = text;
        this.f7210c = -1;
        this.f7211d = -1;
    }

    /* renamed from: a */
    public final char m109235a(int i) {
        SA1 sa1 = this.f7209b;
        if (sa1 == null) {
            return this.f7208a.charAt(i);
        }
        if (i < this.f7210c) {
            return this.f7208a.charAt(i);
        }
        int m85868e = sa1.m85868e();
        int i2 = this.f7210c;
        if (i < m85868e + i2) {
            return sa1.m85869d(i - i2);
        }
        return this.f7208a.charAt(i - ((m85868e - this.f7211d) + i2));
    }

    /* renamed from: b */
    public final int m109234b() {
        SA1 sa1 = this.f7209b;
        if (sa1 == null) {
            return this.f7208a.length();
        }
        return (this.f7208a.length() - (this.f7211d - this.f7210c)) + sa1.m85868e();
    }

    /* renamed from: c */
    public final void m109233c(int i, int i2, String text) {
        boolean z;
        Intrinsics.checkNotNullParameter(text, "text");
        boolean z2 = true;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i < 0) {
                z2 = false;
            }
            if (z2) {
                SA1 sa1 = this.f7209b;
                if (sa1 == null) {
                    int max = Math.max((int) KotlinVersion.MAX_COMPONENT_VALUE, text.length() + 128);
                    char[] cArr = new char[max];
                    int min = Math.min(i, 64);
                    int min2 = Math.min(this.f7208a.length() - i2, 64);
                    int i3 = i - min;
                    UA1.m81896a(this.f7208a, cArr, 0, i3, i);
                    int i4 = max - min2;
                    int i5 = min2 + i2;
                    UA1.m81896a(this.f7208a, cArr, i4, i2, i5);
                    TA1.m84265b(text, cArr, min);
                    this.f7209b = new SA1(cArr, min + text.length(), i4);
                    this.f7210c = i3;
                    this.f7211d = i5;
                    return;
                }
                int i6 = this.f7210c;
                int i7 = i - i6;
                int i8 = i2 - i6;
                if (i7 >= 0 && i8 <= sa1.m85868e()) {
                    sa1.m85866g(i7, i8, text);
                    return;
                }
                this.f7208a = toString();
                this.f7209b = null;
                this.f7210c = -1;
                this.f7211d = -1;
                m109233c(i, i2, text);
                return;
            }
            throw new IllegalArgumentException(("start must be non-negative, but was " + i).toString());
        }
        throw new IllegalArgumentException(("start index must be less than or equal to end index: " + i + " > " + i2).toString());
    }

    public String toString() {
        SA1 sa1 = this.f7209b;
        if (sa1 == null) {
            return this.f7208a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.f7208a, 0, this.f7210c);
        sa1.m85872a(sb);
        String str = this.f7208a;
        sb.append((CharSequence) str, this.f7211d, str.length());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }
}
