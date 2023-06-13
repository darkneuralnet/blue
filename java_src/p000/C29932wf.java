package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u001d\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u0004*\u00028\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u0004*\u00028\u0000H\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a%\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0005*\u00020\u0004*\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m28432d2 = {"", "v1", "Lsf;", C17296a.f69688o, "Lvf;", "T", DateTokenConverter.CONVERTER_KEY, "(Lvf;)Lvf;", "b", Stripe3ds2AuthParams.FIELD_SOURCE, "", "c", "(Lvf;Lvf;)V", "animation-core_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: wf */
/* loaded from: classes.dex */
public final class C29932wf {
    /* renamed from: a */
    public static final C28366sf m6545a(float f) {
        return new C28366sf(f);
    }

    /* renamed from: b */
    public static final <T extends AbstractC29607vf> T m6544b(T t) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        T t2 = (T) m6542d(t);
        int mo8295b = t2.mo8295b();
        for (int i = 0; i < mo8295b; i++) {
            t2.mo8292e(i, t.mo8296a(i));
        }
        return t2;
    }

    /* renamed from: c */
    public static final <T extends AbstractC29607vf> void m6543c(T t, T source) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        int mo8295b = t.mo8295b();
        for (int i = 0; i < mo8295b; i++) {
            t.mo8292e(i, source.mo8296a(i));
        }
    }

    /* renamed from: d */
    public static final <T extends AbstractC29607vf> T m6542d(T t) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        T t2 = (T) t.mo8294c();
        Intrinsics.checkNotNull(t2, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return t2;
    }
}
