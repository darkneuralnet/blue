.class public final Lu86$e$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu86$e;->invoke(Lkotlin/Unit;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lw86;",
        "Lw86;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lw86;",
        "state",
        "a",
        "(Lw86;)Lw86;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Lu86$e$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu86$e$a;

    invoke-direct {v0}, Lu86$e$a;-><init>()V

    sput-object v0, Lu86$e$a;->g:Lu86$e$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lw86;)Lw86;
    .locals 3

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcl0;

    invoke-interface {p1}, Lw86;->getFilters()Ljava/util/List;

    move-result-object v1

    invoke-interface {p1}, Lw86;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {p1}, Lw86;->getLoading()Z

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Lcl0;-><init>(Ljava/util/List;Ljava/util/List;Z)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lw86;

    invoke-virtual {p0, p1}, Lu86$e$a;->a(Lw86;)Lw86;

    move-result-object p1

    return-object p1
.end method
