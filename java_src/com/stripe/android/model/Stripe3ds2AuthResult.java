package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0003567Bk\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u000bHÂ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jx\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010(J\t\u0010)\u001a\u00020*HÖ\u0001J\u0013\u0010+\u001a\u00020\u000b2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020*HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020*HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017¨\u00068"}, m28432d2 = {"Lcom/stripe/android/model/Stripe3ds2AuthResult;", "Lcom/stripe/android/core/model/StripeModel;", "id", "", "ares", "Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;", AnalyticsRequestV2.PARAM_CREATED, "", Stripe3ds2AuthParams.FIELD_SOURCE, TransferTable.COLUMN_STATE, "liveMode", "", "error", "Lcom/stripe/android/model/Stripe3ds2AuthResult$ThreeDS2Error;", "fallbackRedirectUrl", "creq", "(Ljava/lang/String;Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/model/Stripe3ds2AuthResult$ThreeDS2Error;Ljava/lang/String;Ljava/lang/String;)V", "getAres", "()Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;", "getCreated", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCreq", "()Ljava/lang/String;", "getError", "()Lcom/stripe/android/model/Stripe3ds2AuthResult$ThreeDS2Error;", "getFallbackRedirectUrl", "getId", "getSource", "getState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/model/Stripe3ds2AuthResult$ThreeDS2Error;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/Stripe3ds2AuthResult;", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Ares", "MessageExtension", "ThreeDS2Error", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class Stripe3ds2AuthResult implements StripeModel {
    public static final Parcelable.Creator<Stripe3ds2AuthResult> CREATOR = new Creator();
    private final Ares ares;
    private final Long created;
    private final String creq;
    private final ThreeDS2Error error;
    private final String fallbackRedirectUrl;

    /* renamed from: id */
    private final String f75363id;
    private final boolean liveMode;
    private final String source;
    private final String state;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<Stripe3ds2AuthResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Stripe3ds2AuthResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Stripe3ds2AuthResult(parcel.readString(), parcel.readInt() == 0 ? null : Ares.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? ThreeDS2Error.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Stripe3ds2AuthResult[] newArray(int i) {
            return new Stripe3ds2AuthResult[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÂ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003JC\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/model/Stripe3ds2AuthResult$MessageExtension;", "Lcom/stripe/android/core/model/StripeModel;", "name", "", com.stripe.android.stripe3ds2.transactions.MessageExtension.FIELD_CRITICALITY_INDICATOR, "", "id", com.stripe.android.stripe3ds2.transactions.MessageExtension.FIELD_DATA, "", "(Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;)V", "getData", "()Ljava/util/Map;", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class MessageExtension implements StripeModel {
        public static final Parcelable.Creator<MessageExtension> CREATOR = new Creator();
        private final boolean criticalityIndicator;
        private final Map<String, String> data;

        /* renamed from: id */
        private final String f75364id;
        private final String name;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<MessageExtension> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MessageExtension createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                boolean z = parcel.readInt() != 0;
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    for (int i = 0; i != readInt; i++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readString());
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new MessageExtension(readString, z, readString2, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MessageExtension[] newArray(int i) {
                return new MessageExtension[i];
            }
        }

        public MessageExtension(String str, boolean z, String str2, Map<String, String> map) {
            this.name = str;
            this.criticalityIndicator = z;
            this.f75364id = str2;
            this.data = map;
        }

        private final boolean component2() {
            return this.criticalityIndicator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MessageExtension copy$default(MessageExtension messageExtension, String str, boolean z, String str2, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = messageExtension.name;
            }
            if ((i & 2) != 0) {
                z = messageExtension.criticalityIndicator;
            }
            if ((i & 4) != 0) {
                str2 = messageExtension.f75364id;
            }
            if ((i & 8) != 0) {
                map = messageExtension.data;
            }
            return messageExtension.copy(str, z, str2, map);
        }

        public final String component1() {
            return this.name;
        }

        public final String component3() {
            return this.f75364id;
        }

        public final Map<String, String> component4() {
            return this.data;
        }

        public final MessageExtension copy(String str, boolean z, String str2, Map<String, String> map) {
            return new MessageExtension(str, z, str2, map);
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
            if (obj instanceof MessageExtension) {
                MessageExtension messageExtension = (MessageExtension) obj;
                return Intrinsics.areEqual(this.name, messageExtension.name) && this.criticalityIndicator == messageExtension.criticalityIndicator && Intrinsics.areEqual(this.f75364id, messageExtension.f75364id) && Intrinsics.areEqual(this.data, messageExtension.data);
            }
            return false;
        }

        public final Map<String, String> getData() {
            return this.data;
        }

        public final String getId() {
            return this.f75364id;
        }

        public final String getName() {
            return this.name;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.name;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            boolean z = this.criticalityIndicator;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode + i) * 31;
            String str2 = this.f75364id;
            int hashCode2 = (i2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, String> map = this.data;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            String str = this.name;
            boolean z = this.criticalityIndicator;
            String str2 = this.f75364id;
            Map<String, String> map = this.data;
            return "MessageExtension(name=" + str + ", criticalityIndicator=" + z + ", id=" + str2 + ", data=" + map + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.name);
            out.writeInt(this.criticalityIndicator ? 1 : 0);
            out.writeString(this.f75364id);
            Map<String, String> map = this.data;
            if (map == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                out.writeString(entry.getValue());
            }
        }
    }

    public Stripe3ds2AuthResult(String str, Ares ares, Long l, String str2, String str3, boolean z, ThreeDS2Error threeDS2Error, String str4, String str5) {
        this.f75363id = str;
        this.ares = ares;
        this.created = l;
        this.source = str2;
        this.state = str3;
        this.liveMode = z;
        this.error = threeDS2Error;
        this.fallbackRedirectUrl = str4;
        this.creq = str5;
    }

    private final boolean component6() {
        return this.liveMode;
    }

    public final String component1() {
        return this.f75363id;
    }

    public final Ares component2() {
        return this.ares;
    }

    public final Long component3() {
        return this.created;
    }

    public final String component4() {
        return this.source;
    }

    public final String component5() {
        return this.state;
    }

    public final ThreeDS2Error component7() {
        return this.error;
    }

    public final String component8() {
        return this.fallbackRedirectUrl;
    }

    public final String component9() {
        return this.creq;
    }

    public final Stripe3ds2AuthResult copy(String str, Ares ares, Long l, String str2, String str3, boolean z, ThreeDS2Error threeDS2Error, String str4, String str5) {
        return new Stripe3ds2AuthResult(str, ares, l, str2, str3, z, threeDS2Error, str4, str5);
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
        if (obj instanceof Stripe3ds2AuthResult) {
            Stripe3ds2AuthResult stripe3ds2AuthResult = (Stripe3ds2AuthResult) obj;
            return Intrinsics.areEqual(this.f75363id, stripe3ds2AuthResult.f75363id) && Intrinsics.areEqual(this.ares, stripe3ds2AuthResult.ares) && Intrinsics.areEqual(this.created, stripe3ds2AuthResult.created) && Intrinsics.areEqual(this.source, stripe3ds2AuthResult.source) && Intrinsics.areEqual(this.state, stripe3ds2AuthResult.state) && this.liveMode == stripe3ds2AuthResult.liveMode && Intrinsics.areEqual(this.error, stripe3ds2AuthResult.error) && Intrinsics.areEqual(this.fallbackRedirectUrl, stripe3ds2AuthResult.fallbackRedirectUrl) && Intrinsics.areEqual(this.creq, stripe3ds2AuthResult.creq);
        }
        return false;
    }

    public final Ares getAres() {
        return this.ares;
    }

    public final Long getCreated() {
        return this.created;
    }

    public final String getCreq() {
        return this.creq;
    }

    public final ThreeDS2Error getError() {
        return this.error;
    }

    public final String getFallbackRedirectUrl() {
        return this.fallbackRedirectUrl;
    }

    public final String getId() {
        return this.f75363id;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getState() {
        return this.state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        String str = this.f75363id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Ares ares = this.ares;
        int hashCode2 = (hashCode + (ares == null ? 0 : ares.hashCode())) * 31;
        Long l = this.created;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.source;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.state;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z = this.liveMode;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode5 + i) * 31;
        ThreeDS2Error threeDS2Error = this.error;
        int hashCode6 = (i2 + (threeDS2Error == null ? 0 : threeDS2Error.hashCode())) * 31;
        String str4 = this.fallbackRedirectUrl;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.creq;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.f75363id;
        Ares ares = this.ares;
        Long l = this.created;
        String str2 = this.source;
        String str3 = this.state;
        boolean z = this.liveMode;
        ThreeDS2Error threeDS2Error = this.error;
        String str4 = this.fallbackRedirectUrl;
        String str5 = this.creq;
        return "Stripe3ds2AuthResult(id=" + str + ", ares=" + ares + ", created=" + l + ", source=" + str2 + ", state=" + str3 + ", liveMode=" + z + ", error=" + threeDS2Error + ", fallbackRedirectUrl=" + str4 + ", creq=" + str5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f75363id);
        Ares ares = this.ares;
        if (ares == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            ares.writeToParcel(out, i);
        }
        Long l = this.created;
        if (l == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l.longValue());
        }
        out.writeString(this.source);
        out.writeString(this.state);
        out.writeInt(this.liveMode ? 1 : 0);
        ThreeDS2Error threeDS2Error = this.error;
        if (threeDS2Error == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            threeDS2Error.writeToParcel(out, i);
        }
        out.writeString(this.fallbackRedirectUrl);
        out.writeString(this.creq);
    }

    public /* synthetic */ Stripe3ds2AuthResult(String str, Ares ares, Long l, String str2, String str3, boolean z, ThreeDS2Error threeDS2Error, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : ares, l, str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : threeDS2Error, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5);
    }

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bw\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008d\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020(HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\u0019\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020(HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u00064"}, m28432d2 = {"Lcom/stripe/android/model/Stripe3ds2AuthResult$ThreeDS2Error;", "Lcom/stripe/android/core/model/StripeModel;", "threeDSServerTransId", "", "acsTransId", "dsTransId", "errorCode", "errorComponent", "errorDescription", "errorDetail", "errorMessageType", ChallengeRequestData.FIELD_MESSAGE_TYPE, ChallengeRequestData.FIELD_MESSAGE_VERSION, "sdkTransId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAcsTransId", "()Ljava/lang/String;", "getDsTransId", "getErrorCode", "getErrorComponent", "getErrorDescription", "getErrorDetail", "getErrorMessageType", "getMessageType", "getMessageVersion", "getSdkTransId", "getThreeDSServerTransId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class ThreeDS2Error implements StripeModel {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ThreeDS2Error> CREATOR = new Creator();
        private final String acsTransId;
        private final String dsTransId;
        private final String errorCode;
        private final String errorComponent;
        private final String errorDescription;
        private final String errorDetail;
        private final String errorMessageType;
        private final String messageType;
        private final String messageVersion;
        private final String sdkTransId;
        private final String threeDSServerTransId;

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class Creator implements Parcelable.Creator<ThreeDS2Error> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ThreeDS2Error createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ThreeDS2Error(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ThreeDS2Error[] newArray(int i) {
                return new ThreeDS2Error[i];
            }
        }

        public ThreeDS2Error(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.threeDSServerTransId = str;
            this.acsTransId = str2;
            this.dsTransId = str3;
            this.errorCode = str4;
            this.errorComponent = str5;
            this.errorDescription = str6;
            this.errorDetail = str7;
            this.errorMessageType = str8;
            this.messageType = str9;
            this.messageVersion = str10;
            this.sdkTransId = str11;
        }

        public final String component1() {
            return this.threeDSServerTransId;
        }

        public final String component10() {
            return this.messageVersion;
        }

        public final String component11() {
            return this.sdkTransId;
        }

        public final String component2() {
            return this.acsTransId;
        }

        public final String component3() {
            return this.dsTransId;
        }

        public final String component4() {
            return this.errorCode;
        }

        public final String component5() {
            return this.errorComponent;
        }

        public final String component6() {
            return this.errorDescription;
        }

        public final String component7() {
            return this.errorDetail;
        }

        public final String component8() {
            return this.errorMessageType;
        }

        public final String component9() {
            return this.messageType;
        }

        public final ThreeDS2Error copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            return new ThreeDS2Error(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
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
            if (obj instanceof ThreeDS2Error) {
                ThreeDS2Error threeDS2Error = (ThreeDS2Error) obj;
                return Intrinsics.areEqual(this.threeDSServerTransId, threeDS2Error.threeDSServerTransId) && Intrinsics.areEqual(this.acsTransId, threeDS2Error.acsTransId) && Intrinsics.areEqual(this.dsTransId, threeDS2Error.dsTransId) && Intrinsics.areEqual(this.errorCode, threeDS2Error.errorCode) && Intrinsics.areEqual(this.errorComponent, threeDS2Error.errorComponent) && Intrinsics.areEqual(this.errorDescription, threeDS2Error.errorDescription) && Intrinsics.areEqual(this.errorDetail, threeDS2Error.errorDetail) && Intrinsics.areEqual(this.errorMessageType, threeDS2Error.errorMessageType) && Intrinsics.areEqual(this.messageType, threeDS2Error.messageType) && Intrinsics.areEqual(this.messageVersion, threeDS2Error.messageVersion) && Intrinsics.areEqual(this.sdkTransId, threeDS2Error.sdkTransId);
            }
            return false;
        }

        public final String getAcsTransId() {
            return this.acsTransId;
        }

        public final String getDsTransId() {
            return this.dsTransId;
        }

        public final String getErrorCode() {
            return this.errorCode;
        }

        public final String getErrorComponent() {
            return this.errorComponent;
        }

        public final String getErrorDescription() {
            return this.errorDescription;
        }

        public final String getErrorDetail() {
            return this.errorDetail;
        }

        public final String getErrorMessageType() {
            return this.errorMessageType;
        }

        public final String getMessageType() {
            return this.messageType;
        }

        public final String getMessageVersion() {
            return this.messageVersion;
        }

        public final String getSdkTransId() {
            return this.sdkTransId;
        }

        public final String getThreeDSServerTransId() {
            return this.threeDSServerTransId;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.threeDSServerTransId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.acsTransId;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.dsTransId;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.errorCode;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.errorComponent;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.errorDescription;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.errorDetail;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.errorMessageType;
            int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.messageType;
            int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.messageVersion;
            int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.sdkTransId;
            return hashCode10 + (str11 != null ? str11.hashCode() : 0);
        }

        public String toString() {
            String str = this.threeDSServerTransId;
            String str2 = this.acsTransId;
            String str3 = this.dsTransId;
            String str4 = this.errorCode;
            String str5 = this.errorComponent;
            String str6 = this.errorDescription;
            String str7 = this.errorDetail;
            String str8 = this.errorMessageType;
            String str9 = this.messageType;
            String str10 = this.messageVersion;
            String str11 = this.sdkTransId;
            return "ThreeDS2Error(threeDSServerTransId=" + str + ", acsTransId=" + str2 + ", dsTransId=" + str3 + ", errorCode=" + str4 + ", errorComponent=" + str5 + ", errorDescription=" + str6 + ", errorDetail=" + str7 + ", errorMessageType=" + str8 + ", messageType=" + str9 + ", messageVersion=" + str10 + ", sdkTransId=" + str11 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.threeDSServerTransId);
            out.writeString(this.acsTransId);
            out.writeString(this.dsTransId);
            out.writeString(this.errorCode);
            out.writeString(this.errorComponent);
            out.writeString(this.errorDescription);
            out.writeString(this.errorDetail);
            out.writeString(this.errorMessageType);
            out.writeString(this.messageType);
            out.writeString(this.messageVersion);
            out.writeString(this.sdkTransId);
        }

        public /* synthetic */ ThreeDS2Error(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? null : str7, str8, str9, str10, str11);
        }
    }

    @Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 52\u00020\u0001:\u00015B\u0091\u0001\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\u001aJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b\"J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÂ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u009f\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0013\u0010+\u001a\u00020\u00162\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020*HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020*HÖ\u0001R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00066"}, m28432d2 = {"Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares;", "Lcom/stripe/android/core/model/StripeModel;", "threeDSServerTransId", "", "acsChallengeMandated", "acsSignedContent", "acsTransId", "acsUrl", "authenticationType", "cardholderInfo", "messageExtension", "", "Lcom/stripe/android/model/Stripe3ds2AuthResult$MessageExtension;", ChallengeRequestData.FIELD_MESSAGE_TYPE, ChallengeRequestData.FIELD_MESSAGE_VERSION, "sdkTransId", "transStatus", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAcsSignedContent$payments_core_release", "()Ljava/lang/String;", "getAcsTransId$payments_core_release", "isChallenge", "", "()Z", "getThreeDSServerTransId$payments_core_release", "component1", "component1$payments_core_release", "component10", "component11", "component12", "component2", "component3", "component3$payments_core_release", "component4", "component4$payments_core_release", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Ares implements StripeModel {
        public static final String VALUE_CHALLENGE = "C";
        private final String acsChallengeMandated;
        private final String acsSignedContent;
        private final String acsTransId;
        private final String acsUrl;
        private final String authenticationType;
        private final String cardholderInfo;
        private final List<MessageExtension> messageExtension;
        private final String messageType;
        private final String messageVersion;
        private final String sdkTransId;
        private final String threeDSServerTransId;
        private final String transStatus;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Ares> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/model/Stripe3ds2AuthResult$Ares$Companion;", "", "()V", "VALUE_CHALLENGE", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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
        public static final class Creator implements Parcelable.Creator<Ares> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ares createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    for (int i = 0; i != readInt; i++) {
                        arrayList2.add(MessageExtension.CREATOR.createFromParcel(parcel));
                    }
                    arrayList = arrayList2;
                }
                return new Ares(readString, readString2, readString3, readString4, readString5, readString6, readString7, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ares[] newArray(int i) {
                return new Ares[i];
            }
        }

        public Ares(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<MessageExtension> list, String str8, String str9, String str10, String str11) {
            this.threeDSServerTransId = str;
            this.acsChallengeMandated = str2;
            this.acsSignedContent = str3;
            this.acsTransId = str4;
            this.acsUrl = str5;
            this.authenticationType = str6;
            this.cardholderInfo = str7;
            this.messageExtension = list;
            this.messageType = str8;
            this.messageVersion = str9;
            this.sdkTransId = str10;
            this.transStatus = str11;
        }

        private final String component10() {
            return this.messageVersion;
        }

        private final String component11() {
            return this.sdkTransId;
        }

        private final String component12() {
            return this.transStatus;
        }

        private final String component2() {
            return this.acsChallengeMandated;
        }

        private final String component5() {
            return this.acsUrl;
        }

        private final String component6() {
            return this.authenticationType;
        }

        private final String component7() {
            return this.cardholderInfo;
        }

        private final List<MessageExtension> component8() {
            return this.messageExtension;
        }

        private final String component9() {
            return this.messageType;
        }

        public final String component1$payments_core_release() {
            return this.threeDSServerTransId;
        }

        public final String component3$payments_core_release() {
            return this.acsSignedContent;
        }

        public final String component4$payments_core_release() {
            return this.acsTransId;
        }

        public final Ares copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<MessageExtension> list, String str8, String str9, String str10, String str11) {
            return new Ares(str, str2, str3, str4, str5, str6, str7, list, str8, str9, str10, str11);
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
            if (obj instanceof Ares) {
                Ares ares = (Ares) obj;
                return Intrinsics.areEqual(this.threeDSServerTransId, ares.threeDSServerTransId) && Intrinsics.areEqual(this.acsChallengeMandated, ares.acsChallengeMandated) && Intrinsics.areEqual(this.acsSignedContent, ares.acsSignedContent) && Intrinsics.areEqual(this.acsTransId, ares.acsTransId) && Intrinsics.areEqual(this.acsUrl, ares.acsUrl) && Intrinsics.areEqual(this.authenticationType, ares.authenticationType) && Intrinsics.areEqual(this.cardholderInfo, ares.cardholderInfo) && Intrinsics.areEqual(this.messageExtension, ares.messageExtension) && Intrinsics.areEqual(this.messageType, ares.messageType) && Intrinsics.areEqual(this.messageVersion, ares.messageVersion) && Intrinsics.areEqual(this.sdkTransId, ares.sdkTransId) && Intrinsics.areEqual(this.transStatus, ares.transStatus);
            }
            return false;
        }

        public final String getAcsSignedContent$payments_core_release() {
            return this.acsSignedContent;
        }

        public final String getAcsTransId$payments_core_release() {
            return this.acsTransId;
        }

        public final String getThreeDSServerTransId$payments_core_release() {
            return this.threeDSServerTransId;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.threeDSServerTransId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.acsChallengeMandated;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.acsSignedContent;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.acsTransId;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.acsUrl;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.authenticationType;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.cardholderInfo;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            List<MessageExtension> list = this.messageExtension;
            int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
            String str8 = this.messageType;
            int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.messageVersion;
            int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.sdkTransId;
            int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.transStatus;
            return hashCode11 + (str11 != null ? str11.hashCode() : 0);
        }

        public final boolean isChallenge() {
            return Intrinsics.areEqual(VALUE_CHALLENGE, this.transStatus);
        }

        public String toString() {
            String str = this.threeDSServerTransId;
            String str2 = this.acsChallengeMandated;
            String str3 = this.acsSignedContent;
            String str4 = this.acsTransId;
            String str5 = this.acsUrl;
            String str6 = this.authenticationType;
            String str7 = this.cardholderInfo;
            List<MessageExtension> list = this.messageExtension;
            String str8 = this.messageType;
            String str9 = this.messageVersion;
            String str10 = this.sdkTransId;
            String str11 = this.transStatus;
            return "Ares(threeDSServerTransId=" + str + ", acsChallengeMandated=" + str2 + ", acsSignedContent=" + str3 + ", acsTransId=" + str4 + ", acsUrl=" + str5 + ", authenticationType=" + str6 + ", cardholderInfo=" + str7 + ", messageExtension=" + list + ", messageType=" + str8 + ", messageVersion=" + str9 + ", sdkTransId=" + str10 + ", transStatus=" + str11 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.threeDSServerTransId);
            out.writeString(this.acsChallengeMandated);
            out.writeString(this.acsSignedContent);
            out.writeString(this.acsTransId);
            out.writeString(this.acsUrl);
            out.writeString(this.authenticationType);
            out.writeString(this.cardholderInfo);
            List<MessageExtension> list = this.messageExtension;
            if (list == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(list.size());
                for (MessageExtension messageExtension : list) {
                    messageExtension.writeToParcel(out, i);
                }
            }
            out.writeString(this.messageType);
            out.writeString(this.messageVersion);
            out.writeString(this.sdkTransId);
            out.writeString(this.transStatus);
        }

        public /* synthetic */ Ares(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : list, str8, str9, str10, (i & 2048) != 0 ? null : str11);
        }
    }
}
