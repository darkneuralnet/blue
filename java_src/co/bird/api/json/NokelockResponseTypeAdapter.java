package co.bird.api.json;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.NokelockResponseType;
import co.bird.android.model.wire.WireNokelockInsertedData;
import co.bird.android.model.wire.WireNokelockLockingData;
import co.bird.android.model.wire.WireNokelockResponseData;
import co.bird.android.model.wire.WireNokelockStateData;
import co.bird.android.model.wire.WireNokelockTokenResponseData;
import co.bird.android.model.wire.WireNokelockUnknownData;
import co.bird.android.model.wire.WireNokelockUnlockData;
import co.bird.api.response.NokelockResponse;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.google.gson.JsonParseException;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\f"}, m28432d2 = {"Lco/bird/api/json/NokelockResponseTypeAdapter;", "Lvi2;", "Lco/bird/api/response/NokelockResponse;", "Lyi2;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lui2;", CoreConstants.CONTEXT_SCOPE_VALUE, C17296a.f69688o, "<init>", "()V", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class NokelockResponseTypeAdapter implements InterfaceC50581vi2<NokelockResponse> {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.api.json.NokelockResponseTypeAdapter$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C16710a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NokelockResponseType.values().length];
            try {
                iArr[NokelockResponseType.TOKEN_RESPONSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NokelockResponseType.UNLOCK_RESPONSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NokelockResponseType.LOCKING_RESPONSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NokelockResponseType.STATE_RESPONSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NokelockResponseType.INSERTED_NOTIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NokelockResponseType.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // p000.InterfaceC50581vi2
    /* renamed from: a */
    public NokelockResponse deserialize(AbstractC52360yi2 json, Type typeOfT, InterfaceC49989ui2 context) throws JsonParseException {
        WireNokelockResponseData wireNokelockTokenResponseData;
        WireNokelockResponseData wireNokelockResponseData;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(typeOfT, "typeOfT");
        Intrinsics.checkNotNullParameter(context, "context");
        Object mo9858a = context.mo9858a(json.m2885e().m83135y("type"), NokelockResponseType.class);
        Intrinsics.checkNotNull(mo9858a);
        NokelockResponseType nokelockResponseType = (NokelockResponseType) mo9858a;
        AbstractC52360yi2 m83135y = json.m2885e().m83135y(MessageExtension.FIELD_DATA);
        switch (C16710a.$EnumSwitchMapping$0[nokelockResponseType.ordinal()]) {
            case 1:
                AbstractC52360yi2 m83135y2 = m83135y.m2885e().m83135y("requests");
                String mo2882j = m83135y2.m2885e().m83135y("unlock").mo2882j();
                Intrinsics.checkNotNullExpressionValue(mo2882j, "requestsJson.asJsonObject[\"unlock\"].asString");
                String mo2882j2 = m83135y2.m2885e().m83135y(TransferTable.COLUMN_STATE).mo2882j();
                Intrinsics.checkNotNullExpressionValue(mo2882j2, "requestsJson.asJsonObject[\"state\"].asString");
                String mo2882j3 = m83135y2.m2885e().m83135y("locking").mo2882j();
                Intrinsics.checkNotNullExpressionValue(mo2882j3, "requestsJson.asJsonObject[\"locking\"].asString");
                wireNokelockTokenResponseData = new WireNokelockTokenResponseData(mo2882j, mo2882j2, mo2882j3);
                wireNokelockResponseData = wireNokelockTokenResponseData;
                break;
            case 2:
                wireNokelockTokenResponseData = new WireNokelockUnlockData(m83135y.m2885e().m83135y("success").mo2888a());
                wireNokelockResponseData = wireNokelockTokenResponseData;
                break;
            case 3:
                wireNokelockTokenResponseData = new WireNokelockLockingData(m83135y.m2885e().m83135y("success").mo2888a());
                wireNokelockResponseData = wireNokelockTokenResponseData;
                break;
            case 4:
                wireNokelockTokenResponseData = new WireNokelockStateData(m83135y.m2885e().m83135y("is_locked").mo2888a());
                wireNokelockResponseData = wireNokelockTokenResponseData;
                break;
            case 5:
                wireNokelockTokenResponseData = new WireNokelockInsertedData(m83135y.m2885e().m83135y("success").mo2888a());
                wireNokelockResponseData = wireNokelockTokenResponseData;
                break;
            case 6:
                wireNokelockResponseData = WireNokelockUnknownData.INSTANCE;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new NokelockResponse(nokelockResponseType, wireNokelockResponseData);
    }
}
