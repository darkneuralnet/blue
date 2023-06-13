.class public final synthetic LSX;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Lbi3;

.field public final synthetic c:LDX;

.field public final synthetic d:Lio/reactivex/Observable;


# direct methods
.method public synthetic constructor <init>(Lbi3;LDX;Lio/reactivex/Observable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSX;->b:Lbi3;

    iput-object p2, p0, LSX;->c:LDX;

    iput-object p3, p0, LSX;->d:Lio/reactivex/Observable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LSX;->b:Lbi3;

    iget-object v1, p0, LSX;->c:LDX;

    iget-object v2, p0, LSX;->d:Lio/reactivex/Observable;

    invoke-static {v0, v1, v2}, LTX;->h(Lbi3;LDX;Lio/reactivex/Observable;)V

    return-void
.end method
