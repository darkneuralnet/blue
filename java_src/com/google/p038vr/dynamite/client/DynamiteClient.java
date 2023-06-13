package com.google.p038vr.dynamite.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.Log;
import dalvik.system.DexClassLoader;
@UsedByNative
/* renamed from: com.google.vr.dynamite.client.DynamiteClient */
/* loaded from: classes6.dex */
public final class DynamiteClient {

    /* renamed from: a */
    public static final ArrayMap f74902a = new ArrayMap();

    private DynamiteClient() {
    }

    @UsedByNative
    public static synchronized int checkVersion(Context context, String str, String str2, String str3) {
        synchronized (DynamiteClient.class) {
            JN6 jn6 = new JN6(str, str2);
            C43867kN6 remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(jn6);
            try {
                INativeLibraryLoader newNativeLibraryLoader = remoteLibraryLoaderFromInfo.m29032b(context).newNativeLibraryLoader(ObjectWrapper.m45947c5(remoteLibraryLoaderFromInfo.m29033a(context)), ObjectWrapper.m45947c5(context));
                if (newNativeLibraryLoader == null) {
                    String obj = jn6.toString();
                    Log.e("DynamiteClient", "Failed to load native library " + obj + " from remote package: no loader available.");
                    return -1;
                }
                return newNativeLibraryLoader.checkVersion(str3);
            } catch (RemoteException | C18567d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError e) {
                String obj2 = jn6.toString();
                Log.e("DynamiteClient", "Failed to load native library " + obj2 + " from remote package:\n  ", e);
                return -1;
            }
        }
    }

    @UsedByNative
    public static synchronized ClassLoader getRemoteClassLoader(Context context, String str, String str2) {
        synchronized (DynamiteClient.class) {
            Context remoteContext = getRemoteContext(context, str, str2);
            if (remoteContext == null) {
                return null;
            }
            return remoteContext.getClassLoader();
        }
    }

    @UsedByNative
    public static synchronized Context getRemoteContext(Context context, String str, String str2) {
        Context m29033a;
        synchronized (DynamiteClient.class) {
            JN6 jn6 = new JN6(str, str2);
            try {
                m29033a = getRemoteLibraryLoaderFromInfo(jn6).m29033a(context);
            } catch (C18567d e) {
                String obj = jn6.toString();
                Log.e("DynamiteClient", "Failed to get remote Context" + obj + " from remote package:\n  ", e);
                return null;
            }
        }
        return m29033a;
    }

    @UsedByNative
    public static synchronized ClassLoader getRemoteDexClassLoader(Context context, String str) {
        synchronized (DynamiteClient.class) {
            Context remoteContext = getRemoteContext(context, str, null);
            if (remoteContext == null) {
                return null;
            }
            try {
                return new DexClassLoader(remoteContext.getPackageCodePath(), context.getCodeCacheDir().getAbsolutePath(), remoteContext.getApplicationInfo().nativeLibraryDir, context.getClassLoader());
            } catch (RuntimeException e) {
                Log.e("DynamiteClient", "Failed to create class loader for remote package\n ", e);
                return null;
            }
        }
    }

    @UsedByNative
    private static synchronized C43867kN6 getRemoteLibraryLoaderFromInfo(JN6 jn6) {
        synchronized (DynamiteClient.class) {
            ArrayMap arrayMap = f74902a;
            C43867kN6 c43867kN6 = (C43867kN6) arrayMap.get(jn6);
            if (c43867kN6 == null) {
                C43867kN6 c43867kN62 = new C43867kN6(jn6);
                arrayMap.put(jn6, c43867kN62);
                return c43867kN62;
            }
            return c43867kN6;
        }
    }

    @UsedByNative
    public static synchronized long loadNativeRemoteLibrary(Context context, String str, String str2) {
        synchronized (DynamiteClient.class) {
            JN6 jn6 = new JN6(str, str2);
            C43867kN6 remoteLibraryLoaderFromInfo = getRemoteLibraryLoaderFromInfo(jn6);
            try {
                INativeLibraryLoader newNativeLibraryLoader = remoteLibraryLoaderFromInfo.m29032b(context).newNativeLibraryLoader(ObjectWrapper.m45947c5(remoteLibraryLoaderFromInfo.m29033a(context)), ObjectWrapper.m45947c5(context));
                if (newNativeLibraryLoader == null) {
                    String obj = jn6.toString();
                    Log.e("DynamiteClient", "Failed to load native library " + obj + " from remote package: no loader available.");
                    return 0L;
                }
                return newNativeLibraryLoader.initializeAndLoadNativeLibrary(str2);
            } catch (RemoteException | C18567d | IllegalArgumentException | IllegalStateException | SecurityException | UnsatisfiedLinkError e) {
                String obj2 = jn6.toString();
                Log.e("DynamiteClient", "Failed to load native library " + obj2 + " from remote package:\n  ", e);
                return 0L;
            }
        }
    }
}
