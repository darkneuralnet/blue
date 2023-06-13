.class public final LWh0;
.super LC24;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LC24<",
        "Ljava/lang/Character;",
        "[C",
        "LTh0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0002\u0018\u0002\n\u0002\u0010\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c1\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000c\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0014J\u000c\u0010\u0008\u001a\u00020\u0005*\u00020\u0002H\u0014J\u0008\u0010\t\u001a\u00020\u0002H\u0014J(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0014J \u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0014\u00a8\u0006\u0019"
    }
    d2 = {
        "LWh0;",
        "LKj2;",
        "",
        "LC24;",
        "",
        "LTh0;",
        "",
        "v",
        "y",
        "w",
        "LTt0;",
        "decoder",
        "index",
        "builder",
        "",
        "checkIndex",
        "",
        "x",
        "LUt0;",
        "encoder",
        "content",
        "size",
        "z",
        "<init>",
        "()V",
        "kotlinx-serialization-core"
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
.field public static final c:LWh0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LWh0;

    invoke-direct {v0}, LWh0;-><init>()V

    sput-object v0, LWh0;->c:LWh0;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    sget-object v0, Lkotlin/jvm/internal/CharCompanionObject;->INSTANCE:Lkotlin/jvm/internal/CharCompanionObject;

    invoke-static {v0}, Lb40;->x(Lkotlin/jvm/internal/CharCompanionObject;)LKj2;

    move-result-object v0

    invoke-direct {p0, v0}, LC24;-><init>(LKj2;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, [C

    invoke-virtual {p0, p1}, LWh0;->v([C)I

    move-result p1

    return p1
.end method

.method public bridge synthetic h(LTt0;ILjava/lang/Object;Z)V
    .locals 0

    check-cast p3, LTh0;

    invoke-virtual {p0, p1, p2, p3, p4}, LWh0;->x(LTt0;ILTh0;Z)V

    return-void
.end method

.method public bridge synthetic k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [C

    invoke-virtual {p0, p1}, LWh0;->y([C)LTh0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic r()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LWh0;->w()[C

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic u(LUt0;Ljava/lang/Object;I)V
    .locals 0

    check-cast p2, [C

    invoke-virtual {p0, p1, p2, p3}, LWh0;->z(LUt0;[CI)V

    return-void
.end method

.method public v([C)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p1, p1

    return p1
.end method

.method public w()[C
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [C

    return-object v0
.end method

.method public x(LTt0;ILTh0;Z)V
    .locals 0

    const-string p4, "decoder"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "builder"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LC24;->getDescriptor()LMs5;

    move-result-object p4

    invoke-interface {p1, p4, p2}, LTt0;->u(LMs5;I)C

    move-result p1

    invoke-virtual {p3, p1}, LTh0;->e(C)V

    return-void
.end method

.method public y([C)LTh0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LTh0;

    invoke-direct {v0, p1}, LTh0;-><init>([C)V

    return-object v0
.end method

.method public z(LUt0;[CI)V
    .locals 3

    const-string v0, "encoder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_0

    invoke-virtual {p0}, LC24;->getDescriptor()LMs5;

    move-result-object v1

    aget-char v2, p2, v0

    invoke-interface {p1, v1, v0, v2}, LUt0;->o(LMs5;IC)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
