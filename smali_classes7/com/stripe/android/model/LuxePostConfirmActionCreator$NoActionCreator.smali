.class public final Lcom/stripe/android/model/LuxePostConfirmActionCreator$NoActionCreator;
.super Lcom/stripe/android/model/LuxePostConfirmActionCreator;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/LuxePostConfirmActionCreator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "NoActionCreator"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0010\u00a2\u0006\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/model/LuxePostConfirmActionCreator$NoActionCreator;",
        "Lcom/stripe/android/model/LuxePostConfirmActionCreator;",
        "()V",
        "create",
        "Lcom/stripe/android/model/LuxePostConfirmActionRepository$Result$NoAction;",
        "stripeIntentJson",
        "Lorg/json/JSONObject;",
        "create$payments_core_release",
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

.field public static final INSTANCE:Lcom/stripe/android/model/LuxePostConfirmActionCreator$NoActionCreator;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/model/LuxePostConfirmActionCreator$NoActionCreator;

    invoke-direct {v0}, Lcom/stripe/android/model/LuxePostConfirmActionCreator$NoActionCreator;-><init>()V

    sput-object v0, Lcom/stripe/android/model/LuxePostConfirmActionCreator$NoActionCreator;->INSTANCE:Lcom/stripe/android/model/LuxePostConfirmActionCreator$NoActionCreator;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/stripe/android/model/LuxePostConfirmActionCreator;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public create$payments_core_release(Lorg/json/JSONObject;)Lcom/stripe/android/model/LuxePostConfirmActionRepository$Result$NoAction;
    .locals 1

    const-string v0, "stripeIntentJson"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/stripe/android/model/LuxePostConfirmActionRepository$Result$NoAction;->INSTANCE:Lcom/stripe/android/model/LuxePostConfirmActionRepository$Result$NoAction;

    return-object p1
.end method

.method public bridge synthetic create$payments_core_release(Lorg/json/JSONObject;)Lcom/stripe/android/model/LuxePostConfirmActionRepository$Result;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/stripe/android/model/LuxePostConfirmActionCreator$NoActionCreator;->create$payments_core_release(Lorg/json/JSONObject;)Lcom/stripe/android/model/LuxePostConfirmActionRepository$Result$NoAction;

    move-result-object p1

    return-object p1
.end method
