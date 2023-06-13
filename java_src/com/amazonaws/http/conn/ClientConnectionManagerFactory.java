package com.amazonaws.http.conn;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionRequest;
/* loaded from: classes2.dex */
public class ClientConnectionManagerFactory {
    private static final Log log = LogFactory.getLog(ClientConnectionManagerFactory.class);

    /* loaded from: classes2.dex */
    public static class Handler implements InvocationHandler {
        private final ClientConnectionManager orig;

        public Handler(ClientConnectionManager clientConnectionManager) {
            this.orig = clientConnectionManager;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                Object invoke = method.invoke(this.orig, objArr);
                if (invoke instanceof ClientConnectionRequest) {
                    return ClientConnectionRequestFactory.wrap((ClientConnectionRequest) invoke);
                }
                return invoke;
            } catch (InvocationTargetException e) {
                ClientConnectionManagerFactory.log.debug("", e);
                throw e.getCause();
            }
        }
    }

    public static ClientConnectionManager wrap(ClientConnectionManager clientConnectionManager) {
        if (!(clientConnectionManager instanceof Wrapped)) {
            return (ClientConnectionManager) Proxy.newProxyInstance(ClientConnectionManagerFactory.class.getClassLoader(), new Class[]{ClientConnectionManager.class, Wrapped.class}, new Handler(clientConnectionManager));
        }
        throw new IllegalArgumentException();
    }
}
