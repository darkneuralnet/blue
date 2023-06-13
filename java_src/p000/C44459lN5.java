package p000;

import com.facebook.share.internal.C17296a;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0005H\u0014R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, m28432d2 = {"LlN5;", "Llp;", "Ljava/io/IOException;", "cause", "newTimeoutException", "", "timedOut", "Ljava/net/Socket;", C17296a.f69688o, "Ljava/net/Socket;", "socket", "<init>", "(Ljava/net/Socket;)V", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: lN5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44459lN5 extends C25791lp {

    /* renamed from: a */
    public final Socket f95958a;

    public C44459lN5(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f95958a = socket;
    }

    @Override // p000.C25791lp
    public IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // p000.C25791lp
    public void timedOut() {
        Logger logger;
        Logger logger2;
        try {
            this.f95958a.close();
        } catch (AssertionError e) {
            if (C34928Oe3.m91758e(e)) {
                logger2 = C35396Qe3.f30684a;
                Level level = Level.WARNING;
                logger2.log(level, "Failed to close timed out socket " + this.f95958a, (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            logger = C35396Qe3.f30684a;
            Level level2 = Level.WARNING;
            logger.log(level2, "Failed to close timed out socket " + this.f95958a, (Throwable) e2);
        }
    }
}
