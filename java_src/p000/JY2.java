package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.HY2;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 =2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001>B\u0017\u0012\u000e\u0010:\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000009¢\u0006\u0004\b;\u0010<J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0017J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0001J\u0016\u0010\f\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u000e\u001a\u00020\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010J\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017H\u0086\u0002J\u000e\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\rJ\u000e\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0010J\b\u0010\u001d\u001a\u00020\u0010H\u0016J\u0013\u0010 \u001a\u00020\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010!\u001a\u00020\rH\u0016R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\"8G¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0016\u0010\u0019\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u0015R\u0018\u0010*\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R.\u00100\u001a\u0004\u0018\u00010\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u00108\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010)\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0014\u00101\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010-R$\u00106\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r8G@BX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0011\u00108\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b7\u0010-¨\u0006?"}, m28432d2 = {"LJY2;", "LHY2;", "", "LGY2;", "navDeepLinkRequest", "LHY2$b;", "x", "node", "", "F", "", "nodes", "G", "", "resId", "H", "", "route", "J", "", "searchParents", "I", "K", "", "iterator", "startDestId", "Q", "startDestRoute", "R", "toString", "", LegacyRepairType.OTHER_KEY, "equals", "hashCode", "LLN5;", "m", "LLN5;", "L", "()LLN5;", "n", "o", "Ljava/lang/String;", "startDestIdName", "p", "O", "()Ljava/lang/String;", "T", "(Ljava/lang/String;)V", "startDestinationRoute", "displayName", "N", "()I", "S", "(I)V", "startDestinationId", "M", "startDestDisplayName", "Ld13;", "navGraphNavigator", "<init>", "(Ld13;)V", "q", C17296a.f69688o, "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: JY2 */
/* loaded from: classes.dex */
public class JY2 extends HY2 implements Iterable<HY2>, KMappedMarker {

    /* renamed from: q */
    public static final C4140a f17777q = new C4140a(null);

    /* renamed from: m */
    public final LN5<HY2> f17778m;

    /* renamed from: n */
    public int f17779n;

    /* renamed from: o */
    public String f17780o;

    /* renamed from: p */
    public String f17781p;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007¨\u0006\u0007"}, m28432d2 = {"LJY2$a;", "", "LJY2;", "LHY2;", C17296a.f69688o, "<init>", "()V", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: JY2$a */
    /* loaded from: classes.dex */
    public static final class C4140a {

        @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"LHY2;", "it", C17296a.f69688o, "(LHY2;)LHY2;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: JY2$a$a */
        /* loaded from: classes.dex */
        public static final class C4141a extends Lambda implements Function1<HY2, HY2> {

            /* renamed from: g */
            public static final C4141a f17782g = new C4141a();

            public C4141a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final HY2 invoke(HY2 it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof JY2) {
                    JY2 jy2 = (JY2) it;
                    return jy2.m100259H(jy2.m100253N());
                }
                return null;
            }
        }

        public /* synthetic */ C4140a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final HY2 m100245a(JY2 jy2) {
            Sequence generateSequence;
            Object last;
            Intrinsics.checkNotNullParameter(jy2, "<this>");
            generateSequence = SequencesKt__SequencesKt.generateSequence(jy2.m100259H(jy2.m100253N()), C4141a.f17782g);
            last = SequencesKt___SequencesKt.last(generateSequence);
            return (HY2) last;
        }

        private C4140a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, m28432d2 = {"JY2$b", "", "LHY2;", "", "hasNext", C17296a.f69688o, "", "remove", "", "b", "I", "index", "c", "Z", "wentToNext", "navigation-common_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: JY2$b */
    /* loaded from: classes.dex */
    public static final class C4142b implements Iterator<HY2>, KMutableIterator {

        /* renamed from: b */
        public int f17783b = -1;

        /* renamed from: c */
        public boolean f17784c;

        public C4142b() {
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public HY2 next() {
            if (hasNext()) {
                this.f17784c = true;
                LN5<HY2> m100255L = JY2.this.m100255L();
                int i = this.f17783b + 1;
                this.f17783b = i;
                HY2 m96975t = m100255L.m96975t(i);
                Intrinsics.checkNotNullExpressionValue(m96975t, "nodes.valueAt(++index)");
                return m96975t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17783b + 1 < JY2.this.m100255L().size();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f17784c) {
                LN5<HY2> m100255L = JY2.this.m100255L();
                m100255L.m96975t(this.f17783b).m103783C(null);
                m100255L.m96977q(this.f17783b);
                this.f17783b--;
                this.f17784c = false;
                return;
            }
            throw new IllegalStateException("You must call next() before you can remove an element".toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JY2(AbstractC39507d13<? extends JY2> navGraphNavigator) {
        super(navGraphNavigator);
        Intrinsics.checkNotNullParameter(navGraphNavigator, "navGraphNavigator");
        this.f17778m = new LN5<>();
    }

    /* renamed from: F */
    public final void m100261F(HY2 node) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(node, "node");
        int m103774s = node.m103774s();
        String m103771w = node.m103771w();
        boolean z3 = false;
        if (m103774s == 0 && m103771w == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (m103771w() != null && !(!Intrinsics.areEqual(m103771w, m103771w()))) {
                throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
            }
            if (m103774s != m103774s()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                HY2 m96983k = this.f17778m.m96983k(m103774s);
                if (m96983k == node) {
                    return;
                }
                if (node.m103772v() == null) {
                    z3 = true;
                }
                if (z3) {
                    if (m96983k != null) {
                        m96983k.m103783C(null);
                    }
                    node.m103783C(this);
                    this.f17778m.m96978p(node.m103774s(), node);
                    return;
                }
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
            }
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
        }
        throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
    }

    /* renamed from: G */
    public final void m100260G(Collection<? extends HY2> nodes) {
        Intrinsics.checkNotNullParameter(nodes, "nodes");
        for (HY2 hy2 : nodes) {
            if (hy2 != null) {
                m100261F(hy2);
            }
        }
    }

    /* renamed from: H */
    public final HY2 m100259H(int i) {
        return m100258I(i, true);
    }

    /* renamed from: I */
    public final HY2 m100258I(int i, boolean z) {
        HY2 m96983k = this.f17778m.m96983k(i);
        if (m96983k == null) {
            if (z && m103772v() != null) {
                JY2 m103772v = m103772v();
                Intrinsics.checkNotNull(m103772v);
                return m103772v.m100259H(i);
            }
            return null;
        }
        return m96983k;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0014 A[ORIG_RETURN, RETURN] */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HY2 m100257J(String str) {
        boolean z;
        boolean isBlank;
        if (str != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(str);
            if (!isBlank) {
                z = false;
                if (z) {
                    return m100256K(str, true);
                }
                return null;
            }
        }
        z = true;
        if (z) {
        }
    }

    /* renamed from: K */
    public final HY2 m100256K(String route, boolean z) {
        Intrinsics.checkNotNullParameter(route, "route");
        HY2 m96983k = this.f17778m.m96983k(HY2.f13508k.m103768a(route).hashCode());
        if (m96983k == null) {
            if (z && m103772v() != null) {
                JY2 m103772v = m103772v();
                Intrinsics.checkNotNull(m103772v);
                return m103772v.m100257J(route);
            }
            return null;
        }
        return m96983k;
    }

    /* renamed from: L */
    public final LN5<HY2> m100255L() {
        return this.f17778m;
    }

    /* renamed from: M */
    public final String m100254M() {
        if (this.f17780o == null) {
            String str = this.f17781p;
            if (str == null) {
                str = String.valueOf(this.f17779n);
            }
            this.f17780o = str;
        }
        String str2 = this.f17780o;
        Intrinsics.checkNotNull(str2);
        return str2;
    }

    /* renamed from: N */
    public final int m100253N() {
        return this.f17779n;
    }

    /* renamed from: O */
    public final String m100252O() {
        return this.f17781p;
    }

    /* renamed from: Q */
    public final void m100251Q(int i) {
        m100249S(i);
    }

    /* renamed from: R */
    public final void m100250R(String startDestRoute) {
        Intrinsics.checkNotNullParameter(startDestRoute, "startDestRoute");
        m100248T(startDestRoute);
    }

    /* renamed from: S */
    public final void m100249S(int i) {
        boolean z;
        if (i != m103774s()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f17781p != null) {
                m100248T(null);
            }
            this.f17779n = i;
            this.f17780o = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i + " cannot use the same id as the graph " + this).toString());
    }

    /* renamed from: T */
    public final void m100248T(String str) {
        boolean isBlank;
        int hashCode;
        if (str == null) {
            hashCode = 0;
        } else if (!Intrinsics.areEqual(str, m103771w())) {
            isBlank = StringsKt__StringsJVMKt.isBlank(str);
            if (!isBlank) {
                hashCode = HY2.f13508k.m103768a(str).hashCode();
            } else {
                throw new IllegalArgumentException("Cannot have an empty start destination route".toString());
            }
        } else {
            throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
        }
        this.f17779n = hashCode;
        this.f17781p = str;
    }

    @Override // p000.HY2
    public boolean equals(Object obj) {
        Sequence asSequence;
        List mutableList;
        if (obj == null || !(obj instanceof JY2)) {
            return false;
        }
        asSequence = SequencesKt__SequencesKt.asSequence(MN5.m95368a(this.f17778m));
        mutableList = SequencesKt___SequencesKt.toMutableList(asSequence);
        JY2 jy2 = (JY2) obj;
        Iterator m95368a = MN5.m95368a(jy2.f17778m);
        while (m95368a.hasNext()) {
            mutableList.remove((HY2) m95368a.next());
        }
        if (!super.equals(obj) || this.f17778m.size() != jy2.f17778m.size() || m100253N() != jy2.m100253N() || !mutableList.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // p000.HY2
    public int hashCode() {
        int m100253N = m100253N();
        LN5<HY2> ln5 = this.f17778m;
        int size = ln5.size();
        for (int i = 0; i < size; i++) {
            m100253N = (((m100253N * 31) + ln5.m96979o(i)) * 31) + ln5.m96975t(i).hashCode();
        }
        return m100253N;
    }

    @Override // java.lang.Iterable
    public final Iterator<HY2> iterator() {
        return new C4142b();
    }

    @Override // p000.HY2
    /* renamed from: o */
    public String mo100247o() {
        return m103774s() != 0 ? super.mo100247o() : "the root navigation";
    }

    @Override // p000.HY2
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        HY2 m100257J = m100257J(this.f17781p);
        if (m100257J == null) {
            m100257J = m100259H(m100253N());
        }
        sb.append(" startDestination=");
        if (m100257J == null) {
            String str = this.f17781p;
            if (str != null) {
                sb.append(str);
            } else {
                String str2 = this.f17780o;
                if (str2 != null) {
                    sb.append(str2);
                } else {
                    sb.append("0x" + Integer.toHexString(this.f17779n));
                }
            }
        } else {
            sb.append("{");
            sb.append(m100257J.toString());
            sb.append("}");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    @Override // p000.HY2
    /* renamed from: x */
    public HY2.C3160b mo100246x(GY2 navDeepLinkRequest) {
        Comparable maxOrNull;
        List listOfNotNull;
        Comparable maxOrNull2;
        Intrinsics.checkNotNullParameter(navDeepLinkRequest, "navDeepLinkRequest");
        HY2.C3160b mo100246x = super.mo100246x(navDeepLinkRequest);
        ArrayList arrayList = new ArrayList();
        Iterator<HY2> it = iterator();
        while (it.hasNext()) {
            HY2.C3160b mo100246x2 = it.next().mo100246x(navDeepLinkRequest);
            if (mo100246x2 != null) {
                arrayList.add(mo100246x2);
            }
        }
        maxOrNull = CollectionsKt___CollectionsKt.maxOrNull((Iterable<? extends Comparable>) arrayList);
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new HY2.C3160b[]{mo100246x, (HY2.C3160b) maxOrNull});
        maxOrNull2 = CollectionsKt___CollectionsKt.maxOrNull((Iterable<? extends Comparable>) listOfNotNull);
        return (HY2.C3160b) maxOrNull2;
    }
}
