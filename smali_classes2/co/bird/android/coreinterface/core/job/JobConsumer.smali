.class public abstract Lco/bird/android/coreinterface/core/job/JobConsumer;
.super Landroidx/core/app/JobIntentService;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lco/bird/android/coreinterface/core/job/Payload;",
        ">",
        "Landroidx/core/app/JobIntentService;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\u0008&\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00028\u0000H&\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\r"
    }
    d2 = {
        "Lco/bird/android/coreinterface/core/job/JobConsumer;",
        "Lco/bird/android/coreinterface/core/job/Payload;",
        "T",
        "Landroidx/core/app/JobIntentService;",
        "Landroid/content/Intent;",
        "intent",
        "",
        "g",
        "payload",
        "handle",
        "(Lco/bird/android/coreinterface/core/job/Payload;)V",
        "<init>",
        "()V",
        "core-interface_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nJobConsumer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobConsumer.kt\nco/bird/android/coreinterface/core/job/JobConsumer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/core/app/JobIntentService;-><init>()V

    return-void
.end method


# virtual methods
.method public g(Landroid/content/Intent;)V
    .locals 1

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extra"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lco/bird/android/coreinterface/core/job/Payload;

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lco/bird/android/coreinterface/core/job/JobConsumer;->handle(Lco/bird/android/coreinterface/core/job/Payload;)V

    :cond_0
    return-void
.end method

.method public abstract handle(Lco/bird/android/coreinterface/core/job/Payload;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method
