.class public abstract Lcom/google/android/gms/internal/vision/G$c;
.super Lcom/google/android/gms/internal/vision/G;
.source "SourceFile"

# interfaces
.implements LHQ8;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/vision/G;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/vision/G$c<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/vision/G<",
        "TMessageType;TBuilderType;>;",
        "LHQ8;"
    }
.end annotation


# instance fields
.field protected zzc:LqF8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LqF8<",
            "Lcom/google/android/gms/internal/vision/G$e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/vision/G;-><init>()V

    invoke-static {}, LqF8;->e()LqF8;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/vision/G$c;->zzc:LqF8;

    return-void
.end method


# virtual methods
.method public final u()LqF8;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LqF8<",
            "Lcom/google/android/gms/internal/vision/G$e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/vision/G$c;->zzc:LqF8;

    invoke-virtual {v0}, LqF8;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/vision/G$c;->zzc:LqF8;

    invoke-virtual {v0}, LqF8;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LqF8;

    iput-object v0, p0, Lcom/google/android/gms/internal/vision/G$c;->zzc:LqF8;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/vision/G$c;->zzc:LqF8;

    return-object v0
.end method
