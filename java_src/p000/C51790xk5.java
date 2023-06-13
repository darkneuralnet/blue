package p000;

import com.polidea.rxandroidble2.exceptions.BleScanException;
import io.reactivex.AbstractC23437E;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;
/* renamed from: xk5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C51790xk5 implements InterfaceC50012uk5 {

    /* renamed from: d */
    public static final long f118043d = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: a */
    public final long[] f118044a = new long[5];

    /* renamed from: b */
    public final C50604vk5 f118045b;

    /* renamed from: c */
    public final AbstractC23437E f118046c;

    public C51790xk5(C50604vk5 c50604vk5, AbstractC23437E abstractC23437E) {
        this.f118045b = c50604vk5;
        this.f118046c = abstractC23437E;
    }

    @Override // p000.InterfaceC50012uk5
    /* renamed from: a */
    public void mo4754a(boolean z) {
        this.f118045b.mo4754a(z);
        int m4753b = m4753b();
        long j = this.f118044a[m4753b];
        long m33168c = this.f118046c.m33168c(TimeUnit.MILLISECONDS);
        long j2 = f118043d;
        if (m33168c - j >= j2) {
            this.f118044a[m4753b] = m33168c;
            return;
        }
        throw new BleScanException(2147483646, new Date(j + j2));
    }

    /* renamed from: b */
    public final int m4753b() {
        long j = LongCompanionObject.MAX_VALUE;
        int i = -1;
        for (int i2 = 0; i2 < 5; i2++) {
            long j2 = this.f118044a[i2];
            if (j2 < j) {
                i = i2;
                j = j2;
            }
        }
        return i;
    }
}
