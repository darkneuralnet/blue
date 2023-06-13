package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\b\t¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "Landroid/os/Parcelable;", "()V", "Failure", "ProtocolError", "RuntimeError", "Success", "Timeout", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Failure;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Success;", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class ChallengeRequestResult implements Parcelable {

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0003\u0004\u0005¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Failure;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "()V", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$ProtocolError;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$RuntimeError;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Timeout;", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class Failure extends ChallengeRequestResult {
        public /* synthetic */ Failure(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Failure() {
            super(null);
        }
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$ProtocolError;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Failure;", MessageExtension.FIELD_DATA, "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;)V", "getData", "()Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ProtocolError extends Failure {
        public static final Parcelable.Creator<ProtocolError> CREATOR = new Creator();
        private final ErrorData data;

        @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<ProtocolError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ProtocolError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProtocolError(ErrorData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ProtocolError[] newArray(int i) {
                return new ProtocolError[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProtocolError(ErrorData data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public static /* synthetic */ ProtocolError copy$default(ProtocolError protocolError, ErrorData errorData, int i, Object obj) {
            if ((i & 1) != 0) {
                errorData = protocolError.data;
            }
            return protocolError.copy(errorData);
        }

        public final ErrorData component1() {
            return this.data;
        }

        public final ProtocolError copy(ErrorData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new ProtocolError(data);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProtocolError) && Intrinsics.areEqual(this.data, ((ProtocolError) obj).data);
        }

        public final ErrorData getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "ProtocolError(data=" + this.data + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.data.writeToParcel(out, i);
        }
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$RuntimeError;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Failure;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class RuntimeError extends Failure {
        public static final Parcelable.Creator<RuntimeError> CREATOR = new Creator();
        private final Throwable throwable;

        @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<RuntimeError> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RuntimeError createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RuntimeError((Throwable) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RuntimeError[] newArray(int i) {
                return new RuntimeError[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RuntimeError(Throwable throwable) {
            super(null);
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public static /* synthetic */ RuntimeError copy$default(RuntimeError runtimeError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = runtimeError.throwable;
            }
            return runtimeError.copy(th);
        }

        public final Throwable component1() {
            return this.throwable;
        }

        public final RuntimeError copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new RuntimeError(throwable);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RuntimeError) && Intrinsics.areEqual(this.throwable, ((RuntimeError) obj).throwable);
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "RuntimeError(throwable=" + this.throwable + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeSerializable(this.throwable);
        }
    }

    @Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000e\u0010\u0011\u001a\u00020\u0007HÀ\u0003¢\u0006\u0002\b\u0012J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\""}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Success;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "cresData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "creqExecutorConfig", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;)V", "getCreqData", "()Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "getCreqExecutorConfig$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "getCresData", "()Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "component1", "component2", "component3", "component3$3ds2sdk_release", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Success extends ChallengeRequestResult {
        public static final Parcelable.Creator<Success> CREATOR = new Creator();
        private final ChallengeRequestData creqData;
        private final ChallengeRequestExecutor.Config creqExecutorConfig;
        private final ChallengeResponseData cresData;

        @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Success> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Success(ChallengeRequestData.CREATOR.createFromParcel(parcel), ChallengeResponseData.CREATOR.createFromParcel(parcel), ChallengeRequestExecutor.Config.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i) {
                return new Success[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(ChallengeRequestData creqData, ChallengeResponseData cresData, ChallengeRequestExecutor.Config creqExecutorConfig) {
            super(null);
            Intrinsics.checkNotNullParameter(creqData, "creqData");
            Intrinsics.checkNotNullParameter(cresData, "cresData");
            Intrinsics.checkNotNullParameter(creqExecutorConfig, "creqExecutorConfig");
            this.creqData = creqData;
            this.cresData = cresData;
            this.creqExecutorConfig = creqExecutorConfig;
        }

        public static /* synthetic */ Success copy$default(Success success, ChallengeRequestData challengeRequestData, ChallengeResponseData challengeResponseData, ChallengeRequestExecutor.Config config, int i, Object obj) {
            if ((i & 1) != 0) {
                challengeRequestData = success.creqData;
            }
            if ((i & 2) != 0) {
                challengeResponseData = success.cresData;
            }
            if ((i & 4) != 0) {
                config = success.creqExecutorConfig;
            }
            return success.copy(challengeRequestData, challengeResponseData, config);
        }

        public final ChallengeRequestData component1() {
            return this.creqData;
        }

        public final ChallengeResponseData component2() {
            return this.cresData;
        }

        public final ChallengeRequestExecutor.Config component3$3ds2sdk_release() {
            return this.creqExecutorConfig;
        }

        public final Success copy(ChallengeRequestData creqData, ChallengeResponseData cresData, ChallengeRequestExecutor.Config creqExecutorConfig) {
            Intrinsics.checkNotNullParameter(creqData, "creqData");
            Intrinsics.checkNotNullParameter(cresData, "cresData");
            Intrinsics.checkNotNullParameter(creqExecutorConfig, "creqExecutorConfig");
            return new Success(creqData, cresData, creqExecutorConfig);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Success) {
                Success success = (Success) obj;
                return Intrinsics.areEqual(this.creqData, success.creqData) && Intrinsics.areEqual(this.cresData, success.cresData) && Intrinsics.areEqual(this.creqExecutorConfig, success.creqExecutorConfig);
            }
            return false;
        }

        public final ChallengeRequestData getCreqData() {
            return this.creqData;
        }

        public final ChallengeRequestExecutor.Config getCreqExecutorConfig$3ds2sdk_release() {
            return this.creqExecutorConfig;
        }

        public final ChallengeResponseData getCresData() {
            return this.cresData;
        }

        public int hashCode() {
            return (((this.creqData.hashCode() * 31) + this.cresData.hashCode()) * 31) + this.creqExecutorConfig.hashCode();
        }

        public String toString() {
            return "Success(creqData=" + this.creqData + ", cresData=" + this.cresData + ", creqExecutorConfig=" + this.creqExecutorConfig + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.creqData.writeToParcel(out, i);
            this.cresData.writeToParcel(out, i);
            this.creqExecutorConfig.writeToParcel(out, i);
        }
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Timeout;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult$Failure;", MessageExtension.FIELD_DATA, "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "(Lcom/stripe/android/stripe3ds2/transactions/ErrorData;)V", "getData", "()Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Timeout extends Failure {
        public static final Parcelable.Creator<Timeout> CREATOR = new Creator();
        private final ErrorData data;

        @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Timeout> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Timeout createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Timeout(ErrorData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Timeout[] newArray(int i) {
                return new Timeout[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Timeout(ErrorData data) {
            super(null);
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public static /* synthetic */ Timeout copy$default(Timeout timeout, ErrorData errorData, int i, Object obj) {
            if ((i & 1) != 0) {
                errorData = timeout.data;
            }
            return timeout.copy(errorData);
        }

        public final ErrorData component1() {
            return this.data;
        }

        public final Timeout copy(ErrorData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new Timeout(data);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Timeout) && Intrinsics.areEqual(this.data, ((Timeout) obj).data);
        }

        public final ErrorData getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Timeout(data=" + this.data + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.data.writeToParcel(out, i);
        }
    }

    public /* synthetic */ ChallengeRequestResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ChallengeRequestResult() {
    }
}
