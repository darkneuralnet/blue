.class public Lcom/google/mlkit/vision/common/internal/VisionCommonRegistrar;
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
    .locals 2

    const-class v0, Lcom/google/mlkit/vision/common/internal/a;

    invoke-static {v0}, LEs0;->e(Ljava/lang/Class;)LEs0$b;

    move-result-object v0

    const-class v1, Lcom/google/mlkit/vision/common/internal/a$d;

    invoke-static {v1}, Lk01;->m(Ljava/lang/Class;)Lk01;

    move-result-object v1

    invoke-virtual {v0, v1}, LEs0$b;->b(Lk01;)LEs0$b;

    move-result-object v0

    sget-object v1, LNe8;->a:LNe8;

    invoke-virtual {v0, v1}, LEs0$b;->f(LUs0;)LEs0$b;

    move-result-object v0

    invoke-virtual {v0}, LEs0$b;->d()LEs0;

    move-result-object v0

    invoke-static {v0}, LEd9;->s(Ljava/lang/Object;)LEd9;

    move-result-object v0

    return-object v0
.end method
