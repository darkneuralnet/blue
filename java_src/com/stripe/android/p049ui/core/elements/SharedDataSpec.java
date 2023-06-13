package com.stripe.android.p049ui.core.elements;

import co.bird.android.model.LegacyRepairType;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@InterfaceC36928Ws5
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BK\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\u0018\b\u0002\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b5\u00106Bg\b\u0017\u0012\u0006\u00107\u001a\u00020\u001c\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u000b\u0012\u001c\b\u0001\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u000f\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0013\u0012\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b5\u0010:J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\u000bHÆ\u0003J\u0019\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\u0018\b\u0002\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\t\u0010\u001b\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0015\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R \u0010\u0016\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R0\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010)\u0012\u0004\b,\u0010$\u001a\u0004\b*\u0010+R\"\u0010\u0018\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010-\u0012\u0004\b0\u0010$\u001a\u0004\b.\u0010/R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u00101\u0012\u0004\b4\u0010$\u001a\u0004\b2\u00103¨\u0006="}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/SharedDataSpec;", "", "self", "LUt0;", "output", "LMs5;", "serialDesc", "", "write$Self", "", "component1", "", "component2", "Ljava/util/ArrayList;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "Lkotlin/collections/ArrayList;", "component3", "Lcom/stripe/android/ui/core/elements/NextActionSpec;", "component4", "Lcom/stripe/android/ui/core/elements/SelectorIcon;", "component5", "type", "async", "fields", "nextActionSpec", "selectorIcon", "copy", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getType$annotations", "()V", "Z", "getAsync", "()Z", "getAsync$annotations", "Ljava/util/ArrayList;", "getFields", "()Ljava/util/ArrayList;", "getFields$annotations", "Lcom/stripe/android/ui/core/elements/NextActionSpec;", "getNextActionSpec", "()Lcom/stripe/android/ui/core/elements/NextActionSpec;", "getNextActionSpec$annotations", "Lcom/stripe/android/ui/core/elements/SelectorIcon;", "getSelectorIcon", "()Lcom/stripe/android/ui/core/elements/SelectorIcon;", "getSelectorIcon$annotations", "<init>", "(Ljava/lang/String;ZLjava/util/ArrayList;Lcom/stripe/android/ui/core/elements/NextActionSpec;Lcom/stripe/android/ui/core/elements/SelectorIcon;)V", "seen1", "Lbt5;", "serializationConstructorMarker", "(ILjava/lang/String;ZLjava/util/ArrayList;Lcom/stripe/android/ui/core/elements/NextActionSpec;Lcom/stripe/android/ui/core/elements/SelectorIcon;Lbt5;)V", "Companion", "$serializer", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.ui.core.elements.SharedDataSpec */
/* loaded from: classes7.dex */
public final class SharedDataSpec {
    public static final Companion Companion = new Companion(null);
    private final boolean async;
    private final ArrayList<FormItemSpec> fields;
    private final NextActionSpec nextActionSpec;
    private final SelectorIcon selectorIcon;
    private final String type;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/ui/core/elements/SharedDataSpec$Companion;", "", "LKj2;", "Lcom/stripe/android/ui/core/elements/SharedDataSpec;", "serializer", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: com.stripe.android.ui.core.elements.SharedDataSpec$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC34036Kj2<SharedDataSpec> serializer() {
            return SharedDataSpec$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ SharedDataSpec(int i, @InterfaceC36694Vs5("type") String str, @InterfaceC36694Vs5("async") boolean z, @InterfaceC36694Vs5("fields") ArrayList arrayList, @InterfaceC36694Vs5("next_action_spec") NextActionSpec nextActionSpec, @InterfaceC36694Vs5("selector_icon") SelectorIcon selectorIcon, C38819bt5 c38819bt5) {
        ArrayList<FormItemSpec> arrayListOf;
        if (1 != (i & 1)) {
            C52838zW3.m1275b(i, 1, SharedDataSpec$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        if ((i & 2) == 0) {
            this.async = false;
        } else {
            this.async = z;
        }
        if ((i & 4) == 0) {
            arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(EmptyFormSpec.INSTANCE);
            this.fields = arrayListOf;
        } else {
            this.fields = arrayList;
        }
        if ((i & 8) == 0) {
            this.nextActionSpec = null;
        } else {
            this.nextActionSpec = nextActionSpec;
        }
        if ((i & 16) == 0) {
            this.selectorIcon = null;
        } else {
            this.selectorIcon = selectorIcon;
        }
    }

    public static /* synthetic */ SharedDataSpec copy$default(SharedDataSpec sharedDataSpec, String str, boolean z, ArrayList arrayList, NextActionSpec nextActionSpec, SelectorIcon selectorIcon, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sharedDataSpec.type;
        }
        if ((i & 2) != 0) {
            z = sharedDataSpec.async;
        }
        boolean z2 = z;
        ArrayList<FormItemSpec> arrayList2 = arrayList;
        if ((i & 4) != 0) {
            arrayList2 = sharedDataSpec.fields;
        }
        ArrayList arrayList3 = arrayList2;
        if ((i & 8) != 0) {
            nextActionSpec = sharedDataSpec.nextActionSpec;
        }
        NextActionSpec nextActionSpec2 = nextActionSpec;
        if ((i & 16) != 0) {
            selectorIcon = sharedDataSpec.selectorIcon;
        }
        return sharedDataSpec.copy(str, z2, arrayList3, nextActionSpec2, selectorIcon);
    }

    @InterfaceC36694Vs5("async")
    public static /* synthetic */ void getAsync$annotations() {
    }

    @InterfaceC36694Vs5("fields")
    public static /* synthetic */ void getFields$annotations() {
    }

    @InterfaceC36694Vs5("next_action_spec")
    public static /* synthetic */ void getNextActionSpec$annotations() {
    }

    @InterfaceC36694Vs5("selector_icon")
    public static /* synthetic */ void getSelectorIcon$annotations() {
    }

    @InterfaceC36694Vs5("type")
    public static /* synthetic */ void getType$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void write$Self(SharedDataSpec self, InterfaceC36464Ut0 output, InterfaceC34588Ms5 serialDesc) {
        boolean z;
        ArrayList arrayListOf;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(self, "self");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        boolean z4 = false;
        output.mo1128w(serialDesc, 0, self.type);
        if (output.mo1132s(serialDesc, 1) || self.async) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            output.mo1129v(serialDesc, 1, self.async);
        }
        if (!output.mo1132s(serialDesc, 2)) {
            ArrayList<FormItemSpec> arrayList = self.fields;
            arrayListOf = CollectionsKt__CollectionsKt.arrayListOf(EmptyFormSpec.INSTANCE);
            if (Intrinsics.areEqual(arrayList, arrayListOf)) {
                z2 = false;
                if (z2) {
                    output.mo1126y(serialDesc, 2, new C27999ro(FormItemSpecSerializer.INSTANCE), self.fields);
                }
                if (output.mo1132s(serialDesc, 3) || self.nextActionSpec != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    output.mo1173E(serialDesc, 3, NextActionSpec$$serializer.INSTANCE, self.nextActionSpec);
                }
                if (!output.mo1132s(serialDesc, 4) || self.selectorIcon != null) {
                    z4 = true;
                }
                if (z4) {
                    output.mo1173E(serialDesc, 4, SelectorIcon$$serializer.INSTANCE, self.selectorIcon);
                    return;
                }
                return;
            }
        }
        z2 = true;
        if (z2) {
        }
        if (output.mo1132s(serialDesc, 3)) {
            z3 = false;
            if (z3) {
            }
            if (!output.mo1132s(serialDesc, 4)) {
            }
            z4 = true;
            if (z4) {
            }
        }
        z3 = true;
        if (z3) {
        }
        if (!output.mo1132s(serialDesc, 4)) {
        }
        z4 = true;
        if (z4) {
        }
    }

    public final String component1() {
        return this.type;
    }

    public final boolean component2() {
        return this.async;
    }

    public final ArrayList<FormItemSpec> component3() {
        return this.fields;
    }

    public final NextActionSpec component4() {
        return this.nextActionSpec;
    }

    public final SelectorIcon component5() {
        return this.selectorIcon;
    }

    public final SharedDataSpec copy(String type, boolean z, ArrayList<FormItemSpec> fields, NextActionSpec nextActionSpec, SelectorIcon selectorIcon) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(fields, "fields");
        return new SharedDataSpec(type, z, fields, nextActionSpec, selectorIcon);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SharedDataSpec) {
            SharedDataSpec sharedDataSpec = (SharedDataSpec) obj;
            return Intrinsics.areEqual(this.type, sharedDataSpec.type) && this.async == sharedDataSpec.async && Intrinsics.areEqual(this.fields, sharedDataSpec.fields) && Intrinsics.areEqual(this.nextActionSpec, sharedDataSpec.nextActionSpec) && Intrinsics.areEqual(this.selectorIcon, sharedDataSpec.selectorIcon);
        }
        return false;
    }

    public final boolean getAsync() {
        return this.async;
    }

    public final ArrayList<FormItemSpec> getFields() {
        return this.fields;
    }

    public final NextActionSpec getNextActionSpec() {
        return this.nextActionSpec;
    }

    public final SelectorIcon getSelectorIcon() {
        return this.selectorIcon;
    }

    public final String getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        boolean z = this.async;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode2 = (((hashCode + i) * 31) + this.fields.hashCode()) * 31;
        NextActionSpec nextActionSpec = this.nextActionSpec;
        int hashCode3 = (hashCode2 + (nextActionSpec == null ? 0 : nextActionSpec.hashCode())) * 31;
        SelectorIcon selectorIcon = this.selectorIcon;
        return hashCode3 + (selectorIcon != null ? selectorIcon.hashCode() : 0);
    }

    public String toString() {
        String str = this.type;
        boolean z = this.async;
        ArrayList<FormItemSpec> arrayList = this.fields;
        NextActionSpec nextActionSpec = this.nextActionSpec;
        SelectorIcon selectorIcon = this.selectorIcon;
        return "SharedDataSpec(type=" + str + ", async=" + z + ", fields=" + arrayList + ", nextActionSpec=" + nextActionSpec + ", selectorIcon=" + selectorIcon + ")";
    }

    public SharedDataSpec(String type, boolean z, ArrayList<FormItemSpec> fields, NextActionSpec nextActionSpec, SelectorIcon selectorIcon) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.type = type;
        this.async = z;
        this.fields = fields;
        this.nextActionSpec = nextActionSpec;
        this.selectorIcon = selectorIcon;
    }

    public /* synthetic */ SharedDataSpec(String str, boolean z, ArrayList arrayList, NextActionSpec nextActionSpec, SelectorIcon selectorIcon, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? CollectionsKt__CollectionsKt.arrayListOf(EmptyFormSpec.INSTANCE) : arrayList, (i & 8) != 0 ? null : nextActionSpec, (i & 16) != 0 ? null : selectorIcon);
    }
}
