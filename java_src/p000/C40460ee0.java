package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.IssueStatus;
import co.bird.android.model.constant.IssueStatusReason;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00052\u00020\u0001:\u0001\u0007B\u0011\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, m28432d2 = {"Lee0;", "", "Lio/reactivex/F;", "", "LH6;", "b", "Landroid/content/Context;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCantRepairConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CantRepairConverter.kt\nco/bird/android/feature/repair/v2/subtypes/dialogs/cantrepair/adapters/CantRepairConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n1549#2:67\n1620#2,3:68\n1#3:71\n*S KotlinDebug\n*F\n+ 1 CantRepairConverter.kt\nco/bird/android/feature/repair/v2/subtypes/dialogs/cantrepair/adapters/CantRepairConverter\n*L\n29#1:67\n29#1:68,3\n*E\n"})
/* renamed from: ee0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40460ee0 {

    /* renamed from: b */
    public static final C20081a f78641b = new C20081a(null);

    /* renamed from: c */
    public static final List<Pair<IssueStatus, IssueStatusReason>> f78642c;

    /* renamed from: a */
    public final Context f78643a;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR(\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"Lee0$a;", "", "", "Lkotlin/Pair;", "Lco/bird/android/model/IssueStatus;", "Lco/bird/android/model/constant/IssueStatusReason;", "STATUSES_REASONS", "Ljava/util/List;", "<init>", "()V", "repair_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ee0$a */
    /* loaded from: classes3.dex */
    public static final class C20081a {
        public /* synthetic */ C20081a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C20081a() {
        }
    }

    static {
        List<Pair<IssueStatus, IssueStatusReason>> listOf;
        IssueStatus issueStatus = IssueStatus.CANT_REPAIR;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m28425to(issueStatus, IssueStatusReason.PROCESS_OR_KNOWLEDGE), TuplesKt.m28425to(issueStatus, IssueStatusReason.TOOLS_AND_PARTS), TuplesKt.m28425to(IssueStatus.OPEN, null)});
        f78642c = listOf;
    }

    public C40460ee0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f78643a = context;
    }

    /* renamed from: c */
    public static final List m42670c(C40460ee0 this$0) {
        int collectionSizeOrDefault;
        List mutableList;
        List listOf;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<Pair<IssueStatus, IssueStatusReason>> list = f78642c;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            IssueStatus issueStatus = (IssueStatus) pair.component1();
            IssueStatusReason issueStatusReason = (IssueStatusReason) pair.component2();
            IssueStatus issueStatus2 = IssueStatus.CANT_REPAIR;
            if (issueStatus == issueStatus2 && issueStatusReason == IssueStatusReason.PROCESS_OR_KNOWLEDGE) {
                i = C48193rg4.ic_question_circle;
                i2 = C45871nl4.repair_cant_repair_reason_process_knowledge;
            } else if (issueStatus == issueStatus2 && issueStatusReason == IssueStatusReason.TOOLS_AND_PARTS) {
                i = C48193rg4.ic_handlebars;
                i2 = C45871nl4.repair_cant_repair_reason_spare_parts;
            } else if (issueStatus == IssueStatus.OPEN) {
                i = C48193rg4.ic_wrench;
                i2 = C45871nl4.repair_cant_repair_reason_repair;
            } else {
                i = C48193rg4.ic_wrench;
                i2 = C45871nl4.repair_cant_repair_reason_repair;
            }
            Drawable m94299e = NA0.m94299e(this$0.f78643a, i);
            Intrinsics.checkNotNull(m94299e);
            String string = this$0.f78643a.getString(i2);
            Intrinsics.checkNotNullExpressionValue(string, "getString(descriptionRes)");
            arrayList.add(new C2637G6(new C49909ua2(issueStatus, issueStatusReason, string, m94299e), C32634Ej4.item_cant_repair_option, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        listOf = CollectionsKt__CollectionsJVMKt.listOf(new C3023H6(mutableList, null, null, 6, null));
        return listOf;
    }

    /* renamed from: b */
    public final AbstractC23442F<List<C3023H6>> m42671b() {
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: de0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m42670c;
                m42670c = C40460ee0.m42670c(C40460ee0.this);
                return m42670c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      STA…erSection(items)) }\n    }");
        return m33161E;
    }
}
