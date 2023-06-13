.class public Landroidx/camera/core/h$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCA1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/core/h;->T0(Landroidx/camera/core/h$i;)Lcom/google/common/util/concurrent/ListenableFuture;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LCA1<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:LO80$a;

.field public final synthetic b:Landroidx/camera/core/h;


# direct methods
.method public constructor <init>(Landroidx/camera/core/h;LO80$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/camera/core/h$e;->b:Landroidx/camera/core/h;

    iput-object p2, p0, Landroidx/camera/core/h$e;->a:LO80$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)V
    .locals 0

    iget-object p1, p0, Landroidx/camera/core/h$e;->b:Landroidx/camera/core/h;

    invoke-virtual {p1}, Landroidx/camera/core/h;->W0()V

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/h$e;->b:Landroidx/camera/core/h;

    invoke-virtual {v0}, Landroidx/camera/core/h;->W0()V

    iget-object v0, p0, Landroidx/camera/core/h$e;->a:LO80$a;

    invoke-virtual {v0, p1}, LO80$a;->f(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Landroidx/camera/core/h$e;->a(Ljava/lang/Void;)V

    return-void
.end method
