package p000;

import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import okhttp3.ResponseBody;
/* renamed from: tE1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49117tE1<T> implements InterfaceC48496sB0<ResponseBody, T> {

    /* renamed from: a */
    public final C46153oE1 f110190a;

    /* renamed from: b */
    public final AbstractC31862Bb6<T> f110191b;

    public C49117tE1(C46153oE1 c46153oE1, AbstractC31862Bb6<T> abstractC31862Bb6) {
        this.f110190a = c46153oE1;
        this.f110191b = abstractC31862Bb6;
    }

    @Override // p000.InterfaceC48496sB0
    /* renamed from: a */
    public T convert(ResponseBody responseBody) throws IOException {
        JsonReader m21548u = this.f110190a.m21548u(responseBody.charStream());
        try {
            T read = this.f110191b.read(m21548u);
            if (m21548u.peek() == JsonToken.END_DOCUMENT) {
                return read;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
