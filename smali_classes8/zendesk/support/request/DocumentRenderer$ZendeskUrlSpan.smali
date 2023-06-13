.class Lzendesk/support/request/DocumentRenderer$ZendeskUrlSpan;
.super Landroid/text/style/URLSpan;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/support/request/DocumentRenderer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ZendeskUrlSpan"
.end annotation


# instance fields
.field private final configHelper:LBx0;

.field private final configuration:Ldx0;

.field private final registry:Lzendesk/core/ActionHandlerRegistry;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lzendesk/core/ActionHandlerRegistry;LBx0;Ldx0;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lzendesk/support/request/DocumentRenderer$ZendeskUrlSpan;->registry:Lzendesk/core/ActionHandlerRegistry;

    iput-object p3, p0, Lzendesk/support/request/DocumentRenderer$ZendeskUrlSpan;->configHelper:LBx0;

    iput-object p4, p0, Lzendesk/support/request/DocumentRenderer$ZendeskUrlSpan;->configuration:Ldx0;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    invoke-virtual {p0}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LlS5;->d(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-super {p0, p1}, Landroid/text/style/URLSpan;->onClick(Landroid/view/View;)V

    return-void

    :cond_0
    iget-object v1, p0, Lzendesk/support/request/DocumentRenderer$ZendeskUrlSpan;->registry:Lzendesk/core/ActionHandlerRegistry;

    invoke-interface {v1, v0}, Lzendesk/core/ActionHandlerRegistry;->handlerByAction(Ljava/lang/String;)Lzendesk/core/ActionHandler;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-super {p0, p1}, Landroid/text/style/URLSpan;->onClick(Landroid/view/View;)V

    return-void

    :cond_1
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v3, "help_center_view_article"

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lzendesk/support/request/DocumentRenderer$ZendeskUrlSpan;->configHelper:LBx0;

    iget-object v3, p0, Lzendesk/support/request/DocumentRenderer$ZendeskUrlSpan;->configuration:Ldx0;

    invoke-virtual {v0, v2, v3}, LBx0;->d(Ljava/util/Map;Ldx0;)V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-interface {v1, v2, p1}, Lzendesk/core/ActionHandler;->handle(Ljava/util/Map;Landroid/content/Context;)V

    return-void
.end method
