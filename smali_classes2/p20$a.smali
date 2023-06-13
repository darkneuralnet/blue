.class public final Lp20$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp20;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\nJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u001a\u0010\u000b\u001a\u00020\u00068FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\u000c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lp20$a;",
        "",
        "Lcom/appboy/models/push/BrazeNotificationPayload;",
        "payload",
        "Lac3$e;",
        "b",
        "Lp20;",
        "a",
        "()Lp20;",
        "getInstance$annotations",
        "()V",
        "instance",
        "internalInstance",
        "Lp20;",
        "<init>",
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

    invoke-direct {p0}, Lp20$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lp20;
    .locals 1

    invoke-static {}, Lp20;->access$getInternalInstance$cp()Lp20;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lcom/appboy/models/push/BrazeNotificationPayload;)Lac3$e;
    .locals 10
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lk20;->a:Lk20;

    sget-object v3, Lk20$a;->f:Lk20$a;

    const/4 v4, 0x0

    const/4 v5, 0x0

    new-instance v6, Lp20$a$a;

    invoke-direct {v6, p1}, Lp20$a$a;-><init>(Lcom/appboy/models/push/BrazeNotificationPayload;)V

    const/4 v7, 0x6

    const/4 v8, 0x0

    move-object v1, v0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    invoke-virtual {p1}, Lcom/appboy/models/push/BrazeNotificationPayload;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v9, 0x0

    if-nez v1, :cond_0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v6, Lp20$a$b;->g:Lp20$a$b;

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v1, v0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-object v9

    :cond_0
    invoke-virtual {p1}, Lcom/appboy/models/push/BrazeNotificationPayload;->getConfigurationProvider()LX10;

    move-result-object v2

    if-nez v2, :cond_1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    sget-object v6, Lp20$a$c;->g:Lp20$a$c;

    const/4 v7, 0x7

    const/4 v8, 0x0

    move-object v1, v0

    move-object v2, p0

    invoke-static/range {v1 .. v8}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-object v9

    :cond_1
    invoke-virtual {p1}, Lcom/appboy/models/push/BrazeNotificationPayload;->getNotificationExtras()Landroid/os/Bundle;

    move-result-object v0

    invoke-static {p1}, Lr20;->r(Lcom/appboy/models/push/BrazeNotificationPayload;)V

    invoke-static {p1}, Lr20;->f(Lcom/appboy/models/push/BrazeNotificationPayload;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lac3$e;

    invoke-direct {v4, v1, v3}, Lac3$e;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-virtual {v4, v3}, Lac3$e;->g(Z)Lac3$e;

    move-result-object v3

    const-string v4, "Builder(context, notific\u2026     .setAutoCancel(true)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, p1}, Lr20;->N(Lac3$e;Lcom/appboy/models/push/BrazeNotificationPayload;)V

    invoke-static {v3, p1}, Lr20;->A(Lac3$e;Lcom/appboy/models/push/BrazeNotificationPayload;)V

    invoke-static {v3, p1}, Lr20;->M(Lac3$e;Lcom/appboy/models/push/BrazeNotificationPayload;)V

    invoke-static {v3, p1}, Lr20;->I(Lac3$e;Lcom/appboy/models/push/BrazeNotificationPayload;)V

    invoke-static {v1, v3, v0}, Lr20;->B(Landroid/content/Context;Lac3$e;Landroid/os/Bundle;)V

    invoke-static {v1, v3, v0}, Lr20;->C(Landroid/content/Context;Lac3$e;Landroid/os/Bundle;)V

    invoke-static {v2, v3}, Lr20;->J(LX10;Lac3$e;)I

    invoke-static {v3, p1}, Lr20;->D(Lac3$e;Lcom/appboy/models/push/BrazeNotificationPayload;)Z

    invoke-static {v3, p1}, Lr20;->K(Lac3$e;Lcom/appboy/models/push/BrazeNotificationPayload;)V

    invoke-static {v3, p1}, Lr20;->L(Lac3$e;Lcom/appboy/models/push/BrazeNotificationPayload;)V

    invoke-static {v3, p1}, Lr20;->G(Lac3$e;Lcom/appboy/models/push/BrazeNotificationPayload;)V

    sget-object v0, Lq20;->Companion:Lq20$a;

    invoke-virtual {v0, v3, p1}, Lq20$a;->l(Lac3$e;Lcom/appboy/models/push/BrazeNotificationPayload;)V

    invoke-static {v3, p1}, Lo20;->b(Lac3$e;Lcom/appboy/models/push/BrazeNotificationPayload;)V

    invoke-static {v3, p1}, Lr20;->y(Lac3$e;Lcom/appboy/models/push/BrazeNotificationPayload;)V

    invoke-static {v3, p1}, Lr20;->z(Lac3$e;Lcom/appboy/models/push/BrazeNotificationPayload;)V

    invoke-static {v3, p1}, Lr20;->O(Lac3$e;Lcom/appboy/models/push/BrazeNotificationPayload;)V

    invoke-static {v3, p1}, Lr20;->H(Lac3$e;Lcom/appboy/models/push/BrazeNotificationPayload;)V

    invoke-static {v3, p1}, Lr20;->E(Lac3$e;Lcom/appboy/models/push/BrazeNotificationPayload;)V

    return-object v3
.end method
