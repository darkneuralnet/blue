.class public final Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LYP3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LYP3;",
        "b",
        "()LYP3;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity$c;->g:Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()LYP3;
    .locals 3

    new-instance v0, LYP3;

    iget-object v1, p0, Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity$c;->g:Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;

    invoke-static {v1}, Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;->access$getBinding(Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity;)Lf00;

    move-result-object v1

    iget-object v1, v1, Lf00;->i:Landroidx/recyclerview/widget/RecyclerView;

    const-string v2, "binding.recyclerView"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, LYP3;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/complaintresolution/scanner/VehicleInvolvedScanActivity$c;->b()LYP3;

    move-result-object v0

    return-object v0
.end method
