package com.stripe.android.financialconnections.model;

import com.stripe.android.financialconnections.model.OwnershipRefresh;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import p000.InterfaceC44940mB1;
@Metadata(m28433d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"com/stripe/android/financialconnections/model/OwnershipRefresh.$serializer", "LmB1;", "Lcom/stripe/android/financialconnections/model/OwnershipRefresh;", "", "LKj2;", "childSerializers", "()[LKj2;", "LGV0;", "decoder", "deserialize", "Lrb1;", "encoder", "value", "", "serialize", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class OwnershipRefresh$$serializer implements InterfaceC44940mB1<OwnershipRefresh> {
    public static final int $stable = 0;
    public static final OwnershipRefresh$$serializer INSTANCE;
    private static final /* synthetic */ AW3 descriptor;

    static {
        OwnershipRefresh$$serializer ownershipRefresh$$serializer = new OwnershipRefresh$$serializer();
        INSTANCE = ownershipRefresh$$serializer;
        AW3 aw3 = new AW3("com.stripe.android.financialconnections.model.OwnershipRefresh", ownershipRefresh$$serializer, 2);
        aw3.m115697k("last_attempted_at", false);
        aw3.m115697k("status", true);
        descriptor = aw3;
    }

    private OwnershipRefresh$$serializer() {
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] childSerializers() {
        return new InterfaceC34036Kj2[]{F52.f8705a, OwnershipRefresh.Status.Companion.serializer()};
    }

    @Override // p000.E01
    public OwnershipRefresh deserialize(GV0 decoder) {
        int i;
        Object obj;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36230Tt0 mo3298b = decoder.mo3298b(descriptor2);
        if (mo3298b.mo3290k()) {
            i = mo3298b.mo3293h(descriptor2, 0);
            obj = mo3298b.mo3283s(descriptor2, 1, OwnershipRefresh.Status.Companion.serializer(), null);
            i2 = 3;
        } else {
            boolean z = true;
            i = 0;
            int i3 = 0;
            Object obj2 = null;
            while (z) {
                int mo11843q = mo3298b.mo11843q(descriptor2);
                if (mo11843q == -1) {
                    z = false;
                } else if (mo11843q == 0) {
                    i = mo3298b.mo3293h(descriptor2, 0);
                    i3 |= 1;
                } else if (mo11843q != 1) {
                    throw new UnknownFieldException(mo11843q);
                } else {
                    obj2 = mo3298b.mo3283s(descriptor2, 1, OwnershipRefresh.Status.Companion.serializer(), obj2);
                    i3 |= 2;
                }
            }
            obj = obj2;
            i2 = i3;
        }
        mo3298b.mo3300a(descriptor2);
        return new OwnershipRefresh(i2, i, (OwnershipRefresh.Status) obj, (C38819bt5) null);
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC40615et5
    public void serialize(InterfaceC48140rb1 encoder, OwnershipRefresh value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36464Ut0 mo1149b = encoder.mo1149b(descriptor2);
        OwnershipRefresh.write$Self(value, mo1149b, descriptor2);
        mo1149b.mo1151a(descriptor2);
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] typeParametersSerializers() {
        return InterfaceC44940mB1.C25934a.m26189a(this);
    }
}
