.class public final Lak0$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lak0;->g(LgV2;LCb5;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)LgV2;
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
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lss5;",
        "",
        "invoke",
        "(Lss5;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LCb5;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Z

.field public final synthetic l:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LCb5;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LCb5;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lak0$g;->g:LCb5;

    iput-object p2, p0, Lak0$g;->h:Ljava/lang/String;

    iput-object p3, p0, Lak0$g;->i:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lak0$g;->j:Ljava/lang/String;

    iput-boolean p5, p0, Lak0$g;->k:Z

    iput-object p6, p0, Lak0$g;->l:Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lss5;

    invoke-virtual {p0, p1}, Lak0$g;->invoke(Lss5;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lss5;)V
    .locals 3

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lak0$g;->g:LCb5;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LCb5;->n()I

    move-result v0

    invoke-static {p1, v0}, Lps5;->P(Lss5;I)V

    :cond_0
    iget-object v0, p0, Lak0$g;->h:Ljava/lang/String;

    new-instance v1, Lak0$g$a;

    iget-object v2, p0, Lak0$g;->l:Lkotlin/jvm/functions/Function0;

    invoke-direct {v1, v2}, Lak0$g$a;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-static {p1, v0, v1}, Lps5;->r(Lss5;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    iget-object v0, p0, Lak0$g;->i:Lkotlin/jvm/functions/Function0;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lak0$g;->j:Ljava/lang/String;

    new-instance v2, Lak0$g$b;

    invoke-direct {v2, v0}, Lak0$g$b;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-static {p1, v1, v2}, Lps5;->t(Lss5;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    :cond_1
    iget-boolean v0, p0, Lak0$g;->k:Z

    if-nez v0, :cond_2

    invoke-static {p1}, Lps5;->h(Lss5;)V

    :cond_2
    return-void
.end method
