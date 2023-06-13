.class public final LTH$z;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTH;->d(Ljava/lang/String;Lco/bird/android/model/PrivateBirdSetting;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0006\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "doesOwnOrRent",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/Boolean;)Lio/reactivex/h;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LTH;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lco/bird/android/model/PrivateBirdSetting;


# direct methods
.method public constructor <init>(LTH;Ljava/lang/String;Lco/bird/android/model/PrivateBirdSetting;)V
    .locals 0

    iput-object p1, p0, LTH$z;->g:LTH;

    iput-object p2, p0, LTH$z;->h:Ljava/lang/String;

    iput-object p3, p0, LTH$z;->i:Lco/bird/android/model/PrivateBirdSetting;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Boolean;)Lio/reactivex/h;
    .locals 3

    const-string v0, "doesOwnOrRent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "You can only get actions for birds you rent, or own."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/c;->F(Ljava/lang/Throwable;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LTH$z;->g:LTH;

    invoke-static {p1}, LTH;->access$getBirdActionsApi$p(LTH;)LfH;

    move-result-object p1

    new-instance v0, Lco/bird/api/request/BirdSettingsBody;

    iget-object v1, p0, LTH$z;->h:Ljava/lang/String;

    iget-object v2, p0, LTH$z;->i:Lco/bird/android/model/PrivateBirdSetting;

    invoke-direct {v0, v1, v2}, Lco/bird/api/request/BirdSettingsBody;-><init>(Ljava/lang/String;Lco/bird/android/model/PrivateBirdSetting;)V

    invoke-interface {p1, v0}, LfH;->e(Lco/bird/api/request/BirdSettingsBody;)Lio/reactivex/F;

    move-result-object p1

    const-wide/16 v0, 0x1

    invoke-virtual {p1, v0, v1}, Lio/reactivex/F;->T(J)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LTH$z;->invoke(Ljava/lang/Boolean;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
