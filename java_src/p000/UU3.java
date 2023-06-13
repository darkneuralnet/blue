package p000;

import android.text.Spannable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C1577Df;
import p000.O26;
import p000.XU3;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a(\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a,\u0010\r\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\"!\u0010\u0013\u001a\u00020\n*\u00020\u000e8BX\u0082\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\"!\u0010\u0019\u001a\u00020\n*\u00020\u00148BX\u0082\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m28432d2 = {"Landroid/text/Spannable;", "", "LDf$b;", "LTU3;", "placeholders", "Lg01;", "density", "", DateTokenConverter.CONVERTER_KEY, "placeholder", "", "start", "end", "c", "LM26;", C17296a.f69688o, "(J)I", "getSpanUnit--R2X_6o$annotations", "(J)V", "spanUnit", "LXU3;", "b", "(I)I", "getSpanVerticalAlign-do9X-Gg$annotations", "(I)V", "spanVerticalAlign", "ui-text_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPlaceholderExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,93:1\n33#2,6:94\n13579#3,2:100\n*S KotlinDebug\n*F\n+ 1 PlaceholderExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/PlaceholderExtensions_androidKt\n*L\n35#1:94,6\n48#1:100,2\n*E\n"})
/* renamed from: UU3 */
/* loaded from: classes.dex */
public final class UU3 {
    /* renamed from: a */
    public static final int m81466a(long j) {
        long m95973g = M26.m95973g(j);
        O26.C5817a c5817a = O26.f25571b;
        if (O26.m92975g(m95973g, c5817a.m92970b())) {
            return 0;
        }
        if (O26.m92975g(m95973g, c5817a.m92971a())) {
            return 1;
        }
        return 2;
    }

    /* renamed from: b */
    public static final int m81465b(int i) {
        XU3.C9419a c9419a = XU3.f43296a;
        if (XU3.m76957i(i, c9419a.m76954a())) {
            return 0;
        }
        if (XU3.m76957i(i, c9419a.m76948g())) {
            return 1;
        }
        if (XU3.m76957i(i, c9419a.m76953b())) {
            return 2;
        }
        if (XU3.m76957i(i, c9419a.m76952c())) {
            return 3;
        }
        if (XU3.m76957i(i, c9419a.m76949f())) {
            return 4;
        }
        if (XU3.m76957i(i, c9419a.m76951d())) {
            return 5;
        }
        if (XU3.m76957i(i, c9419a.m76950e())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
    }

    /* renamed from: c */
    public static final void m81464c(Spannable spannable, TU3 tu3, int i, int i2, InterfaceC41273g01 interfaceC41273g01) {
        Object[] spans = spannable.getSpans(i, i2, AbstractC33018Ga1.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(start, end, EmojiSpan::class.java)");
        for (Object obj : spans) {
            spannable.removeSpan((AbstractC33018Ga1) obj);
        }
        JN5.m100570t(spannable, new VU3(M26.m95972h(tu3.m83575c()), m81466a(tu3.m83575c()), M26.m95972h(tu3.m83577a()), m81466a(tu3.m83577a()), interfaceC41273g01.mo3412R0() * interfaceC41273g01.mo3408b(), m81465b(tu3.m83576b())), i, i2);
    }

    /* renamed from: d */
    public static final void m81463d(Spannable spannable, List<C1577Df.C1580b<TU3>> placeholders, InterfaceC41273g01 density) {
        Intrinsics.checkNotNullParameter(spannable, "<this>");
        Intrinsics.checkNotNullParameter(placeholders, "placeholders");
        Intrinsics.checkNotNullParameter(density, "density");
        int size = placeholders.size();
        for (int i = 0; i < size; i++) {
            C1577Df.C1580b<TU3> c1580b = placeholders.get(i);
            m81464c(spannable, c1580b.m110032a(), c1580b.m110031b(), c1580b.m110030c(), density);
        }
    }
}
