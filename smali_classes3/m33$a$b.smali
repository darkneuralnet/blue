.class public final Lm33$a$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm33$a;-><init>(Lm33;Landroid/view/View;)V
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
        "SMAP\nNestFlaggingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFlaggingAdapter.kt\nco/bird/android/feature/nestflagging/adapters/NestFlaggingAdapter$CapacityViewHolder$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,152:1\n1#2:153\n18#3:154\n9#4,4:155\n*S KotlinDebug\n*F\n+ 1 NestFlaggingAdapter.kt\nco/bird/android/feature/nestflagging/adapters/NestFlaggingAdapter$CapacityViewHolder$2\n*L\n125#1:154\n125#1:155,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lm33$a;

.field public final synthetic h:Lm33;


# direct methods
.method public constructor <init>(Lm33$a;Lm33;)V
    .locals 0

    iput-object p1, p0, Lm33$a$b;->g:Lm33$a;

    iput-object p2, p0, Lm33$a$b;->h:Lm33;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lm33$a$b;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 3

    iget-object p1, p0, Lm33$a$b;->g:Lm33$a;

    invoke-virtual {p1}, Lw1;->getSafePosition()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lm33$a$b;->h:Lm33;

    invoke-static {v0}, Lm33;->access$getAdapterData(Lm33;)LE6;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lkotlin/Pair;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lkotlin/Pair;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, Lm33$a$b;->g:Lm33$a;

    invoke-static {v1}, Lm33$a;->b(Lm33$a;)LHd2;

    move-result-object v1

    iget-object v1, v1, LHd2;->c:Landroid/widget/TextView;

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lm33$a$b;->h:Lm33;

    invoke-virtual {v1}, Lm33;->v()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lm33$a$b;->g:Lm33$a;

    invoke-static {v1, v0, p1}, Lm33$a;->a(Lm33$a;ILjava/lang/Integer;)V

    :cond_1
    return-void
.end method