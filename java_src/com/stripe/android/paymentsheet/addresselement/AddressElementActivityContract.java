package com.stripe.android.paymentsheet.addresselement;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Window;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.core.injection.InjectorKt;
import com.stripe.android.paymentsheet.addresselement.AddressLauncher;
import com.stripe.android.paymentsheet.addresselement.AddressLauncherResult;
import com.stripe.android.view.ActivityStarter;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0010\u000f\u0011B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract;", "Lv5;", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "createIntent", "", "resultCode", "intent", "parseResult", "<init>", "()V", "Companion", "Args", com.paypal.android.sdk.onetouch.core.Result.f74995h, "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class AddressElementActivityContract extends AbstractC29414v5<Args, AddressLauncherResult> {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_ARGS = "com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract.extra_args";
    public static final String EXTRA_RESULT = "com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract.extra_result";

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Companion;", "", "()V", "EXTRA_ARGS", "", "EXTRA_RESULT", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0019"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Result;", "Lcom/stripe/android/view/ActivityStarter$Result;", "addressOptionsResult", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;", "(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V", "getAddressOptionsResult", "()Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toBundle", "Landroid/os/Bundle;", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Result implements ActivityStarter.Result {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Result> CREATOR = new Creator();
        private final AddressLauncherResult addressOptionsResult;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Result> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Result((AddressLauncherResult) parcel.readParcelable(Result.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i) {
                return new Result[i];
            }
        }

        public Result(AddressLauncherResult addressOptionsResult) {
            Intrinsics.checkNotNullParameter(addressOptionsResult, "addressOptionsResult");
            this.addressOptionsResult = addressOptionsResult;
        }

        public static /* synthetic */ Result copy$default(Result result, AddressLauncherResult addressLauncherResult, int i, Object obj) {
            if ((i & 1) != 0) {
                addressLauncherResult = result.addressOptionsResult;
            }
            return result.copy(addressLauncherResult);
        }

        public final AddressLauncherResult component1() {
            return this.addressOptionsResult;
        }

        public final Result copy(AddressLauncherResult addressOptionsResult) {
            Intrinsics.checkNotNullParameter(addressOptionsResult, "addressOptionsResult");
            return new Result(addressOptionsResult);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Result) && Intrinsics.areEqual(this.addressOptionsResult, ((Result) obj).addressOptionsResult);
        }

        public final AddressLauncherResult getAddressOptionsResult() {
            return this.addressOptionsResult;
        }

        public int hashCode() {
            return this.addressOptionsResult.hashCode();
        }

        @Override // com.stripe.android.view.ActivityStarter.Result
        public Bundle toBundle() {
            return C39564d70.m44603a(TuplesKt.m28425to(AddressElementActivityContract.EXTRA_RESULT, this));
        }

        public String toString() {
            AddressLauncherResult addressLauncherResult = this.addressOptionsResult;
            return "Result(addressOptionsResult=" + addressLauncherResult + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeParcelable(this.addressOptionsResult, i);
        }
    }

    @Override // p000.AbstractC29414v5
    public Intent createIntent(Context context, Args input) {
        Window window;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Integer num = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (window = activity.getWindow()) != null) {
            num = Integer.valueOf(window.getStatusBarColor());
        }
        Intent putExtra = new Intent(context, AddressElementActivity.class).putExtra(EXTRA_ARGS, Args.copy$default(input, null, null, null, num, 7, null));
        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(context, AddressE…rColor = statusBarColor))");
        return putExtra;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p000.AbstractC29414v5
    public AddressLauncherResult parseResult(int i, Intent intent) {
        Result result;
        AddressLauncherResult addressOptionsResult;
        return (intent == null || (result = (Result) intent.getParcelableExtra(EXTRA_RESULT)) == null || (addressOptionsResult = result.getAddressOptionsResult()) == null) ? AddressLauncherResult.Canceled.INSTANCE : addressOptionsResult;
    }

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001(B/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000e\u0010\u0012\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0013J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0002\b\u0015J\u000e\u0010\u0016\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\bHÀ\u0003¢\u0006\u0004\b\u0019\u0010\u0010J:\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\t\u0010\u001c\u001a\u00020\bHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\bHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0080\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006)"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "Lcom/stripe/android/view/ActivityStarter$Args;", "publishableKey", "", "config", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;", "injectorKey", "statusBarColor", "", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;Ljava/lang/String;Ljava/lang/Integer;)V", "getConfig$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;", "getInjectorKey$paymentsheet_release", "()Ljava/lang/String;", "getPublishableKey$paymentsheet_release", "getStatusBarColor$paymentsheet_release", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component1$paymentsheet_release", "component2", "component2$paymentsheet_release", "component3", "component3$paymentsheet_release", "component4", "component4$paymentsheet_release", "copy", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$Configuration;Ljava/lang/String;Ljava/lang/Integer;)Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "describeContents", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Args implements ActivityStarter.Args {
        private final AddressLauncher.Configuration config;
        private final String injectorKey;
        private final String publishableKey;
        private final Integer statusBarColor;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args$Companion;", "", "()V", "fromIntent", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivityContract$Args;", "intent", "Landroid/content/Intent;", "fromIntent$paymentsheet_release", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Args fromIntent$paymentsheet_release(Intent intent) {
                Intrinsics.checkNotNullParameter(intent, "intent");
                return (Args) intent.getParcelableExtra(AddressElementActivityContract.EXTRA_ARGS);
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
                return new Args(parcel.readString(), parcel.readInt() == 0 ? null : AddressLauncher.Configuration.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public Args(String publishableKey, AddressLauncher.Configuration configuration, @InjectorKey String injectorKey, Integer num) {
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(injectorKey, "injectorKey");
            this.publishableKey = publishableKey;
            this.config = configuration;
            this.injectorKey = injectorKey;
            this.statusBarColor = num;
        }

        public static /* synthetic */ Args copy$default(Args args, String str, AddressLauncher.Configuration configuration, String str2, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.publishableKey;
            }
            if ((i & 2) != 0) {
                configuration = args.config;
            }
            if ((i & 4) != 0) {
                str2 = args.injectorKey;
            }
            if ((i & 8) != 0) {
                num = args.statusBarColor;
            }
            return args.copy(str, configuration, str2, num);
        }

        public final String component1$paymentsheet_release() {
            return this.publishableKey;
        }

        public final AddressLauncher.Configuration component2$paymentsheet_release() {
            return this.config;
        }

        public final String component3$paymentsheet_release() {
            return this.injectorKey;
        }

        public final Integer component4$paymentsheet_release() {
            return this.statusBarColor;
        }

        public final Args copy(String publishableKey, AddressLauncher.Configuration configuration, @InjectorKey String injectorKey, Integer num) {
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(injectorKey, "injectorKey");
            return new Args(publishableKey, configuration, injectorKey, num);
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
                return Intrinsics.areEqual(this.publishableKey, args.publishableKey) && Intrinsics.areEqual(this.config, args.config) && Intrinsics.areEqual(this.injectorKey, args.injectorKey) && Intrinsics.areEqual(this.statusBarColor, args.statusBarColor);
            }
            return false;
        }

        public final AddressLauncher.Configuration getConfig$paymentsheet_release() {
            return this.config;
        }

        public final String getInjectorKey$paymentsheet_release() {
            return this.injectorKey;
        }

        public final String getPublishableKey$paymentsheet_release() {
            return this.publishableKey;
        }

        public final Integer getStatusBarColor$paymentsheet_release() {
            return this.statusBarColor;
        }

        public int hashCode() {
            int hashCode = this.publishableKey.hashCode() * 31;
            AddressLauncher.Configuration configuration = this.config;
            int hashCode2 = (((hashCode + (configuration == null ? 0 : configuration.hashCode())) * 31) + this.injectorKey.hashCode()) * 31;
            Integer num = this.statusBarColor;
            return hashCode2 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            String str = this.publishableKey;
            AddressLauncher.Configuration configuration = this.config;
            String str2 = this.injectorKey;
            Integer num = this.statusBarColor;
            return "Args(publishableKey=" + str + ", config=" + configuration + ", injectorKey=" + str2 + ", statusBarColor=" + num + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.publishableKey);
            AddressLauncher.Configuration configuration = this.config;
            if (configuration == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                configuration.writeToParcel(out, i);
            }
            out.writeString(this.injectorKey);
            Integer num = this.statusBarColor;
            if (num == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(num.intValue());
        }

        public /* synthetic */ Args(String str, AddressLauncher.Configuration configuration, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, configuration, (i & 4) != 0 ? InjectorKt.DUMMY_INJECTOR_KEY : str2, (i & 8) != 0 ? null : num);
        }
    }
}
