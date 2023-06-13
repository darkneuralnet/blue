package p000;

import com.fasterxml.jackson.databind.ObjectWriter;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
/* renamed from: sh2  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48793sh2<T> implements InterfaceC48496sB0<T, RequestBody> {

    /* renamed from: b */
    public static final MediaType f109121b = MediaType.get("application/json; charset=UTF-8");

    /* renamed from: a */
    public final ObjectWriter f109122a;

    public C48793sh2(ObjectWriter objectWriter) {
        this.f109122a = objectWriter;
    }

    @Override // p000.InterfaceC48496sB0
    /* renamed from: a */
    public RequestBody convert(T t) throws IOException {
        return RequestBody.create(f109121b, this.f109122a.writeValueAsBytes(t));
    }
}
