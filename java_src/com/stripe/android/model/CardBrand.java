package com.stripe.android.model;

import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum Visa uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b \b\u0086\u0001\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00000\u0001:\u00011B\u0097\u0001\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u000f\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0002\u0010\u0014J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0003H\u0007J\u0012\u0010\"\u001a\u0004\u0018\u00010\r2\u0006\u0010!\u001a\u00020\u0003H\u0002J\u0010\u0010#\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u0003J\u0010\u0010%\u001a\u00020\u00122\b\u0010!\u001a\u0004\u0018\u00010\u0003J\u000e\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u001e\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0018R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u000fX\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0¨\u00062"}, m28432d2 = {"Lcom/stripe/android/model/CardBrand;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "displayName", "icon", "", "cvcIcon", "errorIcon", "cvcLength", "", "defaultMaxLength", "pattern", "Ljava/util/regex/Pattern;", "partialPatterns", "", "variantMaxLength", "shouldRender", "", "renderingOrder", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIILjava/util/Set;ILjava/util/regex/Pattern;Ljava/util/Map;Ljava/util/Map;ZI)V", "getCode", "()Ljava/lang/String;", "getCvcIcon", "()I", "getCvcLength", "()Ljava/util/Set;", "getDisplayName", "getErrorIcon", "getIcon", "maxCvcLength", "getMaxCvcLength", "getMaxLengthForCardNumber", "cardNumber", "getPatternForLength", "isMaxCvc", "cvcText", "isValidCardNumberLength", "isValidCvc", "cvc", "Visa", "MasterCard", "AmericanExpress", "Discover", "JCB", "DinersClub", "UnionPay", "CartesBancaires", "Unknown", "Companion", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nCardBrand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardBrand.kt\ncom/stripe/android/model/CardBrand\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,286:1\n288#2,2:287\n766#2:289\n857#2,2:290\n766#2:292\n857#2,2:293\n1045#2:295\n*S KotlinDebug\n*F\n+ 1 CardBrand.kt\ncom/stripe/android/model/CardBrand\n*L\n221#1:287,2\n279#1:289\n279#1:290,2\n280#1:292\n280#1:293,2\n281#1:295\n*E\n"})
/* loaded from: classes7.dex */
public final class CardBrand {
    private static final /* synthetic */ CardBrand[] $VALUES;
    public static final CardBrand AmericanExpress;
    private static final int CVC_COMMON_LENGTH = 3;
    public static final CardBrand CartesBancaires;
    public static final Companion Companion;
    public static final CardBrand DinersClub;
    public static final CardBrand Discover;
    public static final CardBrand JCB;
    public static final CardBrand MasterCard;
    public static final CardBrand UnionPay;
    public static final CardBrand Unknown;
    public static final CardBrand Visa;
    private static final List<CardBrand> orderedBrands;
    private final String code;
    private final int cvcIcon;
    private final Set<Integer> cvcLength;
    private final int defaultMaxLength;
    private final String displayName;
    private final int errorIcon;
    private final int icon;
    private final Map<Integer, Pattern> partialPatterns;
    private final Pattern pattern;
    private final int renderingOrder;
    private final boolean shouldRender;
    private final Map<Pattern, Integer> variantMaxLength;

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u0010\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\fJ\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/model/CardBrand$Companion;", "", "()V", "CVC_COMMON_LENGTH", "", "orderedBrands", "", "Lcom/stripe/android/model/CardBrand;", "getOrderedBrands", "()Ljava/util/List;", "fromCardNumber", "cardNumber", "", "fromCode", PaymentMethodOptionsParams.Blik.PARAM_CODE, "getCardBrands", "getMatchingCards", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nCardBrand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardBrand.kt\ncom/stripe/android/model/CardBrand$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,286:1\n3792#2:287\n4307#2,2:288\n1282#2,2:293\n766#3:290\n857#3,2:291\n*S KotlinDebug\n*F\n+ 1 CardBrand.kt\ncom/stripe/android/model/CardBrand$Companion\n*L\n262#1:287\n262#1:288,2\n274#1:293,2\n265#1:290\n265#1:291,2\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
            if (r6.matches() == true) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final List<CardBrand> getMatchingCards(String str) {
            boolean z;
            CardBrand[] values = CardBrand.values();
            ArrayList arrayList = new ArrayList();
            for (CardBrand cardBrand : values) {
                Pattern patternForLength = cardBrand.getPatternForLength(str);
                if (patternForLength != null && (r6 = patternForLength.matcher(str)) != null) {
                    z = true;
                }
                z = false;
                if (z) {
                    arrayList.add(cardBrand);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((CardBrand) obj).shouldRender) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final CardBrand fromCardNumber(String str) {
            boolean z;
            Object first;
            boolean isBlank;
            boolean z2 = false;
            if (str != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(str);
                if (!isBlank) {
                    z = false;
                    if (!z) {
                        return CardBrand.Unknown;
                    }
                    List<CardBrand> matchingCards = getMatchingCards(str);
                    if (matchingCards.size() == 1) {
                        z2 = true;
                    }
                    if (!z2) {
                        matchingCards = null;
                    }
                    if (matchingCards == null) {
                        matchingCards = CollectionsKt__CollectionsJVMKt.listOf(CardBrand.Unknown);
                    }
                    first = CollectionsKt___CollectionsKt.first((List<? extends Object>) matchingCards);
                    return (CardBrand) first;
                }
            }
            z = true;
            if (!z) {
            }
        }

        public final CardBrand fromCode(String str) {
            CardBrand cardBrand;
            boolean equals;
            CardBrand[] values = CardBrand.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    cardBrand = values[i];
                    equals = StringsKt__StringsJVMKt.equals(cardBrand.getCode(), str, true);
                    if (equals) {
                        break;
                    }
                    i++;
                } else {
                    cardBrand = null;
                    break;
                }
            }
            if (cardBrand == null) {
                return CardBrand.Unknown;
            }
            return cardBrand;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final List<CardBrand> getCardBrands(String str) {
            boolean z;
            List<CardBrand> listOf;
            boolean isBlank;
            if (str != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(str);
                if (!isBlank) {
                    z = false;
                    if (!z) {
                        return getOrderedBrands();
                    }
                    List<CardBrand> matchingCards = getMatchingCards(str);
                    if (!(true ^ matchingCards.isEmpty())) {
                        matchingCards = null;
                    }
                    if (matchingCards == null) {
                        listOf = CollectionsKt__CollectionsJVMKt.listOf(CardBrand.Unknown);
                        return listOf;
                    }
                    return matchingCards;
                }
            }
            z = true;
            if (!z) {
            }
        }

        public final List<CardBrand> getOrderedBrands() {
            return CardBrand.orderedBrands;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ CardBrand[] $values() {
        return new CardBrand[]{Visa, MasterCard, AmericanExpress, Discover, JCB, DinersClub, UnionPay, CartesBancaires, Unknown};
    }

    static {
        Map mapOf;
        Map mapOf2;
        Set of;
        Map mapOf3;
        Map mapOf4;
        Map mapOf5;
        Map mapOf6;
        Map mapOf7;
        Map mapOf8;
        Map mapOf9;
        Set of2;
        Map emptyMap;
        List list;
        List<CardBrand> sortedWith;
        int i = C31905Bg4.stripe_ic_visa;
        Pattern compile = Pattern.compile("^(4)[0-9]*$");
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(1, Pattern.compile("^4$")));
        Visa = new CardBrand("Visa", 0, "visa", "Visa", i, 0, 0, null, 0, compile, mapOf, null, false, 1, 1656, null);
        int i2 = C31905Bg4.stripe_ic_mastercard;
        Pattern compile2 = Pattern.compile("^(2221|2222|2223|2224|2225|2226|2227|2228|2229|222|223|224|225|226|227|228|229|23|24|25|26|270|271|2720|50|51|52|53|54|55|56|57|58|59|67)[0-9]*$");
        mapOf2 = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(1, Pattern.compile("^2|5|6$")), TuplesKt.m28425to(2, Pattern.compile("^(22|23|24|25|26|27|50|51|52|53|54|55|56|57|58|59|67)$")));
        MasterCard = new CardBrand("MasterCard", 1, "mastercard", "Mastercard", i2, 0, 0, null, 0, compile2, mapOf2, null, false, 2, 1656, null);
        int i3 = C31905Bg4.stripe_ic_amex;
        int i4 = C31905Bg4.stripe_ic_cvc_amex;
        of = SetsKt__SetsKt.setOf((Object[]) new Integer[]{3, 4});
        Pattern compile3 = Pattern.compile("^(34|37)[0-9]*$");
        mapOf3 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(1, Pattern.compile("^3$")));
        AmericanExpress = new CardBrand("AmericanExpress", 2, "amex", "American Express", i3, i4, 0, of, 15, compile3, mapOf3, null, false, 3, 1552, null);
        int i5 = C31905Bg4.stripe_ic_discover;
        Pattern compile4 = Pattern.compile("^(60|64|65)[0-9]*$");
        mapOf4 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(1, Pattern.compile("^6$")));
        Discover = new CardBrand("Discover", 3, "discover", "Discover", i5, 0, 0, null, 0, compile4, mapOf4, null, false, 4, 1656, null);
        int i6 = C31905Bg4.stripe_ic_jcb;
        Pattern compile5 = Pattern.compile("^(352[89]|35[3-8][0-9])[0-9]*$");
        mapOf5 = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(1, Pattern.compile("^3$")), TuplesKt.m28425to(2, Pattern.compile("^(35)$")), TuplesKt.m28425to(3, Pattern.compile("^(35[2-8])$")));
        JCB = new CardBrand("JCB", 4, "jcb", "JCB", i6, 0, 0, null, 0, compile5, mapOf5, null, false, 5, 1656, null);
        int i7 = C31905Bg4.stripe_ic_diners;
        Pattern compile6 = Pattern.compile("^(36|30|38|39)[0-9]*$");
        mapOf6 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(1, Pattern.compile("^3$")));
        mapOf7 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(Pattern.compile("^(36)[0-9]*$"), 14));
        DinersClub = new CardBrand("DinersClub", 5, "diners", "Diners Club", i7, 0, 0, null, 16, compile6, mapOf6, mapOf7, false, 6, 1080, null);
        int i8 = C31905Bg4.stripe_ic_unionpay;
        Pattern compile7 = Pattern.compile("^(62|81)[0-9]*$");
        mapOf8 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(1, Pattern.compile("^6|8$")));
        UnionPay = new CardBrand("UnionPay", 6, "unionpay", "UnionPay", i8, 0, 0, null, 0, compile7, mapOf8, null, false, 7, 1656, null);
        int i9 = C31905Bg4.stripe_ic_cartebancaire;
        Pattern compile8 = Pattern.compile("(^(4)[0-9]*) |^(2221|2222|2223|2224|2225|2226|2227|2228|2229|222|223|224|225|226|227|228|229|23|24|25|26|270|271|2720|50|51|52|53|54|55|56|57|58|59|67)[0-9]*$");
        mapOf9 = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(1, Pattern.compile("^4$")), TuplesKt.m28425to(2, Pattern.compile("^2|5|6$")), TuplesKt.m28425to(3, Pattern.compile("^(22|23|24|25|26|27|50|51|52|53|54|55|56|57|58|59|67)$")));
        CartesBancaires = new CardBrand("CartesBancaires", 7, "cartesbancaire", "Cartes Bancaires", i9, 0, 0, null, 0, compile8, mapOf9, null, false, 8, 632, null);
        int i10 = C31905Bg4.stripe_ic_unknown;
        of2 = SetsKt__SetsKt.setOf((Object[]) new Integer[]{3, 4});
        emptyMap = MapsKt__MapsKt.emptyMap();
        Unknown = new CardBrand("Unknown", 8, "unknown", "Unknown", i10, 0, 0, of2, 0, null, emptyMap, null, false, -1, 1752, null);
        $VALUES = $values();
        Companion = new Companion(null);
        list = ArraysKt___ArraysKt.toList(values());
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((CardBrand) obj).shouldRender) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((CardBrand) obj2).renderingOrder > 0) {
                arrayList2.add(obj2);
            }
        }
        sortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.stripe.android.model.CardBrand$special$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int i11;
                int i12;
                int compareValues;
                i11 = ((CardBrand) t).renderingOrder;
                Integer valueOf = Integer.valueOf(i11);
                i12 = ((CardBrand) t2).renderingOrder;
                compareValues = ComparisonsKt__ComparisonsKt.compareValues(valueOf, Integer.valueOf(i12));
                return compareValues;
            }
        });
        orderedBrands = sortedWith;
    }

    private CardBrand(String str, int i, String str2, String str3, int i2, int i3, int i4, Set set, int i5, Pattern pattern, Map map, Map map2, boolean z, int i6) {
        this.code = str2;
        this.displayName = str3;
        this.icon = i2;
        this.cvcIcon = i3;
        this.errorIcon = i4;
        this.cvcLength = set;
        this.defaultMaxLength = i5;
        this.pattern = pattern;
        this.partialPatterns = map;
        this.variantMaxLength = map2;
        this.shouldRender = z;
        this.renderingOrder = i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pattern getPatternForLength(String str) {
        Pattern pattern = this.partialPatterns.get(Integer.valueOf(str.length()));
        return pattern == null ? this.pattern : pattern;
    }

    public static CardBrand valueOf(String str) {
        return (CardBrand) Enum.valueOf(CardBrand.class, str);
    }

    public static CardBrand[] values() {
        return (CardBrand[]) $VALUES.clone();
    }

    public final String getCode() {
        return this.code;
    }

    public final int getCvcIcon() {
        return this.cvcIcon;
    }

    public final Set<Integer> getCvcLength() {
        return this.cvcLength;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final int getErrorIcon() {
        return this.errorIcon;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getMaxCvcLength() {
        Comparable maxOrNull;
        maxOrNull = CollectionsKt___CollectionsKt.maxOrNull((Iterable<? extends Comparable>) this.cvcLength);
        Integer num = (Integer) maxOrNull;
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }

    public final int getMaxLengthForCardNumber(String cardNumber) {
        Object obj;
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        String normalized = new CardNumber.Unvalidated(cardNumber).getNormalized();
        Iterator<T> it = this.variantMaxLength.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Pattern) ((Map.Entry) obj).getKey()).matcher(normalized).matches()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return ((Number) entry.getValue()).intValue();
        }
        return this.defaultMaxLength;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isMaxCvc(String str) {
        int i;
        CharSequence trim;
        if (str != null) {
            trim = StringsKt__StringsKt.trim((CharSequence) str);
            String obj = trim.toString();
            if (obj != null) {
                i = obj.length();
                if (getMaxCvcLength() == i) {
                    return false;
                }
                return true;
            }
        }
        i = 0;
        if (getMaxCvcLength() == i) {
        }
    }

    public final boolean isValidCardNumberLength(String str) {
        if (str != null && Unknown != this && str.length() == getMaxLengthForCardNumber(str)) {
            return true;
        }
        return false;
    }

    public final boolean isValidCvc(String cvc) {
        Intrinsics.checkNotNullParameter(cvc, "cvc");
        return this.cvcLength.contains(Integer.valueOf(cvc.length()));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CardBrand(String str, int i, String str2, String str3, int i2, int i3, int i4, Set set, int i5, Pattern pattern, Map map, Map map2, boolean z, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, i2, r8, r9, r10, r11, r12, map, r14, (i7 & 1024) != 0 ? true : z, i6);
        Set set2;
        Map map3;
        Map emptyMap;
        Set of;
        int i8 = (i7 & 8) != 0 ? C31905Bg4.stripe_ic_cvc : i3;
        int i9 = (i7 & 16) != 0 ? C31905Bg4.stripe_ic_error : i4;
        if ((i7 & 32) != 0) {
            of = SetsKt__SetsJVMKt.setOf(3);
            set2 = of;
        } else {
            set2 = set;
        }
        int i10 = (i7 & 64) != 0 ? 16 : i5;
        Pattern pattern2 = (i7 & 128) != 0 ? null : pattern;
        if ((i7 & 512) != 0) {
            emptyMap = MapsKt__MapsKt.emptyMap();
            map3 = emptyMap;
        } else {
            map3 = map2;
        }
    }
}
