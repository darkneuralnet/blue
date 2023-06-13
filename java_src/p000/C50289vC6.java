package p000;

import co.bird.android.model.persistence.nestedstructures.Part;
import co.bird.android.model.wire.WirePart;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, m28432d2 = {"Lco/bird/android/model/wire/WirePart;", "Lco/bird/android/model/persistence/nestedstructures/Part;", C17296a.f69688o, "servicecenter_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: vC6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50289vC6 {
    /* renamed from: a */
    public static final Part m9024a(WirePart wirePart) {
        Intrinsics.checkNotNullParameter(wirePart, "<this>");
        return new Part(wirePart.getId(), wirePart.getKind(), wirePart.getKey());
    }
}
