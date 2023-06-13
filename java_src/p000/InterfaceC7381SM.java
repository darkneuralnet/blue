package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.wire.WireBirdPart;
import co.bird.android.model.wire.WirePart;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\bf\u0018\u00002\u00020\u0001J0\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH&J\"\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00110\b0\u00072\u0006\u0010\u0010\u001a\u00020\u0002H&J,\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\u00072\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH&J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH&J$\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\u00072\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0005H&¨\u0006\u0019"}, m28432d2 = {"LSM;", "", "", "id", "key", "Lco/bird/android/model/constant/PartKind;", "kind", "Lio/reactivex/F;", "LHM4;", "Lco/bird/android/model/wire/WireBirdPart;", C17296a.f69688o, "raw", "", "warehouseSpecific", "Lco/bird/android/model/wire/WirePart;", DateTokenConverter.CONVERTER_KEY, "birdId", "", "b", "sourcePart", "identifyingPart", "c", "f", "partKind", "e", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: SM */
/* loaded from: classes2.dex */
public interface InterfaceC7381SM {
    /* renamed from: a */
    AbstractC23442F<HM4<WireBirdPart>> mo78565a(String str, String str2, PartKind partKind);

    /* renamed from: b */
    AbstractC23442F<HM4<List<WireBirdPart>>> mo78564b(String str);

    /* renamed from: c */
    AbstractC23442F<HM4<WirePart>> mo78563c(String str, WirePart wirePart, WirePart wirePart2);

    /* renamed from: d */
    AbstractC23442F<WirePart> mo78562d(String str, PartKind partKind, boolean z);

    /* renamed from: e */
    AbstractC23442F<HM4<WirePart>> mo78561e(String str, PartKind partKind);

    /* renamed from: f */
    AbstractC23442F<WirePart> mo78560f(String str, WirePart wirePart, WirePart wirePart2);
}
