.class public abstract LGu6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(LJs8;)LGu6;
    .locals 4

    invoke-virtual {p0}, LJs8;->H()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LJs8;->G()Ljava/lang/String;

    move-result-object v0

    :cond_0
    new-instance v1, Lvu;

    invoke-virtual {p0}, LJs8;->G()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, LJs8;->D()F

    move-result v3

    invoke-virtual {p0}, LJs8;->E()I

    move-result p0

    invoke-direct {v1, v2, v0, v3, p0}, Lvu;-><init>(Ljava/lang/String;Ljava/lang/String;FI)V

    return-object v1
.end method


# virtual methods
.method public abstract a()Ljava/lang/String;
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation
.end method

.method public abstract b()I
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation
.end method

.method public abstract c()F
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation
.end method

.method public abstract d()Ljava/lang/String;
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation
.end method
