package com.stripe.android.p049ui.core.elements;

import com.stripe.android.p049ui.core.elements.PostConfirmHandlingPiStatusSpecs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecsSerializer;", "Lki2;", "Lcom/stripe/android/ui/core/elements/PostConfirmHandlingPiStatusSpecs;", "Lxi2;", "element", "LE01;", "selectDeserializer", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.PostConfirmHandlingPiStatusSpecsSerializer */
/* loaded from: classes7.dex */
public final class PostConfirmHandlingPiStatusSpecsSerializer extends AbstractC44060ki2<PostConfirmHandlingPiStatusSpecs> {
    public static final int $stable = 0;
    public static final PostConfirmHandlingPiStatusSpecsSerializer INSTANCE = new PostConfirmHandlingPiStatusSpecsSerializer();

    private PostConfirmHandlingPiStatusSpecsSerializer() {
        super(Reflection.getOrCreateKotlinClass(PostConfirmHandlingPiStatusSpecs.class));
    }

    @Override // p000.AbstractC44060ki2
    public E01<PostConfirmHandlingPiStatusSpecs> selectDeserializer(AbstractC51767xi2 element) {
        String str;
        AbstractC37303Yi2 m521l;
        Intrinsics.checkNotNullParameter(element, "element");
        AbstractC51767xi2 abstractC51767xi2 = (AbstractC51767xi2) C52953zi2.m522k(element).get("type");
        if (abstractC51767xi2 != null && (m521l = C52953zi2.m521l(abstractC51767xi2)) != null) {
            str = m521l.mo74434a();
        } else {
            str = null;
        }
        if (Intrinsics.areEqual(str, "finished")) {
            return PostConfirmHandlingPiStatusSpecs.FinishedSpec.INSTANCE.serializer();
        }
        if (Intrinsics.areEqual(str, "canceled")) {
            return PostConfirmHandlingPiStatusSpecs.CanceledSpec.INSTANCE.serializer();
        }
        return PostConfirmHandlingPiStatusSpecs.CanceledSpec.INSTANCE.serializer();
    }
}
