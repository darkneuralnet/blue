.class public final LWv6$u;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWv6;->N(LYv6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/google/ar/core/ArCoreApk$Availability;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lcom/google/ar/core/ArCoreApk$Availability;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lcom/google/ar/core/ArCoreApk$Availability;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LWv6;


# direct methods
.method public constructor <init>(LWv6;)V
    .locals 0

    iput-object p1, p0, LWv6$u;->g:LWv6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/ar/core/ArCoreApk$Availability;)V
    .locals 2

    iget-object p1, p0, LWv6$u;->g:LWv6;

    new-instance v0, LRI4;

    invoke-static {p1}, LWv6;->access$getUserRequest$p(LWv6;)Z

    move-result v1

    invoke-direct {v0, v1}, LRI4;-><init>(Z)V

    invoke-virtual {p1, v0}, Lf1;->h(Ljava/lang/Object;)V

    iget-object p1, p0, LWv6$u;->g:LWv6;

    const/4 v0, 0x0

    invoke-static {p1, v0}, LWv6;->access$setUserRequest$p(LWv6;Z)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/ar/core/ArCoreApk$Availability;

    invoke-virtual {p0, p1}, LWv6$u;->a(Lcom/google/ar/core/ArCoreApk$Availability;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
