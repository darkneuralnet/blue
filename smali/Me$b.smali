.class public final LMe$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LMe;->a(LF96;LgV2;Lkotlin/jvm/functions/Function1;LK9;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;LEt0;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LOe<",
        "TS;>;",
        "LHA0;",
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


# static fields
.field public static final g:LMe$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LMe$b;

    invoke-direct {v0}, LMe$b;-><init>()V

    sput-object v0, LMe$b;->g:LMe$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LOe;)LHA0;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LOe<",
            "TS;>;)",
            "LHA0;"
        }
    .end annotation

    const-string v0, "$this$null"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p1, 0xdc

    const/16 v0, 0x5a

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-static {p1, v0, v1, v2, v1}, Lmf;->k(IILh91;ILjava/lang/Object;)Ltb6;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-static {v3, v4, v5, v1}, LYe1;->t(Ltm1;FILjava/lang/Object;)LZe1;

    move-result-object v3

    invoke-static {p1, v0, v1, v2, v1}, Lmf;->k(IILh91;ILjava/lang/Object;)Ltb6;

    move-result-object v6

    const v7, 0x3f6b851f    # 0.92f

    const-wide/16 v8, 0x0

    const/4 v10, 0x4

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, LYe1;->x(Ltm1;FJILjava/lang/Object;)LZe1;

    move-result-object p1

    invoke-virtual {v3, p1}, LZe1;->c(LZe1;)LZe1;

    move-result-object p1

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-static {v0, v2, v1, v3, v1}, Lmf;->k(IILh91;ILjava/lang/Object;)Ltb6;

    move-result-object v0

    invoke-static {v0, v4, v5, v1}, LYe1;->v(Ltm1;FILjava/lang/Object;)Lgi1;

    move-result-object v0

    invoke-static {p1, v0}, LMe;->d(LZe1;Lgi1;)LHA0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LOe;

    invoke-virtual {p0, p1}, LMe$b;->a(LOe;)LHA0;

    move-result-object p1

    return-object p1
.end method
