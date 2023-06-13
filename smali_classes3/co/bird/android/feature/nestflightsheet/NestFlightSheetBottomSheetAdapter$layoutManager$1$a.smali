.class public final Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter$layoutManager$1$a;
.super Landroidx/recyclerview/widget/GridLayoutManager$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter$layoutManager$1;-><init>(Landroid/content/Context;Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a8\u0006\u0005"
    }
    d2 = {
        "co/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter$layoutManager$1$a",
        "Landroidx/recyclerview/widget/GridLayoutManager$b;",
        "",
        "position",
        "f",
        "nest-flight-sheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic e:Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter$layoutManager$1$a;->e:Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;

    invoke-direct {p0}, Landroidx/recyclerview/widget/GridLayoutManager$b;-><init>()V

    return-void
.end method


# virtual methods
.method public f(I)I
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter$layoutManager$1$a;->e:Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;

    invoke-virtual {v0}, Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;->d()LD33;

    move-result-object v0

    invoke-virtual {v0, p1}, LMy;->getItemViewType(I)I

    move-result p1

    sget v0, Lrj4;->item_nest_flight_sheet_birdle_icon:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/16 p1, 0xa

    :goto_0
    return p1
.end method
