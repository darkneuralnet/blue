package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.BulkScanPurpose;
import co.bird.android.model.persistence.Bird;
import co.bird.android.model.persistence.BulkScanPurposeBird;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H'J#\u0010\u000f\u001a\u00020\u00042\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0004H'¨\u0006\u0014"}, m28432d2 = {"Li40;", "", "Lco/bird/android/model/persistence/BulkScanPurposeBird;", "bulkScanPurposeBird", "Lio/reactivex/c;", "c", "Lco/bird/android/model/constant/BulkScanPurpose;", "purpose", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/Bird;", DateTokenConverter.CONVERTER_KEY, "", "", "birdIds", "b", "([Ljava/lang/String;)Lio/reactivex/c;", C17296a.f69688o, "<init>", "()V", "co.bird.android.lib.persistence.bird.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: i40  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC42498i40 {
    /* renamed from: a */
    public abstract AbstractC23461c mo31199a();

    /* renamed from: b */
    public abstract AbstractC23461c mo31198b(String... strArr);

    /* renamed from: c */
    public abstract AbstractC23461c mo31197c(BulkScanPurposeBird bulkScanPurposeBird);

    /* renamed from: d */
    public abstract Observable<List<Bird>> mo31196d(BulkScanPurpose bulkScanPurpose);
}
