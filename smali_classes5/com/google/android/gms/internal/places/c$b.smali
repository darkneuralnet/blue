.class public abstract Lcom/google/android/gms/internal/places/c$b;
.super Lcom/google/android/gms/internal/places/c;
.source "SourceFile"

# interfaces
.implements LZT7;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/places/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/places/c$b<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/places/c<",
        "TMessageType;TBuilderType;>;",
        "LZT7;"
    }
.end annotation


# instance fields
.field protected zzik:LGx7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LGx7<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/places/c;-><init>()V

    invoke-static {}, LGx7;->f()LGx7;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/places/c$b;->zzik:LGx7;

    return-void
.end method


# virtual methods
.method public final s()LGx7;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LGx7<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/places/c$b;->zzik:LGx7;

    invoke-virtual {v0}, LGx7;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/places/c$b;->zzik:LGx7;

    invoke-virtual {v0}, LGx7;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LGx7;

    iput-object v0, p0, Lcom/google/android/gms/internal/places/c$b;->zzik:LGx7;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/places/c$b;->zzik:LGx7;

    return-object v0
.end method
