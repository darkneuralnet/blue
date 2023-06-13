package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"Loj2;", "", "T", "LKj2;", "Lrb1;", "encoder", "value", "", "serialize", "(Lrb1;Ljava/lang/Object;)V", "LGV0;", "decoder", "deserialize", "(LGV0;)Ljava/lang/Object;", "Lxi2;", "element", "transformDeserialize", "transformSerialize", "tSerializer", "LKj2;", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "<init>", "(LKj2;)V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: oj2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46442oj2<T> implements InterfaceC34036Kj2<T> {
    private final InterfaceC34036Kj2<T> tSerializer;

    public AbstractC46442oj2(InterfaceC34036Kj2<T> tSerializer) {
        Intrinsics.checkNotNullParameter(tSerializer, "tSerializer");
        this.tSerializer = tSerializer;
    }

    @Override // p000.E01
    public final T deserialize(GV0 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC48803si2 m111822d = C32155Ci2.m111822d(decoder);
        return (T) m111822d.mo13803d().m64106a(this.tSerializer, transformDeserialize(m111822d.mo13802v()));
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return this.tSerializer.getDescriptor();
    }

    @Override // p000.InterfaceC40615et5
    public final void serialize(InterfaceC48140rb1 encoder, T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC32389Di2 m111821e = C32155Ci2.m111821e(encoder);
        m111821e.mo102402m(transformSerialize(C45763na6.m23494c(m111821e.mo102403d(), value, this.tSerializer)));
    }

    public AbstractC51767xi2 transformDeserialize(AbstractC51767xi2 element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return element;
    }

    public AbstractC51767xi2 transformSerialize(AbstractC51767xi2 element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return element;
    }
}
