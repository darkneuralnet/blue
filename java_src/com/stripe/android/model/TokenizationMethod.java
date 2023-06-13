package com.stripe.android.model;

import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum ApplePay uses external variables
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
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0015\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/model/TokenizationMethod;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "", "(Ljava/lang/String;ILjava/util/Set;)V", "ApplePay", "GooglePay", "Masterpass", "VisaCheckout", "Companion", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class TokenizationMethod {
    private static final /* synthetic */ TokenizationMethod[] $VALUES;
    public static final TokenizationMethod ApplePay;
    public static final Companion Companion;
    public static final TokenizationMethod GooglePay;
    public static final TokenizationMethod Masterpass;
    public static final TokenizationMethod VisaCheckout;
    private final Set<String> code;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/TokenizationMethod$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/TokenizationMethod;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nTokenizationMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TokenizationMethod.kt\ncom/stripe/android/model/TokenizationMethod$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,35:1\n1282#2,2:36\n*S KotlinDebug\n*F\n+ 1 TokenizationMethod.kt\ncom/stripe/android/model/TokenizationMethod$Companion\n*L\n29#1:36,2\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TokenizationMethod fromCode(String str) {
            TokenizationMethod[] values;
            boolean contains;
            for (TokenizationMethod tokenizationMethod : TokenizationMethod.values()) {
                contains = CollectionsKt___CollectionsKt.contains(tokenizationMethod.code, str);
                if (contains) {
                    return tokenizationMethod;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ TokenizationMethod[] $values() {
        return new TokenizationMethod[]{ApplePay, GooglePay, Masterpass, VisaCheckout};
    }

    static {
        Set of;
        Set of2;
        Set of3;
        Set of4;
        of = SetsKt__SetsJVMKt.setOf("apple_pay");
        ApplePay = new TokenizationMethod("ApplePay", 0, of);
        of2 = SetsKt__SetsKt.setOf((Object[]) new String[]{"android_pay", "google"});
        GooglePay = new TokenizationMethod("GooglePay", 1, of2);
        of3 = SetsKt__SetsJVMKt.setOf("masterpass");
        Masterpass = new TokenizationMethod("Masterpass", 2, of3);
        of4 = SetsKt__SetsJVMKt.setOf("visa_checkout");
        VisaCheckout = new TokenizationMethod("VisaCheckout", 3, of4);
        $VALUES = $values();
        Companion = new Companion(null);
    }

    private TokenizationMethod(String str, int i, Set set) {
        this.code = set;
    }

    public static TokenizationMethod valueOf(String str) {
        return (TokenizationMethod) Enum.valueOf(TokenizationMethod.class, str);
    }

    public static TokenizationMethod[] values() {
        return (TokenizationMethod[]) $VALUES.clone();
    }
}
