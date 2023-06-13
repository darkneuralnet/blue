.class public final LBi2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKj2;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LKj2<",
        "Lxi2;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c1\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0016R\u001a\u0010\u000f\u001a\u00020\u000b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0012"
    }
    d2 = {
        "LBi2;",
        "LKj2;",
        "Lxi2;",
        "Lrb1;",
        "encoder",
        "value",
        "",
        "b",
        "LGV0;",
        "decoder",
        "a",
        "LMs5;",
        "LMs5;",
        "getDescriptor",
        "()LMs5;",
        "descriptor",
        "<init>",
        "()V",
        "kotlinx-serialization-json"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/PublishedApi;
.end annotation


# static fields
.field public static final a:LBi2;

.field public static final b:LMs5;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, LBi2;

    invoke-direct {v0}, LBi2;-><init>()V

    sput-object v0, LBi2;->a:LBi2;

    sget-object v0, LOX3$b;->a:LOX3$b;

    const/4 v1, 0x0

    new-array v1, v1, [LMs5;

    sget-object v2, LBi2$a;->g:LBi2$a;

    const-string v3, "kotlinx.serialization.json.JsonElement"

    invoke-static {v3, v0, v1, v2}, LQs5;->b(Ljava/lang/String;LTs5;[LMs5;Lkotlin/jvm/functions/Function1;)LMs5;

    move-result-object v0

    sput-object v0, LBi2;->b:LMs5;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LGV0;)Lxi2;
    .locals 1

    const-string v0, "decoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LCi2;->d(LGV0;)Lsi2;

    move-result-object p1

    invoke-interface {p1}, Lsi2;->v()Lxi2;

    move-result-object p1

    return-object p1
.end method

.method public b(Lrb1;Lxi2;)V
    .locals 1

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LCi2;->c(Lrb1;)V

    instance-of v0, p2, LYi2;

    if-eqz v0, :cond_0

    sget-object v0, Lcj2;->a:Lcj2;

    invoke-interface {p1, v0, p2}, Lrb1;->B(Let5;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    instance-of v0, p2, LSi2;

    if-eqz v0, :cond_1

    sget-object v0, LVi2;->a:LVi2;

    invoke-interface {p1, v0, p2}, Lrb1;->B(Let5;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    instance-of v0, p2, Lei2;

    if-eqz v0, :cond_2

    sget-object v0, Lgi2;->a:Lgi2;

    invoke-interface {p1, v0, p2}, Lrb1;->B(Let5;Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public bridge synthetic deserialize(LGV0;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LBi2;->a(LGV0;)Lxi2;

    move-result-object p1

    return-object p1
.end method

.method public getDescriptor()LMs5;
    .locals 1

    sget-object v0, LBi2;->b:LMs5;

    return-object v0
.end method

.method public bridge synthetic serialize(Lrb1;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lxi2;

    invoke-virtual {p0, p1, p2}, LBi2;->b(Lrb1;Lxi2;)V

    return-void
.end method
