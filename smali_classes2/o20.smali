.class public final Lo20;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u000c\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u001e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ \u0010\u0012\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a8\u0006\u0015"
    }
    d2 = {
        "Lo20;",
        "",
        "Lac3$e;",
        "notificationBuilder",
        "Lcom/appboy/models/push/BrazeNotificationPayload;",
        "payload",
        "",
        "b",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Intent;",
        "intent",
        "c",
        "Lcom/appboy/models/push/BrazeNotificationPayload$ActionButton;",
        "actionButton",
        "a",
        "",
        "actionType",
        "d",
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


# static fields
.field public static final a:Lo20;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lo20;

    invoke-direct {v0}, Lo20;-><init>()V

    sput-object v0, Lo20;->a:Lo20;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final b(Lac3$e;Lcom/appboy/models/push/BrazeNotificationPayload;)V
    .locals 11
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "notificationBuilder"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/appboy/models/push/BrazeNotificationPayload;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v1, Lk20;->a:Lk20;

    sget-object v2, Lo20;->a:Lo20;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v6, Lo20$e;->g:Lo20$e;

    const/4 v7, 0x7

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/appboy/models/push/BrazeNotificationPayload;->getActionButtons()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v2, Lk20;->a:Lk20;

    sget-object v3, Lo20;->a:Lo20;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    sget-object v7, Lo20$f;->g:Lo20$f;

    const/4 v8, 0x7

    const/4 v9, 0x0

    invoke-static/range {v2 .. v9}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/appboy/models/push/BrazeNotificationPayload$ActionButton;

    sget-object v2, Lk20;->a:Lk20;

    sget-object v10, Lo20;->a:Lo20;

    sget-object v4, Lk20$a;->f:Lk20$a;

    const/4 v5, 0x0

    const/4 v6, 0x0

    new-instance v7, Lo20$g;

    invoke-direct {v7, v1}, Lo20$g;-><init>(Lcom/appboy/models/push/BrazeNotificationPayload$ActionButton;)V

    const/4 v8, 0x6

    const/4 v9, 0x0

    move-object v3, v10

    invoke-static/range {v2 .. v9}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-virtual {v10, p0, p1, v1}, Lo20;->a(Lac3$e;Lcom/appboy/models/push/BrazeNotificationPayload;Lcom/appboy/models/push/BrazeNotificationPayload$ActionButton;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static final c(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 12
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    const-string v0, "appboy_action_type"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    move v3, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v3, v2

    :goto_1
    if-eqz v3, :cond_2

    sget-object v4, Lk20;->a:Lk20;

    sget-object v5, Lo20;->a:Lo20;

    sget-object v6, Lk20$a;->g:Lk20$a;

    const/4 v7, 0x0

    const/4 v8, 0x0

    sget-object v9, Lo20$h;->g:Lo20$h;

    const/4 v10, 0x6

    const/4 v11, 0x0

    invoke-static/range {v4 .. v11}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void

    :cond_2
    const-string v3, "nid"

    const/4 v4, -0x1

    invoke-virtual {p1, v3, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    sget-object v5, Lo20;->a:Lo20;

    invoke-virtual {v5, p0, p1, v0}, Lo20;->d(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const v6, -0x54e7f7b2

    const-string v7, "ab_uri"

    if-eq v4, v6, :cond_6

    const v6, -0x481a376a

    if-eq v4, v6, :cond_4

    const v6, -0x4819c058

    if-eq v4, v6, :cond_3

    goto/16 :goto_5

    :cond_3
    :try_start_1
    const-string v4, "ab_open"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    goto/16 :goto_5

    :cond_4
    const-string p1, "ab_none"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto/16 :goto_5

    :cond_5
    invoke-static {p0, v3}, Lr20;->a(Landroid/content/Context;I)V

    goto/16 :goto_6

    :cond_6
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    goto :goto_5

    :cond_7
    invoke-static {p0, v3}, Lr20;->a(Landroid/content/Context;I)V

    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const-string v3, "uri"

    if-eqz v0, :cond_c

    :try_start_2
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    const-string v4, "appboy_action_uri"

    if-nez v0, :cond_9

    :cond_8
    move v0, v1

    goto :goto_2

    :cond_9
    :try_start_3
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-ne v0, v2, :cond_8

    move v0, v2

    :goto_2
    if-eqz v0, :cond_c

    invoke-virtual {p1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    const-string v3, "appboy_action_use_webview"

    if-nez v0, :cond_a

    goto :goto_3

    :cond_a
    :try_start_4
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-ne v0, v2, :cond_b

    move v1, v2

    :cond_b
    :goto_3
    if-eqz v1, :cond_d

    const-string v0, "ab_use_webview"

    invoke-virtual {p1, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_4

    :cond_c
    invoke-virtual {p1, v3}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    :cond_d
    :goto_4
    invoke-static {p0, p1}, Lr20;->u(Landroid/content/Context;Landroid/content/Intent;)V

    new-instance v0, LX10;

    invoke-direct {v0, p0}, LX10;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, LX10;->getDoesHandlePushDeepLinksAutomatically()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {p0, p1}, Lr20;->t(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_6

    :cond_e
    sget-object v4, Lk20;->a:Lk20;

    sget-object v6, Lk20$a;->d:Lk20$a;

    const/4 v7, 0x0

    const/4 v8, 0x0

    sget-object v9, Lo20$i;->g:Lo20$i;

    const/4 v10, 0x6

    const/4 v11, 0x0

    invoke-static/range {v4 .. v11}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    goto :goto_6

    :cond_f
    :goto_5
    sget-object v4, Lk20;->a:Lk20;

    sget-object v6, Lk20$a;->g:Lk20$a;

    const/4 v7, 0x0

    const/4 v8, 0x0

    sget-object v9, Lo20$j;->g:Lo20$j;

    const/4 v10, 0x6

    const/4 v11, 0x0

    invoke-static/range {v4 .. v11}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_6

    :catch_0
    move-exception p0

    move-object v3, p0

    sget-object v0, Lk20;->a:Lk20;

    sget-object v1, Lo20;->a:Lo20;

    sget-object v2, Lk20$a;->e:Lk20$a;

    const/4 v4, 0x0

    sget-object v5, Lo20$k;->g:Lo20$k;

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :goto_6
    return-void
.end method


# virtual methods
.method public final a(Lac3$e;Lcom/appboy/models/push/BrazeNotificationPayload;Lcom/appboy/models/push/BrazeNotificationPayload$ActionButton;)V
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    const-string v2, "notificationBuilder"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "payload"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "actionButton"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Lcom/appboy/models/push/BrazeNotificationPayload;->getContext()Landroid/content/Context;

    move-result-object v2

    if-nez v2, :cond_0

    sget-object v3, Lk20;->a:Lk20;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    sget-object v8, Lo20$a;->g:Lo20$a;

    const/4 v9, 0x7

    const/4 v10, 0x0

    move-object/from16 v4, p0

    invoke-static/range {v3 .. v10}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void

    :cond_0
    new-instance v4, Landroid/os/Bundle;

    invoke-virtual/range {p2 .. p2}, Lcom/appboy/models/push/BrazeNotificationPayload;->getNotificationExtras()Landroid/os/Bundle;

    move-result-object v3

    invoke-direct {v4, v3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {v1, v4}, Lcom/appboy/models/push/BrazeNotificationPayload$ActionButton;->putIntoBundle(Landroid/os/Bundle;)V

    invoke-virtual/range {p3 .. p3}, Lcom/appboy/models/push/BrazeNotificationPayload$ActionButton;->getType()Ljava/lang/String;

    move-result-object v3

    const/high16 v5, 0x8000000

    invoke-static {}, Lb62;->b()I

    move-result v6

    or-int/2addr v5, v6

    const-string v6, "ab_none"

    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const-string v7, "com.appboy.action.APPBOY_ACTION_CLICKED"

    if-eqz v6, :cond_1

    sget-object v8, Lk20;->a:Lk20;

    sget-object v10, Lk20$a;->f:Lk20$a;

    const/4 v11, 0x0

    const/4 v12, 0x0

    new-instance v13, Lo20$b;

    invoke-direct {v13, v3}, Lo20$b;-><init>(Ljava/lang/String;)V

    const/4 v14, 0x6

    const/4 v15, 0x0

    move-object/from16 v9, p0

    invoke-static/range {v8 .. v15}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lr20;->e()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v3, v2, v6}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    move-result-object v3

    const-string v6, "Intent(Constants.BRAZE_A\u2026ceiverClass\n            )"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-static {}, Lb62;->e()I

    move-result v6

    invoke-static {v2, v6, v3, v5}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    const-string v3, "getBroadcast(\n          \u2026IntentFlags\n            )"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    sget-object v8, Lk20;->a:Lk20;

    sget-object v10, Lk20$a;->f:Lk20$a;

    const/4 v11, 0x0

    const/4 v12, 0x0

    new-instance v13, Lo20$c;

    invoke-direct {v13, v3}, Lo20$c;-><init>(Ljava/lang/String;)V

    const/4 v14, 0x6

    const/4 v15, 0x0

    move-object/from16 v9, p0

    invoke-static/range {v8 .. v15}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance v3, Landroid/content/Intent;

    invoke-direct {v3, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-class v6, Lcom/braze/push/NotificationTrampolineActivity;

    invoke-virtual {v3, v2, v6}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    move-result-object v3

    const-string v6, "Intent(Constants.BRAZE_A\u2026lineActivity::class.java)"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/content/Intent;->getFlags()I

    move-result v6

    sget-object v7, Lb20;->a:Lb20$a;

    invoke-virtual {v7}, Lb20$a;->a()LdO1;

    move-result-object v7

    sget-object v8, LdO1$a;->b:LdO1$a;

    invoke-interface {v7, v8}, LdO1;->a(LdO1$a;)I

    move-result v7

    or-int/2addr v6, v7

    invoke-virtual {v3, v6}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    invoke-virtual {v3, v4}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-static {}, Lb62;->e()I

    move-result v6

    invoke-static {v2, v6, v3, v5}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v2

    const-string v3, "getActivity(\n           \u2026IntentFlags\n            )"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    new-instance v3, Lac3$a$a;

    const/4 v5, 0x0

    invoke-virtual/range {p3 .. p3}, Lcom/appboy/models/push/BrazeNotificationPayload$ActionButton;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v5, v1, v2}, Lac3$a$a;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1, v4}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    invoke-virtual {v3, v1}, Lac3$a$a;->a(Landroid/os/Bundle;)Lac3$a$a;

    invoke-virtual {v3}, Lac3$a$a;->b()Lac3$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lac3$e;->b(Lac3$a;)Lac3$e;

    sget-object v5, Lk20;->a:Lk20;

    sget-object v7, Lk20$a;->f:Lk20$a;

    const/4 v8, 0x0

    const/4 v9, 0x0

    new-instance v10, Lo20$d;

    invoke-direct {v10, v4}, Lo20$d;-><init>(Landroid/os/Bundle;)V

    const/4 v11, 0x6

    const/4 v12, 0x0

    move-object/from16 v6, p0

    invoke-static/range {v5 .. v12}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void
.end method

.method public final d(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "appboy_action_id"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1}, LP10;->getInstance(Landroid/content/Context;)LP10;

    move-result-object p1

    invoke-virtual {p1, v0, p2, p3}, Lcom/appboy/Appboy;->logPushNotificationActionClicked(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
