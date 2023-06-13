package com.stripe.android.financialconnections.model;

import com.stripe.android.financialconnections.domain.Display;
import com.stripe.android.financialconnections.domain.Display$$serializer;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import p000.InterfaceC44940mB1;
@Metadata(m28433d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession.$serializer", "LmB1;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "", "LKj2;", "childSerializers", "()[LKj2;", "LGV0;", "decoder", "deserialize", "Lrb1;", "encoder", "value", "", "serialize", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class FinancialConnectionsAuthorizationSession$$serializer implements InterfaceC44940mB1<FinancialConnectionsAuthorizationSession> {
    public static final int $stable = 0;
    public static final FinancialConnectionsAuthorizationSession$$serializer INSTANCE;
    private static final /* synthetic */ AW3 descriptor;

    static {
        FinancialConnectionsAuthorizationSession$$serializer financialConnectionsAuthorizationSession$$serializer = new FinancialConnectionsAuthorizationSession$$serializer();
        INSTANCE = financialConnectionsAuthorizationSession$$serializer;
        AW3 aw3 = new AW3("com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession", financialConnectionsAuthorizationSession$$serializer, 10);
        aw3.m115697k("id", false);
        aw3.m115697k("next_pane", false);
        aw3.m115697k("flow", true);
        aw3.m115697k("institution_skip_account_selection", true);
        aw3.m115697k("show_partner_disclosure", true);
        aw3.m115697k("skip_account_selection", true);
        aw3.m115697k("url", true);
        aw3.m115697k("url_qr_code", true);
        aw3.m115697k("is_oauth", true);
        aw3.m115697k("display", true);
        descriptor = aw3;
    }

    private FinancialConnectionsAuthorizationSession$$serializer() {
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] childSerializers() {
        C41539gS5 c41539gS5 = C41539gS5.f82260a;
        C9804YY c9804yy = C9804YY.f45990a;
        return new InterfaceC34036Kj2[]{c41539gS5, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, C38330b40.m65021p(FinancialConnectionsAuthorizationSession.Flow.Serializer.INSTANCE), C38330b40.m65021p(c9804yy), C38330b40.m65021p(c9804yy), C38330b40.m65021p(c9804yy), C38330b40.m65021p(c41539gS5), C38330b40.m65021p(c41539gS5), C38330b40.m65021p(c9804yy), C38330b40.m65021p(Display$$serializer.INSTANCE)};
    }

    @Override // p000.E01
    public FinancialConnectionsAuthorizationSession deserialize(GV0 decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        String str;
        Object obj9;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36230Tt0 mo3298b = decoder.mo3298b(descriptor2);
        int i2 = 9;
        String str2 = null;
        if (mo3298b.mo3290k()) {
            String mo3296e = mo3298b.mo3296e(descriptor2, 0);
            obj9 = mo3298b.mo3283s(descriptor2, 1, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, null);
            Object mo3292i = mo3298b.mo3292i(descriptor2, 2, FinancialConnectionsAuthorizationSession.Flow.Serializer.INSTANCE, null);
            C9804YY c9804yy = C9804YY.f45990a;
            Object mo3292i2 = mo3298b.mo3292i(descriptor2, 3, c9804yy, null);
            obj8 = mo3298b.mo3292i(descriptor2, 4, c9804yy, null);
            Object mo3292i3 = mo3298b.mo3292i(descriptor2, 5, c9804yy, null);
            C41539gS5 c41539gS5 = C41539gS5.f82260a;
            obj6 = mo3298b.mo3292i(descriptor2, 6, c41539gS5, null);
            obj7 = mo3298b.mo3292i(descriptor2, 7, c41539gS5, null);
            obj5 = mo3298b.mo3292i(descriptor2, 8, c9804yy, null);
            obj4 = mo3298b.mo3292i(descriptor2, 9, Display$$serializer.INSTANCE, null);
            obj3 = mo3292i;
            obj = mo3292i3;
            i = 1023;
            obj2 = mo3292i2;
            str = mo3296e;
        } else {
            boolean z = true;
            int i3 = 0;
            Object obj10 = null;
            Object obj11 = null;
            Object obj12 = null;
            Object obj13 = null;
            obj = null;
            Object obj14 = null;
            obj2 = null;
            Object obj15 = null;
            obj3 = null;
            while (z) {
                int mo11843q = mo3298b.mo11843q(descriptor2);
                switch (mo11843q) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        str2 = mo3298b.mo3296e(descriptor2, 0);
                        i3 |= 1;
                        i2 = 9;
                        break;
                    case 1:
                        obj15 = mo3298b.mo3283s(descriptor2, 1, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, obj15);
                        i3 |= 2;
                        i2 = 9;
                        break;
                    case 2:
                        obj3 = mo3298b.mo3292i(descriptor2, 2, FinancialConnectionsAuthorizationSession.Flow.Serializer.INSTANCE, obj3);
                        i3 |= 4;
                        i2 = 9;
                        break;
                    case 3:
                        obj2 = mo3298b.mo3292i(descriptor2, 3, C9804YY.f45990a, obj2);
                        i3 |= 8;
                        i2 = 9;
                        break;
                    case 4:
                        obj14 = mo3298b.mo3292i(descriptor2, 4, C9804YY.f45990a, obj14);
                        i3 |= 16;
                        i2 = 9;
                        break;
                    case 5:
                        obj = mo3298b.mo3292i(descriptor2, 5, C9804YY.f45990a, obj);
                        i3 |= 32;
                        i2 = 9;
                        break;
                    case 6:
                        obj12 = mo3298b.mo3292i(descriptor2, 6, C41539gS5.f82260a, obj12);
                        i3 |= 64;
                        i2 = 9;
                        break;
                    case 7:
                        obj13 = mo3298b.mo3292i(descriptor2, 7, C41539gS5.f82260a, obj13);
                        i3 |= 128;
                        i2 = 9;
                        continue;
                    case 8:
                        obj11 = mo3298b.mo3292i(descriptor2, 8, C9804YY.f45990a, obj11);
                        i3 |= 256;
                        break;
                    case 9:
                        obj10 = mo3298b.mo3292i(descriptor2, i2, Display$$serializer.INSTANCE, obj10);
                        i3 |= 512;
                        break;
                    default:
                        throw new UnknownFieldException(mo11843q);
                }
            }
            obj4 = obj10;
            obj5 = obj11;
            obj6 = obj12;
            obj7 = obj13;
            obj8 = obj14;
            str = str2;
            obj9 = obj15;
            i = i3;
        }
        mo3298b.mo3300a(descriptor2);
        return new FinancialConnectionsAuthorizationSession(i, str, (FinancialConnectionsSessionManifest.Pane) obj9, (FinancialConnectionsAuthorizationSession.Flow) obj3, (Boolean) obj2, (Boolean) obj8, (Boolean) obj, (String) obj6, (String) obj7, (Boolean) obj5, (Display) obj4, (C38819bt5) null);
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC40615et5
    public void serialize(InterfaceC48140rb1 encoder, FinancialConnectionsAuthorizationSession value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36464Ut0 mo1149b = encoder.mo1149b(descriptor2);
        FinancialConnectionsAuthorizationSession.write$Self(value, mo1149b, descriptor2);
        mo1149b.mo1151a(descriptor2);
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] typeParametersSerializers() {
        return InterfaceC44940mB1.C25934a.m26189a(this);
    }
}
