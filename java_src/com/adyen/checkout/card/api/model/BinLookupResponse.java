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
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0011B1\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001f"}, m28432d2 = {"Lcom/adyen/checkout/card/api/model/BinLookupResponse;", "Lcom/adyen/checkout/core/model/ModelObject;", "Landroid/os/Parcel;", "parcel", "", "flags", "", "writeToParcel", "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "", "Lcom/adyen/checkout/card/api/model/Brand;", "b", "Ljava/util/List;", "getBrands", "()Ljava/util/List;", "brands", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "issuingCountryCode", DateTokenConverter.CONVERTER_KEY, "requestId", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "e", "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class BinLookupResponse extends ModelObject {

    /* renamed from: b */
    public final List<Brand> f68366b;

    /* renamed from: c */
    public final String f68367c;

    /* renamed from: d */
    public final String f68368d;

    /* renamed from: e */
    public static final C16799b f68364e = new C16799b(null);
    @JvmField
    public static final Parcelable.Creator<BinLookupResponse> CREATOR = new ModelObject.Creator(BinLookupResponse.class);

    /* renamed from: f */
    public static final ModelObject.Serializer<BinLookupResponse> f68365f = new C16798a();

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"com/adyen/checkout/card/api/model/BinLookupResponse$a", "Lcom/adyen/checkout/core/model/ModelObject$Serializer;", "Lcom/adyen/checkout/card/api/model/BinLookupResponse;", "modelObject", "Lorg/json/JSONObject;", "b", "jsonObject", C17296a.f69688o, "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
    /* renamed from: com.adyen.checkout.card.api.model.BinLookupResponse$a */
    /* loaded from: classes.dex */
    public static final class C16798a implements ModelObject.Serializer<BinLookupResponse> {
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        /* renamed from: a */
        public BinLookupResponse deserialize(JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            try {
                return new BinLookupResponse(ModelUtils.deserializeOptList(jsonObject.optJSONArray("brands"), Brand.f68369g.m53614a()), JsonUtilsKt.getStringOrNull(jsonObject, "issuingCountryCode"), JsonUtilsKt.getStringOrNull(jsonObject, "requestId"));
            } catch (JSONException e) {
                throw new ModelSerializationException(BinLookupResponse.class, e);
            }
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        /* renamed from: b */
        public JSONObject serialize(BinLookupResponse modelObject) {
            Intrinsics.checkNotNullParameter(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("brands", ModelUtils.serializeOptList(modelObject.getBrands(), Brand.f68369g.m53614a()));
                jSONObject.putOpt("issuingCountryCode", modelObject.m53626b());
                jSONObject.putOpt("requestId", modelObject.m53625c());
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(BinLookupResponse.class, e);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\tR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0013"}, m28432d2 = {"Lcom/adyen/checkout/card/api/model/BinLookupResponse$b;", "", "Lcom/adyen/checkout/core/model/ModelObject$Serializer;", "Lcom/adyen/checkout/card/api/model/BinLookupResponse;", ModelUtils.SERIALIZER_FIELD_NAME, "Lcom/adyen/checkout/core/model/ModelObject$Serializer;", C17296a.f69688o, "()Lcom/adyen/checkout/core/model/ModelObject$Serializer;", "getSERIALIZER$annotations", "()V", "", "BRANDS", "Ljava/lang/String;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "ISSUING_COUNTRY_CODE", "REQUEST_ID", "<init>", "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
    /* renamed from: com.adyen.checkout.card.api.model.BinLookupResponse$b */
    /* loaded from: classes.dex */
    public static final class C16799b {
        public /* synthetic */ C16799b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ModelObject.Serializer<BinLookupResponse> m53622a() {
            return BinLookupResponse.f68365f;
        }

        private C16799b() {
        }
    }

    public BinLookupResponse() {
        this(null, null, null, 7, null);
    }

    /* renamed from: b */
    public final String m53626b() {
        return this.f68367c;
    }

    /* renamed from: c */
    public final String m53625c() {
        return this.f68368d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BinLookupResponse) {
            BinLookupResponse binLookupResponse = (BinLookupResponse) obj;
            return Intrinsics.areEqual(this.f68366b, binLookupResponse.f68366b) && Intrinsics.areEqual(this.f68367c, binLookupResponse.f68367c) && Intrinsics.areEqual(this.f68368d, binLookupResponse.f68368d);
        }
        return false;
    }

    public final List<Brand> getBrands() {
        return this.f68366b;
    }

    public int hashCode() {
        List<Brand> list = this.f68366b;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f68367c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f68368d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "BinLookupResponse(brands=" + this.f68366b + ", issuingCountryCode=" + ((Object) this.f68367c) + ", requestId=" + ((Object) this.f68368d) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        JsonUtils.writeToParcel(parcel, f68365f.serialize(this));
    }

    public /* synthetic */ BinLookupResponse(List list, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    public BinLookupResponse(List<Brand> list, String str, String str2) {
        this.f68366b = list;
        this.f68367c = str;
        this.f68368d = str2;
    }
}
