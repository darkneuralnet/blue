package p000;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BatchBirdFraudReport;
import co.bird.android.model.BirdFraudReport;
import co.bird.android.model.wire.WireBird;
import com.stripe.android.financialconnections.domain.Entry;
import io.reactivex.AbstractC23442F;
import io.reactivex.Observable;
import java.util.ArrayList;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J4\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00020\bj\b\u0012\u0004\u0012\u00020\u0002`\t2\u0006\u0010\u0004\u001a\u00020\u0002H&J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H&J$\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u000b2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H&¨\u0006\u001c"}, m28432d2 = {"LjB0;", "", "", "birdId", Entry.TYPE_TEXT, "Lio/reactivex/Observable;", "Lco/bird/android/model/BirdFraudReport;", "f", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "birdIds", "Lio/reactivex/F;", "LHM4;", "Lco/bird/android/model/BatchBirdFraudReport;", "e", "Le13;", "navigator", "Lco/bird/android/model/wire/WireBird;", "bird", "Landroid/location/Location;", "location", "", "startOver", "", "c", "taskId", "reason", DateTokenConverter.CONVERTER_KEY, "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: jB0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC43160jB0 {
    /* renamed from: c */
    void mo27699c(InterfaceC40099e13 interfaceC40099e13, WireBird wireBird, Location location, boolean z);

    /* renamed from: d */
    AbstractC23442F<HM4<WireBird>> mo27698d(String str, String str2);

    /* renamed from: e */
    AbstractC23442F<HM4<BatchBirdFraudReport>> mo27697e(ArrayList<String> arrayList, String str);

    /* renamed from: f */
    Observable<BirdFraudReport> mo27696f(String str, String str2);
}
