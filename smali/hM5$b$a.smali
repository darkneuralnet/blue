.class public final LhM5$b$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LhM5$b;->a(LzO2;Ljava/util/List;J)LyO2;
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
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:LOU3;

.field public final synthetic h:I

.field public final synthetic i:LOU3;

.field public final synthetic j:I

.field public final synthetic k:I


# direct methods
.method public constructor <init>(LOU3;ILOU3;II)V
    .locals 0

    iput-object p1, p0, LhM5$b$a;->g:LOU3;

    iput p2, p0, LhM5$b$a;->h:I

    iput-object p3, p0, LhM5$b$a;->i:LOU3;

    iput p4, p0, LhM5$b$a;->j:I

    iput p5, p0, LhM5$b$a;->k:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LOU3$a;)V
    .locals 8

    const-string v0, "$this$layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, LhM5$b$a;->g:LOU3;

    const/4 v3, 0x0

    iget v4, p0, LhM5$b$a;->h:I

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LOU3$a;->r(LOU3$a;LOU3;IIFILjava/lang/Object;)V

    iget-object v2, p0, LhM5$b$a;->i:LOU3;

    iget v3, p0, LhM5$b$a;->j:I

    iget v4, p0, LhM5$b$a;->k:I

    invoke-static/range {v1 .. v7}, LOU3$a;->r(LOU3$a;LOU3;IIFILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LOU3$a;

    invoke-virtual {p0, p1}, LhM5$b$a;->a(LOU3$a;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
