package p000;

import co.bird.android.model.RadarTagMetadata;
import co.bird.android.model.constant.PartKind;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WirePart;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JO\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\r\u0010\u000eJC\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u0004\"\u00020\u000f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m28432d2 = {"LnS1;", "", "Lco/bird/android/model/wire/WireBird;", "bird", "", "Lco/bird/android/model/wire/WirePart;", "parts", "", "sessionId", "Lco/bird/android/model/RadarTagMetadata;", "radarTagMetadata", "Lio/reactivex/F;", "", C17296a.f69688o, "(Lco/bird/android/model/wire/WireBird;[Lco/bird/android/model/wire/WirePart;Ljava/lang/String;Lco/bird/android/model/RadarTagMetadata;)Lio/reactivex/F;", "Lco/bird/android/model/constant/PartKind;", "kinds", "b", "(Lco/bird/android/model/wire/WireBird;[Lco/bird/android/model/constant/PartKind;Ljava/lang/String;)Lio/reactivex/F;", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: nS1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC45686nS1 {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: nS1$a */
    /* loaded from: classes2.dex */
    public static final class C26513a {
        public static /* synthetic */ AbstractC23442F attachParts$default(InterfaceC45686nS1 interfaceC45686nS1, WireBird wireBird, WirePart[] wirePartArr, String str, RadarTagMetadata radarTagMetadata, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str = null;
                }
                if ((i & 8) != 0) {
                    radarTagMetadata = null;
                }
                return interfaceC45686nS1.mo6822a(wireBird, wirePartArr, str, radarTagMetadata);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: attachParts");
        }

        public static /* synthetic */ AbstractC23442F detachParts$default(InterfaceC45686nS1 interfaceC45686nS1, WireBird wireBird, PartKind[] partKindArr, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str = null;
                }
                return interfaceC45686nS1.mo6821b(wireBird, partKindArr, str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: detachParts");
        }
    }

    /* renamed from: a */
    AbstractC23442F<List<WirePart>> mo6822a(WireBird wireBird, WirePart[] wirePartArr, String str, RadarTagMetadata radarTagMetadata);

    /* renamed from: b */
    AbstractC23442F<List<PartKind>> mo6821b(WireBird wireBird, PartKind[] partKindArr, String str);
}
