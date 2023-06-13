.class public final Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter$layoutManager$1;
.super Landroidx/recyclerview/widget/GridLayoutManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "co/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter$layoutManager$1",
        "Landroidx/recyclerview/widget/GridLayoutManager;",
        "nest-flight-sheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;)V
    .locals 1

    const/16 v0, 0xa

    invoke-direct {p0, p1, v0}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    new-instance p1, Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter$layoutManager$1$a;

    invoke-direct {p1, p2}, Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter$layoutManager$1$a;-><init>(Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;)V

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/GridLayoutManager;->x3(Landroidx/recyclerview/widget/GridLayoutManager$b;)V

    return-void
.end method
