.class public final LLG2$m;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLG2;->F()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Lio/reactivex/K<",
        "+",
        "Ljava/lang/Boolean;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "proceed",
        "Lio/reactivex/K;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Ljava/lang/Boolean;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LLG2;


# direct methods
.method public constructor <init>(LLG2;)V
    .locals 0

    iput-object p1, p0, LLG2$m;->g:LLG2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LLG2;)V
    .locals 0

    invoke-static {p0}, LLG2$m;->c(LLG2;)V

    return-void
.end method

.method public static final c(LLG2;)V
    .locals 2

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Databases cleared"

    invoke-static {v1, v0}, Lg46;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p0}, LLG2;->access$getPreference$p(LLG2;)Lgl;

    move-result-object p0

    invoke-virtual {p0}, Lgl;->L1()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Boolean;)Lio/reactivex/K;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-string v0, "proceed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LLG2$m;->g:LLG2;

    invoke-static {v0}, LLG2;->access$getPreference$p(LLG2;)Lgl;

    move-result-object v0

    invoke-virtual {v0}, Lgl;->x()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LLG2$m;->g:LLG2;

    invoke-static {v0}, LLG2;->access$getRepositoryManager$p(LLG2;)LcI4;

    move-result-object v0

    invoke-interface {v0}, LcI4;->a()Lio/reactivex/c;

    move-result-object v0

    iget-object v1, p0, LLG2$m;->g:LLG2;

    new-instance v2, LSG2;

    invoke-direct {v2, v1}, LSG2;-><init>(LLG2;)V

    invoke-virtual {v0, v2}, Lio/reactivex/c;->z(Lio/reactivex/functions/a;)Lio/reactivex/c;

    move-result-object v0

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, LLG2$m;->b(Ljava/lang/Boolean;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method
