.class public final LQe$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQe;->a(LOY2;LJY2;LgV2;LK9;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function4<",
        "LTe;",
        "LAY2;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LEi5;

.field public final synthetic h:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Ljava/util/List<",
            "LAY2;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LEi5;LsP5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEi5;",
            "LsP5<",
            "+",
            "Ljava/util/List<",
            "LAY2;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, LQe$i;->g:LEi5;

    iput-object p2, p0, LQe$i;->h:LsP5;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LTe;

    check-cast p2, LAY2;

    check-cast p3, LEt0;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, LQe$i;->invoke(LTe;LAY2;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LTe;LAY2;LEt0;I)V
    .locals 3

    const-string v0, "$this$AnimatedContent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.google.accompanist.navigation.animation.AnimatedNavHost.<anonymous> (AnimatedNavHost.kt:214)"

    const v2, 0x4a11254a    # 2378066.5f

    invoke-static {v2, p4, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    iget-object p4, p0, LQe$i;->h:LsP5;

    invoke-static {p4}, LQe;->d(LsP5;)Ljava/util/List;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p4, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p4

    :cond_1
    invoke-interface {p4}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p4}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LAY2;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    check-cast v0, LAY2;

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    iget-object p2, p0, LQe$i;->g:LEi5;

    new-instance p4, LQe$i$a;

    invoke-direct {p4, v0, p1}, LQe$i$a;-><init>(LAY2;LTe;)V

    const p1, 0x9733639

    const/4 v1, 0x1

    invoke-static {p3, p1, v1, p4}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object p1

    const/16 p4, 0x1c8

    invoke-static {v0, p2, p1, p3, p4}, LBY2;->a(LAY2;LEi5;Lkotlin/jvm/functions/Function2;LEt0;I)V

    :goto_1
    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    return-void
.end method
