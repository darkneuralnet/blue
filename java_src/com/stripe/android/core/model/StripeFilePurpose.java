package com.stripe.android.core.model;

import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m28432d2 = {"Lcom/stripe/android/core/model/StripeFilePurpose;", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "BusinessIcon", "BusinessLogo", "CustomerSignature", "DisputeEvidence", "IdentityDocument", "PciDocument", "TaxDocumentUserUpload", "IdentityPrivate", "Companion", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public enum StripeFilePurpose {
    BusinessIcon("business_icon"),
    BusinessLogo("business_logo"),
    CustomerSignature("customer_signature"),
    DisputeEvidence("dispute_evidence"),
    IdentityDocument("identity_document"),
    PciDocument("pci_document"),
    TaxDocumentUserUpload("tax_document_user_upload"),
    IdentityPrivate("identity_private");
    
    public static final Companion Companion = new Companion(null);
    private final String code;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/core/model/StripeFilePurpose$Companion;", "", "()V", "fromCode", "Lcom/stripe/android/core/model/StripeFilePurpose;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nStripeFilePurpose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeFilePurpose.kt\ncom/stripe/android/core/model/StripeFilePurpose$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,29:1\n1282#2,2:30\n*S KotlinDebug\n*F\n+ 1 StripeFilePurpose.kt\ncom/stripe/android/core/model/StripeFilePurpose$Companion\n*L\n25#1:30,2\n*E\n"})
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StripeFilePurpose fromCode(String str) {
            StripeFilePurpose[] values;
            for (StripeFilePurpose stripeFilePurpose : StripeFilePurpose.values()) {
                if (Intrinsics.areEqual(stripeFilePurpose.getCode(), str)) {
                    return stripeFilePurpose;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    StripeFilePurpose(String str) {
        this.code = str;
    }

    public final String getCode() {
        return this.code;
    }
}
