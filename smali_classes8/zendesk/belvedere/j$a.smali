.class public Lzendesk/belvedere/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzendesk/belvedere/j$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/belvedere/j;->i(Landroidx/fragment/app/Fragment;Ljava/util/List;Lzendesk/belvedere/j$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lzendesk/belvedere/j$d;

.field public final synthetic d:Lzendesk/belvedere/j;


# direct methods
.method public constructor <init>(Lzendesk/belvedere/j;Landroid/content/Context;Ljava/util/List;Lzendesk/belvedere/j$d;)V
    .locals 0

    iput-object p1, p0, Lzendesk/belvedere/j$a;->d:Lzendesk/belvedere/j;

    iput-object p2, p0, Lzendesk/belvedere/j$a;->a:Landroid/content/Context;

    iput-object p3, p0, Lzendesk/belvedere/j$a;->b:Ljava/util/List;

    iput-object p4, p0, Lzendesk/belvedere/j$a;->c:Lzendesk/belvedere/j$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object p1, p0, Lzendesk/belvedere/j$a;->d:Lzendesk/belvedere/j;

    iget-object v0, p0, Lzendesk/belvedere/j$a;->a:Landroid/content/Context;

    iget-object v1, p0, Lzendesk/belvedere/j$a;->b:Ljava/util/List;

    invoke-static {p1, v0, v1}, Lzendesk/belvedere/j;->a(Lzendesk/belvedere/j;Landroid/content/Context;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lzendesk/belvedere/j$a;->d:Lzendesk/belvedere/j;

    iget-object v1, p0, Lzendesk/belvedere/j$a;->a:Landroid/content/Context;

    invoke-static {v0, v1}, Lzendesk/belvedere/j;->b(Lzendesk/belvedere/j;Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzendesk/belvedere/j$a;->c:Lzendesk/belvedere/j$d;

    invoke-interface {v0, p1}, Lzendesk/belvedere/j$d;->a(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lzendesk/belvedere/j$a;->c:Lzendesk/belvedere/j$d;

    invoke-interface {p1}, Lzendesk/belvedere/j$d;->b()V

    :goto_0
    return-void
.end method
