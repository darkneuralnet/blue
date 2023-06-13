package com.google.mlkit.vision.objects.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.internal.MobileVisionBase;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;
@KeepForSdk
/* loaded from: classes6.dex */
public class ObjectDetectorImpl extends MobileVisionBase<List<U11>> implements InterfaceC34217Ld3 {
    public ObjectDetectorImpl(LE2 le2, Executor executor) {
        super(le2, executor);
    }

    @KeepForSdk
    /* renamed from: f */
    public static ObjectDetectorImpl m46753f(LE2<List<U11>, C41304g32> le2, Executor executor) {
        return new ObjectDetectorImpl(le2, executor);
    }

    @Override // p000.InterfaceC34217Ld3
    /* renamed from: h */
    public final Task<List<U11>> mo46752h(C41304g32 c41304g32) {
        ByteBuffer m40244e = c41304g32.m40244e();
        if (m40244e != null) {
            c41304g32 = C41304g32.m40248a(C46917pX1.m19142g().m19146c(m40244e), c41304g32.m40237l(), c41304g32.m40241h(), c41304g32.m40238k(), c41304g32.m40242g());
        }
        return m46762a(c41304g32);
    }
}
