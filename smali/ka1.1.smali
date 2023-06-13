.class public final Lka1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001aG\u0010\u0007\u001a\u00020\u0006*\u000c\u0012\u0004\u0012\u00020\u0001\u0012\u0002\u0008\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0080@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\"\u001d\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00010\t8\u0002X\u0082\u0004\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\"\u001d\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00010\t8\u0002X\u0082\u0004\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000b\"\u001d\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00010\t8\u0002X\u0082\u0004\u00f8\u0001\u0001\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u000b\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0011"
    }
    d2 = {
        "Lne;",
        "Lk61;",
        "target",
        "Ld62;",
        "from",
        "to",
        "",
        "d",
        "(Lne;FLd62;Ld62;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Ltb6;",
        "a",
        "Ltb6;",
        "DefaultIncomingSpec",
        "b",
        "DefaultOutgoingSpec",
        "c",
        "HoveredOutgoingSpec",
        "material_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Ltb6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltb6<",
            "Lk61;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Ltb6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltb6<",
            "Lk61;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Ltb6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ltb6<",
            "Lk61;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 19

    new-instance v6, Ltb6;

    const/16 v1, 0x78

    const/4 v2, 0x0

    invoke-static {}, Li91;->b()Lh91;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ltb6;-><init>(IILh91;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v6, Lka1;->a:Ltb6;

    new-instance v0, Ltb6;

    const/16 v8, 0x96

    const/4 v9, 0x0

    new-instance v10, LUE0;

    const v1, 0x3ecccccd    # 0.4f

    const/4 v2, 0x0

    const v3, 0x3f19999a    # 0.6f

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {v10, v1, v2, v3, v4}, LUE0;-><init>(FFFF)V

    const/4 v11, 0x2

    const/4 v12, 0x0

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Ltb6;-><init>(IILh91;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lka1;->b:Ltb6;

    new-instance v0, Ltb6;

    const/16 v14, 0x78

    const/4 v15, 0x0

    new-instance v5, LUE0;

    invoke-direct {v5, v1, v2, v3, v4}, LUE0;-><init>(FFFF)V

    const/16 v17, 0x2

    const/16 v18, 0x0

    move-object v13, v0

    move-object/from16 v16, v5

    invoke-direct/range {v13 .. v18}, Ltb6;-><init>(IILh91;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lka1;->c:Ltb6;

    return-void
.end method

.method public static final synthetic a()Ltb6;
    .locals 1

    sget-object v0, Lka1;->a:Ltb6;

    return-object v0
.end method

.method public static final synthetic b()Ltb6;
    .locals 1

    sget-object v0, Lka1;->b:Ltb6;

    return-object v0
.end method

.method public static final synthetic c()Ltb6;
    .locals 1

    sget-object v0, Lka1;->c:Ltb6;

    return-object v0
.end method

.method public static final d(Lne;FLd62;Ld62;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lne<",
            "Lk61;",
            "*>;F",
            "Ld62;",
            "Ld62;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-eqz p3, :cond_0

    sget-object p2, Lja1;->a:Lja1;

    invoke-virtual {p2, p3}, Lja1;->a(Ld62;)Llf;

    move-result-object p2

    :goto_0
    move-object v2, p2

    goto :goto_1

    :cond_0
    if-eqz p2, :cond_1

    sget-object p3, Lja1;->a:Lja1;

    invoke-virtual {p3, p2}, Lja1;->b(Ld62;)Llf;

    move-result-object p2

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    goto :goto_0

    :goto_1
    if-eqz v2, :cond_3

    invoke-static {p1}, Lk61;->d(F)Lk61;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    move-object v0, p0

    move-object v5, p4

    invoke-static/range {v0 .. v7}, Lne;->f(Lne;Ljava/lang/Object;Llf;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_2

    return-object p0

    :cond_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    :cond_3
    invoke-static {p1}, Lk61;->d(F)Lk61;

    move-result-object p1

    invoke-virtual {p0, p1, p4}, Lne;->u(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_4

    return-object p0

    :cond_4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
