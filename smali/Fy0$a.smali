.class public final LFy0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LFy0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\u0008\r\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J/\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\r\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u000e\u001a\u0004\u0008\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u000e\u001a\u0004\u0008\u0014\u0010\u0010\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u0017"
    }
    d2 = {
        "LFy0$a;",
        "",
        "LBm0;",
        "source",
        "LFy0;",
        "f",
        "(LBm0;)LFy0;",
        "destination",
        "Lpw4;",
        "intent",
        "",
        "b",
        "(LBm0;LBm0;I)[F",
        "SrgbIdentity",
        "LFy0;",
        "d",
        "()LFy0;",
        "SrgbToOklabPerceptual",
        "e",
        "OklabToSrgbPerceptual",
        "c",
        "<init>",
        "()V",
        "ui-graphics_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, LFy0$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(LFy0$a;LBm0;LBm0;I)[F
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LFy0$a;->b(LBm0;LBm0;I)[F

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(LBm0;LBm0;I)[F
    .locals 6

    sget-object v0, Lpw4;->a:Lpw4$a;

    invoke-virtual {v0}, Lpw4$a;->a()I

    move-result v0

    invoke-static {p3, v0}, Lpw4;->e(II)Z

    move-result p3

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p1}, LBm0;->g()J

    move-result-wide v1

    sget-object p3, Lwm0;->a:Lwm0$a;

    invoke-virtual {p3}, Lwm0$a;->b()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Lwm0;->e(JJ)Z

    move-result v1

    invoke-virtual {p2}, LBm0;->g()J

    move-result-wide v2

    invoke-virtual {p3}, Lwm0$a;->b()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lwm0;->e(JJ)Z

    move-result p3

    if-eqz v1, :cond_1

    if-eqz p3, :cond_1

    return-object v0

    :cond_1
    if-nez v1, :cond_3

    if-eqz p3, :cond_2

    goto :goto_0

    :cond_2
    return-object v0

    :cond_3
    :goto_0
    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    move-object p1, p2

    :goto_1
    const-string p2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LSO4;

    if-eqz v1, :cond_5

    invoke-virtual {p1}, LSO4;->N()LNA6;

    move-result-object p2

    invoke-virtual {p2}, LNA6;->c()[F

    move-result-object p2

    goto :goto_2

    :cond_5
    sget-object p2, LwW1;->a:LwW1;

    invoke-virtual {p2}, LwW1;->c()[F

    move-result-object p2

    :goto_2
    if-eqz p3, :cond_6

    invoke-virtual {p1}, LSO4;->N()LNA6;

    move-result-object p1

    invoke-virtual {p1}, LNA6;->c()[F

    move-result-object p1

    goto :goto_3

    :cond_6
    sget-object p1, LwW1;->a:LwW1;

    invoke-virtual {p1}, LwW1;->c()[F

    move-result-object p1

    :goto_3
    const/4 p3, 0x3

    new-array p3, p3, [F

    const/4 v0, 0x0

    aget v1, p2, v0

    aget v2, p1, v0

    div-float/2addr v1, v2

    aput v1, p3, v0

    const/4 v0, 0x1

    aget v1, p2, v0

    aget v2, p1, v0

    div-float/2addr v1, v2

    aput v1, p3, v0

    const/4 v0, 0x2

    aget p2, p2, v0

    aget p1, p1, v0

    div-float/2addr p2, p1

    aput p2, p3, v0

    return-object p3
.end method

.method public final c()LFy0;
    .locals 1

    invoke-static {}, LFy0;->a()LFy0;

    move-result-object v0

    return-object v0
.end method

.method public final d()LFy0;
    .locals 1

    invoke-static {}, LFy0;->b()LFy0;

    move-result-object v0

    return-object v0
.end method

.method public final e()LFy0;
    .locals 1

    invoke-static {}, LFy0;->c()LFy0;

    move-result-object v0

    return-object v0
.end method

.method public final f(LBm0;)LFy0;
    .locals 2

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lpw4;->a:Lpw4$a;

    invoke-virtual {v0}, Lpw4$a;->c()I

    move-result v0

    new-instance v1, LFy0$a$a;

    invoke-direct {v1, p1, v0}, LFy0$a$a;-><init>(LBm0;I)V

    return-object v1
.end method
