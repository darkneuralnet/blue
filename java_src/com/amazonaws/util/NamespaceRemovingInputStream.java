package com.amazonaws.util;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes4.dex */
class NamespaceRemovingInputStream extends SdkFilterInputStream {
    private static final int BUFFER_SIZE = 200;
    private boolean hasRemovedNamespace;
    private final byte[] lookAheadData;

    /* loaded from: classes4.dex */
    public static final class StringPrefixSlicer {

        /* renamed from: s */
        private String f68608s;

        public StringPrefixSlicer(String str) {
            this.f68608s = str;
        }

        public String getString() {
            return this.f68608s;
        }

        public boolean removePrefix(String str) {
            if (!this.f68608s.startsWith(str)) {
                return false;
            }
            this.f68608s = this.f68608s.substring(str.length());
            return true;
        }

        public boolean removePrefixEndingWith(String str) {
            int indexOf = this.f68608s.indexOf(str);
            if (indexOf < 0) {
                return false;
            }
            this.f68608s = this.f68608s.substring(indexOf + str.length());
            return true;
        }

        public boolean removeRepeatingPrefix(String str) {
            if (!this.f68608s.startsWith(str)) {
                return false;
            }
            while (this.f68608s.startsWith(str)) {
                this.f68608s = this.f68608s.substring(str.length());
            }
            return true;
        }
    }

    public NamespaceRemovingInputStream(InputStream inputStream) {
        super(new BufferedInputStream(inputStream));
        this.lookAheadData = new byte[200];
        this.hasRemovedNamespace = false;
    }

    private int matchXmlNamespaceAttribute(String str) {
        StringPrefixSlicer stringPrefixSlicer = new StringPrefixSlicer(str);
        if (!stringPrefixSlicer.removePrefix("xmlns")) {
            return -1;
        }
        stringPrefixSlicer.removeRepeatingPrefix(" ");
        if (!stringPrefixSlicer.removePrefix("=")) {
            return -1;
        }
        stringPrefixSlicer.removeRepeatingPrefix(" ");
        if (!stringPrefixSlicer.removePrefix("\"") || !stringPrefixSlicer.removePrefixEndingWith("\"")) {
            return -1;
        }
        return str.length() - stringPrefixSlicer.getString().length();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        abortIfNeeded();
        int read = ((FilterInputStream) this).in.read();
        if (read != 120 || this.hasRemovedNamespace) {
            return read;
        }
        this.lookAheadData[0] = (byte) read;
        ((FilterInputStream) this).in.mark(this.lookAheadData.length);
        InputStream inputStream = ((FilterInputStream) this).in;
        byte[] bArr = this.lookAheadData;
        int read2 = inputStream.read(bArr, 1, bArr.length - 1);
        ((FilterInputStream) this).in.reset();
        int matchXmlNamespaceAttribute = matchXmlNamespaceAttribute(new String(this.lookAheadData, 0, read2 + 1, StringUtils.UTF8));
        if (matchXmlNamespaceAttribute > 0) {
            for (int i = 0; i < matchXmlNamespaceAttribute - 1; i++) {
                ((FilterInputStream) this).in.read();
            }
            int read3 = ((FilterInputStream) this).in.read();
            this.hasRemovedNamespace = true;
            return read3;
        }
        return read;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        for (int i3 = 0; i3 < i2; i3++) {
            int read = read();
            if (read == -1) {
                if (i3 == 0) {
                    return -1;
                }
                return i3;
            }
            bArr[i3 + i] = (byte) read;
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
