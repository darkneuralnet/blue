package com.stripe.android.uicore.address;

import com.stripe.android.uicore.C19423R;
import com.stripe.android.uicore.elements.IdentifierSpec;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum AddressLine1 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\u0001\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B#\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0005\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, m28432d2 = {"Lcom/stripe/android/uicore/address/FieldType;", "", "Lal2;", "capitalization-IUNYP9k", "()I", "capitalization", "", "serializedValue", "Ljava/lang/String;", "getSerializedValue", "()Ljava/lang/String;", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "identifierSpec", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getIdentifierSpec", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", "defaultLabel", "I", "getDefaultLabel", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/uicore/elements/IdentifierSpec;I)V", "Companion", "AddressLine1", "AddressLine2", "Locality", "DependentLocality", "PostalCode", "SortingCode", "AdministrativeArea", "Name", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public class FieldType {
    private static final /* synthetic */ FieldType[] $VALUES;
    private static final Lazy<InterfaceC34036Kj2<Object>> $cachedSerializer$delegate;
    @InterfaceC36694Vs5("addressLine1")
    public static final FieldType AddressLine1;
    @InterfaceC36694Vs5("addressLine2")
    public static final FieldType AddressLine2;
    @InterfaceC36694Vs5("administrativeArea")
    public static final FieldType AdministrativeArea;
    public static final Companion Companion;
    @InterfaceC36694Vs5("dependentLocality")
    public static final FieldType DependentLocality;
    @InterfaceC36694Vs5("locality")
    public static final FieldType Locality;
    @InterfaceC36694Vs5("name")
    public static final FieldType Name;
    @InterfaceC36694Vs5("postalCode")
    public static final FieldType PostalCode;
    @InterfaceC36694Vs5("sortingCode")
    public static final FieldType SortingCode;
    private final int defaultLabel;
    private final IdentifierSpec identifierSpec;
    private final String serializedValue;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/uicore/address/FieldType$Companion;", "", "", "value", "Lcom/stripe/android/uicore/address/FieldType;", "from", "LKj2;", "serializer", "<init>", "()V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTransformAddressToElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformAddressToElement.kt\ncom/stripe/android/uicore/address/FieldType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,360:1\n1282#2,2:361\n*S KotlinDebug\n*F\n+ 1 TransformAddressToElement.kt\ncom/stripe/android/uicore/address/FieldType$Companion\n*L\n99#1:361,2\n*E\n"})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ Lazy get$cachedSerializer$delegate() {
            return FieldType.$cachedSerializer$delegate;
        }

        public final FieldType from(String value) {
            FieldType[] values;
            Intrinsics.checkNotNullParameter(value, "value");
            for (FieldType fieldType : FieldType.values()) {
                if (Intrinsics.areEqual(fieldType.getSerializedValue(), value)) {
                    return fieldType;
                }
            }
            return null;
        }

        public final InterfaceC34036Kj2<FieldType> serializer() {
            return (InterfaceC34036Kj2) get$cachedSerializer$delegate().getValue();
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ FieldType[] $values() {
        return new FieldType[]{AddressLine1, AddressLine2, Locality, DependentLocality, PostalCode, SortingCode, AdministrativeArea, Name};
    }

    static {
        Lazy<InterfaceC34036Kj2<Object>> lazy;
        IdentifierSpec.Companion companion = IdentifierSpec.Companion;
        AddressLine1 = new FieldType("AddressLine1", 0, "addressLine1", companion.getLine1(), C19423R.string.address_label_address_line1);
        AddressLine2 = new FieldType("AddressLine2", 1, "addressLine2", companion.getLine2(), C19423R.string.address_label_address_line2);
        IdentifierSpec city = companion.getCity();
        int i = C19423R.string.address_label_city;
        Locality = new FieldType("Locality", 2, "locality", city, i);
        DependentLocality = new FieldType("DependentLocality", 3, "dependentLocality", companion.getDependentLocality(), i);
        PostalCode = new FieldType("PostalCode", 4) { // from class: com.stripe.android.uicore.address.FieldType.PostalCode
            {
                IdentifierSpec postalCode = IdentifierSpec.Companion.getPostalCode();
                int i2 = C19423R.string.address_label_postal_code;
            }

            @Override // com.stripe.android.uicore.address.FieldType
            /* renamed from: capitalization-IUNYP9k */
            public int mo116728capitalizationIUNYP9k() {
                return C38143al2.f51187a.m70783b();
            }
        };
        SortingCode = new FieldType("SortingCode", 5) { // from class: com.stripe.android.uicore.address.FieldType.SortingCode
            {
                IdentifierSpec sortingCode = IdentifierSpec.Companion.getSortingCode();
                int i2 = C19423R.string.address_label_postal_code;
            }

            @Override // com.stripe.android.uicore.address.FieldType
            /* renamed from: capitalization-IUNYP9k */
            public int mo116728capitalizationIUNYP9k() {
                return C38143al2.f51187a.m70783b();
            }
        };
        AdministrativeArea = new FieldType("AdministrativeArea", 6, "administrativeArea", companion.getState(), NameType.State.getStringResId());
        Name = new FieldType("Name", 7, "name", companion.getName(), C19423R.string.address_label_full_name);
        $VALUES = $values();
        Companion = new Companion(null);
        lazy = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) FieldType$Companion$$cachedSerializer$delegate$1.INSTANCE);
        $cachedSerializer$delegate = lazy;
    }

    public /* synthetic */ FieldType(String str, int i, String str2, IdentifierSpec identifierSpec, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, identifierSpec, i2);
    }

    public static FieldType valueOf(String str) {
        return (FieldType) Enum.valueOf(FieldType.class, str);
    }

    public static FieldType[] values() {
        return (FieldType[]) $VALUES.clone();
    }

    /* renamed from: capitalization-IUNYP9k  reason: not valid java name */
    public int mo116728capitalizationIUNYP9k() {
        return C38143al2.f51187a.m70781d();
    }

    public final int getDefaultLabel() {
        return this.defaultLabel;
    }

    public final IdentifierSpec getIdentifierSpec() {
        return this.identifierSpec;
    }

    public final String getSerializedValue() {
        return this.serializedValue;
    }

    private FieldType(String str, int i, String str2, IdentifierSpec identifierSpec, int i2) {
        this.serializedValue = str2;
        this.identifierSpec = identifierSpec;
        this.defaultLabel = i2;
    }
}
