package com.stripe.android.stripe3ds2.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001%B7\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\u0011\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\u0012J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\bHÂ\u0003J?\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\bHÆ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0017HÖ\u0001J\r\u0010\u001c\u001a\u00020\u001dH\u0000¢\u0006\u0002\b\u001eJ\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006&"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;", "Landroid/os/Parcelable;", "name", "", "id", MessageExtension.FIELD_CRITICALITY_INDICATOR, "", MessageExtension.FIELD_DATA, "", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)V", "getCriticalityIndicator", "()Z", "getId$3ds2sdk_release", "()Ljava/lang/String;", "isProcessable", "getName", "component1", "component2", "component2$3ds2sdk_release", "component3", "component4", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toJson", "Lorg/json/JSONObject;", "toJson$3ds2sdk_release", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class MessageExtension implements Parcelable {
    private static final int DATA_VALUE_MAX_LENGTH = 8059;
    public static final String FIELD_CRITICALITY_INDICATOR = "criticalityIndicator";
    public static final String FIELD_DATA = "data";
    public static final String FIELD_ID = "id";
    public static final String FIELD_NAME = "name";
    private static final int ID_MAX_LENGTH = 64;
    private static final int MESSAGE_EXTENSIONS_MAX_COUNT = 10;
    private static final int NAME_MAX_LENGTH = 64;
    private static final List<String> SUPPORTED_MESSAGE_EXTENSIONS;
    private final boolean criticalityIndicator;
    private final Map<String, String> data;

    /* renamed from: id */
    private final String f75441id;
    private final String name;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<MessageExtension> CREATOR = new Creator();

    @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transactions/MessageExtension$Companion;", "", "()V", "DATA_VALUE_MAX_LENGTH", "", "FIELD_CRITICALITY_INDICATOR", "", "FIELD_DATA", "FIELD_ID", "FIELD_NAME", "ID_MAX_LENGTH", "MESSAGE_EXTENSIONS_MAX_COUNT", "NAME_MAX_LENGTH", "SUPPORTED_MESSAGE_EXTENSIONS", "", "fromJson", "Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;", "messageExtensionsJson", "Lorg/json/JSONArray;", "messageExtensionJson", "Lorg/json/JSONObject;", "toJsonArray", ChallengeRequestData.FIELD_MESSAGE_EXTENSION, "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final List<MessageExtension> fromJson(JSONArray jSONArray) throws ChallengeResponseParseException {
            IntRange until;
            int collectionSizeOrDefault;
            if (jSONArray == null) {
                return null;
            }
            until = RangesKt___RangesKt.until(0, jSONArray.length());
            ArrayList<JSONObject> arrayList = new ArrayList();
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                JSONObject optJSONObject = jSONArray.optJSONObject(((IntIterator) it).nextInt());
                if (optJSONObject != null) {
                    arrayList.add(optJSONObject);
                }
            }
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            for (JSONObject jSONObject : arrayList) {
                arrayList2.add(MessageExtension.Companion.fromJson(jSONObject));
            }
            if (arrayList2.size() <= 10) {
                return arrayList2;
            }
            throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat(ChallengeRequestData.FIELD_MESSAGE_EXTENSION);
        }

        @JvmStatic
        public final JSONArray toJsonArray(List<MessageExtension> list) throws JSONException {
            if (list == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            for (MessageExtension messageExtension : list) {
                jSONArray.put(messageExtension.toJson$3ds2sdk_release());
            }
            return jSONArray;
        }

        private Companion() {
        }

        private final MessageExtension fromJson(JSONObject jSONObject) throws ChallengeResponseParseException {
            String name = jSONObject.optString("name");
            if (name.length() <= 64) {
                String id = jSONObject.optString("id");
                if (id.length() <= 64) {
                    HashMap hashMap = new HashMap();
                    JSONObject optJSONObject = jSONObject.optJSONObject(MessageExtension.FIELD_DATA);
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String key = keys.next();
                            String value = optJSONObject.optString(key);
                            if (value.length() <= MessageExtension.DATA_VALUE_MAX_LENGTH) {
                                Intrinsics.checkNotNullExpressionValue(key, "key");
                                Intrinsics.checkNotNullExpressionValue(value, "value");
                                hashMap.put(key, value);
                            } else {
                                throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat("messageExtension.data.value");
                            }
                        }
                    }
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    Intrinsics.checkNotNullExpressionValue(id, "id");
                    return new MessageExtension(name, id, jSONObject.optBoolean(MessageExtension.FIELD_CRITICALITY_INDICATOR), hashMap);
                }
                throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat("messageExtension.id");
            }
            throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat("messageExtension.name");
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Creator implements Parcelable.Creator<MessageExtension> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MessageExtension createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new MessageExtension(readString, readString2, z, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MessageExtension[] newArray(int i) {
            return new MessageExtension[i];
        }
    }

    static {
        List<String> emptyList;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        SUPPORTED_MESSAGE_EXTENSIONS = emptyList;
    }

    public MessageExtension(String name, String id, boolean z, Map<String, String> data) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(data, "data");
        this.name = name;
        this.f75441id = id;
        this.criticalityIndicator = z;
        this.data = data;
    }

    private final Map<String, String> component4() {
        return this.data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MessageExtension copy$default(MessageExtension messageExtension, String str, String str2, boolean z, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = messageExtension.name;
        }
        if ((i & 2) != 0) {
            str2 = messageExtension.f75441id;
        }
        if ((i & 4) != 0) {
            z = messageExtension.criticalityIndicator;
        }
        if ((i & 8) != 0) {
            map = messageExtension.data;
        }
        return messageExtension.copy(str, str2, z, map);
    }

    @JvmStatic
    public static final List<MessageExtension> fromJson(JSONArray jSONArray) throws ChallengeResponseParseException {
        return Companion.fromJson(jSONArray);
    }

    @JvmStatic
    public static final JSONArray toJsonArray(List<MessageExtension> list) throws JSONException {
        return Companion.toJsonArray(list);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2$3ds2sdk_release() {
        return this.f75441id;
    }

    public final boolean component3() {
        return this.criticalityIndicator;
    }

    public final MessageExtension copy(String name, String id, boolean z, Map<String, String> data) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(data, "data");
        return new MessageExtension(name, id, z, data);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageExtension) {
            MessageExtension messageExtension = (MessageExtension) obj;
            return Intrinsics.areEqual(this.name, messageExtension.name) && Intrinsics.areEqual(this.f75441id, messageExtension.f75441id) && this.criticalityIndicator == messageExtension.criticalityIndicator && Intrinsics.areEqual(this.data, messageExtension.data);
        }
        return false;
    }

    public final boolean getCriticalityIndicator() {
        return this.criticalityIndicator;
    }

    public final String getId$3ds2sdk_release() {
        return this.f75441id;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.name.hashCode() * 31) + this.f75441id.hashCode()) * 31;
        boolean z = this.criticalityIndicator;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return ((hashCode + i) * 31) + this.data.hashCode();
    }

    public final boolean isProcessable() {
        return SUPPORTED_MESSAGE_EXTENSIONS.contains(this.name);
    }

    public final JSONObject toJson$3ds2sdk_release() throws JSONException {
        JSONObject put = new JSONObject().put("name", this.name).put("id", this.f75441id).put(FIELD_CRITICALITY_INDICATOR, this.criticalityIndicator).put(FIELD_DATA, new JSONObject(this.data));
        Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n           …D_DATA, JSONObject(data))");
        return put;
    }

    public String toString() {
        return "MessageExtension(name=" + this.name + ", id=" + this.f75441id + ", criticalityIndicator=" + this.criticalityIndicator + ", data=" + this.data + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.name);
        out.writeString(this.f75441id);
        out.writeInt(this.criticalityIndicator ? 1 : 0);
        Map<String, String> map = this.data;
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }

    public /* synthetic */ MessageExtension(String str, String str2, boolean z, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, (i & 8) != 0 ? MapsKt__MapsKt.emptyMap() : map);
    }
}
