package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003B\u0015\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"Lqd3;", "", "T", "LKj2;", "Lrb1;", "encoder", "value", "", "serialize", "(Lrb1;Ljava/lang/Object;)V", "LGV0;", "decoder", "deserialize", "(LGV0;)Ljava/lang/Object;", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", C17296a.f69688o, "LKj2;", "serializer", "LMs5;", "b", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "<init>", "(LKj2;)V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
/* renamed from: qd3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47569qd3<T> implements InterfaceC34036Kj2<T> {

    /* renamed from: a */
    public final InterfaceC34036Kj2<T> f105516a;

    /* renamed from: b */
    public final InterfaceC34588Ms5 f105517b;

    public C47569qd3(InterfaceC34036Kj2<T> serializer) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f105516a = serializer;
        this.f105517b = new C34822Ns5(serializer.getDescriptor());
    }

    @Override // p000.E01
    public T deserialize(GV0 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (decoder.mo3323D()) {
            return (T) decoder.mo3325B(this.f105516a);
        }
        return (T) decoder.mo3295f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C47569qd3.class == obj.getClass() && Intrinsics.areEqual(this.f105516a, ((C47569qd3) obj).f105516a)) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return this.f105517b;
    }

    public int hashCode() {
        return this.f105516a.hashCode();
    }

    @Override // p000.InterfaceC40615et5
    public void serialize(InterfaceC48140rb1 encoder, T t) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (t != null) {
            encoder.mo1174D();
            encoder.mo1176B(this.f105516a, t);
            return;
        }
        encoder.mo1177A();
    }
}
