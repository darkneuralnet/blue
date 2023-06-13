.class public final LJ20;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u001c\u0010\u0008\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a8\u0006\t"
    }
    d2 = {
        "LgV2;",
        "LI20;",
        "responder",
        "b",
        "Lnm2;",
        "sourceCoordinates",
        "LOs4;",
        "rect",
        "c",
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
        "SMAP\nBringIntoViewResponder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,199:1\n135#2:200\n*S KotlinDebug\n*F\n+ 1 BringIntoViewResponder.kt\nandroidx/compose/foundation/relocation/BringIntoViewResponderKt\n*L\n102#1:200\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic a(Lnm2;Lnm2;LOs4;)LOs4;
    .locals 0

    invoke-static {p0, p1, p2}, LJ20;->c(Lnm2;Lnm2;LOs4;)LOs4;

    move-result-object p0

    return-object p0
.end method

.method public static final b(LgV2;LI20;)LgV2;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "responder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LK32;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, LJ20$a;

    invoke-direct {v0, p1}, LJ20$a;-><init>(LI20;)V

    goto :goto_0

    :cond_0
    invoke-static {}, LK32;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    :goto_0
    new-instance v1, LJ20$b;

    invoke-direct {v1, p1}, LJ20$b;-><init>(LI20;)V

    invoke-static {p0, v0, v1}, LDt0;->a(LgV2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)LgV2;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lnm2;Lnm2;LOs4;)LOs4;
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, p1, v0}, Lnm2;->e(Lnm2;Z)LOs4;

    move-result-object p0

    invoke-virtual {p0}, LOs4;->m()J

    move-result-wide p0

    invoke-virtual {p2, p0, p1}, LOs4;->s(J)LOs4;

    move-result-object p0

    return-object p0
.end method
