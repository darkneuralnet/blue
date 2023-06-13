package com.google.protobuf;

import java.io.IOException;
/* renamed from: com.google.protobuf.D */
/* loaded from: classes6.dex */
public interface InterfaceC18462D extends InterfaceC51031wT2 {

    /* renamed from: com.google.protobuf.D$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18463a extends InterfaceC51031wT2, Cloneable {
        /* renamed from: E */
        InterfaceC18462D mo46033E();

        InterfaceC18462D build();

        /* renamed from: j0 */
        InterfaceC18463a mo46331j0(InterfaceC18462D interfaceC18462D);

        /* renamed from: l2 */
        InterfaceC18463a mo46028l2(AbstractC18516f abstractC18516f, C18525k c18525k) throws IOException;
    }

    /* renamed from: d */
    AbstractC18504e mo46335d();

    /* renamed from: f */
    void mo46049f(CodedOutputStream codedOutputStream) throws IOException;

    VH3<? extends InterfaceC18462D> getParserForType();

    int getSerializedSize();

    InterfaceC18463a newBuilderForType();

    InterfaceC18463a toBuilder();
}
