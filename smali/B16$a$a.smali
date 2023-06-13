.class public final LB16$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LB16$a;->b(LgV2;LEt0;I)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LzO2;",
        "LvO2;",
        "Lkz0;",
        "LyO2;",
        ">;"
    }
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
.field public final synthetic g:LA16;


# direct methods
.method public constructor <init>(LA16;)V
    .locals 0

    iput-object p1, p0, LB16$a$a;->g:LA16;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LzO2;LvO2;J)LyO2;
    .locals 16

    move-object/from16 v0, p2

    const-string v1, "$this$layout"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "measurable"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LgV2;->b0:LgV2$a;

    const/4 v3, 0x3

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v5, v5, v3, v4}, LBB5;->h(LgV2;FFILjava/lang/Object;)LgV2;

    move-object/from16 v1, p0

    iget-object v3, v1, LB16$a$a;->g:LA16;

    invoke-virtual {v3}, LA16;->b()J

    move-result-wide v3

    invoke-static {v3, v4}, LG52;->g(J)I

    move-result v5

    invoke-static/range {p3 .. p4}, Lkz0;->p(J)I

    move-result v6

    invoke-static/range {p3 .. p4}, Lkz0;->n(J)I

    move-result v7

    invoke-static {v5, v6, v7}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v10

    const/4 v11, 0x0

    invoke-static {v3, v4}, LG52;->f(J)I

    move-result v3

    invoke-static/range {p3 .. p4}, Lkz0;->o(J)I

    move-result v4

    invoke-static/range {p3 .. p4}, Lkz0;->m(J)I

    move-result v5

    invoke-static {v3, v4, v5}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v12

    const/4 v13, 0x0

    const/16 v14, 0xa

    const/4 v15, 0x0

    move-wide/from16 v8, p3

    invoke-static/range {v8 .. v15}, Lkz0;->e(JIIIIILjava/lang/Object;)J

    move-result-wide v3

    invoke-interface {v0, v3, v4}, LvO2;->P0(J)LOU3;

    move-result-object v0

    invoke-virtual {v0}, LOU3;->i1()I

    move-result v3

    invoke-virtual {v0}, LOU3;->d1()I

    move-result v4

    const/4 v5, 0x0

    new-instance v6, LB16$a$a$a;

    invoke-direct {v6, v0}, LB16$a$a$a;-><init>(LOU3;)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    invoke-static/range {v2 .. v8}, LzO2;->Y(LzO2;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LyO2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LzO2;

    check-cast p2, LvO2;

    check-cast p3, Lkz0;

    invoke-virtual {p3}, Lkz0;->s()J

    move-result-wide v0

    invoke-virtual {p0, p1, p2, v0, v1}, LB16$a$a;->a(LzO2;LvO2;J)LyO2;

    move-result-object p1

    return-object p1
.end method
