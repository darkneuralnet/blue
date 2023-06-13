package co.bird.android.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0002¨\u0006\u0006"}, m28432d2 = {"getDrawerRoleIcon", "", "Lco/bird/android/model/Contractor;", "getDrawerRoleString", "isFlyerLevelTwoOrAbove", "", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ContractorKt {
    public static final int getDrawerRoleIcon(Contractor contractor) {
        Integer roleIcon;
        Intrinsics.checkNotNullParameter(contractor, "<this>");
        ContractorLevel contractorLevel = contractor.getContractorLevel();
        if (contractorLevel != null && (roleIcon = contractorLevel.getRoleIcon()) != null) {
            return roleIcon.intValue();
        }
        return C48193rg4.ic_role_flyer;
    }

    public static final int getDrawerRoleString(Contractor contractor) {
        Intrinsics.checkNotNullParameter(contractor, "<this>");
        ContractorLevel contractorLevel = contractor.getContractorLevel();
        if (contractorLevel != null) {
            return contractorLevel.getRoleLabel();
        }
        return C45871nl4.drawer_ride_switch_flyer;
    }

    public static final boolean isFlyerLevelTwoOrAbove(Contractor contractor) {
        Intrinsics.checkNotNullParameter(contractor, "<this>");
        if (contractor.getContractorLevel() != null && contractor.getContractorLevel() != ContractorLevel.CHARGER && contractor.getContractorLevel() != ContractorLevel.SUPERCHARGER) {
            return false;
        }
        return true;
    }
}
