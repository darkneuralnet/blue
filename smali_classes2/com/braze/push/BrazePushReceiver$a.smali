.class public final Lcom/braze/push/BrazePushReceiver$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/braze/push/BrazePushReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000f\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\"\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0007J \u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0007J\u0018\u0010\u0014\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00158\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00158\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00158\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00158\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u00158\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\u00158\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u0017R\u0014\u0010\u001f\u001a\u00020\u00158\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u0017R\u0014\u0010 \u001a\u00020\u00158\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u0017R\u0014\u0010!\u001a\u00020\u00158\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008!\u0010\u0017\u00a8\u0006$"
    }
    d2 = {
        "Lcom/braze/push/BrazePushReceiver$a;",
        "",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Intent;",
        "intent",
        "",
        "runOnThread",
        "",
        "j",
        "LX10;",
        "appConfigurationProvider",
        "c",
        "d",
        "g",
        "Landroid/os/Bundle;",
        "notificationExtras",
        "brazeExtras",
        "Lcom/appboy/models/push/BrazeNotificationPayload;",
        "b",
        "e",
        "",
        "ADM_ERROR_DESCRIPTION_KEY",
        "Ljava/lang/String;",
        "ADM_ERROR_KEY",
        "ADM_RECEIVE_INTENT_ACTION",
        "ADM_REGISTRATION_ID_KEY",
        "ADM_REGISTRATION_INTENT_ACTION",
        "ADM_UNREGISTERED_KEY",
        "DELETED_MESSAGES_KEY",
        "FIREBASE_MESSAGING_SERVICE_ROUTING_ACTION",
        "HMS_PUSH_SERVICE_ROUTING_ACTION",
        "MESSAGE_TYPE_KEY",
        "NUMBER_OF_MESSAGES_DELETED_KEY",
        "<init>",
        "()V",
        "android-sdk-ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/braze/push/BrazePushReceiver$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/braze/push/BrazePushReceiver$a;Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/braze/push/BrazePushReceiver$a;->e(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method public static final f(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;)V
    .locals 10

    sget-object v8, Lk20;->a:Lk20;

    sget-object v9, Lcom/braze/push/BrazePushReceiver;->a:Lcom/braze/push/BrazePushReceiver$a;

    sget-object v2, Lk20$a;->d:Lk20$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Lcom/braze/push/BrazePushReceiver$a$i;

    invoke-direct {v5, p2}, Lcom/braze/push/BrazePushReceiver$a$i;-><init>(Landroid/content/Intent;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, v9

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    if-eqz p0, :cond_1

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_2

    sget-object v2, Lk20$a;->g:Lk20$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    new-instance v5, Lcom/braze/push/BrazePushReceiver$a$j;

    invoke-direct {v5, p2}, Lcom/braze/push/BrazePushReceiver$a$j;-><init>(Landroid/content/Intent;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, v9

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void

    :cond_2
    invoke-static {p1}, Lcom/appboy/BrazeInternal;->applyPendingRuntimeConfiguration(Landroid/content/Context;)V

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_2

    :sswitch_0
    const-string v0, "com.appboy.action.APPBOY_STORY_CLICKED"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto/16 :goto_2

    :cond_3
    invoke-static {p1, p2}, Lr20;->m(Landroid/content/Context;Landroid/content/Intent;)V

    goto/16 :goto_3

    :sswitch_1
    const-string v0, "hms_push_service_routing_action"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto/16 :goto_2

    :sswitch_2
    const-string v0, "com.amazon.device.messaging.intent.RECEIVE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto/16 :goto_2

    :sswitch_3
    const-string v0, "com.appboy.action.APPBOY_ACTION_CLICKED"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {p1, p2}, Lo20;->c(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_3

    :sswitch_4
    const-string v0, "com.appboy.action.CANCEL_NOTIFICATION"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_2

    :cond_5
    invoke-static {p1, p2}, Lr20;->i(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_3

    :sswitch_5
    const-string v0, "com.appboy.action.STORY_TRAVERSE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto :goto_2

    :sswitch_6
    const-string v0, "com.appboy.action.APPBOY_PUSH_DELETED"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto :goto_2

    :cond_6
    invoke-static {p1, p2}, Lr20;->k(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_3

    :sswitch_7
    const-string v0, "com.amazon.device.messaging.intent.REGISTRATION"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto :goto_2

    :cond_7
    new-instance p0, LX10;

    invoke-direct {p0, p1}, LX10;-><init>(Landroid/content/Context;)V

    invoke-virtual {v9, p0, p1, p2}, Lcom/braze/push/BrazePushReceiver$a;->c(LX10;Landroid/content/Context;Landroid/content/Intent;)Z

    goto :goto_3

    :sswitch_8
    const-string v0, "com.appboy.action.APPBOY_PUSH_CLICKED"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto :goto_2

    :cond_8
    invoke-static {p1, p2}, Lr20;->l(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_3

    :sswitch_9
    const-string v0, "firebase_messaging_service_routing_action"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto :goto_2

    :cond_9
    invoke-virtual {v9, p1, p2}, Lcom/braze/push/BrazePushReceiver$a;->g(Landroid/content/Context;Landroid/content/Intent;)Z

    goto :goto_3

    :goto_2
    sget-object v2, Lk20$a;->g:Lk20$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v5, Lcom/braze/push/BrazePushReceiver$a$k;->g:Lcom/braze/push/BrazePushReceiver$a$k;

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, v9

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x5e78f694 -> :sswitch_9
        -0x46e4f98c -> :sswitch_8
        -0x2c4aaffa -> :sswitch_7
        -0x1dc5599a -> :sswitch_6
        -0x1c7e4802 -> :sswitch_5
        0x19be096e -> :sswitch_4
        0x1bbd9910 -> :sswitch_3
        0x3f326356 -> :sswitch_2
        0x67bd38ad -> :sswitch_1
        0x71c69a4b -> :sswitch_0
    .end sparse-switch
.end method

.method public static final h(Landroid/content/Intent;)V
    .locals 19

    move-object/from16 v0, p0

    const-string v1, "total_deleted"

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    if-ne v1, v2, :cond_0

    sget-object v3, Lk20;->a:Lk20;

    sget-object v4, Lcom/braze/push/BrazePushReceiver;->a:Lcom/braze/push/BrazePushReceiver$a;

    sget-object v5, Lk20$a;->g:Lk20$a;

    const/4 v6, 0x0

    const/4 v7, 0x0

    new-instance v8, Lcom/braze/push/BrazePushReceiver$a$x;

    invoke-direct {v8, v0}, Lcom/braze/push/BrazePushReceiver$a$x;-><init>(Landroid/content/Intent;)V

    const/4 v9, 0x6

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-object v11, Lk20;->a:Lk20;

    sget-object v12, Lcom/braze/push/BrazePushReceiver;->a:Lcom/braze/push/BrazePushReceiver$a;

    sget-object v13, Lk20$a;->d:Lk20$a;

    const/4 v14, 0x0

    const/4 v15, 0x0

    new-instance v0, Lcom/braze/push/BrazePushReceiver$a$y;

    invoke-direct {v0, v1}, Lcom/braze/push/BrazePushReceiver$a$y;-><init>(I)V

    const/16 v17, 0x6

    const/16 v18, 0x0

    move-object/from16 v16, v0

    invoke-static/range {v11 .. v18}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static final i(Landroid/content/Intent;Landroidx/core/app/NotificationManagerCompat;Z)Z
    .locals 10

    invoke-static {p0}, Lr20;->n(Landroid/content/Intent;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    sget-object v2, Lk20;->a:Lk20;

    sget-object v3, Lcom/braze/push/BrazePushReceiver;->a:Lcom/braze/push/BrazePushReceiver$a;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    sget-object v7, Lcom/braze/push/BrazePushReceiver$a$z;->g:Lcom/braze/push/BrazePushReceiver$a$z;

    const/4 v8, 0x7

    const/4 v9, 0x0

    invoke-static/range {v2 .. v9}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/core/app/NotificationManagerCompat;->areNotificationsEnabled()Z

    move-result p1

    if-nez p1, :cond_1

    if-eqz p2, :cond_1

    sget-object v2, Lk20;->a:Lk20;

    sget-object v3, Lcom/braze/push/BrazePushReceiver;->a:Lcom/braze/push/BrazePushReceiver$a;

    sget-object v4, Lk20$a;->d:Lk20$a;

    const/4 v5, 0x0

    const/4 v6, 0x0

    sget-object v7, Lcom/braze/push/BrazePushReceiver$a$A;->g:Lcom/braze/push/BrazePushReceiver$a$A;

    const/4 v8, 0x6

    const/4 v9, 0x0

    invoke-static/range {v2 .. v9}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    goto :goto_0

    :cond_1
    const-string p1, "message_type"

    invoke-virtual {p0, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "deleted_messages"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {p0}, Lcom/braze/push/BrazePushReceiver$a;->h(Landroid/content/Intent;)V

    goto :goto_0

    :cond_2
    const/4 v1, 0x1

    :goto_0
    return v1
.end method

.method public static synthetic k(Lcom/braze/push/BrazePushReceiver$a;Landroid/content/Context;Landroid/content/Intent;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/braze/push/BrazePushReceiver$a;->j(Landroid/content/Context;Landroid/content/Intent;Z)V

    return-void
.end method


# virtual methods
.method public final b(Landroid/content/Context;LX10;Landroid/os/Bundle;Landroid/os/Bundle;)Lcom/appboy/models/push/BrazeNotificationPayload;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appConfigurationProvider"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notificationExtras"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "brazeExtras"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LWy0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p4, Lcom/appboy/models/push/BrazeNotificationPayload;

    sget-object v0, Lcom/appboy/models/push/BrazeNotificationPayload;->Companion:Lcom/appboy/models/push/BrazeNotificationPayload$Companion;

    invoke-virtual {v0, p3}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->getAttachedBrazeExtras(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v0

    invoke-direct {p4, p3, v0, p1, p2}, Lcom/appboy/models/push/BrazeNotificationPayload;-><init>(Landroid/os/Bundle;Landroid/os/Bundle;Landroid/content/Context;LX10;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/appboy/models/push/BrazeNotificationPayload;

    invoke-direct {v0, p3, p4, p1, p2}, Lcom/appboy/models/push/BrazeNotificationPayload;-><init>(Landroid/os/Bundle;Landroid/os/Bundle;Landroid/content/Context;LX10;)V

    move-object p4, v0

    :goto_0
    return-object p4
.end method

.method public final c(LX10;Landroid/content/Context;Landroid/content/Intent;)Z
    .locals 9
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "appConfigurationProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lk20;->a:Lk20;

    sget-object v3, Lk20$a;->d:Lk20$a;

    const/4 v4, 0x0

    const/4 v5, 0x0

    new-instance v6, Lcom/braze/push/BrazePushReceiver$a$a;

    invoke-direct {v6, p3}, Lcom/braze/push/BrazePushReceiver$a$a;-><init>(Landroid/content/Intent;)V

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v1, v0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-static {}, LWy0;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, LX10;->isAdmMessagingRegistrationEnabled()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v6, Lcom/braze/push/BrazePushReceiver$a$b;->g:Lcom/braze/push/BrazePushReceiver$a$b;

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v1, v0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-virtual {p0, p2, p3}, Lcom/braze/push/BrazePushReceiver$a;->d(Landroid/content/Context;Landroid/content/Intent;)Z

    const/4 p1, 0x1

    return p1

    :cond_0
    sget-object v3, Lk20$a;->g:Lk20$a;

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v6, Lcom/braze/push/BrazePushReceiver$a$c;->g:Lcom/braze/push/BrazePushReceiver$a$c;

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v1, v0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final d(Landroid/content/Context;Landroid/content/Intent;)Z
    .locals 21
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    move-object/from16 v0, p2

    const-string v1, "context"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "intent"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "error"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "error_description"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "registration_id"

    invoke-virtual {v0, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "unregistered"

    invoke-virtual {v0, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v1, :cond_0

    sget-object v5, Lk20;->a:Lk20;

    sget-object v7, Lk20$a;->g:Lk20$a;

    const/4 v8, 0x0

    const/4 v9, 0x0

    new-instance v10, Lcom/braze/push/BrazePushReceiver$a$d;

    invoke-direct {v10, v1, v3}, Lcom/braze/push/BrazePushReceiver$a$d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v11, 0x6

    const/4 v12, 0x0

    move-object/from16 v6, p0

    invoke-static/range {v5 .. v12}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    if-eqz v4, :cond_1

    sget-object v13, Lk20;->a:Lk20;

    sget-object v15, Lk20$a;->d:Lk20$a;

    const/16 v16, 0x0

    const/16 v17, 0x0

    new-instance v0, Lcom/braze/push/BrazePushReceiver$a$e;

    invoke-direct {v0, v4}, Lcom/braze/push/BrazePushReceiver$a$e;-><init>(Ljava/lang/String;)V

    const/16 v19, 0x6

    const/16 v20, 0x0

    move-object/from16 v14, p0

    move-object/from16 v18, v0

    invoke-static/range {v13 .. v20}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-static/range {p1 .. p1}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/appboy/Appboy;->registerPushToken(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    sget-object v5, Lk20;->a:Lk20;

    sget-object v7, Lk20$a;->g:Lk20$a;

    const/4 v8, 0x0

    const/4 v9, 0x0

    new-instance v10, Lcom/braze/push/BrazePushReceiver$a$f;

    invoke-direct {v10, v0}, Lcom/braze/push/BrazePushReceiver$a$f;-><init>(Ljava/lang/String;)V

    const/4 v11, 0x6

    const/4 v12, 0x0

    move-object/from16 v6, p0

    invoke-static/range {v5 .. v12}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_2
    sget-object v1, Lk20;->a:Lk20;

    sget-object v3, Lk20$a;->g:Lk20$a;

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v6, Lcom/braze/push/BrazePushReceiver$a$g;->g:Lcom/braze/push/BrazePushReceiver$a$g;

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object/from16 v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    const/4 v0, 0x0

    return v0
.end method

.method public final e(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 9

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    :try_start_0
    invoke-static {v0, p1, p2}, Lcom/braze/push/BrazePushReceiver$a;->f(Ljava/lang/String;Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v4

    sget-object v1, Lk20;->a:Lk20;

    sget-object v3, Lk20$a;->e:Lk20$a;

    const/4 v5, 0x0

    new-instance v6, Lcom/braze/push/BrazePushReceiver$a$h;

    invoke-direct {v6, v0, p2}, Lcom/braze/push/BrazePushReceiver$a$h;-><init>(Ljava/lang/String;Landroid/content/Intent;)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final g(Landroid/content/Context;Landroid/content/Intent;)Z
    .locals 20
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "context"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "intent"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p1 .. p1}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    move-result-object v2

    const-string v3, "from(context)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Landroidx/core/app/NotificationManagerCompat;->areNotificationsEnabled()Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v4, Lk20;->a:Lk20;

    sget-object v6, Lk20$a;->d:Lk20$a;

    const/4 v7, 0x0

    const/4 v8, 0x0

    sget-object v9, Lcom/braze/push/BrazePushReceiver$a$o;->g:Lcom/braze/push/BrazePushReceiver$a$o;

    const/4 v10, 0x6

    const/4 v11, 0x0

    move-object/from16 v5, p0

    invoke-static/range {v4 .. v11}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-object v12, Lk20;->a:Lk20;

    sget-object v14, Lk20$a;->d:Lk20$a;

    const/4 v15, 0x0

    const/16 v16, 0x0

    sget-object v17, Lcom/braze/push/BrazePushReceiver$a$p;->g:Lcom/braze/push/BrazePushReceiver$a$p;

    const/16 v18, 0x6

    const/16 v19, 0x0

    move-object/from16 v13, p0

    invoke-static/range {v12 .. v19}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :goto_0
    invoke-static/range {p2 .. p2}, Lr20;->o(Landroid/content/Intent;)Z

    move-result v3

    invoke-static {v1, v2, v3}, Lcom/braze/push/BrazePushReceiver$a;->i(Landroid/content/Intent;Landroidx/core/app/NotificationManagerCompat;Z)Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_1

    sget-object v6, Lk20;->a:Lk20;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    sget-object v11, Lcom/braze/push/BrazePushReceiver$a$q;->g:Lcom/braze/push/BrazePushReceiver$a$q;

    const/4 v12, 0x7

    const/4 v13, 0x0

    move-object/from16 v7, p0

    invoke-static/range {v6 .. v13}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return v5

    :cond_1
    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    if-nez v4, :cond_2

    return v5

    :cond_2
    sget-object v14, Lk20;->a:Lk20;

    sget-object v15, Lk20$a;->d:Lk20$a;

    const/4 v9, 0x0

    const/4 v10, 0x0

    new-instance v11, Lcom/braze/push/BrazePushReceiver$a$r;

    invoke-direct {v11, v4}, Lcom/braze/push/BrazePushReceiver$a$r;-><init>(Landroid/os/Bundle;)V

    const/4 v12, 0x6

    const/4 v13, 0x0

    move-object v6, v14

    move-object/from16 v7, p0

    move-object v8, v15

    invoke-static/range {v6 .. v13}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    sget-object v6, Lcom/appboy/models/push/BrazeNotificationPayload;->Companion:Lcom/appboy/models/push/BrazeNotificationPayload$Companion;

    invoke-virtual {v6, v4}, Lcom/appboy/models/push/BrazeNotificationPayload$Companion;->getAttachedBrazeExtras(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v6

    const-string v7, "extra"

    invoke-virtual {v4, v7, v6}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    const-string v7, "appboy_push_received_timestamp"

    invoke-virtual {v4, v7}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    invoke-virtual {v4, v7, v8, v9}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    :cond_3
    invoke-static {v4}, Lr20;->p(Landroid/os/Bundle;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/4 v9, 0x0

    const/4 v10, 0x0

    sget-object v11, Lcom/braze/push/BrazePushReceiver$a$s;->g:Lcom/braze/push/BrazePushReceiver$a$s;

    const/4 v12, 0x6

    const/4 v13, 0x0

    move-object v6, v14

    move-object/from16 v7, p0

    move-object v8, v15

    invoke-static/range {v6 .. v13}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return v5

    :cond_4
    new-instance v15, LX10;

    invoke-direct {v15, v0}, LX10;-><init>(Landroid/content/Context;)V

    move-object/from16 v13, p0

    invoke-virtual {v13, v0, v15, v4, v6}, Lcom/braze/push/BrazePushReceiver$a;->b(Landroid/content/Context;LX10;Landroid/os/Bundle;Landroid/os/Bundle;)Lcom/appboy/models/push/BrazeNotificationPayload;

    move-result-object v12

    invoke-virtual {v15}, LX10;->isInAppMessageTestPushEagerDisplayEnabled()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v12}, Lcom/appboy/models/push/BrazeNotificationPayload;->getShouldFetchTestTriggers()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-static {}, Li20;->s()Li20;

    move-result-object v6

    invoke-virtual {v6}, LwZ1;->a()Landroid/app/Activity;

    move-result-object v6

    if-eqz v6, :cond_5

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    sget-object v11, Lcom/braze/push/BrazePushReceiver$a$t;->g:Lcom/braze/push/BrazePushReceiver$a$t;

    const/4 v12, 0x7

    const/4 v2, 0x0

    move-object v6, v14

    move-object/from16 v7, p0

    move-object v13, v2

    invoke-static/range {v6 .. v13}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-static/range {p1 .. p2}, Lcom/appboy/BrazeInternal;->handleInAppMessageTestPush(Landroid/content/Context;Landroid/content/Intent;)V

    return v5

    :cond_5
    invoke-static {v12}, Lr20;->j(Lcom/appboy/models/push/BrazeNotificationPayload;)V

    if-eqz v3, :cond_a

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    sget-object v11, Lcom/braze/push/BrazePushReceiver$a$u;->g:Lcom/braze/push/BrazePushReceiver$a$u;

    const/4 v1, 0x7

    const/4 v13, 0x0

    move-object v6, v14

    move-object/from16 v7, p0

    move-object v3, v12

    move v12, v1

    invoke-static/range {v6 .. v13}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-static {v3}, Lr20;->c(Lcom/appboy/models/push/BrazeNotificationPayload;)I

    move-result v1

    const-string v6, "nid"

    invoke-virtual {v4, v6, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v3}, Lcom/appboy/models/push/BrazeNotificationPayload;->isPushStory()Z

    move-result v6

    const/4 v13, 0x1

    if-eqz v6, :cond_7

    invoke-static {}, LWy0;->a()Z

    move-result v6

    if-eqz v6, :cond_6

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    sget-object v11, Lcom/braze/push/BrazePushReceiver$a$v;->g:Lcom/braze/push/BrazePushReceiver$a$v;

    const/4 v12, 0x7

    const/4 v13, 0x0

    move-object v6, v14

    move-object/from16 v7, p0

    invoke-static/range {v6 .. v13}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return v5

    :cond_6
    const-string v12, "appboy_story_newly_received"

    invoke-virtual {v4, v12}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_7

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    sget-object v11, Lcom/braze/push/BrazePushReceiver$a$w;->g:Lcom/braze/push/BrazePushReceiver$a$w;

    const/16 v16, 0x7

    const/16 v17, 0x0

    move-object v6, v14

    move-object/from16 v7, p0

    move-object v5, v12

    move/from16 v12, v16

    move-object/from16 v16, v15

    move v15, v13

    move-object/from16 v13, v17

    invoke-static/range {v6 .. v13}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-virtual {v4, v5, v15}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_1

    :cond_7
    move-object/from16 v16, v15

    move v15, v13

    :goto_1
    sget-object v8, Lk20$a;->f:Lk20$a;

    const/4 v9, 0x0

    const/4 v10, 0x0

    new-instance v11, Lcom/braze/push/BrazePushReceiver$a$l;

    invoke-direct {v11, v3}, Lcom/braze/push/BrazePushReceiver$a$l;-><init>(Lcom/appboy/models/push/BrazeNotificationPayload;)V

    const/4 v12, 0x6

    const/4 v13, 0x0

    move-object v6, v14

    move-object/from16 v7, p0

    invoke-static/range {v6 .. v13}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-static {}, Lr20;->b()LfO1;

    move-result-object v5

    invoke-interface {v5, v3}, LfO1;->createNotification(Lcom/appboy/models/push/BrazeNotificationPayload;)Landroid/app/Notification;

    move-result-object v5

    if-nez v5, :cond_8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    sget-object v11, Lcom/braze/push/BrazePushReceiver$a$m;->g:Lcom/braze/push/BrazePushReceiver$a$m;

    const/4 v12, 0x7

    const/4 v13, 0x0

    move-object v6, v14

    move-object/from16 v7, p0

    invoke-static/range {v6 .. v13}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :goto_2
    const/4 v0, 0x0

    return v0

    :cond_8
    const-string v6, "appboy_notification"

    invoke-virtual {v2, v6, v1, v5}, Landroidx/core/app/NotificationManagerCompat;->notify(Ljava/lang/String;ILandroid/app/Notification;)V

    invoke-static {v0, v4}, Lr20;->x(Landroid/content/Context;Landroid/os/Bundle;)V

    move-object/from16 v2, v16

    invoke-static {v0, v2, v4}, Lr20;->P(Landroid/content/Context;LX10;Landroid/os/Bundle;)Z

    invoke-virtual {v3}, Lcom/appboy/models/push/BrazeNotificationPayload;->getPushDuration()Ljava/lang/Integer;

    move-result-object v2

    if-nez v2, :cond_9

    goto :goto_3

    :cond_9
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    const-class v3, Lcom/braze/push/BrazePushReceiver;

    invoke-static {v0, v3, v1, v2}, Lr20;->F(Landroid/content/Context;Ljava/lang/Class;II)V

    :goto_3
    return v15

    :cond_a
    move-object v3, v12

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    sget-object v11, Lcom/braze/push/BrazePushReceiver$a$n;->g:Lcom/braze/push/BrazePushReceiver$a$n;

    const/4 v12, 0x7

    const/4 v13, 0x0

    move-object v6, v14

    move-object/from16 v7, p0

    invoke-static/range {v6 .. v13}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-static {v0, v4}, Lr20;->x(Landroid/content/Context;Landroid/os/Bundle;)V

    invoke-static {v3}, Lr20;->s(Lcom/appboy/models/push/BrazeNotificationPayload;)Z

    goto :goto_2
.end method

.method public final j(Landroid/content/Context;Landroid/content/Intent;Z)V
    .locals 7
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_0

    sget-object v1, LZ10;->b:LZ10;

    const/4 v2, 0x0

    const/4 v3, 0x0

    new-instance v4, Lcom/braze/push/BrazePushReceiver$a$B;

    const/4 p3, 0x0

    invoke-direct {v4, p1, p2, p3}, Lcom/braze/push/BrazePushReceiver$a$B;-><init>(Landroid/content/Context;Landroid/content/Intent;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LX30;->d(LZC0;Lkotlin/coroutines/CoroutineContext;LbD0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lzh2;

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/braze/push/BrazePushReceiver$a;->e(Landroid/content/Context;Landroid/content/Intent;)V

    :goto_0
    return-void
.end method
