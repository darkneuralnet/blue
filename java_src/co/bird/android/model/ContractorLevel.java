package co.bird.android.model;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum FLEDGLING uses external variables
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
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B)\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/model/ContractorLevel;", "", "roleLabel", "", "menuItemIcon", "roleIcon", "(Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/Integer;)V", "getMenuItemIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRoleIcon", "getRoleLabel", "()I", "FLEDGLING", "FLYER", "CHARGER", "SUPERCHARGER", "Companion", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ContractorLevel {
    private static final /* synthetic */ ContractorLevel[] $VALUES;
    public static final ContractorLevel CHARGER;
    public static final Companion Companion;
    public static final ContractorLevel FLEDGLING;
    public static final ContractorLevel FLYER;
    private static final Set<ContractorLevel> SHOW_PROMOTION_LEVELS_IN_RIDER;
    public static final ContractorLevel SUPERCHARGER;
    private final Integer menuItemIcon;
    private final Integer roleIcon;
    private final int roleLabel;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"Lco/bird/android/model/ContractorLevel$Companion;", "", "()V", "SHOW_PROMOTION_LEVELS_IN_RIDER", "", "Lco/bird/android/model/ContractorLevel;", "getSHOW_PROMOTION_LEVELS_IN_RIDER", "()Ljava/util/Set;", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<ContractorLevel> getSHOW_PROMOTION_LEVELS_IN_RIDER() {
            return ContractorLevel.SHOW_PROMOTION_LEVELS_IN_RIDER;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ ContractorLevel[] $values() {
        return new ContractorLevel[]{FLEDGLING, FLYER, CHARGER, SUPERCHARGER};
    }

    static {
        Set<ContractorLevel> of;
        int i = C45871nl4.flyer_level_1;
        int i2 = C48193rg4.ic_menu_item_flyer;
        ContractorLevel contractorLevel = new ContractorLevel("FLEDGLING", 0, i, Integer.valueOf(i2), Integer.valueOf(C48193rg4.ic_role_flyer));
        FLEDGLING = contractorLevel;
        ContractorLevel contractorLevel2 = new ContractorLevel("FLYER", 1, i, Integer.valueOf(i2), Integer.valueOf(C48193rg4.ic_role_flyer_level_1));
        FLYER = contractorLevel2;
        CHARGER = new ContractorLevel("CHARGER", 2, C45871nl4.flyer_level_2, Integer.valueOf(C48193rg4.ic_menu_item_flyer_level_two), Integer.valueOf(C48193rg4.ic_role_flyer_level_2));
        SUPERCHARGER = new ContractorLevel("SUPERCHARGER", 3, C45871nl4.flyer_level_3, Integer.valueOf(i2), Integer.valueOf(C48193rg4.ic_role_flyer_level_3));
        $VALUES = $values();
        Companion = new Companion(null);
        of = SetsKt__SetsKt.setOf((Object[]) new ContractorLevel[]{contractorLevel, contractorLevel2});
        SHOW_PROMOTION_LEVELS_IN_RIDER = of;
    }

    private ContractorLevel(String str, int i, int i2, Integer num, Integer num2) {
        this.roleLabel = i2;
        this.menuItemIcon = num;
        this.roleIcon = num2;
    }

    public static ContractorLevel valueOf(String str) {
        return (ContractorLevel) Enum.valueOf(ContractorLevel.class, str);
    }

    public static ContractorLevel[] values() {
        return (ContractorLevel[]) $VALUES.clone();
    }

    public final Integer getMenuItemIcon() {
        return this.menuItemIcon;
    }

    public final Integer getRoleIcon() {
        return this.roleIcon;
    }

    public final int getRoleLabel() {
        return this.roleLabel;
    }

    public /* synthetic */ ContractorLevel(String str, int i, int i2, Integer num, Integer num2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i3 & 2) != 0 ? null : num, (i3 & 4) != 0 ? null : num2);
    }
}
