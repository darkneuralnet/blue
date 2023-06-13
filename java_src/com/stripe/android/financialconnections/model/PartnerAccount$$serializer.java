package com.stripe.android.financialconnections.model;

import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import net.danlew.android.joda.DateUtils;
import p000.InterfaceC44940mB1;
@Metadata(m28433d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"com/stripe/android/financialconnections/model/PartnerAccount.$serializer", "LmB1;", "Lcom/stripe/android/financialconnections/model/PartnerAccount;", "", "LKj2;", "childSerializers", "()[LKj2;", "LGV0;", "decoder", "deserialize", "Lrb1;", "encoder", "value", "", "serialize", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class PartnerAccount$$serializer implements InterfaceC44940mB1<PartnerAccount> {
    public static final int $stable = 0;
    public static final PartnerAccount$$serializer INSTANCE;
    private static final /* synthetic */ AW3 descriptor;

    static {
        PartnerAccount$$serializer partnerAccount$$serializer = new PartnerAccount$$serializer();
        INSTANCE = partnerAccount$$serializer;
        AW3 aw3 = new AW3("com.stripe.android.financialconnections.model.PartnerAccount", partnerAccount$$serializer, 17);
        aw3.m115697k("authorization", false);
        aw3.m115697k("category", false);
        aw3.m115697k("id", false);
        aw3.m115697k("name", false);
        aw3.m115697k("subcategory", false);
        aw3.m115697k("supported_payment_method_types", false);
        aw3.m115697k("balance_amount", true);
        aw3.m115697k("currency", true);
        aw3.m115697k("displayable_account_numbers", true);
        aw3.m115697k("initial_balance_amount", true);
        aw3.m115697k("institution_name", true);
        aw3.m115697k("allow_selection", true);
        aw3.m115697k("allow_selection_message", true);
        aw3.m115697k("institution_url", true);
        aw3.m115697k("linked_account_id", true);
        aw3.m115697k("routing_number", true);
        aw3.m115697k("status", true);
        descriptor = aw3;
    }

    private PartnerAccount$$serializer() {
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] childSerializers() {
        C41539gS5 c41539gS5 = C41539gS5.f82260a;
        F52 f52 = F52.f8705a;
        return new InterfaceC34036Kj2[]{c41539gS5, FinancialConnectionsAccount.Category.Serializer.INSTANCE, c41539gS5, c41539gS5, FinancialConnectionsAccount.Subcategory.Serializer.INSTANCE, new C27999ro(FinancialConnectionsAccount.SupportedPaymentMethodTypes.Serializer.INSTANCE), C38330b40.m65021p(f52), C38330b40.m65021p(c41539gS5), C38330b40.m65021p(c41539gS5), C38330b40.m65021p(f52), C38330b40.m65021p(c41539gS5), C38330b40.m65021p(C9804YY.f45990a), C38330b40.m65021p(c41539gS5), C38330b40.m65021p(c41539gS5), C38330b40.m65021p(c41539gS5), C38330b40.m65021p(c41539gS5), C38330b40.m65021p(FinancialConnectionsAccount.Status.Serializer.INSTANCE)};
    }

    @Override // p000.E01
    public PartnerAccount deserialize(GV0 decoder) {
        FinancialConnectionsAccount.Category category;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        FinancialConnectionsAccount.Status status;
        String str;
        String str2;
        String str3;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        int i;
        Object obj13;
        FinancialConnectionsAccount.Status status2;
        FinancialConnectionsAccount.Category category2;
        FinancialConnectionsAccount.Status status3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36230Tt0 mo3298b = decoder.mo3298b(descriptor2);
        if (mo3298b.mo3290k()) {
            String mo3296e = mo3298b.mo3296e(descriptor2, 0);
            Object mo3283s = mo3298b.mo3283s(descriptor2, 1, FinancialConnectionsAccount.Category.Serializer.INSTANCE, null);
            String mo3296e2 = mo3298b.mo3296e(descriptor2, 2);
            String mo3296e3 = mo3298b.mo3296e(descriptor2, 3);
            obj10 = mo3298b.mo3283s(descriptor2, 4, FinancialConnectionsAccount.Subcategory.Serializer.INSTANCE, null);
            Object mo3283s2 = mo3298b.mo3283s(descriptor2, 5, new C27999ro(FinancialConnectionsAccount.SupportedPaymentMethodTypes.Serializer.INSTANCE), null);
            F52 f52 = F52.f8705a;
            Object mo3292i = mo3298b.mo3292i(descriptor2, 6, f52, null);
            C41539gS5 c41539gS5 = C41539gS5.f82260a;
            Object mo3292i2 = mo3298b.mo3292i(descriptor2, 7, c41539gS5, null);
            Object mo3292i3 = mo3298b.mo3292i(descriptor2, 8, c41539gS5, null);
            Object mo3292i4 = mo3298b.mo3292i(descriptor2, 9, f52, null);
            Object mo3292i5 = mo3298b.mo3292i(descriptor2, 10, c41539gS5, null);
            Object mo3292i6 = mo3298b.mo3292i(descriptor2, 11, C9804YY.f45990a, null);
            Object mo3292i7 = mo3298b.mo3292i(descriptor2, 12, c41539gS5, null);
            Object mo3292i8 = mo3298b.mo3292i(descriptor2, 13, c41539gS5, null);
            Object mo3292i9 = mo3298b.mo3292i(descriptor2, 14, c41539gS5, null);
            Object mo3292i10 = mo3298b.mo3292i(descriptor2, 15, c41539gS5, null);
            str = mo3296e2;
            obj = mo3283s2;
            obj9 = mo3292i;
            obj4 = mo3292i7;
            str2 = mo3296e3;
            obj2 = mo3292i9;
            obj3 = mo3292i8;
            i = 131071;
            obj5 = mo3292i5;
            obj12 = mo3292i4;
            obj7 = mo3292i3;
            str3 = mo3296e;
            obj8 = mo3292i2;
            status = mo3298b.mo3292i(descriptor2, 16, FinancialConnectionsAccount.Status.Serializer.INSTANCE, null);
            category = mo3283s;
            obj11 = mo3292i10;
            obj6 = mo3292i6;
        } else {
            boolean z = true;
            Object obj14 = null;
            Object obj15 = null;
            FinancialConnectionsAccount.Status status4 = null;
            Object obj16 = null;
            Object obj17 = null;
            Object obj18 = null;
            Object obj19 = null;
            Object obj20 = null;
            Object obj21 = null;
            Object obj22 = null;
            Object obj23 = null;
            String str4 = null;
            String str5 = null;
            Object obj24 = null;
            Object obj25 = null;
            String str6 = null;
            int i2 = 0;
            FinancialConnectionsAccount.Category category3 = null;
            while (z) {
                int mo11843q = mo3298b.mo11843q(descriptor2);
                switch (mo11843q) {
                    case -1:
                        z = false;
                        category3 = category3;
                        status4 = status4;
                        break;
                    case 0:
                        obj13 = obj14;
                        status2 = status4;
                        str6 = mo3298b.mo3296e(descriptor2, 0);
                        i2 |= 1;
                        category3 = category3;
                        status4 = status2;
                        obj14 = obj13;
                        break;
                    case 1:
                        status2 = status4;
                        obj13 = obj14;
                        category3 = mo3298b.mo3283s(descriptor2, 1, FinancialConnectionsAccount.Category.Serializer.INSTANCE, category3);
                        i2 |= 2;
                        status4 = status2;
                        obj14 = obj13;
                        break;
                    case 2:
                        category2 = category3;
                        status3 = status4;
                        str4 = mo3298b.mo3296e(descriptor2, 2);
                        i2 |= 4;
                        status4 = status3;
                        category3 = category2;
                        break;
                    case 3:
                        category2 = category3;
                        status3 = status4;
                        str5 = mo3298b.mo3296e(descriptor2, 3);
                        i2 |= 8;
                        status4 = status3;
                        category3 = category2;
                        break;
                    case 4:
                        category2 = category3;
                        status3 = status4;
                        obj15 = mo3298b.mo3283s(descriptor2, 4, FinancialConnectionsAccount.Subcategory.Serializer.INSTANCE, obj15);
                        i2 |= 16;
                        status4 = status3;
                        category3 = category2;
                        break;
                    case 5:
                        category2 = category3;
                        status3 = status4;
                        obj14 = mo3298b.mo3283s(descriptor2, 5, new C27999ro(FinancialConnectionsAccount.SupportedPaymentMethodTypes.Serializer.INSTANCE), obj14);
                        i2 |= 32;
                        status4 = status3;
                        category3 = category2;
                        break;
                    case 6:
                        category2 = category3;
                        status3 = status4;
                        obj21 = mo3298b.mo3292i(descriptor2, 6, F52.f8705a, obj21);
                        i2 |= 64;
                        status4 = status3;
                        category3 = category2;
                        break;
                    case 7:
                        category2 = category3;
                        status3 = status4;
                        obj22 = mo3298b.mo3292i(descriptor2, 7, C41539gS5.f82260a, obj22);
                        i2 |= 128;
                        status4 = status3;
                        category3 = category2;
                        break;
                    case 8:
                        category2 = category3;
                        status3 = status4;
                        obj20 = mo3298b.mo3292i(descriptor2, 8, C41539gS5.f82260a, obj20);
                        i2 |= 256;
                        status4 = status3;
                        category3 = category2;
                        break;
                    case 9:
                        category2 = category3;
                        status3 = status4;
                        obj19 = mo3298b.mo3292i(descriptor2, 9, F52.f8705a, obj19);
                        i2 |= 512;
                        status4 = status3;
                        category3 = category2;
                        break;
                    case 10:
                        category2 = category3;
                        status3 = status4;
                        obj18 = mo3298b.mo3292i(descriptor2, 10, C41539gS5.f82260a, obj18);
                        i2 |= 1024;
                        status4 = status3;
                        category3 = category2;
                        break;
                    case 11:
                        category2 = category3;
                        status3 = status4;
                        obj23 = mo3298b.mo3292i(descriptor2, 11, C9804YY.f45990a, obj23);
                        i2 |= 2048;
                        status4 = status3;
                        category3 = category2;
                        break;
                    case 12:
                        category2 = category3;
                        status3 = status4;
                        obj17 = mo3298b.mo3292i(descriptor2, 12, C41539gS5.f82260a, obj17);
                        i2 |= 4096;
                        status4 = status3;
                        category3 = category2;
                        break;
                    case 13:
                        category2 = category3;
                        status3 = status4;
                        obj16 = mo3298b.mo3292i(descriptor2, 13, C41539gS5.f82260a, obj16);
                        i2 |= 8192;
                        status4 = status3;
                        category3 = category2;
                        break;
                    case 14:
                        category2 = category3;
                        obj24 = mo3298b.mo3292i(descriptor2, 14, C41539gS5.f82260a, obj24);
                        i2 |= 16384;
                        status4 = status4;
                        obj25 = obj25;
                        category3 = category2;
                        break;
                    case 15:
                        category2 = category3;
                        status3 = status4;
                        obj25 = mo3298b.mo3292i(descriptor2, 15, C41539gS5.f82260a, obj25);
                        i2 |= DateUtils.FORMAT_ABBREV_WEEKDAY;
                        status4 = status3;
                        category3 = category2;
                        break;
                    case 16:
                        status4 = mo3298b.mo3292i(descriptor2, 16, FinancialConnectionsAccount.Status.Serializer.INSTANCE, status4);
                        i2 |= 65536;
                        category3 = category3;
                        continue;
                    default:
                        throw new UnknownFieldException(mo11843q);
                }
            }
            category = category3;
            obj = obj14;
            FinancialConnectionsAccount.Status status5 = status4;
            obj2 = obj24;
            obj3 = obj16;
            obj4 = obj17;
            obj5 = obj18;
            obj6 = obj23;
            status = status5;
            str = str4;
            str2 = str5;
            str3 = str6;
            obj7 = obj20;
            obj8 = obj22;
            obj9 = obj21;
            obj10 = obj15;
            obj11 = obj25;
            obj12 = obj19;
            i = i2;
        }
        mo3298b.mo3300a(descriptor2);
        return new PartnerAccount(i, str3, category, str, str2, (FinancialConnectionsAccount.Subcategory) obj10, (List) obj, (Integer) obj9, (String) obj8, (String) obj7, (Integer) obj12, (String) obj5, (Boolean) obj6, (String) obj4, (String) obj3, (String) obj2, (String) obj11, status, (C38819bt5) null);
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC40615et5
    public void serialize(InterfaceC48140rb1 encoder, PartnerAccount value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36464Ut0 mo1149b = encoder.mo1149b(descriptor2);
        PartnerAccount.write$Self(value, mo1149b, descriptor2);
        mo1149b.mo1151a(descriptor2);
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] typeParametersSerializers() {
        return InterfaceC44940mB1.C25934a.m26189a(this);
    }
}
