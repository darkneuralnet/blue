.class public final Lco/bird/android/manager/bluetooth/internal/d$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/bluetooth/internal/d;->m(Lco/bird/android/model/Vehicle;Z)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/Command;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/Vehicle;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/Command;",
        "command",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/Vehicle;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/Command;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/manager/bluetooth/internal/d;

.field public final synthetic h:Lco/bird/android/model/Vehicle;


# direct methods
.method public constructor <init>(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Vehicle;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d$i;->g:Lco/bird/android/manager/bluetooth/internal/d;

    iput-object p2, p0, Lco/bird/android/manager/bluetooth/internal/d$i;->h:Lco/bird/android/model/Vehicle;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/Command;)Lio/reactivex/K;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Command;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation

    const-string v0, "command"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lco/bird/android/manager/bluetooth/internal/d$i;->g:Lco/bird/android/manager/bluetooth/internal/d;

    const/4 v3, 0x0

    iget-object v4, p0, Lco/bird/android/manager/bluetooth/internal/d$i;->h:Lco/bird/android/model/Vehicle;

    const-wide/16 v5, 0x0

    const/16 v7, 0xa

    const/4 v8, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v8}, Lco/bird/android/manager/bluetooth/internal/d;->write$bluetooth_release$default(Lco/bird/android/manager/bluetooth/internal/d;Lco/bird/android/model/Command;[BLco/bird/android/model/Vehicle;JILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/Command;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d$i;->a(Lco/bird/android/model/Command;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
