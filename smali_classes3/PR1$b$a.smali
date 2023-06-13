.class public final LPR1$b$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPR1$b;-><init>(LPR1;Landroid/view/View;)V
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
        "SMAP\nIdToolsLandingAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsLandingAdapter.kt\nco/bird/android/feature/servicecenter/idtools/landing/adapters/IdToolsLandingAdapter$IdToolsServiceOptionViewHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 4 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,163:1\n1#2:164\n18#3:165\n9#4,4:166\n*S KotlinDebug\n*F\n+ 1 IdToolsLandingAdapter.kt\nco/bird/android/feature/servicecenter/idtools/landing/adapters/IdToolsLandingAdapter$IdToolsServiceOptionViewHolder$1\n*L\n84#1:165\n84#1:166,4\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LPR1$b;

.field public final synthetic h:LPR1;


# direct methods
.method public constructor <init>(LPR1$b;LPR1;)V
    .locals 0

    iput-object p1, p0, LPR1$b$a;->g:LPR1$b;

    iput-object p2, p0, LPR1$b$a;->h:LPR1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, LPR1$b$a;->invoke(Landroid/view/View;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroid/view/View;)V
    .locals 3

    iget-object p1, p0, LPR1$b$a;->g:LPR1$b;

    invoke-virtual {p1}, Lw1;->getSafePosition()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, LPR1$b$a;->h:LPR1;

    invoke-static {v0}, LPR1;->access$getAdapterData(LPR1;)LE6;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LFS1;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LFS1;

    if-eqz p1, :cond_2

    iget-object v0, p0, LPR1$b$a;->h:LPR1;

    invoke-virtual {p1}, LFS1;->d()LGS1;

    move-result-object v1

    sget-object v2, LGS1;->b:LGS1;

    if-ne v1, v2, :cond_1

    invoke-virtual {v0}, LPR1;->v()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-virtual {p1}, LFS1;->c()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, LPR1;->x()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-virtual {p1}, LFS1;->c()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_1
    return-void
.end method
