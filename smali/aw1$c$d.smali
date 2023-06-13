.class public final Law1$c$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Law1$c;->e(LgV2;LEt0;I)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lss5;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:Landroidx/compose/ui/focus/h;


# direct methods
.method public constructor <init>(LEX2;Landroidx/compose/ui/focus/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/ui/focus/h;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Law1$c$d;->g:LEX2;

    iput-object p2, p0, Law1$c$d;->h:Landroidx/compose/ui/focus/h;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lss5;

    invoke-virtual {p0, p1}, Law1$c$d;->invoke(Lss5;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lss5;)V
    .locals 3

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Law1$c$d;->g:LEX2;

    invoke-static {v0}, Law1$c;->b(LEX2;)Z

    move-result v0

    invoke-static {p1, v0}, Lps5;->J(Lss5;Z)V

    new-instance v0, Law1$c$d$a;

    iget-object v1, p0, Law1$c$d;->h:Landroidx/compose/ui/focus/h;

    iget-object v2, p0, Law1$c$d;->g:LEX2;

    invoke-direct {v0, v1, v2}, Law1$c$d$a;-><init>(Landroidx/compose/ui/focus/h;LEX2;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, v2}, Lps5;->A(Lss5;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    return-void
.end method
