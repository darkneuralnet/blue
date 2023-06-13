package p000;

import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0010"}, m28432d2 = {"LUs6;", "", "", "Lh62;", "interceptors", "", "b", "([Lh62;)V", "", "Ljava/util/List;", C17296a.f69688o, "()Ljava/util/List;", "setInterceptors$viewpump_release", "(Ljava/util/List;)V", "<init>", "()V", "viewpump_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Us6  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36461Us6 {

    /* renamed from: a */
    public static final C36461Us6 f38200a = new C36461Us6();

    /* renamed from: b */
    public static List<? extends InterfaceC41927h62> f38201b;

    private C36461Us6() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m80683b(InterfaceC41927h62... interceptors) {
        List<? extends InterfaceC41927h62> list;
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        list = ArraysKt___ArraysKt.toList(interceptors);
        f38201b = list;
    }

    /* renamed from: a */
    public final List<InterfaceC41927h62> m80684a() {
        return f38201b;
    }
}
