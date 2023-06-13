package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.C11925l;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import io.reactivex.subjects.C24558d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u00102\u001a\u000201\u0012\b\b\u0002\u00103\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u001a\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b6\u00107J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0003H\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J@\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\nH\u0016J@\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\nH\u0002R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u0014\u0010!\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0014\u0010#\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u00100\u001a\u0010\u0012\f\u0012\n -*\u0004\u0018\u00010\u00030\u00030,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00068"}, m28432d2 = {"LmX5;", "Landroidx/recyclerview/widget/l$h;", "Lio/reactivex/Observable;", "", "b", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$D;", "viewHolder", "target", "", "onMove", "direction", "", "onSwiped", "getSwipeDirs", "Landroid/graphics/Canvas;", "c", "", "dX", "dY", "actionState", "isCurrentlyActive", "onChildDraw", "canvas", C17296a.f69688o, "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "canSwipe", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable;", "deleteIcon", "I", "intrinsicWidth", DateTokenConverter.CONVERTER_KEY, "intrinsicHeight", "Landroid/graphics/drawable/ColorDrawable;", "e", "Landroid/graphics/drawable/ColorDrawable;", "removeBackgroundDrawable", "Landroid/graphics/Paint;", "f", "Landroid/graphics/Paint;", "clearPaint", "Lio/reactivex/subjects/d;", "kotlin.jvm.PlatformType", "g", "Lio/reactivex/subjects/d;", "itemSwipedSubject", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "swipeDirections", "LnX5;", "swipeToRemoveUi", "<init>", "(Landroid/content/Context;ILkotlin/jvm/functions/Function1;LnX5;)V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwipeToRemoveHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToRemoveHelper.kt\nco/bird/android/core/base/ui/SwipeToRemoveHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n1#2:109\n*E\n"})
/* renamed from: mX5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C45142mX5 extends C11925l.AbstractC11936h {

    /* renamed from: a */
    public final Function1<RecyclerView.AbstractC11834D, Boolean> f98310a;

    /* renamed from: b */
    public final Drawable f98311b;

    /* renamed from: c */
    public final int f98312c;

    /* renamed from: d */
    public final int f98313d;

    /* renamed from: e */
    public final ColorDrawable f98314e;

    /* renamed from: f */
    public final Paint f98315f;

    /* renamed from: g */
    public final C24558d<Integer> f98316g;

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Landroidx/recyclerview/widget/RecyclerView$D;", "it", "", C17296a.f69688o, "(Landroidx/recyclerview/widget/RecyclerView$D;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: mX5$a */
    /* loaded from: classes2.dex */
    public static final class C26112a extends Lambda implements Function1<RecyclerView.AbstractC11834D, Boolean> {

        /* renamed from: g */
        public static final C26112a f98317g = new C26112a();

        public C26112a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(RecyclerView.AbstractC11834D it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ C45142mX5(Context context, int i, Function1 function1, InterfaceC45735nX5 interfaceC45735nX5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? 4 : i, (i2 & 4) != 0 ? C26112a.f98317g : function1, (i2 & 8) != 0 ? null : interfaceC45735nX5);
    }

    /* renamed from: a */
    public final void m25452a(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC11834D abstractC11834D, float f, float f2, int i, boolean z) {
        boolean z2;
        int coerceAtLeast;
        View view = abstractC11834D.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "viewHolder.itemView");
        int bottom = view.getBottom() - view.getTop();
        boolean z3 = true;
        if (f == 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || z) {
            z3 = false;
        }
        if (z3) {
            canvas.drawRect(view.getRight() + f, view.getTop(), view.getRight(), view.getBottom(), this.f98315f);
            super.onChildDraw(canvas, recyclerView, abstractC11834D, f, f2, i, z);
            return;
        }
        int i2 = (int) f;
        this.f98314e.setBounds(view.getRight() + i2, view.getTop(), view.getRight(), view.getBottom());
        this.f98314e.draw(canvas);
        int i3 = (bottom - this.f98313d) / 2;
        int top = view.getTop() + ((bottom - this.f98313d) / 2);
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(view.getRight() + i2, (view.getRight() - i3) - this.f98312c);
        this.f98311b.setBounds(coerceAtLeast, top, view.getRight() - i3, this.f98313d + top);
        this.f98311b.draw(canvas);
        super.onChildDraw(canvas, recyclerView, abstractC11834D, f, f2, i, z);
    }

    /* renamed from: b */
    public final Observable<Integer> m25451b() {
        Observable<Integer> hide = this.f98316g.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "itemSwipedSubject.hide()");
        return hide;
    }

    @Override // androidx.recyclerview.widget.C11925l.AbstractC11936h
    public int getSwipeDirs(RecyclerView recyclerView, RecyclerView.AbstractC11834D viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (!this.f98310a.invoke(viewHolder).booleanValue()) {
            return 0;
        }
        return super.getSwipeDirs(recyclerView, viewHolder);
    }

    @Override // androidx.recyclerview.widget.C11925l.AbstractC11930e
    public void onChildDraw(Canvas c, RecyclerView recyclerView, RecyclerView.AbstractC11834D viewHolder, float f, float f2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        m25452a(c, recyclerView, viewHolder, f, f2, i, z);
    }

    @Override // androidx.recyclerview.widget.C11925l.AbstractC11930e
    public boolean onMove(RecyclerView recyclerView, RecyclerView.AbstractC11834D viewHolder, RecyclerView.AbstractC11834D target) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(target, "target");
        return false;
    }

    @Override // androidx.recyclerview.widget.C11925l.AbstractC11930e
    public void onSwiped(RecyclerView.AbstractC11834D viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.f98316g.onNext(Integer.valueOf(viewHolder.getAdapterPosition()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C45142mX5(Context context, int i, Function1<? super RecyclerView.AbstractC11834D, Boolean> canSwipe, InterfaceC45735nX5 interfaceC45735nX5) {
        super(0, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(canSwipe, "canSwipe");
        this.f98310a = canSwipe;
        Drawable m41773i = C40788fB0.m41773i(context, C48193rg4.ic_trash);
        C42529i71.m34432a(m41773i, C40788fB0.m41776f(context, C32364Df4.white));
        this.f98311b = m41773i;
        this.f98312c = m41773i.getIntrinsicWidth();
        this.f98313d = m41773i.getIntrinsicHeight();
        ColorDrawable colorDrawable = new ColorDrawable();
        colorDrawable.setColor(C40788fB0.m41776f(context, C32364Df4.birdRed));
        this.f98314e = colorDrawable;
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f98315f = paint;
        C24558d<Integer> m31902e = C24558d.m31902e();
        Intrinsics.checkNotNullExpressionValue(m31902e, "create<Int>()");
        this.f98316g = m31902e;
    }
}
