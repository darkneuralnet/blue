.class public final Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LmX5;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LFz3;",
        "T",
        "LmX5;",
        "b",
        "()LmX5;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$g;->g:Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()LmX5;
    .locals 8

    new-instance v7, LmX5;

    iget-object v1, p0, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$g;->g:Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity;

    const/4 v2, 0x0

    sget-object v3, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$g$a;->g:Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$g$a;

    const/4 v4, 0x0

    const/16 v5, 0xa

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, LmX5;-><init>(Landroid/content/Context;ILkotlin/jvm/functions/Function1;LnX5;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/transferorder/scanner/outbound/base/BaseOutboundScanActivity$g;->b()LmX5;

    move-result-object v0

    return-object v0
.end method
