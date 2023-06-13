.class public final Lfo2$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfo2;->a(LgV2;LRn2;Ldo2;LEy3;ZZLEt0;I)LgV2;
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
.field public final synthetic g:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:Z

.field public final synthetic i:LQp5;

.field public final synthetic j:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic k:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic l:Lem0;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;ZLQp5;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lem0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Ljava/lang/Integer;",
            ">;Z",
            "LQp5;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/Float;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lem0;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lfo2$a;->g:Lkotlin/jvm/functions/Function1;

    iput-boolean p2, p0, Lfo2$a;->h:Z

    iput-object p3, p0, Lfo2$a;->i:LQp5;

    iput-object p4, p0, Lfo2$a;->j:Lkotlin/jvm/functions/Function2;

    iput-object p5, p0, Lfo2$a;->k:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lfo2$a;->l:Lem0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lss5;

    invoke-virtual {p0, p1}, Lfo2$a;->invoke(Lss5;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lss5;)V
    .locals 3

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfo2$a;->g:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v0}, Lps5;->q(Lss5;Lkotlin/jvm/functions/Function1;)V

    iget-boolean v0, p0, Lfo2$a;->h:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lfo2$a;->i:LQp5;

    invoke-static {p1, v0}, Lps5;->a0(Lss5;LQp5;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lfo2$a;->i:LQp5;

    invoke-static {p1, v0}, Lps5;->K(Lss5;LQp5;)V

    :goto_0
    iget-object v0, p0, Lfo2$a;->j:Lkotlin/jvm/functions/Function2;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-static {p1, v2, v0, v1, v2}, Lps5;->C(Lss5;Ljava/lang/String;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    :cond_1
    iget-object v0, p0, Lfo2$a;->k:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_2

    invoke-static {p1, v2, v0, v1, v2}, Lps5;->E(Lss5;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    :cond_2
    iget-object v0, p0, Lfo2$a;->l:Lem0;

    invoke-static {p1, v0}, Lps5;->F(Lss5;Lem0;)V

    return-void
.end method
