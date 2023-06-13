package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.BirdMapMarker;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24490k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J$\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H'J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH'J\b\u0010\u000f\u001a\u00020\rH'J)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\b2\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0010\"\u00020\tH%¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0010\"\u00020\tH%¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\bH%J\u0016\u0010\u001b\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\bH%J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\bH%J\u0016\u0010\u001d\u001a\u00020\u00152\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bH%J\u0016\u0010\u001e\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0017J#\u0010\u001f\u001a\u00020\u00152\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0010\"\u00020\tH\u0017¢\u0006\u0004\b\u001f\u0010\u0017¨\u0006\""}, m28432d2 = {"LJM;", "", "", "filterHash", "Lio/reactivex/k;", "", "c", "offset", "", "Lco/bird/android/model/persistence/BirdMapMarker;", C17296a.f69688o, "Lorg/joda/time/DateTime;", "limitDate", "Lio/reactivex/c;", "i", "b", "", "birdMapMarkers", "", "e", "([Lco/bird/android/model/persistence/BirdMapMarker;)Ljava/util/List;", "", "k", "([Lco/bird/android/model/persistence/BirdMapMarker;)V", "rowids", DateTokenConverter.CONVERTER_KEY, "retainedIds", "h", "f", "g", "j", "l", "<init>", "()V", "co.bird.android.lib.persistence.bird.api"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdMapMarkerDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdMapMarkerDao.kt\nco/bird/android/persistence/bird/api/BirdMapMarkerDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,76:1\n819#2:77\n847#2,2:78\n1855#2,2:80\n1855#2:82\n819#2:85\n847#2,2:86\n1856#2:90\n37#3,2:83\n37#3,2:88\n*S KotlinDebug\n*F\n+ 1 BirdMapMarkerDao.kt\nco/bird/android/persistence/bird/api/BirdMapMarkerDao\n*L\n58#1:77\n58#1:78,2\n61#1:80,2\n68#1:82\n71#1:85\n71#1:86,2\n68#1:90\n69#1:83,2\n72#1:88,2\n*E\n"})
/* renamed from: JM */
/* loaded from: classes4.dex */
public abstract class AbstractC4030JM {
    /* renamed from: a */
    public abstract AbstractC24490k<List<BirdMapMarker>> mo99001a(String str, int i);

    /* renamed from: b */
    public abstract AbstractC23461c mo99000b();

    /* renamed from: c */
    public abstract AbstractC24490k<Integer> mo98999c(String str);

    /* renamed from: d */
    public abstract List<String> mo98998d(List<Long> list);

    /* renamed from: e */
    public abstract List<Long> mo98997e(BirdMapMarker... birdMapMarkerArr);

    /* renamed from: f */
    public abstract List<BirdMapMarker> mo98996f();

    /* renamed from: g */
    public abstract void mo98995g(List<BirdMapMarker> list);

    /* renamed from: h */
    public abstract void mo98994h(List<String> list);

    /* renamed from: i */
    public abstract AbstractC23461c mo98993i(DateTime dateTime);

    /* renamed from: j */
    public void mo98992j(List<String> retainedIds) {
        List<List<BirdMapMarker>> chunked;
        Intrinsics.checkNotNullParameter(retainedIds, "retainedIds");
        if (retainedIds.size() < 999) {
            mo98994h(retainedIds);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : mo98996f()) {
            if (!retainedIds.contains(((BirdMapMarker) obj).getId())) {
                arrayList.add(obj);
            }
        }
        chunked = CollectionsKt___CollectionsKt.chunked(arrayList, 999);
        for (List<BirdMapMarker> list : chunked) {
            mo98995g(list);
        }
    }

    /* renamed from: k */
    public abstract void mo98991k(BirdMapMarker... birdMapMarkerArr);

    /* renamed from: l */
    public void mo98990l(BirdMapMarker... birdMapMarkers) {
        List list;
        List<List> chunked;
        Intrinsics.checkNotNullParameter(birdMapMarkers, "birdMapMarkers");
        list = ArraysKt___ArraysKt.toList(birdMapMarkers);
        chunked = CollectionsKt___CollectionsKt.chunked(list, 999);
        for (List list2 : chunked) {
            BirdMapMarker[] birdMapMarkerArr = (BirdMapMarker[]) list2.toArray(new BirdMapMarker[0]);
            List<String> mo98998d = mo98998d(mo98997e((BirdMapMarker[]) Arrays.copyOf(birdMapMarkerArr, birdMapMarkerArr.length)));
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (!mo98998d.contains(((BirdMapMarker) obj).getId())) {
                    arrayList.add(obj);
                }
            }
            BirdMapMarker[] birdMapMarkerArr2 = (BirdMapMarker[]) arrayList.toArray(new BirdMapMarker[0]);
            mo98991k((BirdMapMarker[]) Arrays.copyOf(birdMapMarkerArr2, birdMapMarkerArr2.length));
        }
    }
}
