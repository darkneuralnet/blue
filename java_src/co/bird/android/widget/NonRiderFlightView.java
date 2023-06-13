package co.bird.android.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.widget.CallToActionBanner;
import co.bird.android.widget.NonRiderFlightView;
import com.facebook.share.internal.C17296a;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u0001:\u0002#\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bB\u001b\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001a\u0010\u001eB#\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\u001a\u0010!J>\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tJ\b\u0010\r\u001a\u00020\u000bH\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016¨\u0006$"}, m28432d2 = {"Lco/bird/android/widget/NonRiderFlightView;", "Landroid/widget/LinearLayout;", "Lco/bird/android/widget/NonRiderFlightView$a;", "bannerType", "", "title", "subTitle", "Landroid/graphics/drawable/Drawable;", "icon", "", "show", "", "c", DateTokenConverter.CONVERTER_KEY, "b", "Ljava/util/Queue;", "Le56;", "Ljava/util/Queue;", "toasts", "Z", "showingToasts", "Lcr6;", "Lcr6;", "binding", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "e", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class NonRiderFlightView extends LinearLayout {

    /* renamed from: e */
    public static final C16545b f67418e = new C16545b(null);

    /* renamed from: b */
    public final Queue<C40142e56> f67419b;

    /* renamed from: c */
    public boolean f67420c;

    /* renamed from: d */
    public final C39411cr6 f67421d;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/widget/NonRiderFlightView$a;", "", "<init>", "(Ljava/lang/String;I)V", "b", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.NonRiderFlightView$a */
    /* loaded from: classes4.dex */
    public enum EnumC16544a {
        SUPERCHARGER_ONBOARDING
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/widget/NonRiderFlightView$b;", "", "", "PADDING_BOTTOM_DP", "I", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.NonRiderFlightView$b */
    /* loaded from: classes4.dex */
    public static final class C16545b {
        public /* synthetic */ C16545b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16545b() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.widget.NonRiderFlightView$c */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16546c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC16544a.values().length];
            try {
                iArr[EnumC16544a.SUPERCHARGER_ONBOARDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"co/bird/android/widget/NonRiderFlightView$d", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "", "onAnimationEnd", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.NonRiderFlightView$d */
    /* loaded from: classes4.dex */
    public static final class C16547d extends AnimatorListenerAdapter {
        public C16547d() {
        }

        /* renamed from: b */
        public static final void m54520b(NonRiderFlightView this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.m54524d();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            TextView root = NonRiderFlightView.this.f67421d.f75734f.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.toastMessage.root");
            C49520tu6.m11239l(root);
            NonRiderFlightView.this.f67420c = false;
            final NonRiderFlightView nonRiderFlightView = NonRiderFlightView.this;
            nonRiderFlightView.post(new Runnable() { // from class: J93
                @Override // java.lang.Runnable
                public final void run() {
                    NonRiderFlightView.C16547d.m54520b(NonRiderFlightView.this);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonRiderFlightView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f67419b = new LinkedList();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C39411cr6 m44964b = C39411cr6.m44964b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m44964b, "inflate(context.layoutInflater, this)");
        this.f67421d = m44964b;
        setOrientation(1);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        setPaddingRelative(0, 0, 0, (int) C49347td3.m12002a(10, context3));
        setClipToPadding(false);
        setClipChildren(false);
    }

    /* renamed from: e */
    public static final void m54523e(NonRiderFlightView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m54526b();
    }

    /* renamed from: b */
    public final void m54526b() {
        if (!this.f67420c) {
            return;
        }
        this.f67421d.f75734f.getRoot().setAlpha(1.0f);
        TextView root = this.f67421d.f75734f.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.toastMessage.root");
        C49520tu6.m11233r(root);
        this.f67421d.f75734f.getRoot().animate().alpha(0.0f).setListener(new C16547d());
    }

    /* renamed from: c */
    public final void m54525c(EnumC16544a enumC16544a, String str, String str2, Drawable drawable, boolean z) {
        int i;
        CallToActionBanner callToActionBanner = this.f67421d.f75731c;
        Intrinsics.checkNotNullExpressionValue(callToActionBanner, "binding.callToActionBanner");
        Unit unit = null;
        C49520tu6.show$default(callToActionBanner, z, 0, 2, null);
        if (enumC16544a == null) {
            i = -1;
        } else {
            i = C16546c.$EnumSwitchMapping$0[enumC16544a.ordinal()];
        }
        if (i == 1) {
            this.f67421d.f75731c.setCallToActionState(CallToActionBanner.EnumC16470a.f67214l);
            return;
        }
        if (str != null) {
            this.f67421d.f75731c.setTitle(str);
        }
        if (str2 != null) {
            this.f67421d.f75731c.setSubtitle(str2);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.f67421d.f75731c.m54703r();
        }
        this.f67421d.f75731c.setDrawable(drawable);
    }

    /* renamed from: d */
    public final void m54524d() {
        if (this.f67419b.isEmpty()) {
            this.f67420c = false;
        } else if (this.f67420c) {
        } else {
            this.f67420c = true;
            C40142e56 poll = this.f67419b.poll();
            this.f67421d.f75734f.getRoot().setText(poll.m43287b());
            this.f67421d.f75734f.getRoot().setAlpha(0.0f);
            TextView root = this.f67421d.f75734f.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "binding.toastMessage.root");
            C49520tu6.m11233r(root);
            this.f67421d.f75734f.getRoot().animate().alpha(1.0f).setListener(null);
            postDelayed(new Runnable() { // from class: I93
                @Override // java.lang.Runnable
                public final void run() {
                    NonRiderFlightView.m54523e(NonRiderFlightView.this);
                }
            }, poll.m43288a().m42100b());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonRiderFlightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f67419b = new LinkedList();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C39411cr6 m44964b = C39411cr6.m44964b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m44964b, "inflate(context.layoutInflater, this)");
        this.f67421d = m44964b;
        setOrientation(1);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        setPaddingRelative(0, 0, 0, (int) C49347td3.m12002a(10, context3));
        setClipToPadding(false);
        setClipChildren(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonRiderFlightView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f67419b = new LinkedList();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        C39411cr6 m44964b = C39411cr6.m44964b(C40788fB0.m41772j(context2), this);
        Intrinsics.checkNotNullExpressionValue(m44964b, "inflate(context.layoutInflater, this)");
        this.f67421d = m44964b;
        setOrientation(1);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        setPaddingRelative(0, 0, 0, (int) C49347td3.m12002a(10, context3));
        setClipToPadding(false);
        setClipChildren(false);
    }
}
