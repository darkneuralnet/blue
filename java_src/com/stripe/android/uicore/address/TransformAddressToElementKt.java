package com.stripe.android.uicore.address;

import com.stripe.android.uicore.elements.AdministrativeAreaConfig;
import com.stripe.android.uicore.elements.AdministrativeAreaElement;
import com.stripe.android.uicore.elements.DropdownFieldController;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.PostalCodeConfig;
import com.stripe.android.uicore.elements.RowController;
import com.stripe.android.uicore.elements.RowElement;
import com.stripe.android.uicore.elements.SectionFieldElement;
import com.stripe.android.uicore.elements.SectionSingleFieldElement;
import com.stripe.android.uicore.elements.SimpleTextElement;
import com.stripe.android.uicore.elements.SimpleTextFieldConfig;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.elements.TextFieldConfig;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p053io.CloseableKt;
import kotlin.p053io.TextStreamsKt;
import kotlin.text.Charsets;
@Metadata(m28433d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007\u001a \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007\u001a\u0014\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002\u001aI\u0010\u0018\u001a\u00020\u0015*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a9\u0010\u001c\u001a\u00020\u0019*\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u0002H\u0002\u001a\u0018\u0010!\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0015H\u0002\u001a\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000bH\u0002\u001a\u001c\u0010%\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010#H\u0002ø\u0001\u0001¢\u0006\u0004\b%\u0010&\"\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006*"}, m28432d2 = {"Ljava/io/InputStream;", "inputStream", "", "Lcom/stripe/android/uicore/address/CountryAddressSchema;", "parseAddressesSchema", "", "countryCode", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "transformToElementList", "getJsonStringFromInputStream", "Lcom/stripe/android/uicore/address/FieldType;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "identifierSpec", "", "label", "Lal2;", "capitalization", "Lcl2;", "keyboardType", "", "showOptionalLabel", "Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;", "toElement-96KqDgQ", "(Lcom/stripe/android/uicore/address/FieldType;Lcom/stripe/android/uicore/elements/IdentifierSpec;IIILjava/lang/String;Z)Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;", "toElement", "Lcom/stripe/android/uicore/elements/TextFieldConfig;", "toConfig-25FCGzQ", "(Lcom/stripe/android/uicore/address/FieldType;IIILjava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldConfig;", "toConfig", "countryAddressElements", "combineCityAndPostal", "element1", "element2", "isPostalNextToCity", "isCityOrPostal", "Lcom/stripe/android/uicore/address/FieldSchema;", "fieldSchema", "getKeyboard", "(Lcom/stripe/android/uicore/address/FieldSchema;)I", "Lbi2;", "format", "Lbi2;", "stripe-ui-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTransformAddressToElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformAddressToElement.kt\ncom/stripe/android/uicore/address/TransformAddressToElementKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,360:1\n819#2:361\n847#2,2:362\n1603#2,9:364\n1855#2:373\n1856#2:375\n1612#2:376\n1804#2,4:378\n1#3:374\n1#3:377\n*S KotlinDebug\n*F\n+ 1 TransformAddressToElement.kt\ncom/stripe/android/uicore/address/TransformAddressToElementKt\n*L\n229#1:361\n229#1:362,2\n233#1:364,9\n233#1:373\n233#1:375\n233#1:376\n322#1:378,4\n233#1:374\n*E\n"})
/* loaded from: classes7.dex */
public final class TransformAddressToElementKt {
    private static final AbstractC38706bi2 format = C33793Ji2.m99925b(null, TransformAddressToElementKt$format$1.INSTANCE, 1, null);

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FieldType.values().length];
            try {
                iArr[FieldType.AdministrativeArea.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FieldType.PostalCode.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final List<SectionFieldElement> combineCityAndPostal(List<? extends SectionSingleFieldElement> list) {
        List emptyList;
        List<SectionFieldElement> filterNotNull;
        Object lastOrNull;
        List listOf;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            SectionSingleFieldElement sectionSingleFieldElement = (SectionSingleFieldElement) obj;
            if (i2 >= list.size() || !isPostalNextToCity(list.get(i), list.get(i2))) {
                lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) emptyList);
                emptyList = lastOrNull instanceof RowElement ? CollectionsKt___CollectionsKt.plus((Collection<? extends Object>) emptyList, (Object) null) : CollectionsKt___CollectionsKt.plus((Collection<? extends SectionSingleFieldElement>) ((Collection<? extends Object>) emptyList), sectionSingleFieldElement);
            } else {
                listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new SectionSingleFieldElement[]{list.get(i), list.get(i2)});
                emptyList = CollectionsKt___CollectionsKt.plus((Collection<? extends RowElement>) ((Collection<? extends Object>) emptyList), new RowElement(IdentifierSpec.Companion.Generic("row_" + UUID.randomUUID().getLeastSignificantBits()), listOf, new RowController(listOf)));
            }
            i = i2;
        }
        filterNotNull = CollectionsKt___CollectionsKt.filterNotNull(emptyList);
        return filterNotNull;
    }

    private static final String getJsonStringFromInputStream(InputStream inputStream) {
        BufferedReader bufferedReader;
        String readText;
        if (inputStream != null) {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
            bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        } else {
            bufferedReader = null;
        }
        if (bufferedReader != null) {
            try {
                readText = TextStreamsKt.readText(bufferedReader);
            } finally {
            }
        } else {
            readText = null;
        }
        CloseableKt.closeFinally(bufferedReader, null);
        return readText;
    }

    private static final int getKeyboard(FieldSchema fieldSchema) {
        boolean z = false;
        if (fieldSchema != null && fieldSchema.isNumeric()) {
            z = true;
        }
        if (z) {
            return C39329cl2.f61189b.m60911e();
        }
        return C39329cl2.f61189b.m60908h();
    }

    private static final boolean isCityOrPostal(IdentifierSpec identifierSpec) {
        IdentifierSpec.Companion companion = IdentifierSpec.Companion;
        if (!Intrinsics.areEqual(identifierSpec, companion.getPostalCode()) && !Intrinsics.areEqual(identifierSpec, companion.getCity())) {
            return false;
        }
        return true;
    }

    private static final boolean isPostalNextToCity(SectionSingleFieldElement sectionSingleFieldElement, SectionSingleFieldElement sectionSingleFieldElement2) {
        return isCityOrPostal(sectionSingleFieldElement.getIdentifier()) && isCityOrPostal(sectionSingleFieldElement2.getIdentifier());
    }

    public static final List<CountryAddressSchema> parseAddressesSchema(InputStream inputStream) {
        String jsonStringFromInputStream = getJsonStringFromInputStream(inputStream);
        if (jsonStringFromInputStream != null) {
            return (List) format.m64105b(C38330b40.m65030g(CountryAddressSchema.Companion.serializer()), jsonStringFromInputStream);
        }
        return null;
    }

    /* renamed from: toConfig-25FCGzQ  reason: not valid java name */
    private static final TextFieldConfig m116729toConfig25FCGzQ(FieldType fieldType, int i, int i2, int i3, String str) {
        if (WhenMappings.$EnumSwitchMapping$0[fieldType.ordinal()] == 2) {
            return new PostalCodeConfig(i, i2, i3, null, str, 8, null);
        }
        return new SimpleTextFieldConfig(Integer.valueOf(i), i2, i3, null, 8, null);
    }

    /* renamed from: toElement-96KqDgQ  reason: not valid java name */
    private static final SectionSingleFieldElement m116730toElement96KqDgQ(FieldType fieldType, IdentifierSpec identifierSpec, int i, int i2, int i3, String str, boolean z) {
        List listOf;
        AdministrativeAreaConfig.Country c19448us;
        SimpleTextElement simpleTextElement = new SimpleTextElement(identifierSpec, new SimpleTextFieldController(m116729toConfig25FCGzQ(fieldType, i, i2, i3, str), z, null, 4, null));
        if (WhenMappings.$EnumSwitchMapping$0[fieldType.ordinal()] == 1) {
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"CA", "US"});
            if (listOf.contains(str)) {
                if (Intrinsics.areEqual(str, "CA")) {
                    c19448us = new AdministrativeAreaConfig.Country.Canada(0, null, 3, null);
                } else if (Intrinsics.areEqual(str, "US")) {
                    c19448us = new AdministrativeAreaConfig.Country.C19448US(0, null, 3, null);
                } else {
                    throw new IllegalArgumentException();
                }
                return new AdministrativeAreaElement(identifierSpec, new DropdownFieldController(new AdministrativeAreaConfig(c19448us), null, 2, null));
            }
            return simpleTextElement;
        }
        return simpleTextElement;
    }

    public static final List<SectionFieldElement> transformToElementList(List<CountryAddressSchema> list, String countryCode) {
        SectionSingleFieldElement sectionSingleFieldElement;
        int defaultLabel;
        NameType nameType;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        ArrayList<CountryAddressSchema> arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            CountryAddressSchema countryAddressSchema = (CountryAddressSchema) next;
            if (countryAddressSchema.getType() != FieldType.SortingCode && countryAddressSchema.getType() != FieldType.DependentLocality) {
                z = false;
            }
            if (!z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (CountryAddressSchema countryAddressSchema2 : arrayList) {
            FieldType type = countryAddressSchema2.getType();
            if (type != null) {
                IdentifierSpec identifierSpec = countryAddressSchema2.getType().getIdentifierSpec();
                FieldSchema schema = countryAddressSchema2.getSchema();
                if (schema != null && (nameType = schema.getNameType()) != null) {
                    defaultLabel = nameType.getStringResId();
                } else {
                    defaultLabel = countryAddressSchema2.getType().getDefaultLabel();
                }
                sectionSingleFieldElement = m116730toElement96KqDgQ(type, identifierSpec, defaultLabel, countryAddressSchema2.getType().mo116728capitalizationIUNYP9k(), getKeyboard(countryAddressSchema2.getSchema()), countryCode, !countryAddressSchema2.getRequired());
            } else {
                sectionSingleFieldElement = null;
            }
            if (sectionSingleFieldElement != null) {
                arrayList2.add(sectionSingleFieldElement);
            }
        }
        return combineCityAndPostal(arrayList2);
    }
}
