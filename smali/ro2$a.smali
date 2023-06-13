.class public final Lro2$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpo2;
.implements LRn2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lro2;->a(LCo2;Lkotlin/jvm/functions/Function1;LEt0;I)Lpo2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:LRn2;

.field public final synthetic b:LsP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsP5<",
            "Lqo2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LsP5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LsP5<",
            "Lqo2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lro2$a;->b:LsP5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LSn2;->a(LsP5;)LRn2;

    move-result-object p1

    iput-object p1, p0, Lro2$a;->a:LRn2;

    return-void
.end method


# virtual methods
.method public a(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lro2$a;->a:LRn2;

    invoke-interface {v0, p1}, LRn2;->a(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lro2$a;->a:LRn2;

    invoke-interface {v0}, LRn2;->b()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public c(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lro2$a;->a:LRn2;

    invoke-interface {v0, p1}, LRn2;->c(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e()LMn2;
    .locals 1

    iget-object v0, p0, Lro2$a;->b:LsP5;

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqo2;

    invoke-virtual {v0}, Lqo2;->e()LMn2;

    move-result-object v0

    return-object v0
.end method

.method public f(ILEt0;I)V
    .locals 3

    const v0, -0xc23ba1d

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.foundation.lazy.rememberLazyListItemProvider.<anonymous>.<no name provided>.Item (LazyListItemProvider.kt:-1)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lro2$a;->a:LRn2;

    and-int/lit8 p3, p3, 0xe

    invoke-interface {v0, p1, p2, p3}, LRn2;->f(ILEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p2}, LEt0;->Q()V

    return-void
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lro2$a;->a:LRn2;

    invoke-interface {v0}, LRn2;->getItemCount()I

    move-result v0

    return v0
.end method

.method public h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lro2$a;->b:LsP5;

    invoke-interface {v0}, LsP5;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqo2;

    invoke-virtual {v0}, Lqo2;->h()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
