package p000;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.Button;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.QCInspection;
import com.facebook.share.internal.C17296a;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001,B!\b\u0007\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b)\u0010*J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u0016J\u0016\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\u0019\u0010\u0018\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0011J\u0014\u0010\u001b\u001a\u00020\u0004*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0014H\u0002R\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006-"}, m28432d2 = {"LkX5;", "LPC;", "LiX5;", "Lio/reactivex/Observable;", "", "o6", "K3", "dj", "Lco/bird/android/model/QCInspection;", "vf", "", "LH6;", "sections", "b", "", "passed", "Xd", "(Ljava/lang/Boolean;)V", "vj", "S8", "", "currentIndex", "itemCount", "O2", "V8", "Landroid/widget/Button;", "color", "Ql", "LZ4;", "LZ4;", "binding", "LIW5;", "c", "LIW5;", "adapter", "Landroid/animation/AnimatorSet;", DateTokenConverter.CONVERTER_KEY, "Landroid/animation/AnimatorSet;", "animatorSet", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "<init>", "(Lco/bird/android/core/mvp/BaseActivity;LZ4;LIW5;)V", "e", C17296a.f69688o, "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwipeQualityControlUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeQualityControlUi.kt\nco/bird/android/qualitycontrol/swipe/SwipeQualityControlUiImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,143:1\n1282#2,2:144\n*S KotlinDebug\n*F\n+ 1 SwipeQualityControlUi.kt\nco/bird/android/qualitycontrol/swipe/SwipeQualityControlUiImpl\n*L\n139#1:144,2\n*E\n"})
/* renamed from: kX5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43956kX5 extends AbstractC6295PC implements InterfaceC42770iX5 {

    /* renamed from: e */
    public static final C25176a f94477e = new C25176a(null);

    /* renamed from: f */
    public static final int f94478f = C32364Df4.green;

    /* renamed from: g */
    public static final int f94479g = C32364Df4.errorRed;

    /* renamed from: h */
    public static final int f94480h = C32364Df4.gray;

    /* renamed from: b */
    public final C10110Z4 f94481b;

    /* renamed from: c */
    public final IW5 f94482c;

    /* renamed from: d */
    public AnimatorSet f94483d;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, m28432d2 = {"LkX5$a;", "", "", "FAIL_RED", "I", "NEUTRAL_GRAY", "PASS_GREEN", "", "TOAST_FADE_DURATION", "J", "TOAST_STABLE_DURATION", "<init>", "()V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: kX5$a */
    /* loaded from: classes4.dex */
    public static final class C25176a {
        public /* synthetic */ C25176a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C25176a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43956kX5(BaseActivity activity, C10110Z4 binding, IW5 adapter) {
        super(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f94481b = binding;
        this.f94482c = adapter;
        this.f94483d = new AnimatorSet();
        binding.f47811g.setLayoutManager(new LinearLayoutManager(activity, 0, false));
        binding.f47811g.setAdapter(adapter);
    }

    /* renamed from: Rl */
    public static final void m28859Rl(C43956kX5 this$0, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(anim, "anim");
        ImageView imageView = this$0.f94481b.f47812h;
        Object animatedValue = anim.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        imageView.setAlpha(((Float) animatedValue).floatValue());
    }

    @Override // p000.InterfaceC42770iX5
    /* renamed from: K3 */
    public Observable<Unit> mo28863K3() {
        Button button = this.f94481b.f47808d;
        Intrinsics.checkNotNullExpressionValue(button, "binding.fail");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC42770iX5
    /* renamed from: O2 */
    public void mo28862O2(int i, int i2) {
        if (i == -1) {
            return;
        }
        String string = getActivity().getString(C45871nl4.quality_control_counter_format, Integer.valueOf(i + 1), Integer.valueOf(i2));
        Intrinsics.checkNotNullExpressionValue(string, "activity.getString(L.str…rentIndex + 1, itemCount)");
        this.f94481b.f47806b.setText(string);
    }

    /* renamed from: Ql */
    public final void m28860Ql(Button button, int i) {
        Drawable drawable;
        boolean z;
        Drawable[] compoundDrawables = button.getCompoundDrawables();
        Intrinsics.checkNotNullExpressionValue(compoundDrawables, "compoundDrawables");
        int length = compoundDrawables.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                drawable = compoundDrawables[i2];
                if (drawable != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    break;
                }
                i2++;
            } else {
                drawable = null;
                break;
            }
        }
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
    }

    @Override // p000.InterfaceC42770iX5
    /* renamed from: S8 */
    public boolean mo28858S8() {
        return this.f94482c.m101959C();
    }

    @Override // p000.InterfaceC42770iX5
    /* renamed from: V8 */
    public void mo28857V8(Boolean bool) {
        int i;
        if (bool == null) {
            return;
        }
        this.f94483d.cancel();
        BaseActivity activity = getActivity();
        if (bool.booleanValue()) {
            i = C48193rg4.ic_thumbs_up_2;
        } else {
            i = C48193rg4.ic_thumbs_down_2;
        }
        this.f94481b.f47812h.setImageDrawable(NA0.m94299e(activity, i));
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: jX5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C43956kX5.m28859Rl(C43956kX5.this, valueAnimator);
            }
        };
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f94481b.f47812h.getAlpha(), 1.0f);
        ofFloat.setDuration(50L);
        ofFloat.addUpdateListener(animatorUpdateListener);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f94481b.f47812h.getAlpha(), 0.0f);
        ofFloat2.setStartDelay(200L);
        ofFloat2.setDuration(50L);
        ofFloat2.addUpdateListener(animatorUpdateListener);
        this.f94483d.playSequentially(ofFloat, ofFloat2);
        this.f94483d.start();
    }

    @Override // p000.InterfaceC42770iX5
    /* renamed from: Xd */
    public void mo28856Xd(Boolean bool) {
        this.f94482c.m101956x(bool);
    }

    @Override // p000.InterfaceC42770iX5
    /* renamed from: b */
    public void mo28855b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f94482c.mo24871u(sections);
    }

    @Override // p000.InterfaceC42770iX5
    /* renamed from: dj */
    public Observable<Unit> mo28854dj() {
        Button button = this.f94481b.f47807c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.edit");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC42770iX5
    /* renamed from: o6 */
    public Observable<Unit> mo28853o6() {
        Button button = this.f94481b.f47809e;
        Intrinsics.checkNotNullExpressionValue(button, "binding.pass");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    @Override // p000.InterfaceC42770iX5
    /* renamed from: vf */
    public Observable<QCInspection> mo28852vf() {
        return this.f94482c.m101960B();
    }

    @Override // p000.InterfaceC42770iX5
    /* renamed from: vj */
    public void mo28851vj(Boolean bool) {
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            Button button = this.f94481b.f47809e;
            Intrinsics.checkNotNullExpressionValue(button, "binding.pass");
            m28860Ql(button, NA0.m94301c(getActivity(), f94478f));
            Button button2 = this.f94481b.f47808d;
            Intrinsics.checkNotNullExpressionValue(button2, "binding.fail");
            m28860Ql(button2, NA0.m94301c(getActivity(), f94480h));
        } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            Button button3 = this.f94481b.f47809e;
            Intrinsics.checkNotNullExpressionValue(button3, "binding.pass");
            m28860Ql(button3, NA0.m94301c(getActivity(), f94480h));
            Button button4 = this.f94481b.f47808d;
            Intrinsics.checkNotNullExpressionValue(button4, "binding.fail");
            m28860Ql(button4, NA0.m94301c(getActivity(), f94479g));
        } else {
            Button button5 = this.f94481b.f47809e;
            Intrinsics.checkNotNullExpressionValue(button5, "binding.pass");
            m28860Ql(button5, NA0.m94301c(getActivity(), f94478f));
            Button button6 = this.f94481b.f47808d;
            Intrinsics.checkNotNullExpressionValue(button6, "binding.fail");
            m28860Ql(button6, NA0.m94301c(getActivity(), f94479g));
        }
    }
}
