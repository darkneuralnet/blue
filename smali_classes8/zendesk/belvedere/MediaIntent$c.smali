.class public Lzendesk/belvedere/MediaIntent$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/belvedere/MediaIntent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final a:LEP2;

.field public final b:I

.field public c:Ljava/lang/String;

.field public d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public e:Z


# direct methods
.method public constructor <init>(ILEP2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lzendesk/belvedere/MediaIntent$c;->a:LEP2;

    iput p1, p0, Lzendesk/belvedere/MediaIntent$c;->b:I

    const-string p1, "*/*"

    iput-object p1, p0, Lzendesk/belvedere/MediaIntent$c;->c:Ljava/lang/String;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lzendesk/belvedere/MediaIntent$c;->d:Ljava/util/List;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lzendesk/belvedere/MediaIntent$c;->e:Z

    return-void
.end method


# virtual methods
.method public a(Z)Lzendesk/belvedere/MediaIntent$c;
    .locals 0

    iput-boolean p1, p0, Lzendesk/belvedere/MediaIntent$c;->e:Z

    return-object p0
.end method

.method public b()Lzendesk/belvedere/MediaIntent;
    .locals 5

    iget-object v0, p0, Lzendesk/belvedere/MediaIntent$c;->a:LEP2;

    iget v1, p0, Lzendesk/belvedere/MediaIntent$c;->b:I

    iget-object v2, p0, Lzendesk/belvedere/MediaIntent$c;->c:Ljava/lang/String;

    iget-boolean v3, p0, Lzendesk/belvedere/MediaIntent$c;->e:Z

    iget-object v4, p0, Lzendesk/belvedere/MediaIntent$c;->d:Ljava/util/List;

    invoke-virtual {v0, v1, v2, v3, v4}, LEP2;->f(ILjava/lang/String;ZLjava/util/List;)Lzendesk/belvedere/MediaIntent;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;)Lzendesk/belvedere/MediaIntent$c;
    .locals 0

    iput-object p1, p0, Lzendesk/belvedere/MediaIntent$c;->c:Ljava/lang/String;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lzendesk/belvedere/MediaIntent$c;->d:Ljava/util/List;

    return-object p0
.end method
