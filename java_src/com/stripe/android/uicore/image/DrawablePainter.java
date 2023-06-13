package com.stripe.android.uicore.image;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import kotlin.KotlinVersion;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b0\u00101J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0014J\u0012\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J\f\u0010\u0012\u001a\u00020\u0003*\u00020\u0011H\u0014R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R+\u0010 \u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR4\u0010'\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020!8B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010/\u001a\u00020!8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b.\u0010$\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, m28432d2 = {"Lcom/stripe/android/uicore/image/DrawablePainter;", "LnE3;", "LPv4;", "", "onRemembered", "onAbandoned", "onForgotten", "", "alpha", "", "applyAlpha", "Lsm0;", "colorFilter", "applyColorFilter", "Lpm2;", "layoutDirection", "applyLayoutDirection", "LI61;", "onDraw", "Landroid/graphics/drawable/Drawable;", "drawable", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "", "<set-?>", "drawInvalidateTick$delegate", "LEX2;", "getDrawInvalidateTick", "()I", "setDrawInvalidateTick", "(I)V", "drawInvalidateTick", "LxB5;", "drawableIntrinsicSize$delegate", "getDrawableIntrinsicSize-NH-jbRc", "()J", "setDrawableIntrinsicSize-uvyYCjk", "(J)V", "drawableIntrinsicSize", "Landroid/graphics/drawable/Drawable$Callback;", "callback$delegate", "Lkotlin/Lazy;", "getCallback", "()Landroid/graphics/drawable/Drawable$Callback;", "callback", "getIntrinsicSize-NH-jbRc", "intrinsicSize", "<init>", "(Landroid/graphics/drawable/Drawable;)V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDrawablePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawablePainter.kt\ncom/stripe/android/uicore/image/DrawablePainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 4 Canvas.kt\nandroidx/compose/ui/graphics/CanvasKt\n*L\n1#1,168:1\n76#2:169\n102#2,2:170\n76#2:172\n102#2,2:173\n245#3:175\n47#4,7:176\n*S KotlinDebug\n*F\n+ 1 DrawablePainter.kt\ncom/stripe/android/uicore/image/DrawablePainter\n*L\n52#1:169\n52#1:170,2\n53#1:172\n53#1:173,2\n120#1:175\n127#1:176,7\n*E\n"})
/* loaded from: classes7.dex */
public final class DrawablePainter extends AbstractC45562nE3 implements InterfaceC35316Pv4 {
    private final Lazy callback$delegate;
    private final EX2 drawInvalidateTick$delegate;
    private final Drawable drawable;
    private final EX2 drawableIntrinsicSize$delegate;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC47065pm2.values().length];
            try {
                iArr[EnumC47065pm2.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC47065pm2.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DrawablePainter(Drawable drawable) {
        EX2 m97025e;
        long intrinsicSize;
        EX2 m97025e2;
        Lazy lazy;
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.drawable = drawable;
        m97025e = LM5.m97025e(0, null, 2, null);
        this.drawInvalidateTick$delegate = m97025e;
        intrinsicSize = DrawablePainterKt.getIntrinsicSize(drawable);
        m97025e2 = LM5.m97025e(C51465xB5.m5736c(intrinsicSize), null, 2, null);
        this.drawableIntrinsicSize$delegate = m97025e2;
        lazy = LazyKt__LazyJVMKt.lazy(new DrawablePainter$callback$2(this));
        this.callback$delegate = lazy;
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    private final Drawable.Callback getCallback() {
        return (Drawable.Callback) this.callback$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getDrawInvalidateTick() {
        return ((Number) this.drawInvalidateTick$delegate.getValue()).intValue();
    }

    /* renamed from: getDrawableIntrinsicSize-NH-jbRc  reason: not valid java name */
    private final long m116756getDrawableIntrinsicSizeNHjbRc() {
        return ((C51465xB5) this.drawableIntrinsicSize$delegate.getValue()).m5725n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDrawInvalidateTick(int i) {
        this.drawInvalidateTick$delegate.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDrawableIntrinsicSize-uvyYCjk  reason: not valid java name */
    public final void m116757setDrawableIntrinsicSizeuvyYCjk(long j) {
        this.drawableIntrinsicSize$delegate.setValue(C51465xB5.m5736c(j));
    }

    @Override // p000.AbstractC45562nE3
    public boolean applyAlpha(float f) {
        int roundToInt;
        int coerceIn;
        Drawable drawable = this.drawable;
        roundToInt = MathKt__MathJVMKt.roundToInt(f * ((float) KotlinVersion.MAX_COMPONENT_VALUE));
        coerceIn = RangesKt___RangesKt.coerceIn(roundToInt, 0, (int) KotlinVersion.MAX_COMPONENT_VALUE);
        drawable.setAlpha(coerceIn);
        return true;
    }

    @Override // p000.AbstractC45562nE3
    public boolean applyColorFilter(C48841sm0 c48841sm0) {
        this.drawable.setColorFilter(c48841sm0 != null ? C20473fc.m41121b(c48841sm0) : null);
        return true;
    }

    @Override // p000.AbstractC45562nE3
    public boolean applyLayoutDirection(EnumC47065pm2 layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Drawable drawable = this.drawable;
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i2 = 0;
        }
        return drawable.setLayoutDirection(i2);
    }

    public final Drawable getDrawable() {
        return this.drawable;
    }

    @Override // p000.AbstractC45562nE3
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo116236getIntrinsicSizeNHjbRc() {
        return m116756getDrawableIntrinsicSizeNHjbRc();
    }

    @Override // p000.InterfaceC35316Pv4
    public void onAbandoned() {
        onForgotten();
    }

    @Override // p000.AbstractC45562nE3
    public void onDraw(I61 i61) {
        int roundToInt;
        int roundToInt2;
        Intrinsics.checkNotNullParameter(i61, "<this>");
        InterfaceC45204me0 mo20724a = i61.mo20750d0().mo20724a();
        getDrawInvalidateTick();
        Drawable drawable = this.drawable;
        roundToInt = MathKt__MathJVMKt.roundToInt(C51465xB5.m5730i(i61.mo96360h()));
        roundToInt2 = MathKt__MathJVMKt.roundToInt(C51465xB5.m5732g(i61.mo96360h()));
        drawable.setBounds(0, 0, roundToInt, roundToInt2);
        try {
            mo20724a.mo25245v();
            this.drawable.draw(C12455bc.m64279c(mo20724a));
        } finally {
            mo20724a.mo25251p();
        }
    }

    @Override // p000.InterfaceC35316Pv4
    public void onForgotten() {
        Drawable drawable = this.drawable;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        this.drawable.setVisible(false, false);
        this.drawable.setCallback(null);
    }

    @Override // p000.InterfaceC35316Pv4
    public void onRemembered() {
        this.drawable.setCallback(getCallback());
        this.drawable.setVisible(true, true);
        Drawable drawable = this.drawable;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }
}
