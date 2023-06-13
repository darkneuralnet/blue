package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.text.CharacterIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\t\u0010\u0006\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015¨\u0006\u001d"}, m28432d2 = {"LYh0;", "Ljava/text/CharacterIterator;", "", "first", "last", "current", "next", "previous", "", "position", "setIndex", "getBeginIndex", "getEndIndex", "getIndex", "", "clone", "", "b", "Ljava/lang/CharSequence;", "charSequence", "c", "I", "start", DateTokenConverter.CONVERTER_KEY, "end", "e", "index", "<init>", "(Ljava/lang/CharSequence;II)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Yh0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37292Yh0 implements CharacterIterator {

    /* renamed from: b */
    public final CharSequence f46289b;

    /* renamed from: c */
    public final int f46290c;

    /* renamed from: d */
    public final int f46291d;

    /* renamed from: e */
    public int f46292e;

    public C37292Yh0(CharSequence charSequence, int i, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        this.f46289b = charSequence;
        this.f46290c = i;
        this.f46291d = i2;
        this.f46292e = i;
    }

    @Override // java.text.CharacterIterator
    public Object clone() {
        try {
            Object clone = super.clone();
            Intrinsics.checkNotNullExpressionValue(clone, "{\n            @Suppress(…  super.clone()\n        }");
            return clone;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i = this.f46292e;
        return i == this.f46291d ? CharCompanionObject.MAX_VALUE : this.f46289b.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.f46292e = this.f46290c;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.f46290c;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.f46291d;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.f46292e;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i = this.f46290c;
        int i2 = this.f46291d;
        if (i == i2) {
            this.f46292e = i2;
            return CharCompanionObject.MAX_VALUE;
        }
        int i3 = i2 - 1;
        this.f46292e = i3;
        return this.f46289b.charAt(i3);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i = this.f46292e + 1;
        this.f46292e = i;
        int i2 = this.f46291d;
        if (i >= i2) {
            this.f46292e = i2;
            return CharCompanionObject.MAX_VALUE;
        }
        return this.f46289b.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i = this.f46292e;
        if (i <= this.f46290c) {
            return CharCompanionObject.MAX_VALUE;
        }
        int i2 = i - 1;
        this.f46292e = i2;
        return this.f46289b.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i) {
        int i2 = this.f46290c;
        boolean z = false;
        if (i <= this.f46291d && i2 <= i) {
            z = true;
        }
        if (z) {
            this.f46292e = i;
            return current();
        }
        throw new IllegalArgumentException("invalid position");
    }
}
