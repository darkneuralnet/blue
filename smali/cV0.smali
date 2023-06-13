.class public final LcV0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxb5;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c3\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0018\u0010\u0005\u001a\u00020\u0002H\u0017\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u0082\u0002\u000f\n\u0002\u0008!\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\u000b"
    }
    d2 = {
        "LcV0;",
        "Lxb5;",
        "Lpm0;",
        "defaultColor-WaAFU9c",
        "(LEt0;I)J",
        "defaultColor",
        "Lpb5;",
        "rippleAlpha",
        "(LEt0;I)Lpb5;",
        "<init>",
        "()V",
        "material-ripple_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final b:LcV0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LcV0;

    invoke-direct {v0}, LcV0;-><init>()V

    sput-object v0, LcV0;->b:LcV0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public defaultColor-WaAFU9c(LEt0;I)J
    .locals 3

    const v0, 0x79b8960e

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.ripple.DebugRippleTheme.defaultColor (RippleTheme.kt:214)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, Lxb5;->a:Lxb5$a;

    sget-object v0, Lpm0;->b:Lpm0$a;

    invoke-virtual {v0}, Lpm0$a;->a()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-virtual {p2, v0, v1, v2}, Lxb5$a;->b(JZ)J

    move-result-wide v0

    invoke-static {}, LQt0;->O()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p1}, LEt0;->Q()V

    return-wide v0
.end method

.method public rippleAlpha(LEt0;I)Lpb5;
    .locals 3

    const v0, -0x61250617

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.ripple.DebugRippleTheme.rippleAlpha (RippleTheme.kt:217)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, Lxb5;->a:Lxb5$a;

    sget-object v0, Lpm0;->b:Lpm0$a;

    invoke-virtual {v0}, Lpm0$a;->a()J

    move-result-wide v0

    const/4 v2, 0x1

    invoke-virtual {p2, v0, v1, v2}, Lxb5$a;->a(JZ)Lpb5;

    move-result-object p2

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p1}, LEt0;->Q()V

    return-object p2
.end method
