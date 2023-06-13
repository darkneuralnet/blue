package co.bird.android.model;

import co.bird.android.model.identification.IdentificationAcceptableManualEntry;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.configs.RideConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0014\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0014\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*¨\u0006+"}, m28432d2 = {"Lco/bird/android/model/RideRequirement;", "", "()V", "AutoPay", "AutoPayV2", "Cancel", "DirectManualEntryIdentification", "FlockTogether", "GooglePay", "HelmetSelfieConfirmation", "IdentificationScanRequiresAppUpgrade", "LeaseBasedHelmetPrompt", "Payment", "PendingIdentificationCheck", "PreloadV2", "PushNotification", "Quiz", "RentalAgreement", "RiderHomeAreaPrompt", "ScanDriverLicenseWithIdentification", "SelectIdentificationMethod", "SoberStart", "TaxInformationRequirement", "Lco/bird/android/model/RideRequirement$AutoPay;", "Lco/bird/android/model/RideRequirement$AutoPayV2;", "Lco/bird/android/model/RideRequirement$Cancel;", "Lco/bird/android/model/RideRequirement$DirectManualEntryIdentification;", "Lco/bird/android/model/RideRequirement$FlockTogether;", "Lco/bird/android/model/RideRequirement$GooglePay;", "Lco/bird/android/model/RideRequirement$HelmetSelfieConfirmation;", "Lco/bird/android/model/RideRequirement$IdentificationScanRequiresAppUpgrade;", "Lco/bird/android/model/RideRequirement$LeaseBasedHelmetPrompt;", "Lco/bird/android/model/RideRequirement$Payment;", "Lco/bird/android/model/RideRequirement$PendingIdentificationCheck;", "Lco/bird/android/model/RideRequirement$PreloadV2;", "Lco/bird/android/model/RideRequirement$PushNotification;", "Lco/bird/android/model/RideRequirement$Quiz;", "Lco/bird/android/model/RideRequirement$RentalAgreement;", "Lco/bird/android/model/RideRequirement$RiderHomeAreaPrompt;", "Lco/bird/android/model/RideRequirement$ScanDriverLicenseWithIdentification;", "Lco/bird/android/model/RideRequirement$SelectIdentificationMethod;", "Lco/bird/android/model/RideRequirement$SoberStart;", "Lco/bird/android/model/RideRequirement$TaxInformationRequirement;", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public abstract class RideRequirement {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lco/bird/android/model/RideRequirement$AutoPay;", "Lco/bird/android/model/RideRequirement;", "()V", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class AutoPay extends RideRequirement {
        public static final AutoPay INSTANCE = new AutoPay();

        private AutoPay() {
            super(null);
        }
    }

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, m28432d2 = {"Lco/bird/android/model/RideRequirement$AutoPayV2;", "Lco/bird/android/model/RideRequirement;", "config", "Lco/bird/android/model/wire/configs/RideConfig;", "user", "Lco/bird/android/model/User;", "balance", "Lco/bird/android/model/Balance;", "defaultBirdPayment", "Lco/bird/android/model/BirdPayment;", "(Lco/bird/android/model/wire/configs/RideConfig;Lco/bird/android/model/User;Lco/bird/android/model/Balance;Lco/bird/android/model/BirdPayment;)V", "getBalance", "()Lco/bird/android/model/Balance;", "getConfig", "()Lco/bird/android/model/wire/configs/RideConfig;", "getDefaultBirdPayment", "()Lco/bird/android/model/BirdPayment;", "getUser", "()Lco/bird/android/model/User;", "component1", "component2", "component3", "component4", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class AutoPayV2 extends RideRequirement {
        private final Balance balance;
        private final RideConfig config;
        private final BirdPayment defaultBirdPayment;
        private final User user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AutoPayV2(RideConfig config, User user, Balance balance, BirdPayment birdPayment) {
            super(null);
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(user, "user");
            Intrinsics.checkNotNullParameter(balance, "balance");
            this.config = config;
            this.user = user;
            this.balance = balance;
            this.defaultBirdPayment = birdPayment;
        }

        public static /* synthetic */ AutoPayV2 copy$default(AutoPayV2 autoPayV2, RideConfig rideConfig, User user, Balance balance, BirdPayment birdPayment, int i, Object obj) {
            if ((i & 1) != 0) {
                rideConfig = autoPayV2.config;
            }
            if ((i & 2) != 0) {
                user = autoPayV2.user;
            }
            if ((i & 4) != 0) {
                balance = autoPayV2.balance;
            }
            if ((i & 8) != 0) {
                birdPayment = autoPayV2.defaultBirdPayment;
            }
            return autoPayV2.copy(rideConfig, user, balance, birdPayment);
        }

        public final RideConfig component1() {
            return this.config;
        }

        public final User component2() {
            return this.user;
        }

        public final Balance component3() {
            return this.balance;
        }

        public final BirdPayment component4() {
            return this.defaultBirdPayment;
        }

        public final AutoPayV2 copy(RideConfig config, User user, Balance balance, BirdPayment birdPayment) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(user, "user");
            Intrinsics.checkNotNullParameter(balance, "balance");
            return new AutoPayV2(config, user, balance, birdPayment);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AutoPayV2) {
                AutoPayV2 autoPayV2 = (AutoPayV2) obj;
                return Intrinsics.areEqual(this.config, autoPayV2.config) && Intrinsics.areEqual(this.user, autoPayV2.user) && Intrinsics.areEqual(this.balance, autoPayV2.balance) && Intrinsics.areEqual(this.defaultBirdPayment, autoPayV2.defaultBirdPayment);
            }
            return false;
        }

        public final Balance getBalance() {
            return this.balance;
        }

        public final RideConfig getConfig() {
            return this.config;
        }

        public final BirdPayment getDefaultBirdPayment() {
            return this.defaultBirdPayment;
        }

        public final User getUser() {
            return this.user;
        }

        public int hashCode() {
            int hashCode = ((((this.config.hashCode() * 31) + this.user.hashCode()) * 31) + this.balance.hashCode()) * 31;
            BirdPayment birdPayment = this.defaultBirdPayment;
            return hashCode + (birdPayment == null ? 0 : birdPayment.hashCode());
        }

        public String toString() {
            RideConfig rideConfig = this.config;
            User user = this.user;
            Balance balance = this.balance;
            BirdPayment birdPayment = this.defaultBirdPayment;
            return "AutoPayV2(config=" + rideConfig + ", user=" + user + ", balance=" + balance + ", defaultBirdPayment=" + birdPayment + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lco/bird/android/model/RideRequirement$Cancel;", "Lco/bird/android/model/RideRequirement;", "()V", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Cancel extends RideRequirement {
        public static final Cancel INSTANCE = new Cancel();

        private Cancel() {
            super(null);
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/RideRequirement$DirectManualEntryIdentification;", "Lco/bird/android/model/RideRequirement;", "acceptableManualEntry", "Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;", "hasMoreAcceptableMethods", "", "(Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;Z)V", "getAcceptableManualEntry", "()Lco/bird/android/model/identification/IdentificationAcceptableManualEntry;", "getHasMoreAcceptableMethods", "()Z", "component1", "component2", "copy", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class DirectManualEntryIdentification extends RideRequirement {
        private final IdentificationAcceptableManualEntry acceptableManualEntry;
        private final boolean hasMoreAcceptableMethods;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DirectManualEntryIdentification(IdentificationAcceptableManualEntry acceptableManualEntry, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(acceptableManualEntry, "acceptableManualEntry");
            this.acceptableManualEntry = acceptableManualEntry;
            this.hasMoreAcceptableMethods = z;
        }

        public static /* synthetic */ DirectManualEntryIdentification copy$default(DirectManualEntryIdentification directManualEntryIdentification, IdentificationAcceptableManualEntry identificationAcceptableManualEntry, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                identificationAcceptableManualEntry = directManualEntryIdentification.acceptableManualEntry;
            }
            if ((i & 2) != 0) {
                z = directManualEntryIdentification.hasMoreAcceptableMethods;
            }
            return directManualEntryIdentification.copy(identificationAcceptableManualEntry, z);
        }

        public final IdentificationAcceptableManualEntry component1() {
            return this.acceptableManualEntry;
        }

        public final boolean component2() {
            return this.hasMoreAcceptableMethods;
        }

        public final DirectManualEntryIdentification copy(IdentificationAcceptableManualEntry acceptableManualEntry, boolean z) {
            Intrinsics.checkNotNullParameter(acceptableManualEntry, "acceptableManualEntry");
            return new DirectManualEntryIdentification(acceptableManualEntry, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof DirectManualEntryIdentification) {
                DirectManualEntryIdentification directManualEntryIdentification = (DirectManualEntryIdentification) obj;
                return Intrinsics.areEqual(this.acceptableManualEntry, directManualEntryIdentification.acceptableManualEntry) && this.hasMoreAcceptableMethods == directManualEntryIdentification.hasMoreAcceptableMethods;
            }
            return false;
        }

        public final IdentificationAcceptableManualEntry getAcceptableManualEntry() {
            return this.acceptableManualEntry;
        }

        public final boolean getHasMoreAcceptableMethods() {
            return this.hasMoreAcceptableMethods;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.acceptableManualEntry.hashCode() * 31;
            boolean z = this.hasMoreAcceptableMethods;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            IdentificationAcceptableManualEntry identificationAcceptableManualEntry = this.acceptableManualEntry;
            boolean z = this.hasMoreAcceptableMethods;
            return "DirectManualEntryIdentification(acceptableManualEntry=" + identificationAcceptableManualEntry + ", hasMoreAcceptableMethods=" + z + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lco/bird/android/model/RideRequirement$FlockTogether;", "Lco/bird/android/model/RideRequirement;", "()V", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class FlockTogether extends RideRequirement {
        public static final FlockTogether INSTANCE = new FlockTogether();

        private FlockTogether() {
            super(null);
        }
    }

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m28432d2 = {"Lco/bird/android/model/RideRequirement$GooglePay;", "Lco/bird/android/model/RideRequirement;", "config", "Lco/bird/android/model/wire/configs/RideConfig;", "user", "Lco/bird/android/model/User;", "(Lco/bird/android/model/wire/configs/RideConfig;Lco/bird/android/model/User;)V", "getConfig", "()Lco/bird/android/model/wire/configs/RideConfig;", "getUser", "()Lco/bird/android/model/User;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class GooglePay extends RideRequirement {
        private final RideConfig config;
        private final User user;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GooglePay(RideConfig config, User user) {
            super(null);
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(user, "user");
            this.config = config;
            this.user = user;
        }

        public static /* synthetic */ GooglePay copy$default(GooglePay googlePay, RideConfig rideConfig, User user, int i, Object obj) {
            if ((i & 1) != 0) {
                rideConfig = googlePay.config;
            }
            if ((i & 2) != 0) {
                user = googlePay.user;
            }
            return googlePay.copy(rideConfig, user);
        }

        public final RideConfig component1() {
            return this.config;
        }

        public final User component2() {
            return this.user;
        }

        public final GooglePay copy(RideConfig config, User user) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(user, "user");
            return new GooglePay(config, user);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof GooglePay) {
                GooglePay googlePay = (GooglePay) obj;
                return Intrinsics.areEqual(this.config, googlePay.config) && Intrinsics.areEqual(this.user, googlePay.user);
            }
            return false;
        }

        public final RideConfig getConfig() {
            return this.config;
        }

        public final User getUser() {
            return this.user;
        }

        public int hashCode() {
            return (this.config.hashCode() * 31) + this.user.hashCode();
        }

        public String toString() {
            RideConfig rideConfig = this.config;
            User user = this.user;
            return "GooglePay(config=" + rideConfig + ", user=" + user + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/model/RideRequirement$HelmetSelfieConfirmation;", "Lco/bird/android/model/RideRequirement;", "bird", "Lco/bird/android/model/wire/WireBird;", "(Lco/bird/android/model/wire/WireBird;)V", "getBird", "()Lco/bird/android/model/wire/WireBird;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class HelmetSelfieConfirmation extends RideRequirement {
        private final WireBird bird;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HelmetSelfieConfirmation(WireBird bird) {
            super(null);
            Intrinsics.checkNotNullParameter(bird, "bird");
            this.bird = bird;
        }

        public static /* synthetic */ HelmetSelfieConfirmation copy$default(HelmetSelfieConfirmation helmetSelfieConfirmation, WireBird wireBird, int i, Object obj) {
            if ((i & 1) != 0) {
                wireBird = helmetSelfieConfirmation.bird;
            }
            return helmetSelfieConfirmation.copy(wireBird);
        }

        public final WireBird component1() {
            return this.bird;
        }

        public final HelmetSelfieConfirmation copy(WireBird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            return new HelmetSelfieConfirmation(bird);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HelmetSelfieConfirmation) && Intrinsics.areEqual(this.bird, ((HelmetSelfieConfirmation) obj).bird);
        }

        public final WireBird getBird() {
            return this.bird;
        }

        public int hashCode() {
            return this.bird.hashCode();
        }

        public String toString() {
            WireBird wireBird = this.bird;
            return "HelmetSelfieConfirmation(bird=" + wireBird + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lco/bird/android/model/RideRequirement$IdentificationScanRequiresAppUpgrade;", "Lco/bird/android/model/RideRequirement;", "()V", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class IdentificationScanRequiresAppUpgrade extends RideRequirement {
        public static final IdentificationScanRequiresAppUpgrade INSTANCE = new IdentificationScanRequiresAppUpgrade();

        private IdentificationScanRequiresAppUpgrade() {
            super(null);
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/model/RideRequirement$LeaseBasedHelmetPrompt;", "Lco/bird/android/model/RideRequirement;", "bird", "Lco/bird/android/model/wire/WireBird;", "(Lco/bird/android/model/wire/WireBird;)V", "getBird", "()Lco/bird/android/model/wire/WireBird;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class LeaseBasedHelmetPrompt extends RideRequirement {
        private final WireBird bird;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LeaseBasedHelmetPrompt(WireBird bird) {
            super(null);
            Intrinsics.checkNotNullParameter(bird, "bird");
            this.bird = bird;
        }

        public static /* synthetic */ LeaseBasedHelmetPrompt copy$default(LeaseBasedHelmetPrompt leaseBasedHelmetPrompt, WireBird wireBird, int i, Object obj) {
            if ((i & 1) != 0) {
                wireBird = leaseBasedHelmetPrompt.bird;
            }
            return leaseBasedHelmetPrompt.copy(wireBird);
        }

        public final WireBird component1() {
            return this.bird;
        }

        public final LeaseBasedHelmetPrompt copy(WireBird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            return new LeaseBasedHelmetPrompt(bird);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LeaseBasedHelmetPrompt) && Intrinsics.areEqual(this.bird, ((LeaseBasedHelmetPrompt) obj).bird);
        }

        public final WireBird getBird() {
            return this.bird;
        }

        public int hashCode() {
            return this.bird.hashCode();
        }

        public String toString() {
            WireBird wireBird = this.bird;
            return "LeaseBasedHelmetPrompt(bird=" + wireBird + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lco/bird/android/model/RideRequirement$Payment;", "Lco/bird/android/model/RideRequirement;", "()V", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Payment extends RideRequirement {
        public static final Payment INSTANCE = new Payment();

        private Payment() {
            super(null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lco/bird/android/model/RideRequirement$PendingIdentificationCheck;", "Lco/bird/android/model/RideRequirement;", "()V", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class PendingIdentificationCheck extends RideRequirement {
        public static final PendingIdentificationCheck INSTANCE = new PendingIdentificationCheck();

        private PendingIdentificationCheck() {
            super(null);
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/model/RideRequirement$PreloadV2;", "Lco/bird/android/model/RideRequirement;", "displayAutoReload", "", "(Z)V", "getDisplayAutoReload", "()Z", "component1", "copy", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class PreloadV2 extends RideRequirement {
        private final boolean displayAutoReload;

        public PreloadV2(boolean z) {
            super(null);
            this.displayAutoReload = z;
        }

        public static /* synthetic */ PreloadV2 copy$default(PreloadV2 preloadV2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = preloadV2.displayAutoReload;
            }
            return preloadV2.copy(z);
        }

        public final boolean component1() {
            return this.displayAutoReload;
        }

        public final PreloadV2 copy(boolean z) {
            return new PreloadV2(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PreloadV2) && this.displayAutoReload == ((PreloadV2) obj).displayAutoReload;
        }

        public final boolean getDisplayAutoReload() {
            return this.displayAutoReload;
        }

        public int hashCode() {
            boolean z = this.displayAutoReload;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            boolean z = this.displayAutoReload;
            return "PreloadV2(displayAutoReload=" + z + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lco/bird/android/model/RideRequirement$PushNotification;", "Lco/bird/android/model/RideRequirement;", "()V", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class PushNotification extends RideRequirement {
        public static final PushNotification INSTANCE = new PushNotification();

        private PushNotification() {
            super(null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lco/bird/android/model/RideRequirement$Quiz;", "Lco/bird/android/model/RideRequirement;", "()V", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Quiz extends RideRequirement {
        public static final Quiz INSTANCE = new Quiz();

        private Quiz() {
            super(null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m28432d2 = {"Lco/bird/android/model/RideRequirement$RentalAgreement;", "Lco/bird/android/model/RideRequirement;", "requiredAgreements", "", "Lco/bird/android/model/AgreementRole;", "userGuestId", "", "(Ljava/util/List;Ljava/lang/String;)V", "getRequiredAgreements", "()Ljava/util/List;", "getUserGuestId", "()Ljava/lang/String;", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class RentalAgreement extends RideRequirement {
        private final List<AgreementRole> requiredAgreements;
        private final String userGuestId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public RentalAgreement(List<? extends AgreementRole> requiredAgreements, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(requiredAgreements, "requiredAgreements");
            this.requiredAgreements = requiredAgreements;
            this.userGuestId = str;
        }

        public final List<AgreementRole> getRequiredAgreements() {
            return this.requiredAgreements;
        }

        public final String getUserGuestId() {
            return this.userGuestId;
        }

        public /* synthetic */ RentalAgreement(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? null : str);
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/model/RideRequirement$RiderHomeAreaPrompt;", "Lco/bird/android/model/RideRequirement;", "bird", "Lco/bird/android/model/wire/WireBird;", "(Lco/bird/android/model/wire/WireBird;)V", "getBird", "()Lco/bird/android/model/wire/WireBird;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class RiderHomeAreaPrompt extends RideRequirement {
        private final WireBird bird;

        public RiderHomeAreaPrompt(WireBird wireBird) {
            super(null);
            this.bird = wireBird;
        }

        public static /* synthetic */ RiderHomeAreaPrompt copy$default(RiderHomeAreaPrompt riderHomeAreaPrompt, WireBird wireBird, int i, Object obj) {
            if ((i & 1) != 0) {
                wireBird = riderHomeAreaPrompt.bird;
            }
            return riderHomeAreaPrompt.copy(wireBird);
        }

        public final WireBird component1() {
            return this.bird;
        }

        public final RiderHomeAreaPrompt copy(WireBird wireBird) {
            return new RiderHomeAreaPrompt(wireBird);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RiderHomeAreaPrompt) && Intrinsics.areEqual(this.bird, ((RiderHomeAreaPrompt) obj).bird);
        }

        public final WireBird getBird() {
            return this.bird;
        }

        public int hashCode() {
            WireBird wireBird = this.bird;
            if (wireBird == null) {
                return 0;
            }
            return wireBird.hashCode();
        }

        public String toString() {
            WireBird wireBird = this.bird;
            return "RiderHomeAreaPrompt(bird=" + wireBird + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lco/bird/android/model/RideRequirement$ScanDriverLicenseWithIdentification;", "Lco/bird/android/model/RideRequirement;", "()V", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class ScanDriverLicenseWithIdentification extends RideRequirement {
        public static final ScanDriverLicenseWithIdentification INSTANCE = new ScanDriverLicenseWithIdentification();

        private ScanDriverLicenseWithIdentification() {
            super(null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lco/bird/android/model/RideRequirement$SelectIdentificationMethod;", "Lco/bird/android/model/RideRequirement;", "()V", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class SelectIdentificationMethod extends RideRequirement {
        public static final SelectIdentificationMethod INSTANCE = new SelectIdentificationMethod();

        private SelectIdentificationMethod() {
            super(null);
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lco/bird/android/model/RideRequirement$SoberStart;", "Lco/bird/android/model/RideRequirement;", "bird", "Lco/bird/android/model/wire/WireBird;", "(Lco/bird/android/model/wire/WireBird;)V", "getBird", "()Lco/bird/android/model/wire/WireBird;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class SoberStart extends RideRequirement {
        private final WireBird bird;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SoberStart(WireBird bird) {
            super(null);
            Intrinsics.checkNotNullParameter(bird, "bird");
            this.bird = bird;
        }

        public static /* synthetic */ SoberStart copy$default(SoberStart soberStart, WireBird wireBird, int i, Object obj) {
            if ((i & 1) != 0) {
                wireBird = soberStart.bird;
            }
            return soberStart.copy(wireBird);
        }

        public final WireBird component1() {
            return this.bird;
        }

        public final SoberStart copy(WireBird bird) {
            Intrinsics.checkNotNullParameter(bird, "bird");
            return new SoberStart(bird);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SoberStart) && Intrinsics.areEqual(this.bird, ((SoberStart) obj).bird);
        }

        public final WireBird getBird() {
            return this.bird;
        }

        public int hashCode() {
            return this.bird.hashCode();
        }

        public String toString() {
            WireBird wireBird = this.bird;
            return "SoberStart(bird=" + wireBird + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lco/bird/android/model/RideRequirement$TaxInformationRequirement;", "Lco/bird/android/model/RideRequirement;", "()V", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class TaxInformationRequirement extends RideRequirement {
        public static final TaxInformationRequirement INSTANCE = new TaxInformationRequirement();

        private TaxInformationRequirement() {
            super(null);
        }
    }

    public /* synthetic */ RideRequirement(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RideRequirement() {
    }
}
