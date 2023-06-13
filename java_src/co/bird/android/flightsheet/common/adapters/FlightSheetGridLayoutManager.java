package co.bird.android.flightsheet.common.adapters;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC11834D;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \f*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\rB\u001d\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$D;", "T", "Landroidx/recyclerview/widget/GridLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$h;", "X", "Landroidx/recyclerview/widget/RecyclerView$h;", "adapter", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;Landroidx/recyclerview/widget/RecyclerView$h;)V", "Y", "b", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class FlightSheetGridLayoutManager<T extends RecyclerView.AbstractC11834D> extends GridLayoutManager {

    /* renamed from: Y */
    public static final C15968b f65996Y = new C15968b(null);

    /* renamed from: X */
    public final RecyclerView.AbstractC11843h<T> f65997X;

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, m28432d2 = {"co/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager$a", "Landroidx/recyclerview/widget/GridLayoutManager$b;", "", "position", "f", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.flightsheet.common.adapters.FlightSheetGridLayoutManager$a */
    /* loaded from: classes3.dex */
    public static final class C15967a extends GridLayoutManager.AbstractC11826b {

        /* renamed from: e */
        public final /* synthetic */ FlightSheetGridLayoutManager<T> f65998e;

        public C15967a(FlightSheetGridLayoutManager<T> flightSheetGridLayoutManager) {
            this.f65998e = flightSheetGridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC11826b
        /* renamed from: f */
        public int mo56202f(int i) {
            if (this.f65998e.f65997X.getItemViewType(i) == C37548Zj4.item_flight_sheet_command) {
                return 1;
            }
            return this.f65998e.m66769o3();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/flightsheet/common/adapters/FlightSheetGridLayoutManager$b;", "", "", "SPAN_COUNT", "I", "<init>", "()V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.flightsheet.common.adapters.FlightSheetGridLayoutManager$b */
    /* loaded from: classes3.dex */
    public static final class C15968b {
        public /* synthetic */ C15968b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C15968b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightSheetGridLayoutManager(Context context, RecyclerView.AbstractC11843h<T> adapter) {
        super(context, 3);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f65997X = adapter;
        m66760x3(new C15967a(this));
    }
}
