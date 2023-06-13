package com.stripe.android.model.parsers;

import com.stripe.android.core.model.StripeJsonUtils;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.Token;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/model/parsers/TokenJsonParser;", "Lcom/stripe/android/core/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Token;", "()V", "parse", "json", "Lorg/json/JSONObject;", "Companion", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class TokenJsonParser implements ModelJsonParser<Token> {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String FIELD_CREATED = "created";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_LIVEMODE = "livemode";
    @Deprecated
    private static final String FIELD_TYPE = "type";
    @Deprecated
    private static final String FIELD_USED = "used";

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/model/parsers/TokenJsonParser$Companion;", "", "()V", "FIELD_CREATED", "", "FIELD_ID", "FIELD_LIVEMODE", "FIELD_TYPE", "FIELD_USED", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
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
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Token.Type.values().length];
            try {
                iArr[Token.Type.Card.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Token.Type.BankAccount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.stripe.android.core.model.parsers.ModelJsonParser
    public Token parse(JSONObject json) {
        Token token;
        Intrinsics.checkNotNullParameter(json, "json");
        String optString = StripeJsonUtils.optString(json, "id");
        StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
        Long optLong = stripeJsonUtils.optLong(json, "created");
        Token.Type fromCode = Token.Type.Companion.fromCode(StripeJsonUtils.optString(json, "type"));
        if (fromCode == null || optString == null || optLong == null) {
            return null;
        }
        boolean optBoolean = stripeJsonUtils.optBoolean(json, FIELD_USED);
        boolean optBoolean2 = stripeJsonUtils.optBoolean(json, FIELD_LIVEMODE);
        Date date = new Date(TimeUnit.SECONDS.toMillis(optLong.longValue()));
        int i = WhenMappings.$EnumSwitchMapping$0[fromCode.ordinal()];
        if (i == 1) {
            Token.Type type = Token.Type.Card;
            JSONObject optJSONObject = json.optJSONObject(type.getCode());
            if (optJSONObject == null) {
                return null;
            }
            token = new Token(optString, type, date, optBoolean2, optBoolean, null, new CardJsonParser().parse(optJSONObject), 32, null);
        } else if (i != 2) {
            token = new Token(optString, fromCode, date, optBoolean2, optBoolean, null, null, 96, null);
        } else {
            Token.Type type2 = Token.Type.BankAccount;
            JSONObject optJSONObject2 = json.optJSONObject(type2.getCode());
            if (optJSONObject2 == null) {
                return null;
            }
            token = new Token(optString, type2, date, optBoolean2, optBoolean, new BankAccountJsonParser().parse(optJSONObject2), null, 64, null);
        }
        return token;
    }
}
