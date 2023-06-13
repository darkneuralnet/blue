package p000;

import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0015¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0016\u0010\u000e\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\u0011\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016R\u0018\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001c¨\u0006!"}, m28432d2 = {"LE6;", "", "", "index", "LG6;", "item", "", "l", "", "LH6;", "sections", "", C17296a.f69688o, "c", "b", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "i", "k", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$h;", "adapter", "", "Ljava/util/List;", "adapterSections", "j", "()Ljava/util/List;", "h", "items", "<init>", "(Landroidx/recyclerview/widget/RecyclerView$h;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAdapterData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdapterData.kt\nco/bird/android/widget/adapter/AdapterDataImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,301:1\n1360#2:302\n1446#2,5:303\n288#2,2:308\n288#2,2:310\n2976#2,5:313\n223#2,2:318\n1#3:312\n*S KotlinDebug\n*F\n+ 1 AdapterData.kt\nco/bird/android/widget/adapter/AdapterDataImpl\n*L\n163#1:302\n163#1:303,5\n174#1:308,2\n199#1:310,2\n267#1:313,5\n294#1:318,2\n*E\n"})
/* renamed from: E6 */
/* loaded from: classes4.dex */
public final class C1737E6 {

    /* renamed from: a */
    public final RecyclerView.AbstractC11843h<?> f6962a;

    /* renamed from: b */
    public final List<C3023H6> f6963b;

    public C1737E6(RecyclerView.AbstractC11843h<?> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f6962a = adapter;
        this.f6963b = new ArrayList();
    }

    /* renamed from: a */
    public void m109401a(Collection<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f6963b.addAll(sections);
    }

    /* renamed from: b */
    public void m109400b(Collection<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        m109401a(sections);
        int i = 0;
        for (C3023H6 c3023h6 : sections) {
            i += c3023h6.m104407f();
        }
        this.f6962a.notifyItemRangeInserted(m109395g() - i, i);
    }

    /* renamed from: c */
    public void m109399c() {
        this.f6963b.clear();
    }

    /* renamed from: d */
    public void m109398d() {
        int m109395g = m109395g();
        m109399c();
        this.f6962a.notifyItemRangeRemoved(0, m109395g);
    }

    /* renamed from: e */
    public final C2637G6 m109397e(int i) {
        return m109396f(i);
    }

    /* renamed from: f */
    public C2637G6 m109396f(int i) {
        int i2 = 0;
        for (C3023H6 c3023h6 : this.f6963b) {
            if (c3023h6.m104407f() + i2 > i) {
                return c3023h6.m104411b(i - i2);
            }
            i2 += c3023h6.m104407f();
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: g */
    public int m109395g() {
        return m109394h().size();
    }

    /* renamed from: h */
    public List<C2637G6> m109394h() {
        List<C2637G6> mutableList;
        ArrayList arrayList = new ArrayList();
        for (C3023H6 c3023h6 : this.f6963b) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, c3023h6.m104408e());
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return mutableList;
    }

    /* renamed from: i */
    public C3023H6 m109393i(C2637G6 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        for (C3023H6 c3023h6 : m109392j()) {
            if (c3023h6.m104408e().contains(item)) {
                return c3023h6;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* renamed from: j */
    public List<C3023H6> m109392j() {
        return new ArrayList(this.f6963b);
    }

    /* renamed from: k */
    public boolean m109391k() {
        return m109395g() == 0;
    }

    /* renamed from: l */
    public boolean m109390l(int i, C2637G6 item) {
        boolean z;
        Object obj;
        boolean z2;
        Intrinsics.checkNotNullParameter(item, "item");
        if (i >= 0 && i <= m109395g() - 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        C2637G6 c2637g6 = m109394h().get(i);
        Iterator<T> it = m109392j().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                C3023H6 c3023h6 = (C3023H6) obj;
                if (c3023h6.m104410c().contains(c2637g6) && c3023h6.m104409d() != c2637g6) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C3023H6 c3023h62 = (C3023H6) obj;
        if (c3023h62 == null) {
            return false;
        }
        int indexOf = c3023h62.m104410c().indexOf(c2637g6);
        c3023h62.m104410c().remove(c2637g6);
        c3023h62.m104410c().add(indexOf, item);
        return true;
    }
}
