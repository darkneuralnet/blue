package p000;

import com.facebook.share.internal.C17296a;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005R\u001c\u0010\u000b\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u000e"}, m28432d2 = {"LKx5;", "", "", "byteArray", C17296a.f69688o, "", "string", "b", "Ljava/security/MessageDigest;", "kotlin.jvm.PlatformType", "Ljava/security/MessageDigest;", "digest", "<init>", "()V", "checkout-core_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* renamed from: Kx5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34165Kx5 {

    /* renamed from: a */
    public static final C34165Kx5 f20452a = new C34165Kx5();

    /* renamed from: b */
    public static final MessageDigest f20453b = MessageDigest.getInstance("SHA-256");

    private C34165Kx5() {
    }

    /* renamed from: a */
    public final byte[] m98050a(byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        MessageDigest messageDigest = f20453b;
        messageDigest.reset();
        messageDigest.update(byteArray);
        byte[] digest = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digest, "digest.digest()");
        return digest;
    }

    /* renamed from: b */
    public final String m98049b(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        Charset charset = Charsets.UTF_8;
        byte[] bytes = string.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return new String(m98050a(bytes), charset);
    }
}
