package p000;

import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
/* renamed from: RG6 */
/* loaded from: classes6.dex */
public final class RG6 extends HandlerThread implements Handler.Callback {

    /* renamed from: c */
    public static Handler f31782c;

    /* renamed from: b */
    public InterfaceC52907zd6 f31783b;

    public RG6(String str) {
        super(str);
    }

    /* renamed from: a */
    public void m87000a(Message message) {
        Handler handler = f31782c;
        if (handler != null) {
            handler.sendMessage(message);
            return;
        }
        Handler handler2 = new Handler(getLooper(), this);
        f31782c = handler2;
        handler2.sendMessage(message);
    }

    /* renamed from: b */
    public final void m86999b() {
        Handler handler = f31782c;
        if (handler != null) {
            handler.removeMessages(1, null);
            f31782c = null;
        }
    }

    /* renamed from: c */
    public final C43789kF0 m86998c(C43789kF0 c43789kF0, U74 u74) {
        List<LatLng> m29145g = c43789kF0.m29145g();
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        int i = 0;
        while (i < m29145g.size() - 1) {
            LatLng latLng = m29145g.get(i);
            i++;
            LatLng latLng2 = m29145g.get(i);
            if (c43789kF0.m29143i()) {
                Point m81933c = u74.m81933c(latLng);
                Point m81933c2 = u74.m81933c(latLng2);
                UT3 m109267b = C1768EG.m109267b(c43789kF0.m29146f(), m81933c, m81933c2);
                for (double d = 0.0d; d < 1.005d; d += 0.005d) {
                    c43789kF0.m29144h().m50607s(u74.m81935a(C1768EG.m109266c(m81933c, m109267b.m81471a(), m109267b.m81470b(), m81933c2, d)));
                }
            } else {
                C38746bm2 m109268a = C1768EG.m109268a(c43789kF0.m29146f(), latLng, latLng2);
                for (double d2 = 0.0d; d2 < 1.005d; d2 += 0.005d) {
                    c43789kF0.m29144h().m50607s(C1768EG.m109265d(latLng, m109268a.m64033a(), m109268a.m64032b(), latLng2, d2));
                }
            }
        }
        Long valueOf2 = Long.valueOf(System.currentTimeMillis());
        Log.d("WorkerHandlerThread", "Curve-Fit workerThread finished, took: " + (valueOf2.longValue() - valueOf.longValue()) + " ms");
        return c43789kF0;
    }

    /* renamed from: d */
    public void m86997d(InterfaceC52907zd6 interfaceC52907zd6) {
        this.f31783b = interfaceC52907zd6;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            C52217yT2 c52217yT2 = (C52217yT2) message.obj;
            this.f31783b.mo954a(Message.obtain(null, 2, m86998c(c52217yT2.m3471a(), c52217yT2.m3470b())));
            return false;
        }
        return false;
    }

    @Override // android.os.HandlerThread
    public boolean quit() {
        m86999b();
        return super.quit();
    }
}
