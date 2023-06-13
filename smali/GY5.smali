.class public final synthetic LGY5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LJY5;

.field public final synthetic c:Landroidx/camera/core/ImageCaptureException;


# direct methods
.method public synthetic constructor <init>(LJY5;Landroidx/camera/core/ImageCaptureException;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGY5;->b:LJY5;

    iput-object p2, p0, LGY5;->c:Landroidx/camera/core/ImageCaptureException;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LGY5;->b:LJY5;

    iget-object v1, p0, LGY5;->c:Landroidx/camera/core/ImageCaptureException;

    invoke-static {v0, v1}, LJY5;->a(LJY5;Landroidx/camera/core/ImageCaptureException;)V

    return-void
.end method
