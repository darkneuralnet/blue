package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
@SafeParcelable.Class(creator = "ParcelByteArrayCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class zzfz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfz> CREATOR = new C52989zl8();

    /* renamed from: b */
    public byte[] f71077b;
    @SafeParcelable.Field(getter = "getDataPfd", m51606id = 1)

    /* renamed from: c */
    public ParcelFileDescriptor f71078c;

    private zzfz() {
        this.f71077b = new byte[0];
    }

    /* renamed from: E */
    public static void m51236E(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("ParcelByteArray", "Could not close stream", e);
        }
    }

    @VisibleForTesting
    /* renamed from: s */
    public static byte[] m51235s(ParcelFileDescriptor parcelFileDescriptor) {
        DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
        try {
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.read(bArr);
                return bArr;
            } catch (IOException e) {
                throw new IllegalStateException("Could not read from parcel file descriptor", e);
            }
        } finally {
            m51236E(dataInputStream);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfz) {
            return Arrays.equals(this.f71077b, ((zzfz) obj).f71077b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f71077b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:
        if (r5 == null) goto L28;
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00c5: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:40:0x00c5 */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeToParcel(Parcel parcel, int i) {
        Closeable closeable;
        DataOutputStream dataOutputStream;
        ParcelFileDescriptor parcelFileDescriptor;
        File m65455a;
        byte[] bArr = this.f71077b;
        Closeable closeable2 = null;
        if (bArr != null) {
            try {
                if (this.f71078c == null) {
                    try {
                        try {
                            m65455a = C38179ao8.m65455a();
                        } catch (IOException e) {
                            e = e;
                            dataOutputStream = null;
                        }
                    } catch (IllegalStateException e2) {
                        e = e2;
                        dataOutputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        if (closeable2 != null) {
                            m51236E(closeable2);
                        }
                        throw th;
                    }
                    if (m65455a != null) {
                        try {
                            File createTempFile = File.createTempFile("teleporter" + SystemClock.elapsedRealtime(), ".tmp", m65455a);
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                                ParcelFileDescriptor open = ParcelFileDescriptor.open(createTempFile, 268435456);
                                createTempFile.delete();
                                Pair create = Pair.create(fileOutputStream, open);
                                dataOutputStream = new DataOutputStream(new BufferedOutputStream((OutputStream) create.first));
                                try {
                                    dataOutputStream.writeInt(bArr.length);
                                    dataOutputStream.write(bArr);
                                    parcelFileDescriptor = (ParcelFileDescriptor) create.second;
                                    m51236E(dataOutputStream);
                                } catch (IOException e3) {
                                    e = e3;
                                    String valueOf = String.valueOf(e);
                                    StringBuilder sb = new StringBuilder(valueOf.length() + 36);
                                    sb.append("Could not write into unlinked file. ");
                                    sb.append(valueOf);
                                    Log.e("ParcelByteArray", sb.toString());
                                    if (dataOutputStream != null) {
                                        m51236E(dataOutputStream);
                                    }
                                    parcelFileDescriptor = null;
                                    this.f71078c = parcelFileDescriptor;
                                    int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
                                    SafeParcelWriter.writeParcelable(parcel, 1, this.f71078c, i | 1, false);
                                    SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
                                    this.f71078c = null;
                                } catch (IllegalStateException e4) {
                                    e = e4;
                                    String valueOf2 = String.valueOf(e);
                                    StringBuilder sb2 = new StringBuilder(valueOf2.length() + 32);
                                    sb2.append("Could not create unlinked file. ");
                                    sb2.append(valueOf2);
                                    Log.e("ParcelByteArray", sb2.toString());
                                }
                                this.f71078c = parcelFileDescriptor;
                            } catch (FileNotFoundException e5) {
                                throw new IllegalStateException("Temporary file is somehow already deleted", e5);
                            }
                        } catch (IOException e6) {
                            throw new IllegalStateException("Could not create temporary file", e6);
                        }
                    } else {
                        throw new IllegalStateException("Must set temp dir before writing this object to a parcel");
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                closeable2 = closeable;
            }
        }
        int beginObjectHeader2 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f71078c, i | 1, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader2);
        this.f71078c = null;
    }

    @SafeParcelable.Constructor
    public zzfz(@SafeParcelable.Param(m51605id = 1) ParcelFileDescriptor parcelFileDescriptor) {
        this.f71077b = new byte[0];
        this.f71078c = parcelFileDescriptor;
    }
}
