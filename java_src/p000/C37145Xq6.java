package p000;

import android.animation.Animator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewAnimationUtils;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0000\u001a\u0014\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0001¨\u0006\r"}, m28432d2 = {"Landroid/view/View;", "", "shouldVisible", "", "f", "Landroid/graphics/Point;", "e", "isStatusBarVisible", "", DateTokenConverter.CONVERTER_KEY, "", "circularDuration", "b", "balloon_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: Xq6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37145Xq6 {
    @TargetApi(21)
    /* renamed from: b */
    public static final /* synthetic */ void m76211b(final View view, final long j) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(4);
        view.post(new Runnable() { // from class: Wq6
            @Override // java.lang.Runnable
            public final void run() {
                C37145Xq6.m76210c(view, j);
            }
        });
    }

    /* renamed from: c */
    public static final void m76210c(View this_circularRevealed, long j) {
        Intrinsics.checkNotNullParameter(this_circularRevealed, "$this_circularRevealed");
        if (this_circularRevealed.isAttachedToWindow()) {
            this_circularRevealed.setVisibility(0);
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(this_circularRevealed, (this_circularRevealed.getLeft() + this_circularRevealed.getRight()) / 2, (this_circularRevealed.getTop() + this_circularRevealed.getBottom()) / 2, 0.0f, Math.max(this_circularRevealed.getWidth(), this_circularRevealed.getHeight()));
            createCircularReveal.setDuration(j);
            createCircularReveal.start();
        }
    }

    /* renamed from: d */
    public static final /* synthetic */ int m76209d(View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Rect rect = new Rect();
        Context context = view.getContext();
        if ((context instanceof Activity) && z) {
            ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            return rect.top;
        }
        return 0;
    }

    /* renamed from: e */
    public static final /* synthetic */ Point m76208e(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    /* renamed from: f */
    public static final /* synthetic */ void m76207f(View view, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }
}
