package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.OperatorTaskBanner;
import co.bird.android.model.persistence.OperatorTaskGroup;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'J\u0016\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H'J\b\u0010\t\u001a\u00020\u0007H'J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u000b\u001a\u00020\nH'J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH'J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00030\u0002H'J\b\u0010\u0011\u001a\u00020\u0007H'¨\u0006\u0014"}, m28432d2 = {"Lww3;", "", "Lio/reactivex/Observable;", "", "Lco/bird/android/model/persistence/OperatorTaskGroup;", "f", "operatorTaskGroups", "Lio/reactivex/c;", DateTokenConverter.CONVERTER_KEY, "b", "", "title", "g", "Lco/bird/android/model/persistence/OperatorTaskBanner;", "banner", "c", "e", C17296a.f69688o, "<init>", "()V", "co.bird.android.lib.persistence.operator-task-v2.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ww3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC51315ww3 {
    /* renamed from: a */
    public abstract AbstractC23461c mo4439a();

    /* renamed from: b */
    public abstract AbstractC23461c mo4438b();

    /* renamed from: c */
    public abstract AbstractC23461c mo4437c(OperatorTaskBanner operatorTaskBanner);

    /* renamed from: d */
    public abstract AbstractC23461c mo4436d(List<OperatorTaskGroup> list);

    /* renamed from: e */
    public abstract Observable<List<OperatorTaskBanner>> mo4435e();

    /* renamed from: f */
    public abstract Observable<List<OperatorTaskGroup>> mo4434f();

    /* renamed from: g */
    public abstract Observable<OperatorTaskGroup> mo4433g(String str);
}
