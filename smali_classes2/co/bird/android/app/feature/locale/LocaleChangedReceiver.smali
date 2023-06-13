.class public final Lco/bird/android/app/feature/locale/LocaleChangedReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001c\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\"\u0010\u000e\u001a\u00020\u00088\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\t\u0010\u000b\"\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0011"
    }
    d2 = {
        "Lco/bird/android/app/feature/locale/LocaleChangedReceiver;",
        "Landroid/content/BroadcastReceiver;",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Intent;",
        "intent",
        "",
        "onReceive",
        "LQh2;",
        "a",
        "LQh2;",
        "()LQh2;",
        "setJobProducer",
        "(LQh2;)V",
        "jobProducer",
        "<init>",
        "()V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public a:LQh2;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    sget-object v0, LH22;->a:LH22;

    invoke-virtual {v0, p0}, LH22;->h0(Lco/bird/android/app/feature/locale/LocaleChangedReceiver;)V

    return-void
.end method


# virtual methods
.method public final a()LQh2;
    .locals 1

    iget-object v0, p0, Lco/bird/android/app/feature/locale/LocaleChangedReceiver;->a:LQh2;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "jobProducer"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string p2, "android.intent.action.LOCALE_CHANGED"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lco/bird/android/app/feature/locale/LocaleChangedReceiver;->a()LQh2;

    move-result-object p1

    new-instance p2, Lco/bird/android/app/feature/locale/LocaleChangedPayload;

    invoke-static {}, LFv2;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lco/bird/android/app/feature/locale/LocaleChangedPayload;-><init>(Ljava/lang/String;)V

    const-class v0, Lco/bird/android/app/feature/locale/LocaleChangedJobConsumer;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-interface {p1, p2, v0}, LQh2;->a(Lco/bird/android/coreinterface/core/job/Payload;Lkotlin/reflect/KClass;)V

    :cond_1
    return-void
.end method
