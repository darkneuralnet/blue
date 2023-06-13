.class public abstract LKu6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LKu6$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(Lcom/google/mlkit/common/MlKitException;)LKu6;
    .locals 3

    new-instance v0, Lxu;

    const/4 v1, 0x0

    invoke-static {}, LmV8;->u()LmV8;

    move-result-object v2

    invoke-direct {v0, v1, p0, v2}, Lxu;-><init>(ZLcom/google/mlkit/common/MlKitException;Ljava/util/Set;)V

    return-object v0
.end method

.method public static f()LKu6;
    .locals 4

    new-instance v0, Lxu;

    const/4 v1, 0x0

    invoke-static {}, LmV8;->u()LmV8;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v0, v3, v1, v2}, Lxu;-><init>(ZLcom/google/mlkit/common/MlKitException;Ljava/util/Set;)V

    return-object v0
.end method


# virtual methods
.method public abstract a()Ljava/util/Set;
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "LKu6$a;",
            ">;"
        }
    .end annotation
.end method

.method public abstract b()Lcom/google/mlkit/common/MlKitException;
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation
.end method

.method public abstract c()Z
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation
.end method

.method public d()V
    .locals 1
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/mlkit/common/MlKitException;
        }
    .end annotation

    invoke-virtual {p0}, LKu6;->b()Lcom/google/mlkit/common/MlKitException;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    throw v0
.end method
