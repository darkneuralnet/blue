.class public final Lab3$n;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lab3;->V(Ljava/lang/Throwable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lob3;",
        "Lob3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lob3;",
        "state",
        "a",
        "(Lob3;)Lob3;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNotificationCenterPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationCenterPresenter.kt\nco/bird/android/feature/notificationcenter/fragment/NotificationCenterPresenter$onError$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n1#2:172\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, Lab3$n;->g:Ljava/lang/Throwable;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lob3;)Lob3;
    .locals 9

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {p1}, Lob3;->e()I

    move-result v0

    add-int/lit8 v6, v0, -0x1

    const/16 v7, 0xf

    const/4 v8, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v8}, Lob3;->copy$default(Lob3;ZLjava/util/List;Lco/bird/android/model/persistence/OperatorNotificationCategory;Ljava/util/List;IILjava/lang/Object;)Lob3;

    move-result-object p1

    iget-object v0, p0, Lab3$n;->g:Ljava/lang/Throwable;

    invoke-virtual {p1, v0}, Lob3;->h(Ljava/lang/Throwable;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lob3;

    invoke-virtual {p0, p1}, Lab3$n;->a(Lob3;)Lob3;

    move-result-object p1

    return-object p1
.end method
