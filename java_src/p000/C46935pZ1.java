package p000;

import bo.app.InterfaceC13231y1;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import no.nordicsemi.android.ble.AbstractC26684u0;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 '2\u00020\u0001:\u0001(B\t\b\u0016¢\u0006\u0004\b \u0010!B\u0019\b\u0016\u0012\u0006\u0010\"\u001a\u00020\n\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b \u0010%B1\b\u0012\u0012\u0006\u0010\"\u001a\u00020\n\u0012\u0006\u0010$\u001a\u00020#\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b \u0010&J\u001c\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R$\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006)"}, m28432d2 = {"LpZ1;", "LqZ1;", "", "", "remotePathToLocalAssetMap", "", "c0", AbstractC26684u0.f100690q, "", "f0", "Lorg/json/JSONObject;", "z", "D", "Lorg/json/JSONObject;", "getMessageFields", "()Lorg/json/JSONObject;", "setMessageFields", "(Lorg/json/JSONObject;)V", "messageFields", "E", "Ljava/util/Map;", "F", "Ljava/util/List;", "getAssetUrls", "()Ljava/util/List;", "setAssetUrls", "(Ljava/util/List;)V", "assetUrls", "LzT2;", "h0", "()LzT2;", ChallengeRequestData.FIELD_MESSAGE_TYPE, "<init>", "()V", "jsonObject", "Lbo/app/y1;", "brazeManager", "(Lorg/json/JSONObject;Lbo/app/y1;)V", "(Lorg/json/JSONObject;Lbo/app/y1;Lorg/json/JSONObject;Ljava/util/List;)V", "G", C17296a.f69688o, "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: pZ1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C46935pZ1 extends AbstractC47528qZ1 {

    /* renamed from: G */
    public static final C27316a f103800G = new C27316a(null);

    /* renamed from: D */
    public JSONObject f103801D;

    /* renamed from: E */
    public Map<String, String> f103802E;

    /* renamed from: F */
    public List<String> f103803F;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"LpZ1$a;", "", "", "ASSET_URLS_KEY", "Ljava/lang/String;", "MESSAGE_FIELDS_KEY", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: pZ1$a */
    /* loaded from: classes2.dex */
    public static final class C27316a {
        public /* synthetic */ C27316a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C27316a() {
        }
    }

    public C46935pZ1() {
        Map<String, String> emptyMap;
        List<String> emptyList;
        List<String> emptyList2;
        emptyMap = MapsKt__MapsKt.emptyMap();
        this.f103802E = emptyMap;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f103803F = emptyList;
        this.f103801D = new JSONObject();
        emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        this.f103803F = emptyList2;
    }

    @Override // p000.AbstractC47528qZ1, p000.AbstractC42191hZ1, p000.InterfaceC50985wO1
    /* renamed from: c0 */
    public void mo6943c0(Map<String, String> remotePathToLocalAssetMap) {
        Intrinsics.checkNotNullParameter(remotePathToLocalAssetMap, "remotePathToLocalAssetMap");
        this.f103802E = remotePathToLocalAssetMap;
    }

    @Override // p000.AbstractC42191hZ1, p000.InterfaceC50985wO1
    /* renamed from: f0 */
    public List<String> mo6941f0() {
        return this.f103803F;
    }

    @Override // p000.InterfaceC50985wO1
    /* renamed from: h0 */
    public EnumC52810zT2 mo5008h0() {
        return EnumC52810zT2.HTML;
    }

    /* renamed from: u0 */
    public Map<String, String> m19106u0() {
        return this.f103802E;
    }

    @Override // p000.AbstractC42191hZ1, p000.InterfaceC37933aP1
    /* renamed from: z */
    public JSONObject forJsonPut() {
        JSONObject m36215C = m36215C();
        if (m36215C == null) {
            m36215C = super.forJsonPut();
            try {
                m36215C.put("type", mo5008h0().name());
            } catch (JSONException unused) {
            }
        }
        return m36215C;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C46935pZ1(JSONObject jsonObject, InterfaceC13231y1 brazeManager) {
        this(jsonObject, brazeManager, jsonObject.optJSONObject("message_fields"), C31696Aj2.m115354e(jsonObject.optJSONArray("asset_urls")));
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
    }

    public C46935pZ1(JSONObject jSONObject, InterfaceC13231y1 interfaceC13231y1, JSONObject jSONObject2, List<String> list) {
        super(jSONObject, interfaceC13231y1);
        Map<String, String> emptyMap;
        emptyMap = MapsKt__MapsKt.emptyMap();
        this.f103802E = emptyMap;
        CollectionsKt__CollectionsKt.emptyList();
        this.f103801D = jSONObject2;
        this.f103803F = list;
    }
}
