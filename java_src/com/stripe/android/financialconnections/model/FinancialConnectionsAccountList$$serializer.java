package com.stripe.android.financialconnections.model;

import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import p000.InterfaceC44940mB1;
@Metadata(m28433d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsAccountList.$serializer", "LmB1;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccountList;", "", "LKj2;", "childSerializers", "()[LKj2;", "LGV0;", "decoder", "deserialize", "Lrb1;", "encoder", "value", "", "serialize", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class FinancialConnectionsAccountList$$serializer implements InterfaceC44940mB1<FinancialConnectionsAccountList> {
    public static final int $stable = 0;
    public static final FinancialConnectionsAccountList$$serializer INSTANCE;
    private static final /* synthetic */ AW3 descriptor;

    static {
        FinancialConnectionsAccountList$$serializer financialConnectionsAccountList$$serializer = new FinancialConnectionsAccountList$$serializer();
        INSTANCE = financialConnectionsAccountList$$serializer;
        AW3 aw3 = new AW3("com.stripe.android.financialconnections.model.FinancialConnectionsAccountList", financialConnectionsAccountList$$serializer, 5);
        aw3.m115697k(MessageExtension.FIELD_DATA, false);
        aw3.m115697k("has_more", false);
        aw3.m115697k("url", false);
        aw3.m115697k("count", true);
        aw3.m115697k("total_count", true);
        descriptor = aw3;
    }

    private FinancialConnectionsAccountList$$serializer() {
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] childSerializers() {
        F52 f52 = F52.f8705a;
        return new InterfaceC34036Kj2[]{new C27999ro(FinancialConnectionsAccount$$serializer.INSTANCE), C9804YY.f45990a, C41539gS5.f82260a, C38330b40.m65021p(f52), C38330b40.m65021p(f52)};
    }

    @Override // p000.E01
    public FinancialConnectionsAccountList deserialize(GV0 decoder) {
        int i;
        Object obj;
        Object obj2;
        boolean z;
        Object obj3;
        String str;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36230Tt0 mo3298b = decoder.mo3298b(descriptor2);
        if (mo3298b.mo3290k()) {
            obj3 = mo3298b.mo3283s(descriptor2, 0, new C27999ro(FinancialConnectionsAccount$$serializer.INSTANCE), null);
            boolean mo3322E = mo3298b.mo3322E(descriptor2, 1);
            String mo3296e = mo3298b.mo3296e(descriptor2, 2);
            F52 f52 = F52.f8705a;
            obj = mo3298b.mo3292i(descriptor2, 3, f52, null);
            obj2 = mo3298b.mo3292i(descriptor2, 4, f52, null);
            str = mo3296e;
            z = mo3322E;
            i = 31;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            Object obj4 = null;
            String str2 = null;
            Object obj5 = null;
            Object obj6 = null;
            int i2 = 0;
            while (z2) {
                int mo11843q = mo3298b.mo11843q(descriptor2);
                if (mo11843q == -1) {
                    z2 = false;
                } else if (mo11843q == 0) {
                    obj4 = mo3298b.mo3283s(descriptor2, 0, new C27999ro(FinancialConnectionsAccount$$serializer.INSTANCE), obj4);
                    i2 |= 1;
                } else if (mo11843q == 1) {
                    z3 = mo3298b.mo3322E(descriptor2, 1);
                    i2 |= 2;
                } else if (mo11843q == 2) {
                    str2 = mo3298b.mo3296e(descriptor2, 2);
                    i2 |= 4;
                } else if (mo11843q == 3) {
                    obj5 = mo3298b.mo3292i(descriptor2, 3, F52.f8705a, obj5);
                    i2 |= 8;
                } else if (mo11843q != 4) {
                    throw new UnknownFieldException(mo11843q);
                } else {
                    obj6 = mo3298b.mo3292i(descriptor2, 4, F52.f8705a, obj6);
                    i2 |= 16;
                }
            }
            i = i2;
            obj = obj5;
            obj2 = obj6;
            z = z3;
            obj3 = obj4;
            str = str2;
        }
        mo3298b.mo3300a(descriptor2);
        return new FinancialConnectionsAccountList(i, (List) obj3, z, str, (Integer) obj, (Integer) obj2, (C38819bt5) null);
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC40615et5
    public void serialize(InterfaceC48140rb1 encoder, FinancialConnectionsAccountList value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36464Ut0 mo1149b = encoder.mo1149b(descriptor2);
        FinancialConnectionsAccountList.write$Self(value, mo1149b, descriptor2);
        mo1149b.mo1151a(descriptor2);
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] typeParametersSerializers() {
        return InterfaceC44940mB1.C25934a.m26189a(this);
    }
}