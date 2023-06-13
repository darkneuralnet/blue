package p000;

import com.amazonaws.services.p026s3.internal.Constants;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
/* renamed from: sE1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48524sE1<T> implements InterfaceC48496sB0<T, RequestBody> {

    /* renamed from: c */
    public static final MediaType f108483c = MediaType.get("application/json; charset=UTF-8");

    /* renamed from: d */
    public static final Charset f108484d = Charset.forName(Constants.DEFAULT_ENCODING);

    /* renamed from: a */
    public final C46153oE1 f108485a;

    /* renamed from: b */
    public final AbstractC31862Bb6<T> f108486b;

    public C48524sE1(C46153oE1 c46153oE1, AbstractC31862Bb6<T> abstractC31862Bb6) {
        this.f108485a = c46153oE1;
        this.f108486b = abstractC31862Bb6;
    }

    @Override // p000.InterfaceC48496sB0
    /* renamed from: a */
    public RequestBody convert(T t) throws IOException {
        C42488i30 c42488i30 = new C42488i30();
        JsonWriter m21547v = this.f108485a.m21547v(new OutputStreamWriter(c42488i30.mo24523u3(), f108484d));
        this.f108486b.write(m21547v, t);
        m21547v.close();
        return RequestBody.create(f108483c, c42488i30.mo21936h1());
    }
}
