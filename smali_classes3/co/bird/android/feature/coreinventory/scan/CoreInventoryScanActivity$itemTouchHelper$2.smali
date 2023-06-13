.class final Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$itemTouchHelper$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Landroidx/recyclerview/widget/l;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Landroidx/recyclerview/widget/l;",
        "b",
        "()Landroidx/recyclerview/widget/l;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$itemTouchHelper$2;->g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Landroidx/recyclerview/widget/l;
    .locals 2

    new-instance v0, Landroidx/recyclerview/widget/l;

    iget-object v1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$itemTouchHelper$2;->g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;

    invoke-static {v1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;->access$getSwipeHelper(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;)LmX5;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/l;-><init>(Landroidx/recyclerview/widget/l$e;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$itemTouchHelper$2;->b()Landroidx/recyclerview/widget/l;

    move-result-object v0

    return-object v0
.end method
