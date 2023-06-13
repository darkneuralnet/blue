.class public final Lcom/github/kittinunf/fuel/android/util/AndroidEnvironment;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvf1;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006R\"\u0010\r\u001a\u00020\u00088\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\t\u001a\u0004\u0008\u0003\u0010\n\"\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/github/kittinunf/fuel/android/util/AndroidEnvironment;",
        "Lvf1;",
        "Landroid/os/Handler;",
        "a",
        "Landroid/os/Handler;",
        "b",
        "()Landroid/os/Handler;",
        "handler",
        "Ljava/util/concurrent/Executor;",
        "Ljava/util/concurrent/Executor;",
        "()Ljava/util/concurrent/Executor;",
        "setCallbackExecutor",
        "(Ljava/util/concurrent/Executor;)V",
        "callbackExecutor",
        "<init>",
        "()V",
        "fuel-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field public final a:Landroid/os/Handler;

.field public b:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/github/kittinunf/fuel/android/util/AndroidEnvironment;->a:Landroid/os/Handler;

    new-instance v0, Lcom/github/kittinunf/fuel/android/util/AndroidEnvironment$a;

    invoke-direct {v0, p0}, Lcom/github/kittinunf/fuel/android/util/AndroidEnvironment$a;-><init>(Lcom/github/kittinunf/fuel/android/util/AndroidEnvironment;)V

    iput-object v0, p0, Lcom/github/kittinunf/fuel/android/util/AndroidEnvironment;->b:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lcom/github/kittinunf/fuel/android/util/AndroidEnvironment;->b:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public final b()Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/github/kittinunf/fuel/android/util/AndroidEnvironment;->a:Landroid/os/Handler;

    return-object v0
.end method
