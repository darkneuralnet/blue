.class public Landroidx/camera/core/h$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/j$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/core/h;->R0(Landroidx/camera/core/h$n;Ljava/util/concurrent/Executor;Landroidx/camera/core/h$m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroidx/camera/core/h$m;

.field public final synthetic b:Landroidx/camera/core/h;


# direct methods
.method public constructor <init>(Landroidx/camera/core/h;Landroidx/camera/core/h$m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/camera/core/h$c;->b:Landroidx/camera/core/h;

    iput-object p2, p0, Landroidx/camera/core/h$c;->a:Landroidx/camera/core/h$m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/camera/core/h$o;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/h$c;->a:Landroidx/camera/core/h$m;

    invoke-interface {v0, p1}, Landroidx/camera/core/h$m;->a(Landroidx/camera/core/h$o;)V

    return-void
.end method

.method public b(Landroidx/camera/core/j$c;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    sget-object v0, Landroidx/camera/core/j$c;->b:Landroidx/camera/core/j$c;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Landroidx/camera/core/h$c;->a:Landroidx/camera/core/h$m;

    new-instance v1, Landroidx/camera/core/ImageCaptureException;

    invoke-direct {v1, p1, p2, p3}, Landroidx/camera/core/ImageCaptureException;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {v0, v1}, Landroidx/camera/core/h$m;->b(Landroidx/camera/core/ImageCaptureException;)V

    return-void
.end method
