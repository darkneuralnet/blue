.class public final synthetic Lcom/google/android/libraries/places/internal/zzbq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnTokenCanceledListener;


# instance fields
.field public final synthetic zza:LUi2;


# direct methods
.method public synthetic constructor <init>(LUi2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/libraries/places/internal/zzbq;->zza:LUi2;

    return-void
.end method


# virtual methods
.method public final onCanceled()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/libraries/places/internal/zzbq;->zza:LUi2;

    invoke-virtual {v0}, Lhj2;->cancel()V

    return-void
.end method
