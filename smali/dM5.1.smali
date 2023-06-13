.class public final LdM5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028G\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028G\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0004\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006\n"
    }
    d2 = {
        "LdM5;",
        "",
        "Lpm0;",
        "a",
        "(LEt0;I)J",
        "backgroundColor",
        "b",
        "primaryActionColor",
        "<init>",
        "()V",
        "material_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LdM5;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LdM5;

    invoke-direct {v0}, LdM5;-><init>()V

    sput-object v0, LdM5;->a:LdM5;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LEt0;I)J
    .locals 10
    .annotation build Lkotlin/jvm/JvmName;
        name = "getBackgroundColor"
    .end annotation

    const v0, 0x6135bce4

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.SnackbarDefaults.<get-backgroundColor> (Snackbar.kt:200)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LTM2;->a:LTM2;

    const/4 v0, 0x6

    invoke-virtual {p2, p1, v0}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v1

    invoke-virtual {v1}, LMm0;->i()J

    move-result-wide v2

    const v4, 0x3f4ccccd    # 0.8f

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xe

    const/4 v9, 0x0

    invoke-static/range {v2 .. v9}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v1

    invoke-virtual {p2, p1, v0}, LTM2;->a(LEt0;I)LMm0;

    move-result-object p2

    invoke-virtual {p2}, LMm0;->n()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Lvm0;->d(JJ)J

    move-result-wide v0

    invoke-static {}, LQt0;->O()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p1}, LEt0;->Q()V

    return-wide v0
.end method

.method public final b(LEt0;I)J
    .locals 10
    .annotation build Lkotlin/jvm/JvmName;
        name = "getPrimaryActionColor"
    .end annotation

    const v0, -0x304ca53a

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.SnackbarDefaults.<get-primaryActionColor> (Snackbar.kt:221)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, LTM2;->a:LTM2;

    const/4 v0, 0x6

    invoke-virtual {p2, p1, v0}, LTM2;->a(LEt0;I)LMm0;

    move-result-object p2

    invoke-virtual {p2}, LMm0;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, LMm0;->j()J

    move-result-wide v0

    invoke-virtual {p2}, LMm0;->n()J

    move-result-wide v2

    const v4, 0x3f19999a    # 0.6f

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xe

    const/4 v9, 0x0

    invoke-static/range {v2 .. v9}, Lpm0;->m(JFFFFILjava/lang/Object;)J

    move-result-wide v2

    invoke-static {v2, v3, v0, v1}, Lvm0;->d(JJ)J

    move-result-wide v0

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, LMm0;->k()J

    move-result-wide v0

    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {}, LQt0;->Y()V

    :cond_2
    invoke-interface {p1}, LEt0;->Q()V

    return-wide v0
.end method
