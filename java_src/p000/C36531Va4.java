package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.QCAutoCheck;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0002J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0016\u0010\n\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u0010"}, m28432d2 = {"LVa4;", "LTa4;", "", "Lco/bird/android/model/QCAutoCheck;", "qcAutoChecks", "Lio/reactivex/F;", "LH6;", C17296a.f69688o, "e", "f", DateTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nQCAutoChecksConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QCAutoChecksConverter.kt\nco/bird/android/qualitycontrol/autocheck/adapters/QCAutoChecksConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,57:1\n1726#2,3:58\n1549#2:61\n1620#2,3:62\n*S KotlinDebug\n*F\n+ 1 QCAutoChecksConverter.kt\nco/bird/android/qualitycontrol/autocheck/adapters/QCAutoChecksConverterImpl\n*L\n37#1:58,3\n51#1:61\n51#1:62,3\n*E\n"})
/* renamed from: Va4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36531Va4 implements InterfaceC36063Ta4 {

    /* renamed from: a */
    public final Context f39258a;

    public C36531Va4(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f39258a = context;
    }

    /* renamed from: c */
    public static final List m79733c(C36531Va4 this$0, List qcAutoChecks) {
        List listOf;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(qcAutoChecks, "$qcAutoChecks");
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new C3023H6[]{this$0.m79731e(), this$0.m79730f(qcAutoChecks), this$0.m79732d(qcAutoChecks)});
        return listOf;
    }

    @Override // p000.InterfaceC36063Ta4
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo79735a(final List<QCAutoCheck> qcAutoChecks) {
        Intrinsics.checkNotNullParameter(qcAutoChecks, "qcAutoChecks");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: Ua4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m79733c;
                m79733c = C36531Va4.m79733c(C36531Va4.this, qcAutoChecks);
                return m79733c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      lis…AutoChecks)\n      )\n    }");
        return m33161E;
    }

    /* renamed from: d */
    public final C3023H6 m79732d(List<QCAutoCheck> list) {
        int collectionSizeOrDefault;
        List mutableList;
        List<QCAutoCheck> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (QCAutoCheck qCAutoCheck : list2) {
            arrayList.add(new C2637G6(qCAutoCheck, C43489jk4.item_auto_check, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, null, null, 6, null);
    }

    /* renamed from: e */
    public final C3023H6 m79731e() {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(null, C43489jk4.item_auto_checks_complete, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: f */
    public final C3023H6 m79730f(List<QCAutoCheck> list) {
        boolean z;
        String string;
        List mutableListOf;
        List<QCAutoCheck> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (QCAutoCheck qCAutoCheck : list2) {
                if (!qCAutoCheck.getPassed()) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            string = this.f39258a.getString(C45871nl4.quality_control_auto_checks_instruction_passed);
        } else {
            string = this.f39258a.getString(C45871nl4.quality_control_auto_checks_instruction_failed);
        }
        String str = string;
        Intrinsics.checkNotNullExpressionValue(str, "if (qcAutoCheckPassed) {…instruction_failed)\n    }");
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(str, C43489jk4.item_auto_checks_instructions, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }
}
