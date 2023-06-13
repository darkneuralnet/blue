.class public final Lco/bird/android/manager/bluetooth/internal/d$v;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/bluetooth/internal/d;->J0(Lco/bird/android/model/Command;[BLco/bird/android/model/Vehicle;J)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/manager/bluetooth/internal/d$v$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/Vehicle;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "result",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/Vehicle;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/lang/Boolean;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/model/Command;

.field public final synthetic h:Lco/bird/android/model/Vehicle;

.field public final synthetic i:Lco/bird/android/manager/bluetooth/internal/d;


# direct methods
.method public constructor <init>(Lco/bird/android/model/Command;Lco/bird/android/model/Vehicle;Lco/bird/android/manager/bluetooth/internal/d;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d$v;->g:Lco/bird/android/model/Command;

    iput-object p2, p0, Lco/bird/android/manager/bluetooth/internal/d$v;->h:Lco/bird/android/model/Vehicle;

    iput-object p3, p0, Lco/bird/android/manager/bluetooth/internal/d$v;->i:Lco/bird/android/manager/bluetooth/internal/d;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)Lio/reactivex/K;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/d$v;->g:Lco/bird/android/model/Command;

    sget-object v1, Lco/bird/android/model/Command;->DISCONNECT:Lco/bird/android/model/Command;

    if-ne v0, v1, :cond_0

    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d$v;->h:Lco/bird/android/model/Vehicle;

    invoke-static {p1}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d$v;->g:Lco/bird/android/model/Command;

    sget-object v0, Lco/bird/android/manager/bluetooth/internal/d$v$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/Throwable;

    const-string v0, "Unknown bluetooth command."

    invoke-direct {p1, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p1

    goto :goto_0

    :pswitch_0
    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d$v;->h:Lco/bird/android/model/Vehicle;

    invoke-static {p1}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    goto :goto_0

    :pswitch_1
    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d$v;->i:Lco/bird/android/manager/bluetooth/internal/d;

    invoke-static {p1}, Lco/bird/android/manager/bluetooth/internal/d;->access$getNotificationSubjects$p(Lco/bird/android/manager/bluetooth/internal/d;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/GattUuid;->LOCK:Lco/bird/android/model/GattUuid;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p1, Lio/reactivex/Observable;

    goto :goto_0

    :pswitch_2
    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d$v;->i:Lco/bird/android/manager/bluetooth/internal/d;

    invoke-static {p1}, Lco/bird/android/manager/bluetooth/internal/d;->access$getNotificationSubjects$p(Lco/bird/android/manager/bluetooth/internal/d;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p1

    sget-object v0, Lco/bird/android/model/GattUuid;->AUTH:Lco/bird/android/model/GattUuid;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p1, Lio/reactivex/Observable;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d$v;->i:Lco/bird/android/manager/bluetooth/internal/d;

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/d$v;->h:Lco/bird/android/model/Vehicle;

    iget-object v1, p0, Lco/bird/android/manager/bluetooth/internal/d$v;->g:Lco/bird/android/model/Command;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "write: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " failed, retry..."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lco/bird/android/manager/bluetooth/internal/d;->access$trace(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;Ljava/lang/String;)V

    new-instance p1, Lco/bird/android/manager/bluetooth/internal/VehicleException;

    sget-object v3, Lco/bird/android/manager/bluetooth/internal/VehicleException$a;->f:Lco/bird/android/manager/bluetooth/internal/VehicleException$a;

    const/4 v4, 0x0

    iget-object v0, p0, Lco/bird/android/manager/bluetooth/internal/d$v;->g:Lco/bird/android/model/Command;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to write "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x2

    const/4 v7, 0x0

    move-object v2, p1

    invoke-direct/range {v2 .. v7}, Lco/bird/android/manager/bluetooth/internal/VehicleException;-><init>(Lco/bird/android/manager/bluetooth/internal/VehicleException$a;Lco/bird/android/manager/bluetooth/internal/c;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1}, Lio/reactivex/Observable;->error(Ljava/lang/Throwable;)Lio/reactivex/Observable;

    move-result-object p1

    :goto_0
    const-string v0, "if (command == Command.D\u2026ite $command\"))\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/reactivex/Observable;->singleOrError()Lio/reactivex/F;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d$v;->a(Ljava/lang/Boolean;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
