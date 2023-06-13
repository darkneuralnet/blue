.class public final LA12;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\u0007\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "LgV2;",
        "Le62;",
        "interactionSource",
        "Ly12;",
        "indication",
        "b",
        "LU94;",
        "a",
        "LU94;",
        "()LU94;",
        "LocalIndication",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nIndication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,186:1\n135#2:187\n*S KotlinDebug\n*F\n+ 1 Indication.kt\nandroidx/compose/foundation/IndicationKt\n*L\n115#1:187\n*E\n"
    }
.end annotation


# static fields
.field public static final a:LU94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LU94<",
            "Ly12;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, LA12$a;->g:LA12$a;

    invoke-static {v0}, Lgu0;->d(Lkotlin/jvm/functions/Function0;)LU94;

    move-result-object v0

    sput-object v0, LA12;->a:LU94;

    return-void
.end method

.method public static final a()LU94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LU94<",
            "Ly12;",
            ">;"
        }
    .end annotation

    sget-object v0, LA12;->a:LU94;

    return-object v0
.end method

.method public static final b(LgV2;Le62;Ly12;)LgV2;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interactionSource"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LK32;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LA12$b;

    invoke-direct {v0, p2, p1}, LA12$b;-><init>(Ly12;Le62;)V

    goto :goto_0

    :cond_0
    invoke-static {}, LK32;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    :goto_0
    new-instance v1, LA12$c;

    invoke-direct {v1, p2, p1}, LA12$c;-><init>(Ly12;Le62;)V

    invoke-static {p0, v0, v1}, LDt0;->a(LgV2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)LgV2;

    move-result-object p0

    return-object p0
.end method
