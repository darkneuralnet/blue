package com.stripe.android.uicore.address;

import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 $2\u00020\u0001:\u0002%$B3\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0018\b\u0002\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eBO\b\u0017\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u001c\b\u0001\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001`\u0011\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001d\u0010#J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\fR0\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001a\u0010\u001b¨\u0006&"}, m28432d2 = {"Lcom/stripe/android/uicore/address/FieldSchema;", "", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "isNumeric", "Z", "()Z", "isNumeric$annotations", "()V", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "examples", "Ljava/util/ArrayList;", "getExamples", "()Ljava/util/ArrayList;", "getExamples$annotations", "Lcom/stripe/android/uicore/address/NameType;", "nameType", "Lcom/stripe/android/uicore/address/NameType;", "getNameType", "()Lcom/stripe/android/uicore/address/NameType;", "getNameType$annotations", "<init>", "(ZLjava/util/ArrayList;Lcom/stripe/android/uicore/address/NameType;)V", "", "seen1", "Lbt5;", "serializationConstructorMarker", "(IZLjava/util/ArrayList;Lcom/stripe/android/uicore/address/NameType;Lbt5;)V", "Companion", "$serializer", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class FieldSchema {
    private final ArrayList<String> examples;
    private final boolean isNumeric;
    private final NameType nameType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/uicore/address/FieldSchema$Companion;", "", "LKj2;", "Lcom/stripe/android/uicore/address/FieldSchema;", "serializer", "<init>", "()V", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<FieldSchema> serializer() {
            return FieldSchema$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ FieldSchema(int i, @InterfaceC36694Vs5("isNumeric") boolean z, @InterfaceC36694Vs5("examples") ArrayList arrayList, @InterfaceC36694Vs5("nameType") NameType nameType, C38819bt5 c38819bt5) {
        if (4 != (i & 4)) {
            C52838zW3.m1275b(i, 4, FieldSchema$$serializer.INSTANCE.getDescriptor());
        }
        this.isNumeric = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.examples = new ArrayList<>();
        } else {
            this.examples = arrayList;
        }
        this.nameType = nameType;
    }

    @InterfaceC36694Vs5("examples")
    public static /* synthetic */ void getExamples$annotations() {
    }

    @InterfaceC36694Vs5("nameType")
    public static /* synthetic */ void getNameType$annotations() {
    }

    @InterfaceC36694Vs5("isNumeric")
    public static /* synthetic */ void isNumeric$annotations() {
    }

    @JvmStatic
    public static final void write$Self(FieldSchema self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        boolean z;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z2 = false;
        if (output.mo1132s(serialDesc, 0) || self.isNumeric) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo1129v(serialDesc, 0, self.isNumeric);
        }
        if (output.mo1132s(serialDesc, 1) || !Intrinsics.areEqual(self.examples, new ArrayList())) {
            z2 = true;
        }
        if (z2) {
            output.mo1126y(serialDesc, 1, new C27999ro(C41539gS5.f82260a), self.examples);
        }
        output.mo1126y(serialDesc, 2, NameType.Companion.serializer(), self.nameType);
    }

    public final ArrayList<String> getExamples() {
        return this.examples;
    }

    public final NameType getNameType() {
        return this.nameType;
    }

    public final boolean isNumeric() {
        return this.isNumeric;
    }

    public FieldSchema(boolean z, ArrayList<String> examples, NameType nameType) {
        Intrinsics.checkNotNullParameter(examples, "examples");
        Intrinsics.checkNotNullParameter(nameType, "nameType");
        this.isNumeric = z;
        this.examples = examples;
        this.nameType = nameType;
    }

    public /* synthetic */ FieldSchema(boolean z, ArrayList arrayList, NameType nameType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new ArrayList() : arrayList, nameType);
    }
}
