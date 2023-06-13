.class public final synthetic Lco/bird/android/feature/coreinventory/scan/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;

.field public final synthetic c:Lkotlin/Pair;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;Lkotlin/Pair;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/feature/coreinventory/scan/a;->b:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;

    iput-object p2, p0, Lco/bird/android/feature/coreinventory/scan/a;->c:Lkotlin/Pair;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lco/bird/android/feature/coreinventory/scan/a;->b:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;

    iget-object v1, p0, Lco/bird/android/feature/coreinventory/scan/a;->c:Lkotlin/Pair;

    invoke-static {v0, v1, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity$itemSwiped$3;->a(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanActivity;Lkotlin/Pair;Landroid/view/View;)V

    return-void
.end method
