.class public Lzendesk/belvedere/MediaIntent$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/belvedere/MediaIntent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:LEP2;

.field public final b:LY52;

.field public final c:I

.field public d:Z


# direct methods
.method public constructor <init>(ILEP2;LY52;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lzendesk/belvedere/MediaIntent$b;->c:I

    iput-object p2, p0, Lzendesk/belvedere/MediaIntent$b;->a:LEP2;

    iput-object p3, p0, Lzendesk/belvedere/MediaIntent$b;->b:LY52;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lzendesk/belvedere/MediaIntent$b;->d:Z

    return-void
.end method


# virtual methods
.method public a()Lzendesk/belvedere/MediaIntent;
    .locals 4

    iget-object v0, p0, Lzendesk/belvedere/MediaIntent$b;->a:LEP2;

    iget v1, p0, Lzendesk/belvedere/MediaIntent$b;->c:I

    invoke-virtual {v0, v1}, LEP2;->c(I)LsE3;

    move-result-object v0

    iget-object v1, v0, LsE3;->a:Ljava/lang/Object;

    check-cast v1, Lzendesk/belvedere/MediaIntent;

    iget-object v0, v0, LsE3;->b:Ljava/lang/Object;

    check-cast v0, Lzendesk/belvedere/MediaResult;

    invoke-virtual {v1}, Lzendesk/belvedere/MediaIntent;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lzendesk/belvedere/MediaIntent$b;->b:LY52;

    iget v3, p0, Lzendesk/belvedere/MediaIntent$b;->c:I

    invoke-virtual {v2, v3, v0}, LY52;->e(ILzendesk/belvedere/MediaResult;)V

    :cond_0
    return-object v1
.end method
