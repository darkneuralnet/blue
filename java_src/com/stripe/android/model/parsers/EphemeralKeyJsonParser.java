package com.stripe.android.model.parsers;

import com.stripe.android.EphemeralKey;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/EphemeralKeyJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/EphemeralKey;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class EphemeralKeyJsonParser implements ModelJsonParser<EphemeralKey> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_ASSOCIATED_OBJECTS = "associated_objects";
    @Deprecated
    private static final String FIELD_CREATED = "created";
    @Deprecated
    private static final String FIELD_EXPIRES = "expires";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_LIVEMODE = "livemode";
    @Deprecated
    private static final String FIELD_OBJECT = "object";
    @Deprecated
    private static final String FIELD_SECRET = "secret";
    @Deprecated
    private static final String FIELD_TYPE = "type";

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/model/parsers/EphemeralKeyJsonParser$Companion;", "", "()V", "FIELD_ASSOCIATED_OBJECTS", "", "FIELD_CREATED", "FIELD_EXPIRES", "FIELD_ID", "FIELD_LIVEMODE", "FIELD_OBJECT", "FIELD_SECRET", "FIELD_TYPE", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public EphemeralKey parse(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        long j = json.getLong("created");
        long j2 = json.getLong(FIELD_EXPIRES);
        String id = json.getString("id");
        boolean z = json.getBoolean(FIELD_LIVEMODE);
        String objectType = json.getString(FIELD_OBJECT);
        String secret = json.getString(FIELD_SECRET);
        JSONObject jSONObject = json.getJSONArray(FIELD_ASSOCIATED_OBJECTS).getJSONObject(0);
        String type = jSONObject.getString("type");
        String objectId = jSONObject.getString("id");
        Intrinsics.checkNotNullExpressionValue(objectId, "objectId");
        Intrinsics.checkNotNullExpressionValue(id, "id");
        Intrinsics.checkNotNullExpressionValue(objectType, "objectType");
        Intrinsics.checkNotNullExpressionValue(secret, "secret");
        Intrinsics.checkNotNullExpressionValue(type, "type");
        return new EphemeralKey(objectId, j, j2, id, z, objectType, secret, type);
    }
}
