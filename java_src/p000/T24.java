package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.PrivateBirdAction;
import co.bird.android.model.PrivateBirdSetting;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0007\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, m28432d2 = {"LT24;", "", "", "Lco/bird/android/model/PrivateBirdAction;", "actions", "Lco/bird/android/model/PrivateBirdSetting;", "settings", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lco/bird/android/model/PrivateBirdSetting;", "c", "()Lco/bird/android/model/PrivateBirdSetting;", "<init>", "(Ljava/util/List;Lco/bird/android/model/PrivateBirdSetting;)V", "co.bird.android.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: T24 */
/* loaded from: classes4.dex */
public final class T24 {
    @JsonProperty("actions")
    @InterfaceC41208ft5("actions")
    private final List<PrivateBirdAction> actions;
    @JsonProperty("settings")
    @InterfaceC41208ft5("settings")
    private final PrivateBirdSetting settings;

    /* JADX WARN: Multi-variable type inference failed */
    public T24(List<? extends PrivateBirdAction> actions, PrivateBirdSetting settings) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.actions = actions;
        this.settings = settings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ T24 copy$default(T24 t24, List list, PrivateBirdSetting privateBirdSetting, int i, Object obj) {
        if ((i & 1) != 0) {
            list = t24.actions;
        }
        if ((i & 2) != 0) {
            privateBirdSetting = t24.settings;
        }
        return t24.m84408a(list, privateBirdSetting);
    }

    /* renamed from: a */
    public final T24 m84408a(List<? extends PrivateBirdAction> actions, PrivateBirdSetting settings) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(settings, "settings");
        return new T24(actions, settings);
    }

    /* renamed from: b */
    public final List<PrivateBirdAction> m84407b() {
        return this.actions;
    }

    /* renamed from: c */
    public final PrivateBirdSetting m84406c() {
        return this.settings;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof T24) {
            T24 t24 = (T24) obj;
            return Intrinsics.areEqual(this.actions, t24.actions) && Intrinsics.areEqual(this.settings, t24.settings);
        }
        return false;
    }

    public int hashCode() {
        return (this.actions.hashCode() * 31) + this.settings.hashCode();
    }

    public String toString() {
        List<PrivateBirdAction> list = this.actions;
        PrivateBirdSetting privateBirdSetting = this.settings;
        return "PrivateBirdActionResponse(actions=" + list + ", settings=" + privateBirdSetting + ")";
    }

    public /* synthetic */ T24(List list, PrivateBirdSetting privateBirdSetting, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, privateBirdSetting);
    }
}
