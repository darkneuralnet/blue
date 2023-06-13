package zendesk.core;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import p000.F41;
/* loaded from: classes8.dex */
class ZendeskDiskLruCache implements BaseStorage {
    private static final int CACHE_INDEX = 0;
    private static final int ITEMS_PER_KEY = 1;
    private static final String LOG_TAG = "DiskLruStorage";
    private static final int VERSION_ONE = 1;
    private final File directory;
    private final long maxSize;
    private final Serializer serializer;
    private F41 storage;

    public ZendeskDiskLruCache(File file, Serializer serializer, int i) {
        this.directory = file;
        long j = i;
        this.maxSize = j;
        this.storage = openCache(file, j);
        this.serializer = serializer;
    }

    private void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private String getString(String str, int i) {
        Closeable closeable;
        Throwable th;
        AN5 an5;
        String str2;
        Closeable closeable2 = null;
        try {
            F41.C2132e m107847t = this.storage.m107847t(key(str));
            if (m107847t != null) {
                an5 = C34928Oe3.m91751l(m107847t.m107820a(i));
                try {
                    closeable = C34928Oe3.m91759d(an5);
                    try {
                        try {
                            closeable2 = an5;
                            str2 = closeable.mo21932r1();
                        } catch (IOException e) {
                            e = e;
                            C33694Ix2.m101448k(LOG_TAG, "Unable to read from cache", e, new Object[0]);
                            close(an5);
                            close(closeable);
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        close(an5);
                        close(closeable);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    closeable = null;
                } catch (Throwable th3) {
                    th = th3;
                    closeable = null;
                    close(an5);
                    close(closeable);
                    throw th;
                }
            } else {
                str2 = null;
                closeable = null;
            }
            close(closeable2);
            close(closeable);
            return str2;
        } catch (IOException e3) {
            e = e3;
            an5 = null;
            closeable = null;
        } catch (Throwable th4) {
            closeable = null;
            th = th4;
            an5 = null;
        }
    }

    private String key(String str) {
        return U31.m82035c(str);
    }

    private String keyMediaType(String str) {
        return key(String.format(Locale.US, "%s_content_type", str));
    }

    private F41 openCache(File file, long j) {
        try {
            return F41.m107844x(file, 1, 1, j);
        } catch (IOException unused) {
            C33694Ix2.m101447l(LOG_TAG, "Unable to open cache", new Object[0]);
            return null;
        }
    }

    private void putString(String str, int i, String str2) {
        try {
            write(str, i, C34928Oe3.m91751l(new ByteArrayInputStream(str2.getBytes(com.amazonaws.services.p026s3.internal.Constants.DEFAULT_ENCODING))));
        } catch (UnsupportedEncodingException e) {
            C33694Ix2.m101448k(LOG_TAG, "Unable to encode string", e, new Object[0]);
        }
    }

    private void write(String str, int i, AN5 an5) {
        Closeable closeable;
        F41.C2129c m107849r;
        InterfaceC45453n30 interfaceC45453n30 = null;
        try {
            synchronized (this.directory) {
                m107849r = this.storage.m107849r(key(str));
            }
            if (m107849r != null) {
                closeable = C34928Oe3.m91755h(m107849r.m107835f(i));
                try {
                    try {
                        interfaceC45453n30 = C34928Oe3.m91760c(closeable);
                        interfaceC45453n30.mo24532R2(an5);
                        interfaceC45453n30.flush();
                        m107849r.m107836e();
                    } catch (IOException e) {
                        e = e;
                        C33694Ix2.m101448k(LOG_TAG, "Unable to cache data", e, new Object[0]);
                        close(interfaceC45453n30);
                        close(closeable);
                        close(an5);
                    }
                } catch (Throwable th) {
                    th = th;
                    close(interfaceC45453n30);
                    close(closeable);
                    close(an5);
                    throw th;
                }
            } else {
                closeable = null;
            }
        } catch (IOException e2) {
            e = e2;
            closeable = null;
        } catch (Throwable th2) {
            th = th2;
            closeable = null;
            close(interfaceC45453n30);
            close(closeable);
            close(an5);
            throw th;
        }
        close(interfaceC45453n30);
        close(closeable);
        close(an5);
    }

    @Override // zendesk.core.BaseStorage
    public void clear() {
        F41 f41 = this.storage;
        if (f41 == null) {
            return;
        }
        try {
            try {
                if (f41.m107846u() != null && this.storage.m107846u().exists() && C43505jm0.m29947j(this.storage.m107846u().listFiles())) {
                    this.storage.m107851p();
                } else {
                    this.storage.close();
                }
            } catch (IOException e) {
                C33694Ix2.m101457b(LOG_TAG, "Error clearing cache. Error: %s", e.getMessage());
            }
        } finally {
            this.storage = openCache(this.directory, this.maxSize);
        }
    }

    @Override // zendesk.core.BaseStorage
    public String get(String str) {
        if (this.storage == null) {
            return null;
        }
        return getString(str, 0);
    }

    @Override // zendesk.core.BaseStorage
    public void put(String str, String str2) {
        if (this.storage == null || C44504lS5.m27271d(str2)) {
            return;
        }
        putString(str, 0, str2);
    }

    @Override // zendesk.core.BaseStorage
    public void remove(String str) {
    }

    @Override // zendesk.core.BaseStorage
    public <E> E get(String str, Class<E> cls) {
        if (this.storage == null) {
            return null;
        }
        if (cls.equals(ResponseBody.class)) {
            try {
                F41.C2132e m107847t = this.storage.m107847t(key(str));
                if (m107847t != null) {
                    AN5 m91751l = C34928Oe3.m91751l(m107847t.m107820a(0));
                    long m107819b = m107847t.m107819b(0);
                    String string = getString(keyMediaType(str), 0);
                    return (E) ResponseBody.create(C44504lS5.m27273b(string) ? MediaType.parse(string) : null, m107819b, C34928Oe3.m91759d(m91751l));
                }
                return null;
            } catch (IOException e) {
                C33694Ix2.m101448k(LOG_TAG, "Unable to read from cache", e, new Object[0]);
                return null;
            }
        }
        return (E) this.serializer.deserialize(getString(str, 0), cls);
    }

    @Override // zendesk.core.BaseStorage
    public void put(String str, Object obj) {
        if (this.storage == null) {
            return;
        }
        if (obj instanceof ResponseBody) {
            ResponseBody responseBody = (ResponseBody) obj;
            write(str, 0, responseBody.source());
            putString(keyMediaType(str), 0, responseBody.contentType().toString());
            return;
        }
        put(str, obj != null ? this.serializer.serialize(obj) : null);
    }

    public ZendeskDiskLruCache(File file, long j, F41 f41, Serializer serializer) {
        this.directory = file;
        this.maxSize = j;
        this.storage = f41;
        this.serializer = serializer;
    }
}
