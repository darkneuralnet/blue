.class public final Lz21$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz21;->B(Lco/bird/android/model/constant/DeviceVerification;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LVh;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LVh;",
        "kotlin.jvm.PlatformType",
        "token",
        "",
        "a",
        "(LVh;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lz21;

.field public final synthetic h:Lco/bird/android/model/constant/DeviceVerification;


# direct methods
.method public constructor <init>(Lz21;Lco/bird/android/model/constant/DeviceVerification;)V
    .locals 0

    iput-object p1, p0, Lz21$g;->g:Lz21;

    iput-object p2, p0, Lz21$g;->h:Lco/bird/android/model/constant/DeviceVerification;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LVh;)V
    .locals 8

    iget-object v0, p0, Lz21$g;->g:Lz21;

    invoke-virtual {p1}, LVh;->b()Ljava/lang/String;

    move-result-object p1

    const-string v1, "token.token"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, Lz21;->access$updateAppCheckToken(Lz21;Ljava/lang/String;)V

    iget-object v2, p0, Lz21$g;->g:Lz21;

    sget-object v3, Lco/bird/android/model/wire/configs/VerificationMethod;->FIREBASE_APPCHECK:Lco/bird/android/model/wire/configs/VerificationMethod;

    iget-object v4, p0, Lz21$g;->h:Lco/bird/android/model/constant/DeviceVerification;

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lz21;->F(Lz21;Lco/bird/android/model/wire/configs/VerificationMethod;Lco/bird/android/model/constant/DeviceVerification;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LVh;

    invoke-virtual {p0, p1}, Lz21$g;->a(LVh;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
