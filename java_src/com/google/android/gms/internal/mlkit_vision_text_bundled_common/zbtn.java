package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.io.IOException;
/* loaded from: classes5.dex */
public final class zbtn extends IOException {
    public zbtn() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zbtn(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public zbtn(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
