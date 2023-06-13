.class public final LbG3$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LbG3;-><init>(Lco/bird/android/widget/ParkingNestView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Landroid/widget/Button;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Landroid/widget/Button;",
        "b",
        "()Landroid/widget/Button;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LbG3;


# direct methods
.method public constructor <init>(LbG3;)V
    .locals 0

    iput-object p1, p0, LbG3$a;->g:LbG3;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Landroid/widget/Button;
    .locals 2

    iget-object v0, p0, LbG3$a;->g:LbG3;

    invoke-static {v0}, LbG3;->access$getParkingNestView$p(LbG3;)Lco/bird/android/widget/ParkingNestView;

    move-result-object v0

    sget v1, Lzi4;->showNearestParkingButton:I

    invoke-static {v0, v1}, Ltu6;->h(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LbG3$a;->b()Landroid/widget/Button;

    move-result-object v0

    return-object v0
.end method
