package com.stripe.android.p049ui.core.elements;

import com.stripe.android.uicore.elements.IdentifierSpec;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002HÆ\u0001R \u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/EmptyFormSpec;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "LKj2;", "serializer", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "apiPath", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath$annotations", "()V", "<init>", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.EmptyFormSpec */
/* loaded from: classes7.dex */
public final class EmptyFormSpec extends FormItemSpec {
    private static final /* synthetic */ Lazy<InterfaceC34036Kj2<Object>> $cachedSerializer$delegate;
    public static final EmptyFormSpec INSTANCE = new EmptyFormSpec();
    private static final IdentifierSpec apiPath = IdentifierSpec.Companion.Generic("empty");

    static {
        Lazy<InterfaceC34036Kj2<Object>> lazy;
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) EmptyFormSpec$$cachedSerializer$delegate$1.INSTANCE);
        $cachedSerializer$delegate = lazy;
    }

    private EmptyFormSpec() {
        super(null);
    }

    private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
        return $cachedSerializer$delegate;
    }

    @InterfaceC36694Vs5("api_path")
    public static /* synthetic */ void getApiPath$annotations() {
    }

    @Override // com.stripe.android.p049ui.core.elements.FormItemSpec
    public IdentifierSpec getApiPath() {
        return apiPath;
    }

    public final InterfaceC34036Kj2<EmptyFormSpec> serializer() {
        return (InterfaceC34036Kj2) get$cachedSerializer$delegate().getValue();
    }
}
