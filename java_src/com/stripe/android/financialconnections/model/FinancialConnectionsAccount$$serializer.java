package com.stripe.android.financialconnections.model;

import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import p000.InterfaceC44940mB1;
@Metadata(m28433d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsAccount.$serializer", "LmB1;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;", "", "LKj2;", "childSerializers", "()[LKj2;", "LGV0;", "decoder", "deserialize", "Lrb1;", "encoder", "value", "", "serialize", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class FinancialConnectionsAccount$$serializer implements InterfaceC44940mB1<FinancialConnectionsAccount> {
    public static final int $stable = 0;
    public static final FinancialConnectionsAccount$$serializer INSTANCE;
    private static final /* synthetic */ AW3 descriptor;

    static {
        FinancialConnectionsAccount$$serializer financialConnectionsAccount$$serializer = new FinancialConnectionsAccount$$serializer();
        INSTANCE = financialConnectionsAccount$$serializer;
        AW3 aw3 = new AW3("com.stripe.android.financialconnections.model.FinancialConnectionsAccount", financialConnectionsAccount$$serializer, 15);
        aw3.m115697k("category", true);
        aw3.m115697k(AnalyticsRequestV2.PARAM_CREATED, false);
        aw3.m115697k("id", false);
        aw3.m115697k("institution_name", false);
        aw3.m115697k("livemode", false);
        aw3.m115697k("status", true);
        aw3.m115697k("subcategory", true);
        aw3.m115697k("supported_payment_method_types", false);
        aw3.m115697k("balance", true);
        aw3.m115697k("balance_refresh", true);
        aw3.m115697k("display_name", true);
        aw3.m115697k("last4", true);
        aw3.m115697k("ownership", true);
        aw3.m115697k("ownership_refresh", true);
        aw3.m115697k("permissions", true);
        descriptor = aw3;
    }

    private FinancialConnectionsAccount$$serializer() {
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] childSerializers() {
        C41539gS5 c41539gS5 = C41539gS5.f82260a;
        return new InterfaceC34036Kj2[]{FinancialConnectionsAccount.Category.Serializer.INSTANCE, F52.f8705a, c41539gS5, c41539gS5, C9804YY.f45990a, FinancialConnectionsAccount.Status.Serializer.INSTANCE, FinancialConnectionsAccount.Subcategory.Serializer.INSTANCE, new C27999ro(FinancialConnectionsAccount.SupportedPaymentMethodTypes.Serializer.INSTANCE), C38330b40.m65021p(Balance$$serializer.INSTANCE), C38330b40.m65021p(BalanceRefresh$$serializer.INSTANCE), C38330b40.m65021p(c41539gS5), C38330b40.m65021p(c41539gS5), C38330b40.m65021p(c41539gS5), C38330b40.m65021p(OwnershipRefresh$$serializer.INSTANCE), C38330b40.m65021p(new C27999ro(FinancialConnectionsAccount.Permissions.Serializer.INSTANCE))};
    }

    @Override // p000.E01
    public FinancialConnectionsAccount deserialize(GV0 decoder) {
        Object obj;
        Object obj2;
        FinancialConnectionsAccount.Category category;
        int i;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        String str;
        String str2;
        boolean z;
        int i2;
        Object obj8;
        Object obj9;
        Object obj10;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36230Tt0 mo3298b = decoder.mo3298b(descriptor2);
        if (mo3298b.mo3290k()) {
            Object mo3283s = mo3298b.mo3283s(descriptor2, 0, FinancialConnectionsAccount.Category.Serializer.INSTANCE, null);
            int mo3293h = mo3298b.mo3293h(descriptor2, 1);
            String mo3296e = mo3298b.mo3296e(descriptor2, 2);
            String mo3296e2 = mo3298b.mo3296e(descriptor2, 3);
            boolean mo3322E = mo3298b.mo3322E(descriptor2, 4);
            obj8 = mo3298b.mo3283s(descriptor2, 5, FinancialConnectionsAccount.Status.Serializer.INSTANCE, null);
            obj10 = mo3298b.mo3283s(descriptor2, 6, FinancialConnectionsAccount.Subcategory.Serializer.INSTANCE, null);
            obj7 = mo3298b.mo3283s(descriptor2, 7, new C27999ro(FinancialConnectionsAccount.SupportedPaymentMethodTypes.Serializer.INSTANCE), null);
            obj5 = mo3298b.mo3292i(descriptor2, 8, Balance$$serializer.INSTANCE, null);
            Object mo3292i = mo3298b.mo3292i(descriptor2, 9, BalanceRefresh$$serializer.INSTANCE, null);
            C41539gS5 c41539gS5 = C41539gS5.f82260a;
            obj4 = mo3298b.mo3292i(descriptor2, 10, c41539gS5, null);
            obj9 = mo3298b.mo3292i(descriptor2, 11, c41539gS5, null);
            obj3 = mo3298b.mo3292i(descriptor2, 12, c41539gS5, null);
            obj6 = mo3298b.mo3292i(descriptor2, 13, OwnershipRefresh$$serializer.INSTANCE, null);
            i2 = mo3293h;
            str = mo3296e;
            i = 32767;
            str2 = mo3296e2;
            z = mo3322E;
            obj2 = mo3292i;
            obj = mo3298b.mo3292i(descriptor2, 14, new C27999ro(FinancialConnectionsAccount.Permissions.Serializer.INSTANCE), null);
            category = mo3283s;
        } else {
            int i5 = 14;
            boolean z2 = true;
            int i6 = 0;
            boolean z3 = false;
            Object obj11 = null;
            obj = null;
            Object obj12 = null;
            Object obj13 = null;
            Object obj14 = null;
            Object obj15 = null;
            Object obj16 = null;
            obj2 = null;
            Object obj17 = null;
            FinancialConnectionsAccount.Category category2 = null;
            String str3 = null;
            String str4 = null;
            Object obj18 = null;
            int i7 = 0;
            while (z2) {
                int mo11843q = mo3298b.mo11843q(descriptor2);
                switch (mo11843q) {
                    case -1:
                        i3 = i7;
                        z2 = false;
                        i7 = i3;
                        break;
                    case 0:
                        i4 = i7;
                        i6 |= 1;
                        category2 = mo3298b.mo3283s(descriptor2, 0, FinancialConnectionsAccount.Category.Serializer.INSTANCE, category2);
                        i7 = i4;
                        i5 = 14;
                        break;
                    case 1:
                        i6 |= 2;
                        i7 = mo3298b.mo3293h(descriptor2, 1);
                        i5 = 14;
                        break;
                    case 2:
                        i4 = i7;
                        str3 = mo3298b.mo3296e(descriptor2, 2);
                        i6 |= 4;
                        i7 = i4;
                        i5 = 14;
                        break;
                    case 3:
                        i4 = i7;
                        str4 = mo3298b.mo3296e(descriptor2, 3);
                        i6 |= 8;
                        i7 = i4;
                        i5 = 14;
                        break;
                    case 4:
                        i4 = i7;
                        z3 = mo3298b.mo3322E(descriptor2, 4);
                        i6 |= 16;
                        i7 = i4;
                        i5 = 14;
                        break;
                    case 5:
                        i4 = i7;
                        obj18 = mo3298b.mo3283s(descriptor2, 5, FinancialConnectionsAccount.Status.Serializer.INSTANCE, obj18);
                        i6 |= 32;
                        i7 = i4;
                        i5 = 14;
                        break;
                    case 6:
                        i4 = i7;
                        obj11 = mo3298b.mo3283s(descriptor2, 6, FinancialConnectionsAccount.Subcategory.Serializer.INSTANCE, obj11);
                        i6 |= 64;
                        i7 = i4;
                        i5 = 14;
                        break;
                    case 7:
                        i4 = i7;
                        obj17 = mo3298b.mo3283s(descriptor2, 7, new C27999ro(FinancialConnectionsAccount.SupportedPaymentMethodTypes.Serializer.INSTANCE), obj17);
                        i6 |= 128;
                        i7 = i4;
                        i5 = 14;
                        break;
                    case 8:
                        i4 = i7;
                        obj15 = mo3298b.mo3292i(descriptor2, 8, Balance$$serializer.INSTANCE, obj15);
                        i6 |= 256;
                        i7 = i4;
                        i5 = 14;
                        break;
                    case 9:
                        i4 = i7;
                        obj2 = mo3298b.mo3292i(descriptor2, 9, BalanceRefresh$$serializer.INSTANCE, obj2);
                        i6 |= 512;
                        i7 = i4;
                        i5 = 14;
                        break;
                    case 10:
                        obj14 = mo3298b.mo3292i(descriptor2, 10, C41539gS5.f82260a, obj14);
                        i6 |= 1024;
                        i7 = i7;
                        i5 = 14;
                        break;
                    case 11:
                        i4 = i7;
                        obj13 = mo3298b.mo3292i(descriptor2, 11, C41539gS5.f82260a, obj13);
                        i6 |= 2048;
                        i7 = i4;
                        i5 = 14;
                        break;
                    case 12:
                        i4 = i7;
                        obj12 = mo3298b.mo3292i(descriptor2, 12, C41539gS5.f82260a, obj12);
                        i6 |= 4096;
                        i7 = i4;
                        i5 = 14;
                        break;
                    case 13:
                        i3 = i7;
                        obj16 = mo3298b.mo3292i(descriptor2, 13, OwnershipRefresh$$serializer.INSTANCE, obj16);
                        i6 |= 8192;
                        i7 = i3;
                        break;
                    case 14:
                        i3 = i7;
                        obj = mo3298b.mo3292i(descriptor2, i5, new C27999ro(FinancialConnectionsAccount.Permissions.Serializer.INSTANCE), obj);
                        i6 |= 16384;
                        i7 = i3;
                        break;
                    default:
                        throw new UnknownFieldException(mo11843q);
                }
            }
            category = category2;
            i = i6;
            obj3 = obj12;
            obj4 = obj14;
            obj5 = obj15;
            obj6 = obj16;
            obj7 = obj17;
            str = str3;
            str2 = str4;
            z = z3;
            i2 = i7;
            obj8 = obj18;
            obj9 = obj13;
            obj10 = obj11;
        }
        mo3298b.mo3300a(descriptor2);
        return new FinancialConnectionsAccount(i, category, i2, str, str2, z, (FinancialConnectionsAccount.Status) obj8, (FinancialConnectionsAccount.Subcategory) obj10, (List) obj7, (Balance) obj5, (BalanceRefresh) obj2, (String) obj4, (String) obj9, (String) obj3, (OwnershipRefresh) obj6, (List) obj, (C38819bt5) null);
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC40615et5
    public void serialize(InterfaceC48140rb1 encoder, FinancialConnectionsAccount value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36464Ut0 mo1149b = encoder.mo1149b(descriptor2);
        FinancialConnectionsAccount.write$Self(value, mo1149b, descriptor2);
        mo1149b.mo1151a(descriptor2);
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] typeParametersSerializers() {
        return InterfaceC44940mB1.C25934a.m26189a(this);
    }
}
