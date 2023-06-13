.class public final LQv4$a$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQv4$a;->invoke(Lm51;)Ll51;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/Object;",
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
.field public final synthetic g:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "LRi5<",
            "TT;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic h:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic i:LHi5;


# direct methods
.method public constructor <init>(LsP5;LsP5;LHi5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "+",
            "LRi5<",
            "TT;",
            "Ljava/lang/Object;",
            ">;>;",
            "LsP5<",
            "+TT;>;",
            "LHi5;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LQv4$a$b;->g:LsP5;

    iput-object p2, p0, LQv4$a$b;->h:LsP5;

    iput-object p3, p0, LQv4$a$b;->i:LHi5;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LQv4$a$b;->g:LsP5;

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, LQv4$a$b;->h:LsP5;

    iget-object v2, p0, LQv4$a$b;->i:LHi5;

    check-cast v0, LRi5;

    new-instance v3, LQv4$a$b$a;

    invoke-direct {v3, v2}, LQv4$a$b$a;-><init>(LHi5;)V

    invoke-interface {v1}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v3, v1}, LRi5;->a(LTi5;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
