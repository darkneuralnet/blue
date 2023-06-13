package p000;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.widget.adapter.ViewHolderSupplier;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00012B/\b\u0007\u0012\u0006\u0010+\u001a\u00020*\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b/\u00100J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\u0016\u0010\u000f\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u0012\u0010\u0016\u001a\u00020\u00042\b\b\u0001\u0010\u0015\u001a\u00020\u0011H\u0002J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\"R\u0018\u0010%\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u00063"}, m28432d2 = {"LAQ5;", "LxE;", "LxQ5;", "Lio/reactivex/Observable;", "", "J4", "q9", "p5", DateTokenConverter.CONVERTER_KEY, "", "success", "H4", "", "LH6;", "sections", "b", "show", "", "hiddenState", "showProgress", "dismiss", "color", "Rl", "", "alpha", "Tl", "LG31;", "LG31;", "binding", "Landroid/content/DialogInterface;", "c", "Landroid/content/DialogInterface;", "dialog", "Landroid/animation/ValueAnimator;", "Landroid/animation/ValueAnimator;", "alphaAnimator", "e", "backgroundAnimator", "LU41;", "f", "LU41;", "adapter", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lco/bird/android/widget/adapter/ViewHolderSupplier;", "LeT0;", "supplier", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;Lco/bird/android/widget/adapter/ViewHolderSupplier;LG31;Landroid/content/DialogInterface;)V", "g", C17296a.f69688o, "status-dialog_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: AQ5 */
/* loaded from: classes4.dex */
public final class AQ5 extends AbstractC30071xE implements InterfaceC51600xQ5 {

    /* renamed from: g */
    public static final C0090a f551g = new C0090a(null);

    /* renamed from: b */
    public final G31 f552b;

    /* renamed from: c */
    public final DialogInterface f553c;

    /* renamed from: d */
    public ValueAnimator f554d;

    /* renamed from: e */
    public ValueAnimator f555e;

    /* renamed from: f */
    public final U41 f556f;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LAQ5$a;", "", "", "ANIMATION_DURATION", "J", "<init>", "()V", "status-dialog_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: AQ5$a */
    /* loaded from: classes4.dex */
    public static final class C0090a {
        public /* synthetic */ C0090a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0090a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AQ5(BaseActivity activity, ViewHolderSupplier<AbstractC40357eT0> supplier, G31 binding, DialogInterface dialog) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(supplier, "supplier");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f552b = binding;
        this.f553c = dialog;
        U41 u41 = new U41(supplier);
        this.f556f = u41;
        binding.f10843g.setLayoutManager(new LinearLayoutManager(activity));
        binding.f10843g.setAdapter(u41);
        binding.f10843g.addItemDecoration(new EQ5());
    }

    /* renamed from: Sl */
    public static final void m115792Sl(AQ5 this$0, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(anim, "anim");
        ConstraintLayout constraintLayout = this$0.f552b.f10844h;
        Object animatedValue = anim.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        constraintLayout.setBackgroundColor(((Integer) animatedValue).intValue());
    }

    /* renamed from: Ul */
    public static final void m115790Ul(AQ5 this$0, boolean z, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(anim, "anim");
        Object animatedValue = anim.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        this$0.f552b.f10843g.setAlpha(floatValue);
        if (z) {
            this$0.f552b.f10840d.setAlpha(floatValue);
            return;
        }
        this$0.f552b.f10845i.setAlpha(floatValue);
        this$0.f552b.f10838b.setAlpha(floatValue);
    }

    @Override // p000.InterfaceC51600xQ5
    /* renamed from: H4 */
    public void mo5279H4(boolean z) {
        int i;
        if (z) {
            i = C32364Df4.mint;
        } else {
            i = C32364Df4.errorRed;
        }
        m115793Rl(NA0.m94301c(getActivity(), i));
        m115791Tl(z, 1.0f);
        if (!z) {
            this.f552b.f10841e.setIndeterminateTintList(ColorStateList.valueOf(-1));
            this.f552b.f10842f.setTextColor(-1);
        }
    }

    @Override // p000.InterfaceC51600xQ5
    /* renamed from: J4 */
    public Observable<Unit> mo5278J4() {
        Button button = this.f552b.f10840d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.okay");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: Rl */
    public final void m115793Rl(int i) {
        ColorDrawable colorDrawable;
        int m94301c;
        ValueAnimator valueAnimator = this.f555e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Drawable background = this.f552b.f10844h.getBackground();
        if (background instanceof ColorDrawable) {
            colorDrawable = (ColorDrawable) background;
        } else {
            colorDrawable = null;
        }
        if (colorDrawable != null) {
            m94301c = colorDrawable.getColor();
        } else {
            m94301c = NA0.m94301c(getActivity(), C32364Df4.transparentWhite);
        }
        ValueAnimator ofArgb = ValueAnimator.ofArgb(m94301c, i);
        this.f555e = ofArgb;
        if (ofArgb != null) {
            ofArgb.setDuration(300L);
        }
        ValueAnimator valueAnimator2 = this.f555e;
        if (valueAnimator2 != null) {
            valueAnimator2.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator3 = this.f555e;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zQ5
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    AQ5.m115792Sl(AQ5.this, valueAnimator4);
                }
            });
        }
        ValueAnimator valueAnimator4 = this.f555e;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
    }

    /* renamed from: Tl */
    public final void m115791Tl(final boolean z, float f) {
        ValueAnimator valueAnimator = this.f554d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Button button = this.f552b.f10840d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.okay");
        C49520tu6.show$default(button, z, 0, 2, null);
        Button button2 = this.f552b.f10845i;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.tryAgain");
        C49520tu6.show$default(button2, !z, 0, 2, null);
        Button button3 = this.f552b.f10838b;
        Intrinsics.checkNotNullExpressionValue(button3, "binding.cancel");
        C49520tu6.show$default(button3, !z, 0, 2, null);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f552b.f10843g.getAlpha(), f);
        this.f554d = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(300L);
        }
        ValueAnimator valueAnimator2 = this.f554d;
        if (valueAnimator2 != null) {
            valueAnimator2.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator3 = this.f554d;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: yQ5
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                    AQ5.m115790Ul(AQ5.this, z, valueAnimator4);
                }
            });
        }
        ValueAnimator valueAnimator4 = this.f554d;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
    }

    @Override // p000.InterfaceC51600xQ5
    /* renamed from: b */
    public void mo5277b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f556f.mo24871u(sections);
    }

    @Override // p000.InterfaceC51600xQ5
    /* renamed from: d */
    public Observable<Unit> mo5276d() {
        Button button = this.f552b.f10838b;
        Intrinsics.checkNotNullExpressionValue(button, "binding.cancel");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC51600xQ5
    public void dismiss() {
        this.f553c.dismiss();
    }

    @Override // p000.InterfaceC51600xQ5
    /* renamed from: p5 */
    public Observable<Unit> mo5275p5() {
        Button button = this.f552b.f10845i;
        Intrinsics.checkNotNullExpressionValue(button, "binding.tryAgain");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC51600xQ5
    /* renamed from: q9 */
    public Observable<Unit> mo5274q9() {
        Button button = this.f552b.f10839c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.nextOne");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.AbstractC9344XC, p000.S74
    public void showProgress(boolean z, int i) {
        ProgressBar progressBar = this.f552b.f10841e;
        Intrinsics.checkNotNullExpressionValue(progressBar, "binding.progressBar");
        C49520tu6.m11232s(progressBar, z, i);
        TextView textView = this.f552b.f10842f;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.progressText");
        C49520tu6.m11232s(textView, z, i);
        if (z) {
            m115791Tl(true, 0.0f);
            m115791Tl(false, 0.0f);
        }
    }
}
