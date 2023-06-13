package p000;

import co.bird.android.model.Issue;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001a\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0005"}, m28432d2 = {"", "Lco/bird/android/model/Issue;", "", "issueTypeId", C17296a.f69688o, "repair_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRepairIssueSupertypesPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairIssueSupertypesPresenter.kt\nco/bird/android/feature/repair/v2/supertypes/RepairIssueSupertypesPresenterKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,326:1\n223#2:327\n1747#2,3:328\n224#2:331\n*S KotlinDebug\n*F\n+ 1 RepairIssueSupertypesPresenter.kt\nco/bird/android/feature/repair/v2/supertypes/RepairIssueSupertypesPresenterKt\n*L\n322#1:327\n323#1:328,3\n322#1:331\n*E\n"})
/* renamed from: AA4 */
/* loaded from: classes3.dex */
public final class AA4 {
    /* renamed from: a */
    public static final Issue m116039a(List<Issue> list, String str) {
        boolean z;
        for (Issue issue : list) {
            boolean z2 = true;
            if (!Intrinsics.areEqual(issue.getIssueTypeId(), str)) {
                List<Issue> subtypes = issue.getSubtypes();
                if (!(subtypes instanceof Collection) || !subtypes.isEmpty()) {
                    for (Issue issue2 : subtypes) {
                        if (Intrinsics.areEqual(issue2.getIssueTypeId(), str)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (z) {
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
            }
            if (z2) {
                return issue;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
