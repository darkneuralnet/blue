package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
/* loaded from: classes6.dex */
public class FirebasePerfUrlConnection {
    private FirebasePerfUrlConnection() {
    }

    /* renamed from: a */
    public static Object m47058a(C44014kd6 c44014kd6, C41612ga6 c41612ga6, Timer timer) throws IOException {
        timer.m47032h();
        long m47034e = timer.m47034e();
        M73 m95789c = M73.m95789c(c41612ga6);
        try {
            URLConnection m28713a = c44014kd6.m28713a();
            if (m28713a instanceof HttpsURLConnection) {
                return new C43696k52((HttpsURLConnection) m28713a, timer, m95789c).getContent();
            }
            if (m28713a instanceof HttpURLConnection) {
                return new C43103j52((HttpURLConnection) m28713a, timer, m95789c).getContent();
            }
            return m28713a.getContent();
        } catch (IOException e) {
            m95789c.m95778o(m47034e);
            m95789c.m95774s(timer.m47036c());
            m95789c.m95772u(c44014kd6.toString());
            N73.m94350d(m95789c);
            throw e;
        }
    }

    /* renamed from: b */
    public static Object m47057b(C44014kd6 c44014kd6, Class[] clsArr, C41612ga6 c41612ga6, Timer timer) throws IOException {
        timer.m47032h();
        long m47034e = timer.m47034e();
        M73 m95789c = M73.m95789c(c41612ga6);
        try {
            URLConnection m28713a = c44014kd6.m28713a();
            if (m28713a instanceof HttpsURLConnection) {
                return new C43696k52((HttpsURLConnection) m28713a, timer, m95789c).getContent(clsArr);
            }
            if (m28713a instanceof HttpURLConnection) {
                return new C43103j52((HttpURLConnection) m28713a, timer, m95789c).getContent(clsArr);
            }
            return m28713a.getContent(clsArr);
        } catch (IOException e) {
            m95789c.m95778o(m47034e);
            m95789c.m95774s(timer.m47036c());
            m95789c.m95772u(c44014kd6.toString());
            N73.m94350d(m95789c);
            throw e;
        }
    }

    /* renamed from: c */
    public static InputStream m47056c(C44014kd6 c44014kd6, C41612ga6 c41612ga6, Timer timer) throws IOException {
        timer.m47032h();
        long m47034e = timer.m47034e();
        M73 m95789c = M73.m95789c(c41612ga6);
        try {
            URLConnection m28713a = c44014kd6.m28713a();
            if (m28713a instanceof HttpsURLConnection) {
                return new C43696k52((HttpsURLConnection) m28713a, timer, m95789c).getInputStream();
            }
            if (m28713a instanceof HttpURLConnection) {
                return new C43103j52((HttpURLConnection) m28713a, timer, m95789c).getInputStream();
            }
            return m28713a.getInputStream();
        } catch (IOException e) {
            m95789c.m95778o(m47034e);
            m95789c.m95774s(timer.m47036c());
            m95789c.m95772u(c44014kd6.toString());
            N73.m94350d(m95789c);
            throw e;
        }
    }

    @Keep
    public static Object getContent(URL url) throws IOException {
        return m47058a(new C44014kd6(url), C41612ga6.m39128k(), new Timer());
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        if (obj instanceof HttpsURLConnection) {
            return new C43696k52((HttpsURLConnection) obj, new Timer(), M73.m95789c(C41612ga6.m39128k()));
        }
        if (obj instanceof HttpURLConnection) {
            return new C43103j52((HttpURLConnection) obj, new Timer(), M73.m95789c(C41612ga6.m39128k()));
        }
        return obj;
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        return m47056c(new C44014kd6(url), C41612ga6.m39128k(), new Timer());
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        return m47057b(new C44014kd6(url), clsArr, C41612ga6.m39128k(), new Timer());
    }
}
