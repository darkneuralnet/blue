package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0019\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u001d\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u0012\u0010\u000f\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\fj\u0002`\rJ\u0006\u0010\u0010\u001a\u00020\u0002J\b\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016¨\u0006\""}, m28432d2 = {"LSA1;", "", "", "index", "", DateTokenConverter.CONVERTER_KEY, "start", "end", "", Entry.TYPE_TEXT, "", "g", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", C17296a.f69688o, "e", "toString", "c", "requestSize", "f", "b", "I", "capacity", "", "[C", "buffer", "gapStart", "gapEnd", "initBuffer", "initGapStart", "initGapEnd", "<init>", "([CII)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/ui/text/input/GapBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,338:1\n1#2:339\n*E\n"})
/* renamed from: SA1 */
/* loaded from: classes.dex */
public final class SA1 {

    /* renamed from: a */
    public int f33283a;

    /* renamed from: b */
    public char[] f33284b;

    /* renamed from: c */
    public int f33285c;

    /* renamed from: d */
    public int f33286d;

    public SA1(char[] initBuffer, int i, int i2) {
        Intrinsics.checkNotNullParameter(initBuffer, "initBuffer");
        this.f33283a = initBuffer.length;
        this.f33284b = initBuffer;
        this.f33285c = i;
        this.f33286d = i2;
    }

    /* renamed from: a */
    public final void m85872a(StringBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.append(this.f33284b, 0, this.f33285c);
        char[] cArr = this.f33284b;
        int i = this.f33286d;
        builder.append(cArr, i, this.f33283a - i);
    }

    /* renamed from: b */
    public final void m85871b(int i, int i2) {
        int i3 = this.f33285c;
        if (i < i3 && i2 <= i3) {
            int i4 = i3 - i2;
            char[] cArr = this.f33284b;
            ArraysKt___ArraysJvmKt.copyInto(cArr, cArr, this.f33286d - i4, i2, i3);
            this.f33285c = i;
            this.f33286d -= i4;
        } else if (i < i3 && i2 >= i3) {
            this.f33286d = i2 + m85870c();
            this.f33285c = i;
        } else {
            int m85870c = i + m85870c();
            int m85870c2 = i2 + m85870c();
            int i5 = this.f33286d;
            int i6 = m85870c - i5;
            char[] cArr2 = this.f33284b;
            ArraysKt___ArraysJvmKt.copyInto(cArr2, cArr2, this.f33285c, i5, m85870c);
            this.f33285c += i6;
            this.f33286d = m85870c2;
        }
    }

    /* renamed from: c */
    public final int m85870c() {
        return this.f33286d - this.f33285c;
    }

    /* renamed from: d */
    public final char m85869d(int i) {
        int i2 = this.f33285c;
        if (i < i2) {
            return this.f33284b[i];
        }
        return this.f33284b[(i - i2) + this.f33286d];
    }

    /* renamed from: e */
    public final int m85868e() {
        return this.f33283a - m85870c();
    }

    /* renamed from: f */
    public final void m85867f(int i) {
        if (i <= m85870c()) {
            return;
        }
        int m85870c = i - m85870c();
        int i2 = this.f33283a;
        do {
            i2 *= 2;
        } while (i2 - this.f33283a < m85870c);
        char[] cArr = new char[i2];
        ArraysKt___ArraysJvmKt.copyInto(this.f33284b, cArr, 0, 0, this.f33285c);
        int i3 = this.f33283a;
        int i4 = this.f33286d;
        int i5 = i3 - i4;
        int i6 = i2 - i5;
        ArraysKt___ArraysJvmKt.copyInto(this.f33284b, cArr, i6, i4, i5 + i4);
        this.f33284b = cArr;
        this.f33283a = i2;
        this.f33286d = i6;
    }

    /* renamed from: g */
    public final void m85866g(int i, int i2, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        m85867f(text.length() - (i2 - i));
        m85871b(i, i2);
        TA1.m84265b(text, this.f33284b, this.f33285c);
        this.f33285c += text.length();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) sb);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply { append(this) }.toString()");
        return sb2;
    }
}
