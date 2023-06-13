.class public final LPt0$G;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPt0;->A([LW94;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LEt0;",
        "Ljava/lang/Integer;",
        "LFR3<",
        "Lfu0<",
        "Ljava/lang/Object;",
        ">;+",
        "LsP5<",
        "+",
        "Ljava/lang/Object;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\"\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u0004H\u000b\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LFR3;",
        "Lfu0;",
        "",
        "LsP5;",
        "Landroidx/compose/runtime/CompositionLocalMap;",
        "a",
        "(LEt0;I)LFR3;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:[LW94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "LW94<",
            "*>;"
        }
    .end annotation
.end field

.field public final synthetic h:LFR3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LFR3<",
            "Lfu0<",
            "Ljava/lang/Object;",
            ">;",
            "LsP5<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>([LW94;LFR3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "LW94<",
            "*>;",
            "LFR3<",
            "Lfu0<",
            "Ljava/lang/Object;",
            ">;+",
            "LsP5<",
            "+",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, LPt0$G;->g:[LW94;

    iput-object p2, p0, LPt0$G;->h:LFR3;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LEt0;I)LFR3;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEt0;",
            "I)",
            "LFR3<",
            "Lfu0<",
            "Ljava/lang/Object;",
            ">;",
            "LsP5<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    const v0, 0x37be80ee

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.runtime.ComposerImpl.startProviders.<anonymous> (Composer.kt:2002)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    iget-object p2, p0, LPt0$G;->g:[LW94;

    iget-object v0, p0, LPt0$G;->h:LFR3;

    const/16 v1, 0x8

    invoke-static {p2, v0, p1, v1}, LQt0;->d([LW94;LFR3;LEt0;I)LFR3;

    move-result-object p2

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p1}, LEt0;->Q()V

    return-object p2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LPt0$G;->a(LEt0;I)LFR3;

    move-result-object p1

    return-object p1
.end method
