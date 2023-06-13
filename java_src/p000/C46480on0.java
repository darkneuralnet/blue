package p000;

import android.animation.ValueAnimator;
import android.app.Application;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogInterface$OnCancelListenerC11663c;
import androidx.fragment.app.FragmentActivity;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.core.mvp.BaseActivity;
import co.bird.android.model.VehicleCommand;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u0010B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0002R\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, m28432d2 = {"Lon0;", "Landroidx/fragment/app/c;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "", "onViewCreated", "onStart", "N6", "Lrn0;", "b", "Lrn0;", "A9", "()Lrn0;", "setPresenter", "(Lrn0;)V", "presenter", "Ln31;", "c", "Ln31;", "binding", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, C17296a.f69688o, "co.bird.android.feature.lib.command"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCommandCenterErrorDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandCenterErrorDialog.kt\nco/bird/android/command/errordialog/CommandCenterErrorDialog\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n64#2:105\n1#3:106\n*S KotlinDebug\n*F\n+ 1 CommandCenterErrorDialog.kt\nco/bird/android/command/errordialog/CommandCenterErrorDialog\n*L\n57#1:105\n*E\n"})
/* renamed from: on0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C46480on0 extends DialogInterface$OnCancelListenerC11663c {

    /* renamed from: d */
    public static final C27062b f102487d = new C27062b(null);

    /* renamed from: b */
    public C48259rn0 f102488b;

    /* renamed from: c */
    public C45454n31 f102489c;

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m28432d2 = {"Lon0$a;", "", "Lon0;", "fragment", "", C17296a.f69688o, "co.bird.android.feature.lib.command"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Component(dependencies = {InterfaceC44393lG2.class})
    /* renamed from: on0$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC27060a {

        @Component.Factory
        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J8\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH&¨\u0006\u000e"}, m28432d2 = {"Lon0$a$a;", "", "LlG2;", "mainComponent", "Lco/bird/android/core/mvp/BaseActivity;", "activity", "Lcom/uber/autodispose/ScopeProvider;", Action.SCOPE_ATTRIBUTE, "Ln31;", "binding", "Landroid/content/DialogInterface;", "dialog", "Lon0$a;", C17296a.f69688o, "co.bird.android.feature.lib.command"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: on0$a$a */
        /* loaded from: classes2.dex */
        public interface InterfaceC27061a {
            /* renamed from: a */
            InterfaceC27060a mo20499a(InterfaceC44393lG2 interfaceC44393lG2, @BindsInstance BaseActivity baseActivity, @BindsInstance ScopeProvider scopeProvider, @BindsInstance C45454n31 c45454n31, @BindsInstance DialogInterface dialogInterface);
        }

        /* renamed from: a */
        void mo20500a(C46480on0 c46480on0);
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u000f"}, m28432d2 = {"Lon0$b;", "", "Lco/bird/android/model/VehicleCommand;", "command", "Lon0;", C17296a.f69688o, "", "EXTRA_COMMAND", "Ljava/lang/String;", "", "FADE_DURATION", "J", "TAG", "<init>", "()V", "co.bird.android.feature.lib.command"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: on0$b */
    /* loaded from: classes2.dex */
    public static final class C27062b {
        public /* synthetic */ C27062b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C46480on0 m20498a(VehicleCommand command) {
            Intrinsics.checkNotNullParameter(command, "command");
            C46480on0 c46480on0 = new C46480on0();
            Bundle bundle = new Bundle();
            bundle.putParcelable("command", command);
            c46480on0.setArguments(bundle);
            return c46480on0;
        }

        private C27062b() {
        }
    }

    /* renamed from: t8 */
    public static final void m20501t8(C46480on0 this$0, ValueAnimator anim) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(anim, "anim");
        C45454n31 c45454n31 = this$0.f102489c;
        if (c45454n31 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c45454n31 = null;
        }
        ConstraintLayout constraintLayout = c45454n31.f99273e;
        Object animatedValue = anim.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        constraintLayout.setAlpha(((Float) animatedValue).floatValue());
    }

    /* renamed from: A9 */
    public final C48259rn0 m20504A9() {
        C48259rn0 c48259rn0 = this.f102488b;
        if (c48259rn0 != null) {
            return c48259rn0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    /* renamed from: N6 */
    public final void m20503N6() {
        C45454n31 c45454n31 = this.f102489c;
        if (c45454n31 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c45454n31 = null;
        }
        c45454n31.f99273e.setAlpha(0.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: nn0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C46480on0.m20501t8(C46480on0.this, valueAnimator);
            }
        });
        ofFloat.start();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return C45454n31.m24519c(inflater, viewGroup, false).f99273e;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC11663c, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        Window window3;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window3 = dialog.getWindow()) != null) {
            window3.setDimAmount(0.0f);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null && (window = dialog3.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        BaseActivity baseActivity;
        C45454n31 c45454n31;
        VehicleCommand vehicleCommand;
        Intrinsics.checkNotNullParameter(view, "view");
        C45454n31 m24521a = C45454n31.m24521a(view);
        Intrinsics.checkNotNullExpressionValue(m24521a, "bind(view)");
        this.f102489c = m24521a;
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseActivity) {
            baseActivity = (BaseActivity) activity;
        } else {
            baseActivity = null;
        }
        if (baseActivity == null) {
            return;
        }
        InterfaceC27060a.InterfaceC27061a m75285a = YH0.m75285a();
        C46172oG2 c46172oG2 = C46172oG2.f101711a;
        Application application = baseActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "activity.application");
        InterfaceC44393lG2 m21419a = c46172oG2.m21419a(application);
        AndroidLifecycleScopeProvider m45195i = AndroidLifecycleScopeProvider.m45195i(this, C43626jy1.f93627b);
        Intrinsics.checkExpressionValueIsNotNull(m45195i, "AndroidLifecycleScopePro…m(this, boundaryResolver)");
        C45454n31 c45454n312 = this.f102489c;
        if (c45454n312 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c45454n31 = null;
        } else {
            c45454n31 = c45454n312;
        }
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        m75285a.mo20499a(m21419a, baseActivity, m45195i, c45454n31, dialog).mo20500a(this);
        Bundle arguments = getArguments();
        if (arguments != null && (vehicleCommand = (VehicleCommand) arguments.getParcelable("command")) != null) {
            m20504A9().m15392c(vehicleCommand);
        }
        m20503N6();
    }
}
