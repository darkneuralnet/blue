package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import p000.InterfaceC46836pO1;
import p000.InterfaceC47429qO1;
/* renamed from: A81 */
/* loaded from: classes6.dex */
public class A81 extends GmsClient<InterfaceC47429qO1> {
    public A81(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 131, clientSettings, connectionCallbacks, onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    /* renamed from: c */
    public InterfaceC47429qO1 createServiceInterface(IBinder iBinder) {
        return InterfaceC47429qO1.AbstractBinderC27593a.m17572c5(iBinder);
    }

    /* renamed from: d */
    public void m116071d(InterfaceC46836pO1.AbstractBinderC27282a abstractBinderC27282a, Bundle bundle) {
        try {
            ((InterfaceC47429qO1) getService()).mo17569y2(abstractBinderC27282a, bundle);
        } catch (RemoteException unused) {
        }
    }

    /* renamed from: e */
    public void m116070e(InterfaceC46836pO1.AbstractBinderC27282a abstractBinderC27282a, String str) {
        try {
            ((InterfaceC47429qO1) getService()).mo17570L3(abstractBinderC27282a, str);
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public int getMinApkVersion() {
        return GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public String getServiceDescriptor() {
        return "com.google.firebase.dynamiclinks.internal.IDynamicLinksService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public String getStartServiceAction() {
        return "com.google.firebase.dynamiclinks.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public boolean usesClientTelemetry() {
        return true;
    }
}
