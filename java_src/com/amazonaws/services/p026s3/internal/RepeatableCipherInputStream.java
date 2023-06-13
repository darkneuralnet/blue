package com.amazonaws.services.p026s3.internal;

import com.amazonaws.services.p026s3.internal.crypto.CipherFactory;
import java.io.FilterInputStream;
import java.io.InputStream;
import javax.crypto.CipherInputStream;
/* renamed from: com.amazonaws.services.s3.internal.RepeatableCipherInputStream */
/* loaded from: classes3.dex */
public class RepeatableCipherInputStream extends AbstractRepeatableCipherInputStream<CipherFactory> {
    public RepeatableCipherInputStream(InputStream inputStream, CipherFactory cipherFactory) {
        super(inputStream, newCipherInputStream(inputStream, cipherFactory), cipherFactory);
    }

    private static FilterInputStream newCipherInputStream(InputStream inputStream, CipherFactory cipherFactory) {
        return new CipherInputStream(inputStream, cipherFactory.createCipher());
    }

    @Override // com.amazonaws.services.p026s3.internal.AbstractRepeatableCipherInputStream
    public FilterInputStream createCipherInputStream(InputStream inputStream, CipherFactory cipherFactory) {
        return newCipherInputStream(inputStream, cipherFactory);
    }
}
