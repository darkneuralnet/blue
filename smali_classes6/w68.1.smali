.class public final synthetic Lw68;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/google/android/libraries/intelligence/acceleration/ProcessStateObserver;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/libraries/intelligence/acceleration/ProcessStateObserver;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw68;->b:Lcom/google/android/libraries/intelligence/acceleration/ProcessStateObserver;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lw68;->b:Lcom/google/android/libraries/intelligence/acceleration/ProcessStateObserver;

    invoke-static {}, LDe8;->a()LLifecycleOwner;

    move-result-object v1

    invoke-interface {v1}, LLifecycleOwner;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/lifecycle/f;->a(LFq2;)V

    return-void
.end method
