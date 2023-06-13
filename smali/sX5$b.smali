.class public final LsX5$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LsX5;->h(LgV2;LtX5;Ljava/util/Set;Leb;Lkotlin/jvm/functions/Function2;)LgV2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LS42;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LS42;",
        "",
        "a",
        "(LS42;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 SwipeableV2.kt\nandroidx/compose/material/SwipeableV2Kt\n*L\n1#1,170:1\n128#2,6:171\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LtX5;

.field public final synthetic h:Ljava/util/Set;

.field public final synthetic i:Leb;

.field public final synthetic j:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(LtX5;Ljava/util/Set;Leb;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    iput-object p1, p0, LsX5$b;->g:LtX5;

    iput-object p2, p0, LsX5$b;->h:Ljava/util/Set;

    iput-object p3, p0, LsX5$b;->i:Leb;

    iput-object p4, p0, LsX5$b;->j:Lkotlin/jvm/functions/Function2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LS42;)V
    .locals 3

    const-string v0, "$this$null"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "swipeAnchors"

    invoke-virtual {p1, v0}, LS42;->b(Ljava/lang/String;)V

    invoke-virtual {p1}, LS42;->a()LGj6;

    move-result-object v0

    const-string v1, "state"

    iget-object v2, p0, LsX5$b;->g:LtX5;

    invoke-virtual {v0, v1, v2}, LGj6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, LS42;->a()LGj6;

    move-result-object v0

    const-string v1, "possibleValues"

    iget-object v2, p0, LsX5$b;->h:Ljava/util/Set;

    invoke-virtual {v0, v1, v2}, LGj6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, LS42;->a()LGj6;

    move-result-object v0

    const-string v1, "anchorChangeHandler"

    iget-object v2, p0, LsX5$b;->i:Leb;

    invoke-virtual {v0, v1, v2}, LGj6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, LS42;->a()LGj6;

    move-result-object p1

    const-string v0, "calculateAnchor"

    iget-object v1, p0, LsX5$b;->j:Lkotlin/jvm/functions/Function2;

    invoke-virtual {p1, v0, v1}, LGj6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LS42;

    invoke-virtual {p0, p1}, LsX5$b;->a(LS42;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
