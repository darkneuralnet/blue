package p000;

import androidx.recyclerview.widget.C11905h;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&J$\u0010\u000f\u001a\u00020\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¨\u0006\u0010"}, m28432d2 = {"LF6;", "", "LG6;", "adapterItem", "", "b", "oldItem", "newItem", "", "c", "", "LH6;", "oldItems", "newItems", "Landroidx/recyclerview/widget/h$e;", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: F6 */
/* loaded from: classes4.dex */
public interface InterfaceC2152F6 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nAdapterDiffCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdapterDiffCallback.kt\nco/bird/android/widget/adapter/AdapterDiffCallback$DefaultImpls\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n1360#2:48\n1446#2,5:49\n1360#2:54\n1446#2,5:55\n*S KotlinDebug\n*F\n+ 1 AdapterDiffCallback.kt\nco/bird/android/widget/adapter/AdapterDiffCallback$DefaultImpls\n*L\n26#1:48\n26#1:49,5\n27#1:54\n27#1:55,5\n*E\n"})
    /* renamed from: F6$a */
    /* loaded from: classes4.dex */
    public static final class C2153a {

        @Metadata(m28433d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m28432d2 = {"F6$a$a", "Landroidx/recyclerview/widget/h$b;", "", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "areContentsTheSame", "getOldListSize", "getNewListSize", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: F6$a$a */
        /* loaded from: classes4.dex */
        public static final class C2154a extends C11905h.AbstractC11907b {

            /* renamed from: a */
            public final /* synthetic */ List<C2637G6> f8744a;

            /* renamed from: b */
            public final /* synthetic */ List<C2637G6> f8745b;

            /* renamed from: c */
            public final /* synthetic */ InterfaceC2152F6 f8746c;

            public C2154a(List<C2637G6> list, List<C2637G6> list2, InterfaceC2152F6 interfaceC2152F6) {
                this.f8744a = list;
                this.f8745b = list2;
                this.f8746c = interfaceC2152F6;
            }

            @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
            public boolean areContentsTheSame(int i, int i2) {
                return !this.f8746c.mo28c(this.f8744a.get(i), this.f8745b.get(i2));
            }

            @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
            public boolean areItemsTheSame(int i, int i2) {
                return Intrinsics.areEqual(this.f8746c.mo29b(this.f8744a.get(i)), this.f8746c.mo29b(this.f8745b.get(i2)));
            }

            @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
            public int getNewListSize() {
                return this.f8745b.size();
            }

            @Override // androidx.recyclerview.widget.C11905h.AbstractC11907b
            public int getOldListSize() {
                return this.f8744a.size();
            }
        }

        /* renamed from: a */
        public static C11905h.C11910e m107745a(InterfaceC2152F6 interfaceC2152F6, List<C3023H6> oldItems, List<C3023H6> newItems) {
            Intrinsics.checkNotNullParameter(oldItems, "oldItems");
            Intrinsics.checkNotNullParameter(newItems, "newItems");
            ArrayList arrayList = new ArrayList();
            for (C3023H6 c3023h6 : oldItems) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, c3023h6.m104408e());
            }
            ArrayList arrayList2 = new ArrayList();
            for (C3023H6 c3023h62 : newItems) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList2, c3023h62.m104408e());
            }
            C11905h.C11910e m66273c = C11905h.m66273c(new C2154a(arrayList, arrayList2, interfaceC2152F6), true);
            Intrinsics.checkNotNullExpressionValue(m66273c, "fun getDiffResult(\n    o…ems.size\n    }, true)\n  }");
            return m66273c;
        }
    }

    /* renamed from: a */
    C11905h.C11910e mo30a(List<C3023H6> list, List<C3023H6> list2);

    /* renamed from: b */
    String mo29b(C2637G6 c2637g6);

    /* renamed from: c */
    boolean mo28c(C2637G6 c2637g6, C2637G6 c2637g62);
}
