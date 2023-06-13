.class public final Lw61$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw61;->h(LWu;LjX3;JLvo6;Lys5;ZLEy3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LjX3;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LjX3;",
        "event",
        "",
        "a",
        "(LjX3;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lvo6;

.field public final synthetic h:Lys5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lys5<",
            "Lp61;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic i:Z


# direct methods
.method public constructor <init>(Lvo6;Lys5;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvo6;",
            "Lys5<",
            "-",
            "Lp61;",
            ">;Z)V"
        }
    .end annotation

    iput-object p1, p0, Lw61$c;->g:Lvo6;

    iput-object p2, p0, Lw61$c;->h:Lys5;

    iput-boolean p3, p0, Lw61$c;->i:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LjX3;)V
    .locals 4

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lw61$c;->g:Lvo6;

    invoke-static {v0, p1}, Lwo6;->c(Lvo6;LjX3;)V

    invoke-static {p1}, LZW3;->d(LjX3;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1}, LZW3;->g(LjX3;)J

    move-result-wide v0

    invoke-virtual {p1}, LjX3;->a()V

    iget-object p1, p0, Lw61$c;->h:Lys5;

    new-instance v2, Lp61$b;

    iget-boolean v3, p0, Lw61$c;->i:Z

    if-eqz v3, :cond_0

    const/high16 v3, -0x40800000    # -1.0f

    invoke-static {v0, v1, v3}, LCe3;->u(JF)J

    move-result-wide v0

    :cond_0
    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lp61$b;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v2}, Lys5;->h(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LjX3;

    invoke-virtual {p0, p1}, Lw61$c;->a(LjX3;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
