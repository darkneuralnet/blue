package p000;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012*\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00050\u0002B\u0015\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014J\u001c\u0010\b\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014J\"\u0010\n\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0014J$\u0010\r\u001a\u00020\f*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0014J3\u0010\u0010\u001a\u00020\f*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001c"}, m28432d2 = {"LSr2;", "E", "Lim0;", "", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "q", "", "r", "v", "u", "size", "", "s", "index", "element", "t", "(Ljava/util/LinkedHashSet;ILjava/lang/Object;)V", "LMs5;", "b", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "LKj2;", "eSerializer", "<init>", "(LKj2;)V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
/* renamed from: Sr2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C35980Sr2<E> extends AbstractC42912im0<E, Set<? extends E>, LinkedHashSet<E>> {

    /* renamed from: b */
    public final InterfaceC34588Ms5 f34351b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35980Sr2(InterfaceC34036Kj2<E> eSerializer) {
        super(eSerializer);
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        this.f34351b = new C35746Rr2(eSerializer.getDescriptor());
    }

    @Override // p000.AbstractC42319hm0, p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return this.f34351b;
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: q */
    public LinkedHashSet<E> mo15386a() {
        return new LinkedHashSet<>();
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: r */
    public int mo15385b(LinkedHashSet<E> linkedHashSet) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        return linkedHashSet.size();
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: s */
    public void mo15384c(LinkedHashSet<E> linkedHashSet, int i) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
    }

    @Override // p000.AbstractC42319hm0
    /* renamed from: t */
    public void mo15382n(LinkedHashSet<E> linkedHashSet, int i, E e) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        linkedHashSet.add(e);
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: u */
    public LinkedHashSet<E> mo5866k(Set<? extends E> set) {
        LinkedHashSet<E> linkedHashSet;
        Intrinsics.checkNotNullParameter(set, "<this>");
        if (set instanceof LinkedHashSet) {
            linkedHashSet = (LinkedHashSet) set;
        } else {
            linkedHashSet = null;
        }
        if (linkedHashSet == null) {
            return new LinkedHashSet<>(set);
        }
        return linkedHashSet;
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: v */
    public Set<E> mo15383l(LinkedHashSet<E> linkedHashSet) {
        Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
        return linkedHashSet;
    }
}
