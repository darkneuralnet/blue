package p000;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;
/* renamed from: en4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C40554en4 {

    /* renamed from: a */
    public static final byte f78855a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    public static final byte f78856b = Byte.parseByte("00001111", 2);

    /* renamed from: b */
    public static String m42558b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: c */
    public static byte[] m42557c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    /* renamed from: a */
    public String m42559a() {
        byte[] m42557c = m42557c(UUID.randomUUID(), new byte[17]);
        byte b = m42557c[0];
        m42557c[16] = b;
        m42557c[0] = (byte) ((b & f78856b) | f78855a);
        return m42558b(m42557c);
    }
}
