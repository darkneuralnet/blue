.class public final Lyb5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\"\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0002\u0010\u0003\u001a\u0004\u0008\u0004\u0010\u0005\"\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\t\"\u0014\u0010\u000c\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\t\"\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\t\u00a8\u0006\u000e"
    }
    d2 = {
        "LU94;",
        "Lxb5;",
        "a",
        "LU94;",
        "d",
        "()LU94;",
        "LocalRippleTheme",
        "Lpb5;",
        "b",
        "Lpb5;",
        "LightThemeHighContrastRippleAlpha",
        "c",
        "LightThemeLowContrastRippleAlpha",
        "DarkThemeRippleAlpha",
        "material-ripple_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:LU94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LU94<",
            "Lxb5;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lpb5;

.field public static final c:Lpb5;

.field public static final d:Lpb5;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    sget-object v0, Lyb5$a;->g:Lyb5$a;

    invoke-static {v0}, Lgu0;->d(Lkotlin/jvm/functions/Function0;)LU94;

    move-result-object v0

    sput-object v0, Lyb5;->a:LU94;

    new-instance v0, Lpb5;

    const v1, 0x3e23d70a    # 0.16f

    const v2, 0x3e75c28f    # 0.24f

    const v3, 0x3da3d70a    # 0.08f

    invoke-direct {v0, v1, v2, v3, v2}, Lpb5;-><init>(FFFF)V

    sput-object v0, Lyb5;->b:Lpb5;

    new-instance v0, Lpb5;

    const v1, 0x3df5c28f    # 0.12f

    const v2, 0x3d23d70a    # 0.04f

    invoke-direct {v0, v3, v1, v2, v1}, Lpb5;-><init>(FFFF)V

    sput-object v0, Lyb5;->c:Lpb5;

    new-instance v0, Lpb5;

    const v4, 0x3dcccccd    # 0.1f

    invoke-direct {v0, v3, v1, v2, v4}, Lpb5;-><init>(FFFF)V

    sput-object v0, Lyb5;->d:Lpb5;

    return-void
.end method

.method public static final synthetic a()Lpb5;
    .locals 1

    sget-object v0, Lyb5;->d:Lpb5;

    return-object v0
.end method

.method public static final synthetic b()Lpb5;
    .locals 1

    sget-object v0, Lyb5;->b:Lpb5;

    return-object v0
.end method

.method public static final synthetic c()Lpb5;
    .locals 1

    sget-object v0, Lyb5;->c:Lpb5;

    return-object v0
.end method

.method public static final d()LU94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LU94<",
            "Lxb5;",
            ">;"
        }
    .end annotation

    sget-object v0, Lyb5;->a:LU94;

    return-object v0
.end method
