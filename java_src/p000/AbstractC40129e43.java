package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.NestMarker;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'J\b\u0010\u0007\u001a\u00020\u0006H'J)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\b\"\u00020\u0004H%¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\u00020\r2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\b\"\u00020\u0004H%¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H%J\u0016\u0010\u0014\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003H%J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H%J\u0016\u0010\u0016\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H%J\u0016\u0010\u0017\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0017J\u0016\u0010\u0018\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0003H\u0017¨\u0006\u001b"}, m28432d2 = {"Le43;", "", "Lio/reactivex/k;", "", "Lco/bird/android/model/persistence/NestMarker;", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/c;", C17296a.f69688o, "", "nestMarkers", "", "c", "([Lco/bird/android/model/persistence/NestMarker;)Ljava/util/List;", "", "i", "([Lco/bird/android/model/persistence/NestMarker;)V", "rowids", "", "b", "retainedIds", "g", "e", "f", "j", "h", "<init>", "()V", "co.bird.android.lib.persistence.nestmarker.api"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nNestMarkerDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestMarkerDao.kt\nco/bird/android/persistence/nestmarker/api/NestMarkerDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,77:1\n1855#2:78\n819#2:81\n847#2,2:82\n1856#2:86\n819#2:87\n847#2,2:88\n1855#2,2:90\n37#3,2:79\n37#3,2:84\n*S KotlinDebug\n*F\n+ 1 NestMarkerDao.kt\nco/bird/android/persistence/nestmarker/api/NestMarkerDao\n*L\n56#1:78\n59#1:81\n59#1:82,2\n56#1:86\n70#1:87\n70#1:88,2\n73#1:90,2\n57#1:79,2\n60#1:84,2\n*E\n"})
/* renamed from: e43  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC40129e43 {
    /* renamed from: a */
    public abstract AbstractC23461c mo42208a();

    /* renamed from: b */
    public abstract List<String> mo42207b(List<Long> list);

    /* renamed from: c */
    public abstract List<Long> mo42206c(NestMarker... nestMarkerArr);

    /* renamed from: d */
    public abstract AbstractC24490k<List<NestMarker>> mo42205d();

    /* renamed from: e */
    public abstract List<NestMarker> mo42204e();

    /* renamed from: f */
    public abstract void mo42203f(List<NestMarker> list);

    /* renamed from: g */
    public abstract void mo42202g(List<String> list);

    /* renamed from: h */
    public void mo42201h(List<String> retainedIds) {
        List<List<NestMarker>> chunked;
        Intrinsics.checkNotNullParameter(retainedIds, "retainedIds");
        if (retainedIds.size() < 999) {
            mo42202g(retainedIds);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : mo42204e()) {
            if (!retainedIds.contains(((NestMarker) obj).getId())) {
                arrayList.add(obj);
            }
        }
        chunked = CollectionsKt___CollectionsKt.chunked(arrayList, 999);
        for (List<NestMarker> list : chunked) {
            mo42203f(list);
        }
    }

    /* renamed from: i */
    public abstract void mo42200i(NestMarker... nestMarkerArr);

    /* renamed from: j */
    public void mo42199j(List<NestMarker> nestMarkers) {
        List list;
        List<List> chunked;
        Intrinsics.checkNotNullParameter(nestMarkers, "nestMarkers");
        list = CollectionsKt___CollectionsKt.toList(nestMarkers);
        chunked = CollectionsKt___CollectionsKt.chunked(list, 999);
        for (List list2 : chunked) {
            NestMarker[] nestMarkerArr = (NestMarker[]) list2.toArray(new NestMarker[0]);
            List<String> mo42207b = mo42207b(mo42206c((NestMarker[]) Arrays.copyOf(nestMarkerArr, nestMarkerArr.length)));
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (!mo42207b.contains(((NestMarker) obj).getId())) {
                    arrayList.add(obj);
                }
            }
            NestMarker[] nestMarkerArr2 = (NestMarker[]) arrayList.toArray(new NestMarker[0]);
            mo42200i((NestMarker[]) Arrays.copyOf(nestMarkerArr2, nestMarkerArr2.length));
        }
    }
}
