package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.wire.WireBird;
import io.reactivex.Observable;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\b\u0010\n\u001a\u00020\u0004H&¨\u0006\u000b"}, m28432d2 = {"LJn5;", "", "Lco/bird/android/model/wire/WireBird;", "bird", "", "R5", "Lio/reactivex/Observable;", "Lco/bird/android/model/DialogResponse;", "f", DateTokenConverter.CONVERTER_KEY, "dismiss", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Jn5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC33841Jn5 {
    /* renamed from: R5 */
    void mo94837R5(WireBird wireBird);

    /* renamed from: d */
    Observable<DialogResponse> mo94834d();

    void dismiss();

    /* renamed from: f */
    Observable<DialogResponse> mo94833f();
}
