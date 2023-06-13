.class public Lzendesk/belvedere/j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzendesk/belvedere/j$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/belvedere/j;->d(Landroidx/fragment/app/Fragment;Ljava/util/List;Lzendesk/belvedere/j$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lzendesk/belvedere/j$c;

.field public final synthetic b:Lzendesk/belvedere/j;


# direct methods
.method public constructor <init>(Lzendesk/belvedere/j;Lzendesk/belvedere/j$c;)V
    .locals 0

    iput-object p1, p0, Lzendesk/belvedere/j$b;->b:Lzendesk/belvedere/j;

    iput-object p2, p0, Lzendesk/belvedere/j$b;->a:Lzendesk/belvedere/j$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/belvedere/j$b;->a:Lzendesk/belvedere/j$c;

    invoke-interface {v0, p1}, Lzendesk/belvedere/j$c;->a(Ljava/util/Map;)V

    iget-object p1, p0, Lzendesk/belvedere/j$b;->b:Lzendesk/belvedere/j;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lzendesk/belvedere/j;->c(Lzendesk/belvedere/j;Lzendesk/belvedere/j$c;)V

    return-void
.end method
