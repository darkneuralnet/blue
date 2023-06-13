.class public abstract Lco/bird/android/core/base/viewmodel/BottomSheetAlertDialog;
.super LNy;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u00012\u00020\u0002B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0004\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008\r\u0010\nR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u000e8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0010\u001a\u0004\u0008\u0014\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u000e8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0010\u001a\u0004\u0008\u0017\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000e8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0010\u001a\u0004\u0008\u000f\u0010\u0012\u0082\u0001\u0005\u001c\u001d\u001e\u001f \u00a8\u0006!"
    }
    d2 = {
        "Lco/bird/android/core/base/viewmodel/BottomSheetAlertDialog;",
        "LNy;",
        "Landroid/os/Parcelable;",
        "Landroid/content/Context;",
        "context",
        "Landroid/graphics/drawable/Drawable;",
        "g",
        "j",
        "",
        "i",
        "(Landroid/content/Context;)Ljava/lang/Integer;",
        "l",
        "h",
        "k",
        "",
        "d",
        "Z",
        "c",
        "()Z",
        "icon1Padding",
        "e",
        "icon2Padding",
        "f",
        "b",
        "icon1Background",
        "icon2Background",
        "<init>",
        "()V",
        "Lco/bird/android/core/base/viewmodel/BillOfLadingReceived;",
        "Lco/bird/android/core/base/viewmodel/CoreInventorySuccess;",
        "Lco/bird/android/core/base/viewmodel/MarkDamaged;",
        "Lco/bird/android/core/base/viewmodel/ScrapRemovalComplete;",
        "Lco/bird/android/core/base/viewmodel/UnmarkDamaged;",
        "core-base_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LNy;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lco/bird/android/core/base/viewmodel/BottomSheetAlertDialog;->d:Z

    iput-boolean v0, p0, Lco/bird/android/core/base/viewmodel/BottomSheetAlertDialog;->e:Z

    iput-boolean v0, p0, Lco/bird/android/core/base/viewmodel/BottomSheetAlertDialog;->f:Z

    iput-boolean v0, p0, Lco/bird/android/core/base/viewmodel/BottomSheetAlertDialog;->g:Z

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/core/base/viewmodel/BottomSheetAlertDialog;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/core/base/viewmodel/BottomSheetAlertDialog;->f:Z

    return v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/core/base/viewmodel/BottomSheetAlertDialog;->d:Z

    return v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/core/base/viewmodel/BottomSheetAlertDialog;->g:Z

    return v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/core/base/viewmodel/BottomSheetAlertDialog;->e:Z

    return v0
.end method

.method public abstract g(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
.end method

.method public h(Landroid/content/Context;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public i(Landroid/content/Context;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public abstract j(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;
.end method

.method public k(Landroid/content/Context;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public l(Landroid/content/Context;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method
