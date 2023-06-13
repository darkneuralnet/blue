package co.bird.android.feature.complaintresolution.adapter;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC11834D;
import ch.qos.logback.core.CoreConstants;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\rB\u001d\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$D;", "T", "Landroidx/recyclerview/widget/GridLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$h;", "X", "Landroidx/recyclerview/widget/RecyclerView$h;", "adapter", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;Landroidx/recyclerview/widget/RecyclerView$h;)V", "Y", "b", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ComplaintResolutionGridLayoutManager<T extends RecyclerView.AbstractC11834D> extends GridLayoutManager {

    /* renamed from: Y */
    public static final C14739b f63715Y = new C14739b(null);

    /* renamed from: X */
    public final RecyclerView.AbstractC11843h<T> f63716X;

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, m28432d2 = {"co/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager$a", "Landroidx/recyclerview/widget/GridLayoutManager$b;", "", "position", "f", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nComplaintResolutionGridLayoutManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionGridLayoutManager.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,34:1\n1774#2,4:35\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionGridLayoutManager.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager$1\n*L\n20#1:35,4\n*E\n"})
    /* renamed from: co.bird.android.feature.complaintresolution.adapter.ComplaintResolutionGridLayoutManager$a */
    /* loaded from: classes3.dex */
    public static final class C14738a extends GridLayoutManager.AbstractC11826b {

        /* renamed from: e */
        public final /* synthetic */ ComplaintResolutionGridLayoutManager<T> f63717e;

        public C14738a(ComplaintResolutionGridLayoutManager<T> complaintResolutionGridLayoutManager) {
            this.f63717e = complaintResolutionGridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC11826b
        /* renamed from: f */
        public int mo56202f(int i) {
            IntRange until;
            boolean z;
            int i2 = 0;
            until = RangesKt___RangesKt.until(0, this.f63717e.f63716X.getItemCount());
            ComplaintResolutionGridLayoutManager<T> complaintResolutionGridLayoutManager = this.f63717e;
            if (!(until instanceof Collection) || !((Collection) until).isEmpty()) {
                Iterator<Integer> it = until.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    if (complaintResolutionGridLayoutManager.f63716X.getItemViewType(((IntIterator) it).nextInt()) == C36603Vi4.item_take_photo) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && (i3 = i3 + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
                i2 = i3;
            }
            if (this.f63717e.f63716X.getItemViewType(i) == C36603Vi4.item_take_photo) {
                return this.f63717e.m66769o3() / i2;
            }
            return this.f63717e.m66769o3();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionGridLayoutManager$b;", "", "", "SPAN_COUNT", "I", "<init>", "()V", "co.bird.android.feature.complaintresolution"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.complaintresolution.adapter.ComplaintResolutionGridLayoutManager$b */
    /* loaded from: classes3.dex */
    public static final class C14739b {
        public /* synthetic */ C14739b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C14739b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComplaintResolutionGridLayoutManager(Context context, RecyclerView.AbstractC11843h<T> adapter) {
        super(context, 2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f63716X = adapter;
        m66760x3(new C14738a(this));
    }
}
