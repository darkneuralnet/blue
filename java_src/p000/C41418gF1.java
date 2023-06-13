package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.constant.InventoryScanningIdentifierCategory;
import co.bird.android.model.persistence.HardCountScan;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018JH\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0016J\u0016\u0010\r\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0002J\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\n\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0002J\n\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0002R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015¨\u0006\u001a"}, m28432d2 = {"LgF1;", "LeF1;", "", "Lco/bird/android/model/persistence/HardCountScan;", "birds", "", "unidentifiedVehicles", "pendingUploadVehicles", "lastSuccessfulVehicle", "Lio/reactivex/F;", "", "LH6;", C17296a.f69688o, "f", "h", "e", "lastScan", DateTokenConverter.CONVERTER_KEY, "g", "i", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "b", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHardCountConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardCountConverter.kt\nco/bird/android/feature/hardcount/adapters/HardCountConverterImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n1477#2:145\n1502#2,3:146\n1505#2,3:156\n361#3,7:149\n515#3:159\n500#3,6:160\n125#4:166\n152#4,3:167\n1#5:170\n*S KotlinDebug\n*F\n+ 1 HardCountConverter.kt\nco/bird/android/feature/hardcount/adapters/HardCountConverterImpl\n*L\n60#1:145\n60#1:146,3\n60#1:156,3\n60#1:149,7\n61#1:159\n61#1:160,6\n62#1:166\n62#1:167,3\n*E\n"})
/* renamed from: gF1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C41418gF1 implements InterfaceC40232eF1 {

    /* renamed from: b */
    public static final C20790a f81843b = new C20790a(null);

    /* renamed from: c */
    public static final SimpleDateFormat f81844c = new SimpleDateFormat("MMM dd, HH:mm a", Locale.getDefault());

    /* renamed from: a */
    public final Context f81845a;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m28432d2 = {"LgF1$a;", "", "Ljava/text/SimpleDateFormat;", "DATE_FORMATTER", "Ljava/text/SimpleDateFormat;", "<init>", "()V", "co.bird.android.feature.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: gF1$a */
    /* loaded from: classes3.dex */
    public static final class C20790a {
        public /* synthetic */ C20790a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C20790a() {
        }
    }

    public C41418gF1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f81845a = context;
    }

    /* renamed from: c */
    public static final List m39795c(Set unidentifiedVehicles, C41418gF1 this$0, Set birds, HardCountScan hardCountScan, Set pendingUploadVehicles) {
        C3023H6 c3023h6;
        C3023H6 c3023h62;
        List listOfNotNull;
        Intrinsics.checkNotNullParameter(unidentifiedVehicles, "$unidentifiedVehicles");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(birds, "$birds");
        Intrinsics.checkNotNullParameter(pendingUploadVehicles, "$pendingUploadVehicles");
        C3023H6 c3023h63 = null;
        if (!unidentifiedVehicles.isEmpty()) {
            c3023h6 = this$0.m39791g();
        } else {
            c3023h6 = null;
        }
        if (!birds.isEmpty()) {
            c3023h62 = this$0.m39789i();
        } else {
            c3023h62 = null;
        }
        C3023H6[] c3023h6Arr = new C3023H6[6];
        if (hardCountScan != null) {
            c3023h63 = this$0.m39794d(hardCountScan);
        }
        c3023h6Arr[0] = c3023h63;
        c3023h6Arr[1] = c3023h6;
        c3023h6Arr[2] = this$0.m39790h(unidentifiedVehicles);
        c3023h6Arr[3] = c3023h62;
        c3023h6Arr[4] = this$0.m39792f(birds);
        c3023h6Arr[5] = this$0.m39793e(pendingUploadVehicles);
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) c3023h6Arr);
        return listOfNotNull;
    }

    @Override // p000.InterfaceC40232eF1
    /* renamed from: a */
    public AbstractC23442F<List<C3023H6>> mo39797a(final Set<HardCountScan> birds, final Set<String> unidentifiedVehicles, final Set<String> pendingUploadVehicles, final HardCountScan hardCountScan) {
        Intrinsics.checkNotNullParameter(birds, "birds");
        Intrinsics.checkNotNullParameter(unidentifiedVehicles, "unidentifiedVehicles");
        Intrinsics.checkNotNullParameter(pendingUploadVehicles, "pendingUploadVehicles");
        AbstractC23442F<List<C3023H6>> m33161E = AbstractC23442F.m33161E(new Callable() { // from class: fF1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List m39795c;
                m39795c = C41418gF1.m39795c(unidentifiedVehicles, this, birds, hardCountScan, pendingUploadVehicles);
                return m39795c;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33161E, "fromCallable {\n      val…adVehicles)\n      )\n    }");
        return m33161E;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.graphics.drawable.Drawable] */
    /* renamed from: d */
    public final C3023H6 m39794d(HardCountScan hardCountScan) {
        int i;
        List mutableListOf;
        BirdModel fromString = BirdModel.Companion.fromString(hardCountScan.getModel());
        Object obj = null;
        if (hardCountScan.getScanIdentifier() == null) {
            return null;
        }
        String scanIdentifier = hardCountScan.getScanIdentifier();
        if (scanIdentifier != null) {
            String string = this.f81845a.getResources().getString(C45871nl4.hard_count_last_successful_uploads_format, f81844c.format(hardCountScan.getScannedAt().toDate()));
            int m94301c = NA0.m94301c(this.f81845a, C32364Df4.primaryText);
            if (fromString != null) {
                obj = C6327PM.m90445a(fromString, this.f81845a);
            }
            Intrinsics.checkNotNullExpressionValue(string, "getString(L.string.hard_…uploads_format, scanTime)");
            i = 1;
            obj = new C47366qH1(scanIdentifier, string, obj, null, null, false, null, m94301c, false, 376, null);
        } else {
            i = 1;
        }
        C2637G6[] c2637g6Arr = new C2637G6[i];
        c2637g6Arr[0] = new C2637G6(obj, C40514ej4.item_last_successful_hard_count, false, 4, null);
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(c2637g6Arr);
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: e */
    public final C3023H6 m39793e(Set<String> set) {
        List mutableListOf;
        if (set.isEmpty()) {
            return null;
        }
        String string = this.f81845a.getString(C45871nl4.hard_count_pending_uploads);
        String string2 = this.f81845a.getResources().getString(C45871nl4.hard_count_pending_uploads_format, Integer.valueOf(set.size()));
        int m94301c = NA0.m94301c(this.f81845a, C32364Df4.primaryText);
        Drawable m94299e = NA0.m94299e(this.f81845a, C48193rg4.ic_signal_wifi_off);
        InventoryScanningIdentifierCategory inventoryScanningIdentifierCategory = InventoryScanningIdentifierCategory.PENDING;
        Intrinsics.checkNotNullExpressionValue(string, "getString(L.string.hard_count_pending_uploads)");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(L.string.hard_…ndingUploadVehicles.size)");
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new C47366qH1(string, string2, m94299e, set, inventoryScanningIdentifierCategory, false, null, m94301c, false, 352, null), C40514ej4.item_hard_count_pending_upload, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: f */
    public final C3023H6 m39792f(Set<HardCountScan> set) {
        List mutableList;
        boolean z;
        String str;
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            HardCountScan hardCountScan = (HardCountScan) obj;
            String modelVersionTitle = hardCountScan.getModelVersionTitle();
            if (modelVersionTitle == null) {
                modelVersionTitle = "";
            }
            Pair pair = new Pair(modelVersionTitle, hardCountScan.getModel());
            Object obj2 = linkedHashMap.get(pair);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(pair, obj2);
            }
            ((List) obj2).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (true ^ ((List) entry.getValue()).isEmpty()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            Pair pair2 = (Pair) entry2.getKey();
            List list = (List) entry2.getValue();
            String str3 = (String) pair2.component1();
            BirdModel fromString = BirdModel.Companion.fromString((String) pair2.component2());
            if (str3.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            Drawable drawable = null;
            if (z) {
                if (fromString != null) {
                    str = fromString.getDescription();
                } else {
                    str = null;
                }
            } else {
                str = str3;
            }
            if (str == null) {
                str2 = str3;
            } else {
                str2 = str;
            }
            String string = this.f81845a.getResources().getString(C45871nl4.hard_count_model_scanned, Integer.valueOf(list.size()));
            int m94301c = NA0.m94301c(this.f81845a, C32364Df4.primaryText);
            if (fromString != null) {
                drawable = C6327PM.m90445a(fromString, this.f81845a);
            }
            Intrinsics.checkNotNullExpressionValue(string, "getString(L.string.hard_…anned, birdsByModel.size)");
            arrayList.add(new C2637G6(new C47366qH1(str2, string, drawable, list, null, false, null, m94301c, false, 368, null), C40514ej4.item_hard_count, false, 4, null));
        }
        mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
        return new C3023H6(mutableList, null, null, 6, null);
    }

    /* renamed from: g */
    public final C3023H6 m39791g() {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(this.f81845a.getString(C45871nl4.hard_count_failed_scans), C40514ej4.item_vehicle_models_header, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: h */
    public final C3023H6 m39790h(Set<String> set) {
        List mutableListOf;
        if (set.isEmpty()) {
            return null;
        }
        String string = this.f81845a.getString(C45871nl4.hard_count_unidentifiable_scans);
        String string2 = this.f81845a.getResources().getString(C45871nl4.hard_count_unidentifiable_scan_format, Integer.valueOf(set.size()));
        Drawable m94299e = NA0.m94299e(this.f81845a, C48193rg4.ic_filled_missing);
        Context context = this.f81845a;
        int i = C32364Df4.errorRed;
        int m94301c = NA0.m94301c(context, i);
        InventoryScanningIdentifierCategory inventoryScanningIdentifierCategory = InventoryScanningIdentifierCategory.UNIDENTIFIABLE;
        int m94301c2 = NA0.m94301c(this.f81845a, i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(L.string.hard_…unt_unidentifiable_scans)");
        Intrinsics.checkNotNullExpressionValue(string2, "getString(L.string.hard_…nidentifiedVehicles.size)");
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(new C47366qH1(string, string2, m94299e, set, inventoryScanningIdentifierCategory, false, Integer.valueOf(m94301c2), m94301c, false, 288, null), C40514ej4.item_hard_count_unidentified, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }

    /* renamed from: i */
    public final C3023H6 m39789i() {
        List mutableListOf;
        mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new C2637G6(this.f81845a.getString(C45871nl4.hard_count_vehicle_models_header), C40514ej4.item_vehicle_models_header, false, 4, null));
        return new C3023H6(mutableListOf, null, null, 6, null);
    }
}
