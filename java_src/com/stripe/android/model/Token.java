package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.parsers.TokenJsonParser;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 22\u00020\u00012\u00020\u0002:\u000223BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000fHÆ\u0003JS\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001J\u0013\u0010(\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020'HÖ\u0001J\t\u0010,\u001a\u00020\u0004HÖ\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020'HÖ\u0001R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001a¨\u00064"}, m28432d2 = {"Lcom/stripe/android/model/Token;", "Lcom/stripe/android/core/model/StripeModel;", "Lcom/stripe/android/model/StripePaymentSource;", "id", "", "type", "Lcom/stripe/android/model/Token$Type;", AnalyticsRequestV2.PARAM_CREATED, "Ljava/util/Date;", "livemode", "", "used", "bankAccount", "Lcom/stripe/android/model/BankAccount;", "card", "Lcom/stripe/android/model/Card;", "(Ljava/lang/String;Lcom/stripe/android/model/Token$Type;Ljava/util/Date;ZZLcom/stripe/android/model/BankAccount;Lcom/stripe/android/model/Card;)V", "getBankAccount", "()Lcom/stripe/android/model/BankAccount;", "getCard", "()Lcom/stripe/android/model/Card;", "getCreated", "()Ljava/util/Date;", "getId", "()Ljava/lang/String;", "getLivemode", "()Z", "getType", "()Lcom/stripe/android/model/Token$Type;", "getUsed", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "Type", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class Token implements StripeModel, StripePaymentSource {
    private final BankAccount bankAccount;
    private final Card card;
    private final Date created;

    /* renamed from: id */
    private final String f75365id;
    private final boolean livemode;
    private final Type type;
    private final boolean used;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Token> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/Token$Companion;", "", "()V", "fromJson", "Lcom/stripe/android/model/Token;", "jsonObject", "Lorg/json/JSONObject;", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final Token fromJson(JSONObject jSONObject) {
            if (jSONObject != null) {
                return new TokenJsonParser().parse2(jSONObject);
            }
            return null;
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<Token> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Token createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Token(parcel.readString(), Type.valueOf(parcel.readString()), (Date) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : BankAccount.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Card.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Token[] newArray(int i) {
            return new Token[i];
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/model/Token$Type;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "Card", "BankAccount", "Pii", "Account", "CvcUpdate", "Person", "Companion", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public enum Type {
        Card("card"),
        BankAccount(ConsumerPaymentDetails.BankAccount.type),
        Pii("pii"),
        Account("account"),
        CvcUpdate("cvc_update"),
        Person("person");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/Token$Type$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/Token$Type;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Token.kt\ncom/stripe/android/model/Token$Type$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,80:1\n1282#2,2:81\n*S KotlinDebug\n*F\n+ 1 Token.kt\ncom/stripe/android/model/Token$Type$Companion\n*L\n67#1:81,2\n*E\n"})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Type fromCode(String str) {
                Type[] values;
                for (Type type : Type.values()) {
                    if (Intrinsics.areEqual(type.getCode(), str)) {
                        return type;
                    }
                }
                return null;
            }

            private Companion() {
            }
        }

        Type(String str) {
            this.code = str;
        }

        public final String getCode() {
            return this.code;
        }
    }

    public Token(String id, Type type, Date created, boolean z, boolean z2, BankAccount bankAccount, Card card) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(created, "created");
        this.f75365id = id;
        this.type = type;
        this.created = created;
        this.livemode = z;
        this.used = z2;
        this.bankAccount = bankAccount;
        this.card = card;
    }

    public static /* synthetic */ Token copy$default(Token token, String str, Type type, Date date, boolean z, boolean z2, BankAccount bankAccount, Card card, int i, Object obj) {
        if ((i & 1) != 0) {
            str = token.getId();
        }
        if ((i & 2) != 0) {
            type = token.type;
        }
        Type type2 = type;
        if ((i & 4) != 0) {
            date = token.created;
        }
        Date date2 = date;
        if ((i & 8) != 0) {
            z = token.livemode;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = token.used;
        }
        boolean z4 = z2;
        if ((i & 32) != 0) {
            bankAccount = token.bankAccount;
        }
        BankAccount bankAccount2 = bankAccount;
        if ((i & 64) != 0) {
            card = token.card;
        }
        return token.copy(str, type2, date2, z3, z4, bankAccount2, card);
    }

    @JvmStatic
    public static final Token fromJson(JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
    }

    public final String component1() {
        return getId();
    }

    public final Type component2() {
        return this.type;
    }

    public final Date component3() {
        return this.created;
    }

    public final boolean component4() {
        return this.livemode;
    }

    public final boolean component5() {
        return this.used;
    }

    public final BankAccount component6() {
        return this.bankAccount;
    }

    public final Card component7() {
        return this.card;
    }

    public final Token copy(String id, Type type, Date created, boolean z, boolean z2, BankAccount bankAccount, Card card) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(created, "created");
        return new Token(id, type, created, z, z2, bankAccount, card);
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
        if (obj instanceof Token) {
            Token token = (Token) obj;
            return Intrinsics.areEqual(getId(), token.getId()) && this.type == token.type && Intrinsics.areEqual(this.created, token.created) && this.livemode == token.livemode && this.used == token.used && Intrinsics.areEqual(this.bankAccount, token.bankAccount) && Intrinsics.areEqual(this.card, token.card);
        }
        return false;
    }

    public final BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public final Card getCard() {
        return this.card;
    }

    public final Date getCreated() {
        return this.created;
    }

    @Override // com.stripe.android.model.StripePaymentSource
    public String getId() {
        return this.f75365id;
    }

    public final boolean getLivemode() {
        return this.livemode;
    }

    public final Type getType() {
        return this.type;
    }

    public final boolean getUsed() {
        return this.used;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int hashCode = ((((getId().hashCode() * 31) + this.type.hashCode()) * 31) + this.created.hashCode()) * 31;
        boolean z = this.livemode;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.used;
        int i3 = (i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        BankAccount bankAccount = this.bankAccount;
        int hashCode2 = (i3 + (bankAccount == null ? 0 : bankAccount.hashCode())) * 31;
        Card card = this.card;
        return hashCode2 + (card != null ? card.hashCode() : 0);
    }

    public String toString() {
        String id = getId();
        Type type = this.type;
        Date date = this.created;
        boolean z = this.livemode;
        boolean z2 = this.used;
        BankAccount bankAccount = this.bankAccount;
        Card card = this.card;
        return "Token(id=" + id + ", type=" + type + ", created=" + date + ", livemode=" + z + ", used=" + z2 + ", bankAccount=" + bankAccount + ", card=" + card + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f75365id);
        out.writeString(this.type.name());
        out.writeSerializable(this.created);
        out.writeInt(this.livemode ? 1 : 0);
        out.writeInt(this.used ? 1 : 0);
        BankAccount bankAccount = this.bankAccount;
        if (bankAccount == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bankAccount.writeToParcel(out, i);
        }
        Card card = this.card;
        if (card == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        card.writeToParcel(out, i);
    }

    public /* synthetic */ Token(String str, Type type, Date date, boolean z, boolean z2, BankAccount bankAccount, Card card, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, type, date, z, z2, (i & 32) != 0 ? null : bankAccount, (i & 64) != 0 ? null : card);
    }
}
