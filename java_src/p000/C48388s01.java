package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0004J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR'\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0015j\b\u0012\u0004\u0012\u00020\u0002`\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"Ls01;", "", "LJm2;", "node", "", "b", "", C17296a.f69688o, "f", "e", DateTokenConverter.CONVERTER_KEY, "", "toString", "Z", "extraAssertions", "", "", "Lkotlin/Lazy;", "c", "()Ljava/util/Map;", "mapOfOriginalDepth", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "Ljava/util/Comparator;", "DepthComparator", "Loa6;", "Loa6;", "set", "<init>", "(Z)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDepthSortedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n1#1,106:1\n100#1:107\n*S KotlinDebug\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n91#1:107\n*E\n"})
/* renamed from: s01  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48388s01 {

    /* renamed from: a */
    public final boolean f108104a;

    /* renamed from: b */
    public final Lazy f108105b;

    /* renamed from: c */
    public final Comparator<C33829Jm2> f108106c;

    /* renamed from: d */
    public final C46356oa6<C33829Jm2> f108107d;

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\b"}, m28432d2 = {"s01$a", "Ljava/util/Comparator;", "LJm2;", "Lkotlin/Comparator;", "l1", "l2", "", C17296a.f69688o, "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: s01$a */
    /* loaded from: classes.dex */
    public static final class C28151a implements Comparator<C33829Jm2> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C33829Jm2 l1, C33829Jm2 l2) {
            Intrinsics.checkNotNullParameter(l1, "l1");
            Intrinsics.checkNotNullParameter(l2, "l2");
            int compare = Intrinsics.compare(l1.m99814O(), l2.m99814O());
            if (compare != 0) {
                return compare;
            }
            return Intrinsics.compare(l1.hashCode(), l2.hashCode());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "LJm2;", "", "invoke", "()Ljava/util/Map;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: s01$b */
    /* loaded from: classes.dex */
    public static final class C28152b extends Lambda implements Function0<Map<C33829Jm2, Integer>> {

        /* renamed from: g */
        public static final C28152b f108108g = new C28152b();

        public C28152b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map<C33829Jm2, Integer> invoke() {
            return new LinkedHashMap();
        }
    }

    public C48388s01() {
        this(false, 1, null);
    }

    /* renamed from: a */
    public final void m14900a(C33829Jm2 node) {
        boolean z;
        Intrinsics.checkNotNullParameter(node, "node");
        if (node.m99822J0()) {
            if (this.f108104a) {
                Integer num = m14898c().get(node);
                if (num == null) {
                    m14898c().put(node, Integer.valueOf(node.m99814O()));
                } else {
                    if (num.intValue() == node.m99814O()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            this.f108107d.add(node);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    public final boolean m14899b(C33829Jm2 node) {
        boolean z;
        Intrinsics.checkNotNullParameter(node, "node");
        boolean contains = this.f108107d.contains(node);
        if (this.f108104a) {
            if (contains == m14898c().containsKey(node)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        return contains;
    }

    /* renamed from: c */
    public final Map<C33829Jm2, Integer> m14898c() {
        return (Map) this.f108105b.getValue();
    }

    /* renamed from: d */
    public final boolean m14897d() {
        return this.f108107d.isEmpty();
    }

    /* renamed from: e */
    public final C33829Jm2 m14896e() {
        C33829Jm2 node = this.f108107d.first();
        Intrinsics.checkNotNullExpressionValue(node, "node");
        m14895f(node);
        return node;
    }

    /* renamed from: f */
    public final boolean m14895f(C33829Jm2 node) {
        Intrinsics.checkNotNullParameter(node, "node");
        if (node.m99822J0()) {
            boolean remove = this.f108107d.remove(node);
            if (this.f108104a) {
                Integer remove2 = m14898c().remove(node);
                boolean z = true;
                if (remove) {
                    int m99814O = node.m99814O();
                    if (remove2 == null || remove2.intValue() != m99814O) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    if (remove2 != null) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            return remove;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public String toString() {
        String obj = this.f108107d.toString();
        Intrinsics.checkNotNullExpressionValue(obj, "set.toString()");
        return obj;
    }

    public C48388s01(boolean z) {
        Lazy lazy;
        this.f108104a = z;
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) C28152b.f108108g);
        this.f108105b = lazy;
        C28151a c28151a = new C28151a();
        this.f108106c = c28151a;
        this.f108107d = new C46356oa6<>(c28151a);
    }

    public /* synthetic */ C48388s01(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
