.class public final Li91;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000b\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\"\u0017\u0010\u0007\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0002\u001a\u0004\u0008\u0006\u0010\u0004\"\u0017\u0010\t\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0002\u001a\u0004\u0008\u0001\u0010\u0004\"\u0017\u0010\n\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0002\u001a\u0004\u0008\u0008\u0010\u0004\u00a8\u0006\u000b"
    }
    d2 = {
        "Lh91;",
        "a",
        "Lh91;",
        "b",
        "()Lh91;",
        "FastOutSlowInEasing",
        "d",
        "LinearOutSlowInEasing",
        "c",
        "FastOutLinearInEasing",
        "LinearEasing",
        "animation-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final a:Lh91;

.field public static final b:Lh91;

.field public static final c:Lh91;

.field public static final d:Lh91;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, LUE0;

    const v1, 0x3ecccccd    # 0.4f

    const/4 v2, 0x0

    const v3, 0x3e4ccccd    # 0.2f

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2, v3, v4}, LUE0;-><init>(FFFF)V

    sput-object v0, Li91;->a:Lh91;

    new-instance v0, LUE0;

    invoke-direct {v0, v2, v2, v3, v4}, LUE0;-><init>(FFFF)V

    sput-object v0, Li91;->b:Lh91;

    new-instance v0, LUE0;

    invoke-direct {v0, v1, v2, v4, v4}, LUE0;-><init>(FFFF)V

    sput-object v0, Li91;->c:Lh91;

    sget-object v0, Li91$a;->a:Li91$a;

    sput-object v0, Li91;->d:Lh91;

    return-void
.end method

.method public static final a()Lh91;
    .locals 1

    sget-object v0, Li91;->c:Lh91;

    return-object v0
.end method

.method public static final b()Lh91;
    .locals 1

    sget-object v0, Li91;->a:Lh91;

    return-object v0
.end method

.method public static final c()Lh91;
    .locals 1

    sget-object v0, Li91;->d:Lh91;

    return-object v0
.end method

.method public static final d()Lh91;
    .locals 1

    sget-object v0, Li91;->b:Lh91;

    return-object v0
.end method
