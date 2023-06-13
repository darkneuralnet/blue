.class public final LQ06$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ06;-><init>(LF26;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lnm2;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lnm2;",
        "it",
        "",
        "invoke",
        "(Lnm2;)V",
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
.field public final synthetic g:LQ06;


# direct methods
.method public constructor <init>(LQ06;)V
    .locals 0

    iput-object p1, p0, LQ06$a;->g:LQ06;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnm2;

    invoke-virtual {p0, p1}, LQ06$a;->invoke(Lnm2;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lnm2;)V
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LQ06$a;->g:LQ06;

    invoke-virtual {v0}, LQ06;->h()LF26;

    move-result-object v0

    invoke-virtual {v0, p1}, LF26;->k(Lnm2;)V

    iget-object v0, p0, LQ06$a;->g:LQ06;

    invoke-static {v0}, LQ06;->a(LQ06;)LVr5;

    move-result-object v0

    iget-object v1, p0, LQ06$a;->g:LQ06;

    invoke-virtual {v1}, LQ06;->h()LF26;

    move-result-object v1

    invoke-virtual {v1}, LF26;->h()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, LWr5;->b(LVr5;J)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lom2;->f(Lnm2;)J

    move-result-wide v0

    iget-object p1, p0, LQ06$a;->g:LQ06;

    invoke-virtual {p1}, LQ06;->h()LF26;

    move-result-object p1

    invoke-virtual {p1}, LF26;->f()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LCe3;->l(JJ)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LQ06$a;->g:LQ06;

    invoke-static {p1}, LQ06;->a(LQ06;)LVr5;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v2, p0, LQ06$a;->g:LQ06;

    invoke-virtual {v2}, LQ06;->h()LF26;

    move-result-object v2

    invoke-virtual {v2}, LF26;->h()J

    move-result-wide v2

    invoke-interface {p1, v2, v3}, LVr5;->c(J)V

    :cond_0
    iget-object p1, p0, LQ06$a;->g:LQ06;

    invoke-virtual {p1}, LQ06;->h()LF26;

    move-result-object p1

    invoke-virtual {p1, v0, v1}, LF26;->o(J)V

    :cond_1
    return-void
.end method
