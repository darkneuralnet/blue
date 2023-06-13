package com.stripe.android.financialconnections.model;

import com.stripe.android.financialconnections.model.serializer.MarkdownToHtmlSerializer;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import p000.InterfaceC44940mB1;
@Metadata(m28433d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"com/stripe/android/financialconnections/model/ConsentPane.$serializer", "LmB1;", "Lcom/stripe/android/financialconnections/model/ConsentPane;", "", "LKj2;", "childSerializers", "()[LKj2;", "LGV0;", "decoder", "deserialize", "Lrb1;", "encoder", "value", "", "serialize", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class ConsentPane$$serializer implements InterfaceC44940mB1<ConsentPane> {
    public static final int $stable = 0;
    public static final ConsentPane$$serializer INSTANCE;
    private static final /* synthetic */ AW3 descriptor;

    static {
        ConsentPane$$serializer consentPane$$serializer = new ConsentPane$$serializer();
        INSTANCE = consentPane$$serializer;
        AW3 aw3 = new AW3("com.stripe.android.financialconnections.model.ConsentPane", consentPane$$serializer, 7);
        aw3.m115697k("above_cta", false);
        aw3.m115697k("below_cta", true);
        aw3.m115697k("body", false);
        aw3.m115697k("cta", false);
        aw3.m115697k("data_access_notice", false);
        aw3.m115697k("legal_details_notice", false);
        aw3.m115697k("title", false);
        descriptor = aw3;
    }

    private ConsentPane$$serializer() {
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] childSerializers() {
        MarkdownToHtmlSerializer markdownToHtmlSerializer = MarkdownToHtmlSerializer.INSTANCE;
        return new InterfaceC34036Kj2[]{markdownToHtmlSerializer, C38330b40.m65021p(markdownToHtmlSerializer), ConsentPaneBody$$serializer.INSTANCE, markdownToHtmlSerializer, DataAccessNotice$$serializer.INSTANCE, LegalDetailsNotice$$serializer.INSTANCE, markdownToHtmlSerializer};
    }

    @Override // p000.E01
    public ConsentPane deserialize(GV0 decoder) {
        Object obj;
        int i;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36230Tt0 mo3298b = decoder.mo3298b(descriptor2);
        int i2 = 6;
        Object obj8 = null;
        if (mo3298b.mo3290k()) {
            MarkdownToHtmlSerializer markdownToHtmlSerializer = MarkdownToHtmlSerializer.INSTANCE;
            obj3 = mo3298b.mo3283s(descriptor2, 0, markdownToHtmlSerializer, null);
            obj4 = mo3298b.mo3292i(descriptor2, 1, markdownToHtmlSerializer, null);
            obj5 = mo3298b.mo3283s(descriptor2, 2, ConsentPaneBody$$serializer.INSTANCE, null);
            obj6 = mo3298b.mo3283s(descriptor2, 3, markdownToHtmlSerializer, null);
            obj7 = mo3298b.mo3283s(descriptor2, 4, DataAccessNotice$$serializer.INSTANCE, null);
            Object mo3283s = mo3298b.mo3283s(descriptor2, 5, LegalDetailsNotice$$serializer.INSTANCE, null);
            obj2 = mo3298b.mo3283s(descriptor2, 6, markdownToHtmlSerializer, null);
            obj = mo3283s;
            i = 127;
        } else {
            boolean z = true;
            int i3 = 0;
            Object obj9 = null;
            Object obj10 = null;
            Object obj11 = null;
            Object obj12 = null;
            Object obj13 = null;
            obj = null;
            while (z) {
                int mo11843q = mo3298b.mo11843q(descriptor2);
                switch (mo11843q) {
                    case -1:
                        z = false;
                        i2 = 6;
                        break;
                    case 0:
                        obj8 = mo3298b.mo3283s(descriptor2, 0, MarkdownToHtmlSerializer.INSTANCE, obj8);
                        i3 |= 1;
                        i2 = 6;
                        break;
                    case 1:
                        obj10 = mo3298b.mo3292i(descriptor2, 1, MarkdownToHtmlSerializer.INSTANCE, obj10);
                        i3 |= 2;
                        i2 = 6;
                        continue;
                    case 2:
                        obj11 = mo3298b.mo3283s(descriptor2, 2, ConsentPaneBody$$serializer.INSTANCE, obj11);
                        i3 |= 4;
                        break;
                    case 3:
                        obj12 = mo3298b.mo3283s(descriptor2, 3, MarkdownToHtmlSerializer.INSTANCE, obj12);
                        i3 |= 8;
                        break;
                    case 4:
                        obj13 = mo3298b.mo3283s(descriptor2, 4, DataAccessNotice$$serializer.INSTANCE, obj13);
                        i3 |= 16;
                        break;
                    case 5:
                        obj = mo3298b.mo3283s(descriptor2, 5, LegalDetailsNotice$$serializer.INSTANCE, obj);
                        i3 |= 32;
                        break;
                    case 6:
                        obj9 = mo3298b.mo3283s(descriptor2, i2, MarkdownToHtmlSerializer.INSTANCE, obj9);
                        i3 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(mo11843q);
                }
            }
            i = i3;
            obj2 = obj9;
            obj3 = obj8;
            obj4 = obj10;
            obj5 = obj11;
            obj6 = obj12;
            obj7 = obj13;
        }
        mo3298b.mo3300a(descriptor2);
        return new ConsentPane(i, (String) obj3, (String) obj4, (ConsentPaneBody) obj5, (String) obj6, (DataAccessNotice) obj7, (LegalDetailsNotice) obj, (String) obj2, (C38819bt5) null);
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC40615et5
    public void serialize(InterfaceC48140rb1 encoder, ConsentPane value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36464Ut0 mo1149b = encoder.mo1149b(descriptor2);
        ConsentPane.write$Self(value, mo1149b, descriptor2);
        mo1149b.mo1151a(descriptor2);
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] typeParametersSerializers() {
        return InterfaceC44940mB1.C25934a.m26189a(this);
    }
}
