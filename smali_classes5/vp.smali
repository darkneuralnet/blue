.class public final Lvp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvp$c;,
        Lvp$b;,
        Lvp$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0018\u0000 \u001c2\u00020\u0001:\u0003\u0003\u0007\u000bB\u0007\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R(\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0008\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0004\u001a\u0004\u0008\u000c\u0010\rR(\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0008\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0004\u001a\u0004\u0008\u0010\u0010\rR$\u0010\u0017\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u00128\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\r\u00a8\u0006\u001d"
    }
    d2 = {
        "Lvp;",
        "",
        "",
        "a",
        "Ljava/lang/String;",
        "androidAdvertiserIdValue",
        "",
        "b",
        "J",
        "fetchTime",
        "<set-?>",
        "c",
        "l",
        "()Ljava/lang/String;",
        "attributionId",
        "d",
        "k",
        "androidInstallerPackage",
        "",
        "e",
        "Z",
        "n",
        "()Z",
        "isTrackingLimited",
        "j",
        "androidAdvertiserId",
        "<init>",
        "()V",
        "h",
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
.field public static final f:Ljava/lang/String;

.field public static g:Lvp;

.field public static final h:Lvp$a;


# instance fields
.field public a:Ljava/lang/String;

.field public b:J

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvp$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvp$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lvp;->h:Lvp$a;

    const-class v0, Lvp;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lvp;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()Lvp;
    .locals 1

    sget-object v0, Lvp;->g:Lvp;

    return-object v0
.end method

.method public static final synthetic b(Lvp;)J
    .locals 2

    iget-wide v0, p0, Lvp;->b:J

    return-wide v0
.end method

.method public static final synthetic c()Ljava/lang/String;
    .locals 1

    sget-object v0, Lvp;->f:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic d(Lvp;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lvp;->a:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic e(Lvp;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lvp;->d:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic f(Lvp;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lvp;->c:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic g(Lvp;)V
    .locals 0

    sput-object p0, Lvp;->g:Lvp;

    return-void
.end method

.method public static final synthetic h(Lvp;J)V
    .locals 0

    iput-wide p1, p0, Lvp;->b:J

    return-void
.end method

.method public static final synthetic i(Lvp;Z)V
    .locals 0

    iput-boolean p1, p0, Lvp;->e:Z

    return-void
.end method

.method public static final m(Landroid/content/Context;)Lvp;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lvp;->h:Lvp$a;

    invoke-virtual {v0, p0}, Lvp$a;->e(Landroid/content/Context;)Lvp;

    move-result-object p0

    return-object p0
.end method

.method public static final o(Landroid/content/Context;)Z
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lvp;->h:Lvp$a;

    invoke-virtual {v0, p0}, Lvp$a;->i(Landroid/content/Context;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final j()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/facebook/a;->x()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/facebook/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lvp;->a:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvp;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvp;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final n()Z
    .locals 1

    iget-boolean v0, p0, Lvp;->e:Z

    return v0
.end method
