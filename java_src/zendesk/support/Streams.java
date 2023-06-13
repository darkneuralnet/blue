package zendesk.support;

import java.io.Closeable;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.lang.reflect.Type;
/* loaded from: classes8.dex */
public class Streams {

    /* loaded from: classes8.dex */
    public interface Use<R, P extends Closeable> {
        R use(P p) throws Exception;
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static <T> T fromJson(final C46153oE1 c46153oE1, AN5 an5, final Type type) {
        return (T) use(toReader(an5), new Use<T, Reader>() { // from class: zendesk.support.Streams.1
            /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object] */
            @Override // zendesk.support.Streams.Use
            public T use(Reader reader) throws Exception {
                return C46153oE1.this.m21557l(reader, type);
            }
        });
    }

    public static void toJson(final C46153oE1 c46153oE1, InterfaceC50872wB5 interfaceC50872wB5, final Object obj) {
        use(toWriter(interfaceC50872wB5), new Use<Void, Writer>() { // from class: zendesk.support.Streams.2
            @Override // zendesk.support.Streams.Use
            public Void use(Writer writer) throws Exception {
                C46153oE1.this.m21572B(obj, writer);
                return null;
            }
        });
    }

    public static Reader toReader(AN5 an5) {
        if (an5 instanceof InterfaceC46046o30) {
            return new InputStreamReader(((InterfaceC46046o30) an5).mo21930w3());
        }
        return new InputStreamReader(C34928Oe3.m91759d(an5).mo21930w3());
    }

    public static Writer toWriter(InterfaceC50872wB5 interfaceC50872wB5) {
        if (interfaceC50872wB5 instanceof InterfaceC45453n30) {
            return new OutputStreamWriter(((InterfaceC45453n30) interfaceC50872wB5).mo24523u3());
        }
        return new OutputStreamWriter(C34928Oe3.m91760c(interfaceC50872wB5).mo24523u3());
    }

    public static <R, P extends Closeable> R use(P p, Use<R, P> use) {
        if (p == null) {
            return null;
        }
        try {
            return use.use(p);
        } catch (Exception e) {
            C33694Ix2.m101453f("Streams", "Error using stream", e, new Object[0]);
            return null;
        } finally {
            closeQuietly(p);
        }
    }
}
