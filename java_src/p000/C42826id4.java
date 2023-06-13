package p000;

import co.bird.android.model.persistence.Bird;
import com.facebook.share.internal.C17296a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import org.joda.time.Seconds;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR,\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"Lid4;", "", "Lco/bird/android/model/persistence/Bird;", "bird", "", "timeout", "", "c", C17296a.f69688o, "", "success", "b", "LEa;", "LEa;", "analyticsManager", "", "Lkotlin/Pair;", "Lorg/joda/time/DateTime;", "Ljava/util/Map;", "vehicleQuickCaptureTimes", "<init>", "(LEa;)V", "flight-sheet_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: id4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42826id4 {

    /* renamed from: a */
    public final InterfaceC1880Ea f87572a;

    /* renamed from: b */
    public final Map<Bird, Pair<DateTime, DateTime>> f87573b;

    public C42826id4(InterfaceC1880Ea analyticsManager) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        this.f87572a = analyticsManager;
        this.f87573b = new LinkedHashMap();
    }

    /* renamed from: a */
    public final void m33722a(Bird bird) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        Pair<DateTime, DateTime> pair = this.f87573b.get(bird);
        if (pair != null) {
            DateTime component1 = pair.component1();
            DateTime component2 = pair.component2();
            try {
                this.f87572a.mo55905y(new C44012kd4(null, null, null, bird.getId(), Seconds.secondsBetween(component1, component2).getSeconds(), Seconds.secondsBetween(DateTime.now(), component2).getSeconds(), 7, null));
                return;
            } finally {
                this.f87573b.remove(bird);
            }
        }
        throw new IllegalStateException("Cannot cancel quick-start on Bird that has not been started");
    }

    /* renamed from: b */
    public final void m33721b(Bird bird, boolean z) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        if (this.f87573b.get(bird) == null) {
            return;
        }
        try {
            this.f87572a.mo55905y(new C44605ld4(null, null, null, bird.getId(), z, 7, null));
        } finally {
            this.f87573b.remove(bird);
        }
    }

    /* renamed from: c */
    public final void m33720c(Bird bird, int i) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        DateTime now = DateTime.now();
        this.f87573b.put(bird, TuplesKt.m28425to(now, now.plusSeconds(i)));
        this.f87572a.mo55905y(new C46384od4(null, null, null, bird.getId(), 7, null));
    }
}
