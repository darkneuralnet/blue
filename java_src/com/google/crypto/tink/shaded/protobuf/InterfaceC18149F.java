package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
/* renamed from: com.google.crypto.tink.shaded.protobuf.F */
/* loaded from: classes6.dex */
public interface InterfaceC18149F extends InterfaceC51624xT2 {

    /* renamed from: com.google.crypto.tink.shaded.protobuf.F$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC18150a extends InterfaceC51624xT2, Cloneable {
        /* renamed from: E */
        InterfaceC18149F mo47456E();

        InterfaceC18149F build();

        /* renamed from: f3 */
        InterfaceC18150a mo47793f3(InterfaceC18149F interfaceC18149F);
    }

    /* renamed from: d */
    AbstractC18199g mo47796d();

    /* renamed from: e */
    byte[] mo47795e();

    /* renamed from: f */
    void mo47475f(CodedOutputStream codedOutputStream) throws IOException;

    WH3<? extends InterfaceC18149F> getParserForType();

    int getSerializedSize();

    InterfaceC18150a newBuilderForType();

    InterfaceC18150a toBuilder();
}
