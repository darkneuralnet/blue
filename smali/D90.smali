.class public final synthetic LD90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LF90;

.field public final synthetic c:Lrf0;

.field public final synthetic d:Landroidx/camera/core/impl/DeferrableSurface;

.field public final synthetic e:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(LF90;Lrf0;Landroidx/camera/core/impl/DeferrableSurface;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD90;->b:LF90;

    iput-object p2, p0, LD90;->c:Lrf0;

    iput-object p3, p0, LD90;->d:Landroidx/camera/core/impl/DeferrableSurface;

    iput-object p4, p0, LD90;->e:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LD90;->b:LF90;

    iget-object v1, p0, LD90;->c:Lrf0;

    iget-object v2, p0, LD90;->d:Landroidx/camera/core/impl/DeferrableSurface;

    iget-object v3, p0, LD90;->e:Ljava/lang/Runnable;

    invoke-static {v0, v1, v2, v3}, LF90;->t(LF90;Lrf0;Landroidx/camera/core/impl/DeferrableSurface;Ljava/lang/Runnable;)V

    return-void
.end method
