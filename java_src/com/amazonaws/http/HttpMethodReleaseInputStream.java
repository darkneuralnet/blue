package com.amazonaws.http;

import com.amazonaws.internal.SdkInputStream;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.client.methods.AbortableHttpRequest;
/* loaded from: classes2.dex */
public class HttpMethodReleaseInputStream extends SdkInputStream {
    private static final Log log = LogFactory.getLog(HttpMethodReleaseInputStream.class);
    private boolean alreadyReleased;
    private HttpEntityEnclosingRequest httpRequest;

    /* renamed from: in */
    private InputStream f68559in;
    private boolean underlyingStreamConsumed;

    public HttpMethodReleaseInputStream(HttpEntityEnclosingRequest httpEntityEnclosingRequest) {
        this.httpRequest = httpEntityEnclosingRequest;
        try {
            this.f68559in = httpEntityEnclosingRequest.getEntity().getContent();
        } catch (IOException e) {
            Log log2 = log;
            if (log2.isWarnEnabled()) {
                log2.warn("Unable to obtain HttpMethod's response data stream", e);
            }
            try {
                httpEntityEnclosingRequest.getEntity().getContent().close();
            } catch (Exception unused) {
            }
            this.f68559in = new ByteArrayInputStream(new byte[0]);
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        try {
            return this.f68559in.available();
        } catch (IOException e) {
            releaseConnection();
            Log log2 = log;
            if (log2.isDebugEnabled()) {
                log2.debug("Released HttpMethod as its response data stream threw an exception", e);
            }
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.alreadyReleased) {
            releaseConnection();
            Log log2 = log;
            if (log2.isDebugEnabled()) {
                log2.debug("Released HttpMethod as its response data stream is closed");
            }
        }
        this.f68559in.close();
    }

    public void finalize() throws Throwable {
        if (!this.alreadyReleased) {
            Log log2 = log;
            if (log2.isWarnEnabled()) {
                log2.warn("Attempting to release HttpMethod in finalize() as its response data stream has gone out of scope. This attempt will not always succeed and cannot be relied upon! Please ensure S3 response data streams are always fully consumed or closed to avoid HTTP connection starvation.");
            }
            releaseConnection();
            if (log2.isWarnEnabled()) {
                log2.warn("Successfully released HttpMethod in finalize(). You were lucky this time... Please ensure S3 response data streams are always fully consumed or closed.");
            }
        }
        super.finalize();
    }

    public HttpEntityEnclosingRequest getHttpRequest() {
        return this.httpRequest;
    }

    @Override // com.amazonaws.internal.SdkInputStream
    public InputStream getWrappedInputStream() {
        return this.f68559in;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            int read = this.f68559in.read();
            if (read == -1) {
                this.underlyingStreamConsumed = true;
                if (!this.alreadyReleased) {
                    releaseConnection();
                    Log log2 = log;
                    if (log2.isDebugEnabled()) {
                        log2.debug("Released HttpMethod as its response data stream is fully consumed");
                    }
                }
            }
            return read;
        } catch (IOException e) {
            releaseConnection();
            Log log3 = log;
            if (log3.isDebugEnabled()) {
                log3.debug("Released HttpMethod as its response data stream threw an exception", e);
            }
            throw e;
        }
    }

    public void releaseConnection() throws IOException {
        if (!this.alreadyReleased) {
            if (!this.underlyingStreamConsumed) {
                AbortableHttpRequest abortableHttpRequest = this.httpRequest;
                if (abortableHttpRequest instanceof AbortableHttpRequest) {
                    abortableHttpRequest.abort();
                }
            }
            this.f68559in.close();
            this.alreadyReleased = true;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            int read = this.f68559in.read(bArr, i, i2);
            if (read == -1) {
                this.underlyingStreamConsumed = true;
                if (!this.alreadyReleased) {
                    releaseConnection();
                    Log log2 = log;
                    if (log2.isDebugEnabled()) {
                        log2.debug("Released HttpMethod as its response data stream is fully consumed");
                    }
                }
            }
            return read;
        } catch (IOException e) {
            releaseConnection();
            Log log3 = log;
            if (log3.isDebugEnabled()) {
                log3.debug("Released HttpMethod as its response data stream threw an exception", e);
            }
            throw e;
        }
    }
}
