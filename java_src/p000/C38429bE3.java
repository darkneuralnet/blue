package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import p000.AbstractC40818fE3;
import p000.C40572ep2;
import p000.ZD3;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b&\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005:\u0001NB\t\b\u0016¢\u0006\u0004\bP\u0010QB\u0017\b\u0012\u0012\f\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\bP\u0010SJ:\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0010\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J \u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000JD\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0010\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\r\u001a\u00020\fH\u0007J\u0017\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u000e\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d2\u0006\u0010\u001c\u001a\u00020\u001bJ\u001a\u0010 \u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001f\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b \u0010\u001aJ\u0016\u0010!\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006J\u0016\u0010\"\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006J\u001e\u0010$\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006J/\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b&\u0010'J/\u0010(\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b(\u0010'J-\u0010)\u001a\u00020\u000e2\u0010\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0004\b)\u0010*J-\u0010+\u001a\u00020\u000e2\u0010\u0010\t\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0004\b+\u0010*J\b\u0010-\u001a\u00020,H\u0016R$\u00101\u001a\u0012\u0012\u000e\u0012\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\b0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R$\u00105\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u00068\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b3\u0010\u0014\u001a\u0004\b3\u00104R$\u00108\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u00068\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b6\u0010\u0014\u001a\u0004\b7\u00104R$\u0010\u000b\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b7\u0010\u0014\u001a\u0004\b9\u00104R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010:R$\u0010<\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u00068\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b;\u0010\u0014\u001a\u0004\b/\u00104R\u0016\u0010>\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010\u0014R\u0014\u0010A\u001a\u00028\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u00028\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010@R$\u0010H\u001a\u00020\u00062\u0006\u0010D\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u00104\"\u0004\bF\u0010GR\u0011\u0010J\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bI\u00104R\u0016\u0010L\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010@R\u0016\u0010M\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010@R\u0014\u0010O\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u00104¨\u0006T"}, m28432d2 = {"LbE3;", "", "T", "Ljava/util/AbstractList;", "Lep2$a;", "Lnd3;", "", "leadingNulls", "LfE3$b$c;", "page", "trailingNulls", "positionOffset", "", "counted", "", "z", "maxSize", "requiredRemaining", "localPageIndex", "A", "I", "LbE3$a;", "callback", "y", "localIndex", "f", "(I)Ljava/lang/Object;", "LZD3$d;", "config", "LhE3;", "x", "index", "get", "D", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "countToBeAdded", "H", "insertNulls", "K", "(ZIILbE3$a;)Z", "J", "E", "(LfE3$b$c;LbE3$a;)V", "o", "", "toString", "", "b", "Ljava/util/List;", "pages", "<set-?>", "c", "()I", "placeholdersBefore", DateTokenConverter.CONVERTER_KEY, "e", "placeholdersAfter", "getPositionOffset", "Z", "g", "storageCount", "h", "lastLoadAroundLocalIndex", "s", "()Ljava/lang/Object;", "firstLoadedItem", "v", "lastLoadedItem", "value", "u", "G", "(I)V", "lastLoadAroundIndex", "w", "middleOfLoadedRange", "j", "prevKey", "nextKey", C17296a.f69688o, "size", "<init>", "()V", LegacyRepairType.OTHER_KEY, "(LbE3;)V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: bE3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38429bE3<T> extends AbstractList<T> implements C40572ep2.InterfaceC20111a<Object>, InterfaceC45790nd3<T> {

    /* renamed from: b */
    public final List<AbstractC40818fE3.AbstractC20330b.C20333c<?, T>> f57110b;

    /* renamed from: c */
    public int f57111c;

    /* renamed from: d */
    public int f57112d;

    /* renamed from: e */
    public int f57113e;

    /* renamed from: f */
    public boolean f57114f;

    /* renamed from: g */
    public int f57115g;

    /* renamed from: h */
    public int f57116h;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u000f"}, m28432d2 = {"LbE3$a;", "", "", "count", "", "b", "leadingNulls", "changed", "added", C17296a.f69688o, "endPosition", "h", "startOfDrops", "f", "e", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: bE3$a */
    /* loaded from: classes.dex */
    public interface InterfaceC12326a {
        /* renamed from: a */
        void mo36678a(int i, int i2, int i3);

        /* renamed from: b */
        void mo36676b(int i);

        /* renamed from: e */
        void mo36671e(int i, int i2);

        /* renamed from: f */
        void mo36669f(int i, int i2);

        /* renamed from: h */
        void mo36666h(int i, int i2, int i3);
    }

    public C38429bE3() {
        this.f57110b = new ArrayList();
        this.f57114f = true;
    }

    /* renamed from: A */
    public final boolean m64803A(int i, int i2, int i3) {
        AbstractC40818fE3.AbstractC20330b.C20333c<?, T> c20333c = this.f57110b.get(i3);
        if (mo23407b() > i && this.f57110b.size() > 2 && mo23407b() - c20333c.m41666b().size() >= i2) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public final boolean m64802C(int i, int i2) {
        return m64803A(i, i2, this.f57110b.size() - 1);
    }

    /* renamed from: D */
    public final boolean m64801D(int i, int i2) {
        return m64803A(i, i2, 0);
    }

    /* renamed from: E */
    public final void m64800E(AbstractC40818fE3.AbstractC20330b.C20333c<?, T> page, InterfaceC12326a interfaceC12326a) {
        Intrinsics.checkNotNullParameter(page, "page");
        int size = page.m41666b().size();
        if (size == 0) {
            return;
        }
        this.f57110b.add(0, page);
        this.f57115g = mo23407b() + size;
        int min = Math.min(mo23406c(), size);
        int i = size - min;
        if (min != 0) {
            this.f57111c = mo23406c() - min;
        }
        this.f57113e -= i;
        if (interfaceC12326a != null) {
            interfaceC12326a.mo36678a(mo23406c(), min, i);
        }
    }

    /* renamed from: F */
    public /* bridge */ Object m64799F(int i) {
        return super.remove(i);
    }

    /* renamed from: G */
    public final void m64798G(int i) {
        int coerceIn;
        coerceIn = RangesKt___RangesKt.coerceIn(i - mo23406c(), 0, mo23407b() - 1);
        this.f57116h = coerceIn;
    }

    /* renamed from: H */
    public final boolean m64797H(int i, int i2, int i3) {
        if (mo23407b() + i3 > i && this.f57110b.size() > 1 && mo23407b() >= i2) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public final C38429bE3<T> m64796I() {
        return new C38429bE3<>(this);
    }

    /* renamed from: J */
    public final boolean m64795J(boolean z, int i, int i2, InterfaceC12326a callback) {
        int coerceAtMost;
        Intrinsics.checkNotNullParameter(callback, "callback");
        int i3 = 0;
        while (m64802C(i, i2)) {
            List<AbstractC40818fE3.AbstractC20330b.C20333c<?, T>> list = this.f57110b;
            int size = list.remove(list.size() - 1).m41666b().size();
            i3 += size;
            this.f57115g = mo23407b() - size;
        }
        coerceAtMost = RangesKt___RangesKt.coerceAtMost(this.f57116h, mo23407b() - 1);
        this.f57116h = coerceAtMost;
        if (i3 > 0) {
            int mo23406c = mo23406c() + mo23407b();
            if (z) {
                this.f57112d = mo23405e() + i3;
                callback.mo36671e(mo23406c, i3);
            } else {
                callback.mo36669f(mo23406c, i3);
            }
        }
        if (i3 <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: K */
    public final boolean m64794K(boolean z, int i, int i2, InterfaceC12326a callback) {
        int coerceAtLeast;
        Intrinsics.checkNotNullParameter(callback, "callback");
        int i3 = 0;
        while (m64801D(i, i2)) {
            int size = this.f57110b.remove(0).m41666b().size();
            i3 += size;
            this.f57115g = mo23407b() - size;
        }
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(this.f57116h - i3, 0);
        this.f57116h = coerceAtLeast;
        if (i3 > 0) {
            if (z) {
                int mo23406c = mo23406c();
                this.f57111c = mo23406c() + i3;
                callback.mo36671e(mo23406c, i3);
            } else {
                this.f57113e += i3;
                callback.mo36669f(mo23406c(), i3);
            }
        }
        if (i3 <= 0) {
            return false;
        }
        return true;
    }

    @Override // p000.InterfaceC45790nd3
    /* renamed from: a */
    public int mo23408a() {
        return mo23406c() + mo23407b() + mo23405e();
    }

    @Override // p000.InterfaceC45790nd3
    /* renamed from: b */
    public int mo23407b() {
        return this.f57115g;
    }

    @Override // p000.InterfaceC45790nd3
    /* renamed from: c */
    public int mo23406c() {
        return this.f57111c;
    }

    @Override // p000.InterfaceC45790nd3
    /* renamed from: e */
    public int mo23405e() {
        return this.f57112d;
    }

    @Override // p000.InterfaceC45790nd3
    /* renamed from: f */
    public T mo23404f(int i) {
        int size = this.f57110b.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = this.f57110b.get(i2).m41666b().size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return this.f57110b.get(i2).m41666b().get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        int mo23406c = i - mo23406c();
        if (i >= 0 && i < size()) {
            if (mo23406c >= 0 && mo23406c < mo23407b()) {
                return mo23404f(mo23406c);
            }
            return null;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size());
    }

    @Override // p000.C40572ep2.InterfaceC20111a
    /* renamed from: h */
    public Object mo42512h() {
        Object last;
        if (!this.f57114f || mo23405e() > 0) {
            last = CollectionsKt___CollectionsKt.last((List<? extends Object>) this.f57110b);
            return ((AbstractC40818fE3.AbstractC20330b.C20333c) last).m41663e();
        }
        return null;
    }

    @Override // p000.C40572ep2.InterfaceC20111a
    /* renamed from: j */
    public Object mo42511j() {
        Object first;
        if (!this.f57114f || mo23406c() + this.f57113e > 0) {
            first = CollectionsKt___CollectionsKt.first((List<? extends Object>) this.f57110b);
            return ((AbstractC40818fE3.AbstractC20330b.C20333c) first).m41662f();
        }
        return null;
    }

    /* renamed from: o */
    public final void m64793o(AbstractC40818fE3.AbstractC20330b.C20333c<?, T> page, InterfaceC12326a interfaceC12326a) {
        Intrinsics.checkNotNullParameter(page, "page");
        int size = page.m41666b().size();
        if (size == 0) {
            return;
        }
        this.f57110b.add(page);
        this.f57115g = mo23407b() + size;
        int min = Math.min(mo23405e(), size);
        int i = size - min;
        if (min != 0) {
            this.f57112d = mo23405e() - min;
        }
        if (interfaceC12326a != null) {
            interfaceC12326a.mo36666h((mo23406c() + mo23407b()) - size, min, i);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i) {
        return (T) m64799F(i);
    }

    /* renamed from: s */
    public final T m64792s() {
        Object first;
        Object first2;
        first = CollectionsKt___CollectionsKt.first((List<? extends Object>) this.f57110b);
        first2 = CollectionsKt___CollectionsKt.first((List<? extends Object>) ((AbstractC40818fE3.AbstractC20330b.C20333c) first).m41666b());
        return (T) first2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo23408a();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String joinToString$default;
        StringBuilder sb = new StringBuilder();
        sb.append("leading ");
        sb.append(mo23406c());
        sb.append(", storage ");
        sb.append(mo23407b());
        sb.append(", trailing ");
        sb.append(mo23405e());
        sb.append(' ');
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(this.f57110b, " ", null, null, 0, null, null, 62, null);
        sb.append(joinToString$default);
        return sb.toString();
    }

    /* renamed from: u */
    public final int m64791u() {
        return mo23406c() + this.f57116h;
    }

    /* renamed from: v */
    public final T m64790v() {
        Object last;
        Object last2;
        last = CollectionsKt___CollectionsKt.last((List<? extends Object>) this.f57110b);
        last2 = CollectionsKt___CollectionsKt.last((List<? extends Object>) ((AbstractC40818fE3.AbstractC20330b.C20333c) last).m41666b());
        return (T) last2;
    }

    /* renamed from: w */
    public final int m64789w() {
        return mo23406c() + (mo23407b() / 2);
    }

    /* renamed from: x */
    public final C42004hE3<?, T> m64788x(ZD3.C10145d config) {
        List list;
        Intrinsics.checkNotNullParameter(config, "config");
        if (this.f57110b.isEmpty()) {
            return null;
        }
        list = CollectionsKt___CollectionsKt.toList(this.f57110b);
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.paging.PagingSource.LoadResult.Page<kotlin.Any, T of androidx.paging.PagedStorage>>");
        return new C42004hE3<>(list, Integer.valueOf(m64791u()), new C40225eE3(config.f47975a, config.f47976b, config.f47977c, config.f47978d, config.f47979e, 0, 32, null), mo23406c());
    }

    /* renamed from: y */
    public final void m64787y(int i, AbstractC40818fE3.AbstractC20330b.C20333c<?, T> page, int i2, int i3, InterfaceC12326a callback, boolean z) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(callback, "callback");
        m64786z(i, page, i2, i3, z);
        callback.mo36676b(size());
    }

    /* renamed from: z */
    public final void m64786z(int i, AbstractC40818fE3.AbstractC20330b.C20333c<?, T> c20333c, int i2, int i3, boolean z) {
        this.f57111c = i;
        this.f57110b.clear();
        this.f57110b.add(c20333c);
        this.f57112d = i2;
        this.f57113e = i3;
        this.f57115g = c20333c.m41666b().size();
        this.f57114f = z;
        this.f57116h = c20333c.m41666b().size() / 2;
    }

    public C38429bE3(C38429bE3<T> c38429bE3) {
        ArrayList arrayList = new ArrayList();
        this.f57110b = arrayList;
        this.f57114f = true;
        arrayList.addAll(c38429bE3.f57110b);
        this.f57111c = c38429bE3.mo23406c();
        this.f57112d = c38429bE3.mo23405e();
        this.f57113e = c38429bE3.f57113e;
        this.f57114f = c38429bE3.f57114f;
        this.f57115g = c38429bE3.mo23407b();
        this.f57116h = c38429bE3.f57116h;
    }
}
