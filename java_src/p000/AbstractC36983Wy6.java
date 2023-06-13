package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.WarehouseMarker;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'J\b\u0010\u0007\u001a\u00020\u0006H'J)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\b\"\u00020\u0004H%¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\u00020\r2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\b\"\u00020\u0004H%¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H%J\u0016\u0010\u0014\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003H%J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H%J\u0016\u0010\u0016\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H%J\u0016\u0010\u0017\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0017J\u0016\u0010\u0018\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003H\u0017¨\u0006\u001b"}, m28432d2 = {"LWy6;", "", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/WarehouseMarker;", "j", "Lio/reactivex/c;", C17296a.f69688o, "", "warehouseMarkers", "", "c", "([Lco/bird/android/model/persistence/WarehouseMarker;)Ljava/util/List;", "", "h", "([Lco/bird/android/model/persistence/WarehouseMarker;)V", "rowids", "", "b", "retainedIds", "f", DateTokenConverter.CONVERTER_KEY, "e", "i", "g", "<init>", "()V", "co.bird.android.lib.persistence.warehouse-marker.api"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWarehouseMarkerDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WarehouseMarkerDao.kt\nco/bird/android/persistence/warehousemarker/api/WarehouseMarkerDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,66:1\n1855#2:67\n819#2:70\n847#2,2:71\n1856#2:75\n819#2:76\n847#2,2:77\n1855#2,2:79\n37#3,2:68\n37#3,2:73\n*S KotlinDebug\n*F\n+ 1 WarehouseMarkerDao.kt\nco/bird/android/persistence/warehousemarker/api/WarehouseMarkerDao\n*L\n45#1:67\n48#1:70\n48#1:71,2\n45#1:75\n59#1:76\n59#1:77,2\n62#1:79,2\n46#1:68,2\n49#1:73,2\n*E\n"})
/* renamed from: Wy6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC36983Wy6 {
    /* renamed from: a */
    public abstract AbstractC23461c mo75955a();

    /* renamed from: b */
    public abstract List<String> mo75954b(List<Long> list);

    /* renamed from: c */
    public abstract List<Long> mo75953c(WarehouseMarker... warehouseMarkerArr);

    /* renamed from: d */
    public abstract List<WarehouseMarker> mo75952d();

    /* renamed from: e */
    public abstract void mo75951e(List<WarehouseMarker> list);

    /* renamed from: f */
    public abstract void mo75950f(List<String> list);

    /* renamed from: g */
    public void mo75949g(List<String> retainedIds) {
        List<List<WarehouseMarker>> chunked;
        Intrinsics.checkNotNullParameter(retainedIds, "retainedIds");
        if (retainedIds.size() < 999) {
            mo75950f(retainedIds);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : mo75952d()) {
            if (!retainedIds.contains(((WarehouseMarker) obj).getId())) {
                arrayList.add(obj);
            }
        }
        chunked = CollectionsKt___CollectionsKt.chunked(arrayList, 999);
        for (List<WarehouseMarker> list : chunked) {
            mo75951e(list);
        }
    }

    /* renamed from: h */
    public abstract void mo75948h(WarehouseMarker... warehouseMarkerArr);

    /* renamed from: i */
    public void mo75947i(List<WarehouseMarker> warehouseMarkers) {
        List list;
        List<List> chunked;
        Intrinsics.checkNotNullParameter(warehouseMarkers, "warehouseMarkers");
        list = CollectionsKt___CollectionsKt.toList(warehouseMarkers);
        chunked = CollectionsKt___CollectionsKt.chunked(list, 999);
        for (List list2 : chunked) {
            WarehouseMarker[] warehouseMarkerArr = (WarehouseMarker[]) list2.toArray(new WarehouseMarker[0]);
            List<String> mo75954b = mo75954b(mo75953c((WarehouseMarker[]) Arrays.copyOf(warehouseMarkerArr, warehouseMarkerArr.length)));
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (!mo75954b.contains(((WarehouseMarker) obj).getId())) {
                    arrayList.add(obj);
                }
            }
            WarehouseMarker[] warehouseMarkerArr2 = (WarehouseMarker[]) arrayList.toArray(new WarehouseMarker[0]);
            mo75948h((WarehouseMarker[]) Arrays.copyOf(warehouseMarkerArr2, warehouseMarkerArr2.length));
        }
    }

    /* renamed from: j */
    public abstract Observable<List<WarehouseMarker>> mo75946j();
}
