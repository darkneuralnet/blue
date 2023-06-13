.class public final Lco/bird/android/bottomsheet/BaseBottomSheet$o$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/bottomsheet/BaseBottomSheet$o;->invoke(Ljava/lang/Boolean;)Lio/reactivex/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Integer;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\"\u0008\u0008\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lco/bird/android/model/BottomSheetButton;",
        "T",
        "",
        "newState",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Ljava/lang/Integer;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/bottomsheet/BaseBottomSheet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lco/bird/android/bottomsheet/BaseBottomSheet<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/bottomsheet/BaseBottomSheet;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/bottomsheet/BaseBottomSheet<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/bottomsheet/BaseBottomSheet$o$a;->g:Lco/bird/android/bottomsheet/BaseBottomSheet;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lco/bird/android/bottomsheet/BaseBottomSheet;Ljava/lang/Integer;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/bottomsheet/BaseBottomSheet$o$a;->c(Lco/bird/android/bottomsheet/BaseBottomSheet;Ljava/lang/Integer;)V

    return-void
.end method

.method public static final c(Lco/bird/android/bottomsheet/BaseBottomSheet;Ljava/lang/Integer;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$newState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/bottomsheet/BaseBottomSheet;->u()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p0(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Integer;)Lio/reactivex/h;
    .locals 2

    const-string v0, "newState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Processing state change request from queue: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lco/bird/android/bottomsheet/BaseBottomSheet$o$a;->g:Lco/bird/android/bottomsheet/BaseBottomSheet;

    new-instance v1, Lkz;

    invoke-direct {v1, v0, p1}, Lkz;-><init>(Lco/bird/android/bottomsheet/BaseBottomSheet;Ljava/lang/Integer;)V

    invoke-static {v1}, Lio/reactivex/c;->J(Ljava/lang/Runnable;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lco/bird/android/bottomsheet/BaseBottomSheet$o$a;->b(Ljava/lang/Integer;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method
