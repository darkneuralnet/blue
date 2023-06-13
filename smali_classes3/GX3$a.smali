.class public final LGX3$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGX3;->a(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Lco/bird/android/model/Polygon;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/fasterxml/jackson/databind/JsonNode;",
        "Lco/bird/android/model/LinearRing;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lcom/fasterxml/jackson/databind/JsonNode;",
        "kotlin.jvm.PlatformType",
        "ringNode",
        "Lco/bird/android/model/LinearRing;",
        "a",
        "(Lcom/fasterxml/jackson/databind/JsonNode;)Lco/bird/android/model/LinearRing;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lcom/fasterxml/jackson/core/JsonParser;

.field public final synthetic h:Lcom/fasterxml/jackson/databind/DeserializationContext;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)V
    .locals 0

    iput-object p1, p0, LGX3$a;->g:Lcom/fasterxml/jackson/core/JsonParser;

    iput-object p2, p0, LGX3$a;->h:Lcom/fasterxml/jackson/databind/DeserializationContext;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/fasterxml/jackson/databind/JsonNode;)Lco/bird/android/model/LinearRing;
    .locals 3

    iget-object v0, p0, LGX3$a;->g:Lcom/fasterxml/jackson/core/JsonParser;

    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonParser;->getCodec()Lcom/fasterxml/jackson/core/ObjectCodec;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/fasterxml/jackson/core/TreeNode;->traverse(Lcom/fasterxml/jackson/core/ObjectCodec;)Lcom/fasterxml/jackson/core/JsonParser;

    move-result-object p1

    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/JsonParser;->nextToken()Lcom/fasterxml/jackson/core/JsonToken;

    new-instance v0, Lco/bird/android/model/LinearRing;

    iget-object v1, p0, LGX3$a;->h:Lcom/fasterxml/jackson/databind/DeserializationContext;

    const-class v2, [Lco/bird/android/model/Point;

    invoke-virtual {v1, p1, v2}, Lcom/fasterxml/jackson/databind/DeserializationContext;->readValue(Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Lco/bird/android/model/Point;

    invoke-direct {v0, p1}, Lco/bird/android/model/LinearRing;-><init>([Lco/bird/android/model/Point;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/fasterxml/jackson/databind/JsonNode;

    invoke-virtual {p0, p1}, LGX3$a;->a(Lcom/fasterxml/jackson/databind/JsonNode;)Lco/bird/android/model/LinearRing;

    move-result-object p1

    return-object p1
.end method
