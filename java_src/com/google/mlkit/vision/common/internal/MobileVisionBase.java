package com.google.mlkit.vision.common.internal;

import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.InterfaceC11733l;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.io.Closeable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
@KeepForSdk
/* loaded from: classes6.dex */
public class MobileVisionBase<DetectionResultT> implements Closeable, InterfaceC32929Fq2 {

    /* renamed from: g */
    public static final GmsLogger f74664g = new GmsLogger("MobileVisionBase", "");

    /* renamed from: b */
    public final AtomicBoolean f74665b = new AtomicBoolean(false);

    /* renamed from: c */
    public final LE2 f74666c;

    /* renamed from: d */
    public final CancellationTokenSource f74667d;

    /* renamed from: e */
    public final Executor f74668e;

    /* renamed from: f */
    public final Task f74669f;

    @KeepForSdk
    public MobileVisionBase(LE2<DetectionResultT, C41304g32> le2, Executor executor) {
        this.f74666c = le2;
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        this.f74667d = cancellationTokenSource;
        this.f74668e = executor;
        le2.m61277c();
        this.f74669f = le2.m61278a(executor, EC7.f7105b, cancellationTokenSource.getToken()).addOnFailureListener(C46267oQ7.f101971a);
    }

    @KeepForSdk
    /* renamed from: a */
    public synchronized Task<DetectionResultT> m46762a(final C41304g32 c41304g32) {
        Preconditions.checkNotNull(c41304g32, "InputImage can not be null");
        if (this.f74665b.get()) {
            return Tasks.forException(new MlKitException("This detector is already closed!", 14));
        } else if (c41304g32.m40237l() >= 32 && c41304g32.m40241h() >= 32) {
            return this.f74666c.m61278a(this.f74668e, new Callable() { // from class: gf7
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return MobileVisionBase.this.m46761b(c41304g32);
                }
            }, this.f74667d.getToken());
        } else {
            return Tasks.forException(new MlKitException("InputImage width and height should be at least 32!", 3));
        }
    }

    /* renamed from: b */
    public final /* synthetic */ Object m46761b(C41304g32 c41304g32) throws Exception {
        AY8 m115554d = AY8.m115554d("detectorTaskWithResource#run");
        m115554d.mo33815a();
        try {
            Object mo1908i = this.f74666c.mo1908i(c41304g32);
            m115554d.close();
            return mo1908i;
        } catch (Throwable th) {
            try {
                m115554d.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception unused) {
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @KeepForSdk
    @InterfaceC11733l(AbstractC11719f.EnumC11720a.ON_DESTROY)
    public synchronized void close() {
        if (!this.f74665b.getAndSet(true)) {
            this.f74667d.cancel();
            this.f74666c.m61276e(this.f74668e);
        }
    }
}
