package p000;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.Map;
/* renamed from: nR7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC45683nR7 extends IInterface {
    void beginAdUnitExposure(String str, long j) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j) throws RemoteException;

    void endAdUnitExposure(String str, long j) throws RemoteException;

    void generateEventId(InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException;

    void getAppInstanceId(InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException;

    void getCachedAppInstanceId(InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException;

    void getCurrentScreenClass(InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException;

    void getCurrentScreenName(InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException;

    void getGmpAppId(InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException;

    void getMaxUserProperties(String str, InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException;

    void getSessionId(InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException;

    void getTestFlag(InterfaceC42134hS7 interfaceC42134hS7, int i) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z, InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(WO1 wo1, zzcl zzclVar, long j) throws RemoteException;

    void isDataCollectionEnabled(InterfaceC42134hS7 interfaceC42134hS7) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC42134hS7 interfaceC42134hS7, long j) throws RemoteException;

    void logHealthData(int i, String str, WO1 wo1, WO1 wo12, WO1 wo13) throws RemoteException;

    void onActivityCreated(WO1 wo1, Bundle bundle, long j) throws RemoteException;

    void onActivityDestroyed(WO1 wo1, long j) throws RemoteException;

    void onActivityPaused(WO1 wo1, long j) throws RemoteException;

    void onActivityResumed(WO1 wo1, long j) throws RemoteException;

    void onActivitySaveInstanceState(WO1 wo1, InterfaceC42134hS7 interfaceC42134hS7, long j) throws RemoteException;

    void onActivityStarted(WO1 wo1, long j) throws RemoteException;

    void onActivityStopped(WO1 wo1, long j) throws RemoteException;

    void performAction(Bundle bundle, InterfaceC42134hS7 interfaceC42134hS7, long j) throws RemoteException;

    void registerOnMeasurementEventListener(InterfaceC38568bT7 interfaceC38568bT7) throws RemoteException;

    void resetAnalyticsData(long j) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException;

    void setConsent(Bundle bundle, long j) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j) throws RemoteException;

    void setCurrentScreen(WO1 wo1, String str, String str2, long j) throws RemoteException;

    void setDataCollectionEnabled(boolean z) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(InterfaceC38568bT7 interfaceC38568bT7) throws RemoteException;

    void setInstanceIdProvider(ET7 et7) throws RemoteException;

    void setMeasurementEnabled(boolean z, long j) throws RemoteException;

    void setMinimumSessionDuration(long j) throws RemoteException;

    void setSessionTimeoutDuration(long j) throws RemoteException;

    void setUserId(String str, long j) throws RemoteException;

    void setUserProperty(String str, String str2, WO1 wo1, boolean z, long j) throws RemoteException;

    void unregisterOnMeasurementEventListener(InterfaceC38568bT7 interfaceC38568bT7) throws RemoteException;
}
