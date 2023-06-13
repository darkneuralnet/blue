package p000;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzn;
import com.google.android.gms.auth.api.accounttransfer.zzv;
import com.google.android.gms.common.api.Status;
/* renamed from: pw7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC47170pw7 extends IInterface {
    void zzb(byte[] bArr) throws RemoteException;

    void zzc(DeviceMetaData deviceMetaData) throws RemoteException;

    void zzd(Status status) throws RemoteException;

    void zze() throws RemoteException;

    void zzf(Status status, zzv zzvVar) throws RemoteException;

    void zzg(Status status, zzn zznVar) throws RemoteException;

    void zzh(Status status) throws RemoteException;
}
