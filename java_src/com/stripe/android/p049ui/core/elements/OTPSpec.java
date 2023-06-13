package com.stripe.android.p049ui.core.elements;

import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.OTPController;
import com.stripe.android.uicore.elements.OTPElement;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/OTPSpec;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "Lcom/stripe/android/uicore/elements/OTPElement;", "transform", "LKj2;", "serializer", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "apiPath", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.OTPSpec */
/* loaded from: classes7.dex */
public final class OTPSpec extends FormItemSpec {
    private static final /* synthetic */ Lazy<InterfaceC34036Kj2<Object>> $cachedSerializer$delegate;
    public static final int $stable = 0;
    public static final OTPSpec INSTANCE = new OTPSpec();

    static {
        Lazy<InterfaceC34036Kj2<Object>> lazy;
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) OTPSpec$$cachedSerializer$delegate$1.INSTANCE);
        $cachedSerializer$delegate = lazy;
    }

    private OTPSpec() {
        super(null);
    }

    private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
        return $cachedSerializer$delegate;
    }

    @Override // com.stripe.android.p049ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return IdentifierSpec.Companion.Generic("otp");
    }

    public final InterfaceC34036Kj2<OTPSpec> serializer() {
        return (InterfaceC34036Kj2) get$cachedSerializer$delegate().getValue();
    }

    public final OTPElement transform() {
        return new OTPElement(getApiPath(), new OTPController(0, 1, null));
    }
}
