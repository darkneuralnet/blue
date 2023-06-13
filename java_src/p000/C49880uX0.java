package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC41113fk0;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001c\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0011"}, m28432d2 = {"LuX0;", "Lfk0$a;", "Ljava/net/HttpURLConnection;", "connection", "LpI4;", "request", "", C17296a.f69688o, "Ljava/io/InputStream;", "inputStream", "b", "c", "Ljava/io/IOException;", "exception", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: uX0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49880uX0 implements InterfaceC41113fk0.InterfaceC20497a {
    @Override // p000.InterfaceC41113fk0.InterfaceC20497a
    /* renamed from: a */
    public void mo10118a(HttpURLConnection connection, InterfaceC46785pI4 request) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(request, "request");
    }

    @Override // p000.InterfaceC41113fk0.InterfaceC20497a
    /* renamed from: b */
    public InputStream mo10117b(InterfaceC46785pI4 request, InputStream inputStream) {
        Intrinsics.checkNotNullParameter(request, "request");
        return inputStream;
    }

    @Override // p000.InterfaceC41113fk0.InterfaceC20497a
    /* renamed from: c */
    public void mo10116c(InterfaceC46785pI4 request) {
        Intrinsics.checkNotNullParameter(request, "request");
    }

    @Override // p000.InterfaceC41113fk0.InterfaceC20497a
    /* renamed from: d */
    public void mo10115d(InterfaceC46785pI4 request, IOException exception) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(exception, "exception");
    }
}
