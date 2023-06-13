package p000;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: Sh3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35891Sh3 {

    /* renamed from: n */
    public static final String f34077n;

    /* renamed from: o */
    public static final String f34078o;

    /* renamed from: p */
    public static final float[] f34079p;

    /* renamed from: q */
    public static final FloatBuffer f34080q;

    /* renamed from: r */
    public static final float[] f34081r;

    /* renamed from: s */
    public static final FloatBuffer f34082s;

    /* renamed from: t */
    public static final AbstractC7507a f34083t;

    /* renamed from: c */
    public Thread f34086c;

    /* renamed from: f */
    public EGLConfig f34089f;

    /* renamed from: h */
    public Surface f34091h;

    /* renamed from: a */
    public final AtomicBoolean f34084a = new AtomicBoolean(false);

    /* renamed from: b */
    public final Map<Surface, AbstractC7507a> f34085b = new HashMap();

    /* renamed from: d */
    public EGLDisplay f34087d = EGL14.EGL_NO_DISPLAY;

    /* renamed from: e */
    public EGLContext f34088e = EGL14.EGL_NO_CONTEXT;

    /* renamed from: g */
    public EGLSurface f34090g = EGL14.EGL_NO_SURFACE;

    /* renamed from: i */
    public int f34092i = -1;

    /* renamed from: j */
    public int f34093j = -1;

    /* renamed from: k */
    public int f34094k = -1;

    /* renamed from: l */
    public int f34095l = -1;

    /* renamed from: m */
    public int f34096m = -1;

    /* renamed from: Sh3$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC7507a {
        /* renamed from: d */
        public static AbstractC7507a m85027d(EGLSurface eGLSurface, int i, int i2) {
            return new C7281Rt(eGLSurface, i, i2);
        }

        /* renamed from: a */
        public abstract EGLSurface mo85030a();

        /* renamed from: b */
        public abstract int mo85029b();

        /* renamed from: c */
        public abstract int mo85028c();
    }

    static {
        Locale locale = Locale.US;
        f34077n = String.format(locale, "uniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f34078o = String.format(locale, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 %s;\nuniform samplerExternalOES %s;\nvoid main() {\n    gl_FragColor = texture2D(%s, %s);\n}\n", "vTextureCoord", "sTexture", "sTexture", "vTextureCoord");
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f34079p = fArr;
        f34080q = m85049h(fArr);
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        f34081r = fArr2;
        f34082s = m85049h(fArr2);
        f34083t = AbstractC7507a.m85027d(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    /* renamed from: a */
    public static void m85056a(String str) {
        try {
            m85055b(str);
        } catch (IllegalStateException e) {
            C33928Jx2.m99530d("OpenGlRenderer", e.getMessage(), e);
        }
    }

    /* renamed from: b */
    public static void m85055b(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        throw new IllegalStateException(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
    }

    /* renamed from: c */
    public static void m85054c(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        throw new IllegalStateException(str + ": GL error 0x" + Integer.toHexString(glGetError));
    }

    /* renamed from: f */
    public static void m85051f(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalStateException("Unable to locate '" + str + "' in program");
    }

    /* renamed from: h */
    public static FloatBuffer m85049h(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    /* renamed from: j */
    public static EGLSurface m85047j(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, i, 12374, i2, 12344}, 0);
        m85055b("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    /* renamed from: n */
    public static EGLSurface m85043n(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface) {
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, new int[]{12344}, 0);
        m85055b("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    /* renamed from: u */
    public static int m85036u(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        m85054c("glCreateShader type=" + i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        C33928Jx2.m99522l("OpenGlRenderer", "Could not compile shader: " + str);
        GLES20.glDeleteShader(glCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i + ":" + GLES20.glGetShaderInfoLog(glCreateShader));
    }

    /* renamed from: w */
    public static int m85034w(EGLDisplay eGLDisplay, EGLSurface eGLSurface, int i) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i, iArr, 0);
        return iArr[0];
    }

    /* renamed from: A */
    public final void m85060A(Surface surface, boolean z) {
        AbstractC7507a put;
        if (this.f34091h == surface) {
            this.f34091h = null;
            m85035v(this.f34090g);
        }
        if (z) {
            put = this.f34085b.remove(surface);
        } else {
            put = this.f34085b.put(surface, f34083t);
        }
        if (put != null && put != f34083t) {
            try {
                EGL14.eglDestroySurface(this.f34087d, put.mo85030a());
            } catch (RuntimeException e) {
                C33928Jx2.m99521m("OpenGlRenderer", "Failed to destroy EGL surface: " + e.getMessage(), e);
            }
        }
    }

    /* renamed from: B */
    public void m85059B(long j, float[] fArr, Surface surface) {
        m85052e(true);
        m85053d();
        AbstractC7507a m85042o = m85042o(surface);
        if (m85042o == f34083t) {
            m85042o = m85048i(surface);
            if (m85042o == null) {
                return;
            }
            this.f34085b.put(surface, m85042o);
        }
        if (surface != this.f34091h) {
            m85035v(m85042o.mo85030a());
            this.f34091h = surface;
            GLES20.glViewport(0, 0, m85042o.mo85028c(), m85042o.mo85029b());
            GLES20.glScissor(0, 0, m85042o.mo85028c(), m85042o.mo85029b());
        }
        GLES20.glUniformMatrix4fv(this.f34094k, 1, false, fArr, 0);
        m85054c("glUniformMatrix4fv");
        GLES20.glDrawArrays(5, 0, 4);
        m85054c("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f34087d, m85042o.mo85030a(), j);
        if (!EGL14.eglSwapBuffers(this.f34087d, m85042o.mo85030a())) {
            C33928Jx2.m99522l("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
            m85060A(surface, false);
        }
    }

    /* renamed from: C */
    public void m85058C(Surface surface) {
        m85052e(true);
        m85053d();
        m85060A(surface, true);
    }

    /* renamed from: D */
    public final void m85057D() {
        GLES20.glUseProgram(this.f34093j);
        m85054c("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f34092i);
        GLES20.glEnableVertexAttribArray(this.f34095l);
        m85054c("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f34095l, 2, 5126, false, 0, (Buffer) f34080q);
        m85054c("glVertexAttribPointer");
        GLES20.glEnableVertexAttribArray(this.f34096m);
        m85054c("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f34096m, 2, 5126, false, 0, (Buffer) f34082s);
        m85054c("glVertexAttribPointer");
    }

    /* renamed from: d */
    public final void m85053d() {
        HZ3.m103728j(this.f34086c == Thread.currentThread(), "Method call must be called on the GL thread.");
    }

    /* renamed from: e */
    public final void m85052e(boolean z) {
        boolean z2;
        String str;
        if (z == this.f34084a.get()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            str = "OpenGlRenderer is not initialized";
        } else {
            str = "OpenGlRenderer is already initialized";
        }
        HZ3.m103728j(z2, str);
    }

    /* renamed from: g */
    public final void m85050g() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f34087d = eglGetDisplay;
        if (!Objects.equals(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(this.f34087d, iArr, 0, iArr, 1)) {
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig(this.f34087d, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12610, 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.f34087d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    m85055b("eglCreateContext");
                    this.f34089f = eGLConfig;
                    this.f34088e = eglCreateContext;
                    int[] iArr2 = new int[1];
                    EGL14.eglQueryContext(this.f34087d, eglCreateContext, 12440, iArr2, 0);
                    Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
                    return;
                }
                throw new IllegalStateException("Unable to find a suitable EGLConfig");
            }
            this.f34087d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        throw new IllegalStateException("Unable to get EGL14 display");
    }

    /* renamed from: i */
    public final AbstractC7507a m85048i(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.f34087d;
            EGLConfig eGLConfig = this.f34089f;
            Objects.requireNonNull(eGLConfig);
            EGLSurface m85043n = m85043n(eGLDisplay, eGLConfig, surface);
            Size m85041p = m85041p(m85043n);
            return AbstractC7507a.m85027d(m85043n, m85041p.getWidth(), m85041p.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e) {
            C33928Jx2.m99521m("OpenGlRenderer", "Failed to create EGL surface: " + e.getMessage(), e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m85046k(InterfaceC35101Ox5 interfaceC35101Ox5) {
        int i;
        int i2;
        int i3;
        try {
            i2 = m85036u(35633, f34077n);
            try {
                i = m85038s(interfaceC35101Ox5);
                try {
                    i3 = GLES20.glCreateProgram();
                    try {
                        m85054c("glCreateProgram");
                        GLES20.glAttachShader(i3, i2);
                        m85054c("glAttachShader");
                        GLES20.glAttachShader(i3, i);
                        m85054c("glAttachShader");
                        GLES20.glLinkProgram(i3);
                        int[] iArr = new int[1];
                        GLES20.glGetProgramiv(i3, 35714, iArr, 0);
                        if (iArr[0] == 1) {
                            this.f34093j = i3;
                            return;
                        }
                        throw new IllegalStateException("Could not link program: " + GLES20.glGetProgramInfoLog(i3));
                    } catch (IllegalArgumentException e) {
                        e = e;
                        if (i2 != -1) {
                            GLES20.glDeleteShader(i2);
                        }
                        if (i != -1) {
                            GLES20.glDeleteShader(i);
                        }
                        if (i3 != -1) {
                            GLES20.glDeleteProgram(i3);
                        }
                        throw e;
                    } catch (IllegalStateException e2) {
                        e = e2;
                        if (i2 != -1) {
                        }
                        if (i != -1) {
                        }
                        if (i3 != -1) {
                        }
                        throw e;
                    }
                } catch (IllegalArgumentException | IllegalStateException e3) {
                    e = e3;
                    i3 = -1;
                }
            } catch (IllegalArgumentException | IllegalStateException e4) {
                e = e4;
                i = -1;
                i3 = -1;
            }
        } catch (IllegalArgumentException | IllegalStateException e5) {
            e = e5;
            i = -1;
            i2 = -1;
            i3 = -1;
        }
    }

    /* renamed from: l */
    public final void m85045l() {
        EGLDisplay eGLDisplay = this.f34087d;
        EGLConfig eGLConfig = this.f34089f;
        Objects.requireNonNull(eGLConfig);
        this.f34090g = m85047j(eGLDisplay, eGLConfig, 1, 1);
    }

    /* renamed from: m */
    public final void m85044m() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        m85054c("glGenTextures");
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        m85054c("glBindTexture " + i);
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        m85054c("glTexParameter");
        this.f34092i = i;
    }

    /* renamed from: o */
    public final AbstractC7507a m85042o(Surface surface) {
        HZ3.m103728j(this.f34085b.containsKey(surface), "The surface is not registered.");
        AbstractC7507a abstractC7507a = this.f34085b.get(surface);
        Objects.requireNonNull(abstractC7507a);
        return abstractC7507a;
    }

    /* renamed from: p */
    public final Size m85041p(EGLSurface eGLSurface) {
        return new Size(m85034w(this.f34087d, eGLSurface, 12375), m85034w(this.f34087d, eGLSurface, 12374));
    }

    /* renamed from: q */
    public int m85040q() {
        m85052e(true);
        m85053d();
        return this.f34092i;
    }

    /* renamed from: r */
    public void m85039r(InterfaceC35101Ox5 interfaceC35101Ox5) {
        m85052e(false);
        try {
            m85050g();
            m85045l();
            m85035v(this.f34090g);
            m85046k(interfaceC35101Ox5);
            m85037t();
            m85044m();
            m85057D();
            this.f34086c = Thread.currentThread();
            this.f34084a.set(true);
        } catch (IllegalArgumentException | IllegalStateException e) {
            m85031z();
            throw e;
        }
    }

    /* renamed from: s */
    public final int m85038s(InterfaceC35101Ox5 interfaceC35101Ox5) {
        if (interfaceC35101Ox5 == InterfaceC35101Ox5.f27604a) {
            return m85036u(35632, f34078o);
        }
        try {
            String m91156a = interfaceC35101Ox5.m91156a("sTexture", "vTextureCoord");
            if (m91156a != null && m91156a.contains("vTextureCoord") && m91156a.contains("sTexture")) {
                return m85036u(35632, m91156a);
            }
            throw new IllegalArgumentException("Invalid fragment shader");
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException("Unable to compile fragment shader", th);
        }
    }

    /* renamed from: t */
    public final void m85037t() {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f34093j, "aPosition");
        this.f34095l = glGetAttribLocation;
        m85051f(glGetAttribLocation, "aPosition");
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f34093j, "aTextureCoord");
        this.f34096m = glGetAttribLocation2;
        m85051f(glGetAttribLocation2, "aTextureCoord");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f34093j, "uTexMatrix");
        this.f34094k = glGetUniformLocation;
        m85051f(glGetUniformLocation, "uTexMatrix");
    }

    /* renamed from: v */
    public final void m85035v(EGLSurface eGLSurface) {
        HZ3.m103731g(this.f34087d);
        HZ3.m103731g(this.f34088e);
        if (EGL14.eglMakeCurrent(this.f34087d, eGLSurface, eGLSurface, this.f34088e)) {
            return;
        }
        throw new IllegalStateException("eglMakeCurrent failed");
    }

    /* renamed from: x */
    public void m85033x(Surface surface) {
        m85052e(true);
        m85053d();
        if (!this.f34085b.containsKey(surface)) {
            this.f34085b.put(surface, f34083t);
        }
    }

    /* renamed from: y */
    public void m85032y() {
        if (!this.f34084a.getAndSet(false)) {
            return;
        }
        m85053d();
        m85031z();
    }

    /* renamed from: z */
    public final void m85031z() {
        int i = this.f34093j;
        if (i != -1) {
            GLES20.glDeleteProgram(i);
            this.f34093j = -1;
        }
        if (!Objects.equals(this.f34087d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f34087d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (AbstractC7507a abstractC7507a : this.f34085b.values()) {
                if (!Objects.equals(abstractC7507a.mo85030a(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f34087d, abstractC7507a.mo85030a())) {
                    m85056a("eglDestroySurface");
                }
            }
            this.f34085b.clear();
            if (!Objects.equals(this.f34090g, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f34087d, this.f34090g);
                this.f34090g = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f34088e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f34087d, this.f34088e);
                this.f34088e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f34087d);
            this.f34087d = EGL14.EGL_NO_DISPLAY;
        }
        this.f34089f = null;
        this.f34093j = -1;
        this.f34094k = -1;
        this.f34095l = -1;
        this.f34096m = -1;
        this.f34092i = -1;
        this.f34091h = null;
        this.f34086c = null;
    }
}
