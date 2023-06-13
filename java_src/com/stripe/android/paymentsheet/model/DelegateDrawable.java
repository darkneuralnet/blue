package com.stripe.android.paymentsheet.model;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m28433d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B<\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\"\u0010\u0003\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004\u0012\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0014\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u000eR\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0001H\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0016J\b\u0010\u001c\u001a\u00020\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u0017H\u0016J\b\u0010\u001e\u001a\u00020\u0017H\u0016J\b\u0010\u001f\u001a\u00020\u0017H\u0017J\b\u0010 \u001a\u00020!H\u0017J\u0010\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020)H\u0016J\n\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020\u0011H\u0017J\b\u0010-\u001a\u00020\fH\u0016J\b\u0010.\u001a\u00020\u0001H\u0016J\u0010\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020'H\u0014J\u0010\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020\u0017H\u0016J\u0012\u00103\u001a\u00020\f2\b\u00104\u001a\u0004\u0018\u00010\u0019H\u0016J\u0018\u00103\u001a\u00020\f2\u0006\u00105\u001a\u00020\u00172\u0006\u00106\u001a\u000207H\u0017J\u0010\u00108\u001a\u00020\f2\u0006\u00109\u001a\u00020\u0011H\u0017J\u0010\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020\u0011H\u0016J\u0010\u0010<\u001a\u00020\u00112\u0006\u0010=\u001a\u00020)H\u0016J\u0010\u0010>\u001a\u00020\f2\u0006\u0010?\u001a\u00020\u0017H\u0016J\u0012\u0010@\u001a\u00020\f2\b\u0010A\u001a\u0004\u0018\u00010BH\u0017J\u0012\u0010C\u001a\u00020\f2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\u0012\u0010F\u001a\u00020\f2\b\u0010G\u001a\u0004\u0018\u000107H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R/\u0010\u0003\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006H"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/model/DelegateDrawable;", "Landroid/graphics/drawable/Drawable;", "delegate", "imageLoader", "Lkotlin/Function2;", "Lcom/stripe/android/paymentsheet/model/PaymentOption;", "Lkotlin/coroutines/Continuation;", "", "paymentOption", "(Landroid/graphics/drawable/Drawable;Lkotlin/jvm/functions/Function2;Lcom/stripe/android/paymentsheet/model/PaymentOption;)V", "Lkotlin/jvm/functions/Function2;", "applyTheme", "", "t", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "canApplyTheme", "", "clearColorFilter", "draw", "canvas", "Landroid/graphics/Canvas;", "getAlpha", "", "getColorFilter", "Landroid/graphics/ColorFilter;", "getCurrent", "getIntrinsicHeight", "getIntrinsicWidth", "getMinimumHeight", "getMinimumWidth", "getOpacity", "getOpticalInsets", "Landroid/graphics/Insets;", "getOutline", "outline", "Landroid/graphics/Outline;", "getPadding", "padding", "Landroid/graphics/Rect;", "getState", "", "getTransparentRegion", "Landroid/graphics/Region;", "isFilterBitmap", "jumpToCurrentState", "mutate", "onBoundsChange", "bounds", "setAlpha", "alpha", "setColorFilter", "colorFilter", "color", "mode", "Landroid/graphics/PorterDuff$Mode;", "setDither", "dither", "setFilterBitmap", "filter", "setState", "stateSet", "setTint", "tintColor", "setTintBlendMode", "blendMode", "Landroid/graphics/BlendMode;", "setTintList", "tint", "Landroid/content/res/ColorStateList;", "setTintMode", "tintMode", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class DelegateDrawable extends Drawable {
    private volatile Drawable delegate;
    private final Function2<PaymentOption, Continuation<? super Drawable>, Object> imageLoader;
    private final PaymentOption paymentOption;

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
    @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.model.DelegateDrawable$1", m28418f = "PaymentOption.kt", m28417i = {}, m28416l = {84, 85}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: com.stripe.android.paymentsheet.model.DelegateDrawable$1 */
    /* loaded from: classes7.dex */
    public static final class C192321 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
        @DebugMetadata(m28419c = "com.stripe.android.paymentsheet.model.DelegateDrawable$1$1", m28418f = "PaymentOption.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: com.stripe.android.paymentsheet.model.DelegateDrawable$1$1 */
        /* loaded from: classes7.dex */
        public static final class C192331 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ DelegateDrawable this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C192331(DelegateDrawable delegateDrawable, Continuation<? super C192331> continuation) {
                super(2, continuation);
                this.this$0 = delegateDrawable;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C192331(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C192331) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    DelegateDrawable delegateDrawable = this.this$0;
                    DelegateDrawable.super.setBounds(0, 0, delegateDrawable.delegate.getIntrinsicWidth(), this.this$0.delegate.getIntrinsicHeight());
                    this.this$0.invalidateSelf();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public C192321(Continuation<? super C192321> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C192321(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C192321) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            DelegateDrawable delegateDrawable;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                delegateDrawable = (DelegateDrawable) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                delegateDrawable = DelegateDrawable.this;
                Function2 function2 = delegateDrawable.imageLoader;
                PaymentOption paymentOption = DelegateDrawable.this.paymentOption;
                this.L$0 = delegateDrawable;
                this.label = 1;
                obj = function2.invoke(paymentOption, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            delegateDrawable.delegate = (Drawable) obj;
            AbstractC46765pG2 m84376c = T41.m84376c();
            C192331 c192331 = new C192331(DelegateDrawable.this, null);
            this.L$0 = null;
            this.label = 2;
            if (X30.m77504g(m84376c, c192331, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DelegateDrawable(Drawable delegate, Function2<? super PaymentOption, ? super Continuation<? super Drawable>, ? extends Object> imageLoader, PaymentOption paymentOption) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(paymentOption, "paymentOption");
        this.delegate = delegate;
        this.imageLoader = imageLoader;
        this.paymentOption = paymentOption;
        X30.m77507d(VC1.f38731b, null, null, new C192321(null), 3, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme t) {
        Intrinsics.checkNotNullParameter(t, "t");
        this.delegate.applyTheme(t);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.delegate.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.delegate.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.delegate.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.delegate.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.delegate.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.delegate;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.delegate.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.delegate.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.delegate.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.delegate.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public int getOpacity() {
        return this.delegate.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public Insets getOpticalInsets() {
        Insets opticalInsets;
        opticalInsets = this.delegate.getOpticalInsets();
        Intrinsics.checkNotNullExpressionValue(opticalInsets, "delegate.opticalInsets");
        return opticalInsets;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Intrinsics.checkNotNullParameter(outline, "outline");
        this.delegate.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect padding) {
        Intrinsics.checkNotNullParameter(padding, "padding");
        return this.delegate.getPadding(padding);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        int[] state = this.delegate.getState();
        Intrinsics.checkNotNullExpressionValue(state, "delegate.getState()");
        return state;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.delegate.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isFilterBitmap() {
        return this.delegate.isFilterBitmap();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.delegate.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.delegate.setBounds(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.delegate.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public void setColorFilter(int i, PorterDuff.Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.delegate.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public void setDither(boolean z) {
        this.delegate.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.delegate.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] stateSet) {
        Intrinsics.checkNotNullParameter(stateSet, "stateSet");
        return this.delegate.setState(stateSet);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        this.delegate.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintBlendMode(BlendMode blendMode) {
        this.delegate.setTintBlendMode(blendMode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.delegate.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.delegate.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.delegate.setColorFilter(colorFilter);
    }
}
