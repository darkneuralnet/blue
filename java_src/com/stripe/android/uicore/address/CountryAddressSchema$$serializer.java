package com.stripe.android.uicore.address;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import p000.InterfaceC44940mB1;
@Metadata(m28433d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"com/stripe/android/uicore/address/CountryAddressSchema.$serializer", "LmB1;", "Lcom/stripe/android/uicore/address/CountryAddressSchema;", "", "LKj2;", "childSerializers", "()[LKj2;", "LGV0;", "decoder", "deserialize", "Lrb1;", "encoder", "value", "", "serialize", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "<init>", "()V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class CountryAddressSchema$$serializer implements InterfaceC44940mB1<CountryAddressSchema> {
    public static final int $stable = 0;
    public static final CountryAddressSchema$$serializer INSTANCE;
    private static final /* synthetic */ AW3 descriptor;

    static {
        CountryAddressSchema$$serializer countryAddressSchema$$serializer = new CountryAddressSchema$$serializer();
        INSTANCE = countryAddressSchema$$serializer;
        AW3 aw3 = new AW3("com.stripe.android.uicore.address.CountryAddressSchema", countryAddressSchema$$serializer, 3);
        aw3.m115697k("type", false);
        aw3.m115697k("required", false);
        aw3.m115697k("schema", true);
        descriptor = aw3;
    }

    private CountryAddressSchema$$serializer() {
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] childSerializers() {
        return new InterfaceC34036Kj2[]{C38330b40.m65021p(FieldType.Companion.serializer()), C9804YY.f45990a, C38330b40.m65021p(FieldSchema$$serializer.INSTANCE)};
    }

    @Override // p000.E01
    public CountryAddressSchema deserialize(GV0 decoder) {
        int i;
        Object obj;
        boolean z;
        Object obj2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36230Tt0 mo3298b = decoder.mo3298b(descriptor2);
        if (mo3298b.mo3290k()) {
            obj2 = mo3298b.mo3292i(descriptor2, 0, FieldType.Companion.serializer(), null);
            boolean mo3322E = mo3298b.mo3322E(descriptor2, 1);
            obj = mo3298b.mo3292i(descriptor2, 2, FieldSchema$$serializer.INSTANCE, null);
            i = 7;
            z = mo3322E;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            Object obj3 = null;
            Object obj4 = null;
            int i2 = 0;
            while (z2) {
                int mo11843q = mo3298b.mo11843q(descriptor2);
                if (mo11843q == -1) {
                    z2 = false;
                } else if (mo11843q == 0) {
                    obj3 = mo3298b.mo3292i(descriptor2, 0, FieldType.Companion.serializer(), obj3);
                    i2 |= 1;
                } else if (mo11843q == 1) {
                    z3 = mo3298b.mo3322E(descriptor2, 1);
                    i2 |= 2;
                } else if (mo11843q != 2) {
                    throw new UnknownFieldException(mo11843q);
                } else {
                    obj4 = mo3298b.mo3292i(descriptor2, 2, FieldSchema$$serializer.INSTANCE, obj4);
                    i2 |= 4;
                }
            }
            i = i2;
            obj = obj4;
            Object obj5 = obj3;
            z = z3;
            obj2 = obj5;
        }
        mo3298b.mo3300a(descriptor2);
        return new CountryAddressSchema(i, (FieldType) obj2, z, (FieldSchema) obj, (C38819bt5) null);
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC40615et5
    public void serialize(InterfaceC48140rb1 encoder, CountryAddressSchema value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36464Ut0 mo1149b = encoder.mo1149b(descriptor2);
        CountryAddressSchema.write$Self(value, mo1149b, descriptor2);
        mo1149b.mo1151a(descriptor2);
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] typeParametersSerializers() {
        return InterfaceC44940mB1.C25934a.m26189a(this);
    }
}
