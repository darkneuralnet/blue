.class public final LB55$d$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB55$d;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lco/bird/android/model/wire/configs/Config;",
        "Lco/bird/android/model/User;",
        "Lio/reactivex/p<",
        "Lco/bird/android/model/RideRequirement;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a&\u0012\u000c\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\u000c\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/Config;",
        "<anonymous parameter 0>",
        "Lco/bird/android/model/User;",
        "<anonymous parameter 1>",
        "Lio/reactivex/p;",
        "Lco/bird/android/model/RideRequirement;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/User;)Lio/reactivex/p;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LB55$d$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LB55$d$a;

    invoke-direct {v0}, LB55$d$a;-><init>()V

    sput-object v0, LB55$d$a;->g:LB55$d$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/User;)Lio/reactivex/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/configs/Config;",
            "Lco/bird/android/model/User;",
            ")",
            "Lio/reactivex/p<",
            "Lco/bird/android/model/RideRequirement;",
            ">;"
        }
    .end annotation

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "<anonymous parameter 1>"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/configs/Config;

    check-cast p2, Lco/bird/android/model/User;

    invoke-virtual {p0, p1, p2}, LB55$d$a;->a(Lco/bird/android/model/wire/configs/Config;Lco/bird/android/model/User;)Lio/reactivex/p;

    move-result-object p1

    return-object p1
.end method
