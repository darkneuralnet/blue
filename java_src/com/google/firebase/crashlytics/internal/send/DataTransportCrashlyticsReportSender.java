package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import com.amazonaws.services.p026s3.internal.Constants;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.nio.charset.Charset;
/* loaded from: classes6.dex */
public class DataTransportCrashlyticsReportSender {
    private static final String CRASHLYTICS_TRANSPORT_NAME = "FIREBASE_CRASHLYTICS_REPORT";
    private final ReportQueue reportQueue;
    private final C96<CrashlyticsReport, byte[]> transportTransform;
    private static final CrashlyticsReportJsonTransform TRANSFORM = new CrashlyticsReportJsonTransform();
    private static final String CRASHLYTICS_ENDPOINT = mergeStrings("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    private static final String CRASHLYTICS_API_KEY = mergeStrings("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    private static final C96<CrashlyticsReport, byte[]> DEFAULT_TRANSFORM = new C96() { // from class: cT0
        @Override // p000.C96
        public final Object apply(Object obj) {
            byte[] lambda$static$0;
            lambda$static$0 = DataTransportCrashlyticsReportSender.lambda$static$0((CrashlyticsReport) obj);
            return lambda$static$0;
        }
    };

    public DataTransportCrashlyticsReportSender(ReportQueue reportQueue, C96<CrashlyticsReport, byte[]> c96) {
        this.reportQueue = reportQueue;
        this.transportTransform = c96;
    }

    public static DataTransportCrashlyticsReportSender create(Context context, SettingsProvider settingsProvider, OnDemandCounter onDemandCounter) {
        C42798ia6.m33786f(context);
        U96 m33785g = C42798ia6.m33789c().m33785g(new W70(CRASHLYTICS_ENDPOINT, CRASHLYTICS_API_KEY));
        C35142Pc1 m90060b = C35142Pc1.m90060b("json");
        C96<CrashlyticsReport, byte[]> c96 = DEFAULT_TRANSFORM;
        return new DataTransportCrashlyticsReportSender(new ReportQueue(m33785g.mo80270a(CRASHLYTICS_TRANSPORT_NAME, CrashlyticsReport.class, m90060b, c96), settingsProvider.getSettingsSync(), onDemandCounter), c96);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ byte[] lambda$static$0(CrashlyticsReport crashlyticsReport) {
        return TRANSFORM.reportToJson(crashlyticsReport).getBytes(Charset.forName(Constants.DEFAULT_ENCODING));
    }

    private static String mergeStrings(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str.length() + str2.length());
            for (int i = 0; i < str.length(); i++) {
                sb.append(str.charAt(i));
                if (str2.length() > i) {
                    sb.append(str2.charAt(i));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    public Task<CrashlyticsReportWithSessionId> enqueueReport(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, boolean z) {
        return this.reportQueue.enqueueReport(crashlyticsReportWithSessionId, z).getTask();
    }
}
