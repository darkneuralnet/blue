package p000;

import android.content.Intent;
import com.google.android.gms.tasks.Task;
/* renamed from: Km1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34062Km1 {
    /* renamed from: c */
    public static synchronized AbstractC34062Km1 m98298c() {
        AbstractC34062Km1 m98297d;
        synchronized (AbstractC34062Km1.class) {
            m98297d = m98297d(C31722Am1.m115292k());
        }
        return m98297d;
    }

    /* renamed from: d */
    public static synchronized AbstractC34062Km1 m98297d(C31722Am1 c31722Am1) {
        AbstractC34062Km1 abstractC34062Km1;
        synchronized (AbstractC34062Km1.class) {
            abstractC34062Km1 = (AbstractC34062Km1) c31722Am1.m115294i(AbstractC34062Km1.class);
        }
        return abstractC34062Km1;
    }

    /* renamed from: a */
    public abstract C49654u81 mo96370a();

    /* renamed from: b */
    public abstract Task<C38537bQ3> mo96369b(Intent intent);
}
