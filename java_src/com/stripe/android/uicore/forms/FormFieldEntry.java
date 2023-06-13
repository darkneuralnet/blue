package com.stripe.android.uicore.forms;

import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/uicore/forms/FormFieldEntry;", "", "value", "", "isComplete", "", "(Ljava/lang/String;Z)V", "()Z", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class FormFieldEntry {
    public static final int $stable = 0;
    private final boolean isComplete;
    private final String value;

    public FormFieldEntry(String str, boolean z) {
        this.value = str;
        this.isComplete = z;
    }

    public static /* synthetic */ FormFieldEntry copy$default(FormFieldEntry formFieldEntry, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = formFieldEntry.value;
        }
        if ((i & 2) != 0) {
            z = formFieldEntry.isComplete;
        }
        return formFieldEntry.copy(str, z);
    }

    public final String component1() {
        return this.value;
    }

    public final boolean component2() {
        return this.isComplete;
    }

    public final FormFieldEntry copy(String str, boolean z) {
        return new FormFieldEntry(str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FormFieldEntry) {
            FormFieldEntry formFieldEntry = (FormFieldEntry) obj;
            return Intrinsics.areEqual(this.value, formFieldEntry.value) && this.isComplete == formFieldEntry.isComplete;
        }
        return false;
    }

    public final String getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.value;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.isComplete;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final boolean isComplete() {
        return this.isComplete;
    }

    public String toString() {
        String str = this.value;
        boolean z = this.isComplete;
        return "FormFieldEntry(value=" + str + ", isComplete=" + z + ")";
    }

    public /* synthetic */ FormFieldEntry(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }
}
