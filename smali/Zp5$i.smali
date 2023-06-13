.class public final LZp5$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZp5;->j(LgV2;Laq5;LEy3;LDA3;ZZLcu1;LrX2;)LgV2;
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
        "SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt\n*L\n1#1,170:1\n147#2,9:171\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LEy3;

.field public final synthetic h:Laq5;

.field public final synthetic i:LDA3;

.field public final synthetic j:Z

.field public final synthetic k:Z

.field public final synthetic l:Lcu1;

.field public final synthetic m:LrX2;


# direct methods
.method public constructor <init>(LEy3;Laq5;LDA3;ZZLcu1;LrX2;)V
    .locals 0

    iput-object p1, p0, LZp5$i;->g:LEy3;

    iput-object p2, p0, LZp5$i;->h:Laq5;

    iput-object p3, p0, LZp5$i;->i:LDA3;

    iput-boolean p4, p0, LZp5$i;->j:Z

    iput-boolean p5, p0, LZp5$i;->k:Z

    iput-object p6, p0, LZp5$i;->l:Lcu1;

    iput-object p7, p0, LZp5$i;->m:LrX2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LS42;)V
    .locals 3

    const-string v0, "$this$null"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scrollable"

    invoke-virtual {p1, v0}, LS42;->b(Ljava/lang/String;)V

    invoke-virtual {p1}, LS42;->a()LGj6;

    move-result-object v0

    const-string v1, "orientation"

    iget-object v2, p0, LZp5$i;->g:LEy3;

    invoke-virtual {v0, v1, v2}, LGj6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, LS42;->a()LGj6;

    move-result-object v0

    const-string v1, "state"

    iget-object v2, p0, LZp5$i;->h:Laq5;

    invoke-virtual {v0, v1, v2}, LGj6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, LS42;->a()LGj6;

    move-result-object v0

    const-string v1, "overscrollEffect"

    iget-object v2, p0, LZp5$i;->i:LDA3;

    invoke-virtual {v0, v1, v2}, LGj6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, LS42;->a()LGj6;

    move-result-object v0

    iget-boolean v1, p0, LZp5$i;->j:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "enabled"

    invoke-virtual {v0, v2, v1}, LGj6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, LS42;->a()LGj6;

    move-result-object v0

    iget-boolean v1, p0, LZp5$i;->k:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "reverseDirection"

    invoke-virtual {v0, v2, v1}, LGj6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, LS42;->a()LGj6;

    move-result-object v0

    const-string v1, "flingBehavior"

    iget-object v2, p0, LZp5$i;->l:Lcu1;

    invoke-virtual {v0, v1, v2}, LGj6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, LS42;->a()LGj6;

    move-result-object p1

    const-string v0, "interactionSource"

    iget-object v1, p0, LZp5$i;->m:LrX2;

    invoke-virtual {p1, v0, v1}, LGj6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LS42;

    invoke-virtual {p0, p1}, LZp5$i;->a(LS42;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
