package co.bird.android.feature.p010ar.resolution;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/feature/ar/resolution/ScanResolutionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "title", "description", "Landroid/graphics/drawable/Drawable;", "iconDrawable", "", "e", "Lxt6;", "b", "Lxt6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "co.bird.android.feature.ar-parking"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.feature.ar.resolution.ScanResolutionView */
/* loaded from: classes3.dex */
public final class ScanResolutionView extends ConstraintLayout {

    /* renamed from: b */
    public final C51881xt6 f63189b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScanResolutionView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void init$default(ScanResolutionView scanResolutionView, String str, String str2, Drawable drawable, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            drawable = null;
        }
        scanResolutionView.m58922e(str, str2, drawable);
    }

    /* renamed from: e */
    public final void m58922e(String str, String description, Drawable drawable) {
        Unit unit;
        Intrinsics.checkNotNullParameter(description, "description");
        if (str != null) {
            this.f63189b.f118312d.setText(str);
            TextView textView = this.f63189b.f118312d;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.instructionTitleText");
            C49520tu6.m11233r(textView);
        }
        this.f63189b.f118311c.setText(description);
        if (drawable != null) {
            this.f63189b.f118310b.setImageDrawable(drawable);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            ImageView imageView = this.f63189b.f118310b;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.icon");
            C49520tu6.m11239l(imageView);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScanResolutionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ScanResolutionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScanResolutionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        C51881xt6 m4503b = C51881xt6.m4503b(C40788fB0.m41772j(context), this);
        Intrinsics.checkNotNullExpressionValue(m4503b, "inflate(context.layoutInflater, this)");
        this.f63189b = m4503b;
    }
}
