package com.stripe.android.cards;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.CardUtils;
import com.stripe.android.model.CardBrand;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt___StringsKt;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/cards/CardNumber;", "", "()V", "Companion", "Unvalidated", "Validated", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "Lcom/stripe/android/cards/CardNumber$Validated;", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public abstract class CardNumber {
    public static final Companion Companion = new Companion(null);
    public static final int DEFAULT_PAN_LENGTH = 16;
    private static final Set<Integer> DEFAULT_SPACE_POSITIONS;
    public static final int MAX_PAN_LENGTH = 19;
    public static final int MIN_PAN_LENGTH = 14;
    private static final Map<Integer, Set<Integer>> SPACE_POSITIONS;

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/cards/CardNumber$Companion;", "", "()V", "DEFAULT_PAN_LENGTH", "", "DEFAULT_SPACE_POSITIONS", "", "MAX_PAN_LENGTH", "MIN_PAN_LENGTH", "SPACE_POSITIONS", "", "getSpacePositions", "panLength", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<Integer> getSpacePositions(int i) {
            Set<Integer> set = (Set) CardNumber.SPACE_POSITIONS.get(Integer.valueOf(i));
            if (set == null) {
                return CardNumber.DEFAULT_SPACE_POSITIONS;
            }
            return set;
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0014\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u000eH\u0002J\u0012\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u000eH\u0007J\t\u0010\u001c\u001a\u00020\u000eHÖ\u0001J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u000eH\u0007J\b\u0010\u001e\u001a\u00020\nH\u0007J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0012\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u001a\u001a\u00020\u000eH\u0007R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, m28432d2 = {"Lcom/stripe/android/cards/CardNumber$Unvalidated;", "Lcom/stripe/android/cards/CardNumber;", "denormalized", "", "(Ljava/lang/String;)V", "bin", "Lcom/stripe/android/cards/Bin;", "getBin", "()Lcom/stripe/android/cards/Bin;", "isMaxLength", "", "()Z", "isValidLuhn", "length", "", "getLength", "()I", "normalized", "getNormalized", "()Ljava/lang/String;", "component1", "copy", "equals", LegacyRepairType.OTHER_KEY, "", "formatNumber", "panLength", "getFormatted", "hashCode", "isPartialEntry", "isPossibleCardBrand", "toString", "validate", "Lcom/stripe/android/cards/CardNumber$Validated;", "Companion", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nCardNumber.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardNumber.kt\ncom/stripe/android/cards/CardNumber$Unvalidated\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,131:1\n483#2,11:132\n1864#3,3:143\n1627#4,6:146\n5261#4,7:152\n*S KotlinDebug\n*F\n+ 1 CardNumber.kt\ncom/stripe/android/cards/CardNumber$Unvalidated\n*L\n16#1:132,11\n61#1:143,3\n74#1:146,6\n82#1:152,7\n*E\n"})
    /* loaded from: classes6.dex */
    public static final class Unvalidated extends CardNumber {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final Set<Character> REJECT_CHARS;
        private final Bin bin;
        private final String denormalized;
        private final boolean isMaxLength;
        private final boolean isValidLuhn;
        private final int length;
        private final String normalized;

        @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\f\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m28432d2 = {"Lcom/stripe/android/cards/CardNumber$Unvalidated$Companion;", "", "()V", "REJECT_CHARS", "", "", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        static {
            Set<Character> of;
            of = SetsKt__SetsKt.setOf((Object[]) new Character[]{Character.valueOf(CoreConstants.DASH_CHAR), ' '});
            REJECT_CHARS = of;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unvalidated(String denormalized) {
            super(null);
            Intrinsics.checkNotNullParameter(denormalized, "denormalized");
            this.denormalized = denormalized;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < denormalized.length(); i++) {
                char charAt = denormalized.charAt(i);
                if (!REJECT_CHARS.contains(Character.valueOf(charAt))) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "filterNotTo(StringBuilder(), predicate).toString()");
            this.normalized = sb2;
            int length = sb2.length();
            this.length = length;
            this.isMaxLength = length == 19;
            this.bin = Bin.Companion.create(sb2);
            this.isValidLuhn = CardUtils.INSTANCE.isValidLuhnNumber(sb2);
        }

        private final String component1() {
            return this.denormalized;
        }

        public static /* synthetic */ Unvalidated copy$default(Unvalidated unvalidated, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unvalidated.denormalized;
            }
            return unvalidated.copy(str);
        }

        private final String formatNumber(int i) {
            String take;
            List list;
            List sorted;
            boolean z;
            String joinToString$default;
            boolean z2;
            boolean z3;
            Set<Integer> spacePositions = CardNumber.Companion.getSpacePositions(i);
            take = StringsKt___StringsKt.take(this.normalized, i);
            int size = spacePositions.size() + 1;
            String[] strArr = new String[size];
            int length = take.length();
            list = CollectionsKt___CollectionsKt.toList(spacePositions);
            sorted = CollectionsKt___CollectionsKt.sorted(list);
            int i2 = 0;
            int i3 = 0;
            for (Object obj : sorted) {
                int i4 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                int intValue = ((Number) obj).intValue() - i2;
                if (length > intValue) {
                    String substring = take.substring(i3, intValue);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    strArr[i2] = substring;
                    i3 = intValue;
                }
                i2 = i4;
            }
            int i5 = 0;
            while (true) {
                if (i5 < size) {
                    if (strArr[i5] == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        break;
                    }
                    i5++;
                } else {
                    i5 = -1;
                    break;
                }
            }
            Integer valueOf = Integer.valueOf(i5);
            if (valueOf.intValue() != -1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue2 = valueOf.intValue();
                String substring2 = take.substring(i3);
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
                strArr[intValue2] = substring2;
            }
            ArrayList arrayList = new ArrayList();
            for (int i6 = 0; i6 < size; i6++) {
                String str = strArr[i6];
                if (str != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    break;
                }
                arrayList.add(str);
            }
            joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, " ", null, null, 0, null, null, 62, null);
            return joinToString$default;
        }

        public static /* synthetic */ String getFormatted$default(Unvalidated unvalidated, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 16;
            }
            return unvalidated.getFormatted(i);
        }

        public final Unvalidated copy(String denormalized) {
            Intrinsics.checkNotNullParameter(denormalized, "denormalized");
            return new Unvalidated(denormalized);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unvalidated) && Intrinsics.areEqual(this.denormalized, ((Unvalidated) obj).denormalized);
        }

        public final Bin getBin() {
            return this.bin;
        }

        public final String getFormatted(int i) {
            return formatNumber(i);
        }

        public final int getLength() {
            return this.length;
        }

        public final String getNormalized() {
            return this.normalized;
        }

        public int hashCode() {
            return this.denormalized.hashCode();
        }

        public final boolean isMaxLength() {
            return this.isMaxLength;
        }

        public final boolean isPartialEntry(int i) {
            boolean isBlank;
            if (this.normalized.length() != i) {
                isBlank = StringsKt__StringsJVMKt.isBlank(this.normalized);
                if (!isBlank) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isPossibleCardBrand() {
            boolean isBlank;
            Object first;
            isBlank = StringsKt__StringsJVMKt.isBlank(this.normalized);
            if (!isBlank) {
                first = CollectionsKt___CollectionsKt.first((List<? extends Object>) CardBrand.Companion.getCardBrands(this.normalized));
                if (first != CardBrand.Unknown) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isValidLuhn() {
            return this.isValidLuhn;
        }

        public String toString() {
            String str = this.denormalized;
            return "Unvalidated(denormalized=" + str + ")";
        }

        public final Validated validate(int i) {
            if (i >= 14 && this.normalized.length() == i && this.isValidLuhn) {
                return new Validated(this.normalized);
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/cards/CardNumber$Validated;", "Lcom/stripe/android/cards/CardNumber;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Validated extends CardNumber {
        private final String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Validated(String value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public static /* synthetic */ Validated copy$default(Validated validated, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = validated.value;
            }
            return validated.copy(str);
        }

        public final String component1() {
            return this.value;
        }

        public final Validated copy(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Validated(value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Validated) && Intrinsics.areEqual(this.value, ((Validated) obj).value);
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            String str = this.value;
            return "Validated(value=" + str + ")";
        }
    }

    static {
        Set<Integer> of;
        Set of2;
        Set of3;
        Set of4;
        Set of5;
        Map<Integer, Set<Integer>> mapOf;
        of = SetsKt__SetsKt.setOf((Object[]) new Integer[]{4, 9, 14});
        DEFAULT_SPACE_POSITIONS = of;
        of2 = SetsKt__SetsKt.setOf((Object[]) new Integer[]{4, 11});
        of3 = SetsKt__SetsKt.setOf((Object[]) new Integer[]{4, 11});
        of4 = SetsKt__SetsKt.setOf((Object[]) new Integer[]{4, 9, 14});
        of5 = SetsKt__SetsKt.setOf((Object[]) new Integer[]{4, 9, 14, 19});
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(14, of2), TuplesKt.m28425to(15, of3), TuplesKt.m28425to(16, of4), TuplesKt.m28425to(19, of5));
        SPACE_POSITIONS = mapOf;
    }

    public /* synthetic */ CardNumber(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CardNumber() {
    }
}
