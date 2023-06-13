.class public Lcom/braze/push/BrazeFirebaseMessagingService;
.super Lcom/google/firebase/messaging/FirebaseMessagingService;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/braze/push/BrazeFirebaseMessagingService$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0016\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000cB\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/braze/push/BrazeFirebaseMessagingService;",
        "Lcom/google/firebase/messaging/FirebaseMessagingService;",
        "",
        "newToken",
        "",
        "s",
        "Lcom/google/firebase/messaging/RemoteMessage;",
        "remoteMessage",
        "q",
        "<init>",
        "()V",
        "h",
        "a",
        "android-sdk-ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# static fields
.field public static final h:Lcom/braze/push/BrazeFirebaseMessagingService$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/braze/push/BrazeFirebaseMessagingService$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/braze/push/BrazeFirebaseMessagingService$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/braze/push/BrazeFirebaseMessagingService;->h:Lcom/braze/push/BrazeFirebaseMessagingService$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/firebase/messaging/FirebaseMessagingService;-><init>()V

    return-void
.end method


# virtual methods
.method public q(Lcom/google/firebase/messaging/RemoteMessage;)V
    .locals 1

    const-string v0, "remoteMessage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->q(Lcom/google/firebase/messaging/RemoteMessage;)V

    sget-object v0, Lcom/braze/push/BrazeFirebaseMessagingService;->h:Lcom/braze/push/BrazeFirebaseMessagingService$a;

    invoke-virtual {v0, p0, p1}, Lcom/braze/push/BrazeFirebaseMessagingService$a;->a(Landroid/content/Context;Lcom/google/firebase/messaging/RemoteMessage;)Z

    return-void
.end method

.method public s(Ljava/lang/String;)V
    .locals 9

    const-string v0, "newToken"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingService;->s(Ljava/lang/String;)V

    invoke-static {p0}, Lcom/appboy/BrazeInternal;->applyPendingRuntimeConfiguration(Landroid/content/Context;)V

    new-instance v0, LX10;

    invoke-direct {v0, p0}, LX10;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lcom/appboy/Appboy;->getConfiguredApiKey(LX10;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    if-eqz v1, :cond_2

    sget-object v1, Lk20;->a:Lk20;

    sget-object v3, Lk20$a;->f:Lk20$a;

    const/4 v4, 0x0

    const/4 v5, 0x0

    new-instance v6, Lcom/braze/push/BrazeFirebaseMessagingService$b;

    invoke-direct {v6, p1}, Lcom/braze/push/BrazeFirebaseMessagingService$b;-><init>(Ljava/lang/String;)V

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void

    :cond_2
    invoke-virtual {v0}, LX10;->isFirebaseMessagingServiceOnNewTokenRegistrationEnabled()Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v1, Lk20;->a:Lk20;

    sget-object v3, Lk20$a;->f:Lk20$a;

    const/4 v4, 0x0

    const/4 v5, 0x0

    new-instance v6, Lcom/braze/push/BrazeFirebaseMessagingService$c;

    invoke-direct {v6, p1}, Lcom/braze/push/BrazeFirebaseMessagingService$c;-><init>(Ljava/lang/String;)V

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void

    :cond_3
    sget-object v1, Lk20;->a:Lk20;

    sget-object v3, Lk20$a;->f:Lk20$a;

    const/4 v4, 0x0

    const/4 v5, 0x0

    new-instance v6, Lcom/braze/push/BrazeFirebaseMessagingService$d;

    invoke-direct {v6, p1}, Lcom/braze/push/BrazeFirebaseMessagingService$d;-><init>(Ljava/lang/String;)V

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-static {p0}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/appboy/Appboy;->registerPushToken(Ljava/lang/String;)V

    return-void
.end method
