.class final Lcom/google/android/filament/AndroidPlatform;
.super Lcom/google/android/filament/Platform;
.source "SourceFile"


# static fields
.field private static final LOG_TAG:Ljava/lang/String; = "Filament"

.field public static final synthetic a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Landroid/opengl/EGL14;->eglGetDisplay(I)Landroid/opengl/EGLDisplay;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/filament/Platform;-><init>()V

    return-void
.end method


# virtual methods
.method public getSharedContextNativeHandle(Ljava/lang/Object;)J
    .locals 2

    invoke-static {p1}, Lcom/google/android/filament/AndroidPlatform21;->getSharedContextNativeHandle(Ljava/lang/Object;)J

    move-result-wide v0

    return-wide v0
.end method

.method public log(Ljava/lang/String;)V
    .locals 1

    const-string v0, "Filament"

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public validateSharedContext(Ljava/lang/Object;)Z
    .locals 0

    instance-of p1, p1, Landroid/opengl/EGLContext;

    return p1
.end method

.method public validateStreamSource(Ljava/lang/Object;)Z
    .locals 0

    instance-of p1, p1, Landroid/graphics/SurfaceTexture;

    return p1
.end method

.method public validateSurface(Ljava/lang/Object;)Z
    .locals 0

    instance-of p1, p1, Landroid/view/Surface;

    return p1
.end method

.method public warn(Ljava/lang/String;)V
    .locals 1

    const-string v0, "Filament"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
