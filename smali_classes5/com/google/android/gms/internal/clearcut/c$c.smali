.class public abstract Lcom/google/android/gms/internal/clearcut/c$c;
.super Lcom/google/android/gms/internal/clearcut/c;
.source "SourceFile"

# interfaces
.implements Lk38;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/clearcut/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/clearcut/c$c<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/clearcut/c<",
        "TMessageType;TBuilderType;>;",
        "Lk38;"
    }
.end annotation


# instance fields
.field protected zzjv:LTO7;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LTO7<",
            "Lcom/google/android/gms/internal/clearcut/c$d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/clearcut/c;-><init>()V

    invoke-static {}, LTO7;->k()LTO7;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/clearcut/c$c;->zzjv:LTO7;

    return-void
.end method
