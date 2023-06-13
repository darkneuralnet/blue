package com.stripe.android.model;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.view.DateUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/ExpirationDate;", "", "()V", "Unvalidated", "Validated", "Lcom/stripe/android/model/ExpirationDate$Unvalidated;", "Lcom/stripe/android/model/ExpirationDate$Validated;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public abstract class ExpirationDate {
    public static final int $stable = 0;

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/model/ExpirationDate$Validated;", "Lcom/stripe/android/model/ExpirationDate;", "month", "", "year", "(II)V", "getMonth", "()I", "getYear", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Validated extends ExpirationDate {
        public static final int $stable = 0;
        private final int month;
        private final int year;

        public Validated(int i, int i2) {
            super(null);
            this.month = i;
            this.year = i2;
        }

        public static /* synthetic */ Validated copy$default(Validated validated, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = validated.month;
            }
            if ((i3 & 2) != 0) {
                i2 = validated.year;
            }
            return validated.copy(i, i2);
        }

        public final int component1() {
            return this.month;
        }

        public final int component2() {
            return this.year;
        }

        public final Validated copy(int i, int i2) {
            return new Validated(i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Validated) {
                Validated validated = (Validated) obj;
                return this.month == validated.month && this.year == validated.year;
            }
            return false;
        }

        public final int getMonth() {
            return this.month;
        }

        public final int getYear() {
            return this.year;
        }

        public int hashCode() {
            return (Integer.hashCode(this.month) * 31) + Integer.hashCode(this.year);
        }

        public String toString() {
            int i = this.month;
            int i2 = this.year;
            return "Validated(month=" + i + ", year=" + i2 + ")";
        }
    }

    public /* synthetic */ ExpirationDate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ExpirationDate() {
    }

    @Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0004\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00062\b\b\u0002\u0010\u0004\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\u0006\u0010\u0018\u001a\u00020\u0006J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cR\u0014\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, m28432d2 = {"Lcom/stripe/android/model/ExpirationDate$Unvalidated;", "Lcom/stripe/android/model/ExpirationDate;", "month", "", "year", "(II)V", "", "(Ljava/lang/String;Ljava/lang/String;)V", "isComplete", "", "isComplete$payments_core_release", "()Z", "isMonthValid", "isPartialEntry", "isPartialEntry$payments_core_release", "getMonth", "()Ljava/lang/String;", "getYear", "component1", "component2", "copy", "equals", LegacyRepairType.OTHER_KEY, "", "getDisplayString", "hashCode", "toString", "validate", "Lcom/stripe/android/model/ExpirationDate$Validated;", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Unvalidated extends ExpirationDate {
        public static final Companion Companion = new Companion(null);
        private static final Unvalidated EMPTY = new Unvalidated("", "");
        private final boolean isComplete;
        private final boolean isMonthValid;
        private final boolean isPartialEntry;
        private final String month;
        private final String year;

        @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/model/ExpirationDate$Unvalidated$Companion;", "", "()V", "EMPTY", "Lcom/stripe/android/model/ExpirationDate$Unvalidated;", "getEMPTY", "()Lcom/stripe/android/model/ExpirationDate$Unvalidated;", "create", "input", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        @SourceDebugExtension({"SMAP\nExpirationDate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpirationDate.kt\ncom/stripe/android/model/ExpirationDate$Unvalidated$Companion\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,98:1\n1064#2,2:99\n429#2:101\n502#2,5:102\n*S KotlinDebug\n*F\n+ 1 ExpirationDate.kt\ncom/stripe/android/model/ExpirationDate$Unvalidated$Companion\n*L\n77#1:99,2\n80#1:101\n80#1:102,5\n*E\n"})
        /* loaded from: classes7.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Unvalidated create(String input) {
                boolean z;
                String take;
                String drop;
                boolean isWhitespace;
                Intrinsics.checkNotNullParameter(input, "input");
                int i = 0;
                while (true) {
                    z = true;
                    if (i >= input.length()) {
                        break;
                    }
                    char charAt = input.charAt(i);
                    if (!Character.isDigit(charAt)) {
                        isWhitespace = CharsKt__CharJVMKt.isWhitespace(charAt);
                        if (!isWhitespace && charAt != '/') {
                            z = false;
                        }
                    }
                    if (!z) {
                        z = false;
                        break;
                    }
                    i++;
                }
                if (!z) {
                    return getEMPTY();
                }
                StringBuilder sb = new StringBuilder();
                int length = input.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt2 = input.charAt(i2);
                    if (Character.isDigit(charAt2)) {
                        sb.append(charAt2);
                    }
                }
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "filterTo(StringBuilder(), predicate).toString()");
                take = StringsKt___StringsKt.take(sb2, 2);
                drop = StringsKt___StringsKt.drop(sb2, 2);
                return new Unvalidated(take, drop);
            }

            public final Unvalidated getEMPTY() {
                return Unvalidated.EMPTY;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unvalidated(String month, String year) {
            super(null);
            Boolean m116783constructorimpl;
            Intrinsics.checkNotNullParameter(month, "month");
            Intrinsics.checkNotNullParameter(year, "year");
            this.month = month;
            this.year = year;
            boolean z = false;
            try {
                Result.Companion companion = Result.Companion;
                int parseInt = Integer.parseInt(month);
                m116783constructorimpl = Result.m116783constructorimpl(Boolean.valueOf(1 <= parseInt && parseInt < 13));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
            }
            this.isMonthValid = ((Boolean) (Result.m116789isFailureimpl(m116783constructorimpl) ? Boolean.FALSE : m116783constructorimpl)).booleanValue();
            boolean z2 = this.month.length() + this.year.length() == 4;
            this.isComplete = z2;
            if (!z2 && this.month.length() + this.year.length() > 0) {
                z = true;
            }
            this.isPartialEntry = z;
        }

        public static /* synthetic */ Unvalidated copy$default(Unvalidated unvalidated, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unvalidated.month;
            }
            if ((i & 2) != 0) {
                str2 = unvalidated.year;
            }
            return unvalidated.copy(str, str2);
        }

        public final String component1() {
            return this.month;
        }

        public final String component2() {
            return this.year;
        }

        public final Unvalidated copy(String month, String year) {
            Intrinsics.checkNotNullParameter(month, "month");
            Intrinsics.checkNotNullParameter(year, "year");
            return new Unvalidated(month, year);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Unvalidated) {
                Unvalidated unvalidated = (Unvalidated) obj;
                return Intrinsics.areEqual(this.month, unvalidated.month) && Intrinsics.areEqual(this.year, unvalidated.year);
            }
            return false;
        }

        public final String getDisplayString() {
            String padStart;
            String takeLast;
            String padStart2;
            List listOf;
            String joinToString$default;
            if (this.year.length() == 3) {
                return "";
            }
            padStart = StringsKt__StringsKt.padStart(this.month, 2, '0');
            takeLast = StringsKt___StringsKt.takeLast(this.year, 2);
            padStart2 = StringsKt__StringsKt.padStart(takeLast, 2, '0');
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{padStart, padStart2});
            joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(listOf, "", null, null, 0, null, null, 62, null);
            return joinToString$default;
        }

        public final String getMonth() {
            return this.month;
        }

        public final String getYear() {
            return this.year;
        }

        public int hashCode() {
            return (this.month.hashCode() * 31) + this.year.hashCode();
        }

        public final boolean isComplete$payments_core_release() {
            return this.isComplete;
        }

        public final boolean isMonthValid() {
            return this.isMonthValid;
        }

        public final boolean isPartialEntry$payments_core_release() {
            return this.isPartialEntry;
        }

        public String toString() {
            String str = this.month;
            String str2 = this.year;
            return "Unvalidated(month=" + str + ", year=" + str2 + ")";
        }

        public final Validated validate() {
            Object m116783constructorimpl;
            String str = this.month;
            String str2 = this.year;
            try {
                Result.Companion companion = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(new Validated(Integer.parseInt(str), DateUtils.INSTANCE.convertTwoDigitYearToFour(Integer.parseInt(str2))));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m116789isFailureimpl(m116783constructorimpl)) {
                m116783constructorimpl = null;
            }
            return (Validated) m116783constructorimpl;
        }

        public Unvalidated(int i, int i2) {
            this(String.valueOf(i), String.valueOf(i2));
        }
    }
}
