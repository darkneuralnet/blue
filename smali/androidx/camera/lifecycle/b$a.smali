.class public Landroidx/camera/lifecycle/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCA1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/camera/lifecycle/b;->i(Landroid/content/Context;)Lcom/google/common/util/concurrent/ListenableFuture;
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

.field public final synthetic b:Lyc0;

.field public final synthetic c:Landroidx/camera/lifecycle/b;


# direct methods
.method public constructor <init>(Landroidx/camera/lifecycle/b;LO80$a;Lyc0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/camera/lifecycle/b$a;->c:Landroidx/camera/lifecycle/b;

    iput-object p2, p0, Landroidx/camera/lifecycle/b$a;->a:LO80$a;

    iput-object p3, p0, Landroidx/camera/lifecycle/b$a;->b:Lyc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)V
    .locals 1

    iget-object p1, p0, Landroidx/camera/lifecycle/b$a;->a:LO80$a;

    iget-object v0, p0, Landroidx/camera/lifecycle/b$a;->b:Lyc0;

    invoke-virtual {p1, v0}, LO80$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/lifecycle/b$a;->a:LO80$a;

    invoke-virtual {v0, p1}, LO80$a;->f(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Landroidx/camera/lifecycle/b$a;->a(Ljava/lang/Void;)V

    return-void
.end method
