.class public final LdH4$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LdH4;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/google/android/gms/maps/model/PolylineOptions;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lcom/google/android/gms/maps/model/PolylineOptions;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lcom/google/android/gms/maps/model/PolylineOptions;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LdH4;


# direct methods
.method public constructor <init>(LdH4;)V
    .locals 0

    iput-object p1, p0, LdH4$e;->g:LdH4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/maps/model/PolylineOptions;)V
    .locals 3

    iget-object v0, p0, LdH4$e;->g:LdH4;

    invoke-static {v0}, LdH4;->access$getDrawnPolylines$p(LdH4;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, LdH4$e;->g:LdH4;

    invoke-static {v1}, LdH4;->access$getMapUi$p(LdH4;)LOG4;

    move-result-object v1

    const-string v2, "it"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, p1}, LOG4;->E1(Lcom/google/android/gms/maps/model/PolylineOptions;)LMX3;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-virtual {p0, p1}, LdH4$e;->a(Lcom/google/android/gms/maps/model/PolylineOptions;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
