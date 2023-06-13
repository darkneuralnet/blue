.class public abstract Lcom/stripe/android/model/LuxePostConfirmActionCreator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/LuxePostConfirmActionCreator$Companion;,
        Lcom/stripe/android/model/LuxePostConfirmActionCreator$RedirectActionCreator;,
        Lcom/stripe/android/model/LuxePostConfirmActionCreator$NoActionCreator;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \n2\u00020\u0001:\u0003\n\u000b\u000cB\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\u0008\u0007J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\tH \u00a2\u0006\u0002\u0008\u0007\u0082\u0001\u0002\r\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/model/LuxePostConfirmActionCreator;",
        "",
        "()V",
        "create",
        "Lcom/stripe/android/model/LuxePostConfirmActionRepository$Result;",
        "stripeIntentJsonString",
        "",
        "create$payments_core_release",
        "stripeIntentJson",
        "Lorg/json/JSONObject;",
        "Companion",
        "NoActionCreator",
        "RedirectActionCreator",
        "Lcom/stripe/android/model/LuxePostConfirmActionCreator$NoActionCreator;",
        "Lcom/stripe/android/model/LuxePostConfirmActionCreator$RedirectActionCreator;",
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


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/model/LuxePostConfirmActionCreator$Companion;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/model/LuxePostConfirmActionCreator$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/model/LuxePostConfirmActionCreator$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/LuxePostConfirmActionCreator;->Companion:Lcom/stripe/android/model/LuxePostConfirmActionCreator$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/model/LuxePostConfirmActionCreator;-><init>()V

    return-void
.end method


# virtual methods
.method public final create$payments_core_release(Ljava/lang/String;)Lcom/stripe/android/model/LuxePostConfirmActionRepository$Result;
    .locals 1

    const-string v0, "stripeIntentJsonString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/model/LuxePostConfirmActionCreator;->create$payments_core_release(Lorg/json/JSONObject;)Lcom/stripe/android/model/LuxePostConfirmActionRepository$Result;

    move-result-object p1

    return-object p1
.end method

.method public abstract create$payments_core_release(Lorg/json/JSONObject;)Lcom/stripe/android/model/LuxePostConfirmActionRepository$Result;
.end method
