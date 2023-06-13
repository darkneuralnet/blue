.class public Lcom/google/android/gms/nearby/messages/Strategy$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/nearby/messages/Strategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/nearby/messages/Strategy$a;->a:I

    const/16 v0, 0x12c

    iput v0, p0, Lcom/google/android/gms/nearby/messages/Strategy$a;->b:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/nearby/messages/Strategy$a;->c:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/nearby/messages/Strategy$a;->d:I

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/nearby/messages/Strategy;
    .locals 10

    iget v6, p0, Lcom/google/android/gms/nearby/messages/Strategy$a;->d:I

    const/4 v0, 0x2

    if-ne v6, v0, :cond_1

    iget v0, p0, Lcom/google/android/gms/nearby/messages/Strategy$a;->c:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot set EARSHOT with BLE only mode."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    new-instance v9, Lcom/google/android/gms/nearby/messages/Strategy;

    const/4 v1, 0x2

    const/4 v2, 0x0

    iget v3, p0, Lcom/google/android/gms/nearby/messages/Strategy$a;->b:I

    iget v4, p0, Lcom/google/android/gms/nearby/messages/Strategy$a;->c:I

    const/4 v5, 0x0

    iget v7, p0, Lcom/google/android/gms/nearby/messages/Strategy$a;->a:I

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/nearby/messages/Strategy;-><init>(IIIIZIII)V

    return-object v9
.end method

.method public b(I)Lcom/google/android/gms/nearby/messages/Strategy$a;
    .locals 6

    const v0, 0x7fffffff

    const v1, 0x15180

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq p1, v0, :cond_1

    if-lez p1, :cond_0

    if-gt p1, v1, :cond_0

    goto :goto_0

    :cond_0
    move v0, v2

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v3

    :goto_1
    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v4, v3

    const-string v1, "mTtlSeconds(%d) must either be TTL_SECONDS_INFINITE, or it must be between 1 and TTL_SECONDS_MAX(%d) inclusive"

    invoke-static {v0, v1, v4}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(ZLjava/lang/String;[Ljava/lang/Object;)V

    iput p1, p0, Lcom/google/android/gms/nearby/messages/Strategy$a;->b:I

    return-object p0
.end method

.method public final c(I)Lcom/google/android/gms/nearby/messages/Strategy$a;
    .locals 0
    .annotation build Lcom/google/android/gms/common/internal/ShowFirstParty;
    .end annotation

    const/4 p1, 0x2

    iput p1, p0, Lcom/google/android/gms/nearby/messages/Strategy$a;->d:I

    return-object p0
.end method
