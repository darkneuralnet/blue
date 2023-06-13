package com.stripe.android.p049ui.core.elements;

import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.IdentifierSpec$$serializer;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import p000.InterfaceC44940mB1;
@Metadata(m28433d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"com/stripe/android/ui/core/elements/AddressSpec.$serializer", "LmB1;", "Lcom/stripe/android/ui/core/elements/AddressSpec;", "", "LKj2;", "childSerializers", "()[LKj2;", "LGV0;", "decoder", "deserialize", "Lrb1;", "encoder", "value", "", "serialize", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: com.stripe.android.ui.core.elements.AddressSpec$$serializer */
/* loaded from: classes7.dex */
public final class AddressSpec$$serializer implements InterfaceC44940mB1<AddressSpec> {
    public static final int $stable = 0;
    public static final AddressSpec$$serializer INSTANCE;
    private static final /* synthetic */ AW3 descriptor;

    static {
        AddressSpec$$serializer addressSpec$$serializer = new AddressSpec$$serializer();
        INSTANCE = addressSpec$$serializer;
        AW3 aw3 = new AW3("com.stripe.android.ui.core.elements.AddressSpec", addressSpec$$serializer, 4);
        aw3.m115697k("api_path", true);
        aw3.m115697k("allowed_country_codes", true);
        aw3.m115697k("display_fields", true);
        aw3.m115697k("show_label", true);
        descriptor = aw3;
    }

    private AddressSpec$$serializer() {
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] childSerializers() {
        return new InterfaceC34036Kj2[]{IdentifierSpec$$serializer.INSTANCE, new C35980Sr2(C41539gS5.f82260a), new C35980Sr2(DisplayField.Companion.serializer()), C9804YY.f45990a};
    }

    @Override // p000.E01
    public AddressSpec deserialize(GV0 decoder) {
        Object obj;
        int i;
        Object obj2;
        boolean z;
        Object obj3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36230Tt0 mo3298b = decoder.mo3298b(descriptor2);
        if (mo3298b.mo3290k()) {
            obj3 = mo3298b.mo3283s(descriptor2, 0, IdentifierSpec$$serializer.INSTANCE, null);
            obj2 = mo3298b.mo3283s(descriptor2, 1, new C35980Sr2(C41539gS5.f82260a), null);
            Object mo3283s = mo3298b.mo3283s(descriptor2, 2, new C35980Sr2(DisplayField.Companion.serializer()), null);
            z = mo3298b.mo3322E(descriptor2, 3);
            obj = mo3283s;
            i = 15;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            Object obj4 = null;
            Object obj5 = null;
            obj = null;
            int i2 = 0;
            while (z2) {
                int mo11843q = mo3298b.mo11843q(descriptor2);
                if (mo11843q == -1) {
                    z2 = false;
                } else if (mo11843q == 0) {
                    obj4 = mo3298b.mo3283s(descriptor2, 0, IdentifierSpec$$serializer.INSTANCE, obj4);
                    i2 |= 1;
                } else if (mo11843q == 1) {
                    obj5 = mo3298b.mo3283s(descriptor2, 1, new C35980Sr2(C41539gS5.f82260a), obj5);
                    i2 |= 2;
                } else if (mo11843q == 2) {
                    obj = mo3298b.mo3283s(descriptor2, 2, new C35980Sr2(DisplayField.Companion.serializer()), obj);
                    i2 |= 4;
                } else if (mo11843q != 3) {
                    throw new UnknownFieldException(mo11843q);
                } else {
                    z3 = mo3298b.mo3322E(descriptor2, 3);
                    i2 |= 8;
                }
            }
            i = i2;
            obj2 = obj5;
            Object obj6 = obj4;
            z = z3;
            obj3 = obj6;
        }
        mo3298b.mo3300a(descriptor2);
        return new AddressSpec(i, (IdentifierSpec) obj3, (Set) obj2, (Set) obj, z, null);
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC40615et5
    public void serialize(InterfaceC48140rb1 encoder, AddressSpec value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36464Ut0 mo1149b = encoder.mo1149b(descriptor2);
        AddressSpec.write$Self(value, mo1149b, descriptor2);
        mo1149b.mo1151a(descriptor2);
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] typeParametersSerializers() {
        return InterfaceC44940mB1.C25934a.m26189a(this);
    }
}
