.class public final LB55$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB55$n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB55;-><init>(Lgl;Llh6;Llg6;LAM3;LVM3;LzN3;Lqi1;LTq4;LHZ5;LmT1;LMc2;LBL1;LV74;LWU4;Llw0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001R:\u0010\u000b\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0012\u0012\u0010\u0012\u000c\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u00050\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0008\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "B55$k",
        "LB55$n;",
        "Lkotlin/Function2;",
        "Lco/bird/android/model/wire/configs/Config;",
        "Lco/bird/android/model/User;",
        "Lio/reactivex/p;",
        "Lco/bird/android/model/RideRequirement;",
        "kotlin.jvm.PlatformType",
        "a",
        "Lkotlin/jvm/functions/Function2;",
        "()Lkotlin/jvm/functions/Function2;",
        "check",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Lco/bird/android/model/wire/configs/Config;",
            "Lco/bird/android/model/User;",
            "Lio/reactivex/p<",
            "Lco/bird/android/model/RideRequirement;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LB55;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LB55$k$a;

    invoke-direct {v0, p1, p0}, LB55$k$a;-><init>(LB55;LB55$k;)V

    iput-object v0, p0, LB55$k;->a:Lkotlin/jvm/functions/Function2;

    return-void
.end method


# virtual methods
.method public a()Lkotlin/jvm/functions/Function2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "Lco/bird/android/model/wire/configs/Config;",
            "Lco/bird/android/model/User;",
            "Lio/reactivex/p<",
            "Lco/bird/android/model/RideRequirement;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, LB55$k;->a:Lkotlin/jvm/functions/Function2;

    return-object v0
.end method
