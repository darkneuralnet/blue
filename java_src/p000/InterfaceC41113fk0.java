package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001b\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, m28432d2 = {"Lfk0;", "", "LpI4;", "request", "LFM4;", C17296a.f69688o, "b", "(LpI4;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: fk0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC41113fk0 {

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH&J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&¨\u0006\u000f"}, m28432d2 = {"Lfk0$a;", "", "Ljava/net/HttpURLConnection;", "connection", "LpI4;", "request", "", C17296a.f69688o, "c", "Ljava/io/InputStream;", "inputStream", "b", "Ljava/io/IOException;", "exception", DateTokenConverter.CONVERTER_KEY, "fuel"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: fk0$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC20497a {
        /* renamed from: a */
        void mo10118a(HttpURLConnection httpURLConnection, InterfaceC46785pI4 interfaceC46785pI4);

        /* renamed from: b */
        InputStream mo10117b(InterfaceC46785pI4 interfaceC46785pI4, InputStream inputStream);

        /* renamed from: c */
        void mo10116c(InterfaceC46785pI4 interfaceC46785pI4);

        /* renamed from: d */
        void mo10115d(InterfaceC46785pI4 interfaceC46785pI4, IOException iOException);
    }

    /* renamed from: a */
    FM4 mo40979a(InterfaceC46785pI4 interfaceC46785pI4);

    /* renamed from: b */
    Object mo40978b(InterfaceC46785pI4 interfaceC46785pI4, Continuation<? super FM4> continuation);
}
