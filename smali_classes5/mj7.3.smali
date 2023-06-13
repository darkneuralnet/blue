.class public final Lmj7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/android/gms/internal/places/zzaj;

.field public final b:[B


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-array p1, p1, [B

    iput-object p1, p0, Lmj7;->b:[B

    invoke-static {p1}, Lcom/google/android/gms/internal/places/zzaj;->y([B)Lcom/google/android/gms/internal/places/zzaj;

    move-result-object p1

    iput-object p1, p0, Lmj7;->a:Lcom/google/android/gms/internal/places/zzaj;

    return-void
.end method

.method public synthetic constructor <init>(ILLt9;)V
    .locals 0

    invoke-direct {p0, p1}, Lmj7;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljv9;
    .locals 2

    iget-object v0, p0, Lmj7;->a:Lcom/google/android/gms/internal/places/zzaj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/places/zzaj;->b()I

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ldl7;

    iget-object v1, p0, Lmj7;->b:[B

    invoke-direct {v0, v1}, Ldl7;-><init>([B)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Did not write as much data as expected."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()Lcom/google/android/gms/internal/places/zzaj;
    .locals 1

    iget-object v0, p0, Lmj7;->a:Lcom/google/android/gms/internal/places/zzaj;

    return-object v0
.end method
