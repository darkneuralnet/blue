package p000;

import androidx.compose.foundation.lazy.layout.C11285a;
import com.facebook.share.internal.C17296a;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import p000.InterfaceC35242Pn2;
import p000.R62;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B[\u0012<\u0010\u001a\u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0012\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0010&\u001a\u00020\f¢\u0006\u0004\b'\u0010(J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J*\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0003RM\u0010\u001a\u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u00128\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b\u001b\u0010!R\u0014\u0010%\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006)"}, m28432d2 = {"LSX0;", "LPn2;", "IntervalContent", "LRn2;", "", "index", "", "f", "(ILEt0;I)V", "", "c", C17296a.f69688o, "Lkotlin/ranges/IntRange;", "range", "LR62;", "list", "", "j", "Lkotlin/Function2;", "LR62$a;", "Lkotlin/ParameterName;", "name", "interval", "Lkotlin/jvm/functions/Function4;", "getItemContentProvider", "()Lkotlin/jvm/functions/Function4;", "itemContentProvider", "b", "LR62;", "getIntervals", "()LR62;", "intervals", "Ljava/util/Map;", "()Ljava/util/Map;", "keyToIndexMap", "getItemCount", "()I", "itemCount", "nearestItemsRange", "<init>", "(Lkotlin/jvm/functions/Function4;LR62;Lkotlin/ranges/IntRange;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyLayoutItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutItemProvider.kt\nandroidx/compose/foundation/lazy/layout/DefaultLazyLayoutItemsProvider\n*L\n1#1,231:1\n135#1,3:232\n135#1,3:235\n*S KotlinDebug\n*F\n+ 1 LazyLayoutItemProvider.kt\nandroidx/compose/foundation/lazy/layout/DefaultLazyLayoutItemsProvider\n*L\n122#1:232,3\n127#1:235,3\n*E\n"})
/* renamed from: SX0 */
/* loaded from: classes.dex */
public final class SX0<IntervalContent extends InterfaceC35242Pn2> implements InterfaceC35710Rn2 {

    /* renamed from: a */
    public final Function4<R62.C7065a<? extends IntervalContent>, Integer, InterfaceC32720Et0, Integer, Unit> f33846a;

    /* renamed from: b */
    public final R62<IntervalContent> f33847b;

    /* renamed from: c */
    public final Map<Object, Integer> f33848c;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: SX0$a */
    /* loaded from: classes.dex */
    public static final class C7469a extends Lambda implements Function2<InterfaceC32720Et0, Integer, Unit> {

        /* renamed from: g */
        public final /* synthetic */ SX0<IntervalContent> f33849g;

        /* renamed from: h */
        public final /* synthetic */ int f33850h;

        /* renamed from: i */
        public final /* synthetic */ int f33851i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7469a(SX0<IntervalContent> sx0, int i, int i2) {
            super(2);
            this.f33849g = sx0;
            this.f33850h = i;
            this.f33851i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC32720Et0 interfaceC32720Et0, Integer num) {
            invoke(interfaceC32720Et0, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            this.f33849g.mo15367f(this.f33850h, interfaceC32720Et0, C47127ps4.m18626a(this.f33851i | 1));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"LPn2;", "IntervalContent", "LR62$a;", "it", "", C17296a.f69688o, "(LR62$a;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: SX0$b */
    /* loaded from: classes.dex */
    public static final class C7470b extends Lambda implements Function1<R62.C7065a<? extends InterfaceC35242Pn2>, Unit> {

        /* renamed from: g */
        public final /* synthetic */ int f33852g;

        /* renamed from: h */
        public final /* synthetic */ int f33853h;

        /* renamed from: i */
        public final /* synthetic */ HashMap<Object, Integer> f33854i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7470b(int i, int i2, HashMap<Object, Integer> hashMap) {
            super(1);
            this.f33852g = i;
            this.f33853h = i2;
            this.f33854i = hashMap;
        }

        /* renamed from: a */
        public final void m85312a(R62.C7065a<? extends InterfaceC35242Pn2> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.m87319c().getKey() != null) {
                Function1<Integer, Object> key = it.m87319c().getKey();
                if (key != null) {
                    int max = Math.max(this.f33852g, it.m87320b());
                    int min = Math.min(this.f33853h, (it.m87320b() + it.m87321a()) - 1);
                    if (max > min) {
                        return;
                    }
                    while (true) {
                        this.f33854i.put(key.invoke(Integer.valueOf(max - it.m87320b())), Integer.valueOf(max));
                        if (max != min) {
                            max++;
                        } else {
                            return;
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(R62.C7065a<? extends InterfaceC35242Pn2> c7065a) {
            m85312a(c7065a);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SX0(Function4<? super R62.C7065a<? extends IntervalContent>, ? super Integer, ? super InterfaceC32720Et0, ? super Integer, Unit> itemContentProvider, R62<? extends IntervalContent> intervals, IntRange nearestItemsRange) {
        Intrinsics.checkNotNullParameter(itemContentProvider, "itemContentProvider");
        Intrinsics.checkNotNullParameter(intervals, "intervals");
        Intrinsics.checkNotNullParameter(nearestItemsRange, "nearestItemsRange");
        this.f33846a = itemContentProvider;
        this.f33847b = intervals;
        this.f33848c = m85313j(nearestItemsRange, intervals);
    }

    @Override // p000.InterfaceC35710Rn2
    /* renamed from: a */
    public Object mo15371a(int i) {
        R62.C7065a<IntervalContent> c7065a = this.f33847b.get(i);
        return c7065a.m87319c().getType().invoke(Integer.valueOf(i - c7065a.m87320b()));
    }

    @Override // p000.InterfaceC35710Rn2
    /* renamed from: b */
    public Map<Object, Integer> mo15370b() {
        return this.f33848c;
    }

    @Override // p000.InterfaceC35710Rn2
    /* renamed from: c */
    public Object mo15369c(int i) {
        Object invoke;
        R62.C7065a<IntervalContent> c7065a = this.f33847b.get(i);
        int m87320b = i - c7065a.m87320b();
        Function1<Integer, Object> key = c7065a.m87319c().getKey();
        if (key == null || (invoke = key.invoke(Integer.valueOf(m87320b))) == null) {
            return C11285a.m68887a(i);
        }
        return invoke;
    }

    @Override // p000.InterfaceC35710Rn2
    /* renamed from: f */
    public void mo15367f(int i, InterfaceC32720Et0 interfaceC32720Et0, int i2) {
        int i3;
        int i4;
        int i5;
        InterfaceC32720Et0 mo89518u = interfaceC32720Et0.mo89518u(-1877726744);
        if ((i2 & 14) == 0) {
            if (mo89518u.mo89527r(i)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            if (mo89518u.mo89539n(this)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i3 & 91) == 18 && mo89518u.mo89575b()) {
            mo89518u.mo89548k();
        } else {
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(-1877726744, i3, -1, "androidx.compose.foundation.lazy.layout.DefaultLazyLayoutItemsProvider.Item (LazyLayoutItemProvider.kt:116)");
            }
            this.f33846a.invoke(this.f33847b.get(i), Integer.valueOf(i), mo89518u, Integer.valueOf((i3 << 3) & 112));
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
        }
        InterfaceC36874Wm5 mo89512w = mo89518u.mo89512w();
        if (mo89512w != null) {
            mo89512w.mo20405a(new C7469a(this, i, i2));
        }
    }

    @Override // p000.InterfaceC35710Rn2
    public int getItemCount() {
        return this.f33847b.mo12149a();
    }

    /* renamed from: j */
    public final Map<Object, Integer> m85313j(IntRange intRange, R62<? extends InterfaceC35242Pn2> r62) {
        boolean z;
        Map<Object, Integer> emptyMap;
        int first = intRange.getFirst();
        if (first >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int min = Math.min(intRange.getLast(), r62.mo12149a() - 1);
            if (min < first) {
                emptyMap = MapsKt__MapsKt.emptyMap();
                return emptyMap;
            }
            HashMap hashMap = new HashMap();
            r62.mo12148b(first, min, new C7470b(first, min, hashMap));
            return hashMap;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
