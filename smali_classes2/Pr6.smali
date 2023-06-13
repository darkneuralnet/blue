.class public abstract LPr6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u0004\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0003*\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0003*\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0013\u0010\t\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u0003\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u000c\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u0005R\u0014\u0010\u0010\u001a\u00020\r8 X\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118 X\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00018&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\n\u0082\u0001\u0002\u0019\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "LPr6;",
        "",
        "Landroidx/activity/ComponentActivity;",
        "A",
        "a",
        "()Landroidx/activity/ComponentActivity;",
        "Landroid/app/Application;",
        "b",
        "()Landroid/app/Application;",
        "c",
        "()Ljava/lang/Object;",
        "d",
        "activity",
        "Landroidx/savedstate/a;",
        "g",
        "()Landroidx/savedstate/a;",
        "savedStateRegistry",
        "LXr6;",
        "f",
        "()LXr6;",
        "owner",
        "e",
        "args",
        "<init>",
        "()V",
        "Lr6;",
        "LFy1;",
        "mvrx_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
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

    invoke-direct {p0}, LPr6;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Landroidx/activity/ComponentActivity;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Landroidx/activity/ComponentActivity;",
            ">()TA;"
        }
    .end annotation

    invoke-virtual {p0}, LPr6;->d()Landroidx/activity/ComponentActivity;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type A of com.airbnb.mvrx.ViewModelContext.activity"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final b()Landroid/app/Application;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Landroid/app/Application;",
            ">()TA;"
        }
    .end annotation

    invoke-virtual {p0}, LPr6;->d()Landroidx/activity/ComponentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type A of com.airbnb.mvrx.ViewModelContext.app"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final c()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            ">()TA;"
        }
    .end annotation

    invoke-virtual {p0}, LPr6;->e()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public abstract d()Landroidx/activity/ComponentActivity;
.end method

.method public abstract e()Ljava/lang/Object;
.end method

.method public abstract f()LXr6;
.end method

.method public abstract g()Landroidx/savedstate/a;
.end method
