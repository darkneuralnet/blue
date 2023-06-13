.class public LnX2$a;
.super LB0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LnX2;->f()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LB0<",
        "LmX2$a<",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic d:Ljava/util/Iterator;

.field public final synthetic e:Ljava/util/Iterator;

.field public final synthetic f:LnX2;


# direct methods
.method public constructor <init>(LnX2;Ljava/util/Iterator;Ljava/util/Iterator;)V
    .locals 0

    iput-object p1, p0, LnX2$a;->f:LnX2;

    iput-object p2, p0, LnX2$a;->d:Ljava/util/Iterator;

    iput-object p3, p0, LnX2$a;->e:Ljava/util/Iterator;

    invoke-direct {p0}, LB0;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LnX2$a;->d()LmX2$a;

    move-result-object v0

    return-object v0
.end method

.method public d()LmX2$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LmX2$a<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LnX2$a;->d:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LnX2$a;->d:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LmX2$a;

    invoke-interface {v0}, LmX2$a;->getElement()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, LmX2$a;->getCount()I

    move-result v0

    iget-object v2, p0, LnX2$a;->f:LnX2;

    iget-object v2, v2, LnX2;->e:LmX2;

    invoke-interface {v2, v1}, LmX2;->d3(Ljava/lang/Object;)I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v1, v0}, LoX2;->g(Ljava/lang/Object;I)LmX2$a;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, LnX2$a;->e:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LnX2$a;->e:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LmX2$a;

    invoke-interface {v0}, LmX2$a;->getElement()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, LnX2$a;->f:LnX2;

    iget-object v2, v2, LnX2;->d:LmX2;

    invoke-interface {v2, v1}, LmX2;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v0}, LmX2$a;->getCount()I

    move-result v0

    invoke-static {v1, v0}, LoX2;->g(Ljava/lang/Object;I)LmX2$a;

    move-result-object v0

    return-object v0

    :cond_1
    invoke-virtual {p0}, LB0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LmX2$a;

    return-object v0
.end method
