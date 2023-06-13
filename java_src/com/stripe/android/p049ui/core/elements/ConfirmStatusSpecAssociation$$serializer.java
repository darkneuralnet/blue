package com.stripe.android.p049ui.core.elements;

import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import p000.InterfaceC44940mB1;
@Metadata(m28433d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"com/stripe/android/ui/core/elements/ConfirmStatusSpecAssociation.$serializer", "LmB1;", "Lcom/stripe/android/ui/core/elements/ConfirmStatusSpecAssociation;", "", "LKj2;", "childSerializers", "()[LKj2;", "LGV0;", "decoder", "deserialize", "Lrb1;", "encoder", "value", "", "serialize", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: com.stripe.android.ui.core.elements.ConfirmStatusSpecAssociation$$serializer */
/* loaded from: classes7.dex */
public final class ConfirmStatusSpecAssociation$$serializer implements InterfaceC44940mB1<ConfirmStatusSpecAssociation> {
    public static final int $stable = 0;
    public static final ConfirmStatusSpecAssociation$$serializer INSTANCE;
    private static final /* synthetic */ AW3 descriptor;

    static {
        ConfirmStatusSpecAssociation$$serializer confirmStatusSpecAssociation$$serializer = new ConfirmStatusSpecAssociation$$serializer();
        INSTANCE = confirmStatusSpecAssociation$$serializer;
        AW3 aw3 = new AW3("com.stripe.android.ui.core.elements.ConfirmStatusSpecAssociation", confirmStatusSpecAssociation$$serializer, 6);
        aw3.m115697k("requires_payment_method", true);
        aw3.m115697k("requires_confirmation", true);
        aw3.m115697k("requires_action", true);
        aw3.m115697k(BaseSheetViewModel.SAVE_PROCESSING, true);
        aw3.m115697k("succeeded", true);
        aw3.m115697k("canceled", true);
        descriptor = aw3;
    }

    private ConfirmStatusSpecAssociation$$serializer() {
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] childSerializers() {
        ConfirmResponseStatusSpecsSerializer confirmResponseStatusSpecsSerializer = ConfirmResponseStatusSpecsSerializer.INSTANCE;
        return new InterfaceC34036Kj2[]{C38330b40.m65021p(confirmResponseStatusSpecsSerializer), C38330b40.m65021p(confirmResponseStatusSpecsSerializer), C38330b40.m65021p(confirmResponseStatusSpecsSerializer), C38330b40.m65021p(confirmResponseStatusSpecsSerializer), C38330b40.m65021p(confirmResponseStatusSpecsSerializer), C38330b40.m65021p(confirmResponseStatusSpecsSerializer)};
    }

    @Override // p000.E01
    public ConfirmStatusSpecAssociation deserialize(GV0 decoder) {
        Object obj;
        int i;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36230Tt0 mo3298b = decoder.mo3298b(descriptor2);
        int i2 = 5;
        Object obj7 = null;
        if (mo3298b.mo3290k()) {
            ConfirmResponseStatusSpecsSerializer confirmResponseStatusSpecsSerializer = ConfirmResponseStatusSpecsSerializer.INSTANCE;
            obj2 = mo3298b.mo3292i(descriptor2, 0, confirmResponseStatusSpecsSerializer, null);
            obj3 = mo3298b.mo3292i(descriptor2, 1, confirmResponseStatusSpecsSerializer, null);
            obj4 = mo3298b.mo3292i(descriptor2, 2, confirmResponseStatusSpecsSerializer, null);
            Object mo3292i = mo3298b.mo3292i(descriptor2, 3, confirmResponseStatusSpecsSerializer, null);
            obj5 = mo3298b.mo3292i(descriptor2, 4, confirmResponseStatusSpecsSerializer, null);
            obj6 = mo3298b.mo3292i(descriptor2, 5, confirmResponseStatusSpecsSerializer, null);
            obj = mo3292i;
            i = 63;
        } else {
            boolean z = true;
            int i3 = 0;
            Object obj8 = null;
            Object obj9 = null;
            obj = null;
            Object obj10 = null;
            Object obj11 = null;
            while (z) {
                int mo11843q = mo3298b.mo11843q(descriptor2);
                switch (mo11843q) {
                    case -1:
                        z = false;
                        i2 = 5;
                    case 0:
                        obj7 = mo3298b.mo3292i(descriptor2, 0, ConfirmResponseStatusSpecsSerializer.INSTANCE, obj7);
                        i3 |= 1;
                        i2 = 5;
                    case 1:
                        obj8 = mo3298b.mo3292i(descriptor2, 1, ConfirmResponseStatusSpecsSerializer.INSTANCE, obj8);
                        i3 |= 2;
                    case 2:
                        obj9 = mo3298b.mo3292i(descriptor2, 2, ConfirmResponseStatusSpecsSerializer.INSTANCE, obj9);
                        i3 |= 4;
                    case 3:
                        obj = mo3298b.mo3292i(descriptor2, 3, ConfirmResponseStatusSpecsSerializer.INSTANCE, obj);
                        i3 |= 8;
                    case 4:
                        obj10 = mo3298b.mo3292i(descriptor2, 4, ConfirmResponseStatusSpecsSerializer.INSTANCE, obj10);
                        i3 |= 16;
                    case 5:
                        obj11 = mo3298b.mo3292i(descriptor2, i2, ConfirmResponseStatusSpecsSerializer.INSTANCE, obj11);
                        i3 |= 32;
                    default:
                        throw new UnknownFieldException(mo11843q);
                }
            }
            i = i3;
            obj2 = obj7;
            obj3 = obj8;
            obj4 = obj9;
            obj5 = obj10;
            obj6 = obj11;
        }
        mo3298b.mo3300a(descriptor2);
        return new ConfirmStatusSpecAssociation(i, (ConfirmResponseStatusSpecs) obj2, (ConfirmResponseStatusSpecs) obj3, (ConfirmResponseStatusSpecs) obj4, (ConfirmResponseStatusSpecs) obj, (ConfirmResponseStatusSpecs) obj5, (ConfirmResponseStatusSpecs) obj6, (C38819bt5) null);
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC40615et5
    public void serialize(InterfaceC48140rb1 encoder, ConfirmStatusSpecAssociation value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36464Ut0 mo1149b = encoder.mo1149b(descriptor2);
        ConfirmStatusSpecAssociation.write$Self(value, mo1149b, descriptor2);
        mo1149b.mo1151a(descriptor2);
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] typeParametersSerializers() {
        return InterfaceC44940mB1.C25934a.m26189a(this);
    }
}
