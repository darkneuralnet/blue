.class public final LA74;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA74$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 \u00032\u00020\u0001:\u0001\u000bB\u0019\u0008\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\u0008\u001a\u00020\u00072\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u001c\u0010\n\u001a\u00020\u00072\u0008\u0010\t\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0013\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001c"
    }
    d2 = {
        "LA74;",
        "",
        "",
        "e",
        "Lcom/facebook/Profile;",
        "currentProfile",
        "writeToCache",
        "",
        "h",
        "oldProfile",
        "f",
        "a",
        "Lcom/facebook/Profile;",
        "currentProfileField",
        "LMu2;",
        "b",
        "LMu2;",
        "localBroadcastManager",
        "Ls74;",
        "c",
        "Ls74;",
        "profileCache",
        "value",
        "()Lcom/facebook/Profile;",
        "g",
        "(Lcom/facebook/Profile;)V",
        "<init>",
        "(LMu2;Ls74;)V",
        "facebook-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static volatile d:LA74;

.field public static final e:LA74$a;


# instance fields
.field public a:Lcom/facebook/Profile;

.field public final b:LMu2;

.field public final c:Ls74;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LA74$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LA74$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LA74;->e:LA74$a;

    return-void
.end method

.method public constructor <init>(LMu2;Ls74;)V
    .locals 1

    const-string v0, "localBroadcastManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "profileCache"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA74;->b:LMu2;

    iput-object p2, p0, LA74;->c:Ls74;

    return-void
.end method

.method public static final synthetic a()LA74;
    .locals 1

    sget-object v0, LA74;->d:LA74;

    return-object v0
.end method

.method public static final synthetic b(LA74;)V
    .locals 0

    sput-object p0, LA74;->d:LA74;

    return-void
.end method

.method public static final d()LA74;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, LA74;->e:LA74$a;

    invoke-virtual {v0}, LA74$a;->a()LA74;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final c()Lcom/facebook/Profile;
    .locals 1

    iget-object v0, p0, LA74;->a:Lcom/facebook/Profile;

    return-object v0
.end method

.method public final e()Z
    .locals 2

    iget-object v0, p0, LA74;->c:Ls74;

    invoke-virtual {v0}, Ls74;->b()Lcom/facebook/Profile;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0, v1}, LA74;->h(Lcom/facebook/Profile;Z)V

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public final f(Lcom/facebook/Profile;Lcom/facebook/Profile;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.facebook.sdk.EXTRA_OLD_PROFILE"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p1, "com.facebook.sdk.EXTRA_NEW_PROFILE"

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    iget-object p1, p0, LA74;->b:LMu2;

    invoke-virtual {p1, v0}, LMu2;->d(Landroid/content/Intent;)Z

    return-void
.end method

.method public final g(Lcom/facebook/Profile;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, LA74;->h(Lcom/facebook/Profile;Z)V

    return-void
.end method

.method public final h(Lcom/facebook/Profile;Z)V
    .locals 1

    iget-object v0, p0, LA74;->a:Lcom/facebook/Profile;

    iput-object p1, p0, LA74;->a:Lcom/facebook/Profile;

    if-eqz p2, :cond_1

    if-eqz p1, :cond_0

    iget-object p2, p0, LA74;->c:Ls74;

    invoke-virtual {p2, p1}, Ls74;->c(Lcom/facebook/Profile;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, LA74;->c:Ls74;

    invoke-virtual {p2}, Ls74;->a()V

    :cond_1
    :goto_0
    invoke-static {v0, p1}, Lyi6;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    invoke-virtual {p0, v0, p1}, LA74;->f(Lcom/facebook/Profile;Lcom/facebook/Profile;)V

    :cond_2
    return-void
.end method
