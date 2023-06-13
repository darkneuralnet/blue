.class public final synthetic Lc74;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lf74;

.field public final synthetic c:Landroidx/camera/core/h$o;


# direct methods
.method public synthetic constructor <init>(Lf74;Landroidx/camera/core/h$o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc74;->b:Lf74;

    iput-object p2, p0, Lc74;->c:Landroidx/camera/core/h$o;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lc74;->b:Lf74;

    iget-object v1, p0, Lc74;->c:Landroidx/camera/core/h$o;

    invoke-static {v0, v1}, Le74;->c(Lf74;Landroidx/camera/core/h$o;)V

    return-void
.end method
