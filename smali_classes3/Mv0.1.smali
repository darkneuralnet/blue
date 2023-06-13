.class public final LMv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LKv0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LPv0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static b()LKv0;
    .locals 1

    new-instance v0, LKv0;

    invoke-direct {v0}, LKv0;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()LKv0;
    .locals 2

    invoke-static {}, LMv0;->b()LKv0;

    move-result-object v0

    iget-object v1, p0, LMv0;->a:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LPv0;

    invoke-static {v0, v1}, LNv0;->a(LKv0;LPv0;)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LMv0;->a()LKv0;

    move-result-object v0

    return-object v0
.end method
