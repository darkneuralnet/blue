.class public final Lcom/appboy/BrazeInternal;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0007J \u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0007J\"\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\n2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0007J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0007J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0007J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/appboy/BrazeInternal;",
        "",
        "Landroid/content/Context;",
        "context",
        "",
        "ignoreRateLimit",
        "",
        "requestGeofenceRefresh",
        "Lbo/app/x1;",
        "location",
        "",
        "geofenceId",
        "Lbo/app/l1;",
        "transitionType",
        "recordGeofenceTransition",
        "serializedCardJson",
        "userId",
        "addSerializedContentCardToStorage",
        "logLocationRecordedEvent",
        "Landroid/content/Intent;",
        "intent",
        "handleInAppMessageTestPush",
        "applyPendingRuntimeConfiguration",
        "LlZ1;",
        "inAppMessageEvent",
        "retryInAppMessage",
        "Lcom/appboy/Appboy;",
        "getInstance",
        "<init>",
        "()V",
        "android-sdk-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/appboy/BrazeInternal;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/appboy/BrazeInternal;

    invoke-direct {v0}, Lcom/appboy/BrazeInternal;-><init>()V

    sput-object v0, Lcom/appboy/BrazeInternal;->INSTANCE:Lcom/appboy/BrazeInternal;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final addSerializedContentCardToStorage(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serializedCardJson"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/appboy/BrazeInternal;->INSTANCE:Lcom/appboy/BrazeInternal;

    invoke-direct {v0, p0}, Lcom/appboy/BrazeInternal;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Lcom/appboy/Appboy;->addSerializedCardJsonToStorage(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final applyPendingRuntimeConfiguration(Landroid/content/Context;)V
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/appboy/BrazeInternal;->INSTANCE:Lcom/appboy/BrazeInternal;

    invoke-direct {v0, p0}, Lcom/appboy/BrazeInternal;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object p0

    invoke-virtual {p0}, Lcom/appboy/Appboy;->applyPendingRuntimeConfiguration()V

    return-void
.end method

.method private final getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;
    .locals 1

    invoke-static {p1}, Lcom/appboy/Appboy;->getInstance(Landroid/content/Context;)LP10;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type com.appboy.Appboy"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final handleInAppMessageTestPush(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/appboy/BrazeInternal;->INSTANCE:Lcom/appboy/BrazeInternal;

    invoke-direct {v0, p0}, Lcom/appboy/BrazeInternal;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/appboy/Appboy;->handleInAppMessageTestPush(Landroid/content/Intent;)V

    return-void
.end method

.method public static final logLocationRecordedEvent(Landroid/content/Context;Lbo/app/x1;)V
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/appboy/BrazeInternal;->INSTANCE:Lcom/appboy/BrazeInternal;

    invoke-direct {v0, p0}, Lcom/appboy/BrazeInternal;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/appboy/Appboy;->logLocationRecordedEventFromLocationUpdate(Lbo/app/x1;)V

    return-void
.end method

.method public static final recordGeofenceTransition(Landroid/content/Context;Ljava/lang/String;Lbo/app/l1;)V
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "geofenceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transitionType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/appboy/BrazeInternal;->INSTANCE:Lcom/appboy/BrazeInternal;

    invoke-direct {v0, p0}, Lcom/appboy/BrazeInternal;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Lcom/appboy/Appboy;->recordGeofenceTransition(Ljava/lang/String;Lbo/app/l1;)V

    return-void
.end method

.method public static final requestGeofenceRefresh(Landroid/content/Context;Lbo/app/x1;)V
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/appboy/BrazeInternal;->INSTANCE:Lcom/appboy/BrazeInternal;

    invoke-direct {v0, p0}, Lcom/appboy/BrazeInternal;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/appboy/Appboy;->requestGeofenceRefresh(Lbo/app/x1;)V

    return-void
.end method

.method public static final requestGeofenceRefresh(Landroid/content/Context;Z)V
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/appboy/BrazeInternal;->INSTANCE:Lcom/appboy/BrazeInternal;

    invoke-direct {v0, p0}, Lcom/appboy/BrazeInternal;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/appboy/Appboy;->requestGeofenceRefresh(Z)V

    return-void
.end method

.method public static final retryInAppMessage(Landroid/content/Context;LlZ1;)V
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inAppMessageEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/appboy/BrazeInternal;->INSTANCE:Lcom/appboy/BrazeInternal;

    invoke-direct {v0, p0}, Lcom/appboy/BrazeInternal;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/appboy/Appboy;->retryInAppMessage(LlZ1;)V

    return-void
.end method
