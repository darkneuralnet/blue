.class public LLk0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLk0;->a(LYh3;)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/z<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:LYh3;

.field public final synthetic c:LLk0;


# direct methods
.method public constructor <init>(LLk0;LYh3;)V
    .locals 0

    iput-object p1, p0, LLk0$b;->c:LLk0;

    iput-object p2, p0, LLk0$b;->b:LYh3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public subscribe(Lio/reactivex/y;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/y<",
            "TT;>;)V"
        }
    .end annotation

    new-instance v0, LYi1;

    iget-object v1, p0, LLk0$b;->b:LYh3;

    invoke-direct {v0, v1, p1}, LYi1;-><init>(LYh3;Lio/reactivex/y;)V

    new-instance v1, LLk0$b$a;

    invoke-direct {v1, p0, v0}, LLk0$b$a;-><init>(LLk0$b;LYi1;)V

    invoke-static {v1}, Lio/reactivex/disposables/d;->c(Lio/reactivex/functions/a;)Lio/reactivex/disposables/c;

    move-result-object v1

    invoke-interface {p1, v1}, Lio/reactivex/y;->b(Lio/reactivex/disposables/c;)V

    iget-object p1, p0, LLk0$b;->b:LYh3;

    invoke-static {p1}, LOx2;->o(LYh3;)V

    iget-object p1, p0, LLk0$b;->c:LLk0;

    iget-object p1, p1, LLk0;->b:Ldi3;

    invoke-virtual {p1, v0}, Ldi3;->a(LYi1;)V

    return-void
.end method
