.class public final Lcom/stripe/android/paymentsheet/BottomSheetController;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u001a\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR \u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u000e8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/BottomSheetController;",
        "",
        "Landroid/view/ViewGroup;",
        "bottomSheet",
        "",
        "setup",
        "hide",
        "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;",
        "bottomSheetBehavior",
        "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;",
        "LBX2;",
        "",
        "_shouldFinish",
        "LBX2;",
        "LEu1;",
        "shouldFinish",
        "LEu1;",
        "getShouldFinish$paymentsheet_release",
        "()LEu1;",
        "<init>",
        "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBottomSheetController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetController.kt\ncom/stripe/android/paymentsheet/BottomSheetController\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,67:1\n40#2:68\n56#2:69\n*S KotlinDebug\n*F\n+ 1 BottomSheetController.kt\ncom/stripe/android/paymentsheet/BottomSheetController\n*L\n23#1:68\n23#1:69\n*E\n"
    }
.end annotation


# instance fields
.field private final _shouldFinish:LBX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LBX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final bottomSheetBehavior:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/material/bottomsheet/BottomSheetBehavior<",
            "Landroid/view/ViewGroup;",
            ">;"
        }
    .end annotation
.end field

.field private final shouldFinish:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/material/bottomsheet/BottomSheetBehavior<",
            "Landroid/view/ViewGroup;",
            ">;)V"
        }
    .end annotation

    const-string v0, "bottomSheetBehavior"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/BottomSheetController;->bottomSheetBehavior:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    const/4 p1, 0x0

    const/4 v0, 0x6

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v1, v2, p1, v0, p1}, LVy5;->b(IILk30;ILjava/lang/Object;)LBX2;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/BottomSheetController;->_shouldFinish:LBX2;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/BottomSheetController;->shouldFinish:LEu1;

    return-void
.end method

.method public static final synthetic access$getBottomSheetBehavior$p(Lcom/stripe/android/paymentsheet/BottomSheetController;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/BottomSheetController;->bottomSheetBehavior:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    return-object p0
.end method

.method public static final synthetic access$get_shouldFinish$p(Lcom/stripe/android/paymentsheet/BottomSheetController;)LBX2;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/BottomSheetController;->_shouldFinish:LBX2;

    return-object p0
.end method


# virtual methods
.method public final getShouldFinish$paymentsheet_release()LEu1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/BottomSheetController;->shouldFinish:LEu1;

    return-object v0
.end method

.method public final hide()V
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/BottomSheetController;->bottomSheetBehavior:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    invoke-virtual {v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/BottomSheetController;->_shouldFinish:LBX2;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, LBX2;->b(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/BottomSheetController;->bottomSheetBehavior:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p0(I)V

    :goto_0
    return-void
.end method

.method public final setup(Landroid/view/ViewGroup;)V
    .locals 3

    const-string v0, "bottomSheet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/BottomSheetController;->bottomSheetBehavior:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->h0(Z)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/BottomSheetController;->bottomSheetBehavior:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->c0(Z)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/BottomSheetController;->bottomSheetBehavior:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    const/4 v2, 0x5

    invoke-virtual {v0, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p0(I)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/BottomSheetController;->bottomSheetBehavior:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    const/4 v2, -0x1

    invoke-virtual {v0, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->m0(I)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/BottomSheetController;->bottomSheetBehavior:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->e0(Z)V

    new-instance v0, Lcom/stripe/android/paymentsheet/BottomSheetController$setup$$inlined$doOnNextLayout$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/paymentsheet/BottomSheetController$setup$$inlined$doOnNextLayout$1;-><init>(Lcom/stripe/android/paymentsheet/BottomSheetController;Landroid/view/ViewGroup;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/BottomSheetController;->bottomSheetBehavior:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    new-instance v0, Lcom/stripe/android/paymentsheet/BottomSheetController$setup$2;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/BottomSheetController$setup$2;-><init>(Lcom/stripe/android/paymentsheet/BottomSheetController;)V

    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->u(Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;)V

    return-void
.end method
