.class public final LPV4$b$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPV4$b;-><init>(LPV4;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Landroid/view/View;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroid/view/View;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRidePassV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV2Adapter.kt\nco/bird/android/feature/ridepass/v2/list/adapter/RidePassV2Adapter$PassViewHolder$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1#2:179\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LPV4$b;

.field public final synthetic h:LPV4;


# direct methods
.method public constructor <init>(LPV4$b;LPV4;)V
    .locals 0

    iput-object p1, p0, LPV4$b$b;->g:LPV4$b;

    iput-object p2, p0, LPV4$b$b;->h:LPV4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, LPV4$b$b;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, LPV4$b$b;->g:LPV4$b;

    invoke-static {p1}, LPV4$b;->a(LPV4$b;)Lco/bird/android/model/persistence/RidePassView;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, LPV4$b$b;->h:LPV4;

    invoke-static {v0}, LPV4;->access$getMutableTransferClicks$p(LPV4;)Lma4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lma4;->accept(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
