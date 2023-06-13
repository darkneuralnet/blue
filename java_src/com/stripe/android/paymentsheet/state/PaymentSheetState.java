package com.stripe.android.paymentsheet.state;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/state/PaymentSheetState;", "Landroid/os/Parcelable;", "Full", "Loading", "Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;", "Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Loading;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface PaymentSheetState extends Parcelable {

    @Metadata(m28433d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0010HÆ\u0003J[\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001J\u0013\u0010/\u001a\u00020\f2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020.HÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001J\u0019\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020.HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006:"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Full;", "Lcom/stripe/android/paymentsheet/state/PaymentSheetState;", "config", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "customerPaymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "savedSelection", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "isGooglePayReady", "", "linkState", "Lcom/stripe/android/paymentsheet/state/LinkState;", "newPaymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;Lcom/stripe/android/model/StripeIntent;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/SavedSelection;ZLcom/stripe/android/paymentsheet/state/LinkState;Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;)V", "getConfig", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "getCustomerPaymentMethods", "()Ljava/util/List;", "hasPaymentOptions", "getHasPaymentOptions", "()Z", "initialPaymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "getInitialPaymentSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "getLinkState", "()Lcom/stripe/android/paymentsheet/state/LinkState;", "getNewPaymentSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;", "getSavedSelection", "()Lcom/stripe/android/paymentsheet/model/SavedSelection;", "getStripeIntent", "()Lcom/stripe/android/model/StripeIntent;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nPaymentSheetState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheetState.kt\ncom/stripe/android/paymentsheet/state/PaymentSheetState$Full\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n288#2,2:48\n*S KotlinDebug\n*F\n+ 1 PaymentSheetState.kt\ncom/stripe/android/paymentsheet/state/PaymentSheetState$Full\n*L\n35#1:48,2\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Full implements PaymentSheetState {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Full> CREATOR = new Creator();
        private final PaymentSheet.Configuration config;
        private final List<PaymentMethod> customerPaymentMethods;
        private final boolean isGooglePayReady;
        private final LinkState linkState;
        private final PaymentSelection.New newPaymentSelection;
        private final SavedSelection savedSelection;
        private final StripeIntent stripeIntent;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Full> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Full createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                PaymentSheet.Configuration createFromParcel = parcel.readInt() == 0 ? null : PaymentSheet.Configuration.CREATOR.createFromParcel(parcel);
                StripeIntent stripeIntent = (StripeIntent) parcel.readParcelable(Full.class.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(parcel.readParcelable(Full.class.getClassLoader()));
                }
                return new Full(createFromParcel, stripeIntent, arrayList, (SavedSelection) parcel.readParcelable(Full.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0 ? LinkState.CREATOR.createFromParcel(parcel) : null, (PaymentSelection.New) parcel.readParcelable(Full.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Full[] newArray(int i) {
                return new Full[i];
            }
        }

        public Full(PaymentSheet.Configuration configuration, StripeIntent stripeIntent, List<PaymentMethod> customerPaymentMethods, SavedSelection savedSelection, boolean z, LinkState linkState, PaymentSelection.New r8) {
            Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
            Intrinsics.checkNotNullParameter(customerPaymentMethods, "customerPaymentMethods");
            Intrinsics.checkNotNullParameter(savedSelection, "savedSelection");
            this.config = configuration;
            this.stripeIntent = stripeIntent;
            this.customerPaymentMethods = customerPaymentMethods;
            this.savedSelection = savedSelection;
            this.isGooglePayReady = z;
            this.linkState = linkState;
            this.newPaymentSelection = r8;
        }

        public static /* synthetic */ Full copy$default(Full full, PaymentSheet.Configuration configuration, StripeIntent stripeIntent, List list, SavedSelection savedSelection, boolean z, LinkState linkState, PaymentSelection.New r12, int i, Object obj) {
            if ((i & 1) != 0) {
                configuration = full.config;
            }
            if ((i & 2) != 0) {
                stripeIntent = full.stripeIntent;
            }
            StripeIntent stripeIntent2 = stripeIntent;
            List<PaymentMethod> list2 = list;
            if ((i & 4) != 0) {
                list2 = full.customerPaymentMethods;
            }
            List list3 = list2;
            if ((i & 8) != 0) {
                savedSelection = full.savedSelection;
            }
            SavedSelection savedSelection2 = savedSelection;
            if ((i & 16) != 0) {
                z = full.isGooglePayReady;
            }
            boolean z2 = z;
            if ((i & 32) != 0) {
                linkState = full.linkState;
            }
            LinkState linkState2 = linkState;
            if ((i & 64) != 0) {
                r12 = full.newPaymentSelection;
            }
            return full.copy(configuration, stripeIntent2, list3, savedSelection2, z2, linkState2, r12);
        }

        public final PaymentSheet.Configuration component1() {
            return this.config;
        }

        public final StripeIntent component2() {
            return this.stripeIntent;
        }

        public final List<PaymentMethod> component3() {
            return this.customerPaymentMethods;
        }

        public final SavedSelection component4() {
            return this.savedSelection;
        }

        public final boolean component5() {
            return this.isGooglePayReady;
        }

        public final LinkState component6() {
            return this.linkState;
        }

        public final PaymentSelection.New component7() {
            return this.newPaymentSelection;
        }

        public final Full copy(PaymentSheet.Configuration configuration, StripeIntent stripeIntent, List<PaymentMethod> customerPaymentMethods, SavedSelection savedSelection, boolean z, LinkState linkState, PaymentSelection.New r16) {
            Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
            Intrinsics.checkNotNullParameter(customerPaymentMethods, "customerPaymentMethods");
            Intrinsics.checkNotNullParameter(savedSelection, "savedSelection");
            return new Full(configuration, stripeIntent, customerPaymentMethods, savedSelection, z, linkState, r16);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Full) {
                Full full = (Full) obj;
                return Intrinsics.areEqual(this.config, full.config) && Intrinsics.areEqual(this.stripeIntent, full.stripeIntent) && Intrinsics.areEqual(this.customerPaymentMethods, full.customerPaymentMethods) && Intrinsics.areEqual(this.savedSelection, full.savedSelection) && this.isGooglePayReady == full.isGooglePayReady && Intrinsics.areEqual(this.linkState, full.linkState) && Intrinsics.areEqual(this.newPaymentSelection, full.newPaymentSelection);
            }
            return false;
        }

        public final PaymentSheet.Configuration getConfig() {
            return this.config;
        }

        public final List<PaymentMethod> getCustomerPaymentMethods() {
            return this.customerPaymentMethods;
        }

        public final boolean getHasPaymentOptions() {
            return this.isGooglePayReady || this.linkState != null || (this.customerPaymentMethods.isEmpty() ^ true);
        }

        public final PaymentSelection getInitialPaymentSelection() {
            Object obj;
            SavedSelection savedSelection = this.savedSelection;
            if (savedSelection instanceof SavedSelection.GooglePay) {
                return PaymentSelection.GooglePay.INSTANCE;
            }
            if (savedSelection instanceof SavedSelection.Link) {
                return PaymentSelection.Link.INSTANCE;
            }
            if (savedSelection instanceof SavedSelection.PaymentMethod) {
                Iterator<T> it = this.customerPaymentMethods.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.areEqual(((PaymentMethod) obj).f75358id, ((SavedSelection.PaymentMethod) this.savedSelection).getId())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                PaymentMethod paymentMethod = (PaymentMethod) obj;
                if (paymentMethod != null) {
                    return new PaymentSelection.Saved(paymentMethod, false, 2, null);
                }
            }
            return null;
        }

        public final LinkState getLinkState() {
            return this.linkState;
        }

        public final PaymentSelection.New getNewPaymentSelection() {
            return this.newPaymentSelection;
        }

        public final SavedSelection getSavedSelection() {
            return this.savedSelection;
        }

        public final StripeIntent getStripeIntent() {
            return this.stripeIntent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            PaymentSheet.Configuration configuration = this.config;
            int hashCode = (((((((configuration == null ? 0 : configuration.hashCode()) * 31) + this.stripeIntent.hashCode()) * 31) + this.customerPaymentMethods.hashCode()) * 31) + this.savedSelection.hashCode()) * 31;
            boolean z = this.isGooglePayReady;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode + i) * 31;
            LinkState linkState = this.linkState;
            int hashCode2 = (i2 + (linkState == null ? 0 : linkState.hashCode())) * 31;
            PaymentSelection.New r2 = this.newPaymentSelection;
            return hashCode2 + (r2 != null ? r2.hashCode() : 0);
        }

        public final boolean isGooglePayReady() {
            return this.isGooglePayReady;
        }

        public String toString() {
            PaymentSheet.Configuration configuration = this.config;
            StripeIntent stripeIntent = this.stripeIntent;
            List<PaymentMethod> list = this.customerPaymentMethods;
            SavedSelection savedSelection = this.savedSelection;
            boolean z = this.isGooglePayReady;
            LinkState linkState = this.linkState;
            PaymentSelection.New r6 = this.newPaymentSelection;
            return "Full(config=" + configuration + ", stripeIntent=" + stripeIntent + ", customerPaymentMethods=" + list + ", savedSelection=" + savedSelection + ", isGooglePayReady=" + z + ", linkState=" + linkState + ", newPaymentSelection=" + r6 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            PaymentSheet.Configuration configuration = this.config;
            if (configuration == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                configuration.writeToParcel(out, i);
            }
            out.writeParcelable(this.stripeIntent, i);
            List<PaymentMethod> list = this.customerPaymentMethods;
            out.writeInt(list.size());
            for (PaymentMethod paymentMethod : list) {
                out.writeParcelable(paymentMethod, i);
            }
            out.writeParcelable(this.savedSelection, i);
            out.writeInt(this.isGooglePayReady ? 1 : 0);
            LinkState linkState = this.linkState;
            if (linkState == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                linkState.writeToParcel(out, i);
            }
            out.writeParcelable(this.newPaymentSelection, i);
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/state/PaymentSheetState$Loading;", "Lcom/stripe/android/paymentsheet/state/PaymentSheetState;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Loading implements PaymentSheetState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();
        public static final Parcelable.Creator<Loading> CREATOR = new Creator();

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Loading> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Loading createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Loading.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Loading[] newArray(int i) {
                return new Loading[i];
            }
        }

        private Loading() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(1);
        }
    }
}
