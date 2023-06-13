package p000;

import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0007H\u0016R\u001a\u0010\u0018\u001a\u00020\u000f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m28432d2 = {"LWR5;", "LC0;", "", "position", "G", "", "m", "", "L", "f", "I", "", "expected", "", "o", "", "k", "keyToMatch", "isLenient", "l", "e", "Ljava/lang/String;", "Q", "()Ljava/lang/String;", Stripe3ds2AuthParams.FIELD_SOURCE, "<init>", "(Ljava/lang/String;)V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStringJsonLexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringJsonLexer.kt\nkotlinx/serialization/json/internal/StringJsonLexer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1855#2,2:123\n*S KotlinDebug\n*F\n+ 1 StringJsonLexer.kt\nkotlinx/serialization/json/internal/StringJsonLexer\n*L\n101#1:123,2\n*E\n"})
/* renamed from: WR5 */
/* loaded from: classes8.dex */
public final class WR5 extends AbstractC0809C0 {

    /* renamed from: e */
    public final String f41020e;

    public WR5(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f41020e = source;
    }

    @Override // p000.AbstractC0809C0
    /* renamed from: G */
    public int mo78446G(int i) {
        if (i < mo78447C().length()) {
            return i;
        }
        return -1;
    }

    @Override // p000.AbstractC0809C0
    /* renamed from: I */
    public int mo78445I() {
        char charAt;
        int i = this.f3198a;
        if (i == -1) {
            return i;
        }
        while (i < mo78447C().length() && ((charAt = mo78447C().charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i++;
        }
        this.f3198a = i;
        return i;
    }

    @Override // p000.AbstractC0809C0
    /* renamed from: L */
    public boolean mo78444L() {
        int mo78445I = mo78445I();
        if (mo78445I == mo78447C().length() || mo78445I == -1 || mo78447C().charAt(mo78445I) != ',') {
            return false;
        }
        this.f3198a++;
        return true;
    }

    @Override // p000.AbstractC0809C0
    /* renamed from: Q */
    public String mo78447C() {
        return this.f41020e;
    }

    @Override // p000.AbstractC0809C0
    /* renamed from: f */
    public boolean mo78442f() {
        int i = this.f3198a;
        if (i == -1) {
            return false;
        }
        while (i < mo78447C().length()) {
            char charAt = mo78447C().charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f3198a = i;
                return m113143D(charAt);
            }
            i++;
        }
        this.f3198a = i;
        return false;
    }

    @Override // p000.AbstractC0809C0
    /* renamed from: k */
    public String mo78441k() {
        int indexOf$default;
        mo78438o('\"');
        int i = this.f3198a;
        indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) mo78447C(), '\"', i, false, 4, (Object) null);
        if (indexOf$default != -1) {
            for (int i2 = i; i2 < indexOf$default; i2++) {
                if (mo78447C().charAt(i2) == '\\') {
                    return m113121r(mo78447C(), this.f3198a, i2);
                }
            }
            this.f3198a = indexOf$default + 1;
            String substring = mo78447C().substring(i, indexOf$default);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        m113113z((byte) 1);
        throw new KotlinNothingValueException();
    }

    @Override // p000.AbstractC0809C0
    /* renamed from: l */
    public String mo78440l(String keyToMatch, boolean z) {
        String m113119t;
        String m113119t2;
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        int i = this.f3198a;
        try {
            if (mo78439m() != 6) {
                return null;
            }
            if (z) {
                m113119t = mo78441k();
            } else {
                m113119t = m113119t();
            }
            if (!Intrinsics.areEqual(m113119t, keyToMatch)) {
                return null;
            }
            if (mo78439m() != 5) {
                return null;
            }
            if (z) {
                m113119t2 = m113122q();
            } else {
                m113119t2 = m113119t();
            }
            return m113119t2;
        } finally {
            this.f3198a = i;
        }
    }

    @Override // p000.AbstractC0809C0
    /* renamed from: m */
    public byte mo78439m() {
        byte m111174a;
        String mo78447C = mo78447C();
        do {
            int i = this.f3198a;
            if (i != -1 && i < mo78447C.length()) {
                int i2 = this.f3198a;
                this.f3198a = i2 + 1;
                m111174a = C1268D0.m111174a(mo78447C.charAt(i2));
            } else {
                return (byte) 10;
            }
        } while (m111174a == 3);
        return m111174a;
    }

    @Override // p000.AbstractC0809C0
    /* renamed from: o */
    public void mo78438o(char c) {
        if (this.f3198a == -1) {
            m113135O(c);
        }
        String mo78447C = mo78447C();
        while (this.f3198a < mo78447C.length()) {
            int i = this.f3198a;
            this.f3198a = i + 1;
            char charAt = mo78447C.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt == c) {
                    return;
                }
                m113135O(c);
            }
        }
        m113135O(c);
    }
}
