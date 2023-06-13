.class public final LIb0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\"\u0019\u0010\u0005\u001a\u00060\u0001j\u0002`\u0002*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/google/android/filament/utils/Manipulator;",
        "LyM2;",
        "Lio/github/sceneview/math/Transform;",
        "a",
        "(Lcom/google/android/filament/utils/Manipulator;)LyM2;",
        "transform",
        "sceneview_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method public static final a(Lcom/google/android/filament/utils/Manipulator;)LyM2;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    new-array v1, v0, [[F

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_0

    new-array v4, v0, [F

    aput-object v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    aget-object v0, v1, v2

    const/4 v3, 0x1

    aget-object v4, v1, v3

    const/4 v5, 0x2

    aget-object v5, v1, v5

    invoke-virtual {p0, v0, v4, v5}, Lcom/google/android/filament/utils/Manipulator;->getLookAt([F[F[F)V

    aget-object p0, v1, v2

    aget-object v0, v1, v3

    invoke-static {p0}, LgN2;->m([F)Lhu1;

    move-result-object p0

    invoke-static {v0}, LgN2;->m([F)Lhu1;

    move-result-object v0

    new-instance v7, Lhu1;

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    const/4 v5, 0x5

    const/4 v6, 0x0

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lhu1;-><init>(FFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p0, v0, v7}, LnN2;->b(Lhu1;Lhu1;Lhu1;)LyM2;

    move-result-object p0

    return-object p0
.end method
