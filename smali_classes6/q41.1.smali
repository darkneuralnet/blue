.class public Lq41;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyy0;


# instance fields
.field public final b:LKk0;

.field public final c:Ls41;


# direct methods
.method public constructor <init>(LKk0;Ls41;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq41;->b:LKk0;

    iput-object p2, p0, Lq41;->c:Ls41;

    return-void
.end method


# virtual methods
.method public b()V
    .locals 3

    iget-object v0, p0, Lq41;->b:LKk0;

    iget-object v1, p0, Lq41;->c:Ls41;

    invoke-interface {v0, v1}, LKk0;->a(LYh3;)Lio/reactivex/Observable;

    move-result-object v0

    invoke-static {}, Lio/reactivex/internal/functions/a;->g()Lio/reactivex/functions/g;

    move-result-object v1

    invoke-static {}, Lio/reactivex/internal/functions/a;->g()Lio/reactivex/functions/g;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/g;Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method
