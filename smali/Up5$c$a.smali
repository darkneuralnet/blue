.class public final LUp5$c$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUp5$c;->a(LgV2;LEt0;I)LgV2;
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
.field public final synthetic g:Z

.field public final synthetic h:Z

.field public final synthetic i:Z

.field public final synthetic j:LXp5;

.field public final synthetic k:LZC0;


# direct methods
.method public constructor <init>(ZZZLXp5;LZC0;)V
    .locals 0

    iput-boolean p1, p0, LUp5$c$a;->g:Z

    iput-boolean p2, p0, LUp5$c$a;->h:Z

    iput-boolean p3, p0, LUp5$c$a;->i:Z

    iput-object p4, p0, LUp5$c$a;->j:LXp5;

    iput-object p5, p0, LUp5$c$a;->k:LZC0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lss5;

    invoke-virtual {p0, p1}, LUp5$c$a;->invoke(Lss5;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lss5;)V
    .locals 4

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LQp5;

    new-instance v1, LUp5$c$a$b;

    iget-object v2, p0, LUp5$c$a;->j:LXp5;

    invoke-direct {v1, v2}, LUp5$c$a$b;-><init>(LXp5;)V

    new-instance v2, LUp5$c$a$c;

    iget-object v3, p0, LUp5$c$a;->j:LXp5;

    invoke-direct {v2, v3}, LUp5$c$a$c;-><init>(LXp5;)V

    iget-boolean v3, p0, LUp5$c$a;->g:Z

    invoke-direct {v0, v1, v2, v3}, LQp5;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Z)V

    iget-boolean v1, p0, LUp5$c$a;->h:Z

    if-eqz v1, :cond_0

    invoke-static {p1, v0}, Lps5;->a0(Lss5;LQp5;)V

    goto :goto_0

    :cond_0
    invoke-static {p1, v0}, Lps5;->K(Lss5;LQp5;)V

    :goto_0
    iget-boolean v0, p0, LUp5$c$a;->i:Z

    if-eqz v0, :cond_1

    new-instance v0, LUp5$c$a$a;

    iget-object v1, p0, LUp5$c$a;->k:LZC0;

    iget-boolean v2, p0, LUp5$c$a;->h:Z

    iget-object v3, p0, LUp5$c$a;->j:LXp5;

    invoke-direct {v0, v1, v2, v3}, LUp5$c$a$a;-><init>(LZC0;ZLXp5;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, v2}, Lps5;->C(Lss5;Ljava/lang/String;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V

    :cond_1
    return-void
.end method
