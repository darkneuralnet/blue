package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.FleetStatus;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J#\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\t\"\u00020\u0006H'¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH'J\b\u0010\u0011\u001a\u00020\u000bH'¨\u0006\u0014"}, m28432d2 = {"Lwq1;", "", "", "fleetId", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/FleetStatus;", "b", "c", "", "fleetStatuses", "Lio/reactivex/c;", DateTokenConverter.CONVERTER_KEY, "([Lco/bird/android/model/persistence/FleetStatus;)Lio/reactivex/c;", "Lorg/joda/time/DateTime;", "createdAt", "e", C17296a.f69688o, "<init>", "()V", "co.bird.android.lib.persistence.fleet-status.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: wq1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC51253wq1 {
    /* renamed from: a */
    public abstract AbstractC23461c mo4583a();

    /* renamed from: b */
    public abstract Observable<List<FleetStatus>> mo4582b(String str);

    /* renamed from: c */
    public abstract Observable<List<FleetStatus>> mo4581c(String str);

    /* renamed from: d */
    public abstract AbstractC23461c mo4580d(FleetStatus... fleetStatusArr);

    /* renamed from: e */
    public abstract AbstractC23461c mo4579e(String str, DateTime dateTime);
}
