package com.stripe.android.uicore.address;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002$#B%\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001c\u0010\u001dB=\b\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001c\u0010\"J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u0019\u0010\u001a¨\u0006%"}, m28432d2 = {"Lcom/stripe/android/uicore/address/CountryAddressSchema;", "", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "Lcom/stripe/android/uicore/address/FieldType;", "type", "Lcom/stripe/android/uicore/address/FieldType;", "getType", "()Lcom/stripe/android/uicore/address/FieldType;", "getType$annotations", "()V", "", "required", "Z", "getRequired", "()Z", "getRequired$annotations", "Lcom/stripe/android/uicore/address/FieldSchema;", "schema", "Lcom/stripe/android/uicore/address/FieldSchema;", "getSchema", "()Lcom/stripe/android/uicore/address/FieldSchema;", "getSchema$annotations", "<init>", "(Lcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;)V", "", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;Lbt5;)V", "Companion", "$serializer", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class CountryAddressSchema {
    private final boolean required;
    private final FieldSchema schema;
    private final FieldType type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/uicore/address/CountryAddressSchema$Companion;", "", "LKj2;", "Lcom/stripe/android/uicore/address/CountryAddressSchema;", "serializer", "<init>", "()V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<CountryAddressSchema> serializer() {
            return CountryAddressSchema$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ CountryAddressSchema(int i, @InterfaceC36694Vs5("type") FieldType fieldType, @InterfaceC36694Vs5("required") boolean z, @InterfaceC36694Vs5("schema") FieldSchema fieldSchema, C38819bt5 c38819bt5) {
        if (3 != (i & 3)) {
            C52838zW3.m1275b(i, 3, CountryAddressSchema$$serializer.INSTANCE.getDescriptor());
        }
        this.type = fieldType;
        this.required = z;
        if ((i & 4) == 0) {
            this.schema = null;
        } else {
            this.schema = fieldSchema;
        }
    }

    @InterfaceC36694Vs5("required")
    public static /* synthetic */ void getRequired$annotations() {
    }

    @InterfaceC36694Vs5("schema")
    public static /* synthetic */ void getSchema$annotations() {
    }

    @InterfaceC36694Vs5("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @JvmStatic
    public static final void write$Self(CountryAddressSchema self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z = false;
        output.mo1173E(serialDesc, 0, FieldType.Companion.serializer(), self.type);
        output.mo1129v(serialDesc, 1, self.required);
        if (output.mo1132s(serialDesc, 2) || self.schema != null) {
            z = true;
        }
        if (z) {
            output.mo1173E(serialDesc, 2, FieldSchema$$serializer.INSTANCE, self.schema);
        }
    }

    public final boolean getRequired() {
        return this.required;
    }

    public final FieldSchema getSchema() {
        return this.schema;
    }

    public final FieldType getType() {
        return this.type;
    }

    public CountryAddressSchema(FieldType fieldType, boolean z, FieldSchema fieldSchema) {
        this.type = fieldType;
        this.required = z;
        this.schema = fieldSchema;
    }

    public /* synthetic */ CountryAddressSchema(FieldType fieldType, boolean z, FieldSchema fieldSchema, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fieldType, z, (i & 4) != 0 ? null : fieldSchema);
    }
}
