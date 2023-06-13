package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.enums.CardKey;
import com.appboy.models.cards.Card;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\"\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0012B'\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u00101\u001a\u00020\t\u0012\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0005H\u0007J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0007J \u0010\u0012\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0007J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\tH\u0007J\u001a\u0010\u0012\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u0007J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J\u0010\u0010\u001e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u001fH\u0007J\u0016\u0010\u001c\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u001fH\u0007J\u0016\u0010\u0012\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u001fH\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007R\u0014\u0010$\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010%\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010#R\u0011\u0010&\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010#R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0'8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010(R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0'8G¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0'8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010(R\u0014\u0010.\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010-¨\u00066"}, m28432d2 = {"Lbo/app/y;", "LkO1;", "LfA0;", "Lorg/json/JSONObject;", "serverCardJson", "", "b", "", "i", "", "cardId", "markCardAsVisuallyRead", "markCardAsViewed", "markCardAsClicked", "markCardAsDismissed", "Lbo/app/x;", "contentCardsResponse", "userId", C17296a.f69688o, "isFromOfflineStorage", "Lcom/appboy/models/cards/Card;", "card", "Lcom/appboy/enums/CardKey;", "cardKey", "", "value", DateTokenConverter.CONVERTER_KEY, "cardJson", "c", "f", "e", "", "cardIdsToRetain", "", "g", "()J", "localStorageLastUpdatedTime", "lastCardUpdatedAt", "lastFullSyncAt", "", "()Ljava/util/Set;", "dismissedCardIdSet", "h", "testCardIdSet", "expiredCardIdSet", "()LfA0;", "cachedCardsAsEvent", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "apiKey", "Lbo/app/y1;", "brazeManager", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lbo/app/y1;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.y */
/* loaded from: classes.dex */
public final class C13205y implements InterfaceC43871kO1<C40779fA0> {

    /* renamed from: f */
    public static final C13206a f59416f = new C13206a(null);

    /* renamed from: g */
    private static final Set<String> f59417g;

    /* renamed from: a */
    private final String f59418a;

    /* renamed from: b */
    private final InterfaceC13231y1 f59419b;

    /* renamed from: c */
    private final SharedPreferences f59420c;

    /* renamed from: d */
    private final SharedPreferences f59421d;

    /* renamed from: e */
    private final InterfaceC12518a2 f59422e;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u001a\u0010\u0007\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m28432d2 = {"Lbo/app/y$a;", "", "Lorg/json/JSONObject;", "cachedCard", "serverCard", "", "b", C17296a.f69688o, "json", "Lcom/appboy/enums/CardKey;", "cardKey", "", "CARD_CACHE_FILE_NAME", "Ljava/lang/String;", "DISMISSALS_KEY", "EXPIRED_CARDS_KEY", "LAST_CARD_UPDATED_AT_KEY", "LAST_FULL_SYNC_AT_KEY", "METADATA_CACHE_FILE_NAME", "STORAGE_LAST_UPDATED_TIMESTAMP_KEY", "TEST_CARDS_KEY", "", "localStateMergeKeys", "Ljava/util/Set;", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y$a */
    /* loaded from: classes.dex */
    public static final class C13206a {
        public /* synthetic */ C13206a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final JSONObject m62790a(JSONObject jSONObject, JSONObject serverCard) {
            Intrinsics.checkNotNullParameter(serverCard, "serverCard");
            if (jSONObject == null) {
                return serverCard;
            }
            JSONObject jSONObject2 = new JSONObject();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject2.put(next, jSONObject.get(next));
            }
            Iterator<String> keys2 = serverCard.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                if (C13205y.f59417g.contains(next2)) {
                    jSONObject2.put(next2, jSONObject.getBoolean(next2) || serverCard.getBoolean(next2));
                } else {
                    jSONObject2.put(next2, serverCard.get(next2));
                }
            }
            return jSONObject2;
        }

        @JvmStatic
        /* renamed from: b */
        public final boolean m62789b(JSONObject jSONObject, JSONObject serverCard) {
            Intrinsics.checkNotNullParameter(serverCard, "serverCard");
            if (jSONObject == null) {
                return false;
            }
            String contentCardsKey = CardKey.CREATED.getContentCardsKey();
            if (!jSONObject.has(contentCardsKey) || !serverCard.has(contentCardsKey) || jSONObject.getLong(contentCardsKey) <= serverCard.getLong(contentCardsKey)) {
                return false;
            }
            return true;
        }

        private C13206a() {
        }

        @JvmStatic
        /* renamed from: a */
        public final boolean m62791a(JSONObject json, CardKey cardKey) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(cardKey, "cardKey");
            String contentCardsKey = cardKey.getContentCardsKey();
            if (json.has(contentCardsKey)) {
                return json.getBoolean(contentCardsKey);
            }
            return false;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y$b */
    /* loaded from: classes.dex */
    public static final class C13207b extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f59423b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13207b(String str) {
            super(0);
            this.f59423b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Adding card to test cache: ", this.f59423b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y$c */
    /* loaded from: classes.dex */
    public static final class C13208c extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f59424b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13208c(String str) {
            super(0);
            this.f59424b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Deleting expired card from storage with id: ", this.f59424b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y$d */
    /* loaded from: classes.dex */
    public static final class C13209d extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f59425b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13209d(String str) {
            super(0);
            this.f59425b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Card not present in storage for id: ", this.f59425b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y$e */
    /* loaded from: classes.dex */
    public static final class C13210e extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f59426b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13210e(String str) {
            super(0);
            this.f59426b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to read card json from storage. Json: ", this.f59426b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y$f */
    /* loaded from: classes.dex */
    public static final class C13211f extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f59427b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13211f(String str) {
            super(0);
            this.f59427b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Removing card from test cache: ", this.f59427b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y$g */
    /* loaded from: classes.dex */
    public static final class C13212g extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f59428b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13212g(String str) {
            super(0);
            this.f59428b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Removing card from storage with id: ", this.f59428b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y$h */
    /* loaded from: classes.dex */
    public static final class C13213h extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13213h f59429b = new C13213h();

        public C13213h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "The server card received is older than the cached card. Discarding the server card.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y$i */
    /* loaded from: classes.dex */
    public static final class C13214i extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f59430b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13214i(JSONObject jSONObject) {
            super(0);
            this.f59430b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Server card json: ", this.f59430b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y$j */
    /* loaded from: classes.dex */
    public static final class C13215j extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f59431b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13215j(JSONObject jSONObject) {
            super(0);
            this.f59431b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Cached card json: ", this.f59431b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y$k */
    /* loaded from: classes.dex */
    public static final class C13216k extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f59432b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13216k(String str) {
            super(0);
            this.f59432b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Server card is marked as removed. Removing from card storage with id: ", this.f59432b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y$l */
    /* loaded from: classes.dex */
    public static final class C13217l extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f59433b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13217l(JSONObject jSONObject) {
            super(0);
            this.f59433b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Server card was locally dismissed already. Not adding card to storage. Server card: ", this.f59433b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y$m */
    /* loaded from: classes.dex */
    public static final class C13218m extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ JSONObject f59434b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13218m(JSONObject jSONObject) {
            super(0);
            this.f59434b = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Server card has expired already. Not adding card to storage. Server card: ", this.f59434b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y$n */
    /* loaded from: classes.dex */
    public static final class C13219n extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f59435b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13219n(String str) {
            super(0);
            this.f59435b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Server card is marked as dismissed. Adding to dismissed cached and removing from card storage with id: ", this.f59435b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y$o */
    /* loaded from: classes.dex */
    public static final class C13220o extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ String f59436b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13220o(String str) {
            super(0);
            this.f59436b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Can't update card field. Json cannot be parsed from disk or is not present. Id: ", this.f59436b);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y$p */
    /* loaded from: classes.dex */
    public static final class C13221p extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ Object f59437b;

        /* renamed from: c */
        final /* synthetic */ CardKey f59438c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13221p(Object obj, CardKey cardKey) {
            super(0);
            this.f59437b = obj;
            this.f59438c = cardKey;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to update card json field to " + this.f59437b + " with key: " + this.f59438c;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "", "it", "", C17296a.f69688o, "(I)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y$q */
    /* loaded from: classes.dex */
    public static final class C13222q extends Lambda implements Function1<Integer, Boolean> {

        /* renamed from: b */
        final /* synthetic */ JSONArray f59439b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13222q(JSONArray jSONArray) {
            super(1);
            this.f59439b = jSONArray;
        }

        /* renamed from: a */
        public final Boolean m62773a(int i) {
            return Boolean.valueOf(this.f59439b.opt(i) instanceof JSONObject);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return m62773a(num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "", "it", C17296a.f69688o, "(I)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y$r */
    /* loaded from: classes.dex */
    public static final class C13223r extends Lambda implements Function1<Integer, JSONObject> {

        /* renamed from: b */
        final /* synthetic */ JSONArray f59440b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13223r(JSONArray jSONArray) {
            super(1);
            this.f59440b = jSONArray;
        }

        /* renamed from: a */
        public final JSONObject m62772a(int i) {
            Object obj = this.f59440b.get(i);
            if (obj != null) {
                return (JSONObject) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [org.json.JSONObject, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ JSONObject invoke(Integer num) {
            return m62772a(num.intValue());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y$s */
    /* loaded from: classes.dex */
    public static final class C13224s extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C13224s f59441b = new C13224s();

        public C13224s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Input user id was null. Defaulting to the empty user id";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y$t */
    /* loaded from: classes.dex */
    public static final class C13225t extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef<String> f59442b;

        /* renamed from: c */
        final /* synthetic */ C13205y f59443c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13225t(Ref.ObjectRef<String> objectRef, C13205y c13205y) {
            super(0);
            this.f59442b = objectRef;
            this.f59443c = c13205y;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "The received cards are for user " + ((Object) this.f59442b.element) + " and the current user is " + this.f59443c.f59418a + " , the cards will be discarded and no changes will be made.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.y$u */
    /* loaded from: classes.dex */
    public static final class C13226u extends Lambda implements Function0<String> {

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef<String> f59444b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13226u(Ref.ObjectRef<String> objectRef) {
            super(0);
            this.f59444b = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Updating offline Content Cards for user with id: ", this.f59444b.element);
        }
    }

    static {
        Set<String> of;
        of = SetsKt__SetsKt.setOf((Object[]) new String[]{CardKey.VIEWED.getContentCardsKey(), CardKey.DISMISSED.getContentCardsKey()});
        f59417g = of;
    }

    public C13205y(Context context, String userId, String apiKey, InterfaceC13231y1 brazeManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        this.f59418a = userId;
        this.f59419b = brazeManager;
        String m30601c = C43318jS5.m30601c(context, userId, apiKey);
        SharedPreferences sharedPreferences = context.getSharedPreferences(Intrinsics.stringPlus("com.appboy.storage.content_cards_storage_provider.metadata", m30601c), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ix, Context.MODE_PRIVATE)");
        this.f59421d = sharedPreferences;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences(Intrinsics.stringPlus("com.appboy.storage.content_cards_storage_provider.cards", m30601c), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "context.getSharedPrefere…ix, Context.MODE_PRIVATE)");
        this.f59420c = sharedPreferences2;
        this.f59422e = new C13185w();
    }

    /* renamed from: g */
    private final long m62794g() {
        return this.f59421d.getLong("last_storage_update_timestamp", 0L);
    }

    /* renamed from: i */
    private final void m62792i() {
        this.f59421d.edit().putLong("last_storage_update_timestamp", C46287oT0.m21027i()).apply();
    }

    /* renamed from: b */
    public C40779fA0 m62807b() {
        return m62808a(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
        r0 = kotlin.collections.CollectionsKt___CollectionsKt.filterNotNull(r0);
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Set<String> m62803c() {
        Set emptySet;
        Set<String> mutableSet;
        List filterNotNull;
        Set<String> stringSet = this.f59421d.getStringSet("dismissed", new HashSet());
        Set<String> mutableSet2 = (stringSet == null || filterNotNull == null) ? null : CollectionsKt___CollectionsKt.toMutableSet(filterNotNull);
        if (mutableSet2 == null) {
            emptySet = SetsKt__SetsKt.emptySet();
            mutableSet = CollectionsKt___CollectionsKt.toMutableSet(emptySet);
            return mutableSet;
        }
        return mutableSet2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
        r0 = kotlin.collections.CollectionsKt___CollectionsKt.filterNotNull(r0);
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Set<String> m62800d() {
        Set emptySet;
        Set<String> mutableSet;
        List filterNotNull;
        Set<String> stringSet = this.f59421d.getStringSet("expired", new HashSet());
        Set<String> mutableSet2 = (stringSet == null || filterNotNull == null) ? null : CollectionsKt___CollectionsKt.toMutableSet(filterNotNull);
        if (mutableSet2 == null) {
            emptySet = SetsKt__SetsKt.emptySet();
            mutableSet = CollectionsKt___CollectionsKt.toMutableSet(emptySet);
            return mutableSet;
        }
        return mutableSet2;
    }

    /* renamed from: e */
    public final long m62798e() {
        return this.f59421d.getLong("last_card_updated_at", 0L);
    }

    /* renamed from: f */
    public final long m62796f() {
        return this.f59421d.getLong("last_full_sync_at", 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
        r0 = kotlin.collections.CollectionsKt___CollectionsKt.filterNotNull(r0);
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Set<String> m62793h() {
        Set<String> set;
        Set emptySet;
        Set<String> mutableSet;
        List filterNotNull;
        Set<String> stringSet = this.f59421d.getStringSet("test", new HashSet());
        if (stringSet == null || filterNotNull == null) {
            set = null;
        } else {
            set = CollectionsKt___CollectionsKt.toMutableSet(filterNotNull);
        }
        if (set == null) {
            emptySet = SetsKt__SetsKt.emptySet();
            mutableSet = CollectionsKt___CollectionsKt.toMutableSet(emptySet);
            return mutableSet;
        }
        return set;
    }

    @Override // p000.InterfaceC43871kO1
    public void markCardAsClicked(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        m62811a(cardId, CardKey.CLICKED, Boolean.TRUE);
    }

    @Override // p000.InterfaceC43871kO1
    public void markCardAsDismissed(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        m62812a(cardId);
        m62810a(cardId, (JSONObject) null);
    }

    @Override // p000.InterfaceC43871kO1
    public void markCardAsViewed(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        m62811a(cardId, CardKey.VIEWED, Boolean.TRUE);
    }

    @Override // p000.InterfaceC43871kO1
    public void markCardAsVisuallyRead(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        m62811a(cardId, CardKey.READ, Boolean.TRUE);
    }

    /* renamed from: b */
    private final boolean m62804b(JSONObject jSONObject) {
        Set<String> m62803c = m62803c();
        Set<String> m62800d = m62800d();
        String serverCardId = jSONObject.getString(CardKey.ID.getContentCardsKey());
        Intrinsics.checkNotNullExpressionValue(serverCardId, "serverCardId");
        JSONObject m62799d = m62799d(serverCardId);
        C13206a c13206a = f59416f;
        if (c13206a.m62789b(m62799d, jSONObject)) {
            C43664k20 c43664k20 = C43664k20.f93782a;
            C43664k20.m29442e(c43664k20, this, C43664k20.EnumC25082a.I, null, false, C13213h.f59429b, 6, null);
            C43664k20.m29442e(c43664k20, this, null, null, false, new C13214i(jSONObject), 7, null);
            C43664k20.m29442e(c43664k20, this, null, null, false, new C13215j(jSONObject), 7, null);
            return false;
        } else if (c13206a.m62791a(jSONObject, CardKey.REMOVED)) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C13216k(serverCardId), 7, null);
            m62797e(serverCardId);
            m62795f(serverCardId);
            m62810a(serverCardId, (JSONObject) null);
            return true;
        } else if (m62803c.contains(serverCardId)) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C13217l(jSONObject), 7, null);
            return true;
        } else if (m62800d.contains(serverCardId)) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C13218m(jSONObject), 7, null);
            return true;
        } else if (c13206a.m62791a(jSONObject, CardKey.DISMISSED)) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C13219n(serverCardId), 7, null);
            m62812a(serverCardId);
            m62810a(serverCardId, (JSONObject) null);
            return true;
        } else {
            m62810a(serverCardId, c13206a.m62790a(m62799d, jSONObject));
            if (c13206a.m62791a(jSONObject, CardKey.IS_TEST)) {
                m62802c(serverCardId);
            }
            return true;
        }
    }

    /* renamed from: e */
    public final void m62797e(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Set<String> m62803c = m62803c();
        m62803c.remove(cardId);
        this.f59421d.edit().putStringSet("dismissed", m62803c).apply();
    }

    /* renamed from: f */
    public final void m62795f(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C13211f(cardId), 6, null);
        Set<String> m62793h = m62793h();
        m62793h.remove(cardId);
        this.f59421d.edit().putStringSet("test", m62793h).apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final C40779fA0 m62815a(C13197x contentCardsResponse, String str) {
        IntRange until;
        Sequence asSequence;
        Sequence filter;
        Sequence<JSONObject> map;
        Intrinsics.checkNotNullParameter(contentCardsResponse, "contentCardsResponse");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = str;
        if (str == 0) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C13224s.f59441b, 7, null);
            objectRef.element = "";
        }
        if (!Intrinsics.areEqual(this.f59418a, objectRef.element)) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, new C13225t(objectRef, this), 6, null);
            return null;
        }
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, new C13226u(objectRef), 6, null);
        m62816a(contentCardsResponse);
        m62792i();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        JSONArray m62829a = contentCardsResponse.m62829a();
        if (m62829a != null && m62829a.length() != 0) {
            until = RangesKt___RangesKt.until(0, m62829a.length());
            asSequence = CollectionsKt___CollectionsKt.asSequence(until);
            filter = SequencesKt___SequencesKt.filter(asSequence, new C13222q(m62829a));
            map = SequencesKt___SequencesKt.map(filter, new C13223r(m62829a));
            for (JSONObject jSONObject : map) {
                if (m62804b(jSONObject)) {
                    String string = jSONObject.getString(CardKey.ID.getContentCardsKey());
                    Intrinsics.checkNotNullExpressionValue(string, "serverCardJson.getString…rdKey.ID.contentCardsKey)");
                    linkedHashSet.add(string);
                }
            }
        }
        if (contentCardsResponse.m62826d()) {
            m62805b(linkedHashSet);
            m62801c(linkedHashSet);
            linkedHashSet.addAll(m62793h());
            m62809a(linkedHashSet);
        }
        return m62808a(false);
    }

    /* renamed from: c */
    public final void m62802c(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C13207b(cardId), 6, null);
        Set<String> m62793h = m62793h();
        m62793h.add(cardId);
        this.f59421d.edit().putStringSet("test", m62793h).apply();
    }

    /* renamed from: d */
    public final JSONObject m62799d(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        String string = this.f59420c.getString(cardId, null);
        if (string == null) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C13209d(cardId), 7, null);
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, new C13210e(string), 4, null);
            return null;
        }
    }

    /* renamed from: c */
    public final void m62801c(Set<String> cardIdsToRetain) {
        Intrinsics.checkNotNullParameter(cardIdsToRetain, "cardIdsToRetain");
        Set<String> m62800d = m62800d();
        m62800d.retainAll(cardIdsToRetain);
        this.f59421d.edit().putStringSet("expired", m62800d).apply();
    }

    /* renamed from: b */
    public final void m62805b(Set<String> cardIdsToRetain) {
        Intrinsics.checkNotNullParameter(cardIdsToRetain, "cardIdsToRetain");
        Set<String> m62803c = m62803c();
        m62803c.retainAll(cardIdsToRetain);
        this.f59421d.edit().putStringSet("dismissed", m62803c).apply();
    }

    /* renamed from: a */
    public final C40779fA0 m62808a(boolean z) {
        CardKey.Provider provider = CardKey.Provider.CONTENT_CARDS;
        Map<String, ?> all = this.f59420c.getAll();
        JSONArray jSONArray = new JSONArray();
        Iterator<?> it = all.values().iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        List<Card> m62914a = C13149u.m62914a(jSONArray, provider, this.f59419b, this, this.f59422e);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : m62914a) {
            if (((Card) obj).isExpired()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.component2();
        for (Card card : (List) pair.component1()) {
            m62813a(card);
        }
        return new C40779fA0(list, this.f59418a, m62794g(), z);
    }

    /* renamed from: b */
    public final void m62806b(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Set<String> m62800d = m62800d();
        m62800d.add(cardId);
        this.f59421d.edit().putStringSet("expired", m62800d).apply();
    }

    /* renamed from: a */
    public final void m62813a(Card card) {
        Intrinsics.checkNotNullParameter(card, "card");
        String id = card.getId();
        C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C13208c(id), 7, null);
        m62810a(id, (JSONObject) null);
        m62806b(id);
        m62795f(id);
    }

    /* renamed from: a */
    public final void m62811a(String cardId, CardKey cardKey, Object value) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(cardKey, "cardKey");
        Intrinsics.checkNotNullParameter(value, "value");
        JSONObject m62799d = m62799d(cardId);
        if (m62799d == null) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C13220o(cardId), 7, null);
            return;
        }
        try {
            m62799d.put(cardKey.getContentCardsKey(), value);
            m62810a(cardId, m62799d);
        } catch (JSONException e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, e, false, new C13221p(value, cardKey), 4, null);
        }
    }

    /* renamed from: a */
    public final void m62816a(C13197x contentCardsResponse) {
        Intrinsics.checkNotNullParameter(contentCardsResponse, "contentCardsResponse");
        SharedPreferences.Editor edit = this.f59421d.edit();
        if (contentCardsResponse.m62828b() != -1) {
            edit.putLong("last_card_updated_at", contentCardsResponse.m62828b());
        }
        if (contentCardsResponse.m62827c() != -1) {
            edit.putLong("last_full_sync_at", contentCardsResponse.m62827c());
        }
        edit.apply();
    }

    /* renamed from: a */
    public final void m62810a(String cardId, JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        SharedPreferences.Editor edit = this.f59420c.edit();
        if (jSONObject != null) {
            edit.putString(cardId, jSONObject.toString());
        } else {
            edit.remove(cardId);
        }
        edit.apply();
    }

    /* renamed from: a */
    public final void m62812a(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Set<String> m62803c = m62803c();
        m62803c.add(cardId);
        this.f59421d.edit().putStringSet("dismissed", m62803c).apply();
    }

    /* renamed from: a */
    public final void m62809a(Set<String> cardIdsToRetain) {
        Intrinsics.checkNotNullParameter(cardIdsToRetain, "cardIdsToRetain");
        Set<String> keySet = this.f59420c.getAll().keySet();
        SharedPreferences.Editor edit = this.f59420c.edit();
        for (String str : keySet) {
            if (!cardIdsToRetain.contains(str)) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C13212g(str), 7, null);
                edit.remove(str);
            }
        }
        edit.apply();
    }
}
