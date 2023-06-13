package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.core.model.StripeModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006)"}, m28432d2 = {"Lcom/stripe/android/model/ConsumerSession;", "Lcom/stripe/android/core/model/StripeModel;", "clientSecret", "", "emailAddress", "redactedPhoneNumber", "verificationSessions", "", "Lcom/stripe/android/model/ConsumerSession$VerificationSession;", "authSessionClientSecret", "publishableKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getAuthSessionClientSecret", "()Ljava/lang/String;", "getClientSecret", "getEmailAddress", "getPublishableKey", "getRedactedPhoneNumber", "getVerificationSessions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "VerificationSession", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ConsumerSession implements StripeModel {
    public static final Parcelable.Creator<ConsumerSession> CREATOR = new Creator();
    private final String authSessionClientSecret;
    private final String clientSecret;
    private final String emailAddress;
    private final String publishableKey;
    private final String redactedPhoneNumber;
    private final List<VerificationSession> verificationSessions;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<ConsumerSession> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsumerSession createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(VerificationSession.CREATOR.createFromParcel(parcel));
            }
            return new ConsumerSession(readString, readString2, readString3, arrayList, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConsumerSession[] newArray(int i) {
            return new ConsumerSession[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001e"}, m28432d2 = {"Lcom/stripe/android/model/ConsumerSession$VerificationSession;", "Lcom/stripe/android/core/model/StripeModel;", "type", "Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;", TransferTable.COLUMN_STATE, "Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;", "(Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;)V", "getState", "()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;", "getType", "()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;", "component1", "component2", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "SessionState", "SessionType", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class VerificationSession implements StripeModel {
        public static final Parcelable.Creator<VerificationSession> CREATOR = new Creator();
        private final SessionState state;
        private final SessionType type;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<VerificationSession> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerificationSession createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VerificationSession(SessionType.CREATOR.createFromParcel(parcel), SessionState.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerificationSession[] newArray(int i) {
                return new VerificationSession[i];
            }
        }

        @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0001\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0015B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tHÖ\u0001J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;", "", "Landroid/os/Parcelable;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Unknown", "Started", "Failed", "Verified", "Canceled", "Expired", "Companion", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public enum SessionState implements Parcelable {
            Unknown(""),
            Started("started"),
            Failed("failed"),
            Verified("verified"),
            Canceled("canceled"),
            Expired("expired");
            
            private final String value;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<SessionState> CREATOR = new Creator();

            @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState$Companion;", "", "()V", "fromValue", "Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;", "value", "", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            @SourceDebugExtension({"SMAP\nConsumerSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsumerSession.kt\ncom/stripe/android/model/ConsumerSession$VerificationSession$SessionState$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,62:1\n1282#2,2:63\n*S KotlinDebug\n*F\n+ 1 ConsumerSession.kt\ncom/stripe/android/model/ConsumerSession$VerificationSession$SessionState$Companion\n*L\n57#1:63,2\n*E\n"})
            /* loaded from: classes7.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final SessionState fromValue(String value) {
                    SessionState sessionState;
                    boolean equals;
                    Intrinsics.checkNotNullParameter(value, "value");
                    SessionState[] values = SessionState.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            sessionState = values[i];
                            equals = StringsKt__StringsJVMKt.equals(sessionState.getValue(), value, true);
                            if (equals) {
                                break;
                            }
                            i++;
                        } else {
                            sessionState = null;
                            break;
                        }
                    }
                    if (sessionState == null) {
                        return SessionState.Unknown;
                    }
                    return sessionState;
                }

                private Companion() {
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<SessionState> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SessionState createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return SessionState.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SessionState[] newArray(int i) {
                    return new SessionState[i];
                }
            }

            SessionState(String str) {
                this.value = str;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getValue() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(name());
            }
        }

        @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0013B\u000f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\tHÖ\u0001J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, m28432d2 = {"Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;", "", "Landroid/os/Parcelable;", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Unknown", "SignUp", "Email", "Sms", "Companion", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public enum SessionType implements Parcelable {
            Unknown(""),
            SignUp("signup"),
            Email("email"),
            Sms("sms");
            
            private final String value;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<SessionType> CREATOR = new Creator();

            @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType$Companion;", "", "()V", "fromValue", "Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;", "value", "", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            @SourceDebugExtension({"SMAP\nConsumerSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsumerSession.kt\ncom/stripe/android/model/ConsumerSession$VerificationSession$SessionType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,62:1\n1282#2,2:63\n*S KotlinDebug\n*F\n+ 1 ConsumerSession.kt\ncom/stripe/android/model/ConsumerSession$VerificationSession$SessionType$Companion\n*L\n40#1:63,2\n*E\n"})
            /* loaded from: classes7.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final SessionType fromValue(String value) {
                    SessionType sessionType;
                    boolean equals;
                    Intrinsics.checkNotNullParameter(value, "value");
                    SessionType[] values = SessionType.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            sessionType = values[i];
                            equals = StringsKt__StringsJVMKt.equals(sessionType.getValue(), value, true);
                            if (equals) {
                                break;
                            }
                            i++;
                        } else {
                            sessionType = null;
                            break;
                        }
                    }
                    if (sessionType == null) {
                        return SessionType.Unknown;
                    }
                    return sessionType;
                }

                private Companion() {
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<SessionType> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SessionType createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return SessionType.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SessionType[] newArray(int i) {
                    return new SessionType[i];
                }
            }

            SessionType(String str) {
                this.value = str;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getValue() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(name());
            }
        }

        public VerificationSession(SessionType type, SessionState state) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(state, "state");
            this.type = type;
            this.state = state;
        }

        public static /* synthetic */ VerificationSession copy$default(VerificationSession verificationSession, SessionType sessionType, SessionState sessionState, int i, Object obj) {
            if ((i & 1) != 0) {
                sessionType = verificationSession.type;
            }
            if ((i & 2) != 0) {
                sessionState = verificationSession.state;
            }
            return verificationSession.copy(sessionType, sessionState);
        }

        public final SessionType component1() {
            return this.type;
        }

        public final SessionState component2() {
            return this.state;
        }

        public final VerificationSession copy(SessionType type, SessionState state) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(state, "state");
            return new VerificationSession(type, state);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof VerificationSession) {
                VerificationSession verificationSession = (VerificationSession) obj;
                return this.type == verificationSession.type && this.state == verificationSession.state;
            }
            return false;
        }

        public final SessionState getState() {
            return this.state;
        }

        public final SessionType getType() {
            return this.type;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            return (this.type.hashCode() * 31) + this.state.hashCode();
        }

        public String toString() {
            SessionType sessionType = this.type;
            SessionState sessionState = this.state;
            return "VerificationSession(type=" + sessionType + ", state=" + sessionState + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.type.writeToParcel(out, i);
            this.state.writeToParcel(out, i);
        }
    }

    public ConsumerSession(String clientSecret, String emailAddress, String redactedPhoneNumber, List<VerificationSession> verificationSessions, String str, String str2) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(emailAddress, "emailAddress");
        Intrinsics.checkNotNullParameter(redactedPhoneNumber, "redactedPhoneNumber");
        Intrinsics.checkNotNullParameter(verificationSessions, "verificationSessions");
        this.clientSecret = clientSecret;
        this.emailAddress = emailAddress;
        this.redactedPhoneNumber = redactedPhoneNumber;
        this.verificationSessions = verificationSessions;
        this.authSessionClientSecret = str;
        this.publishableKey = str2;
    }

    public static /* synthetic */ ConsumerSession copy$default(ConsumerSession consumerSession, String str, String str2, String str3, List list, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = consumerSession.clientSecret;
        }
        if ((i & 2) != 0) {
            str2 = consumerSession.emailAddress;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = consumerSession.redactedPhoneNumber;
        }
        String str7 = str3;
        List<VerificationSession> list2 = list;
        if ((i & 8) != 0) {
            list2 = consumerSession.verificationSessions;
        }
        List list3 = list2;
        if ((i & 16) != 0) {
            str4 = consumerSession.authSessionClientSecret;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = consumerSession.publishableKey;
        }
        return consumerSession.copy(str, str6, str7, list3, str8, str5);
    }

    public final String component1() {
        return this.clientSecret;
    }

    public final String component2() {
        return this.emailAddress;
    }

    public final String component3() {
        return this.redactedPhoneNumber;
    }

    public final List<VerificationSession> component4() {
        return this.verificationSessions;
    }

    public final String component5() {
        return this.authSessionClientSecret;
    }

    public final String component6() {
        return this.publishableKey;
    }

    public final ConsumerSession copy(String clientSecret, String emailAddress, String redactedPhoneNumber, List<VerificationSession> verificationSessions, String str, String str2) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(emailAddress, "emailAddress");
        Intrinsics.checkNotNullParameter(redactedPhoneNumber, "redactedPhoneNumber");
        Intrinsics.checkNotNullParameter(verificationSessions, "verificationSessions");
        return new ConsumerSession(clientSecret, emailAddress, redactedPhoneNumber, verificationSessions, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConsumerSession) {
            ConsumerSession consumerSession = (ConsumerSession) obj;
            return Intrinsics.areEqual(this.clientSecret, consumerSession.clientSecret) && Intrinsics.areEqual(this.emailAddress, consumerSession.emailAddress) && Intrinsics.areEqual(this.redactedPhoneNumber, consumerSession.redactedPhoneNumber) && Intrinsics.areEqual(this.verificationSessions, consumerSession.verificationSessions) && Intrinsics.areEqual(this.authSessionClientSecret, consumerSession.authSessionClientSecret) && Intrinsics.areEqual(this.publishableKey, consumerSession.publishableKey);
        }
        return false;
    }

    public final String getAuthSessionClientSecret() {
        return this.authSessionClientSecret;
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final String getEmailAddress() {
        return this.emailAddress;
    }

    public final String getPublishableKey() {
        return this.publishableKey;
    }

    public final String getRedactedPhoneNumber() {
        return this.redactedPhoneNumber;
    }

    public final List<VerificationSession> getVerificationSessions() {
        return this.verificationSessions;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int hashCode = ((((((this.clientSecret.hashCode() * 31) + this.emailAddress.hashCode()) * 31) + this.redactedPhoneNumber.hashCode()) * 31) + this.verificationSessions.hashCode()) * 31;
        String str = this.authSessionClientSecret;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.publishableKey;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.clientSecret;
        String str2 = this.emailAddress;
        String str3 = this.redactedPhoneNumber;
        List<VerificationSession> list = this.verificationSessions;
        String str4 = this.authSessionClientSecret;
        String str5 = this.publishableKey;
        return "ConsumerSession(clientSecret=" + str + ", emailAddress=" + str2 + ", redactedPhoneNumber=" + str3 + ", verificationSessions=" + list + ", authSessionClientSecret=" + str4 + ", publishableKey=" + str5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.clientSecret);
        out.writeString(this.emailAddress);
        out.writeString(this.redactedPhoneNumber);
        List<VerificationSession> list = this.verificationSessions;
        out.writeInt(list.size());
        for (VerificationSession verificationSession : list) {
            verificationSession.writeToParcel(out, i);
        }
        out.writeString(this.authSessionClientSecret);
        out.writeString(this.publishableKey);
    }
}
