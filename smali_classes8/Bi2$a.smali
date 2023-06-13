.class public final LBi2$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LBi2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LLj0;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LLj0;",
        "",
        "a",
        "(LLj0;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LBi2$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LBi2$a;

    invoke-direct {v0}, LBi2$a;-><init>()V

    sput-object v0, LBi2$a;->g:LBi2$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LLj0;)V
    .locals 8

    const-string v0, "$this$buildSerialDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "JsonPrimitive"

    sget-object v0, LBi2$a$a;->g:LBi2$a$a;

    invoke-static {v0}, LCi2;->a(Lkotlin/jvm/functions/Function0;)LMs5;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LLj0;->b(LLj0;Ljava/lang/String;LMs5;Ljava/util/List;ZILjava/lang/Object;)V

    const-string v2, "JsonNull"

    sget-object v0, LBi2$a$b;->g:LBi2$a$b;

    invoke-static {v0}, LCi2;->a(Lkotlin/jvm/functions/Function0;)LMs5;

    move-result-object v3

    invoke-static/range {v1 .. v7}, LLj0;->b(LLj0;Ljava/lang/String;LMs5;Ljava/util/List;ZILjava/lang/Object;)V

    const-string v2, "JsonLiteral"

    sget-object v0, LBi2$a$c;->g:LBi2$a$c;

    invoke-static {v0}, LCi2;->a(Lkotlin/jvm/functions/Function0;)LMs5;

    move-result-object v3

    invoke-static/range {v1 .. v7}, LLj0;->b(LLj0;Ljava/lang/String;LMs5;Ljava/util/List;ZILjava/lang/Object;)V

    const-string v2, "JsonObject"

    sget-object v0, LBi2$a$d;->g:LBi2$a$d;

    invoke-static {v0}, LCi2;->a(Lkotlin/jvm/functions/Function0;)LMs5;

    move-result-object v3

    invoke-static/range {v1 .. v7}, LLj0;->b(LLj0;Ljava/lang/String;LMs5;Ljava/util/List;ZILjava/lang/Object;)V

    const-string v2, "JsonArray"

    sget-object v0, LBi2$a$e;->g:LBi2$a$e;

    invoke-static {v0}, LCi2;->a(Lkotlin/jvm/functions/Function0;)LMs5;

    move-result-object v3

    invoke-static/range {v1 .. v7}, LLj0;->b(LLj0;Ljava/lang/String;LMs5;Ljava/util/List;ZILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LLj0;

    invoke-virtual {p0, p1}, LBi2$a;->a(LLj0;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
