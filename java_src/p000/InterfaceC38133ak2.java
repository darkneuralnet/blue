package p000;

import com.amazonaws.services.p026s3.internal.Constants;
import java.nio.charset.Charset;
import java.security.MessageDigest;
/* renamed from: ak2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC38133ak2 {

    /* renamed from: a */
    public static final Charset f51105a = Charset.forName(Constants.DEFAULT_ENCODING);

    /* renamed from: a */
    void mo3854a(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
