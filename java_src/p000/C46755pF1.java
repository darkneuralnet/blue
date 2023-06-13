package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.InventoryScanningErrorKt;
import co.bird.android.model.constant.InventoryScanningIdentifierCategory;
import co.bird.android.model.persistence.HardCountEntity;
import co.bird.android.model.persistence.HardCountScan;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J*\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"LpF1;", "LmF1;", "", "Lco/bird/android/model/persistence/HardCountScan;", "scans", "Lio/reactivex/F;", "", "LH6;", C17296a.f69688o, "Lco/bird/android/model/persistence/HardCountEntity;", "hardCounts", "Lco/bird/android/model/constant/InventoryScanningIdentifierCategory;", "category", "b", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHardCountDetailsConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountDetailsConverter.kt\nco/bird/android/feature/hardcount/details/adapters/HardCountDetailsConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1549#2:81\n1620#2,2:82\n1622#2:85\n1549#2:86\n1620#2,3:87\n1#3:84\n*S KotlinDebug\n*F\n+ 1 HardCountDetailsConverter.kt\nco/bird/android/feature/hardcount/details/adapters/HardCountDetailsConverterImpl\n*L\n31#1:81\n31#1:82,2\n31#1:85\n47#1:86\n47#1:87,3\n*E\n"})
/* renamed from: pF1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46755pF1 implements InterfaceC44976mF1 {

    /* renamed from: a */
    public final Context f103315a;

    public C46755pF1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f103315a = context;
    }

    /* renamed from: e */
    public static final List m19733e(Collection hardCounts, InventoryScanningIdentifierCategory category, C46755pF1 this$0) {
        int collectionSizeOrDefault;
        List m17735a;
        boolean z;
        String string;
        int i;
        Drawable drawable;
        Integer num;
        boolean z2;
        boolean z3;
        Intrinsics.checkNotNullParameter(hardCounts, "$hardCounts");
        Intrinsics.checkNotNullParameter(category, "$category");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Collection<HardCountEntity> collection = hardCounts;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (HardCountEntity hardCountEntity : collection) {
            if (category == InventoryScanningIdentifierCategory.UNIDENTIFIABLE) {
                z = true;
            } else {
                z = false;
            }
            int m94301c = NA0.m94301c(this$0.f103315a, C32364Df4.errorRed);
            int m94301c2 = NA0.m94301c(this$0.f103315a, C32364Df4.primaryText);
            String scanIdentifier = hardCountEntity.getScanIdentifier();
            if (z) {
                string = this$0.f103315a.getString(C45871nl4.hard_count_unidentifiable);
            } else {
                string = this$0.f103315a.getString(C45871nl4.hard_count_pending);
            }
            String str = string;
            if (z) {
                i = m94301c;
            } else {
                i = m94301c2;
            }
            if (z) {
                drawable = NA0.m94299e(this$0.f103315a, C48193rg4.ic_filled_missing);
            } else {
                drawable = null;
            }
            if (z) {
                num = Integer.valueOf(m94301c);
            } else {
                num = null;
            }
            if (category == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && (hardCountEntity.getScanErrorCode() == null || !InventoryScanningErrorKt.isValidSerialNotInDB(hardCountEntity.getScanErrorCode()))) {
                z3 = true;
            } else {
                z3 = false;
            }
            Intrinsics.checkNotNullExpressionValue(str, "if (unidentified) {\n    …ount_pending)\n          }");
            arrayList.add(new C2637G6(new C47366qH1(scanIdentifier, str, drawable, null, null, z2, num, i, z3, 24, null), C40514ej4.item_hard_count, false, 4, null));
        }
        m17735a = C47348qF1.m17735a(arrayList);
        return m17735a;
    }

    /* renamed from: f */
    public static final List m19732f(Collection scans, C46755pF1 this$0) {
        int collectionSizeOrDefault;
        List m17735a;
        Drawable drawable;
        BirdModel fromString;
        Intrinsics.checkNotNullParameter(scans, "$scans");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Collection<HardCountScan> collection = scans;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (HardCountScan hardCountScan : collection) {
            String scanIdentifier = hardCountScan.getScanIdentifier();
            String string = this$0.f103315a.getString(C45871nl4.hard_count_scanned);
            int m94301c = NA0.m94301c(this$0.f103315a, C32364Df4.primaryText);
            String model = hardCountScan.getModel();
            if (model != null && (fromString = BirdModel.Companion.fromString(model)) != null) {
                drawable = C6327PM.m90445a(fromString, this$0.f103315a);
            } else {
                drawable = null;
            }
            Intrinsics.checkNotNullExpressionValue(string, "getString(L.string.hard_count_scanned)");
            arrayList.add(new C2637G6(new C47366qH1(scanIdentifier, string, drawable, null, null, false, null, m94301c, false, 376, null), C40514ej4.item_hard_count, false, 4, null));
        }
        m17735a = C47348qF1.m17735a(arrayList);
        return m17735a;
    }

    @Override // p000.InterfaceC44976mF1
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo19737a(final Collection<HardCountScan> scans) {
        Intrinsics.checkNotNullParameter(scans, "scans");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: oF1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m19732f;
                m19732f = C46755pF1.m19732f(scans, this);
                return m19732f;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      sca…toAdapterSections()\n    }");
        return m33161E;
    }

    @Override // p000.InterfaceC44976mF1
    /* renamed from: b */
    public AbstractC23442F<List<C3023H6>> mo19736b(final Collection<HardCountEntity> hardCounts, final InventoryScanningIdentifierCategory category) {
        Intrinsics.checkNotNullParameter(hardCounts, "hardCounts");
        Intrinsics.checkNotNullParameter(category, "category");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: nF1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m19733e;
                m19733e = C46755pF1.m19733e(hardCounts, category, this);
                return m19733e;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      har…toAdapterSections()\n    }");
        return m33161E;
    }
}
