package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0003"}, m28432d2 = {"Lhu1;", "v", C17296a.f69688o, "sceneview_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: ck6  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39323ck6 {
    /* renamed from: a */
    public static final C42400hu1 m60973a(C42400hu1 v) {
        Intrinsics.checkNotNullParameter(v, "v");
        float sqrt = 1.0f / ((float) Math.sqrt(((v.m35576g() * v.m35576g()) + (v.m35575h() * v.m35575h())) + (v.m35574i() * v.m35574i())));
        return new C42400hu1(v.m35576g() * sqrt, v.m35575h() * sqrt, v.m35574i() * sqrt);
    }
}
