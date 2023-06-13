.class public final Lf10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le10;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0017\u00a8\u0006\u0008"
    }
    d2 = {
        "Lf10;",
        "Le10;",
        "LgV2;",
        "LK9;",
        "alignment",
        "c",
        "<init>",
        "()V",
        "foundation-layout_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxScopeInstance\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,287:1\n135#2:288\n135#2:289\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxScopeInstance\n*L\n243#1:288\n255#1:289\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lf10;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf10;

    invoke-direct {v0}, Lf10;-><init>()V

    sput-object v0, Lf10;->a:Lf10;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(LgV2;LK9;)LgV2;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alignment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lc10;

    invoke-static {}, LK32;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lf10$a;

    invoke-direct {v1, p2}, Lf10$a;-><init>(LK9;)V

    goto :goto_0

    :cond_0
    invoke-static {}, LK32;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    :goto_0
    const/4 v2, 0x0

    invoke-direct {v0, p2, v2, v1}, Lc10;-><init>(LK9;ZLkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v0}, LgV2;->t0(LgV2;)LgV2;

    move-result-object p1

    return-object p1
.end method
