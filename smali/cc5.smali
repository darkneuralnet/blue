.class public final Lcc5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u001b\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0008\u001a\u000e\u0010\u000c\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n\"\u0017\u0010\u0010\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0011"
    }
    d2 = {
        "LOC0;",
        "corner",
        "Lbc5;",
        "c",
        "Lk61;",
        "size",
        "d",
        "(F)Lbc5;",
        "",
        "a",
        "",
        "percent",
        "b",
        "Lbc5;",
        "e",
        "()Lbc5;",
        "CircleShape",
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
        "SMAP\nRoundedCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundedCornerShape.kt\nandroidx/compose/foundation/shape/RoundedCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,200:1\n154#2:201\n154#2:202\n154#2:203\n154#2:204\n*S KotlinDebug\n*F\n+ 1 RoundedCornerShape.kt\nandroidx/compose/foundation/shape/RoundedCornerShapeKt\n*L\n147#1:201\n148#1:202\n149#1:203\n150#1:204\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lbc5;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x32

    invoke-static {v0}, Lcc5;->b(I)Lbc5;

    move-result-object v0

    sput-object v0, Lcc5;->a:Lbc5;

    return-void
.end method

.method public static final a(F)Lbc5;
    .locals 0

    invoke-static {p0}, LPC0;->a(F)LOC0;

    move-result-object p0

    invoke-static {p0}, Lcc5;->c(LOC0;)Lbc5;

    move-result-object p0

    return-object p0
.end method

.method public static final b(I)Lbc5;
    .locals 0

    invoke-static {p0}, LPC0;->b(I)LOC0;

    move-result-object p0

    invoke-static {p0}, Lcc5;->c(LOC0;)Lbc5;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LOC0;)Lbc5;
    .locals 1

    const-string v0, "corner"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbc5;

    invoke-direct {v0, p0, p0, p0, p0}, Lbc5;-><init>(LOC0;LOC0;LOC0;LOC0;)V

    return-object v0
.end method

.method public static final d(F)Lbc5;
    .locals 0

    invoke-static {p0}, LPC0;->c(F)LOC0;

    move-result-object p0

    invoke-static {p0}, Lcc5;->c(LOC0;)Lbc5;

    move-result-object p0

    return-object p0
.end method

.method public static final e()Lbc5;
    .locals 1

    sget-object v0, Lcc5;->a:Lbc5;

    return-object v0
.end method
