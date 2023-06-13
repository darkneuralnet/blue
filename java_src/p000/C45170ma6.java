package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\n2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m28432d2 = {"T", "Lbi2;", "Lxi2;", "element", "LE01;", "deserializer", C17296a.f69688o, "(Lbi2;Lxi2;LE01;)Ljava/lang/Object;", "", "discriminator", "LSi2;", "b", "(Lbi2;Ljava/lang/String;LSi2;LE01;)Ljava/lang/Object;", "kotlinx-serialization-json"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: ma6  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45170ma6 {
    /* renamed from: a */
    public static final <T> T m25406a(AbstractC38706bi2 abstractC38706bi2, AbstractC51767xi2 element, E01<? extends T> deserializer) {
        boolean areEqual;
        GV0 c38123aj2;
        Intrinsics.checkNotNullParameter(abstractC38706bi2, "<this>");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (element instanceof C35899Si2) {
            c38123aj2 = new C47035pj2(abstractC38706bi2, (C35899Si2) element, null, null, 12, null);
        } else if (element instanceof C40502ei2) {
            c38123aj2 = new C48221rj2(abstractC38706bi2, (C40502ei2) element);
        } else {
            if (element instanceof C34027Ki2) {
                areEqual = true;
            } else {
                areEqual = Intrinsics.areEqual(element, C35197Pi2.INSTANCE);
            }
            if (areEqual) {
                c38123aj2 = new C38123aj2(abstractC38706bi2, (AbstractC37303Yi2) element);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return (T) c38123aj2.mo3325B(deserializer);
    }

    /* renamed from: b */
    public static final <T> T m25405b(AbstractC38706bi2 abstractC38706bi2, String discriminator, C35899Si2 element, E01<? extends T> deserializer) {
        Intrinsics.checkNotNullParameter(abstractC38706bi2, "<this>");
        Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return (T) new C47035pj2(abstractC38706bi2, element, discriminator, deserializer.getDescriptor()).mo3325B(deserializer);
    }
}
