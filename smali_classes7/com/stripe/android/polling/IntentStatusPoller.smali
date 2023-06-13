.class public interface abstract Lcom/stripe/android/polling/IntentStatusPoller;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/polling/IntentStatusPoller$Config;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008g\u0018\u00002\u00020\u0001:\u0001\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0008\u0010\t\u001a\u00020\u0004H&R\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\n8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000c\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/polling/IntentStatusPoller;",
        "",
        "LZC0;",
        "scope",
        "",
        "startPolling",
        "Lcom/stripe/android/model/StripeIntent$Status;",
        "forcePoll",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "stopPolling",
        "LtP5;",
        "getState",
        "()LtP5;",
        "state",
        "Config",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public abstract forcePoll(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/model/StripeIntent$Status;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getState()LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LtP5<",
            "Lcom/stripe/android/model/StripeIntent$Status;",
            ">;"
        }
    .end annotation
.end method

.method public abstract startPolling(LZC0;)V
.end method

.method public abstract stopPolling()V
.end method
