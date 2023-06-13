package zendesk.support;

import java.io.IOException;
import java.lang.reflect.Type;
import p000.F41;
import zendesk.support.Streams;
/* loaded from: classes8.dex */
public class SupportUiStorage {
    private static final int CACHE_INDEX = 0;
    private static final String LOG_TAG = "SupportUiStorage";
    public static final String REQUEST_MAPPER = "request_id_mapper";
    private final C46153oE1 gson;
    private final F41 storage;

    public SupportUiStorage(F41 f41, C46153oE1 c46153oE1) {
        this.storage = f41;
        this.gson = c46153oE1;
    }

    private static void abortEdit(F41.C2129c c2129c) {
        C33694Ix2.m101447l(LOG_TAG, "Unable to cache data", new Object[0]);
        if (c2129c != null) {
            try {
                c2129c.m107840a();
            } catch (IOException e) {
                C33694Ix2.m101448k(LOG_TAG, "Unable to abort write", e, new Object[0]);
            }
        }
    }

    private static String key(String str) {
        return U31.m82035c(str);
    }

    public <E> E read(String str, final Type type) {
        E e;
        try {
            synchronized (this.storage) {
                e = (E) Streams.use(this.storage.m107847t(key(str)), new Streams.Use<E, F41.C2132e>() { // from class: zendesk.support.SupportUiStorage.1
                    /* JADX WARN: Type inference failed for: r3v4, types: [E, java.lang.Object] */
                    @Override // zendesk.support.Streams.Use
                    public E use(F41.C2132e c2132e) throws Exception {
                        return SupportUiStorage.this.gson.m21557l(Streams.toReader(C34928Oe3.m91751l(c2132e.m107820a(0))), type);
                    }
                });
            }
            return e;
        } catch (IOException unused) {
            C33694Ix2.m101447l(LOG_TAG, "Unable to read from cache", new Object[0]);
            return null;
        }
    }

    public void write(String str, Object obj) {
        F41.C2129c c2129c = null;
        try {
            synchronized (this.storage) {
                c2129c = this.storage.m107849r(key(str));
            }
            if (c2129c != null) {
                Streams.toJson(this.gson, C34928Oe3.m91755h(c2129c.m107835f(0)), obj);
                c2129c.m107836e();
            }
        } catch (IOException unused) {
            abortEdit(c2129c);
        }
    }
}
