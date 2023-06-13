.class public final LoP3$s;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LoP3;->r0(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireCoupon;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireCoupon;",
        "kotlin.jvm.PlatformType",
        "coupon",
        "",
        "a",
        "(Lco/bird/android/model/wire/WireCoupon;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LoP3;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(LoP3;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LoP3$s;->g:LoP3;

    iput-object p2, p0, LoP3$s;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireCoupon;)V
    .locals 3

    iget-object v0, p0, LoP3$s;->g:LoP3;

    invoke-static {v0}, LoP3;->access$getUi$p(LoP3;)LCP3;

    move-result-object v0

    iget-object v1, p0, LoP3$s;->h:Ljava/lang/String;

    const-string v2, "coupon"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, v1, p1}, LCP3;->hf(Ljava/lang/String;Lco/bird/android/model/wire/WireCoupon;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireCoupon;

    invoke-virtual {p0, p1}, LoP3$s;->a(Lco/bird/android/model/wire/WireCoupon;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
