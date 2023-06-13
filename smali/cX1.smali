.class public final synthetic LcX1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroidx/camera/core/h$i;

.field public final synthetic c:Landroidx/camera/core/i;


# direct methods
.method public synthetic constructor <init>(Landroidx/camera/core/h$i;Landroidx/camera/core/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LcX1;->b:Landroidx/camera/core/h$i;

    iput-object p2, p0, LcX1;->c:Landroidx/camera/core/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LcX1;->b:Landroidx/camera/core/h$i;

    iget-object v1, p0, LcX1;->c:Landroidx/camera/core/i;

    invoke-static {v0, v1}, Landroidx/camera/core/h$i;->b(Landroidx/camera/core/h$i;Landroidx/camera/core/i;)V

    return-void
.end method
