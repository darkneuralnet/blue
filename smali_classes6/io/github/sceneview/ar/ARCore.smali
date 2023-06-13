.class public final Lio/github/sceneview/ar/ARCore;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxm;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001c\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0015\u001a\u00020\"\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u000e\u0008\u0002\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001d\u00a2\u0006\u0004\u0008Z\u0010[J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\n\u0010\n\u001a\u00060\u0008j\u0002`\tJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cJ\u001c\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014J\u0016\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u000eJ\u000e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cJ\u0016\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u000eJ\u001e\u0010!\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u001b2\u000e\u0008\u0002\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001dR\u0017\u0010\u0015\u001a\u00020\"8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010#\u001a\u0004\u0008$\u0010%R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)R\u001d\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010*\u001a\u0004\u0008+\u0010,R\"\u00102\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008!\u0010-\u001a\u0004\u0008.\u0010/\"\u0004\u00080\u00101R\"\u00105\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008$\u0010-\u001a\u0004\u00083\u0010/\"\u0004\u00084\u00101R(\u0010<\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u00086\u00107\u001a\u0004\u00088\u00109\"\u0004\u0008:\u0010;R\u0016\u0010>\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008=\u0010-R(\u0010C\u001a\u0008\u0012\u0004\u0012\u00020?0\u00108\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008@\u00107\u001a\u0004\u0008A\u00109\"\u0004\u0008B\u0010;R\u0016\u0010D\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008A\u0010-R\u0016\u0010\u0017\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00088\u0010-R(\u0010I\u001a\u0004\u0018\u00010 2\u0008\u0010E\u001a\u0004\u0018\u00010 8\u0000@BX\u0080\u000e\u00a2\u0006\u000c\n\u0004\u0008F\u0010G\u001a\u0004\u0008F\u0010HR=\u0010T\u001a\u001d\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\u000c\u0008K\u0012\u0008\u0008L\u0012\u0004\u0008\u0008(M\u0012\u0004\u0012\u00020\u00040J8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008N\u0010O\u001a\u0004\u0008P\u0010Q\"\u0004\u0008R\u0010SR=\u0010Y\u001a\u001d\u0012\u0013\u0012\u00110U\u00a2\u0006\u000c\u0008K\u0012\u0008\u0008L\u0012\u0004\u0008\u0008(V\u0012\u0004\u0012\u00020\u00040J8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010O\u001a\u0004\u0008W\u0010Q\"\u0004\u0008X\u0010S\u00a8\u0006\\"
    }
    d2 = {
        "Lio/github/sceneview/ar/ARCore;",
        "Lxm;",
        "LLifecycleOwner;",
        "owner",
        "",
        "onCreate",
        "onResume",
        "onDestroy",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "exception",
        "q",
        "Landroid/content/Context;",
        "context",
        "",
        "n",
        "LB5;",
        "",
        "permissionLauncher",
        "b",
        "Landroid/app/Activity;",
        "activity",
        "u",
        "installRequested",
        "d",
        "p",
        "o",
        "Lio/github/sceneview/ar/ArSceneLifecycle;",
        "lifecycle",
        "",
        "Lcom/google/ar/core/Session$Feature;",
        "features",
        "Lio/github/sceneview/ar/arcore/ArSession;",
        "e",
        "Landroidx/activity/ComponentActivity;",
        "Landroidx/activity/ComponentActivity;",
        "f",
        "()Landroidx/activity/ComponentActivity;",
        "c",
        "Lio/github/sceneview/ar/ArSceneLifecycle;",
        "getLifecycle",
        "()Lio/github/sceneview/ar/ArSceneLifecycle;",
        "Ljava/util/Set;",
        "getFeatures",
        "()Ljava/util/Set;",
        "Z",
        "getCheckCameraPermission",
        "()Z",
        "setCheckCameraPermission",
        "(Z)V",
        "checkCameraPermission",
        "getCheckAvailability",
        "setCheckAvailability",
        "checkAvailability",
        "g",
        "LB5;",
        "k",
        "()LB5;",
        "t",
        "(LB5;)V",
        "cameraPermissionLauncher",
        "h",
        "cameraPermissionRequested",
        "Landroid/content/Intent;",
        "i",
        "j",
        "s",
        "appSettingsLauncher",
        "appSettingsRequested",
        "<set-?>",
        "l",
        "Lio/github/sceneview/ar/arcore/ArSession;",
        "()Lio/github/sceneview/ar/arcore/ArSession;",
        "session",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "isGranted",
        "m",
        "Lkotlin/jvm/functions/Function1;",
        "getOnCameraPermissionResult",
        "()Lkotlin/jvm/functions/Function1;",
        "setOnCameraPermissionResult",
        "(Lkotlin/jvm/functions/Function1;)V",
        "onCameraPermissionResult",
        "Landroidx/activity/result/ActivityResult;",
        "result",
        "getOnAppSettingsResult",
        "setOnAppSettingsResult",
        "onAppSettingsResult",
        "<init>",
        "(Landroidx/activity/ComponentActivity;Lio/github/sceneview/ar/ArSceneLifecycle;Ljava/util/Set;)V",
        "arsceneview_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final b:Landroidx/activity/ComponentActivity;

.field public final c:Lio/github/sceneview/ar/ArSceneLifecycle;

.field public final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/google/ar/core/Session$Feature;",
            ">;"
        }
    .end annotation
.end field

.field public e:Z

.field public f:Z

.field public g:LB5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LB5<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public h:Z

.field public i:LB5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LB5<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation
.end field

.field public j:Z

.field public k:Z

.field public l:Lio/github/sceneview/ar/arcore/ArSession;

.field public m:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public n:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/activity/result/ActivityResult;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/activity/ComponentActivity;Lio/github/sceneview/ar/ArSceneLifecycle;Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/activity/ComponentActivity;",
            "Lio/github/sceneview/ar/ArSceneLifecycle;",
            "Ljava/util/Set<",
            "+",
            "Lcom/google/ar/core/Session$Feature;",
            ">;)V"
        }
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "features"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/github/sceneview/ar/ARCore;->b:Landroidx/activity/ComponentActivity;

    iput-object p2, p0, Lio/github/sceneview/ar/ARCore;->c:Lio/github/sceneview/ar/ArSceneLifecycle;

    iput-object p3, p0, Lio/github/sceneview/ar/ARCore;->d:Ljava/util/Set;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/github/sceneview/ar/ARCore;->e:Z

    iput-boolean p1, p0, Lio/github/sceneview/ar/ARCore;->f:Z

    new-instance p1, Lio/github/sceneview/ar/ARCore$b;

    invoke-direct {p1, p0}, Lio/github/sceneview/ar/ARCore$b;-><init>(Lio/github/sceneview/ar/ARCore;)V

    iput-object p1, p0, Lio/github/sceneview/ar/ARCore;->m:Lkotlin/jvm/functions/Function1;

    new-instance p1, Lio/github/sceneview/ar/ARCore$a;

    invoke-direct {p1, p0}, Lio/github/sceneview/ar/ARCore$a;-><init>(Lio/github/sceneview/ar/ARCore;)V

    iput-object p1, p0, Lio/github/sceneview/ar/ARCore;->n:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p2, p0}, LTX0;->a(LFq2;)V

    return-void
.end method

.method public static final synthetic a(Lio/github/sceneview/ar/ARCore;Z)V
    .locals 0

    iput-boolean p1, p0, Lio/github/sceneview/ar/ARCore;->j:Z

    return-void
.end method


# virtual methods
.method public F(Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, Lxm$a;->d(Lxm;Ljava/lang/Exception;)V

    return-void
.end method

.method public I(II)V
    .locals 0

    invoke-static {p0, p1, p2}, Lxm$a;->g(Lxm;II)V

    return-void
.end method

.method public final b(Landroid/content/Context;LB5;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "LB5<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permissionLauncher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/github/sceneview/ar/ARCore;->n(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "android.permission.CAMERA"

    invoke-virtual {p2, p1}, LB5;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    return p1
.end method

.method public c(Lio/github/sceneview/ar/arcore/ArSession;)V
    .locals 0

    invoke-static {p0, p1}, Lxm$a;->e(Lxm;Lio/github/sceneview/ar/arcore/ArSession;)V

    return-void
.end method

.method public final d(Landroid/app/Activity;Z)Z
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/github/sceneview/ar/ARCore;->p(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1, p2}, Lio/github/sceneview/ar/ARCore;->o(Landroid/app/Activity;Z)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final e(Lio/github/sceneview/ar/ArSceneLifecycle;Ljava/util/Set;)Lio/github/sceneview/ar/arcore/ArSession;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/github/sceneview/ar/ArSceneLifecycle;",
            "Ljava/util/Set<",
            "+",
            "Lcom/google/ar/core/Session$Feature;",
            ">;)",
            "Lio/github/sceneview/ar/arcore/ArSession;"
        }
    .end annotation

    const-string v0, "lifecycle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "features"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/github/sceneview/ar/arcore/ArSession;

    invoke-direct {v0, p1, p2}, Lio/github/sceneview/ar/arcore/ArSession;-><init>(Lio/github/sceneview/ar/ArSceneLifecycle;Ljava/util/Set;)V

    return-object v0
.end method

.method public final f()Landroidx/activity/ComponentActivity;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/ar/ARCore;->b:Landroidx/activity/ComponentActivity;

    return-object v0
.end method

.method public g(LPy1;)V
    .locals 0

    invoke-static {p0, p1}, Lxm$a;->f(Lxm;LPy1;)V

    return-void
.end method

.method public i(Lio/github/sceneview/ar/arcore/ArSession;Lcom/google/ar/core/Config;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lxm$a;->b(Lxm;Lio/github/sceneview/ar/arcore/ArSession;Lcom/google/ar/core/Config;)V

    return-void
.end method

.method public final j()LB5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LB5<",
            "Landroid/content/Intent;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/sceneview/ar/ARCore;->i:LB5;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "appSettingsLauncher"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final k()LB5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LB5<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/github/sceneview/ar/ARCore;->g:LB5;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "cameraPermissionLauncher"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final l()Lio/github/sceneview/ar/arcore/ArSession;
    .locals 1

    iget-object v0, p0, Lio/github/sceneview/ar/ARCore;->l:Lio/github/sceneview/ar/arcore/ArSession;

    return-object v0
.end method

.method public m(Lio/github/sceneview/ar/arcore/ArSession;)V
    .locals 0

    invoke-static {p0, p1}, Lxm$a;->c(Lxm;Lio/github/sceneview/ar/arcore/ArSession;)V

    return-void
.end method

.method public final n(Landroid/content/Context;)Z
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "android.permission.CAMERA"

    invoke-static {p1, v0}, LNA0;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final o(Landroid/app/Activity;Z)Z
    .locals 2

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/google/ar/core/ArCoreApk;->getInstance()Lcom/google/ar/core/ArCoreApk;

    move-result-object v0

    const/4 v1, 0x1

    xor-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Lcom/google/ar/core/ArCoreApk;->requestInstall(Landroid/app/Activity;Z)Lcom/google/ar/core/ArCoreApk$InstallStatus;

    move-result-object p1

    sget-object p2, Lcom/google/ar/core/ArCoreApk$InstallStatus;->INSTALL_REQUESTED:Lcom/google/ar/core/ArCoreApk$InstallStatus;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public onCreate(LLifecycleOwner;)V
    .locals 4

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, LVX0;->onCreate(LLifecycleOwner;)V

    iget-object v0, p0, Lio/github/sceneview/ar/ARCore;->b:Landroidx/activity/ComponentActivity;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getActivityResultRegistry()Landroidx/activity/result/ActivityResultRegistry;

    move-result-object v0

    new-instance v1, Ly5;

    invoke-direct {v1}, Ly5;-><init>()V

    iget-object v2, p0, Lio/github/sceneview/ar/ARCore;->m:Lkotlin/jvm/functions/Function1;

    new-instance v3, Ly;

    invoke-direct {v3, v2}, Ly;-><init>(Lkotlin/jvm/functions/Function1;)V

    const-string v2, "sceneview_camera_permission"

    invoke-virtual {v0, v2, p1, v1, v3}, Landroidx/activity/result/ActivityResultRegistry;->j(Ljava/lang/String;LLifecycleOwner;Lv5;Lt5;)LB5;

    move-result-object v0

    const-string v1, "activity.activityResultR\u2026ermissionResult\n        )"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lio/github/sceneview/ar/ARCore;->t(LB5;)V

    iget-object v0, p0, Lio/github/sceneview/ar/ARCore;->b:Landroidx/activity/ComponentActivity;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getActivityResultRegistry()Landroidx/activity/result/ActivityResultRegistry;

    move-result-object v0

    new-instance v1, Lz5;

    invoke-direct {v1}, Lz5;-><init>()V

    iget-object v2, p0, Lio/github/sceneview/ar/ARCore;->n:Lkotlin/jvm/functions/Function1;

    new-instance v3, Ly;

    invoke-direct {v3, v2}, Ly;-><init>(Lkotlin/jvm/functions/Function1;)V

    const-string v2, "sceneview_app_settings"

    invoke-virtual {v0, v2, p1, v1, v3}, Landroidx/activity/result/ActivityResultRegistry;->j(Ljava/lang/String;LLifecycleOwner;Lv5;Lt5;)LB5;

    move-result-object p1

    const-string v0, "activity.activityResultR\u2026pSettingsResult\n        )"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/github/sceneview/ar/ARCore;->s(LB5;)V

    return-void
.end method

.method public onDestroy(LLifecycleOwner;)V
    .locals 1

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/github/sceneview/ar/ARCore;->l:Lio/github/sceneview/ar/arcore/ArSession;

    invoke-super {p0, p1}, LVX0;->onDestroy(LLifecycleOwner;)V

    return-void
.end method

.method public onResume(LLifecycleOwner;)V
    .locals 4

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/github/sceneview/ar/ARCore;->l:Lio/github/sceneview/ar/arcore/ArSession;

    if-nez p1, :cond_5

    iget-boolean p1, p0, Lio/github/sceneview/ar/ARCore;->e:Z

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    iget-boolean p1, p0, Lio/github/sceneview/ar/ARCore;->h:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/github/sceneview/ar/ARCore;->b:Landroidx/activity/ComponentActivity;

    invoke-virtual {p0}, Lio/github/sceneview/ar/ARCore;->k()LB5;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lio/github/sceneview/ar/ARCore;->b(Landroid/content/Context;LB5;)Z

    move-result p1

    if-nez p1, :cond_0

    iput-boolean v0, p0, Lio/github/sceneview/ar/ARCore;->h:Z

    goto :goto_2

    :cond_0
    iget-boolean p1, p0, Lio/github/sceneview/ar/ARCore;->j:Z

    if-nez p1, :cond_5

    :try_start_0
    iget-boolean p1, p0, Lio/github/sceneview/ar/ARCore;->f:Z

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lio/github/sceneview/ar/ARCore;->k:Z

    if-nez p1, :cond_1

    iget-object v1, p0, Lio/github/sceneview/ar/ARCore;->b:Landroidx/activity/ComponentActivity;

    invoke-virtual {p0, v1, p1}, Lio/github/sceneview/ar/ARCore;->d(Landroid/app/Activity;Z)Z

    move-result p1

    if-nez p1, :cond_1

    iput-boolean v0, p0, Lio/github/sceneview/ar/ARCore;->k:Z

    goto :goto_2

    :cond_1
    iget-object p1, p0, Lio/github/sceneview/ar/ARCore;->c:Lio/github/sceneview/ar/ArSceneLifecycle;

    iget-object v0, p0, Lio/github/sceneview/ar/ARCore;->d:Ljava/util/Set;

    invoke-virtual {p0, p1, v0}, Lio/github/sceneview/ar/ARCore;->e(Lio/github/sceneview/ar/ArSceneLifecycle;Ljava/util/Set;)Lio/github/sceneview/ar/arcore/ArSession;

    move-result-object p1

    iput-object p1, p0, Lio/github/sceneview/ar/ARCore;->l:Lio/github/sceneview/ar/arcore/ArSession;

    if-eqz p1, :cond_5

    iget-object v0, p0, Lio/github/sceneview/ar/ARCore;->c:Lio/github/sceneview/ar/ArSceneLifecycle;

    invoke-virtual {v0}, LTX0;->q()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LFq2;

    instance-of v3, v2, Lxm;

    if-nez v3, :cond_3

    const/4 v2, 0x0

    :cond_3
    check-cast v2, Lxm;

    if-eqz v2, :cond_2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxm;

    invoke-interface {v1, p1}, Lxm;->m(Lio/github/sceneview/ar/arcore/ArSession;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, Lio/github/sceneview/ar/ARCore;->q(Ljava/lang/Exception;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public final p(Landroid/content/Context;)Z
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/google/ar/core/ArCoreApk;->getInstance()Lcom/google/ar/core/ArCoreApk;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/ar/core/ArCoreApk;->checkAvailability(Landroid/content/Context;)Lcom/google/ar/core/ArCoreApk$Availability;

    move-result-object p1

    sget-object v0, Lcom/google/ar/core/ArCoreApk$Availability;->SUPPORTED_INSTALLED:Lcom/google/ar/core/ArCoreApk$Availability;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final q(Ljava/lang/Exception;)V
    .locals 4

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/github/sceneview/ar/ARCore;->c:Lio/github/sceneview/ar/ArSceneLifecycle;

    invoke-virtual {v0}, LTX0;->q()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LFq2;

    instance-of v3, v2, Lxm;

    if-nez v3, :cond_1

    const/4 v2, 0x0

    :cond_1
    check-cast v2, Lxm;

    if-eqz v2, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxm;

    invoke-interface {v1, p1}, Lxm;->F(Ljava/lang/Exception;)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public r(Lrm;)V
    .locals 0

    invoke-static {p0, p1}, Lxm$a;->a(Lxm;Lrm;)V

    return-void
.end method

.method public final s(LB5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LB5<",
            "Landroid/content/Intent;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/github/sceneview/ar/ARCore;->i:LB5;

    return-void
.end method

.method public final t(LB5;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LB5<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/github/sceneview/ar/ARCore;->g:LB5;

    return-void
.end method

.method public final u(Landroid/app/Activity;)V
    .locals 4

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lhl4;->sceneview_camera_permission_required:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    invoke-virtual {p0}, Lio/github/sceneview/ar/ARCore;->j()LB5;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    const-string v3, "package"

    invoke-static {v3, p1, v2}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-virtual {v0, v1}, LB5;->a(Ljava/lang/Object;)V

    return-void
.end method
