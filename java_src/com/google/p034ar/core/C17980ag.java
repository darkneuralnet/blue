package com.google.p034ar.core;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.p034ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.p034ar.core.exceptions.UnavailableUserDeclinedInstallationException;
@SuppressLint({"LongLogTag"})
/* renamed from: com.google.ar.core.ag */
/* loaded from: classes6.dex */
final class C17980ag {
    /* renamed from: a */
    public static PendingIntent m48433a(Context context) throws UnavailableDeviceNotCompatibleException, UnavailableUserDeclinedInstallationException {
        try {
            Bundle call = context.getContentResolver().call(new Uri.Builder().scheme("content").authority("com.google.ar.core.services.arcorecontentprovider").path("").build(), "getSetupIntent", context.getPackageName(), (Bundle) null);
            if (call == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) call.getParcelable("intent");
            if (pendingIntent != null) {
                return pendingIntent;
            }
            String string = call.getString("exceptionType", "");
            if (string.isEmpty()) {
                return null;
            }
            if (!string.equals(UnavailableDeviceNotCompatibleException.class.getName())) {
                if (!string.equals(UnavailableUserDeclinedInstallationException.class.getName())) {
                    Class<? extends U> asSubclass = Class.forName(string).asSubclass(RuntimeException.class);
                    String string2 = call.getString("exceptionText", null);
                    if (string2 != null) {
                        throw ((RuntimeException) asSubclass.getConstructor(String.class).newInstance(string2));
                    }
                    throw ((RuntimeException) asSubclass.getConstructor(new Class[0]).newInstance(new Object[0]));
                }
                throw new UnavailableUserDeclinedInstallationException();
            }
            throw new UnavailableDeviceNotCompatibleException();
        } catch (ReflectiveOperationException | RuntimeException e) {
            Log.i("ARCore-SetupContentResolver", "Post-install failed", e);
            return null;
        }
    }
}
