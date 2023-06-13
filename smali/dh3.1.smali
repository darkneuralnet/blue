.class public final Ldh3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldh3$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\u0008B\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0008\u001a\u00020\u0004J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0002R\u001a\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u000c\u00a8\u0006\u0010"
    }
    d2 = {
        "Ldh3;",
        "",
        "LJm2;",
        "node",
        "",
        "c",
        "rootNode",
        "d",
        "a",
        "layoutNode",
        "b",
        "LLX2;",
        "LLX2;",
        "layoutNodes",
        "<init>",
        "()V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOnPositionedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n1#1,73:1\n1182#2:74\n1161#2,2:75\n728#3,2:77\n728#3,2:79\n492#3,11:81\n460#3,11:93\n163#4:92\n*S KotlinDebug\n*F\n+ 1 OnPositionedDispatcher.kt\nandroidx/compose/ui/node/OnPositionedDispatcher\n*L\n26#1:74\n26#1:75,2\n29#1:77,2\n35#1:79,2\n42#1:81,11\n56#1:93,11\n56#1:92\n*E\n"
    }
.end annotation


# static fields
.field public static final b:Ldh3$a;


# instance fields
.field public final a:LLX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LLX2<",
            "LJm2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldh3$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldh3$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ldh3;->b:Ldh3$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LLX2;

    const/16 v1, 0x10

    new-array v1, v1, [LJm2;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LLX2;-><init>([Ljava/lang/Object;I)V

    iput-object v0, p0, Ldh3;->a:LLX2;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Ldh3;->a:LLX2;

    sget-object v1, Ldh3$a$a;->b:Ldh3$a$a;

    invoke-virtual {v0, v1}, LLX2;->G(Ljava/util/Comparator;)V

    iget-object v0, p0, Ldh3;->a:LLX2;

    invoke-virtual {v0}, LLX2;->u()I

    move-result v1

    if-lez v1, :cond_2

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0}, LLX2;->s()[Ljava/lang/Object;

    move-result-object v0

    :cond_0
    aget-object v2, v0, v1

    check-cast v2, LJm2;

    invoke-virtual {v2}, LJm2;->l0()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0, v2}, Ldh3;->b(LJm2;)V

    :cond_1
    add-int/lit8 v1, v1, -0x1

    if-gez v1, :cond_0

    :cond_2
    iget-object v0, p0, Ldh3;->a:LLX2;

    invoke-virtual {v0}, LLX2;->h()V

    return-void
.end method

.method public final b(LJm2;)V
    .locals 3

    invoke-virtual {p1}, LJm2;->F()V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LJm2;->y1(Z)V

    invoke-virtual {p1}, LJm2;->w0()LLX2;

    move-result-object p1

    invoke-virtual {p1}, LLX2;->u()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {p1}, LLX2;->s()[Ljava/lang/Object;

    move-result-object p1

    :cond_0
    aget-object v2, p1, v0

    check-cast v2, LJm2;

    invoke-virtual {p0, v2}, Ldh3;->b(LJm2;)V

    add-int/lit8 v0, v0, 0x1

    if-lt v0, v1, :cond_0

    :cond_1
    return-void
.end method

.method public final c(LJm2;)V
    .locals 1

    const-string v0, "node"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldh3;->a:LLX2;

    invoke-virtual {v0, p1}, LLX2;->b(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LJm2;->y1(Z)V

    return-void
.end method

.method public final d(LJm2;)V
    .locals 1

    const-string v0, "rootNode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ldh3;->a:LLX2;

    invoke-virtual {v0}, LLX2;->h()V

    iget-object v0, p0, Ldh3;->a:LLX2;

    invoke-virtual {v0, p1}, LLX2;->b(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LJm2;->y1(Z)V

    return-void
.end method
