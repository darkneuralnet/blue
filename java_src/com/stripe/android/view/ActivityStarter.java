package com.stripe.android.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.stripe.android.view.ActivityStarter.Args;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005:\u0002\u0016\u0017B1\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\fB1\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000fB=\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00028\u0001¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/view/ActivityStarter;", "TargetActivityType", "Landroid/app/Activity;", "ArgsType", "Lcom/stripe/android/view/ActivityStarter$Args;", "", "activity", "targetClass", "Ljava/lang/Class;", "requestCode", "", "intentFlags", "(Landroid/app/Activity;Ljava/lang/Class;ILjava/lang/Integer;)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Ljava/lang/Class;ILjava/lang/Integer;)V", "(Landroid/app/Activity;Landroidx/fragment/app/Fragment;Ljava/lang/Class;ILjava/lang/Integer;)V", "Ljava/lang/Integer;", "startForResult", "", "args", "(Lcom/stripe/android/view/ActivityStarter$Args;)V", "Args", com.paypal.android.sdk.onetouch.core.Result.f74995h, "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class ActivityStarter<TargetActivityType extends Activity, ArgsType extends Args> {
    public static final int $stable = 8;
    private final Activity activity;
    private final Fragment fragment;
    private final Integer intentFlags;
    private final int requestCode;
    private final Class<TargetActivityType> targetClass;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/view/ActivityStarter$Args;", "Landroid/os/Parcelable;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public interface Args extends Parcelable {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final String EXTRA = "extra_activity_args";

        @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/view/ActivityStarter$Args$Companion;", "", "()V", "EXTRA", "", "getEXTRA$annotations", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final String EXTRA = "extra_activity_args";

            private Companion() {
            }

            public static /* synthetic */ void getEXTRA$annotations() {
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/view/ActivityStarter$Result;", "Landroid/os/Parcelable;", "toBundle", "Landroid/os/Bundle;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public interface Result extends Parcelable {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final String EXTRA = "extra_activity_result";

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/view/ActivityStarter$Result$Companion;", "", "()V", "EXTRA", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final String EXTRA = "extra_activity_result";

            private Companion() {
            }
        }

        Bundle toBundle();
    }

    public ActivityStarter(Activity activity, Fragment fragment, Class<TargetActivityType> targetClass, int i, Integer num) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(targetClass, "targetClass");
        this.activity = activity;
        this.fragment = fragment;
        this.targetClass = targetClass;
        this.requestCode = i;
        this.intentFlags = num;
    }

    public final void startForResult(ArgsType args) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intent putExtra = new Intent((Context) this.activity, (Class<?>) this.targetClass).putExtra("extra_activity_args", args);
        Integer num = this.intentFlags;
        if (num != null) {
            putExtra.addFlags(num.intValue());
        }
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(activity, targetC…          }\n            }");
        Fragment fragment = this.fragment;
        if (fragment != null) {
            fragment.startActivityForResult(putExtra, this.requestCode);
        } else {
            this.activity.startActivityForResult(putExtra, this.requestCode);
        }
    }

    public /* synthetic */ ActivityStarter(Activity activity, Fragment fragment, Class cls, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, (i2 & 2) != 0 ? null : fragment, cls, i, (i2 & 16) != 0 ? null : num);
    }

    public /* synthetic */ ActivityStarter(Activity activity, Class cls, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, cls, i, (i2 & 8) != 0 ? null : num);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityStarter(Activity activity, Class<TargetActivityType> targetClass, int i, Integer num) {
        this(activity, null, targetClass, i, num);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(targetClass, "targetClass");
    }

    public /* synthetic */ ActivityStarter(Fragment fragment, Class cls, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment, cls, i, (i2 & 8) != 0 ? null : num);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ActivityStarter(Fragment fragment, Class<TargetActivityType> targetClass, int i, Integer num) {
        this(r2, fragment, targetClass, i, num);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(targetClass, "targetClass");
        FragmentActivity requireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "fragment.requireActivity()");
    }
}
