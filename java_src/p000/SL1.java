package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.HibernationSessionVehicle;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'J\b\u0010\u0007\u001a\u00020\u0006H'J\b\u0010\b\u001a\u00020\u0006H'J\u0016\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0017J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H%J\u0016\u0010\u000e\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H%J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H%¨\u0006\u0014"}, m28432d2 = {"LSL1;", "", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/HibernationSessionVehicle;", "c", "Lio/reactivex/c;", "b", C17296a.f69688o, "vehicles", "", "g", "", "e", "f", "rowids", "", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "co.bird.android.lib.persistence.hibernation.api"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHibernationDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HibernationDao.kt\nco/bird/android/persistence/hibernation/api/HibernationDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n819#2:43\n847#2,2:44\n*S KotlinDebug\n*F\n+ 1 HibernationDao.kt\nco/bird/android/persistence/hibernation/api/HibernationDao\n*L\n29#1:43\n29#1:44,2\n*E\n"})
/* renamed from: SL1 */
/* loaded from: classes4.dex */
public abstract class SL1 {
    /* renamed from: a */
    public abstract AbstractC23461c mo83769a();

    /* renamed from: b */
    public abstract AbstractC23461c mo83768b();

    /* renamed from: c */
    public abstract Observable<List<HibernationSessionVehicle>> mo83767c();

    /* renamed from: d */
    public abstract List<String> mo83766d(List<Long> list);

    /* renamed from: e */
    public abstract List<Long> mo83765e(List<HibernationSessionVehicle> list);

    /* renamed from: f */
    public abstract void mo83764f(List<HibernationSessionVehicle> list);

    /* renamed from: g */
    public void mo83763g(List<HibernationSessionVehicle> vehicles) {
        Intrinsics.checkNotNullParameter(vehicles, "vehicles");
        List<String> mo83766d = mo83766d(mo83765e(vehicles));
        List<HibernationSessionVehicle> arrayList = new ArrayList<>();
        for (Object obj : vehicles) {
            if (!mo83766d.contains(((HibernationSessionVehicle) obj).getBirdId())) {
                arrayList.add(obj);
            }
        }
        mo83764f(arrayList);
    }
}
