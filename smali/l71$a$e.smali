.class public final Ll71$a$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll71$a;->invoke(Lh10;LEt0;I)V
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
.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Lm71;

.field public final synthetic i:LZC0;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lm71;LZC0;)V
    .locals 0

    iput-object p1, p0, Ll71$a$e;->g:Ljava/lang/String;

    iput-object p2, p0, Ll71$a$e;->h:Lm71;

    iput-object p3, p0, Ll71$a$e;->i:LZC0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lss5;

    invoke-virtual {p0, p1}, Ll71$a$e;->invoke(Lss5;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lss5;)V
    .locals 3

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ll71$a$e;->g:Ljava/lang/String;

    invoke-static {p1, v0}, Lps5;->N(Lss5;Ljava/lang/String;)V

    iget-object v0, p0, Ll71$a$e;->h:Lm71;

    invoke-virtual {v0}, Lm71;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ll71$a$e$a;

    iget-object v1, p0, Ll71$a$e;->h:Lm71;

    iget-object v2, p0, Ll71$a$e;->i:LZC0;

    invoke-direct {v0, v1, v2}, Ll71$a$e$a;-><init>(Lm71;LZC0;)V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, v2}, Lps5;->j(Lss5;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method
