.class public final LNe$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LNe;->a(LzO2;Ljava/util/List;J)LyO2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LOU3$a;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LOU3$a;",
        "",
        "a",
        "(LOU3$a;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy$measure$3\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,780:1\n13579#2,2:781\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/AnimatedContentMeasurePolicy$measure$3\n*L\n748#1:781,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:[LOU3;

.field public final synthetic h:LNe;

.field public final synthetic i:I

.field public final synthetic j:I


# direct methods
.method public constructor <init>([LOU3;LNe;II)V
    .locals 0

    iput-object p1, p0, LNe$c;->g:[LOU3;

    iput-object p2, p0, LNe$c;->h:LNe;

    iput p3, p0, LNe$c;->i:I

    iput p4, p0, LNe$c;->j:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LOU3$a;)V
    .locals 14

    const-string v0, "$this$layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LNe$c;->g:[LOU3;

    iget-object v1, p0, LNe$c;->h:LNe;

    iget v2, p0, LNe$c;->i:I

    iget v3, p0, LNe$c;->j:I

    array-length v4, v0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_1

    aget-object v7, v0, v5

    if-eqz v7, :cond_0

    invoke-virtual {v1}, LNe;->f()LOe;

    move-result-object v6

    invoke-virtual {v6}, LOe;->f()LK9;

    move-result-object v8

    invoke-virtual {v7}, LOU3;->i1()I

    move-result v6

    invoke-virtual {v7}, LOU3;->d1()I

    move-result v9

    invoke-static {v6, v9}, LH52;->a(II)J

    move-result-wide v9

    invoke-static {v2, v3}, LH52;->a(II)J

    move-result-wide v11

    sget-object v13, Lpm2;->b:Lpm2;

    invoke-interface/range {v8 .. v13}, LK9;->a(JJLpm2;)J

    move-result-wide v8

    invoke-static {v8, v9}, LA52;->j(J)I

    move-result v10

    invoke-static {v8, v9}, LA52;->k(J)I

    move-result v9

    const/4 v11, 0x0

    const/4 v12, 0x4

    const/4 v13, 0x0

    move-object v6, p1

    move v8, v10

    move v10, v11

    move v11, v12

    move-object v12, v13

    invoke-static/range {v6 .. v12}, LOU3$a;->n(LOU3$a;LOU3;IIFILjava/lang/Object;)V

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LOU3$a;

    invoke-virtual {p0, p1}, LNe$c;->a(LOU3$a;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
