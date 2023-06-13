.class public final Lmd6;
.super LC24;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LC24<",
        "Lkotlin/UShort;",
        "Lkotlin/UShortArray;",
        "Lld6;",
        ">;"
    }
.end annotation

.annotation build Lkotlin/ExperimentalUnsignedTypes;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u00c1\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0019\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0014\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\t\u001a\u00020\u0005*\u00020\u0002H\u0014\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u0002H\u0014\u00f8\u0001\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0014J-\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0006H\u0014\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u00f8\u0001\u0001\u0082\u0002\u000f\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\n\u0002\u0008!\u00a8\u0006\u001d"
    }
    d2 = {
        "Lmd6;",
        "LKj2;",
        "Lkotlin/UShortArray;",
        "LC24;",
        "Lkotlin/UShort;",
        "Lld6;",
        "",
        "v",
        "([S)I",
        "y",
        "([S)Lld6;",
        "w",
        "()[S",
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
        "(LUt0;[SI)V",
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
.field public static final c:Lmd6;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmd6;

    invoke-direct {v0}, Lmd6;-><init>()V

    sput-object v0, Lmd6;->c:Lmd6;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    sget-object v0, Lkotlin/UShort;->Companion:Lkotlin/UShort$Companion;

    invoke-static {v0}, Lb40;->t(Lkotlin/UShort$Companion;)LKj2;

    move-result-object v0

    invoke-direct {p0, v0}, LC24;-><init>(LKj2;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lkotlin/UShortArray;

    invoke-virtual {p1}, Lkotlin/UShortArray;->unbox-impl()[S

    move-result-object p1

    invoke-virtual {p0, p1}, Lmd6;->v([S)I

    move-result p1

    return p1
.end method

.method public bridge synthetic h(LTt0;ILjava/lang/Object;Z)V
    .locals 0

    check-cast p3, Lld6;

    invoke-virtual {p0, p1, p2, p3, p4}, Lmd6;->x(LTt0;ILld6;Z)V

    return-void
.end method

.method public bridge synthetic k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/UShortArray;

    invoke-virtual {p1}, Lkotlin/UShortArray;->unbox-impl()[S

    move-result-object p1

    invoke-virtual {p0, p1}, Lmd6;->y([S)Lld6;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic r()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lmd6;->w()[S

    move-result-object v0

    invoke-static {v0}, Lkotlin/UShortArray;->box-impl([S)Lkotlin/UShortArray;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic u(LUt0;Ljava/lang/Object;I)V
    .locals 0

    check-cast p2, Lkotlin/UShortArray;

    invoke-virtual {p2}, Lkotlin/UShortArray;->unbox-impl()[S

    move-result-object p2

    invoke-virtual {p0, p1, p2, p3}, Lmd6;->z(LUt0;[SI)V

    return-void
.end method

.method public v([S)I
    .locals 1

    const-string v0, "$this$collectionSize"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/UShortArray;->getSize-impl([S)I

    move-result p1

    return p1
.end method

.method public w()[S
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lkotlin/UShortArray;->constructor-impl(I)[S

    move-result-object v0

    return-object v0
.end method

.method public x(LTt0;ILld6;Z)V
    .locals 0

    const-string p4, "decoder"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "builder"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LC24;->getDescriptor()LMs5;

    move-result-object p4

    invoke-interface {p1, p4, p2}, LTt0;->r(LMs5;I)LGV0;

    move-result-object p1

    invoke-interface {p1}, LGV0;->l()S

    move-result p1

    invoke-static {p1}, Lkotlin/UShort;->constructor-impl(S)S

    move-result p1

    invoke-virtual {p3, p1}, Lld6;->e(S)V

    return-void
.end method

.method public y([S)Lld6;
    .locals 2

    const-string v0, "$this$toBuilder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lld6;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lld6;-><init>([SLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public z(LUt0;[SI)V
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

    invoke-interface {p1, v1, v0}, LUt0;->F(LMs5;I)Lrb1;

    move-result-object v1

    invoke-static {p2, v0}, Lkotlin/UShortArray;->get-Mh2AYeg([SI)S

    move-result v2

    invoke-interface {v1, v2}, Lrb1;->k(S)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
