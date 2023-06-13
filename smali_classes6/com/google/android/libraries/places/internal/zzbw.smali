.class public final synthetic Lcom/google/android/libraries/places/internal/zzbw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnTokenCanceledListener;


# instance fields
.field public final synthetic zza:LOX1;


# direct methods
.method public synthetic constructor <init>(LOX1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/libraries/places/internal/zzbw;->zza:LOX1;

    return-void
.end method


# virtual methods
.method public final onCanceled()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzbw;->zza:LOX1;

    invoke-virtual {v0}, LOX1;->cancel()V

    return-void
.end method
