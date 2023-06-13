package bo.app;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
@Metadata(m28434bv = {}, m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u0011\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, m28432d2 = {"Lbo/app/x;", "", "", "lastCardUpdatedAt", "J", "b", "()J", "lastFullSyncAt", "c", "", "isFullSync", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "Lorg/json/JSONArray;", "contentCards", "Lorg/json/JSONArray;", C17296a.f69688o, "()Lorg/json/JSONArray;", "Lorg/json/JSONObject;", "jsonObject", "<init>", "(Lorg/json/JSONObject;)V", "", "serializedCardJson", "(Ljava/lang/String;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.x */
/* loaded from: classes.dex */
public final class C13197x {

    /* renamed from: e */
    public static final C13198a f59403e = new C13198a(null);

    /* renamed from: a */
    private final long f59404a;

    /* renamed from: b */
    private final long f59405b;

    /* renamed from: c */
    private final boolean f59406c;

    /* renamed from: d */
    private final JSONArray f59407d;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, m28432d2 = {"Lbo/app/x$a;", "", "", "CONTENT_CARDS_KEY", "Ljava/lang/String;", "IS_FULL_SYNC_KEY", "LAST_CARD_UPDATED_AT_KEY", "LAST_FULL_SYNC_AT_KEY", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.x$a */
    /* loaded from: classes.dex */
    public static final class C13198a {
        public /* synthetic */ C13198a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C13198a() {
        }
    }

    public C13197x(JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.f59404a = jsonObject.optLong("last_card_updated_at", -1L);
        this.f59405b = jsonObject.optLong("last_full_sync_at", -1L);
        this.f59406c = jsonObject.optBoolean("full_sync", false);
        this.f59407d = jsonObject.optJSONArray("cards");
    }

    /* renamed from: a */
    public final JSONArray m62829a() {
        return this.f59407d;
    }

    /* renamed from: b */
    public final long m62828b() {
        return this.f59404a;
    }

    /* renamed from: c */
    public final long m62827c() {
        return this.f59405b;
    }

    /* renamed from: d */
    public final boolean m62826d() {
        return this.f59406c;
    }

    public C13197x(String serializedCardJson) {
        Intrinsics.checkNotNullParameter(serializedCardJson, "serializedCardJson");
        this.f59406c = false;
        this.f59404a = -1L;
        this.f59405b = -1L;
        this.f59407d = new JSONArray().put(new JSONObject(serializedCardJson));
    }
}
