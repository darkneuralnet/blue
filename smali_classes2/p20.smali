.class public Lp20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LfO1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp20$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0016\u0018\u0000 \u00082\u00020\u0001:\u0001\tB\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\n"
    }
    d2 = {
        "Lp20;",
        "LfO1;",
        "Lcom/appboy/models/push/BrazeNotificationPayload;",
        "payload",
        "Landroid/app/Notification;",
        "createNotification",
        "<init>",
        "()V",
        "Companion",
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
.field public static final Companion:Lp20$a;

.field private static volatile internalInstance:Lp20;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp20$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp20$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lp20;->Companion:Lp20$a;

    new-instance v0, Lp20;

    invoke-direct {v0}, Lp20;-><init>()V

    sput-object v0, Lp20;->internalInstance:Lp20;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$getInternalInstance$cp()Lp20;
    .locals 1

    sget-object v0, Lp20;->internalInstance:Lp20;

    return-object v0
.end method


# virtual methods
.method public createNotification(Lcom/appboy/models/push/BrazeNotificationPayload;)Landroid/app/Notification;
    .locals 8

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lp20;->Companion:Lp20$a;

    invoke-virtual {v0, p1}, Lp20$a;->b(Lcom/appboy/models/push/BrazeNotificationPayload;)Lac3$e;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lac3$e;->c()Landroid/app/Notification;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object v0, Lk20;->a:Lk20;

    sget-object v2, Lk20$a;->d:Lk20$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v5, Lp20$b;->g:Lp20$b;

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v0 .. v7}, Lk20;->e(Lk20;Ljava/lang/Object;Lk20$a;Ljava/lang/Throwable;ZLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
