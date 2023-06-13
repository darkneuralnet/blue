package p000;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: le7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C44618le7 implements IInterface {

    /* renamed from: a */
    public final IBinder f96506a;

    /* renamed from: b */
    public final String f96507b;

    public C44618le7(IBinder iBinder, String str) {
        this.f96506a = iBinder;
        this.f96507b = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f96506a;
    }
}
