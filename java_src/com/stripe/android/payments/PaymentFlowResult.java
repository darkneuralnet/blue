package com.stripe.android.payments;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.model.Source;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.RE3;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/payments/PaymentFlowResult;", "", "()V", "Unvalidated", "Validated", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class PaymentFlowResult {
    public static final int $stable = 0;

    @Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 72\u00020\u0001:\u00017BU\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000e\u0010\u001e\u001a\u00020\tHÀ\u0003¢\u0006\u0002\b\u001fJ\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b!J\u0010\u0010\"\u001a\u0004\u0018\u00010\fHÀ\u0003¢\u0006\u0002\b#J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b%JY\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\u0013\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u0005HÖ\u0001J\u0006\u0010,\u001a\u00020-J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\r\u0010/\u001a\u000200H\u0000¢\u0006\u0002\b1J\u0019\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u00068"}, m28432d2 = {"Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "Landroid/os/Parcelable;", "clientSecret", "", "flowOutcome", "", "exception", "Lcom/stripe/android/core/exception/StripeException;", "canCancelSource", "", "sourceId", Stripe3ds2AuthParams.FIELD_SOURCE, "Lcom/stripe/android/model/Source;", NamedConstantsKt.STRIPE_ACCOUNT_ID, "(Ljava/lang/String;ILcom/stripe/android/core/exception/StripeException;ZLjava/lang/String;Lcom/stripe/android/model/Source;Ljava/lang/String;)V", "getCanCancelSource$payments_core_release", "()Z", "getClientSecret", "()Ljava/lang/String;", "getException", "()Lcom/stripe/android/core/exception/StripeException;", "getFlowOutcome", "()I", "getSource$payments_core_release", "()Lcom/stripe/android/model/Source;", "getSourceId$payments_core_release", "getStripeAccountId$payments_core_release", "component1", "component2", "component3", "component4", "component4$payments_core_release", "component5", "component5$payments_core_release", "component6", "component6$payments_core_release", "component7", "component7$payments_core_release", "copy", "describeContents", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toBundle", "Landroid/os/Bundle;", "toString", "validate", "Lcom/stripe/android/payments/PaymentFlowResult$Validated;", "validate$payments_core_release", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Unvalidated implements Parcelable {
        private static final String CLIENT_SECRET_INTENT_ERROR = "Invalid client_secret value in result Intent.";
        private static final String EXTRA = "extra_args";
        private final boolean canCancelSource;
        private final String clientSecret;
        private final StripeException exception;
        private final int flowOutcome;
        private final Source source;
        private final String sourceId;
        private final String stripeAccountId;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        public static final Parcelable.Creator<Unvalidated> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated$Companion;", "LRE3;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "Landroid/os/Parcel;", "parcel", "create", "", "flags", "", "write", "Landroid/content/Intent;", "intent", "fromIntent", "", "CLIENT_SECRET_INTENT_ERROR", "Ljava/lang/String;", "EXTRA", "<init>", "()V", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nPaymentFlowResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentFlowResult.kt\ncom/stripe/android/payments/PaymentFlowResult$Unvalidated$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n1#2:109\n*E\n"})
        /* loaded from: classes7.dex */
        public static final class Companion implements RE3<Unvalidated> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Unvalidated fromIntent(Intent intent) {
                Unvalidated unvalidated;
                if (intent != null) {
                    unvalidated = (Unvalidated) intent.getParcelableExtra(Unvalidated.EXTRA);
                } else {
                    unvalidated = null;
                }
                if (unvalidated == null) {
                    return new Unvalidated(null, 0, null, false, null, null, null, 127, null);
                }
                return unvalidated;
            }

            /* renamed from: newArray */
            public Unvalidated[] m116579newArray(int i) {
                return (Unvalidated[]) RE3.C7102a.m87008a(this, i);
            }

            private Companion() {
            }

            /* renamed from: create */
            public Unvalidated m116578create(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                Serializable readSerializable = parcel.readSerializable();
                return new Unvalidated(readString, readInt, readSerializable instanceof StripeException ? (StripeException) readSerializable : null, parcel.readInt() == 1, parcel.readString(), (Source) parcel.readParcelable(Source.class.getClassLoader()), parcel.readString());
            }

            public void write(Unvalidated unvalidated, Parcel parcel, int i) {
                Intrinsics.checkNotNullParameter(unvalidated, "<this>");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.writeString(unvalidated.getClientSecret());
                parcel.writeInt(unvalidated.getFlowOutcome());
                parcel.writeSerializable(unvalidated.getException());
                r0.intValue();
                r0 = unvalidated.getCanCancelSource$payments_core_release() ? 1 : null;
                parcel.writeInt(r0 != null ? r0.intValue() : 0);
                parcel.writeString(unvalidated.getSourceId$payments_core_release());
                parcel.writeParcelable(unvalidated.getSource$payments_core_release(), i);
                parcel.writeString(unvalidated.getStripeAccountId$payments_core_release());
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Unvalidated> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unvalidated createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return Unvalidated.Companion.m116578create(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Unvalidated[] newArray(int i) {
                return new Unvalidated[i];
            }
        }

        public Unvalidated() {
            this(null, 0, null, false, null, null, null, 127, null);
        }

        public static /* synthetic */ Unvalidated copy$default(Unvalidated unvalidated, String str, int i, StripeException stripeException, boolean z, String str2, Source source, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = unvalidated.clientSecret;
            }
            if ((i2 & 2) != 0) {
                i = unvalidated.flowOutcome;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                stripeException = unvalidated.exception;
            }
            StripeException stripeException2 = stripeException;
            if ((i2 & 8) != 0) {
                z = unvalidated.canCancelSource;
            }
            boolean z2 = z;
            if ((i2 & 16) != 0) {
                str2 = unvalidated.sourceId;
            }
            String str4 = str2;
            if ((i2 & 32) != 0) {
                source = unvalidated.source;
            }
            Source source2 = source;
            if ((i2 & 64) != 0) {
                str3 = unvalidated.stripeAccountId;
            }
            return unvalidated.copy(str, i3, stripeException2, z2, str4, source2, str3);
        }

        public final String component1() {
            return this.clientSecret;
        }

        public final int component2() {
            return this.flowOutcome;
        }

        public final StripeException component3() {
            return this.exception;
        }

        public final boolean component4$payments_core_release() {
            return this.canCancelSource;
        }

        public final String component5$payments_core_release() {
            return this.sourceId;
        }

        public final Source component6$payments_core_release() {
            return this.source;
        }

        public final String component7$payments_core_release() {
            return this.stripeAccountId;
        }

        public final Unvalidated copy(String str, int i, StripeException stripeException, boolean z, String str2, Source source, String str3) {
            return new Unvalidated(str, i, stripeException, z, str2, source, str3);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Unvalidated) {
                Unvalidated unvalidated = (Unvalidated) obj;
                return Intrinsics.areEqual(this.clientSecret, unvalidated.clientSecret) && this.flowOutcome == unvalidated.flowOutcome && Intrinsics.areEqual(this.exception, unvalidated.exception) && this.canCancelSource == unvalidated.canCancelSource && Intrinsics.areEqual(this.sourceId, unvalidated.sourceId) && Intrinsics.areEqual(this.source, unvalidated.source) && Intrinsics.areEqual(this.stripeAccountId, unvalidated.stripeAccountId);
            }
            return false;
        }

        public final boolean getCanCancelSource$payments_core_release() {
            return this.canCancelSource;
        }

        public final String getClientSecret() {
            return this.clientSecret;
        }

        public final StripeException getException() {
            return this.exception;
        }

        public final int getFlowOutcome() {
            return this.flowOutcome;
        }

        public final Source getSource$payments_core_release() {
            return this.source;
        }

        public final String getSourceId$payments_core_release() {
            return this.sourceId;
        }

        public final String getStripeAccountId$payments_core_release() {
            return this.stripeAccountId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            String str = this.clientSecret;
            int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.flowOutcome)) * 31;
            StripeException stripeException = this.exception;
            int hashCode2 = (hashCode + (stripeException == null ? 0 : stripeException.hashCode())) * 31;
            boolean z = this.canCancelSource;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode2 + i) * 31;
            String str2 = this.sourceId;
            int hashCode3 = (i2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Source source = this.source;
            int hashCode4 = (hashCode3 + (source == null ? 0 : source.hashCode())) * 31;
            String str3 = this.stripeAccountId;
            return hashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        public final /* synthetic */ Bundle toBundle() {
            return C39564d70.m44603a(TuplesKt.m28425to(EXTRA, this));
        }

        public String toString() {
            String str = this.clientSecret;
            int i = this.flowOutcome;
            StripeException stripeException = this.exception;
            boolean z = this.canCancelSource;
            String str2 = this.sourceId;
            Source source = this.source;
            String str3 = this.stripeAccountId;
            return "Unvalidated(clientSecret=" + str + ", flowOutcome=" + i + ", exception=" + stripeException + ", canCancelSource=" + z + ", sourceId=" + str2 + ", source=" + source + ", stripeAccountId=" + str3 + ")";
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Validated validate$payments_core_release() {
            boolean z;
            boolean isBlank;
            StripeException stripeException = this.exception;
            if (!(stripeException instanceof Throwable)) {
                String str = this.clientSecret;
                if (str != null) {
                    isBlank = StringsKt__StringsJVMKt.isBlank(str);
                    if (!isBlank) {
                        z = false;
                        if (!(!z)) {
                            return new Validated(this.clientSecret, this.flowOutcome, this.canCancelSource, this.sourceId, this.source, this.stripeAccountId);
                        }
                        throw new IllegalArgumentException(CLIENT_SECRET_INTENT_ERROR.toString());
                    }
                }
                z = true;
                if (!(!z)) {
                }
            } else {
                throw stripeException;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            Companion.write(this, out, i);
        }

        public Unvalidated(String str, int i, StripeException stripeException, boolean z, String str2, Source source, String str3) {
            this.clientSecret = str;
            this.flowOutcome = i;
            this.exception = stripeException;
            this.canCancelSource = z;
            this.sourceId = str2;
            this.source = source;
            this.stripeAccountId = str3;
        }

        public /* synthetic */ Unvalidated(String str, int i, StripeException stripeException, boolean z, String str2, Source source, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : stripeException, (i2 & 8) == 0 ? z : false, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : source, (i2 & 64) != 0 ? null : str3);
        }
    }

    public /* synthetic */ PaymentFlowResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PaymentFlowResult() {
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0080\b\u0018\u00002\u00020\u0001BE\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\u0018\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u0019J\u000e\u0010\u001a\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b\u001bJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u001dJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\nHÀ\u0003¢\u0006\u0002\b\u001fJ\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b!JK\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006'"}, m28432d2 = {"Lcom/stripe/android/payments/PaymentFlowResult$Validated;", "", "clientSecret", "", "flowOutcome", "", "canCancelSource", "", "sourceId", Stripe3ds2AuthParams.FIELD_SOURCE, "Lcom/stripe/android/model/Source;", NamedConstantsKt.STRIPE_ACCOUNT_ID, "(Ljava/lang/String;IZLjava/lang/String;Lcom/stripe/android/model/Source;Ljava/lang/String;)V", "getCanCancelSource$payments_core_release", "()Z", "getClientSecret", "()Ljava/lang/String;", "getFlowOutcome$payments_core_release", "()I", "getSource$payments_core_release", "()Lcom/stripe/android/model/Source;", "getSourceId$payments_core_release", "getStripeAccountId$payments_core_release", "component1", "component2", "component2$payments_core_release", "component3", "component3$payments_core_release", "component4", "component4$payments_core_release", "component5", "component5$payments_core_release", "component6", "component6$payments_core_release", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "toString", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Validated {
        private final boolean canCancelSource;
        private final String clientSecret;
        private final int flowOutcome;
        private final Source source;
        private final String sourceId;
        private final String stripeAccountId;

        public Validated(String clientSecret, int i, boolean z, String str, Source source, String str2) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            this.flowOutcome = i;
            this.canCancelSource = z;
            this.sourceId = str;
            this.source = source;
            this.stripeAccountId = str2;
        }

        public static /* synthetic */ Validated copy$default(Validated validated, String str, int i, boolean z, String str2, Source source, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = validated.clientSecret;
            }
            if ((i2 & 2) != 0) {
                i = validated.flowOutcome;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                z = validated.canCancelSource;
            }
            boolean z2 = z;
            if ((i2 & 8) != 0) {
                str2 = validated.sourceId;
            }
            String str4 = str2;
            if ((i2 & 16) != 0) {
                source = validated.source;
            }
            Source source2 = source;
            if ((i2 & 32) != 0) {
                str3 = validated.stripeAccountId;
            }
            return validated.copy(str, i3, z2, str4, source2, str3);
        }

        public final String component1() {
            return this.clientSecret;
        }

        public final int component2$payments_core_release() {
            return this.flowOutcome;
        }

        public final boolean component3$payments_core_release() {
            return this.canCancelSource;
        }

        public final String component4$payments_core_release() {
            return this.sourceId;
        }

        public final Source component5$payments_core_release() {
            return this.source;
        }

        public final String component6$payments_core_release() {
            return this.stripeAccountId;
        }

        public final Validated copy(String clientSecret, int i, boolean z, String str, Source source, String str2) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return new Validated(clientSecret, i, z, str, source, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Validated) {
                Validated validated = (Validated) obj;
                return Intrinsics.areEqual(this.clientSecret, validated.clientSecret) && this.flowOutcome == validated.flowOutcome && this.canCancelSource == validated.canCancelSource && Intrinsics.areEqual(this.sourceId, validated.sourceId) && Intrinsics.areEqual(this.source, validated.source) && Intrinsics.areEqual(this.stripeAccountId, validated.stripeAccountId);
            }
            return false;
        }

        public final boolean getCanCancelSource$payments_core_release() {
            return this.canCancelSource;
        }

        public final String getClientSecret() {
            return this.clientSecret;
        }

        public final int getFlowOutcome$payments_core_release() {
            return this.flowOutcome;
        }

        public final Source getSource$payments_core_release() {
            return this.source;
        }

        public final String getSourceId$payments_core_release() {
            return this.sourceId;
        }

        public final String getStripeAccountId$payments_core_release() {
            return this.stripeAccountId;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.clientSecret.hashCode() * 31) + Integer.hashCode(this.flowOutcome)) * 31;
            boolean z = this.canCancelSource;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode + i) * 31;
            String str = this.sourceId;
            int hashCode2 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
            Source source = this.source;
            int hashCode3 = (hashCode2 + (source == null ? 0 : source.hashCode())) * 31;
            String str2 = this.stripeAccountId;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.clientSecret;
            int i = this.flowOutcome;
            boolean z = this.canCancelSource;
            String str2 = this.sourceId;
            Source source = this.source;
            String str3 = this.stripeAccountId;
            return "Validated(clientSecret=" + str + ", flowOutcome=" + i + ", canCancelSource=" + z + ", sourceId=" + str2 + ", source=" + source + ", stripeAccountId=" + str3 + ")";
        }

        public /* synthetic */ Validated(String str, int i, boolean z, String str2, Source source, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : source, (i2 & 32) != 0 ? null : str3);
        }
    }
}
