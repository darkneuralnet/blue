package com.stripe.android.model;

import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/model/CvcCheck;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "requiresRecollection", "", "getRequiresRecollection", "()Z", "Pass", "Fail", "Unavailable", "Unchecked", "Unknown", "Companion", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public enum CvcCheck {
    Pass("PASS"),
    Fail("FAIL"),
    Unavailable("UNAVAILABLE"),
    Unchecked("UNCHECKED"),
    Unknown("UNKNOWN");
    
    public static final Companion Companion = new Companion(null);
    private final String code;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/model/CvcCheck$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/model/CvcCheck;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nCvcCheck.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CvcCheck.kt\ncom/stripe/android/model/CvcCheck$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,25:1\n1282#2,2:26\n*S KotlinDebug\n*F\n+ 1 CvcCheck.kt\ncom/stripe/android/model/CvcCheck$Companion\n*L\n21#1:26,2\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CvcCheck fromCode(String str) {
            CvcCheck cvcCheck;
            boolean equals;
            CvcCheck[] values = CvcCheck.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    cvcCheck = values[i];
                    equals = StringsKt__StringsJVMKt.equals(cvcCheck.getCode(), str, true);
                    if (equals) {
                        break;
                    }
                    i++;
                } else {
                    cvcCheck = null;
                    break;
                }
            }
            if (cvcCheck == null) {
                return CvcCheck.Unknown;
            }
            return cvcCheck;
        }

        private Companion() {
        }
    }

    CvcCheck(String str) {
        this.code = str;
    }

    public final String getCode() {
        return this.code;
    }

    public final boolean getRequiresRecollection() {
        Set of;
        of = SetsKt__SetsKt.setOf((Object[]) new CvcCheck[]{Fail, Unavailable, Unchecked});
        return of.contains(this);
    }
}
