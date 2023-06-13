package co.bird.android.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J%\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m28432d2 = {"Lco/bird/android/model/SelectedLoggedRepair;", "", "selectedRepairs", "", "", "message", "(Ljava/util/List;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getSelectedRepairs", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class SelectedLoggedRepair {
    public static final Companion Companion = new Companion(null);
    private static final String REPAIR_TEXT_KEY = "comment";
    private final String message;
    private final List<String> selectedRepairs;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/SelectedLoggedRepair$Companion;", "", "()V", "REPAIR_TEXT_KEY", "", "getREPAIR_TEXT_KEY", "()Ljava/lang/String;", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getREPAIR_TEXT_KEY() {
            return SelectedLoggedRepair.REPAIR_TEXT_KEY;
        }

        private Companion() {
        }
    }

    public SelectedLoggedRepair(List<String> selectedRepairs, String str) {
        Intrinsics.checkNotNullParameter(selectedRepairs, "selectedRepairs");
        this.selectedRepairs = selectedRepairs;
        this.message = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectedLoggedRepair copy$default(SelectedLoggedRepair selectedLoggedRepair, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = selectedLoggedRepair.selectedRepairs;
        }
        if ((i & 2) != 0) {
            str = selectedLoggedRepair.message;
        }
        return selectedLoggedRepair.copy(list, str);
    }

    public final List<String> component1() {
        return this.selectedRepairs;
    }

    public final String component2() {
        return this.message;
    }

    public final SelectedLoggedRepair copy(List<String> selectedRepairs, String str) {
        Intrinsics.checkNotNullParameter(selectedRepairs, "selectedRepairs");
        return new SelectedLoggedRepair(selectedRepairs, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SelectedLoggedRepair) {
            SelectedLoggedRepair selectedLoggedRepair = (SelectedLoggedRepair) obj;
            return Intrinsics.areEqual(this.selectedRepairs, selectedLoggedRepair.selectedRepairs) && Intrinsics.areEqual(this.message, selectedLoggedRepair.message);
        }
        return false;
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<String> getSelectedRepairs() {
        return this.selectedRepairs;
    }

    public int hashCode() {
        int hashCode = this.selectedRepairs.hashCode() * 31;
        String str = this.message;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        List<String> list = this.selectedRepairs;
        String str = this.message;
        return "SelectedLoggedRepair(selectedRepairs=" + list + ", message=" + str + ")";
    }

    public /* synthetic */ SelectedLoggedRepair(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : str);
    }
}
