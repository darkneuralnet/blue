.class public final synthetic Ly90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/camera/core/impl/q$c;

.field public final synthetic c:Landroidx/camera/core/impl/q;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/impl/q$c;Landroidx/camera/core/impl/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly90;->b:Landroidx/camera/core/impl/q$c;

    iput-object p2, p0, Ly90;->c:Landroidx/camera/core/impl/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ly90;->b:Landroidx/camera/core/impl/q$c;

    iget-object v1, p0, Ly90;->c:Landroidx/camera/core/impl/q;

    invoke-static {v0, v1}, LF90;->v(Landroidx/camera/core/impl/q$c;Landroidx/camera/core/impl/q;)V

    return-void
.end method
