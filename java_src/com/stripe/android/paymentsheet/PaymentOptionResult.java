package com.stripe.android.paymentsheet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u000f2\u00020\u0001:\u0004\u000e\u000f\u0010\u0011B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rR\u001a\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0003\u0012\u0013\u0014¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionResult;", "Landroid/os/Parcelable;", "resultCode", "", "(I)V", "paymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethods", "()Ljava/util/List;", "getResultCode", "()I", "toBundle", "Landroid/os/Bundle;", "Canceled", "Companion", "Failed", "Succeeded", "Lcom/stripe/android/paymentsheet/PaymentOptionResult$Canceled;", "Lcom/stripe/android/paymentsheet/PaymentOptionResult$Failed;", "Lcom/stripe/android/paymentsheet/PaymentOptionResult$Succeeded;", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class PaymentOptionResult implements Parcelable {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_RESULT = "extra_activity_result";
    private final int resultCode;

    @Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionResult$Canceled;", "Lcom/stripe/android/paymentsheet/PaymentOptionResult;", "mostRecentError", "", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "(Ljava/lang/Throwable;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/util/List;)V", "getMostRecentError", "()Ljava/lang/Throwable;", "getPaymentMethods", "()Ljava/util/List;", "getPaymentSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Canceled extends PaymentOptionResult {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Canceled> CREATOR = new Creator();
        private final Throwable mostRecentError;
        private final List<PaymentMethod> paymentMethods;
        private final PaymentSelection paymentSelection;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Canceled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Throwable th = (Throwable) parcel.readSerializable();
                PaymentSelection paymentSelection = (PaymentSelection) parcel.readParcelable(Canceled.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    for (int i = 0; i != readInt; i++) {
                        arrayList2.add(parcel.readParcelable(Canceled.class.getClassLoader()));
                    }
                    arrayList = arrayList2;
                }
                return new Canceled(th, paymentSelection, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled[] newArray(int i) {
                return new Canceled[i];
            }
        }

        public /* synthetic */ Canceled(Throwable th, PaymentSelection paymentSelection, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(th, paymentSelection, (i & 4) != 0 ? null : list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Canceled copy$default(Canceled canceled, Throwable th, PaymentSelection paymentSelection, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                th = canceled.mostRecentError;
            }
            if ((i & 2) != 0) {
                paymentSelection = canceled.paymentSelection;
            }
            if ((i & 4) != 0) {
                list = canceled.getPaymentMethods();
            }
            return canceled.copy(th, paymentSelection, list);
        }

        public final Throwable component1() {
            return this.mostRecentError;
        }

        public final PaymentSelection component2() {
            return this.paymentSelection;
        }

        public final List<PaymentMethod> component3() {
            return getPaymentMethods();
        }

        public final Canceled copy(Throwable th, PaymentSelection paymentSelection, List<PaymentMethod> list) {
            return new Canceled(th, paymentSelection, list);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Canceled) {
                Canceled canceled = (Canceled) obj;
                return Intrinsics.areEqual(this.mostRecentError, canceled.mostRecentError) && Intrinsics.areEqual(this.paymentSelection, canceled.paymentSelection) && Intrinsics.areEqual(getPaymentMethods(), canceled.getPaymentMethods());
            }
            return false;
        }

        public final Throwable getMostRecentError() {
            return this.mostRecentError;
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionResult
        public List<PaymentMethod> getPaymentMethods() {
            return this.paymentMethods;
        }

        public final PaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        public int hashCode() {
            Throwable th = this.mostRecentError;
            int hashCode = (th == null ? 0 : th.hashCode()) * 31;
            PaymentSelection paymentSelection = this.paymentSelection;
            return ((hashCode + (paymentSelection == null ? 0 : paymentSelection.hashCode())) * 31) + (getPaymentMethods() != null ? getPaymentMethods().hashCode() : 0);
        }

        public String toString() {
            Throwable th = this.mostRecentError;
            PaymentSelection paymentSelection = this.paymentSelection;
            List<PaymentMethod> paymentMethods = getPaymentMethods();
            return "Canceled(mostRecentError=" + th + ", paymentSelection=" + paymentSelection + ", paymentMethods=" + paymentMethods + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeSerializable(this.mostRecentError);
            out.writeParcelable(this.paymentSelection, i);
            List<PaymentMethod> list = this.paymentMethods;
            if (list == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(list.size());
            for (PaymentMethod paymentMethod : list) {
                out.writeParcelable(paymentMethod, i);
            }
        }

        public Canceled(Throwable th, PaymentSelection paymentSelection, List<PaymentMethod> list) {
            super(0, null);
            this.mostRecentError = th;
            this.paymentSelection = paymentSelection;
            this.paymentMethods = list;
        }
    }

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\b\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionResult$Companion;", "", "()V", "EXTRA_RESULT", "", "fromIntent", "Lcom/stripe/android/paymentsheet/PaymentOptionResult;", "intent", "Landroid/content/Intent;", "fromIntent$paymentsheet_release", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PaymentOptionResult fromIntent$paymentsheet_release(Intent intent) {
            if (intent != null) {
                return (PaymentOptionResult) intent.getParcelableExtra("extra_activity_result");
            }
            return null;
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionResult$Failed;", "Lcom/stripe/android/paymentsheet/PaymentOptionResult;", "error", "", "paymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "(Ljava/lang/Throwable;Ljava/util/List;)V", "getError", "()Ljava/lang/Throwable;", "getPaymentMethods", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Failed extends PaymentOptionResult {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Failed> CREATOR = new Creator();
        private final Throwable error;
        private final List<PaymentMethod> paymentMethods;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Failed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Throwable th = (Throwable) parcel.readSerializable();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    for (int i = 0; i != readInt; i++) {
                        arrayList2.add(parcel.readParcelable(Failed.class.getClassLoader()));
                    }
                    arrayList = arrayList2;
                }
                return new Failed(th, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed[] newArray(int i) {
                return new Failed[i];
            }
        }

        public /* synthetic */ Failed(Throwable th, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(th, (i & 2) != 0 ? null : list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Failed copy$default(Failed failed, Throwable th, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failed.error;
            }
            if ((i & 2) != 0) {
                list = failed.getPaymentMethods();
            }
            return failed.copy(th, list);
        }

        public final Throwable component1() {
            return this.error;
        }

        public final List<PaymentMethod> component2() {
            return getPaymentMethods();
        }

        public final Failed copy(Throwable error, List<PaymentMethod> list) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Failed(error, list);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Failed) {
                Failed failed = (Failed) obj;
                return Intrinsics.areEqual(this.error, failed.error) && Intrinsics.areEqual(getPaymentMethods(), failed.getPaymentMethods());
            }
            return false;
        }

        public final Throwable getError() {
            return this.error;
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionResult
        public List<PaymentMethod> getPaymentMethods() {
            return this.paymentMethods;
        }

        public int hashCode() {
            return (this.error.hashCode() * 31) + (getPaymentMethods() == null ? 0 : getPaymentMethods().hashCode());
        }

        public String toString() {
            Throwable th = this.error;
            List<PaymentMethod> paymentMethods = getPaymentMethods();
            return "Failed(error=" + th + ", paymentMethods=" + paymentMethods + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeSerializable(this.error);
            List<PaymentMethod> list = this.paymentMethods;
            if (list == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(list.size());
            for (PaymentMethod paymentMethod : list) {
                out.writeParcelable(paymentMethod, i);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(Throwable error, List<PaymentMethod> list) {
            super(0, null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
            this.paymentMethods = list;
        }
    }

    @Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m28432d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionResult$Succeeded;", "Lcom/stripe/android/paymentsheet/PaymentOptionResult;", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentMethods", "", "Lcom/stripe/android/model/PaymentMethod;", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;Ljava/util/List;)V", "getPaymentMethods", "()Ljava/util/List;", "getPaymentSelection", "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "paymentsheet_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Succeeded extends PaymentOptionResult {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Succeeded> CREATOR = new Creator();
        private final List<PaymentMethod> paymentMethods;
        private final PaymentSelection paymentSelection;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Succeeded> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Succeeded createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                PaymentSelection paymentSelection = (PaymentSelection) parcel.readParcelable(Succeeded.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    for (int i = 0; i != readInt; i++) {
                        arrayList2.add(parcel.readParcelable(Succeeded.class.getClassLoader()));
                    }
                    arrayList = arrayList2;
                }
                return new Succeeded(paymentSelection, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Succeeded[] newArray(int i) {
                return new Succeeded[i];
            }
        }

        public /* synthetic */ Succeeded(PaymentSelection paymentSelection, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(paymentSelection, (i & 2) != 0 ? null : list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Succeeded copy$default(Succeeded succeeded, PaymentSelection paymentSelection, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentSelection = succeeded.paymentSelection;
            }
            if ((i & 2) != 0) {
                list = succeeded.getPaymentMethods();
            }
            return succeeded.copy(paymentSelection, list);
        }

        public final PaymentSelection component1() {
            return this.paymentSelection;
        }

        public final List<PaymentMethod> component2() {
            return getPaymentMethods();
        }

        public final Succeeded copy(PaymentSelection paymentSelection, List<PaymentMethod> list) {
            Intrinsics.checkNotNullParameter(paymentSelection, "paymentSelection");
            return new Succeeded(paymentSelection, list);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Succeeded) {
                Succeeded succeeded = (Succeeded) obj;
                return Intrinsics.areEqual(this.paymentSelection, succeeded.paymentSelection) && Intrinsics.areEqual(getPaymentMethods(), succeeded.getPaymentMethods());
            }
            return false;
        }

        @Override // com.stripe.android.paymentsheet.PaymentOptionResult
        public List<PaymentMethod> getPaymentMethods() {
            return this.paymentMethods;
        }

        public final PaymentSelection getPaymentSelection() {
            return this.paymentSelection;
        }

        public int hashCode() {
            return (this.paymentSelection.hashCode() * 31) + (getPaymentMethods() == null ? 0 : getPaymentMethods().hashCode());
        }

        public String toString() {
            PaymentSelection paymentSelection = this.paymentSelection;
            List<PaymentMethod> paymentMethods = getPaymentMethods();
            return "Succeeded(paymentSelection=" + paymentSelection + ", paymentMethods=" + paymentMethods + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeParcelable(this.paymentSelection, i);
            List<PaymentMethod> list = this.paymentMethods;
            if (list == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(list.size());
            for (PaymentMethod paymentMethod : list) {
                out.writeParcelable(paymentMethod, i);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Succeeded(PaymentSelection paymentSelection, List<PaymentMethod> list) {
            super(-1, null);
            Intrinsics.checkNotNullParameter(paymentSelection, "paymentSelection");
            this.paymentSelection = paymentSelection;
            this.paymentMethods = list;
        }
    }

    public /* synthetic */ PaymentOptionResult(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public abstract List<PaymentMethod> getPaymentMethods();

    public final int getResultCode() {
        return this.resultCode;
    }

    public final Bundle toBundle() {
        return C39564d70.m44603a(TuplesKt.m28425to("extra_activity_result", this));
    }

    private PaymentOptionResult(int i) {
        this.resultCode = i;
    }
}
