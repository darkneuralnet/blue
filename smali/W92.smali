.class public interface abstract LW92;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/p;


# static fields
.field public static final a:Landroidx/camera/core/impl/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/f$a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "camerax.core.io.ioExecutor"

    const-class v1, Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Landroidx/camera/core/impl/f$a;->a(Ljava/lang/String;Ljava/lang/Class;)Landroidx/camera/core/impl/f$a;

    move-result-object v0

    sput-object v0, LW92;->a:Landroidx/camera/core/impl/f$a;

    return-void
.end method
