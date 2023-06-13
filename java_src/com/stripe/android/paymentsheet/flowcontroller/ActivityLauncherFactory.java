package com.stripe.android.paymentsheet.flowcontroller;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0004¢\u0006\u0004\b\n\u0010\u000bJ<\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H&\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory;", "", "I", "O", "Lv5;", "contract", "Lt5;", "callback", "LB5;", "create", "<init>", "()V", "ActivityHost", "FragmentHost", "Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory$ActivityHost;", "Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory$FragmentHost;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public abstract class ActivityLauncherFactory {

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ<\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory$ActivityHost;", "Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory;", "I", "O", "Lv5;", "contract", "Lt5;", "callback", "LB5;", "create", "Landroidx/activity/ComponentActivity;", "activity", "Landroidx/activity/ComponentActivity;", "<init>", "(Landroidx/activity/ComponentActivity;)V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class ActivityHost extends ActivityLauncherFactory {
        private final ComponentActivity activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityHost(ComponentActivity activity) {
            super(null);
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.ActivityLauncherFactory
        public <I, O> AbstractC0407B5<I> create(AbstractC29414v5<I, O> contract, InterfaceC28515t5<O> callback) {
            Intrinsics.checkNotNullParameter(contract, "contract");
            Intrinsics.checkNotNullParameter(callback, "callback");
            AbstractC0407B5<I> registerForActivityResult = this.activity.registerForActivityResult(contract, callback);
            Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "activity.registerForActi…   callback\n            )");
            return registerForActivityResult;
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ<\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory$FragmentHost;", "Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory;", "I", "O", "Lv5;", "contract", "Lt5;", "callback", "LB5;", "create", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/fragment/app/Fragment;", "<init>", "(Landroidx/fragment/app/Fragment;)V", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class FragmentHost extends ActivityLauncherFactory {
        private final Fragment fragment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FragmentHost(Fragment fragment) {
            super(null);
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.fragment = fragment;
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.ActivityLauncherFactory
        public <I, O> AbstractC0407B5<I> create(AbstractC29414v5<I, O> contract, InterfaceC28515t5<O> callback) {
            Intrinsics.checkNotNullParameter(contract, "contract");
            Intrinsics.checkNotNullParameter(callback, "callback");
            AbstractC0407B5<I> registerForActivityResult = this.fragment.registerForActivityResult(contract, callback);
            Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "fragment.registerForActi…   callback\n            )");
            return registerForActivityResult;
        }
    }

    public /* synthetic */ ActivityLauncherFactory(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract <I, O> AbstractC0407B5<I> create(AbstractC29414v5<I, O> abstractC29414v5, InterfaceC28515t5<O> interfaceC28515t5);

    private ActivityLauncherFactory() {
    }
}
