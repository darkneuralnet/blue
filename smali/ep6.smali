.class public Lep6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZU5;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LZU5<",
        "Ldp6;",
        ">;"
    }
.end annotation


# static fields
.field public static final f:Landroid/util/Size;

.field public static final g:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lr46;

.field public final c:Lwp6;

.field public final d:Landroid/util/Size;

.field public final e:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/util/Size;

    const/16 v1, 0x500

    const/16 v2, 0x2d0

    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    sput-object v0, Lep6;->f:Landroid/util/Size;

    new-instance v0, Landroid/util/Range;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v2, 0x3c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    sput-object v0, Lep6;->g:Landroid/util/Range;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lr46;Lwp6;Landroid/util/Size;Landroid/util/Range;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lr46;",
            "Lwp6;",
            "Landroid/util/Size;",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lep6;->a:Ljava/lang/String;

    iput-object p2, p0, Lep6;->b:Lr46;

    iput-object p3, p0, Lep6;->c:Lwp6;

    iput-object p4, p0, Lep6;->d:Landroid/util/Size;

    iput-object p5, p0, Lep6;->e:Landroid/util/Range;

    return-void
.end method


# virtual methods
.method public a()Ldp6;
    .locals 9

    invoke-virtual {p0}, Lep6;->b()I

    move-result v8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Resolved VIDEO frame rate: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "fps"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "VidEncCfgDefaultRslvr"

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lep6;->c:Lwp6;

    invoke-virtual {v0}, Lwp6;->c()Landroid/util/Range;

    move-result-object v7

    const-string v0, "Using fallback VIDEO bitrate"

    invoke-static {v1, v0}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    const v0, 0xd59f80

    const/16 v2, 0x1e

    iget-object v1, p0, Lep6;->d:Landroid/util/Size;

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v3

    sget-object v1, Lep6;->f:Landroid/util/Size;

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v4

    iget-object v5, p0, Lep6;->d:Landroid/util/Size;

    invoke-virtual {v5}, Landroid/util/Size;->getHeight()I

    move-result v5

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v6

    move v1, v8

    invoke-static/range {v0 .. v7}, LZo6;->d(IIIIIIILandroid/util/Range;)I

    move-result v0

    invoke-static {}, Ldp6;->d()Ldp6$a;

    move-result-object v1

    iget-object v2, p0, Lep6;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ldp6$a;->g(Ljava/lang/String;)Ldp6$a;

    move-result-object v1

    iget-object v2, p0, Lep6;->b:Lr46;

    invoke-virtual {v1, v2}, Ldp6$a;->f(Lr46;)Ldp6$a;

    move-result-object v1

    iget-object v2, p0, Lep6;->d:Landroid/util/Size;

    invoke-virtual {v1, v2}, Ldp6$a;->h(Landroid/util/Size;)Ldp6$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Ldp6$a;->b(I)Ldp6$a;

    move-result-object v0

    invoke-virtual {v0, v8}, Ldp6$a;->d(I)Ldp6$a;

    move-result-object v0

    invoke-virtual {v0}, Ldp6$a;->a()Ldp6;

    move-result-object v0

    return-object v0
.end method

.method public final b()I
    .locals 5

    iget-object v0, p0, Lep6;->c:Lwp6;

    invoke-virtual {v0}, Lwp6;->d()Landroid/util/Range;

    move-result-object v0

    sget-object v1, Lwp6;->a:Landroid/util/Range;

    invoke-virtual {v1, v0}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lep6;->g:Landroid/util/Range;

    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v1, v2}, Landroid/util/Range;->clamp(Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_0

    :cond_0
    const/16 v1, 0x1e

    :goto_0
    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v3, 0x2

    iget-object v4, p0, Lep6;->e:Landroid/util/Range;

    aput-object v4, v2, v3

    const-string v3, "Frame rate default: %dfps. [Requested range: %s, Expected operating range: %s]"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "VidEncCfgDefaultRslvr"

    invoke-static {v3, v2}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lep6;->e:Landroid/util/Range;

    invoke-static {v0, v1, v2}, LZo6;->a(Landroid/util/Range;ILandroid/util/Range;)I

    move-result v0

    return v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lep6;->a()Ldp6;

    move-result-object v0

    return-object v0
.end method
