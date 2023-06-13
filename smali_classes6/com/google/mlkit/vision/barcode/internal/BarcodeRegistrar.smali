.class public Lcom/google/mlkit/vision/barcode/internal/BarcodeRegistrar;
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
    .locals 3

    const-class v0, LLe8;

    invoke-static {v0}, LEs0;->e(Ljava/lang/Class;)LEs0$b;

    move-result-object v1

    const-class v2, LyU2;

    invoke-static {v2}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v2

    invoke-virtual {v1, v2}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v1

    sget-object v2, LnQ7;->a:LnQ7;

    invoke-virtual {v1, v2}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object v1

    invoke-virtual {v1}, LEs0$b;->d()LEs0;

    move-result-object v1

    const-class v2, LF68;

    invoke-static {v2}, LEs0;->e(Ljava/lang/Class;)LEs0$b;

    move-result-object v2

    invoke-static {v0}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v0

    invoke-virtual {v2, v0}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v0

    const-class v2, LIh1;

    invoke-static {v2}, Lk01;->k(Ljava/lang/Class;)Lk01;

    move-result-object v2

    invoke-virtual {v0, v2}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v0

    sget-object v2, LwY7;->a:LwY7;

    invoke-virtual {v0, v2}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object v0

    invoke-virtual {v0}, LEs0$b;->d()LEs0;

    move-result-object v0

    invoke-static {v1, v0}, LDR7;->o(Ljava/lang/Object;Ljava/lang/Object;)LDR7;

    move-result-object v0

    return-object v0
.end method
