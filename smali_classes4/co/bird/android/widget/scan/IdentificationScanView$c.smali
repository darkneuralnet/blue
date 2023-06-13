.class public final Lco/bird/android/widget/scan/IdentificationScanView$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/widget/scan/IdentificationScanView;-><init>(Landroid/content/Context;)V
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


# static fields
.field public static final g:Lco/bird/android/widget/scan/IdentificationScanView$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/widget/scan/IdentificationScanView$c;

    invoke-direct {v0}, Lco/bird/android/widget/scan/IdentificationScanView$c;-><init>()V

    sput-object v0, Lco/bird/android/widget/scan/IdentificationScanView$c;->g:Lco/bird/android/widget/scan/IdentificationScanView$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Landroidx/camera/core/h;
    .locals 2

    new-instance v0, Landroidx/camera/core/h$g;

    invoke-direct {v0}, Landroidx/camera/core/h$g;-><init>()V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/camera/core/h$g;->l(I)Landroidx/camera/core/h$g;

    move-result-object v0

    const/16 v1, 0x5a

    invoke-virtual {v0, v1}, Landroidx/camera/core/h$g;->j(I)Landroidx/camera/core/h$g;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/camera/core/h$g;->h(I)Landroidx/camera/core/h$g;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/h$g;->e()Landroidx/camera/core/h;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/widget/scan/IdentificationScanView$c;->b()Landroidx/camera/core/h;

    move-result-object v0

    return-object v0
.end method
