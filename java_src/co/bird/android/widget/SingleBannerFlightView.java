package co.bird.android.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.widget.SingleBannerFlightView;
import com.facebook.share.internal.C17296a;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0001\"B\u0011\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bB\u001b\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001a\u0010\u001eB#\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\u001a\u0010!J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0016¨\u0006#"}, m28432d2 = {"Lco/bird/android/widget/SingleBannerFlightView;", "Landroid/widget/LinearLayout;", "", "message", "Lf56;", "duration", "", DateTokenConverter.CONVERTER_KEY, "e", "c", "Ljava/util/Queue;", "Le56;", "b", "Ljava/util/Queue;", "toasts", "", "Z", "showingToasts", "LEt6;", "LEt6;", "binding", "Lco/bird/android/widget/PillDropdownButton;", "()Lco/bird/android/widget/PillDropdownButton;", "profileDropdown", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class SingleBannerFlightView extends LinearLayout {

    /* renamed from: e */
    public static final C16580a f67658e = new C16580a(null);

    /* renamed from: b */
    public final Queue<C40142e56> f67659b;

    /* renamed from: c */
    public boolean f67660c;

    /* renamed from: d */
    public final C32726Et6 f67661d;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lco/bird/android/widget/SingleBannerFlightView$a;", "", "", "PADDING_BOTTOM_DP", "I", "PADDING_HORIZONTAL_DP", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.SingleBannerFlightView$a */
    /* loaded from: classes4.dex */
    public static final class C16580a {
        public /* synthetic */ C16580a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16580a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"co/bird/android/widget/SingleBannerFlightView$b", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.SingleBannerFlightView$b */
    /* loaded from: classes4.dex */
    public static final class C16581b extends AnimatorListenerAdapter {
        public C16581b() {
        }

        /* renamed from: b */
        public static final void m54381b(SingleBannerFlightView this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.m54384e();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            TextView root = SingleBannerFlightView.this.f67661d.f8276e.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.toastMessage.root");
            C49520tu6.m11239l(root);
            SingleBannerFlightView.this.f67660c = false;
            final SingleBannerFlightView singleBannerFlightView = SingleBannerFlightView.this;
            singleBannerFlightView.post(new Runnable() { // from class: eB5
                @Override // java.lang.Runnable
                public final void run() {
                    SingleBannerFlightView.C16581b.m54381b(SingleBannerFlightView.this);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleBannerFlightView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f67659b = new LinkedList();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C32726Et6 m108250b = C32726Et6.m108250b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m108250b, "inflate(context.layoutInflater, this)");
        this.f67661d = m108250b;
        setOrientation(1);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "context");
        setPaddingRelative((int) C49347td3.m12002a(8, context3), 0, (int) C49347td3.m12002a(8, context4), (int) C49347td3.m12002a(8, context5));
        setClipToPadding(false);
        setClipChildren(false);
    }

    /* renamed from: f */
    public static final void m54383f(SingleBannerFlightView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m54386c();
    }

    /* renamed from: b */
    public final PillDropdownButton m54387b() {
        PillDropdownButton pillDropdownButton = this.f67661d.f8275d;
        Intrinsics.checkNotNullExpressionValue(pillDropdownButton, "binding.profileDropdown");
        return pillDropdownButton;
    }

    /* renamed from: c */
    public final void m54386c() {
        if (!this.f67660c) {
            return;
        }
        this.f67661d.f8276e.getRoot().setAlpha(1.0f);
        TextView root = this.f67661d.f8276e.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.toastMessage.root");
        C49520tu6.m11233r(root);
        this.f67661d.f8276e.getRoot().animate().alpha(0.0f).setListener(new C16581b());
    }

    /* renamed from: d */
    public final void m54385d(CharSequence message, EnumC40735f56 duration) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(duration, "duration");
        this.f67659b.add(new C40142e56(message, duration));
        m54384e();
    }

    /* renamed from: e */
    public final void m54384e() {
        if (this.f67659b.isEmpty()) {
            this.f67660c = false;
        } else if (this.f67660c) {
        } else {
            this.f67660c = true;
            C40142e56 poll = this.f67659b.poll();
            this.f67661d.f8276e.getRoot().setText(poll.m43287b());
            this.f67661d.f8276e.getRoot().setAlpha(0.0f);
            TextView root = this.f67661d.f8276e.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.toastMessage.root");
            C49520tu6.m11233r(root);
            this.f67661d.f8276e.getRoot().animate().alpha(1.0f).setListener(null);
            postDelayed(new Runnable() { // from class: dB5
                @Override // java.lang.Runnable
                public final void run() {
                    SingleBannerFlightView.m54383f(SingleBannerFlightView.this);
                }
            }, poll.m43288a().m42100b());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleBannerFlightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f67659b = new LinkedList();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C32726Et6 m108250b = C32726Et6.m108250b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m108250b, "inflate(context.layoutInflater, this)");
        this.f67661d = m108250b;
        setOrientation(1);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "context");
        setPaddingRelative((int) C49347td3.m12002a(8, context3), 0, (int) C49347td3.m12002a(8, context4), (int) C49347td3.m12002a(8, context5));
        setClipToPadding(false);
        setClipChildren(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleBannerFlightView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f67659b = new LinkedList();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C32726Et6 m108250b = C32726Et6.m108250b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m108250b, "inflate(context.layoutInflater, this)");
        this.f67661d = m108250b;
        setOrientation(1);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "context");
        setPaddingRelative((int) C49347td3.m12002a(8, context3), 0, (int) C49347td3.m12002a(8, context4), (int) C49347td3.m12002a(8, context5));
        setClipToPadding(false);
        setClipChildren(false);
    }
}
