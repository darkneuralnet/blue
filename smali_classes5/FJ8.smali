.class public abstract LFJ8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh19;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "LQJ8<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "LFJ8<",
        "TMessageType;TBuilderType;>;>",
        "Ljava/lang/Object;",
        "Lh19;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic L([BLTQ8;)Lh19;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/measurement/zzll;
        }
    .end annotation

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0, p2}, LFJ8;->k([BIILTQ8;)LFJ8;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, LFJ8;->h()LFJ8;

    move-result-object v0

    return-object v0
.end method

.method public abstract h()LFJ8;
.end method

.method public j([BII)LFJ8;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/measurement/zzll;
        }
    .end annotation

    const/4 p1, 0x0

    throw p1
.end method

.method public k([BIILTQ8;)LFJ8;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/measurement/zzll;
        }
    .end annotation

    const/4 p1, 0x0

    throw p1
.end method

.method public final synthetic p2([B)Lh19;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/measurement/zzll;
        }
    .end annotation

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, LFJ8;->j([BII)LFJ8;

    move-result-object p1

    return-object p1
.end method
