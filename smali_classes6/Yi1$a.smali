.class public LYi1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYi1;->b(Lfd4;Lio/reactivex/E;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lfd4;

.field public final synthetic c:Lio/reactivex/E;

.field public final synthetic d:LYi1;


# direct methods
.method public constructor <init>(LYi1;Lfd4;Lio/reactivex/E;)V
    .locals 0

    iput-object p1, p0, LYi1$a;->d:LYi1;

    iput-object p2, p0, LYi1$a;->b:Lfd4;

    iput-object p3, p0, LYi1$a;->c:Lio/reactivex/E;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, LYi1$a;->d:LYi1;

    iget-object v0, v0, LYi1;->c:LYh3;

    iget-object v1, p0, LYi1$a;->b:Lfd4;

    invoke-interface {v0, v1}, LYh3;->y0(Ldd4;)Lio/reactivex/Observable;

    move-result-object v0

    iget-object v1, p0, LYi1$a;->c:Lio/reactivex/E;

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->unsubscribeOn(Lio/reactivex/E;)Lio/reactivex/Observable;

    move-result-object v0

    new-instance v1, LYi1$a$a;

    invoke-direct {v1, p0}, LYi1$a$a;-><init>(LYi1$a;)V

    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/D;)V

    return-void
.end method
