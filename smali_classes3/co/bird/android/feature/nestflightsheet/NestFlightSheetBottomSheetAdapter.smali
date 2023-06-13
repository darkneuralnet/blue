.class public final Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;
.super LwZ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LwZ<",
        "Lco/bird/android/model/NestFlightSheetButton;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 \u000b2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0008\u001a\u00020\u00038\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\t8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0013"
    }
    d2 = {
        "Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;",
        "LwZ;",
        "Lco/bird/android/model/NestFlightSheetButton;",
        "LD33;",
        "c",
        "LD33;",
        "d",
        "()LD33;",
        "adapter",
        "Landroidx/recyclerview/widget/GridLayoutManager;",
        "Landroidx/recyclerview/widget/GridLayoutManager;",
        "e",
        "()Landroidx/recyclerview/widget/GridLayoutManager;",
        "layoutManager",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "b",
        "nest-flight-sheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final e:Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter$b;


# instance fields
.field public final c:LD33;

.field public final d:Landroidx/recyclerview/widget/GridLayoutManager;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;->e:Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter$b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LwZ;-><init>(Landroid/content/Context;)V

    new-instance v0, LD33;

    invoke-direct {v0}, LD33;-><init>()V

    iput-object v0, p0, Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;->c:LD33;

    new-instance v0, Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter$layoutManager$1;

    invoke-direct {v0, p1, p0}, Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter$layoutManager$1;-><init>(Landroid/content/Context;Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;)V

    iput-object v0, p0, Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;->d:Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;->d()LD33;

    move-result-object p1

    new-instance v0, Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter$a;

    invoke-direct {v0, p0}, Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter$a;-><init>(Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;)V

    invoke-virtual {p1, v0}, LD33;->x(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$getOnClick(Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;)Lkotlin/jvm/functions/Function1;
    .locals 0

    invoke-virtual {p0}, LwZ;->a()Lkotlin/jvm/functions/Function1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public d()LD33;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;->c:LD33;

    return-object v0
.end method

.method public e()Landroidx/recyclerview/widget/GridLayoutManager;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;->d:Landroidx/recyclerview/widget/GridLayoutManager;

    return-object v0
.end method

.method public bridge synthetic getAdapter()LyS0;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;->d()LD33;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$p;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/nestflightsheet/NestFlightSheetBottomSheetAdapter;->e()Landroidx/recyclerview/widget/GridLayoutManager;

    move-result-object v0

    return-object v0
.end method
