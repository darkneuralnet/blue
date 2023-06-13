package p000;

import com.fasterxml.jackson.databind.ObjectReader;
import java.io.IOException;
import okhttp3.ResponseBody;
/* renamed from: th2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49386th2<T> implements InterfaceC48496sB0<ResponseBody, T> {

    /* renamed from: a */
    public final ObjectReader f110871a;

    public C49386th2(ObjectReader objectReader) {
        this.f110871a = objectReader;
    }

    @Override // p000.InterfaceC48496sB0
    /* renamed from: a */
    public T convert(ResponseBody responseBody) throws IOException {
        try {
            return (T) this.f110871a.readValue(responseBody.charStream());
        } finally {
            responseBody.close();
        }
    }
}
