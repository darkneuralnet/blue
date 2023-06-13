.class public final LDu6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0002\".\u0010\u000b\u001a\u0016\u0012\u000c\u0012\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\"\u0018\u0010\u0010\u001a\u00020\r*\u00020\u000c8F\u00f8\u0001\u0000\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\"\u0018\u0010\u0010\u001a\u00020\u0012*\u00020\u00118F\u00f8\u0001\u0000\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014\"\u0015\u0010\u0010\u001a\u00020\u0016*\u00020\u00158F\u00a2\u0006\u0006\u001a\u0004\u0008\u0007\u0010\u0017\"\u0018\u0010\u0010\u001a\u00020\u0019*\u00020\u00188F\u00f8\u0001\u0000\u00a2\u0006\u0006\u001a\u0004\u0008\u0001\u0010\u001a\"\u0018\u0010\u0010\u001a\u00020\u001c*\u00020\u001b8F\u00f8\u0001\u0000\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001e\"\u0018\u0010\u0010\u001a\u00020 *\u00020\u001f8F\u00f8\u0001\u0000\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\"\"\u0015\u0010\u0010\u001a\u00020\u0000*\u00020#8F\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010%\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006&"
    }
    d2 = {
        "LOs4;",
        "a",
        "LOs4;",
        "rectVisibilityThreshold",
        "",
        "Lwb6;",
        "",
        "b",
        "Ljava/util/Map;",
        "h",
        "()Ljava/util/Map;",
        "visibilityThresholdMap",
        "LA52$a;",
        "LA52;",
        "c",
        "(LA52$a;)J",
        "VisibilityThreshold",
        "LCe3$a;",
        "LCe3;",
        "e",
        "(LCe3$a;)J",
        "Lkotlin/Int$Companion;",
        "",
        "(Lkotlin/jvm/internal/IntCompanionObject;)I",
        "Lk61$a;",
        "Lk61;",
        "(Lk61$a;)F",
        "LxB5$a;",
        "LxB5;",
        "f",
        "(LxB5$a;)J",
        "LG52$a;",
        "LG52;",
        "d",
        "(LG52$a;)J",
        "LOs4$a;",
        "g",
        "(LOs4$a;)LOs4;",
        "animation-core_release"
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
        "SMAP\nVisibilityThresholds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,114:1\n175#2:115\n*S KotlinDebug\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n*L\n68#1:115\n*E\n"
    }
.end annotation


# static fields
.field public static final a:LOs4;

.field public static final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lwb6<",
            "**>;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, LOs4;

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-direct {v0, v1, v1, v1, v1}, LOs4;-><init>(FFFF)V

    sput-object v0, LDu6;->a:LOs4;

    const/16 v0, 0x9

    new-array v0, v0, [Lkotlin/Pair;

    sget-object v1, Lkotlin/jvm/internal/IntCompanionObject;->INSTANCE:Lkotlin/jvm/internal/IntCompanionObject;

    invoke-static {v1}, LXj6;->j(Lkotlin/jvm/internal/IntCompanionObject;)Lwb6;

    move-result-object v1

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v4, 0x0

    aput-object v1, v0, v4

    sget-object v1, LG52;->b:LG52$a;

    invoke-static {v1}, LXj6;->e(LG52$a;)Lwb6;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v4, 0x1

    aput-object v1, v0, v4

    sget-object v1, LA52;->b:LA52$a;

    invoke-static {v1}, LXj6;->d(LA52$a;)Lwb6;

    move-result-object v1

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v0, v3

    sget-object v1, Lkotlin/jvm/internal/FloatCompanionObject;->INSTANCE:Lkotlin/jvm/internal/FloatCompanionObject;

    invoke-static {v1}, LXj6;->i(Lkotlin/jvm/internal/FloatCompanionObject;)Lwb6;

    move-result-object v1

    const v3, 0x3c23d70a    # 0.01f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x3

    aput-object v1, v0, v3

    sget-object v1, LOs4;->e:LOs4$a;

    invoke-static {v1}, LXj6;->g(LOs4$a;)Lwb6;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x4

    aput-object v1, v0, v3

    sget-object v1, LxB5;->b:LxB5$a;

    invoke-static {v1}, LXj6;->h(LxB5$a;)Lwb6;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x5

    aput-object v1, v0, v3

    sget-object v1, LCe3;->b:LCe3$a;

    invoke-static {v1}, LXj6;->f(LCe3$a;)Lwb6;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lk61;->c:Lk61$a;

    invoke-static {v1}, LXj6;->b(Lk61$a;)Lwb6;

    move-result-object v1

    const v2, 0x3dcccccd    # 0.1f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x7

    aput-object v1, v0, v3

    sget-object v1, Ln61;->b:Ln61$a;

    invoke-static {v1}, LXj6;->c(Ln61$a;)Lwb6;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v2, 0x8

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, LDu6;->b:Ljava/util/Map;

    return-void
.end method

.method public static final a(Lk61$a;)F
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p0, 0x3dcccccd    # 0.1f

    invoke-static {p0}, Lk61;->g(F)F

    move-result p0

    return p0
.end method

.method public static final b(Lkotlin/jvm/internal/IntCompanionObject;)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static final c(LA52$a;)J
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    invoke-static {p0, p0}, LB52;->a(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final d(LG52$a;)J
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    invoke-static {p0, p0}, LH52;->a(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final e(LCe3$a;)J
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 p0, 0x3f000000    # 0.5f

    invoke-static {p0, p0}, LGe3;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final f(LxB5$a;)J
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 p0, 0x3f000000    # 0.5f

    invoke-static {p0, p0}, LCB5;->a(FF)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final g(LOs4$a;)LOs4;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, LDu6;->a:LOs4;

    return-object p0
.end method

.method public static final h()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lwb6<",
            "**>;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    sget-object v0, LDu6;->b:Ljava/util/Map;

    return-object v0
.end method
