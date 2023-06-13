package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.HashMap;
import p000.WO1;
/* renamed from: YQ7 */
/* loaded from: classes5.dex */
public abstract class YQ7 extends DL7 implements InterfaceC45683nR7 {
    public YQ7() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static InterfaceC45683nR7 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof InterfaceC45683nR7) {
            return (InterfaceC45683nR7) queryLocalInterface;
        }
        return new IQ7(iBinder);
    }

    @Override // p000.DL7
    /* renamed from: c5 */
    public final boolean mo75075c5(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        InterfaceC42134hS7 cr7;
        InterfaceC42134hS7 interfaceC42134hS7;
        InterfaceC42134hS7 interfaceC42134hS72 = null;
        InterfaceC42134hS7 interfaceC42134hS73 = null;
        InterfaceC42134hS7 interfaceC42134hS74 = null;
        InterfaceC42134hS7 interfaceC42134hS75 = null;
        InterfaceC38568bT7 interfaceC38568bT7 = null;
        InterfaceC38568bT7 interfaceC38568bT72 = null;
        InterfaceC38568bT7 interfaceC38568bT73 = null;
        InterfaceC42134hS7 interfaceC42134hS76 = null;
        InterfaceC42134hS7 interfaceC42134hS77 = null;
        InterfaceC42134hS7 interfaceC42134hS78 = null;
        InterfaceC42134hS7 interfaceC42134hS79 = null;
        InterfaceC42134hS7 interfaceC42134hS710 = null;
        InterfaceC42134hS7 interfaceC42134hS711 = null;
        ET7 et7 = null;
        InterfaceC42134hS7 interfaceC42134hS712 = null;
        InterfaceC42134hS7 interfaceC42134hS713 = null;
        InterfaceC42134hS7 interfaceC42134hS714 = null;
        InterfaceC42134hS7 interfaceC42134hS715 = null;
        switch (i) {
            case 1:
                long readLong = parcel.readLong();
                UL7.m81614c(parcel);
                initialize(WO1.AbstractBinderC9015a.m78501c5(parcel.readStrongBinder()), (zzcl) UL7.m81616a(parcel, zzcl.CREATOR), readLong);
                break;
            case 2:
                boolean m81611f = UL7.m81611f(parcel);
                boolean m81611f2 = UL7.m81611f(parcel);
                long readLong2 = parcel.readLong();
                UL7.m81614c(parcel);
                logEvent(parcel.readString(), parcel.readString(), (Bundle) UL7.m81616a(parcel, Bundle.CREATOR), m81611f, m81611f2, readLong2);
                break;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) UL7.m81616a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    interfaceC42134hS7 = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof InterfaceC42134hS7) {
                        cr7 = (InterfaceC42134hS7) queryLocalInterface;
                    } else {
                        cr7 = new CR7(readStrongBinder);
                    }
                    interfaceC42134hS7 = cr7;
                }
                long readLong3 = parcel.readLong();
                UL7.m81614c(parcel);
                logEventAndBundle(readString, readString2, bundle, interfaceC42134hS7, readLong3);
                break;
            case 4:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                WO1 m78501c5 = WO1.AbstractBinderC9015a.m78501c5(parcel.readStrongBinder());
                boolean m81611f3 = UL7.m81611f(parcel);
                long readLong4 = parcel.readLong();
                UL7.m81614c(parcel);
                setUserProperty(readString3, readString4, m78501c5, m81611f3, readLong4);
                break;
            case 5:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                boolean m81611f4 = UL7.m81611f(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof InterfaceC42134hS7) {
                        interfaceC42134hS72 = (InterfaceC42134hS7) queryLocalInterface2;
                    } else {
                        interfaceC42134hS72 = new CR7(readStrongBinder2);
                    }
                }
                UL7.m81614c(parcel);
                getUserProperties(readString5, readString6, m81611f4, interfaceC42134hS72);
                break;
            case 6:
                String readString7 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface3 instanceof InterfaceC42134hS7) {
                        interfaceC42134hS715 = (InterfaceC42134hS7) queryLocalInterface3;
                    } else {
                        interfaceC42134hS715 = new CR7(readStrongBinder3);
                    }
                }
                UL7.m81614c(parcel);
                getMaxUserProperties(readString7, interfaceC42134hS715);
                break;
            case 7:
                String readString8 = parcel.readString();
                long readLong5 = parcel.readLong();
                UL7.m81614c(parcel);
                setUserId(readString8, readLong5);
                break;
            case 8:
                long readLong6 = parcel.readLong();
                UL7.m81614c(parcel);
                setConditionalUserProperty((Bundle) UL7.m81616a(parcel, Bundle.CREATOR), readLong6);
                break;
            case 9:
                UL7.m81614c(parcel);
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) UL7.m81616a(parcel, Bundle.CREATOR));
                break;
            case 10:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof InterfaceC42134hS7) {
                        interfaceC42134hS714 = (InterfaceC42134hS7) queryLocalInterface4;
                    } else {
                        interfaceC42134hS714 = new CR7(readStrongBinder4);
                    }
                }
                UL7.m81614c(parcel);
                getConditionalUserProperties(readString9, readString10, interfaceC42134hS714);
                break;
            case 11:
                boolean m81611f5 = UL7.m81611f(parcel);
                long readLong7 = parcel.readLong();
                UL7.m81614c(parcel);
                setMeasurementEnabled(m81611f5, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                UL7.m81614c(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                UL7.m81614c(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                UL7.m81614c(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                WO1 m78501c52 = WO1.AbstractBinderC9015a.m78501c5(parcel.readStrongBinder());
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                long readLong11 = parcel.readLong();
                UL7.m81614c(parcel);
                setCurrentScreen(m78501c52, readString11, readString12, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof InterfaceC42134hS7) {
                        interfaceC42134hS713 = (InterfaceC42134hS7) queryLocalInterface5;
                    } else {
                        interfaceC42134hS713 = new CR7(readStrongBinder5);
                    }
                }
                UL7.m81614c(parcel);
                getCurrentScreenName(interfaceC42134hS713);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof InterfaceC42134hS7) {
                        interfaceC42134hS712 = (InterfaceC42134hS7) queryLocalInterface6;
                    } else {
                        interfaceC42134hS712 = new CR7(readStrongBinder6);
                    }
                }
                UL7.m81614c(parcel);
                getCurrentScreenClass(interfaceC42134hS712);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface7 instanceof ET7) {
                        et7 = (ET7) queryLocalInterface7;
                    } else {
                        et7 = new C47480qT7(readStrongBinder7);
                    }
                }
                UL7.m81614c(parcel);
                setInstanceIdProvider(et7);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof InterfaceC42134hS7) {
                        interfaceC42134hS711 = (InterfaceC42134hS7) queryLocalInterface8;
                    } else {
                        interfaceC42134hS711 = new CR7(readStrongBinder8);
                    }
                }
                UL7.m81614c(parcel);
                getCachedAppInstanceId(interfaceC42134hS711);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof InterfaceC42134hS7) {
                        interfaceC42134hS710 = (InterfaceC42134hS7) queryLocalInterface9;
                    } else {
                        interfaceC42134hS710 = new CR7(readStrongBinder9);
                    }
                }
                UL7.m81614c(parcel);
                getAppInstanceId(interfaceC42134hS710);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof InterfaceC42134hS7) {
                        interfaceC42134hS79 = (InterfaceC42134hS7) queryLocalInterface10;
                    } else {
                        interfaceC42134hS79 = new CR7(readStrongBinder10);
                    }
                }
                UL7.m81614c(parcel);
                getGmpAppId(interfaceC42134hS79);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof InterfaceC42134hS7) {
                        interfaceC42134hS78 = (InterfaceC42134hS7) queryLocalInterface11;
                    } else {
                        interfaceC42134hS78 = new CR7(readStrongBinder11);
                    }
                }
                UL7.m81614c(parcel);
                generateEventId(interfaceC42134hS78);
                break;
            case 23:
                String readString13 = parcel.readString();
                long readLong12 = parcel.readLong();
                UL7.m81614c(parcel);
                beginAdUnitExposure(readString13, readLong12);
                break;
            case 24:
                String readString14 = parcel.readString();
                long readLong13 = parcel.readLong();
                UL7.m81614c(parcel);
                endAdUnitExposure(readString14, readLong13);
                break;
            case 25:
                WO1 m78501c53 = WO1.AbstractBinderC9015a.m78501c5(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                UL7.m81614c(parcel);
                onActivityStarted(m78501c53, readLong14);
                break;
            case 26:
                WO1 m78501c54 = WO1.AbstractBinderC9015a.m78501c5(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                UL7.m81614c(parcel);
                onActivityStopped(m78501c54, readLong15);
                break;
            case 27:
                long readLong16 = parcel.readLong();
                UL7.m81614c(parcel);
                onActivityCreated(WO1.AbstractBinderC9015a.m78501c5(parcel.readStrongBinder()), (Bundle) UL7.m81616a(parcel, Bundle.CREATOR), readLong16);
                break;
            case 28:
                WO1 m78501c55 = WO1.AbstractBinderC9015a.m78501c5(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                UL7.m81614c(parcel);
                onActivityDestroyed(m78501c55, readLong17);
                break;
            case 29:
                WO1 m78501c56 = WO1.AbstractBinderC9015a.m78501c5(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                UL7.m81614c(parcel);
                onActivityPaused(m78501c56, readLong18);
                break;
            case 30:
                WO1 m78501c57 = WO1.AbstractBinderC9015a.m78501c5(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                UL7.m81614c(parcel);
                onActivityResumed(m78501c57, readLong19);
                break;
            case 31:
                WO1 m78501c58 = WO1.AbstractBinderC9015a.m78501c5(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof InterfaceC42134hS7) {
                        interfaceC42134hS77 = (InterfaceC42134hS7) queryLocalInterface12;
                    } else {
                        interfaceC42134hS77 = new CR7(readStrongBinder12);
                    }
                }
                long readLong20 = parcel.readLong();
                UL7.m81614c(parcel);
                onActivitySaveInstanceState(m78501c58, interfaceC42134hS77, readLong20);
                break;
            case 32:
                Bundle bundle2 = (Bundle) UL7.m81616a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof InterfaceC42134hS7) {
                        interfaceC42134hS76 = (InterfaceC42134hS7) queryLocalInterface13;
                    } else {
                        interfaceC42134hS76 = new CR7(readStrongBinder13);
                    }
                }
                long readLong21 = parcel.readLong();
                UL7.m81614c(parcel);
                performAction(bundle2, interfaceC42134hS76, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString15 = parcel.readString();
                WO1 m78501c59 = WO1.AbstractBinderC9015a.m78501c5(parcel.readStrongBinder());
                WO1 m78501c510 = WO1.AbstractBinderC9015a.m78501c5(parcel.readStrongBinder());
                WO1 m78501c511 = WO1.AbstractBinderC9015a.m78501c5(parcel.readStrongBinder());
                UL7.m81614c(parcel);
                logHealthData(readInt, readString15, m78501c59, m78501c510, m78501c511);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface14 instanceof InterfaceC38568bT7) {
                        interfaceC38568bT73 = (InterfaceC38568bT7) queryLocalInterface14;
                    } else {
                        interfaceC38568bT73 = new C50434vS7(readStrongBinder14);
                    }
                }
                UL7.m81614c(parcel);
                setEventInterceptor(interfaceC38568bT73);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface15 instanceof InterfaceC38568bT7) {
                        interfaceC38568bT72 = (InterfaceC38568bT7) queryLocalInterface15;
                    } else {
                        interfaceC38568bT72 = new C50434vS7(readStrongBinder15);
                    }
                }
                UL7.m81614c(parcel);
                registerOnMeasurementEventListener(interfaceC38568bT72);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface16 instanceof InterfaceC38568bT7) {
                        interfaceC38568bT7 = (InterfaceC38568bT7) queryLocalInterface16;
                    } else {
                        interfaceC38568bT7 = new C50434vS7(readStrongBinder16);
                    }
                }
                UL7.m81614c(parcel);
                unregisterOnMeasurementEventListener(interfaceC38568bT7);
                break;
            case 37:
                HashMap m81615b = UL7.m81615b(parcel);
                UL7.m81614c(parcel);
                initForTests(m81615b);
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof InterfaceC42134hS7) {
                        interfaceC42134hS75 = (InterfaceC42134hS7) queryLocalInterface17;
                    } else {
                        interfaceC42134hS75 = new CR7(readStrongBinder17);
                    }
                }
                int readInt2 = parcel.readInt();
                UL7.m81614c(parcel);
                getTestFlag(interfaceC42134hS75, readInt2);
                break;
            case 39:
                boolean m81611f6 = UL7.m81611f(parcel);
                UL7.m81614c(parcel);
                setDataCollectionEnabled(m81611f6);
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof InterfaceC42134hS7) {
                        interfaceC42134hS74 = (InterfaceC42134hS7) queryLocalInterface18;
                    } else {
                        interfaceC42134hS74 = new CR7(readStrongBinder18);
                    }
                }
                UL7.m81614c(parcel);
                isDataCollectionEnabled(interfaceC42134hS74);
                break;
            case 41:
            default:
                return false;
            case 42:
                UL7.m81614c(parcel);
                setDefaultEventParameters((Bundle) UL7.m81616a(parcel, Bundle.CREATOR));
                break;
            case 43:
                long readLong22 = parcel.readLong();
                UL7.m81614c(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case 44:
                long readLong23 = parcel.readLong();
                UL7.m81614c(parcel);
                setConsent((Bundle) UL7.m81616a(parcel, Bundle.CREATOR), readLong23);
                break;
            case 45:
                long readLong24 = parcel.readLong();
                UL7.m81614c(parcel);
                setConsentThirdParty((Bundle) UL7.m81616a(parcel, Bundle.CREATOR), readLong24);
                break;
            case 46:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface19 instanceof InterfaceC42134hS7) {
                        interfaceC42134hS73 = (InterfaceC42134hS7) queryLocalInterface19;
                    } else {
                        interfaceC42134hS73 = new CR7(readStrongBinder19);
                    }
                }
                UL7.m81614c(parcel);
                getSessionId(interfaceC42134hS73);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
