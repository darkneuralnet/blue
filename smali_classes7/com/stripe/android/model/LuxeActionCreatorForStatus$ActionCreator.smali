.class public abstract Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/LuxeActionCreatorForStatus;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "ActionCreator"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator$RedirectActionCreator;,
        Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator$NoActionCreator;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00080\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0008H \u00a2\u0006\u0002\u0008\t\u0082\u0001\u0002\u000c\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator;",
        "",
        "()V",
        "create",
        "Lcom/stripe/android/model/LuxeNextActionRepository$Result;",
        "stripeIntentJsonString",
        "",
        "stripeIntentJson",
        "Lorg/json/JSONObject;",
        "create$payments_core_release",
        "NoActionCreator",
        "RedirectActionCreator",
        "Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator$NoActionCreator;",
        "Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator$RedirectActionCreator;",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/String;)Lcom/stripe/android/model/LuxeNextActionRepository$Result;
    .locals 1

    const-string v0, "stripeIntentJsonString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/model/LuxeActionCreatorForStatus$ActionCreator;->create$payments_core_release(Lorg/json/JSONObject;)Lcom/stripe/android/model/LuxeNextActionRepository$Result;

    move-result-object p1

    return-object p1
.end method

.method public abstract create$payments_core_release(Lorg/json/JSONObject;)Lcom/stripe/android/model/LuxeNextActionRepository$Result;
.end method
