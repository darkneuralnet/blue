.class public final LQX3$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQX3$a;->b()LMs5;
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
        "\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0003\"\u0008\u0008\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "T",
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


# instance fields
.field public final synthetic g:LQX3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LQX3<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LQX3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LQX3<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, LQX3$a$a;->g:LQX3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LLj0;)V
    .locals 15

    move-object v0, p0

    move-object/from16 v8, p1

    const-string v1, "$this$buildSerialDescriptor"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "type"

    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    invoke-static {v1}, Lb40;->D(Lkotlin/jvm/internal/StringCompanionObject;)LKj2;

    move-result-object v1

    invoke-interface {v1}, LKj2;->getDescriptor()LMs5;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v7}, LLj0;->b(LLj0;Ljava/lang/String;LMs5;Ljava/util/List;ZILjava/lang/Object;)V

    const-string v2, "value"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "kotlinx.serialization.Polymorphic<"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, LQX3$a$a;->g:LQX3;

    invoke-virtual {v3}, LQX3;->e()Lkotlin/reflect/KClass;

    move-result-object v3

    invoke-interface {v3}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x3e

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    sget-object v10, LTs5$a;->a:LTs5$a;

    const/4 v1, 0x0

    new-array v11, v1, [LMs5;

    const/4 v12, 0x0

    const/16 v13, 0x8

    const/4 v14, 0x0

    invoke-static/range {v9 .. v14}, LQs5;->c(Ljava/lang/String;LTs5;[LMs5;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)LMs5;

    move-result-object v3

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v7}, LLj0;->b(LLj0;Ljava/lang/String;LMs5;Ljava/util/List;ZILjava/lang/Object;)V

    iget-object v1, v0, LQX3$a$a;->g:LQX3;

    invoke-static {v1}, LQX3;->f(LQX3;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v8, v1}, LLj0;->h(Ljava/util/List;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LLj0;

    invoke-virtual {p0, p1}, LQX3$a$a;->a(LLj0;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
