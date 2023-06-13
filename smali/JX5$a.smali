.class public LJX5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LCA1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJX5;->l(Landroid/hardware/camera2/CameraDevice;Ltv5;Ljava/util/List;)Lcom/google/common/util/concurrent/ListenableFuture;
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
.field public final synthetic a:LJX5;


# direct methods
.method public constructor <init>(LJX5;)V
    .locals 0

    iput-object p1, p0, LJX5$a;->a:LJX5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)V
    .locals 0

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, LJX5$a;->a:LJX5;

    invoke-virtual {p1}, LJX5;->i()V

    iget-object p1, p0, LJX5$a;->a:LJX5;

    iget-object v0, p1, LJX5;->b:Lvf0;

    invoke-virtual {v0, p1}, Lvf0;->j(LDX5;)V

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, LJX5$a;->a(Ljava/lang/Void;)V

    return-void
.end method
