package com.stripe.android.uicore.image;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "com/stripe/android/uicore/image/DrawablePainter$callback$2$1", "invoke", "()Lcom/stripe/android/uicore/image/DrawablePainter$callback$2$1;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class DrawablePainter$callback$2 extends Lambda implements Function0<C194951> {
    final /* synthetic */ DrawablePainter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawablePainter$callback$2(DrawablePainter drawablePainter) {
        super(0);
        this.this$0 = drawablePainter;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.stripe.android.uicore.image.DrawablePainter$callback$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public final C194951 invoke() {
        final DrawablePainter drawablePainter = this.this$0;
        return new Drawable.Callback() { // from class: com.stripe.android.uicore.image.DrawablePainter$callback$2.1
            @Override // android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(Drawable d) {
                int drawInvalidateTick;
                long intrinsicSize;
                Intrinsics.checkNotNullParameter(d, "d");
                DrawablePainter drawablePainter2 = DrawablePainter.this;
                drawInvalidateTick = drawablePainter2.getDrawInvalidateTick();
                drawablePainter2.setDrawInvalidateTick(drawInvalidateTick + 1);
                DrawablePainter drawablePainter3 = DrawablePainter.this;
                intrinsicSize = DrawablePainterKt.getIntrinsicSize(drawablePainter3.getDrawable());
                drawablePainter3.m116757setDrawableIntrinsicSizeuvyYCjk(intrinsicSize);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void scheduleDrawable(Drawable d, Runnable what, long j) {
                Handler main_handler;
                Intrinsics.checkNotNullParameter(d, "d");
                Intrinsics.checkNotNullParameter(what, "what");
                main_handler = DrawablePainterKt.getMAIN_HANDLER();
                main_handler.postAtTime(what, j);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void unscheduleDrawable(Drawable d, Runnable what) {
                Handler main_handler;
                Intrinsics.checkNotNullParameter(d, "d");
                Intrinsics.checkNotNullParameter(what, "what");
                main_handler = DrawablePainterKt.getMAIN_HANDLER();
                main_handler.removeCallbacks(what);
            }
        };
    }
}
