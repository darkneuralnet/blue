.class public LRe5$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly80;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LRe5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ly80<",
        "TR;",
        "Lio/reactivex/F<",
        "TR;>;>;"
    }
.end annotation


# instance fields
.field public final a:LMN4;

.field public final b:Ly80;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly80<",
            "TR;*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LMN4;Ly80;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMN4;",
            "Ly80<",
            "TR;*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRe5$e;->a:LMN4;

    iput-object p2, p0, LRe5$e;->b:Ly80;

    return-void
.end method

.method public static bridge synthetic c(LRe5$e;)LMN4;
    .locals 0

    iget-object p0, p0, LRe5$e;->a:LMN4;

    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, LRe5$e;->b:Ly80;

    invoke-interface {v0}, Ly80;->a()Ljava/lang/reflect/Type;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b(Lx80;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LRe5$e;->d(Lx80;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public d(Lx80;)Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx80<",
            "TR;>;)",
            "Lio/reactivex/F<",
            "TR;>;"
        }
    .end annotation

    iget-object v0, p0, LRe5$e;->b:Ly80;

    invoke-interface {v0, p1}, Ly80;->b(Lx80;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/reactivex/F;

    new-instance v1, LRe5$e$a;

    invoke-direct {v1, p0, p1}, LRe5$e$a;-><init>(LRe5$e;Lx80;)V

    invoke-virtual {v0, v1}, Lio/reactivex/F;->P(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method
