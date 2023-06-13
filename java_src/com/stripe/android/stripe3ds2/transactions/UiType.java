package com.stripe.android.stripe3ds2.transactions;

import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transactions/UiType;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "requiresSubmitButton", "", "(Ljava/lang/String;ILjava/lang/String;Z)V", "getCode", "()Ljava/lang/String;", "getRequiresSubmitButton$3ds2sdk_release", "()Z", "Text", "SingleSelect", "MultiSelect", "OutOfBand", "Html", "Companion", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public enum UiType {
    Text("01", true),
    SingleSelect("02", true),
    MultiSelect("03", true),
    OutOfBand("04", false),
    Html("05", false);
    
    public static final Companion Companion = new Companion(null);
    private final String code;
    private final boolean requiresSubmitButton;

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/transactions/UiType$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "fromCode$3ds2sdk_release", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UiType fromCode$3ds2sdk_release(String str) {
            UiType[] values;
            for (UiType uiType : UiType.values()) {
                if (Intrinsics.areEqual(str, uiType.getCode())) {
                    return uiType;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    UiType(String str, boolean z) {
        this.code = str;
        this.requiresSubmitButton = z;
    }

    public final String getCode() {
        return this.code;
    }

    public final boolean getRequiresSubmitButton$3ds2sdk_release() {
        return this.requiresSubmitButton;
    }
}
