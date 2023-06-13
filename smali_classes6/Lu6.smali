.class public abstract LLu6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LLu6$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LLu6$a;
    .locals 1
    .annotation build Lcom/google/android/gms/common/annotation/KeepForSdk;
    .end annotation

    new-instance v0, LsZ6;

    invoke-direct {v0}, LsZ6;-><init>()V

    invoke-virtual {v0, p0}, LsZ6;->d(Ljava/lang/String;)LLu6$a;

    if-nez p1, :cond_0

    const-string p1, "mlkit-google-ocr-models"

    :cond_0
    invoke-virtual {v0, p1}, LLu6$a;->c(Ljava/lang/String;)LLu6$a;

    invoke-virtual {v0, p2}, LLu6$a;->b(Ljava/lang/String;)LLu6$a;

    return-object v0
.end method


# virtual methods
.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()Ljava/lang/String;
.end method
