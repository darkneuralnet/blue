package bo.app;

import com.appboy.enums.CardKey;
import com.appboy.enums.CardType;
import com.appboy.models.cards.BannerImageCard;
import com.appboy.models.cards.CaptionedImageCard;
import com.appboy.models.cards.Card;
import com.appboy.models.cards.ControlCard;
import com.appboy.models.cards.ShortNewsCard;
import com.appboy.models.cards.TextAnnouncementCard;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J:\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007J6\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007J6\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¨\u0006\u0015"}, m28432d2 = {"Lbo/app/u;", "", "Lorg/json/JSONArray;", "cardJsonStringArray", "Lcom/appboy/enums/CardKey$Provider;", "cardKeyProvider", "Lbo/app/y1;", "brazeManager", "LkO1;", "cardStorageProvider", "Lbo/app/a2;", "cardAnalyticsProvider", "", "Lcom/appboy/models/cards/Card;", C17296a.f69688o, "Lorg/json/JSONObject;", "jsonObject", "", "jsonString", "<init>", "()V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.u */
/* loaded from: classes.dex */
public final class C13149u {

    /* renamed from: a */
    public static final C13149u f59334a = new C13149u();

    @Metadata(m28431k = 3, m28430mv = {1, 6, 0}, m28428xi = 48)
    /* renamed from: bo.app.u$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C13150a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f59335a;

        static {
            int[] iArr = new int[CardType.values().length];
            iArr[CardType.BANNER.ordinal()] = 1;
            iArr[CardType.CAPTIONED_IMAGE.ordinal()] = 2;
            iArr[CardType.SHORT_NEWS.ordinal()] = 3;
            iArr[CardType.TEXT_ANNOUNCEMENT.ordinal()] = 4;
            iArr[CardType.CONTROL.ordinal()] = 5;
            f59335a = iArr;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"T", "", "it", "", C17296a.f69688o, "(I)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.u$b */
    /* loaded from: classes.dex */
    public static final class C13151b extends Lambda implements Function1<Integer, Boolean> {

        /* renamed from: b */
        final /* synthetic */ JSONArray f59336b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13151b(JSONArray jSONArray) {
            super(1);
            this.f59336b = jSONArray;
        }

        /* renamed from: a */
        public final Boolean m62912a(int i) {
            return Boolean.valueOf(this.f59336b.opt(i) instanceof Object);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
            return m62912a(num.intValue());
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"T", "", "it", C17296a.f69688o, "(I)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.u$c */
    /* loaded from: classes.dex */
    public static final class C13152c extends Lambda implements Function1<Integer, Object> {

        /* renamed from: b */
        final /* synthetic */ JSONArray f59337b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13152c(JSONArray jSONArray) {
            super(1);
            this.f59337b = jSONArray;
        }

        /* renamed from: a */
        public final Object m62911a(int i) {
            Object obj = this.f59337b.get(i);
            if (obj != null) {
                return obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return m62911a(num.intValue());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "it", "Lcom/appboy/models/cards/Card;", C17296a.f69688o, "(Ljava/lang/Object;)Lcom/appboy/models/cards/Card;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: bo.app.u$d */
    /* loaded from: classes.dex */
    public static final class C13153d extends Lambda implements Function1<Object, Card> {

        /* renamed from: b */
        final /* synthetic */ CardKey.Provider f59338b;

        /* renamed from: c */
        final /* synthetic */ InterfaceC13231y1 f59339c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC43871kO1<?> f59340d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC12518a2 f59341e;

        /* renamed from: f */
        final /* synthetic */ JSONArray f59342f;

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: bo.app.u$d$a */
        /* loaded from: classes.dex */
        public static final class C13154a extends Lambda implements Function0<String> {

            /* renamed from: b */
            final /* synthetic */ Object f59343b;

            /* renamed from: c */
            final /* synthetic */ JSONArray f59344c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C13154a(Object obj, JSONArray jSONArray) {
                super(0);
                this.f59343b = obj;
                this.f59344c = jSONArray;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Unable to create Card JSON in array. Ignoring. Was on element: " + this.f59343b + " of json array: " + this.f59344c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13153d(CardKey.Provider provider, InterfaceC13231y1 interfaceC13231y1, InterfaceC43871kO1<?> interfaceC43871kO1, InterfaceC12518a2 interfaceC12518a2, JSONArray jSONArray) {
            super(1);
            this.f59338b = provider;
            this.f59339c = interfaceC13231y1;
            this.f59340d = interfaceC43871kO1;
            this.f59341e = interfaceC12518a2;
            this.f59342f = jSONArray;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Card invoke(Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            try {
                return C13149u.f59334a.m62915a(it.toString(), this.f59338b, this.f59339c, this.f59340d, this.f59341e);
            } catch (Exception e) {
                C43664k20.m29442e(C43664k20.f93782a, C13149u.f59334a, C43664k20.EnumC25082a.E, e, false, new C13154a(it, this.f59342f), 4, null);
                return null;
            }
        }
    }

    private C13149u() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final Card m62913a(JSONObject jsonObject, CardKey.Provider cardKeyProvider, InterfaceC13231y1 brazeManager, InterfaceC43871kO1<?> cardStorageProvider, InterfaceC12518a2 cardAnalyticsProvider) {
        Card bannerImageCard;
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Intrinsics.checkNotNullParameter(cardKeyProvider, "cardKeyProvider");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(cardStorageProvider, "cardStorageProvider");
        Intrinsics.checkNotNullParameter(cardAnalyticsProvider, "cardAnalyticsProvider");
        CardType cardTypeFromJson = cardKeyProvider.getCardTypeFromJson(jsonObject);
        int i = cardTypeFromJson == null ? -1 : C13150a.f59335a[cardTypeFromJson.ordinal()];
        if (i == 1) {
            bannerImageCard = new BannerImageCard(jsonObject, cardKeyProvider, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        } else if (i == 2) {
            bannerImageCard = new CaptionedImageCard(jsonObject, cardKeyProvider, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        } else if (i == 3) {
            bannerImageCard = new ShortNewsCard(jsonObject, cardKeyProvider, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        } else if (i == 4) {
            bannerImageCard = new TextAnnouncementCard(jsonObject, cardKeyProvider, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        } else if (i != 5) {
            return null;
        } else {
            bannerImageCard = new ControlCard(jsonObject, cardKeyProvider, brazeManager, cardStorageProvider, cardAnalyticsProvider);
        }
        return bannerImageCard;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final Card m62915a(String str, CardKey.Provider provider, InterfaceC13231y1 interfaceC13231y1, InterfaceC43871kO1<?> interfaceC43871kO1, InterfaceC12518a2 interfaceC12518a2) {
        return m62913a(new JSONObject(str), provider, interfaceC13231y1, interfaceC43871kO1, interfaceC12518a2);
    }

    @JvmStatic
    /* renamed from: a */
    public static final List<Card> m62914a(JSONArray cardJsonStringArray, CardKey.Provider cardKeyProvider, InterfaceC13231y1 brazeManager, InterfaceC43871kO1<?> cardStorageProvider, InterfaceC12518a2 cardAnalyticsProvider) {
        IntRange until;
        Sequence asSequence;
        Sequence filter;
        Sequence map;
        Sequence asSequence2;
        Sequence mapNotNull;
        List<Card> list;
        Intrinsics.checkNotNullParameter(cardJsonStringArray, "cardJsonStringArray");
        Intrinsics.checkNotNullParameter(cardKeyProvider, "cardKeyProvider");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(cardStorageProvider, "cardStorageProvider");
        Intrinsics.checkNotNullParameter(cardAnalyticsProvider, "cardAnalyticsProvider");
        until = RangesKt___RangesKt.until(0, cardJsonStringArray.length());
        asSequence = CollectionsKt___CollectionsKt.asSequence(until);
        filter = SequencesKt___SequencesKt.filter(asSequence, new C13151b(cardJsonStringArray));
        map = SequencesKt___SequencesKt.map(filter, new C13152c(cardJsonStringArray));
        asSequence2 = SequencesKt__SequencesKt.asSequence(map.iterator());
        mapNotNull = SequencesKt___SequencesKt.mapNotNull(asSequence2, new C13153d(cardKeyProvider, brazeManager, cardStorageProvider, cardAnalyticsProvider, cardJsonStringArray));
        list = SequencesKt___SequencesKt.toList(mapNotNull);
        return list;
    }
}
