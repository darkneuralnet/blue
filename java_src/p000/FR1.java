package p000;

import android.content.Intent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.IdToolOption;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePart;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\u0006H&J\b\u0010\f\u001a\u00020\u0006H&J\b\u0010\r\u001a\u00020\u0006H&J\u001a\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0014\u001a\u00020\u0006H&J\b\u0010\u0015\u001a\u00020\u0006H&¨\u0006\u0016"}, m28432d2 = {"LFR1;", "", "Lco/bird/android/model/IdToolOption;", "option", "", "showStepOne", "", "f", "Landroid/content/Intent;", "intent", C17296a.f69688o, "onResume", "onPause", "onBackPressed", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/wire/WirePart;", "part", "b", DateTokenConverter.CONVERTER_KEY, "e", "c", "servicecenter_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: FR1 */
/* loaded from: classes3.dex */
public interface FR1 {
    /* renamed from: a */
    void mo36735a(Intent intent);

    /* renamed from: b */
    void mo1371b(WireBird wireBird, WirePart wirePart);

    /* renamed from: c */
    void mo36732c();

    /* renamed from: d */
    void mo1370d(WirePart wirePart);

    /* renamed from: e */
    void mo36729e();

    /* renamed from: f */
    void mo1369f(IdToolOption idToolOption, boolean z);

    void onBackPressed();

    void onPause();

    void onResume();
}
