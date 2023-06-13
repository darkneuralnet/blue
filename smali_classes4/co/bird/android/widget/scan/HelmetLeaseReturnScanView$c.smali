.class public final Lco/bird/android/widget/scan/HelmetLeaseReturnScanView$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/widget/scan/HelmetLeaseReturnScanView;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Landroidx/camera/core/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Landroidx/camera/core/h;",
        "b",
        "()Landroidx/camera/core/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/widget/scan/HelmetLeaseReturnScanView;


# direct methods
.method public constructor <init>(Lco/bird/android/widget/scan/HelmetLeaseReturnScanView;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/widget/scan/HelmetLeaseReturnScanView$c;->g:Lco/bird/android/widget/scan/HelmetLeaseReturnScanView;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Landroidx/camera/core/h;
    .locals 5

    new-instance v0, Landroidx/camera/core/h$g;

    invoke-direct {v0}, Landroidx/camera/core/h$g;-><init>()V

    iget-object v1, p0, Lco/bird/android/widget/scan/HelmetLeaseReturnScanView$c;->g:Lco/bird/android/widget/scan/HelmetLeaseReturnScanView;

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    const/4 v2, 0x2

    const/16 v3, 0x3e8

    const/16 v4, 0x2ee

    if-ne v1, v2, :cond_0

    new-instance v1, Landroid/util/Size;

    invoke-direct {v1, v3, v4}, Landroid/util/Size;-><init>(II)V

    goto :goto_0

    :cond_0
    new-instance v1, Landroid/util/Size;

    invoke-direct {v1, v4, v3}, Landroid/util/Size;-><init>(II)V

    :goto_0
    invoke-virtual {v0, v1}, Landroidx/camera/core/h$g;->o(Landroid/util/Size;)Landroidx/camera/core/h$g;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/h$g;->e()Landroidx/camera/core/h;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/widget/scan/HelmetLeaseReturnScanView$c;->b()Landroidx/camera/core/h;

    move-result-object v0

    return-object v0
.end method
