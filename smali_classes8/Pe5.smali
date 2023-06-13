.class public final LPe5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly80;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ly80<",
        "TR;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/reflect/Type;

.field public final b:Lio/reactivex/E;

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Z


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Type;Lio/reactivex/E;ZZZZZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LPe5;->a:Ljava/lang/reflect/Type;

    iput-object p2, p0, LPe5;->b:Lio/reactivex/E;

    iput-boolean p3, p0, LPe5;->c:Z

    iput-boolean p4, p0, LPe5;->d:Z

    iput-boolean p5, p0, LPe5;->e:Z

    iput-boolean p6, p0, LPe5;->f:Z

    iput-boolean p7, p0, LPe5;->g:Z

    iput-boolean p8, p0, LPe5;->h:Z

    iput-boolean p9, p0, LPe5;->i:Z

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/reflect/Type;
    .locals 1

    iget-object v0, p0, LPe5;->a:Ljava/lang/reflect/Type;

    return-object v0
.end method

.method public b(Lx80;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx80<",
            "TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-boolean v0, p0, LPe5;->c:Z

    if-eqz v0, :cond_0

    new-instance v0, Lz80;

    invoke-direct {v0, p1}, Lz80;-><init>(Lx80;)V

    goto :goto_0

    :cond_0
    new-instance v0, LA80;

    invoke-direct {v0, p1}, LA80;-><init>(Lx80;)V

    :goto_0
    iget-boolean p1, p0, LPe5;->d:Z

    if-eqz p1, :cond_1

    new-instance p1, LeN4;

    invoke-direct {p1, v0}, LeN4;-><init>(Lio/reactivex/Observable;)V

    :goto_1
    move-object v0, p1

    goto :goto_2

    :cond_1
    iget-boolean p1, p0, LPe5;->e:Z

    if-eqz p1, :cond_2

    new-instance p1, LRY;

    invoke-direct {p1, v0}, LRY;-><init>(Lio/reactivex/Observable;)V

    goto :goto_1

    :cond_2
    :goto_2
    iget-object p1, p0, LPe5;->b:Lio/reactivex/E;

    if-eqz p1, :cond_3

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->subscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    :cond_3
    iget-boolean p1, p0, LPe5;->f:Z

    if-eqz p1, :cond_4

    sget-object p1, Lio/reactivex/b;->f:Lio/reactivex/b;

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->toFlowable(Lio/reactivex/b;)Lio/reactivex/k;

    move-result-object p1

    return-object p1

    :cond_4
    iget-boolean p1, p0, LPe5;->g:Z

    if-eqz p1, :cond_5

    invoke-virtual {v0}, Lio/reactivex/Observable;->singleOrError()Lio/reactivex/F;

    move-result-object p1

    return-object p1

    :cond_5
    iget-boolean p1, p0, LPe5;->h:Z

    if-eqz p1, :cond_6

    invoke-virtual {v0}, Lio/reactivex/Observable;->singleElement()Lio/reactivex/p;

    move-result-object p1

    return-object p1

    :cond_6
    iget-boolean p1, p0, LPe5;->i:Z

    if-eqz p1, :cond_7

    invoke-virtual {v0}, Lio/reactivex/Observable;->ignoreElements()Lio/reactivex/c;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {v0}, Lio/reactivex/plugins/a;->o(Lio/reactivex/Observable;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
