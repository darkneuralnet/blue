package p000;

import co.bird.android.model.persistence.OperatorTaskBanner;
import co.bird.android.model.wire.WireOperatorTaskBanner;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, m28432d2 = {"Lco/bird/android/model/wire/WireOperatorTaskBanner;", "Lco/bird/android/model/persistence/OperatorTaskBanner;", C17296a.f69688o, "co.bird.android.repository.fleet-status"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Tu3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36242Tu3 {
    /* renamed from: a */
    public static final OperatorTaskBanner m82273a(WireOperatorTaskBanner wireOperatorTaskBanner) {
        Intrinsics.checkNotNullParameter(wireOperatorTaskBanner, "<this>");
        return new OperatorTaskBanner(wireOperatorTaskBanner.getTitle(), C47311qB0.m17961f(wireOperatorTaskBanner.getTitleColor()), C47311qB0.m17961f(wireOperatorTaskBanner.getBackgroundColor()));
    }
}
