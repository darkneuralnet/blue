package p000;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;
/* renamed from: Gd8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC33052Gd8 implements Runnable {

    /* renamed from: b */
    public final InterfaceC46981pd8 f12187b;

    /* renamed from: c */
    public final int f12188c;

    /* renamed from: d */
    public final Throwable f12189d;

    /* renamed from: e */
    public final byte[] f12190e;

    /* renamed from: f */
    public final String f12191f;

    /* renamed from: g */
    public final Map f12192g;

    public /* synthetic */ RunnableC33052Gd8(String str, InterfaceC46981pd8 interfaceC46981pd8, int i, Throwable th, byte[] bArr, Map map, C49352td8 c49352td8) {
        Preconditions.checkNotNull(interfaceC46981pd8);
        this.f12187b = interfaceC46981pd8;
        this.f12188c = i;
        this.f12189d = th;
        this.f12190e = bArr;
        this.f12191f = str;
        this.f12192g = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f12187b.mo19032a(this.f12191f, this.f12188c, this.f12189d, this.f12190e, this.f12192g);
    }
}
