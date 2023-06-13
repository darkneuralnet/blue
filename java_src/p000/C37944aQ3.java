package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018\u0012\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b4\u00105J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\u001e\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002J\u0016\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0002J\u0016\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002J\u000e\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u001a\u0004\b\u0019\u0010 \"\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR0\u0010+\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020(0'j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020(`)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010*RW\u00101\u001a>\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050,j\b\u0012\u0004\u0012\u00020\u0005`-0'j\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050,j\b\u0012\u0004\u0012\u00020\u0005`-`)8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\"\u00100R\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020\u0005028F¢\u0006\u0006\u001a\u0004\b.\u0010\u001c¨\u00066"}, m28432d2 = {"LaQ3;", "", "", "key", "dataKey", "Lok2;", DateTokenConverter.CONVERTER_KEY, "keyInfo", "", "h", "from", "to", "", "k", "count", "j", "insertIndex", "i", "group", "newCount", "n", "m", "g", "o", "", C17296a.f69688o, "Ljava/util/List;", "b", "()Ljava/util/List;", "keyInfos", "I", "e", "()I", "startIndex", "c", "l", "(I)V", "groupIndex", "usedKeys", "Ljava/util/HashMap;", "LhE1;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "groupInfos", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "f", "Lkotlin/Lazy;", "()Ljava/util/HashMap;", "keyMap", "", "used", "<init>", "(Ljava/util/List;I)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/Pending\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4528:1\n1#2:4529\n1855#3,2:4530\n1855#3,2:4532\n1855#3,2:4534\n1855#3,2:4536\n1855#3,2:4538\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/Pending\n*L\n156#1:4530,2\n162#1:4532,2\n172#1:4534,2\n178#1:4536,2\n198#1:4538,2\n*E\n"})
/* renamed from: aQ3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37944aQ3 {

    /* renamed from: a */
    public final List<C46452ok2> f50441a;

    /* renamed from: b */
    public final int f50442b;

    /* renamed from: c */
    public int f50443c;

    /* renamed from: d */
    public final List<C46452ok2> f50444d;

    /* renamed from: e */
    public final HashMap<Integer, C42002hE1> f50445e;

    /* renamed from: f */
    public final Lazy f50446f;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a>\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0000j\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004`\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Ljava/util/HashMap;", "", "Ljava/util/LinkedHashSet;", "Lok2;", "Lkotlin/collections/LinkedHashSet;", "Lkotlin/collections/HashMap;", "invoke", "()Ljava/util/HashMap;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: aQ3$a */
    /* loaded from: classes.dex */
    public static final class C10691a extends Lambda implements Function0<HashMap<Object, LinkedHashSet<C46452ok2>>> {
        public C10691a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final HashMap<Object, LinkedHashSet<C46452ok2>> invoke() {
            HashMap<Object, LinkedHashSet<C46452ok2>> m87826P;
            Object m87834H;
            m87826P = C35528Qt0.m87826P();
            C37944aQ3 c37944aQ3 = C37944aQ3.this;
            int size = c37944aQ3.m71425b().size();
            for (int i = 0; i < size; i++) {
                C46452ok2 c46452ok2 = c37944aQ3.m71425b().get(i);
                m87834H = C35528Qt0.m87834H(c46452ok2);
                C35528Qt0.m87823S(m87826P, m87834H, c46452ok2);
            }
            return m87826P;
        }
    }

    public C37944aQ3(List<C46452ok2> keyInfos, int i) {
        boolean z;
        Lazy lazy;
        Intrinsics.checkNotNullParameter(keyInfos, "keyInfos");
        this.f50441a = keyInfos;
        this.f50442b = i;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f50444d = new ArrayList();
            HashMap<Integer, C42002hE1> hashMap = new HashMap<>();
            int size = keyInfos.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C46452ok2 c46452ok2 = this.f50441a.get(i3);
                hashMap.put(Integer.valueOf(c46452ok2.m20552b()), new C42002hE1(i3, i2, c46452ok2.m20551c()));
                i2 += c46452ok2.m20551c();
            }
            this.f50445e = hashMap;
            lazy = LazyKt__LazyJVMKt.lazy(new C10691a());
            this.f50446f = lazy;
            return;
        }
        throw new IllegalArgumentException("Invalid start index".toString());
    }

    /* renamed from: a */
    public final int m71426a() {
        return this.f50443c;
    }

    /* renamed from: b */
    public final List<C46452ok2> m71425b() {
        return this.f50441a;
    }

    /* renamed from: c */
    public final HashMap<Object, LinkedHashSet<C46452ok2>> m71424c() {
        return (HashMap) this.f50446f.getValue();
    }

    /* renamed from: d */
    public final C46452ok2 m71423d(int i, Object obj) {
        Object valueOf;
        Object m87824R;
        if (obj != null) {
            valueOf = new C36592Vh2(Integer.valueOf(i), obj);
        } else {
            valueOf = Integer.valueOf(i);
        }
        m87824R = C35528Qt0.m87824R(m71424c(), valueOf);
        return (C46452ok2) m87824R;
    }

    /* renamed from: e */
    public final int m71422e() {
        return this.f50442b;
    }

    /* renamed from: f */
    public final List<C46452ok2> m71421f() {
        return this.f50444d;
    }

    /* renamed from: g */
    public final int m71420g(C46452ok2 keyInfo) {
        Intrinsics.checkNotNullParameter(keyInfo, "keyInfo");
        C42002hE1 c42002hE1 = this.f50445e.get(Integer.valueOf(keyInfo.m20552b()));
        if (c42002hE1 != null) {
            return c42002hE1.m36591b();
        }
        return -1;
    }

    /* renamed from: h */
    public final boolean m71419h(C46452ok2 keyInfo) {
        Intrinsics.checkNotNullParameter(keyInfo, "keyInfo");
        return this.f50444d.add(keyInfo);
    }

    /* renamed from: i */
    public final void m71418i(C46452ok2 keyInfo, int i) {
        Intrinsics.checkNotNullParameter(keyInfo, "keyInfo");
        this.f50445e.put(Integer.valueOf(keyInfo.m20552b()), new C42002hE1(-1, i, 0));
    }

    /* renamed from: j */
    public final void m71417j(int i, int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (i > i2) {
            Collection<C42002hE1> values = this.f50445e.values();
            Intrinsics.checkNotNullExpressionValue(values, "groupInfos.values");
            for (C42002hE1 c42002hE1 : values) {
                int m36591b = c42002hE1.m36591b();
                if (i <= m36591b && m36591b < i + i3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    c42002hE1.m36588e((m36591b - i) + i2);
                } else {
                    if (i2 <= m36591b && m36591b < i) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        c42002hE1.m36588e(m36591b + i3);
                    }
                }
            }
        } else if (i2 > i) {
            Collection<C42002hE1> values2 = this.f50445e.values();
            Intrinsics.checkNotNullExpressionValue(values2, "groupInfos.values");
            for (C42002hE1 c42002hE12 : values2) {
                int m36591b2 = c42002hE12.m36591b();
                if (i <= m36591b2 && m36591b2 < i + i3) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    c42002hE12.m36588e((m36591b2 - i) + i2);
                } else {
                    if (i + 1 <= m36591b2 && m36591b2 < i2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        c42002hE12.m36588e(m36591b2 - i3);
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public final void m71416k(int i, int i2) {
        boolean z;
        boolean z2;
        if (i > i2) {
            Collection<C42002hE1> values = this.f50445e.values();
            Intrinsics.checkNotNullExpressionValue(values, "groupInfos.values");
            for (C42002hE1 c42002hE1 : values) {
                int m36590c = c42002hE1.m36590c();
                if (m36590c == i) {
                    c42002hE1.m36587f(i2);
                } else {
                    if (i2 <= m36590c && m36590c < i) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        c42002hE1.m36587f(m36590c + 1);
                    }
                }
            }
        } else if (i2 > i) {
            Collection<C42002hE1> values2 = this.f50445e.values();
            Intrinsics.checkNotNullExpressionValue(values2, "groupInfos.values");
            for (C42002hE1 c42002hE12 : values2) {
                int m36590c2 = c42002hE12.m36590c();
                if (m36590c2 == i) {
                    c42002hE12.m36587f(i2);
                } else {
                    if (i + 1 <= m36590c2 && m36590c2 < i2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        c42002hE12.m36587f(m36590c2 - 1);
                    }
                }
            }
        }
    }

    /* renamed from: l */
    public final void m71415l(int i) {
        this.f50443c = i;
    }

    /* renamed from: m */
    public final int m71414m(C46452ok2 keyInfo) {
        Intrinsics.checkNotNullParameter(keyInfo, "keyInfo");
        C42002hE1 c42002hE1 = this.f50445e.get(Integer.valueOf(keyInfo.m20552b()));
        if (c42002hE1 != null) {
            return c42002hE1.m36590c();
        }
        return -1;
    }

    /* renamed from: n */
    public final boolean m71413n(int i, int i2) {
        int m36591b;
        C42002hE1 c42002hE1 = this.f50445e.get(Integer.valueOf(i));
        if (c42002hE1 != null) {
            int m36591b2 = c42002hE1.m36591b();
            int m36592a = i2 - c42002hE1.m36592a();
            c42002hE1.m36589d(i2);
            if (m36592a != 0) {
                Collection<C42002hE1> values = this.f50445e.values();
                Intrinsics.checkNotNullExpressionValue(values, "groupInfos.values");
                for (C42002hE1 c42002hE12 : values) {
                    if (c42002hE12.m36591b() >= m36591b2 && !Intrinsics.areEqual(c42002hE12, c42002hE1) && (m36591b = c42002hE12.m36591b() + m36592a) >= 0) {
                        c42002hE12.m36588e(m36591b);
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public final int m71412o(C46452ok2 keyInfo) {
        Intrinsics.checkNotNullParameter(keyInfo, "keyInfo");
        C42002hE1 c42002hE1 = this.f50445e.get(Integer.valueOf(keyInfo.m20552b()));
        if (c42002hE1 != null) {
            return c42002hE1.m36592a();
        }
        return keyInfo.m20551c();
    }
}
