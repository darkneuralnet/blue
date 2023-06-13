package co.bird.android.feature.p010ar.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.feature.p010ar.view.ScanSurroundingsBottomSheetView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\b\b\u0002\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010 \u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006)"}, m28432d2 = {"Lco/bird/android/feature/ar/view/ScanSurroundingsBottomSheetView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/ViewPropertyAnimator;", "j", "m", "Lg00;", "b", "Lg00;", "binding", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "getTitleTextView", "()Landroid/widget/TextView;", "titleTextView", DateTokenConverter.CONVERTER_KEY, "i", "messageTextView", "Landroid/widget/Button;", "e", "Landroid/widget/Button;", "getConfirmButton", "()Landroid/widget/Button;", "confirmButton", "f", "getCancelButton", "cancelButton", "Landroid/widget/ImageView;", "g", "Landroid/widget/ImageView;", "getIconImageView", "()Landroid/widget/ImageView;", "iconImageView", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "co.bird.android.feature.ar-parking"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.feature.ar.view.ScanSurroundingsBottomSheetView */
/* loaded from: classes3.dex */
public final class ScanSurroundingsBottomSheetView extends ConstraintLayout {

    /* renamed from: b */
    public final C41272g00 f63237b;

    /* renamed from: c */
    public final TextView f63238c;

    /* renamed from: d */
    public final TextView f63239d;

    /* renamed from: e */
    public final Button f63240e;

    /* renamed from: f */
    public final Button f63241f;

    /* renamed from: g */
    public final ImageView f63242g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScanSurroundingsBottomSheetView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: k */
    public static final void m58867k(ScanSurroundingsBottomSheetView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setTranslationY(this$0.getHeight());
        this$0.setVisibility(0);
    }

    /* renamed from: l */
    public static final void m58866l(ScanSurroundingsBottomSheetView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setTranslationY(0.0f);
    }

    /* renamed from: n */
    public static final void m58864n(ScanSurroundingsBottomSheetView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setTranslationY(0.0f);
    }

    /* renamed from: o */
    public static final void m58863o(ScanSurroundingsBottomSheetView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setTranslationY(this$0.getHeight());
        this$0.setVisibility(4);
    }

    /* renamed from: i */
    public final TextView m58869i() {
        return this.f63239d;
    }

    /* renamed from: j */
    public final ViewPropertyAnimator m58868j() {
        ViewPropertyAnimator withEndAction = animate().setStartDelay(100L).setDuration(100L).translationY(0.0f).withStartAction(new Runnable() { // from class: ll5
            @Override // java.lang.Runnable
            public final void run() {
                ScanSurroundingsBottomSheetView.m58867k(ScanSurroundingsBottomSheetView.this);
            }
        }).withEndAction(new Runnable() { // from class: ml5
            @Override // java.lang.Runnable
            public final void run() {
                ScanSurroundingsBottomSheetView.m58866l(ScanSurroundingsBottomSheetView.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(withEndAction, "animate()\n      .setStar…translationY = 0f\n      }");
        return withEndAction;
    }

    /* renamed from: m */
    public final ViewPropertyAnimator m58865m() {
        ViewPropertyAnimator withEndAction = animate().setDuration(100L).translationY(getHeight()).withStartAction(new Runnable() { // from class: nl5
            @Override // java.lang.Runnable
            public final void run() {
                ScanSurroundingsBottomSheetView.m58864n(ScanSurroundingsBottomSheetView.this);
            }
        }).withEndAction(new Runnable() { // from class: ol5
            @Override // java.lang.Runnable
            public final void run() {
                ScanSurroundingsBottomSheetView.m58863o(ScanSurroundingsBottomSheetView.this);
            }
        });
        Intrinsics.checkNotNullExpressionValue(withEndAction, "animate()\n      .setDura… = View.INVISIBLE\n      }");
        return withEndAction;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScanSurroundingsBottomSheetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ScanSurroundingsBottomSheetView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScanSurroundingsBottomSheetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        C41272g00 m40372c = C41272g00.m40372c(C40788fB0.m41772j(context), this, true);
        Intrinsics.checkNotNullExpressionValue(m40372c, "inflate(context.layoutInflater, this, true)");
        this.f63237b = m40372c;
        TextView textView = m40372c.f81274g;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.title");
        this.f63238c = textView;
        TextView textView2 = m40372c.f81273f;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.message");
        this.f63239d = textView2;
        Button button = m40372c.f81270c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.confirm");
        this.f63240e = button;
        Button button2 = m40372c.f81269b;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.cancel");
        this.f63241f = button2;
        ImageView imageView = m40372c.f81272e;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.icon1");
        this.f63242g = imageView;
        setVisibility(4);
    }
}
