.class public final LGr5$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGr5;->a(LgV2;ZLrX2;Ly12;ZLCb5;Lkotlin/jvm/functions/Function0;)LgV2;
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
        "SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n*L\n1#1,170:1\n115#2,8:171\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:LrX2;

.field public final synthetic i:Ly12;

.field public final synthetic j:Z

.field public final synthetic k:LCb5;

.field public final synthetic l:Lkotlin/jvm/functions/Function0;


# direct methods
.method public constructor <init>(ZLrX2;Ly12;ZLCb5;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    iput-boolean p1, p0, LGr5$c;->g:Z

    iput-object p2, p0, LGr5$c;->h:LrX2;

    iput-object p3, p0, LGr5$c;->i:Ly12;

    iput-boolean p4, p0, LGr5$c;->j:Z

    iput-object p5, p0, LGr5$c;->k:LCb5;

    iput-object p6, p0, LGr5$c;->l:Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LS42;)V
    .locals 3

    const-string v0, "$this$null"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectable"

    invoke-virtual {p1, v0}, LS42;->b(Ljava/lang/String;)V

    invoke-virtual {p1}, LS42;->a()LGj6;

    move-result-object v0

    iget-boolean v1, p0, LGr5$c;->g:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "selected"

    invoke-virtual {v0, v2, v1}, LGj6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, LS42;->a()LGj6;

    move-result-object v0

    const-string v1, "interactionSource"

    iget-object v2, p0, LGr5$c;->h:LrX2;

    invoke-virtual {v0, v1, v2}, LGj6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, LS42;->a()LGj6;

    move-result-object v0

    const-string v1, "indication"

    iget-object v2, p0, LGr5$c;->i:Ly12;

    invoke-virtual {v0, v1, v2}, LGj6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, LS42;->a()LGj6;

    move-result-object v0

    iget-boolean v1, p0, LGr5$c;->j:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "enabled"

    invoke-virtual {v0, v2, v1}, LGj6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, LS42;->a()LGj6;

    move-result-object v0

    const-string v1, "role"

    iget-object v2, p0, LGr5$c;->k:LCb5;

    invoke-virtual {v0, v1, v2}, LGj6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, LS42;->a()LGj6;

    move-result-object p1

    const-string v0, "onClick"

    iget-object v1, p0, LGr5$c;->l:Lkotlin/jvm/functions/Function0;

    invoke-virtual {p1, v0, v1}, LGj6;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LS42;

    invoke-virtual {p0, p1}, LGr5$c;->a(LS42;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
