package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012*\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00050\u0002B\u0015\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014J\u001c\u0010\b\u001a\u00020\u0007*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005H\u0014J\"\u0010\n\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0014J$\u0010\r\u001a\u00020\f*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u000b\u001a\u00020\u0007H\u0014J3\u0010\u0010\u001a\u00020\f*\u0012\u0012\u0004\u0012\u00028\u00000\u0004j\b\u0012\u0004\u0012\u00028\u0000`\u00052\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, m28432d2 = {"Lro;", "E", "Lim0;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "q", "", "r", "v", "u", "size", "", "s", "index", "element", "t", "(Ljava/util/ArrayList;ILjava/lang/Object;)V", "LMs5;", "b", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "LKj2;", "<init>", "(LKj2;)V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
/* renamed from: ro */
/* loaded from: classes8.dex */
public final class C27999ro<E> extends AbstractC42912im0<E, List<? extends E>, ArrayList<E>> {

    /* renamed from: b */
    public final InterfaceC34588Ms5 f107631b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27999ro(InterfaceC34036Kj2<E> element) {
        super(element);
        Intrinsics.checkNotNullParameter(element, "element");
        this.f107631b = new C27690qo(element.getDescriptor());
    }

    @Override // p000.AbstractC42319hm0, p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return this.f107631b;
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: q */
    public ArrayList<E> mo15386a() {
        return new ArrayList<>();
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: r */
    public int mo15385b(ArrayList<E> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList.size();
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: s */
    public void mo15384c(ArrayList<E> arrayList, int i) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.ensureCapacity(i);
    }

    @Override // p000.AbstractC42319hm0
    /* renamed from: t */
    public void mo15382n(ArrayList<E> arrayList, int i, E e) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.add(i, e);
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: u */
    public ArrayList<E> mo5866k(List<? extends E> list) {
        ArrayList<E> arrayList;
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list instanceof ArrayList) {
            arrayList = (ArrayList) list;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return new ArrayList<>(list);
        }
        return arrayList;
    }

    @Override // p000.AbstractC25581l0
    /* renamed from: v */
    public List<E> mo15383l(ArrayList<E> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList;
    }
}
