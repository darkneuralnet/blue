package co.bird.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.material.imageview.ShapeableImageView;
import com.stripe.android.financialconnections.domain.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017B\u0019\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aB!\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0016\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/widget/OperatorInfoCard;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lis6;", "b", "Lis6;", "binding", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "f", "()Landroid/widget/TextView;", "name", DateTokenConverter.CONVERTER_KEY, "g", "serviceCenter", "Landroid/widget/ImageView;", "e", "Landroid/widget/ImageView;", "()Landroid/widget/ImageView;", Entry.TYPE_IMAGE, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class OperatorInfoCard extends ConstraintLayout {

    /* renamed from: b */
    public final C42978is6 f67429b;

    /* renamed from: c */
    public final TextView f67430c;

    /* renamed from: d */
    public final TextView f67431d;

    /* renamed from: e */
    public final ImageView f67432e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperatorInfoCard(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C42978is6 m31711b = C42978is6.m31711b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m31711b, "inflate(context.layoutInflater, this)");
        this.f67429b = m31711b;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        setBackground(C40788fB0.m41773i(context3, C33309Hg4.ripple_white));
        TextView textView = m31711b.f91421c;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.name");
        this.f67430c = textView;
        TextView textView2 = m31711b.f91422d;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.serviceCenter");
        this.f67431d = textView2;
        ShapeableImageView shapeableImageView = m31711b.f91420b;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "binding.image");
        this.f67432e = shapeableImageView;
    }

    /* renamed from: e */
    public final ImageView m54519e() {
        return this.f67432e;
    }

    /* renamed from: f */
    public final TextView m54518f() {
        return this.f67430c;
    }

    /* renamed from: g */
    public final TextView m54517g() {
        return this.f67431d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperatorInfoCard(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C42978is6 m31711b = C42978is6.m31711b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m31711b, "inflate(context.layoutInflater, this)");
        this.f67429b = m31711b;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        setBackground(C40788fB0.m41773i(context3, C33309Hg4.ripple_white));
        TextView textView = m31711b.f91421c;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.name");
        this.f67430c = textView;
        TextView textView2 = m31711b.f91422d;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.serviceCenter");
        this.f67431d = textView2;
        ShapeableImageView shapeableImageView = m31711b.f91420b;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "binding.image");
        this.f67432e = shapeableImageView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperatorInfoCard(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C42978is6 m31711b = C42978is6.m31711b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m31711b, "inflate(context.layoutInflater, this)");
        this.f67429b = m31711b;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        setBackground(C40788fB0.m41773i(context3, C33309Hg4.ripple_white));
        TextView textView = m31711b.f91421c;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.name");
        this.f67430c = textView;
        TextView textView2 = m31711b.f91422d;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.serviceCenter");
        this.f67431d = textView2;
        ShapeableImageView shapeableImageView = m31711b.f91420b;
        Intrinsics.checkNotNullExpressionValue(shapeableImageView, "binding.image");
        this.f67432e = shapeableImageView;
    }
}
