package com.skydoves.balloon.vectortext;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002R.\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"Lcom/skydoves/balloon/vectortext/VectorTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "rtlLayout", "", "g", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "f", "Lkk6;", "value", "b", "Lkk6;", "getDrawableTextViewParams", "()Lkk6;", "setDrawableTextViewParams", "(Lkk6;)V", "drawableTextViewParams", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "balloon_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* loaded from: classes6.dex */
public final class VectorTextView extends AppCompatTextView {

    /* renamed from: b */
    public C44084kk6 f75246b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VectorTextView(Context context) {
        this(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: f */
    public final void m45553f(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C37566Zl4.VectorTextView);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…styleable.VectorTextView)");
            setDrawableTextViewParams(new C44084kk6(C45155mZ0.m25432a(obtainStyledAttributes.getResourceId(C37566Zl4.VectorTextView_balloon_drawableStart, Integer.MIN_VALUE)), C45155mZ0.m25432a(obtainStyledAttributes.getResourceId(C37566Zl4.VectorTextView_balloon_drawableEnd, Integer.MIN_VALUE)), C45155mZ0.m25432a(obtainStyledAttributes.getResourceId(C37566Zl4.VectorTextView_balloon_drawableBottom, Integer.MIN_VALUE)), C45155mZ0.m25432a(obtainStyledAttributes.getResourceId(C37566Zl4.VectorTextView_balloon_drawableTop, Integer.MIN_VALUE)), null, null, null, null, false, null, null, null, C45155mZ0.m25432a(obtainStyledAttributes.getResourceId(C37566Zl4.VectorTextView_balloon_drawablePadding, Integer.MIN_VALUE)), C45155mZ0.m25432a(obtainStyledAttributes.getResourceId(C37566Zl4.VectorTextView_balloon_drawableTintColor, Integer.MIN_VALUE)), C45155mZ0.m25432a(obtainStyledAttributes.getResourceId(C37566Zl4.VectorTextView_balloon_drawableWidth, Integer.MIN_VALUE)), C45155mZ0.m25432a(obtainStyledAttributes.getResourceId(C37566Zl4.VectorTextView_balloon_drawableHeight, Integer.MIN_VALUE)), C45155mZ0.m25432a(obtainStyledAttributes.getResourceId(C37566Zl4.VectorTextView_balloon_drawableSquareSize, Integer.MIN_VALUE)), 4080, null));
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: g */
    public final void m45552g(boolean z) {
        C44084kk6 c44084kk6 = this.f75246b;
        if (c44084kk6 != null) {
            c44084kk6.m28528z(z);
            V26.m80472a(this, c44084kk6);
        }
    }

    public final void setDrawableTextViewParams(C44084kk6 c44084kk6) {
        if (c44084kk6 != null) {
            V26.m80472a(this, c44084kk6);
        } else {
            c44084kk6 = null;
        }
        this.f75246b = c44084kk6;
    }

    public /* synthetic */ VectorTextView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VectorTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        m45553f(context, attributeSet);
    }
}
