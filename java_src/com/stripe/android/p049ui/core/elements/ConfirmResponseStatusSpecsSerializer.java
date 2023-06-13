package com.stripe.android.p049ui.core.elements;

import com.stripe.android.p049ui.core.elements.ConfirmResponseStatusSpecs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecsSerializer;", "Lki2;", "Lcom/stripe/android/ui/core/elements/ConfirmResponseStatusSpecs;", "Lxi2;", "element", "LE01;", "selectDeserializer", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.ConfirmResponseStatusSpecsSerializer */
/* loaded from: classes7.dex */
public final class ConfirmResponseStatusSpecsSerializer extends AbstractC44060ki2<ConfirmResponseStatusSpecs> {
    public static final int $stable = 0;
    public static final ConfirmResponseStatusSpecsSerializer INSTANCE = new ConfirmResponseStatusSpecsSerializer();

    private ConfirmResponseStatusSpecsSerializer() {
        super(Reflection.getOrCreateKotlinClass(ConfirmResponseStatusSpecs.class));
    }

    @Override // p000.AbstractC44060ki2
    public E01<ConfirmResponseStatusSpecs> selectDeserializer(AbstractC51767xi2 element) {
        String str;
        AbstractC37303Yi2 m521l;
        Intrinsics.checkNotNullParameter(element, "element");
        AbstractC51767xi2 abstractC51767xi2 = (AbstractC51767xi2) C52953zi2.m522k(element).get("type");
        if (abstractC51767xi2 != null && (m521l = C52953zi2.m521l(abstractC51767xi2)) != null) {
            str = m521l.mo74434a();
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -673660814) {
                if (hashCode != -130219154) {
                    if (hashCode == -123173735 && str.equals("canceled")) {
                        return ConfirmResponseStatusSpecs.CanceledSpec.INSTANCE.serializer();
                    }
                } else if (str.equals("redirect_to_url")) {
                    return ConfirmResponseStatusSpecs.RedirectNextActionSpec.Companion.serializer();
                }
            } else if (str.equals("finished")) {
                return ConfirmResponseStatusSpecs.FinishedSpec.INSTANCE.serializer();
            }
        }
        return ConfirmResponseStatusSpecs.CanceledSpec.INSTANCE.serializer();
    }
}
