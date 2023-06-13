package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.persistence.BrainSwapRecord;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23461c;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\t0\bH'J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\f\u001a\u00020\u000bH'J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\u000e\u001a\u00020\u000bH'J!\u0010\u0012\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H'¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000bH'J\b\u0010\u0015\u001a\u00020\u0005H'¨\u0006\u0018"}, m28432d2 = {"Ll10;", "", "", "Lco/bird/android/model/persistence/BrainSwapRecord;", "record", "Lio/reactivex/c;", "b", "([Lco/bird/android/model/persistence/BrainSwapRecord;)Lio/reactivex/c;", "Lio/reactivex/Observable;", "", "f", "", "imei", "e", "birdId", DateTokenConverter.CONVERTER_KEY, "", "status", "g", "(Ljava/lang/String;Ljava/lang/Boolean;)Lio/reactivex/c;", "c", C17296a.f69688o, "<init>", "()V", "co.bird.android.lib.persistence.brain-swap.api"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: l10  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC44247l10 {
    /* renamed from: a */
    public abstract AbstractC23461c mo26539a();

    /* renamed from: b */
    public abstract AbstractC23461c mo26538b(BrainSwapRecord... brainSwapRecordArr);

    /* renamed from: c */
    public abstract AbstractC23461c mo26537c(String str);

    /* renamed from: d */
    public abstract Observable<BrainSwapRecord> mo26536d(String str);

    /* renamed from: e */
    public abstract Observable<BrainSwapRecord> mo26535e(String str);

    /* renamed from: f */
    public abstract Observable<List<BrainSwapRecord>> mo26534f();

    /* renamed from: g */
    public abstract AbstractC23461c mo26533g(String str, Boolean bool);
}
