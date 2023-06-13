package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"B/\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002R\u0014\u0010\u0016\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001d¨\u0006#"}, m28432d2 = {"LdE3;", "Landroidx/recyclerview/widget/RecyclerView$o;", "Landroid/graphics/Canvas;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroidx/recyclerview/widget/RecyclerView$z;", TransferTable.COLUMN_STATE, "", "onDrawOver", "Landroid/graphics/Rect;", "outRect", "Landroid/view/View;", "view", "getItemOffsets", "canvas", "", "numIndicators", "activePos", "f", "b", "I", "indicatorSizeDp", "indicatorSeparationDp", DateTokenConverter.CONVERTER_KEY, "activeColor", "e", "inactiveColor", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "<init>", "(IIII)V", "g", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: dE3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39633dE3 extends RecyclerView.AbstractC11854o {

    /* renamed from: g */
    public static final C19702a f76295g = new C19702a(null);

    /* renamed from: b */
    public final int f76296b;

    /* renamed from: c */
    public final int f76297c;

    /* renamed from: d */
    public final int f76298d;

    /* renamed from: e */
    public final int f76299e;

    /* renamed from: f */
    public final Paint f76300f;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"LdE3$a;", "", "", "DEFAULT_INDICATOR_SEPARATION_DP", "I", "DEFAULT_INDICATOR_SIZE_DP", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: dE3$a */
    /* loaded from: classes4.dex */
    public static final class C19702a {
        public /* synthetic */ C19702a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C19702a() {
        }
    }

    public C39633dE3() {
        this(0, 0, 0, 0, 15, null);
    }

    /* renamed from: f */
    public final void m44500f(Canvas canvas, int i, int i2) {
        int i3;
        if (i <= 1) {
            return;
        }
        float width = ((canvas.getWidth() - ((i * C49347td3.m12001b(Integer.valueOf(this.f76296b))) + ((i - 1) * C49347td3.m12001b(Integer.valueOf(this.f76297c))))) + C49347td3.m12001b(Integer.valueOf(this.f76296b))) / 2.0f;
        float height = canvas.getHeight() - C49347td3.m12001b(Integer.valueOf(this.f76296b));
        for (int i4 = 0; i4 < i; i4++) {
            Paint paint = this.f76300f;
            if (i4 == i2) {
                i3 = this.f76298d;
            } else {
                i3 = this.f76299e;
            }
            paint.setColor(i3);
            canvas.drawCircle((i4 * C49347td3.m12001b(Integer.valueOf(this.f76296b + this.f76297c))) + width, height, C49347td3.m12001b(Integer.valueOf(this.f76296b)) / 2, this.f76300f);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C11872z state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        outRect.bottom = (int) C49347td3.m12001b(Integer.valueOf(this.f76296b));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11854o
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.C11872z state) {
        LinearLayoutManager linearLayoutManager;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDrawOver(c, parent, state);
        int computeHorizontalScrollOffset = parent.computeHorizontalScrollOffset() % parent.getWidth();
        RecyclerView.AbstractC11855p layoutManager = parent.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        int i3 = 0;
        if (linearLayoutManager != null) {
            i = linearLayoutManager.m66707r2();
        } else {
            i = 0;
        }
        if (computeHorizontalScrollOffset / parent.getWidth() > 0.5d) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i4 = i + i2;
        RecyclerView.AbstractC11843h adapter = parent.getAdapter();
        if (adapter != null) {
            i3 = adapter.getItemCount();
        }
        m44500f(c, i3, i4);
    }

    public /* synthetic */ C39633dE3(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 5 : i, (i5 & 2) != 0 ? 2 : i2, (i5 & 4) != 0 ? -16777216 : i3, (i5 & 8) != 0 ? -7829368 : i4);
    }

    public C39633dE3(int i, int i2, int i3, int i4) {
        this.f76296b = i;
        this.f76297c = i2;
        this.f76298d = i3;
        this.f76299e = i4;
        Paint paint = new Paint();
        paint.setStrokeWidth(0.0f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.f76300f = paint;
    }
}
