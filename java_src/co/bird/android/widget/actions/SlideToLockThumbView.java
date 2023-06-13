package co.bird.android.widget.actions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.transition.C12055c;
import ch.qos.logback.core.CoreConstants;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.google.android.material.card.MaterialCardView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\f\u0010\b\u001a\u00020\u0004*\u00020\u0002H\u0002R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, m28432d2 = {"Lco/bird/android/widget/actions/SlideToLockThumbView;", "Lcom/google/android/material/card/MaterialCardView;", "LkE5;", TransferTable.COLUMN_STATE, "", "animate", "", "setState", "z", "Landroid/widget/ImageView;", "s", "Landroid/widget/ImageView;", "thumbImage", "Landroid/widget/ProgressBar;", "t", "Landroid/widget/ProgressBar;", "thumbLoading", "u", "LkE5;", "_state", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSlideToLockView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlideToLockView.kt\nco/bird/android/widget/actions/SlideToLockThumbView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,340:1\n262#2,2:341\n262#2,2:343\n262#2,2:345\n262#2,2:347\n*S KotlinDebug\n*F\n+ 1 SlideToLockView.kt\nco/bird/android/widget/actions/SlideToLockThumbView\n*L\n264#1:341,2\n265#1:343,2\n271#1:345,2\n272#1:347,2\n*E\n"})
/* loaded from: classes4.dex */
public final class SlideToLockThumbView extends MaterialCardView {

    /* renamed from: s */
    public final ImageView f67778s;

    /* renamed from: t */
    public final ProgressBar f67779t;

    /* renamed from: u */
    public EnumC43785kE5 f67780u;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.actions.SlideToLockThumbView$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16628a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC43785kE5.values().length];
            try {
                iArr[EnumC43785kE5.UNLOCKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SlideToLockThumbView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void setState$default(SlideToLockThumbView slideToLockThumbView, EnumC43785kE5 enumC43785kE5, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        slideToLockThumbView.setState(enumC43785kE5, z);
    }

    public final void setState(EnumC43785kE5 state, boolean z) {
        float f;
        Intrinsics.checkNotNullParameter(state, "state");
        EnumC43785kE5 enumC43785kE5 = this.f67780u;
        if (enumC43785kE5 == state) {
            return;
        }
        this.f67780u = state;
        if (C16628a.$EnumSwitchMapping$0[state.ordinal()] == 1) {
            f = -180.0f;
        } else {
            f = 0.0f;
        }
        if (m54264z(enumC43785kE5) && !m54264z(state)) {
            C12055c.m65805a(this);
            this.f67779t.setVisibility(8);
            this.f67778s.setVisibility(0);
            this.f67778s.setRotation(f);
        } else if (!m54264z(enumC43785kE5) && m54264z(state)) {
            C12055c.m65805a(this);
            this.f67779t.setVisibility(0);
            this.f67778s.setVisibility(8);
        } else if (!m54264z(enumC43785kE5) && !m54264z(state)) {
            if (!z) {
                this.f67778s.setRotation(f);
            } else {
                this.f67778s.animate().setInterpolator(new DecelerateInterpolator()).rotation(f).start();
            }
        }
    }

    /* renamed from: z */
    public final boolean m54264z(EnumC43785kE5 enumC43785kE5) {
        return enumC43785kE5 == EnumC43785kE5.REQUESTED_LOCK || enumC43785kE5 == EnumC43785kE5.REQUESTED_UNLOCK;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SlideToLockThumbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SlideToLockThumbView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SlideToLockThumbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f67780u = EnumC43785kE5.LOCKED;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        setCardElevation(0.0f);
        setRadius(C49520tu6.m11240k(this, C37278Yf4.slide_to_unlock_thumb_size) / 2.0f);
        setCardBackgroundColor(-1);
        View.inflate(context, C45268mk4.view_slide_to_lock_thumb, this);
        View findViewById = findViewById(C52955zi4.thumbImage);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.thumbImage)");
        this.f67778s = (ImageView) findViewById;
        View findViewById2 = findViewById(C52955zi4.thumbLoading);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.thumbLoading)");
        this.f67779t = (ProgressBar) findViewById2;
    }
}
