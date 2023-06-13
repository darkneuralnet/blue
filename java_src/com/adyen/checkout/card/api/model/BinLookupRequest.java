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
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\b\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u000fB1\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011R\u001f\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001d"}, m28432d2 = {"Lcom/adyen/checkout/card/api/model/BinLookupRequest;", "Lcom/adyen/checkout/core/model/ModelObject;", "Landroid/os/Parcel;", "parcel", "", "flags", "", "writeToParcel", "", "toString", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "encryptedBin", "c", "requestId", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "()Ljava/util/List;", "supportedBrands", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "e", "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class BinLookupRequest extends ModelObject {

    /* renamed from: b */
    public final String f68361b;

    /* renamed from: c */
    public final String f68362c;

    /* renamed from: d */
    public final List<String> f68363d;

    /* renamed from: e */
    public static final C16797b f68359e = new C16797b(null);
    @JvmField
    public static final Parcelable.Creator<BinLookupRequest> CREATOR = new ModelObject.Creator(BinLookupRequest.class);

    /* renamed from: f */
    public static final ModelObject.Serializer<BinLookupRequest> f68360f = new C16796a();

    @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\b"}, m28432d2 = {"com/adyen/checkout/card/api/model/BinLookupRequest$a", "Lcom/adyen/checkout/core/model/ModelObject$Serializer;", "Lcom/adyen/checkout/card/api/model/BinLookupRequest;", "modelObject", "Lorg/json/JSONObject;", "b", "jsonObject", C17296a.f69688o, "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
    /* renamed from: com.adyen.checkout.card.api.model.BinLookupRequest$a */
    /* loaded from: classes.dex */
    public static final class C16796a implements ModelObject.Serializer<BinLookupRequest> {
        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        /* renamed from: a */
        public BinLookupRequest deserialize(JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            try {
                return new BinLookupRequest(JsonUtilsKt.getStringOrNull(jsonObject, "encryptedBin"), JsonUtilsKt.getStringOrNull(jsonObject, "requestId"), JsonUtilsKt.optStringList(jsonObject, "supportedBrands"));
            } catch (JSONException e) {
                throw new ModelSerializationException(BinLookupRequest.class, e);
            }
        }

        @Override // com.adyen.checkout.core.model.ModelObject.Serializer
        /* renamed from: b */
        public JSONObject serialize(BinLookupRequest modelObject) {
            Intrinsics.checkNotNullParameter(modelObject, "modelObject");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("encryptedBin", modelObject.m53633b());
                jSONObject.putOpt("requestId", modelObject.m53632c());
                jSONObject.putOpt("supportedBrands", JsonUtils.serializeOptStringList(modelObject.m53631d()));
                return jSONObject;
            } catch (JSONException e) {
                throw new ModelSerializationException(BinLookupRequest.class, e);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\tR&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"Lcom/adyen/checkout/card/api/model/BinLookupRequest$b;", "", "Lcom/adyen/checkout/core/model/ModelObject$Serializer;", "Lcom/adyen/checkout/card/api/model/BinLookupRequest;", ModelUtils.SERIALIZER_FIELD_NAME, "Lcom/adyen/checkout/core/model/ModelObject$Serializer;", C17296a.f69688o, "()Lcom/adyen/checkout/core/model/ModelObject$Serializer;", "getSERIALIZER$annotations", "()V", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "ENCRYPTED_BIN", "Ljava/lang/String;", "REQUEST_ID", "SUPPORTED_BRANDS", "<init>", "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
    /* renamed from: com.adyen.checkout.card.api.model.BinLookupRequest$b */
    /* loaded from: classes.dex */
    public static final class C16797b {
        public /* synthetic */ C16797b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ModelObject.Serializer<BinLookupRequest> m53628a() {
            return BinLookupRequest.f68360f;
        }

        private C16797b() {
        }
    }

    public BinLookupRequest() {
        this(null, null, null, 7, null);
    }

    /* renamed from: b */
    public final String m53633b() {
        return this.f68361b;
    }

    /* renamed from: c */
    public final String m53632c() {
        return this.f68362c;
    }

    /* renamed from: d */
    public final List<String> m53631d() {
        return this.f68363d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BinLookupRequest) {
            BinLookupRequest binLookupRequest = (BinLookupRequest) obj;
            return Intrinsics.areEqual(this.f68361b, binLookupRequest.f68361b) && Intrinsics.areEqual(this.f68362c, binLookupRequest.f68362c) && Intrinsics.areEqual(this.f68363d, binLookupRequest.f68363d);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f68361b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f68362c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.f68363d;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "BinLookupRequest(encryptedBin=" + ((Object) this.f68361b) + ", requestId=" + ((Object) this.f68362c) + ", supportedBrands=" + this.f68363d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        JsonUtils.writeToParcel(parcel, f68360f.serialize(this));
    }

    public /* synthetic */ BinLookupRequest(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }

    public BinLookupRequest(String str, String str2, List<String> list) {
        this.f68361b = str;
        this.f68362c = str2;
        this.f68363d = list;
    }
}
