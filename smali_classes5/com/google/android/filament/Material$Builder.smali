.class public Lcom/google/android/filament/Material$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/filament/Material;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private mBuffer:Ljava/nio/Buffer;

.field private mSize:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build(Lcom/google/android/filament/Engine;)Lcom/google/android/filament/Material;
    .locals 4

    invoke-virtual {p1}, Lcom/google/android/filament/Engine;->getNativeObject()J

    move-result-wide v0

    iget-object p1, p0, Lcom/google/android/filament/Material$Builder;->mBuffer:Ljava/nio/Buffer;

    iget v2, p0, Lcom/google/android/filament/Material$Builder;->mSize:I

    invoke-static {v0, v1, p1, v2}, Lcom/google/android/filament/Material;->access$000(JLjava/nio/Buffer;I)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    new-instance p1, Lcom/google/android/filament/Material;

    invoke-direct {p1, v0, v1}, Lcom/google/android/filament/Material;-><init>(J)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Couldn\'t create Material"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public payload(Ljava/nio/Buffer;I)Lcom/google/android/filament/Material$Builder;
    .locals 0

    iput-object p1, p0, Lcom/google/android/filament/Material$Builder;->mBuffer:Ljava/nio/Buffer;

    iput p2, p0, Lcom/google/android/filament/Material$Builder;->mSize:I

    return-object p0
.end method
