package p000;

import com.facebook.share.internal.C17296a;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a4\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007\u001a9\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m28432d2 = {"", "T", "Lb1;", "LTt0;", "decoder", "", "klassName", "LE01;", C17296a.f69688o, "Lrb1;", "encoder", "value", "Let5;", "b", "(Lb1;Lrb1;Ljava/lang/Object;)Let5;", "kotlinx-serialization-core"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: RX3 */
/* loaded from: classes8.dex */
public final class RX3 {
    /* renamed from: a */
    public static final <T> E01<T> m86631a(AbstractC12270b1<T> abstractC12270b1, InterfaceC36230Tt0 decoder, String str) {
        Intrinsics.checkNotNullParameter(abstractC12270b1, "<this>");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        E01<T> mo29846c = abstractC12270b1.mo29846c(decoder, str);
        if (mo29846c != null) {
            return mo29846c;
        }
        C13362c1.m62031a(str, abstractC12270b1.mo29844e());
        throw new KotlinNothingValueException();
    }

    /* renamed from: b */
    public static final <T> InterfaceC40615et5<T> m86630b(AbstractC12270b1<T> abstractC12270b1, InterfaceC48140rb1 encoder, T value) {
        Intrinsics.checkNotNullParameter(abstractC12270b1, "<this>");
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC40615et5<T> mo29845d = abstractC12270b1.mo29845d(encoder, value);
        if (mo29845d != null) {
            return mo29845d;
        }
        C13362c1.m62030b(Reflection.getOrCreateKotlinClass(value.getClass()), abstractC12270b1.mo29844e());
        throw new KotlinNothingValueException();
    }
}
