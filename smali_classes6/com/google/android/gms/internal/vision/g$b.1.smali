.class public final enum Lcom/google/android/gms/internal/vision/g$b;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LmI8;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/vision/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/android/gms/internal/vision/g$b;",
        ">;",
        "LmI8;"
    }
.end annotation


# static fields
.field public static final enum c:Lcom/google/android/gms/internal/vision/g$b;

.field public static final enum d:Lcom/google/android/gms/internal/vision/g$b;

.field public static final enum e:Lcom/google/android/gms/internal/vision/g$b;

.field public static final f:LWI8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LWI8<",
            "Lcom/google/android/gms/internal/vision/g$b;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic g:[Lcom/google/android/gms/internal/vision/g$b;


# instance fields
.field public final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/google/android/gms/internal/vision/g$b;

    const-string v1, "CLASSIFICATION_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/vision/g$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/android/gms/internal/vision/g$b;->c:Lcom/google/android/gms/internal/vision/g$b;

    new-instance v1, Lcom/google/android/gms/internal/vision/g$b;

    const-string v3, "CLASSIFICATION_NONE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lcom/google/android/gms/internal/vision/g$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/android/gms/internal/vision/g$b;->d:Lcom/google/android/gms/internal/vision/g$b;

    new-instance v3, Lcom/google/android/gms/internal/vision/g$b;

    const-string v5, "CLASSIFICATION_ALL"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lcom/google/android/gms/internal/vision/g$b;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/google/android/gms/internal/vision/g$b;->e:Lcom/google/android/gms/internal/vision/g$b;

    const/4 v5, 0x3

    new-array v5, v5, [Lcom/google/android/gms/internal/vision/g$b;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lcom/google/android/gms/internal/vision/g$b;->g:[Lcom/google/android/gms/internal/vision/g$b;

    new-instance v0, Lcom/google/android/gms/internal/vision/u;

    invoke-direct {v0}, Lcom/google/android/gms/internal/vision/u;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/vision/g$b;->f:LWI8;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/android/gms/internal/vision/g$b;->b:I

    return-void
.end method

.method public static a(I)Lcom/google/android/gms/internal/vision/g$b;
    .locals 1

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lcom/google/android/gms/internal/vision/g$b;->e:Lcom/google/android/gms/internal/vision/g$b;

    return-object p0

    :cond_1
    sget-object p0, Lcom/google/android/gms/internal/vision/g$b;->d:Lcom/google/android/gms/internal/vision/g$b;

    return-object p0

    :cond_2
    sget-object p0, Lcom/google/android/gms/internal/vision/g$b;->c:Lcom/google/android/gms/internal/vision/g$b;

    return-object p0
.end method

.method public static b()LKI8;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/vision/v;->a:LKI8;

    return-object v0
.end method

.method public static values()[Lcom/google/android/gms/internal/vision/g$b;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/vision/g$b;->g:[Lcom/google/android/gms/internal/vision/g$b;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/vision/g$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/vision/g$b;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-class v1, Lcom/google/android/gms/internal/vision/g$b;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " number="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/gms/internal/vision/g$b;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3e

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/vision/g$b;->b:I

    return v0
.end method
