package co.bird.android.app.feature.map.infowindow.widget;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.app.feature.map.renderer.OvalShadow;
import co.bird.android.app.feature.map.renderer.ShadowInitParams;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0001!B'\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010 J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bJ\u0010\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bJ\u0010\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\bJ\u0010\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bJ\u0010\u0010\u000f\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bJ$\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0012R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\""}, m28432d2 = {"Lco/bird/android/app/feature/map/infowindow/widget/LayeredBadgeView;", "Landroid/widget/FrameLayout;", "Landroid/widget/ImageView;", "Lco/bird/android/app/feature/map/renderer/ShadowInitParams;", "computeShadowParams", "shadowParams", "", "applyShadow", "", "color", "setColorRes", "setColor", "drawableRes", "setIconRes", "setIconColor", "setIconColorRes", "", "show", "Lkotlin/Function1;", "shadowParamsComputer", "setShadowVisibility", "LJr6;", "binding", "LJr6;", "currentShadowParams", "Lco/bird/android/app/feature/map/renderer/ShadowInitParams;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLayeredBadgeView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayeredBadgeView.kt\nco/bird/android/app/feature/map/infowindow/widget/LayeredBadgeView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,110:1\n1#2:111\n*E\n"})
/* loaded from: classes2.dex */
public final class LayeredBadgeView extends FrameLayout {
    public static final Companion Companion = new Companion(null);
    private static final int SHADOW_COLOR = 1207959552;
    private static final int SHADOW_PAINT_COLOR = 1207959552;
    private final C33878Jr6 binding;
    private ShadowInitParams currentShadowParams;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/app/feature/map/infowindow/widget/LayeredBadgeView$Companion;", "", "()V", "SHADOW_COLOR", "", "SHADOW_PAINT_COLOR", "co.bird.android.feature.map"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LayeredBadgeView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void applyShadow(ImageView imageView, ShadowInitParams shadowInitParams) {
        int m11248c = C49520tu6.m11248c(imageView, shadowInitParams.getWidthDp());
        int m11248c2 = C49520tu6.m11248c(imageView, shadowInitParams.getHeightDp());
        float m11248c3 = C49520tu6.m11248c(imageView, shadowInitParams.getRadiusDp());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShadow(m11248c, m11248c2, m11248c3, 1207959552, null, 16, null));
        imageView.setLayerType(1, shapeDrawable.getPaint());
        shapeDrawable.getPaint().setShadowLayer(m11248c3, C49520tu6.m11248c(imageView, shadowInitParams.getOffsetXDp()), C49520tu6.m11248c(imageView, shadowInitParams.getOffsetYDp()), 1207959552);
        shapeDrawable.getPaint().setColor(1207959552);
        imageView.setTranslationX(C49520tu6.m11248c(imageView, shadowInitParams.getTranslationXDp()));
        imageView.setTranslationY(C49520tu6.m11248c(imageView, shadowInitParams.getTranslationYDp()));
        imageView.setBackground(shapeDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShadowInitParams computeShadowParams(ImageView imageView) {
        float m11237n = C49520tu6.m11237n(imageView, imageView.getWidth());
        float m11237n2 = C49520tu6.m11237n(imageView, imageView.getHeight());
        C41318g46.m40163a("shadow width and height " + m11237n + " x " + m11237n2, new Object[0]);
        float f = m11237n * 0.667f;
        float f2 = m11237n2 * 0.667f;
        return new ShadowInitParams(f, f2, 1.0f, 2.0f, 2.0f, (m11237n - f) / 2.0f, (m11237n2 - f2) / 2.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setShadowVisibility$default(LayeredBadgeView layeredBadgeView, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new LayeredBadgeView$setShadowVisibility$1(layeredBadgeView);
        }
        layeredBadgeView.setShadowVisibility(z, function1);
    }

    public final void setColor(int i) {
        this.binding.f18357d.setColorFilter(i);
    }

    public final void setColorRes(int i) {
        setColor(NA0.m94301c(getContext(), i));
    }

    public final void setIconColor(int i) {
        this.binding.f18356c.setColorFilter(i);
    }

    public final void setIconColorRes(int i) {
        setIconColor(NA0.m94301c(getContext(), i));
    }

    public final void setIconRes(int i) {
        this.binding.f18356c.setImageResource(i);
    }

    public final void setShadowVisibility(boolean z, Function1<? super ImageView, ShadowInitParams> shadowParamsComputer) {
        Intrinsics.checkNotNullParameter(shadowParamsComputer, "shadowParamsComputer");
        AppCompatImageView setShadowVisibility$lambda$2 = this.binding.f18359f;
        Intrinsics.checkNotNullExpressionValue(setShadowVisibility$lambda$2, "setShadowVisibility$lambda$2");
        ShadowInitParams shadowInitParams = null;
        C49520tu6.show$default(setShadowVisibility$lambda$2, z, 0, 2, null);
        if (z || this.currentShadowParams == null) {
            ShadowInitParams invoke = shadowParamsComputer.invoke(setShadowVisibility$lambda$2);
            if (!Intrinsics.areEqual(invoke, this.currentShadowParams)) {
                shadowInitParams = invoke;
            }
            ShadowInitParams shadowInitParams2 = shadowInitParams;
            if (shadowInitParams2 != null) {
                this.currentShadowParams = shadowInitParams2;
                applyShadow(setShadowVisibility$lambda$2, shadowInitParams2);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LayeredBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ LayeredBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public LayeredBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        C33878Jr6 m99620b = C33878Jr6.m99620b(C40788fB0.m41772j(context), this);
        Intrinsics.checkNotNullExpressionValue(m99620b, "inflate(context.layoutInflater, this)");
        this.binding = m99620b;
    }
}
