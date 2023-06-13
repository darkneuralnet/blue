package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.Notification;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t0\bH'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\f\u001a\u00020\u000bH'J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t0\b2\u0006\u0010\u000e\u001a\u00020\u000bH'J\b\u0010\u0010\u001a\u00020\u0005H'J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H'¨\u0006\u0016"}, m28432d2 = {"LBc3;", "", "", "Lco/bird/android/model/persistence/Notification;", "notifications", "Lio/reactivex/c;", "c", "([Lco/bird/android/model/persistence/Notification;)Lio/reactivex/c;", "Lio/reactivex/Observable;", "", "f", "", "id", DateTokenConverter.CONVERTER_KEY, "groupId", "e", C17296a.f69688o, "Lio/reactivex/p;", "Lorg/joda/time/DateTime;", "b", "<init>", "()V", "co.bird.android.lib.persistence.notificationcenter.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Bc3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC31868Bc3 {
    /* renamed from: a */
    public abstract AbstractC23461c mo112051a();

    /* renamed from: b */
    public abstract AbstractC24507p<DateTime> mo112050b();

    /* renamed from: c */
    public abstract AbstractC23461c mo112049c(Notification... notificationArr);

    /* renamed from: d */
    public abstract Observable<Notification> mo112048d(String str);

    /* renamed from: e */
    public abstract Observable<List<Notification>> mo112047e(String str);

    /* renamed from: f */
    public abstract Observable<List<Notification>> mo112046f();
}
