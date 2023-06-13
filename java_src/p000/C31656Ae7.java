package p000;

import android.os.IBinder;
import android.os.IInterface;
/* renamed from: Ae7  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C31656Ae7 implements IInterface {

    /* renamed from: a */
    public final IBinder f902a;

    /* renamed from: b */
    public final String f903b;

    public C31656Ae7(IBinder iBinder, String str) {
        this.f902a = iBinder;
        this.f903b = str;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f902a;
    }
}
