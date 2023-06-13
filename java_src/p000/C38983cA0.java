package p000;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.appboy.p027ui.R$dimen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u001b"}, m28432d2 = {"LcA0;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Rect;", "itemViewOutputRect", "Landroid/view/View;", "view", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "getItemOffsets", "", "parentWidth", "f", "Landroid/content/Context;", "b", "Landroid/content/Context;", "appContext", "c", "I", "itemDividerHeight", DateTokenConverter.CONVERTER_KEY, "contentCardsItemMaxWidth", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "android-sdk-ui_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: cA0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C38983cA0 extends RecyclerView.AbstractC11854o {

    /* renamed from: b */
    public final Context f60226b;

    /* renamed from: c */
    public final int f60227c;

    /* renamed from: d */
    public final int f60228d;

    public C38983cA0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f60226b = applicationContext;
        this.f60227c = applicationContext.getResources().getDimensionPixelSize(R$dimen.com_braze_content_cards_divider_height);
        this.f60228d = applicationContext.getResources().getDimensionPixelSize(R$dimen.com_braze_content_cards_max_width);
    }

    /* renamed from: f */
    public final int m61817f(int i) {
        int coerceAtLeast;
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast((i - this.f60228d) / 2, 0);
        return coerceAtLeast;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void getItemOffsets(Rect itemViewOutputRect, View view, RecyclerView parent, RecyclerView.C11872z state) {
        boolean z;
        int i;
        Intrinsics.checkNotNullParameter(itemViewOutputRect, "itemViewOutputRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(itemViewOutputRect, view, parent, state);
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int i2 = 0;
        if (parent.getAdapter() instanceof C37797aA0) {
            RecyclerView.AbstractC11843h adapter = parent.getAdapter();
            if (adapter != null) {
                z = ((C37797aA0) adapter).m71813v(childAdapterPosition);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.braze.ui.contentcards.adapters.ContentCardAdapter");
            }
        } else {
            z = false;
        }
        if (childAdapterPosition == 0) {
            i = this.f60227c;
        } else {
            i = 0;
        }
        itemViewOutputRect.top = i;
        if (!z) {
            i2 = this.f60227c;
        }
        itemViewOutputRect.bottom = i2;
        int m61817f = m61817f(parent.getWidth());
        itemViewOutputRect.left = m61817f;
        itemViewOutputRect.right = m61817f;
    }
}
