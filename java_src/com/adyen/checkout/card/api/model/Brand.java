package com.adyen.checkout.card.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.adyen.checkout.core.exception.ModelSerializationException;
import com.adyen.checkout.core.model.JsonUtils;
import com.adyen.checkout.core.model.JsonUtilsKt;
import com.adyen.checkout.core.model.ModelObject;
import com.adyen.checkout.core.model.ModelUtils;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0002\u000f\u0014BC\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012¨\u0006!"}, m28432d2 = {"Lcom/adyen/checkout/card/api/model/Brand;", "Lcom/adyen/checkout/core/model/ModelObject;", "Landroid/os/Parcel;", "parcel", "", "flags", "", "writeToParcel", "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "b", "Ljava/lang/String;", "getBrand", "()Ljava/lang/String;", AccountRangeJsonParser.FIELD_BRAND, "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "enableLuhnCheck", DateTokenConverter.CONVERTER_KEY, "e", "supported", "cvcPolicy", "f", "expiryDatePolicy", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "g", "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class Brand extends ModelObject {

    /* renamed from: b */
    public final String f68371b;

    /* renamed from: c */
    public final Boolean f68372c;

    /* renamed from: d */
    public final Boolean f68373d;

    /* renamed from: e */
    public final String f68374e;

    /* renamed from: f */
    public final String f68375f;

    /* renamed from: g */
    public static final C16801b f68369g = new C16801b(null);
    @JvmField
    public static final Parcelable.Creator<Brand> CREATOR = new ModelObject.Creator(Brand.class);

    /* renamed from: h */
    public static final ModelObject.Serializer<Brand> f68370h = new C16800a();

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"com/adyen/checkout/card/api/model/Brand$a", "Lcom/adyen/checkout/core/model/ModelObject$Serializer;", "Lcom/adyen/checkout/card/api/model/Brand;", "modelObject", "Lorg/json/JSONObject;", "b", "jsonObject", C17296a.f69688o, "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
    /* renamed from: com.adyen.checkout.card.api.model.Brand$a */
    /* loaded from: classes.dex */
    public static final class C16800a implements ModelObject.Serializer<Brand> {
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        /* renamed from: a */
        public Brand deserialize(JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            try {
                return new Brand(JsonUtilsKt.getStringOrNull(jsonObject, AccountRangeJsonParser.FIELD_BRAND), JsonUtilsKt.getBooleanOrNull(jsonObject, "enableLuhnCheck"), JsonUtilsKt.getBooleanOrNull(jsonObject, "supported"), JsonUtilsKt.getStringOrNull(jsonObject, "cvcPolicy"), JsonUtilsKt.getStringOrNull(jsonObject, "expiryDatePolicy"));
            } catch (JSONException e) {
                throw new ModelSerializationException(Brand.class, e);
            }
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        /* renamed from: b */
        public JSONObject serialize(Brand modelObject) {
            Intrinsics.checkNotNullParameter(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt(AccountRangeJsonParser.FIELD_BRAND, modelObject.getBrand());
                jSONObject.putOpt("enableLuhnCheck", modelObject.m53619c());
                jSONObject.putOpt("supported", modelObject.m53617e());
                jSONObject.putOpt("cvcPolicy", modelObject.m53620b());
                jSONObject.putOpt("expiryDatePolicy", modelObject.m53618d());
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(Brand.class, e);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\tR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0016"}, m28432d2 = {"Lcom/adyen/checkout/card/api/model/Brand$b;", "", "Lcom/adyen/checkout/core/model/ModelObject$Serializer;", "Lcom/adyen/checkout/card/api/model/Brand;", ModelUtils.SERIALIZER_FIELD_NAME, "Lcom/adyen/checkout/core/model/ModelObject$Serializer;", C17296a.f69688o, "()Lcom/adyen/checkout/core/model/ModelObject$Serializer;", "getSERIALIZER$annotations", "()V", "", "BRAND", "Ljava/lang/String;", "getBRAND$annotations", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "CVC_POLICY", "ENABLE_LUHN_CHECK", "EXPIRY_DATE_POLICY", "SUPPORTED", "<init>", "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
    /* renamed from: com.adyen.checkout.card.api.model.Brand$b */
    /* loaded from: classes.dex */
    public static final class C16801b {
        public /* synthetic */ C16801b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ModelObject.Serializer<Brand> m53614a() {
            return Brand.f68370h;
        }

        private C16801b() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m28432d2 = {"Lcom/adyen/checkout/card/api/model/Brand$c;", "", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "c", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "e", "f", "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
    /* renamed from: com.adyen.checkout.card.api.model.Brand$c */
    /* loaded from: classes.dex */
    public enum EnumC16802c {
        REQUIRED("required"),
        OPTIONAL("optional"),
        HIDDEN("hidden");
        

        /* renamed from: c */
        public static final C16803a f68376c = new C16803a(null);

        /* renamed from: b */
        public final String f68381b;

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m28432d2 = {"Lcom/adyen/checkout/card/api/model/Brand$c$a;", "", "", "value", "Lcom/adyen/checkout/card/api/model/Brand$c;", C17296a.f69688o, "<init>", "()V", "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
        /* renamed from: com.adyen.checkout.card.api.model.Brand$c$a */
        /* loaded from: classes.dex */
        public static final class C16803a {
            public /* synthetic */ C16803a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            /* renamed from: a */
            public final EnumC16802c m53611a(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                EnumC16802c enumC16802c = EnumC16802c.REQUIRED;
                if (!Intrinsics.areEqual(value, enumC16802c.m53612b())) {
                    enumC16802c = EnumC16802c.OPTIONAL;
                    if (!Intrinsics.areEqual(value, enumC16802c.m53612b())) {
                        enumC16802c = EnumC16802c.HIDDEN;
                        if (!Intrinsics.areEqual(value, enumC16802c.m53612b())) {
                            throw new IllegalArgumentException(Intrinsics.stringPlus("No CvcPolicy matches the value of: ", value));
                        }
                    }
                }
                return enumC16802c;
            }

            private C16803a() {
            }
        }

        EnumC16802c(String str) {
            this.f68381b = str;
        }

        /* renamed from: b */
        public final String m53612b() {
            return this.f68381b;
        }
    }

    public Brand() {
        this(null, null, null, null, null, 31, null);
    }

    /* renamed from: b */
    public final String m53620b() {
        return this.f68374e;
    }

    /* renamed from: c */
    public final Boolean m53619c() {
        return this.f68372c;
    }

    /* renamed from: d */
    public final String m53618d() {
        return this.f68375f;
    }

    /* renamed from: e */
    public final Boolean m53617e() {
        return this.f68373d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Brand) {
            Brand brand = (Brand) obj;
            return Intrinsics.areEqual(this.f68371b, brand.f68371b) && Intrinsics.areEqual(this.f68372c, brand.f68372c) && Intrinsics.areEqual(this.f68373d, brand.f68373d) && Intrinsics.areEqual(this.f68374e, brand.f68374e) && Intrinsics.areEqual(this.f68375f, brand.f68375f);
        }
        return false;
    }

    public final String getBrand() {
        return this.f68371b;
    }

    public int hashCode() {
        String str = this.f68371b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f68372c;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f68373d;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.f68374e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f68375f;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "Brand(brand=" + ((Object) this.f68371b) + ", enableLuhnCheck=" + this.f68372c + ", supported=" + this.f68373d + ", cvcPolicy=" + ((Object) this.f68374e) + ", expiryDatePolicy=" + ((Object) this.f68375f) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        JsonUtils.writeToParcel(parcel, f68370h.serialize(this));
    }

    public /* synthetic */ Brand(String str, Boolean bool, Boolean bool2, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }

    public Brand(String str, Boolean bool, Boolean bool2, String str2, String str3) {
        this.f68371b = str;
        this.f68372c = bool;
        this.f68373d = bool2;
        this.f68374e = str2;
        this.f68375f = str3;
    }
}
