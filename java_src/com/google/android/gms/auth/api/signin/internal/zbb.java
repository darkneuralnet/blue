package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
/* loaded from: classes5.dex */
public final class zbb implements Runnable {
    private static final Logger zba = new Logger("RevokeAccessOperation", new String[0]);
    private final String zbb;
    private final StatusPendingResult zbc = new StatusPendingResult((GoogleApiClient) null);

    public zbb(String str) {
        this.zbb = Preconditions.checkNotEmpty(str);
    }

    public static PendingResult<Status> zba(String str) {
        if (str == null) {
            return PendingResults.immediateFailedResult(new Status(4), null);
        }
        zbb zbbVar = new zbb(str);
        new Thread(zbbVar).start();
        return zbbVar.zbc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        String str3;
        Status status = Status.RESULT_INTERNAL_ERROR;
        try {
            String valueOf = String.valueOf(this.zbb);
            if (valueOf.length() != 0) {
                str3 = "https://accounts.google.com/o/oauth2/revoke?token=".concat(valueOf);
            } else {
                str3 = new String("https://accounts.google.com/o/oauth2/revoke?token=");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str3).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.RESULT_SUCCESS;
            } else {
                zba.m51600e("Unable to revoke access!", new Object[0]);
            }
            Logger logger = zba;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            logger.m51602d(sb.toString(), new Object[0]);
        } catch (IOException e) {
            Logger logger2 = zba;
            String valueOf2 = String.valueOf(e.toString());
            if (valueOf2.length() != 0) {
                str2 = "IOException when revoking access: ".concat(valueOf2);
            } else {
                str2 = new String("IOException when revoking access: ");
            }
            logger2.m51600e(str2, new Object[0]);
        } catch (Exception e2) {
            Logger logger3 = zba;
            String valueOf3 = String.valueOf(e2.toString());
            if (valueOf3.length() != 0) {
                str = "Exception when revoking access: ".concat(valueOf3);
            } else {
                str = new String("Exception when revoking access: ");
            }
            logger3.m51600e(str, new Object[0]);
        }
        this.zbc.setResult(status);
    }
}
