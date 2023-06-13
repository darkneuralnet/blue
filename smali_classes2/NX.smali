.class public final synthetic LNX;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:LDX;

.field public final synthetic c:Lbi3;

.field public final synthetic d:Lio/reactivex/p;


# direct methods
.method public synthetic constructor <init>(LDX;Lbi3;Lio/reactivex/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNX;->b:LDX;

    iput-object p2, p0, LNX;->c:Lbi3;

    iput-object p3, p0, LNX;->d:Lio/reactivex/p;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LNX;->b:LDX;

    iget-object v1, p0, LNX;->c:Lbi3;

    iget-object v2, p0, LNX;->d:Lio/reactivex/p;

    invoke-static {v0, v1, v2}, LTX;->a(LDX;Lbi3;Lio/reactivex/p;)V

    return-void
.end method
