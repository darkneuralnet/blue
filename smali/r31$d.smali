.class public final Lr31$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr31;->c(Ljava/util/List;Ljava/util/Collection;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lm51;",
        "Ll51;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LAY2;

.field public final synthetic h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LAY2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LAY2;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAY2;",
            "Ljava/util/List<",
            "LAY2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lr31$d;->g:LAY2;

    iput-object p2, p0, Lr31$d;->h:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Ljava/util/List;LAY2;LLifecycleOwner;Landroidx/lifecycle/f$a;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lr31$d;->b(Ljava/util/List;LAY2;LLifecycleOwner;Landroidx/lifecycle/f$a;)V

    return-void
.end method

.method public static final b(Ljava/util/List;LAY2;LLifecycleOwner;Landroidx/lifecycle/f$a;)V
    .locals 1

    const-string v0, "$this_PopulateVisibleList"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$entry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "event"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Landroidx/lifecycle/f$a;->ON_START:Landroidx/lifecycle/f$a;

    if-ne p3, p2, :cond_0

    invoke-interface {p0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    sget-object p2, Landroidx/lifecycle/f$a;->ON_STOP:Landroidx/lifecycle/f$a;

    if-ne p3, p2, :cond_1

    invoke-interface {p0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm51;

    invoke-virtual {p0, p1}, Lr31$d;->invoke(Lm51;)Ll51;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lm51;)Ll51;
    .locals 2

    const-string v0, "$this$DisposableEffect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lr31$d;->h:Ljava/util/List;

    iget-object v0, p0, Lr31$d;->g:LAY2;

    new-instance v1, Ls31;

    invoke-direct {v1, p1, v0}, Ls31;-><init>(Ljava/util/List;LAY2;)V

    iget-object p1, p0, Lr31$d;->g:LAY2;

    invoke-virtual {p1}, LAY2;->getLifecycle()Landroidx/lifecycle/f;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroidx/lifecycle/f;->a(LFq2;)V

    iget-object p1, p0, Lr31$d;->g:LAY2;

    new-instance v0, Lr31$d$a;

    invoke-direct {v0, p1, v1}, Lr31$d$a;-><init>(LAY2;Landroidx/lifecycle/i;)V

    return-object v0
.end method
