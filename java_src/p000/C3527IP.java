package p000;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J \u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0013"}, m28432d2 = {"LIP;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "getItemOffsets", "Landroid/graphics/Canvas;", "c", "onDraw", "<init>", "()V", "b", C17296a.f69688o, "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: IP */
/* loaded from: classes3.dex */
public final class C3527IP extends RecyclerView.AbstractC11854o {

    /* renamed from: b */
    public static final C3528a f15444b = new C3528a(null);

    /* renamed from: c */
    public static final int f15445c = (int) C49347td3.m12001b(4);

    /* renamed from: d */
    public static final int f15446d = (int) C49347td3.m12001b(24);

    /* renamed from: e */
    public static final int f15447e = (int) C49347td3.m12001b(8);

    /* renamed from: f */
    public static final int f15448f = (int) C49347td3.m12001b(24);

    /* renamed from: g */
    public static final int f15449g = (int) C49347td3.m12001b(16);

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, m28432d2 = {"LIP$a;", "", "", "FOOTER_BOTTOM_MARGIN", "I", "FOOTER_TOP_MARGIN", "PERK_HEADER_BOTTOM_MARGIN", "PERK_HEADER_TOP_MARGIN", "PERK_TOP_MARGIN", "<init>", "()V", "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: IP$a */
    /* loaded from: classes3.dex */
    public static final class C3528a {
        public /* synthetic */ C3528a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C3528a() {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C11872z state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Integer m40591a = C41207ft4.m40591a(parent, view);
        if (m40591a != null) {
            int intValue = m40591a.intValue();
            RecyclerView.AbstractC11843h adapter = parent.getAdapter();
            if (adapter != null) {
                int itemViewType = adapter.getItemViewType(intValue);
                if (itemViewType == C47640qk4.item_bird_plus_details_perk_header) {
                    outRect.top = f15446d;
                    outRect.bottom = f15445c;
                } else if (itemViewType == C47640qk4.item_bird_plus_details_perk) {
                    outRect.top = f15447e;
                } else if (itemViewType == C47640qk4.item_bird_plus_details_footer) {
                    outRect.top = f15448f;
                    outRect.bottom = f15449g;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.C11872z state) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
    }
}
