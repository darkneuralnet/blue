package com.stripe.android.financialconnections.model;

import com.stripe.android.financialconnections.model.serializer.MarkdownToHtmlSerializer;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import p000.InterfaceC44940mB1;
@Metadata(m28433d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"com/stripe/android/financialconnections/model/DataAccessNotice.$serializer", "LmB1;", "Lcom/stripe/android/financialconnections/model/DataAccessNotice;", "", "LKj2;", "childSerializers", "()[LKj2;", "LGV0;", "decoder", "deserialize", "Lrb1;", "encoder", "value", "", "serialize", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "<init>", "()V", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class DataAccessNotice$$serializer implements InterfaceC44940mB1<DataAccessNotice> {
    public static final int $stable = 0;
    public static final DataAccessNotice$$serializer INSTANCE;
    private static final /* synthetic */ AW3 descriptor;

    static {
        DataAccessNotice$$serializer dataAccessNotice$$serializer = new DataAccessNotice$$serializer();
        INSTANCE = dataAccessNotice$$serializer;
        AW3 aw3 = new AW3("com.stripe.android.financialconnections.model.DataAccessNotice", dataAccessNotice$$serializer, 6);
        aw3.m115697k("body", false);
        aw3.m115697k("title", false);
        aw3.m115697k("subtitle", true);
        aw3.m115697k("cta", false);
        aw3.m115697k("learn_more", false);
        aw3.m115697k("connected_account_notice", true);
        descriptor = aw3;
    }

    private DataAccessNotice$$serializer() {
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] childSerializers() {
        MarkdownToHtmlSerializer markdownToHtmlSerializer = MarkdownToHtmlSerializer.INSTANCE;
        return new InterfaceC34036Kj2[]{DataAccessNoticeBody$$serializer.INSTANCE, markdownToHtmlSerializer, C38330b40.m65021p(markdownToHtmlSerializer), markdownToHtmlSerializer, markdownToHtmlSerializer, C38330b40.m65021p(markdownToHtmlSerializer)};
    }

    @Override // p000.E01
    public DataAccessNotice deserialize(GV0 decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        Object obj6;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36230Tt0 mo3298b = decoder.mo3298b(descriptor2);
        int i2 = 5;
        Object obj7 = null;
        if (mo3298b.mo3290k()) {
            obj6 = mo3298b.mo3283s(descriptor2, 0, DataAccessNoticeBody$$serializer.INSTANCE, null);
            MarkdownToHtmlSerializer markdownToHtmlSerializer = MarkdownToHtmlSerializer.INSTANCE;
            obj = mo3298b.mo3283s(descriptor2, 1, markdownToHtmlSerializer, null);
            obj2 = mo3298b.mo3292i(descriptor2, 2, markdownToHtmlSerializer, null);
            obj3 = mo3298b.mo3283s(descriptor2, 3, markdownToHtmlSerializer, null);
            obj4 = mo3298b.mo3283s(descriptor2, 4, markdownToHtmlSerializer, null);
            obj5 = mo3298b.mo3292i(descriptor2, 5, markdownToHtmlSerializer, null);
            i = 63;
        } else {
            boolean z = true;
            int i3 = 0;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            Object obj11 = null;
            Object obj12 = null;
            while (z) {
                int mo11843q = mo3298b.mo11843q(descriptor2);
                switch (mo11843q) {
                    case -1:
                        z = false;
                        i2 = 5;
                    case 0:
                        obj7 = mo3298b.mo3283s(descriptor2, 0, DataAccessNoticeBody$$serializer.INSTANCE, obj7);
                        i3 |= 1;
                        i2 = 5;
                    case 1:
                        obj8 = mo3298b.mo3283s(descriptor2, 1, MarkdownToHtmlSerializer.INSTANCE, obj8);
                        i3 |= 2;
                    case 2:
                        obj9 = mo3298b.mo3292i(descriptor2, 2, MarkdownToHtmlSerializer.INSTANCE, obj9);
                        i3 |= 4;
                    case 3:
                        obj10 = mo3298b.mo3283s(descriptor2, 3, MarkdownToHtmlSerializer.INSTANCE, obj10);
                        i3 |= 8;
                    case 4:
                        obj11 = mo3298b.mo3283s(descriptor2, 4, MarkdownToHtmlSerializer.INSTANCE, obj11);
                        i3 |= 16;
                    case 5:
                        obj12 = mo3298b.mo3292i(descriptor2, i2, MarkdownToHtmlSerializer.INSTANCE, obj12);
                        i3 |= 32;
                    default:
                        throw new UnknownFieldException(mo11843q);
                }
            }
            obj = obj8;
            obj2 = obj9;
            obj3 = obj10;
            obj4 = obj11;
            obj5 = obj12;
            Object obj13 = obj7;
            i = i3;
            obj6 = obj13;
        }
        mo3298b.mo3300a(descriptor2);
        return new DataAccessNotice(i, (DataAccessNoticeBody) obj6, (String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (C38819bt5) null);
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC40615et5
    public void serialize(InterfaceC48140rb1 encoder, DataAccessNotice value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36464Ut0 mo1149b = encoder.mo1149b(descriptor2);
        DataAccessNotice.write$Self(value, mo1149b, descriptor2);
        mo1149b.mo1151a(descriptor2);
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] typeParametersSerializers() {
        return InterfaceC44940mB1.C25934a.m26189a(this);
    }
}
