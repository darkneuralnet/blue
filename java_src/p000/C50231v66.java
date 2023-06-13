package p000;

import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.chuckerteam.chucker.internal.support.SpanTextUtil;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import p000.G76;
import p000.H76;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b!\u0010\u0019J\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J'\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\f\u0010\u001b\u001a\u00020\t*\u00020\u001aH\u0002R$\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00040\u001cj\b\u0012\u0004\u0012\u00020\u0004`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$"}, m28432d2 = {"Lv66;", "Landroidx/recyclerview/widget/RecyclerView$h;", "LH76;", "", "LG76;", "bodyItems", "", "u", "holder", "", "position", "q", "Landroid/view/ViewGroup;", "parent", "viewType", "r", "getItemCount", "getItemViewType", "", "newText", "backgroundColor", "foregroundColor", "p", "(Ljava/lang/String;II)V", "t", "()V", "Landroid/text/SpannableStringBuilder;", "o", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "b", "Ljava/util/ArrayList;", "items", "<init>", "c", C17296a.f69688o, "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransactionPayloadAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionPayloadAdapter.kt\ncom/chuckerteam/chucker/internal/ui/transaction/TransactionBodyAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n*L\n1#1,187:1\n800#2,11:188\n1855#2,2:199\n800#2,11:201\n1855#2,2:212\n34#3:214\n*S KotlinDebug\n*F\n+ 1 TransactionPayloadAdapter.kt\ncom/chuckerteam/chucker/internal/ui/transaction/TransactionBodyAdapter\n*L\n70#1:188,11\n72#1:199,2\n90#1:201,11\n92#1:212,2\n112#1:214\n*E\n"})
/* renamed from: v66  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C50231v66 extends RecyclerView.AbstractC11843h<H76> {

    /* renamed from: c */
    public static final C29419a f113539c = new C29419a(null);

    /* renamed from: b */
    public final ArrayList<G76> f113540b = new ArrayList<>();

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, m28432d2 = {"Lv66$a;", "", "", "TYPE_BODY_LINE", "I", "TYPE_HEADERS", "TYPE_IMAGE", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: v66$a */
    /* loaded from: classes5.dex */
    public static final class C29419a {
        public /* synthetic */ C29419a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C29419a() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.f113540b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemViewType(int i) {
        G76 g76 = this.f113540b.get(i);
        if (g76 instanceof G76.C2668b) {
            return 1;
        }
        if (g76 instanceof G76.C2667a) {
            return 2;
        }
        if (g76 instanceof G76.C2669c) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: o */
    public final int m9175o(SpannableStringBuilder spannableStringBuilder) {
        Object[] spans = spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), Object.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(start, end, T::class.java)");
        int i = 0;
        for (Object obj : spans) {
            if (!(obj instanceof SpanTextUtil.ChuckerForegroundColorSpan)) {
                spannableStringBuilder.removeSpan(obj);
                i++;
            }
        }
        return i;
    }

    /* renamed from: p */
    public final void m9174p(String newText, int i, int i2) {
        Iterable<IndexedValue> withIndex;
        boolean contains;
        Intrinsics.checkNotNullParameter(newText, "newText");
        ArrayList<G76> arrayList = this.f113540b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof G76.C2667a) {
                arrayList2.add(obj);
            }
        }
        withIndex = CollectionsKt___CollectionsKt.withIndex(arrayList2);
        for (IndexedValue indexedValue : withIndex) {
            int component1 = indexedValue.component1();
            G76.C2667a c2667a = (G76.C2667a) indexedValue.component2();
            contains = StringsKt__StringsKt.contains((CharSequence) c2667a.m105724a(), (CharSequence) newText, true);
            if (contains) {
                m9175o(c2667a.m105724a());
                c2667a.m105723b(C47108pq5.m18642b(c2667a.m105724a(), newText, i, i2));
                notifyItemChanged(component1 + 1);
            } else if (m9175o(c2667a.m105724a()) > 0) {
                notifyItemChanged(component1 + 1);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: q */
    public void onBindViewHolder(H76 holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        G76 g76 = this.f113540b.get(i);
        Intrinsics.checkNotNullExpressionValue(g76, "items[position]");
        holder.mo104383a(g76);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: r */
    public H76 onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        if (i != 1) {
            if (i != 2) {
                C49997uj0 m9839c = C49997uj0.m9839c(from, parent, false);
                Intrinsics.checkNotNullExpressionValue(m9839c, "inflate(inflater, parent, false)");
                return new H76.C3028c(m9839c);
            }
            C48811sj0 m13779c = C48811sj0.m13779c(from, parent, false);
            Intrinsics.checkNotNullExpressionValue(m13779c, "inflate(inflater, parent, false)");
            return new H76.C3026a(m13779c);
        }
        C49404tj0 m11846c = C49404tj0.m11846c(from, parent, false);
        Intrinsics.checkNotNullExpressionValue(m11846c, "inflate(inflater, parent, false)");
        return new H76.C3027b(m11846c);
    }

    /* renamed from: t */
    public final void m9171t() {
        Iterable<IndexedValue> withIndex;
        ArrayList<G76> arrayList = this.f113540b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof G76.C2667a) {
                arrayList2.add(obj);
            }
        }
        withIndex = CollectionsKt___CollectionsKt.withIndex(arrayList2);
        for (IndexedValue indexedValue : withIndex) {
            int component1 = indexedValue.component1();
            if (m9175o(((G76.C2667a) indexedValue.component2()).m105724a()) > 0) {
                notifyItemChanged(component1 + 1);
            }
        }
    }

    /* renamed from: u */
    public final void m9170u(List<? extends G76> bodyItems) {
        Intrinsics.checkNotNullParameter(bodyItems, "bodyItems");
        int size = this.f113540b.size();
        this.f113540b.clear();
        this.f113540b.addAll(bodyItems);
        notifyItemRangeRemoved(0, size);
        notifyItemRangeInserted(0, this.f113540b.size());
    }
}
