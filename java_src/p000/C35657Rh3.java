package p000;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u0010"}, m28432d2 = {"LRh3;", "", "Landroid/opengl/EGLContext;", C17296a.f69688o, "shareContext", "b", "", "c", CoreConstants.CONTEXT_SCOPE_VALUE, "", DateTokenConverter.CONVERTER_KEY, "", "Ljava/lang/String;", "TAG", "<init>", "()V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: Rh3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35657Rh3 {

    /* renamed from: a */
    public static final C35657Rh3 f32445a = new C35657Rh3();

    /* renamed from: b */
    public static final String f32446b;

    static {
        String simpleName = C35657Rh3.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "OpenGL::class.java.simpleName");
        f32446b = simpleName;
    }

    private C35657Rh3() {
    }

    /* renamed from: a */
    public final EGLContext m86441a() {
        EGLContext m86440b = m86440b(EGL14.EGL_NO_CONTEXT);
        Intrinsics.checkNotNull(m86440b);
        return m86440b;
    }

    /* renamed from: b */
    public final EGLContext m86440b(EGLContext eGLContext) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        EGL14.eglInitialize(eglGetDisplay, null, 0, null, 0);
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 64, 12344}, 0, eGLConfigArr, 0, 1, new int[]{0}, 0);
        EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfigArr[0], eGLContext, new int[]{12440, 3, 12344}, 0);
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfigArr[0], new int[]{12375, 1, 12374, 1, 12344}, 0);
        if (EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
            return eglCreateContext;
        }
        throw new IllegalStateException("Error making GL context.".toString());
    }

    /* renamed from: c */
    public final int m86439c() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        return i;
    }

    /* renamed from: d */
    public final void m86438d(EGLContext eGLContext) {
        if (EGL14.eglDestroyContext(EGL14.eglGetDisplay(0), eGLContext)) {
            return;
        }
        throw new IllegalStateException("Error destroying GL context.".toString());
    }
}
