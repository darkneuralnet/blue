package com.fasterxml.jackson.core.async;

import java.io.IOException;
/* loaded from: classes5.dex */
public interface ByteArrayFeeder extends NonBlockingInputFeeder {
    void feedInput(byte[] bArr, int i, int i2) throws IOException;
}
