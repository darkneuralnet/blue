.class public final synthetic Lx90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LF90;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Landroidx/camera/core/impl/q;

.field public final synthetic e:Landroidx/camera/core/impl/s;


# direct methods
.method public synthetic constructor <init>(LF90;Ljava/lang/String;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx90;->b:LF90;

    iput-object p2, p0, Lx90;->c:Ljava/lang/String;

    iput-object p3, p0, Lx90;->d:Landroidx/camera/core/impl/q;

    iput-object p4, p0, Lx90;->e:Landroidx/camera/core/impl/s;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lx90;->b:LF90;

    iget-object v1, p0, Lx90;->c:Ljava/lang/String;

    iget-object v2, p0, Lx90;->d:Landroidx/camera/core/impl/q;

    iget-object v3, p0, Lx90;->e:Landroidx/camera/core/impl/s;

    invoke-static {v0, v1, v2, v3}, LF90;->y(LF90;Ljava/lang/String;Landroidx/camera/core/impl/q;Landroidx/camera/core/impl/s;)V

    return-void
.end method
