package com.fasterxml.jackson.core.p030io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;
/* renamed from: com.fasterxml.jackson.core.io.OutputDecorator */
/* loaded from: classes5.dex */
public abstract class OutputDecorator implements Serializable {
    public abstract OutputStream decorate(IOContext iOContext, OutputStream outputStream) throws IOException;

    public abstract Writer decorate(IOContext iOContext, Writer writer) throws IOException;
}
