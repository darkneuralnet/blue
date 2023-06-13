package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.PendingScanEntity;
import co.bird.android.model.persistence.UnidentifiedScanEntity;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH'J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\f2\u0006\u0010\u000b\u001a\u00020\bH'J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\u000f2\u0006\u0010\u000b\u001a\u00020\bH'J#\u0010\u0013\u001a\u00020\u00052\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0002\"\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH'J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\f2\u0006\u0010\u000b\u001a\u00020\bH'J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\r0\u000f2\u0006\u0010\u000b\u001a\u00020\bH'¨\u0006\u001a"}, m28432d2 = {"LiF1;", "", "", "Lco/bird/android/model/persistence/PendingScanEntity;", "pendingScans", "Lio/reactivex/c;", "e", "([Lco/bird/android/model/persistence/PendingScanEntity;)Lio/reactivex/c;", "", "scanIdentifier", C17296a.f69688o, "hardCountSessionId", "Lio/reactivex/F;", "", "c", "Lio/reactivex/Observable;", "g", "Lco/bird/android/model/persistence/UnidentifiedScanEntity;", "unidentifiedScans", "f", "([Lco/bird/android/model/persistence/UnidentifiedScanEntity;)Lio/reactivex/c;", "b", DateTokenConverter.CONVERTER_KEY, "h", "<init>", "()V", "co.bird.android.manager.hardcount"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: iF1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC42604iF1 {
    /* renamed from: a */
    public abstract AbstractC23461c mo30942a(String str);

    /* renamed from: b */
    public abstract AbstractC23461c mo30941b(String str);

    /* renamed from: c */
    public abstract AbstractC23442F<List<PendingScanEntity>> mo30940c(String str);

    /* renamed from: d */
    public abstract AbstractC23442F<List<UnidentifiedScanEntity>> mo30939d(String str);

    /* renamed from: e */
    public abstract AbstractC23461c mo30938e(PendingScanEntity... pendingScanEntityArr);

    /* renamed from: f */
    public abstract AbstractC23461c mo30937f(UnidentifiedScanEntity... unidentifiedScanEntityArr);

    /* renamed from: g */
    public abstract Observable<List<PendingScanEntity>> mo30936g(String str);

    /* renamed from: h */
    public abstract Observable<List<UnidentifiedScanEntity>> mo30935h(String str);
}
