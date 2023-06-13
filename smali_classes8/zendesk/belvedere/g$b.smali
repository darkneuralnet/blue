.class public Lzendesk/belvedere/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzendesk/belvedere/g;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lzendesk/belvedere/g;


# direct methods
.method public constructor <init>(Lzendesk/belvedere/g;)V
    .locals 0

    iput-object p1, p0, Lzendesk/belvedere/g$b;->b:Lzendesk/belvedere/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lzendesk/belvedere/g$b;->b:Lzendesk/belvedere/g;

    invoke-static {p1}, Lzendesk/belvedere/g;->c(Lzendesk/belvedere/g;)Lzendesk/belvedere/f;

    move-result-object p1

    iget-object v0, p0, Lzendesk/belvedere/g$b;->b:Lzendesk/belvedere/g;

    invoke-static {v0}, Lzendesk/belvedere/g;->a(Lzendesk/belvedere/g;)LXX1;

    move-result-object v0

    invoke-interface {v0}, LXX1;->l()Lzendesk/belvedere/MediaIntent;

    move-result-object v0

    iget-object v1, p0, Lzendesk/belvedere/g$b;->b:Lzendesk/belvedere/g;

    invoke-static {v1}, Lzendesk/belvedere/g;->b(Lzendesk/belvedere/g;)Lzendesk/belvedere/b;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lzendesk/belvedere/f;->i(Lzendesk/belvedere/MediaIntent;Lzendesk/belvedere/b;)V

    return-void
.end method
