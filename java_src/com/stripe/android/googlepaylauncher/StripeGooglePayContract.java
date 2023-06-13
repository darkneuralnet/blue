package com.stripe.android.googlepaylauncher;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.view.ActivityStarter;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract;", "Lv5;", "Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;", "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "createIntent", "", "resultCode", "intent", "parseResult", "<init>", "()V", "Args", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class StripeGooglePayContract extends AbstractC29414v5<Args, GooglePayLauncherResult> {

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;", "Lcom/stripe/android/view/ActivityStarter$Args;", "config", "Lcom/stripe/android/googlepaylauncher/GooglePayConfig;", "statusBarColor", "", "(Lcom/stripe/android/googlepaylauncher/GooglePayConfig;Ljava/lang/Integer;)V", "getConfig", "()Lcom/stripe/android/googlepaylauncher/GooglePayConfig;", "setConfig", "(Lcom/stripe/android/googlepaylauncher/GooglePayConfig;)V", "getStatusBarColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Lcom/stripe/android/googlepaylauncher/GooglePayConfig;Ljava/lang/Integer;)Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Args implements ActivityStarter.Args {
        private GooglePayConfig config;
        private final Integer statusBarColor;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args$Companion;", "", "()V", "create", "Lcom/stripe/android/googlepaylauncher/StripeGooglePayContract$Args;", "intent", "Landroid/content/Intent;", "create$payments_core_release", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Args create$payments_core_release(Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                return (Args) intent.getParcelableExtra("extra_activity_args");
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(GooglePayConfig.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public Args(GooglePayConfig config, Integer num) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.config = config;
            this.statusBarColor = num;
        }

        public static /* synthetic */ Args copy$default(Args args, GooglePayConfig googlePayConfig, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                googlePayConfig = args.config;
            }
            if ((i & 2) != 0) {
                num = args.statusBarColor;
            }
            return args.copy(googlePayConfig, num);
        }

        public final GooglePayConfig component1() {
            return this.config;
        }

        public final Integer component2() {
            return this.statusBarColor;
        }

        public final Args copy(GooglePayConfig config, Integer num) {
            Intrinsics.checkNotNullParameter(config, "config");
            return new Args(config, num);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Args) {
                Args args = (Args) obj;
                return Intrinsics.areEqual(this.config, args.config) && Intrinsics.areEqual(this.statusBarColor, args.statusBarColor);
            }
            return false;
        }

        public final GooglePayConfig getConfig() {
            return this.config;
        }

        public final Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        public int hashCode() {
            int hashCode = this.config.hashCode() * 31;
            Integer num = this.statusBarColor;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public final void setConfig(GooglePayConfig googlePayConfig) {
            Intrinsics.checkNotNullParameter(googlePayConfig, "<set-?>");
            this.config = googlePayConfig;
        }

        public String toString() {
            GooglePayConfig googlePayConfig = this.config;
            Integer num = this.statusBarColor;
            return "Args(config=" + googlePayConfig + ", statusBarColor=" + num + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            int intValue;
            Intrinsics.checkNotNullParameter(out, "out");
            this.config.writeToParcel(out, i);
            Integer num = this.statusBarColor;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
        }
    }

    @Override // p000.AbstractC29414v5
    public Intent createIntent(Context context, Args input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Intent putExtra = new Intent(context, StripeGooglePayActivity.class).putExtra("extra_activity_args", input);
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(context, StripeGo…tarter.Args.EXTRA, input)");
        return putExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.AbstractC29414v5
    public GooglePayLauncherResult parseResult(int i, Intent intent) {
        return GooglePayLauncherResult.Companion.fromIntent(intent);
    }
}
