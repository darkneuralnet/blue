package p000;

import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0086\u0002R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u0010"}, m28432d2 = {"LGj6;", "Lkotlin/sequences/Sequence;", "LFj6;", "", "iterator", "", "name", "", "value", "", C17296a.f69688o, "", "Ljava/util/List;", "elements", "<init>", "()V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Gj6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33104Gj6 implements Sequence<C32870Fj6> {

    /* renamed from: a */
    public final List<C32870Fj6> f12331a = new ArrayList();

    /* renamed from: a */
    public final void m104824a(String name, Object obj) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f12331a.add(new C32870Fj6(name, obj));
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<C32870Fj6> iterator() {
        return this.f12331a.iterator();
    }
}
