package com.stripe.android.cards;

import co.bird.android.model.LegacyRepairType;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/cards/Cvc;", "", "()V", "Companion", "Unvalidated", "Validated", "Lcom/stripe/android/cards/Cvc$Unvalidated;", "Lcom/stripe/android/cards/Cvc$Validated;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public abstract class Cvc {
    @Deprecated
    private static final int COMMON_LENGTH = 3;
    private static final Companion Companion = new Companion(null);

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/cards/Cvc$Companion;", "", "()V", "COMMON_LENGTH", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000fJ\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/cards/Cvc$Unvalidated;", "Lcom/stripe/android/cards/Cvc;", "denormalized", "", "(Ljava/lang/String;)V", "normalized", "getNormalized$payments_core_release", "()Ljava/lang/String;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "isComplete", "maxLength", "isPartialEntry", "toString", "validate", "Lcom/stripe/android/cards/Cvc$Validated;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nCvc.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cvc.kt\ncom/stripe/android/cards/Cvc$Unvalidated\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,38:1\n429#2:39\n502#2,5:40\n*S KotlinDebug\n*F\n+ 1 Cvc.kt\ncom/stripe/android/cards/Cvc$Unvalidated\n*L\n11#1:39\n11#1:40,5\n*E\n"})
    /* loaded from: classes6.dex */
    public static final class Unvalidated extends Cvc {
        private final String denormalized;
        private final String normalized;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unvalidated(String denormalized) {
            super(null);
            Intrinsics.checkNotNullParameter(denormalized, "denormalized");
            this.denormalized = denormalized;
            StringBuilder sb = new StringBuilder();
            int length = denormalized.length();
            for (int i = 0; i < length; i++) {
                char charAt = denormalized.charAt(i);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "filterTo(StringBuilder(), predicate).toString()");
            this.normalized = sb2;
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

        private final boolean isComplete(int i) {
            Set of;
            of = SetsKt__SetsKt.setOf((Object[]) new Integer[]{3, Integer.valueOf(i)});
            return of.contains(Integer.valueOf(this.normalized.length()));
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

        public final String getNormalized$payments_core_release() {
            return this.normalized;
        }

        public int hashCode() {
            return this.denormalized.hashCode();
        }

        public final boolean isPartialEntry(int i) {
            boolean isBlank;
            isBlank = StringsKt__StringsJVMKt.isBlank(this.normalized);
            return (isBlank ^ true) && !isComplete(i);
        }

        public String toString() {
            String str = this.denormalized;
            return "Unvalidated(denormalized=" + str + ")";
        }

        public final Validated validate(int i) {
            if (isComplete(i)) {
                return new Validated(this.normalized);
            }
            return null;
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\bJ\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/cards/Cvc$Validated;", "Lcom/stripe/android/cards/Cvc;", "value", "", "(Ljava/lang/String;)V", "getValue$payments_core_release", "()Ljava/lang/String;", "component1", "component1$payments_core_release", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Validated extends Cvc {
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

        public final String component1$payments_core_release() {
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

        public final String getValue$payments_core_release() {
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

    public /* synthetic */ Cvc(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Cvc() {
    }
}
