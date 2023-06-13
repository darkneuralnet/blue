package p000;

import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC44940mB1;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007¨\u0006\u0007"}, m28432d2 = {"T", "", "name", "LKj2;", "primitiveSerializer", "LMs5;", C17296a.f69688o, "kotlinx-serialization-core"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: J22 */
/* loaded from: classes8.dex */
public final class J22 {

    @Metadata(m28433d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0019\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m28432d2 = {"J22$a", "LmB1;", "", "LKj2;", "childSerializers", "()[LKj2;", "Lrb1;", "encoder", "value", "", "serialize", "(Lrb1;Ljava/lang/Object;)V", "LGV0;", "decoder", "deserialize", "(LGV0;)Ljava/lang/Object;", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: J22$a */
    /* loaded from: classes8.dex */
    public static final class C3869a implements InterfaceC44940mB1<T> {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC34036Kj2<T> f16677a;

        public C3869a(InterfaceC34036Kj2<T> interfaceC34036Kj2) {
            this.f16677a = interfaceC34036Kj2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.InterfaceC44940mB1
        public InterfaceC34036Kj2<?>[] childSerializers() {
            return new InterfaceC34036Kj2[]{this.f16677a};
        }

        @Override // p000.E01
        public T deserialize(GV0 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
        public InterfaceC34588Ms5 getDescriptor() {
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // p000.InterfaceC40615et5
        public void serialize(InterfaceC48140rb1 encoder, T t) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // p000.InterfaceC44940mB1
        public InterfaceC34036Kj2<?>[] typeParametersSerializers() {
            return InterfaceC44940mB1.C25934a.m26189a(this);
        }
    }

    /* renamed from: a */
    public static final <T> InterfaceC34588Ms5 m101283a(String name, InterfaceC34036Kj2<T> primitiveSerializer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        return new I22(name, new C3869a(primitiveSerializer));
    }
}
