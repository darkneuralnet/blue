package com.amazonaws.util;
/* loaded from: classes4.dex */
public interface EncodingScheme {
    byte[] decode(String str);

    String encodeAsString(byte[] bArr);
}
