.class public abstract Lzendesk/belvedere/d$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/belvedere/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# instance fields
.field public final a:I

.field public final b:J

.field public final c:Lzendesk/belvedere/MediaResult;

.field public d:Z


# direct methods
.method public constructor <init>(ILzendesk/belvedere/MediaResult;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lzendesk/belvedere/d$b;->a:I

    iput-object p2, p0, Lzendesk/belvedere/d$b;->c:Lzendesk/belvedere/MediaResult;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->hashCode()I

    move-result p1

    int-to-long p1, p1

    iput-wide p1, p0, Lzendesk/belvedere/d$b;->b:J

    const/4 p1, 0x0

    iput-boolean p1, p0, Lzendesk/belvedere/d$b;->d:Z

    return-void
.end method


# virtual methods
.method public abstract a(Landroid/view/View;)V
.end method

.method public b()J
    .locals 2

    iget-wide v0, p0, Lzendesk/belvedere/d$b;->b:J

    return-wide v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lzendesk/belvedere/d$b;->a:I

    return v0
.end method

.method public d()Lzendesk/belvedere/MediaResult;
    .locals 1

    iget-object v0, p0, Lzendesk/belvedere/d$b;->c:Lzendesk/belvedere/MediaResult;

    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lzendesk/belvedere/d$b;->d:Z

    return v0
.end method

.method public f(Z)V
    .locals 0

    iput-boolean p1, p0, Lzendesk/belvedere/d$b;->d:Z

    return-void
.end method
