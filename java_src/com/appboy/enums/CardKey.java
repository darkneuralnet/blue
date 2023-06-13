package com.appboy.enums;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b/\b\u0087\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\f\rB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0¨\u00061"}, m28432d2 = {"Lcom/appboy/enums/CardKey;", "", "", "feedKey", "Ljava/lang/String;", "getFeedKey", "()Ljava/lang/String;", "contentCardsKey", "getContentCardsKey", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Companion", C17296a.f69688o, "Provider", "ID", "VIEWED", "CREATED", "EXPIRES_AT", "EXTRAS", "OPEN_URI_IN_WEBVIEW", "TYPE", "CATEGORIES", "UPDATED", "DISMISSED", "REMOVED", "PINNED", "DISMISSIBLE", "IS_TEST", "READ", "CLICKED", "BANNER_IMAGE_IMAGE", "BANNER_IMAGE_URL", "BANNER_IMAGE_DOMAIN", "BANNER_IMAGE_ASPECT_RATIO", "CAPTIONED_IMAGE_IMAGE", "CAPTIONED_IMAGE_TITLE", "CAPTIONED_IMAGE_DESCRIPTION", "CAPTIONED_IMAGE_URL", "CAPTIONED_IMAGE_DOMAIN", "CAPTIONED_IMAGE_ASPECT_RATIO", "TEXT_ANNOUNCEMENT_TITLE", "TEXT_ANNOUNCEMENT_DESCRIPTION", "TEXT_ANNOUNCEMENT_URL", "TEXT_ANNOUNCEMENT_DOMAIN", "SHORT_NEWS_IMAGE", "SHORT_NEWS_TITLE", "SHORT_NEWS_DESCRIPTION", "SHORT_NEWS_URL", "SHORT_NEWS_DOMAIN", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* loaded from: classes.dex */
public enum CardKey {
    ID("id", "id"),
    VIEWED("viewed", "v"),
    CREATED(AnalyticsRequestV2.PARAM_CREATED, "ca"),
    EXPIRES_AT("expires_at", "ea"),
    EXTRAS("extras", "e"),
    OPEN_URI_IN_WEBVIEW("use_webview", "uw"),
    TYPE("type", "tp"),
    CATEGORIES("categories", ""),
    UPDATED("updated", ""),
    DISMISSED("", DateTokenConverter.CONVERTER_KEY),
    REMOVED("", "r"),
    PINNED("", "p"),
    DISMISSIBLE("", "db"),
    IS_TEST("", "t"),
    READ("", "read"),
    CLICKED("", "cl"),
    BANNER_IMAGE_IMAGE(Entry.TYPE_IMAGE, "i"),
    BANNER_IMAGE_URL("url", "u"),
    BANNER_IMAGE_DOMAIN("domain", ""),
    BANNER_IMAGE_ASPECT_RATIO("aspect_ratio", "ar"),
    CAPTIONED_IMAGE_IMAGE(Entry.TYPE_IMAGE, "i"),
    CAPTIONED_IMAGE_TITLE("title", "tt"),
    CAPTIONED_IMAGE_DESCRIPTION("description", "ds"),
    CAPTIONED_IMAGE_URL("url", "u"),
    CAPTIONED_IMAGE_DOMAIN("domain", "dm"),
    CAPTIONED_IMAGE_ASPECT_RATIO("aspect_ratio", "ar"),
    TEXT_ANNOUNCEMENT_TITLE("title", "tt"),
    TEXT_ANNOUNCEMENT_DESCRIPTION("description", "ds"),
    TEXT_ANNOUNCEMENT_URL("url", "u"),
    TEXT_ANNOUNCEMENT_DOMAIN("domain", "dm"),
    SHORT_NEWS_IMAGE(Entry.TYPE_IMAGE, "i"),
    SHORT_NEWS_TITLE("title", "tt"),
    SHORT_NEWS_DESCRIPTION("description", "ds"),
    SHORT_NEWS_URL("url", "u"),
    SHORT_NEWS_DOMAIN("domain", "dm");
    
    public static final C16938a Companion = new C16938a(null);
    private static final Map<String, CardType> cardTypeMap;
    private final String contentCardsKey;
    private final String feedKey;

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0012"}, m28432d2 = {"Lcom/appboy/enums/CardKey$Provider;", "", "Lcom/appboy/enums/CardKey;", "key", "", "getKey", "Lorg/json/JSONObject;", "jsonObject", "Lcom/appboy/enums/CardType;", "getCardTypeFromJson", "", "isContentCardProvider", "Z", "()Z", "<init>", "(Z)V", "Companion", C17296a.f69688o, "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class Provider {
        private final boolean isContentCardProvider;
        public static final C16936a Companion = new C16936a(null);
        public static final Provider CONTENT_CARDS = new Provider(true);
        public static final Provider NEWS_FEED = new Provider(false);

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"Lcom/appboy/enums/CardKey$Provider$a;", "", "Lcom/appboy/enums/CardKey$Provider;", "CONTENT_CARDS", "Lcom/appboy/enums/CardKey$Provider;", "NEWS_FEED", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
        /* renamed from: com.appboy.enums.CardKey$Provider$a */
        /* loaded from: classes.dex */
        public static final class C16936a {
            public /* synthetic */ C16936a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C16936a() {
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: com.appboy.enums.CardKey$Provider$b */
        /* loaded from: classes.dex */
        public static final class C16937b extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ JSONObject f68624b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C16937b(JSONObject jSONObject) {
                super(0);
                this.f68624b = jSONObject;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return Intrinsics.stringPlus("Short News card doesn't contain image url, parsing type as Text Announcement. JSON: ", this.f68624b);
            }
        }

        public Provider(boolean z) {
            this.isContentCardProvider = z;
        }

        public final CardType getCardTypeFromJson(JSONObject jsonObject) {
            boolean z;
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            String m115351h = C31696Aj2.m115351h(jsonObject, getKey(CardKey.TYPE));
            boolean z2 = false;
            if (m115351h != null && m115351h.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z && this.isContentCardProvider && Intrinsics.areEqual(m115351h, "short_news")) {
                String m115351h2 = C31696Aj2.m115351h(jsonObject, getKey(CardKey.SHORT_NEWS_IMAGE));
                if (m115351h2 == null || m115351h2.length() == 0) {
                    z2 = true;
                }
                if (z2) {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C16937b(jsonObject), 6, null);
                    m115351h = "text_announcement";
                }
            }
            if (CardKey.cardTypeMap.containsKey(m115351h)) {
                return (CardType) CardKey.cardTypeMap.get(m115351h);
            }
            return CardType.DEFAULT;
        }

        public final String getKey(CardKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (this.isContentCardProvider) {
                return key.getContentCardsKey();
            }
            return key.getFeedKey();
        }

        public final boolean isContentCardProvider() {
            return this.isContentCardProvider;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m28432d2 = {"Lcom/appboy/enums/CardKey$a;", "", "", "BANNER_IMAGE_KEY", "Ljava/lang/String;", "CAPTIONED_IMAGE_KEY", "CONTROL_KEY", "SHORT_NEWS_KEY", "TEXT_ANNOUNCEMENT_KEY", "", "Lcom/appboy/enums/CardType;", "cardTypeMap", "Ljava/util/Map;", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: com.appboy.enums.CardKey$a */
    /* loaded from: classes.dex */
    public static final class C16938a {
        public /* synthetic */ C16938a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16938a() {
        }
    }

    static {
        Map<String, CardType> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("banner_image", CardType.BANNER), TuplesKt.m28425to("captioned_image", CardType.CAPTIONED_IMAGE), TuplesKt.m28425to("text_announcement", CardType.TEXT_ANNOUNCEMENT), TuplesKt.m28425to("short_news", CardType.SHORT_NEWS), TuplesKt.m28425to("control", CardType.CONTROL));
        cardTypeMap = mapOf;
    }

    CardKey(String str, String str2) {
        this.feedKey = str;
        this.contentCardsKey = str2;
    }

    public final String getContentCardsKey() {
        return this.contentCardsKey;
    }

    public final String getFeedKey() {
        return this.feedKey;
    }
}
