.class public final LAW4$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LAW4$a;-><init>(LAW4;Landroid/view/View;)V
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
        "SMAP\nRidePassV4Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV4Adapter.kt\nco/bird/android/feature/ridepass/v4/list/adapter/RidePassV4Adapter$RidePassViewHolder$1\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n18#2:78\n9#3,4:79\n1#4:83\n*S KotlinDebug\n*F\n+ 1 RidePassV4Adapter.kt\nco/bird/android/feature/ridepass/v4/list/adapter/RidePassV4Adapter$RidePassViewHolder$1\n*L\n45#1:78\n45#1:79,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LAW4;

.field public final synthetic h:LAW4$a;


# direct methods
.method public constructor <init>(LAW4;LAW4$a;)V
    .locals 0

    iput-object p1, p0, LAW4$a$a;->g:LAW4;

    iput-object p2, p0, LAW4$a$a;->h:LAW4$a;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, LAW4$a$a;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, LAW4$a$a;->g:LAW4;

    invoke-static {p1}, LAW4;->access$getAdapterData(LAW4;)LE6;

    move-result-object p1

    iget-object v0, p0, LAW4$a$a;->h:LAW4$a;

    invoke-virtual {v0}, Lw1;->getSafePosition()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LFX4;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LFX4;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LFX4;->d()Lco/bird/android/model/persistence/RidePassView;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, LAW4$a$a;->g:LAW4;

    invoke-static {v0}, LAW4;->access$getRidePassClicksRelay$p(LAW4;)Lma4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lma4;->accept(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
