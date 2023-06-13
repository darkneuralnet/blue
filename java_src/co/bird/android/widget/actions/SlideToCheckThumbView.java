package co.bird.android.widget.actions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.card.MaterialCardView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\f\u0010\b\u001a\u00020\u0004*\u00020\u0002H\u0002R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/widget/actions/SlideToCheckThumbView;", "Lcom/google/android/material/card/MaterialCardView;", "LgE5;", "thumbState", "", "animate", "", "setState", "z", "Landroid/widget/ImageView;", "s", "Landroid/widget/ImageView;", "thumbImage", "Landroid/widget/ProgressBar;", "t", "Landroid/widget/ProgressBar;", "thumbLoading", "u", "LgE5;", "_thumbState", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSlideToCheckView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlideToCheckView.kt\nco/bird/android/widget/actions/SlideToCheckThumbView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,463:1\n262#2,2:464\n262#2,2:466\n*S KotlinDebug\n*F\n+ 1 SlideToCheckView.kt\nco/bird/android/widget/actions/SlideToCheckThumbView\n*L\n395#1:464,2\n396#1:466,2\n*E\n"})
/* loaded from: classes4.dex */
public final class SlideToCheckThumbView extends MaterialCardView {

    /* renamed from: s */
    public final ImageView f67761s;

    /* renamed from: t */
    public final ProgressBar f67762t;

    /* renamed from: u */
    public EnumC41413gE5 f67763u;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.actions.SlideToCheckThumbView$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16626a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC41413gE5.values().length];
            try {
                iArr[EnumC41413gE5.CHECKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC41413gE5.DRAGGING_FROM_CHECKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SlideToCheckThumbView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setState$default(SlideToCheckThumbView slideToCheckThumbView, EnumC41413gE5 enumC41413gE5, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        slideToCheckThumbView.setState(enumC41413gE5, z);
    }

    public final void setState(EnumC41413gE5 thumbState, boolean z) {
        float f;
        int i;
        Intrinsics.checkNotNullParameter(thumbState, "thumbState");
        C41318g46.m40163a("setThumbState: " + thumbState + " from " + this.f67763u, new Object[0]);
        if (this.f67763u == thumbState) {
            return;
        }
        this.f67763u = thumbState;
        int i2 = C16626a.$EnumSwitchMapping$0[thumbState.ordinal()];
        boolean z2 = true;
        if (i2 != 1 && i2 != 2) {
            f = 0.0f;
        } else {
            f = -180.0f;
        }
        boolean m54292z = m54292z(thumbState);
        C41318g46.m40163a("isLoadingState " + m54292z, new Object[0]);
        ProgressBar progressBar = this.f67762t;
        int i3 = 8;
        if (m54292z) {
            i = 0;
        } else {
            i = 8;
        }
        progressBar.setVisibility(i);
        ImageView imageView = this.f67761s;
        if (!m54292z) {
            i3 = 0;
        }
        imageView.setVisibility(i3);
        if (this.f67761s.getRotation() != f) {
            z2 = false;
        }
        if (!z2) {
            C41318g46.m40163a("rotation needs updating", new Object[0]);
            if (z) {
                this.f67761s.animate().setInterpolator(new DecelerateInterpolator()).rotation(f).start();
            } else {
                this.f67761s.setRotation(f);
            }
        }
    }

    /* renamed from: z */
    public final boolean m54292z(EnumC41413gE5 enumC41413gE5) {
        return enumC41413gE5 == EnumC41413gE5.REQUEST_UNCHECKED || enumC41413gE5 == EnumC41413gE5.REQUESTED_CHECK;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SlideToCheckThumbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SlideToCheckThumbView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SlideToCheckThumbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f67763u = EnumC41413gE5.UNINITIALIZED;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        setCardElevation(0.0f);
        setRadius(C49520tu6.m11240k(this, C37278Yf4.slide_to_check_thumb_size) / 2.0f);
        setCardBackgroundColor(C49520tu6.m11241j(this, C32364Df4.primaryAccent));
        View.inflate(context, C45268mk4.view_slide_to_check_thumb, this);
        View findViewById = findViewById(C52955zi4.thumbImage);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.thumbImage)");
        this.f67761s = (ImageView) findViewById;
        View findViewById2 = findViewById(C52955zi4.thumbLoading);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.thumbLoading)");
        this.f67762t = (ProgressBar) findViewById2;
    }
}
