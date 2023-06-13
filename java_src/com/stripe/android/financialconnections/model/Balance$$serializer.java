package com.stripe.android.financialconnections.model;

import com.stripe.android.financialconnections.model.Balance;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import p000.InterfaceC44940mB1;
@Metadata(m28433d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"com/stripe/android/financialconnections/model/Balance.$serializer", "LmB1;", "Lcom/stripe/android/financialconnections/model/Balance;", "", "LKj2;", "childSerializers", "()[LKj2;", "LGV0;", "decoder", "deserialize", "Lrb1;", "encoder", "value", "", "serialize", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class Balance$$serializer implements InterfaceC44940mB1<Balance> {
    public static final int $stable = 0;
    public static final Balance$$serializer INSTANCE;
    private static final /* synthetic */ AW3 descriptor;

    static {
        Balance$$serializer balance$$serializer = new Balance$$serializer();
        INSTANCE = balance$$serializer;
        AW3 aw3 = new AW3("com.stripe.android.financialconnections.model.Balance", balance$$serializer, 5);
        aw3.m115697k("as_of", false);
        aw3.m115697k("current", false);
        aw3.m115697k("type", true);
        aw3.m115697k("cash", true);
        aw3.m115697k("credit", true);
        descriptor = aw3;
    }

    private Balance$$serializer() {
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] childSerializers() {
        F52 f52 = F52.f8705a;
        return new InterfaceC34036Kj2[]{f52, new C35512Qr2(C41539gS5.f82260a, f52), Balance.Type.Companion.serializer(), C38330b40.m65021p(CashBalance$$serializer.INSTANCE), C38330b40.m65021p(CreditBalance$$serializer.INSTANCE)};
    }

    @Override // p000.E01
    public Balance deserialize(GV0 decoder) {
        int i;
        int i2;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36230Tt0 mo3298b = decoder.mo3298b(descriptor2);
        int i3 = 3;
        if (mo3298b.mo3290k()) {
            int mo3293h = mo3298b.mo3293h(descriptor2, 0);
            obj = mo3298b.mo3283s(descriptor2, 1, new C35512Qr2(C41539gS5.f82260a, F52.f8705a), null);
            obj2 = mo3298b.mo3283s(descriptor2, 2, Balance.Type.Companion.serializer(), null);
            obj3 = mo3298b.mo3292i(descriptor2, 3, CashBalance$$serializer.INSTANCE, null);
            obj4 = mo3298b.mo3292i(descriptor2, 4, CreditBalance$$serializer.INSTANCE, null);
            i = mo3293h;
            i2 = 31;
        } else {
            boolean z = true;
            int i4 = 0;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            int i5 = 0;
            while (z) {
                int mo11843q = mo3298b.mo11843q(descriptor2);
                if (mo11843q != -1) {
                    if (mo11843q == 0) {
                        i4 = mo3298b.mo3293h(descriptor2, 0);
                        i5 |= 1;
                    } else if (mo11843q == 1) {
                        obj5 = mo3298b.mo3283s(descriptor2, 1, new C35512Qr2(C41539gS5.f82260a, F52.f8705a), obj5);
                        i5 |= 2;
                    } else if (mo11843q == 2) {
                        obj6 = mo3298b.mo3283s(descriptor2, 2, Balance.Type.Companion.serializer(), obj6);
                        i5 |= 4;
                    } else if (mo11843q == i3) {
                        obj7 = mo3298b.mo3292i(descriptor2, i3, CashBalance$$serializer.INSTANCE, obj7);
                        i5 |= 8;
                    } else if (mo11843q != 4) {
                        throw new UnknownFieldException(mo11843q);
                    } else {
                        obj8 = mo3298b.mo3292i(descriptor2, 4, CreditBalance$$serializer.INSTANCE, obj8);
                        i5 |= 16;
                    }
                    i3 = 3;
                } else {
                    z = false;
                }
            }
            i = i4;
            i2 = i5;
            obj = obj5;
            obj2 = obj6;
            obj3 = obj7;
            obj4 = obj8;
        }
        mo3298b.mo3300a(descriptor2);
        return new Balance(i2, i, (Map) obj, (Balance.Type) obj2, (CashBalance) obj3, (CreditBalance) obj4, (C38819bt5) null);
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC40615et5
    public void serialize(InterfaceC48140rb1 encoder, Balance value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36464Ut0 mo1149b = encoder.mo1149b(descriptor2);
        Balance.write$Self(value, mo1149b, descriptor2);
        mo1149b.mo1151a(descriptor2);
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] typeParametersSerializers() {
        return InterfaceC44940mB1.C25934a.m26189a(this);
    }
}
