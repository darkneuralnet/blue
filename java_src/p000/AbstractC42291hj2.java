package p000;

import java.io.UnsupportedEncodingException;
import p000.EM4;
/* renamed from: hj2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC42291hj2<T> extends AbstractC45006mI4<T> {
    protected static final String PROTOCOL_CHARSET = "utf-8";
    private static final String PROTOCOL_CONTENT_TYPE = String.format("application/json; charset=%s", PROTOCOL_CHARSET);
    private EM4.InterfaceC1800b<T> mListener;
    private final Object mLock;
    private final String mRequestBody;

    @Deprecated
    public AbstractC42291hj2(String str, String str2, EM4.InterfaceC1800b<T> interfaceC1800b, EM4.InterfaceC1799a interfaceC1799a) {
        this(-1, str, str2, interfaceC1800b, interfaceC1799a);
    }

    @Override // p000.AbstractC45006mI4
    public void cancel() {
        super.cancel();
        synchronized (this.mLock) {
            this.mListener = null;
        }
    }

    @Override // p000.AbstractC45006mI4
    public void deliverResponse(T t) {
        EM4.InterfaceC1800b<T> interfaceC1800b;
        synchronized (this.mLock) {
            interfaceC1800b = this.mListener;
        }
        if (interfaceC1800b != null) {
            interfaceC1800b.onResponse(t);
        }
    }

    @Override // p000.AbstractC45006mI4
    public byte[] getBody() {
        try {
            String str = this.mRequestBody;
            if (str == null) {
                return null;
            }
            return str.getBytes(PROTOCOL_CHARSET);
        } catch (UnsupportedEncodingException unused) {
            C34841Nu6.m93201f("Unsupported Encoding while trying to get the bytes of %s using %s", this.mRequestBody, PROTOCOL_CHARSET);
            return null;
        }
    }

    @Override // p000.AbstractC45006mI4
    public String getBodyContentType() {
        return PROTOCOL_CONTENT_TYPE;
    }

    @Override // p000.AbstractC45006mI4
    @Deprecated
    public byte[] getPostBody() {
        return getBody();
    }

    @Override // p000.AbstractC45006mI4
    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    @Override // p000.AbstractC45006mI4
    public abstract EM4<T> parseNetworkResponse(O73 o73);

    public AbstractC42291hj2(int i, String str, String str2, EM4.InterfaceC1800b<T> interfaceC1800b, EM4.InterfaceC1799a interfaceC1799a) {
        super(i, str, interfaceC1799a);
        this.mLock = new Object();
        this.mListener = interfaceC1800b;
        this.mRequestBody = str2;
    }
}
