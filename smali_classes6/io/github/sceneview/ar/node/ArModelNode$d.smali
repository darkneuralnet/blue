.class public final synthetic Lio/github/sceneview/ar/node/ArModelNode$d;
.super Lkotlin/jvm/internal/MutablePropertyReference0Impl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/github/sceneview/ar/node/ArModelNode;->o(LkW2;LP83;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 6

    const-class v2, Lio/github/sceneview/ar/node/ArModelNode;

    const-string v3, "position"

    const-string v4, "getPosition()Ldev/romainguy/kotlin/math/Float3;"

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/MutablePropertyReference0Impl;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    check-cast v0, Lio/github/sceneview/ar/node/ArModelNode;

    invoke-virtual {v0}, Lio/github/sceneview/node/Node;->X()Lhu1;

    move-result-object v0

    return-object v0
.end method

.method public set(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    check-cast v0, Lio/github/sceneview/ar/node/ArModelNode;

    check-cast p1, Lhu1;

    invoke-virtual {v0, p1}, Lio/github/sceneview/node/Node;->z0(Lhu1;)V

    return-void
.end method
