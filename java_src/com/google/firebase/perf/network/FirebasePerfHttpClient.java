package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
/* loaded from: classes6.dex */
public class FirebasePerfHttpClient {
    private FirebasePerfHttpClient() {
    }

    /* renamed from: a */
    public static <T> T m47067a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, Timer timer, C41612ga6 c41612ga6) throws IOException {
        M73 m95789c = M73.m95789c(c41612ga6);
        try {
            m95789c.m95772u(httpHost.toURI() + httpRequest.getRequestLine().getUri()).m95782k(httpRequest.getRequestLine().getMethod());
            Long m94353a = N73.m94353a(httpRequest);
            if (m94353a != null) {
                m95789c.m95779n(m94353a.longValue());
            }
            timer.m47032h();
            m95789c.m95778o(timer.m47034e());
            return (T) httpClient.execute(httpHost, httpRequest, new C45475n52(responseHandler, timer, m95789c));
        } catch (IOException e) {
            m95789c.m95774s(timer.m47036c());
            N73.m94350d(m95789c);
            throw e;
        }
    }

    /* renamed from: b */
    public static <T> T m47066b(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext, Timer timer, C41612ga6 c41612ga6) throws IOException {
        M73 m95789c = M73.m95789c(c41612ga6);
        try {
            m95789c.m95772u(httpHost.toURI() + httpRequest.getRequestLine().getUri()).m95782k(httpRequest.getRequestLine().getMethod());
            Long m94353a = N73.m94353a(httpRequest);
            if (m94353a != null) {
                m95789c.m95779n(m94353a.longValue());
            }
            timer.m47032h();
            m95789c.m95778o(timer.m47034e());
            return (T) httpClient.execute(httpHost, httpRequest, new C45475n52(responseHandler, timer, m95789c), httpContext);
        } catch (IOException e) {
            m95789c.m95774s(timer.m47036c());
            N73.m94350d(m95789c);
            throw e;
        }
    }

    /* renamed from: c */
    public static <T> T m47065c(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, Timer timer, C41612ga6 c41612ga6) throws IOException {
        M73 m95789c = M73.m95789c(c41612ga6);
        try {
            m95789c.m95772u(httpUriRequest.getURI().toString()).m95782k(httpUriRequest.getMethod());
            Long m94353a = N73.m94353a(httpUriRequest);
            if (m94353a != null) {
                m95789c.m95779n(m94353a.longValue());
            }
            timer.m47032h();
            m95789c.m95778o(timer.m47034e());
            return (T) httpClient.execute(httpUriRequest, new C45475n52(responseHandler, timer, m95789c));
        } catch (IOException e) {
            m95789c.m95774s(timer.m47036c());
            N73.m94350d(m95789c);
            throw e;
        }
    }

    /* renamed from: d */
    public static <T> T m47064d(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext, Timer timer, C41612ga6 c41612ga6) throws IOException {
        M73 m95789c = M73.m95789c(c41612ga6);
        try {
            m95789c.m95772u(httpUriRequest.getURI().toString()).m95782k(httpUriRequest.getMethod());
            Long m94353a = N73.m94353a(httpUriRequest);
            if (m94353a != null) {
                m95789c.m95779n(m94353a.longValue());
            }
            timer.m47032h();
            m95789c.m95778o(timer.m47034e());
            return (T) httpClient.execute(httpUriRequest, new C45475n52(responseHandler, timer, m95789c), httpContext);
        } catch (IOException e) {
            m95789c.m95774s(timer.m47036c());
            N73.m94350d(m95789c);
            throw e;
        }
    }

    /* renamed from: e */
    public static HttpResponse m47063e(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, Timer timer, C41612ga6 c41612ga6) throws IOException {
        M73 m95789c = M73.m95789c(c41612ga6);
        try {
            m95789c.m95772u(httpHost.toURI() + httpRequest.getRequestLine().getUri()).m95782k(httpRequest.getRequestLine().getMethod());
            Long m94353a = N73.m94353a(httpRequest);
            if (m94353a != null) {
                m95789c.m95779n(m94353a.longValue());
            }
            timer.m47032h();
            m95789c.m95778o(timer.m47034e());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            m95789c.m95774s(timer.m47036c());
            m95789c.m95781l(execute.getStatusLine().getStatusCode());
            Long m94353a2 = N73.m94353a(execute);
            if (m94353a2 != null) {
                m95789c.m95776q(m94353a2.longValue());
            }
            String m94352b = N73.m94352b(execute);
            if (m94352b != null) {
                m95789c.m95777p(m94352b);
            }
            m95789c.m95790b();
            return execute;
        } catch (IOException e) {
            m95789c.m95774s(timer.m47036c());
            N73.m94350d(m95789c);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        return m47061g(httpClient, httpUriRequest, new Timer(), C41612ga6.m39128k());
    }

    /* renamed from: f */
    public static HttpResponse m47062f(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, Timer timer, C41612ga6 c41612ga6) throws IOException {
        M73 m95789c = M73.m95789c(c41612ga6);
        try {
            m95789c.m95772u(httpHost.toURI() + httpRequest.getRequestLine().getUri()).m95782k(httpRequest.getRequestLine().getMethod());
            Long m94353a = N73.m94353a(httpRequest);
            if (m94353a != null) {
                m95789c.m95779n(m94353a.longValue());
            }
            timer.m47032h();
            m95789c.m95778o(timer.m47034e());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            m95789c.m95774s(timer.m47036c());
            m95789c.m95781l(execute.getStatusLine().getStatusCode());
            Long m94353a2 = N73.m94353a(execute);
            if (m94353a2 != null) {
                m95789c.m95776q(m94353a2.longValue());
            }
            String m94352b = N73.m94352b(execute);
            if (m94352b != null) {
                m95789c.m95777p(m94352b);
            }
            m95789c.m95790b();
            return execute;
        } catch (IOException e) {
            m95789c.m95774s(timer.m47036c());
            N73.m94350d(m95789c);
            throw e;
        }
    }

    /* renamed from: g */
    public static HttpResponse m47061g(HttpClient httpClient, HttpUriRequest httpUriRequest, Timer timer, C41612ga6 c41612ga6) throws IOException {
        M73 m95789c = M73.m95789c(c41612ga6);
        try {
            m95789c.m95772u(httpUriRequest.getURI().toString()).m95782k(httpUriRequest.getMethod());
            Long m94353a = N73.m94353a(httpUriRequest);
            if (m94353a != null) {
                m95789c.m95779n(m94353a.longValue());
            }
            timer.m47032h();
            m95789c.m95778o(timer.m47034e());
            HttpResponse execute = httpClient.execute(httpUriRequest);
            m95789c.m95774s(timer.m47036c());
            m95789c.m95781l(execute.getStatusLine().getStatusCode());
            Long m94353a2 = N73.m94353a(execute);
            if (m94353a2 != null) {
                m95789c.m95776q(m94353a2.longValue());
            }
            String m94352b = N73.m94352b(execute);
            if (m94352b != null) {
                m95789c.m95777p(m94352b);
            }
            m95789c.m95790b();
            return execute;
        } catch (IOException e) {
            m95789c.m95774s(timer.m47036c());
            N73.m94350d(m95789c);
            throw e;
        }
    }

    /* renamed from: h */
    public static HttpResponse m47060h(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, Timer timer, C41612ga6 c41612ga6) throws IOException {
        M73 m95789c = M73.m95789c(c41612ga6);
        try {
            m95789c.m95772u(httpUriRequest.getURI().toString()).m95782k(httpUriRequest.getMethod());
            Long m94353a = N73.m94353a(httpUriRequest);
            if (m94353a != null) {
                m95789c.m95779n(m94353a.longValue());
            }
            timer.m47032h();
            m95789c.m95778o(timer.m47034e());
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            m95789c.m95774s(timer.m47036c());
            m95789c.m95781l(execute.getStatusLine().getStatusCode());
            Long m94353a2 = N73.m94353a(execute);
            if (m94353a2 != null) {
                m95789c.m95776q(m94353a2.longValue());
            }
            String m94352b = N73.m94352b(execute);
            if (m94352b != null) {
                m95789c.m95777p(m94352b);
            }
            m95789c.m95790b();
            return execute;
        } catch (IOException e) {
            m95789c.m95774s(timer.m47036c());
            N73.m94350d(m95789c);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        return m47060h(httpClient, httpUriRequest, httpContext, new Timer(), C41612ga6.m39128k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        return (T) m47065c(httpClient, httpUriRequest, responseHandler, new Timer(), C41612ga6.m39128k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        return (T) m47064d(httpClient, httpUriRequest, responseHandler, httpContext, new Timer(), C41612ga6.m39128k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        return m47063e(httpClient, httpHost, httpRequest, new Timer(), C41612ga6.m39128k());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        return m47062f(httpClient, httpHost, httpRequest, httpContext, new Timer(), C41612ga6.m39128k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        return (T) m47067a(httpClient, httpHost, httpRequest, responseHandler, new Timer(), C41612ga6.m39128k());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        return (T) m47066b(httpClient, httpHost, httpRequest, responseHandler, httpContext, new Timer(), C41612ga6.m39128k());
    }
}
