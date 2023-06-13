package com.stripe.android.uicore.image;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\u00008BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m28432d2 = {"Landroid/graphics/drawable/Drawable;", "drawable", "LnE3;", "rememberDrawablePainter", "(Landroid/graphics/drawable/Drawable;LEt0;I)LnE3;", "Landroid/os/Handler;", "MAIN_HANDLER$delegate", "Lkotlin/Lazy;", "getMAIN_HANDLER", "()Landroid/os/Handler;", "MAIN_HANDLER", "LxB5;", "getIntrinsicSize", "(Landroid/graphics/drawable/Drawable;)J", "intrinsicSize", "stripe-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDrawablePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawablePainter.kt\ncom/stripe/android/uicore/image/DrawablePainterKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,168:1\n1057#2,6:169\n*S KotlinDebug\n*F\n+ 1 DrawablePainter.kt\ncom/stripe/android/uicore/image/DrawablePainterKt\n*L\n144#1:169,6\n*E\n"})
/* loaded from: classes7.dex */
public final class DrawablePainterKt {
    private static final Lazy MAIN_HANDLER$delegate;

    static {
        Lazy lazy;
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) DrawablePainterKt$MAIN_HANDLER$2.INSTANCE);
        MAIN_HANDLER$delegate = lazy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getIntrinsicSize(Drawable drawable) {
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            return CB5.m112663a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        return C51465xB5.f117175b.m5724a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler getMAIN_HANDLER() {
        return (Handler) MAIN_HANDLER$delegate.getValue();
    }

    public static final AbstractC45562nE3 rememberDrawablePainter(Drawable drawable, InterfaceC32720Et0 interfaceC32720Et0, int i) {
        Object drawablePainter;
        interfaceC32720Et0.mo89638F(1051596613);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1051596613, i, -1, "com.stripe.android.uicore.image.rememberDrawablePainter (DrawablePainter.kt:143)");
        }
        boolean mo89539n = interfaceC32720Et0.mo89539n(drawable);
        Object mo89635G = interfaceC32720Et0.mo89635G();
        if (mo89539n || mo89635G == InterfaceC32720Et0.f8257a.m108267a()) {
            if (drawable == null) {
                mo89635G = EmptyPainter.INSTANCE;
            } else if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                Intrinsics.checkNotNullExpressionValue(bitmap, "drawable.bitmap");
                mo89635G = new C13582cU(C6809Qc.m88362c(bitmap), 0L, 0L, 6, null);
            } else {
                if (drawable instanceof ColorDrawable) {
                    drawablePainter = new C51805xm0(C50619vm0.m8179b(((ColorDrawable) drawable).getColor()), null);
                } else {
                    Drawable mutate = drawable.mutate();
                    Intrinsics.checkNotNullExpressionValue(mutate, "drawable.mutate()");
                    drawablePainter = new DrawablePainter(mutate);
                }
                mo89635G = drawablePainter;
            }
            interfaceC32720Et0.mo89503z(mo89635G);
        }
        AbstractC45562nE3 abstractC45562nE3 = (AbstractC45562nE3) mo89635G;
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return abstractC45562nE3;
    }
}
