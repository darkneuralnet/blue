.class public final Lab3$m$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lab3$m;->a(Lkotlin/Triple;)V
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


# instance fields
.field public final synthetic g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/OperatorNotification;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:Lco/bird/android/buava/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/persistence/OperatorNotificationCategory;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/OperatorNotificationCategory;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Lco/bird/android/buava/Optional;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/OperatorNotification;",
            ">;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/persistence/OperatorNotificationCategory;",
            ">;",
            "Ljava/util/List<",
            "Lco/bird/android/model/persistence/OperatorNotificationCategory;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lab3$m$a;->g:Ljava/util/List;

    iput-object p2, p0, Lab3$m$a;->h:Lco/bird/android/buava/Optional;

    iput-object p3, p0, Lab3$m$a;->i:Ljava/util/List;

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

    iget-object v3, p0, Lab3$m$a;->g:Ljava/util/List;

    iget-object v0, p0, Lab3$m$a;->h:Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lco/bird/android/model/persistence/OperatorNotificationCategory;

    iget-object v5, p0, Lab3$m$a;->i:Ljava/util/List;

    const/4 v6, 0x0

    const/16 v7, 0x11

    const/4 v8, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v8}, Lob3;->copy$default(Lob3;ZLjava/util/List;Lco/bird/android/model/persistence/OperatorNotificationCategory;Ljava/util/List;IILjava/lang/Object;)Lob3;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lob3;

    invoke-virtual {p0, p1}, Lab3$m$a;->a(Lob3;)Lob3;

    move-result-object p1

    return-object p1
.end method
