package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.IssueType;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u001e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\u000e"}, m28432d2 = {"LLF6;", "LJF6;", "", "Lco/bird/android/model/IssueType;", "issues", "Lio/reactivex/F;", "LH6;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, DateTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "workorders_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWorkOrderIssuesUncheckConfirmationConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkOrderIssuesUncheckConfirmationConverter.kt\nco/bird/android/feature/workorders/issues/uncheckconfirmation/WorkOrderIssuesUncheckConfirmationConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1603#2,9:35\n1855#2:44\n1856#2:46\n1612#2:47\n1549#2:48\n1620#2,3:49\n1549#2:52\n1620#2,3:53\n1#3:45\n*S KotlinDebug\n*F\n+ 1 WorkOrderIssuesUncheckConfirmationConverter.kt\nco/bird/android/feature/workorders/issues/uncheckconfirmation/WorkOrderIssuesUncheckConfirmationConverterImpl\n*L\n28#1:35,9\n28#1:44\n28#1:46\n28#1:47\n28#1:48\n28#1:49,3\n28#1:52\n28#1:53,3\n28#1:45\n*E\n"})
/* renamed from: LF6 */
/* loaded from: classes3.dex */
public final class LF6 implements JF6 {

    /* renamed from: a */
    public final Context f20973a;

    public LF6(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f20973a = context;
    }

    /* renamed from: c */
    public static final List m97501c(LF6 this$0, List issues) {
        List mutableListOf;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(issues, "$issues");
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(this$0.m97500d(this$0.f20973a, issues));
        return mutableListOf;
    }

    @Override // p000.JF6
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo97503a(final List<IssueType> issues) {
        Intrinsics.checkNotNullParameter(issues, "issues");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: KF6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m97501c;
                m97501c = LF6.m97501c(LF6.this, issues);
                return m97501c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      mut…n(context, issues))\n    }");
        return m33161E;
    }

    /* renamed from: d */
    public final C3023H6 m97500d(Context context, List<IssueType> list) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        List mutableList;
        ArrayList arrayList = new ArrayList();
        for (IssueType issueType : list) {
            String display = issueType.getDisplay();
            if (display != null) {
                arrayList.add(display);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList<String> arrayList2 = new ArrayList(collectionSizeOrDefault);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add("- " + ((String) it.next()));
        }
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(collectionSizeOrDefault2);
        for (String str : arrayList2) {
            arrayList3.add(new C2637G6(str, C37080Xj4.item_issue_text, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList3);
        return new C3023H6(mutableList, new C2637G6(context.getString(C45871nl4.work_order_issue_issues_unchecked_confirmation_title), C37080Xj4.issue_uncheck_confirmation_title, false, 4, null), new C2637G6(context.getString(C45871nl4.work_order_issue_issues_unchecked_confirmation_subtitle), C37080Xj4.issue_uncheck_confirmation_subtitle, false, 4, null));
    }
}
