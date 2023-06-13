.class public LLk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKk0;


# instance fields
.field public final b:Ldi3;


# direct methods
.method public constructor <init>(Lio/reactivex/E;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ldi3;

    invoke-direct {v0}, Ldi3;-><init>()V

    iput-object v0, p0, LLk0;->b:Ldi3;

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, LLk0$a;

    invoke-direct {v1, p0, p1}, LLk0$a;-><init>(LLk0;Lio/reactivex/E;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method


# virtual methods
.method public a(LYh3;)Lio/reactivex/Observable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYh3<",
            "TT;>;)",
            "Lio/reactivex/Observable<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LLk0$b;

    invoke-direct {v0, p0, p1}, LLk0$b;-><init>(LLk0;LYh3;)V

    invoke-static {v0}, Lio/reactivex/Observable;->create(Lio/reactivex/z;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method
