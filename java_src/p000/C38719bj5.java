package p000;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0011"}, m28432d2 = {"Lbj5;", "Landroid/view/ScaleGestureDetector;", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", C17296a.f69688o, "Landroid/view/MotionEvent;", "()Landroid/view/MotionEvent;", "b", "(Landroid/view/MotionEvent;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lbj5$b;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Landroid/content/Context;Lbj5$b;)V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: bj5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C38719bj5 extends ScaleGestureDetector {

    /* renamed from: a */
    public MotionEvent f58005a;

    @Metadata(m28433d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, m28432d2 = {"bj5$a", "Landroid/view/ScaleGestureDetector$OnScaleGestureListener;", "Landroid/view/ScaleGestureDetector;", "detector", "", "onScaleBegin", "onScale", "", "onScaleEnd", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: bj5$a */
    /* loaded from: classes6.dex */
    public static final class ScaleGestureDetector$OnScaleGestureListenerC12487a implements ScaleGestureDetector.OnScaleGestureListener {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC12488b f58006a;

        public ScaleGestureDetector$OnScaleGestureListenerC12487a(InterfaceC12488b interfaceC12488b) {
            this.f58006a = interfaceC12488b;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            C38719bj5 c38719bj5 = (C38719bj5) detector;
            this.f58006a.mo34348c(c38719bj5, c38719bj5.m64066a());
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            C38719bj5 c38719bj5 = (C38719bj5) detector;
            this.f58006a.mo34350a(c38719bj5, c38719bj5.m64066a());
            return true;
        }

        @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
        public void onScaleEnd(ScaleGestureDetector detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            C38719bj5 c38719bj5 = (C38719bj5) detector;
            this.f58006a.mo34349b(c38719bj5, c38719bj5.m64066a());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\n"}, m28432d2 = {"Lbj5$b;", "", "Lbj5;", "detector", "Landroid/view/MotionEvent;", "e", "", C17296a.f69688o, "c", "b", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: bj5$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC12488b {
        /* renamed from: a */
        void mo34350a(C38719bj5 c38719bj5, MotionEvent motionEvent);

        /* renamed from: b */
        void mo34349b(C38719bj5 c38719bj5, MotionEvent motionEvent);

        /* renamed from: c */
        void mo34348c(C38719bj5 c38719bj5, MotionEvent motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38719bj5(Context context, InterfaceC12488b listener) {
        super(context, new ScaleGestureDetector$OnScaleGestureListenerC12487a(listener));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    /* renamed from: a */
    public final MotionEvent m64066a() {
        MotionEvent motionEvent = this.f58005a;
        if (motionEvent != null) {
            return motionEvent;
        }
        Intrinsics.throwUninitializedPropertyAccessException("event");
        return null;
    }

    /* renamed from: b */
    public final void m64065b(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "<set-?>");
        this.f58005a = motionEvent;
    }

    @Override // android.view.ScaleGestureDetector
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m64065b(event);
        return super.onTouchEvent(event);
    }
}
