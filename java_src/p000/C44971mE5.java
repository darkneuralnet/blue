package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b,\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00105\u001a\u000201¢\u0006\u0004\bc\u0010dJ\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003J\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u0018J\u0006\u0010\u001c\u001a\u00020\u0018J\u0006\u0010\u001d\u001a\u00020\u0018J\u0006\u0010\u001e\u001a\u00020\u0003J\u0006\u0010\u001f\u001a\u00020\u0018J\u000e\u0010 \u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010!\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\"\u001a\u00020\u0018J\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#JQ\u0010+\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u000328\u0010*\u001a4\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b(\u0004\u0012\u0015\u0012\u0013\u0018\u00010\u0001¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00180&H\u0000¢\u0006\u0004\b+\u0010,J\b\u0010.\u001a\u00020-H\u0016J\u0010\u00100\u001a\u00020/2\b\b\u0002\u0010\u0004\u001a\u00020\u0003R\u001a\u00105\u001a\u0002018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00106R\u0014\u00108\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u001c\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010:R\u0014\u0010<\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R$\u0010A\u001a\u00020\t2\u0006\u0010=\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010>\u001a\u0004\b?\u0010@R$\u0010D\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\bB\u0010CR$\u0010F\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\bE\u0010CR$\u0010H\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u0010\u0017\u001a\u0004\bG\u0010CR\u0016\u0010I\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010\u0017R\u0016\u0010J\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010\u0017R\u0016\u0010K\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010\u0017R\u0011\u0010M\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bL\u0010CR\u0011\u0010O\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bN\u0010@R\u0011\u0010Q\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bP\u0010@R\u0011\u0010S\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bR\u0010@R\u0011\u0010U\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bT\u0010CR\u0011\u0010W\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bV\u0010CR\u0011\u0010Y\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bX\u0010CR\u0011\u0010[\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bZ\u0010CR\u0013\u0010^\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0013\u0010`\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\b_\u0010]R\u0011\u0010b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\ba\u0010C¨\u0006e"}, m28432d2 = {"LmE5;", "", "", "", "index", "K", "b", "M", "N", "", "H", "L", "J", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "A", "E", "B", "x", "D", "e", "y", "group", "z", "I", "", "c", "f", DateTokenConverter.CONVERTER_KEY, "S", "T", "Q", "R", "O", "P", "g", "", "Lok2;", "h", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", MessageExtension.FIELD_DATA, "block", "i", "(ILkotlin/jvm/functions/Function2;)V", "", "toString", "Ldb;", C17296a.f69688o, "LnE5;", "LnE5;", "w", "()LnE5;", "table", "[I", "groups", "groupsSize", "", "[Ljava/lang/Object;", "slots", "slotsSize", "<set-?>", "Z", "j", "()Z", "closed", "l", "()I", "currentGroup", "k", "currentEnd", "t", "parent", "emptyCount", "currentSlot", "currentSlotEnd", "v", "size", "G", "isNode", "F", "isGroupEnd", "s", "inEmpty", "q", "groupSize", "n", "groupEnd", "o", "groupKey", "r", "groupSlotIndex", "p", "()Ljava/lang/Object;", "groupObjectKey", "m", "groupAux", "u", "parentNodes", "<init>", "(LnE5;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n*L\n1#1,3443:1\n1#2:3444\n4513#3,5:3445\n4513#3,5:3450\n4513#3,5:3455\n4513#3,5:3460\n4513#3,5:3465\n3323#4,6:3470\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotReader\n*L\n949#1:3445,5\n959#1:3450,5\n967#1:3455,5\n986#1:3460,5\n1000#1:3465,5\n1051#1:3470,6\n*E\n"})
/* renamed from: mE5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44971mE5 {

    /* renamed from: a */
    public final C45564nE5 f97685a;

    /* renamed from: b */
    public final int[] f97686b;

    /* renamed from: c */
    public final int f97687c;

    /* renamed from: d */
    public final Object[] f97688d;

    /* renamed from: e */
    public final int f97689e;

    /* renamed from: f */
    public boolean f97690f;

    /* renamed from: g */
    public int f97691g;

    /* renamed from: h */
    public int f97692h;

    /* renamed from: i */
    public int f97693i;

    /* renamed from: j */
    public int f97694j;

    /* renamed from: k */
    public int f97695k;

    /* renamed from: l */
    public int f97696l;

    public C44971mE5(C45564nE5 table) {
        Intrinsics.checkNotNullParameter(table, "table");
        this.f97685a = table;
        this.f97686b = table.m24121j();
        int m24120o = table.m24120o();
        this.f97687c = m24120o;
        this.f97688d = table.m24119s();
        this.f97689e = table.m24118u();
        this.f97692h = m24120o;
        this.f97693i = -1;
    }

    /* renamed from: A */
    public final int m25917A(int i) {
        int m19780M;
        m19780M = C46750pE5.m19780M(this.f97686b, i);
        return m19780M;
    }

    /* renamed from: B */
    public final Object m25916B(int i) {
        return m25905M(this.f97686b, i);
    }

    /* renamed from: C */
    public final int m25915C(int i) {
        int m19786G;
        m19786G = C46750pE5.m19786G(this.f97686b, i);
        return m19786G;
    }

    /* renamed from: D */
    public final boolean m25914D(int i) {
        boolean m19784I;
        m19784I = C46750pE5.m19784I(this.f97686b, i);
        return m19784I;
    }

    /* renamed from: E */
    public final boolean m25913E(int i) {
        boolean m19783J;
        m19783J = C46750pE5.m19783J(this.f97686b, i);
        return m19783J;
    }

    /* renamed from: F */
    public final boolean m25912F() {
        return m25879s() || this.f97691g == this.f97692h;
    }

    /* renamed from: G */
    public final boolean m25911G() {
        boolean m19781L;
        m19781L = C46750pE5.m19781L(this.f97686b, this.f97691g);
        return m19781L;
    }

    /* renamed from: H */
    public final boolean m25910H(int i) {
        boolean m19781L;
        m19781L = C46750pE5.m19781L(this.f97686b, i);
        return m19781L;
    }

    /* renamed from: I */
    public final Object m25909I() {
        int i;
        if (this.f97694j <= 0 && (i = this.f97695k) < this.f97696l) {
            Object[] objArr = this.f97688d;
            this.f97695k = i + 1;
            return objArr[i];
        }
        return InterfaceC32720Et0.f8257a.m108267a();
    }

    /* renamed from: J */
    public final Object m25908J(int i) {
        boolean m19781L;
        m19781L = C46750pE5.m19781L(this.f97686b, i);
        if (m19781L) {
            return m25907K(this.f97686b, i);
        }
        return null;
    }

    /* renamed from: K */
    public final Object m25907K(int[] iArr, int i) {
        boolean m19781L;
        int m19777P;
        m19781L = C46750pE5.m19781L(iArr, i);
        if (m19781L) {
            Object[] objArr = this.f97688d;
            m19777P = C46750pE5.m19777P(iArr, i);
            return objArr[m19777P];
        }
        return InterfaceC32720Et0.f8257a.m108267a();
    }

    /* renamed from: L */
    public final int m25906L(int i) {
        int m19778O;
        m19778O = C46750pE5.m19778O(this.f97686b, i);
        return m19778O;
    }

    /* renamed from: M */
    public final Object m25905M(int[] iArr, int i) {
        boolean m19783J;
        int m19776Q;
        m19783J = C46750pE5.m19783J(iArr, i);
        if (m19783J) {
            Object[] objArr = this.f97688d;
            m19776Q = C46750pE5.m19776Q(iArr, i);
            return objArr[m19776Q];
        }
        return null;
    }

    /* renamed from: N */
    public final int m25904N(int i) {
        int m19775R;
        m19775R = C46750pE5.m19775R(this.f97686b, i);
        return m19775R;
    }

    /* renamed from: O */
    public final void m25903O(int i) {
        boolean z;
        int i2;
        int m19786G;
        if (this.f97694j == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f97691g = i;
            if (i < this.f97687c) {
                i2 = C46750pE5.m19775R(this.f97686b, i);
            } else {
                i2 = -1;
            }
            this.f97693i = i2;
            if (i2 < 0) {
                this.f97692h = this.f97687c;
            } else {
                m19786G = C46750pE5.m19786G(this.f97686b, i2);
                this.f97692h = i2 + m19786G;
            }
            this.f97695k = 0;
            this.f97696l = 0;
            return;
        }
        C35528Qt0.m87792x("Cannot reposition while in an empty region".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: P */
    public final void m25902P(int i) {
        int m19786G;
        boolean z;
        m19786G = C46750pE5.m19786G(this.f97686b, i);
        int i2 = m19786G + i;
        int i3 = this.f97691g;
        if (i3 >= i && i3 <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f97693i = i;
            this.f97692h = i2;
            this.f97695k = 0;
            this.f97696l = 0;
            return;
        }
        C35528Qt0.m87792x(("Index " + i + " is not a parent of " + i3).toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: Q */
    public final int m25901Q() {
        boolean z;
        boolean m19781L;
        int m19786G;
        int i = 1;
        if (this.f97694j == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m19781L = C46750pE5.m19781L(this.f97686b, this.f97691g);
            if (!m19781L) {
                i = C46750pE5.m19778O(this.f97686b, this.f97691g);
            }
            int i2 = this.f97691g;
            m19786G = C46750pE5.m19786G(this.f97686b, i2);
            this.f97691g = i2 + m19786G;
            return i;
        }
        C35528Qt0.m87792x("Cannot skip while in an empty region".toString());
        throw new KotlinNothingValueException();
    }

    /* renamed from: R */
    public final void m25900R() {
        boolean z;
        if (this.f97694j == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f97691g = this.f97692h;
        } else {
            C35528Qt0.m87792x("Cannot skip the enclosing group while in an empty region".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: S */
    public final void m25899S() {
        int m19775R;
        boolean z;
        int m19786G;
        int m19773T;
        int m19788E;
        if (this.f97694j <= 0) {
            m19775R = C46750pE5.m19775R(this.f97686b, this.f97691g);
            if (m19775R == this.f97693i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i = this.f97691g;
                this.f97693i = i;
                m19786G = C46750pE5.m19786G(this.f97686b, i);
                this.f97692h = i + m19786G;
                int i2 = this.f97691g;
                int i3 = i2 + 1;
                this.f97691g = i3;
                m19773T = C46750pE5.m19773T(this.f97686b, i2);
                this.f97695k = m19773T;
                if (i2 >= this.f97687c - 1) {
                    m19788E = this.f97689e;
                } else {
                    m19788E = C46750pE5.m19788E(this.f97686b, i3);
                }
                this.f97696l = m19788E;
                return;
            }
            throw new IllegalArgumentException("Invalid slot table detected".toString());
        }
    }

    /* renamed from: T */
    public final void m25898T() {
        boolean m19781L;
        if (this.f97694j <= 0) {
            m19781L = C46750pE5.m19781L(this.f97686b, this.f97691g);
            if (m19781L) {
                m25899S();
                return;
            }
            throw new IllegalArgumentException("Expected a node group".toString());
        }
    }

    /* renamed from: a */
    public final C19797db m25897a(int i) {
        int m19774S;
        ArrayList<C19797db> m24122h = this.f97685a.m24122h();
        m19774S = C46750pE5.m19774S(m24122h, i, this.f97687c);
        if (m19774S < 0) {
            C19797db c19797db = new C19797db(i);
            m24122h.add(-(m19774S + 1), c19797db);
            return c19797db;
        }
        C19797db c19797db2 = m24122h.get(m19774S);
        Intrinsics.checkNotNullExpressionValue(c19797db2, "get(location)");
        return c19797db2;
    }

    /* renamed from: b */
    public final Object m25896b(int[] iArr, int i) {
        boolean m19785H;
        int m19792A;
        m19785H = C46750pE5.m19785H(iArr, i);
        if (m19785H) {
            Object[] objArr = this.f97688d;
            m19792A = C46750pE5.m19792A(iArr, i);
            return objArr[m19792A];
        }
        return InterfaceC32720Et0.f8257a.m108267a();
    }

    /* renamed from: c */
    public final void m25895c() {
        this.f97694j++;
    }

    /* renamed from: d */
    public final void m25894d() {
        this.f97690f = true;
        this.f97685a.m24125c(this);
    }

    /* renamed from: e */
    public final boolean m25893e(int i) {
        boolean m19790C;
        m19790C = C46750pE5.m19790C(this.f97686b, i);
        return m19790C;
    }

    /* renamed from: f */
    public final void m25892f() {
        boolean z;
        int i = this.f97694j;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f97694j = i - 1;
            return;
        }
        throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
    }

    /* renamed from: g */
    public final void m25891g() {
        boolean z;
        int m19775R;
        int m19786G;
        int i;
        if (this.f97694j == 0) {
            if (this.f97691g == this.f97692h) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m19775R = C46750pE5.m19775R(this.f97686b, this.f97693i);
                this.f97693i = m19775R;
                if (m19775R < 0) {
                    i = this.f97687c;
                } else {
                    m19786G = C46750pE5.m19786G(this.f97686b, m19775R);
                    i = m19775R + m19786G;
                }
                this.f97692h = i;
                return;
            }
            C35528Qt0.m87792x("endGroup() not called at the end of a group".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: h */
    public final List<C46452ok2> m25890h() {
        int m19780M;
        boolean m19781L;
        int m19778O;
        int m19786G;
        ArrayList arrayList = new ArrayList();
        if (this.f97694j > 0) {
            return arrayList;
        }
        int i = this.f97691g;
        int i2 = 0;
        while (i < this.f97692h) {
            m19780M = C46750pE5.m19780M(this.f97686b, i);
            Object m25905M = m25905M(this.f97686b, i);
            m19781L = C46750pE5.m19781L(this.f97686b, i);
            if (m19781L) {
                m19778O = 1;
            } else {
                m19778O = C46750pE5.m19778O(this.f97686b, i);
            }
            arrayList.add(new C46452ok2(m19780M, m25905M, i, m19778O, i2));
            m19786G = C46750pE5.m19786G(this.f97686b, i);
            i += m19786G;
            i2++;
        }
        return arrayList;
    }

    /* renamed from: i */
    public final void m25889i(int i, Function2<? super Integer, Object, Unit> block) {
        int m19773T;
        int m24118u;
        Intrinsics.checkNotNullParameter(block, "block");
        m19773T = C46750pE5.m19773T(this.f97686b, i);
        int i2 = i + 1;
        if (i2 < this.f97685a.m24120o()) {
            m24118u = C46750pE5.m19788E(this.f97685a.m24121j(), i2);
        } else {
            m24118u = this.f97685a.m24118u();
        }
        for (int i3 = m19773T; i3 < m24118u; i3++) {
            block.invoke(Integer.valueOf(i3 - m19773T), this.f97688d[i3]);
        }
    }

    /* renamed from: j */
    public final boolean m25888j() {
        return this.f97690f;
    }

    /* renamed from: k */
    public final int m25887k() {
        return this.f97692h;
    }

    /* renamed from: l */
    public final int m25886l() {
        return this.f97691g;
    }

    /* renamed from: m */
    public final Object m25885m() {
        int i = this.f97691g;
        if (i < this.f97692h) {
            return m25896b(this.f97686b, i);
        }
        return 0;
    }

    /* renamed from: n */
    public final int m25884n() {
        return this.f97692h;
    }

    /* renamed from: o */
    public final int m25883o() {
        int m19780M;
        int i = this.f97691g;
        if (i < this.f97692h) {
            m19780M = C46750pE5.m19780M(this.f97686b, i);
            return m19780M;
        }
        return 0;
    }

    /* renamed from: p */
    public final Object m25882p() {
        int i = this.f97691g;
        if (i < this.f97692h) {
            return m25905M(this.f97686b, i);
        }
        return null;
    }

    /* renamed from: q */
    public final int m25881q() {
        int m19786G;
        m19786G = C46750pE5.m19786G(this.f97686b, this.f97691g);
        return m19786G;
    }

    /* renamed from: r */
    public final int m25880r() {
        int m19773T;
        int i = this.f97695k;
        m19773T = C46750pE5.m19773T(this.f97686b, this.f97693i);
        return i - m19773T;
    }

    /* renamed from: s */
    public final boolean m25879s() {
        return this.f97694j > 0;
    }

    /* renamed from: t */
    public final int m25878t() {
        return this.f97693i;
    }

    public String toString() {
        return "SlotReader(current=" + this.f97691g + ", key=" + m25883o() + ", parent=" + this.f97693i + ", end=" + this.f97692h + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* renamed from: u */
    public final int m25877u() {
        int m19778O;
        int i = this.f97693i;
        if (i >= 0) {
            m19778O = C46750pE5.m19778O(this.f97686b, i);
            return m19778O;
        }
        return 0;
    }

    /* renamed from: v */
    public final int m25876v() {
        return this.f97687c;
    }

    /* renamed from: w */
    public final C45564nE5 m25875w() {
        return this.f97685a;
    }

    /* renamed from: x */
    public final Object m25874x(int i) {
        return m25896b(this.f97686b, i);
    }

    /* renamed from: y */
    public final Object m25873y(int i) {
        return m25872z(this.f97691g, i);
    }

    /* renamed from: z */
    public final Object m25872z(int i, int i2) {
        int m19773T;
        int i3;
        m19773T = C46750pE5.m19773T(this.f97686b, i);
        int i4 = i + 1;
        if (i4 < this.f97687c) {
            i3 = C46750pE5.m19788E(this.f97686b, i4);
        } else {
            i3 = this.f97689e;
        }
        int i5 = m19773T + i2;
        if (i5 < i3) {
            return this.f97688d[i5];
        }
        return InterfaceC32720Et0.f8257a.m108267a();
    }
}
