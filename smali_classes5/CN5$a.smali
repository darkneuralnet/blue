.class public LCN5$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIS0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LCN5;->j(LWU2$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LIS0$a<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:LWU2$a;

.field public final synthetic c:LCN5;


# direct methods
.method public constructor <init>(LCN5;LWU2$a;)V
    .locals 0

    iput-object p1, p0, LCN5$a;->c:LCN5;

    iput-object p2, p0, LCN5$a;->b:LWU2$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, LCN5$a;->c:LCN5;

    iget-object v1, p0, LCN5$a;->b:LWU2$a;

    invoke-virtual {v0, v1}, LCN5;->g(LWU2$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LCN5$a;->c:LCN5;

    iget-object v1, p0, LCN5$a;->b:LWU2$a;

    invoke-virtual {v0, v1, p1}, LCN5;->h(LWU2$a;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public d(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, LCN5$a;->c:LCN5;

    iget-object v1, p0, LCN5$a;->b:LWU2$a;

    invoke-virtual {v0, v1}, LCN5;->g(LWU2$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LCN5$a;->c:LCN5;

    iget-object v1, p0, LCN5$a;->b:LWU2$a;

    invoke-virtual {v0, v1, p1}, LCN5;->i(LWU2$a;Ljava/lang/Exception;)V

    :cond_0
    return-void
.end method
