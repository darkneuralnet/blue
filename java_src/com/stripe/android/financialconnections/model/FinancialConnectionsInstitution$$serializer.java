package com.stripe.android.financialconnections.model;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import p000.InterfaceC44940mB1;
@Metadata(m28433d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsInstitution.$serializer", "LmB1;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "", "LKj2;", "childSerializers", "()[LKj2;", "LGV0;", "decoder", "deserialize", "Lrb1;", "encoder", "value", "", "serialize", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class FinancialConnectionsInstitution$$serializer implements InterfaceC44940mB1<FinancialConnectionsInstitution> {
    public static final int $stable = 0;
    public static final FinancialConnectionsInstitution$$serializer INSTANCE;
    private static final /* synthetic */ AW3 descriptor;

    static {
        FinancialConnectionsInstitution$$serializer financialConnectionsInstitution$$serializer = new FinancialConnectionsInstitution$$serializer();
        INSTANCE = financialConnectionsInstitution$$serializer;
        AW3 aw3 = new AW3("com.stripe.android.financialconnections.model.FinancialConnectionsInstitution", financialConnectionsInstitution$$serializer, 8);
        aw3.m115697k("featured", false);
        aw3.m115697k("id", false);
        aw3.m115697k("mobile_handoff_capable", false);
        aw3.m115697k("name", false);
        aw3.m115697k("icon", true);
        aw3.m115697k("logo", true);
        aw3.m115697k("featured_order", true);
        aw3.m115697k("url", true);
        descriptor = aw3;
    }

    private FinancialConnectionsInstitution$$serializer() {
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] childSerializers() {
        C9804YY c9804yy = C9804YY.f45990a;
        C41539gS5 c41539gS5 = C41539gS5.f82260a;
        Image$$serializer image$$serializer = Image$$serializer.INSTANCE;
        return new InterfaceC34036Kj2[]{c9804yy, c41539gS5, c9804yy, c41539gS5, C38330b40.m65021p(image$$serializer), C38330b40.m65021p(image$$serializer), C38330b40.m65021p(F52.f8705a), C38330b40.m65021p(c41539gS5)};
    }

    @Override // p000.E01
    public FinancialConnectionsInstitution deserialize(GV0 decoder) {
        boolean z;
        boolean z2;
        Object obj;
        Object obj2;
        Object obj3;
        int i;
        String str;
        String str2;
        Object obj4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36230Tt0 mo3298b = decoder.mo3298b(descriptor2);
        if (mo3298b.mo3290k()) {
            z = mo3298b.mo3322E(descriptor2, 0);
            String mo3296e = mo3298b.mo3296e(descriptor2, 1);
            boolean mo3322E = mo3298b.mo3322E(descriptor2, 2);
            String mo3296e2 = mo3298b.mo3296e(descriptor2, 3);
            Image$$serializer image$$serializer = Image$$serializer.INSTANCE;
            obj4 = mo3298b.mo3292i(descriptor2, 4, image$$serializer, null);
            obj3 = mo3298b.mo3292i(descriptor2, 5, image$$serializer, null);
            obj2 = mo3298b.mo3292i(descriptor2, 6, F52.f8705a, null);
            obj = mo3298b.mo3292i(descriptor2, 7, C41539gS5.f82260a, null);
            str2 = mo3296e2;
            z2 = mo3322E;
            i = 255;
            str = mo3296e;
        } else {
            boolean z3 = true;
            z = false;
            int i2 = 0;
            Object obj5 = null;
            Object obj6 = null;
            String str3 = null;
            String str4 = null;
            Object obj7 = null;
            Object obj8 = null;
            z2 = false;
            while (z3) {
                int mo11843q = mo3298b.mo11843q(descriptor2);
                switch (mo11843q) {
                    case -1:
                        z3 = false;
                        break;
                    case 0:
                        i2 |= 1;
                        z = mo3298b.mo3322E(descriptor2, 0);
                        continue;
                    case 1:
                        i2 |= 2;
                        str3 = mo3298b.mo3296e(descriptor2, 1);
                        continue;
                    case 2:
                        i2 |= 4;
                        z2 = mo3298b.mo3322E(descriptor2, 2);
                        continue;
                    case 3:
                        str4 = mo3298b.mo3296e(descriptor2, 3);
                        i2 |= 8;
                        continue;
                    case 4:
                        obj7 = mo3298b.mo3292i(descriptor2, 4, Image$$serializer.INSTANCE, obj7);
                        i2 |= 16;
                        break;
                    case 5:
                        obj8 = mo3298b.mo3292i(descriptor2, 5, Image$$serializer.INSTANCE, obj8);
                        i2 |= 32;
                        break;
                    case 6:
                        obj6 = mo3298b.mo3292i(descriptor2, 6, F52.f8705a, obj6);
                        i2 |= 64;
                        break;
                    case 7:
                        obj5 = mo3298b.mo3292i(descriptor2, 7, C41539gS5.f82260a, obj5);
                        i2 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(mo11843q);
                }
            }
            obj = obj5;
            obj2 = obj6;
            obj3 = obj8;
            i = i2;
            str = str3;
            str2 = str4;
            obj4 = obj7;
        }
        mo3298b.mo3300a(descriptor2);
        return new FinancialConnectionsInstitution(i, z, str, z2, str2, (Image) obj4, (Image) obj3, (Integer) obj2, (String) obj, (C38819bt5) null);
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC40615et5
    public void serialize(InterfaceC48140rb1 encoder, FinancialConnectionsInstitution value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36464Ut0 mo1149b = encoder.mo1149b(descriptor2);
        FinancialConnectionsInstitution.write$Self(value, mo1149b, descriptor2);
        mo1149b.mo1151a(descriptor2);
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] typeParametersSerializers() {
        return InterfaceC44940mB1.C25934a.m26189a(this);
    }
}
