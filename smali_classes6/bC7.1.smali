.class public final LbC7;
.super LTw7;
.source "SourceFile"


# instance fields
.field public final synthetic a:LcD1$m;


# direct methods
.method public constructor <init>(LcD1;LcD1$m;)V
    .locals 0

    iput-object p2, p0, LbC7;->a:LcD1$m;

    invoke-direct {p0}, LTw7;-><init>()V

    return-void
.end method


# virtual methods
.method public final C4(LEw9;)V
    .locals 2

    iget-object v0, p0, LbC7;->a:LcD1$m;

    new-instance v1, LfM2;

    invoke-direct {v1, p1}, LfM2;-><init>(LEw9;)V

    invoke-interface {v0, v1}, LcD1$m;->onMarkerDragStart(LfM2;)V

    return-void
.end method

.method public final a(LEw9;)V
    .locals 2

    iget-object v0, p0, LbC7;->a:LcD1$m;

    new-instance v1, LfM2;

    invoke-direct {v1, p1}, LfM2;-><init>(LEw9;)V

    invoke-interface {v0, v1}, LcD1$m;->onMarkerDrag(LfM2;)V

    return-void
.end method

.method public final r(LEw9;)V
    .locals 2

    iget-object v0, p0, LbC7;->a:LcD1$m;

    new-instance v1, LfM2;

    invoke-direct {v1, p1}, LfM2;-><init>(LEw9;)V

    invoke-interface {v0, v1}, LcD1$m;->onMarkerDragEnd(LfM2;)V

    return-void
.end method
