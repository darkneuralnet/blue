package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.IdToolOption;
import co.bird.android.model.persistence.BrainSwapRecord;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002J$\u0010\n\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0016\u0010\u000b\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0002R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\r¨\u0006\u0011"}, m28432d2 = {"LRR1;", "", "", "Lco/bird/android/model/IdToolOption;", "associateOptions", "dissociateOptions", "Lco/bird/android/model/persistence/BrainSwapRecord;", "records", "LH6;", C17296a.f69688o, "c", "b", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nIdToolsLandingConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsLandingConverter.kt\nco/bird/android/feature/servicecenter/idtools/landing/adapters/IdToolsLandingConverter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n1569#2,11:84\n1864#2,2:95\n1866#2:98\n1580#2:99\n1549#2:101\n1620#2,3:102\n1#3:97\n1#3:100\n*S KotlinDebug\n*F\n+ 1 IdToolsLandingConverter.kt\nco/bird/android/feature/servicecenter/idtools/landing/adapters/IdToolsLandingConverter\n*L\n35#1:84,11\n35#1:95,2\n35#1:98\n35#1:99\n66#1:101\n66#1:102,3\n35#1:97\n*E\n"})
/* renamed from: RR1 */
/* loaded from: classes3.dex */
public final class RR1 {

    /* renamed from: a */
    public final Context f32024a;

    public RR1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f32024a = context;
    }

    /* renamed from: a */
    public final List<C3023H6> m86752a(List<? extends IdToolOption> associateOptions, List<? extends IdToolOption> dissociateOptions, List<BrainSwapRecord> records) {
        List<C3023H6> listOf;
        Intrinsics.checkNotNullParameter(associateOptions, "associateOptions");
        Intrinsics.checkNotNullParameter(dissociateOptions, "dissociateOptions");
        Intrinsics.checkNotNullParameter(records, "records");
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new C3023H6[]{m86750c(associateOptions, dissociateOptions), m86751b(records)});
        return listOf;
    }

    /* renamed from: b */
    public final C3023H6 m86751b(List<BrainSwapRecord> list) {
        int collectionSizeOrDefault;
        List mutableList;
        List<BrainSwapRecord> list2 = list;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (BrainSwapRecord brainSwapRecord : list2) {
            arrayList.add(new C2637G6(brainSwapRecord, C34740Nj4.item_id_tools_pending_swap, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, new C2637G6(null, C34740Nj4.item_id_tools_pending_swap_title, false, 4, null), null, 4, null);
    }

    /* renamed from: c */
    public final C3023H6 m86750c(List<? extends IdToolOption> list, List<? extends IdToolOption> list2) {
        List listOf;
        List mutableList;
        String string;
        GS1 gs1;
        C2637G6 c2637g6;
        int i = 0;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new List[]{list, list2});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOf) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            List list3 = (List) obj;
            if (list3.isEmpty()) {
                c2637g6 = null;
            } else {
                if (i != 0) {
                    if (i == 1) {
                        string = this.f32024a.getString(C45871nl4.id_tools_dissociate);
                        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.string.id_tools_dissociate)");
                        gs1 = GS1.DISSOCIATE;
                    } else {
                        throw new UnsupportedOperationException("Unknown option for ID Tools idx: " + i);
                    }
                } else {
                    string = this.f32024a.getString(C45871nl4.id_tools_replace);
                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.string.id_tools_replace)");
                    gs1 = GS1.ASSOCIATE;
                }
                c2637g6 = new C2637G6(new FS1(string, list3, gs1), C34740Nj4.item_id_tools_landing_option, false, 4, null);
            }
            if (c2637g6 != null) {
                arrayList.add(c2637g6);
            }
            i = i2;
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, null, null, 6, null);
    }
}
