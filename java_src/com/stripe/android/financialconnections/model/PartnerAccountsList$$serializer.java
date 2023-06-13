package com.stripe.android.financialconnections.model;

import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import p000.InterfaceC44940mB1;
@Metadata(m28433d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"com/stripe/android/financialconnections/model/PartnerAccountsList.$serializer", "LmB1;", "Lcom/stripe/android/financialconnections/model/PartnerAccountsList;", "", "LKj2;", "childSerializers", "()[LKj2;", "LGV0;", "decoder", "deserialize", "Lrb1;", "encoder", "value", "", "serialize", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class PartnerAccountsList$$serializer implements InterfaceC44940mB1<PartnerAccountsList> {
    public static final int $stable = 0;
    public static final PartnerAccountsList$$serializer INSTANCE;
    private static final /* synthetic */ AW3 descriptor;

    static {
        PartnerAccountsList$$serializer partnerAccountsList$$serializer = new PartnerAccountsList$$serializer();
        INSTANCE = partnerAccountsList$$serializer;
        AW3 aw3 = new AW3("com.stripe.android.financialconnections.model.PartnerAccountsList", partnerAccountsList$$serializer, 8);
        aw3.m115697k(MessageExtension.FIELD_DATA, false);
        aw3.m115697k("has_more", false);
        aw3.m115697k("next_pane", false);
        aw3.m115697k("url", false);
        aw3.m115697k("count", true);
        aw3.m115697k("repair_authorization_enabled", true);
        aw3.m115697k("skip_account_selection", true);
        aw3.m115697k("total_count", true);
        descriptor = aw3;
    }

    private PartnerAccountsList$$serializer() {
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] childSerializers() {
        C9804YY c9804yy = C9804YY.f45990a;
        F52 f52 = F52.f8705a;
        return new InterfaceC34036Kj2[]{new C27999ro(PartnerAccount$$serializer.INSTANCE), c9804yy, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, C41539gS5.f82260a, C38330b40.m65021p(f52), C38330b40.m65021p(c9804yy), C38330b40.m65021p(c9804yy), C38330b40.m65021p(f52)};
    }

    @Override // p000.E01
    public PartnerAccountsList deserialize(GV0 decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        Object obj5;
        String str;
        boolean z;
        Object obj6;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36230Tt0 mo3298b = decoder.mo3298b(descriptor2);
        int i2 = 7;
        int i3 = 6;
        if (mo3298b.mo3290k()) {
            obj6 = mo3298b.mo3283s(descriptor2, 0, new C27999ro(PartnerAccount$$serializer.INSTANCE), null);
            z = mo3298b.mo3322E(descriptor2, 1);
            obj5 = mo3298b.mo3283s(descriptor2, 2, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, null);
            String mo3296e = mo3298b.mo3296e(descriptor2, 3);
            F52 f52 = F52.f8705a;
            Object mo3292i = mo3298b.mo3292i(descriptor2, 4, f52, null);
            C9804YY c9804yy = C9804YY.f45990a;
            obj4 = mo3298b.mo3292i(descriptor2, 5, c9804yy, null);
            obj3 = mo3298b.mo3292i(descriptor2, 6, c9804yy, null);
            obj2 = mo3298b.mo3292i(descriptor2, 7, f52, null);
            str = mo3296e;
            obj = mo3292i;
            i = 255;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            String str2 = null;
            obj = null;
            Object obj11 = null;
            int i4 = 0;
            while (z2) {
                int mo11843q = mo3298b.mo11843q(descriptor2);
                switch (mo11843q) {
                    case -1:
                        z2 = false;
                        i3 = 6;
                        break;
                    case 0:
                        obj9 = mo3298b.mo3283s(descriptor2, 0, new C27999ro(PartnerAccount$$serializer.INSTANCE), obj9);
                        i4 |= 1;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 1:
                        z3 = mo3298b.mo3322E(descriptor2, 1);
                        i4 |= 2;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 2:
                        obj10 = mo3298b.mo3283s(descriptor2, 2, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, obj10);
                        i4 |= 4;
                        i2 = 7;
                        i3 = 6;
                        break;
                    case 3:
                        str2 = mo3298b.mo3296e(descriptor2, 3);
                        i4 |= 8;
                        break;
                    case 4:
                        obj = mo3298b.mo3292i(descriptor2, 4, F52.f8705a, obj);
                        i4 |= 16;
                        break;
                    case 5:
                        obj11 = mo3298b.mo3292i(descriptor2, 5, C9804YY.f45990a, obj11);
                        i4 |= 32;
                        break;
                    case 6:
                        obj8 = mo3298b.mo3292i(descriptor2, i3, C9804YY.f45990a, obj8);
                        i4 |= 64;
                        break;
                    case 7:
                        obj7 = mo3298b.mo3292i(descriptor2, i2, F52.f8705a, obj7);
                        i4 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(mo11843q);
                }
            }
            obj2 = obj7;
            obj3 = obj8;
            obj4 = obj11;
            i = i4;
            obj5 = obj10;
            str = str2;
            z = z3;
            obj6 = obj9;
        }
        mo3298b.mo3300a(descriptor2);
        return new PartnerAccountsList(i, (List) obj6, z, (FinancialConnectionsSessionManifest.Pane) obj5, str, (Integer) obj, (Boolean) obj4, (Boolean) obj3, (Integer) obj2, (C38819bt5) null);
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC40615et5
    public void serialize(InterfaceC48140rb1 encoder, PartnerAccountsList value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36464Ut0 mo1149b = encoder.mo1149b(descriptor2);
        PartnerAccountsList.write$Self(value, mo1149b, descriptor2);
        mo1149b.mo1151a(descriptor2);
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] typeParametersSerializers() {
        return InterfaceC44940mB1.C25934a.m26189a(this);
    }
}
