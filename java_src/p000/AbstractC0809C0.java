package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u001c\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bX\u0010YJ\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0002H\u0003J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H&J\b\u0010\u001b\u001a\u00020\nH&J\b\u0010\u001c\u001a\u00020\nH&J\b\u0010\u001e\u001a\u00020\u001dH&J\u0010\u0010 \u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u001fH\u0004J\u0006\u0010!\u001a\u00020\u0016J\u000e\u0010#\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001dJ\u0010\u0010$\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u001fH\u0016J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u001fH\u0004J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020\u001dH\u0000¢\u0006\u0004\b(\u0010)J\u0006\u0010*\u001a\u00020\u001dJ\u0010\u0010,\u001a\u00020\n2\b\b\u0002\u0010+\u001a\u00020\nJ\b\u0010-\u001a\u00020\u0002H\u0016J\u001a\u00100\u001a\u0004\u0018\u00010\u00072\u0006\u0010.\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\nH&J\u0010\u00101\u001a\u0004\u0018\u00010\u00072\u0006\u0010/\u001a\u00020\nJ\u0018\u00103\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u0002H\u0016J\b\u00104\u001a\u00020\u0007H&J\u0006\u00105\u001a\u00020\u0007J \u00106\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0005J\u0006\u00107\u001a\u00020\u0007J\u0006\u00108\u001a\u00020\u0007J\u0018\u0010;\u001a\u00020\u00162\u0006\u00109\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u0002H\u0014J\u000e\u0010=\u001a\u00020\u00162\u0006\u0010<\u001a\u00020\nJ\b\u0010>\u001a\u00020\u0007H\u0016J\u000e\u0010@\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\u0007J\"\u0010C\u001a\u00020'2\u0006\u0010A\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010B\u001a\u00020\u0007J\u0006\u0010E\u001a\u00020DJ\u0006\u0010F\u001a\u00020\nJ\u0006\u0010G\u001a\u00020\nR\u0016\u0010\u0006\u001a\u00020\u00028\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\bH\u0010-R\u0014\u0010K\u001a\u00020I8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010JR\u0018\u0010M\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010LR&\u0010U\u001a\u00060Nj\u0002`O8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0014\u0010\u000f\u001a\u00020\u000e8$X¤\u0004¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006Z"}, m28432d2 = {"LC0;", "", "", "lastPosition", "current", "c", "currentPosition", "", "u", "K", "", "P", "startPosition", "b", "", Stripe3ds2AuthParams.FIELD_SOURCE, "startPos", DateTokenConverter.CONVERTER_KEY, "B", "start", "h", "literalSuffix", "", "j", "v", "position", "G", "L", "f", "", "m", "", "D", "w", "expected", "n", "o", "O", "expectedToken", "", "z", "(B)Ljava/lang/Void;", "E", "doConsume", "M", "I", "keyToMatch", "isLenient", "l", "F", "endPos", "J", "k", "q", "r", "t", "s", "fromIndex", "toIndex", "e", "allowLenientStrings", "H", "toString", "key", "A", "message", "hint", "x", "", "p", "g", "i", C17296a.f69688o, "LXi2;", "LXi2;", "path", "Ljava/lang/String;", "peekedString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "getEscapedString", "()Ljava/lang/StringBuilder;", "setEscapedString", "(Ljava/lang/StringBuilder;)V", "escapedString", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "()Ljava/lang/CharSequence;", "<init>", "()V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAbstractJsonLexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,704:1\n1#2:705\n*E\n"})
/* renamed from: C0 */
/* loaded from: classes8.dex */
public abstract class AbstractC0809C0 {
    @JvmField

    /* renamed from: a */
    public int f3198a;

    /* renamed from: c */
    public String f3200c;
    @JvmField

    /* renamed from: b */
    public final C37069Xi2 f3199b = new C37069Xi2();

    /* renamed from: d */
    public StringBuilder f3201d = new StringBuilder();

    /* renamed from: N */
    public static /* synthetic */ boolean m113136N(AbstractC0809C0 abstractC0809C0, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            return abstractC0809C0.m113137M(z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
    }

    /* renamed from: y */
    public static /* synthetic */ Void m113114y(AbstractC0809C0 abstractC0809C0, String str, int i, String str2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = abstractC0809C0.f3198a;
            }
            if ((i2 & 4) != 0) {
                str2 = "";
            }
            return abstractC0809C0.m113115x(str, i, str2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
    }

    /* renamed from: A */
    public final void m113145A(String key) {
        int lastIndexOf$default;
        Intrinsics.checkNotNullParameter(key, "key");
        lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) m113139J(0, this.f3198a), key, 0, false, 6, (Object) null);
        m113115x("Encountered an unknown key '" + key + CoreConstants.SINGLE_QUOTE_CHAR, lastIndexOf$default, "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new KotlinNothingValueException();
    }

    /* renamed from: B */
    public final int m113144B(CharSequence charSequence, int i) {
        boolean z;
        boolean z2;
        char charAt = charSequence.charAt(i);
        boolean z3 = true;
        if ('0' <= charAt && charAt < ':') {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return charAt - '0';
        }
        char c = 'a';
        if ('a' <= charAt && charAt < 'g') {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            c = 'A';
            if ('A' > charAt || charAt >= 'G') {
                z3 = false;
            }
            if (!z3) {
                m113114y(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        return (charAt - c) + 10;
    }

    /* renamed from: C */
    public abstract CharSequence mo78447C();

    /* renamed from: D */
    public final boolean m113143D(char c) {
        return !(((c == '}' || c == ']') || c == ':') || c == ',');
    }

    /* renamed from: E */
    public final byte m113142E() {
        CharSequence mo78447C = mo78447C();
        int i = this.f3198a;
        while (true) {
            int mo78446G = mo78446G(i);
            if (mo78446G != -1) {
                char charAt = mo78447C.charAt(mo78446G);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.f3198a = mo78446G;
                    return C1268D0.m111174a(charAt);
                }
                i = mo78446G + 1;
            } else {
                this.f3198a = mo78446G;
                return (byte) 10;
            }
        }
    }

    /* renamed from: F */
    public final String m113141F(boolean z) {
        String m113122q;
        byte m113142E = m113142E();
        if (z) {
            if (m113142E != 1 && m113142E != 0) {
                return null;
            }
            m113122q = m113120s();
        } else if (m113142E != 1) {
            return null;
        } else {
            m113122q = m113122q();
        }
        this.f3200c = m113122q;
        return m113122q;
    }

    /* renamed from: G */
    public abstract int mo78446G(int i);

    /* renamed from: H */
    public final void m113140H(boolean z) {
        Object last;
        Object last2;
        ArrayList arrayList = new ArrayList();
        byte m113142E = m113142E();
        if (m113142E != 8 && m113142E != 6) {
            m113120s();
            return;
        }
        while (true) {
            byte m113142E2 = m113142E();
            boolean z2 = true;
            if (m113142E2 == 1) {
                if (z) {
                    m113120s();
                } else {
                    mo78441k();
                }
            } else {
                if (m113142E2 != 8 && m113142E2 != 6) {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(Byte.valueOf(m113142E2));
                } else if (m113142E2 == 9) {
                    last2 = CollectionsKt___CollectionsKt.last((List<? extends Object>) arrayList);
                    if (((Number) last2).byteValue() == 8) {
                        CollectionsKt__MutableCollectionsKt.removeLast(arrayList);
                    } else {
                        int i = this.f3198a;
                        throw C32857Fi2.m106730f(i, "found ] instead of } at path: " + this.f3199b, mo78447C());
                    }
                } else if (m113142E2 == 7) {
                    last = CollectionsKt___CollectionsKt.last((List<? extends Object>) arrayList);
                    if (((Number) last).byteValue() == 6) {
                        CollectionsKt__MutableCollectionsKt.removeLast(arrayList);
                    } else {
                        int i2 = this.f3198a;
                        throw C32857Fi2.m106730f(i2, "found } instead of ] at path: " + this.f3199b, mo78447C());
                    }
                } else if (m113142E2 == 10) {
                    m113114y(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                mo78439m();
                if (arrayList.size() == 0) {
                    return;
                }
            }
        }
    }

    /* renamed from: I */
    public int mo78445I() {
        int mo78446G;
        char charAt;
        int i = this.f3198a;
        while (true) {
            mo78446G = mo78446G(i);
            if (mo78446G == -1 || !((charAt = mo78447C().charAt(mo78446G)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i = mo78446G + 1;
        }
        this.f3198a = mo78446G;
        return mo78446G;
    }

    /* renamed from: J */
    public String m113139J(int i, int i2) {
        return mo78447C().subSequence(i, i2).toString();
    }

    /* renamed from: K */
    public final String m113138K() {
        String str = this.f3200c;
        Intrinsics.checkNotNull(str);
        this.f3200c = null;
        return str;
    }

    /* renamed from: L */
    public abstract boolean mo78444L();

    /* renamed from: M */
    public final boolean m113137M(boolean z) {
        int mo78446G = mo78446G(mo78445I());
        int length = mo78447C().length() - mo78446G;
        if (length < 4 || mo78446G == -1) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if ("null".charAt(i) != mo78447C().charAt(mo78446G + i)) {
                return false;
            }
        }
        if (length > 4 && C1268D0.m111174a(mo78447C().charAt(mo78446G + 4)) == 0) {
            return false;
        }
        if (z) {
            this.f3198a = mo78446G + 4;
            return true;
        }
        return true;
    }

    /* renamed from: O */
    public final void m113135O(char c) {
        int i = this.f3198a - 1;
        this.f3198a = i;
        if (i >= 0 && c == '\"' && Intrinsics.areEqual(m113120s(), "null")) {
            m113115x("Expected string literal but 'null' literal was found", this.f3198a - 4, "Use 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.");
            throw new KotlinNothingValueException();
        } else {
            m113113z(C1268D0.m111174a(c));
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: P */
    public final boolean m113134P() {
        return mo78447C().charAt(this.f3198a - 1) != '\"';
    }

    /* renamed from: b */
    public final int m113132b(int i) {
        int mo78446G = mo78446G(i);
        if (mo78446G != -1) {
            int i2 = mo78446G + 1;
            char charAt = mo78447C().charAt(mo78446G);
            if (charAt == 'u') {
                return m113130d(mo78447C(), i2);
            }
            char m111173b = C1268D0.m111173b(charAt);
            if (m111173b != 0) {
                this.f3201d.append(m111173b);
                return i2;
            }
            m113114y(this, "Invalid escaped char '" + charAt + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        m113114y(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: c */
    public final int m113131c(int i, int i2) {
        m113129e(i, i2);
        return m113132b(i2 + 1);
    }

    /* renamed from: d */
    public final int m113130d(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 >= charSequence.length()) {
            this.f3198a = i;
            m113117v();
            if (this.f3198a + 4 < charSequence.length()) {
                return m113130d(charSequence, this.f3198a);
            }
            m113114y(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        this.f3201d.append((char) ((m113144B(charSequence, i) << 12) + (m113144B(charSequence, i + 1) << 8) + (m113144B(charSequence, i + 2) << 4) + m113144B(charSequence, i + 3)));
        return i2;
    }

    /* renamed from: e */
    public void m113129e(int i, int i2) {
        this.f3201d.append(mo78447C(), i, i2);
    }

    /* renamed from: f */
    public abstract boolean mo78442f();

    /* renamed from: g */
    public final boolean m113128g() {
        return m113127h(mo78445I());
    }

    /* renamed from: h */
    public final boolean m113127h(int i) {
        int mo78446G = mo78446G(i);
        if (mo78446G < mo78447C().length() && mo78446G != -1) {
            int i2 = mo78446G + 1;
            int charAt = mo78447C().charAt(mo78446G) | ' ';
            if (charAt != 102) {
                if (charAt == 116) {
                    m113125j("rue", i2);
                    return true;
                }
                m113114y(this, "Expected valid boolean literal prefix, but had '" + m113120s() + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            m113125j("alse", i2);
            return false;
        }
        m113114y(this, "EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: i */
    public final boolean m113126i() {
        boolean z;
        int mo78445I = mo78445I();
        if (mo78445I != mo78447C().length()) {
            if (mo78447C().charAt(mo78445I) == '\"') {
                mo78445I++;
                z = true;
            } else {
                z = false;
            }
            boolean m113127h = m113127h(mo78445I);
            if (z) {
                if (this.f3198a != mo78447C().length()) {
                    if (mo78447C().charAt(this.f3198a) == '\"') {
                        this.f3198a++;
                    } else {
                        m113114y(this, "Expected closing quotation mark", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    m113114y(this, "EOF", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
            return m113127h;
        }
        m113114y(this, "EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: j */
    public final void m113125j(String str, int i) {
        if (mo78447C().length() - i >= str.length()) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (str.charAt(i2) != (mo78447C().charAt(i + i2) | ' ')) {
                    m113114y(this, "Expected valid boolean literal prefix, but had '" + m113120s() + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
            this.f3198a = i + str.length();
            return;
        }
        m113114y(this, "Unexpected end of boolean literal", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: k */
    public abstract String mo78441k();

    /* renamed from: l */
    public abstract String mo78440l(String str, boolean z);

    /* renamed from: m */
    public abstract byte mo78439m();

    /* renamed from: n */
    public final byte m113124n(byte b) {
        byte mo78439m = mo78439m();
        if (mo78439m == b) {
            return mo78439m;
        }
        m113113z(b);
        throw new KotlinNothingValueException();
    }

    /* renamed from: o */
    public void mo78438o(char c) {
        m113117v();
        CharSequence mo78447C = mo78447C();
        int i = this.f3198a;
        while (true) {
            int mo78446G = mo78446G(i);
            if (mo78446G != -1) {
                int i2 = mo78446G + 1;
                char charAt = mo78447C.charAt(mo78446G);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.f3198a = i2;
                    if (charAt == c) {
                        return;
                    }
                    m113135O(c);
                }
                i = i2;
            } else {
                this.f3198a = mo78446G;
                m113135O(c);
                return;
            }
        }
    }

    /* renamed from: p */
    public final long m113123p() {
        boolean z;
        boolean z2;
        int mo78446G = mo78446G(mo78445I());
        if (mo78446G < mo78447C().length() && mo78446G != -1) {
            if (mo78447C().charAt(mo78446G) == '\"') {
                mo78446G++;
                if (mo78446G != mo78447C().length()) {
                    z = true;
                } else {
                    m113114y(this, "EOF", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                z = false;
            }
            int i = mo78446G;
            long j = 0;
            boolean z3 = true;
            boolean z4 = false;
            while (z3) {
                char charAt = mo78447C().charAt(i);
                if (charAt == '-') {
                    if (i == mo78446G) {
                        i++;
                        z4 = true;
                    } else {
                        m113114y(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                } else if (C1268D0.m111174a(charAt) != 0) {
                    break;
                } else {
                    i++;
                    if (i != mo78447C().length()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int i2 = charAt - '0';
                    if (i2 >= 0 && i2 < 10) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        j = (j * 10) - i2;
                        if (j > 0) {
                            m113114y(this, "Numeric value overflow", 0, null, 6, null);
                            throw new KotlinNothingValueException();
                        }
                    } else {
                        m113114y(this, "Unexpected symbol '" + charAt + "' in numeric literal", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                }
            }
            if (mo78446G != i && (!z4 || mo78446G != i - 1)) {
                if (z) {
                    if (z3) {
                        if (mo78447C().charAt(i) == '\"') {
                            i++;
                        } else {
                            m113114y(this, "Expected closing quotation mark", 0, null, 6, null);
                            throw new KotlinNothingValueException();
                        }
                    } else {
                        m113114y(this, "EOF", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                }
                this.f3198a = i;
                if (!z4) {
                    if (j != Long.MIN_VALUE) {
                        return -j;
                    }
                    m113114y(this, "Numeric value overflow", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                return j;
            }
            m113114y(this, "Expected numeric literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        m113114y(this, "EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: q */
    public final String m113122q() {
        if (this.f3200c != null) {
            return m113138K();
        }
        return mo78441k();
    }

    /* renamed from: r */
    public final String m113121r(CharSequence source, int i, int i2) {
        String m113118u;
        int mo78446G;
        Intrinsics.checkNotNullParameter(source, "source");
        char charAt = source.charAt(i2);
        boolean z = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                mo78446G = mo78446G(m113131c(i, i2));
                if (mo78446G == -1) {
                    m113114y(this, "EOF", mo78446G, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                i2++;
                if (i2 >= source.length()) {
                    m113129e(i, i2);
                    mo78446G = mo78446G(i2);
                    if (mo78446G == -1) {
                        m113114y(this, "EOF", mo78446G, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    continue;
                    charAt = source.charAt(i2);
                }
            }
            z = true;
            i = mo78446G;
            i2 = i;
            charAt = source.charAt(i2);
        }
        if (!z) {
            m113118u = m113139J(i, i2);
        } else {
            m113118u = m113118u(i, i2);
        }
        this.f3198a = i2 + 1;
        return m113118u;
    }

    /* renamed from: s */
    public final String m113120s() {
        String m113118u;
        if (this.f3200c != null) {
            return m113138K();
        }
        int mo78445I = mo78445I();
        if (mo78445I < mo78447C().length() && mo78445I != -1) {
            byte m111174a = C1268D0.m111174a(mo78447C().charAt(mo78445I));
            if (m111174a == 1) {
                return m113122q();
            }
            if (m111174a == 0) {
                boolean z = false;
                while (C1268D0.m111174a(mo78447C().charAt(mo78445I)) == 0) {
                    mo78445I++;
                    if (mo78445I >= mo78447C().length()) {
                        m113129e(this.f3198a, mo78445I);
                        int mo78446G = mo78446G(mo78445I);
                        if (mo78446G == -1) {
                            this.f3198a = mo78445I;
                            return m113118u(0, 0);
                        }
                        mo78445I = mo78446G;
                        z = true;
                    }
                }
                if (!z) {
                    m113118u = m113139J(this.f3198a, mo78445I);
                } else {
                    m113118u = m113118u(this.f3198a, mo78445I);
                }
                this.f3198a = mo78445I;
                return m113118u;
            }
            m113114y(this, "Expected beginning of the string, but got " + mo78447C().charAt(mo78445I), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        m113114y(this, "EOF", mo78445I, null, 4, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: t */
    public final String m113119t() {
        String m113120s = m113120s();
        if (Intrinsics.areEqual(m113120s, "null") && m113134P()) {
            m113114y(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return m113120s;
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) mo78447C()) + "', currentPosition=" + this.f3198a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* renamed from: u */
    public final String m113118u(int i, int i2) {
        m113129e(i, i2);
        String sb = this.f3201d.toString();
        Intrinsics.checkNotNullExpressionValue(sb, "escapedString.toString()");
        this.f3201d.setLength(0);
        return sb;
    }

    /* renamed from: v */
    public void m113117v() {
    }

    /* renamed from: w */
    public final void m113116w() {
        if (mo78439m() == 10) {
            return;
        }
        m113114y(this, "Expected EOF after parsing, but had " + mo78447C().charAt(this.f3198a - 1) + " instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* renamed from: x */
    public final Void m113115x(String message, int i, String hint) {
        boolean z;
        String str;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(hint, "hint");
        if (hint.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "";
        } else {
            str = '\n' + hint;
        }
        throw C32857Fi2.m106730f(i, message + " at path: " + this.f3199b.m76546a() + str, mo78447C());
    }

    /* renamed from: z */
    public final Void m113113z(byte b) {
        String str;
        String str2;
        if (b == 1) {
            str = "quotation mark '\"'";
        } else if (b == 4) {
            str = "comma ','";
        } else if (b == 5) {
            str = "colon ':'";
        } else if (b == 6) {
            str = "start of the object '{'";
        } else if (b == 7) {
            str = "end of the object '}'";
        } else if (b == 8) {
            str = "start of the array '['";
        } else if (b == 9) {
            str = "end of the array ']'";
        } else {
            str = "valid token";
        }
        if (this.f3198a != mo78447C().length() && this.f3198a > 0) {
            str2 = String.valueOf(mo78447C().charAt(this.f3198a - 1));
        } else {
            str2 = "EOF";
        }
        m113114y(this, "Expected " + str + ", but had '" + str2 + "' instead", this.f3198a - 1, null, 4, null);
        throw new KotlinNothingValueException();
    }
}
