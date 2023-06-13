.class public final synthetic LgW5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/camera/core/o$i;

.field public final synthetic c:Landroidx/camera/core/o$h;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/o$i;Landroidx/camera/core/o$h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LgW5;->b:Landroidx/camera/core/o$i;

    iput-object p2, p0, LgW5;->c:Landroidx/camera/core/o$h;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LgW5;->b:Landroidx/camera/core/o$i;

    iget-object v1, p0, LgW5;->c:Landroidx/camera/core/o$h;

    invoke-static {v0, v1}, Landroidx/camera/core/o;->b(Landroidx/camera/core/o$i;Landroidx/camera/core/o$h;)V

    return-void
.end method
