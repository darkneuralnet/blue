package p000;

import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u0004\b\u0002\u0010\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0015\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0007\u001a\u00020\u0006*\u00028\u0001H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t*\u00028\u0001H\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u0010"}, m28432d2 = {"Lim0;", "E", "", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "B", "Lhm0;", "", "p", "(Ljava/util/Collection;)I", "", "o", "(Ljava/util/Collection;)Ljava/util/Iterator;", "LKj2;", "element", "<init>", "(LKj2;)V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
/* renamed from: im0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42912im0<E, C extends Collection<? extends E>, B> extends AbstractC42319hm0<E, C, B> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC42912im0(InterfaceC34036Kj2<E> element) {
        super(element, null);
        Intrinsics.checkNotNullParameter(element, "element");
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: o */
    public Iterator<E> mo28033d(C c) {
        Intrinsics.checkNotNullParameter(c, "<this>");
        return c.iterator();
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: p */
    public int mo5868e(C c) {
        Intrinsics.checkNotNullParameter(c, "<this>");
        return c.size();
    }
}
