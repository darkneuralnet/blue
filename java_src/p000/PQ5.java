package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001f\u0010 J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\fH\u0004J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0004J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\rH\u0004J\u0016\u0010\u0013\u001a\u0004\u0018\u00010\r*\u00020\u00042\u0006\u0010\u0012\u001a\u00020\nH\u0004R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\""}, m28432d2 = {"LPQ5;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "onDrawOver", "", "headerPosition", "Landroid/view/ViewGroup;", "Landroid/view/View;", "i", "f", "nextHeader", "j", "contactPoint", "g", "LQQ5;", "b", "LQQ5;", "provider", "LPQ5$a;", "LPQ5$a;", "h", "()LPQ5$a;", "k", "(LPQ5$a;)V", "headerViewHolder", "<init>", "(LQQ5;)V", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStickyHeaderItemDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StickyHeaderItemDecoration.kt\nco/bird/android/itemdecorations/StickyHeaderItemDecoration\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1549#2:89\n1620#2,3:90\n288#2,2:93\n*S KotlinDebug\n*F\n+ 1 StickyHeaderItemDecoration.kt\nco/bird/android/itemdecorations/StickyHeaderItemDecoration\n*L\n79#1:89\n79#1:90,3\n80#1:93,2\n*E\n"})
/* renamed from: PQ5 */
/* loaded from: classes3.dex */
public class PQ5 extends RecyclerView.AbstractC11854o {

    /* renamed from: b */
    public final QQ5 f28455b;

    /* renamed from: c */
    public C6353a f28456c;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, m28432d2 = {"LPQ5$a;", "", "Landroid/view/View;", C17296a.f69688o, "Landroid/view/View;", "()Landroid/view/View;", "headerView", "", "b", "I", "()I", "viewType", "<init>", "(Landroid/view/View;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: PQ5$a */
    /* loaded from: classes3.dex */
    public static final class C6353a {

        /* renamed from: a */
        public final View f28457a;

        /* renamed from: b */
        public final int f28458b;

        public C6353a(View headerView, int i) {
            Intrinsics.checkNotNullParameter(headerView, "headerView");
            this.f28457a = headerView;
            this.f28458b = i;
        }

        /* renamed from: a */
        public final View m90306a() {
            return this.f28457a;
        }

        /* renamed from: b */
        public final int m90305b() {
            return this.f28458b;
        }
    }

    public PQ5(QQ5 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f28455b = provider;
    }

    /* renamed from: f */
    public final void m90312f(Canvas c) {
        View m90306a;
        Intrinsics.checkNotNullParameter(c, "c");
        c.save();
        c.translate(0.0f, 0.0f);
        C6353a c6353a = this.f28456c;
        if (c6353a != null && (m90306a = c6353a.m90306a()) != null) {
            m90306a.draw(c);
        }
        c.restore();
    }

    /* renamed from: g */
    public final View m90311g(RecyclerView recyclerView, int i) {
        IntRange until;
        int collectionSizeOrDefault;
        Object obj;
        boolean z;
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        until = RangesKt___RangesKt.until(0, recyclerView.getChildCount());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(until, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(recyclerView.getChildAt(((IntIterator) it).nextInt()));
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                View view = (View) obj;
                int top = view.getTop();
                if (i <= view.getBottom() && top <= i) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (View) obj;
    }

    /* renamed from: h */
    public final C6353a m90310h() {
        return this.f28456c;
    }

    /* renamed from: i */
    public final View m90309i(int i, ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, this.f28455b.mo79456j(i), parent, false);
        this.f28455b.mo79457i(m41761u, i);
        m41761u.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(parent.getWidth(), 1073741824), 0, m41761u.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(parent.getHeight(), 0), 0, m41761u.getLayoutParams().height));
        m41761u.layout(0, 0, m41761u.getMeasuredWidth(), m41761u.getMeasuredHeight());
        return m41761u;
    }

    /* renamed from: j */
    public final void m90308j(Canvas c, View nextHeader) {
        int i;
        View m90306a;
        View m90306a2;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(nextHeader, "nextHeader");
        c.save();
        float top = nextHeader.getTop();
        C6353a c6353a = this.f28456c;
        if (c6353a != null && (m90306a2 = c6353a.m90306a()) != null) {
            i = m90306a2.getHeight();
        } else {
            i = 0;
        }
        c.translate(0.0f, top - i);
        C6353a c6353a2 = this.f28456c;
        if (c6353a2 != null && (m90306a = c6353a2.m90306a()) != null) {
            m90306a.draw(c);
        }
        c.restore();
    }

    /* renamed from: k */
    public final void m90307k(C6353a c6353a) {
        this.f28456c = c6353a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.C11872z state) {
        Integer m40591a;
        View view;
        View m90306a;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        boolean z = false;
        View childAt = parent.getChildAt(0);
        if (childAt != null && (m40591a = C41207ft4.m40591a(parent, childAt)) != null) {
            Integer mo79454n = this.f28455b.mo79454n(m40591a.intValue());
            if (mo79454n != null) {
                int intValue = mo79454n.intValue();
                C6353a c6353a = this.f28456c;
                int mo79456j = this.f28455b.mo79456j(intValue);
                if (c6353a != null && c6353a.m90305b() == mo79456j) {
                    z = true;
                }
                if (z) {
                    this.f28455b.mo79457i(c6353a.m90306a(), intValue);
                } else {
                    this.f28456c = new C6353a(m90309i(intValue, parent), mo79456j);
                }
                C6353a c6353a2 = this.f28456c;
                if (c6353a2 != null && (m90306a = c6353a2.m90306a()) != null) {
                    view = m90311g(parent, m90306a.getBottom());
                } else {
                    view = null;
                }
                if (view != null && this.f28455b.mo79455k(parent.getChildAdapterPosition(view))) {
                    m90308j(c, view);
                } else {
                    m90312f(c);
                }
            }
        }
    }
}
