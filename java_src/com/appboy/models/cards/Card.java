package com.appboy.models.cards;

import bo.app.InterfaceC12518a2;
import bo.app.InterfaceC13160u1;
import bo.app.InterfaceC13231y1;
import co.bird.android.model.LegacyRepairType;
import com.appboy.enums.CardCategory;
import com.appboy.enums.CardKey;
import com.appboy.enums.CardType;
import com.appboy.enums.Channel;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt__IndentKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 h2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001iB9\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010a\u001a\u00020`\u0012\b\u0010c\u001a\u0004\u0018\u00010b\u0012\f\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0015\u0012\b\u0010e\u001a\u0004\u0018\u00010d¢\u0006\u0004\bf\u0010gJ\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0005\u001a\u00020\u0003J\u0014\u0010\t\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0007J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\"\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010&\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010(\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R4\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010.\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b.\u00100R\u0017\u00101\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b1\u00100R\"\u00102\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010/\u001a\u0004\b2\u00100\"\u0004\b3\u00104R$\u00105\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b5\u0010/\u001a\u0004\b5\u00100R\u001d\u00106\u001a\u00020\u00038\u0006¢\u0006\u0012\n\u0004\b6\u0010/\u0012\u0004\b8\u00109\u001a\u0004\b7\u00100R\"\u0010:\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010/\u001a\u0004\b:\u00100\"\u0004\b;\u00104R\"\u0010<\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010/\u001a\u0004\b<\u00100\"\u0004\b=\u00104R\u001c\u0010>\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010\u001e\u001a\u0004\b?\u0010 R\u001a\u0010A\u001a\u00020@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010/R\u0016\u0010F\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010/R\u0016\u0010G\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010/R\u0017\u0010I\u001a\u00020H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR$\u0010N\u001a\u0004\u0018\u00010M8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR$\u0010U\u001a\u00020\u00032\u0006\u0010T\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u00100\"\u0004\bV\u00104R*\u0010W\u001a\u00020\u00032\u0006\u0010W\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\u0012\u0012\u0004\bY\u00109\u001a\u0004\bW\u00100\"\u0004\bX\u00104R*\u0010Z\u001a\u00020\u00032\u0006\u0010Z\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\u0012\u0012\u0004\b]\u00109\u001a\u0004\b[\u00100\"\u0004\b\\\u00104R\u0011\u0010^\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b^\u00100R\u0011\u0010_\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b_\u00100¨\u0006j"}, m28432d2 = {"Lcom/appboy/models/cards/Card;", "LaP1;", "Lorg/json/JSONObject;", "", "logImpression", "logClick", "Ljava/util/EnumSet;", "Lcom/appboy/enums/CardCategory;", "categories", "isInCategorySet", "forJsonPut", "", "toString", "isValidCard", "", LegacyRepairType.OTHER_KEY, "equals", "", "hashCode", "jsonObject", "Lorg/json/JSONObject;", "LkO1;", "cardStorage", "LkO1;", "", "extras", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "", AnalyticsRequestV2.PARAM_CREATED, "J", "getCreated", "()J", "updated", "getUpdated", "expiresAt", "getExpiresAt", "<set-?>", "Ljava/util/EnumSet;", "getCategories", "()Ljava/util/EnumSet;", "isContentCard", "Z", "()Z", "isRemoved", "isPinned", "setPinned", "(Z)V", "isClicked", "openUriInWebView", "getOpenUriInWebView", "getOpenUriInWebView$annotations", "()V", "isDismissibleByUser", "setDismissibleByUser", "isTest", "setTest", "url", "getUrl", "Lcom/appboy/enums/CardType;", "cardType", "Lcom/appboy/enums/CardType;", "getCardType", "()Lcom/appboy/enums/CardType;", "wasViewedInternal", "isIndicatorHighlightedInternal", "isDismissedInternal", "Lcom/appboy/enums/Channel;", "channel", "Lcom/appboy/enums/Channel;", "getChannel", "()Lcom/appboy/enums/Channel;", "Lcom/appboy/models/cards/ICardListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/appboy/models/cards/ICardListener;", "getListener", "()Lcom/appboy/models/cards/ICardListener;", "setListener", "(Lcom/appboy/models/cards/ICardListener;)V", "enabled", "isIndicatorHighlighted", "setIndicatorHighlighted", "isDismissed", "setDismissed", "isDismissed$annotations", "viewed", "getViewed", "setViewed", "getViewed$annotations", "isExpired", "isControl", "Lcom/appboy/enums/CardKey$Provider;", "cardKeysProvider", "Lbo/app/y1;", "brazeManager", "Lbo/app/a2;", "cardAnalytics", "<init>", "(Lorg/json/JSONObject;Lcom/appboy/enums/CardKey$Provider;Lbo/app/y1;LkO1;Lbo/app/a2;)V", "Companion", C17296a.f69688o, "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* loaded from: classes.dex */
public class Card implements InterfaceC37933aP1<JSONObject> {
    public static final C16941a Companion = new C16941a(null);
    private final InterfaceC13231y1 brazeManager;
    private final InterfaceC12518a2 cardAnalytics;
    private final InterfaceC43871kO1<?> cardStorage;
    private final CardType cardType;
    private EnumSet<CardCategory> categories;
    private final Channel channel;
    private final long created;
    private final long expiresAt;
    private final Map<String, String> extras;

    /* renamed from: id */
    private final String f68626id;
    private boolean isClicked;
    private final boolean isContentCard;
    private boolean isDismissedInternal;
    private boolean isDismissibleByUser;
    private boolean isIndicatorHighlightedInternal;
    private boolean isPinned;
    private final boolean isRemoved;
    private boolean isTest;
    private final JSONObject jsonObject;
    private ICardListener listener;
    private final boolean openUriInWebView;
    private final long updated;
    private final String url;
    private boolean wasViewedInternal;

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"Lcom/appboy/models/cards/Card$a;", "", "", "DEFAULT_EXPIRES_AT_VALUE", "J", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: com.appboy.models.cards.Card$a */
    /* loaded from: classes.dex */
    public static final class C16941a {
        public /* synthetic */ C16941a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16941a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "", "it", "", C17296a.f69688o, "(I)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: com.appboy.models.cards.Card$b */
    /* loaded from: classes.dex */
    public static final class C16942b extends Lambda implements Function1<Integer, Boolean> {

        /* renamed from: b */
        final /* synthetic */ JSONArray f68627b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16942b(JSONArray jSONArray) {
            super(1);
            this.f68627b = jSONArray;
        }

        /* renamed from: a */
        public final Boolean m53470a(int i) {
            return Boolean.valueOf(this.f68627b.opt(i) instanceof String);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return m53470a(num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "", "it", C17296a.f69688o, "(I)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: com.appboy.models.cards.Card$c */
    /* loaded from: classes.dex */
    public static final class C16943c extends Lambda implements Function1<Integer, String> {

        /* renamed from: b */
        final /* synthetic */ JSONArray f68628b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16943c(JSONArray jSONArray) {
            super(1);
            this.f68628b = jSONArray;
        }

        /* renamed from: a */
        public final String m53469a(int i) {
            Object obj = this.f68628b.get(i);
            if (obj != null) {
                return (String) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.lang.String] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ String invoke(Integer num) {
            return m53469a(num.intValue());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: com.appboy.models.cards.Card$d */
    /* loaded from: classes.dex */
    public static final class C16944d extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C16944d f68629b = new C16944d();

        public C16944d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Cannot dismiss a card more than once. Doing nothing.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: com.appboy.models.cards.Card$e */
    /* loaded from: classes.dex */
    public static final class C16945e extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C16945e f68630b = new C16945e();

        public C16945e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to log card as dismissed.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: com.appboy.models.cards.Card$f */
    /* loaded from: classes.dex */
    public static final class C16946f extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C16946f f68631b = new C16946f();

        public C16946f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Failed to mark card indicator as highlighted.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: com.appboy.models.cards.Card$g */
    /* loaded from: classes.dex */
    public static final class C16947g extends Lambda implements Function0<String> {

        /* renamed from: b */
        public static final C16947g f68632b = new C16947g();

        public C16947g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Card ID cannot be null";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: com.appboy.models.cards.Card$h */
    /* loaded from: classes.dex */
    public static final class C16948h extends Lambda implements Function0<String> {
        public C16948h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Logged click for card with id: ", Card.this.getId());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: com.appboy.models.cards.Card$i */
    /* loaded from: classes.dex */
    public static final class C16949i extends Lambda implements Function0<String> {
        public C16949i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to log card clicked for id: ", Card.this.getId());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: com.appboy.models.cards.Card$j */
    /* loaded from: classes.dex */
    public static final class C16950j extends Lambda implements Function0<String> {
        public C16950j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to log card as clicked for id: ", Card.this.getId());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: com.appboy.models.cards.Card$k */
    /* loaded from: classes.dex */
    public static final class C16951k extends Lambda implements Function0<String> {
        public C16951k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Logging impression event for card with id: ", Card.this.getId());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: com.appboy.models.cards.Card$l */
    /* loaded from: classes.dex */
    public static final class C16952l extends Lambda implements Function0<String> {
        public C16952l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Logging control impression event for card with id: ", Card.this.getId());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: com.appboy.models.cards.Card$m */
    /* loaded from: classes.dex */
    public static final class C16953m extends Lambda implements Function0<String> {
        public C16953m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to log card impression for card id: ", Card.this.getId());
        }
    }

    public Card(JSONObject jsonObject, CardKey.Provider cardKeysProvider, InterfaceC13231y1 interfaceC13231y1, InterfaceC43871kO1<?> interfaceC43871kO1, InterfaceC12518a2 interfaceC12518a2) {
        Channel channel;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(cardKeysProvider, "cardKeysProvider");
        this.jsonObject = jsonObject;
        this.brazeManager = interfaceC13231y1;
        this.cardStorage = interfaceC43871kO1;
        this.cardAnalytics = interfaceC12518a2;
        this.extras = C31696Aj2.m115355d(jsonObject.optJSONObject(cardKeysProvider.getKey(CardKey.EXTRAS)));
        String string = jsonObject.getString(cardKeysProvider.getKey(CardKey.ID));
        Intrinsics.checkNotNullExpressionValue(string, "jsonObject.getString(car…vider.getKey(CardKey.ID))");
        this.f68626id = string;
        this.isContentCard = cardKeysProvider.isContentCardProvider();
        this.cardType = CardType.DEFAULT;
        if (cardKeysProvider.isContentCardProvider()) {
            channel = Channel.CONTENT_CARD;
        } else {
            channel = Channel.NEWS_FEED;
        }
        this.channel = channel;
        this.wasViewedInternal = jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.VIEWED));
        this.isDismissedInternal = jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.DISMISSED), false);
        this.isPinned = jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.PINNED), false);
        this.created = jsonObject.getLong(cardKeysProvider.getKey(CardKey.CREATED));
        this.expiresAt = jsonObject.optLong(cardKeysProvider.getKey(CardKey.EXPIRES_AT), -1L);
        this.openUriInWebView = jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.OPEN_URI_IN_WEBVIEW), false);
        this.isRemoved = jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.REMOVED), false);
        JSONArray optJSONArray = jsonObject.optJSONArray(cardKeysProvider.getKey(CardKey.CATEGORIES));
        if (optJSONArray != null && optJSONArray.length() != 0) {
            EnumSet<CardCategory> noneOf = EnumSet.noneOf(CardCategory.class);
            for (String str : SequencesKt.map(SequencesKt.filter(CollectionsKt.asSequence(RangesKt.until(0, optJSONArray.length())), new C16942b(optJSONArray)), new C16943c(optJSONArray))) {
                CardCategory cardCategory = CardCategory.get(str);
                if (cardCategory != null) {
                    noneOf.add(cardCategory);
                }
            }
            this.categories = noneOf;
        } else {
            this.categories = EnumSet.of(CardCategory.NO_CATEGORY);
        }
        this.updated = this.jsonObject.optLong(cardKeysProvider.getKey(CardKey.UPDATED), this.created);
        this.isDismissibleByUser = this.jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.DISMISSIBLE), false);
        this.isIndicatorHighlightedInternal = this.jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.READ), this.wasViewedInternal);
        this.isClicked = this.jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.CLICKED), false);
        this.isTest = this.jsonObject.optBoolean(cardKeysProvider.getKey(CardKey.IS_TEST), false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(getClass(), obj.getClass())) {
            return false;
        }
        Card card = (Card) obj;
        if (this.updated == card.updated && Intrinsics.areEqual(this.f68626id, card.f68626id)) {
            return true;
        }
        return false;
    }

    public CardType getCardType() {
        return this.cardType;
    }

    public final Channel getChannel() {
        return this.channel;
    }

    public final Map<String, String> getExtras() {
        return this.extras;
    }

    public final String getId() {
        return this.f68626id;
    }

    public final boolean getOpenUriInWebView() {
        return this.openUriInWebView;
    }

    public final long getUpdated() {
        return this.updated;
    }

    public String getUrl() {
        return this.url;
    }

    public final boolean getViewed() {
        return this.wasViewedInternal;
    }

    public int hashCode() {
        long j = this.updated;
        return (this.f68626id.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final boolean isControl() {
        return getCardType() == CardType.CONTROL;
    }

    public final boolean isDismissibleByUser() {
        return this.isDismissibleByUser;
    }

    public final boolean isExpired() {
        long j = this.expiresAt;
        return j != -1 && j <= C46287oT0.m21027i();
    }

    public final boolean isInCategorySet(EnumSet<CardCategory> categories) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        EnumSet<CardCategory> enumSet = this.categories;
        if (enumSet == null) {
            return false;
        }
        Iterator<E> it = categories.iterator();
        while (it.hasNext()) {
            if (enumSet.contains((CardCategory) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean isIndicatorHighlighted() {
        return this.isIndicatorHighlightedInternal;
    }

    public final boolean isPinned() {
        return this.isPinned;
    }

    public final boolean isValidCard() {
        boolean isBlank;
        isBlank = StringsKt__StringsJVMKt.isBlank(this.f68626id);
        if (isBlank) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C16947g.f68632b, 6, null);
            return false;
        }
        return true;
    }

    public final boolean logClick() {
        try {
            this.isClicked = true;
            if (this.brazeManager != null && this.cardAnalytics != null && this.cardStorage != null && isValidCard()) {
                InterfaceC13160u1 mo62857a = this.cardAnalytics.mo62857a(this.f68626id);
                if (mo62857a != null) {
                    this.brazeManager.mo62756a(mo62857a);
                }
                this.cardStorage.markCardAsClicked(this.f68626id);
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C16948h(), 7, null);
                return true;
            }
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, new C16949i(), 6, null);
            return false;
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, new C16950j(), 4, null);
            return false;
        }
    }

    public final boolean logImpression() {
        try {
            if (this.brazeManager != null && this.cardAnalytics != null && this.cardStorage != null && isValidCard()) {
                if (!isControl()) {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C16951k(), 6, null);
                    InterfaceC13160u1 mo62855c = this.cardAnalytics.mo62855c(this.f68626id);
                    if (mo62855c != null) {
                        this.brazeManager.mo62756a(mo62855c);
                    }
                } else {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C16952l(), 6, null);
                    InterfaceC13160u1 mo62856b = this.cardAnalytics.mo62856b(this.f68626id);
                    if (mo62856b != null) {
                        this.brazeManager.mo62756a(mo62856b);
                    }
                }
                this.cardStorage.markCardAsViewed(this.f68626id);
                return true;
            }
            return false;
        } catch (Exception e) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, new C16953m(), 4, null);
            return false;
        }
    }

    public final void setDismissed(boolean z) {
        InterfaceC13160u1 mo62854d;
        if (this.isDismissedInternal && z) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, null, false, C16944d.f68629b, 6, null);
            return;
        }
        this.isDismissedInternal = z;
        InterfaceC43871kO1<?> interfaceC43871kO1 = this.cardStorage;
        if (interfaceC43871kO1 != null) {
            interfaceC43871kO1.markCardAsDismissed(this.f68626id);
        }
        if (z) {
            try {
                if (this.brazeManager != null && this.cardAnalytics != null && isValidCard() && (mo62854d = this.cardAnalytics.mo62854d(this.f68626id)) != null) {
                    this.brazeManager.mo62756a(mo62854d);
                }
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.W, e, false, C16945e.f68630b, 4, null);
            }
        }
    }

    public final void setIndicatorHighlighted(boolean z) {
        InterfaceC43871kO1<?> interfaceC43871kO1;
        this.isIndicatorHighlightedInternal = z;
        try {
            ICardListener iCardListener = this.listener;
            if (iCardListener != null) {
                iCardListener.onCardUpdate();
            }
        } catch (Exception unused) {
        }
        if (z && (interfaceC43871kO1 = this.cardStorage) != null) {
            try {
                interfaceC43871kO1.markCardAsVisuallyRead(this.f68626id);
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.D, e, false, C16946f.f68631b, 4, null);
            }
        }
    }

    public final void setListener(ICardListener iCardListener) {
        this.listener = iCardListener;
    }

    public final void setViewed(boolean z) {
        this.wasViewedInternal = z;
        InterfaceC43871kO1<?> interfaceC43871kO1 = this.cardStorage;
        if (interfaceC43871kO1 != null) {
            interfaceC43871kO1.markCardAsViewed(this.f68626id);
        }
    }

    public String toString() {
        String trimIndent;
        trimIndent = StringsKt__IndentKt.trimIndent("\n            Card{\n            extras=" + this.extras + "\n            id='" + this.f68626id + "'\n            created=" + this.created + "\n            updated=" + this.updated + "\n            expiresAt=" + this.expiresAt + "\n            categories=" + this.categories + "\n            isContentCard=" + this.isContentCard + "\n            viewed=" + this.wasViewedInternal + "\n            isRead=" + this.isIndicatorHighlightedInternal + "\n            isDismissed=" + this.isDismissedInternal + "\n            isRemoved=" + this.isRemoved + "\n            isPinned=" + this.isPinned + "\n            isClicked=" + this.isClicked + "\n            openUriInWebview=" + this.openUriInWebView + "\n            isDismissibleByUser=" + this.isDismissibleByUser + "\n            isTest=" + this.isTest + "\n            json=" + C31696Aj2.m115350i(this.jsonObject) + "\n            }\n\n        ");
        return trimIndent;
    }

    @Override // p000.InterfaceC37933aP1
    public JSONObject forJsonPut() {
        return this.jsonObject;
    }
}
