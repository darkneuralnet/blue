package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0002\u0018\u0019B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0004HÂ\u0003J\u0013\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\tHÖ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\tHÖ\u0001J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u0010H\u0016J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tHÖ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/model/MandateDataParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "type", "Lcom/stripe/android/model/MandateDataParams$Type;", "(Lcom/stripe/android/model/MandateDataParams$Type;)V", "component1", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "Type", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class MandateDataParams implements StripeParamsModel, Parcelable {
    public static final int $stable = 0;
    @Deprecated
    private static final String PARAM_CUSTOMER_ACCEPTANCE = "customer_acceptance";
    @Deprecated
    private static final String PARAM_TYPE = "type";
    private final Type type;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<MandateDataParams> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/model/MandateDataParams$Companion;", "", "()V", "PARAM_CUSTOMER_ACCEPTANCE", "", "PARAM_TYPE", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<MandateDataParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MandateDataParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MandateDataParams((Type) parcel.readParcelable(MandateDataParams.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MandateDataParams[] newArray(int i) {
            return new MandateDataParams[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\bB\u000f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0001\t¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/model/MandateDataParams$Type;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "Online", "Lcom/stripe/android/model/MandateDataParams$Type$Online;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static abstract class Type implements StripeParamsModel, Parcelable {
        public static final int $stable = 0;
        private final String code;

        @Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B)\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\t\u0010\u000b\u001a\u00020\u0007HÂ\u0003J+\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u000eHÖ\u0001J\u0014\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0014H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000eHÖ\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m28432d2 = {"Lcom/stripe/android/model/MandateDataParams$Type$Online;", "Lcom/stripe/android/model/MandateDataParams$Type;", "ipAddress", "", "userAgent", "(Ljava/lang/String;Ljava/lang/String;)V", "inferFromClient", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "component2", "component3", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toParamMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Online extends Type {
            public static final int $stable = 0;
            private static final String PARAM_INFER_FROM_CLIENT = "infer_from_client";
            private static final String PARAM_IP_ADDRESS = "ip_address";
            private static final String PARAM_USER_AGENT = "user_agent";
            private final boolean inferFromClient;
            private final String ipAddress;
            private final String userAgent;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Online> CREATOR = new Creator();
            private static final Online DEFAULT = new Online(null, null, true, 3, null);

            @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/model/MandateDataParams$Type$Online$Companion;", "", "()V", "DEFAULT", "Lcom/stripe/android/model/MandateDataParams$Type$Online;", "getDEFAULT", "()Lcom/stripe/android/model/MandateDataParams$Type$Online;", "PARAM_INFER_FROM_CLIENT", "", "PARAM_IP_ADDRESS", "PARAM_USER_AGENT", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Online getDEFAULT() {
                    return Online.DEFAULT;
                }

                private Companion() {
                }
            }

            @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* loaded from: classes7.dex */
            public static final class Creator implements Parcelable.Creator<Online> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Online createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Online(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Online[] newArray(int i) {
                    return new Online[i];
                }
            }

            public Online() {
                this(null, null, false, 7, null);
            }

            private final String component1() {
                return this.ipAddress;
            }

            private final String component2() {
                return this.userAgent;
            }

            private final boolean component3() {
                return this.inferFromClient;
            }

            public static /* synthetic */ Online copy$default(Online online, String str, String str2, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = online.ipAddress;
                }
                if ((i & 2) != 0) {
                    str2 = online.userAgent;
                }
                if ((i & 4) != 0) {
                    z = online.inferFromClient;
                }
                return online.copy(str, str2, z);
            }

            public final Online copy(String str, String str2, boolean z) {
                return new Online(str, str2, z);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Online) {
                    Online online = (Online) obj;
                    return Intrinsics.areEqual(this.ipAddress, online.ipAddress) && Intrinsics.areEqual(this.userAgent, online.userAgent) && this.inferFromClient == online.inferFromClient;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                String str = this.ipAddress;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.userAgent;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                boolean z = this.inferFromClient;
                int i = z;
                if (z != 0) {
                    i = 1;
                }
                return hashCode2 + i;
            }

            @Override // com.stripe.android.model.StripeParamsModel
            public Map<String, Object> toParamMap() {
                Map<String, Object> mapOf;
                Map<String, Object> mapOf2;
                if (this.inferFromClient) {
                    mapOf2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_INFER_FROM_CLIENT, Boolean.TRUE));
                    return mapOf2;
                }
                Pair[] pairArr = new Pair[2];
                String str = this.ipAddress;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                pairArr[0] = TuplesKt.m28425to(PARAM_IP_ADDRESS, str);
                String str3 = this.userAgent;
                if (str3 != null) {
                    str2 = str3;
                }
                pairArr[1] = TuplesKt.m28425to(PARAM_USER_AGENT, str2);
                mapOf = MapsKt__MapsKt.mapOf(pairArr);
                return mapOf;
            }

            public String toString() {
                String str = this.ipAddress;
                String str2 = this.userAgent;
                boolean z = this.inferFromClient;
                return "Online(ipAddress=" + str + ", userAgent=" + str2 + ", inferFromClient=" + z + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i) {
                Intrinsics.checkNotNullParameter(out, "out");
                out.writeString(this.ipAddress);
                out.writeString(this.userAgent);
                out.writeInt(this.inferFromClient ? 1 : 0);
            }

            public /* synthetic */ Online(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z);
            }

            public Online(String str, String str2, boolean z) {
                super("online", null);
                this.ipAddress = str;
                this.userAgent = str2;
                this.inferFromClient = z;
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public Online(String ipAddress, String userAgent) {
                this(ipAddress, userAgent, false);
                Intrinsics.checkNotNullParameter(ipAddress, "ipAddress");
                Intrinsics.checkNotNullParameter(userAgent, "userAgent");
            }
        }

        public /* synthetic */ Type(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public final String getCode$payments_core_release() {
            return this.code;
        }

        private Type(String str) {
            this.code = str;
        }
    }

    public MandateDataParams(Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
    }

    private final Type component1() {
        return this.type;
    }

    public static /* synthetic */ MandateDataParams copy$default(MandateDataParams mandateDataParams, Type type, int i, Object obj) {
        if ((i & 1) != 0) {
            type = mandateDataParams.type;
        }
        return mandateDataParams.copy(type);
    }

    public final MandateDataParams copy(Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new MandateDataParams(type);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MandateDataParams) && Intrinsics.areEqual(this.type, ((MandateDataParams) obj).type);
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map mapOf;
        Map<String, Object> mapOf2;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("type", this.type.getCode$payments_core_release()), TuplesKt.m28425to(this.type.getCode$payments_core_release(), this.type.toParamMap()));
        mapOf2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_CUSTOMER_ACCEPTANCE, mapOf));
        return mapOf2;
    }

    public String toString() {
        Type type = this.type;
        return "MandateDataParams(type=" + type + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeParcelable(this.type, i);
    }
}
