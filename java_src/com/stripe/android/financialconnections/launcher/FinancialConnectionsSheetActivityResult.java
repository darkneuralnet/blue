package com.stripe.android.financialconnections.launcher;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.Token;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00062\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", "Landroid/os/Parcelable;", "()V", "toBundle", "Landroid/os/Bundle;", "Canceled", "Companion", "Completed", "Failed", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Canceled;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Completed;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class FinancialConnectionsSheetActivityResult implements Parcelable {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_RESULT = "com.stripe.android.financialconnections.ConnectionsSheetContract.extra_result";

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Canceled;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", "()V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Canceled extends FinancialConnectionsSheetActivityResult {
        public static final int $stable = 0;
        public static final Canceled INSTANCE = new Canceled();
        public static final Parcelable.Creator<Canceled> CREATOR = new Creator();

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Canceled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Canceled.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Canceled[] newArray(int i) {
                return new Canceled[i];
            }
        }

        private Canceled() {
            super(null);
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

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Companion;", "", "()V", "EXTRA_RESULT", "", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Completed;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", "linkedAccountId", "", "financialConnectionsSession", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "token", "Lcom/stripe/android/model/Token;", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;Lcom/stripe/android/model/Token;)V", "getFinancialConnectionsSession", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "getLinkedAccountId", "()Ljava/lang/String;", "getToken", "()Lcom/stripe/android/model/Token;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Completed extends FinancialConnectionsSheetActivityResult {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Completed> CREATOR = new Creator();
        private final FinancialConnectionsSession financialConnectionsSession;
        private final String linkedAccountId;
        private final Token token;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Completed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Completed createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Completed(parcel.readString(), parcel.readInt() == 0 ? null : FinancialConnectionsSession.CREATOR.createFromParcel(parcel), (Token) parcel.readParcelable(Completed.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Completed[] newArray(int i) {
                return new Completed[i];
            }
        }

        public Completed() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ Completed copy$default(Completed completed, String str, FinancialConnectionsSession financialConnectionsSession, Token token, int i, Object obj) {
            if ((i & 1) != 0) {
                str = completed.linkedAccountId;
            }
            if ((i & 2) != 0) {
                financialConnectionsSession = completed.financialConnectionsSession;
            }
            if ((i & 4) != 0) {
                token = completed.token;
            }
            return completed.copy(str, financialConnectionsSession, token);
        }

        public final String component1() {
            return this.linkedAccountId;
        }

        public final FinancialConnectionsSession component2() {
            return this.financialConnectionsSession;
        }

        public final Token component3() {
            return this.token;
        }

        public final Completed copy(String str, FinancialConnectionsSession financialConnectionsSession, Token token) {
            return new Completed(str, financialConnectionsSession, token);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Completed) {
                Completed completed = (Completed) obj;
                return Intrinsics.areEqual(this.linkedAccountId, completed.linkedAccountId) && Intrinsics.areEqual(this.financialConnectionsSession, completed.financialConnectionsSession) && Intrinsics.areEqual(this.token, completed.token);
            }
            return false;
        }

        public final FinancialConnectionsSession getFinancialConnectionsSession() {
            return this.financialConnectionsSession;
        }

        public final String getLinkedAccountId() {
            return this.linkedAccountId;
        }

        public final Token getToken() {
            return this.token;
        }

        public int hashCode() {
            String str = this.linkedAccountId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            FinancialConnectionsSession financialConnectionsSession = this.financialConnectionsSession;
            int hashCode2 = (hashCode + (financialConnectionsSession == null ? 0 : financialConnectionsSession.hashCode())) * 31;
            Token token = this.token;
            return hashCode2 + (token != null ? token.hashCode() : 0);
        }

        public String toString() {
            String str = this.linkedAccountId;
            FinancialConnectionsSession financialConnectionsSession = this.financialConnectionsSession;
            Token token = this.token;
            return "Completed(linkedAccountId=" + str + ", financialConnectionsSession=" + financialConnectionsSession + ", token=" + token + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.linkedAccountId);
            FinancialConnectionsSession financialConnectionsSession = this.financialConnectionsSession;
            if (financialConnectionsSession == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                financialConnectionsSession.writeToParcel(out, i);
            }
            out.writeParcelable(this.token, i);
        }

        public /* synthetic */ Completed(String str, FinancialConnectionsSession financialConnectionsSession, Token token, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : financialConnectionsSession, (i & 4) != 0 ? null : token);
        }

        public Completed(String str, FinancialConnectionsSession financialConnectionsSession, Token token) {
            super(null);
            this.linkedAccountId = str;
            this.financialConnectionsSession = financialConnectionsSession;
            this.token = token;
        }
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult$Failed;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", "error", "", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Failed extends FinancialConnectionsSheetActivityResult {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Failed> CREATOR = new Creator();
        private final Throwable error;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<Failed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Failed((Throwable) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed[] newArray(int i) {
                return new Failed[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failed(Throwable error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public static /* synthetic */ Failed copy$default(Failed failed, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failed.error;
            }
            return failed.copy(th);
        }

        public final Throwable component1() {
            return this.error;
        }

        public final Failed copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new Failed(error);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failed) && Intrinsics.areEqual(this.error, ((Failed) obj).error);
        }

        public final Throwable getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            Throwable th = this.error;
            return "Failed(error=" + th + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeSerializable(this.error);
        }
    }

    public /* synthetic */ FinancialConnectionsSheetActivityResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final Bundle toBundle() {
        return C39564d70.m44603a(TuplesKt.m28425to(EXTRA_RESULT, this));
    }

    private FinancialConnectionsSheetActivityResult() {
    }
}
