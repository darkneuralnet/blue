.class public interface abstract Le16;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld16;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008g\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\t\u0010\nJ0\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\n\u00f8\u0001\u0001\u0082\u0002\n\n\u0002\u0008\u0019\n\u0004\u0008!0\u0001\u00a8\u0006\u000c\u00c0\u0006\u0003"
    }
    d2 = {
        "Le16;",
        "Ld16;",
        "",
        "enabled",
        "isError",
        "Le62;",
        "interactionSource",
        "LsP5;",
        "Lpm0;",
        "c",
        "(ZZLe62;LEt0;I)LsP5;",
        "f",
        "material_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# virtual methods
.method public c(ZZLe62;LEt0;I)LsP5;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Le62;",
            "LEt0;",
            "I)",
            "LsP5<",
            "Lpm0;",
            ">;"
        }
    .end annotation

    const-string v0, "interactionSource"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, 0x4c3ee396    # 5.0040408E7f

    invoke-interface {p4, p3}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.TextFieldColorsWithIcons.leadingIconColor (TextFieldDefaults.kt:160)"

    invoke-static {p3, p5, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    and-int/lit8 p3, p5, 0xe

    and-int/lit8 v0, p5, 0x70

    or-int/2addr p3, v0

    shr-int/lit8 p5, p5, 0x3

    and-int/lit16 p5, p5, 0x380

    or-int/2addr p3, p5

    invoke-interface {p0, p1, p2, p4, p3}, Ld16;->e(ZZLEt0;I)LsP5;

    move-result-object p1

    invoke-static {}, LQt0;->O()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p4}, LEt0;->Q()V

    return-object p1
.end method

.method public f(ZZLe62;LEt0;I)LsP5;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Le62;",
            "LEt0;",
            "I)",
            "LsP5<",
            "Lpm0;",
            ">;"
        }
    .end annotation

    const-string v0, "interactionSource"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p3, -0x2a726678

    invoke-interface {p4, p3}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.TextFieldColorsWithIcons.trailingIconColor (TextFieldDefaults.kt:177)"

    invoke-static {p3, p5, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    and-int/lit8 p3, p5, 0xe

    and-int/lit8 v0, p5, 0x70

    or-int/2addr p3, v0

    shr-int/lit8 p5, p5, 0x3

    and-int/lit16 p5, p5, 0x380

    or-int/2addr p3, p5

    invoke-interface {p0, p1, p2, p4, p3}, Ld16;->i(ZZLEt0;I)LsP5;

    move-result-object p1

    invoke-static {}, LQt0;->O()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p4}, LEt0;->Q()V

    return-object p1
.end method
