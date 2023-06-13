package co.bird.android.model.extension;

import co.bird.android.model.IssueStatus;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt__SetsKt;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\f\u0010\u0004\u001a\u00020\u0005*\u0004\u0018\u00010\u0002\u001a\f\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0002\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\b\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"FAILED_STATUSES", "", "Lco/bird/android/model/IssueStatus;", "PASSED_STATUSES", "isFailedStatus", "", "isPassedStatus", "toBoolean", "(Lco/bird/android/model/IssueStatus;)Ljava/lang/Boolean;", "model_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class IssueStatus_Kt {
    private static final Set<IssueStatus> FAILED_STATUSES;
    private static final Set<IssueStatus> PASSED_STATUSES;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IssueStatus.values().length];
            try {
                iArr[IssueStatus.RESOLVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IssueStatus.ABANDONED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IssueStatus.DISPUTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IssueStatus.OPEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IssueStatus.FAILED_QC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Set<IssueStatus> of;
        Set<IssueStatus> of2;
        of = SetsKt__SetsKt.setOf((Object[]) new IssueStatus[]{IssueStatus.RESOLVED, IssueStatus.DISPUTED});
        PASSED_STATUSES = of;
        of2 = SetsKt__SetsKt.setOf((Object[]) new IssueStatus[]{IssueStatus.OPEN, IssueStatus.FAILED_QC});
        FAILED_STATUSES = of2;
    }

    public static final boolean isFailedStatus(IssueStatus issueStatus) {
        boolean contains;
        contains = CollectionsKt___CollectionsKt.contains(FAILED_STATUSES, issueStatus);
        return contains;
    }

    public static final boolean isPassedStatus(IssueStatus issueStatus) {
        boolean contains;
        contains = CollectionsKt___CollectionsKt.contains(PASSED_STATUSES, issueStatus);
        return contains;
    }

    public static final Boolean toBoolean(IssueStatus issueStatus) {
        int i;
        if (issueStatus == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[issueStatus.ordinal()];
        }
        if (i != 1 && i != 2 && i != 3) {
            if (i != 4 && i != 5) {
                return null;
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
