package p000;

import android.view.MotionEvent;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"LlX3;", "", "", C17296a.f69688o, "J", "getUptime", "()J", "uptime", "", "LmX3;", "b", "Ljava/util/List;", "()Ljava/util/List;", "pointers", "Landroid/view/MotionEvent;", "c", "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "motionEvent", "<init>", "(JLjava/util/List;Landroid/view/MotionEvent;)V", "ui_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: lX3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44547lX3 {

    /* renamed from: a */
    public final long f96291a;

    /* renamed from: b */
    public final List<C45140mX3> f96292b;

    /* renamed from: c */
    public final MotionEvent f96293c;

    public C44547lX3(long j, List<C45140mX3> pointers, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(pointers, "pointers");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        this.f96291a = j;
        this.f96292b = pointers;
        this.f96293c = motionEvent;
    }

    /* renamed from: a */
    public final MotionEvent m27175a() {
        return this.f96293c;
    }

    /* renamed from: b */
    public final List<C45140mX3> m27174b() {
        return this.f96292b;
    }
}
