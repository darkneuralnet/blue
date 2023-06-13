package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.QCInspection;
import co.bird.android.model.constant.QCStatus;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.schedulers.C24542a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0007B\u0011\b\u0007\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\b\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\u0010"}, m28432d2 = {"Lls2;", "Ljs2;", "", "Lco/bird/android/model/QCInspection;", "qcInspections", "Lio/reactivex/F;", "LH6;", C17296a.f69688o, "e", DateTokenConverter.CONVERTER_KEY, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "b", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nListQualityControlConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListQualityControlConverter.kt\nco/bird/android/qualitycontrol/list/adapters/ListQualityControlConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n1549#2:63\n1620#2,3:64\n1726#2,3:67\n*S KotlinDebug\n*F\n+ 1 ListQualityControlConverter.kt\nco/bird/android/qualitycontrol/list/adapters/ListQualityControlConverterImpl\n*L\n38#1:63\n38#1:64,3\n47#1:67,3\n*E\n"})
/* renamed from: ls2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44753ls2 implements InterfaceC43567js2 {

    /* renamed from: b */
    public static final C25809a f96842b = new C25809a(null);

    /* renamed from: c */
    public static final List<QCStatus> f96843c;

    /* renamed from: a */
    public final Context f96844a;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, m28432d2 = {"Lls2$a;", "", "", "Lco/bird/android/model/constant/QCStatus;", "COMPLETED_STATUSES", "Ljava/util/List;", "<init>", "()V", "qualitycontrol_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: ls2$a */
    /* loaded from: classes4.dex */
    public static final class C25809a {
        public /* synthetic */ C25809a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C25809a() {
        }
    }

    static {
        List<QCStatus> listOf;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new QCStatus[]{QCStatus.PASSED, QCStatus.FAILED});
        f96843c = listOf;
    }

    public C44753ls2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f96844a = context;
    }

    /* renamed from: c */
    public static final List m26724c(C44753ls2 this$0, List qcInspections) {
        List listOf;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(qcInspections, "$qcInspections");
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new C3023H6[]{this$0.m26722e(qcInspections), this$0.m26723d(qcInspections)});
        return listOf;
    }

    @Override // p000.InterfaceC43567js2
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo26726a(final List<QCInspection> qcInspections) {
        Intrinsics.checkNotNullParameter(qcInspections, "qcInspections");
        AbstractC23442F<List<C3023H6>> m33142Y = AbstractC23442F.m33161E(new Callable() { // from class: ks2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m26724c;
                m26724c = C44753ls2.m26724c(C44753ls2.this, qcInspections);
                return m26724c;
            }
        }).m33142Y(C24542a.m31934a());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "fromCallable {\n      lis…Schedulers.computation())");
        return m33142Y;
    }

    /* renamed from: d */
    public final C3023H6 m26723d(List<QCInspection> list) {
        List<QCInspection> list2 = list;
        boolean z = true;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (!f96843c.contains(((QCInspection) it.next()).getStatus())) {
                    z = false;
                    break;
                }
            }
        }
        return new C3023H6(new ArrayList(), new C2637G6(TuplesKt.m28425to(this.f96844a.getString(C45871nl4.quality_control_complete), Boolean.valueOf(z)), C45268mk4.item_button_matte_black, false, 4, null), new C2637G6(this.f96844a.getString(C45871nl4.quality_control_add_issues), C45268mk4.item_button_secondary, false, 4, null));
    }

    /* renamed from: e */
    public final C3023H6 m26722e(List<QCInspection> list) {
        int collectionSizeOrDefault;
        List mutableList;
        List<QCInspection> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (QCInspection qCInspection : list2) {
            arrayList.add(new C2637G6(qCInspection, C43489jk4.item_inspection_list_card, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, null, null, 6, null);
    }
}
