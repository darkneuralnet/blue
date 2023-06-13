package com.stripe.android.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00132\u00020\u0001:\u0003\u0014\u0013\u0015B\t\b\u0004¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\t\u001a\u00020\b2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0002\u0016\u0017¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/view/AuthActivityStarterHost;", "", "Ljava/lang/Class;", "target", "Landroid/os/Bundle;", "extras", "", "requestCode", "", "startActivityForResult", "getStatusBarColor", "()Ljava/lang/Integer;", "statusBarColor", "LLifecycleOwner;", "getLifecycleOwner", "()LLifecycleOwner;", "lifecycleOwner", "<init>", "()V", "Companion", "ActivityHost", "FragmentHost", "Lcom/stripe/android/view/AuthActivityStarterHost$ActivityHost;", "Lcom/stripe/android/view/AuthActivityStarterHost$FragmentHost;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public abstract class AuthActivityStarterHost {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\t\u001a\u00020\b2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/view/AuthActivityStarterHost$ActivityHost;", "Lcom/stripe/android/view/AuthActivityStarterHost;", "Ljava/lang/Class;", "target", "Landroid/os/Bundle;", "extras", "", "requestCode", "", "startActivityForResult", "Landroidx/activity/ComponentActivity;", "activity", "Landroidx/activity/ComponentActivity;", "getActivity", "()Landroidx/activity/ComponentActivity;", "statusBarColor", "Ljava/lang/Integer;", "getStatusBarColor", "()Ljava/lang/Integer;", "LLifecycleOwner;", "lifecycleOwner", "LLifecycleOwner;", "getLifecycleOwner", "()LLifecycleOwner;", "<init>", "(Landroidx/activity/ComponentActivity;Ljava/lang/Integer;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class ActivityHost extends AuthActivityStarterHost {
        private final ComponentActivity activity;
        private final LifecycleOwner lifecycleOwner;
        private final Integer statusBarColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityHost(ComponentActivity activity, Integer num) {
            super(null);
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
            this.statusBarColor = num;
            this.lifecycleOwner = activity;
        }

        public final ComponentActivity getActivity() {
            return this.activity;
        }

        @Override // com.stripe.android.view.AuthActivityStarterHost
        public LifecycleOwner getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        @Override // com.stripe.android.view.AuthActivityStarterHost
        public Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        @Override // com.stripe.android.view.AuthActivityStarterHost
        public void startActivityForResult(Class<?> target, Bundle extras, int i) {
            Intrinsics.checkNotNullParameter(target, "target");
            Intrinsics.checkNotNullParameter(extras, "extras");
            Intent putExtras = new Intent(this.activity, target).putExtras(extras);
            Intrinsics.checkNotNullExpressionValue(putExtras, "Intent(activity, target).putExtras(extras)");
            this.activity.startActivityForResult(putExtras, i);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0007¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/view/AuthActivityStarterHost$Companion;", "", "()V", "create", "Lcom/stripe/android/view/AuthActivityStarterHost;", "activity", "Landroidx/activity/ComponentActivity;", "create$payments_core_release", "fragment", "Landroidx/fragment/app/Fragment;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ AuthActivityStarterHost create$payments_core_release(Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            FragmentActivity requireActivity = fragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "fragment.requireActivity()");
            Window window = requireActivity.getWindow();
            return new FragmentHost(fragment, window != null ? Integer.valueOf(window.getStatusBarColor()) : null);
        }

        private Companion() {
        }

        public final /* synthetic */ AuthActivityStarterHost create$payments_core_release(ComponentActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Window window = activity.getWindow();
            return new ActivityHost(activity, window != null ? Integer.valueOf(window.getStatusBarColor()) : null);
        }
    }

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\t\u001a\u00020\b2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/view/AuthActivityStarterHost$FragmentHost;", "Lcom/stripe/android/view/AuthActivityStarterHost;", "Ljava/lang/Class;", "target", "Landroid/os/Bundle;", "extras", "", "requestCode", "", "startActivityForResult", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/fragment/app/Fragment;", "getFragment", "()Landroidx/fragment/app/Fragment;", "statusBarColor", "Ljava/lang/Integer;", "getStatusBarColor", "()Ljava/lang/Integer;", "LLifecycleOwner;", "lifecycleOwner", "LLifecycleOwner;", "getLifecycleOwner", "()LLifecycleOwner;", "<init>", "(Landroidx/fragment/app/Fragment;Ljava/lang/Integer;)V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class FragmentHost extends AuthActivityStarterHost {
        private final Fragment fragment;
        private final LifecycleOwner lifecycleOwner;
        private final Integer statusBarColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FragmentHost(Fragment fragment, Integer num) {
            super(null);
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.fragment = fragment;
            this.statusBarColor = num;
            this.lifecycleOwner = fragment;
        }

        public final Fragment getFragment() {
            return this.fragment;
        }

        @Override // com.stripe.android.view.AuthActivityStarterHost
        public LifecycleOwner getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        @Override // com.stripe.android.view.AuthActivityStarterHost
        public Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        @Override // com.stripe.android.view.AuthActivityStarterHost
        public void startActivityForResult(Class<?> target, Bundle extras, int i) {
            Intrinsics.checkNotNullParameter(target, "target");
            Intrinsics.checkNotNullParameter(extras, "extras");
            Intent putExtras = new Intent(this.fragment.getActivity(), target).putExtras(extras);
            Intrinsics.checkNotNullExpressionValue(putExtras, "Intent(fragment.activity…target).putExtras(extras)");
            if (this.fragment.isAdded()) {
                this.fragment.startActivityForResult(putExtras, i);
            }
        }
    }

    public /* synthetic */ AuthActivityStarterHost(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract LifecycleOwner getLifecycleOwner();

    public abstract Integer getStatusBarColor();

    public abstract void startActivityForResult(Class<?> cls, Bundle bundle, int i);

    private AuthActivityStarterHost() {
    }
}
