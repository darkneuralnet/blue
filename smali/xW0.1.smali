.class public final LxW0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh70;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000b\u0008\u0003\u0018\u00002\u00020\u0001B*\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J \u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J \u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\u0007J\u0013\u0010\u000b\u001a\u00020\u00022\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\u0008\u0010\r\u001a\u00020\u000cH\u0016R\u001d\u0010\u000f\u001a\u00020\u00058\u0002X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u000eR\u001d\u0010\u0010\u001a\u00020\u00058\u0002X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u000eR\u001d\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u000eR\u001d\u0010\u0014\u001a\u00020\u00058\u0002X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u000e\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\u0017"
    }
    d2 = {
        "LxW0;",
        "Lh70;",
        "",
        "enabled",
        "LsP5;",
        "Lpm0;",
        "a",
        "(ZLEt0;I)LsP5;",
        "b",
        "",
        "other",
        "equals",
        "",
        "hashCode",
        "J",
        "backgroundColor",
        "contentColor",
        "c",
        "disabledBackgroundColor",
        "d",
        "disabledContentColor",
        "<init>",
        "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "material_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:J


# direct methods
.method public constructor <init>(JJJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, LxW0;->a:J

    iput-wide p3, p0, LxW0;->b:J

    iput-wide p5, p0, LxW0;->c:J

    iput-wide p7, p0, LxW0;->d:J

    return-void
.end method

.method public synthetic constructor <init>(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, LxW0;-><init>(JJJJ)V

    return-void
.end method


# virtual methods
.method public a(ZLEt0;I)LsP5;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "LEt0;",
            "I)",
            "LsP5<",
            "Lpm0;",
            ">;"
        }
    .end annotation

    const v0, -0x270e63e3

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.DefaultButtonColors.backgroundColor (Button.kt:586)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    if-eqz p1, :cond_1

    iget-wide v0, p0, LxW0;->a:J

    goto :goto_0

    :cond_1
    iget-wide v0, p0, LxW0;->c:J

    :goto_0
    invoke-static {v0, v1}, Lpm0;->i(J)Lpm0;

    move-result-object p1

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, LGM5;->n(Ljava/lang/Object;LEt0;I)LsP5;

    move-result-object p1

    invoke-static {}, LQt0;->O()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    invoke-interface {p2}, LEt0;->Q()V

    return-object p1
.end method

.method public b(ZLEt0;I)LsP5;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "LEt0;",
            "I)",
            "LsP5<",
            "Lpm0;",
            ">;"
        }
    .end annotation

    const v0, -0x7f2ce0b4

    invoke-interface {p2, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.DefaultButtonColors.contentColor (Button.kt:591)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    if-eqz p1, :cond_1

    iget-wide v0, p0, LxW0;->b:J

    goto :goto_0

    :cond_1
    iget-wide v0, p0, LxW0;->d:J

    :goto_0
    invoke-static {v0, v1}, Lpm0;->i(J)Lpm0;

    move-result-object p1

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, LGM5;->n(Ljava/lang/Object;LEt0;I)LsP5;

    move-result-object p1

    invoke-static {}, LQt0;->O()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    invoke-interface {p2}, LEt0;->Q()V

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_6

    const-class v2, LxW0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, LxW0;

    iget-wide v2, p0, LxW0;->a:J

    iget-wide v4, p1, LxW0;->a:J

    invoke-static {v2, v3, v4, v5}, Lpm0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-wide v2, p0, LxW0;->b:J

    iget-wide v4, p1, LxW0;->b:J

    invoke-static {v2, v3, v4, v5}, Lpm0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_3

    return v1

    :cond_3
    iget-wide v2, p0, LxW0;->c:J

    iget-wide v4, p1, LxW0;->c:J

    invoke-static {v2, v3, v4, v5}, Lpm0;->o(JJ)Z

    move-result v2

    if-nez v2, :cond_4

    return v1

    :cond_4
    iget-wide v2, p0, LxW0;->d:J

    iget-wide v4, p1, LxW0;->d:J

    invoke-static {v2, v3, v4, v5}, Lpm0;->o(JJ)Z

    move-result p1

    if-nez p1, :cond_5

    return v1

    :cond_5
    return v0

    :cond_6
    :goto_0
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, LxW0;->a:J

    invoke-static {v0, v1}, Lpm0;->u(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LxW0;->b:J

    invoke-static {v1, v2}, Lpm0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LxW0;->c:J

    invoke-static {v1, v2}, Lpm0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LxW0;->d:J

    invoke-static {v1, v2}, Lpm0;->u(J)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
