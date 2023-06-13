.class public Lcom/google/mlkit/vision/objects/defaults/internal/DefaultObjectsRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 4

    new-instance v0, LSt7;

    invoke-direct {v0}, LSt7;-><init>()V

    const-class v1, LHC7;

    invoke-static {v1}, LEs0;->e(Ljava/lang/Class;)LEs0$b;

    move-result-object v2

    const-class v3, LyU2;

    invoke-static {v3}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v3

    invoke-virtual {v2, v3}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v2

    sget-object v3, LPe8;->a:LPe8;

    invoke-virtual {v2, v3}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object v2

    invoke-virtual {v2}, LEs0$b;->d()LEs0;

    move-result-object v2

    invoke-virtual {v0, v2}, LSt7;->d(Ljava/lang/Object;)LSt7;

    const-class v2, Lmf7;

    invoke-static {v2}, LEs0;->e(Ljava/lang/Class;)LEs0$b;

    move-result-object v3

    invoke-static {v1}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v1

    invoke-virtual {v3, v1}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v1

    const-class v3, LIh1;

    invoke-static {v3}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v3

    invoke-virtual {v1, v3}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v1

    sget-object v3, LCm8;->a:LCm8;

    invoke-virtual {v1, v3}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object v1

    invoke-virtual {v1}, LEs0$b;->d()LEs0;

    move-result-object v1

    invoke-virtual {v0, v1}, LSt7;->d(Ljava/lang/Object;)LSt7;

    const-class v1, Lcom/google/mlkit/vision/common/internal/a$d;

    invoke-static {v1}, LEs0;->m(Ljava/lang/Class;)LEs0$b;

    move-result-object v1

    invoke-static {v2}, Lk01;->l(Ljava/lang/Class;)Lk01;

    move-result-object v2

    invoke-virtual {v1, v2}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v1

    sget-object v2, LBt8;->a:LBt8;

    invoke-virtual {v1, v2}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object v1

    invoke-virtual {v1}, LEs0$b;->d()LEs0;

    move-result-object v1

    invoke-virtual {v0, v1}, LSt7;->d(Ljava/lang/Object;)LSt7;

    invoke-virtual {v0}, LSt7;->e()Lbw7;

    move-result-object v0

    return-object v0
.end method
