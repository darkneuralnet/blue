package p000;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;
/* renamed from: Vy0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36743Vy0 {
    private C36743Vy0() {
    }

    /* renamed from: a */
    public static void m79040a(Object obj) {
        Class<?> cls = obj.getClass();
        String replace = cls.getName().replace(CoreConstants.DOT, JsonPointer.SEPARATOR);
        if (!m79038c(replace)) {
            ClassLoader classLoader = cls.getClassLoader();
            m79039b(classLoader.getResourceAsStream(replace + ".class"));
        }
    }

    /* renamed from: b */
    public static void m79039b(InputStream inputStream) {
        if (inputStream != null) {
            try {
                DataInputStream dataInputStream = new DataInputStream(inputStream);
                dataInputStream.readInt();
                int readUnsignedShort = dataInputStream.readUnsignedShort();
                dataInputStream.close();
                if (readUnsignedShort == 65535) {
                    return;
                }
                throw new IllegalStateException("ASM9_EXPERIMENTAL can only be used by classes compiled with --enable-preview");
            } catch (IOException e) {
                throw new IllegalStateException("I/O error, can't check class version", e);
            }
        }
        throw new IllegalStateException("Bytecode not available, can't check class version");
    }

    /* renamed from: c */
    public static boolean m79038c(String str) {
        if (!str.startsWith("com/nimbusds/jose/shaded/ow2asm/")) {
            return false;
        }
        if (!str.contains("Test$")) {
            if (!Pattern.matches("com/nimbusds/jose/shaded/ow2asm/util/Trace(Annotation|Class|Field|Method|Module|RecordComponent|Signature)Visitor(\\$.*)?", str)) {
                if (!Pattern.matches("com/nimbusds/jose/shaded/ow2asm/util/Check(Annotation|Class|Field|Method|Module|RecordComponent|Signature)Adapter(\\$.*)?", str)) {
                    return false;
                }
            }
        }
        return true;
    }
}
