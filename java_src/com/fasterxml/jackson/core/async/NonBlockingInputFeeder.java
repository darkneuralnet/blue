package com.fasterxml.jackson.core.async;
/* loaded from: classes5.dex */
public interface NonBlockingInputFeeder {
    void endOfInput();

    boolean needMoreInput();
}
