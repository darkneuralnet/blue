package com.stripe.android.core.model.serializers;

import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryCode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R \u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"Lcom/stripe/android/core/model/serializers/CountryListSerializer;", "LKj2;", "", "Lcom/stripe/android/core/model/Country;", "LGV0;", "decoder", "deserialize", "Lrb1;", "encoder", "value", "", "serialize", "LMs5;", "descriptor", "LMs5;", "getDescriptor", "()LMs5;", "getDescriptor$annotations", "()V", "<init>", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCountryListSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CountryListSerializer.kt\ncom/stripe/android/core/model/serializers/CountryListSerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 3 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 4 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n*L\n1#1,53:1\n488#2,2:54\n490#2,2:58\n32#3,2:56\n193#4:60\n*S KotlinDebug\n*F\n+ 1 CountryListSerializer.kt\ncom/stripe/android/core/model/serializers/CountryListSerializer\n*L\n43#1:54,2\n43#1:58,2\n46#1:56,2\n21#1:60\n*E\n"})
/* loaded from: classes6.dex */
public final class CountryListSerializer implements InterfaceC34036Kj2<List<? extends Country>> {
    public static final CountryListSerializer INSTANCE = new CountryListSerializer();
    private static final InterfaceC34588Ms5 descriptor;

    static {
        C41539gS5 c41539gS5 = C41539gS5.f82260a;
        descriptor = C35524Qs5.m87849d(c41539gS5.getDescriptor(), c41539gS5.getDescriptor());
    }

    private CountryListSerializer() {
    }

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return descriptor;
    }

    @Override // p000.E01
    public List<Country> deserialize(GV0 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        ArrayList arrayList = new ArrayList();
        InterfaceC36230Tt0 mo3298b = decoder.mo3298b(getDescriptor());
        while (true) {
            int mo11843q = mo3298b.mo11843q(getDescriptor());
            if (mo11843q != -1) {
                String mo3296e = mo3298b.mo3296e(getDescriptor(), mo11843q);
                arrayList.add(new Country(new CountryCode(mo3296e), mo3298b.mo3296e(getDescriptor(), mo3298b.mo11843q(getDescriptor()))));
            } else {
                mo3298b.mo3300a(getDescriptor());
                return arrayList;
            }
        }
    }

    @Override // p000.InterfaceC40615et5
    public void serialize(InterfaceC48140rb1 encoder, List<Country> value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36464Ut0 mo1125z = encoder.mo1125z(descriptor2, value.size());
        int i = 0;
        for (Country country : value) {
            CountryCode component1 = country.component1();
            String component2 = country.component2();
            CountryListSerializer countryListSerializer = INSTANCE;
            int i2 = i + 1;
            mo1125z.mo1128w(countryListSerializer.getDescriptor(), i, component1.getValue());
            mo1125z.mo1128w(countryListSerializer.getDescriptor(), i2, component2);
            i = i2 + 1;
        }
        mo1125z.mo1151a(descriptor2);
    }
}
