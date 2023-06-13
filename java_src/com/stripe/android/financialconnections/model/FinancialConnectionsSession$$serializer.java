package com.stripe.android.financialconnections.model;

import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.model.serializer.JsonAsStringSerializer;
import com.stripe.android.financialconnections.model.serializer.PaymentAccountSerializer;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import p000.InterfaceC44940mB1;
@Metadata(m28433d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsSession.$serializer", "LmB1;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "", "LKj2;", "childSerializers", "()[LKj2;", "LGV0;", "decoder", "deserialize", "Lrb1;", "encoder", "value", "", "serialize", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class FinancialConnectionsSession$$serializer implements InterfaceC44940mB1<FinancialConnectionsSession> {
    public static final int $stable = 0;
    public static final FinancialConnectionsSession$$serializer INSTANCE;
    private static final /* synthetic */ AW3 descriptor;

    static {
        FinancialConnectionsSession$$serializer financialConnectionsSession$$serializer = new FinancialConnectionsSession$$serializer();
        INSTANCE = financialConnectionsSession$$serializer;
        AW3 aw3 = new AW3("com.stripe.android.financialconnections.model.FinancialConnectionsSession", financialConnectionsSession$$serializer, 11);
        aw3.m115697k("client_secret", false);
        aw3.m115697k("id", false);
        aw3.m115697k("linked_accounts", true);
        aw3.m115697k("accounts", true);
        aw3.m115697k("livemode", false);
        aw3.m115697k("payment_account", true);
        aw3.m115697k("return_url", true);
        aw3.m115697k("bank_account_token", true);
        aw3.m115697k("manual_entry", true);
        aw3.m115697k("status", true);
        aw3.m115697k("status_details", true);
        descriptor = aw3;
    }

    private FinancialConnectionsSession$$serializer() {
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] childSerializers() {
        C41539gS5 c41539gS5 = C41539gS5.f82260a;
        FinancialConnectionsAccountList$$serializer financialConnectionsAccountList$$serializer = FinancialConnectionsAccountList$$serializer.INSTANCE;
        return new InterfaceC34036Kj2[]{c41539gS5, c41539gS5, C38330b40.m65021p(financialConnectionsAccountList$$serializer), C38330b40.m65021p(financialConnectionsAccountList$$serializer), C9804YY.f45990a, C38330b40.m65021p(PaymentAccountSerializer.INSTANCE), C38330b40.m65021p(c41539gS5), C38330b40.m65021p(JsonAsStringSerializer.INSTANCE), C38330b40.m65021p(ManualEntry$$serializer.INSTANCE), C38330b40.m65021p(FinancialConnectionsSession.Status.Serializer.INSTANCE), C38330b40.m65021p(FinancialConnectionsSession$StatusDetails$$serializer.INSTANCE)};
    }

    @Override // p000.E01
    public FinancialConnectionsSession deserialize(GV0 decoder) {
        boolean z;
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        int i;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36230Tt0 mo3298b = decoder.mo3298b(descriptor2);
        int i2 = 10;
        int i3 = 9;
        if (mo3298b.mo3290k()) {
            String mo3296e = mo3298b.mo3296e(descriptor2, 0);
            String mo3296e2 = mo3298b.mo3296e(descriptor2, 1);
            FinancialConnectionsAccountList$$serializer financialConnectionsAccountList$$serializer = FinancialConnectionsAccountList$$serializer.INSTANCE;
            Object mo3292i = mo3298b.mo3292i(descriptor2, 2, financialConnectionsAccountList$$serializer, null);
            obj8 = mo3298b.mo3292i(descriptor2, 3, financialConnectionsAccountList$$serializer, null);
            boolean mo3322E = mo3298b.mo3322E(descriptor2, 4);
            obj7 = mo3298b.mo3292i(descriptor2, 5, PaymentAccountSerializer.INSTANCE, null);
            obj5 = mo3298b.mo3292i(descriptor2, 6, C41539gS5.f82260a, null);
            obj6 = mo3298b.mo3292i(descriptor2, 7, JsonAsStringSerializer.INSTANCE, null);
            obj4 = mo3298b.mo3292i(descriptor2, 8, ManualEntry$$serializer.INSTANCE, null);
            obj3 = mo3298b.mo3292i(descriptor2, 9, FinancialConnectionsSession.Status.Serializer.INSTANCE, null);
            obj2 = mo3298b.mo3292i(descriptor2, 10, FinancialConnectionsSession$StatusDetails$$serializer.INSTANCE, null);
            str = mo3296e2;
            str2 = mo3296e;
            z = mo3322E;
            obj = mo3292i;
            i = 2047;
        } else {
            boolean z2 = true;
            z = false;
            Object obj9 = null;
            Object obj10 = null;
            Object obj11 = null;
            Object obj12 = null;
            Object obj13 = null;
            Object obj14 = null;
            Object obj15 = null;
            String str3 = null;
            str = null;
            obj = null;
            int i4 = 0;
            while (z2) {
                int mo11843q = mo3298b.mo11843q(descriptor2);
                switch (mo11843q) {
                    case -1:
                        z2 = false;
                        i2 = 10;
                        break;
                    case 0:
                        i4 |= 1;
                        str3 = mo3298b.mo3296e(descriptor2, 0);
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 1:
                        str = mo3298b.mo3296e(descriptor2, 1);
                        i4 |= 2;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 2:
                        obj = mo3298b.mo3292i(descriptor2, 2, FinancialConnectionsAccountList$$serializer.INSTANCE, obj);
                        i4 |= 4;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 3:
                        obj15 = mo3298b.mo3292i(descriptor2, 3, FinancialConnectionsAccountList$$serializer.INSTANCE, obj15);
                        i4 |= 8;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 4:
                        z = mo3298b.mo3322E(descriptor2, 4);
                        i4 |= 16;
                        i2 = 10;
                        break;
                    case 5:
                        obj14 = mo3298b.mo3292i(descriptor2, 5, PaymentAccountSerializer.INSTANCE, obj14);
                        i4 |= 32;
                        i2 = 10;
                        break;
                    case 6:
                        obj12 = mo3298b.mo3292i(descriptor2, 6, C41539gS5.f82260a, obj12);
                        i4 |= 64;
                        i2 = 10;
                        break;
                    case 7:
                        obj13 = mo3298b.mo3292i(descriptor2, 7, JsonAsStringSerializer.INSTANCE, obj13);
                        i4 |= 128;
                        i2 = 10;
                        break;
                    case 8:
                        obj11 = mo3298b.mo3292i(descriptor2, 8, ManualEntry$$serializer.INSTANCE, obj11);
                        i4 |= 256;
                        i2 = 10;
                        continue;
                    case 9:
                        obj10 = mo3298b.mo3292i(descriptor2, i3, FinancialConnectionsSession.Status.Serializer.INSTANCE, obj10);
                        i4 |= 512;
                        break;
                    case 10:
                        obj9 = mo3298b.mo3292i(descriptor2, i2, FinancialConnectionsSession$StatusDetails$$serializer.INSTANCE, obj9);
                        i4 |= 1024;
                        break;
                    default:
                        throw new UnknownFieldException(mo11843q);
                }
            }
            obj2 = obj9;
            obj3 = obj10;
            obj4 = obj11;
            obj5 = obj12;
            obj6 = obj13;
            obj7 = obj14;
            obj8 = obj15;
            i = i4;
            str2 = str3;
        }
        mo3298b.mo3300a(descriptor2);
        return new FinancialConnectionsSession(i, str2, str, (FinancialConnectionsAccountList) obj, (FinancialConnectionsAccountList) obj8, z, (PaymentAccount) obj7, (String) obj5, (String) obj6, (ManualEntry) obj4, (FinancialConnectionsSession.Status) obj3, (FinancialConnectionsSession.StatusDetails) obj2, (C38819bt5) null);
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC40615et5
    public void serialize(InterfaceC48140rb1 encoder, FinancialConnectionsSession value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36464Ut0 mo1149b = encoder.mo1149b(descriptor2);
        FinancialConnectionsSession.write$Self(value, mo1149b, descriptor2);
        mo1149b.mo1151a(descriptor2);
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] typeParametersSerializers() {
        return InterfaceC44940mB1.C25934a.m26189a(this);
    }
}
