package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.BountyMapMarker;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'J\b\u0010\u0007\u001a\u00020\u0006H'J\u0016\u0010\n\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H'J)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H%¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u00020\u00102\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H%¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0003H%J#\u0010\u0016\u001a\u00020\u00102\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u000b\"\u00020\u0004H\u0017¢\u0006\u0004\b\u0016\u0010\u0012¨\u0006\u0019"}, m28432d2 = {"LM00;", "", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/BountyMapMarker;", C17296a.f69688o, "Lio/reactivex/c;", "b", "", "ids", "e", "", "bountyMapMarker", "", DateTokenConverter.CONVERTER_KEY, "([Lco/bird/android/model/persistence/BountyMapMarker;)Ljava/util/List;", "", "f", "([Lco/bird/android/model/persistence/BountyMapMarker;)V", "rowids", "c", "bountyMapMarkers", "g", "<init>", "()V", "co.bird.android.lib.persistence.bounty-flight-sheet.api"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBountyMapMarkerDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BountyMapMarkerDao.kt\nco/bird/android/persistence/bountyflightsheet/api/BountyMapMarkerDao\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,43:1\n4117#2:44\n4217#2,2:45\n37#3,2:47\n*S KotlinDebug\n*F\n+ 1 BountyMapMarkerDao.kt\nco/bird/android/persistence/bountyflightsheet/api/BountyMapMarkerDao\n*L\n38#1:44\n38#1:45,2\n39#1:47,2\n*E\n"})
/* renamed from: M00 */
/* loaded from: classes4.dex */
public abstract class M00 {
    /* renamed from: a */
    public abstract Observable<List<BountyMapMarker>> mo94506a();

    /* renamed from: b */
    public abstract AbstractC23461c mo94505b();

    /* renamed from: c */
    public abstract List<String> mo94504c(List<Long> list);

    /* renamed from: d */
    public abstract List<Long> mo94503d(BountyMapMarker... bountyMapMarkerArr);

    /* renamed from: e */
    public abstract AbstractC23461c mo94502e(List<String> list);

    /* renamed from: f */
    public abstract void mo94501f(BountyMapMarker... bountyMapMarkerArr);

    /* renamed from: g */
    public void mo94500g(BountyMapMarker... bountyMapMarkers) {
        Intrinsics.checkNotNullParameter(bountyMapMarkers, "bountyMapMarkers");
        List<String> mo94504c = mo94504c(mo94503d((BountyMapMarker[]) Arrays.copyOf(bountyMapMarkers, bountyMapMarkers.length)));
        ArrayList arrayList = new ArrayList();
        for (BountyMapMarker bountyMapMarker : bountyMapMarkers) {
            if (!mo94504c.contains(bountyMapMarker.getId())) {
                arrayList.add(bountyMapMarker);
            }
        }
        BountyMapMarker[] bountyMapMarkerArr = (BountyMapMarker[]) arrayList.toArray(new BountyMapMarker[0]);
        mo94501f((BountyMapMarker[]) Arrays.copyOf(bountyMapMarkerArr, bountyMapMarkerArr.length));
    }
}
